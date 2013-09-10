

/* First created by JCasGen Sun Sep 08 19:16:49 PDT 2013 */
package qa.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sun Sep 08 22:17:46 EDT 2013
 * XML source: E:/CMU_1st_Semester/11791/assignment/hw1-kuol/src/main/resources/hw1-kuol-typesystem.xml
 * @generated */
public class QuestionAnswer extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QuestionAnswer.class);
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
  protected QuestionAnswer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public QuestionAnswer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public QuestionAnswer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public QuestionAnswer(JCas jcas, int begin, int end) {
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
  //* Feature: qaString

  /** getter for qaString - gets 
   * @generated */
  public String getQaString() {
    if (QuestionAnswer_Type.featOkTst && ((QuestionAnswer_Type)jcasType).casFeat_qaString == null)
      jcasType.jcas.throwFeatMissing("qaString", "qa.type.QuestionAnswer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((QuestionAnswer_Type)jcasType).casFeatCode_qaString);}
    
  /** setter for qaString - sets  
   * @generated */
  public void setQaString(String v) {
    if (QuestionAnswer_Type.featOkTst && ((QuestionAnswer_Type)jcasType).casFeat_qaString == null)
      jcasType.jcas.throwFeatMissing("qaString", "qa.type.QuestionAnswer");
    jcasType.ll_cas.ll_setStringValue(addr, ((QuestionAnswer_Type)jcasType).casFeatCode_qaString, v);}    
  }

    