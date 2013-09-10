package qa.type.annotator;

import java.util.Iterator;
import java.util.regex.*;

import org.apache.uima.analysis_component.*;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.*;
import org.apache.uima.jcas.cas.FSArray;

import qa.type.*;

/**
 * Description: Annotator for NGram type.
 * 
 * @author Kuo Liu
 * @version 0.0.1
 * 
 */
public class NGramAnnotator extends JCasAnnotator_ImplBase {

  private Pattern p2 = Pattern.compile("\\w+(\\W+)\\w+"); /* regex for bigram */

  private Pattern p3 = Pattern.compile("\\w+(\\W+)\\w+\\W+\\w+"); /* regex for trigram */

  private final String name = "qa.type.annotator.NGramAnnotator"; /* annotator name */

  /**
   * Description: This Function will annotate the NGram Type(1-,2-,3-). When annotating unigram, I
   * just make use of the token index. When annotating bigram and trigram, I make use of the regexes
   * and the indexes of Question and Answer.
   * 
   * @param aJCas
   */
  public void process(JCas aJCas) {
    FSIndex tIndex = aJCas.getAnnotationIndex(Token.type);

    Iterator<Token> tIter = tIndex.iterator();
    while (tIter.hasNext()) {
      Token t = tIter.next();
      NGram uni = new NGram(aJCas);
      uni.setBegin(t.getBegin());
      uni.setEnd(t.getEnd());
      uni.setNgram(t.getToken());
      FSArray arr = new FSArray(aJCas, 1);
      uni.setTokens(arr);
      uni.setTokens(0, t);
      uni.setAnnotator(name);
      uni.setScore(1.0f);
      uni.addToIndexes();
    }

    FSIndex qIndex = aJCas.getAnnotationIndex(Question.type);
    FSIndex aIndex = aJCas.getAnnotationIndex(Answer.type);

    Iterator<Question> qIter = qIndex.iterator();
    while (qIter.hasNext()) {
      Question q = qIter.next();
      int begin = q.getBegin();
      String str = q.getQaString();
      int i = 0;
      Matcher m = p2.matcher(str);
      while (m.find(i)) {
        NGram bi = new NGram(aJCas);
        bi.setBegin(begin + m.start());
        bi.setEnd(begin + m.end());
        String content = m.group();
        bi.setNgram(content);
        bi.setAnnotator(name);
        bi.setScore(1.0f);

        FSArray arr = new FSArray(aJCas, 2);
        bi.setTokens(arr);
        Token t1 = new Token(aJCas);
        String[] strs = content.split("\\W+");
        t1.setBegin(begin + m.start());
        t1.setEnd(begin + m.start() + strs[0].length());
        t1.setToken(strs[0]);
        t1.setAnnotator(name);
        t1.setScore(1.0f);
        bi.setTokens(0, t1);
        Token t2 = new Token(aJCas);
        t2.setBegin(begin + m.start() + content.lastIndexOf(strs[1]));
        t2.setEnd(begin + m.start() + content.length());
        t2.setToken(strs[1]);
        t2.setAnnotator(name);
        t2.setScore(1.0f);
        bi.setTokens(1, t2);

        bi.addToIndexes();
        i = m.start(1) + 1;
      }
      i = 0;
      m = p3.matcher(str);
      while (m.find(i)) {
        NGram tri = new NGram(aJCas);
        tri.setBegin(begin + m.start());
        tri.setEnd(begin + m.end());
        String content = m.group();
        tri.setNgram(content);
        tri.setAnnotator(name);
        tri.setScore(1.0f);

        FSArray arr = new FSArray(aJCas, 3);
        tri.setTokens(arr);
        Token t1 = new Token(aJCas);
        String[] strs = content.split("\\W+");
        t1.setBegin(begin + m.start());
        t1.setEnd(begin + m.start() + strs[0].length());
        t1.setToken(strs[0]);
        t1.setAnnotator(name);
        t1.setScore(1.0f);
        tri.setTokens(0, t1);
        Token t2 = new Token(aJCas);
        t2.setBegin(begin + m.start() + content.indexOf(strs[1], strs[0].length()));
        t2.setEnd(begin + m.start() + strs[0].length() + m.group(1).length() + strs[1].length());
        t2.setToken(strs[1]);
        t2.setAnnotator(name);
        t2.setScore(1.0f);
        tri.setTokens(1, t2);
        Token t3 = new Token(aJCas);
        t3.setBegin(begin + m.start() + content.lastIndexOf(strs[2]));
        t3.setEnd(begin + m.start() + content.length());
        t3.setToken(strs[2]);
        t3.setAnnotator(name);
        t3.setScore(1.0f);
        tri.setTokens(2, t3);

        tri.addToIndexes();
        i = m.start(1);
      }
    }

    Iterator<Answer> aIter = aIndex.iterator();
    while (aIter.hasNext()) {
      Answer a = aIter.next();
      int begin = a.getBegin();
      String str = a.getQaString();
      int i = 0;
      Matcher m = p2.matcher(str);
      while (m.find(i)) {
        NGram bi = new NGram(aJCas);
        bi.setBegin(begin + m.start());
        bi.setEnd(begin + m.end());
        String content = m.group();
        bi.setNgram(content);
        bi.setAnnotator(name);
        bi.setScore(1.0f);

        FSArray arr = new FSArray(aJCas, 2);
        bi.setTokens(arr);
        Token t1 = new Token(aJCas);
        String[] strs = content.split("\\W+");
        t1.setBegin(begin + m.start());
        t1.setEnd(begin + m.start() + strs[0].length());
        t1.setToken(strs[0]);
        t1.setAnnotator(name);
        t1.setScore(1.0f);
        bi.setTokens(0, t1);
        Token t2 = new Token(aJCas);
        t2.setBegin(begin + m.start() + content.lastIndexOf(strs[1]));
        t2.setEnd(begin + m.start() + content.length());
        t2.setToken(strs[1]);
        t2.setAnnotator(name);
        t2.setScore(1.0f);
        bi.setTokens(1, t2);

        bi.addToIndexes();
        i = m.start(1);
      }
      i = 0;
      m = p3.matcher(str);
      while (m.find(i)) {
        NGram tri = new NGram(aJCas);
        tri.setBegin(begin + m.start());
        tri.setEnd(begin + m.end());
        String content = m.group();
        tri.setNgram(content);
        tri.setAnnotator(name);
        tri.setScore(1.0f);

        FSArray arr = new FSArray(aJCas, 3);
        tri.setTokens(arr);
        Token t1 = new Token(aJCas);
        String[] strs = content.split("\\W+");
        t1.setBegin(begin + m.start());
        t1.setEnd(begin + m.start() + strs[0].length());
        t1.setToken(strs[0]);
        t1.setAnnotator(name);
        t1.setScore(1.0f);
        tri.setTokens(0, t1);
        Token t2 = new Token(aJCas);
        t2.setBegin(begin + m.start() + content.indexOf(strs[1], strs[0].length()));
        t2.setEnd(begin + m.start() + strs[0].length() + m.group(1).length() + strs[1].length());
        t2.setToken(strs[1]);
        t2.setAnnotator(name);
        t2.setScore(1.0f);
        tri.setTokens(1, t2);
        Token t3 = new Token(aJCas);
        t3.setBegin(begin + m.start() + content.lastIndexOf(strs[2]));
        t3.setEnd(begin + m.start() + content.length());
        t3.setToken(strs[2]);
        t3.setAnnotator(name);
        t3.setScore(1.0f);
        tri.setTokens(2, t3);

        tri.addToIndexes();
        i = m.start(1);
      }
    }

  }
}
