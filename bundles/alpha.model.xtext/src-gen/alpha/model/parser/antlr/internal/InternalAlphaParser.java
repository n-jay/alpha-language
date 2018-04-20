package alpha.model.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import alpha.model.services.AlphaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlphaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_BOOLEAN", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'constant'", "'='", "'external'", "'('", "')'", "'import'", "'package'", "'{'", "'}'", "'affine'", "'define'", "'inputs'", "'outputs'", "'locals'", "'fuzzy'", "'over'", "'while'", "'let'", "'.'", "':'", "';'", "'['", "','", "']'", "'[['", "']]'", "'.*'", "'->'", "'+'", "'-'", "'*'", "'/'", "'%'", "'and'", "'or'", "'&'", "'|'", "'>='", "'>'", "'<'", "'<='", "'with'", "'if'", "'then'", "'else'", "'auto'", "'case'", "'@'", "'val'", "'reduce'", "'argreduce'", "'conv'", "'select'", "'from'", "'min'", "'max'", "'prod'", "'sum'", "'xor'", "'!='", "'not'", "'as'", "'domain'", "'range'", "'complement'", "'affine-hull'", "'poly-hull'", "'reverse'", "'cross'", "'->-'", "'->*'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=6;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=8;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAlphaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAlphaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAlphaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAlpha.g"; }



     	private AlphaGrammarAccess grammarAccess;

        public InternalAlphaParser(TokenStream input, AlphaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AlphaRoot";
       	}

       	@Override
       	protected AlphaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAlphaRoot"
    // InternalAlpha.g:64:1: entryRuleAlphaRoot returns [EObject current=null] : iv_ruleAlphaRoot= ruleAlphaRoot EOF ;
    public final EObject entryRuleAlphaRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaRoot = null;


        try {
            // InternalAlpha.g:64:50: (iv_ruleAlphaRoot= ruleAlphaRoot EOF )
            // InternalAlpha.g:65:2: iv_ruleAlphaRoot= ruleAlphaRoot EOF
            {
             newCompositeNode(grammarAccess.getAlphaRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlphaRoot=ruleAlphaRoot();

            state._fsp--;

             current =iv_ruleAlphaRoot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlphaRoot"


    // $ANTLR start "ruleAlphaRoot"
    // InternalAlpha.g:71:1: ruleAlphaRoot returns [EObject current=null] : ( ( (lv_elements_0_1= ruleAlphaConstant | lv_elements_0_2= ruleExternalFunction | lv_elements_0_3= ruleImports | lv_elements_0_4= ruleAlphaPackage | lv_elements_0_5= ruleAlphaSystem ) ) )* ;
    public final EObject ruleAlphaRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_1 = null;

        EObject lv_elements_0_2 = null;

        EObject lv_elements_0_3 = null;

        EObject lv_elements_0_4 = null;

        EObject lv_elements_0_5 = null;



        	enterRule();

        try {
            // InternalAlpha.g:77:2: ( ( ( (lv_elements_0_1= ruleAlphaConstant | lv_elements_0_2= ruleExternalFunction | lv_elements_0_3= ruleImports | lv_elements_0_4= ruleAlphaPackage | lv_elements_0_5= ruleAlphaSystem ) ) )* )
            // InternalAlpha.g:78:2: ( ( (lv_elements_0_1= ruleAlphaConstant | lv_elements_0_2= ruleExternalFunction | lv_elements_0_3= ruleImports | lv_elements_0_4= ruleAlphaPackage | lv_elements_0_5= ruleAlphaSystem ) ) )*
            {
            // InternalAlpha.g:78:2: ( ( (lv_elements_0_1= ruleAlphaConstant | lv_elements_0_2= ruleExternalFunction | lv_elements_0_3= ruleImports | lv_elements_0_4= ruleAlphaPackage | lv_elements_0_5= ruleAlphaSystem ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13||LA2_0==15||(LA2_0>=18 && LA2_0<=19)||LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAlpha.g:79:3: ( (lv_elements_0_1= ruleAlphaConstant | lv_elements_0_2= ruleExternalFunction | lv_elements_0_3= ruleImports | lv_elements_0_4= ruleAlphaPackage | lv_elements_0_5= ruleAlphaSystem ) )
            	    {
            	    // InternalAlpha.g:79:3: ( (lv_elements_0_1= ruleAlphaConstant | lv_elements_0_2= ruleExternalFunction | lv_elements_0_3= ruleImports | lv_elements_0_4= ruleAlphaPackage | lv_elements_0_5= ruleAlphaSystem ) )
            	    // InternalAlpha.g:80:4: (lv_elements_0_1= ruleAlphaConstant | lv_elements_0_2= ruleExternalFunction | lv_elements_0_3= ruleImports | lv_elements_0_4= ruleAlphaPackage | lv_elements_0_5= ruleAlphaSystem )
            	    {
            	    // InternalAlpha.g:80:4: (lv_elements_0_1= ruleAlphaConstant | lv_elements_0_2= ruleExternalFunction | lv_elements_0_3= ruleImports | lv_elements_0_4= ruleAlphaPackage | lv_elements_0_5= ruleAlphaSystem )
            	    int alt1=5;
            	    switch ( input.LA(1) ) {
            	    case 13:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 15:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt1=4;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt1=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // InternalAlpha.g:81:5: lv_elements_0_1= ruleAlphaConstant
            	            {

            	            					newCompositeNode(grammarAccess.getAlphaRootAccess().getElementsAlphaConstantParserRuleCall_0_0());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_elements_0_1=ruleAlphaConstant();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getAlphaRootRule());
            	            					}
            	            					add(
            	            						current,
            	            						"elements",
            	            						lv_elements_0_1,
            	            						"alpha.model.Alpha.AlphaConstant");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalAlpha.g:97:5: lv_elements_0_2= ruleExternalFunction
            	            {

            	            					newCompositeNode(grammarAccess.getAlphaRootAccess().getElementsExternalFunctionParserRuleCall_0_1());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_elements_0_2=ruleExternalFunction();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getAlphaRootRule());
            	            					}
            	            					add(
            	            						current,
            	            						"elements",
            	            						lv_elements_0_2,
            	            						"alpha.model.Alpha.ExternalFunction");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalAlpha.g:113:5: lv_elements_0_3= ruleImports
            	            {

            	            					newCompositeNode(grammarAccess.getAlphaRootAccess().getElementsImportsParserRuleCall_0_2());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_elements_0_3=ruleImports();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getAlphaRootRule());
            	            					}
            	            					add(
            	            						current,
            	            						"elements",
            	            						lv_elements_0_3,
            	            						"alpha.model.Alpha.Imports");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 4 :
            	            // InternalAlpha.g:129:5: lv_elements_0_4= ruleAlphaPackage
            	            {

            	            					newCompositeNode(grammarAccess.getAlphaRootAccess().getElementsAlphaPackageParserRuleCall_0_3());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_elements_0_4=ruleAlphaPackage();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getAlphaRootRule());
            	            					}
            	            					add(
            	            						current,
            	            						"elements",
            	            						lv_elements_0_4,
            	            						"alpha.model.Alpha.AlphaPackage");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 5 :
            	            // InternalAlpha.g:145:5: lv_elements_0_5= ruleAlphaSystem
            	            {

            	            					newCompositeNode(grammarAccess.getAlphaRootAccess().getElementsAlphaSystemParserRuleCall_0_4());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_elements_0_5=ruleAlphaSystem();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getAlphaRootRule());
            	            					}
            	            					add(
            	            						current,
            	            						"elements",
            	            						lv_elements_0_5,
            	            						"alpha.model.Alpha.AlphaSystem");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlphaRoot"


    // $ANTLR start "entryRuleAlphaConstant"
    // InternalAlpha.g:166:1: entryRuleAlphaConstant returns [EObject current=null] : iv_ruleAlphaConstant= ruleAlphaConstant EOF ;
    public final EObject entryRuleAlphaConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaConstant = null;


        try {
            // InternalAlpha.g:166:54: (iv_ruleAlphaConstant= ruleAlphaConstant EOF )
            // InternalAlpha.g:167:2: iv_ruleAlphaConstant= ruleAlphaConstant EOF
            {
             newCompositeNode(grammarAccess.getAlphaConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlphaConstant=ruleAlphaConstant();

            state._fsp--;

             current =iv_ruleAlphaConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlphaConstant"


    // $ANTLR start "ruleAlphaConstant"
    // InternalAlpha.g:173:1: ruleAlphaConstant returns [EObject current=null] : (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleAlphaConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:179:2: ( (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalAlpha.g:180:2: (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalAlpha.g:180:2: (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalAlpha.g:181:3: otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAlphaConstantAccess().getConstantKeyword_0());
            		
            // InternalAlpha.g:185:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAlpha.g:186:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAlpha.g:186:4: (lv_name_1_0= RULE_ID )
            // InternalAlpha.g:187:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAlphaConstantAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlphaConstantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"alpha.model.Alpha.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAlphaConstantAccess().getEqualsSignKeyword_2());
            		
            // InternalAlpha.g:207:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalAlpha.g:208:4: (lv_value_3_0= RULE_INT )
            {
            // InternalAlpha.g:208:4: (lv_value_3_0= RULE_INT )
            // InternalAlpha.g:209:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getAlphaConstantAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlphaConstantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlphaConstant"


    // $ANTLR start "entryRuleExternalFunction"
    // InternalAlpha.g:229:1: entryRuleExternalFunction returns [EObject current=null] : iv_ruleExternalFunction= ruleExternalFunction EOF ;
    public final EObject entryRuleExternalFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalFunction = null;


        try {
            // InternalAlpha.g:229:57: (iv_ruleExternalFunction= ruleExternalFunction EOF )
            // InternalAlpha.g:230:2: iv_ruleExternalFunction= ruleExternalFunction EOF
            {
             newCompositeNode(grammarAccess.getExternalFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalFunction=ruleExternalFunction();

            state._fsp--;

             current =iv_ruleExternalFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalFunction"


    // $ANTLR start "ruleExternalFunction"
    // InternalAlpha.g:236:1: ruleExternalFunction returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_cardinality_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleExternalFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_cardinality_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAlpha.g:242:2: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_cardinality_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalAlpha.g:243:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_cardinality_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalAlpha.g:243:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_cardinality_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalAlpha.g:244:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_cardinality_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalFunctionAccess().getExternalKeyword_0());
            		
            // InternalAlpha.g:248:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAlpha.g:249:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAlpha.g:249:4: (lv_name_1_0= RULE_ID )
            // InternalAlpha.g:250:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"alpha.model.Alpha.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalAlpha.g:270:3: ( (lv_cardinality_3_0= RULE_INT ) )
            // InternalAlpha.g:271:4: (lv_cardinality_3_0= RULE_INT )
            {
            // InternalAlpha.g:271:4: (lv_cardinality_3_0= RULE_INT )
            // InternalAlpha.g:272:5: lv_cardinality_3_0= RULE_INT
            {
            lv_cardinality_3_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_cardinality_3_0, grammarAccess.getExternalFunctionAccess().getCardinalityINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cardinality",
            						lv_cardinality_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getExternalFunctionAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalFunction"


    // $ANTLR start "entryRuleImports"
    // InternalAlpha.g:296:1: entryRuleImports returns [EObject current=null] : iv_ruleImports= ruleImports EOF ;
    public final EObject entryRuleImports() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImports = null;


        try {
            // InternalAlpha.g:296:48: (iv_ruleImports= ruleImports EOF )
            // InternalAlpha.g:297:2: iv_ruleImports= ruleImports EOF
            {
             newCompositeNode(grammarAccess.getImportsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImports=ruleImports();

            state._fsp--;

             current =iv_ruleImports; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImports"


    // $ANTLR start "ruleImports"
    // InternalAlpha.g:303:1: ruleImports returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImports() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:309:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalAlpha.g:310:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalAlpha.g:310:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalAlpha.g:311:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportsAccess().getImportKeyword_0());
            		
            // InternalAlpha.g:315:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalAlpha.g:316:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalAlpha.g:316:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalAlpha.g:317:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportsAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportsRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"alpha.model.Alpha.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImports"


    // $ANTLR start "entryRuleAlphaPackage"
    // InternalAlpha.g:338:1: entryRuleAlphaPackage returns [EObject current=null] : iv_ruleAlphaPackage= ruleAlphaPackage EOF ;
    public final EObject entryRuleAlphaPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaPackage = null;


        try {
            // InternalAlpha.g:338:53: (iv_ruleAlphaPackage= ruleAlphaPackage EOF )
            // InternalAlpha.g:339:2: iv_ruleAlphaPackage= ruleAlphaPackage EOF
            {
             newCompositeNode(grammarAccess.getAlphaPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlphaPackage=ruleAlphaPackage();

            state._fsp--;

             current =iv_ruleAlphaPackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlphaPackage"


    // $ANTLR start "ruleAlphaPackage"
    // InternalAlpha.g:345:1: ruleAlphaPackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleAlphaPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_1 = null;

        EObject lv_elements_3_2 = null;

        EObject lv_elements_3_3 = null;

        EObject lv_elements_3_4 = null;



        	enterRule();

        try {
            // InternalAlpha.g:351:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem ) ) )* otherlv_4= '}' ) )
            // InternalAlpha.g:352:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem ) ) )* otherlv_4= '}' )
            {
            // InternalAlpha.g:352:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem ) ) )* otherlv_4= '}' )
            // InternalAlpha.g:353:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAlphaPackageAccess().getPackageKeyword_0());
            		
            // InternalAlpha.g:357:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAlpha.g:358:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAlpha.g:358:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAlpha.g:359:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getAlphaPackageAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlphaPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"alpha.model.Alpha.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAlphaPackageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlpha.g:380:3: ( ( (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13||LA4_0==15||LA4_0==19||LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAlpha.g:381:4: ( (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem ) )
            	    {
            	    // InternalAlpha.g:381:4: ( (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem ) )
            	    // InternalAlpha.g:382:5: (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem )
            	    {
            	    // InternalAlpha.g:382:5: (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem )
            	    int alt3=4;
            	    switch ( input.LA(1) ) {
            	    case 13:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case 15:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt3=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt3) {
            	        case 1 :
            	            // InternalAlpha.g:383:6: lv_elements_3_1= ruleAlphaConstant
            	            {

            	            						newCompositeNode(grammarAccess.getAlphaPackageAccess().getElementsAlphaConstantParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_10);
            	            lv_elements_3_1=ruleAlphaConstant();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getAlphaPackageRule());
            	            						}
            	            						add(
            	            							current,
            	            							"elements",
            	            							lv_elements_3_1,
            	            							"alpha.model.Alpha.AlphaConstant");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalAlpha.g:399:6: lv_elements_3_2= ruleExternalFunction
            	            {

            	            						newCompositeNode(grammarAccess.getAlphaPackageAccess().getElementsExternalFunctionParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FOLLOW_10);
            	            lv_elements_3_2=ruleExternalFunction();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getAlphaPackageRule());
            	            						}
            	            						add(
            	            							current,
            	            							"elements",
            	            							lv_elements_3_2,
            	            							"alpha.model.Alpha.ExternalFunction");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalAlpha.g:415:6: lv_elements_3_3= ruleAlphaPackage
            	            {

            	            						newCompositeNode(grammarAccess.getAlphaPackageAccess().getElementsAlphaPackageParserRuleCall_3_0_2());
            	            					
            	            pushFollow(FOLLOW_10);
            	            lv_elements_3_3=ruleAlphaPackage();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getAlphaPackageRule());
            	            						}
            	            						add(
            	            							current,
            	            							"elements",
            	            							lv_elements_3_3,
            	            							"alpha.model.Alpha.AlphaPackage");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalAlpha.g:431:6: lv_elements_3_4= ruleAlphaSystem
            	            {

            	            						newCompositeNode(grammarAccess.getAlphaPackageAccess().getElementsAlphaSystemParserRuleCall_3_0_3());
            	            					
            	            pushFollow(FOLLOW_10);
            	            lv_elements_3_4=ruleAlphaSystem();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getAlphaPackageRule());
            	            						}
            	            						add(
            	            							current,
            	            							"elements",
            	            							lv_elements_3_4,
            	            							"alpha.model.Alpha.AlphaSystem");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAlphaPackageAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlphaPackage"


    // $ANTLR start "entryRuleAlphaSystem"
    // InternalAlpha.g:457:1: entryRuleAlphaSystem returns [EObject current=null] : iv_ruleAlphaSystem= ruleAlphaSystem EOF ;
    public final EObject entryRuleAlphaSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaSystem = null;


        try {
            // InternalAlpha.g:457:52: (iv_ruleAlphaSystem= ruleAlphaSystem EOF )
            // InternalAlpha.g:458:2: iv_ruleAlphaSystem= ruleAlphaSystem EOF
            {
             newCompositeNode(grammarAccess.getAlphaSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlphaSystem=ruleAlphaSystem();

            state._fsp--;

             current =iv_ruleAlphaSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlphaSystem"


    // $ANTLR start "ruleAlphaSystem"
    // InternalAlpha.g:464:1: ruleAlphaSystem returns [EObject current=null] : (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomain ) ) (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )? (otherlv_5= 'inputs' ( (lv_inputs_6_0= ruleInputVariable ) )+ )? (otherlv_7= 'outputs' ( (lv_outputs_8_0= ruleOutputVariable ) )+ )? (otherlv_9= 'locals' ( (lv_locals_10_0= ruleLocalVariable ) )+ )? (otherlv_11= 'fuzzy' ( (lv_fuzzyVariables_12_0= ruleFuzzyVariable ) )+ )? (otherlv_13= 'over' ( (lv_whileDomainExpr_14_0= ruleCalculatorExpression ) ) otherlv_15= 'while' otherlv_16= '(' ( (lv_testExpression_17_0= ruleAlphaExpression ) ) otherlv_18= ')' )? (otherlv_19= 'let' ( (lv_useEquations_20_0= ruleUseEquation ) )* ( (lv_equations_21_0= ruleStandardEquation ) )* )? otherlv_22= '.' ) ;
    public final EObject ruleAlphaSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameterDomainExpr_2_0 = null;

        EObject lv_definedObjects_4_0 = null;

        EObject lv_inputs_6_0 = null;

        EObject lv_outputs_8_0 = null;

        EObject lv_locals_10_0 = null;

        EObject lv_fuzzyVariables_12_0 = null;

        EObject lv_whileDomainExpr_14_0 = null;

        EObject lv_testExpression_17_0 = null;

        EObject lv_useEquations_20_0 = null;

        EObject lv_equations_21_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:470:2: ( (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomain ) ) (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )? (otherlv_5= 'inputs' ( (lv_inputs_6_0= ruleInputVariable ) )+ )? (otherlv_7= 'outputs' ( (lv_outputs_8_0= ruleOutputVariable ) )+ )? (otherlv_9= 'locals' ( (lv_locals_10_0= ruleLocalVariable ) )+ )? (otherlv_11= 'fuzzy' ( (lv_fuzzyVariables_12_0= ruleFuzzyVariable ) )+ )? (otherlv_13= 'over' ( (lv_whileDomainExpr_14_0= ruleCalculatorExpression ) ) otherlv_15= 'while' otherlv_16= '(' ( (lv_testExpression_17_0= ruleAlphaExpression ) ) otherlv_18= ')' )? (otherlv_19= 'let' ( (lv_useEquations_20_0= ruleUseEquation ) )* ( (lv_equations_21_0= ruleStandardEquation ) )* )? otherlv_22= '.' ) )
            // InternalAlpha.g:471:2: (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomain ) ) (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )? (otherlv_5= 'inputs' ( (lv_inputs_6_0= ruleInputVariable ) )+ )? (otherlv_7= 'outputs' ( (lv_outputs_8_0= ruleOutputVariable ) )+ )? (otherlv_9= 'locals' ( (lv_locals_10_0= ruleLocalVariable ) )+ )? (otherlv_11= 'fuzzy' ( (lv_fuzzyVariables_12_0= ruleFuzzyVariable ) )+ )? (otherlv_13= 'over' ( (lv_whileDomainExpr_14_0= ruleCalculatorExpression ) ) otherlv_15= 'while' otherlv_16= '(' ( (lv_testExpression_17_0= ruleAlphaExpression ) ) otherlv_18= ')' )? (otherlv_19= 'let' ( (lv_useEquations_20_0= ruleUseEquation ) )* ( (lv_equations_21_0= ruleStandardEquation ) )* )? otherlv_22= '.' )
            {
            // InternalAlpha.g:471:2: (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomain ) ) (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )? (otherlv_5= 'inputs' ( (lv_inputs_6_0= ruleInputVariable ) )+ )? (otherlv_7= 'outputs' ( (lv_outputs_8_0= ruleOutputVariable ) )+ )? (otherlv_9= 'locals' ( (lv_locals_10_0= ruleLocalVariable ) )+ )? (otherlv_11= 'fuzzy' ( (lv_fuzzyVariables_12_0= ruleFuzzyVariable ) )+ )? (otherlv_13= 'over' ( (lv_whileDomainExpr_14_0= ruleCalculatorExpression ) ) otherlv_15= 'while' otherlv_16= '(' ( (lv_testExpression_17_0= ruleAlphaExpression ) ) otherlv_18= ')' )? (otherlv_19= 'let' ( (lv_useEquations_20_0= ruleUseEquation ) )* ( (lv_equations_21_0= ruleStandardEquation ) )* )? otherlv_22= '.' )
            // InternalAlpha.g:472:3: otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomain ) ) (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )? (otherlv_5= 'inputs' ( (lv_inputs_6_0= ruleInputVariable ) )+ )? (otherlv_7= 'outputs' ( (lv_outputs_8_0= ruleOutputVariable ) )+ )? (otherlv_9= 'locals' ( (lv_locals_10_0= ruleLocalVariable ) )+ )? (otherlv_11= 'fuzzy' ( (lv_fuzzyVariables_12_0= ruleFuzzyVariable ) )+ )? (otherlv_13= 'over' ( (lv_whileDomainExpr_14_0= ruleCalculatorExpression ) ) otherlv_15= 'while' otherlv_16= '(' ( (lv_testExpression_17_0= ruleAlphaExpression ) ) otherlv_18= ')' )? (otherlv_19= 'let' ( (lv_useEquations_20_0= ruleUseEquation ) )* ( (lv_equations_21_0= ruleStandardEquation ) )* )? otherlv_22= '.'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAlphaSystemAccess().getAffineKeyword_0());
            		
            // InternalAlpha.g:476:3: ( (lv_name_1_0= ruleSystemName ) )
            // InternalAlpha.g:477:4: (lv_name_1_0= ruleSystemName )
            {
            // InternalAlpha.g:477:4: (lv_name_1_0= ruleSystemName )
            // InternalAlpha.g:478:5: lv_name_1_0= ruleSystemName
            {

            					newCompositeNode(grammarAccess.getAlphaSystemAccess().getNameSystemNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleSystemName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"alpha.model.Alpha.SystemName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:495:3: ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomain ) )
            // InternalAlpha.g:496:4: (lv_parameterDomainExpr_2_0= ruleJNIParamDomain )
            {
            // InternalAlpha.g:496:4: (lv_parameterDomainExpr_2_0= ruleJNIParamDomain )
            // InternalAlpha.g:497:5: lv_parameterDomainExpr_2_0= ruleJNIParamDomain
            {

            					newCompositeNode(grammarAccess.getAlphaSystemAccess().getParameterDomainExprJNIParamDomainParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_parameterDomainExpr_2_0=ruleJNIParamDomain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
            					}
            					set(
            						current,
            						"parameterDomainExpr",
            						lv_parameterDomainExpr_2_0,
            						"alpha.model.Alpha.JNIParamDomain");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:514:3: (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAlpha.g:515:4: otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getAlphaSystemAccess().getDefineKeyword_3_0());
                    			
                    // InternalAlpha.g:519:4: ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalAlpha.g:520:5: (lv_definedObjects_4_0= rulePolyhedralObject )
                    	    {
                    	    // InternalAlpha.g:520:5: (lv_definedObjects_4_0= rulePolyhedralObject )
                    	    // InternalAlpha.g:521:6: lv_definedObjects_4_0= rulePolyhedralObject
                    	    {

                    	    						newCompositeNode(grammarAccess.getAlphaSystemAccess().getDefinedObjectsPolyhedralObjectParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_definedObjects_4_0=rulePolyhedralObject();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"definedObjects",
                    	    							lv_definedObjects_4_0,
                    	    							"alpha.model.Alpha.PolyhedralObject");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }

            // InternalAlpha.g:539:3: (otherlv_5= 'inputs' ( (lv_inputs_6_0= ruleInputVariable ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAlpha.g:540:4: otherlv_5= 'inputs' ( (lv_inputs_6_0= ruleInputVariable ) )+
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getAlphaSystemAccess().getInputsKeyword_4_0());
                    			
                    // InternalAlpha.g:544:4: ( (lv_inputs_6_0= ruleInputVariable ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalAlpha.g:545:5: (lv_inputs_6_0= ruleInputVariable )
                    	    {
                    	    // InternalAlpha.g:545:5: (lv_inputs_6_0= ruleInputVariable )
                    	    // InternalAlpha.g:546:6: lv_inputs_6_0= ruleInputVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getAlphaSystemAccess().getInputsInputVariableParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_inputs_6_0=ruleInputVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inputs",
                    	    							lv_inputs_6_0,
                    	    							"alpha.model.Alpha.InputVariable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }

            // InternalAlpha.g:564:3: (otherlv_7= 'outputs' ( (lv_outputs_8_0= ruleOutputVariable ) )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAlpha.g:565:4: otherlv_7= 'outputs' ( (lv_outputs_8_0= ruleOutputVariable ) )+
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getAlphaSystemAccess().getOutputsKeyword_5_0());
                    			
                    // InternalAlpha.g:569:4: ( (lv_outputs_8_0= ruleOutputVariable ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalAlpha.g:570:5: (lv_outputs_8_0= ruleOutputVariable )
                    	    {
                    	    // InternalAlpha.g:570:5: (lv_outputs_8_0= ruleOutputVariable )
                    	    // InternalAlpha.g:571:6: lv_outputs_8_0= ruleOutputVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getAlphaSystemAccess().getOutputsOutputVariableParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_outputs_8_0=ruleOutputVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"outputs",
                    	    							lv_outputs_8_0,
                    	    							"alpha.model.Alpha.OutputVariable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }

            // InternalAlpha.g:589:3: (otherlv_9= 'locals' ( (lv_locals_10_0= ruleLocalVariable ) )+ )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAlpha.g:590:4: otherlv_9= 'locals' ( (lv_locals_10_0= ruleLocalVariable ) )+
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getAlphaSystemAccess().getLocalsKeyword_6_0());
                    			
                    // InternalAlpha.g:594:4: ( (lv_locals_10_0= ruleLocalVariable ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalAlpha.g:595:5: (lv_locals_10_0= ruleLocalVariable )
                    	    {
                    	    // InternalAlpha.g:595:5: (lv_locals_10_0= ruleLocalVariable )
                    	    // InternalAlpha.g:596:6: lv_locals_10_0= ruleLocalVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getAlphaSystemAccess().getLocalsLocalVariableParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_locals_10_0=ruleLocalVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"locals",
                    	    							lv_locals_10_0,
                    	    							"alpha.model.Alpha.LocalVariable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    }
                    break;

            }

            // InternalAlpha.g:614:3: (otherlv_11= 'fuzzy' ( (lv_fuzzyVariables_12_0= ruleFuzzyVariable ) )+ )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAlpha.g:615:4: otherlv_11= 'fuzzy' ( (lv_fuzzyVariables_12_0= ruleFuzzyVariable ) )+
                    {
                    otherlv_11=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getAlphaSystemAccess().getFuzzyKeyword_7_0());
                    			
                    // InternalAlpha.g:619:4: ( (lv_fuzzyVariables_12_0= ruleFuzzyVariable ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalAlpha.g:620:5: (lv_fuzzyVariables_12_0= ruleFuzzyVariable )
                    	    {
                    	    // InternalAlpha.g:620:5: (lv_fuzzyVariables_12_0= ruleFuzzyVariable )
                    	    // InternalAlpha.g:621:6: lv_fuzzyVariables_12_0= ruleFuzzyVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getAlphaSystemAccess().getFuzzyVariablesFuzzyVariableParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_fuzzyVariables_12_0=ruleFuzzyVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fuzzyVariables",
                    	    							lv_fuzzyVariables_12_0,
                    	    							"alpha.model.Alpha.FuzzyVariable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    }
                    break;

            }

            // InternalAlpha.g:639:3: (otherlv_13= 'over' ( (lv_whileDomainExpr_14_0= ruleCalculatorExpression ) ) otherlv_15= 'while' otherlv_16= '(' ( (lv_testExpression_17_0= ruleAlphaExpression ) ) otherlv_18= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAlpha.g:640:4: otherlv_13= 'over' ( (lv_whileDomainExpr_14_0= ruleCalculatorExpression ) ) otherlv_15= 'while' otherlv_16= '(' ( (lv_testExpression_17_0= ruleAlphaExpression ) ) otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,28,FOLLOW_18); 

                    				newLeafNode(otherlv_13, grammarAccess.getAlphaSystemAccess().getOverKeyword_8_0());
                    			
                    // InternalAlpha.g:644:4: ( (lv_whileDomainExpr_14_0= ruleCalculatorExpression ) )
                    // InternalAlpha.g:645:5: (lv_whileDomainExpr_14_0= ruleCalculatorExpression )
                    {
                    // InternalAlpha.g:645:5: (lv_whileDomainExpr_14_0= ruleCalculatorExpression )
                    // InternalAlpha.g:646:6: lv_whileDomainExpr_14_0= ruleCalculatorExpression
                    {

                    						newCompositeNode(grammarAccess.getAlphaSystemAccess().getWhileDomainExprCalculatorExpressionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_whileDomainExpr_14_0=ruleCalculatorExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    						}
                    						set(
                    							current,
                    							"whileDomainExpr",
                    							lv_whileDomainExpr_14_0,
                    							"alpha.model.Alpha.CalculatorExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,29,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getAlphaSystemAccess().getWhileKeyword_8_2());
                    			
                    otherlv_16=(Token)match(input,16,FOLLOW_20); 

                    				newLeafNode(otherlv_16, grammarAccess.getAlphaSystemAccess().getLeftParenthesisKeyword_8_3());
                    			
                    // InternalAlpha.g:671:4: ( (lv_testExpression_17_0= ruleAlphaExpression ) )
                    // InternalAlpha.g:672:5: (lv_testExpression_17_0= ruleAlphaExpression )
                    {
                    // InternalAlpha.g:672:5: (lv_testExpression_17_0= ruleAlphaExpression )
                    // InternalAlpha.g:673:6: lv_testExpression_17_0= ruleAlphaExpression
                    {

                    						newCompositeNode(grammarAccess.getAlphaSystemAccess().getTestExpressionAlphaExpressionParserRuleCall_8_4_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_testExpression_17_0=ruleAlphaExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    						}
                    						set(
                    							current,
                    							"testExpression",
                    							lv_testExpression_17_0,
                    							"alpha.model.Alpha.AlphaExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,17,FOLLOW_21); 

                    				newLeafNode(otherlv_18, grammarAccess.getAlphaSystemAccess().getRightParenthesisKeyword_8_5());
                    			

                    }
                    break;

            }

            // InternalAlpha.g:695:3: (otherlv_19= 'let' ( (lv_useEquations_20_0= ruleUseEquation ) )* ( (lv_equations_21_0= ruleStandardEquation ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAlpha.g:696:4: otherlv_19= 'let' ( (lv_useEquations_20_0= ruleUseEquation ) )* ( (lv_equations_21_0= ruleStandardEquation ) )*
                    {
                    otherlv_19=(Token)match(input,30,FOLLOW_22); 

                    				newLeafNode(otherlv_19, grammarAccess.getAlphaSystemAccess().getLetKeyword_9_0());
                    			
                    // InternalAlpha.g:700:4: ( (lv_useEquations_20_0= ruleUseEquation ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==16||LA16_0==28) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalAlpha.g:701:5: (lv_useEquations_20_0= ruleUseEquation )
                    	    {
                    	    // InternalAlpha.g:701:5: (lv_useEquations_20_0= ruleUseEquation )
                    	    // InternalAlpha.g:702:6: lv_useEquations_20_0= ruleUseEquation
                    	    {

                    	    						newCompositeNode(grammarAccess.getAlphaSystemAccess().getUseEquationsUseEquationParserRuleCall_9_1_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_useEquations_20_0=ruleUseEquation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"useEquations",
                    	    							lv_useEquations_20_0,
                    	    							"alpha.model.Alpha.UseEquation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // InternalAlpha.g:719:4: ( (lv_equations_21_0= ruleStandardEquation ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalAlpha.g:720:5: (lv_equations_21_0= ruleStandardEquation )
                    	    {
                    	    // InternalAlpha.g:720:5: (lv_equations_21_0= ruleStandardEquation )
                    	    // InternalAlpha.g:721:6: lv_equations_21_0= ruleStandardEquation
                    	    {

                    	    						newCompositeNode(grammarAccess.getAlphaSystemAccess().getEquationsStandardEquationParserRuleCall_9_2_0());
                    	    					
                    	    pushFollow(FOLLOW_23);
                    	    lv_equations_21_0=ruleStandardEquation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"equations",
                    	    							lv_equations_21_0,
                    	    							"alpha.model.Alpha.StandardEquation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_22=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getAlphaSystemAccess().getFullStopKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlphaSystem"


    // $ANTLR start "entryRuleInputVariable"
    // InternalAlpha.g:747:1: entryRuleInputVariable returns [EObject current=null] : iv_ruleInputVariable= ruleInputVariable EOF ;
    public final EObject entryRuleInputVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputVariable = null;


        try {
            // InternalAlpha.g:747:54: (iv_ruleInputVariable= ruleInputVariable EOF )
            // InternalAlpha.g:748:2: iv_ruleInputVariable= ruleInputVariable EOF
            {
             newCompositeNode(grammarAccess.getInputVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputVariable=ruleInputVariable();

            state._fsp--;

             current =iv_ruleInputVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputVariable"


    // $ANTLR start "ruleInputVariable"
    // InternalAlpha.g:754:1: ruleInputVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleInputVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_domainExpr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:760:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? ) )
            // InternalAlpha.g:761:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? )
            {
            // InternalAlpha.g:761:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? )
            // InternalAlpha.g:762:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )?
            {
            // InternalAlpha.g:762:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:763:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:763:4: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:764:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInputVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"alpha.model.Alpha.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getInputVariableAccess().getColonKeyword_1());
            		
            // InternalAlpha.g:784:3: ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==16||LA19_0==20||LA19_0==34||(LA19_0>=75 && LA19_0<=80)) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==EOF||LA19_2==RULE_ID||(LA19_2>=25 && LA19_2<=28)||(LA19_2>=30 && LA19_2<=31)||LA19_2==33||(LA19_2>=41 && LA19_2<=43)||LA19_2==60||(LA19_2>=81 && LA19_2<=83)) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalAlpha.g:785:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
                    {
                    // InternalAlpha.g:785:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
                    // InternalAlpha.g:786:5: lv_domainExpr_2_0= ruleCalculatorExpression
                    {

                    					newCompositeNode(grammarAccess.getInputVariableAccess().getDomainExprCalculatorExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_domainExpr_2_0=ruleCalculatorExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInputVariableRule());
                    					}
                    					set(
                    						current,
                    						"domainExpr",
                    						lv_domainExpr_2_0,
                    						"alpha.model.Alpha.CalculatorExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlpha.g:803:3: (otherlv_3= ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAlpha.g:804:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getInputVariableAccess().getSemicolonKeyword_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputVariable"


    // $ANTLR start "entryRuleOutputVariable"
    // InternalAlpha.g:813:1: entryRuleOutputVariable returns [EObject current=null] : iv_ruleOutputVariable= ruleOutputVariable EOF ;
    public final EObject entryRuleOutputVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputVariable = null;


        try {
            // InternalAlpha.g:813:55: (iv_ruleOutputVariable= ruleOutputVariable EOF )
            // InternalAlpha.g:814:2: iv_ruleOutputVariable= ruleOutputVariable EOF
            {
             newCompositeNode(grammarAccess.getOutputVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputVariable=ruleOutputVariable();

            state._fsp--;

             current =iv_ruleOutputVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputVariable"


    // $ANTLR start "ruleOutputVariable"
    // InternalAlpha.g:820:1: ruleOutputVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleOutputVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_domainExpr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:826:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? ) )
            // InternalAlpha.g:827:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? )
            {
            // InternalAlpha.g:827:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? )
            // InternalAlpha.g:828:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )?
            {
            // InternalAlpha.g:828:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:829:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:829:4: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:830:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOutputVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"alpha.model.Alpha.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputVariableAccess().getColonKeyword_1());
            		
            // InternalAlpha.g:850:3: ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==16||LA21_0==20||LA21_0==34||(LA21_0>=75 && LA21_0<=80)) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==EOF||LA21_2==RULE_ID||(LA21_2>=26 && LA21_2<=28)||(LA21_2>=30 && LA21_2<=31)||LA21_2==33||(LA21_2>=41 && LA21_2<=43)||LA21_2==60||(LA21_2>=81 && LA21_2<=83)) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalAlpha.g:851:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
                    {
                    // InternalAlpha.g:851:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
                    // InternalAlpha.g:852:5: lv_domainExpr_2_0= ruleCalculatorExpression
                    {

                    					newCompositeNode(grammarAccess.getOutputVariableAccess().getDomainExprCalculatorExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_domainExpr_2_0=ruleCalculatorExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOutputVariableRule());
                    					}
                    					set(
                    						current,
                    						"domainExpr",
                    						lv_domainExpr_2_0,
                    						"alpha.model.Alpha.CalculatorExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlpha.g:869:3: (otherlv_3= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAlpha.g:870:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getOutputVariableAccess().getSemicolonKeyword_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutputVariable"


    // $ANTLR start "entryRuleLocalVariable"
    // InternalAlpha.g:879:1: entryRuleLocalVariable returns [EObject current=null] : iv_ruleLocalVariable= ruleLocalVariable EOF ;
    public final EObject entryRuleLocalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariable = null;


        try {
            // InternalAlpha.g:879:54: (iv_ruleLocalVariable= ruleLocalVariable EOF )
            // InternalAlpha.g:880:2: iv_ruleLocalVariable= ruleLocalVariable EOF
            {
             newCompositeNode(grammarAccess.getLocalVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalVariable=ruleLocalVariable();

            state._fsp--;

             current =iv_ruleLocalVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalVariable"


    // $ANTLR start "ruleLocalVariable"
    // InternalAlpha.g:886:1: ruleLocalVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleLocalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_domainExpr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:892:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? ) )
            // InternalAlpha.g:893:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? )
            {
            // InternalAlpha.g:893:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? )
            // InternalAlpha.g:894:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )?
            {
            // InternalAlpha.g:894:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:895:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:895:4: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:896:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLocalVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"alpha.model.Alpha.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalVariableAccess().getColonKeyword_1());
            		
            // InternalAlpha.g:916:3: ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==16||LA23_0==20||LA23_0==34||(LA23_0>=75 && LA23_0<=80)) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==EOF||LA23_2==RULE_ID||(LA23_2>=27 && LA23_2<=28)||(LA23_2>=30 && LA23_2<=31)||LA23_2==33||(LA23_2>=41 && LA23_2<=43)||LA23_2==60||(LA23_2>=81 && LA23_2<=83)) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalAlpha.g:917:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
                    {
                    // InternalAlpha.g:917:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
                    // InternalAlpha.g:918:5: lv_domainExpr_2_0= ruleCalculatorExpression
                    {

                    					newCompositeNode(grammarAccess.getLocalVariableAccess().getDomainExprCalculatorExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_domainExpr_2_0=ruleCalculatorExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLocalVariableRule());
                    					}
                    					set(
                    						current,
                    						"domainExpr",
                    						lv_domainExpr_2_0,
                    						"alpha.model.Alpha.CalculatorExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlpha.g:935:3: (otherlv_3= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAlpha.g:936:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getLocalVariableAccess().getSemicolonKeyword_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalVariable"


    // $ANTLR start "entryRuleFuzzyVariable"
    // InternalAlpha.g:945:1: entryRuleFuzzyVariable returns [EObject current=null] : iv_ruleFuzzyVariable= ruleFuzzyVariable EOF ;
    public final EObject entryRuleFuzzyVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyVariable = null;


        try {
            // InternalAlpha.g:945:54: (iv_ruleFuzzyVariable= ruleFuzzyVariable EOF )
            // InternalAlpha.g:946:2: iv_ruleFuzzyVariable= ruleFuzzyVariable EOF
            {
             newCompositeNode(grammarAccess.getFuzzyVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuzzyVariable=ruleFuzzyVariable();

            state._fsp--;

             current =iv_ruleFuzzyVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuzzyVariable"


    // $ANTLR start "ruleFuzzyVariable"
    // InternalAlpha.g:952:1: ruleFuzzyVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleFuzzyVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_domainExpr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:958:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? ) )
            // InternalAlpha.g:959:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? )
            {
            // InternalAlpha.g:959:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? )
            // InternalAlpha.g:960:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )?
            {
            // InternalAlpha.g:960:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:961:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:961:4: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:962:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFuzzyVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuzzyVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"alpha.model.Alpha.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getFuzzyVariableAccess().getColonKeyword_1());
            		
            // InternalAlpha.g:982:3: ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==16||LA25_0==20||LA25_0==34||(LA25_0>=75 && LA25_0<=80)) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==EOF||LA25_2==RULE_ID||LA25_2==28||(LA25_2>=30 && LA25_2<=31)||LA25_2==33||(LA25_2>=41 && LA25_2<=43)||LA25_2==60||(LA25_2>=81 && LA25_2<=83)) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalAlpha.g:983:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
                    {
                    // InternalAlpha.g:983:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
                    // InternalAlpha.g:984:5: lv_domainExpr_2_0= ruleCalculatorExpression
                    {

                    					newCompositeNode(grammarAccess.getFuzzyVariableAccess().getDomainExprCalculatorExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_domainExpr_2_0=ruleCalculatorExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFuzzyVariableRule());
                    					}
                    					set(
                    						current,
                    						"domainExpr",
                    						lv_domainExpr_2_0,
                    						"alpha.model.Alpha.CalculatorExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlpha.g:1001:3: (otherlv_3= ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAlpha.g:1002:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFuzzyVariableAccess().getSemicolonKeyword_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuzzyVariable"


    // $ANTLR start "entryRuleJNIDomain"
    // InternalAlpha.g:1011:1: entryRuleJNIDomain returns [EObject current=null] : iv_ruleJNIDomain= ruleJNIDomain EOF ;
    public final EObject entryRuleJNIDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIDomain = null;


        try {
            // InternalAlpha.g:1011:50: (iv_ruleJNIDomain= ruleJNIDomain EOF )
            // InternalAlpha.g:1012:2: iv_ruleJNIDomain= ruleJNIDomain EOF
            {
             newCompositeNode(grammarAccess.getJNIDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJNIDomain=ruleJNIDomain();

            state._fsp--;

             current =iv_ruleJNIDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJNIDomain"


    // $ANTLR start "ruleJNIDomain"
    // InternalAlpha.g:1018:1: ruleJNIDomain returns [EObject current=null] : ( (lv_islString_0_0= ruleAISLSet ) ) ;
    public final EObject ruleJNIDomain() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_islString_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1024:2: ( ( (lv_islString_0_0= ruleAISLSet ) ) )
            // InternalAlpha.g:1025:2: ( (lv_islString_0_0= ruleAISLSet ) )
            {
            // InternalAlpha.g:1025:2: ( (lv_islString_0_0= ruleAISLSet ) )
            // InternalAlpha.g:1026:3: (lv_islString_0_0= ruleAISLSet )
            {
            // InternalAlpha.g:1026:3: (lv_islString_0_0= ruleAISLSet )
            // InternalAlpha.g:1027:4: lv_islString_0_0= ruleAISLSet
            {

            				newCompositeNode(grammarAccess.getJNIDomainAccess().getIslStringAISLSetParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_islString_0_0=ruleAISLSet();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getJNIDomainRule());
            				}
            				set(
            					current,
            					"islString",
            					lv_islString_0_0,
            					"alpha.model.Alpha.AISLSet");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJNIDomain"


    // $ANTLR start "entryRuleJNIDomainInArrayNotation"
    // InternalAlpha.g:1047:1: entryRuleJNIDomainInArrayNotation returns [EObject current=null] : iv_ruleJNIDomainInArrayNotation= ruleJNIDomainInArrayNotation EOF ;
    public final EObject entryRuleJNIDomainInArrayNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIDomainInArrayNotation = null;


        try {
            // InternalAlpha.g:1047:65: (iv_ruleJNIDomainInArrayNotation= ruleJNIDomainInArrayNotation EOF )
            // InternalAlpha.g:1048:2: iv_ruleJNIDomainInArrayNotation= ruleJNIDomainInArrayNotation EOF
            {
             newCompositeNode(grammarAccess.getJNIDomainInArrayNotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJNIDomainInArrayNotation=ruleJNIDomainInArrayNotation();

            state._fsp--;

             current =iv_ruleJNIDomainInArrayNotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJNIDomainInArrayNotation"


    // $ANTLR start "ruleJNIDomainInArrayNotation"
    // InternalAlpha.g:1054:1: ruleJNIDomainInArrayNotation returns [EObject current=null] : (otherlv_0= '{' otherlv_1= ':' ( (lv_islString_2_0= ruleAISLString ) ) otherlv_3= '}' ) ;
    public final EObject ruleJNIDomainInArrayNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_islString_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1060:2: ( (otherlv_0= '{' otherlv_1= ':' ( (lv_islString_2_0= ruleAISLString ) ) otherlv_3= '}' ) )
            // InternalAlpha.g:1061:2: (otherlv_0= '{' otherlv_1= ':' ( (lv_islString_2_0= ruleAISLString ) ) otherlv_3= '}' )
            {
            // InternalAlpha.g:1061:2: (otherlv_0= '{' otherlv_1= ':' ( (lv_islString_2_0= ruleAISLString ) ) otherlv_3= '}' )
            // InternalAlpha.g:1062:3: otherlv_0= '{' otherlv_1= ':' ( (lv_islString_2_0= ruleAISLString ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getJNIDomainInArrayNotationAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getJNIDomainInArrayNotationAccess().getColonKeyword_1());
            		
            // InternalAlpha.g:1070:3: ( (lv_islString_2_0= ruleAISLString ) )
            // InternalAlpha.g:1071:4: (lv_islString_2_0= ruleAISLString )
            {
            // InternalAlpha.g:1071:4: (lv_islString_2_0= ruleAISLString )
            // InternalAlpha.g:1072:5: lv_islString_2_0= ruleAISLString
            {

            					newCompositeNode(grammarAccess.getJNIDomainInArrayNotationAccess().getIslStringAISLStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
            lv_islString_2_0=ruleAISLString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJNIDomainInArrayNotationRule());
            					}
            					set(
            						current,
            						"islString",
            						lv_islString_2_0,
            						"alpha.model.Alpha.AISLString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getJNIDomainInArrayNotationAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJNIDomainInArrayNotation"


    // $ANTLR start "entryRuleJNIParamDomain"
    // InternalAlpha.g:1097:1: entryRuleJNIParamDomain returns [EObject current=null] : iv_ruleJNIParamDomain= ruleJNIParamDomain EOF ;
    public final EObject entryRuleJNIParamDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIParamDomain = null;


        try {
            // InternalAlpha.g:1097:55: (iv_ruleJNIParamDomain= ruleJNIParamDomain EOF )
            // InternalAlpha.g:1098:2: iv_ruleJNIParamDomain= ruleJNIParamDomain EOF
            {
             newCompositeNode(grammarAccess.getJNIParamDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJNIParamDomain=ruleJNIParamDomain();

            state._fsp--;

             current =iv_ruleJNIParamDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJNIParamDomain"


    // $ANTLR start "ruleJNIParamDomain"
    // InternalAlpha.g:1104:1: ruleJNIParamDomain returns [EObject current=null] : ( (lv_islString_0_0= ruleAParamDomain ) ) ;
    public final EObject ruleJNIParamDomain() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_islString_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1110:2: ( ( (lv_islString_0_0= ruleAParamDomain ) ) )
            // InternalAlpha.g:1111:2: ( (lv_islString_0_0= ruleAParamDomain ) )
            {
            // InternalAlpha.g:1111:2: ( (lv_islString_0_0= ruleAParamDomain ) )
            // InternalAlpha.g:1112:3: (lv_islString_0_0= ruleAParamDomain )
            {
            // InternalAlpha.g:1112:3: (lv_islString_0_0= ruleAParamDomain )
            // InternalAlpha.g:1113:4: lv_islString_0_0= ruleAParamDomain
            {

            				newCompositeNode(grammarAccess.getJNIParamDomainAccess().getIslStringAParamDomainParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_islString_0_0=ruleAParamDomain();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getJNIParamDomainRule());
            				}
            				set(
            					current,
            					"islString",
            					lv_islString_0_0,
            					"alpha.model.Alpha.AParamDomain");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJNIParamDomain"


    // $ANTLR start "entryRuleJNIRelation"
    // InternalAlpha.g:1133:1: entryRuleJNIRelation returns [EObject current=null] : iv_ruleJNIRelation= ruleJNIRelation EOF ;
    public final EObject entryRuleJNIRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIRelation = null;


        try {
            // InternalAlpha.g:1133:52: (iv_ruleJNIRelation= ruleJNIRelation EOF )
            // InternalAlpha.g:1134:2: iv_ruleJNIRelation= ruleJNIRelation EOF
            {
             newCompositeNode(grammarAccess.getJNIRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJNIRelation=ruleJNIRelation();

            state._fsp--;

             current =iv_ruleJNIRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJNIRelation"


    // $ANTLR start "ruleJNIRelation"
    // InternalAlpha.g:1140:1: ruleJNIRelation returns [EObject current=null] : ( (lv_islString_0_0= ruleAISLRelation ) ) ;
    public final EObject ruleJNIRelation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_islString_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1146:2: ( ( (lv_islString_0_0= ruleAISLRelation ) ) )
            // InternalAlpha.g:1147:2: ( (lv_islString_0_0= ruleAISLRelation ) )
            {
            // InternalAlpha.g:1147:2: ( (lv_islString_0_0= ruleAISLRelation ) )
            // InternalAlpha.g:1148:3: (lv_islString_0_0= ruleAISLRelation )
            {
            // InternalAlpha.g:1148:3: (lv_islString_0_0= ruleAISLRelation )
            // InternalAlpha.g:1149:4: lv_islString_0_0= ruleAISLRelation
            {

            				newCompositeNode(grammarAccess.getJNIRelationAccess().getIslStringAISLRelationParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_islString_0_0=ruleAISLRelation();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getJNIRelationRule());
            				}
            				set(
            					current,
            					"islString",
            					lv_islString_0_0,
            					"alpha.model.Alpha.AISLRelation");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJNIRelation"


    // $ANTLR start "entryRuleJNIFunction"
    // InternalAlpha.g:1169:1: entryRuleJNIFunction returns [EObject current=null] : iv_ruleJNIFunction= ruleJNIFunction EOF ;
    public final EObject entryRuleJNIFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIFunction = null;


        try {
            // InternalAlpha.g:1169:52: (iv_ruleJNIFunction= ruleJNIFunction EOF )
            // InternalAlpha.g:1170:2: iv_ruleJNIFunction= ruleJNIFunction EOF
            {
             newCompositeNode(grammarAccess.getJNIFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJNIFunction=ruleJNIFunction();

            state._fsp--;

             current =iv_ruleJNIFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJNIFunction"


    // $ANTLR start "ruleJNIFunction"
    // InternalAlpha.g:1176:1: ruleJNIFunction returns [EObject current=null] : ( (lv_alphaString_0_0= ruleAAlphaFunction ) ) ;
    public final EObject ruleJNIFunction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_alphaString_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1182:2: ( ( (lv_alphaString_0_0= ruleAAlphaFunction ) ) )
            // InternalAlpha.g:1183:2: ( (lv_alphaString_0_0= ruleAAlphaFunction ) )
            {
            // InternalAlpha.g:1183:2: ( (lv_alphaString_0_0= ruleAAlphaFunction ) )
            // InternalAlpha.g:1184:3: (lv_alphaString_0_0= ruleAAlphaFunction )
            {
            // InternalAlpha.g:1184:3: (lv_alphaString_0_0= ruleAAlphaFunction )
            // InternalAlpha.g:1185:4: lv_alphaString_0_0= ruleAAlphaFunction
            {

            				newCompositeNode(grammarAccess.getJNIFunctionAccess().getAlphaStringAAlphaFunctionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_alphaString_0_0=ruleAAlphaFunction();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getJNIFunctionRule());
            				}
            				set(
            					current,
            					"alphaString",
            					lv_alphaString_0_0,
            					"alpha.model.Alpha.AAlphaFunction");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJNIFunction"


    // $ANTLR start "entryRuleJNIFunctionInArrayNotation"
    // InternalAlpha.g:1205:1: entryRuleJNIFunctionInArrayNotation returns [EObject current=null] : iv_ruleJNIFunctionInArrayNotation= ruleJNIFunctionInArrayNotation EOF ;
    public final EObject entryRuleJNIFunctionInArrayNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIFunctionInArrayNotation = null;


        try {
            // InternalAlpha.g:1205:67: (iv_ruleJNIFunctionInArrayNotation= ruleJNIFunctionInArrayNotation EOF )
            // InternalAlpha.g:1206:2: iv_ruleJNIFunctionInArrayNotation= ruleJNIFunctionInArrayNotation EOF
            {
             newCompositeNode(grammarAccess.getJNIFunctionInArrayNotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJNIFunctionInArrayNotation=ruleJNIFunctionInArrayNotation();

            state._fsp--;

             current =iv_ruleJNIFunctionInArrayNotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJNIFunctionInArrayNotation"


    // $ANTLR start "ruleJNIFunctionInArrayNotation"
    // InternalAlpha.g:1212:1: ruleJNIFunctionInArrayNotation returns [EObject current=null] : (otherlv_0= '[' () ( ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleJNIFunctionInArrayNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arrayNotation_2_0 = null;

        AntlrDatatypeRuleToken lv_arrayNotation_4_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1218:2: ( (otherlv_0= '[' () ( ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )* )? otherlv_5= ']' ) )
            // InternalAlpha.g:1219:2: (otherlv_0= '[' () ( ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )* )? otherlv_5= ']' )
            {
            // InternalAlpha.g:1219:2: (otherlv_0= '[' () ( ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )* )? otherlv_5= ']' )
            // InternalAlpha.g:1220:3: otherlv_0= '[' () ( ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )* )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getJNIFunctionInArrayNotationAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAlpha.g:1224:3: ()
            // InternalAlpha.g:1225:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJNIFunctionInArrayNotationAccess().getJNIFunctionInArrayNotationAction_1(),
            					current);
            			

            }

            // InternalAlpha.g:1231:3: ( ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_WS)||LA28_0==14||(LA28_0>=41 && LA28_0<=45)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAlpha.g:1232:4: ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )*
                    {
                    // InternalAlpha.g:1232:4: ( (lv_arrayNotation_2_0= ruleAISLExpression ) )
                    // InternalAlpha.g:1233:5: (lv_arrayNotation_2_0= ruleAISLExpression )
                    {
                    // InternalAlpha.g:1233:5: (lv_arrayNotation_2_0= ruleAISLExpression )
                    // InternalAlpha.g:1234:6: lv_arrayNotation_2_0= ruleAISLExpression
                    {

                    						newCompositeNode(grammarAccess.getJNIFunctionInArrayNotationAccess().getArrayNotationAISLExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_arrayNotation_2_0=ruleAISLExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJNIFunctionInArrayNotationRule());
                    						}
                    						add(
                    							current,
                    							"arrayNotation",
                    							lv_arrayNotation_2_0,
                    							"alpha.model.Alpha.AISLExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlpha.g:1251:4: (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==35) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalAlpha.g:1252:5: otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,35,FOLLOW_31); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getJNIFunctionInArrayNotationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlpha.g:1256:5: ( (lv_arrayNotation_4_0= ruleAISLExpression ) )
                    	    // InternalAlpha.g:1257:6: (lv_arrayNotation_4_0= ruleAISLExpression )
                    	    {
                    	    // InternalAlpha.g:1257:6: (lv_arrayNotation_4_0= ruleAISLExpression )
                    	    // InternalAlpha.g:1258:7: lv_arrayNotation_4_0= ruleAISLExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getJNIFunctionInArrayNotationAccess().getArrayNotationAISLExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_arrayNotation_4_0=ruleAISLExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJNIFunctionInArrayNotationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arrayNotation",
                    	    								lv_arrayNotation_4_0,
                    	    								"alpha.model.Alpha.AISLExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getJNIFunctionInArrayNotationAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJNIFunctionInArrayNotation"


    // $ANTLR start "entryRuleJNIFuzzyFunction"
    // InternalAlpha.g:1285:1: entryRuleJNIFuzzyFunction returns [EObject current=null] : iv_ruleJNIFuzzyFunction= ruleJNIFuzzyFunction EOF ;
    public final EObject entryRuleJNIFuzzyFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIFuzzyFunction = null;


        try {
            // InternalAlpha.g:1285:57: (iv_ruleJNIFuzzyFunction= ruleJNIFuzzyFunction EOF )
            // InternalAlpha.g:1286:2: iv_ruleJNIFuzzyFunction= ruleJNIFuzzyFunction EOF
            {
             newCompositeNode(grammarAccess.getJNIFuzzyFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJNIFuzzyFunction=ruleJNIFuzzyFunction();

            state._fsp--;

             current =iv_ruleJNIFuzzyFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJNIFuzzyFunction"


    // $ANTLR start "ruleJNIFuzzyFunction"
    // InternalAlpha.g:1292:1: ruleJNIFuzzyFunction returns [EObject current=null] : ( (lv_alphaString_0_0= ruleAISLFuzzyRelation ) ) ;
    public final EObject ruleJNIFuzzyFunction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_alphaString_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1298:2: ( ( (lv_alphaString_0_0= ruleAISLFuzzyRelation ) ) )
            // InternalAlpha.g:1299:2: ( (lv_alphaString_0_0= ruleAISLFuzzyRelation ) )
            {
            // InternalAlpha.g:1299:2: ( (lv_alphaString_0_0= ruleAISLFuzzyRelation ) )
            // InternalAlpha.g:1300:3: (lv_alphaString_0_0= ruleAISLFuzzyRelation )
            {
            // InternalAlpha.g:1300:3: (lv_alphaString_0_0= ruleAISLFuzzyRelation )
            // InternalAlpha.g:1301:4: lv_alphaString_0_0= ruleAISLFuzzyRelation
            {

            				newCompositeNode(grammarAccess.getJNIFuzzyFunctionAccess().getAlphaStringAISLFuzzyRelationParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_alphaString_0_0=ruleAISLFuzzyRelation();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getJNIFuzzyFunctionRule());
            				}
            				set(
            					current,
            					"alphaString",
            					lv_alphaString_0_0,
            					"alpha.model.Alpha.AISLFuzzyRelation");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJNIFuzzyFunction"


    // $ANTLR start "entryRuleJNIFuzzyFunctionInArrayNotation"
    // InternalAlpha.g:1321:1: entryRuleJNIFuzzyFunctionInArrayNotation returns [EObject current=null] : iv_ruleJNIFuzzyFunctionInArrayNotation= ruleJNIFuzzyFunctionInArrayNotation EOF ;
    public final EObject entryRuleJNIFuzzyFunctionInArrayNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIFuzzyFunctionInArrayNotation = null;


        try {
            // InternalAlpha.g:1321:72: (iv_ruleJNIFuzzyFunctionInArrayNotation= ruleJNIFuzzyFunctionInArrayNotation EOF )
            // InternalAlpha.g:1322:2: iv_ruleJNIFuzzyFunctionInArrayNotation= ruleJNIFuzzyFunctionInArrayNotation EOF
            {
             newCompositeNode(grammarAccess.getJNIFuzzyFunctionInArrayNotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJNIFuzzyFunctionInArrayNotation=ruleJNIFuzzyFunctionInArrayNotation();

            state._fsp--;

             current =iv_ruleJNIFuzzyFunctionInArrayNotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJNIFuzzyFunctionInArrayNotation"


    // $ANTLR start "ruleJNIFuzzyFunctionInArrayNotation"
    // InternalAlpha.g:1328:1: ruleJNIFuzzyFunctionInArrayNotation returns [EObject current=null] : (otherlv_0= '[[' () ( ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )* )? otherlv_5= ']]' ) ;
    public final EObject ruleJNIFuzzyFunctionInArrayNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arrayNotation_2_0 = null;

        AntlrDatatypeRuleToken lv_arrayNotation_4_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1334:2: ( (otherlv_0= '[[' () ( ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )* )? otherlv_5= ']]' ) )
            // InternalAlpha.g:1335:2: (otherlv_0= '[[' () ( ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )* )? otherlv_5= ']]' )
            {
            // InternalAlpha.g:1335:2: (otherlv_0= '[[' () ( ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )* )? otherlv_5= ']]' )
            // InternalAlpha.g:1336:3: otherlv_0= '[[' () ( ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )* )? otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getJNIFuzzyFunctionInArrayNotationAccess().getLeftSquareBracketLeftSquareBracketKeyword_0());
            		
            // InternalAlpha.g:1340:3: ()
            // InternalAlpha.g:1341:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJNIFuzzyFunctionInArrayNotationAccess().getJNIFuzzyFunctionInArrayNotationAction_1(),
            					current);
            			

            }

            // InternalAlpha.g:1347:3: ( ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_WS)||LA30_0==14||LA30_0==34||LA30_0==36||(LA30_0>=41 && LA30_0<=45)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAlpha.g:1348:4: ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )*
                    {
                    // InternalAlpha.g:1348:4: ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) )
                    // InternalAlpha.g:1349:5: (lv_arrayNotation_2_0= ruleAISLFuzzyExpression )
                    {
                    // InternalAlpha.g:1349:5: (lv_arrayNotation_2_0= ruleAISLFuzzyExpression )
                    // InternalAlpha.g:1350:6: lv_arrayNotation_2_0= ruleAISLFuzzyExpression
                    {

                    						newCompositeNode(grammarAccess.getJNIFuzzyFunctionInArrayNotationAccess().getArrayNotationAISLFuzzyExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_arrayNotation_2_0=ruleAISLFuzzyExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJNIFuzzyFunctionInArrayNotationRule());
                    						}
                    						add(
                    							current,
                    							"arrayNotation",
                    							lv_arrayNotation_2_0,
                    							"alpha.model.Alpha.AISLFuzzyExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlpha.g:1367:4: (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==35) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalAlpha.g:1368:5: otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,35,FOLLOW_34); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getJNIFuzzyFunctionInArrayNotationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlpha.g:1372:5: ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) )
                    	    // InternalAlpha.g:1373:6: (lv_arrayNotation_4_0= ruleAISLFuzzyExpression )
                    	    {
                    	    // InternalAlpha.g:1373:6: (lv_arrayNotation_4_0= ruleAISLFuzzyExpression )
                    	    // InternalAlpha.g:1374:7: lv_arrayNotation_4_0= ruleAISLFuzzyExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getJNIFuzzyFunctionInArrayNotationAccess().getArrayNotationAISLFuzzyExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    lv_arrayNotation_4_0=ruleAISLFuzzyExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJNIFuzzyFunctionInArrayNotationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arrayNotation",
                    	    								lv_arrayNotation_4_0,
                    	    								"alpha.model.Alpha.AISLFuzzyExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getJNIFuzzyFunctionInArrayNotationAccess().getRightSquareBracketRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJNIFuzzyFunctionInArrayNotation"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAlpha.g:1401:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlpha.g:1401:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlpha.g:1402:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalAlpha.g:1408:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAlpha.g:1414:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAlpha.g:1415:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAlpha.g:1415:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAlpha.g:1416:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalAlpha.g:1423:3: (kw= '.' this_ID_2= RULE_ID )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==31) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAlpha.g:1424:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalAlpha.g:1441:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAlpha.g:1441:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAlpha.g:1442:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalAlpha.g:1448:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1454:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalAlpha.g:1455:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalAlpha.g:1455:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalAlpha.g:1456:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:1466:3: (kw= '.*' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAlpha.g:1467:4: kw= '.*'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleSystemName"
    // InternalAlpha.g:1477:1: entryRuleSystemName returns [String current=null] : iv_ruleSystemName= ruleSystemName EOF ;
    public final String entryRuleSystemName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSystemName = null;


        try {
            // InternalAlpha.g:1477:50: (iv_ruleSystemName= ruleSystemName EOF )
            // InternalAlpha.g:1478:2: iv_ruleSystemName= ruleSystemName EOF
            {
             newCompositeNode(grammarAccess.getSystemNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemName=ruleSystemName();

            state._fsp--;

             current =iv_ruleSystemName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemName"


    // $ANTLR start "ruleSystemName"
    // InternalAlpha.g:1484:1: ruleSystemName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleSystemName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:1490:2: (this_ID_0= RULE_ID )
            // InternalAlpha.g:1491:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getSystemNameAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemName"


    // $ANTLR start "entryRuleIndexName"
    // InternalAlpha.g:1501:1: entryRuleIndexName returns [String current=null] : iv_ruleIndexName= ruleIndexName EOF ;
    public final String entryRuleIndexName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIndexName = null;


        try {
            // InternalAlpha.g:1501:49: (iv_ruleIndexName= ruleIndexName EOF )
            // InternalAlpha.g:1502:2: iv_ruleIndexName= ruleIndexName EOF
            {
             newCompositeNode(grammarAccess.getIndexNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexName=ruleIndexName();

            state._fsp--;

             current =iv_ruleIndexName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndexName"


    // $ANTLR start "ruleIndexName"
    // InternalAlpha.g:1508:1: ruleIndexName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleIndexName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:1514:2: (this_ID_0= RULE_ID )
            // InternalAlpha.g:1515:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getIndexNameAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndexName"


    // $ANTLR start "entryRuleAIndexList"
    // InternalAlpha.g:1525:1: entryRuleAIndexList returns [String current=null] : iv_ruleAIndexList= ruleAIndexList EOF ;
    public final String entryRuleAIndexList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAIndexList = null;


        try {
            // InternalAlpha.g:1525:50: (iv_ruleAIndexList= ruleAIndexList EOF )
            // InternalAlpha.g:1526:2: iv_ruleAIndexList= ruleAIndexList EOF
            {
             newCompositeNode(grammarAccess.getAIndexListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAIndexList=ruleAIndexList();

            state._fsp--;

             current =iv_ruleAIndexList.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAIndexList"


    // $ANTLR start "ruleAIndexList"
    // InternalAlpha.g:1532:1: ruleAIndexList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IndexName_0= ruleIndexName (kw= ',' this_IndexName_2= ruleIndexName )* )? ;
    public final AntlrDatatypeRuleToken ruleAIndexList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IndexName_0 = null;

        AntlrDatatypeRuleToken this_IndexName_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1538:2: ( (this_IndexName_0= ruleIndexName (kw= ',' this_IndexName_2= ruleIndexName )* )? )
            // InternalAlpha.g:1539:2: (this_IndexName_0= ruleIndexName (kw= ',' this_IndexName_2= ruleIndexName )* )?
            {
            // InternalAlpha.g:1539:2: (this_IndexName_0= ruleIndexName (kw= ',' this_IndexName_2= ruleIndexName )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAlpha.g:1540:3: this_IndexName_0= ruleIndexName (kw= ',' this_IndexName_2= ruleIndexName )*
                    {

                    			newCompositeNode(grammarAccess.getAIndexListAccess().getIndexNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_37);
                    this_IndexName_0=ruleIndexName();

                    state._fsp--;


                    			current.merge(this_IndexName_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		
                    // InternalAlpha.g:1550:3: (kw= ',' this_IndexName_2= ruleIndexName )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==35) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalAlpha.g:1551:4: kw= ',' this_IndexName_2= ruleIndexName
                    	    {
                    	    kw=(Token)match(input,35,FOLLOW_4); 

                    	    				current.merge(kw);
                    	    				newLeafNode(kw, grammarAccess.getAIndexListAccess().getCommaKeyword_1_0());
                    	    			

                    	    				newCompositeNode(grammarAccess.getAIndexListAccess().getIndexNameParserRuleCall_1_1());
                    	    			
                    	    pushFollow(FOLLOW_37);
                    	    this_IndexName_2=ruleIndexName();

                    	    state._fsp--;


                    	    				current.merge(this_IndexName_2);
                    	    			

                    	    				afterParserOrEnumRuleCall();
                    	    			

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAIndexList"


    // $ANTLR start "entryRuleAParamDomain"
    // InternalAlpha.g:1571:1: entryRuleAParamDomain returns [String current=null] : iv_ruleAParamDomain= ruleAParamDomain EOF ;
    public final String entryRuleAParamDomain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAParamDomain = null;


        try {
            // InternalAlpha.g:1571:52: (iv_ruleAParamDomain= ruleAParamDomain EOF )
            // InternalAlpha.g:1572:2: iv_ruleAParamDomain= ruleAParamDomain EOF
            {
             newCompositeNode(grammarAccess.getAParamDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAParamDomain=ruleAParamDomain();

            state._fsp--;

             current =iv_ruleAParamDomain.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAParamDomain"


    // $ANTLR start "ruleAParamDomain"
    // InternalAlpha.g:1578:1: ruleAParamDomain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_AISLString_6= ruleAISLString kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleAParamDomain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AIndexList_1 = null;

        AntlrDatatypeRuleToken this_AISLString_6 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1584:2: ( (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_AISLString_6= ruleAISLString kw= '}' ) )
            // InternalAlpha.g:1585:2: (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_AISLString_6= ruleAISLString kw= '}' )
            {
            // InternalAlpha.g:1585:2: (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_AISLString_6= ruleAISLString kw= '}' )
            // InternalAlpha.g:1586:3: kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_AISLString_6= ruleAISLString kw= '}'
            {
            kw=(Token)match(input,34,FOLLOW_38); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAParamDomainAccess().getAIndexListParserRuleCall_1());
            		
            pushFollow(FOLLOW_39);
            this_AIndexList_1=ruleAIndexList();

            state._fsp--;


            			current.merge(this_AIndexList_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,36,FOLLOW_40); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getRightSquareBracketKeyword_2());
            		
            kw=(Token)match(input,40,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            kw=(Token)match(input,20,FOLLOW_24); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getLeftCurlyBracketKeyword_4());
            		
            kw=(Token)match(input,32,FOLLOW_27); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getColonKeyword_5());
            		

            			newCompositeNode(grammarAccess.getAParamDomainAccess().getAISLStringParserRuleCall_6());
            		
            pushFollow(FOLLOW_28);
            this_AISLString_6=ruleAISLString();

            state._fsp--;


            			current.merge(this_AISLString_6);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,21,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAParamDomain"


    // $ANTLR start "entryRuleAISLSet"
    // InternalAlpha.g:1640:1: entryRuleAISLSet returns [String current=null] : iv_ruleAISLSet= ruleAISLSet EOF ;
    public final String entryRuleAISLSet() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLSet = null;


        try {
            // InternalAlpha.g:1640:47: (iv_ruleAISLSet= ruleAISLSet EOF )
            // InternalAlpha.g:1641:2: iv_ruleAISLSet= ruleAISLSet EOF
            {
             newCompositeNode(grammarAccess.getAISLSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAISLSet=ruleAISLSet();

            state._fsp--;

             current =iv_ruleAISLSet.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAISLSet"


    // $ANTLR start "ruleAISLSet"
    // InternalAlpha.g:1647:1: ruleAISLSet returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleAISLSet() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLBasicSet_1 = null;

        AntlrDatatypeRuleToken this_AISLBasicSet_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1653:2: ( (kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}' ) )
            // InternalAlpha.g:1654:2: (kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}' )
            {
            // InternalAlpha.g:1654:2: (kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}' )
            // InternalAlpha.g:1655:3: kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}'
            {
            kw=(Token)match(input,20,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLSetAccess().getLeftCurlyBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAISLSetAccess().getAISLBasicSetParserRuleCall_1());
            		
            pushFollow(FOLLOW_41);
            this_AISLBasicSet_1=ruleAISLBasicSet();

            state._fsp--;


            			current.merge(this_AISLBasicSet_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:1670:3: (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==33) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAlpha.g:1671:4: kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet
            	    {
            	    kw=(Token)match(input,33,FOLLOW_11); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getAISLSetAccess().getSemicolonKeyword_2_0());
            	    			

            	    				newCompositeNode(grammarAccess.getAISLSetAccess().getAISLBasicSetParserRuleCall_2_1());
            	    			
            	    pushFollow(FOLLOW_41);
            	    this_AISLBasicSet_3=ruleAISLBasicSet();

            	    state._fsp--;


            	    				current.merge(this_AISLBasicSet_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            kw=(Token)match(input,21,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLSetAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAISLSet"


    // $ANTLR start "entryRuleAISLBasicSet"
    // InternalAlpha.g:1696:1: entryRuleAISLBasicSet returns [String current=null] : iv_ruleAISLBasicSet= ruleAISLBasicSet EOF ;
    public final String entryRuleAISLBasicSet() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLBasicSet = null;


        try {
            // InternalAlpha.g:1696:52: (iv_ruleAISLBasicSet= ruleAISLBasicSet EOF )
            // InternalAlpha.g:1697:2: iv_ruleAISLBasicSet= ruleAISLBasicSet EOF
            {
             newCompositeNode(grammarAccess.getAISLBasicSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAISLBasicSet=ruleAISLBasicSet();

            state._fsp--;

             current =iv_ruleAISLBasicSet.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAISLBasicSet"


    // $ANTLR start "ruleAISLBasicSet"
    // InternalAlpha.g:1703:1: ruleAISLBasicSet returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= ':' this_AISLString_4= ruleAISLString ) ;
    public final AntlrDatatypeRuleToken ruleAISLBasicSet() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AIndexList_1 = null;

        AntlrDatatypeRuleToken this_AISLString_4 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1709:2: ( (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= ':' this_AISLString_4= ruleAISLString ) )
            // InternalAlpha.g:1710:2: (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= ':' this_AISLString_4= ruleAISLString )
            {
            // InternalAlpha.g:1710:2: (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= ':' this_AISLString_4= ruleAISLString )
            // InternalAlpha.g:1711:3: kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= ':' this_AISLString_4= ruleAISLString
            {
            kw=(Token)match(input,34,FOLLOW_38); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicSetAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAISLBasicSetAccess().getAIndexListParserRuleCall_1());
            		
            pushFollow(FOLLOW_39);
            this_AIndexList_1=ruleAIndexList();

            state._fsp--;


            			current.merge(this_AIndexList_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,36,FOLLOW_24); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicSetAccess().getRightSquareBracketKeyword_2());
            		
            kw=(Token)match(input,32,FOLLOW_42); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicSetAccess().getColonKeyword_3());
            		

            			newCompositeNode(grammarAccess.getAISLBasicSetAccess().getAISLStringParserRuleCall_4());
            		
            pushFollow(FOLLOW_2);
            this_AISLString_4=ruleAISLString();

            state._fsp--;


            			current.merge(this_AISLString_4);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAISLBasicSet"


    // $ANTLR start "entryRuleAISLRelation"
    // InternalAlpha.g:1750:1: entryRuleAISLRelation returns [String current=null] : iv_ruleAISLRelation= ruleAISLRelation EOF ;
    public final String entryRuleAISLRelation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLRelation = null;


        try {
            // InternalAlpha.g:1750:52: (iv_ruleAISLRelation= ruleAISLRelation EOF )
            // InternalAlpha.g:1751:2: iv_ruleAISLRelation= ruleAISLRelation EOF
            {
             newCompositeNode(grammarAccess.getAISLRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAISLRelation=ruleAISLRelation();

            state._fsp--;

             current =iv_ruleAISLRelation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAISLRelation"


    // $ANTLR start "ruleAISLRelation"
    // InternalAlpha.g:1757:1: ruleAISLRelation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_AISLBasicRelation_1= ruleAISLBasicRelation (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleAISLRelation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLBasicRelation_1 = null;

        AntlrDatatypeRuleToken this_AISLBasicRelation_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1763:2: ( (kw= '{' this_AISLBasicRelation_1= ruleAISLBasicRelation (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )* kw= '}' ) )
            // InternalAlpha.g:1764:2: (kw= '{' this_AISLBasicRelation_1= ruleAISLBasicRelation (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )* kw= '}' )
            {
            // InternalAlpha.g:1764:2: (kw= '{' this_AISLBasicRelation_1= ruleAISLBasicRelation (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )* kw= '}' )
            // InternalAlpha.g:1765:3: kw= '{' this_AISLBasicRelation_1= ruleAISLBasicRelation (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )* kw= '}'
            {
            kw=(Token)match(input,20,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLRelationAccess().getLeftCurlyBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAISLRelationAccess().getAISLBasicRelationParserRuleCall_1());
            		
            pushFollow(FOLLOW_41);
            this_AISLBasicRelation_1=ruleAISLBasicRelation();

            state._fsp--;


            			current.merge(this_AISLBasicRelation_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:1780:3: (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==33) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAlpha.g:1781:4: kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation
            	    {
            	    kw=(Token)match(input,33,FOLLOW_11); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getAISLRelationAccess().getSemicolonKeyword_2_0());
            	    			

            	    				newCompositeNode(grammarAccess.getAISLRelationAccess().getAISLBasicRelationParserRuleCall_2_1());
            	    			
            	    pushFollow(FOLLOW_41);
            	    this_AISLBasicRelation_3=ruleAISLBasicRelation();

            	    state._fsp--;


            	    				current.merge(this_AISLBasicRelation_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            kw=(Token)match(input,21,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLRelationAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAISLRelation"


    // $ANTLR start "entryRuleAISLString"
    // InternalAlpha.g:1806:1: entryRuleAISLString returns [String current=null] : iv_ruleAISLString= ruleAISLString EOF ;
    public final String entryRuleAISLString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLString = null;


        try {
            // InternalAlpha.g:1806:50: (iv_ruleAISLString= ruleAISLString EOF )
            // InternalAlpha.g:1807:2: iv_ruleAISLString= ruleAISLString EOF
            {
             newCompositeNode(grammarAccess.getAISLStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAISLString=ruleAISLString();

            state._fsp--;

             current =iv_ruleAISLString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAISLString"


    // $ANTLR start "ruleAISLString"
    // InternalAlpha.g:1813:1: ruleAISLString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= 'and' | kw= 'or' | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | kw= '&' | kw= '|' | this_WS_17= RULE_WS | kw= '>=' | kw= '>' | kw= '=' | kw= '<' | kw= '<=' )* ;
    public final AntlrDatatypeRuleToken ruleAISLString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token kw=null;
        Token this_WS_17=null;
        AntlrDatatypeRuleToken this_IndexName_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1819:2: ( (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= 'and' | kw= 'or' | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | kw= '&' | kw= '|' | this_WS_17= RULE_WS | kw= '>=' | kw= '>' | kw= '=' | kw= '<' | kw= '<=' )* )
            // InternalAlpha.g:1820:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= 'and' | kw= 'or' | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | kw= '&' | kw= '|' | this_WS_17= RULE_WS | kw= '>=' | kw= '>' | kw= '=' | kw= '<' | kw= '<=' )*
            {
            // InternalAlpha.g:1820:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= 'and' | kw= 'or' | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | kw= '&' | kw= '|' | this_WS_17= RULE_WS | kw= '>=' | kw= '>' | kw= '=' | kw= '<' | kw= '<=' )*
            loop37:
            do {
                int alt37=24;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt37=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt37=2;
                    }
                    break;
                case 41:
                    {
                    alt37=3;
                    }
                    break;
                case 42:
                    {
                    alt37=4;
                    }
                    break;
                case 43:
                    {
                    alt37=5;
                    }
                    break;
                case 44:
                    {
                    alt37=6;
                    }
                    break;
                case 45:
                    {
                    alt37=7;
                    }
                    break;
                case 46:
                    {
                    alt37=8;
                    }
                    break;
                case 47:
                    {
                    alt37=9;
                    }
                    break;
                case 34:
                    {
                    alt37=10;
                    }
                    break;
                case 36:
                    {
                    alt37=11;
                    }
                    break;
                case 16:
                    {
                    alt37=12;
                    }
                    break;
                case 17:
                    {
                    alt37=13;
                    }
                    break;
                case 35:
                    {
                    alt37=14;
                    }
                    break;
                case 32:
                    {
                    alt37=15;
                    }
                    break;
                case 48:
                    {
                    alt37=16;
                    }
                    break;
                case 49:
                    {
                    alt37=17;
                    }
                    break;
                case RULE_WS:
                    {
                    alt37=18;
                    }
                    break;
                case 50:
                    {
                    alt37=19;
                    }
                    break;
                case 51:
                    {
                    alt37=20;
                    }
                    break;
                case 14:
                    {
                    alt37=21;
                    }
                    break;
                case 52:
                    {
                    alt37=22;
                    }
                    break;
                case 53:
                    {
                    alt37=23;
                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // InternalAlpha.g:1821:3: this_IndexName_0= ruleIndexName
            	    {

            	    			newCompositeNode(grammarAccess.getAISLStringAccess().getIndexNameParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_43);
            	    this_IndexName_0=ruleIndexName();

            	    state._fsp--;


            	    			current.merge(this_IndexName_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalAlpha.g:1832:3: this_INT_1= RULE_INT
            	    {
            	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_43); 

            	    			current.merge(this_INT_1);
            	    		

            	    			newLeafNode(this_INT_1, grammarAccess.getAISLStringAccess().getINTTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalAlpha.g:1840:3: kw= '+'
            	    {
            	    kw=(Token)match(input,41,FOLLOW_43); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getPlusSignKeyword_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalAlpha.g:1846:3: kw= '-'
            	    {
            	    kw=(Token)match(input,42,FOLLOW_43); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getHyphenMinusKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalAlpha.g:1852:3: kw= '*'
            	    {
            	    kw=(Token)match(input,43,FOLLOW_43); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getAsteriskKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalAlpha.g:1858:3: kw= '/'
            	    {
            	    kw=(Token)match(input,44,FOLLOW_43); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getSolidusKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalAlpha.g:1864:3: kw= '%'
            	    {
            	    kw=(Token)match(input,45,FOLLOW_43); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getPercentSignKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalAlpha.g:1870:3: kw= 'and'
            	    {
            	    kw=(Token)match(input,46,FOLLOW_43); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getAndKeyword_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalAlpha.g:1876:3: kw= 'or'
            	    {
            	    kw=(Token)match(input,47,FOLLOW_43); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getOrKeyword_8());
            	    		

            	    }
            	    break;
            	case 10 :
            	    // InternalAlpha.g:1882:3: kw= '['
            	    {
            	    kw=(Token)match(input,34,FOLLOW_43); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getLeftSquareBracketKeyword_9());
            	    		

            	    }
            	    break;
            	case 11 :
            	    // InternalAlpha.g:1888:3: kw= ']'
            	    {
            	    kw=(Token)match(input,36,FOLLOW_43); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getRightSquareBracketKeyword_10());
            	    		

            	    }
            	    break;
            	case 12 :
            	    // InternalAlpha.g:1894:3: kw= '('
            	    {
            	    kw=(Token)match(input,16,FOLLOW_43); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getLeftParenthesisKeyword_11());
            	    		

            	    }
            	    break;
            	case 13 :
            	    // InternalAlpha.g:1900:3: kw= ')'
            	    {
            	    kw=(Token)match(input,17,FOLLOW_43); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getRightParenthesisKeyword_12());
            	    		

            	    }
            	    break;
            	case 14 :
            	    // InternalAlpha.g:1906:3: kw= ','
            	    {
            	    kw=(Token)match(input,35,FOLLOW_43); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getCommaKeyword_13());
            	    		

            	    }
            	    break;
            	case 15 :
            	    // InternalAlpha.g:1912:3: kw= ':'
            	    {
            	    kw=(Token)match(input,32,FOLLOW_43); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getColonKeyword_14());
            	    		

            	    }
            	    break;
            	case 16 :
            	    // InternalAlpha.g:1918:3: kw= '&'
            	    {
            	    kw=(Token)match(input,48,FOLLOW_43); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getAmpersandKeyword_15());
            	    		

            	    }
            	    break;
            	case 17 :
            	    // InternalAlpha.g:1924:3: kw= '|'
            	    {
            	    kw=(Token)match(input,49,FOLLOW_43); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getVerticalLineKeyword_16());
            	    		

            	    }
            	    break;
            	case 18 :
            	    // InternalAlpha.g:1930:3: this_WS_17= RULE_WS
            	    {
            	    this_WS_17=(Token)match(input,RULE_WS,FOLLOW_43); 

            	    			current.merge(this_WS_17);
            	    		

            	    			newLeafNode(this_WS_17, grammarAccess.getAISLStringAccess().getWSTerminalRuleCall_17());
            	    		

            	    }
            	    break;
            	case 19 :
            	    // InternalAlpha.g:1938:3: kw= '>='
            	    {
            	    kw=(Token)match(input,50,FOLLOW_43); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getGreaterThanSignEqualsSignKeyword_18());
            	    		

            	    }
            	    break;
            	case 20 :
            	    // InternalAlpha.g:1944:3: kw= '>'
            	    {
            	    kw=(Token)match(input,51,FOLLOW_43); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getGreaterThanSignKeyword_19());
            	    		

            	    }
            	    break;
            	case 21 :
            	    // InternalAlpha.g:1950:3: kw= '='
            	    {
            	    kw=(Token)match(input,14,FOLLOW_43); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getEqualsSignKeyword_20());
            	    		

            	    }
            	    break;
            	case 22 :
            	    // InternalAlpha.g:1956:3: kw= '<'
            	    {
            	    kw=(Token)match(input,52,FOLLOW_43); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getLessThanSignKeyword_21());
            	    		

            	    }
            	    break;
            	case 23 :
            	    // InternalAlpha.g:1962:3: kw= '<='
            	    {
            	    kw=(Token)match(input,53,FOLLOW_43); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getLessThanSignEqualsSignKeyword_22());
            	    		

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAISLString"


    // $ANTLR start "entryRuleAISLExpression"
    // InternalAlpha.g:1971:1: entryRuleAISLExpression returns [String current=null] : iv_ruleAISLExpression= ruleAISLExpression EOF ;
    public final String entryRuleAISLExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLExpression = null;


        try {
            // InternalAlpha.g:1971:54: (iv_ruleAISLExpression= ruleAISLExpression EOF )
            // InternalAlpha.g:1972:2: iv_ruleAISLExpression= ruleAISLExpression EOF
            {
             newCompositeNode(grammarAccess.getAISLExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAISLExpression=ruleAISLExpression();

            state._fsp--;

             current =iv_ruleAISLExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAISLExpression"


    // $ANTLR start "ruleAISLExpression"
    // InternalAlpha.g:1978:1: ruleAISLExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_8= RULE_WS )+ ;
    public final AntlrDatatypeRuleToken ruleAISLExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token kw=null;
        Token this_WS_8=null;
        AntlrDatatypeRuleToken this_IndexName_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1984:2: ( (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_8= RULE_WS )+ )
            // InternalAlpha.g:1985:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_8= RULE_WS )+
            {
            // InternalAlpha.g:1985:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_8= RULE_WS )+
            int cnt38=0;
            loop38:
            do {
                int alt38=10;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt38=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt38=2;
                    }
                    break;
                case 14:
                    {
                    alt38=3;
                    }
                    break;
                case 41:
                    {
                    alt38=4;
                    }
                    break;
                case 42:
                    {
                    alt38=5;
                    }
                    break;
                case 43:
                    {
                    alt38=6;
                    }
                    break;
                case 44:
                    {
                    alt38=7;
                    }
                    break;
                case 45:
                    {
                    alt38=8;
                    }
                    break;
                case RULE_WS:
                    {
                    alt38=9;
                    }
                    break;

                }

                switch (alt38) {
            	case 1 :
            	    // InternalAlpha.g:1986:3: this_IndexName_0= ruleIndexName
            	    {

            	    			newCompositeNode(grammarAccess.getAISLExpressionAccess().getIndexNameParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_44);
            	    this_IndexName_0=ruleIndexName();

            	    state._fsp--;


            	    			current.merge(this_IndexName_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalAlpha.g:1997:3: this_INT_1= RULE_INT
            	    {
            	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_44); 

            	    			current.merge(this_INT_1);
            	    		

            	    			newLeafNode(this_INT_1, grammarAccess.getAISLExpressionAccess().getINTTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalAlpha.g:2005:3: kw= '='
            	    {
            	    kw=(Token)match(input,14,FOLLOW_44); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getEqualsSignKeyword_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalAlpha.g:2011:3: kw= '+'
            	    {
            	    kw=(Token)match(input,41,FOLLOW_44); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getPlusSignKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalAlpha.g:2017:3: kw= '-'
            	    {
            	    kw=(Token)match(input,42,FOLLOW_44); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getHyphenMinusKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalAlpha.g:2023:3: kw= '*'
            	    {
            	    kw=(Token)match(input,43,FOLLOW_44); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getAsteriskKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalAlpha.g:2029:3: kw= '/'
            	    {
            	    kw=(Token)match(input,44,FOLLOW_44); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getSolidusKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalAlpha.g:2035:3: kw= '%'
            	    {
            	    kw=(Token)match(input,45,FOLLOW_44); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getPercentSignKeyword_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalAlpha.g:2041:3: this_WS_8= RULE_WS
            	    {
            	    this_WS_8=(Token)match(input,RULE_WS,FOLLOW_44); 

            	    			current.merge(this_WS_8);
            	    		

            	    			newLeafNode(this_WS_8, grammarAccess.getAISLExpressionAccess().getWSTerminalRuleCall_8());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAISLExpression"


    // $ANTLR start "entryRuleAISLExpressionList"
    // InternalAlpha.g:2052:1: entryRuleAISLExpressionList returns [String current=null] : iv_ruleAISLExpressionList= ruleAISLExpressionList EOF ;
    public final String entryRuleAISLExpressionList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLExpressionList = null;


        try {
            // InternalAlpha.g:2052:58: (iv_ruleAISLExpressionList= ruleAISLExpressionList EOF )
            // InternalAlpha.g:2053:2: iv_ruleAISLExpressionList= ruleAISLExpressionList EOF
            {
             newCompositeNode(grammarAccess.getAISLExpressionListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAISLExpressionList=ruleAISLExpressionList();

            state._fsp--;

             current =iv_ruleAISLExpressionList.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAISLExpressionList"


    // $ANTLR start "ruleAISLExpressionList"
    // InternalAlpha.g:2059:1: ruleAISLExpressionList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AISLExpression_0= ruleAISLExpression (kw= ',' this_AISLExpression_2= ruleAISLExpression )* )? ;
    public final AntlrDatatypeRuleToken ruleAISLExpressionList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLExpression_0 = null;

        AntlrDatatypeRuleToken this_AISLExpression_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2065:2: ( (this_AISLExpression_0= ruleAISLExpression (kw= ',' this_AISLExpression_2= ruleAISLExpression )* )? )
            // InternalAlpha.g:2066:2: (this_AISLExpression_0= ruleAISLExpression (kw= ',' this_AISLExpression_2= ruleAISLExpression )* )?
            {
            // InternalAlpha.g:2066:2: (this_AISLExpression_0= ruleAISLExpression (kw= ',' this_AISLExpression_2= ruleAISLExpression )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_WS)||LA40_0==14||(LA40_0>=41 && LA40_0<=45)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAlpha.g:2067:3: this_AISLExpression_0= ruleAISLExpression (kw= ',' this_AISLExpression_2= ruleAISLExpression )*
                    {

                    			newCompositeNode(grammarAccess.getAISLExpressionListAccess().getAISLExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_37);
                    this_AISLExpression_0=ruleAISLExpression();

                    state._fsp--;


                    			current.merge(this_AISLExpression_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		
                    // InternalAlpha.g:2077:3: (kw= ',' this_AISLExpression_2= ruleAISLExpression )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==35) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalAlpha.g:2078:4: kw= ',' this_AISLExpression_2= ruleAISLExpression
                    	    {
                    	    kw=(Token)match(input,35,FOLLOW_31); 

                    	    				current.merge(kw);
                    	    				newLeafNode(kw, grammarAccess.getAISLExpressionListAccess().getCommaKeyword_1_0());
                    	    			

                    	    				newCompositeNode(grammarAccess.getAISLExpressionListAccess().getAISLExpressionParserRuleCall_1_1());
                    	    			
                    	    pushFollow(FOLLOW_37);
                    	    this_AISLExpression_2=ruleAISLExpression();

                    	    state._fsp--;


                    	    				current.merge(this_AISLExpression_2);
                    	    			

                    	    				afterParserOrEnumRuleCall();
                    	    			

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAISLExpressionList"


    // $ANTLR start "entryRuleAAlphaFunction"
    // InternalAlpha.g:2098:1: entryRuleAAlphaFunction returns [String current=null] : iv_ruleAAlphaFunction= ruleAAlphaFunction EOF ;
    public final String entryRuleAAlphaFunction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAAlphaFunction = null;


        try {
            // InternalAlpha.g:2098:54: (iv_ruleAAlphaFunction= ruleAAlphaFunction EOF )
            // InternalAlpha.g:2099:2: iv_ruleAAlphaFunction= ruleAAlphaFunction EOF
            {
             newCompositeNode(grammarAccess.getAAlphaFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAAlphaFunction=ruleAAlphaFunction();

            state._fsp--;

             current =iv_ruleAAlphaFunction.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAAlphaFunction"


    // $ANTLR start "ruleAAlphaFunction"
    // InternalAlpha.g:2105:1: ruleAAlphaFunction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_AIndexList_1= ruleAIndexList kw= '->' this_AISLExpressionList_3= ruleAISLExpressionList kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleAAlphaFunction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AIndexList_1 = null;

        AntlrDatatypeRuleToken this_AISLExpressionList_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2111:2: ( (kw= '(' this_AIndexList_1= ruleAIndexList kw= '->' this_AISLExpressionList_3= ruleAISLExpressionList kw= ')' ) )
            // InternalAlpha.g:2112:2: (kw= '(' this_AIndexList_1= ruleAIndexList kw= '->' this_AISLExpressionList_3= ruleAISLExpressionList kw= ')' )
            {
            // InternalAlpha.g:2112:2: (kw= '(' this_AIndexList_1= ruleAIndexList kw= '->' this_AISLExpressionList_3= ruleAISLExpressionList kw= ')' )
            // InternalAlpha.g:2113:3: kw= '(' this_AIndexList_1= ruleAIndexList kw= '->' this_AISLExpressionList_3= ruleAISLExpressionList kw= ')'
            {
            kw=(Token)match(input,16,FOLLOW_45); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAAlphaFunctionAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAAlphaFunctionAccess().getAIndexListParserRuleCall_1());
            		
            pushFollow(FOLLOW_40);
            this_AIndexList_1=ruleAIndexList();

            state._fsp--;


            			current.merge(this_AIndexList_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,40,FOLLOW_46); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAAlphaFunctionAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		

            			newCompositeNode(grammarAccess.getAAlphaFunctionAccess().getAISLExpressionListParserRuleCall_3());
            		
            pushFollow(FOLLOW_8);
            this_AISLExpressionList_3=ruleAISLExpressionList();

            state._fsp--;


            			current.merge(this_AISLExpressionList_3);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,17,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAAlphaFunctionAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAAlphaFunction"


    // $ANTLR start "entryRuleAISLBasicRelation"
    // InternalAlpha.g:2152:1: entryRuleAISLBasicRelation returns [String current=null] : iv_ruleAISLBasicRelation= ruleAISLBasicRelation EOF ;
    public final String entryRuleAISLBasicRelation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLBasicRelation = null;


        try {
            // InternalAlpha.g:2152:57: (iv_ruleAISLBasicRelation= ruleAISLBasicRelation EOF )
            // InternalAlpha.g:2153:2: iv_ruleAISLBasicRelation= ruleAISLBasicRelation EOF
            {
             newCompositeNode(grammarAccess.getAISLBasicRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAISLBasicRelation=ruleAISLBasicRelation();

            state._fsp--;

             current =iv_ruleAISLBasicRelation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAISLBasicRelation"


    // $ANTLR start "ruleAISLBasicRelation"
    // InternalAlpha.g:2159:1: ruleAISLBasicRelation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_5= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_8= ruleAISLString ) ;
    public final AntlrDatatypeRuleToken ruleAISLBasicRelation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AIndexList_1 = null;

        AntlrDatatypeRuleToken this_AISLExpressionList_5 = null;

        AntlrDatatypeRuleToken this_AISLString_8 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2165:2: ( (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_5= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_8= ruleAISLString ) )
            // InternalAlpha.g:2166:2: (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_5= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_8= ruleAISLString )
            {
            // InternalAlpha.g:2166:2: (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_5= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_8= ruleAISLString )
            // InternalAlpha.g:2167:3: kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_5= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_8= ruleAISLString
            {
            kw=(Token)match(input,34,FOLLOW_38); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAISLBasicRelationAccess().getAIndexListParserRuleCall_1());
            		
            pushFollow(FOLLOW_39);
            this_AIndexList_1=ruleAIndexList();

            state._fsp--;


            			current.merge(this_AIndexList_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,36,FOLLOW_40); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getRightSquareBracketKeyword_2());
            		
            kw=(Token)match(input,40,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            kw=(Token)match(input,34,FOLLOW_29); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getLeftSquareBracketKeyword_4());
            		

            			newCompositeNode(grammarAccess.getAISLBasicRelationAccess().getAISLExpressionListParserRuleCall_5());
            		
            pushFollow(FOLLOW_39);
            this_AISLExpressionList_5=ruleAISLExpressionList();

            state._fsp--;


            			current.merge(this_AISLExpressionList_5);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,36,FOLLOW_24); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getRightSquareBracketKeyword_6());
            		
            kw=(Token)match(input,32,FOLLOW_42); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getColonKeyword_7());
            		

            			newCompositeNode(grammarAccess.getAISLBasicRelationAccess().getAISLStringParserRuleCall_8());
            		
            pushFollow(FOLLOW_2);
            this_AISLString_8=ruleAISLString();

            state._fsp--;


            			current.merge(this_AISLString_8);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAISLBasicRelation"


    // $ANTLR start "entryRuleAISLFuzzyRelation"
    // InternalAlpha.g:2231:1: entryRuleAISLFuzzyRelation returns [String current=null] : iv_ruleAISLFuzzyRelation= ruleAISLFuzzyRelation EOF ;
    public final String entryRuleAISLFuzzyRelation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLFuzzyRelation = null;


        try {
            // InternalAlpha.g:2231:57: (iv_ruleAISLFuzzyRelation= ruleAISLFuzzyRelation EOF )
            // InternalAlpha.g:2232:2: iv_ruleAISLFuzzyRelation= ruleAISLFuzzyRelation EOF
            {
             newCompositeNode(grammarAccess.getAISLFuzzyRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAISLFuzzyRelation=ruleAISLFuzzyRelation();

            state._fsp--;

             current =iv_ruleAISLFuzzyRelation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAISLFuzzyRelation"


    // $ANTLR start "ruleAISLFuzzyRelation"
    // InternalAlpha.g:2238:1: ruleAISLFuzzyRelation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_AISLWrappedBasicRelation_1= ruleAISLWrappedBasicRelation (kw= ';' this_AISLIndirection_3= ruleAISLIndirection )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleAISLFuzzyRelation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLWrappedBasicRelation_1 = null;

        AntlrDatatypeRuleToken this_AISLIndirection_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2244:2: ( (kw= '{' this_AISLWrappedBasicRelation_1= ruleAISLWrappedBasicRelation (kw= ';' this_AISLIndirection_3= ruleAISLIndirection )* kw= '}' ) )
            // InternalAlpha.g:2245:2: (kw= '{' this_AISLWrappedBasicRelation_1= ruleAISLWrappedBasicRelation (kw= ';' this_AISLIndirection_3= ruleAISLIndirection )* kw= '}' )
            {
            // InternalAlpha.g:2245:2: (kw= '{' this_AISLWrappedBasicRelation_1= ruleAISLWrappedBasicRelation (kw= ';' this_AISLIndirection_3= ruleAISLIndirection )* kw= '}' )
            // InternalAlpha.g:2246:3: kw= '{' this_AISLWrappedBasicRelation_1= ruleAISLWrappedBasicRelation (kw= ';' this_AISLIndirection_3= ruleAISLIndirection )* kw= '}'
            {
            kw=(Token)match(input,20,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLFuzzyRelationAccess().getLeftCurlyBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAISLFuzzyRelationAccess().getAISLWrappedBasicRelationParserRuleCall_1());
            		
            pushFollow(FOLLOW_41);
            this_AISLWrappedBasicRelation_1=ruleAISLWrappedBasicRelation();

            state._fsp--;


            			current.merge(this_AISLWrappedBasicRelation_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:2261:3: (kw= ';' this_AISLIndirection_3= ruleAISLIndirection )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==33) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAlpha.g:2262:4: kw= ';' this_AISLIndirection_3= ruleAISLIndirection
            	    {
            	    kw=(Token)match(input,33,FOLLOW_11); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getAISLFuzzyRelationAccess().getSemicolonKeyword_2_0());
            	    			

            	    				newCompositeNode(grammarAccess.getAISLFuzzyRelationAccess().getAISLIndirectionParserRuleCall_2_1());
            	    			
            	    pushFollow(FOLLOW_41);
            	    this_AISLIndirection_3=ruleAISLIndirection();

            	    state._fsp--;


            	    				current.merge(this_AISLIndirection_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            kw=(Token)match(input,21,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLFuzzyRelationAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAISLFuzzyRelation"


    // $ANTLR start "entryRuleAISLWrappedBasicRelation"
    // InternalAlpha.g:2287:1: entryRuleAISLWrappedBasicRelation returns [String current=null] : iv_ruleAISLWrappedBasicRelation= ruleAISLWrappedBasicRelation EOF ;
    public final String entryRuleAISLWrappedBasicRelation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLWrappedBasicRelation = null;


        try {
            // InternalAlpha.g:2287:64: (iv_ruleAISLWrappedBasicRelation= ruleAISLWrappedBasicRelation EOF )
            // InternalAlpha.g:2288:2: iv_ruleAISLWrappedBasicRelation= ruleAISLWrappedBasicRelation EOF
            {
             newCompositeNode(grammarAccess.getAISLWrappedBasicRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAISLWrappedBasicRelation=ruleAISLWrappedBasicRelation();

            state._fsp--;

             current =iv_ruleAISLWrappedBasicRelation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAISLWrappedBasicRelation"


    // $ANTLR start "ruleAISLWrappedBasicRelation"
    // InternalAlpha.g:2294:1: ruleAISLWrappedBasicRelation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= '[' this_AIndexList_2= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_6= ruleAISLExpressionList kw= ']' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleAISLWrappedBasicRelation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AIndexList_2 = null;

        AntlrDatatypeRuleToken this_AISLExpressionList_6 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2300:2: ( (kw= '[' kw= '[' this_AIndexList_2= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_6= ruleAISLExpressionList kw= ']' kw= ']' ) )
            // InternalAlpha.g:2301:2: (kw= '[' kw= '[' this_AIndexList_2= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_6= ruleAISLExpressionList kw= ']' kw= ']' )
            {
            // InternalAlpha.g:2301:2: (kw= '[' kw= '[' this_AIndexList_2= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_6= ruleAISLExpressionList kw= ']' kw= ']' )
            // InternalAlpha.g:2302:3: kw= '[' kw= '[' this_AIndexList_2= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_6= ruleAISLExpressionList kw= ']' kw= ']'
            {
            kw=(Token)match(input,34,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getLeftSquareBracketKeyword_0());
            		
            kw=(Token)match(input,34,FOLLOW_38); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getLeftSquareBracketKeyword_1());
            		

            			newCompositeNode(grammarAccess.getAISLWrappedBasicRelationAccess().getAIndexListParserRuleCall_2());
            		
            pushFollow(FOLLOW_39);
            this_AIndexList_2=ruleAIndexList();

            state._fsp--;


            			current.merge(this_AIndexList_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,36,FOLLOW_40); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getRightSquareBracketKeyword_3());
            		
            kw=(Token)match(input,40,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            kw=(Token)match(input,34,FOLLOW_29); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getLeftSquareBracketKeyword_5());
            		

            			newCompositeNode(grammarAccess.getAISLWrappedBasicRelationAccess().getAISLExpressionListParserRuleCall_6());
            		
            pushFollow(FOLLOW_39);
            this_AISLExpressionList_6=ruleAISLExpressionList();

            state._fsp--;


            			current.merge(this_AISLExpressionList_6);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,36,FOLLOW_39); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getRightSquareBracketKeyword_7());
            		
            kw=(Token)match(input,36,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getRightSquareBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAISLWrappedBasicRelation"


    // $ANTLR start "entryRuleAISLIndirection"
    // InternalAlpha.g:2361:1: entryRuleAISLIndirection returns [String current=null] : iv_ruleAISLIndirection= ruleAISLIndirection EOF ;
    public final String entryRuleAISLIndirection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLIndirection = null;


        try {
            // InternalAlpha.g:2361:55: (iv_ruleAISLIndirection= ruleAISLIndirection EOF )
            // InternalAlpha.g:2362:2: iv_ruleAISLIndirection= ruleAISLIndirection EOF
            {
             newCompositeNode(grammarAccess.getAISLIndirectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAISLIndirection=ruleAISLIndirection();

            state._fsp--;

             current =iv_ruleAISLIndirection.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAISLIndirection"


    // $ANTLR start "ruleAISLIndirection"
    // InternalAlpha.g:2368:1: ruleAISLIndirection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' this_IndexName_4= ruleIndexName kw= '[' this_AISLExpressionList_6= ruleAISLExpressionList kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleAISLIndirection() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AIndexList_1 = null;

        AntlrDatatypeRuleToken this_IndexName_4 = null;

        AntlrDatatypeRuleToken this_AISLExpressionList_6 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2374:2: ( (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' this_IndexName_4= ruleIndexName kw= '[' this_AISLExpressionList_6= ruleAISLExpressionList kw= ']' ) )
            // InternalAlpha.g:2375:2: (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' this_IndexName_4= ruleIndexName kw= '[' this_AISLExpressionList_6= ruleAISLExpressionList kw= ']' )
            {
            // InternalAlpha.g:2375:2: (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' this_IndexName_4= ruleIndexName kw= '[' this_AISLExpressionList_6= ruleAISLExpressionList kw= ']' )
            // InternalAlpha.g:2376:3: kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' this_IndexName_4= ruleIndexName kw= '[' this_AISLExpressionList_6= ruleAISLExpressionList kw= ']'
            {
            kw=(Token)match(input,34,FOLLOW_38); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLIndirectionAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAISLIndirectionAccess().getAIndexListParserRuleCall_1());
            		
            pushFollow(FOLLOW_39);
            this_AIndexList_1=ruleAIndexList();

            state._fsp--;


            			current.merge(this_AIndexList_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,36,FOLLOW_40); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLIndirectionAccess().getRightSquareBracketKeyword_2());
            		
            kw=(Token)match(input,40,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLIndirectionAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		

            			newCompositeNode(grammarAccess.getAISLIndirectionAccess().getIndexNameParserRuleCall_4());
            		
            pushFollow(FOLLOW_11);
            this_IndexName_4=ruleIndexName();

            state._fsp--;


            			current.merge(this_IndexName_4);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,34,FOLLOW_29); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLIndirectionAccess().getLeftSquareBracketKeyword_5());
            		

            			newCompositeNode(grammarAccess.getAISLIndirectionAccess().getAISLExpressionListParserRuleCall_6());
            		
            pushFollow(FOLLOW_39);
            this_AISLExpressionList_6=ruleAISLExpressionList();

            state._fsp--;


            			current.merge(this_AISLExpressionList_6);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,36,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLIndirectionAccess().getRightSquareBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAISLIndirection"


    // $ANTLR start "entryRuleAISLFuzzyExpression"
    // InternalAlpha.g:2435:1: entryRuleAISLFuzzyExpression returns [String current=null] : iv_ruleAISLFuzzyExpression= ruleAISLFuzzyExpression EOF ;
    public final String entryRuleAISLFuzzyExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLFuzzyExpression = null;


        try {
            // InternalAlpha.g:2435:59: (iv_ruleAISLFuzzyExpression= ruleAISLFuzzyExpression EOF )
            // InternalAlpha.g:2436:2: iv_ruleAISLFuzzyExpression= ruleAISLFuzzyExpression EOF
            {
             newCompositeNode(grammarAccess.getAISLFuzzyExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAISLFuzzyExpression=ruleAISLFuzzyExpression();

            state._fsp--;

             current =iv_ruleAISLFuzzyExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAISLFuzzyExpression"


    // $ANTLR start "ruleAISLFuzzyExpression"
    // InternalAlpha.g:2442:1: ruleAISLFuzzyExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '[' | kw= ']' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_10= RULE_WS )+ ;
    public final AntlrDatatypeRuleToken ruleAISLFuzzyExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token kw=null;
        Token this_WS_10=null;
        AntlrDatatypeRuleToken this_IndexName_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2448:2: ( (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '[' | kw= ']' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_10= RULE_WS )+ )
            // InternalAlpha.g:2449:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '[' | kw= ']' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_10= RULE_WS )+
            {
            // InternalAlpha.g:2449:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '[' | kw= ']' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_10= RULE_WS )+
            int cnt42=0;
            loop42:
            do {
                int alt42=12;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt42=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt42=2;
                    }
                    break;
                case 34:
                    {
                    alt42=3;
                    }
                    break;
                case 36:
                    {
                    alt42=4;
                    }
                    break;
                case 14:
                    {
                    alt42=5;
                    }
                    break;
                case 41:
                    {
                    alt42=6;
                    }
                    break;
                case 42:
                    {
                    alt42=7;
                    }
                    break;
                case 43:
                    {
                    alt42=8;
                    }
                    break;
                case 44:
                    {
                    alt42=9;
                    }
                    break;
                case 45:
                    {
                    alt42=10;
                    }
                    break;
                case RULE_WS:
                    {
                    alt42=11;
                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // InternalAlpha.g:2450:3: this_IndexName_0= ruleIndexName
            	    {

            	    			newCompositeNode(grammarAccess.getAISLFuzzyExpressionAccess().getIndexNameParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_47);
            	    this_IndexName_0=ruleIndexName();

            	    state._fsp--;


            	    			current.merge(this_IndexName_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalAlpha.g:2461:3: this_INT_1= RULE_INT
            	    {
            	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_47); 

            	    			current.merge(this_INT_1);
            	    		

            	    			newLeafNode(this_INT_1, grammarAccess.getAISLFuzzyExpressionAccess().getINTTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalAlpha.g:2469:3: kw= '['
            	    {
            	    kw=(Token)match(input,34,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getLeftSquareBracketKeyword_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalAlpha.g:2475:3: kw= ']'
            	    {
            	    kw=(Token)match(input,36,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getRightSquareBracketKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalAlpha.g:2481:3: kw= '='
            	    {
            	    kw=(Token)match(input,14,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getEqualsSignKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalAlpha.g:2487:3: kw= '+'
            	    {
            	    kw=(Token)match(input,41,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getPlusSignKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalAlpha.g:2493:3: kw= '-'
            	    {
            	    kw=(Token)match(input,42,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getHyphenMinusKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalAlpha.g:2499:3: kw= '*'
            	    {
            	    kw=(Token)match(input,43,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getAsteriskKeyword_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalAlpha.g:2505:3: kw= '/'
            	    {
            	    kw=(Token)match(input,44,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getSolidusKeyword_8());
            	    		

            	    }
            	    break;
            	case 10 :
            	    // InternalAlpha.g:2511:3: kw= '%'
            	    {
            	    kw=(Token)match(input,45,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getPercentSignKeyword_9());
            	    		

            	    }
            	    break;
            	case 11 :
            	    // InternalAlpha.g:2517:3: this_WS_10= RULE_WS
            	    {
            	    this_WS_10=(Token)match(input,RULE_WS,FOLLOW_47); 

            	    			current.merge(this_WS_10);
            	    		

            	    			newLeafNode(this_WS_10, grammarAccess.getAISLFuzzyExpressionAccess().getWSTerminalRuleCall_10());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAISLFuzzyExpression"


    // $ANTLR start "entryRuleStandardEquation"
    // InternalAlpha.g:2528:1: entryRuleStandardEquation returns [EObject current=null] : iv_ruleStandardEquation= ruleStandardEquation EOF ;
    public final EObject entryRuleStandardEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardEquation = null;


        try {
            // InternalAlpha.g:2528:57: (iv_ruleStandardEquation= ruleStandardEquation EOF )
            // InternalAlpha.g:2529:2: iv_ruleStandardEquation= ruleStandardEquation EOF
            {
             newCompositeNode(grammarAccess.getStandardEquationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStandardEquation=ruleStandardEquation();

            state._fsp--;

             current =iv_ruleStandardEquation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStandardEquation"


    // $ANTLR start "ruleStandardEquation"
    // InternalAlpha.g:2535:1: ruleStandardEquation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )? otherlv_6= '=' ( (lv_expr_7_0= ruleAlphaExpression ) ) otherlv_8= ';' ) ;
    public final EObject ruleStandardEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_indexNames_2_0 = null;

        AntlrDatatypeRuleToken lv_indexNames_4_0 = null;

        EObject lv_expr_7_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2541:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )? otherlv_6= '=' ( (lv_expr_7_0= ruleAlphaExpression ) ) otherlv_8= ';' ) )
            // InternalAlpha.g:2542:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )? otherlv_6= '=' ( (lv_expr_7_0= ruleAlphaExpression ) ) otherlv_8= ';' )
            {
            // InternalAlpha.g:2542:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )? otherlv_6= '=' ( (lv_expr_7_0= ruleAlphaExpression ) ) otherlv_8= ';' )
            // InternalAlpha.g:2543:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )? otherlv_6= '=' ( (lv_expr_7_0= ruleAlphaExpression ) ) otherlv_8= ';'
            {
            // InternalAlpha.g:2543:3: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:2544:4: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:2544:4: (otherlv_0= RULE_ID )
            // InternalAlpha.g:2545:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStandardEquationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_48); 

            					newLeafNode(otherlv_0, grammarAccess.getStandardEquationAccess().getVariableVariableCrossReference_0_0());
            				

            }


            }

            // InternalAlpha.g:2556:3: (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==34) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAlpha.g:2557:4: otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getStandardEquationAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAlpha.g:2561:4: ( (lv_indexNames_2_0= ruleIndexName ) )
                    // InternalAlpha.g:2562:5: (lv_indexNames_2_0= ruleIndexName )
                    {
                    // InternalAlpha.g:2562:5: (lv_indexNames_2_0= ruleIndexName )
                    // InternalAlpha.g:2563:6: lv_indexNames_2_0= ruleIndexName
                    {

                    						newCompositeNode(grammarAccess.getStandardEquationAccess().getIndexNamesIndexNameParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_indexNames_2_0=ruleIndexName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStandardEquationRule());
                    						}
                    						add(
                    							current,
                    							"indexNames",
                    							lv_indexNames_2_0,
                    							"alpha.model.Alpha.IndexName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlpha.g:2580:4: (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==35) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalAlpha.g:2581:5: otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,35,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getStandardEquationAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalAlpha.g:2585:5: ( (lv_indexNames_4_0= ruleIndexName ) )
                    	    // InternalAlpha.g:2586:6: (lv_indexNames_4_0= ruleIndexName )
                    	    {
                    	    // InternalAlpha.g:2586:6: (lv_indexNames_4_0= ruleIndexName )
                    	    // InternalAlpha.g:2587:7: lv_indexNames_4_0= ruleIndexName
                    	    {

                    	    							newCompositeNode(grammarAccess.getStandardEquationAccess().getIndexNamesIndexNameParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_indexNames_4_0=ruleIndexName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStandardEquationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"indexNames",
                    	    								lv_indexNames_4_0,
                    	    								"alpha.model.Alpha.IndexName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getStandardEquationAccess().getRightSquareBracketKeyword_1_3());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getStandardEquationAccess().getEqualsSignKeyword_2());
            		
            // InternalAlpha.g:2614:3: ( (lv_expr_7_0= ruleAlphaExpression ) )
            // InternalAlpha.g:2615:4: (lv_expr_7_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:2615:4: (lv_expr_7_0= ruleAlphaExpression )
            // InternalAlpha.g:2616:5: lv_expr_7_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getStandardEquationAccess().getExprAlphaExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_49);
            lv_expr_7_0=ruleAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStandardEquationRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_7_0,
            						"alpha.model.Alpha.AlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getStandardEquationAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStandardEquation"


    // $ANTLR start "entryRuleUseEquation"
    // InternalAlpha.g:2641:1: entryRuleUseEquation returns [EObject current=null] : iv_ruleUseEquation= ruleUseEquation EOF ;
    public final EObject entryRuleUseEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseEquation = null;


        try {
            // InternalAlpha.g:2641:52: (iv_ruleUseEquation= ruleUseEquation EOF )
            // InternalAlpha.g:2642:2: iv_ruleUseEquation= ruleUseEquation EOF
            {
             newCompositeNode(grammarAccess.getUseEquationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseEquation=ruleUseEquation();

            state._fsp--;

             current =iv_ruleUseEquation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUseEquation"


    // $ANTLR start "ruleUseEquation"
    // InternalAlpha.g:2648:1: ruleUseEquation returns [EObject current=null] : ( (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )? otherlv_9= '(' ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )? otherlv_13= ')' otherlv_14= '=' ( ( ruleQualifiedName ) ) ( (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation ) ) otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' ) ;
    public final EObject ruleUseEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_instantiationDomainExpr_1_0 = null;

        AntlrDatatypeRuleToken lv_subsystemDims_4_0 = null;

        AntlrDatatypeRuleToken lv_subsystemDims_6_0 = null;

        EObject lv_outputExprs_10_0 = null;

        EObject lv_outputExprs_12_0 = null;

        EObject lv_callParamsExpr_16_0 = null;

        EObject lv_inputExprs_18_0 = null;

        EObject lv_inputExprs_20_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2654:2: ( ( (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )? otherlv_9= '(' ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )? otherlv_13= ')' otherlv_14= '=' ( ( ruleQualifiedName ) ) ( (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation ) ) otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' ) )
            // InternalAlpha.g:2655:2: ( (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )? otherlv_9= '(' ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )? otherlv_13= ')' otherlv_14= '=' ( ( ruleQualifiedName ) ) ( (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation ) ) otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' )
            {
            // InternalAlpha.g:2655:2: ( (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )? otherlv_9= '(' ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )? otherlv_13= ')' otherlv_14= '=' ( ( ruleQualifiedName ) ) ( (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation ) ) otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' )
            // InternalAlpha.g:2656:3: (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )? otherlv_9= '(' ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )? otherlv_13= ')' otherlv_14= '=' ( ( ruleQualifiedName ) ) ( (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation ) ) otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';'
            {
            // InternalAlpha.g:2656:3: (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==28) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAlpha.g:2657:4: otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getUseEquationAccess().getOverKeyword_0_0());
                    			
                    // InternalAlpha.g:2661:4: ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) )
                    // InternalAlpha.g:2662:5: (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression )
                    {
                    // InternalAlpha.g:2662:5: (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression )
                    // InternalAlpha.g:2663:6: lv_instantiationDomainExpr_1_0= ruleCalculatorExpression
                    {

                    						newCompositeNode(grammarAccess.getUseEquationAccess().getInstantiationDomainExprCalculatorExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_instantiationDomainExpr_1_0=ruleCalculatorExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseEquationRule());
                    						}
                    						set(
                    							current,
                    							"instantiationDomainExpr",
                    							lv_instantiationDomainExpr_1_0,
                    							"alpha.model.Alpha.CalculatorExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlpha.g:2680:4: (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==54) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalAlpha.g:2681:5: otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )?
                            {
                            otherlv_2=(Token)match(input,54,FOLLOW_51); 

                            					newLeafNode(otherlv_2, grammarAccess.getUseEquationAccess().getWithKeyword_0_2_0());
                            				
                            // InternalAlpha.g:2685:5: (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )?
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( (LA46_0==34) ) {
                                alt46=1;
                            }
                            switch (alt46) {
                                case 1 :
                                    // InternalAlpha.g:2686:6: otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']'
                                    {
                                    otherlv_3=(Token)match(input,34,FOLLOW_4); 

                                    						newLeafNode(otherlv_3, grammarAccess.getUseEquationAccess().getLeftSquareBracketKeyword_0_2_1_0());
                                    					
                                    // InternalAlpha.g:2690:6: ( (lv_subsystemDims_4_0= ruleIndexName ) )
                                    // InternalAlpha.g:2691:7: (lv_subsystemDims_4_0= ruleIndexName )
                                    {
                                    // InternalAlpha.g:2691:7: (lv_subsystemDims_4_0= ruleIndexName )
                                    // InternalAlpha.g:2692:8: lv_subsystemDims_4_0= ruleIndexName
                                    {

                                    								newCompositeNode(grammarAccess.getUseEquationAccess().getSubsystemDimsIndexNameParserRuleCall_0_2_1_1_0());
                                    							
                                    pushFollow(FOLLOW_30);
                                    lv_subsystemDims_4_0=ruleIndexName();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getUseEquationRule());
                                    								}
                                    								add(
                                    									current,
                                    									"subsystemDims",
                                    									lv_subsystemDims_4_0,
                                    									"alpha.model.Alpha.IndexName");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }

                                    // InternalAlpha.g:2709:6: (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )*
                                    loop45:
                                    do {
                                        int alt45=2;
                                        int LA45_0 = input.LA(1);

                                        if ( (LA45_0==35) ) {
                                            alt45=1;
                                        }


                                        switch (alt45) {
                                    	case 1 :
                                    	    // InternalAlpha.g:2710:7: otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) )
                                    	    {
                                    	    otherlv_5=(Token)match(input,35,FOLLOW_4); 

                                    	    							newLeafNode(otherlv_5, grammarAccess.getUseEquationAccess().getCommaKeyword_0_2_1_2_0());
                                    	    						
                                    	    // InternalAlpha.g:2714:7: ( (lv_subsystemDims_6_0= ruleIndexName ) )
                                    	    // InternalAlpha.g:2715:8: (lv_subsystemDims_6_0= ruleIndexName )
                                    	    {
                                    	    // InternalAlpha.g:2715:8: (lv_subsystemDims_6_0= ruleIndexName )
                                    	    // InternalAlpha.g:2716:9: lv_subsystemDims_6_0= ruleIndexName
                                    	    {

                                    	    									newCompositeNode(grammarAccess.getUseEquationAccess().getSubsystemDimsIndexNameParserRuleCall_0_2_1_2_1_0());
                                    	    								
                                    	    pushFollow(FOLLOW_30);
                                    	    lv_subsystemDims_6_0=ruleIndexName();

                                    	    state._fsp--;


                                    	    									if (current==null) {
                                    	    										current = createModelElementForParent(grammarAccess.getUseEquationRule());
                                    	    									}
                                    	    									add(
                                    	    										current,
                                    	    										"subsystemDims",
                                    	    										lv_subsystemDims_6_0,
                                    	    										"alpha.model.Alpha.IndexName");
                                    	    									afterParserOrEnumRuleCall();
                                    	    								

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop45;
                                        }
                                    } while (true);

                                    otherlv_7=(Token)match(input,36,FOLLOW_24); 

                                    						newLeafNode(otherlv_7, grammarAccess.getUseEquationAccess().getRightSquareBracketKeyword_0_2_1_3());
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,32,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getUseEquationAccess().getColonKeyword_0_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_52); 

            			newLeafNode(otherlv_9, grammarAccess.getUseEquationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:2749:3: ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_INT)||(LA50_0>=RULE_BOOLEAN && LA50_0<=RULE_FLOAT)||LA50_0==16||LA50_0==20||LA50_0==34||LA50_0==37||(LA50_0>=41 && LA50_0<=43)||(LA50_0>=46 && LA50_0<=47)||LA50_0==55||(LA50_0>=58 && LA50_0<=59)||(LA50_0>=61 && LA50_0<=65)||(LA50_0>=67 && LA50_0<=71)||LA50_0==73) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAlpha.g:2750:4: ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )*
                    {
                    // InternalAlpha.g:2750:4: ( (lv_outputExprs_10_0= ruleAlphaExpression ) )
                    // InternalAlpha.g:2751:5: (lv_outputExprs_10_0= ruleAlphaExpression )
                    {
                    // InternalAlpha.g:2751:5: (lv_outputExprs_10_0= ruleAlphaExpression )
                    // InternalAlpha.g:2752:6: lv_outputExprs_10_0= ruleAlphaExpression
                    {

                    						newCompositeNode(grammarAccess.getUseEquationAccess().getOutputExprsAlphaExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_outputExprs_10_0=ruleAlphaExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseEquationRule());
                    						}
                    						add(
                    							current,
                    							"outputExprs",
                    							lv_outputExprs_10_0,
                    							"alpha.model.Alpha.AlphaExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlpha.g:2769:4: (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==35) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalAlpha.g:2770:5: otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,35,FOLLOW_20); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getUseEquationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlpha.g:2774:5: ( (lv_outputExprs_12_0= ruleAlphaExpression ) )
                    	    // InternalAlpha.g:2775:6: (lv_outputExprs_12_0= ruleAlphaExpression )
                    	    {
                    	    // InternalAlpha.g:2775:6: (lv_outputExprs_12_0= ruleAlphaExpression )
                    	    // InternalAlpha.g:2776:7: lv_outputExprs_12_0= ruleAlphaExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseEquationAccess().getOutputExprsAlphaExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_53);
                    	    lv_outputExprs_12_0=ruleAlphaExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUseEquationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outputExprs",
                    	    								lv_outputExprs_12_0,
                    	    								"alpha.model.Alpha.AlphaExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_13, grammarAccess.getUseEquationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_14=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_14, grammarAccess.getUseEquationAccess().getEqualsSignKeyword_4());
            		
            // InternalAlpha.g:2803:3: ( ( ruleQualifiedName ) )
            // InternalAlpha.g:2804:4: ( ruleQualifiedName )
            {
            // InternalAlpha.g:2804:4: ( ruleQualifiedName )
            // InternalAlpha.g:2805:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseEquationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getUseEquationAccess().getSystemAlphaSystemCrossReference_5_0());
            				
            pushFollow(FOLLOW_54);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:2819:3: ( (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:2820:4: (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:2820:4: (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation )
            // InternalAlpha.g:2821:5: lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation
            {

            					newCompositeNode(grammarAccess.getUseEquationAccess().getCallParamsExprJNIFunctionInArrayNotationParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_callParamsExpr_16_0=ruleJNIFunctionInArrayNotation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUseEquationRule());
            					}
            					set(
            						current,
            						"callParamsExpr",
            						lv_callParamsExpr_16_0,
            						"alpha.model.Alpha.JNIFunctionInArrayNotation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,16,FOLLOW_52); 

            			newLeafNode(otherlv_17, grammarAccess.getUseEquationAccess().getLeftParenthesisKeyword_7());
            		
            // InternalAlpha.g:2842:3: ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_INT)||(LA52_0>=RULE_BOOLEAN && LA52_0<=RULE_FLOAT)||LA52_0==16||LA52_0==20||LA52_0==34||LA52_0==37||(LA52_0>=41 && LA52_0<=43)||(LA52_0>=46 && LA52_0<=47)||LA52_0==55||(LA52_0>=58 && LA52_0<=59)||(LA52_0>=61 && LA52_0<=65)||(LA52_0>=67 && LA52_0<=71)||LA52_0==73) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAlpha.g:2843:4: ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )*
                    {
                    // InternalAlpha.g:2843:4: ( (lv_inputExprs_18_0= ruleAlphaExpression ) )
                    // InternalAlpha.g:2844:5: (lv_inputExprs_18_0= ruleAlphaExpression )
                    {
                    // InternalAlpha.g:2844:5: (lv_inputExprs_18_0= ruleAlphaExpression )
                    // InternalAlpha.g:2845:6: lv_inputExprs_18_0= ruleAlphaExpression
                    {

                    						newCompositeNode(grammarAccess.getUseEquationAccess().getInputExprsAlphaExpressionParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_inputExprs_18_0=ruleAlphaExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseEquationRule());
                    						}
                    						add(
                    							current,
                    							"inputExprs",
                    							lv_inputExprs_18_0,
                    							"alpha.model.Alpha.AlphaExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlpha.g:2862:4: (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==35) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalAlpha.g:2863:5: otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) )
                    	    {
                    	    otherlv_19=(Token)match(input,35,FOLLOW_20); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getUseEquationAccess().getCommaKeyword_8_1_0());
                    	    				
                    	    // InternalAlpha.g:2867:5: ( (lv_inputExprs_20_0= ruleAlphaExpression ) )
                    	    // InternalAlpha.g:2868:6: (lv_inputExprs_20_0= ruleAlphaExpression )
                    	    {
                    	    // InternalAlpha.g:2868:6: (lv_inputExprs_20_0= ruleAlphaExpression )
                    	    // InternalAlpha.g:2869:7: lv_inputExprs_20_0= ruleAlphaExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseEquationAccess().getInputExprsAlphaExpressionParserRuleCall_8_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_53);
                    	    lv_inputExprs_20_0=ruleAlphaExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUseEquationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputExprs",
                    	    								lv_inputExprs_20_0,
                    	    								"alpha.model.Alpha.AlphaExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_21=(Token)match(input,17,FOLLOW_49); 

            			newLeafNode(otherlv_21, grammarAccess.getUseEquationAccess().getRightParenthesisKeyword_9());
            		
            otherlv_22=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getUseEquationAccess().getSemicolonKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUseEquation"


    // $ANTLR start "entryRuleAlphaExpression"
    // InternalAlpha.g:2900:1: entryRuleAlphaExpression returns [EObject current=null] : iv_ruleAlphaExpression= ruleAlphaExpression EOF ;
    public final EObject entryRuleAlphaExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaExpression = null;


        try {
            // InternalAlpha.g:2900:56: (iv_ruleAlphaExpression= ruleAlphaExpression EOF )
            // InternalAlpha.g:2901:2: iv_ruleAlphaExpression= ruleAlphaExpression EOF
            {
             newCompositeNode(grammarAccess.getAlphaExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlphaExpression=ruleAlphaExpression();

            state._fsp--;

             current =iv_ruleAlphaExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlphaExpression"


    // $ANTLR start "ruleAlphaExpression"
    // InternalAlpha.g:2907:1: ruleAlphaExpression returns [EObject current=null] : (this_IfExpression_0= ruleIfExpression | this_RestrictExpression_1= ruleRestrictExpression | this_AutoRestrictExpression_2= ruleAutoRestrictExpression | this_OrExpression_3= ruleOrExpression ) ;
    public final EObject ruleAlphaExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IfExpression_0 = null;

        EObject this_RestrictExpression_1 = null;

        EObject this_AutoRestrictExpression_2 = null;

        EObject this_OrExpression_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2913:2: ( (this_IfExpression_0= ruleIfExpression | this_RestrictExpression_1= ruleRestrictExpression | this_AutoRestrictExpression_2= ruleAutoRestrictExpression | this_OrExpression_3= ruleOrExpression ) )
            // InternalAlpha.g:2914:2: (this_IfExpression_0= ruleIfExpression | this_RestrictExpression_1= ruleRestrictExpression | this_AutoRestrictExpression_2= ruleAutoRestrictExpression | this_OrExpression_3= ruleOrExpression )
            {
            // InternalAlpha.g:2914:2: (this_IfExpression_0= ruleIfExpression | this_RestrictExpression_1= ruleRestrictExpression | this_AutoRestrictExpression_2= ruleAutoRestrictExpression | this_OrExpression_3= ruleOrExpression )
            int alt53=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt53=1;
                }
                break;
            case 20:
                {
                int LA53_2 = input.LA(2);

                if ( (LA53_2==34) ) {
                    int LA53_5 = input.LA(3);

                    if ( (LA53_5==RULE_ID||LA53_5==36) ) {
                        alt53=2;
                    }
                    else if ( (LA53_5==34) ) {
                        alt53=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA53_2==RULE_ID||LA53_2==16||LA53_2==20||LA53_2==32||(LA53_2>=75 && LA53_2<=80)) ) {
                    alt53=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 2, input);

                    throw nvae;
                }
                }
                break;
            case 58:
                {
                alt53=3;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_BOOLEAN:
            case RULE_FLOAT:
            case 16:
            case 34:
            case 37:
            case 41:
            case 42:
            case 43:
            case 46:
            case 47:
            case 59:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 73:
                {
                alt53=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalAlpha.g:2915:3: this_IfExpression_0= ruleIfExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaExpressionAccess().getIfExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfExpression_0=ruleIfExpression();

                    state._fsp--;


                    			current = this_IfExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:2924:3: this_RestrictExpression_1= ruleRestrictExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaExpressionAccess().getRestrictExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RestrictExpression_1=ruleRestrictExpression();

                    state._fsp--;


                    			current = this_RestrictExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:2933:3: this_AutoRestrictExpression_2= ruleAutoRestrictExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaExpressionAccess().getAutoRestrictExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AutoRestrictExpression_2=ruleAutoRestrictExpression();

                    state._fsp--;


                    			current = this_AutoRestrictExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:2942:3: this_OrExpression_3= ruleOrExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaExpressionAccess().getOrExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrExpression_3=ruleOrExpression();

                    state._fsp--;


                    			current = this_OrExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlphaExpression"


    // $ANTLR start "entryRuleAlphaTerminalExpression"
    // InternalAlpha.g:2954:1: entryRuleAlphaTerminalExpression returns [EObject current=null] : iv_ruleAlphaTerminalExpression= ruleAlphaTerminalExpression EOF ;
    public final EObject entryRuleAlphaTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaTerminalExpression = null;


        try {
            // InternalAlpha.g:2954:64: (iv_ruleAlphaTerminalExpression= ruleAlphaTerminalExpression EOF )
            // InternalAlpha.g:2955:2: iv_ruleAlphaTerminalExpression= ruleAlphaTerminalExpression EOF
            {
             newCompositeNode(grammarAccess.getAlphaTerminalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlphaTerminalExpression=ruleAlphaTerminalExpression();

            state._fsp--;

             current =iv_ruleAlphaTerminalExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlphaTerminalExpression"


    // $ANTLR start "ruleAlphaTerminalExpression"
    // InternalAlpha.g:2961:1: ruleAlphaTerminalExpression returns [EObject current=null] : ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_ConstantExpression_4= ruleConstantExpression | this_VariableExpression_5= ruleVariableExpression | this_DependenceExpression_6= ruleDependenceExpression | this_FuzzyDependenceExpression_7= ruleFuzzyDependenceExpression | this_IndexExpression_8= ruleIndexExpression | this_FuzzyIndexExpression_9= ruleFuzzyIndexExpression | this_ReduceExpression_10= ruleReduceExpression | this_ArgReduceExpression_11= ruleArgReduceExpression | this_ConvolutionExpression_12= ruleConvolutionExpression | this_ExternalReduceExpression_13= ruleExternalReduceExpression | this_ExternalArgReduceExpression_14= ruleExternalArgReduceExpression | this_MultiArgExpression_15= ruleMultiArgExpression | this_ExternalMultiArgExpression_16= ruleExternalMultiArgExpression | this_SelectExpression_17= ruleSelectExpression ) ;
    public final EObject ruleAlphaTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AlphaExpression_1 = null;

        EObject this_CaseExpression_3 = null;

        EObject this_ConstantExpression_4 = null;

        EObject this_VariableExpression_5 = null;

        EObject this_DependenceExpression_6 = null;

        EObject this_FuzzyDependenceExpression_7 = null;

        EObject this_IndexExpression_8 = null;

        EObject this_FuzzyIndexExpression_9 = null;

        EObject this_ReduceExpression_10 = null;

        EObject this_ArgReduceExpression_11 = null;

        EObject this_ConvolutionExpression_12 = null;

        EObject this_ExternalReduceExpression_13 = null;

        EObject this_ExternalArgReduceExpression_14 = null;

        EObject this_MultiArgExpression_15 = null;

        EObject this_ExternalMultiArgExpression_16 = null;

        EObject this_SelectExpression_17 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2967:2: ( ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_ConstantExpression_4= ruleConstantExpression | this_VariableExpression_5= ruleVariableExpression | this_DependenceExpression_6= ruleDependenceExpression | this_FuzzyDependenceExpression_7= ruleFuzzyDependenceExpression | this_IndexExpression_8= ruleIndexExpression | this_FuzzyIndexExpression_9= ruleFuzzyIndexExpression | this_ReduceExpression_10= ruleReduceExpression | this_ArgReduceExpression_11= ruleArgReduceExpression | this_ConvolutionExpression_12= ruleConvolutionExpression | this_ExternalReduceExpression_13= ruleExternalReduceExpression | this_ExternalArgReduceExpression_14= ruleExternalArgReduceExpression | this_MultiArgExpression_15= ruleMultiArgExpression | this_ExternalMultiArgExpression_16= ruleExternalMultiArgExpression | this_SelectExpression_17= ruleSelectExpression ) )
            // InternalAlpha.g:2968:2: ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_ConstantExpression_4= ruleConstantExpression | this_VariableExpression_5= ruleVariableExpression | this_DependenceExpression_6= ruleDependenceExpression | this_FuzzyDependenceExpression_7= ruleFuzzyDependenceExpression | this_IndexExpression_8= ruleIndexExpression | this_FuzzyIndexExpression_9= ruleFuzzyIndexExpression | this_ReduceExpression_10= ruleReduceExpression | this_ArgReduceExpression_11= ruleArgReduceExpression | this_ConvolutionExpression_12= ruleConvolutionExpression | this_ExternalReduceExpression_13= ruleExternalReduceExpression | this_ExternalArgReduceExpression_14= ruleExternalArgReduceExpression | this_MultiArgExpression_15= ruleMultiArgExpression | this_ExternalMultiArgExpression_16= ruleExternalMultiArgExpression | this_SelectExpression_17= ruleSelectExpression )
            {
            // InternalAlpha.g:2968:2: ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_ConstantExpression_4= ruleConstantExpression | this_VariableExpression_5= ruleVariableExpression | this_DependenceExpression_6= ruleDependenceExpression | this_FuzzyDependenceExpression_7= ruleFuzzyDependenceExpression | this_IndexExpression_8= ruleIndexExpression | this_FuzzyIndexExpression_9= ruleFuzzyIndexExpression | this_ReduceExpression_10= ruleReduceExpression | this_ArgReduceExpression_11= ruleArgReduceExpression | this_ConvolutionExpression_12= ruleConvolutionExpression | this_ExternalReduceExpression_13= ruleExternalReduceExpression | this_ExternalArgReduceExpression_14= ruleExternalArgReduceExpression | this_MultiArgExpression_15= ruleMultiArgExpression | this_ExternalMultiArgExpression_16= ruleExternalMultiArgExpression | this_SelectExpression_17= ruleSelectExpression )
            int alt54=16;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // InternalAlpha.g:2969:3: (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' )
                    {
                    // InternalAlpha.g:2969:3: (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' )
                    // InternalAlpha.g:2970:4: otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_20); 

                    				newLeafNode(otherlv_0, grammarAccess.getAlphaTerminalExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getAlphaExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_AlphaExpression_1=ruleAlphaExpression();

                    state._fsp--;


                    				current = this_AlphaExpression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getAlphaTerminalExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlpha.g:2988:3: this_CaseExpression_3= ruleCaseExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getCaseExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CaseExpression_3=ruleCaseExpression();

                    state._fsp--;


                    			current = this_CaseExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:2997:3: this_ConstantExpression_4= ruleConstantExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getConstantExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstantExpression_4=ruleConstantExpression();

                    state._fsp--;


                    			current = this_ConstantExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:3006:3: this_VariableExpression_5= ruleVariableExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getVariableExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableExpression_5=ruleVariableExpression();

                    state._fsp--;


                    			current = this_VariableExpression_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:3015:3: this_DependenceExpression_6= ruleDependenceExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getDependenceExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DependenceExpression_6=ruleDependenceExpression();

                    state._fsp--;


                    			current = this_DependenceExpression_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:3024:3: this_FuzzyDependenceExpression_7= ruleFuzzyDependenceExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getFuzzyDependenceExpressionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuzzyDependenceExpression_7=ruleFuzzyDependenceExpression();

                    state._fsp--;


                    			current = this_FuzzyDependenceExpression_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAlpha.g:3033:3: this_IndexExpression_8= ruleIndexExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getIndexExpressionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_IndexExpression_8=ruleIndexExpression();

                    state._fsp--;


                    			current = this_IndexExpression_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalAlpha.g:3042:3: this_FuzzyIndexExpression_9= ruleFuzzyIndexExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getFuzzyIndexExpressionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuzzyIndexExpression_9=ruleFuzzyIndexExpression();

                    state._fsp--;


                    			current = this_FuzzyIndexExpression_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalAlpha.g:3051:3: this_ReduceExpression_10= ruleReduceExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getReduceExpressionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReduceExpression_10=ruleReduceExpression();

                    state._fsp--;


                    			current = this_ReduceExpression_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalAlpha.g:3060:3: this_ArgReduceExpression_11= ruleArgReduceExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getArgReduceExpressionParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArgReduceExpression_11=ruleArgReduceExpression();

                    state._fsp--;


                    			current = this_ArgReduceExpression_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalAlpha.g:3069:3: this_ConvolutionExpression_12= ruleConvolutionExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getConvolutionExpressionParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConvolutionExpression_12=ruleConvolutionExpression();

                    state._fsp--;


                    			current = this_ConvolutionExpression_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalAlpha.g:3078:3: this_ExternalReduceExpression_13= ruleExternalReduceExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getExternalReduceExpressionParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalReduceExpression_13=ruleExternalReduceExpression();

                    state._fsp--;


                    			current = this_ExternalReduceExpression_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalAlpha.g:3087:3: this_ExternalArgReduceExpression_14= ruleExternalArgReduceExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getExternalArgReduceExpressionParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalArgReduceExpression_14=ruleExternalArgReduceExpression();

                    state._fsp--;


                    			current = this_ExternalArgReduceExpression_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalAlpha.g:3096:3: this_MultiArgExpression_15= ruleMultiArgExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getMultiArgExpressionParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiArgExpression_15=ruleMultiArgExpression();

                    state._fsp--;


                    			current = this_MultiArgExpression_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalAlpha.g:3105:3: this_ExternalMultiArgExpression_16= ruleExternalMultiArgExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getExternalMultiArgExpressionParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalMultiArgExpression_16=ruleExternalMultiArgExpression();

                    state._fsp--;


                    			current = this_ExternalMultiArgExpression_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalAlpha.g:3114:3: this_SelectExpression_17= ruleSelectExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getSelectExpressionParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectExpression_17=ruleSelectExpression();

                    state._fsp--;


                    			current = this_SelectExpression_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlphaTerminalExpression"


    // $ANTLR start "entryRuleIfExpression"
    // InternalAlpha.g:3126:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // InternalAlpha.g:3126:53: (iv_ruleIfExpression= ruleIfExpression EOF )
            // InternalAlpha.g:3127:2: iv_ruleIfExpression= ruleIfExpression EOF
            {
             newCompositeNode(grammarAccess.getIfExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfExpression=ruleIfExpression();

            state._fsp--;

             current =iv_ruleIfExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfExpression"


    // $ANTLR start "ruleIfExpression"
    // InternalAlpha.g:3133:1: ruleIfExpression returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condExpr_1_0= ruleAlphaExpression ) ) otherlv_2= 'then' ( (lv_thenExpr_3_0= ruleAlphaExpression ) ) otherlv_4= 'else' ( (lv_elseExpr_5_0= ruleAlphaExpression ) ) ) ;
    public final EObject ruleIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condExpr_1_0 = null;

        EObject lv_thenExpr_3_0 = null;

        EObject lv_elseExpr_5_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3139:2: ( (otherlv_0= 'if' ( (lv_condExpr_1_0= ruleAlphaExpression ) ) otherlv_2= 'then' ( (lv_thenExpr_3_0= ruleAlphaExpression ) ) otherlv_4= 'else' ( (lv_elseExpr_5_0= ruleAlphaExpression ) ) ) )
            // InternalAlpha.g:3140:2: (otherlv_0= 'if' ( (lv_condExpr_1_0= ruleAlphaExpression ) ) otherlv_2= 'then' ( (lv_thenExpr_3_0= ruleAlphaExpression ) ) otherlv_4= 'else' ( (lv_elseExpr_5_0= ruleAlphaExpression ) ) )
            {
            // InternalAlpha.g:3140:2: (otherlv_0= 'if' ( (lv_condExpr_1_0= ruleAlphaExpression ) ) otherlv_2= 'then' ( (lv_thenExpr_3_0= ruleAlphaExpression ) ) otherlv_4= 'else' ( (lv_elseExpr_5_0= ruleAlphaExpression ) ) )
            // InternalAlpha.g:3141:3: otherlv_0= 'if' ( (lv_condExpr_1_0= ruleAlphaExpression ) ) otherlv_2= 'then' ( (lv_thenExpr_3_0= ruleAlphaExpression ) ) otherlv_4= 'else' ( (lv_elseExpr_5_0= ruleAlphaExpression ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getIfExpressionAccess().getIfKeyword_0());
            		
            // InternalAlpha.g:3145:3: ( (lv_condExpr_1_0= ruleAlphaExpression ) )
            // InternalAlpha.g:3146:4: (lv_condExpr_1_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:3146:4: (lv_condExpr_1_0= ruleAlphaExpression )
            // InternalAlpha.g:3147:5: lv_condExpr_1_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getIfExpressionAccess().getCondExprAlphaExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_55);
            lv_condExpr_1_0=ruleAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
            					}
            					set(
            						current,
            						"condExpr",
            						lv_condExpr_1_0,
            						"alpha.model.Alpha.AlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getIfExpressionAccess().getThenKeyword_2());
            		
            // InternalAlpha.g:3168:3: ( (lv_thenExpr_3_0= ruleAlphaExpression ) )
            // InternalAlpha.g:3169:4: (lv_thenExpr_3_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:3169:4: (lv_thenExpr_3_0= ruleAlphaExpression )
            // InternalAlpha.g:3170:5: lv_thenExpr_3_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getIfExpressionAccess().getThenExprAlphaExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_56);
            lv_thenExpr_3_0=ruleAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
            					}
            					set(
            						current,
            						"thenExpr",
            						lv_thenExpr_3_0,
            						"alpha.model.Alpha.AlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,57,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getIfExpressionAccess().getElseKeyword_4());
            		
            // InternalAlpha.g:3191:3: ( (lv_elseExpr_5_0= ruleAlphaExpression ) )
            // InternalAlpha.g:3192:4: (lv_elseExpr_5_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:3192:4: (lv_elseExpr_5_0= ruleAlphaExpression )
            // InternalAlpha.g:3193:5: lv_elseExpr_5_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getIfExpressionAccess().getElseExprAlphaExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_elseExpr_5_0=ruleAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
            					}
            					set(
            						current,
            						"elseExpr",
            						lv_elseExpr_5_0,
            						"alpha.model.Alpha.AlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfExpression"


    // $ANTLR start "entryRuleRestrictExpression"
    // InternalAlpha.g:3214:1: entryRuleRestrictExpression returns [EObject current=null] : iv_ruleRestrictExpression= ruleRestrictExpression EOF ;
    public final EObject entryRuleRestrictExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictExpression = null;


        try {
            // InternalAlpha.g:3214:59: (iv_ruleRestrictExpression= ruleRestrictExpression EOF )
            // InternalAlpha.g:3215:2: iv_ruleRestrictExpression= ruleRestrictExpression EOF
            {
             newCompositeNode(grammarAccess.getRestrictExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestrictExpression=ruleRestrictExpression();

            state._fsp--;

             current =iv_ruleRestrictExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestrictExpression"


    // $ANTLR start "ruleRestrictExpression"
    // InternalAlpha.g:3221:1: ruleRestrictExpression returns [EObject current=null] : ( ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) | (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) ) ) ;
    public final EObject ruleRestrictExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_domainExpr_0_1 = null;

        EObject lv_domainExpr_0_2 = null;

        EObject lv_expr_2_0 = null;

        EObject lv_domainExpr_4_0 = null;

        EObject lv_expr_7_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3227:2: ( ( ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) | (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) ) ) )
            // InternalAlpha.g:3228:2: ( ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) | (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) ) )
            {
            // InternalAlpha.g:3228:2: ( ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) | (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) ) )
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // InternalAlpha.g:3229:3: ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) )
                    {
                    // InternalAlpha.g:3229:3: ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) )
                    // InternalAlpha.g:3230:4: ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) )
                    {
                    // InternalAlpha.g:3230:4: ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) )
                    // InternalAlpha.g:3231:5: ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) )
                    {
                    // InternalAlpha.g:3231:5: ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) )
                    // InternalAlpha.g:3232:6: (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation )
                    {
                    // InternalAlpha.g:3232:6: (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==20) ) {
                        int LA55_1 = input.LA(2);

                        if ( (LA55_1==32) ) {
                            alt55=2;
                        }
                        else if ( (LA55_1==34) ) {
                            alt55=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 55, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalAlpha.g:3233:7: lv_domainExpr_0_1= ruleJNIDomain
                            {

                            							newCompositeNode(grammarAccess.getRestrictExpressionAccess().getDomainExprJNIDomainParserRuleCall_0_0_0_0());
                            						
                            pushFollow(FOLLOW_24);
                            lv_domainExpr_0_1=ruleJNIDomain();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRestrictExpressionRule());
                            							}
                            							set(
                            								current,
                            								"domainExpr",
                            								lv_domainExpr_0_1,
                            								"alpha.model.Alpha.JNIDomain");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalAlpha.g:3249:7: lv_domainExpr_0_2= ruleJNIDomainInArrayNotation
                            {

                            							newCompositeNode(grammarAccess.getRestrictExpressionAccess().getDomainExprJNIDomainInArrayNotationParserRuleCall_0_0_0_1());
                            						
                            pushFollow(FOLLOW_24);
                            lv_domainExpr_0_2=ruleJNIDomainInArrayNotation();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRestrictExpressionRule());
                            							}
                            							set(
                            								current,
                            								"domainExpr",
                            								lv_domainExpr_0_2,
                            								"alpha.model.Alpha.JNIDomainInArrayNotation");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_1=(Token)match(input,32,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getRestrictExpressionAccess().getColonKeyword_0_1());
                    			
                    // InternalAlpha.g:3271:4: ( (lv_expr_2_0= ruleAlphaExpression ) )
                    // InternalAlpha.g:3272:5: (lv_expr_2_0= ruleAlphaExpression )
                    {
                    // InternalAlpha.g:3272:5: (lv_expr_2_0= ruleAlphaExpression )
                    // InternalAlpha.g:3273:6: lv_expr_2_0= ruleAlphaExpression
                    {

                    						newCompositeNode(grammarAccess.getRestrictExpressionAccess().getExprAlphaExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_2_0=ruleAlphaExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestrictExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_2_0,
                    							"alpha.model.Alpha.AlphaExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3292:3: (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) )
                    {
                    // InternalAlpha.g:3292:3: (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) )
                    // InternalAlpha.g:3293:4: otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getRestrictExpressionAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalAlpha.g:3297:4: ( (lv_domainExpr_4_0= ruleCalculatorExpression ) )
                    // InternalAlpha.g:3298:5: (lv_domainExpr_4_0= ruleCalculatorExpression )
                    {
                    // InternalAlpha.g:3298:5: (lv_domainExpr_4_0= ruleCalculatorExpression )
                    // InternalAlpha.g:3299:6: lv_domainExpr_4_0= ruleCalculatorExpression
                    {

                    						newCompositeNode(grammarAccess.getRestrictExpressionAccess().getDomainExprCalculatorExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_domainExpr_4_0=ruleCalculatorExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestrictExpressionRule());
                    						}
                    						set(
                    							current,
                    							"domainExpr",
                    							lv_domainExpr_4_0,
                    							"alpha.model.Alpha.CalculatorExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getRestrictExpressionAccess().getRightCurlyBracketKeyword_1_2());
                    			
                    otherlv_6=(Token)match(input,32,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getRestrictExpressionAccess().getColonKeyword_1_3());
                    			
                    // InternalAlpha.g:3324:4: ( (lv_expr_7_0= ruleAlphaExpression ) )
                    // InternalAlpha.g:3325:5: (lv_expr_7_0= ruleAlphaExpression )
                    {
                    // InternalAlpha.g:3325:5: (lv_expr_7_0= ruleAlphaExpression )
                    // InternalAlpha.g:3326:6: lv_expr_7_0= ruleAlphaExpression
                    {

                    						newCompositeNode(grammarAccess.getRestrictExpressionAccess().getExprAlphaExpressionParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_7_0=ruleAlphaExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestrictExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_7_0,
                    							"alpha.model.Alpha.AlphaExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestrictExpression"


    // $ANTLR start "entryRuleAutoRestrictExpression"
    // InternalAlpha.g:3348:1: entryRuleAutoRestrictExpression returns [EObject current=null] : iv_ruleAutoRestrictExpression= ruleAutoRestrictExpression EOF ;
    public final EObject entryRuleAutoRestrictExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoRestrictExpression = null;


        try {
            // InternalAlpha.g:3348:63: (iv_ruleAutoRestrictExpression= ruleAutoRestrictExpression EOF )
            // InternalAlpha.g:3349:2: iv_ruleAutoRestrictExpression= ruleAutoRestrictExpression EOF
            {
             newCompositeNode(grammarAccess.getAutoRestrictExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutoRestrictExpression=ruleAutoRestrictExpression();

            state._fsp--;

             current =iv_ruleAutoRestrictExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutoRestrictExpression"


    // $ANTLR start "ruleAutoRestrictExpression"
    // InternalAlpha.g:3355:1: ruleAutoRestrictExpression returns [EObject current=null] : (otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) ;
    public final EObject ruleAutoRestrictExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3361:2: ( (otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) )
            // InternalAlpha.g:3362:2: (otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) )
            {
            // InternalAlpha.g:3362:2: (otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) )
            // InternalAlpha.g:3363:3: otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getAutoRestrictExpressionAccess().getAutoKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getAutoRestrictExpressionAccess().getColonKeyword_1());
            		
            // InternalAlpha.g:3371:3: ( (lv_expr_2_0= ruleAlphaExpression ) )
            // InternalAlpha.g:3372:4: (lv_expr_2_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:3372:4: (lv_expr_2_0= ruleAlphaExpression )
            // InternalAlpha.g:3373:5: lv_expr_2_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getAutoRestrictExpressionAccess().getExprAlphaExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutoRestrictExpressionRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"alpha.model.Alpha.AlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutoRestrictExpression"


    // $ANTLR start "entryRuleCaseExpression"
    // InternalAlpha.g:3394:1: entryRuleCaseExpression returns [EObject current=null] : iv_ruleCaseExpression= ruleCaseExpression EOF ;
    public final EObject entryRuleCaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseExpression = null;


        try {
            // InternalAlpha.g:3394:55: (iv_ruleCaseExpression= ruleCaseExpression EOF )
            // InternalAlpha.g:3395:2: iv_ruleCaseExpression= ruleCaseExpression EOF
            {
             newCompositeNode(grammarAccess.getCaseExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCaseExpression=ruleCaseExpression();

            state._fsp--;

             current =iv_ruleCaseExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaseExpression"


    // $ANTLR start "ruleCaseExpression"
    // InternalAlpha.g:3401:1: ruleCaseExpression returns [EObject current=null] : (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' ) ;
    public final EObject ruleCaseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3407:2: ( (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' ) )
            // InternalAlpha.g:3408:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' )
            {
            // InternalAlpha.g:3408:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' )
            // InternalAlpha.g:3409:3: otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_57); 

            			newLeafNode(otherlv_0, grammarAccess.getCaseExpressionAccess().getCaseKeyword_0());
            		
            // InternalAlpha.g:3413:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalAlpha.g:3414:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalAlpha.g:3414:4: (lv_name_1_0= RULE_ID )
                    // InternalAlpha.g:3415:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getCaseExpressionAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCaseExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"alpha.model.Alpha.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getCaseExpressionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlpha.g:3435:3: ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_INT)||(LA58_0>=RULE_BOOLEAN && LA58_0<=RULE_FLOAT)||LA58_0==16||LA58_0==20||LA58_0==34||LA58_0==37||(LA58_0>=41 && LA58_0<=43)||(LA58_0>=46 && LA58_0<=47)||LA58_0==55||(LA58_0>=58 && LA58_0<=59)||(LA58_0>=61 && LA58_0<=65)||(LA58_0>=67 && LA58_0<=71)||LA58_0==73) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalAlpha.g:3436:4: ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';'
            	    {
            	    // InternalAlpha.g:3436:4: ( (lv_exprs_3_0= ruleAlphaExpression ) )
            	    // InternalAlpha.g:3437:5: (lv_exprs_3_0= ruleAlphaExpression )
            	    {
            	    // InternalAlpha.g:3437:5: (lv_exprs_3_0= ruleAlphaExpression )
            	    // InternalAlpha.g:3438:6: lv_exprs_3_0= ruleAlphaExpression
            	    {

            	    						newCompositeNode(grammarAccess.getCaseExpressionAccess().getExprsAlphaExpressionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_49);
            	    lv_exprs_3_0=ruleAlphaExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCaseExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exprs",
            	    							lv_exprs_3_0,
            	    							"alpha.model.Alpha.AlphaExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,33,FOLLOW_58); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCaseExpressionAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCaseExpressionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaseExpression"


    // $ANTLR start "entryRuleDependenceExpression"
    // InternalAlpha.g:3468:1: entryRuleDependenceExpression returns [EObject current=null] : iv_ruleDependenceExpression= ruleDependenceExpression EOF ;
    public final EObject entryRuleDependenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependenceExpression = null;


        try {
            // InternalAlpha.g:3468:61: (iv_ruleDependenceExpression= ruleDependenceExpression EOF )
            // InternalAlpha.g:3469:2: iv_ruleDependenceExpression= ruleDependenceExpression EOF
            {
             newCompositeNode(grammarAccess.getDependenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependenceExpression=ruleDependenceExpression();

            state._fsp--;

             current =iv_ruleDependenceExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependenceExpression"


    // $ANTLR start "ruleDependenceExpression"
    // InternalAlpha.g:3475:1: ruleDependenceExpression returns [EObject current=null] : ( ( ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) ) ) ) ;
    public final EObject ruleDependenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_functionExpr_0_0 = null;

        EObject lv_expr_2_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_functionExpr_4_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3481:2: ( ( ( ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) ) ) ) )
            // InternalAlpha.g:3482:2: ( ( ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) ) ) )
            {
            // InternalAlpha.g:3482:2: ( ( ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==16) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_ID) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalAlpha.g:3483:3: ( ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) )
                    {
                    // InternalAlpha.g:3483:3: ( ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) )
                    // InternalAlpha.g:3484:4: ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) )
                    {
                    // InternalAlpha.g:3484:4: ( (lv_functionExpr_0_0= ruleJNIFunction ) )
                    // InternalAlpha.g:3485:5: (lv_functionExpr_0_0= ruleJNIFunction )
                    {
                    // InternalAlpha.g:3485:5: (lv_functionExpr_0_0= ruleJNIFunction )
                    // InternalAlpha.g:3486:6: lv_functionExpr_0_0= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getDependenceExpressionAccess().getFunctionExprJNIFunctionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_functionExpr_0_0=ruleJNIFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDependenceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"functionExpr",
                    							lv_functionExpr_0_0,
                    							"alpha.model.Alpha.JNIFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,60,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getDependenceExpressionAccess().getCommercialAtKeyword_0_1());
                    			
                    // InternalAlpha.g:3507:4: ( (lv_expr_2_0= ruleAlphaTerminalExpression ) )
                    // InternalAlpha.g:3508:5: (lv_expr_2_0= ruleAlphaTerminalExpression )
                    {
                    // InternalAlpha.g:3508:5: (lv_expr_2_0= ruleAlphaTerminalExpression )
                    // InternalAlpha.g:3509:6: lv_expr_2_0= ruleAlphaTerminalExpression
                    {

                    						newCompositeNode(grammarAccess.getDependenceExpressionAccess().getExprAlphaTerminalExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_2_0=ruleAlphaTerminalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDependenceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_2_0,
                    							"alpha.model.Alpha.AlphaTerminalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3528:3: ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) ) )
                    {
                    // InternalAlpha.g:3528:3: ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) ) )
                    // InternalAlpha.g:3529:4: ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) )
                    {
                    // InternalAlpha.g:3529:4: ( (lv_expr_3_0= ruleVariableExpression ) )
                    // InternalAlpha.g:3530:5: (lv_expr_3_0= ruleVariableExpression )
                    {
                    // InternalAlpha.g:3530:5: (lv_expr_3_0= ruleVariableExpression )
                    // InternalAlpha.g:3531:6: lv_expr_3_0= ruleVariableExpression
                    {

                    						newCompositeNode(grammarAccess.getDependenceExpressionAccess().getExprVariableExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_expr_3_0=ruleVariableExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDependenceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_3_0,
                    							"alpha.model.Alpha.VariableExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlpha.g:3548:4: ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) )
                    // InternalAlpha.g:3549:5: (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation )
                    {
                    // InternalAlpha.g:3549:5: (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation )
                    // InternalAlpha.g:3550:6: lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getDependenceExpressionAccess().getFunctionExprJNIFunctionInArrayNotationParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_functionExpr_4_0=ruleJNIFunctionInArrayNotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDependenceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"functionExpr",
                    							lv_functionExpr_4_0,
                    							"alpha.model.Alpha.JNIFunctionInArrayNotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependenceExpression"


    // $ANTLR start "entryRuleFuzzyDependenceExpression"
    // InternalAlpha.g:3572:1: entryRuleFuzzyDependenceExpression returns [EObject current=null] : iv_ruleFuzzyDependenceExpression= ruleFuzzyDependenceExpression EOF ;
    public final EObject entryRuleFuzzyDependenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyDependenceExpression = null;


        try {
            // InternalAlpha.g:3572:66: (iv_ruleFuzzyDependenceExpression= ruleFuzzyDependenceExpression EOF )
            // InternalAlpha.g:3573:2: iv_ruleFuzzyDependenceExpression= ruleFuzzyDependenceExpression EOF
            {
             newCompositeNode(grammarAccess.getFuzzyDependenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuzzyDependenceExpression=ruleFuzzyDependenceExpression();

            state._fsp--;

             current =iv_ruleFuzzyDependenceExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuzzyDependenceExpression"


    // $ANTLR start "ruleFuzzyDependenceExpression"
    // InternalAlpha.g:3579:1: ruleFuzzyDependenceExpression returns [EObject current=null] : ( ( ( (lv_functionExpr_0_0= ruleJNIFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFuzzyFunctionInArrayNotation ) ) ) ) ;
    public final EObject ruleFuzzyDependenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_functionExpr_0_0 = null;

        EObject lv_expr_2_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_functionExpr_4_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3585:2: ( ( ( ( (lv_functionExpr_0_0= ruleJNIFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFuzzyFunctionInArrayNotation ) ) ) ) )
            // InternalAlpha.g:3586:2: ( ( ( (lv_functionExpr_0_0= ruleJNIFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFuzzyFunctionInArrayNotation ) ) ) )
            {
            // InternalAlpha.g:3586:2: ( ( ( (lv_functionExpr_0_0= ruleJNIFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFuzzyFunctionInArrayNotation ) ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==20) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_ID) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalAlpha.g:3587:3: ( ( (lv_functionExpr_0_0= ruleJNIFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) )
                    {
                    // InternalAlpha.g:3587:3: ( ( (lv_functionExpr_0_0= ruleJNIFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) )
                    // InternalAlpha.g:3588:4: ( (lv_functionExpr_0_0= ruleJNIFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) )
                    {
                    // InternalAlpha.g:3588:4: ( (lv_functionExpr_0_0= ruleJNIFuzzyFunction ) )
                    // InternalAlpha.g:3589:5: (lv_functionExpr_0_0= ruleJNIFuzzyFunction )
                    {
                    // InternalAlpha.g:3589:5: (lv_functionExpr_0_0= ruleJNIFuzzyFunction )
                    // InternalAlpha.g:3590:6: lv_functionExpr_0_0= ruleJNIFuzzyFunction
                    {

                    						newCompositeNode(grammarAccess.getFuzzyDependenceExpressionAccess().getFunctionExprJNIFuzzyFunctionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_functionExpr_0_0=ruleJNIFuzzyFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuzzyDependenceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"functionExpr",
                    							lv_functionExpr_0_0,
                    							"alpha.model.Alpha.JNIFuzzyFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,60,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getFuzzyDependenceExpressionAccess().getCommercialAtKeyword_0_1());
                    			
                    // InternalAlpha.g:3611:4: ( (lv_expr_2_0= ruleAlphaTerminalExpression ) )
                    // InternalAlpha.g:3612:5: (lv_expr_2_0= ruleAlphaTerminalExpression )
                    {
                    // InternalAlpha.g:3612:5: (lv_expr_2_0= ruleAlphaTerminalExpression )
                    // InternalAlpha.g:3613:6: lv_expr_2_0= ruleAlphaTerminalExpression
                    {

                    						newCompositeNode(grammarAccess.getFuzzyDependenceExpressionAccess().getExprAlphaTerminalExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_2_0=ruleAlphaTerminalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuzzyDependenceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_2_0,
                    							"alpha.model.Alpha.AlphaTerminalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3632:3: ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFuzzyFunctionInArrayNotation ) ) )
                    {
                    // InternalAlpha.g:3632:3: ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFuzzyFunctionInArrayNotation ) ) )
                    // InternalAlpha.g:3633:4: ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFuzzyFunctionInArrayNotation ) )
                    {
                    // InternalAlpha.g:3633:4: ( (lv_expr_3_0= ruleVariableExpression ) )
                    // InternalAlpha.g:3634:5: (lv_expr_3_0= ruleVariableExpression )
                    {
                    // InternalAlpha.g:3634:5: (lv_expr_3_0= ruleVariableExpression )
                    // InternalAlpha.g:3635:6: lv_expr_3_0= ruleVariableExpression
                    {

                    						newCompositeNode(grammarAccess.getFuzzyDependenceExpressionAccess().getExprVariableExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_expr_3_0=ruleVariableExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuzzyDependenceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_3_0,
                    							"alpha.model.Alpha.VariableExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlpha.g:3652:4: ( (lv_functionExpr_4_0= ruleJNIFuzzyFunctionInArrayNotation ) )
                    // InternalAlpha.g:3653:5: (lv_functionExpr_4_0= ruleJNIFuzzyFunctionInArrayNotation )
                    {
                    // InternalAlpha.g:3653:5: (lv_functionExpr_4_0= ruleJNIFuzzyFunctionInArrayNotation )
                    // InternalAlpha.g:3654:6: lv_functionExpr_4_0= ruleJNIFuzzyFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getFuzzyDependenceExpressionAccess().getFunctionExprJNIFuzzyFunctionInArrayNotationParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_functionExpr_4_0=ruleJNIFuzzyFunctionInArrayNotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuzzyDependenceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"functionExpr",
                    							lv_functionExpr_4_0,
                    							"alpha.model.Alpha.JNIFuzzyFunctionInArrayNotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuzzyDependenceExpression"


    // $ANTLR start "entryRuleIndexExpression"
    // InternalAlpha.g:3676:1: entryRuleIndexExpression returns [EObject current=null] : iv_ruleIndexExpression= ruleIndexExpression EOF ;
    public final EObject entryRuleIndexExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexExpression = null;


        try {
            // InternalAlpha.g:3676:56: (iv_ruleIndexExpression= ruleIndexExpression EOF )
            // InternalAlpha.g:3677:2: iv_ruleIndexExpression= ruleIndexExpression EOF
            {
             newCompositeNode(grammarAccess.getIndexExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexExpression=ruleIndexExpression();

            state._fsp--;

             current =iv_ruleIndexExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndexExpression"


    // $ANTLR start "ruleIndexExpression"
    // InternalAlpha.g:3683:1: ruleIndexExpression returns [EObject current=null] : ( (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) ) ) | ( (lv_functionExpr_2_0= ruleJNIFunctionInArrayNotation ) ) ) ;
    public final EObject ruleIndexExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_functionExpr_1_0 = null;

        EObject lv_functionExpr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3689:2: ( ( (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) ) ) | ( (lv_functionExpr_2_0= ruleJNIFunctionInArrayNotation ) ) ) )
            // InternalAlpha.g:3690:2: ( (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) ) ) | ( (lv_functionExpr_2_0= ruleJNIFunctionInArrayNotation ) ) )
            {
            // InternalAlpha.g:3690:2: ( (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) ) ) | ( (lv_functionExpr_2_0= ruleJNIFunctionInArrayNotation ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==61) ) {
                alt61=1;
            }
            else if ( (LA61_0==34) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalAlpha.g:3691:3: (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) ) )
                    {
                    // InternalAlpha.g:3691:3: (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) ) )
                    // InternalAlpha.g:3692:4: otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) )
                    {
                    otherlv_0=(Token)match(input,61,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getIndexExpressionAccess().getValKeyword_0_0());
                    			
                    // InternalAlpha.g:3696:4: ( (lv_functionExpr_1_0= ruleJNIFunction ) )
                    // InternalAlpha.g:3697:5: (lv_functionExpr_1_0= ruleJNIFunction )
                    {
                    // InternalAlpha.g:3697:5: (lv_functionExpr_1_0= ruleJNIFunction )
                    // InternalAlpha.g:3698:6: lv_functionExpr_1_0= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getIndexExpressionAccess().getFunctionExprJNIFunctionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_functionExpr_1_0=ruleJNIFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIndexExpressionRule());
                    						}
                    						set(
                    							current,
                    							"functionExpr",
                    							lv_functionExpr_1_0,
                    							"alpha.model.Alpha.JNIFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3717:3: ( (lv_functionExpr_2_0= ruleJNIFunctionInArrayNotation ) )
                    {
                    // InternalAlpha.g:3717:3: ( (lv_functionExpr_2_0= ruleJNIFunctionInArrayNotation ) )
                    // InternalAlpha.g:3718:4: (lv_functionExpr_2_0= ruleJNIFunctionInArrayNotation )
                    {
                    // InternalAlpha.g:3718:4: (lv_functionExpr_2_0= ruleJNIFunctionInArrayNotation )
                    // InternalAlpha.g:3719:5: lv_functionExpr_2_0= ruleJNIFunctionInArrayNotation
                    {

                    					newCompositeNode(grammarAccess.getIndexExpressionAccess().getFunctionExprJNIFunctionInArrayNotationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_functionExpr_2_0=ruleJNIFunctionInArrayNotation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIndexExpressionRule());
                    					}
                    					set(
                    						current,
                    						"functionExpr",
                    						lv_functionExpr_2_0,
                    						"alpha.model.Alpha.JNIFunctionInArrayNotation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndexExpression"


    // $ANTLR start "entryRuleFuzzyIndexExpression"
    // InternalAlpha.g:3740:1: entryRuleFuzzyIndexExpression returns [EObject current=null] : iv_ruleFuzzyIndexExpression= ruleFuzzyIndexExpression EOF ;
    public final EObject entryRuleFuzzyIndexExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyIndexExpression = null;


        try {
            // InternalAlpha.g:3740:61: (iv_ruleFuzzyIndexExpression= ruleFuzzyIndexExpression EOF )
            // InternalAlpha.g:3741:2: iv_ruleFuzzyIndexExpression= ruleFuzzyIndexExpression EOF
            {
             newCompositeNode(grammarAccess.getFuzzyIndexExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuzzyIndexExpression=ruleFuzzyIndexExpression();

            state._fsp--;

             current =iv_ruleFuzzyIndexExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuzzyIndexExpression"


    // $ANTLR start "ruleFuzzyIndexExpression"
    // InternalAlpha.g:3747:1: ruleFuzzyIndexExpression returns [EObject current=null] : ( (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFuzzyFunction ) ) ) | ( (lv_functionExpr_2_0= ruleJNIFuzzyFunctionInArrayNotation ) ) ) ;
    public final EObject ruleFuzzyIndexExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_functionExpr_1_0 = null;

        EObject lv_functionExpr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3753:2: ( ( (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFuzzyFunction ) ) ) | ( (lv_functionExpr_2_0= ruleJNIFuzzyFunctionInArrayNotation ) ) ) )
            // InternalAlpha.g:3754:2: ( (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFuzzyFunction ) ) ) | ( (lv_functionExpr_2_0= ruleJNIFuzzyFunctionInArrayNotation ) ) )
            {
            // InternalAlpha.g:3754:2: ( (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFuzzyFunction ) ) ) | ( (lv_functionExpr_2_0= ruleJNIFuzzyFunctionInArrayNotation ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==61) ) {
                alt62=1;
            }
            else if ( (LA62_0==37) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalAlpha.g:3755:3: (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFuzzyFunction ) ) )
                    {
                    // InternalAlpha.g:3755:3: (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFuzzyFunction ) ) )
                    // InternalAlpha.g:3756:4: otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFuzzyFunction ) )
                    {
                    otherlv_0=(Token)match(input,61,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getFuzzyIndexExpressionAccess().getValKeyword_0_0());
                    			
                    // InternalAlpha.g:3760:4: ( (lv_functionExpr_1_0= ruleJNIFuzzyFunction ) )
                    // InternalAlpha.g:3761:5: (lv_functionExpr_1_0= ruleJNIFuzzyFunction )
                    {
                    // InternalAlpha.g:3761:5: (lv_functionExpr_1_0= ruleJNIFuzzyFunction )
                    // InternalAlpha.g:3762:6: lv_functionExpr_1_0= ruleJNIFuzzyFunction
                    {

                    						newCompositeNode(grammarAccess.getFuzzyIndexExpressionAccess().getFunctionExprJNIFuzzyFunctionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_functionExpr_1_0=ruleJNIFuzzyFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuzzyIndexExpressionRule());
                    						}
                    						set(
                    							current,
                    							"functionExpr",
                    							lv_functionExpr_1_0,
                    							"alpha.model.Alpha.JNIFuzzyFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3781:3: ( (lv_functionExpr_2_0= ruleJNIFuzzyFunctionInArrayNotation ) )
                    {
                    // InternalAlpha.g:3781:3: ( (lv_functionExpr_2_0= ruleJNIFuzzyFunctionInArrayNotation ) )
                    // InternalAlpha.g:3782:4: (lv_functionExpr_2_0= ruleJNIFuzzyFunctionInArrayNotation )
                    {
                    // InternalAlpha.g:3782:4: (lv_functionExpr_2_0= ruleJNIFuzzyFunctionInArrayNotation )
                    // InternalAlpha.g:3783:5: lv_functionExpr_2_0= ruleJNIFuzzyFunctionInArrayNotation
                    {

                    					newCompositeNode(grammarAccess.getFuzzyIndexExpressionAccess().getFunctionExprJNIFuzzyFunctionInArrayNotationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_functionExpr_2_0=ruleJNIFuzzyFunctionInArrayNotation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFuzzyIndexExpressionRule());
                    					}
                    					set(
                    						current,
                    						"functionExpr",
                    						lv_functionExpr_2_0,
                    						"alpha.model.Alpha.JNIFuzzyFunctionInArrayNotation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuzzyIndexExpression"


    // $ANTLR start "entryRuleReduceExpression"
    // InternalAlpha.g:3804:1: entryRuleReduceExpression returns [EObject current=null] : iv_ruleReduceExpression= ruleReduceExpression EOF ;
    public final EObject entryRuleReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReduceExpression = null;


        try {
            // InternalAlpha.g:3804:57: (iv_ruleReduceExpression= ruleReduceExpression EOF )
            // InternalAlpha.g:3805:2: iv_ruleReduceExpression= ruleReduceExpression EOF
            {
             newCompositeNode(grammarAccess.getReduceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReduceExpression=ruleReduceExpression();

            state._fsp--;

             current =iv_ruleReduceExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReduceExpression"


    // $ANTLR start "ruleReduceExpression"
    // InternalAlpha.g:3811:1: ruleReduceExpression returns [EObject current=null] : (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleReduceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_projectionExpr_4_1 = null;

        EObject lv_projectionExpr_4_2 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3817:2: ( (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:3818:2: (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:3818:2: (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:3819:3: otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getReduceExpressionAccess().getReduceKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_61); 

            			newLeafNode(otherlv_1, grammarAccess.getReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:3827:3: ( (lv_operator_2_0= ruleAREDUCTION_OP ) )
            // InternalAlpha.g:3828:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            {
            // InternalAlpha.g:3828:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            // InternalAlpha.g:3829:5: lv_operator_2_0= ruleAREDUCTION_OP
            {

            					newCompositeNode(grammarAccess.getReduceExpressionAccess().getOperatorAREDUCTION_OPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_62);
            lv_operator_2_0=ruleAREDUCTION_OP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReduceExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"alpha.model.Alpha.AREDUCTION_OP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_63); 

            			newLeafNode(otherlv_3, grammarAccess.getReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:3850:3: ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) )
            // InternalAlpha.g:3851:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:3851:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:3852:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:3852:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==16) ) {
                alt63=1;
            }
            else if ( (LA63_0==34) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalAlpha.g:3853:6: lv_projectionExpr_4_1= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getReduceExpressionAccess().getProjectionExprJNIFunctionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_projectionExpr_4_1=ruleJNIFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReduceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"projectionExpr",
                    							lv_projectionExpr_4_1,
                    							"alpha.model.Alpha.JNIFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3869:6: lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getReduceExpressionAccess().getProjectionExprJNIFunctionInArrayNotationParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_62);
                    lv_projectionExpr_4_2=ruleJNIFunctionInArrayNotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReduceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"projectionExpr",
                    							lv_projectionExpr_4_2,
                    							"alpha.model.Alpha.JNIFunctionInArrayNotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:3891:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:3892:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:3892:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:3893:5: lv_body_6_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getReduceExpressionAccess().getBodyAlphaExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_body_6_0=ruleAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReduceExpressionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"alpha.model.Alpha.AlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getReduceExpressionAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReduceExpression"


    // $ANTLR start "entryRuleExternalReduceExpression"
    // InternalAlpha.g:3918:1: entryRuleExternalReduceExpression returns [EObject current=null] : iv_ruleExternalReduceExpression= ruleExternalReduceExpression EOF ;
    public final EObject entryRuleExternalReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalReduceExpression = null;


        try {
            // InternalAlpha.g:3918:65: (iv_ruleExternalReduceExpression= ruleExternalReduceExpression EOF )
            // InternalAlpha.g:3919:2: iv_ruleExternalReduceExpression= ruleExternalReduceExpression EOF
            {
             newCompositeNode(grammarAccess.getExternalReduceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalReduceExpression=ruleExternalReduceExpression();

            state._fsp--;

             current =iv_ruleExternalReduceExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalReduceExpression"


    // $ANTLR start "ruleExternalReduceExpression"
    // InternalAlpha.g:3925:1: ruleExternalReduceExpression returns [EObject current=null] : (otherlv_0= 'reduce' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleExternalReduceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_projectionExpr_4_1 = null;

        EObject lv_projectionExpr_4_2 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3931:2: ( (otherlv_0= 'reduce' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:3932:2: (otherlv_0= 'reduce' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:3932:2: (otherlv_0= 'reduce' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:3933:3: otherlv_0= 'reduce' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalReduceExpressionAccess().getReduceKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:3941:3: ( (otherlv_2= RULE_ID ) )
            // InternalAlpha.g:3942:4: (otherlv_2= RULE_ID )
            {
            // InternalAlpha.g:3942:4: (otherlv_2= RULE_ID )
            // InternalAlpha.g:3943:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalReduceExpressionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_62); 

            					newLeafNode(otherlv_2, grammarAccess.getExternalReduceExpressionAccess().getExternalFunctionExternalFunctionCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_63); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:3958:3: ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) )
            // InternalAlpha.g:3959:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:3959:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:3960:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:3960:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==16) ) {
                alt64=1;
            }
            else if ( (LA64_0==34) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalAlpha.g:3961:6: lv_projectionExpr_4_1= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getExternalReduceExpressionAccess().getProjectionExprJNIFunctionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_projectionExpr_4_1=ruleJNIFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalReduceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"projectionExpr",
                    							lv_projectionExpr_4_1,
                    							"alpha.model.Alpha.JNIFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3977:6: lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getExternalReduceExpressionAccess().getProjectionExprJNIFunctionInArrayNotationParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_62);
                    lv_projectionExpr_4_2=ruleJNIFunctionInArrayNotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalReduceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"projectionExpr",
                    							lv_projectionExpr_4_2,
                    							"alpha.model.Alpha.JNIFunctionInArrayNotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:3999:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:4000:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:4000:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:4001:5: lv_body_6_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getExternalReduceExpressionAccess().getBodyAlphaExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_body_6_0=ruleAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalReduceExpressionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"alpha.model.Alpha.AlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExternalReduceExpressionAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalReduceExpression"


    // $ANTLR start "entryRuleArgReduceExpression"
    // InternalAlpha.g:4026:1: entryRuleArgReduceExpression returns [EObject current=null] : iv_ruleArgReduceExpression= ruleArgReduceExpression EOF ;
    public final EObject entryRuleArgReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgReduceExpression = null;


        try {
            // InternalAlpha.g:4026:60: (iv_ruleArgReduceExpression= ruleArgReduceExpression EOF )
            // InternalAlpha.g:4027:2: iv_ruleArgReduceExpression= ruleArgReduceExpression EOF
            {
             newCompositeNode(grammarAccess.getArgReduceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgReduceExpression=ruleArgReduceExpression();

            state._fsp--;

             current =iv_ruleArgReduceExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgReduceExpression"


    // $ANTLR start "ruleArgReduceExpression"
    // InternalAlpha.g:4033:1: ruleArgReduceExpression returns [EObject current=null] : (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleArgReduceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_projectionExpr_4_1 = null;

        EObject lv_projectionExpr_4_2 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4039:2: ( (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:4040:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:4040:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:4041:3: otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getArgReduceExpressionAccess().getArgreduceKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_61); 

            			newLeafNode(otherlv_1, grammarAccess.getArgReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:4049:3: ( (lv_operator_2_0= ruleAREDUCTION_OP ) )
            // InternalAlpha.g:4050:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            {
            // InternalAlpha.g:4050:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            // InternalAlpha.g:4051:5: lv_operator_2_0= ruleAREDUCTION_OP
            {

            					newCompositeNode(grammarAccess.getArgReduceExpressionAccess().getOperatorAREDUCTION_OPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_62);
            lv_operator_2_0=ruleAREDUCTION_OP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArgReduceExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"alpha.model.Alpha.AREDUCTION_OP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_63); 

            			newLeafNode(otherlv_3, grammarAccess.getArgReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:4072:3: ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) )
            // InternalAlpha.g:4073:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:4073:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:4074:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:4074:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==16) ) {
                alt65=1;
            }
            else if ( (LA65_0==34) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalAlpha.g:4075:6: lv_projectionExpr_4_1= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getArgReduceExpressionAccess().getProjectionExprJNIFunctionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_projectionExpr_4_1=ruleJNIFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArgReduceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"projectionExpr",
                    							lv_projectionExpr_4_1,
                    							"alpha.model.Alpha.JNIFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4091:6: lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getArgReduceExpressionAccess().getProjectionExprJNIFunctionInArrayNotationParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_62);
                    lv_projectionExpr_4_2=ruleJNIFunctionInArrayNotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArgReduceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"projectionExpr",
                    							lv_projectionExpr_4_2,
                    							"alpha.model.Alpha.JNIFunctionInArrayNotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getArgReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:4113:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:4114:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:4114:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:4115:5: lv_body_6_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getArgReduceExpressionAccess().getBodyAlphaExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_body_6_0=ruleAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArgReduceExpressionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"alpha.model.Alpha.AlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getArgReduceExpressionAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgReduceExpression"


    // $ANTLR start "entryRuleExternalArgReduceExpression"
    // InternalAlpha.g:4140:1: entryRuleExternalArgReduceExpression returns [EObject current=null] : iv_ruleExternalArgReduceExpression= ruleExternalArgReduceExpression EOF ;
    public final EObject entryRuleExternalArgReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalArgReduceExpression = null;


        try {
            // InternalAlpha.g:4140:68: (iv_ruleExternalArgReduceExpression= ruleExternalArgReduceExpression EOF )
            // InternalAlpha.g:4141:2: iv_ruleExternalArgReduceExpression= ruleExternalArgReduceExpression EOF
            {
             newCompositeNode(grammarAccess.getExternalArgReduceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalArgReduceExpression=ruleExternalArgReduceExpression();

            state._fsp--;

             current =iv_ruleExternalArgReduceExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalArgReduceExpression"


    // $ANTLR start "ruleExternalArgReduceExpression"
    // InternalAlpha.g:4147:1: ruleExternalArgReduceExpression returns [EObject current=null] : (otherlv_0= 'argreduce' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleExternalArgReduceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_projectionExpr_4_1 = null;

        EObject lv_projectionExpr_4_2 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4153:2: ( (otherlv_0= 'argreduce' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:4154:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:4154:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:4155:3: otherlv_0= 'argreduce' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalArgReduceExpressionAccess().getArgreduceKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalArgReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:4163:3: ( (otherlv_2= RULE_ID ) )
            // InternalAlpha.g:4164:4: (otherlv_2= RULE_ID )
            {
            // InternalAlpha.g:4164:4: (otherlv_2= RULE_ID )
            // InternalAlpha.g:4165:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalArgReduceExpressionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_62); 

            					newLeafNode(otherlv_2, grammarAccess.getExternalArgReduceExpressionAccess().getExternalFunctionExternalFunctionCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_63); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalArgReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:4180:3: ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) )
            // InternalAlpha.g:4181:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:4181:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:4182:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:4182:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==16) ) {
                alt66=1;
            }
            else if ( (LA66_0==34) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalAlpha.g:4183:6: lv_projectionExpr_4_1= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getExternalArgReduceExpressionAccess().getProjectionExprJNIFunctionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_projectionExpr_4_1=ruleJNIFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalArgReduceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"projectionExpr",
                    							lv_projectionExpr_4_1,
                    							"alpha.model.Alpha.JNIFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4199:6: lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getExternalArgReduceExpressionAccess().getProjectionExprJNIFunctionInArrayNotationParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_62);
                    lv_projectionExpr_4_2=ruleJNIFunctionInArrayNotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalArgReduceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"projectionExpr",
                    							lv_projectionExpr_4_2,
                    							"alpha.model.Alpha.JNIFunctionInArrayNotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalArgReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:4221:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:4222:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:4222:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:4223:5: lv_body_6_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getExternalArgReduceExpressionAccess().getBodyAlphaExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_body_6_0=ruleAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalArgReduceExpressionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"alpha.model.Alpha.AlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExternalArgReduceExpressionAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalArgReduceExpression"


    // $ANTLR start "entryRuleConvolutionExpression"
    // InternalAlpha.g:4248:1: entryRuleConvolutionExpression returns [EObject current=null] : iv_ruleConvolutionExpression= ruleConvolutionExpression EOF ;
    public final EObject entryRuleConvolutionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConvolutionExpression = null;


        try {
            // InternalAlpha.g:4248:62: (iv_ruleConvolutionExpression= ruleConvolutionExpression EOF )
            // InternalAlpha.g:4249:2: iv_ruleConvolutionExpression= ruleConvolutionExpression EOF
            {
             newCompositeNode(grammarAccess.getConvolutionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConvolutionExpression=ruleConvolutionExpression();

            state._fsp--;

             current =iv_ruleConvolutionExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConvolutionExpression"


    // $ANTLR start "ruleConvolutionExpression"
    // InternalAlpha.g:4255:1: ruleConvolutionExpression returns [EObject current=null] : (otherlv_0= 'conv' otherlv_1= '(' ( (lv_kernelDomainExpr_2_0= ruleCalculatorExpression ) ) otherlv_3= ',' ( (lv_kernelExpression_4_0= ruleAlphaExpression ) ) otherlv_5= ',' ( (lv_dataExpression_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleConvolutionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_kernelDomainExpr_2_0 = null;

        EObject lv_kernelExpression_4_0 = null;

        EObject lv_dataExpression_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4261:2: ( (otherlv_0= 'conv' otherlv_1= '(' ( (lv_kernelDomainExpr_2_0= ruleCalculatorExpression ) ) otherlv_3= ',' ( (lv_kernelExpression_4_0= ruleAlphaExpression ) ) otherlv_5= ',' ( (lv_dataExpression_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:4262:2: (otherlv_0= 'conv' otherlv_1= '(' ( (lv_kernelDomainExpr_2_0= ruleCalculatorExpression ) ) otherlv_3= ',' ( (lv_kernelExpression_4_0= ruleAlphaExpression ) ) otherlv_5= ',' ( (lv_dataExpression_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:4262:2: (otherlv_0= 'conv' otherlv_1= '(' ( (lv_kernelDomainExpr_2_0= ruleCalculatorExpression ) ) otherlv_3= ',' ( (lv_kernelExpression_4_0= ruleAlphaExpression ) ) otherlv_5= ',' ( (lv_dataExpression_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:4263:3: otherlv_0= 'conv' otherlv_1= '(' ( (lv_kernelDomainExpr_2_0= ruleCalculatorExpression ) ) otherlv_3= ',' ( (lv_kernelExpression_4_0= ruleAlphaExpression ) ) otherlv_5= ',' ( (lv_dataExpression_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getConvolutionExpressionAccess().getConvKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getConvolutionExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:4271:3: ( (lv_kernelDomainExpr_2_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:4272:4: (lv_kernelDomainExpr_2_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:4272:4: (lv_kernelDomainExpr_2_0= ruleCalculatorExpression )
            // InternalAlpha.g:4273:5: lv_kernelDomainExpr_2_0= ruleCalculatorExpression
            {

            					newCompositeNode(grammarAccess.getConvolutionExpressionAccess().getKernelDomainExprCalculatorExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_62);
            lv_kernelDomainExpr_2_0=ruleCalculatorExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConvolutionExpressionRule());
            					}
            					set(
            						current,
            						"kernelDomainExpr",
            						lv_kernelDomainExpr_2_0,
            						"alpha.model.Alpha.CalculatorExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getConvolutionExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:4294:3: ( (lv_kernelExpression_4_0= ruleAlphaExpression ) )
            // InternalAlpha.g:4295:4: (lv_kernelExpression_4_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:4295:4: (lv_kernelExpression_4_0= ruleAlphaExpression )
            // InternalAlpha.g:4296:5: lv_kernelExpression_4_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getConvolutionExpressionAccess().getKernelExpressionAlphaExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_62);
            lv_kernelExpression_4_0=ruleAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConvolutionExpressionRule());
            					}
            					set(
            						current,
            						"kernelExpression",
            						lv_kernelExpression_4_0,
            						"alpha.model.Alpha.AlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getConvolutionExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:4317:3: ( (lv_dataExpression_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:4318:4: (lv_dataExpression_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:4318:4: (lv_dataExpression_6_0= ruleAlphaExpression )
            // InternalAlpha.g:4319:5: lv_dataExpression_6_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getConvolutionExpressionAccess().getDataExpressionAlphaExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_dataExpression_6_0=ruleAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConvolutionExpressionRule());
            					}
            					set(
            						current,
            						"dataExpression",
            						lv_dataExpression_6_0,
            						"alpha.model.Alpha.AlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConvolutionExpressionAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConvolutionExpression"


    // $ANTLR start "entryRuleSelectExpression"
    // InternalAlpha.g:4344:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // InternalAlpha.g:4344:57: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // InternalAlpha.g:4345:2: iv_ruleSelectExpression= ruleSelectExpression EOF
            {
             newCompositeNode(grammarAccess.getSelectExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectExpression=ruleSelectExpression();

            state._fsp--;

             current =iv_ruleSelectExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectExpression"


    // $ANTLR start "ruleSelectExpression"
    // InternalAlpha.g:4351:1: ruleSelectExpression returns [EObject current=null] : (otherlv_0= 'select' ( (lv_relationExpr_1_0= ruleCalculatorExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAlphaTerminalExpression ) ) ) ;
    public final EObject ruleSelectExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_relationExpr_1_0 = null;

        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4357:2: ( (otherlv_0= 'select' ( (lv_relationExpr_1_0= ruleCalculatorExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAlphaTerminalExpression ) ) ) )
            // InternalAlpha.g:4358:2: (otherlv_0= 'select' ( (lv_relationExpr_1_0= ruleCalculatorExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAlphaTerminalExpression ) ) )
            {
            // InternalAlpha.g:4358:2: (otherlv_0= 'select' ( (lv_relationExpr_1_0= ruleCalculatorExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAlphaTerminalExpression ) ) )
            // InternalAlpha.g:4359:3: otherlv_0= 'select' ( (lv_relationExpr_1_0= ruleCalculatorExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAlphaTerminalExpression ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectExpressionAccess().getSelectKeyword_0());
            		
            // InternalAlpha.g:4363:3: ( (lv_relationExpr_1_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:4364:4: (lv_relationExpr_1_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:4364:4: (lv_relationExpr_1_0= ruleCalculatorExpression )
            // InternalAlpha.g:4365:5: lv_relationExpr_1_0= ruleCalculatorExpression
            {

            					newCompositeNode(grammarAccess.getSelectExpressionAccess().getRelationExprCalculatorExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_64);
            lv_relationExpr_1_0=ruleCalculatorExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
            					}
            					set(
            						current,
            						"relationExpr",
            						lv_relationExpr_1_0,
            						"alpha.model.Alpha.CalculatorExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,66,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectExpressionAccess().getFromKeyword_2());
            		
            // InternalAlpha.g:4386:3: ( (lv_expr_3_0= ruleAlphaTerminalExpression ) )
            // InternalAlpha.g:4387:4: (lv_expr_3_0= ruleAlphaTerminalExpression )
            {
            // InternalAlpha.g:4387:4: (lv_expr_3_0= ruleAlphaTerminalExpression )
            // InternalAlpha.g:4388:5: lv_expr_3_0= ruleAlphaTerminalExpression
            {

            					newCompositeNode(grammarAccess.getSelectExpressionAccess().getExprAlphaTerminalExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_3_0=ruleAlphaTerminalExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_3_0,
            						"alpha.model.Alpha.AlphaTerminalExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalAlpha.g:4409:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalAlpha.g:4409:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalAlpha.g:4410:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalAlpha.g:4416:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4422:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalAlpha.g:4423:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalAlpha.g:4423:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalAlpha.g:4424:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_65);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:4432:3: ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==47||LA67_0==71) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalAlpha.g:4433:4: () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalAlpha.g:4433:4: ()
            	    // InternalAlpha.g:4434:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:4440:4: ( (lv_operator_2_0= ruleAOrOP ) )
            	    // InternalAlpha.g:4441:5: (lv_operator_2_0= ruleAOrOP )
            	    {
            	    // InternalAlpha.g:4441:5: (lv_operator_2_0= ruleAOrOP )
            	    // InternalAlpha.g:4442:6: lv_operator_2_0= ruleAOrOP
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorAOrOPParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_operator_2_0=ruleAOrOP();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"alpha.model.Alpha.AOrOP");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAlpha.g:4459:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalAlpha.g:4460:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalAlpha.g:4460:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalAlpha.g:4461:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_65);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"alpha.model.Alpha.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalAlpha.g:4483:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalAlpha.g:4483:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalAlpha.g:4484:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalAlpha.g:4490:1: ruleAndExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4496:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // InternalAlpha.g:4497:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // InternalAlpha.g:4497:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // InternalAlpha.g:4498:3: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_66);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;


            			current = this_RelationalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:4506:3: ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==46) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalAlpha.g:4507:4: () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // InternalAlpha.g:4507:4: ()
            	    // InternalAlpha.g:4508:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:4514:4: ( (lv_operator_2_0= ruleAAndOP ) )
            	    // InternalAlpha.g:4515:5: (lv_operator_2_0= ruleAAndOP )
            	    {
            	    // InternalAlpha.g:4515:5: (lv_operator_2_0= ruleAAndOP )
            	    // InternalAlpha.g:4516:6: lv_operator_2_0= ruleAAndOP
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAAndOPParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_operator_2_0=ruleAAndOP();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"alpha.model.Alpha.AAndOP");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAlpha.g:4533:4: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // InternalAlpha.g:4534:5: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // InternalAlpha.g:4534:5: (lv_right_3_0= ruleRelationalExpression )
            	    // InternalAlpha.g:4535:6: lv_right_3_0= ruleRelationalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightRelationalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_66);
            	    lv_right_3_0=ruleRelationalExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"alpha.model.Alpha.RelationalExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalAlpha.g:4557:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalAlpha.g:4557:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalAlpha.g:4558:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalAlpha.g:4564:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4570:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalAlpha.g:4571:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalAlpha.g:4571:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            // InternalAlpha.g:4572:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_67);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:4580:3: ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==14||(LA69_0>=50 && LA69_0<=53)||LA69_0==72) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalAlpha.g:4581:4: () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalAlpha.g:4581:4: ()
            	    // InternalAlpha.g:4582:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRelationalExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:4588:4: ( (lv_operator_2_0= ruleARelationalOP ) )
            	    // InternalAlpha.g:4589:5: (lv_operator_2_0= ruleARelationalOP )
            	    {
            	    // InternalAlpha.g:4589:5: (lv_operator_2_0= ruleARelationalOP )
            	    // InternalAlpha.g:4590:6: lv_operator_2_0= ruleARelationalOP
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorARelationalOPParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_operator_2_0=ruleARelationalOP();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"alpha.model.Alpha.ARelationalOP");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAlpha.g:4607:4: ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    // InternalAlpha.g:4608:5: (lv_right_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalAlpha.g:4608:5: (lv_right_3_0= ruleAdditiveExpression )
            	    // InternalAlpha.g:4609:6: lv_right_3_0= ruleAdditiveExpression
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_67);
            	    lv_right_3_0=ruleAdditiveExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"alpha.model.Alpha.AdditiveExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalAlpha.g:4631:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalAlpha.g:4631:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalAlpha.g:4632:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalAlpha.g:4638:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4644:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalAlpha.g:4645:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalAlpha.g:4645:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalAlpha.g:4646:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_68);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:4654:3: ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( ((LA70_0>=41 && LA70_0<=42)) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalAlpha.g:4655:4: () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalAlpha.g:4655:4: ()
            	    // InternalAlpha.g:4656:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:4662:4: ( (lv_operator_2_0= ruleAAdditiveOP ) )
            	    // InternalAlpha.g:4663:5: (lv_operator_2_0= ruleAAdditiveOP )
            	    {
            	    // InternalAlpha.g:4663:5: (lv_operator_2_0= ruleAAdditiveOP )
            	    // InternalAlpha.g:4664:6: lv_operator_2_0= ruleAAdditiveOP
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAAdditiveOPParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_operator_2_0=ruleAAdditiveOP();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"alpha.model.Alpha.AAdditiveOP");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAlpha.g:4681:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalAlpha.g:4682:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalAlpha.g:4682:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalAlpha.g:4683:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_68);
            	    lv_right_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"alpha.model.Alpha.MultiplicativeExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalAlpha.g:4705:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalAlpha.g:4705:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalAlpha.g:4706:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalAlpha.g:4712:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_MinMaxExpression_0= ruleMinMaxExpression ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MinMaxExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4718:2: ( (this_MinMaxExpression_0= ruleMinMaxExpression ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )* ) )
            // InternalAlpha.g:4719:2: (this_MinMaxExpression_0= ruleMinMaxExpression ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )* )
            {
            // InternalAlpha.g:4719:2: (this_MinMaxExpression_0= ruleMinMaxExpression ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )* )
            // InternalAlpha.g:4720:3: this_MinMaxExpression_0= ruleMinMaxExpression ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getMinMaxExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_69);
            this_MinMaxExpression_0=ruleMinMaxExpression();

            state._fsp--;


            			current = this_MinMaxExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:4728:3: ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=43 && LA71_0<=44)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalAlpha.g:4729:4: () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) )
            	    {
            	    // InternalAlpha.g:4729:4: ()
            	    // InternalAlpha.g:4730:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:4736:4: ( (lv_operator_2_0= ruleAMultiplicativeOP ) )
            	    // InternalAlpha.g:4737:5: (lv_operator_2_0= ruleAMultiplicativeOP )
            	    {
            	    // InternalAlpha.g:4737:5: (lv_operator_2_0= ruleAMultiplicativeOP )
            	    // InternalAlpha.g:4738:6: lv_operator_2_0= ruleAMultiplicativeOP
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAMultiplicativeOPParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_operator_2_0=ruleAMultiplicativeOP();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"alpha.model.Alpha.AMultiplicativeOP");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAlpha.g:4755:4: ( (lv_right_3_0= ruleMinMaxExpression ) )
            	    // InternalAlpha.g:4756:5: (lv_right_3_0= ruleMinMaxExpression )
            	    {
            	    // InternalAlpha.g:4756:5: (lv_right_3_0= ruleMinMaxExpression )
            	    // InternalAlpha.g:4757:6: lv_right_3_0= ruleMinMaxExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightMinMaxExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_69);
            	    lv_right_3_0=ruleMinMaxExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"alpha.model.Alpha.MinMaxExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleMinMaxExpression"
    // InternalAlpha.g:4779:1: entryRuleMinMaxExpression returns [EObject current=null] : iv_ruleMinMaxExpression= ruleMinMaxExpression EOF ;
    public final EObject entryRuleMinMaxExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinMaxExpression = null;


        try {
            // InternalAlpha.g:4779:57: (iv_ruleMinMaxExpression= ruleMinMaxExpression EOF )
            // InternalAlpha.g:4780:2: iv_ruleMinMaxExpression= ruleMinMaxExpression EOF
            {
             newCompositeNode(grammarAccess.getMinMaxExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinMaxExpression=ruleMinMaxExpression();

            state._fsp--;

             current =iv_ruleMinMaxExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinMaxExpression"


    // $ANTLR start "ruleMinMaxExpression"
    // InternalAlpha.g:4786:1: ruleMinMaxExpression returns [EObject current=null] : (this_UnaryOrTerminalExpression_0= ruleUnaryOrTerminalExpression ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )* ) ;
    public final EObject ruleMinMaxExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOrTerminalExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4792:2: ( (this_UnaryOrTerminalExpression_0= ruleUnaryOrTerminalExpression ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )* ) )
            // InternalAlpha.g:4793:2: (this_UnaryOrTerminalExpression_0= ruleUnaryOrTerminalExpression ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )* )
            {
            // InternalAlpha.g:4793:2: (this_UnaryOrTerminalExpression_0= ruleUnaryOrTerminalExpression ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )* )
            // InternalAlpha.g:4794:3: this_UnaryOrTerminalExpression_0= ruleUnaryOrTerminalExpression ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMinMaxExpressionAccess().getUnaryOrTerminalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_70);
            this_UnaryOrTerminalExpression_0=ruleUnaryOrTerminalExpression();

            state._fsp--;


            			current = this_UnaryOrTerminalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:4802:3: ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=67 && LA72_0<=68)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalAlpha.g:4803:4: () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) )
            	    {
            	    // InternalAlpha.g:4803:4: ()
            	    // InternalAlpha.g:4804:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMinMaxExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:4810:4: ( (lv_operator_2_0= ruleAMINMAX_OP ) )
            	    // InternalAlpha.g:4811:5: (lv_operator_2_0= ruleAMINMAX_OP )
            	    {
            	    // InternalAlpha.g:4811:5: (lv_operator_2_0= ruleAMINMAX_OP )
            	    // InternalAlpha.g:4812:6: lv_operator_2_0= ruleAMINMAX_OP
            	    {

            	    						newCompositeNode(grammarAccess.getMinMaxExpressionAccess().getOperatorAMINMAX_OPParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_operator_2_0=ruleAMINMAX_OP();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMinMaxExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"alpha.model.Alpha.AMINMAX_OP");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAlpha.g:4829:4: ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) )
            	    // InternalAlpha.g:4830:5: (lv_right_3_0= ruleUnaryOrTerminalExpression )
            	    {
            	    // InternalAlpha.g:4830:5: (lv_right_3_0= ruleUnaryOrTerminalExpression )
            	    // InternalAlpha.g:4831:6: lv_right_3_0= ruleUnaryOrTerminalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMinMaxExpressionAccess().getRightUnaryOrTerminalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_70);
            	    lv_right_3_0=ruleUnaryOrTerminalExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMinMaxExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"alpha.model.Alpha.UnaryOrTerminalExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinMaxExpression"


    // $ANTLR start "entryRuleMultiArgExpression"
    // InternalAlpha.g:4853:1: entryRuleMultiArgExpression returns [EObject current=null] : iv_ruleMultiArgExpression= ruleMultiArgExpression EOF ;
    public final EObject entryRuleMultiArgExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiArgExpression = null;


        try {
            // InternalAlpha.g:4853:59: (iv_ruleMultiArgExpression= ruleMultiArgExpression EOF )
            // InternalAlpha.g:4854:2: iv_ruleMultiArgExpression= ruleMultiArgExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiArgExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiArgExpression=ruleMultiArgExpression();

            state._fsp--;

             current =iv_ruleMultiArgExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiArgExpression"


    // $ANTLR start "ruleMultiArgExpression"
    // InternalAlpha.g:4860:1: ruleMultiArgExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAREDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleMultiArgExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_operator_0_0 = null;

        EObject lv_exprs_2_0 = null;

        EObject lv_exprs_4_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4866:2: ( ( ( (lv_operator_0_0= ruleAREDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' ) )
            // InternalAlpha.g:4867:2: ( ( (lv_operator_0_0= ruleAREDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' )
            {
            // InternalAlpha.g:4867:2: ( ( (lv_operator_0_0= ruleAREDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' )
            // InternalAlpha.g:4868:3: ( (lv_operator_0_0= ruleAREDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')'
            {
            // InternalAlpha.g:4868:3: ( (lv_operator_0_0= ruleAREDUCTION_OP ) )
            // InternalAlpha.g:4869:4: (lv_operator_0_0= ruleAREDUCTION_OP )
            {
            // InternalAlpha.g:4869:4: (lv_operator_0_0= ruleAREDUCTION_OP )
            // InternalAlpha.g:4870:5: lv_operator_0_0= ruleAREDUCTION_OP
            {

            					newCompositeNode(grammarAccess.getMultiArgExpressionAccess().getOperatorAREDUCTION_OPParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_operator_0_0=ruleAREDUCTION_OP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiArgExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_0_0,
            						"alpha.model.Alpha.AREDUCTION_OP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiArgExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:4891:3: ( (lv_exprs_2_0= ruleAlphaExpression ) )
            // InternalAlpha.g:4892:4: (lv_exprs_2_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:4892:4: (lv_exprs_2_0= ruleAlphaExpression )
            // InternalAlpha.g:4893:5: lv_exprs_2_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getMultiArgExpressionAccess().getExprsAlphaExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_53);
            lv_exprs_2_0=ruleAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiArgExpressionRule());
            					}
            					add(
            						current,
            						"exprs",
            						lv_exprs_2_0,
            						"alpha.model.Alpha.AlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:4910:3: (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==35) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalAlpha.g:4911:4: otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_20); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMultiArgExpressionAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalAlpha.g:4915:4: ( (lv_exprs_4_0= ruleAlphaExpression ) )
            	    // InternalAlpha.g:4916:5: (lv_exprs_4_0= ruleAlphaExpression )
            	    {
            	    // InternalAlpha.g:4916:5: (lv_exprs_4_0= ruleAlphaExpression )
            	    // InternalAlpha.g:4917:6: lv_exprs_4_0= ruleAlphaExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiArgExpressionAccess().getExprsAlphaExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_53);
            	    lv_exprs_4_0=ruleAlphaExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiArgExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exprs",
            	    							lv_exprs_4_0,
            	    							"alpha.model.Alpha.AlphaExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiArgExpressionAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiArgExpression"


    // $ANTLR start "entryRuleExternalMultiArgExpression"
    // InternalAlpha.g:4943:1: entryRuleExternalMultiArgExpression returns [EObject current=null] : iv_ruleExternalMultiArgExpression= ruleExternalMultiArgExpression EOF ;
    public final EObject entryRuleExternalMultiArgExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalMultiArgExpression = null;


        try {
            // InternalAlpha.g:4943:67: (iv_ruleExternalMultiArgExpression= ruleExternalMultiArgExpression EOF )
            // InternalAlpha.g:4944:2: iv_ruleExternalMultiArgExpression= ruleExternalMultiArgExpression EOF
            {
             newCompositeNode(grammarAccess.getExternalMultiArgExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalMultiArgExpression=ruleExternalMultiArgExpression();

            state._fsp--;

             current =iv_ruleExternalMultiArgExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalMultiArgExpression"


    // $ANTLR start "ruleExternalMultiArgExpression"
    // InternalAlpha.g:4950:1: ruleExternalMultiArgExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleExternalMultiArgExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exprs_2_0 = null;

        EObject lv_exprs_4_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4956:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' ) )
            // InternalAlpha.g:4957:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' )
            {
            // InternalAlpha.g:4957:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' )
            // InternalAlpha.g:4958:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')'
            {
            // InternalAlpha.g:4958:3: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:4959:4: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:4959:4: (otherlv_0= RULE_ID )
            // InternalAlpha.g:4960:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalMultiArgExpressionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getExternalMultiArgExpressionAccess().getExternalFunctionExternalFunctionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalMultiArgExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:4975:3: ( (lv_exprs_2_0= ruleAlphaExpression ) )
            // InternalAlpha.g:4976:4: (lv_exprs_2_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:4976:4: (lv_exprs_2_0= ruleAlphaExpression )
            // InternalAlpha.g:4977:5: lv_exprs_2_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getExternalMultiArgExpressionAccess().getExprsAlphaExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_53);
            lv_exprs_2_0=ruleAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalMultiArgExpressionRule());
            					}
            					add(
            						current,
            						"exprs",
            						lv_exprs_2_0,
            						"alpha.model.Alpha.AlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:4994:3: (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==35) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalAlpha.g:4995:4: otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_20); 

            	    				newLeafNode(otherlv_3, grammarAccess.getExternalMultiArgExpressionAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalAlpha.g:4999:4: ( (lv_exprs_4_0= ruleAlphaExpression ) )
            	    // InternalAlpha.g:5000:5: (lv_exprs_4_0= ruleAlphaExpression )
            	    {
            	    // InternalAlpha.g:5000:5: (lv_exprs_4_0= ruleAlphaExpression )
            	    // InternalAlpha.g:5001:6: lv_exprs_4_0= ruleAlphaExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExternalMultiArgExpressionAccess().getExprsAlphaExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_53);
            	    lv_exprs_4_0=ruleAlphaExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExternalMultiArgExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exprs",
            	    							lv_exprs_4_0,
            	    							"alpha.model.Alpha.AlphaExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalMultiArgExpressionAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalMultiArgExpression"


    // $ANTLR start "entryRuleUnaryOrTerminalExpression"
    // InternalAlpha.g:5027:1: entryRuleUnaryOrTerminalExpression returns [EObject current=null] : iv_ruleUnaryOrTerminalExpression= ruleUnaryOrTerminalExpression EOF ;
    public final EObject entryRuleUnaryOrTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOrTerminalExpression = null;


        try {
            // InternalAlpha.g:5027:66: (iv_ruleUnaryOrTerminalExpression= ruleUnaryOrTerminalExpression EOF )
            // InternalAlpha.g:5028:2: iv_ruleUnaryOrTerminalExpression= ruleUnaryOrTerminalExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryOrTerminalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOrTerminalExpression=ruleUnaryOrTerminalExpression();

            state._fsp--;

             current =iv_ruleUnaryOrTerminalExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOrTerminalExpression"


    // $ANTLR start "ruleUnaryOrTerminalExpression"
    // InternalAlpha.g:5034:1: ruleUnaryOrTerminalExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression | this_AlphaTerminalExpression_1= ruleAlphaTerminalExpression ) ;
    public final EObject ruleUnaryOrTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        EObject this_AlphaTerminalExpression_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5040:2: ( (this_UnaryExpression_0= ruleUnaryExpression | this_AlphaTerminalExpression_1= ruleAlphaTerminalExpression ) )
            // InternalAlpha.g:5041:2: (this_UnaryExpression_0= ruleUnaryExpression | this_AlphaTerminalExpression_1= ruleAlphaTerminalExpression )
            {
            // InternalAlpha.g:5041:2: (this_UnaryExpression_0= ruleUnaryExpression | this_AlphaTerminalExpression_1= ruleAlphaTerminalExpression )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==42||LA75_0==73) ) {
                alt75=1;
            }
            else if ( ((LA75_0>=RULE_ID && LA75_0<=RULE_INT)||(LA75_0>=RULE_BOOLEAN && LA75_0<=RULE_FLOAT)||LA75_0==16||LA75_0==20||LA75_0==34||LA75_0==37||LA75_0==41||LA75_0==43||(LA75_0>=46 && LA75_0<=47)||LA75_0==59||(LA75_0>=61 && LA75_0<=65)||(LA75_0>=67 && LA75_0<=71)) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalAlpha.g:5042:3: this_UnaryExpression_0= ruleUnaryExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryOrTerminalExpressionAccess().getUnaryExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnaryExpression_0=ruleUnaryExpression();

                    state._fsp--;


                    			current = this_UnaryExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5051:3: this_AlphaTerminalExpression_1= ruleAlphaTerminalExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryOrTerminalExpressionAccess().getAlphaTerminalExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AlphaTerminalExpression_1=ruleAlphaTerminalExpression();

                    state._fsp--;


                    			current = this_AlphaTerminalExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOrTerminalExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalAlpha.g:5063:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlpha.g:5063:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlpha.g:5064:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalAlpha.g:5070:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAUnaryOP ) ) ( (lv_expr_1_0= ruleAlphaTerminalExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5076:2: ( ( ( (lv_operator_0_0= ruleAUnaryOP ) ) ( (lv_expr_1_0= ruleAlphaTerminalExpression ) ) ) )
            // InternalAlpha.g:5077:2: ( ( (lv_operator_0_0= ruleAUnaryOP ) ) ( (lv_expr_1_0= ruleAlphaTerminalExpression ) ) )
            {
            // InternalAlpha.g:5077:2: ( ( (lv_operator_0_0= ruleAUnaryOP ) ) ( (lv_expr_1_0= ruleAlphaTerminalExpression ) ) )
            // InternalAlpha.g:5078:3: ( (lv_operator_0_0= ruleAUnaryOP ) ) ( (lv_expr_1_0= ruleAlphaTerminalExpression ) )
            {
            // InternalAlpha.g:5078:3: ( (lv_operator_0_0= ruleAUnaryOP ) )
            // InternalAlpha.g:5079:4: (lv_operator_0_0= ruleAUnaryOP )
            {
            // InternalAlpha.g:5079:4: (lv_operator_0_0= ruleAUnaryOP )
            // InternalAlpha.g:5080:5: lv_operator_0_0= ruleAUnaryOP
            {

            					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorAUnaryOPParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_operator_0_0=ruleAUnaryOP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_0_0,
            						"alpha.model.Alpha.AUnaryOP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:5097:3: ( (lv_expr_1_0= ruleAlphaTerminalExpression ) )
            // InternalAlpha.g:5098:4: (lv_expr_1_0= ruleAlphaTerminalExpression )
            {
            // InternalAlpha.g:5098:4: (lv_expr_1_0= ruleAlphaTerminalExpression )
            // InternalAlpha.g:5099:5: lv_expr_1_0= ruleAlphaTerminalExpression
            {

            					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExprAlphaTerminalExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_1_0=ruleAlphaTerminalExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"alpha.model.Alpha.AlphaTerminalExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleVariableExpression"
    // InternalAlpha.g:5120:1: entryRuleVariableExpression returns [EObject current=null] : iv_ruleVariableExpression= ruleVariableExpression EOF ;
    public final EObject entryRuleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpression = null;


        try {
            // InternalAlpha.g:5120:59: (iv_ruleVariableExpression= ruleVariableExpression EOF )
            // InternalAlpha.g:5121:2: iv_ruleVariableExpression= ruleVariableExpression EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableExpression=ruleVariableExpression();

            state._fsp--;

             current =iv_ruleVariableExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableExpression"


    // $ANTLR start "ruleVariableExpression"
    // InternalAlpha.g:5127:1: ruleVariableExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:5133:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalAlpha.g:5134:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalAlpha.g:5134:2: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:5135:3: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:5135:3: (otherlv_0= RULE_ID )
            // InternalAlpha.g:5136:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableExpressionAccess().getVariableVariableCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableExpression"


    // $ANTLR start "entryRuleConstantExpression"
    // InternalAlpha.g:5150:1: entryRuleConstantExpression returns [EObject current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final EObject entryRuleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantExpression = null;


        try {
            // InternalAlpha.g:5150:59: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // InternalAlpha.g:5151:2: iv_ruleConstantExpression= ruleConstantExpression EOF
            {
             newCompositeNode(grammarAccess.getConstantExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantExpression=ruleConstantExpression();

            state._fsp--;

             current =iv_ruleConstantExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantExpression"


    // $ANTLR start "ruleConstantExpression"
    // InternalAlpha.g:5157:1: ruleConstantExpression returns [EObject current=null] : (this_BooleanExpression_0= ruleBooleanExpression | this_RealExpression_1= ruleRealExpression | this_IntegerExpression_2= ruleIntegerExpression ) ;
    public final EObject ruleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpression_0 = null;

        EObject this_RealExpression_1 = null;

        EObject this_IntegerExpression_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5163:2: ( (this_BooleanExpression_0= ruleBooleanExpression | this_RealExpression_1= ruleRealExpression | this_IntegerExpression_2= ruleIntegerExpression ) )
            // InternalAlpha.g:5164:2: (this_BooleanExpression_0= ruleBooleanExpression | this_RealExpression_1= ruleRealExpression | this_IntegerExpression_2= ruleIntegerExpression )
            {
            // InternalAlpha.g:5164:2: (this_BooleanExpression_0= ruleBooleanExpression | this_RealExpression_1= ruleRealExpression | this_IntegerExpression_2= ruleIntegerExpression )
            int alt76=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt76=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt76=2;
                }
                break;
            case RULE_INT:
                {
                alt76=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalAlpha.g:5165:3: this_BooleanExpression_0= ruleBooleanExpression
                    {

                    			newCompositeNode(grammarAccess.getConstantExpressionAccess().getBooleanExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanExpression_0=ruleBooleanExpression();

                    state._fsp--;


                    			current = this_BooleanExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5174:3: this_RealExpression_1= ruleRealExpression
                    {

                    			newCompositeNode(grammarAccess.getConstantExpressionAccess().getRealExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealExpression_1=ruleRealExpression();

                    state._fsp--;


                    			current = this_RealExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:5183:3: this_IntegerExpression_2= ruleIntegerExpression
                    {

                    			newCompositeNode(grammarAccess.getConstantExpressionAccess().getIntegerExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerExpression_2=ruleIntegerExpression();

                    state._fsp--;


                    			current = this_IntegerExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantExpression"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalAlpha.g:5195:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalAlpha.g:5195:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalAlpha.g:5196:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalAlpha.g:5202:1: ruleBooleanExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:5208:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalAlpha.g:5209:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalAlpha.g:5209:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalAlpha.g:5210:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalAlpha.g:5210:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalAlpha.g:5211:4: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getBooleanExpressionAccess().getValueBOOLEANTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleanExpressionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"alpha.model.Alpha.BOOLEAN");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleIntegerExpression"
    // InternalAlpha.g:5230:1: entryRuleIntegerExpression returns [EObject current=null] : iv_ruleIntegerExpression= ruleIntegerExpression EOF ;
    public final EObject entryRuleIntegerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerExpression = null;


        try {
            // InternalAlpha.g:5230:58: (iv_ruleIntegerExpression= ruleIntegerExpression EOF )
            // InternalAlpha.g:5231:2: iv_ruleIntegerExpression= ruleIntegerExpression EOF
            {
             newCompositeNode(grammarAccess.getIntegerExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerExpression=ruleIntegerExpression();

            state._fsp--;

             current =iv_ruleIntegerExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerExpression"


    // $ANTLR start "ruleIntegerExpression"
    // InternalAlpha.g:5237:1: ruleIntegerExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:5243:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAlpha.g:5244:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAlpha.g:5244:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalAlpha.g:5245:3: (lv_value_0_0= RULE_INT )
            {
            // InternalAlpha.g:5245:3: (lv_value_0_0= RULE_INT )
            // InternalAlpha.g:5246:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntegerExpressionAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntegerExpressionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerExpression"


    // $ANTLR start "entryRuleRealExpression"
    // InternalAlpha.g:5265:1: entryRuleRealExpression returns [EObject current=null] : iv_ruleRealExpression= ruleRealExpression EOF ;
    public final EObject entryRuleRealExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealExpression = null;


        try {
            // InternalAlpha.g:5265:55: (iv_ruleRealExpression= ruleRealExpression EOF )
            // InternalAlpha.g:5266:2: iv_ruleRealExpression= ruleRealExpression EOF
            {
             newCompositeNode(grammarAccess.getRealExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealExpression=ruleRealExpression();

            state._fsp--;

             current =iv_ruleRealExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealExpression"


    // $ANTLR start "ruleRealExpression"
    // InternalAlpha.g:5272:1: ruleRealExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleRealExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:5278:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalAlpha.g:5279:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalAlpha.g:5279:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalAlpha.g:5280:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalAlpha.g:5280:3: (lv_value_0_0= RULE_FLOAT )
            // InternalAlpha.g:5281:4: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getRealExpressionAccess().getValueFLOATTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRealExpressionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"alpha.model.Alpha.FLOAT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealExpression"


    // $ANTLR start "entryRuleAREDUCTION_OP"
    // InternalAlpha.g:5300:1: entryRuleAREDUCTION_OP returns [String current=null] : iv_ruleAREDUCTION_OP= ruleAREDUCTION_OP EOF ;
    public final String entryRuleAREDUCTION_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAREDUCTION_OP = null;


        try {
            // InternalAlpha.g:5300:53: (iv_ruleAREDUCTION_OP= ruleAREDUCTION_OP EOF )
            // InternalAlpha.g:5301:2: iv_ruleAREDUCTION_OP= ruleAREDUCTION_OP EOF
            {
             newCompositeNode(grammarAccess.getAREDUCTION_OPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAREDUCTION_OP=ruleAREDUCTION_OP();

            state._fsp--;

             current =iv_ruleAREDUCTION_OP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAREDUCTION_OP"


    // $ANTLR start "ruleAREDUCTION_OP"
    // InternalAlpha.g:5307:1: ruleAREDUCTION_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'min' | kw= 'max' | kw= 'prod' | kw= 'sum' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= '+' | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleAREDUCTION_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:5313:2: ( (kw= 'min' | kw= 'max' | kw= 'prod' | kw= 'sum' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= '+' | kw= '*' ) )
            // InternalAlpha.g:5314:2: (kw= 'min' | kw= 'max' | kw= 'prod' | kw= 'sum' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= '+' | kw= '*' )
            {
            // InternalAlpha.g:5314:2: (kw= 'min' | kw= 'max' | kw= 'prod' | kw= 'sum' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= '+' | kw= '*' )
            int alt77=9;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt77=1;
                }
                break;
            case 68:
                {
                alt77=2;
                }
                break;
            case 69:
                {
                alt77=3;
                }
                break;
            case 70:
                {
                alt77=4;
                }
                break;
            case 46:
                {
                alt77=5;
                }
                break;
            case 47:
                {
                alt77=6;
                }
                break;
            case 71:
                {
                alt77=7;
                }
                break;
            case 41:
                {
                alt77=8;
                }
                break;
            case 43:
                {
                alt77=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalAlpha.g:5315:3: kw= 'min'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getMinKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5321:3: kw= 'max'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getMaxKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:5327:3: kw= 'prod'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getProdKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:5333:3: kw= 'sum'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getSumKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:5339:3: kw= 'and'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getAndKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:5345:3: kw= 'or'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getOrKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalAlpha.g:5351:3: kw= 'xor'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getXorKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalAlpha.g:5357:3: kw= '+'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getPlusSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalAlpha.g:5363:3: kw= '*'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getAsteriskKeyword_8());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAREDUCTION_OP"


    // $ANTLR start "entryRuleAOrOP"
    // InternalAlpha.g:5372:1: entryRuleAOrOP returns [String current=null] : iv_ruleAOrOP= ruleAOrOP EOF ;
    public final String entryRuleAOrOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAOrOP = null;


        try {
            // InternalAlpha.g:5372:45: (iv_ruleAOrOP= ruleAOrOP EOF )
            // InternalAlpha.g:5373:2: iv_ruleAOrOP= ruleAOrOP EOF
            {
             newCompositeNode(grammarAccess.getAOrOPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAOrOP=ruleAOrOP();

            state._fsp--;

             current =iv_ruleAOrOP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAOrOP"


    // $ANTLR start "ruleAOrOP"
    // InternalAlpha.g:5379:1: ruleAOrOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'or' | kw= 'xor' ) ;
    public final AntlrDatatypeRuleToken ruleAOrOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:5385:2: ( (kw= 'or' | kw= 'xor' ) )
            // InternalAlpha.g:5386:2: (kw= 'or' | kw= 'xor' )
            {
            // InternalAlpha.g:5386:2: (kw= 'or' | kw= 'xor' )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==47) ) {
                alt78=1;
            }
            else if ( (LA78_0==71) ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalAlpha.g:5387:3: kw= 'or'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAOrOPAccess().getOrKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5393:3: kw= 'xor'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAOrOPAccess().getXorKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAOrOP"


    // $ANTLR start "entryRuleAAndOP"
    // InternalAlpha.g:5402:1: entryRuleAAndOP returns [String current=null] : iv_ruleAAndOP= ruleAAndOP EOF ;
    public final String entryRuleAAndOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAAndOP = null;


        try {
            // InternalAlpha.g:5402:46: (iv_ruleAAndOP= ruleAAndOP EOF )
            // InternalAlpha.g:5403:2: iv_ruleAAndOP= ruleAAndOP EOF
            {
             newCompositeNode(grammarAccess.getAAndOPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAAndOP=ruleAAndOP();

            state._fsp--;

             current =iv_ruleAAndOP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAAndOP"


    // $ANTLR start "ruleAAndOP"
    // InternalAlpha.g:5409:1: ruleAAndOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'and' ;
    public final AntlrDatatypeRuleToken ruleAAndOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:5415:2: (kw= 'and' )
            // InternalAlpha.g:5416:2: kw= 'and'
            {
            kw=(Token)match(input,46,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAAndOPAccess().getAndKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAAndOP"


    // $ANTLR start "entryRuleARelationalOP"
    // InternalAlpha.g:5424:1: entryRuleARelationalOP returns [String current=null] : iv_ruleARelationalOP= ruleARelationalOP EOF ;
    public final String entryRuleARelationalOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleARelationalOP = null;


        try {
            // InternalAlpha.g:5424:53: (iv_ruleARelationalOP= ruleARelationalOP EOF )
            // InternalAlpha.g:5425:2: iv_ruleARelationalOP= ruleARelationalOP EOF
            {
             newCompositeNode(grammarAccess.getARelationalOPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleARelationalOP=ruleARelationalOP();

            state._fsp--;

             current =iv_ruleARelationalOP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleARelationalOP"


    // $ANTLR start "ruleARelationalOP"
    // InternalAlpha.g:5431:1: ruleARelationalOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '!=' | kw= '>=' | kw= '>' | kw= '<' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken ruleARelationalOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:5437:2: ( (kw= '=' | kw= '!=' | kw= '>=' | kw= '>' | kw= '<' | kw= '<=' ) )
            // InternalAlpha.g:5438:2: (kw= '=' | kw= '!=' | kw= '>=' | kw= '>' | kw= '<' | kw= '<=' )
            {
            // InternalAlpha.g:5438:2: (kw= '=' | kw= '!=' | kw= '>=' | kw= '>' | kw= '<' | kw= '<=' )
            int alt79=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt79=1;
                }
                break;
            case 72:
                {
                alt79=2;
                }
                break;
            case 50:
                {
                alt79=3;
                }
                break;
            case 51:
                {
                alt79=4;
                }
                break;
            case 52:
                {
                alt79=5;
                }
                break;
            case 53:
                {
                alt79=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalAlpha.g:5439:3: kw= '='
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5445:3: kw= '!='
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getExclamationMarkEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:5451:3: kw= '>='
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getGreaterThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:5457:3: kw= '>'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getGreaterThanSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:5463:3: kw= '<'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getLessThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:5469:3: kw= '<='
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getLessThanSignEqualsSignKeyword_5());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleARelationalOP"


    // $ANTLR start "entryRuleAAdditiveOP"
    // InternalAlpha.g:5478:1: entryRuleAAdditiveOP returns [String current=null] : iv_ruleAAdditiveOP= ruleAAdditiveOP EOF ;
    public final String entryRuleAAdditiveOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAAdditiveOP = null;


        try {
            // InternalAlpha.g:5478:51: (iv_ruleAAdditiveOP= ruleAAdditiveOP EOF )
            // InternalAlpha.g:5479:2: iv_ruleAAdditiveOP= ruleAAdditiveOP EOF
            {
             newCompositeNode(grammarAccess.getAAdditiveOPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAAdditiveOP=ruleAAdditiveOP();

            state._fsp--;

             current =iv_ruleAAdditiveOP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAAdditiveOP"


    // $ANTLR start "ruleAAdditiveOP"
    // InternalAlpha.g:5485:1: ruleAAdditiveOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAAdditiveOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:5491:2: ( (kw= '+' | kw= '-' ) )
            // InternalAlpha.g:5492:2: (kw= '+' | kw= '-' )
            {
            // InternalAlpha.g:5492:2: (kw= '+' | kw= '-' )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==41) ) {
                alt80=1;
            }
            else if ( (LA80_0==42) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalAlpha.g:5493:3: kw= '+'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAAdditiveOPAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5499:3: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAAdditiveOPAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAAdditiveOP"


    // $ANTLR start "entryRuleAMultiplicativeOP"
    // InternalAlpha.g:5508:1: entryRuleAMultiplicativeOP returns [String current=null] : iv_ruleAMultiplicativeOP= ruleAMultiplicativeOP EOF ;
    public final String entryRuleAMultiplicativeOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAMultiplicativeOP = null;


        try {
            // InternalAlpha.g:5508:57: (iv_ruleAMultiplicativeOP= ruleAMultiplicativeOP EOF )
            // InternalAlpha.g:5509:2: iv_ruleAMultiplicativeOP= ruleAMultiplicativeOP EOF
            {
             newCompositeNode(grammarAccess.getAMultiplicativeOPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAMultiplicativeOP=ruleAMultiplicativeOP();

            state._fsp--;

             current =iv_ruleAMultiplicativeOP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAMultiplicativeOP"


    // $ANTLR start "ruleAMultiplicativeOP"
    // InternalAlpha.g:5515:1: ruleAMultiplicativeOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleAMultiplicativeOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:5521:2: ( (kw= '*' | kw= '/' ) )
            // InternalAlpha.g:5522:2: (kw= '*' | kw= '/' )
            {
            // InternalAlpha.g:5522:2: (kw= '*' | kw= '/' )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==43) ) {
                alt81=1;
            }
            else if ( (LA81_0==44) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalAlpha.g:5523:3: kw= '*'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAMultiplicativeOPAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5529:3: kw= '/'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAMultiplicativeOPAccess().getSolidusKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAMultiplicativeOP"


    // $ANTLR start "entryRuleAMINMAX_OP"
    // InternalAlpha.g:5538:1: entryRuleAMINMAX_OP returns [String current=null] : iv_ruleAMINMAX_OP= ruleAMINMAX_OP EOF ;
    public final String entryRuleAMINMAX_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAMINMAX_OP = null;


        try {
            // InternalAlpha.g:5538:50: (iv_ruleAMINMAX_OP= ruleAMINMAX_OP EOF )
            // InternalAlpha.g:5539:2: iv_ruleAMINMAX_OP= ruleAMINMAX_OP EOF
            {
             newCompositeNode(grammarAccess.getAMINMAX_OPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAMINMAX_OP=ruleAMINMAX_OP();

            state._fsp--;

             current =iv_ruleAMINMAX_OP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAMINMAX_OP"


    // $ANTLR start "ruleAMINMAX_OP"
    // InternalAlpha.g:5545:1: ruleAMINMAX_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'min' | kw= 'max' ) ;
    public final AntlrDatatypeRuleToken ruleAMINMAX_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:5551:2: ( (kw= 'min' | kw= 'max' ) )
            // InternalAlpha.g:5552:2: (kw= 'min' | kw= 'max' )
            {
            // InternalAlpha.g:5552:2: (kw= 'min' | kw= 'max' )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==67) ) {
                alt82=1;
            }
            else if ( (LA82_0==68) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalAlpha.g:5553:3: kw= 'min'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAMINMAX_OPAccess().getMinKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5559:3: kw= 'max'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAMINMAX_OPAccess().getMaxKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAMINMAX_OP"


    // $ANTLR start "entryRuleAUnaryOP"
    // InternalAlpha.g:5568:1: entryRuleAUnaryOP returns [String current=null] : iv_ruleAUnaryOP= ruleAUnaryOP EOF ;
    public final String entryRuleAUnaryOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAUnaryOP = null;


        try {
            // InternalAlpha.g:5568:48: (iv_ruleAUnaryOP= ruleAUnaryOP EOF )
            // InternalAlpha.g:5569:2: iv_ruleAUnaryOP= ruleAUnaryOP EOF
            {
             newCompositeNode(grammarAccess.getAUnaryOPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAUnaryOP=ruleAUnaryOP();

            state._fsp--;

             current =iv_ruleAUnaryOP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAUnaryOP"


    // $ANTLR start "ruleAUnaryOP"
    // InternalAlpha.g:5575:1: ruleAUnaryOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'not' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAUnaryOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:5581:2: ( (kw= 'not' | kw= '-' ) )
            // InternalAlpha.g:5582:2: (kw= 'not' | kw= '-' )
            {
            // InternalAlpha.g:5582:2: (kw= 'not' | kw= '-' )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==73) ) {
                alt83=1;
            }
            else if ( (LA83_0==42) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalAlpha.g:5583:3: kw= 'not'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryOPAccess().getNotKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5589:3: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryOPAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAUnaryOP"


    // $ANTLR start "entryRulePolyhedralObject"
    // InternalAlpha.g:5598:1: entryRulePolyhedralObject returns [EObject current=null] : iv_rulePolyhedralObject= rulePolyhedralObject EOF ;
    public final EObject entryRulePolyhedralObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyhedralObject = null;


        try {
            // InternalAlpha.g:5598:57: (iv_rulePolyhedralObject= rulePolyhedralObject EOF )
            // InternalAlpha.g:5599:2: iv_rulePolyhedralObject= rulePolyhedralObject EOF
            {
             newCompositeNode(grammarAccess.getPolyhedralObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolyhedralObject=rulePolyhedralObject();

            state._fsp--;

             current =iv_rulePolyhedralObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolyhedralObject"


    // $ANTLR start "rulePolyhedralObject"
    // InternalAlpha.g:5605:1: rulePolyhedralObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleCalculatorExpression ) ) ) ;
    public final EObject rulePolyhedralObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5611:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleCalculatorExpression ) ) ) )
            // InternalAlpha.g:5612:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleCalculatorExpression ) ) )
            {
            // InternalAlpha.g:5612:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleCalculatorExpression ) ) )
            // InternalAlpha.g:5613:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleCalculatorExpression ) )
            {
            // InternalAlpha.g:5613:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:5614:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:5614:4: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:5615:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPolyhedralObjectAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolyhedralObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"alpha.model.Alpha.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getPolyhedralObjectAccess().getEqualsSignKeyword_1());
            		
            // InternalAlpha.g:5635:3: ( (lv_expr_2_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:5636:4: (lv_expr_2_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:5636:4: (lv_expr_2_0= ruleCalculatorExpression )
            // InternalAlpha.g:5637:5: lv_expr_2_0= ruleCalculatorExpression
            {

            					newCompositeNode(grammarAccess.getPolyhedralObjectAccess().getExprCalculatorExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleCalculatorExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolyhedralObjectRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"alpha.model.Alpha.CalculatorExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolyhedralObject"


    // $ANTLR start "entryRuleCalculatorExpression"
    // InternalAlpha.g:5658:1: entryRuleCalculatorExpression returns [EObject current=null] : iv_ruleCalculatorExpression= ruleCalculatorExpression EOF ;
    public final EObject entryRuleCalculatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculatorExpression = null;


        try {
            // InternalAlpha.g:5658:61: (iv_ruleCalculatorExpression= ruleCalculatorExpression EOF )
            // InternalAlpha.g:5659:2: iv_ruleCalculatorExpression= ruleCalculatorExpression EOF
            {
             newCompositeNode(grammarAccess.getCalculatorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalculatorExpression=ruleCalculatorExpression();

            state._fsp--;

             current =iv_ruleCalculatorExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCalculatorExpression"


    // $ANTLR start "ruleCalculatorExpression"
    // InternalAlpha.g:5665:1: ruleCalculatorExpression returns [EObject current=null] : (this_UnaryOrTerminalCalculatorExpression_0= ruleUnaryOrTerminalCalculatorExpression ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )* ) ;
    public final EObject ruleCalculatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOrTerminalCalculatorExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5671:2: ( (this_UnaryOrTerminalCalculatorExpression_0= ruleUnaryOrTerminalCalculatorExpression ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )* ) )
            // InternalAlpha.g:5672:2: (this_UnaryOrTerminalCalculatorExpression_0= ruleUnaryOrTerminalCalculatorExpression ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )* )
            {
            // InternalAlpha.g:5672:2: (this_UnaryOrTerminalCalculatorExpression_0= ruleUnaryOrTerminalCalculatorExpression ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )* )
            // InternalAlpha.g:5673:3: this_UnaryOrTerminalCalculatorExpression_0= ruleUnaryOrTerminalCalculatorExpression ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getCalculatorExpressionAccess().getUnaryOrTerminalCalculatorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_71);
            this_UnaryOrTerminalCalculatorExpression_0=ruleUnaryOrTerminalCalculatorExpression();

            state._fsp--;


            			current = this_UnaryOrTerminalCalculatorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:5681:3: ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( ((LA84_0>=41 && LA84_0<=43)||LA84_0==60||(LA84_0>=81 && LA84_0<=83)) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalAlpha.g:5682:4: () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) )
            	    {
            	    // InternalAlpha.g:5682:4: ()
            	    // InternalAlpha.g:5683:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCalculatorExpressionAccess().getBinaryCalculatorExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:5689:4: ( (lv_operator_2_0= ruleABinaryCalcOp ) )
            	    // InternalAlpha.g:5690:5: (lv_operator_2_0= ruleABinaryCalcOp )
            	    {
            	    // InternalAlpha.g:5690:5: (lv_operator_2_0= ruleABinaryCalcOp )
            	    // InternalAlpha.g:5691:6: lv_operator_2_0= ruleABinaryCalcOp
            	    {

            	    						newCompositeNode(grammarAccess.getCalculatorExpressionAccess().getOperatorABinaryCalcOpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_operator_2_0=ruleABinaryCalcOp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCalculatorExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"alpha.model.Alpha.ABinaryCalcOp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAlpha.g:5708:4: ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) )
            	    // InternalAlpha.g:5709:5: (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression )
            	    {
            	    // InternalAlpha.g:5709:5: (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression )
            	    // InternalAlpha.g:5710:6: lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getCalculatorExpressionAccess().getRightUnaryOrTerminalCalculatorExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_71);
            	    lv_right_3_0=ruleUnaryOrTerminalCalculatorExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCalculatorExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"alpha.model.Alpha.UnaryOrTerminalCalculatorExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCalculatorExpression"


    // $ANTLR start "entryRuleUnaryOrTerminalCalculatorExpression"
    // InternalAlpha.g:5732:1: entryRuleUnaryOrTerminalCalculatorExpression returns [EObject current=null] : iv_ruleUnaryOrTerminalCalculatorExpression= ruleUnaryOrTerminalCalculatorExpression EOF ;
    public final EObject entryRuleUnaryOrTerminalCalculatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOrTerminalCalculatorExpression = null;


        try {
            // InternalAlpha.g:5732:76: (iv_ruleUnaryOrTerminalCalculatorExpression= ruleUnaryOrTerminalCalculatorExpression EOF )
            // InternalAlpha.g:5733:2: iv_ruleUnaryOrTerminalCalculatorExpression= ruleUnaryOrTerminalCalculatorExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryOrTerminalCalculatorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOrTerminalCalculatorExpression=ruleUnaryOrTerminalCalculatorExpression();

            state._fsp--;

             current =iv_ruleUnaryOrTerminalCalculatorExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOrTerminalCalculatorExpression"


    // $ANTLR start "ruleUnaryOrTerminalCalculatorExpression"
    // InternalAlpha.g:5739:1: ruleUnaryOrTerminalCalculatorExpression returns [EObject current=null] : (this_UnaryCalculatorExpression_0= ruleUnaryCalculatorExpression | this_CalculatorExpressionTerminal_1= ruleCalculatorExpressionTerminal ) ;
    public final EObject ruleUnaryOrTerminalCalculatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryCalculatorExpression_0 = null;

        EObject this_CalculatorExpressionTerminal_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5745:2: ( (this_UnaryCalculatorExpression_0= ruleUnaryCalculatorExpression | this_CalculatorExpressionTerminal_1= ruleCalculatorExpressionTerminal ) )
            // InternalAlpha.g:5746:2: (this_UnaryCalculatorExpression_0= ruleUnaryCalculatorExpression | this_CalculatorExpressionTerminal_1= ruleCalculatorExpressionTerminal )
            {
            // InternalAlpha.g:5746:2: (this_UnaryCalculatorExpression_0= ruleUnaryCalculatorExpression | this_CalculatorExpressionTerminal_1= ruleCalculatorExpressionTerminal )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=75 && LA85_0<=80)) ) {
                alt85=1;
            }
            else if ( (LA85_0==RULE_ID||LA85_0==16||LA85_0==20||LA85_0==34) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalAlpha.g:5747:3: this_UnaryCalculatorExpression_0= ruleUnaryCalculatorExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryOrTerminalCalculatorExpressionAccess().getUnaryCalculatorExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnaryCalculatorExpression_0=ruleUnaryCalculatorExpression();

                    state._fsp--;


                    			current = this_UnaryCalculatorExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5756:3: this_CalculatorExpressionTerminal_1= ruleCalculatorExpressionTerminal
                    {

                    			newCompositeNode(grammarAccess.getUnaryOrTerminalCalculatorExpressionAccess().getCalculatorExpressionTerminalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CalculatorExpressionTerminal_1=ruleCalculatorExpressionTerminal();

                    state._fsp--;


                    			current = this_CalculatorExpressionTerminal_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOrTerminalCalculatorExpression"


    // $ANTLR start "entryRuleCalculatorExpressionTerminal"
    // InternalAlpha.g:5768:1: entryRuleCalculatorExpressionTerminal returns [EObject current=null] : iv_ruleCalculatorExpressionTerminal= ruleCalculatorExpressionTerminal EOF ;
    public final EObject entryRuleCalculatorExpressionTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculatorExpressionTerminal = null;


        try {
            // InternalAlpha.g:5768:69: (iv_ruleCalculatorExpressionTerminal= ruleCalculatorExpressionTerminal EOF )
            // InternalAlpha.g:5769:2: iv_ruleCalculatorExpressionTerminal= ruleCalculatorExpressionTerminal EOF
            {
             newCompositeNode(grammarAccess.getCalculatorExpressionTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalculatorExpressionTerminal=ruleCalculatorExpressionTerminal();

            state._fsp--;

             current =iv_ruleCalculatorExpressionTerminal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCalculatorExpressionTerminal"


    // $ANTLR start "ruleCalculatorExpressionTerminal"
    // InternalAlpha.g:5775:1: ruleCalculatorExpressionTerminal returns [EObject current=null] : (this_JNIDomain_0= ruleJNIDomain | this_JNIRelation_1= ruleJNIRelation | this_JNIFunction_2= ruleJNIFunction | this_DefinedObject_3= ruleDefinedObject | this_RectangularDomain_4= ruleRectangularDomain | this_VariableDomain_5= ruleVariableDomain | (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' ) ) ;
    public final EObject ruleCalculatorExpressionTerminal() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_JNIDomain_0 = null;

        EObject this_JNIRelation_1 = null;

        EObject this_JNIFunction_2 = null;

        EObject this_DefinedObject_3 = null;

        EObject this_RectangularDomain_4 = null;

        EObject this_VariableDomain_5 = null;

        EObject this_CalculatorExpression_7 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5781:2: ( (this_JNIDomain_0= ruleJNIDomain | this_JNIRelation_1= ruleJNIRelation | this_JNIFunction_2= ruleJNIFunction | this_DefinedObject_3= ruleDefinedObject | this_RectangularDomain_4= ruleRectangularDomain | this_VariableDomain_5= ruleVariableDomain | (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' ) ) )
            // InternalAlpha.g:5782:2: (this_JNIDomain_0= ruleJNIDomain | this_JNIRelation_1= ruleJNIRelation | this_JNIFunction_2= ruleJNIFunction | this_DefinedObject_3= ruleDefinedObject | this_RectangularDomain_4= ruleRectangularDomain | this_VariableDomain_5= ruleVariableDomain | (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' ) )
            {
            // InternalAlpha.g:5782:2: (this_JNIDomain_0= ruleJNIDomain | this_JNIRelation_1= ruleJNIRelation | this_JNIFunction_2= ruleJNIFunction | this_DefinedObject_3= ruleDefinedObject | this_RectangularDomain_4= ruleRectangularDomain | this_VariableDomain_5= ruleVariableDomain | (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' ) )
            int alt86=7;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // InternalAlpha.g:5783:3: this_JNIDomain_0= ruleJNIDomain
                    {

                    			newCompositeNode(grammarAccess.getCalculatorExpressionTerminalAccess().getJNIDomainParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_JNIDomain_0=ruleJNIDomain();

                    state._fsp--;


                    			current = this_JNIDomain_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5792:3: this_JNIRelation_1= ruleJNIRelation
                    {

                    			newCompositeNode(grammarAccess.getCalculatorExpressionTerminalAccess().getJNIRelationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JNIRelation_1=ruleJNIRelation();

                    state._fsp--;


                    			current = this_JNIRelation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:5801:3: this_JNIFunction_2= ruleJNIFunction
                    {

                    			newCompositeNode(grammarAccess.getCalculatorExpressionTerminalAccess().getJNIFunctionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_JNIFunction_2=ruleJNIFunction();

                    state._fsp--;


                    			current = this_JNIFunction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:5810:3: this_DefinedObject_3= ruleDefinedObject
                    {

                    			newCompositeNode(grammarAccess.getCalculatorExpressionTerminalAccess().getDefinedObjectParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefinedObject_3=ruleDefinedObject();

                    state._fsp--;


                    			current = this_DefinedObject_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:5819:3: this_RectangularDomain_4= ruleRectangularDomain
                    {

                    			newCompositeNode(grammarAccess.getCalculatorExpressionTerminalAccess().getRectangularDomainParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_RectangularDomain_4=ruleRectangularDomain();

                    state._fsp--;


                    			current = this_RectangularDomain_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:5828:3: this_VariableDomain_5= ruleVariableDomain
                    {

                    			newCompositeNode(grammarAccess.getCalculatorExpressionTerminalAccess().getVariableDomainParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDomain_5=ruleVariableDomain();

                    state._fsp--;


                    			current = this_VariableDomain_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAlpha.g:5837:3: (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' )
                    {
                    // InternalAlpha.g:5837:3: (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' )
                    // InternalAlpha.g:5838:4: otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getCalculatorExpressionTerminalAccess().getLeftParenthesisKeyword_6_0());
                    			

                    				newCompositeNode(grammarAccess.getCalculatorExpressionTerminalAccess().getCalculatorExpressionParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_CalculatorExpression_7=ruleCalculatorExpression();

                    state._fsp--;


                    				current = this_CalculatorExpression_7;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_8=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getCalculatorExpressionTerminalAccess().getRightParenthesisKeyword_6_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCalculatorExpressionTerminal"


    // $ANTLR start "entryRuleUnaryCalculatorExpression"
    // InternalAlpha.g:5859:1: entryRuleUnaryCalculatorExpression returns [EObject current=null] : iv_ruleUnaryCalculatorExpression= ruleUnaryCalculatorExpression EOF ;
    public final EObject entryRuleUnaryCalculatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryCalculatorExpression = null;


        try {
            // InternalAlpha.g:5859:66: (iv_ruleUnaryCalculatorExpression= ruleUnaryCalculatorExpression EOF )
            // InternalAlpha.g:5860:2: iv_ruleUnaryCalculatorExpression= ruleUnaryCalculatorExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryCalculatorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryCalculatorExpression=ruleUnaryCalculatorExpression();

            state._fsp--;

             current =iv_ruleUnaryCalculatorExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryCalculatorExpression"


    // $ANTLR start "ruleUnaryCalculatorExpression"
    // InternalAlpha.g:5866:1: ruleUnaryCalculatorExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAUnaryCalcOp ) ) ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) ) ) ;
    public final EObject ruleUnaryCalculatorExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5872:2: ( ( ( (lv_operator_0_0= ruleAUnaryCalcOp ) ) ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) ) ) )
            // InternalAlpha.g:5873:2: ( ( (lv_operator_0_0= ruleAUnaryCalcOp ) ) ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) ) )
            {
            // InternalAlpha.g:5873:2: ( ( (lv_operator_0_0= ruleAUnaryCalcOp ) ) ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) ) )
            // InternalAlpha.g:5874:3: ( (lv_operator_0_0= ruleAUnaryCalcOp ) ) ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) )
            {
            // InternalAlpha.g:5874:3: ( (lv_operator_0_0= ruleAUnaryCalcOp ) )
            // InternalAlpha.g:5875:4: (lv_operator_0_0= ruleAUnaryCalcOp )
            {
            // InternalAlpha.g:5875:4: (lv_operator_0_0= ruleAUnaryCalcOp )
            // InternalAlpha.g:5876:5: lv_operator_0_0= ruleAUnaryCalcOp
            {

            					newCompositeNode(grammarAccess.getUnaryCalculatorExpressionAccess().getOperatorAUnaryCalcOpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_operator_0_0=ruleAUnaryCalcOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnaryCalculatorExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_0_0,
            						"alpha.model.Alpha.AUnaryCalcOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:5893:3: ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) )
            // InternalAlpha.g:5894:4: (lv_expr_1_0= ruleCalculatorExpressionTerminal )
            {
            // InternalAlpha.g:5894:4: (lv_expr_1_0= ruleCalculatorExpressionTerminal )
            // InternalAlpha.g:5895:5: lv_expr_1_0= ruleCalculatorExpressionTerminal
            {

            					newCompositeNode(grammarAccess.getUnaryCalculatorExpressionAccess().getExprCalculatorExpressionTerminalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_1_0=ruleCalculatorExpressionTerminal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnaryCalculatorExpressionRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"alpha.model.Alpha.CalculatorExpressionTerminal");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryCalculatorExpression"


    // $ANTLR start "entryRuleVariableDomain"
    // InternalAlpha.g:5916:1: entryRuleVariableDomain returns [EObject current=null] : iv_ruleVariableDomain= ruleVariableDomain EOF ;
    public final EObject entryRuleVariableDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDomain = null;


        try {
            // InternalAlpha.g:5916:55: (iv_ruleVariableDomain= ruleVariableDomain EOF )
            // InternalAlpha.g:5917:2: iv_ruleVariableDomain= ruleVariableDomain EOF
            {
             newCompositeNode(grammarAccess.getVariableDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDomain=ruleVariableDomain();

            state._fsp--;

             current =iv_ruleVariableDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDomain"


    // $ANTLR start "ruleVariableDomain"
    // InternalAlpha.g:5923:1: ruleVariableDomain returns [EObject current=null] : (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' ) ;
    public final EObject ruleVariableDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalAlpha.g:5929:2: ( (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' ) )
            // InternalAlpha.g:5930:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' )
            {
            // InternalAlpha.g:5930:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' )
            // InternalAlpha.g:5931:3: otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDomainAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAlpha.g:5935:3: ( (otherlv_1= RULE_ID ) )
            // InternalAlpha.g:5936:4: (otherlv_1= RULE_ID )
            {
            // InternalAlpha.g:5936:4: (otherlv_1= RULE_ID )
            // InternalAlpha.g:5937:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDomainRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_1, grammarAccess.getVariableDomainAccess().getVariableVariableCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDomainAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDomain"


    // $ANTLR start "entryRuleRectangularDomain"
    // InternalAlpha.g:5956:1: entryRuleRectangularDomain returns [EObject current=null] : iv_ruleRectangularDomain= ruleRectangularDomain EOF ;
    public final EObject entryRuleRectangularDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangularDomain = null;


        try {
            // InternalAlpha.g:5956:58: (iv_ruleRectangularDomain= ruleRectangularDomain EOF )
            // InternalAlpha.g:5957:2: iv_ruleRectangularDomain= ruleRectangularDomain EOF
            {
             newCompositeNode(grammarAccess.getRectangularDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRectangularDomain=ruleRectangularDomain();

            state._fsp--;

             current =iv_ruleRectangularDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRectangularDomain"


    // $ANTLR start "ruleRectangularDomain"
    // InternalAlpha.g:5963:1: ruleRectangularDomain returns [EObject current=null] : (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleIndexName ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleIndexName ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? ) ;
    public final EObject ruleRectangularDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_upperBounds_1_0 = null;

        AntlrDatatypeRuleToken lv_upperBounds_3_0 = null;

        AntlrDatatypeRuleToken lv_indexNames_7_0 = null;

        AntlrDatatypeRuleToken lv_indexNames_9_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5969:2: ( (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleIndexName ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleIndexName ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? ) )
            // InternalAlpha.g:5970:2: (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleIndexName ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleIndexName ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? )
            {
            // InternalAlpha.g:5970:2: (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleIndexName ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleIndexName ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? )
            // InternalAlpha.g:5971:3: otherlv_0= '[' ( (lv_upperBounds_1_0= ruleIndexName ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleIndexName ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRectangularDomainAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAlpha.g:5975:3: ( (lv_upperBounds_1_0= ruleIndexName ) )
            // InternalAlpha.g:5976:4: (lv_upperBounds_1_0= ruleIndexName )
            {
            // InternalAlpha.g:5976:4: (lv_upperBounds_1_0= ruleIndexName )
            // InternalAlpha.g:5977:5: lv_upperBounds_1_0= ruleIndexName
            {

            					newCompositeNode(grammarAccess.getRectangularDomainAccess().getUpperBoundsIndexNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_upperBounds_1_0=ruleIndexName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRectangularDomainRule());
            					}
            					add(
            						current,
            						"upperBounds",
            						lv_upperBounds_1_0,
            						"alpha.model.Alpha.IndexName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:5994:3: (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleIndexName ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==35) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalAlpha.g:5995:4: otherlv_2= ',' ( (lv_upperBounds_3_0= ruleIndexName ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getRectangularDomainAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAlpha.g:5999:4: ( (lv_upperBounds_3_0= ruleIndexName ) )
            	    // InternalAlpha.g:6000:5: (lv_upperBounds_3_0= ruleIndexName )
            	    {
            	    // InternalAlpha.g:6000:5: (lv_upperBounds_3_0= ruleIndexName )
            	    // InternalAlpha.g:6001:6: lv_upperBounds_3_0= ruleIndexName
            	    {

            	    						newCompositeNode(grammarAccess.getRectangularDomainAccess().getUpperBoundsIndexNameParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_upperBounds_3_0=ruleIndexName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRectangularDomainRule());
            	    						}
            	    						add(
            	    							current,
            	    							"upperBounds",
            	    							lv_upperBounds_3_0,
            	    							"alpha.model.Alpha.IndexName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            otherlv_4=(Token)match(input,36,FOLLOW_72); 

            			newLeafNode(otherlv_4, grammarAccess.getRectangularDomainAccess().getRightSquareBracketKeyword_3());
            		
            // InternalAlpha.g:6023:3: (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==74) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalAlpha.g:6024:4: otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']'
                    {
                    otherlv_5=(Token)match(input,74,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getRectangularDomainAccess().getAsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getRectangularDomainAccess().getLeftSquareBracketKeyword_4_1());
                    			
                    // InternalAlpha.g:6032:4: ( (lv_indexNames_7_0= ruleIndexName ) )
                    // InternalAlpha.g:6033:5: (lv_indexNames_7_0= ruleIndexName )
                    {
                    // InternalAlpha.g:6033:5: (lv_indexNames_7_0= ruleIndexName )
                    // InternalAlpha.g:6034:6: lv_indexNames_7_0= ruleIndexName
                    {

                    						newCompositeNode(grammarAccess.getRectangularDomainAccess().getIndexNamesIndexNameParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_indexNames_7_0=ruleIndexName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRectangularDomainRule());
                    						}
                    						add(
                    							current,
                    							"indexNames",
                    							lv_indexNames_7_0,
                    							"alpha.model.Alpha.IndexName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlpha.g:6051:4: (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==35) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalAlpha.g:6052:5: otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,35,FOLLOW_4); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getRectangularDomainAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalAlpha.g:6056:5: ( (lv_indexNames_9_0= ruleIndexName ) )
                    	    // InternalAlpha.g:6057:6: (lv_indexNames_9_0= ruleIndexName )
                    	    {
                    	    // InternalAlpha.g:6057:6: (lv_indexNames_9_0= ruleIndexName )
                    	    // InternalAlpha.g:6058:7: lv_indexNames_9_0= ruleIndexName
                    	    {

                    	    							newCompositeNode(grammarAccess.getRectangularDomainAccess().getIndexNamesIndexNameParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_indexNames_9_0=ruleIndexName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRectangularDomainRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"indexNames",
                    	    								lv_indexNames_9_0,
                    	    								"alpha.model.Alpha.IndexName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getRectangularDomainAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRectangularDomain"


    // $ANTLR start "entryRuleDefinedObject"
    // InternalAlpha.g:6085:1: entryRuleDefinedObject returns [EObject current=null] : iv_ruleDefinedObject= ruleDefinedObject EOF ;
    public final EObject entryRuleDefinedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinedObject = null;


        try {
            // InternalAlpha.g:6085:54: (iv_ruleDefinedObject= ruleDefinedObject EOF )
            // InternalAlpha.g:6086:2: iv_ruleDefinedObject= ruleDefinedObject EOF
            {
             newCompositeNode(grammarAccess.getDefinedObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinedObject=ruleDefinedObject();

            state._fsp--;

             current =iv_ruleDefinedObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinedObject"


    // $ANTLR start "ruleDefinedObject"
    // InternalAlpha.g:6092:1: ruleDefinedObject returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDefinedObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:6098:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalAlpha.g:6099:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalAlpha.g:6099:2: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:6100:3: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:6100:3: (otherlv_0= RULE_ID )
            // InternalAlpha.g:6101:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDefinedObjectRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getDefinedObjectAccess().getObjectPolyhedralObjectCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinedObject"


    // $ANTLR start "entryRuleAUnaryCalcOp"
    // InternalAlpha.g:6115:1: entryRuleAUnaryCalcOp returns [String current=null] : iv_ruleAUnaryCalcOp= ruleAUnaryCalcOp EOF ;
    public final String entryRuleAUnaryCalcOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAUnaryCalcOp = null;


        try {
            // InternalAlpha.g:6115:52: (iv_ruleAUnaryCalcOp= ruleAUnaryCalcOp EOF )
            // InternalAlpha.g:6116:2: iv_ruleAUnaryCalcOp= ruleAUnaryCalcOp EOF
            {
             newCompositeNode(grammarAccess.getAUnaryCalcOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAUnaryCalcOp=ruleAUnaryCalcOp();

            state._fsp--;

             current =iv_ruleAUnaryCalcOp.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAUnaryCalcOp"


    // $ANTLR start "ruleAUnaryCalcOp"
    // InternalAlpha.g:6122:1: ruleAUnaryCalcOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'domain' | kw= 'range' | kw= 'complement' | kw= 'affine-hull' | kw= 'poly-hull' | kw= 'reverse' ) ;
    public final AntlrDatatypeRuleToken ruleAUnaryCalcOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:6128:2: ( (kw= 'domain' | kw= 'range' | kw= 'complement' | kw= 'affine-hull' | kw= 'poly-hull' | kw= 'reverse' ) )
            // InternalAlpha.g:6129:2: (kw= 'domain' | kw= 'range' | kw= 'complement' | kw= 'affine-hull' | kw= 'poly-hull' | kw= 'reverse' )
            {
            // InternalAlpha.g:6129:2: (kw= 'domain' | kw= 'range' | kw= 'complement' | kw= 'affine-hull' | kw= 'poly-hull' | kw= 'reverse' )
            int alt90=6;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt90=1;
                }
                break;
            case 76:
                {
                alt90=2;
                }
                break;
            case 77:
                {
                alt90=3;
                }
                break;
            case 78:
                {
                alt90=4;
                }
                break;
            case 79:
                {
                alt90=5;
                }
                break;
            case 80:
                {
                alt90=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalAlpha.g:6130:3: kw= 'domain'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getDomainKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:6136:3: kw= 'range'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getRangeKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:6142:3: kw= 'complement'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getComplementKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:6148:3: kw= 'affine-hull'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getAffineHullKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:6154:3: kw= 'poly-hull'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getPolyHullKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:6160:3: kw= 'reverse'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getReverseKeyword_5());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAUnaryCalcOp"


    // $ANTLR start "entryRuleABinaryCalcOp"
    // InternalAlpha.g:6169:1: entryRuleABinaryCalcOp returns [String current=null] : iv_ruleABinaryCalcOp= ruleABinaryCalcOp EOF ;
    public final String entryRuleABinaryCalcOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleABinaryCalcOp = null;


        try {
            // InternalAlpha.g:6169:53: (iv_ruleABinaryCalcOp= ruleABinaryCalcOp EOF )
            // InternalAlpha.g:6170:2: iv_ruleABinaryCalcOp= ruleABinaryCalcOp EOF
            {
             newCompositeNode(grammarAccess.getABinaryCalcOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleABinaryCalcOp=ruleABinaryCalcOp();

            state._fsp--;

             current =iv_ruleABinaryCalcOp.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleABinaryCalcOp"


    // $ANTLR start "ruleABinaryCalcOp"
    // InternalAlpha.g:6176:1: ruleABinaryCalcOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'cross' | kw= '+' | kw= '-' | kw= '*' | kw= '@' | kw= '->-' | kw= '->*' ) ;
    public final AntlrDatatypeRuleToken ruleABinaryCalcOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:6182:2: ( (kw= 'cross' | kw= '+' | kw= '-' | kw= '*' | kw= '@' | kw= '->-' | kw= '->*' ) )
            // InternalAlpha.g:6183:2: (kw= 'cross' | kw= '+' | kw= '-' | kw= '*' | kw= '@' | kw= '->-' | kw= '->*' )
            {
            // InternalAlpha.g:6183:2: (kw= 'cross' | kw= '+' | kw= '-' | kw= '*' | kw= '@' | kw= '->-' | kw= '->*' )
            int alt91=7;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt91=1;
                }
                break;
            case 41:
                {
                alt91=2;
                }
                break;
            case 42:
                {
                alt91=3;
                }
                break;
            case 43:
                {
                alt91=4;
                }
                break;
            case 60:
                {
                alt91=5;
                }
                break;
            case 82:
                {
                alt91=6;
                }
                break;
            case 83:
                {
                alt91=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalAlpha.g:6184:3: kw= 'cross'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getCrossKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:6190:3: kw= '+'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getPlusSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:6196:3: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getHyphenMinusKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:6202:3: kw= '*'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getAsteriskKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:6208:3: kw= '@'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getCommercialAtKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:6214:3: kw= '->-'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getHyphenMinusGreaterThanSignHyphenMinusKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalAlpha.g:6220:3: kw= '->*'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getHyphenMinusGreaterThanSignAsteriskKeyword_6());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleABinaryCalcOp"

    // Delegated rules


    protected DFA54 dfa54 = new DFA54(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA86 dfa86 = new DFA86(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\4\uffff\1\22\24\uffff";
    static final String dfa_3s = "\2\4\2\uffff\1\16\1\uffff\1\20\2\uffff\2\20\3\uffff\1\16\4\uffff\2\4\4\uffff";
    static final String dfa_4s = "\1\107\1\111\2\uffff\1\110\1\uffff\1\24\2\uffff\2\20\3\uffff\1\110\4\uffff\2\107\4\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\uffff\1\6\1\uffff\1\7\1\10\2\uffff\1\13\1\16\1\20\1\uffff\1\5\1\1\1\17\1\4\2\uffff\1\14\1\11\1\15\1\12";
    static final String dfa_6s = "\31\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\1\3\1\uffff\2\3\7\uffff\1\1\3\uffff\1\5\15\uffff\1\7\2\uffff\1\10\3\uffff\1\14\1\uffff\1\14\2\uffff\2\14\13\uffff\1\2\1\uffff\1\6\1\11\1\12\1\13\1\15\1\uffff\5\14",
            "\1\16\1\20\1\uffff\2\20\7\uffff\1\20\3\uffff\1\20\15\uffff\1\20\2\uffff\1\20\2\uffff\1\17\3\20\2\uffff\2\20\7\uffff\1\20\2\uffff\2\20\1\uffff\5\20\1\uffff\5\20\1\uffff\1\20",
            "",
            "",
            "\1\22\1\uffff\1\21\1\22\17\uffff\1\22\1\17\1\22\1\uffff\1\5\3\uffff\4\22\1\uffff\2\22\2\uffff\4\22\2\uffff\2\22\11\uffff\2\22\2\uffff\2\22",
            "",
            "\1\7\3\uffff\1\10",
            "",
            "",
            "\1\23",
            "\1\24",
            "",
            "",
            "",
            "\1\20\1\uffff\2\20\20\uffff\1\20\1\17\1\uffff\1\20\2\uffff\1\17\4\20\1\uffff\2\20\2\uffff\4\20\15\uffff\2\20\2\uffff\2\20",
            "",
            "",
            "",
            "",
            "\1\25\44\uffff\1\26\1\uffff\1\26\2\uffff\2\26\23\uffff\5\26",
            "\1\27\44\uffff\1\30\1\uffff\1\30\2\uffff\2\30\23\uffff\5\30",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2968:2: ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_ConstantExpression_4= ruleConstantExpression | this_VariableExpression_5= ruleVariableExpression | this_DependenceExpression_6= ruleDependenceExpression | this_FuzzyDependenceExpression_7= ruleFuzzyDependenceExpression | this_IndexExpression_8= ruleIndexExpression | this_FuzzyIndexExpression_9= ruleFuzzyIndexExpression | this_ReduceExpression_10= ruleReduceExpression | this_ArgReduceExpression_11= ruleArgReduceExpression | this_ConvolutionExpression_12= ruleConvolutionExpression | this_ExternalReduceExpression_13= ruleExternalReduceExpression | this_ExternalArgReduceExpression_14= ruleExternalArgReduceExpression | this_MultiArgExpression_15= ruleMultiArgExpression | this_ExternalMultiArgExpression_16= ruleExternalMultiArgExpression | this_SelectExpression_17= ruleSelectExpression )";
        }
    }
    static final String dfa_8s = "\11\uffff";
    static final String dfa_9s = "\1\24\1\4\1\uffff\1\4\1\uffff\1\43\1\4\1\25\1\43";
    static final String dfa_10s = "\1\24\1\120\1\uffff\1\44\1\uffff\1\44\1\4\1\123\1\44";
    static final String dfa_11s = "\2\uffff\1\1\1\uffff\1\2\4\uffff";
    static final String dfa_12s = "\11\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\4\13\uffff\1\4\3\uffff\1\4\13\uffff\1\2\1\uffff\1\3\50\uffff\6\4",
            "",
            "\1\5\37\uffff\1\2",
            "",
            "\1\6\1\7",
            "\1\10",
            "\1\4\12\uffff\1\2\10\uffff\3\4\20\uffff\1\4\15\uffff\1\4\6\uffff\3\4",
            "\1\6\1\7"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3228:2: ( ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) | (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) ) )";
        }
    }
    static final String dfa_14s = "\20\uffff";
    static final String dfa_15s = "\3\4\2\uffff\1\4\2\uffff\1\21\1\uffff\1\43\1\40\1\4\2\uffff\1\43";
    static final String dfa_16s = "\2\42\1\120\2\uffff\1\44\2\uffff\1\123\1\uffff\1\44\1\50\1\4\2\uffff\1\44";
    static final String dfa_17s = "\3\uffff\1\4\1\5\1\uffff\1\6\1\7\1\uffff\1\3\3\uffff\1\1\1\2\1\uffff";
    static final String dfa_18s = "\20\uffff}>";
    static final String[] dfa_19s = {
            "\1\3\13\uffff\1\2\3\uffff\1\1\15\uffff\1\4",
            "\1\6\35\uffff\1\5",
            "\1\10\13\uffff\1\7\3\uffff\1\7\15\uffff\1\7\5\uffff\1\11\42\uffff\6\7",
            "",
            "",
            "\1\12\37\uffff\1\13",
            "",
            "",
            "\1\7\21\uffff\1\11\4\uffff\1\11\3\7\20\uffff\1\7\24\uffff\3\7",
            "",
            "\1\14\1\13",
            "\1\15\7\uffff\1\16",
            "\1\17",
            "",
            "",
            "\1\14\1\13"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "5782:2: (this_JNIDomain_0= ruleJNIDomain | this_JNIRelation_1= ruleJNIRelation | this_JNIFunction_2= ruleJNIFunction | this_DefinedObject_3= ruleDefinedObject | this_RectangularDomain_4= ruleRectangularDomain | this_VariableDomain_5= ruleVariableDomain | (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000004CA002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000006CA000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000DF800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000DF000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000DE000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000DC000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000D8000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000D0000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400110010L,0x000000000001F800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0xEC80CE24001101B0L,0x00000000000002FBL});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000090010010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000600110012L,0x000000000001F800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x003FFE1D00234070L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00003E1000004070L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00003E0000004070L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00003E5400004070L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00003E1400004070L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x003FFE1D00034070L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x003FFE1D00034072L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00003E0000004072L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00003E0000024070L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00003E1400004072L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000400004000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0040000100000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0xEC80CE24001301B0L,0x00000000000002FBL});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000800020000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x2000000400000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0xEC80CE24003101B0L,0x00000000000002FBL});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x2000002000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000CA0000000000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x2000000400010000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000800000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x003C000000004002L,0x0000000000000100L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x10000E0000000002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});

}