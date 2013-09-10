package qa.type.annotator;

import java.util.Iterator;
import java.util.regex.*;

import org.apache.uima.analysis_component.*;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.*;

import qa.type.*;

/**
 * Description: Annotator for Token type.
 * 
 * @author Kuo Liu
 * @version 0.0.1
 * 
 */
public class TokenAnnotator extends JCasAnnotator_ImplBase {

  private Pattern p = Pattern.compile("\\w+"); /* regex for Token String */

  private final String name = "qa.type.annotator.TokenAnnotator"; /* annotator name */

  /**
   * Description: This Function will annotate the Token Type using the regexes and the Index of
   * Question and Answer
   * 
   * @param aJCas
   */
  public void process(JCas aJCas) {
    FSIndex qIndex = aJCas.getAnnotationIndex(Question.type);
    FSIndex aIndex = aJCas.getAnnotationIndex(Answer.type);

    Iterator<Question> qIter = qIndex.iterator();
    while (qIter.hasNext()) {
      Question q = qIter.next();
      int begin = q.getBegin();
      String str = q.getQaString();
      Matcher m = p.matcher(str);
      while (m.find()) {
        Token token = new Token(aJCas);
        token.setBegin(begin + m.start());
        token.setEnd(begin + m.end());
        token.setToken(m.group());
        token.setAnnotator(name);
        token.setScore(1.0f);
        token.addToIndexes();
      }
    }

    Iterator<Answer> aIter = aIndex.iterator();
    while (aIter.hasNext()) {
      Answer a = aIter.next();
      int begin = a.getBegin();
      String str = a.getQaString();
      Matcher m = p.matcher(str);
      while (m.find()) {
        Token token = new Token(aJCas);
        token.setBegin(begin + m.start());
        token.setEnd(begin + m.end());
        token.setToken(m.group());
        token.setAnnotator(name);
        token.setScore(1.0f);
        token.addToIndexes();
      }
    }

  }
}
