
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
public class Unigram_Type extends NGram_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Unigram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Unigram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Unigram(addr, Unigram_Type.this);
  			   Unigram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Unigram(addr, Unigram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Unigram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("qa.type.Unigram");
 
  /** @generated */
  final Feature casFeat_ngram;
  /** @generated */
  final int     casFeatCode_ngram;
  /** @generated */ 
  public String getNgram(int addr) {
        if (featOkTst && casFeat_ngram == null)
      jcas.throwFeatMissing("ngram", "qa.type.Unigram");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ngram);
  }
  /** @generated */    
  public void setNgram(int addr, String v) {
        if (featOkTst && casFeat_ngram == null)
      jcas.throwFeatMissing("ngram", "qa.type.Unigram");
    ll_cas.ll_setStringValue(addr, casFeatCode_ngram, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Unigram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_ngram = jcas.getRequiredFeatureDE(casType, "ngram", "uima.cas.String", featOkTst);
    casFeatCode_ngram  = (null == casFeat_ngram) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ngram).getCode();

  }
}



    