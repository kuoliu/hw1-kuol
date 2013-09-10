
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

/** 
 * Updated by JCasGen Sun Sep 08 22:17:46 EDT 2013
 * @generated */
public class Answer_Type extends QuestionAnswer_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("qa.type.Answer");
 
  /** @generated */
  final Feature casFeat_YesOrNo;
  /** @generated */
  final int     casFeatCode_YesOrNo;
  /** @generated */ 
  public String getYesOrNo(int addr) {
        if (featOkTst && casFeat_YesOrNo == null)
      jcas.throwFeatMissing("YesOrNo", "qa.type.Answer");
    return ll_cas.ll_getStringValue(addr, casFeatCode_YesOrNo);
  }
  /** @generated */    
  public void setYesOrNo(int addr, String v) {
        if (featOkTst && casFeat_YesOrNo == null)
      jcas.throwFeatMissing("YesOrNo", "qa.type.Answer");
    ll_cas.ll_setStringValue(addr, casFeatCode_YesOrNo, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_YesOrNo = jcas.getRequiredFeatureDE(casType, "YesOrNo", "uima.cas.String", featOkTst);
    casFeatCode_YesOrNo  = (null == casFeat_YesOrNo) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_YesOrNo).getCode();

  }
}



    