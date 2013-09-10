package qa.type.annotator;

import java.util.regex.*;

import org.apache.uima.analysis_component.*;
import org.apache.uima.jcas.*;
import qa.type.*;

/**
 * Description: Annotator for both Question and Answer type.
 * 
 * @author Kuo Liu
 * @version 0.0.1
 * 
 */
public class QuestionAnswerAnnotator extends JCasAnnotator_ImplBase {

  private Pattern ques = Pattern.compile("Q\\s+(.+)\\?\\s+"); /* regex for Question String */

  private Pattern ans = Pattern.compile("A\\s+(\\d+)\\s+(.+)\\."); /* regex for Answer String */

  private final String name = "qa.type.annotator.QuestionAnswerAnnotator"; /* annotator name */

  /**
   * Description: This Function will annotate the Question and Answer Type using the regexes
   * 
   * @param aJCas
   */
  public void process(JCas aJCas) {
    String str = aJCas.getDocumentText();
    Matcher m = ques.matcher(str);
    while (m.find()) {
      Question q = new Question(aJCas);
      q.setBegin(m.start(1));
      q.setEnd(m.end(1));
      q.setQaString(m.group(1));
      q.setAnnotator(name);
      q.setScore(1.0f);
      q.addToIndexes();
    }
    m = ans.matcher(str);
    while (m.find()) {
      Answer a = new Answer(aJCas);
      a.setBegin(m.start(2));
      a.setEnd(m.end(2));
      a.setQaString(m.group(2));
      a.setAnnotator(name);
      a.setScore(1.0f);
      int truth = Integer.parseInt(m.group(1));
      if (truth == 0)
        a.setYesOrNo("No");
      else
        a.setYesOrNo("Yes");
      a.addToIndexes();
    }
  }
}
