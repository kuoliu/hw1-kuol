
/* First created by JCasGen Sun Sep 08 23:06:21 EDT 2013 */
package qa.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** This is the father type for Question/Answer
 * Updated by JCasGen Tue Sep 10 02:04:49 EDT 2013
 * @generated */
public class QuestionAnswer_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (QuestionAnswer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = QuestionAnswer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new QuestionAnswer(addr, QuestionAnswer_Type.this);
  			   QuestionAnswer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new QuestionAnswer(addr, QuestionAnswer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = QuestionAnswer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("qa.type.QuestionAnswer");
 
  /** @generated */
  final Feature casFeat_qaString;
  /** @generated */
  final int     casFeatCode_qaString;
  /** @generated */ 
  public String getQaString(int addr) {
        if (featOkTst && casFeat_qaString == null)
      jcas.throwFeatMissing("qaString", "qa.type.QuestionAnswer");
    return ll_cas.ll_getStringValue(addr, casFeatCode_qaString);
  }
  /** @generated */    
  public void setQaString(int addr, String v) {
        if (featOkTst && casFeat_qaString == null)
      jcas.throwFeatMissing("qaString", "qa.type.QuestionAnswer");
    ll_cas.ll_setStringValue(addr, casFeatCode_qaString, v);}
    
  
 
  /** @generated */
  final Feature casFeat_annotator;
  /** @generated */
  final int     casFeatCode_annotator;
  /** @generated */ 
  public String getAnnotator(int addr) {
        if (featOkTst && casFeat_annotator == null)
      jcas.throwFeatMissing("annotator", "qa.type.QuestionAnswer");
    return ll_cas.ll_getStringValue(addr, casFeatCode_annotator);
  }
  /** @generated */    
  public void setAnnotator(int addr, String v) {
        if (featOkTst && casFeat_annotator == null)
      jcas.throwFeatMissing("annotator", "qa.type.QuestionAnswer");
    ll_cas.ll_setStringValue(addr, casFeatCode_annotator, v);}
    
  
 
  /** @generated */
  final Feature casFeat_score;
  /** @generated */
  final int     casFeatCode_score;
  /** @generated */ 
  public float getScore(int addr) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "qa.type.QuestionAnswer");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_score);
  }
  /** @generated */    
  public void setScore(int addr, float v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "qa.type.QuestionAnswer");
    ll_cas.ll_setFloatValue(addr, casFeatCode_score, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public QuestionAnswer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_qaString = jcas.getRequiredFeatureDE(casType, "qaString", "uima.cas.String", featOkTst);
    casFeatCode_qaString  = (null == casFeat_qaString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_qaString).getCode();

 
    casFeat_annotator = jcas.getRequiredFeatureDE(casType, "annotator", "uima.cas.String", featOkTst);
    casFeatCode_annotator  = (null == casFeat_annotator) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_annotator).getCode();

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Float", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

  }
}



    