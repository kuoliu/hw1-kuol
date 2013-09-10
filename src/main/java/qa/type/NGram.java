

/* First created by JCasGen Sun Sep 08 23:06:21 EDT 2013 */
package qa.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Mon Sep 09 23:22:11 EDT 2013
 * XML source: E:/CMU_1st_Semester/11791/assignment/hw1-kuol/src/main/resources/hw1-kuol-typesystem.xml
 * @generated */
public class NGram extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGram.class);
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
  protected NGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGram(JCas jcas, int begin, int end) {
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
  //* Feature: ngram

  /** getter for ngram - gets 
   * @generated */
  public String getNgram() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_ngram == null)
      jcasType.jcas.throwFeatMissing("ngram", "qa.type.NGram");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NGram_Type)jcasType).casFeatCode_ngram);}
    
  /** setter for ngram - sets  
   * @generated */
  public void setNgram(String v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_ngram == null)
      jcasType.jcas.throwFeatMissing("ngram", "qa.type.NGram");
    jcasType.ll_cas.ll_setStringValue(addr, ((NGram_Type)jcasType).casFeatCode_ngram, v);}    
   
    
  //*--------------*
  //* Feature: tokens

  /** getter for tokens - gets 
   * @generated */
  public FSArray getTokens() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "qa.type.NGram");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets  
   * @generated */
  public void setTokens(FSArray v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "qa.type.NGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokens - gets an indexed value - 
   * @generated */
  public TOP getTokens(int i) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "qa.type.NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokens), i);
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokens), i)));}

  /** indexed setter for tokens - sets an indexed value - 
   * @generated */
  public void setTokens(int i, TOP v) { 
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "qa.type.NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokens), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokens), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: annotator

  /** getter for annotator - gets Rocord its annotator
   * @generated */
  public String getAnnotator() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_annotator == null)
      jcasType.jcas.throwFeatMissing("annotator", "qa.type.NGram");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NGram_Type)jcasType).casFeatCode_annotator);}
    
  /** setter for annotator - sets Rocord its annotator 
   * @generated */
  public void setAnnotator(String v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_annotator == null)
      jcasType.jcas.throwFeatMissing("annotator", "qa.type.NGram");
    jcasType.ll_cas.ll_setStringValue(addr, ((NGram_Type)jcasType).casFeatCode_annotator, v);}    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets The score for the string
   * @generated */
  public float getScore() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "qa.type.NGram");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((NGram_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets The score for the string 
   * @generated */
  public void setScore(float v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "qa.type.NGram");
    jcasType.ll_cas.ll_setFloatValue(addr, ((NGram_Type)jcasType).casFeatCode_score, v);}    
  }

    