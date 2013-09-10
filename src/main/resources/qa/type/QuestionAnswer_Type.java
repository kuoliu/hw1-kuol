
/* First created by JCasGen Sun Sep 08 19:16:49 PDT 2013 */
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

/** 
 * Updated by JCasGen Sun Sep 08 22:17:46 EDT 2013
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
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public QuestionAnswer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_qaString = jcas.getRequiredFeatureDE(casType, "qaString", "uima.cas.String", featOkTst);
    casFeatCode_qaString  = (null == casFeat_qaString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_qaString).getCode();

  }
}



    