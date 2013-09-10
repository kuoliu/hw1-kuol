

/* First created by JCasGen Sun Sep 08 23:06:21 EDT 2013 */
package qa.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** This is the answer type
 * Updated by JCasGen Tue Sep 10 02:04:49 EDT 2013
 * XML source: E:/CMU_1st_Semester/11791/assignment/hw1-kuol/src/main/resources/hw1-kuol-typesystem.xml
 * @generated */
public class Answer extends QuestionAnswer {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answer(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: yesOrNo

  /** getter for yesOrNo - gets This is the answer type, father for AnswerScore
   * @generated */
  public String getYesOrNo() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_yesOrNo == null)
      jcasType.jcas.throwFeatMissing("yesOrNo", "qa.type.Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_yesOrNo);}
    
  /** setter for yesOrNo - sets This is the answer type, father for AnswerScore 
   * @generated */
  public void setYesOrNo(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_yesOrNo == null)
      jcasType.jcas.throwFeatMissing("yesOrNo", "qa.type.Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_yesOrNo, v);}    
  }

    