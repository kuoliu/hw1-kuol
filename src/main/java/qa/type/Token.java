

/* First created by JCasGen Sun Sep 08 23:06:21 EDT 2013 */
package qa.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 02:04:49 EDT 2013
 * XML source: E:/CMU_1st_Semester/11791/assignment/hw1-kuol/src/main/resources/hw1-kuol-typesystem.xml
 * @generated */
public class Token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
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
  //* Feature: token

  /** getter for token - gets This is the token type
   * @generated */
  public String getToken() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_token == null)
      jcasType.jcas.throwFeatMissing("token", "qa.type.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_token);}
    
  /** setter for token - sets This is the token type 
   * @generated */
  public void setToken(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_token == null)
      jcasType.jcas.throwFeatMissing("token", "qa.type.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_token, v);}    
   
    
  //*--------------*
  //* Feature: annotator

  /** getter for annotator - gets Rocord its annotator
   * @generated */
  public String getAnnotator() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_annotator == null)
      jcasType.jcas.throwFeatMissing("annotator", "qa.type.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_annotator);}
    
  /** setter for annotator - sets Rocord its annotator 
   * @generated */
  public void setAnnotator(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_annotator == null)
      jcasType.jcas.throwFeatMissing("annotator", "qa.type.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_annotator, v);}    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets The score for the string
   * @generated */
  public float getScore() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "qa.type.Token");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Token_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets The score for the string 
   * @generated */
  public void setScore(float v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "qa.type.Token");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Token_Type)jcasType).casFeatCode_score, v);}    
  }

    