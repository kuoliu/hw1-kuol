package qa.type.annotator;

import java.util.*;
import java.util.regex.*;
import java.util.Map.*;

import org.apache.uima.analysis_component.*;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.*;

import qa.type.*;

/**
 * Description: Annotator for AnswerScore type.
 * 
 * @author Kuo Liu
 * @version 0.0.1
 * 
 */
public class AnswerScoringAnnotator extends JCasAnnotator_ImplBase {

  private Pattern p = Pattern.compile("\\w+"); /* pattern for token */

  private final String name = "AnswerScoringAnnotator"; /* annotator name */

  /**
   * Description: This function will annotate the AnswerScore type and compute the precision @N.
   * When Scoring I use the token overlap Scoring. Finally, I print the result to standard output.
   * 
   * @param aJCas
   */
  public void process(JCas aJCas) {
    FSIndex qIndex = aJCas.getAnnotationIndex(Question.type);

    HashSet<String> tokens = new HashSet<String>();
    Iterator<Question> qIter = qIndex.iterator();
    if (qIter.hasNext()) {
      Question q = qIter.next();
      String str = q.getQaString();
      Matcher m = p.matcher(str);
      System.out.println("Question: " + str + "?");
      while (m.find()) {
        tokens.add(m.group());
      }
    }

    LinkedList<MyEntry<Float, MyEntry<String, String>>> list = new LinkedList<MyEntry<Float, MyEntry<String, String>>>();
    FSIndex aIndex = aJCas.getAnnotationIndex(Answer.type);
    Iterator<Answer> aIter = aIndex.iterator();
    int totalAns = 0;
    int totalRightAns = 0;
    while (aIter.hasNext()) {
      Answer a = aIter.next();
      String content = a.getQaString();
      AnswerScore ansscore = new AnswerScore(aJCas);
      String[] strs = content.split("\\W+");
      int cnt = 0;
      for (String str : strs) {
        if (tokens.contains(str))
          ++cnt;
      }
      float score = (float) cnt / (float) strs.length;

      MyEntry<Float, MyEntry<String, String>> scoreStrTruth = new MyEntry<Float, MyEntry<String, String>>(
              score, new MyEntry<String, String>(content, a.getYesOrNo()));
      list.add(scoreStrTruth);
      if (a.getYesOrNo().equals("Yes"))
        ++totalRightAns;
      ++totalAns;

      ansscore.setBegin(a.getBegin());
      ansscore.setEnd(a.getEnd());
      ansscore.setQaString(content);
      ansscore.setYesOrNo(a.getYesOrNo());
      ansscore.setScore(score);
      ansscore.setAnnotator(name);
      ansscore.addToIndexes();
    }
    Collections.sort(list, new Comparator() {
      public int compare(Object o1, Object o2) {
        MyEntry<Float, MyEntry<String, String>> e1 = (MyEntry<Float, MyEntry<String, String>>) o1;
        MyEntry<Float, MyEntry<String, String>> e2 = (MyEntry<Float, MyEntry<String, String>>) o2;
        if (e1.getKey() < e2.getKey())
          return 1;
        return -1;
      }
    });
    int i = 0, trueAns = 0;
    for (MyEntry<Float, MyEntry<String, String>> e : list) {
      float score = e.getKey();
      String ans = e.getValue().getKey();
      String truth = e.getValue().getValue();
      if (i++ < totalRightAns && truth.equals("Yes") && score >= 0.5)
        ++trueAns;

      System.out.println(truth + '\t' + score + '\t' + ans);
    }
    System.out.println("Precision @ " + totalRightAns + " is " + (float) trueAns
            / (float) totalRightAns);
  }
}

/**
 * Description: This is a type used for the final sorting.
 * 
 * @author Kuo Liu
 * @version 0.0.1
 * 
 */
final class MyEntry<K, V> implements Map.Entry<K, V> {
  private final K key;

  private V value;

  public MyEntry(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }

  public V setValue(V value) {
    V old = this.value;
    this.value = value;
    return old;
  }
}
