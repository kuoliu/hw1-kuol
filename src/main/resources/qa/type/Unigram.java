

/* First created by JCasGen Sun Sep 08 19:16:49 PDT 2013 */
package qa.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Sun Sep 08 22:17:46 EDT 2013
 * XML source: E:/CMU_1st_Semester/11791/assignment/hw1-kuol/src/main/resources/hw1-kuol-typesystem.xml
 * @generated */
public class Unigram extends NGram {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Unigram.class);
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
  protected Unigram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Unigram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Unigram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Unigram(JCas jcas, int begin, int end) {
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
    if (Unigram_Type.featOkTst && ((Unigram_Type)jcasType).casFeat_ngram == null)
      jcasType.jcas.throwFeatMissing("ngram", "qa.type.Unigram");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Unigram_Type)jcasType).casFeatCode_ngram);}
    
  /** setter for ngram - sets  
   * @generated */
  public void setNgram(String v) {
    if (Unigram_Type.featOkTst && ((Unigram_Type)jcasType).casFeat_ngram == null)
      jcasType.jcas.throwFeatMissing("ngram", "qa.type.Unigram");
    jcasType.ll_cas.ll_setStringValue(addr, ((Unigram_Type)jcasType).casFeatCode_ngram, v);}    
  }

    