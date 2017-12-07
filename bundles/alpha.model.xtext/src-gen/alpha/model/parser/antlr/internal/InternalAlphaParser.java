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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_BOOLEAN", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'constant'", "'='", "'external'", "'('", "')'", "'import'", "'package'", "'{'", "'}'", "'affine'", "'define'", "'inputs'", "'outputs'", "'locals'", "'fuzzy'", "'over'", "'while'", "'let'", "'.'", "':'", "'.*'", "'\\''", "','", "'['", "']'", "'->'", "';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'and'", "'or'", "'&'", "'|'", "'>='", "'>'", "'<'", "'<='", "'with'", "'if'", "'then'", "'else'", "'auto'", "'case'", "'@'", "'val'", "'reduce'", "'argreduce'", "'conv'", "'select'", "'from'", "'min'", "'max'", "'prod'", "'sum'", "'xor'", "'!='", "'not'", "'as'", "'domain'", "'range'", "'complement'", "'affine-hull'", "'poly-hull'", "'reverse'", "'cross'", "'->-'", "'->*'"
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
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // InternalAlpha.g:236:1: ruleExternalFunction returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_cardinarity_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleExternalFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_cardinarity_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAlpha.g:242:2: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_cardinarity_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalAlpha.g:243:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_cardinarity_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalAlpha.g:243:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_cardinarity_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalAlpha.g:244:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_cardinarity_3_0= RULE_INT ) ) otherlv_4= ')'
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
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalAlpha.g:270:3: ( (lv_cardinarity_3_0= RULE_INT ) )
            // InternalAlpha.g:271:4: (lv_cardinarity_3_0= RULE_INT )
            {
            // InternalAlpha.g:271:4: (lv_cardinarity_3_0= RULE_INT )
            // InternalAlpha.g:272:5: lv_cardinarity_3_0= RULE_INT
            {
            lv_cardinarity_3_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_cardinarity_3_0, grammarAccess.getExternalFunctionAccess().getCardinarityINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cardinarity",
            						lv_cardinarity_3_0,
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
    // InternalAlpha.g:464:1: ruleAlphaSystem returns [EObject current=null] : (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameterDomain_2_0= ruleJNIParamDomain ) ) (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )? (otherlv_5= 'inputs' ( (lv_inputs_6_0= ruleInputVariable ) )+ )? (otherlv_7= 'outputs' ( (lv_outputs_8_0= ruleOutputVariable ) )+ )? (otherlv_9= 'locals' ( (lv_locals_10_0= ruleLocalVariable ) )+ )? (otherlv_11= 'fuzzy' ( (lv_fuzzyVariables_12_0= ruleFuzzyVariable ) )+ )? (otherlv_13= 'over' ( (lv_whileDomain_14_0= ruleCalculatorExpression ) ) otherlv_15= 'while' otherlv_16= '(' ( (lv_testExpression_17_0= ruleAlphaExpression ) ) otherlv_18= ')' )? (otherlv_19= 'let' ( (lv_useEquations_20_0= ruleUseEquation ) )* ( (lv_equations_21_0= ruleStandardEquation ) )* )? otherlv_22= '.' ) ;
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

        EObject lv_parameterDomain_2_0 = null;

        EObject lv_definedObjects_4_0 = null;

        EObject lv_inputs_6_0 = null;

        EObject lv_outputs_8_0 = null;

        EObject lv_locals_10_0 = null;

        EObject lv_fuzzyVariables_12_0 = null;

        EObject lv_whileDomain_14_0 = null;

        EObject lv_testExpression_17_0 = null;

        EObject lv_useEquations_20_0 = null;

        EObject lv_equations_21_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:470:2: ( (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameterDomain_2_0= ruleJNIParamDomain ) ) (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )? (otherlv_5= 'inputs' ( (lv_inputs_6_0= ruleInputVariable ) )+ )? (otherlv_7= 'outputs' ( (lv_outputs_8_0= ruleOutputVariable ) )+ )? (otherlv_9= 'locals' ( (lv_locals_10_0= ruleLocalVariable ) )+ )? (otherlv_11= 'fuzzy' ( (lv_fuzzyVariables_12_0= ruleFuzzyVariable ) )+ )? (otherlv_13= 'over' ( (lv_whileDomain_14_0= ruleCalculatorExpression ) ) otherlv_15= 'while' otherlv_16= '(' ( (lv_testExpression_17_0= ruleAlphaExpression ) ) otherlv_18= ')' )? (otherlv_19= 'let' ( (lv_useEquations_20_0= ruleUseEquation ) )* ( (lv_equations_21_0= ruleStandardEquation ) )* )? otherlv_22= '.' ) )
            // InternalAlpha.g:471:2: (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameterDomain_2_0= ruleJNIParamDomain ) ) (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )? (otherlv_5= 'inputs' ( (lv_inputs_6_0= ruleInputVariable ) )+ )? (otherlv_7= 'outputs' ( (lv_outputs_8_0= ruleOutputVariable ) )+ )? (otherlv_9= 'locals' ( (lv_locals_10_0= ruleLocalVariable ) )+ )? (otherlv_11= 'fuzzy' ( (lv_fuzzyVariables_12_0= ruleFuzzyVariable ) )+ )? (otherlv_13= 'over' ( (lv_whileDomain_14_0= ruleCalculatorExpression ) ) otherlv_15= 'while' otherlv_16= '(' ( (lv_testExpression_17_0= ruleAlphaExpression ) ) otherlv_18= ')' )? (otherlv_19= 'let' ( (lv_useEquations_20_0= ruleUseEquation ) )* ( (lv_equations_21_0= ruleStandardEquation ) )* )? otherlv_22= '.' )
            {
            // InternalAlpha.g:471:2: (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameterDomain_2_0= ruleJNIParamDomain ) ) (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )? (otherlv_5= 'inputs' ( (lv_inputs_6_0= ruleInputVariable ) )+ )? (otherlv_7= 'outputs' ( (lv_outputs_8_0= ruleOutputVariable ) )+ )? (otherlv_9= 'locals' ( (lv_locals_10_0= ruleLocalVariable ) )+ )? (otherlv_11= 'fuzzy' ( (lv_fuzzyVariables_12_0= ruleFuzzyVariable ) )+ )? (otherlv_13= 'over' ( (lv_whileDomain_14_0= ruleCalculatorExpression ) ) otherlv_15= 'while' otherlv_16= '(' ( (lv_testExpression_17_0= ruleAlphaExpression ) ) otherlv_18= ')' )? (otherlv_19= 'let' ( (lv_useEquations_20_0= ruleUseEquation ) )* ( (lv_equations_21_0= ruleStandardEquation ) )* )? otherlv_22= '.' )
            // InternalAlpha.g:472:3: otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameterDomain_2_0= ruleJNIParamDomain ) ) (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )? (otherlv_5= 'inputs' ( (lv_inputs_6_0= ruleInputVariable ) )+ )? (otherlv_7= 'outputs' ( (lv_outputs_8_0= ruleOutputVariable ) )+ )? (otherlv_9= 'locals' ( (lv_locals_10_0= ruleLocalVariable ) )+ )? (otherlv_11= 'fuzzy' ( (lv_fuzzyVariables_12_0= ruleFuzzyVariable ) )+ )? (otherlv_13= 'over' ( (lv_whileDomain_14_0= ruleCalculatorExpression ) ) otherlv_15= 'while' otherlv_16= '(' ( (lv_testExpression_17_0= ruleAlphaExpression ) ) otherlv_18= ')' )? (otherlv_19= 'let' ( (lv_useEquations_20_0= ruleUseEquation ) )* ( (lv_equations_21_0= ruleStandardEquation ) )* )? otherlv_22= '.'
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

            // InternalAlpha.g:495:3: ( (lv_parameterDomain_2_0= ruleJNIParamDomain ) )
            // InternalAlpha.g:496:4: (lv_parameterDomain_2_0= ruleJNIParamDomain )
            {
            // InternalAlpha.g:496:4: (lv_parameterDomain_2_0= ruleJNIParamDomain )
            // InternalAlpha.g:497:5: lv_parameterDomain_2_0= ruleJNIParamDomain
            {

            					newCompositeNode(grammarAccess.getAlphaSystemAccess().getParameterDomainJNIParamDomainParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_parameterDomain_2_0=ruleJNIParamDomain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
            					}
            					set(
            						current,
            						"parameterDomain",
            						lv_parameterDomain_2_0,
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

            // InternalAlpha.g:639:3: (otherlv_13= 'over' ( (lv_whileDomain_14_0= ruleCalculatorExpression ) ) otherlv_15= 'while' otherlv_16= '(' ( (lv_testExpression_17_0= ruleAlphaExpression ) ) otherlv_18= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAlpha.g:640:4: otherlv_13= 'over' ( (lv_whileDomain_14_0= ruleCalculatorExpression ) ) otherlv_15= 'while' otherlv_16= '(' ( (lv_testExpression_17_0= ruleAlphaExpression ) ) otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,28,FOLLOW_18); 

                    				newLeafNode(otherlv_13, grammarAccess.getAlphaSystemAccess().getOverKeyword_8_0());
                    			
                    // InternalAlpha.g:644:4: ( (lv_whileDomain_14_0= ruleCalculatorExpression ) )
                    // InternalAlpha.g:645:5: (lv_whileDomain_14_0= ruleCalculatorExpression )
                    {
                    // InternalAlpha.g:645:5: (lv_whileDomain_14_0= ruleCalculatorExpression )
                    // InternalAlpha.g:646:6: lv_whileDomain_14_0= ruleCalculatorExpression
                    {

                    						newCompositeNode(grammarAccess.getAlphaSystemAccess().getWhileDomainCalculatorExpressionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_whileDomain_14_0=ruleCalculatorExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    						}
                    						set(
                    							current,
                    							"whileDomain",
                    							lv_whileDomain_14_0,
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
    // InternalAlpha.g:754:1: ruleInputVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? ) ;
    public final EObject ruleInputVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_domainExpr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:760:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? ) )
            // InternalAlpha.g:761:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? )
            {
            // InternalAlpha.g:761:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? )
            // InternalAlpha.g:762:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )?
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
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getInputVariableAccess().getColonKeyword_1());
            		
            // InternalAlpha.g:784:3: ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==16||LA19_0==20||LA19_0==36||(LA19_0>=74 && LA19_0<=79)) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==EOF||LA19_2==RULE_ID||(LA19_2>=25 && LA19_2<=28)||(LA19_2>=30 && LA19_2<=31)||(LA19_2>=40 && LA19_2<=42)||LA19_2==59||(LA19_2>=80 && LA19_2<=82)) ) {
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
                    				
                    pushFollow(FOLLOW_2);
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
    // InternalAlpha.g:807:1: entryRuleOutputVariable returns [EObject current=null] : iv_ruleOutputVariable= ruleOutputVariable EOF ;
    public final EObject entryRuleOutputVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputVariable = null;


        try {
            // InternalAlpha.g:807:55: (iv_ruleOutputVariable= ruleOutputVariable EOF )
            // InternalAlpha.g:808:2: iv_ruleOutputVariable= ruleOutputVariable EOF
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
    // InternalAlpha.g:814:1: ruleOutputVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? ) ;
    public final EObject ruleOutputVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_domainExpr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:820:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? ) )
            // InternalAlpha.g:821:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? )
            {
            // InternalAlpha.g:821:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? )
            // InternalAlpha.g:822:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )?
            {
            // InternalAlpha.g:822:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:823:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:823:4: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:824:5: lv_name_0_0= RULE_ID
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
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputVariableAccess().getColonKeyword_1());
            		
            // InternalAlpha.g:844:3: ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16||LA20_0==20||LA20_0==36||(LA20_0>=74 && LA20_0<=79)) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==EOF||LA20_2==RULE_ID||(LA20_2>=26 && LA20_2<=28)||(LA20_2>=30 && LA20_2<=31)||(LA20_2>=40 && LA20_2<=42)||LA20_2==59||(LA20_2>=80 && LA20_2<=82)) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalAlpha.g:845:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
                    {
                    // InternalAlpha.g:845:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
                    // InternalAlpha.g:846:5: lv_domainExpr_2_0= ruleCalculatorExpression
                    {

                    					newCompositeNode(grammarAccess.getOutputVariableAccess().getDomainExprCalculatorExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
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
    // InternalAlpha.g:867:1: entryRuleLocalVariable returns [EObject current=null] : iv_ruleLocalVariable= ruleLocalVariable EOF ;
    public final EObject entryRuleLocalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariable = null;


        try {
            // InternalAlpha.g:867:54: (iv_ruleLocalVariable= ruleLocalVariable EOF )
            // InternalAlpha.g:868:2: iv_ruleLocalVariable= ruleLocalVariable EOF
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
    // InternalAlpha.g:874:1: ruleLocalVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? ) ;
    public final EObject ruleLocalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_domainExpr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:880:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? ) )
            // InternalAlpha.g:881:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? )
            {
            // InternalAlpha.g:881:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? )
            // InternalAlpha.g:882:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )?
            {
            // InternalAlpha.g:882:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:883:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:883:4: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:884:5: lv_name_0_0= RULE_ID
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
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalVariableAccess().getColonKeyword_1());
            		
            // InternalAlpha.g:904:3: ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==16||LA21_0==20||LA21_0==36||(LA21_0>=74 && LA21_0<=79)) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==EOF||LA21_2==RULE_ID||(LA21_2>=27 && LA21_2<=28)||(LA21_2>=30 && LA21_2<=31)||(LA21_2>=40 && LA21_2<=42)||LA21_2==59||(LA21_2>=80 && LA21_2<=82)) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalAlpha.g:905:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
                    {
                    // InternalAlpha.g:905:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
                    // InternalAlpha.g:906:5: lv_domainExpr_2_0= ruleCalculatorExpression
                    {

                    					newCompositeNode(grammarAccess.getLocalVariableAccess().getDomainExprCalculatorExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
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
    // InternalAlpha.g:927:1: entryRuleFuzzyVariable returns [EObject current=null] : iv_ruleFuzzyVariable= ruleFuzzyVariable EOF ;
    public final EObject entryRuleFuzzyVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyVariable = null;


        try {
            // InternalAlpha.g:927:54: (iv_ruleFuzzyVariable= ruleFuzzyVariable EOF )
            // InternalAlpha.g:928:2: iv_ruleFuzzyVariable= ruleFuzzyVariable EOF
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
    // InternalAlpha.g:934:1: ruleFuzzyVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? ) ;
    public final EObject ruleFuzzyVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_domainExpr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:940:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? ) )
            // InternalAlpha.g:941:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? )
            {
            // InternalAlpha.g:941:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? )
            // InternalAlpha.g:942:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )?
            {
            // InternalAlpha.g:942:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:943:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:943:4: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:944:5: lv_name_0_0= RULE_ID
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
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getFuzzyVariableAccess().getColonKeyword_1());
            		
            // InternalAlpha.g:964:3: ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==16||LA22_0==20||LA22_0==36||(LA22_0>=74 && LA22_0<=79)) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==EOF||LA22_2==RULE_ID||LA22_2==28||(LA22_2>=30 && LA22_2<=31)||(LA22_2>=40 && LA22_2<=42)||LA22_2==59||(LA22_2>=80 && LA22_2<=82)) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalAlpha.g:965:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
                    {
                    // InternalAlpha.g:965:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
                    // InternalAlpha.g:966:5: lv_domainExpr_2_0= ruleCalculatorExpression
                    {

                    					newCompositeNode(grammarAccess.getFuzzyVariableAccess().getDomainExprCalculatorExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
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
    // InternalAlpha.g:987:1: entryRuleJNIDomain returns [EObject current=null] : iv_ruleJNIDomain= ruleJNIDomain EOF ;
    public final EObject entryRuleJNIDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIDomain = null;


        try {
            // InternalAlpha.g:987:50: (iv_ruleJNIDomain= ruleJNIDomain EOF )
            // InternalAlpha.g:988:2: iv_ruleJNIDomain= ruleJNIDomain EOF
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
    // InternalAlpha.g:994:1: ruleJNIDomain returns [EObject current=null] : ( (lv_islString_0_0= ruleAISLSet ) ) ;
    public final EObject ruleJNIDomain() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_islString_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1000:2: ( ( (lv_islString_0_0= ruleAISLSet ) ) )
            // InternalAlpha.g:1001:2: ( (lv_islString_0_0= ruleAISLSet ) )
            {
            // InternalAlpha.g:1001:2: ( (lv_islString_0_0= ruleAISLSet ) )
            // InternalAlpha.g:1002:3: (lv_islString_0_0= ruleAISLSet )
            {
            // InternalAlpha.g:1002:3: (lv_islString_0_0= ruleAISLSet )
            // InternalAlpha.g:1003:4: lv_islString_0_0= ruleAISLSet
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


    // $ANTLR start "entryRuleJNIParamDomain"
    // InternalAlpha.g:1023:1: entryRuleJNIParamDomain returns [EObject current=null] : iv_ruleJNIParamDomain= ruleJNIParamDomain EOF ;
    public final EObject entryRuleJNIParamDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIParamDomain = null;


        try {
            // InternalAlpha.g:1023:55: (iv_ruleJNIParamDomain= ruleJNIParamDomain EOF )
            // InternalAlpha.g:1024:2: iv_ruleJNIParamDomain= ruleJNIParamDomain EOF
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
    // InternalAlpha.g:1030:1: ruleJNIParamDomain returns [EObject current=null] : ( (lv_islString_0_0= ruleAParamDomain ) ) ;
    public final EObject ruleJNIParamDomain() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_islString_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1036:2: ( ( (lv_islString_0_0= ruleAParamDomain ) ) )
            // InternalAlpha.g:1037:2: ( (lv_islString_0_0= ruleAParamDomain ) )
            {
            // InternalAlpha.g:1037:2: ( (lv_islString_0_0= ruleAParamDomain ) )
            // InternalAlpha.g:1038:3: (lv_islString_0_0= ruleAParamDomain )
            {
            // InternalAlpha.g:1038:3: (lv_islString_0_0= ruleAParamDomain )
            // InternalAlpha.g:1039:4: lv_islString_0_0= ruleAParamDomain
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
    // InternalAlpha.g:1059:1: entryRuleJNIRelation returns [EObject current=null] : iv_ruleJNIRelation= ruleJNIRelation EOF ;
    public final EObject entryRuleJNIRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIRelation = null;


        try {
            // InternalAlpha.g:1059:52: (iv_ruleJNIRelation= ruleJNIRelation EOF )
            // InternalAlpha.g:1060:2: iv_ruleJNIRelation= ruleJNIRelation EOF
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
    // InternalAlpha.g:1066:1: ruleJNIRelation returns [EObject current=null] : ( (lv_islString_0_0= ruleAISLRelation ) ) ;
    public final EObject ruleJNIRelation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_islString_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1072:2: ( ( (lv_islString_0_0= ruleAISLRelation ) ) )
            // InternalAlpha.g:1073:2: ( (lv_islString_0_0= ruleAISLRelation ) )
            {
            // InternalAlpha.g:1073:2: ( (lv_islString_0_0= ruleAISLRelation ) )
            // InternalAlpha.g:1074:3: (lv_islString_0_0= ruleAISLRelation )
            {
            // InternalAlpha.g:1074:3: (lv_islString_0_0= ruleAISLRelation )
            // InternalAlpha.g:1075:4: lv_islString_0_0= ruleAISLRelation
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
    // InternalAlpha.g:1095:1: entryRuleJNIFunction returns [EObject current=null] : iv_ruleJNIFunction= ruleJNIFunction EOF ;
    public final EObject entryRuleJNIFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIFunction = null;


        try {
            // InternalAlpha.g:1095:52: (iv_ruleJNIFunction= ruleJNIFunction EOF )
            // InternalAlpha.g:1096:2: iv_ruleJNIFunction= ruleJNIFunction EOF
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
    // InternalAlpha.g:1102:1: ruleJNIFunction returns [EObject current=null] : ( (lv_alphaString_0_0= ruleAAlphaFunction ) ) ;
    public final EObject ruleJNIFunction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_alphaString_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1108:2: ( ( (lv_alphaString_0_0= ruleAAlphaFunction ) ) )
            // InternalAlpha.g:1109:2: ( (lv_alphaString_0_0= ruleAAlphaFunction ) )
            {
            // InternalAlpha.g:1109:2: ( (lv_alphaString_0_0= ruleAAlphaFunction ) )
            // InternalAlpha.g:1110:3: (lv_alphaString_0_0= ruleAAlphaFunction )
            {
            // InternalAlpha.g:1110:3: (lv_alphaString_0_0= ruleAAlphaFunction )
            // InternalAlpha.g:1111:4: lv_alphaString_0_0= ruleAAlphaFunction
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
    // InternalAlpha.g:1131:1: entryRuleJNIFunctionInArrayNotation returns [EObject current=null] : iv_ruleJNIFunctionInArrayNotation= ruleJNIFunctionInArrayNotation EOF ;
    public final EObject entryRuleJNIFunctionInArrayNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIFunctionInArrayNotation = null;


        try {
            // InternalAlpha.g:1131:67: (iv_ruleJNIFunctionInArrayNotation= ruleJNIFunctionInArrayNotation EOF )
            // InternalAlpha.g:1132:2: iv_ruleJNIFunctionInArrayNotation= ruleJNIFunctionInArrayNotation EOF
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
    // InternalAlpha.g:1138:1: ruleJNIFunctionInArrayNotation returns [EObject current=null] : ( (lv_arrayNotation_0_0= ruleAAlphaFunctionInArrayNotation ) ) ;
    public final EObject ruleJNIFunctionInArrayNotation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_arrayNotation_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1144:2: ( ( (lv_arrayNotation_0_0= ruleAAlphaFunctionInArrayNotation ) ) )
            // InternalAlpha.g:1145:2: ( (lv_arrayNotation_0_0= ruleAAlphaFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:1145:2: ( (lv_arrayNotation_0_0= ruleAAlphaFunctionInArrayNotation ) )
            // InternalAlpha.g:1146:3: (lv_arrayNotation_0_0= ruleAAlphaFunctionInArrayNotation )
            {
            // InternalAlpha.g:1146:3: (lv_arrayNotation_0_0= ruleAAlphaFunctionInArrayNotation )
            // InternalAlpha.g:1147:4: lv_arrayNotation_0_0= ruleAAlphaFunctionInArrayNotation
            {

            				newCompositeNode(grammarAccess.getJNIFunctionInArrayNotationAccess().getArrayNotationAAlphaFunctionInArrayNotationParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_arrayNotation_0_0=ruleAAlphaFunctionInArrayNotation();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getJNIFunctionInArrayNotationRule());
            				}
            				set(
            					current,
            					"arrayNotation",
            					lv_arrayNotation_0_0,
            					"alpha.model.Alpha.AAlphaFunctionInArrayNotation");
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
    // $ANTLR end "ruleJNIFunctionInArrayNotation"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAlpha.g:1167:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlpha.g:1167:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlpha.g:1168:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlpha.g:1174:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAlpha.g:1180:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAlpha.g:1181:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAlpha.g:1181:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAlpha.g:1182:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalAlpha.g:1189:3: (kw= '.' this_ID_2= RULE_ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==31) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAlpha.g:1190:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_26); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalAlpha.g:1207:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAlpha.g:1207:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAlpha.g:1208:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalAlpha.g:1214:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1220:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalAlpha.g:1221:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalAlpha.g:1221:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalAlpha.g:1222:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:1232:3: (kw= '.*' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAlpha.g:1233:4: kw= '.*'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

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
    // InternalAlpha.g:1243:1: entryRuleSystemName returns [String current=null] : iv_ruleSystemName= ruleSystemName EOF ;
    public final String entryRuleSystemName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSystemName = null;


        try {
            // InternalAlpha.g:1243:50: (iv_ruleSystemName= ruleSystemName EOF )
            // InternalAlpha.g:1244:2: iv_ruleSystemName= ruleSystemName EOF
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
    // InternalAlpha.g:1250:1: ruleSystemName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleSystemName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:1256:2: (this_ID_0= RULE_ID )
            // InternalAlpha.g:1257:2: this_ID_0= RULE_ID
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
    // InternalAlpha.g:1267:1: entryRuleIndexName returns [String current=null] : iv_ruleIndexName= ruleIndexName EOF ;
    public final String entryRuleIndexName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIndexName = null;


        try {
            // InternalAlpha.g:1267:49: (iv_ruleIndexName= ruleIndexName EOF )
            // InternalAlpha.g:1268:2: iv_ruleIndexName= ruleIndexName EOF
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
    // InternalAlpha.g:1274:1: ruleIndexName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '\\'' )* ) ;
    public final AntlrDatatypeRuleToken ruleIndexName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:1280:2: ( (this_ID_0= RULE_ID (kw= '\\'' )* ) )
            // InternalAlpha.g:1281:2: (this_ID_0= RULE_ID (kw= '\\'' )* )
            {
            // InternalAlpha.g:1281:2: (this_ID_0= RULE_ID (kw= '\\'' )* )
            // InternalAlpha.g:1282:3: this_ID_0= RULE_ID (kw= '\\'' )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getIndexNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalAlpha.g:1289:3: (kw= '\\'' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==34) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAlpha.g:1290:4: kw= '\\''
            	    {
            	    kw=(Token)match(input,34,FOLLOW_28); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getIndexNameAccess().getApostropheKeyword_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "ruleIndexName"


    // $ANTLR start "entryRuleAIndexList"
    // InternalAlpha.g:1300:1: entryRuleAIndexList returns [String current=null] : iv_ruleAIndexList= ruleAIndexList EOF ;
    public final String entryRuleAIndexList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAIndexList = null;


        try {
            // InternalAlpha.g:1300:50: (iv_ruleAIndexList= ruleAIndexList EOF )
            // InternalAlpha.g:1301:2: iv_ruleAIndexList= ruleAIndexList EOF
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
    // InternalAlpha.g:1307:1: ruleAIndexList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IndexName_0= ruleIndexName (kw= ',' this_IndexName_2= ruleIndexName )* )? ;
    public final AntlrDatatypeRuleToken ruleAIndexList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IndexName_0 = null;

        AntlrDatatypeRuleToken this_IndexName_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1313:2: ( (this_IndexName_0= ruleIndexName (kw= ',' this_IndexName_2= ruleIndexName )* )? )
            // InternalAlpha.g:1314:2: (this_IndexName_0= ruleIndexName (kw= ',' this_IndexName_2= ruleIndexName )* )?
            {
            // InternalAlpha.g:1314:2: (this_IndexName_0= ruleIndexName (kw= ',' this_IndexName_2= ruleIndexName )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAlpha.g:1315:3: this_IndexName_0= ruleIndexName (kw= ',' this_IndexName_2= ruleIndexName )*
                    {

                    			newCompositeNode(grammarAccess.getAIndexListAccess().getIndexNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_29);
                    this_IndexName_0=ruleIndexName();

                    state._fsp--;


                    			current.merge(this_IndexName_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		
                    // InternalAlpha.g:1325:3: (kw= ',' this_IndexName_2= ruleIndexName )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==35) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalAlpha.g:1326:4: kw= ',' this_IndexName_2= ruleIndexName
                    	    {
                    	    kw=(Token)match(input,35,FOLLOW_4); 

                    	    				current.merge(kw);
                    	    				newLeafNode(kw, grammarAccess.getAIndexListAccess().getCommaKeyword_1_0());
                    	    			

                    	    				newCompositeNode(grammarAccess.getAIndexListAccess().getIndexNameParserRuleCall_1_1());
                    	    			
                    	    pushFollow(FOLLOW_29);
                    	    this_IndexName_2=ruleIndexName();

                    	    state._fsp--;


                    	    				current.merge(this_IndexName_2);
                    	    			

                    	    				afterParserOrEnumRuleCall();
                    	    			

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
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
    // InternalAlpha.g:1346:1: entryRuleAParamDomain returns [String current=null] : iv_ruleAParamDomain= ruleAParamDomain EOF ;
    public final String entryRuleAParamDomain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAParamDomain = null;


        try {
            // InternalAlpha.g:1346:52: (iv_ruleAParamDomain= ruleAParamDomain EOF )
            // InternalAlpha.g:1347:2: iv_ruleAParamDomain= ruleAParamDomain EOF
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
    // InternalAlpha.g:1353:1: ruleAParamDomain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_AISLString_6= ruleAISLString kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleAParamDomain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AIndexList_1 = null;

        AntlrDatatypeRuleToken this_AISLString_6 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1359:2: ( (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_AISLString_6= ruleAISLString kw= '}' ) )
            // InternalAlpha.g:1360:2: (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_AISLString_6= ruleAISLString kw= '}' )
            {
            // InternalAlpha.g:1360:2: (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_AISLString_6= ruleAISLString kw= '}' )
            // InternalAlpha.g:1361:3: kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_AISLString_6= ruleAISLString kw= '}'
            {
            kw=(Token)match(input,36,FOLLOW_30); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAParamDomainAccess().getAIndexListParserRuleCall_1());
            		
            pushFollow(FOLLOW_31);
            this_AIndexList_1=ruleAIndexList();

            state._fsp--;


            			current.merge(this_AIndexList_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,37,FOLLOW_32); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getRightSquareBracketKeyword_2());
            		
            kw=(Token)match(input,38,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            kw=(Token)match(input,20,FOLLOW_24); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getLeftCurlyBracketKeyword_4());
            		
            kw=(Token)match(input,32,FOLLOW_33); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getColonKeyword_5());
            		

            			newCompositeNode(grammarAccess.getAParamDomainAccess().getAISLStringParserRuleCall_6());
            		
            pushFollow(FOLLOW_34);
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
    // InternalAlpha.g:1415:1: entryRuleAISLSet returns [String current=null] : iv_ruleAISLSet= ruleAISLSet EOF ;
    public final String entryRuleAISLSet() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLSet = null;


        try {
            // InternalAlpha.g:1415:47: (iv_ruleAISLSet= ruleAISLSet EOF )
            // InternalAlpha.g:1416:2: iv_ruleAISLSet= ruleAISLSet EOF
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
    // InternalAlpha.g:1422:1: ruleAISLSet returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleAISLSet() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLBasicSet_1 = null;

        AntlrDatatypeRuleToken this_AISLBasicSet_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1428:2: ( (kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}' ) )
            // InternalAlpha.g:1429:2: (kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}' )
            {
            // InternalAlpha.g:1429:2: (kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}' )
            // InternalAlpha.g:1430:3: kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}'
            {
            kw=(Token)match(input,20,FOLLOW_35); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLSetAccess().getLeftCurlyBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAISLSetAccess().getAISLBasicSetParserRuleCall_1());
            		
            pushFollow(FOLLOW_36);
            this_AISLBasicSet_1=ruleAISLBasicSet();

            state._fsp--;


            			current.merge(this_AISLBasicSet_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:1445:3: (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==39) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAlpha.g:1446:4: kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet
            	    {
            	    kw=(Token)match(input,39,FOLLOW_35); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getAISLSetAccess().getSemicolonKeyword_2_0());
            	    			

            	    				newCompositeNode(grammarAccess.getAISLSetAccess().getAISLBasicSetParserRuleCall_2_1());
            	    			
            	    pushFollow(FOLLOW_36);
            	    this_AISLBasicSet_3=ruleAISLBasicSet();

            	    state._fsp--;


            	    				current.merge(this_AISLBasicSet_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalAlpha.g:1471:1: entryRuleAISLBasicSet returns [String current=null] : iv_ruleAISLBasicSet= ruleAISLBasicSet EOF ;
    public final String entryRuleAISLBasicSet() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLBasicSet = null;


        try {
            // InternalAlpha.g:1471:52: (iv_ruleAISLBasicSet= ruleAISLBasicSet EOF )
            // InternalAlpha.g:1472:2: iv_ruleAISLBasicSet= ruleAISLBasicSet EOF
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
    // InternalAlpha.g:1478:1: ruleAISLBasicSet returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' )? kw= ':' this_AISLString_4= ruleAISLString ) ;
    public final AntlrDatatypeRuleToken ruleAISLBasicSet() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AIndexList_1 = null;

        AntlrDatatypeRuleToken this_AISLString_4 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1484:2: ( ( (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' )? kw= ':' this_AISLString_4= ruleAISLString ) )
            // InternalAlpha.g:1485:2: ( (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' )? kw= ':' this_AISLString_4= ruleAISLString )
            {
            // InternalAlpha.g:1485:2: ( (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' )? kw= ':' this_AISLString_4= ruleAISLString )
            // InternalAlpha.g:1486:3: (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' )? kw= ':' this_AISLString_4= ruleAISLString
            {
            // InternalAlpha.g:1486:3: (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAlpha.g:1487:4: kw= '[' this_AIndexList_1= ruleAIndexList kw= ']'
                    {
                    kw=(Token)match(input,36,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAISLBasicSetAccess().getLeftSquareBracketKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getAISLBasicSetAccess().getAIndexListParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_31);
                    this_AIndexList_1=ruleAIndexList();

                    state._fsp--;


                    				current.merge(this_AIndexList_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,37,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAISLBasicSetAccess().getRightSquareBracketKeyword_0_2());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,32,FOLLOW_37); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicSetAccess().getColonKeyword_1());
            		

            			newCompositeNode(grammarAccess.getAISLBasicSetAccess().getAISLStringParserRuleCall_2());
            		
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
    // InternalAlpha.g:1527:1: entryRuleAISLRelation returns [String current=null] : iv_ruleAISLRelation= ruleAISLRelation EOF ;
    public final String entryRuleAISLRelation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLRelation = null;


        try {
            // InternalAlpha.g:1527:52: (iv_ruleAISLRelation= ruleAISLRelation EOF )
            // InternalAlpha.g:1528:2: iv_ruleAISLRelation= ruleAISLRelation EOF
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
    // InternalAlpha.g:1534:1: ruleAISLRelation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_AISLBasicRelation_1= ruleAISLBasicRelation (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleAISLRelation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLBasicRelation_1 = null;

        AntlrDatatypeRuleToken this_AISLBasicRelation_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1540:2: ( (kw= '{' this_AISLBasicRelation_1= ruleAISLBasicRelation (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )* kw= '}' ) )
            // InternalAlpha.g:1541:2: (kw= '{' this_AISLBasicRelation_1= ruleAISLBasicRelation (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )* kw= '}' )
            {
            // InternalAlpha.g:1541:2: (kw= '{' this_AISLBasicRelation_1= ruleAISLBasicRelation (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )* kw= '}' )
            // InternalAlpha.g:1542:3: kw= '{' this_AISLBasicRelation_1= ruleAISLBasicRelation (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )* kw= '}'
            {
            kw=(Token)match(input,20,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLRelationAccess().getLeftCurlyBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAISLRelationAccess().getAISLBasicRelationParserRuleCall_1());
            		
            pushFollow(FOLLOW_36);
            this_AISLBasicRelation_1=ruleAISLBasicRelation();

            state._fsp--;


            			current.merge(this_AISLBasicRelation_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:1557:3: (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==39) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAlpha.g:1558:4: kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation
            	    {
            	    kw=(Token)match(input,39,FOLLOW_11); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getAISLRelationAccess().getSemicolonKeyword_2_0());
            	    			

            	    				newCompositeNode(grammarAccess.getAISLRelationAccess().getAISLBasicRelationParserRuleCall_2_1());
            	    			
            	    pushFollow(FOLLOW_36);
            	    this_AISLBasicRelation_3=ruleAISLBasicRelation();

            	    state._fsp--;


            	    				current.merge(this_AISLBasicRelation_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop30;
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


    // $ANTLR start "entryRuleAISLBasicRelation"
    // InternalAlpha.g:1583:1: entryRuleAISLBasicRelation returns [String current=null] : iv_ruleAISLBasicRelation= ruleAISLBasicRelation EOF ;
    public final String entryRuleAISLBasicRelation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLBasicRelation = null;


        try {
            // InternalAlpha.g:1583:57: (iv_ruleAISLBasicRelation= ruleAISLBasicRelation EOF )
            // InternalAlpha.g:1584:2: iv_ruleAISLBasicRelation= ruleAISLBasicRelation EOF
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
    // InternalAlpha.g:1590:1: ruleAISLBasicRelation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AIndexList_5= ruleAIndexList kw= ']' kw= ':' this_AISLString_8= ruleAISLString ) ;
    public final AntlrDatatypeRuleToken ruleAISLBasicRelation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AIndexList_1 = null;

        AntlrDatatypeRuleToken this_AIndexList_5 = null;

        AntlrDatatypeRuleToken this_AISLString_8 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1596:2: ( (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AIndexList_5= ruleAIndexList kw= ']' kw= ':' this_AISLString_8= ruleAISLString ) )
            // InternalAlpha.g:1597:2: (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AIndexList_5= ruleAIndexList kw= ']' kw= ':' this_AISLString_8= ruleAISLString )
            {
            // InternalAlpha.g:1597:2: (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AIndexList_5= ruleAIndexList kw= ']' kw= ':' this_AISLString_8= ruleAISLString )
            // InternalAlpha.g:1598:3: kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AIndexList_5= ruleAIndexList kw= ']' kw= ':' this_AISLString_8= ruleAISLString
            {
            kw=(Token)match(input,36,FOLLOW_30); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAISLBasicRelationAccess().getAIndexListParserRuleCall_1());
            		
            pushFollow(FOLLOW_31);
            this_AIndexList_1=ruleAIndexList();

            state._fsp--;


            			current.merge(this_AIndexList_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,37,FOLLOW_32); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getRightSquareBracketKeyword_2());
            		
            kw=(Token)match(input,38,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            kw=(Token)match(input,36,FOLLOW_30); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getLeftSquareBracketKeyword_4());
            		

            			newCompositeNode(grammarAccess.getAISLBasicRelationAccess().getAIndexListParserRuleCall_5());
            		
            pushFollow(FOLLOW_31);
            this_AIndexList_5=ruleAIndexList();

            state._fsp--;


            			current.merge(this_AIndexList_5);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,37,FOLLOW_24); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getRightSquareBracketKeyword_6());
            		
            kw=(Token)match(input,32,FOLLOW_37); 

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


    // $ANTLR start "entryRuleAISLString"
    // InternalAlpha.g:1662:1: entryRuleAISLString returns [String current=null] : iv_ruleAISLString= ruleAISLString EOF ;
    public final String entryRuleAISLString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLString = null;


        try {
            // InternalAlpha.g:1662:50: (iv_ruleAISLString= ruleAISLString EOF )
            // InternalAlpha.g:1663:2: iv_ruleAISLString= ruleAISLString EOF
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
    // InternalAlpha.g:1669:1: ruleAISLString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= 'and' | kw= 'or' | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | kw= '&' | kw= '|' | this_WS_17= RULE_WS | kw= '>=' | kw= '>' | kw= '=' | kw= '<' | kw= '<=' )* ;
    public final AntlrDatatypeRuleToken ruleAISLString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token kw=null;
        Token this_WS_17=null;
        AntlrDatatypeRuleToken this_IndexName_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1675:2: ( (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= 'and' | kw= 'or' | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | kw= '&' | kw= '|' | this_WS_17= RULE_WS | kw= '>=' | kw= '>' | kw= '=' | kw= '<' | kw= '<=' )* )
            // InternalAlpha.g:1676:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= 'and' | kw= 'or' | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | kw= '&' | kw= '|' | this_WS_17= RULE_WS | kw= '>=' | kw= '>' | kw= '=' | kw= '<' | kw= '<=' )*
            {
            // InternalAlpha.g:1676:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= 'and' | kw= 'or' | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | kw= '&' | kw= '|' | this_WS_17= RULE_WS | kw= '>=' | kw= '>' | kw= '=' | kw= '<' | kw= '<=' )*
            loop31:
            do {
                int alt31=24;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt31=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt31=2;
                    }
                    break;
                case 40:
                    {
                    alt31=3;
                    }
                    break;
                case 41:
                    {
                    alt31=4;
                    }
                    break;
                case 42:
                    {
                    alt31=5;
                    }
                    break;
                case 43:
                    {
                    alt31=6;
                    }
                    break;
                case 44:
                    {
                    alt31=7;
                    }
                    break;
                case 45:
                    {
                    alt31=8;
                    }
                    break;
                case 46:
                    {
                    alt31=9;
                    }
                    break;
                case 36:
                    {
                    alt31=10;
                    }
                    break;
                case 37:
                    {
                    alt31=11;
                    }
                    break;
                case 16:
                    {
                    alt31=12;
                    }
                    break;
                case 17:
                    {
                    alt31=13;
                    }
                    break;
                case 35:
                    {
                    alt31=14;
                    }
                    break;
                case 32:
                    {
                    alt31=15;
                    }
                    break;
                case 47:
                    {
                    alt31=16;
                    }
                    break;
                case 48:
                    {
                    alt31=17;
                    }
                    break;
                case RULE_WS:
                    {
                    alt31=18;
                    }
                    break;
                case 49:
                    {
                    alt31=19;
                    }
                    break;
                case 50:
                    {
                    alt31=20;
                    }
                    break;
                case 14:
                    {
                    alt31=21;
                    }
                    break;
                case 51:
                    {
                    alt31=22;
                    }
                    break;
                case 52:
                    {
                    alt31=23;
                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // InternalAlpha.g:1677:3: this_IndexName_0= ruleIndexName
            	    {

            	    			newCompositeNode(grammarAccess.getAISLStringAccess().getIndexNameParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_38);
            	    this_IndexName_0=ruleIndexName();

            	    state._fsp--;


            	    			current.merge(this_IndexName_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalAlpha.g:1688:3: this_INT_1= RULE_INT
            	    {
            	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_38); 

            	    			current.merge(this_INT_1);
            	    		

            	    			newLeafNode(this_INT_1, grammarAccess.getAISLStringAccess().getINTTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalAlpha.g:1696:3: kw= '+'
            	    {
            	    kw=(Token)match(input,40,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getPlusSignKeyword_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalAlpha.g:1702:3: kw= '-'
            	    {
            	    kw=(Token)match(input,41,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getHyphenMinusKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalAlpha.g:1708:3: kw= '*'
            	    {
            	    kw=(Token)match(input,42,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getAsteriskKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalAlpha.g:1714:3: kw= '/'
            	    {
            	    kw=(Token)match(input,43,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getSolidusKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalAlpha.g:1720:3: kw= '%'
            	    {
            	    kw=(Token)match(input,44,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getPercentSignKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalAlpha.g:1726:3: kw= 'and'
            	    {
            	    kw=(Token)match(input,45,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getAndKeyword_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalAlpha.g:1732:3: kw= 'or'
            	    {
            	    kw=(Token)match(input,46,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getOrKeyword_8());
            	    		

            	    }
            	    break;
            	case 10 :
            	    // InternalAlpha.g:1738:3: kw= '['
            	    {
            	    kw=(Token)match(input,36,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getLeftSquareBracketKeyword_9());
            	    		

            	    }
            	    break;
            	case 11 :
            	    // InternalAlpha.g:1744:3: kw= ']'
            	    {
            	    kw=(Token)match(input,37,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getRightSquareBracketKeyword_10());
            	    		

            	    }
            	    break;
            	case 12 :
            	    // InternalAlpha.g:1750:3: kw= '('
            	    {
            	    kw=(Token)match(input,16,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getLeftParenthesisKeyword_11());
            	    		

            	    }
            	    break;
            	case 13 :
            	    // InternalAlpha.g:1756:3: kw= ')'
            	    {
            	    kw=(Token)match(input,17,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getRightParenthesisKeyword_12());
            	    		

            	    }
            	    break;
            	case 14 :
            	    // InternalAlpha.g:1762:3: kw= ','
            	    {
            	    kw=(Token)match(input,35,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getCommaKeyword_13());
            	    		

            	    }
            	    break;
            	case 15 :
            	    // InternalAlpha.g:1768:3: kw= ':'
            	    {
            	    kw=(Token)match(input,32,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getColonKeyword_14());
            	    		

            	    }
            	    break;
            	case 16 :
            	    // InternalAlpha.g:1774:3: kw= '&'
            	    {
            	    kw=(Token)match(input,47,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getAmpersandKeyword_15());
            	    		

            	    }
            	    break;
            	case 17 :
            	    // InternalAlpha.g:1780:3: kw= '|'
            	    {
            	    kw=(Token)match(input,48,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getVerticalLineKeyword_16());
            	    		

            	    }
            	    break;
            	case 18 :
            	    // InternalAlpha.g:1786:3: this_WS_17= RULE_WS
            	    {
            	    this_WS_17=(Token)match(input,RULE_WS,FOLLOW_38); 

            	    			current.merge(this_WS_17);
            	    		

            	    			newLeafNode(this_WS_17, grammarAccess.getAISLStringAccess().getWSTerminalRuleCall_17());
            	    		

            	    }
            	    break;
            	case 19 :
            	    // InternalAlpha.g:1794:3: kw= '>='
            	    {
            	    kw=(Token)match(input,49,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getGreaterThanSignEqualsSignKeyword_18());
            	    		

            	    }
            	    break;
            	case 20 :
            	    // InternalAlpha.g:1800:3: kw= '>'
            	    {
            	    kw=(Token)match(input,50,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getGreaterThanSignKeyword_19());
            	    		

            	    }
            	    break;
            	case 21 :
            	    // InternalAlpha.g:1806:3: kw= '='
            	    {
            	    kw=(Token)match(input,14,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getEqualsSignKeyword_20());
            	    		

            	    }
            	    break;
            	case 22 :
            	    // InternalAlpha.g:1812:3: kw= '<'
            	    {
            	    kw=(Token)match(input,51,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getLessThanSignKeyword_21());
            	    		

            	    }
            	    break;
            	case 23 :
            	    // InternalAlpha.g:1818:3: kw= '<='
            	    {
            	    kw=(Token)match(input,52,FOLLOW_38); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getLessThanSignEqualsSignKeyword_22());
            	    		

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalAlpha.g:1827:1: entryRuleAISLExpression returns [String current=null] : iv_ruleAISLExpression= ruleAISLExpression EOF ;
    public final String entryRuleAISLExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLExpression = null;


        try {
            // InternalAlpha.g:1827:54: (iv_ruleAISLExpression= ruleAISLExpression EOF )
            // InternalAlpha.g:1828:2: iv_ruleAISLExpression= ruleAISLExpression EOF
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
    // InternalAlpha.g:1834:1: ruleAISLExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_7= RULE_WS )+ ;
    public final AntlrDatatypeRuleToken ruleAISLExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token kw=null;
        Token this_WS_7=null;
        AntlrDatatypeRuleToken this_IndexName_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1840:2: ( (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_7= RULE_WS )+ )
            // InternalAlpha.g:1841:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_7= RULE_WS )+
            {
            // InternalAlpha.g:1841:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_7= RULE_WS )+
            int cnt32=0;
            loop32:
            do {
                int alt32=9;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt32=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt32=2;
                    }
                    break;
                case 40:
                    {
                    alt32=3;
                    }
                    break;
                case 41:
                    {
                    alt32=4;
                    }
                    break;
                case 42:
                    {
                    alt32=5;
                    }
                    break;
                case 43:
                    {
                    alt32=6;
                    }
                    break;
                case 44:
                    {
                    alt32=7;
                    }
                    break;
                case RULE_WS:
                    {
                    alt32=8;
                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // InternalAlpha.g:1842:3: this_IndexName_0= ruleIndexName
            	    {

            	    			newCompositeNode(grammarAccess.getAISLExpressionAccess().getIndexNameParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_39);
            	    this_IndexName_0=ruleIndexName();

            	    state._fsp--;


            	    			current.merge(this_IndexName_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalAlpha.g:1853:3: this_INT_1= RULE_INT
            	    {
            	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_39); 

            	    			current.merge(this_INT_1);
            	    		

            	    			newLeafNode(this_INT_1, grammarAccess.getAISLExpressionAccess().getINTTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalAlpha.g:1861:3: kw= '+'
            	    {
            	    kw=(Token)match(input,40,FOLLOW_39); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getPlusSignKeyword_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalAlpha.g:1867:3: kw= '-'
            	    {
            	    kw=(Token)match(input,41,FOLLOW_39); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getHyphenMinusKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalAlpha.g:1873:3: kw= '*'
            	    {
            	    kw=(Token)match(input,42,FOLLOW_39); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getAsteriskKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalAlpha.g:1879:3: kw= '/'
            	    {
            	    kw=(Token)match(input,43,FOLLOW_39); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getSolidusKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalAlpha.g:1885:3: kw= '%'
            	    {
            	    kw=(Token)match(input,44,FOLLOW_39); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getPercentSignKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalAlpha.g:1891:3: this_WS_7= RULE_WS
            	    {
            	    this_WS_7=(Token)match(input,RULE_WS,FOLLOW_39); 

            	    			current.merge(this_WS_7);
            	    		

            	    			newLeafNode(this_WS_7, grammarAccess.getAISLExpressionAccess().getWSTerminalRuleCall_7());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
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
    // InternalAlpha.g:1902:1: entryRuleAISLExpressionList returns [String current=null] : iv_ruleAISLExpressionList= ruleAISLExpressionList EOF ;
    public final String entryRuleAISLExpressionList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLExpressionList = null;


        try {
            // InternalAlpha.g:1902:58: (iv_ruleAISLExpressionList= ruleAISLExpressionList EOF )
            // InternalAlpha.g:1903:2: iv_ruleAISLExpressionList= ruleAISLExpressionList EOF
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
    // InternalAlpha.g:1909:1: ruleAISLExpressionList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AISLExpression_0= ruleAISLExpression (kw= ',' this_AISLExpression_2= ruleAISLExpression )* )? ;
    public final AntlrDatatypeRuleToken ruleAISLExpressionList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLExpression_0 = null;

        AntlrDatatypeRuleToken this_AISLExpression_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1915:2: ( (this_AISLExpression_0= ruleAISLExpression (kw= ',' this_AISLExpression_2= ruleAISLExpression )* )? )
            // InternalAlpha.g:1916:2: (this_AISLExpression_0= ruleAISLExpression (kw= ',' this_AISLExpression_2= ruleAISLExpression )* )?
            {
            // InternalAlpha.g:1916:2: (this_AISLExpression_0= ruleAISLExpression (kw= ',' this_AISLExpression_2= ruleAISLExpression )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_WS)||(LA34_0>=40 && LA34_0<=44)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAlpha.g:1917:3: this_AISLExpression_0= ruleAISLExpression (kw= ',' this_AISLExpression_2= ruleAISLExpression )*
                    {

                    			newCompositeNode(grammarAccess.getAISLExpressionListAccess().getAISLExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_29);
                    this_AISLExpression_0=ruleAISLExpression();

                    state._fsp--;


                    			current.merge(this_AISLExpression_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		
                    // InternalAlpha.g:1927:3: (kw= ',' this_AISLExpression_2= ruleAISLExpression )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==35) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalAlpha.g:1928:4: kw= ',' this_AISLExpression_2= ruleAISLExpression
                    	    {
                    	    kw=(Token)match(input,35,FOLLOW_40); 

                    	    				current.merge(kw);
                    	    				newLeafNode(kw, grammarAccess.getAISLExpressionListAccess().getCommaKeyword_1_0());
                    	    			

                    	    				newCompositeNode(grammarAccess.getAISLExpressionListAccess().getAISLExpressionParserRuleCall_1_1());
                    	    			
                    	    pushFollow(FOLLOW_29);
                    	    this_AISLExpression_2=ruleAISLExpression();

                    	    state._fsp--;


                    	    				current.merge(this_AISLExpression_2);
                    	    			

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
    // $ANTLR end "ruleAISLExpressionList"


    // $ANTLR start "entryRuleAAlphaFunction"
    // InternalAlpha.g:1948:1: entryRuleAAlphaFunction returns [String current=null] : iv_ruleAAlphaFunction= ruleAAlphaFunction EOF ;
    public final String entryRuleAAlphaFunction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAAlphaFunction = null;


        try {
            // InternalAlpha.g:1948:54: (iv_ruleAAlphaFunction= ruleAAlphaFunction EOF )
            // InternalAlpha.g:1949:2: iv_ruleAAlphaFunction= ruleAAlphaFunction EOF
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
    // InternalAlpha.g:1955:1: ruleAAlphaFunction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_AIndexList_1= ruleAIndexList kw= '->' this_AISLExpressionList_3= ruleAISLExpressionList kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleAAlphaFunction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AIndexList_1 = null;

        AntlrDatatypeRuleToken this_AISLExpressionList_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1961:2: ( (kw= '(' this_AIndexList_1= ruleAIndexList kw= '->' this_AISLExpressionList_3= ruleAISLExpressionList kw= ')' ) )
            // InternalAlpha.g:1962:2: (kw= '(' this_AIndexList_1= ruleAIndexList kw= '->' this_AISLExpressionList_3= ruleAISLExpressionList kw= ')' )
            {
            // InternalAlpha.g:1962:2: (kw= '(' this_AIndexList_1= ruleAIndexList kw= '->' this_AISLExpressionList_3= ruleAISLExpressionList kw= ')' )
            // InternalAlpha.g:1963:3: kw= '(' this_AIndexList_1= ruleAIndexList kw= '->' this_AISLExpressionList_3= ruleAISLExpressionList kw= ')'
            {
            kw=(Token)match(input,16,FOLLOW_41); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAAlphaFunctionAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAAlphaFunctionAccess().getAIndexListParserRuleCall_1());
            		
            pushFollow(FOLLOW_32);
            this_AIndexList_1=ruleAIndexList();

            state._fsp--;


            			current.merge(this_AIndexList_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,38,FOLLOW_42); 

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


    // $ANTLR start "entryRuleAAlphaFunctionInArrayNotation"
    // InternalAlpha.g:2002:1: entryRuleAAlphaFunctionInArrayNotation returns [String current=null] : iv_ruleAAlphaFunctionInArrayNotation= ruleAAlphaFunctionInArrayNotation EOF ;
    public final String entryRuleAAlphaFunctionInArrayNotation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAAlphaFunctionInArrayNotation = null;


        try {
            // InternalAlpha.g:2002:69: (iv_ruleAAlphaFunctionInArrayNotation= ruleAAlphaFunctionInArrayNotation EOF )
            // InternalAlpha.g:2003:2: iv_ruleAAlphaFunctionInArrayNotation= ruleAAlphaFunctionInArrayNotation EOF
            {
             newCompositeNode(grammarAccess.getAAlphaFunctionInArrayNotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAAlphaFunctionInArrayNotation=ruleAAlphaFunctionInArrayNotation();

            state._fsp--;

             current =iv_ruleAAlphaFunctionInArrayNotation.getText(); 
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
    // $ANTLR end "entryRuleAAlphaFunctionInArrayNotation"


    // $ANTLR start "ruleAAlphaFunctionInArrayNotation"
    // InternalAlpha.g:2009:1: ruleAAlphaFunctionInArrayNotation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleAAlphaFunctionInArrayNotation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLExpressionList_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2015:2: ( (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' ) )
            // InternalAlpha.g:2016:2: (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' )
            {
            // InternalAlpha.g:2016:2: (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' )
            // InternalAlpha.g:2017:3: kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']'
            {
            kw=(Token)match(input,36,FOLLOW_43); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAAlphaFunctionInArrayNotationAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAAlphaFunctionInArrayNotationAccess().getAISLExpressionListParserRuleCall_1());
            		
            pushFollow(FOLLOW_31);
            this_AISLExpressionList_1=ruleAISLExpressionList();

            state._fsp--;


            			current.merge(this_AISLExpressionList_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,37,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAAlphaFunctionInArrayNotationAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleAAlphaFunctionInArrayNotation"


    // $ANTLR start "entryRuleStandardEquation"
    // InternalAlpha.g:2041:1: entryRuleStandardEquation returns [EObject current=null] : iv_ruleStandardEquation= ruleStandardEquation EOF ;
    public final EObject entryRuleStandardEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardEquation = null;


        try {
            // InternalAlpha.g:2041:57: (iv_ruleStandardEquation= ruleStandardEquation EOF )
            // InternalAlpha.g:2042:2: iv_ruleStandardEquation= ruleStandardEquation EOF
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
    // InternalAlpha.g:2048:1: ruleStandardEquation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )? otherlv_6= '=' ( (lv_expr_7_0= ruleAlphaExpression ) ) otherlv_8= ';' ) ;
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
            // InternalAlpha.g:2054:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )? otherlv_6= '=' ( (lv_expr_7_0= ruleAlphaExpression ) ) otherlv_8= ';' ) )
            // InternalAlpha.g:2055:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )? otherlv_6= '=' ( (lv_expr_7_0= ruleAlphaExpression ) ) otherlv_8= ';' )
            {
            // InternalAlpha.g:2055:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )? otherlv_6= '=' ( (lv_expr_7_0= ruleAlphaExpression ) ) otherlv_8= ';' )
            // InternalAlpha.g:2056:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )? otherlv_6= '=' ( (lv_expr_7_0= ruleAlphaExpression ) ) otherlv_8= ';'
            {
            // InternalAlpha.g:2056:3: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:2057:4: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:2057:4: (otherlv_0= RULE_ID )
            // InternalAlpha.g:2058:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStandardEquationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_44); 

            					newLeafNode(otherlv_0, grammarAccess.getStandardEquationAccess().getVariableVariableCrossReference_0_0());
            				

            }


            }

            // InternalAlpha.g:2069:3: (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAlpha.g:2070:4: otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getStandardEquationAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAlpha.g:2074:4: ( (lv_indexNames_2_0= ruleIndexName ) )
                    // InternalAlpha.g:2075:5: (lv_indexNames_2_0= ruleIndexName )
                    {
                    // InternalAlpha.g:2075:5: (lv_indexNames_2_0= ruleIndexName )
                    // InternalAlpha.g:2076:6: lv_indexNames_2_0= ruleIndexName
                    {

                    						newCompositeNode(grammarAccess.getStandardEquationAccess().getIndexNamesIndexNameParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_45);
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

                    // InternalAlpha.g:2093:4: (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==35) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalAlpha.g:2094:5: otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,35,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getStandardEquationAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalAlpha.g:2098:5: ( (lv_indexNames_4_0= ruleIndexName ) )
                    	    // InternalAlpha.g:2099:6: (lv_indexNames_4_0= ruleIndexName )
                    	    {
                    	    // InternalAlpha.g:2099:6: (lv_indexNames_4_0= ruleIndexName )
                    	    // InternalAlpha.g:2100:7: lv_indexNames_4_0= ruleIndexName
                    	    {

                    	    							newCompositeNode(grammarAccess.getStandardEquationAccess().getIndexNamesIndexNameParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_45);
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
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getStandardEquationAccess().getRightSquareBracketKeyword_1_3());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getStandardEquationAccess().getEqualsSignKeyword_2());
            		
            // InternalAlpha.g:2127:3: ( (lv_expr_7_0= ruleAlphaExpression ) )
            // InternalAlpha.g:2128:4: (lv_expr_7_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:2128:4: (lv_expr_7_0= ruleAlphaExpression )
            // InternalAlpha.g:2129:5: lv_expr_7_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getStandardEquationAccess().getExprAlphaExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_46);
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

            otherlv_8=(Token)match(input,39,FOLLOW_2); 

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
    // InternalAlpha.g:2154:1: entryRuleUseEquation returns [EObject current=null] : iv_ruleUseEquation= ruleUseEquation EOF ;
    public final EObject entryRuleUseEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseEquation = null;


        try {
            // InternalAlpha.g:2154:52: (iv_ruleUseEquation= ruleUseEquation EOF )
            // InternalAlpha.g:2155:2: iv_ruleUseEquation= ruleUseEquation EOF
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
    // InternalAlpha.g:2161:1: ruleUseEquation returns [EObject current=null] : ( (otherlv_0= 'over' ( (lv_instantiationDomain_1_0= ruleCalculatorExpression ) ) (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )? otherlv_9= '(' ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )? otherlv_13= ')' otherlv_14= '=' ( (otherlv_15= RULE_ID ) ) ( (lv_callParams_16_0= ruleJNIFunctionInArrayNotation ) ) otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' ) ;
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
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_instantiationDomain_1_0 = null;

        AntlrDatatypeRuleToken lv_subsystemDims_4_0 = null;

        AntlrDatatypeRuleToken lv_subsystemDims_6_0 = null;

        EObject lv_outputExprs_10_0 = null;

        EObject lv_outputExprs_12_0 = null;

        EObject lv_callParams_16_0 = null;

        EObject lv_inputExprs_18_0 = null;

        EObject lv_inputExprs_20_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2167:2: ( ( (otherlv_0= 'over' ( (lv_instantiationDomain_1_0= ruleCalculatorExpression ) ) (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )? otherlv_9= '(' ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )? otherlv_13= ')' otherlv_14= '=' ( (otherlv_15= RULE_ID ) ) ( (lv_callParams_16_0= ruleJNIFunctionInArrayNotation ) ) otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' ) )
            // InternalAlpha.g:2168:2: ( (otherlv_0= 'over' ( (lv_instantiationDomain_1_0= ruleCalculatorExpression ) ) (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )? otherlv_9= '(' ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )? otherlv_13= ')' otherlv_14= '=' ( (otherlv_15= RULE_ID ) ) ( (lv_callParams_16_0= ruleJNIFunctionInArrayNotation ) ) otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' )
            {
            // InternalAlpha.g:2168:2: ( (otherlv_0= 'over' ( (lv_instantiationDomain_1_0= ruleCalculatorExpression ) ) (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )? otherlv_9= '(' ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )? otherlv_13= ')' otherlv_14= '=' ( (otherlv_15= RULE_ID ) ) ( (lv_callParams_16_0= ruleJNIFunctionInArrayNotation ) ) otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' )
            // InternalAlpha.g:2169:3: (otherlv_0= 'over' ( (lv_instantiationDomain_1_0= ruleCalculatorExpression ) ) (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )? otherlv_9= '(' ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )? otherlv_13= ')' otherlv_14= '=' ( (otherlv_15= RULE_ID ) ) ( (lv_callParams_16_0= ruleJNIFunctionInArrayNotation ) ) otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';'
            {
            // InternalAlpha.g:2169:3: (otherlv_0= 'over' ( (lv_instantiationDomain_1_0= ruleCalculatorExpression ) ) (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==28) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAlpha.g:2170:4: otherlv_0= 'over' ( (lv_instantiationDomain_1_0= ruleCalculatorExpression ) ) (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getUseEquationAccess().getOverKeyword_0_0());
                    			
                    // InternalAlpha.g:2174:4: ( (lv_instantiationDomain_1_0= ruleCalculatorExpression ) )
                    // InternalAlpha.g:2175:5: (lv_instantiationDomain_1_0= ruleCalculatorExpression )
                    {
                    // InternalAlpha.g:2175:5: (lv_instantiationDomain_1_0= ruleCalculatorExpression )
                    // InternalAlpha.g:2176:6: lv_instantiationDomain_1_0= ruleCalculatorExpression
                    {

                    						newCompositeNode(grammarAccess.getUseEquationAccess().getInstantiationDomainCalculatorExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_instantiationDomain_1_0=ruleCalculatorExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseEquationRule());
                    						}
                    						set(
                    							current,
                    							"instantiationDomain",
                    							lv_instantiationDomain_1_0,
                    							"alpha.model.Alpha.CalculatorExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlpha.g:2193:4: (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==53) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalAlpha.g:2194:5: otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )?
                            {
                            otherlv_2=(Token)match(input,53,FOLLOW_35); 

                            					newLeafNode(otherlv_2, grammarAccess.getUseEquationAccess().getWithKeyword_0_2_0());
                            				
                            // InternalAlpha.g:2198:5: (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )?
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==36) ) {
                                alt38=1;
                            }
                            switch (alt38) {
                                case 1 :
                                    // InternalAlpha.g:2199:6: otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']'
                                    {
                                    otherlv_3=(Token)match(input,36,FOLLOW_4); 

                                    						newLeafNode(otherlv_3, grammarAccess.getUseEquationAccess().getLeftSquareBracketKeyword_0_2_1_0());
                                    					
                                    // InternalAlpha.g:2203:6: ( (lv_subsystemDims_4_0= ruleIndexName ) )
                                    // InternalAlpha.g:2204:7: (lv_subsystemDims_4_0= ruleIndexName )
                                    {
                                    // InternalAlpha.g:2204:7: (lv_subsystemDims_4_0= ruleIndexName )
                                    // InternalAlpha.g:2205:8: lv_subsystemDims_4_0= ruleIndexName
                                    {

                                    								newCompositeNode(grammarAccess.getUseEquationAccess().getSubsystemDimsIndexNameParserRuleCall_0_2_1_1_0());
                                    							
                                    pushFollow(FOLLOW_45);
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

                                    // InternalAlpha.g:2222:6: (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )*
                                    loop37:
                                    do {
                                        int alt37=2;
                                        int LA37_0 = input.LA(1);

                                        if ( (LA37_0==35) ) {
                                            alt37=1;
                                        }


                                        switch (alt37) {
                                    	case 1 :
                                    	    // InternalAlpha.g:2223:7: otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) )
                                    	    {
                                    	    otherlv_5=(Token)match(input,35,FOLLOW_4); 

                                    	    							newLeafNode(otherlv_5, grammarAccess.getUseEquationAccess().getCommaKeyword_0_2_1_2_0());
                                    	    						
                                    	    // InternalAlpha.g:2227:7: ( (lv_subsystemDims_6_0= ruleIndexName ) )
                                    	    // InternalAlpha.g:2228:8: (lv_subsystemDims_6_0= ruleIndexName )
                                    	    {
                                    	    // InternalAlpha.g:2228:8: (lv_subsystemDims_6_0= ruleIndexName )
                                    	    // InternalAlpha.g:2229:9: lv_subsystemDims_6_0= ruleIndexName
                                    	    {

                                    	    									newCompositeNode(grammarAccess.getUseEquationAccess().getSubsystemDimsIndexNameParserRuleCall_0_2_1_2_1_0());
                                    	    								
                                    	    pushFollow(FOLLOW_45);
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
                                    	    break loop37;
                                        }
                                    } while (true);

                                    otherlv_7=(Token)match(input,37,FOLLOW_24); 

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

            otherlv_9=(Token)match(input,16,FOLLOW_48); 

            			newLeafNode(otherlv_9, grammarAccess.getUseEquationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:2262:3: ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_INT)||(LA42_0>=RULE_BOOLEAN && LA42_0<=RULE_FLOAT)||LA42_0==16||LA42_0==20||LA42_0==36||(LA42_0>=40 && LA42_0<=42)||(LA42_0>=45 && LA42_0<=46)||LA42_0==54||(LA42_0>=57 && LA42_0<=58)||(LA42_0>=60 && LA42_0<=64)||(LA42_0>=66 && LA42_0<=70)||LA42_0==72) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAlpha.g:2263:4: ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )*
                    {
                    // InternalAlpha.g:2263:4: ( (lv_outputExprs_10_0= ruleAlphaExpression ) )
                    // InternalAlpha.g:2264:5: (lv_outputExprs_10_0= ruleAlphaExpression )
                    {
                    // InternalAlpha.g:2264:5: (lv_outputExprs_10_0= ruleAlphaExpression )
                    // InternalAlpha.g:2265:6: lv_outputExprs_10_0= ruleAlphaExpression
                    {

                    						newCompositeNode(grammarAccess.getUseEquationAccess().getOutputExprsAlphaExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_49);
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

                    // InternalAlpha.g:2282:4: (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==35) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalAlpha.g:2283:5: otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,35,FOLLOW_20); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getUseEquationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlpha.g:2287:5: ( (lv_outputExprs_12_0= ruleAlphaExpression ) )
                    	    // InternalAlpha.g:2288:6: (lv_outputExprs_12_0= ruleAlphaExpression )
                    	    {
                    	    // InternalAlpha.g:2288:6: (lv_outputExprs_12_0= ruleAlphaExpression )
                    	    // InternalAlpha.g:2289:7: lv_outputExprs_12_0= ruleAlphaExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseEquationAccess().getOutputExprsAlphaExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_49);
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
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_13, grammarAccess.getUseEquationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_14=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_14, grammarAccess.getUseEquationAccess().getEqualsSignKeyword_4());
            		
            // InternalAlpha.g:2316:3: ( (otherlv_15= RULE_ID ) )
            // InternalAlpha.g:2317:4: (otherlv_15= RULE_ID )
            {
            // InternalAlpha.g:2317:4: (otherlv_15= RULE_ID )
            // InternalAlpha.g:2318:5: otherlv_15= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseEquationRule());
            					}
            				
            otherlv_15=(Token)match(input,RULE_ID,FOLLOW_50); 

            					newLeafNode(otherlv_15, grammarAccess.getUseEquationAccess().getSystemAlphaSystemCrossReference_5_0());
            				

            }


            }

            // InternalAlpha.g:2329:3: ( (lv_callParams_16_0= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:2330:4: (lv_callParams_16_0= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:2330:4: (lv_callParams_16_0= ruleJNIFunctionInArrayNotation )
            // InternalAlpha.g:2331:5: lv_callParams_16_0= ruleJNIFunctionInArrayNotation
            {

            					newCompositeNode(grammarAccess.getUseEquationAccess().getCallParamsJNIFunctionInArrayNotationParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_callParams_16_0=ruleJNIFunctionInArrayNotation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUseEquationRule());
            					}
            					set(
            						current,
            						"callParams",
            						lv_callParams_16_0,
            						"alpha.model.Alpha.JNIFunctionInArrayNotation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,16,FOLLOW_48); 

            			newLeafNode(otherlv_17, grammarAccess.getUseEquationAccess().getLeftParenthesisKeyword_7());
            		
            // InternalAlpha.g:2352:3: ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_INT)||(LA44_0>=RULE_BOOLEAN && LA44_0<=RULE_FLOAT)||LA44_0==16||LA44_0==20||LA44_0==36||(LA44_0>=40 && LA44_0<=42)||(LA44_0>=45 && LA44_0<=46)||LA44_0==54||(LA44_0>=57 && LA44_0<=58)||(LA44_0>=60 && LA44_0<=64)||(LA44_0>=66 && LA44_0<=70)||LA44_0==72) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAlpha.g:2353:4: ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )*
                    {
                    // InternalAlpha.g:2353:4: ( (lv_inputExprs_18_0= ruleAlphaExpression ) )
                    // InternalAlpha.g:2354:5: (lv_inputExprs_18_0= ruleAlphaExpression )
                    {
                    // InternalAlpha.g:2354:5: (lv_inputExprs_18_0= ruleAlphaExpression )
                    // InternalAlpha.g:2355:6: lv_inputExprs_18_0= ruleAlphaExpression
                    {

                    						newCompositeNode(grammarAccess.getUseEquationAccess().getInputExprsAlphaExpressionParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_49);
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

                    // InternalAlpha.g:2372:4: (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==35) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalAlpha.g:2373:5: otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) )
                    	    {
                    	    otherlv_19=(Token)match(input,35,FOLLOW_20); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getUseEquationAccess().getCommaKeyword_8_1_0());
                    	    				
                    	    // InternalAlpha.g:2377:5: ( (lv_inputExprs_20_0= ruleAlphaExpression ) )
                    	    // InternalAlpha.g:2378:6: (lv_inputExprs_20_0= ruleAlphaExpression )
                    	    {
                    	    // InternalAlpha.g:2378:6: (lv_inputExprs_20_0= ruleAlphaExpression )
                    	    // InternalAlpha.g:2379:7: lv_inputExprs_20_0= ruleAlphaExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseEquationAccess().getInputExprsAlphaExpressionParserRuleCall_8_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_49);
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
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_21=(Token)match(input,17,FOLLOW_46); 

            			newLeafNode(otherlv_21, grammarAccess.getUseEquationAccess().getRightParenthesisKeyword_9());
            		
            otherlv_22=(Token)match(input,39,FOLLOW_2); 

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
    // InternalAlpha.g:2410:1: entryRuleAlphaExpression returns [EObject current=null] : iv_ruleAlphaExpression= ruleAlphaExpression EOF ;
    public final EObject entryRuleAlphaExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaExpression = null;


        try {
            // InternalAlpha.g:2410:56: (iv_ruleAlphaExpression= ruleAlphaExpression EOF )
            // InternalAlpha.g:2411:2: iv_ruleAlphaExpression= ruleAlphaExpression EOF
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
    // InternalAlpha.g:2417:1: ruleAlphaExpression returns [EObject current=null] : (this_IfExpression_0= ruleIfExpression | this_RestrictExpression_1= ruleRestrictExpression | this_AutoRestrictExpression_2= ruleAutoRestrictExpression | this_OrExpression_3= ruleOrExpression ) ;
    public final EObject ruleAlphaExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IfExpression_0 = null;

        EObject this_RestrictExpression_1 = null;

        EObject this_AutoRestrictExpression_2 = null;

        EObject this_OrExpression_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2423:2: ( (this_IfExpression_0= ruleIfExpression | this_RestrictExpression_1= ruleRestrictExpression | this_AutoRestrictExpression_2= ruleAutoRestrictExpression | this_OrExpression_3= ruleOrExpression ) )
            // InternalAlpha.g:2424:2: (this_IfExpression_0= ruleIfExpression | this_RestrictExpression_1= ruleRestrictExpression | this_AutoRestrictExpression_2= ruleAutoRestrictExpression | this_OrExpression_3= ruleOrExpression )
            {
            // InternalAlpha.g:2424:2: (this_IfExpression_0= ruleIfExpression | this_RestrictExpression_1= ruleRestrictExpression | this_AutoRestrictExpression_2= ruleAutoRestrictExpression | this_OrExpression_3= ruleOrExpression )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt45=1;
                }
                break;
            case 20:
                {
                alt45=2;
                }
                break;
            case 57:
                {
                alt45=3;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_BOOLEAN:
            case RULE_FLOAT:
            case 16:
            case 36:
            case 40:
            case 41:
            case 42:
            case 45:
            case 46:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 72:
                {
                alt45=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalAlpha.g:2425:3: this_IfExpression_0= ruleIfExpression
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
                    // InternalAlpha.g:2434:3: this_RestrictExpression_1= ruleRestrictExpression
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
                    // InternalAlpha.g:2443:3: this_AutoRestrictExpression_2= ruleAutoRestrictExpression
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
                    // InternalAlpha.g:2452:3: this_OrExpression_3= ruleOrExpression
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
    // InternalAlpha.g:2464:1: entryRuleAlphaTerminalExpression returns [EObject current=null] : iv_ruleAlphaTerminalExpression= ruleAlphaTerminalExpression EOF ;
    public final EObject entryRuleAlphaTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaTerminalExpression = null;


        try {
            // InternalAlpha.g:2464:64: (iv_ruleAlphaTerminalExpression= ruleAlphaTerminalExpression EOF )
            // InternalAlpha.g:2465:2: iv_ruleAlphaTerminalExpression= ruleAlphaTerminalExpression EOF
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
    // InternalAlpha.g:2471:1: ruleAlphaTerminalExpression returns [EObject current=null] : ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_ConstantExpression_4= ruleConstantExpression | this_VariableExpression_5= ruleVariableExpression | this_DependenceExpression_6= ruleDependenceExpression | this_IndexExpression_7= ruleIndexExpression | this_ReduceExpression_8= ruleReduceExpression | this_ArgReduceExpression_9= ruleArgReduceExpression | this_ConvolutionExpression_10= ruleConvolutionExpression | this_ExternalReduceExpression_11= ruleExternalReduceExpression | this_ExternalArgReduceExpression_12= ruleExternalArgReduceExpression | this_MultiArgExpression_13= ruleMultiArgExpression | this_ExternalMultiArgExpression_14= ruleExternalMultiArgExpression | this_SelectExpression_15= ruleSelectExpression ) ;
    public final EObject ruleAlphaTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AlphaExpression_1 = null;

        EObject this_CaseExpression_3 = null;

        EObject this_ConstantExpression_4 = null;

        EObject this_VariableExpression_5 = null;

        EObject this_DependenceExpression_6 = null;

        EObject this_IndexExpression_7 = null;

        EObject this_ReduceExpression_8 = null;

        EObject this_ArgReduceExpression_9 = null;

        EObject this_ConvolutionExpression_10 = null;

        EObject this_ExternalReduceExpression_11 = null;

        EObject this_ExternalArgReduceExpression_12 = null;

        EObject this_MultiArgExpression_13 = null;

        EObject this_ExternalMultiArgExpression_14 = null;

        EObject this_SelectExpression_15 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2477:2: ( ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_ConstantExpression_4= ruleConstantExpression | this_VariableExpression_5= ruleVariableExpression | this_DependenceExpression_6= ruleDependenceExpression | this_IndexExpression_7= ruleIndexExpression | this_ReduceExpression_8= ruleReduceExpression | this_ArgReduceExpression_9= ruleArgReduceExpression | this_ConvolutionExpression_10= ruleConvolutionExpression | this_ExternalReduceExpression_11= ruleExternalReduceExpression | this_ExternalArgReduceExpression_12= ruleExternalArgReduceExpression | this_MultiArgExpression_13= ruleMultiArgExpression | this_ExternalMultiArgExpression_14= ruleExternalMultiArgExpression | this_SelectExpression_15= ruleSelectExpression ) )
            // InternalAlpha.g:2478:2: ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_ConstantExpression_4= ruleConstantExpression | this_VariableExpression_5= ruleVariableExpression | this_DependenceExpression_6= ruleDependenceExpression | this_IndexExpression_7= ruleIndexExpression | this_ReduceExpression_8= ruleReduceExpression | this_ArgReduceExpression_9= ruleArgReduceExpression | this_ConvolutionExpression_10= ruleConvolutionExpression | this_ExternalReduceExpression_11= ruleExternalReduceExpression | this_ExternalArgReduceExpression_12= ruleExternalArgReduceExpression | this_MultiArgExpression_13= ruleMultiArgExpression | this_ExternalMultiArgExpression_14= ruleExternalMultiArgExpression | this_SelectExpression_15= ruleSelectExpression )
            {
            // InternalAlpha.g:2478:2: ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_ConstantExpression_4= ruleConstantExpression | this_VariableExpression_5= ruleVariableExpression | this_DependenceExpression_6= ruleDependenceExpression | this_IndexExpression_7= ruleIndexExpression | this_ReduceExpression_8= ruleReduceExpression | this_ArgReduceExpression_9= ruleArgReduceExpression | this_ConvolutionExpression_10= ruleConvolutionExpression | this_ExternalReduceExpression_11= ruleExternalReduceExpression | this_ExternalArgReduceExpression_12= ruleExternalArgReduceExpression | this_MultiArgExpression_13= ruleMultiArgExpression | this_ExternalMultiArgExpression_14= ruleExternalMultiArgExpression | this_SelectExpression_15= ruleSelectExpression )
            int alt46=14;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // InternalAlpha.g:2479:3: (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' )
                    {
                    // InternalAlpha.g:2479:3: (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' )
                    // InternalAlpha.g:2480:4: otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')'
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
                    // InternalAlpha.g:2498:3: this_CaseExpression_3= ruleCaseExpression
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
                    // InternalAlpha.g:2507:3: this_ConstantExpression_4= ruleConstantExpression
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
                    // InternalAlpha.g:2516:3: this_VariableExpression_5= ruleVariableExpression
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
                    // InternalAlpha.g:2525:3: this_DependenceExpression_6= ruleDependenceExpression
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
                    // InternalAlpha.g:2534:3: this_IndexExpression_7= ruleIndexExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getIndexExpressionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_IndexExpression_7=ruleIndexExpression();

                    state._fsp--;


                    			current = this_IndexExpression_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAlpha.g:2543:3: this_ReduceExpression_8= ruleReduceExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getReduceExpressionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReduceExpression_8=ruleReduceExpression();

                    state._fsp--;


                    			current = this_ReduceExpression_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalAlpha.g:2552:3: this_ArgReduceExpression_9= ruleArgReduceExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getArgReduceExpressionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArgReduceExpression_9=ruleArgReduceExpression();

                    state._fsp--;


                    			current = this_ArgReduceExpression_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalAlpha.g:2561:3: this_ConvolutionExpression_10= ruleConvolutionExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getConvolutionExpressionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConvolutionExpression_10=ruleConvolutionExpression();

                    state._fsp--;


                    			current = this_ConvolutionExpression_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalAlpha.g:2570:3: this_ExternalReduceExpression_11= ruleExternalReduceExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getExternalReduceExpressionParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalReduceExpression_11=ruleExternalReduceExpression();

                    state._fsp--;


                    			current = this_ExternalReduceExpression_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalAlpha.g:2579:3: this_ExternalArgReduceExpression_12= ruleExternalArgReduceExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getExternalArgReduceExpressionParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalArgReduceExpression_12=ruleExternalArgReduceExpression();

                    state._fsp--;


                    			current = this_ExternalArgReduceExpression_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalAlpha.g:2588:3: this_MultiArgExpression_13= ruleMultiArgExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getMultiArgExpressionParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiArgExpression_13=ruleMultiArgExpression();

                    state._fsp--;


                    			current = this_MultiArgExpression_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalAlpha.g:2597:3: this_ExternalMultiArgExpression_14= ruleExternalMultiArgExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getExternalMultiArgExpressionParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalMultiArgExpression_14=ruleExternalMultiArgExpression();

                    state._fsp--;


                    			current = this_ExternalMultiArgExpression_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalAlpha.g:2606:3: this_SelectExpression_15= ruleSelectExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getSelectExpressionParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectExpression_15=ruleSelectExpression();

                    state._fsp--;


                    			current = this_SelectExpression_15;
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
    // InternalAlpha.g:2618:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // InternalAlpha.g:2618:53: (iv_ruleIfExpression= ruleIfExpression EOF )
            // InternalAlpha.g:2619:2: iv_ruleIfExpression= ruleIfExpression EOF
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
    // InternalAlpha.g:2625:1: ruleIfExpression returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condExpr_1_0= ruleAlphaExpression ) ) otherlv_2= 'then' ( (lv_thenExpr_3_0= ruleAlphaExpression ) ) otherlv_4= 'else' ( (lv_elseExpr_5_0= ruleAlphaExpression ) ) ) ;
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
            // InternalAlpha.g:2631:2: ( (otherlv_0= 'if' ( (lv_condExpr_1_0= ruleAlphaExpression ) ) otherlv_2= 'then' ( (lv_thenExpr_3_0= ruleAlphaExpression ) ) otherlv_4= 'else' ( (lv_elseExpr_5_0= ruleAlphaExpression ) ) ) )
            // InternalAlpha.g:2632:2: (otherlv_0= 'if' ( (lv_condExpr_1_0= ruleAlphaExpression ) ) otherlv_2= 'then' ( (lv_thenExpr_3_0= ruleAlphaExpression ) ) otherlv_4= 'else' ( (lv_elseExpr_5_0= ruleAlphaExpression ) ) )
            {
            // InternalAlpha.g:2632:2: (otherlv_0= 'if' ( (lv_condExpr_1_0= ruleAlphaExpression ) ) otherlv_2= 'then' ( (lv_thenExpr_3_0= ruleAlphaExpression ) ) otherlv_4= 'else' ( (lv_elseExpr_5_0= ruleAlphaExpression ) ) )
            // InternalAlpha.g:2633:3: otherlv_0= 'if' ( (lv_condExpr_1_0= ruleAlphaExpression ) ) otherlv_2= 'then' ( (lv_thenExpr_3_0= ruleAlphaExpression ) ) otherlv_4= 'else' ( (lv_elseExpr_5_0= ruleAlphaExpression ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getIfExpressionAccess().getIfKeyword_0());
            		
            // InternalAlpha.g:2637:3: ( (lv_condExpr_1_0= ruleAlphaExpression ) )
            // InternalAlpha.g:2638:4: (lv_condExpr_1_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:2638:4: (lv_condExpr_1_0= ruleAlphaExpression )
            // InternalAlpha.g:2639:5: lv_condExpr_1_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getIfExpressionAccess().getCondExprAlphaExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_51);
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

            otherlv_2=(Token)match(input,55,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getIfExpressionAccess().getThenKeyword_2());
            		
            // InternalAlpha.g:2660:3: ( (lv_thenExpr_3_0= ruleAlphaExpression ) )
            // InternalAlpha.g:2661:4: (lv_thenExpr_3_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:2661:4: (lv_thenExpr_3_0= ruleAlphaExpression )
            // InternalAlpha.g:2662:5: lv_thenExpr_3_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getIfExpressionAccess().getThenExprAlphaExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_52);
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

            otherlv_4=(Token)match(input,56,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getIfExpressionAccess().getElseKeyword_4());
            		
            // InternalAlpha.g:2683:3: ( (lv_elseExpr_5_0= ruleAlphaExpression ) )
            // InternalAlpha.g:2684:4: (lv_elseExpr_5_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:2684:4: (lv_elseExpr_5_0= ruleAlphaExpression )
            // InternalAlpha.g:2685:5: lv_elseExpr_5_0= ruleAlphaExpression
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
    // InternalAlpha.g:2706:1: entryRuleRestrictExpression returns [EObject current=null] : iv_ruleRestrictExpression= ruleRestrictExpression EOF ;
    public final EObject entryRuleRestrictExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictExpression = null;


        try {
            // InternalAlpha.g:2706:59: (iv_ruleRestrictExpression= ruleRestrictExpression EOF )
            // InternalAlpha.g:2707:2: iv_ruleRestrictExpression= ruleRestrictExpression EOF
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
    // InternalAlpha.g:2713:1: ruleRestrictExpression returns [EObject current=null] : ( ( ( (lv_domainExpr_0_0= ruleJNIDomain ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) | (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) ) ) ;
    public final EObject ruleRestrictExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_domainExpr_0_0 = null;

        EObject lv_expr_2_0 = null;

        EObject lv_domainExpr_4_0 = null;

        EObject lv_expr_7_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2719:2: ( ( ( ( (lv_domainExpr_0_0= ruleJNIDomain ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) | (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) ) ) )
            // InternalAlpha.g:2720:2: ( ( ( (lv_domainExpr_0_0= ruleJNIDomain ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) | (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) ) )
            {
            // InternalAlpha.g:2720:2: ( ( ( (lv_domainExpr_0_0= ruleJNIDomain ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) | (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) ) )
            int alt47=2;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // InternalAlpha.g:2721:3: ( ( (lv_domainExpr_0_0= ruleJNIDomain ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) )
                    {
                    // InternalAlpha.g:2721:3: ( ( (lv_domainExpr_0_0= ruleJNIDomain ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) )
                    // InternalAlpha.g:2722:4: ( (lv_domainExpr_0_0= ruleJNIDomain ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) )
                    {
                    // InternalAlpha.g:2722:4: ( (lv_domainExpr_0_0= ruleJNIDomain ) )
                    // InternalAlpha.g:2723:5: (lv_domainExpr_0_0= ruleJNIDomain )
                    {
                    // InternalAlpha.g:2723:5: (lv_domainExpr_0_0= ruleJNIDomain )
                    // InternalAlpha.g:2724:6: lv_domainExpr_0_0= ruleJNIDomain
                    {

                    						newCompositeNode(grammarAccess.getRestrictExpressionAccess().getDomainExprJNIDomainParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_domainExpr_0_0=ruleJNIDomain();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestrictExpressionRule());
                    						}
                    						set(
                    							current,
                    							"domainExpr",
                    							lv_domainExpr_0_0,
                    							"alpha.model.Alpha.JNIDomain");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,32,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getRestrictExpressionAccess().getColonKeyword_0_1());
                    			
                    // InternalAlpha.g:2745:4: ( (lv_expr_2_0= ruleAlphaExpression ) )
                    // InternalAlpha.g:2746:5: (lv_expr_2_0= ruleAlphaExpression )
                    {
                    // InternalAlpha.g:2746:5: (lv_expr_2_0= ruleAlphaExpression )
                    // InternalAlpha.g:2747:6: lv_expr_2_0= ruleAlphaExpression
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
                    // InternalAlpha.g:2766:3: (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) )
                    {
                    // InternalAlpha.g:2766:3: (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) )
                    // InternalAlpha.g:2767:4: otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getRestrictExpressionAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalAlpha.g:2771:4: ( (lv_domainExpr_4_0= ruleCalculatorExpression ) )
                    // InternalAlpha.g:2772:5: (lv_domainExpr_4_0= ruleCalculatorExpression )
                    {
                    // InternalAlpha.g:2772:5: (lv_domainExpr_4_0= ruleCalculatorExpression )
                    // InternalAlpha.g:2773:6: lv_domainExpr_4_0= ruleCalculatorExpression
                    {

                    						newCompositeNode(grammarAccess.getRestrictExpressionAccess().getDomainExprCalculatorExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_34);
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
                    			
                    // InternalAlpha.g:2798:4: ( (lv_expr_7_0= ruleAlphaExpression ) )
                    // InternalAlpha.g:2799:5: (lv_expr_7_0= ruleAlphaExpression )
                    {
                    // InternalAlpha.g:2799:5: (lv_expr_7_0= ruleAlphaExpression )
                    // InternalAlpha.g:2800:6: lv_expr_7_0= ruleAlphaExpression
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
    // InternalAlpha.g:2822:1: entryRuleAutoRestrictExpression returns [EObject current=null] : iv_ruleAutoRestrictExpression= ruleAutoRestrictExpression EOF ;
    public final EObject entryRuleAutoRestrictExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoRestrictExpression = null;


        try {
            // InternalAlpha.g:2822:63: (iv_ruleAutoRestrictExpression= ruleAutoRestrictExpression EOF )
            // InternalAlpha.g:2823:2: iv_ruleAutoRestrictExpression= ruleAutoRestrictExpression EOF
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
    // InternalAlpha.g:2829:1: ruleAutoRestrictExpression returns [EObject current=null] : (otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) ;
    public final EObject ruleAutoRestrictExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2835:2: ( (otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) )
            // InternalAlpha.g:2836:2: (otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) )
            {
            // InternalAlpha.g:2836:2: (otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) )
            // InternalAlpha.g:2837:3: otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getAutoRestrictExpressionAccess().getAutoKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getAutoRestrictExpressionAccess().getColonKeyword_1());
            		
            // InternalAlpha.g:2845:3: ( (lv_expr_2_0= ruleAlphaExpression ) )
            // InternalAlpha.g:2846:4: (lv_expr_2_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:2846:4: (lv_expr_2_0= ruleAlphaExpression )
            // InternalAlpha.g:2847:5: lv_expr_2_0= ruleAlphaExpression
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
    // InternalAlpha.g:2868:1: entryRuleCaseExpression returns [EObject current=null] : iv_ruleCaseExpression= ruleCaseExpression EOF ;
    public final EObject entryRuleCaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseExpression = null;


        try {
            // InternalAlpha.g:2868:55: (iv_ruleCaseExpression= ruleCaseExpression EOF )
            // InternalAlpha.g:2869:2: iv_ruleCaseExpression= ruleCaseExpression EOF
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
    // InternalAlpha.g:2875:1: ruleCaseExpression returns [EObject current=null] : (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' ) ;
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
            // InternalAlpha.g:2881:2: ( (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' ) )
            // InternalAlpha.g:2882:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' )
            {
            // InternalAlpha.g:2882:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' )
            // InternalAlpha.g:2883:3: otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_53); 

            			newLeafNode(otherlv_0, grammarAccess.getCaseExpressionAccess().getCaseKeyword_0());
            		
            // InternalAlpha.g:2887:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAlpha.g:2888:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalAlpha.g:2888:4: (lv_name_1_0= RULE_ID )
                    // InternalAlpha.g:2889:5: lv_name_1_0= RULE_ID
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
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getCaseExpressionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlpha.g:2909:3: ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_INT)||(LA49_0>=RULE_BOOLEAN && LA49_0<=RULE_FLOAT)||LA49_0==16||LA49_0==20||LA49_0==36||(LA49_0>=40 && LA49_0<=42)||(LA49_0>=45 && LA49_0<=46)||LA49_0==54||(LA49_0>=57 && LA49_0<=58)||(LA49_0>=60 && LA49_0<=64)||(LA49_0>=66 && LA49_0<=70)||LA49_0==72) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalAlpha.g:2910:4: ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';'
            	    {
            	    // InternalAlpha.g:2910:4: ( (lv_exprs_3_0= ruleAlphaExpression ) )
            	    // InternalAlpha.g:2911:5: (lv_exprs_3_0= ruleAlphaExpression )
            	    {
            	    // InternalAlpha.g:2911:5: (lv_exprs_3_0= ruleAlphaExpression )
            	    // InternalAlpha.g:2912:6: lv_exprs_3_0= ruleAlphaExpression
            	    {

            	    						newCompositeNode(grammarAccess.getCaseExpressionAccess().getExprsAlphaExpressionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_46);
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

            	    otherlv_4=(Token)match(input,39,FOLLOW_54); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCaseExpressionAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
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
    // InternalAlpha.g:2942:1: entryRuleDependenceExpression returns [EObject current=null] : iv_ruleDependenceExpression= ruleDependenceExpression EOF ;
    public final EObject entryRuleDependenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependenceExpression = null;


        try {
            // InternalAlpha.g:2942:61: (iv_ruleDependenceExpression= ruleDependenceExpression EOF )
            // InternalAlpha.g:2943:2: iv_ruleDependenceExpression= ruleDependenceExpression EOF
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
    // InternalAlpha.g:2949:1: ruleDependenceExpression returns [EObject current=null] : ( ( ( (lv_function_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_function_4_0= ruleJNIFunctionInArrayNotation ) ) ) ) ;
    public final EObject ruleDependenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_function_0_0 = null;

        EObject lv_expr_2_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_function_4_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2955:2: ( ( ( ( (lv_function_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_function_4_0= ruleJNIFunctionInArrayNotation ) ) ) ) )
            // InternalAlpha.g:2956:2: ( ( ( (lv_function_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_function_4_0= ruleJNIFunctionInArrayNotation ) ) ) )
            {
            // InternalAlpha.g:2956:2: ( ( ( (lv_function_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_function_4_0= ruleJNIFunctionInArrayNotation ) ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==16) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_ID) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalAlpha.g:2957:3: ( ( (lv_function_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) )
                    {
                    // InternalAlpha.g:2957:3: ( ( (lv_function_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) )
                    // InternalAlpha.g:2958:4: ( (lv_function_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) )
                    {
                    // InternalAlpha.g:2958:4: ( (lv_function_0_0= ruleJNIFunction ) )
                    // InternalAlpha.g:2959:5: (lv_function_0_0= ruleJNIFunction )
                    {
                    // InternalAlpha.g:2959:5: (lv_function_0_0= ruleJNIFunction )
                    // InternalAlpha.g:2960:6: lv_function_0_0= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getDependenceExpressionAccess().getFunctionJNIFunctionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_function_0_0=ruleJNIFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDependenceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"function",
                    							lv_function_0_0,
                    							"alpha.model.Alpha.JNIFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,59,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getDependenceExpressionAccess().getCommercialAtKeyword_0_1());
                    			
                    // InternalAlpha.g:2981:4: ( (lv_expr_2_0= ruleAlphaTerminalExpression ) )
                    // InternalAlpha.g:2982:5: (lv_expr_2_0= ruleAlphaTerminalExpression )
                    {
                    // InternalAlpha.g:2982:5: (lv_expr_2_0= ruleAlphaTerminalExpression )
                    // InternalAlpha.g:2983:6: lv_expr_2_0= ruleAlphaTerminalExpression
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
                    // InternalAlpha.g:3002:3: ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_function_4_0= ruleJNIFunctionInArrayNotation ) ) )
                    {
                    // InternalAlpha.g:3002:3: ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_function_4_0= ruleJNIFunctionInArrayNotation ) ) )
                    // InternalAlpha.g:3003:4: ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_function_4_0= ruleJNIFunctionInArrayNotation ) )
                    {
                    // InternalAlpha.g:3003:4: ( (lv_expr_3_0= ruleVariableExpression ) )
                    // InternalAlpha.g:3004:5: (lv_expr_3_0= ruleVariableExpression )
                    {
                    // InternalAlpha.g:3004:5: (lv_expr_3_0= ruleVariableExpression )
                    // InternalAlpha.g:3005:6: lv_expr_3_0= ruleVariableExpression
                    {

                    						newCompositeNode(grammarAccess.getDependenceExpressionAccess().getExprVariableExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_50);
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

                    // InternalAlpha.g:3022:4: ( (lv_function_4_0= ruleJNIFunctionInArrayNotation ) )
                    // InternalAlpha.g:3023:5: (lv_function_4_0= ruleJNIFunctionInArrayNotation )
                    {
                    // InternalAlpha.g:3023:5: (lv_function_4_0= ruleJNIFunctionInArrayNotation )
                    // InternalAlpha.g:3024:6: lv_function_4_0= ruleJNIFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getDependenceExpressionAccess().getFunctionJNIFunctionInArrayNotationParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_function_4_0=ruleJNIFunctionInArrayNotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDependenceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"function",
                    							lv_function_4_0,
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


    // $ANTLR start "entryRuleIndexExpression"
    // InternalAlpha.g:3046:1: entryRuleIndexExpression returns [EObject current=null] : iv_ruleIndexExpression= ruleIndexExpression EOF ;
    public final EObject entryRuleIndexExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexExpression = null;


        try {
            // InternalAlpha.g:3046:56: (iv_ruleIndexExpression= ruleIndexExpression EOF )
            // InternalAlpha.g:3047:2: iv_ruleIndexExpression= ruleIndexExpression EOF
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
    // InternalAlpha.g:3053:1: ruleIndexExpression returns [EObject current=null] : ( (otherlv_0= 'val' ( (lv_function_1_0= ruleJNIFunction ) ) ) | ( (lv_function_2_0= ruleJNIFunctionInArrayNotation ) ) ) ;
    public final EObject ruleIndexExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_function_1_0 = null;

        EObject lv_function_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3059:2: ( ( (otherlv_0= 'val' ( (lv_function_1_0= ruleJNIFunction ) ) ) | ( (lv_function_2_0= ruleJNIFunctionInArrayNotation ) ) ) )
            // InternalAlpha.g:3060:2: ( (otherlv_0= 'val' ( (lv_function_1_0= ruleJNIFunction ) ) ) | ( (lv_function_2_0= ruleJNIFunctionInArrayNotation ) ) )
            {
            // InternalAlpha.g:3060:2: ( (otherlv_0= 'val' ( (lv_function_1_0= ruleJNIFunction ) ) ) | ( (lv_function_2_0= ruleJNIFunctionInArrayNotation ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==60) ) {
                alt51=1;
            }
            else if ( (LA51_0==36) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalAlpha.g:3061:3: (otherlv_0= 'val' ( (lv_function_1_0= ruleJNIFunction ) ) )
                    {
                    // InternalAlpha.g:3061:3: (otherlv_0= 'val' ( (lv_function_1_0= ruleJNIFunction ) ) )
                    // InternalAlpha.g:3062:4: otherlv_0= 'val' ( (lv_function_1_0= ruleJNIFunction ) )
                    {
                    otherlv_0=(Token)match(input,60,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getIndexExpressionAccess().getValKeyword_0_0());
                    			
                    // InternalAlpha.g:3066:4: ( (lv_function_1_0= ruleJNIFunction ) )
                    // InternalAlpha.g:3067:5: (lv_function_1_0= ruleJNIFunction )
                    {
                    // InternalAlpha.g:3067:5: (lv_function_1_0= ruleJNIFunction )
                    // InternalAlpha.g:3068:6: lv_function_1_0= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getIndexExpressionAccess().getFunctionJNIFunctionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_function_1_0=ruleJNIFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIndexExpressionRule());
                    						}
                    						set(
                    							current,
                    							"function",
                    							lv_function_1_0,
                    							"alpha.model.Alpha.JNIFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3087:3: ( (lv_function_2_0= ruleJNIFunctionInArrayNotation ) )
                    {
                    // InternalAlpha.g:3087:3: ( (lv_function_2_0= ruleJNIFunctionInArrayNotation ) )
                    // InternalAlpha.g:3088:4: (lv_function_2_0= ruleJNIFunctionInArrayNotation )
                    {
                    // InternalAlpha.g:3088:4: (lv_function_2_0= ruleJNIFunctionInArrayNotation )
                    // InternalAlpha.g:3089:5: lv_function_2_0= ruleJNIFunctionInArrayNotation
                    {

                    					newCompositeNode(grammarAccess.getIndexExpressionAccess().getFunctionJNIFunctionInArrayNotationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_function_2_0=ruleJNIFunctionInArrayNotation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIndexExpressionRule());
                    					}
                    					set(
                    						current,
                    						"function",
                    						lv_function_2_0,
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


    // $ANTLR start "entryRuleReduceExpression"
    // InternalAlpha.g:3110:1: entryRuleReduceExpression returns [EObject current=null] : iv_ruleReduceExpression= ruleReduceExpression EOF ;
    public final EObject entryRuleReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReduceExpression = null;


        try {
            // InternalAlpha.g:3110:57: (iv_ruleReduceExpression= ruleReduceExpression EOF )
            // InternalAlpha.g:3111:2: iv_ruleReduceExpression= ruleReduceExpression EOF
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
    // InternalAlpha.g:3117:1: ruleReduceExpression returns [EObject current=null] : (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleReduceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_projection_4_1 = null;

        EObject lv_projection_4_2 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3123:2: ( (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:3124:2: (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:3124:2: (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:3125:3: otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getReduceExpressionAccess().getReduceKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:3133:3: ( (lv_operator_2_0= ruleAREDUCTION_OP ) )
            // InternalAlpha.g:3134:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            {
            // InternalAlpha.g:3134:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            // InternalAlpha.g:3135:5: lv_operator_2_0= ruleAREDUCTION_OP
            {

            					newCompositeNode(grammarAccess.getReduceExpressionAccess().getOperatorAREDUCTION_OPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_57);
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

            otherlv_3=(Token)match(input,35,FOLLOW_58); 

            			newLeafNode(otherlv_3, grammarAccess.getReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:3156:3: ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) )
            // InternalAlpha.g:3157:4: ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:3157:4: ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:3158:5: (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:3158:5: (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==16) ) {
                alt52=1;
            }
            else if ( (LA52_0==36) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalAlpha.g:3159:6: lv_projection_4_1= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getReduceExpressionAccess().getProjectionJNIFunctionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_projection_4_1=ruleJNIFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReduceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"projection",
                    							lv_projection_4_1,
                    							"alpha.model.Alpha.JNIFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3175:6: lv_projection_4_2= ruleJNIFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getReduceExpressionAccess().getProjectionJNIFunctionInArrayNotationParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_57);
                    lv_projection_4_2=ruleJNIFunctionInArrayNotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReduceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"projection",
                    							lv_projection_4_2,
                    							"alpha.model.Alpha.JNIFunctionInArrayNotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:3197:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:3198:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:3198:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:3199:5: lv_body_6_0= ruleAlphaExpression
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
    // InternalAlpha.g:3224:1: entryRuleExternalReduceExpression returns [EObject current=null] : iv_ruleExternalReduceExpression= ruleExternalReduceExpression EOF ;
    public final EObject entryRuleExternalReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalReduceExpression = null;


        try {
            // InternalAlpha.g:3224:65: (iv_ruleExternalReduceExpression= ruleExternalReduceExpression EOF )
            // InternalAlpha.g:3225:2: iv_ruleExternalReduceExpression= ruleExternalReduceExpression EOF
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
    // InternalAlpha.g:3231:1: ruleExternalReduceExpression returns [EObject current=null] : (otherlv_0= 'reduce' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleExternalReduceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_projection_4_1 = null;

        EObject lv_projection_4_2 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3237:2: ( (otherlv_0= 'reduce' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:3238:2: (otherlv_0= 'reduce' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:3238:2: (otherlv_0= 'reduce' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:3239:3: otherlv_0= 'reduce' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalReduceExpressionAccess().getReduceKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:3247:3: ( (otherlv_2= RULE_ID ) )
            // InternalAlpha.g:3248:4: (otherlv_2= RULE_ID )
            {
            // InternalAlpha.g:3248:4: (otherlv_2= RULE_ID )
            // InternalAlpha.g:3249:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalReduceExpressionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_57); 

            					newLeafNode(otherlv_2, grammarAccess.getExternalReduceExpressionAccess().getExternalFunctionExternalFunctionCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_58); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:3264:3: ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) )
            // InternalAlpha.g:3265:4: ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:3265:4: ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:3266:5: (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:3266:5: (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==16) ) {
                alt53=1;
            }
            else if ( (LA53_0==36) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalAlpha.g:3267:6: lv_projection_4_1= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getExternalReduceExpressionAccess().getProjectionJNIFunctionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_projection_4_1=ruleJNIFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalReduceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"projection",
                    							lv_projection_4_1,
                    							"alpha.model.Alpha.JNIFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3283:6: lv_projection_4_2= ruleJNIFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getExternalReduceExpressionAccess().getProjectionJNIFunctionInArrayNotationParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_57);
                    lv_projection_4_2=ruleJNIFunctionInArrayNotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalReduceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"projection",
                    							lv_projection_4_2,
                    							"alpha.model.Alpha.JNIFunctionInArrayNotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:3305:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:3306:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:3306:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:3307:5: lv_body_6_0= ruleAlphaExpression
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
    // InternalAlpha.g:3332:1: entryRuleArgReduceExpression returns [EObject current=null] : iv_ruleArgReduceExpression= ruleArgReduceExpression EOF ;
    public final EObject entryRuleArgReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgReduceExpression = null;


        try {
            // InternalAlpha.g:3332:60: (iv_ruleArgReduceExpression= ruleArgReduceExpression EOF )
            // InternalAlpha.g:3333:2: iv_ruleArgReduceExpression= ruleArgReduceExpression EOF
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
    // InternalAlpha.g:3339:1: ruleArgReduceExpression returns [EObject current=null] : (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleArgReduceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_projection_4_1 = null;

        EObject lv_projection_4_2 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3345:2: ( (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:3346:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:3346:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:3347:3: otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getArgReduceExpressionAccess().getArgreduceKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getArgReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:3355:3: ( (lv_operator_2_0= ruleAREDUCTION_OP ) )
            // InternalAlpha.g:3356:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            {
            // InternalAlpha.g:3356:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            // InternalAlpha.g:3357:5: lv_operator_2_0= ruleAREDUCTION_OP
            {

            					newCompositeNode(grammarAccess.getArgReduceExpressionAccess().getOperatorAREDUCTION_OPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_57);
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

            otherlv_3=(Token)match(input,35,FOLLOW_58); 

            			newLeafNode(otherlv_3, grammarAccess.getArgReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:3378:3: ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) )
            // InternalAlpha.g:3379:4: ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:3379:4: ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:3380:5: (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:3380:5: (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==16) ) {
                alt54=1;
            }
            else if ( (LA54_0==36) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalAlpha.g:3381:6: lv_projection_4_1= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getArgReduceExpressionAccess().getProjectionJNIFunctionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_projection_4_1=ruleJNIFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArgReduceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"projection",
                    							lv_projection_4_1,
                    							"alpha.model.Alpha.JNIFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3397:6: lv_projection_4_2= ruleJNIFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getArgReduceExpressionAccess().getProjectionJNIFunctionInArrayNotationParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_57);
                    lv_projection_4_2=ruleJNIFunctionInArrayNotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArgReduceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"projection",
                    							lv_projection_4_2,
                    							"alpha.model.Alpha.JNIFunctionInArrayNotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getArgReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:3419:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:3420:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:3420:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:3421:5: lv_body_6_0= ruleAlphaExpression
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
    // InternalAlpha.g:3446:1: entryRuleExternalArgReduceExpression returns [EObject current=null] : iv_ruleExternalArgReduceExpression= ruleExternalArgReduceExpression EOF ;
    public final EObject entryRuleExternalArgReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalArgReduceExpression = null;


        try {
            // InternalAlpha.g:3446:68: (iv_ruleExternalArgReduceExpression= ruleExternalArgReduceExpression EOF )
            // InternalAlpha.g:3447:2: iv_ruleExternalArgReduceExpression= ruleExternalArgReduceExpression EOF
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
    // InternalAlpha.g:3453:1: ruleExternalArgReduceExpression returns [EObject current=null] : (otherlv_0= 'argreduce' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleExternalArgReduceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_projection_4_1 = null;

        EObject lv_projection_4_2 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3459:2: ( (otherlv_0= 'argreduce' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:3460:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:3460:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:3461:3: otherlv_0= 'argreduce' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalArgReduceExpressionAccess().getArgreduceKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalArgReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:3469:3: ( (otherlv_2= RULE_ID ) )
            // InternalAlpha.g:3470:4: (otherlv_2= RULE_ID )
            {
            // InternalAlpha.g:3470:4: (otherlv_2= RULE_ID )
            // InternalAlpha.g:3471:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalArgReduceExpressionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_57); 

            					newLeafNode(otherlv_2, grammarAccess.getExternalArgReduceExpressionAccess().getExternalFunctionExternalFunctionCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_58); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalArgReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:3486:3: ( ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) ) )
            // InternalAlpha.g:3487:4: ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:3487:4: ( (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:3488:5: (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:3488:5: (lv_projection_4_1= ruleJNIFunction | lv_projection_4_2= ruleJNIFunctionInArrayNotation )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==16) ) {
                alt55=1;
            }
            else if ( (LA55_0==36) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalAlpha.g:3489:6: lv_projection_4_1= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getExternalArgReduceExpressionAccess().getProjectionJNIFunctionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_projection_4_1=ruleJNIFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalArgReduceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"projection",
                    							lv_projection_4_1,
                    							"alpha.model.Alpha.JNIFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3505:6: lv_projection_4_2= ruleJNIFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getExternalArgReduceExpressionAccess().getProjectionJNIFunctionInArrayNotationParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_57);
                    lv_projection_4_2=ruleJNIFunctionInArrayNotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalArgReduceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"projection",
                    							lv_projection_4_2,
                    							"alpha.model.Alpha.JNIFunctionInArrayNotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalArgReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:3527:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:3528:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:3528:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:3529:5: lv_body_6_0= ruleAlphaExpression
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
    // InternalAlpha.g:3554:1: entryRuleConvolutionExpression returns [EObject current=null] : iv_ruleConvolutionExpression= ruleConvolutionExpression EOF ;
    public final EObject entryRuleConvolutionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConvolutionExpression = null;


        try {
            // InternalAlpha.g:3554:62: (iv_ruleConvolutionExpression= ruleConvolutionExpression EOF )
            // InternalAlpha.g:3555:2: iv_ruleConvolutionExpression= ruleConvolutionExpression EOF
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
    // InternalAlpha.g:3561:1: ruleConvolutionExpression returns [EObject current=null] : (otherlv_0= 'conv' otherlv_1= '(' ( (lv_kernelDomain_2_0= ruleCalculatorExpression ) ) otherlv_3= ',' ( (lv_kernelExpression_4_0= ruleAlphaExpression ) ) otherlv_5= ',' ( (lv_dataExpression_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleConvolutionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_kernelDomain_2_0 = null;

        EObject lv_kernelExpression_4_0 = null;

        EObject lv_dataExpression_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3567:2: ( (otherlv_0= 'conv' otherlv_1= '(' ( (lv_kernelDomain_2_0= ruleCalculatorExpression ) ) otherlv_3= ',' ( (lv_kernelExpression_4_0= ruleAlphaExpression ) ) otherlv_5= ',' ( (lv_dataExpression_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:3568:2: (otherlv_0= 'conv' otherlv_1= '(' ( (lv_kernelDomain_2_0= ruleCalculatorExpression ) ) otherlv_3= ',' ( (lv_kernelExpression_4_0= ruleAlphaExpression ) ) otherlv_5= ',' ( (lv_dataExpression_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:3568:2: (otherlv_0= 'conv' otherlv_1= '(' ( (lv_kernelDomain_2_0= ruleCalculatorExpression ) ) otherlv_3= ',' ( (lv_kernelExpression_4_0= ruleAlphaExpression ) ) otherlv_5= ',' ( (lv_dataExpression_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:3569:3: otherlv_0= 'conv' otherlv_1= '(' ( (lv_kernelDomain_2_0= ruleCalculatorExpression ) ) otherlv_3= ',' ( (lv_kernelExpression_4_0= ruleAlphaExpression ) ) otherlv_5= ',' ( (lv_dataExpression_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getConvolutionExpressionAccess().getConvKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getConvolutionExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:3577:3: ( (lv_kernelDomain_2_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:3578:4: (lv_kernelDomain_2_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:3578:4: (lv_kernelDomain_2_0= ruleCalculatorExpression )
            // InternalAlpha.g:3579:5: lv_kernelDomain_2_0= ruleCalculatorExpression
            {

            					newCompositeNode(grammarAccess.getConvolutionExpressionAccess().getKernelDomainCalculatorExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_57);
            lv_kernelDomain_2_0=ruleCalculatorExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConvolutionExpressionRule());
            					}
            					set(
            						current,
            						"kernelDomain",
            						lv_kernelDomain_2_0,
            						"alpha.model.Alpha.CalculatorExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getConvolutionExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:3600:3: ( (lv_kernelExpression_4_0= ruleAlphaExpression ) )
            // InternalAlpha.g:3601:4: (lv_kernelExpression_4_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:3601:4: (lv_kernelExpression_4_0= ruleAlphaExpression )
            // InternalAlpha.g:3602:5: lv_kernelExpression_4_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getConvolutionExpressionAccess().getKernelExpressionAlphaExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_57);
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
            		
            // InternalAlpha.g:3623:3: ( (lv_dataExpression_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:3624:4: (lv_dataExpression_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:3624:4: (lv_dataExpression_6_0= ruleAlphaExpression )
            // InternalAlpha.g:3625:5: lv_dataExpression_6_0= ruleAlphaExpression
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
    // InternalAlpha.g:3650:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // InternalAlpha.g:3650:57: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // InternalAlpha.g:3651:2: iv_ruleSelectExpression= ruleSelectExpression EOF
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
    // InternalAlpha.g:3657:1: ruleSelectExpression returns [EObject current=null] : (otherlv_0= 'select' ( (lv_selectRelation_1_0= ruleCalculatorExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAlphaTerminalExpression ) ) ) ;
    public final EObject ruleSelectExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_selectRelation_1_0 = null;

        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3663:2: ( (otherlv_0= 'select' ( (lv_selectRelation_1_0= ruleCalculatorExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAlphaTerminalExpression ) ) ) )
            // InternalAlpha.g:3664:2: (otherlv_0= 'select' ( (lv_selectRelation_1_0= ruleCalculatorExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAlphaTerminalExpression ) ) )
            {
            // InternalAlpha.g:3664:2: (otherlv_0= 'select' ( (lv_selectRelation_1_0= ruleCalculatorExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAlphaTerminalExpression ) ) )
            // InternalAlpha.g:3665:3: otherlv_0= 'select' ( (lv_selectRelation_1_0= ruleCalculatorExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAlphaTerminalExpression ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectExpressionAccess().getSelectKeyword_0());
            		
            // InternalAlpha.g:3669:3: ( (lv_selectRelation_1_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:3670:4: (lv_selectRelation_1_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:3670:4: (lv_selectRelation_1_0= ruleCalculatorExpression )
            // InternalAlpha.g:3671:5: lv_selectRelation_1_0= ruleCalculatorExpression
            {

            					newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectRelationCalculatorExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_59);
            lv_selectRelation_1_0=ruleCalculatorExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
            					}
            					set(
            						current,
            						"selectRelation",
            						lv_selectRelation_1_0,
            						"alpha.model.Alpha.CalculatorExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectExpressionAccess().getFromKeyword_2());
            		
            // InternalAlpha.g:3692:3: ( (lv_expr_3_0= ruleAlphaTerminalExpression ) )
            // InternalAlpha.g:3693:4: (lv_expr_3_0= ruleAlphaTerminalExpression )
            {
            // InternalAlpha.g:3693:4: (lv_expr_3_0= ruleAlphaTerminalExpression )
            // InternalAlpha.g:3694:5: lv_expr_3_0= ruleAlphaTerminalExpression
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
    // InternalAlpha.g:3715:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalAlpha.g:3715:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalAlpha.g:3716:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalAlpha.g:3722:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3728:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalAlpha.g:3729:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalAlpha.g:3729:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalAlpha.g:3730:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_60);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:3738:3: ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==46||LA56_0==70) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalAlpha.g:3739:4: () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalAlpha.g:3739:4: ()
            	    // InternalAlpha.g:3740:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:3746:4: ( (lv_operator_2_0= ruleAOrOP ) )
            	    // InternalAlpha.g:3747:5: (lv_operator_2_0= ruleAOrOP )
            	    {
            	    // InternalAlpha.g:3747:5: (lv_operator_2_0= ruleAOrOP )
            	    // InternalAlpha.g:3748:6: lv_operator_2_0= ruleAOrOP
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

            	    // InternalAlpha.g:3765:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalAlpha.g:3766:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalAlpha.g:3766:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalAlpha.g:3767:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_60);
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
            	    break loop56;
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
    // InternalAlpha.g:3789:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalAlpha.g:3789:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalAlpha.g:3790:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalAlpha.g:3796:1: ruleAndExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3802:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // InternalAlpha.g:3803:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // InternalAlpha.g:3803:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // InternalAlpha.g:3804:3: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_61);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;


            			current = this_RelationalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:3812:3: ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==45) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalAlpha.g:3813:4: () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // InternalAlpha.g:3813:4: ()
            	    // InternalAlpha.g:3814:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:3820:4: ( (lv_operator_2_0= ruleAAndOP ) )
            	    // InternalAlpha.g:3821:5: (lv_operator_2_0= ruleAAndOP )
            	    {
            	    // InternalAlpha.g:3821:5: (lv_operator_2_0= ruleAAndOP )
            	    // InternalAlpha.g:3822:6: lv_operator_2_0= ruleAAndOP
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

            	    // InternalAlpha.g:3839:4: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // InternalAlpha.g:3840:5: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // InternalAlpha.g:3840:5: (lv_right_3_0= ruleRelationalExpression )
            	    // InternalAlpha.g:3841:6: lv_right_3_0= ruleRelationalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightRelationalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_61);
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
            	    break loop57;
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
    // InternalAlpha.g:3863:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalAlpha.g:3863:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalAlpha.g:3864:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
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
    // InternalAlpha.g:3870:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3876:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalAlpha.g:3877:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalAlpha.g:3877:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            // InternalAlpha.g:3878:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_62);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:3886:3: ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==14||(LA58_0>=49 && LA58_0<=52)||LA58_0==71) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalAlpha.g:3887:4: () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalAlpha.g:3887:4: ()
            	    // InternalAlpha.g:3888:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRelationalExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:3894:4: ( (lv_operator_2_0= ruleARelationalOP ) )
            	    // InternalAlpha.g:3895:5: (lv_operator_2_0= ruleARelationalOP )
            	    {
            	    // InternalAlpha.g:3895:5: (lv_operator_2_0= ruleARelationalOP )
            	    // InternalAlpha.g:3896:6: lv_operator_2_0= ruleARelationalOP
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

            	    // InternalAlpha.g:3913:4: ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    // InternalAlpha.g:3914:5: (lv_right_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalAlpha.g:3914:5: (lv_right_3_0= ruleAdditiveExpression )
            	    // InternalAlpha.g:3915:6: lv_right_3_0= ruleAdditiveExpression
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_62);
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
            	    break loop58;
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
    // InternalAlpha.g:3937:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalAlpha.g:3937:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalAlpha.g:3938:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalAlpha.g:3944:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3950:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalAlpha.g:3951:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalAlpha.g:3951:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalAlpha.g:3952:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_63);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:3960:3: ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=40 && LA59_0<=41)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalAlpha.g:3961:4: () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalAlpha.g:3961:4: ()
            	    // InternalAlpha.g:3962:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:3968:4: ( (lv_operator_2_0= ruleAAdditiveOP ) )
            	    // InternalAlpha.g:3969:5: (lv_operator_2_0= ruleAAdditiveOP )
            	    {
            	    // InternalAlpha.g:3969:5: (lv_operator_2_0= ruleAAdditiveOP )
            	    // InternalAlpha.g:3970:6: lv_operator_2_0= ruleAAdditiveOP
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

            	    // InternalAlpha.g:3987:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalAlpha.g:3988:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalAlpha.g:3988:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalAlpha.g:3989:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_63);
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
            	    break loop59;
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
    // InternalAlpha.g:4011:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalAlpha.g:4011:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalAlpha.g:4012:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalAlpha.g:4018:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_MinMaxExpression_0= ruleMinMaxExpression ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MinMaxExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4024:2: ( (this_MinMaxExpression_0= ruleMinMaxExpression ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )* ) )
            // InternalAlpha.g:4025:2: (this_MinMaxExpression_0= ruleMinMaxExpression ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )* )
            {
            // InternalAlpha.g:4025:2: (this_MinMaxExpression_0= ruleMinMaxExpression ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )* )
            // InternalAlpha.g:4026:3: this_MinMaxExpression_0= ruleMinMaxExpression ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getMinMaxExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_64);
            this_MinMaxExpression_0=ruleMinMaxExpression();

            state._fsp--;


            			current = this_MinMaxExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:4034:3: ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=42 && LA60_0<=43)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalAlpha.g:4035:4: () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) )
            	    {
            	    // InternalAlpha.g:4035:4: ()
            	    // InternalAlpha.g:4036:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:4042:4: ( (lv_operator_2_0= ruleAMultiplicativeOP ) )
            	    // InternalAlpha.g:4043:5: (lv_operator_2_0= ruleAMultiplicativeOP )
            	    {
            	    // InternalAlpha.g:4043:5: (lv_operator_2_0= ruleAMultiplicativeOP )
            	    // InternalAlpha.g:4044:6: lv_operator_2_0= ruleAMultiplicativeOP
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

            	    // InternalAlpha.g:4061:4: ( (lv_right_3_0= ruleMinMaxExpression ) )
            	    // InternalAlpha.g:4062:5: (lv_right_3_0= ruleMinMaxExpression )
            	    {
            	    // InternalAlpha.g:4062:5: (lv_right_3_0= ruleMinMaxExpression )
            	    // InternalAlpha.g:4063:6: lv_right_3_0= ruleMinMaxExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightMinMaxExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_64);
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
            	    break loop60;
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
    // InternalAlpha.g:4085:1: entryRuleMinMaxExpression returns [EObject current=null] : iv_ruleMinMaxExpression= ruleMinMaxExpression EOF ;
    public final EObject entryRuleMinMaxExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinMaxExpression = null;


        try {
            // InternalAlpha.g:4085:57: (iv_ruleMinMaxExpression= ruleMinMaxExpression EOF )
            // InternalAlpha.g:4086:2: iv_ruleMinMaxExpression= ruleMinMaxExpression EOF
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
    // InternalAlpha.g:4092:1: ruleMinMaxExpression returns [EObject current=null] : (this_UnaryOrTerminalExpression_0= ruleUnaryOrTerminalExpression ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )* ) ;
    public final EObject ruleMinMaxExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOrTerminalExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4098:2: ( (this_UnaryOrTerminalExpression_0= ruleUnaryOrTerminalExpression ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )* ) )
            // InternalAlpha.g:4099:2: (this_UnaryOrTerminalExpression_0= ruleUnaryOrTerminalExpression ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )* )
            {
            // InternalAlpha.g:4099:2: (this_UnaryOrTerminalExpression_0= ruleUnaryOrTerminalExpression ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )* )
            // InternalAlpha.g:4100:3: this_UnaryOrTerminalExpression_0= ruleUnaryOrTerminalExpression ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMinMaxExpressionAccess().getUnaryOrTerminalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_65);
            this_UnaryOrTerminalExpression_0=ruleUnaryOrTerminalExpression();

            state._fsp--;


            			current = this_UnaryOrTerminalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:4108:3: ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=66 && LA61_0<=67)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalAlpha.g:4109:4: () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) )
            	    {
            	    // InternalAlpha.g:4109:4: ()
            	    // InternalAlpha.g:4110:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMinMaxExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:4116:4: ( (lv_operator_2_0= ruleAMINMAX_OP ) )
            	    // InternalAlpha.g:4117:5: (lv_operator_2_0= ruleAMINMAX_OP )
            	    {
            	    // InternalAlpha.g:4117:5: (lv_operator_2_0= ruleAMINMAX_OP )
            	    // InternalAlpha.g:4118:6: lv_operator_2_0= ruleAMINMAX_OP
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

            	    // InternalAlpha.g:4135:4: ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) )
            	    // InternalAlpha.g:4136:5: (lv_right_3_0= ruleUnaryOrTerminalExpression )
            	    {
            	    // InternalAlpha.g:4136:5: (lv_right_3_0= ruleUnaryOrTerminalExpression )
            	    // InternalAlpha.g:4137:6: lv_right_3_0= ruleUnaryOrTerminalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMinMaxExpressionAccess().getRightUnaryOrTerminalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_65);
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
            	    break loop61;
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
    // InternalAlpha.g:4159:1: entryRuleMultiArgExpression returns [EObject current=null] : iv_ruleMultiArgExpression= ruleMultiArgExpression EOF ;
    public final EObject entryRuleMultiArgExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiArgExpression = null;


        try {
            // InternalAlpha.g:4159:59: (iv_ruleMultiArgExpression= ruleMultiArgExpression EOF )
            // InternalAlpha.g:4160:2: iv_ruleMultiArgExpression= ruleMultiArgExpression EOF
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
    // InternalAlpha.g:4166:1: ruleMultiArgExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAREDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' ) ;
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
            // InternalAlpha.g:4172:2: ( ( ( (lv_operator_0_0= ruleAREDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' ) )
            // InternalAlpha.g:4173:2: ( ( (lv_operator_0_0= ruleAREDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' )
            {
            // InternalAlpha.g:4173:2: ( ( (lv_operator_0_0= ruleAREDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' )
            // InternalAlpha.g:4174:3: ( (lv_operator_0_0= ruleAREDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')'
            {
            // InternalAlpha.g:4174:3: ( (lv_operator_0_0= ruleAREDUCTION_OP ) )
            // InternalAlpha.g:4175:4: (lv_operator_0_0= ruleAREDUCTION_OP )
            {
            // InternalAlpha.g:4175:4: (lv_operator_0_0= ruleAREDUCTION_OP )
            // InternalAlpha.g:4176:5: lv_operator_0_0= ruleAREDUCTION_OP
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
            		
            // InternalAlpha.g:4197:3: ( (lv_exprs_2_0= ruleAlphaExpression ) )
            // InternalAlpha.g:4198:4: (lv_exprs_2_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:4198:4: (lv_exprs_2_0= ruleAlphaExpression )
            // InternalAlpha.g:4199:5: lv_exprs_2_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getMultiArgExpressionAccess().getExprsAlphaExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_49);
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

            // InternalAlpha.g:4216:3: (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==35) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalAlpha.g:4217:4: otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_20); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMultiArgExpressionAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalAlpha.g:4221:4: ( (lv_exprs_4_0= ruleAlphaExpression ) )
            	    // InternalAlpha.g:4222:5: (lv_exprs_4_0= ruleAlphaExpression )
            	    {
            	    // InternalAlpha.g:4222:5: (lv_exprs_4_0= ruleAlphaExpression )
            	    // InternalAlpha.g:4223:6: lv_exprs_4_0= ruleAlphaExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiArgExpressionAccess().getExprsAlphaExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_49);
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
            	    break loop62;
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
    // InternalAlpha.g:4249:1: entryRuleExternalMultiArgExpression returns [EObject current=null] : iv_ruleExternalMultiArgExpression= ruleExternalMultiArgExpression EOF ;
    public final EObject entryRuleExternalMultiArgExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalMultiArgExpression = null;


        try {
            // InternalAlpha.g:4249:67: (iv_ruleExternalMultiArgExpression= ruleExternalMultiArgExpression EOF )
            // InternalAlpha.g:4250:2: iv_ruleExternalMultiArgExpression= ruleExternalMultiArgExpression EOF
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
    // InternalAlpha.g:4256:1: ruleExternalMultiArgExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' ) ;
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
            // InternalAlpha.g:4262:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' ) )
            // InternalAlpha.g:4263:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' )
            {
            // InternalAlpha.g:4263:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' )
            // InternalAlpha.g:4264:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')'
            {
            // InternalAlpha.g:4264:3: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:4265:4: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:4265:4: (otherlv_0= RULE_ID )
            // InternalAlpha.g:4266:5: otherlv_0= RULE_ID
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
            		
            // InternalAlpha.g:4281:3: ( (lv_exprs_2_0= ruleAlphaExpression ) )
            // InternalAlpha.g:4282:4: (lv_exprs_2_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:4282:4: (lv_exprs_2_0= ruleAlphaExpression )
            // InternalAlpha.g:4283:5: lv_exprs_2_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getExternalMultiArgExpressionAccess().getExprsAlphaExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_49);
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

            // InternalAlpha.g:4300:3: (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==35) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalAlpha.g:4301:4: otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_20); 

            	    				newLeafNode(otherlv_3, grammarAccess.getExternalMultiArgExpressionAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalAlpha.g:4305:4: ( (lv_exprs_4_0= ruleAlphaExpression ) )
            	    // InternalAlpha.g:4306:5: (lv_exprs_4_0= ruleAlphaExpression )
            	    {
            	    // InternalAlpha.g:4306:5: (lv_exprs_4_0= ruleAlphaExpression )
            	    // InternalAlpha.g:4307:6: lv_exprs_4_0= ruleAlphaExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExternalMultiArgExpressionAccess().getExprsAlphaExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_49);
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
            	    break loop63;
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
    // InternalAlpha.g:4333:1: entryRuleUnaryOrTerminalExpression returns [EObject current=null] : iv_ruleUnaryOrTerminalExpression= ruleUnaryOrTerminalExpression EOF ;
    public final EObject entryRuleUnaryOrTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOrTerminalExpression = null;


        try {
            // InternalAlpha.g:4333:66: (iv_ruleUnaryOrTerminalExpression= ruleUnaryOrTerminalExpression EOF )
            // InternalAlpha.g:4334:2: iv_ruleUnaryOrTerminalExpression= ruleUnaryOrTerminalExpression EOF
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
    // InternalAlpha.g:4340:1: ruleUnaryOrTerminalExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression | this_AlphaTerminalExpression_1= ruleAlphaTerminalExpression ) ;
    public final EObject ruleUnaryOrTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        EObject this_AlphaTerminalExpression_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4346:2: ( (this_UnaryExpression_0= ruleUnaryExpression | this_AlphaTerminalExpression_1= ruleAlphaTerminalExpression ) )
            // InternalAlpha.g:4347:2: (this_UnaryExpression_0= ruleUnaryExpression | this_AlphaTerminalExpression_1= ruleAlphaTerminalExpression )
            {
            // InternalAlpha.g:4347:2: (this_UnaryExpression_0= ruleUnaryExpression | this_AlphaTerminalExpression_1= ruleAlphaTerminalExpression )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==41||LA64_0==72) ) {
                alt64=1;
            }
            else if ( ((LA64_0>=RULE_ID && LA64_0<=RULE_INT)||(LA64_0>=RULE_BOOLEAN && LA64_0<=RULE_FLOAT)||LA64_0==16||LA64_0==36||LA64_0==40||LA64_0==42||(LA64_0>=45 && LA64_0<=46)||LA64_0==58||(LA64_0>=60 && LA64_0<=64)||(LA64_0>=66 && LA64_0<=70)) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalAlpha.g:4348:3: this_UnaryExpression_0= ruleUnaryExpression
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
                    // InternalAlpha.g:4357:3: this_AlphaTerminalExpression_1= ruleAlphaTerminalExpression
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
    // InternalAlpha.g:4369:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlpha.g:4369:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlpha.g:4370:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalAlpha.g:4376:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAUnaryOP ) ) ( (lv_expr_1_0= ruleAlphaTerminalExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4382:2: ( ( ( (lv_operator_0_0= ruleAUnaryOP ) ) ( (lv_expr_1_0= ruleAlphaTerminalExpression ) ) ) )
            // InternalAlpha.g:4383:2: ( ( (lv_operator_0_0= ruleAUnaryOP ) ) ( (lv_expr_1_0= ruleAlphaTerminalExpression ) ) )
            {
            // InternalAlpha.g:4383:2: ( ( (lv_operator_0_0= ruleAUnaryOP ) ) ( (lv_expr_1_0= ruleAlphaTerminalExpression ) ) )
            // InternalAlpha.g:4384:3: ( (lv_operator_0_0= ruleAUnaryOP ) ) ( (lv_expr_1_0= ruleAlphaTerminalExpression ) )
            {
            // InternalAlpha.g:4384:3: ( (lv_operator_0_0= ruleAUnaryOP ) )
            // InternalAlpha.g:4385:4: (lv_operator_0_0= ruleAUnaryOP )
            {
            // InternalAlpha.g:4385:4: (lv_operator_0_0= ruleAUnaryOP )
            // InternalAlpha.g:4386:5: lv_operator_0_0= ruleAUnaryOP
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

            // InternalAlpha.g:4403:3: ( (lv_expr_1_0= ruleAlphaTerminalExpression ) )
            // InternalAlpha.g:4404:4: (lv_expr_1_0= ruleAlphaTerminalExpression )
            {
            // InternalAlpha.g:4404:4: (lv_expr_1_0= ruleAlphaTerminalExpression )
            // InternalAlpha.g:4405:5: lv_expr_1_0= ruleAlphaTerminalExpression
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
    // InternalAlpha.g:4426:1: entryRuleVariableExpression returns [EObject current=null] : iv_ruleVariableExpression= ruleVariableExpression EOF ;
    public final EObject entryRuleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpression = null;


        try {
            // InternalAlpha.g:4426:59: (iv_ruleVariableExpression= ruleVariableExpression EOF )
            // InternalAlpha.g:4427:2: iv_ruleVariableExpression= ruleVariableExpression EOF
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
    // InternalAlpha.g:4433:1: ruleVariableExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:4439:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalAlpha.g:4440:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalAlpha.g:4440:2: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:4441:3: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:4441:3: (otherlv_0= RULE_ID )
            // InternalAlpha.g:4442:4: otherlv_0= RULE_ID
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
    // InternalAlpha.g:4456:1: entryRuleConstantExpression returns [EObject current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final EObject entryRuleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantExpression = null;


        try {
            // InternalAlpha.g:4456:59: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // InternalAlpha.g:4457:2: iv_ruleConstantExpression= ruleConstantExpression EOF
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
    // InternalAlpha.g:4463:1: ruleConstantExpression returns [EObject current=null] : (this_BooleanExpression_0= ruleBooleanExpression | this_RealExpression_1= ruleRealExpression | this_IntegerExpression_2= ruleIntegerExpression ) ;
    public final EObject ruleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpression_0 = null;

        EObject this_RealExpression_1 = null;

        EObject this_IntegerExpression_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4469:2: ( (this_BooleanExpression_0= ruleBooleanExpression | this_RealExpression_1= ruleRealExpression | this_IntegerExpression_2= ruleIntegerExpression ) )
            // InternalAlpha.g:4470:2: (this_BooleanExpression_0= ruleBooleanExpression | this_RealExpression_1= ruleRealExpression | this_IntegerExpression_2= ruleIntegerExpression )
            {
            // InternalAlpha.g:4470:2: (this_BooleanExpression_0= ruleBooleanExpression | this_RealExpression_1= ruleRealExpression | this_IntegerExpression_2= ruleIntegerExpression )
            int alt65=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt65=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt65=2;
                }
                break;
            case RULE_INT:
                {
                alt65=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalAlpha.g:4471:3: this_BooleanExpression_0= ruleBooleanExpression
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
                    // InternalAlpha.g:4480:3: this_RealExpression_1= ruleRealExpression
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
                    // InternalAlpha.g:4489:3: this_IntegerExpression_2= ruleIntegerExpression
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
    // InternalAlpha.g:4501:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalAlpha.g:4501:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalAlpha.g:4502:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
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
    // InternalAlpha.g:4508:1: ruleBooleanExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:4514:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalAlpha.g:4515:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalAlpha.g:4515:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalAlpha.g:4516:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalAlpha.g:4516:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalAlpha.g:4517:4: lv_value_0_0= RULE_BOOLEAN
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
    // InternalAlpha.g:4536:1: entryRuleIntegerExpression returns [EObject current=null] : iv_ruleIntegerExpression= ruleIntegerExpression EOF ;
    public final EObject entryRuleIntegerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerExpression = null;


        try {
            // InternalAlpha.g:4536:58: (iv_ruleIntegerExpression= ruleIntegerExpression EOF )
            // InternalAlpha.g:4537:2: iv_ruleIntegerExpression= ruleIntegerExpression EOF
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
    // InternalAlpha.g:4543:1: ruleIntegerExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:4549:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAlpha.g:4550:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAlpha.g:4550:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalAlpha.g:4551:3: (lv_value_0_0= RULE_INT )
            {
            // InternalAlpha.g:4551:3: (lv_value_0_0= RULE_INT )
            // InternalAlpha.g:4552:4: lv_value_0_0= RULE_INT
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
    // InternalAlpha.g:4571:1: entryRuleRealExpression returns [EObject current=null] : iv_ruleRealExpression= ruleRealExpression EOF ;
    public final EObject entryRuleRealExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealExpression = null;


        try {
            // InternalAlpha.g:4571:55: (iv_ruleRealExpression= ruleRealExpression EOF )
            // InternalAlpha.g:4572:2: iv_ruleRealExpression= ruleRealExpression EOF
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
    // InternalAlpha.g:4578:1: ruleRealExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleRealExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:4584:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalAlpha.g:4585:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalAlpha.g:4585:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalAlpha.g:4586:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalAlpha.g:4586:3: (lv_value_0_0= RULE_FLOAT )
            // InternalAlpha.g:4587:4: lv_value_0_0= RULE_FLOAT
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
    // InternalAlpha.g:4606:1: entryRuleAREDUCTION_OP returns [String current=null] : iv_ruleAREDUCTION_OP= ruleAREDUCTION_OP EOF ;
    public final String entryRuleAREDUCTION_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAREDUCTION_OP = null;


        try {
            // InternalAlpha.g:4606:53: (iv_ruleAREDUCTION_OP= ruleAREDUCTION_OP EOF )
            // InternalAlpha.g:4607:2: iv_ruleAREDUCTION_OP= ruleAREDUCTION_OP EOF
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
    // InternalAlpha.g:4613:1: ruleAREDUCTION_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'min' | kw= 'max' | kw= 'prod' | kw= 'sum' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= '+' | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleAREDUCTION_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:4619:2: ( (kw= 'min' | kw= 'max' | kw= 'prod' | kw= 'sum' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= '+' | kw= '*' ) )
            // InternalAlpha.g:4620:2: (kw= 'min' | kw= 'max' | kw= 'prod' | kw= 'sum' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= '+' | kw= '*' )
            {
            // InternalAlpha.g:4620:2: (kw= 'min' | kw= 'max' | kw= 'prod' | kw= 'sum' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= '+' | kw= '*' )
            int alt66=9;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt66=1;
                }
                break;
            case 67:
                {
                alt66=2;
                }
                break;
            case 68:
                {
                alt66=3;
                }
                break;
            case 69:
                {
                alt66=4;
                }
                break;
            case 45:
                {
                alt66=5;
                }
                break;
            case 46:
                {
                alt66=6;
                }
                break;
            case 70:
                {
                alt66=7;
                }
                break;
            case 40:
                {
                alt66=8;
                }
                break;
            case 42:
                {
                alt66=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalAlpha.g:4621:3: kw= 'min'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getMinKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4627:3: kw= 'max'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getMaxKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:4633:3: kw= 'prod'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getProdKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:4639:3: kw= 'sum'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getSumKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:4645:3: kw= 'and'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getAndKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:4651:3: kw= 'or'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getOrKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalAlpha.g:4657:3: kw= 'xor'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getXorKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalAlpha.g:4663:3: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getPlusSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalAlpha.g:4669:3: kw= '*'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

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
    // InternalAlpha.g:4678:1: entryRuleAOrOP returns [String current=null] : iv_ruleAOrOP= ruleAOrOP EOF ;
    public final String entryRuleAOrOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAOrOP = null;


        try {
            // InternalAlpha.g:4678:45: (iv_ruleAOrOP= ruleAOrOP EOF )
            // InternalAlpha.g:4679:2: iv_ruleAOrOP= ruleAOrOP EOF
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
    // InternalAlpha.g:4685:1: ruleAOrOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'or' | kw= 'xor' ) ;
    public final AntlrDatatypeRuleToken ruleAOrOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:4691:2: ( (kw= 'or' | kw= 'xor' ) )
            // InternalAlpha.g:4692:2: (kw= 'or' | kw= 'xor' )
            {
            // InternalAlpha.g:4692:2: (kw= 'or' | kw= 'xor' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==46) ) {
                alt67=1;
            }
            else if ( (LA67_0==70) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalAlpha.g:4693:3: kw= 'or'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAOrOPAccess().getOrKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4699:3: kw= 'xor'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

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
    // InternalAlpha.g:4708:1: entryRuleAAndOP returns [String current=null] : iv_ruleAAndOP= ruleAAndOP EOF ;
    public final String entryRuleAAndOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAAndOP = null;


        try {
            // InternalAlpha.g:4708:46: (iv_ruleAAndOP= ruleAAndOP EOF )
            // InternalAlpha.g:4709:2: iv_ruleAAndOP= ruleAAndOP EOF
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
    // InternalAlpha.g:4715:1: ruleAAndOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'and' ;
    public final AntlrDatatypeRuleToken ruleAAndOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:4721:2: (kw= 'and' )
            // InternalAlpha.g:4722:2: kw= 'and'
            {
            kw=(Token)match(input,45,FOLLOW_2); 

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
    // InternalAlpha.g:4730:1: entryRuleARelationalOP returns [String current=null] : iv_ruleARelationalOP= ruleARelationalOP EOF ;
    public final String entryRuleARelationalOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleARelationalOP = null;


        try {
            // InternalAlpha.g:4730:53: (iv_ruleARelationalOP= ruleARelationalOP EOF )
            // InternalAlpha.g:4731:2: iv_ruleARelationalOP= ruleARelationalOP EOF
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
    // InternalAlpha.g:4737:1: ruleARelationalOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '!=' | kw= '>=' | kw= '>' | kw= '<' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken ruleARelationalOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:4743:2: ( (kw= '=' | kw= '!=' | kw= '>=' | kw= '>' | kw= '<' | kw= '<=' ) )
            // InternalAlpha.g:4744:2: (kw= '=' | kw= '!=' | kw= '>=' | kw= '>' | kw= '<' | kw= '<=' )
            {
            // InternalAlpha.g:4744:2: (kw= '=' | kw= '!=' | kw= '>=' | kw= '>' | kw= '<' | kw= '<=' )
            int alt68=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt68=1;
                }
                break;
            case 71:
                {
                alt68=2;
                }
                break;
            case 49:
                {
                alt68=3;
                }
                break;
            case 50:
                {
                alt68=4;
                }
                break;
            case 51:
                {
                alt68=5;
                }
                break;
            case 52:
                {
                alt68=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalAlpha.g:4745:3: kw= '='
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4751:3: kw= '!='
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getExclamationMarkEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:4757:3: kw= '>='
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getGreaterThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:4763:3: kw= '>'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getGreaterThanSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:4769:3: kw= '<'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getLessThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:4775:3: kw= '<='
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

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
    // InternalAlpha.g:4784:1: entryRuleAAdditiveOP returns [String current=null] : iv_ruleAAdditiveOP= ruleAAdditiveOP EOF ;
    public final String entryRuleAAdditiveOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAAdditiveOP = null;


        try {
            // InternalAlpha.g:4784:51: (iv_ruleAAdditiveOP= ruleAAdditiveOP EOF )
            // InternalAlpha.g:4785:2: iv_ruleAAdditiveOP= ruleAAdditiveOP EOF
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
    // InternalAlpha.g:4791:1: ruleAAdditiveOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAAdditiveOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:4797:2: ( (kw= '+' | kw= '-' ) )
            // InternalAlpha.g:4798:2: (kw= '+' | kw= '-' )
            {
            // InternalAlpha.g:4798:2: (kw= '+' | kw= '-' )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==40) ) {
                alt69=1;
            }
            else if ( (LA69_0==41) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalAlpha.g:4799:3: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAAdditiveOPAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4805:3: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

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
    // InternalAlpha.g:4814:1: entryRuleAMultiplicativeOP returns [String current=null] : iv_ruleAMultiplicativeOP= ruleAMultiplicativeOP EOF ;
    public final String entryRuleAMultiplicativeOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAMultiplicativeOP = null;


        try {
            // InternalAlpha.g:4814:57: (iv_ruleAMultiplicativeOP= ruleAMultiplicativeOP EOF )
            // InternalAlpha.g:4815:2: iv_ruleAMultiplicativeOP= ruleAMultiplicativeOP EOF
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
    // InternalAlpha.g:4821:1: ruleAMultiplicativeOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleAMultiplicativeOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:4827:2: ( (kw= '*' | kw= '/' ) )
            // InternalAlpha.g:4828:2: (kw= '*' | kw= '/' )
            {
            // InternalAlpha.g:4828:2: (kw= '*' | kw= '/' )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==42) ) {
                alt70=1;
            }
            else if ( (LA70_0==43) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalAlpha.g:4829:3: kw= '*'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAMultiplicativeOPAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4835:3: kw= '/'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

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
    // InternalAlpha.g:4844:1: entryRuleAMINMAX_OP returns [String current=null] : iv_ruleAMINMAX_OP= ruleAMINMAX_OP EOF ;
    public final String entryRuleAMINMAX_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAMINMAX_OP = null;


        try {
            // InternalAlpha.g:4844:50: (iv_ruleAMINMAX_OP= ruleAMINMAX_OP EOF )
            // InternalAlpha.g:4845:2: iv_ruleAMINMAX_OP= ruleAMINMAX_OP EOF
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
    // InternalAlpha.g:4851:1: ruleAMINMAX_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'min' | kw= 'max' ) ;
    public final AntlrDatatypeRuleToken ruleAMINMAX_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:4857:2: ( (kw= 'min' | kw= 'max' ) )
            // InternalAlpha.g:4858:2: (kw= 'min' | kw= 'max' )
            {
            // InternalAlpha.g:4858:2: (kw= 'min' | kw= 'max' )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==66) ) {
                alt71=1;
            }
            else if ( (LA71_0==67) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalAlpha.g:4859:3: kw= 'min'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAMINMAX_OPAccess().getMinKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4865:3: kw= 'max'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

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
    // InternalAlpha.g:4874:1: entryRuleAUnaryOP returns [String current=null] : iv_ruleAUnaryOP= ruleAUnaryOP EOF ;
    public final String entryRuleAUnaryOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAUnaryOP = null;


        try {
            // InternalAlpha.g:4874:48: (iv_ruleAUnaryOP= ruleAUnaryOP EOF )
            // InternalAlpha.g:4875:2: iv_ruleAUnaryOP= ruleAUnaryOP EOF
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
    // InternalAlpha.g:4881:1: ruleAUnaryOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'not' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAUnaryOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:4887:2: ( (kw= 'not' | kw= '-' ) )
            // InternalAlpha.g:4888:2: (kw= 'not' | kw= '-' )
            {
            // InternalAlpha.g:4888:2: (kw= 'not' | kw= '-' )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==72) ) {
                alt72=1;
            }
            else if ( (LA72_0==41) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalAlpha.g:4889:3: kw= 'not'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryOPAccess().getNotKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4895:3: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

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
    // InternalAlpha.g:4904:1: entryRulePolyhedralObject returns [EObject current=null] : iv_rulePolyhedralObject= rulePolyhedralObject EOF ;
    public final EObject entryRulePolyhedralObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyhedralObject = null;


        try {
            // InternalAlpha.g:4904:57: (iv_rulePolyhedralObject= rulePolyhedralObject EOF )
            // InternalAlpha.g:4905:2: iv_rulePolyhedralObject= rulePolyhedralObject EOF
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
    // InternalAlpha.g:4911:1: rulePolyhedralObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleCalculatorExpression ) ) ) ;
    public final EObject rulePolyhedralObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4917:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleCalculatorExpression ) ) ) )
            // InternalAlpha.g:4918:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleCalculatorExpression ) ) )
            {
            // InternalAlpha.g:4918:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleCalculatorExpression ) ) )
            // InternalAlpha.g:4919:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleCalculatorExpression ) )
            {
            // InternalAlpha.g:4919:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:4920:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:4920:4: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:4921:5: lv_name_0_0= RULE_ID
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
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getPolyhedralObjectAccess().getEqualsSignKeyword_1());
            		
            // InternalAlpha.g:4941:3: ( (lv_expr_2_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:4942:4: (lv_expr_2_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:4942:4: (lv_expr_2_0= ruleCalculatorExpression )
            // InternalAlpha.g:4943:5: lv_expr_2_0= ruleCalculatorExpression
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
    // InternalAlpha.g:4964:1: entryRuleCalculatorExpression returns [EObject current=null] : iv_ruleCalculatorExpression= ruleCalculatorExpression EOF ;
    public final EObject entryRuleCalculatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculatorExpression = null;


        try {
            // InternalAlpha.g:4964:61: (iv_ruleCalculatorExpression= ruleCalculatorExpression EOF )
            // InternalAlpha.g:4965:2: iv_ruleCalculatorExpression= ruleCalculatorExpression EOF
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
    // InternalAlpha.g:4971:1: ruleCalculatorExpression returns [EObject current=null] : (this_UnaryOrTerminalCalculatorExpression_0= ruleUnaryOrTerminalCalculatorExpression ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )* ) ;
    public final EObject ruleCalculatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOrTerminalCalculatorExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4977:2: ( (this_UnaryOrTerminalCalculatorExpression_0= ruleUnaryOrTerminalCalculatorExpression ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )* ) )
            // InternalAlpha.g:4978:2: (this_UnaryOrTerminalCalculatorExpression_0= ruleUnaryOrTerminalCalculatorExpression ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )* )
            {
            // InternalAlpha.g:4978:2: (this_UnaryOrTerminalCalculatorExpression_0= ruleUnaryOrTerminalCalculatorExpression ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )* )
            // InternalAlpha.g:4979:3: this_UnaryOrTerminalCalculatorExpression_0= ruleUnaryOrTerminalCalculatorExpression ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getCalculatorExpressionAccess().getUnaryOrTerminalCalculatorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_66);
            this_UnaryOrTerminalCalculatorExpression_0=ruleUnaryOrTerminalCalculatorExpression();

            state._fsp--;


            			current = this_UnaryOrTerminalCalculatorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:4987:3: ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( ((LA73_0>=40 && LA73_0<=42)||LA73_0==59||(LA73_0>=80 && LA73_0<=82)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalAlpha.g:4988:4: () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) )
            	    {
            	    // InternalAlpha.g:4988:4: ()
            	    // InternalAlpha.g:4989:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCalculatorExpressionAccess().getBinaryCalculatorExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:4995:4: ( (lv_operator_2_0= ruleABinaryCalcOp ) )
            	    // InternalAlpha.g:4996:5: (lv_operator_2_0= ruleABinaryCalcOp )
            	    {
            	    // InternalAlpha.g:4996:5: (lv_operator_2_0= ruleABinaryCalcOp )
            	    // InternalAlpha.g:4997:6: lv_operator_2_0= ruleABinaryCalcOp
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

            	    // InternalAlpha.g:5014:4: ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) )
            	    // InternalAlpha.g:5015:5: (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression )
            	    {
            	    // InternalAlpha.g:5015:5: (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression )
            	    // InternalAlpha.g:5016:6: lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getCalculatorExpressionAccess().getRightUnaryOrTerminalCalculatorExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_66);
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
            	    break loop73;
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
    // InternalAlpha.g:5038:1: entryRuleUnaryOrTerminalCalculatorExpression returns [EObject current=null] : iv_ruleUnaryOrTerminalCalculatorExpression= ruleUnaryOrTerminalCalculatorExpression EOF ;
    public final EObject entryRuleUnaryOrTerminalCalculatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOrTerminalCalculatorExpression = null;


        try {
            // InternalAlpha.g:5038:76: (iv_ruleUnaryOrTerminalCalculatorExpression= ruleUnaryOrTerminalCalculatorExpression EOF )
            // InternalAlpha.g:5039:2: iv_ruleUnaryOrTerminalCalculatorExpression= ruleUnaryOrTerminalCalculatorExpression EOF
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
    // InternalAlpha.g:5045:1: ruleUnaryOrTerminalCalculatorExpression returns [EObject current=null] : (this_UnaryCalculatorExpression_0= ruleUnaryCalculatorExpression | this_CalculatorExpressionTerminal_1= ruleCalculatorExpressionTerminal ) ;
    public final EObject ruleUnaryOrTerminalCalculatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryCalculatorExpression_0 = null;

        EObject this_CalculatorExpressionTerminal_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5051:2: ( (this_UnaryCalculatorExpression_0= ruleUnaryCalculatorExpression | this_CalculatorExpressionTerminal_1= ruleCalculatorExpressionTerminal ) )
            // InternalAlpha.g:5052:2: (this_UnaryCalculatorExpression_0= ruleUnaryCalculatorExpression | this_CalculatorExpressionTerminal_1= ruleCalculatorExpressionTerminal )
            {
            // InternalAlpha.g:5052:2: (this_UnaryCalculatorExpression_0= ruleUnaryCalculatorExpression | this_CalculatorExpressionTerminal_1= ruleCalculatorExpressionTerminal )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=74 && LA74_0<=79)) ) {
                alt74=1;
            }
            else if ( (LA74_0==RULE_ID||LA74_0==16||LA74_0==20||LA74_0==36) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalAlpha.g:5053:3: this_UnaryCalculatorExpression_0= ruleUnaryCalculatorExpression
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
                    // InternalAlpha.g:5062:3: this_CalculatorExpressionTerminal_1= ruleCalculatorExpressionTerminal
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
    // InternalAlpha.g:5074:1: entryRuleCalculatorExpressionTerminal returns [EObject current=null] : iv_ruleCalculatorExpressionTerminal= ruleCalculatorExpressionTerminal EOF ;
    public final EObject entryRuleCalculatorExpressionTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculatorExpressionTerminal = null;


        try {
            // InternalAlpha.g:5074:69: (iv_ruleCalculatorExpressionTerminal= ruleCalculatorExpressionTerminal EOF )
            // InternalAlpha.g:5075:2: iv_ruleCalculatorExpressionTerminal= ruleCalculatorExpressionTerminal EOF
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
    // InternalAlpha.g:5081:1: ruleCalculatorExpressionTerminal returns [EObject current=null] : (this_JNIDomain_0= ruleJNIDomain | this_JNIRelation_1= ruleJNIRelation | this_JNIFunction_2= ruleJNIFunction | this_DefinedObject_3= ruleDefinedObject | this_RectangularDomain_4= ruleRectangularDomain | this_VariableDomain_5= ruleVariableDomain | (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' ) ) ;
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
            // InternalAlpha.g:5087:2: ( (this_JNIDomain_0= ruleJNIDomain | this_JNIRelation_1= ruleJNIRelation | this_JNIFunction_2= ruleJNIFunction | this_DefinedObject_3= ruleDefinedObject | this_RectangularDomain_4= ruleRectangularDomain | this_VariableDomain_5= ruleVariableDomain | (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' ) ) )
            // InternalAlpha.g:5088:2: (this_JNIDomain_0= ruleJNIDomain | this_JNIRelation_1= ruleJNIRelation | this_JNIFunction_2= ruleJNIFunction | this_DefinedObject_3= ruleDefinedObject | this_RectangularDomain_4= ruleRectangularDomain | this_VariableDomain_5= ruleVariableDomain | (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' ) )
            {
            // InternalAlpha.g:5088:2: (this_JNIDomain_0= ruleJNIDomain | this_JNIRelation_1= ruleJNIRelation | this_JNIFunction_2= ruleJNIFunction | this_DefinedObject_3= ruleDefinedObject | this_RectangularDomain_4= ruleRectangularDomain | this_VariableDomain_5= ruleVariableDomain | (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' ) )
            int alt75=7;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // InternalAlpha.g:5089:3: this_JNIDomain_0= ruleJNIDomain
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
                    // InternalAlpha.g:5098:3: this_JNIRelation_1= ruleJNIRelation
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
                    // InternalAlpha.g:5107:3: this_JNIFunction_2= ruleJNIFunction
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
                    // InternalAlpha.g:5116:3: this_DefinedObject_3= ruleDefinedObject
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
                    // InternalAlpha.g:5125:3: this_RectangularDomain_4= ruleRectangularDomain
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
                    // InternalAlpha.g:5134:3: this_VariableDomain_5= ruleVariableDomain
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
                    // InternalAlpha.g:5143:3: (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' )
                    {
                    // InternalAlpha.g:5143:3: (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' )
                    // InternalAlpha.g:5144:4: otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')'
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
    // InternalAlpha.g:5165:1: entryRuleUnaryCalculatorExpression returns [EObject current=null] : iv_ruleUnaryCalculatorExpression= ruleUnaryCalculatorExpression EOF ;
    public final EObject entryRuleUnaryCalculatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryCalculatorExpression = null;


        try {
            // InternalAlpha.g:5165:66: (iv_ruleUnaryCalculatorExpression= ruleUnaryCalculatorExpression EOF )
            // InternalAlpha.g:5166:2: iv_ruleUnaryCalculatorExpression= ruleUnaryCalculatorExpression EOF
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
    // InternalAlpha.g:5172:1: ruleUnaryCalculatorExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAUnaryCalcOp ) ) ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) ) ) ;
    public final EObject ruleUnaryCalculatorExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5178:2: ( ( ( (lv_operator_0_0= ruleAUnaryCalcOp ) ) ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) ) ) )
            // InternalAlpha.g:5179:2: ( ( (lv_operator_0_0= ruleAUnaryCalcOp ) ) ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) ) )
            {
            // InternalAlpha.g:5179:2: ( ( (lv_operator_0_0= ruleAUnaryCalcOp ) ) ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) ) )
            // InternalAlpha.g:5180:3: ( (lv_operator_0_0= ruleAUnaryCalcOp ) ) ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) )
            {
            // InternalAlpha.g:5180:3: ( (lv_operator_0_0= ruleAUnaryCalcOp ) )
            // InternalAlpha.g:5181:4: (lv_operator_0_0= ruleAUnaryCalcOp )
            {
            // InternalAlpha.g:5181:4: (lv_operator_0_0= ruleAUnaryCalcOp )
            // InternalAlpha.g:5182:5: lv_operator_0_0= ruleAUnaryCalcOp
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

            // InternalAlpha.g:5199:3: ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) )
            // InternalAlpha.g:5200:4: (lv_expr_1_0= ruleCalculatorExpressionTerminal )
            {
            // InternalAlpha.g:5200:4: (lv_expr_1_0= ruleCalculatorExpressionTerminal )
            // InternalAlpha.g:5201:5: lv_expr_1_0= ruleCalculatorExpressionTerminal
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
    // InternalAlpha.g:5222:1: entryRuleVariableDomain returns [EObject current=null] : iv_ruleVariableDomain= ruleVariableDomain EOF ;
    public final EObject entryRuleVariableDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDomain = null;


        try {
            // InternalAlpha.g:5222:55: (iv_ruleVariableDomain= ruleVariableDomain EOF )
            // InternalAlpha.g:5223:2: iv_ruleVariableDomain= ruleVariableDomain EOF
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
    // InternalAlpha.g:5229:1: ruleVariableDomain returns [EObject current=null] : (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' ) ;
    public final EObject ruleVariableDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalAlpha.g:5235:2: ( (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' ) )
            // InternalAlpha.g:5236:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' )
            {
            // InternalAlpha.g:5236:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' )
            // InternalAlpha.g:5237:3: otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDomainAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAlpha.g:5241:3: ( (otherlv_1= RULE_ID ) )
            // InternalAlpha.g:5242:4: (otherlv_1= RULE_ID )
            {
            // InternalAlpha.g:5242:4: (otherlv_1= RULE_ID )
            // InternalAlpha.g:5243:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDomainRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_34); 

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
    // InternalAlpha.g:5262:1: entryRuleRectangularDomain returns [EObject current=null] : iv_ruleRectangularDomain= ruleRectangularDomain EOF ;
    public final EObject entryRuleRectangularDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangularDomain = null;


        try {
            // InternalAlpha.g:5262:58: (iv_ruleRectangularDomain= ruleRectangularDomain EOF )
            // InternalAlpha.g:5263:2: iv_ruleRectangularDomain= ruleRectangularDomain EOF
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
    // InternalAlpha.g:5269:1: ruleRectangularDomain returns [EObject current=null] : (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleIndexName ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleIndexName ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? ) ;
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
            // InternalAlpha.g:5275:2: ( (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleIndexName ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleIndexName ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? ) )
            // InternalAlpha.g:5276:2: (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleIndexName ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleIndexName ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? )
            {
            // InternalAlpha.g:5276:2: (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleIndexName ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleIndexName ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? )
            // InternalAlpha.g:5277:3: otherlv_0= '[' ( (lv_upperBounds_1_0= ruleIndexName ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleIndexName ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRectangularDomainAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAlpha.g:5281:3: ( (lv_upperBounds_1_0= ruleIndexName ) )
            // InternalAlpha.g:5282:4: (lv_upperBounds_1_0= ruleIndexName )
            {
            // InternalAlpha.g:5282:4: (lv_upperBounds_1_0= ruleIndexName )
            // InternalAlpha.g:5283:5: lv_upperBounds_1_0= ruleIndexName
            {

            					newCompositeNode(grammarAccess.getRectangularDomainAccess().getUpperBoundsIndexNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_45);
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

            // InternalAlpha.g:5300:3: (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleIndexName ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==35) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalAlpha.g:5301:4: otherlv_2= ',' ( (lv_upperBounds_3_0= ruleIndexName ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getRectangularDomainAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAlpha.g:5305:4: ( (lv_upperBounds_3_0= ruleIndexName ) )
            	    // InternalAlpha.g:5306:5: (lv_upperBounds_3_0= ruleIndexName )
            	    {
            	    // InternalAlpha.g:5306:5: (lv_upperBounds_3_0= ruleIndexName )
            	    // InternalAlpha.g:5307:6: lv_upperBounds_3_0= ruleIndexName
            	    {

            	    						newCompositeNode(grammarAccess.getRectangularDomainAccess().getUpperBoundsIndexNameParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_45);
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
            	    break loop76;
                }
            } while (true);

            otherlv_4=(Token)match(input,37,FOLLOW_67); 

            			newLeafNode(otherlv_4, grammarAccess.getRectangularDomainAccess().getRightSquareBracketKeyword_3());
            		
            // InternalAlpha.g:5329:3: (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==73) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalAlpha.g:5330:4: otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']'
                    {
                    otherlv_5=(Token)match(input,73,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getRectangularDomainAccess().getAsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getRectangularDomainAccess().getLeftSquareBracketKeyword_4_1());
                    			
                    // InternalAlpha.g:5338:4: ( (lv_indexNames_7_0= ruleIndexName ) )
                    // InternalAlpha.g:5339:5: (lv_indexNames_7_0= ruleIndexName )
                    {
                    // InternalAlpha.g:5339:5: (lv_indexNames_7_0= ruleIndexName )
                    // InternalAlpha.g:5340:6: lv_indexNames_7_0= ruleIndexName
                    {

                    						newCompositeNode(grammarAccess.getRectangularDomainAccess().getIndexNamesIndexNameParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_45);
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

                    // InternalAlpha.g:5357:4: (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==35) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalAlpha.g:5358:5: otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,35,FOLLOW_4); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getRectangularDomainAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalAlpha.g:5362:5: ( (lv_indexNames_9_0= ruleIndexName ) )
                    	    // InternalAlpha.g:5363:6: (lv_indexNames_9_0= ruleIndexName )
                    	    {
                    	    // InternalAlpha.g:5363:6: (lv_indexNames_9_0= ruleIndexName )
                    	    // InternalAlpha.g:5364:7: lv_indexNames_9_0= ruleIndexName
                    	    {

                    	    							newCompositeNode(grammarAccess.getRectangularDomainAccess().getIndexNamesIndexNameParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_45);
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
                    	    break loop77;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,37,FOLLOW_2); 

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
    // InternalAlpha.g:5391:1: entryRuleDefinedObject returns [EObject current=null] : iv_ruleDefinedObject= ruleDefinedObject EOF ;
    public final EObject entryRuleDefinedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinedObject = null;


        try {
            // InternalAlpha.g:5391:54: (iv_ruleDefinedObject= ruleDefinedObject EOF )
            // InternalAlpha.g:5392:2: iv_ruleDefinedObject= ruleDefinedObject EOF
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
    // InternalAlpha.g:5398:1: ruleDefinedObject returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDefinedObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:5404:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalAlpha.g:5405:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalAlpha.g:5405:2: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:5406:3: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:5406:3: (otherlv_0= RULE_ID )
            // InternalAlpha.g:5407:4: otherlv_0= RULE_ID
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
    // InternalAlpha.g:5421:1: entryRuleAUnaryCalcOp returns [String current=null] : iv_ruleAUnaryCalcOp= ruleAUnaryCalcOp EOF ;
    public final String entryRuleAUnaryCalcOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAUnaryCalcOp = null;


        try {
            // InternalAlpha.g:5421:52: (iv_ruleAUnaryCalcOp= ruleAUnaryCalcOp EOF )
            // InternalAlpha.g:5422:2: iv_ruleAUnaryCalcOp= ruleAUnaryCalcOp EOF
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
    // InternalAlpha.g:5428:1: ruleAUnaryCalcOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'domain' | kw= 'range' | kw= 'complement' | kw= 'affine-hull' | kw= 'poly-hull' | kw= 'reverse' ) ;
    public final AntlrDatatypeRuleToken ruleAUnaryCalcOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:5434:2: ( (kw= 'domain' | kw= 'range' | kw= 'complement' | kw= 'affine-hull' | kw= 'poly-hull' | kw= 'reverse' ) )
            // InternalAlpha.g:5435:2: (kw= 'domain' | kw= 'range' | kw= 'complement' | kw= 'affine-hull' | kw= 'poly-hull' | kw= 'reverse' )
            {
            // InternalAlpha.g:5435:2: (kw= 'domain' | kw= 'range' | kw= 'complement' | kw= 'affine-hull' | kw= 'poly-hull' | kw= 'reverse' )
            int alt79=6;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt79=1;
                }
                break;
            case 75:
                {
                alt79=2;
                }
                break;
            case 76:
                {
                alt79=3;
                }
                break;
            case 77:
                {
                alt79=4;
                }
                break;
            case 78:
                {
                alt79=5;
                }
                break;
            case 79:
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
                    // InternalAlpha.g:5436:3: kw= 'domain'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getDomainKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5442:3: kw= 'range'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getRangeKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:5448:3: kw= 'complement'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getComplementKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:5454:3: kw= 'affine-hull'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getAffineHullKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:5460:3: kw= 'poly-hull'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getPolyHullKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:5466:3: kw= 'reverse'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

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
    // InternalAlpha.g:5475:1: entryRuleABinaryCalcOp returns [String current=null] : iv_ruleABinaryCalcOp= ruleABinaryCalcOp EOF ;
    public final String entryRuleABinaryCalcOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleABinaryCalcOp = null;


        try {
            // InternalAlpha.g:5475:53: (iv_ruleABinaryCalcOp= ruleABinaryCalcOp EOF )
            // InternalAlpha.g:5476:2: iv_ruleABinaryCalcOp= ruleABinaryCalcOp EOF
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
    // InternalAlpha.g:5482:1: ruleABinaryCalcOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'cross' | kw= '+' | kw= '-' | kw= '*' | kw= '@' | kw= '->-' | kw= '->*' ) ;
    public final AntlrDatatypeRuleToken ruleABinaryCalcOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:5488:2: ( (kw= 'cross' | kw= '+' | kw= '-' | kw= '*' | kw= '@' | kw= '->-' | kw= '->*' ) )
            // InternalAlpha.g:5489:2: (kw= 'cross' | kw= '+' | kw= '-' | kw= '*' | kw= '@' | kw= '->-' | kw= '->*' )
            {
            // InternalAlpha.g:5489:2: (kw= 'cross' | kw= '+' | kw= '-' | kw= '*' | kw= '@' | kw= '->-' | kw= '->*' )
            int alt80=7;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt80=1;
                }
                break;
            case 40:
                {
                alt80=2;
                }
                break;
            case 41:
                {
                alt80=3;
                }
                break;
            case 42:
                {
                alt80=4;
                }
                break;
            case 59:
                {
                alt80=5;
                }
                break;
            case 81:
                {
                alt80=6;
                }
                break;
            case 82:
                {
                alt80=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalAlpha.g:5490:3: kw= 'cross'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getCrossKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5496:3: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getPlusSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:5502:3: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getHyphenMinusKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:5508:3: kw= '*'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getAsteriskKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:5514:3: kw= '@'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getCommercialAtKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:5520:3: kw= '->-'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getHyphenMinusGreaterThanSignHyphenMinusKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalAlpha.g:5526:3: kw= '->*'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

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


    protected DFA46 dfa46 = new DFA46(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA75 dfa75 = new DFA75(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\4\uffff\1\16\21\uffff";
    static final String dfa_3s = "\2\4\2\uffff\1\16\1\uffff\2\20\4\uffff\1\16\3\uffff\2\4\4\uffff";
    static final String dfa_4s = "\1\106\1\110\2\uffff\1\107\1\uffff\2\20\4\uffff\1\107\3\uffff\2\106\4\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\uffff\1\6\2\uffff\1\11\1\14\1\16\1\1\1\uffff\1\5\1\4\1\15\2\uffff\1\12\1\7\1\13\1\10";
    static final String dfa_6s = "\26\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\1\3\1\uffff\2\3\7\uffff\1\1\23\uffff\1\5\3\uffff\1\11\1\uffff\1\11\2\uffff\2\11\13\uffff\1\2\1\uffff\1\5\1\6\1\7\1\10\1\12\1\uffff\5\11",
            "\1\14\1\13\1\uffff\2\13\7\uffff\1\13\3\uffff\1\13\17\uffff\1\13\1\uffff\1\15\1\uffff\3\13\2\uffff\2\13\7\uffff\1\13\2\uffff\2\13\1\uffff\5\13\1\uffff\5\13\1\uffff\1\13",
            "",
            "",
            "\1\16\1\uffff\1\17\1\16\21\uffff\1\16\1\15\2\uffff\5\16\1\uffff\2\16\2\uffff\4\16\2\uffff\2\16\11\uffff\2\16\2\uffff\2\16",
            "",
            "\1\20",
            "\1\21",
            "",
            "",
            "",
            "",
            "\1\13\1\uffff\2\13\20\uffff\2\15\1\13\1\uffff\1\15\1\uffff\4\13\1\uffff\2\13\2\uffff\4\13\15\uffff\2\13\2\uffff\2\13",
            "",
            "",
            "",
            "\1\22\43\uffff\1\23\1\uffff\1\23\2\uffff\2\23\23\uffff\5\23",
            "\1\24\43\uffff\1\25\1\uffff\1\25\2\uffff\2\25\23\uffff\5\25",
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

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2478:2: ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_ConstantExpression_4= ruleConstantExpression | this_VariableExpression_5= ruleVariableExpression | this_DependenceExpression_6= ruleDependenceExpression | this_IndexExpression_7= ruleIndexExpression | this_ReduceExpression_8= ruleReduceExpression | this_ArgReduceExpression_9= ruleArgReduceExpression | this_ConvolutionExpression_10= ruleConvolutionExpression | this_ExternalReduceExpression_11= ruleExternalReduceExpression | this_ExternalArgReduceExpression_12= ruleExternalArgReduceExpression | this_MultiArgExpression_13= ruleMultiArgExpression | this_ExternalMultiArgExpression_14= ruleExternalMultiArgExpression | this_SelectExpression_15= ruleSelectExpression )";
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\1\24\1\4\1\uffff\1\4\1\uffff\2\42\1\4\1\25\2\42";
    static final String dfa_10s = "\1\24\1\117\1\uffff\1\45\1\uffff\2\45\1\4\1\122\2\45";
    static final String dfa_11s = "\2\uffff\1\2\1\uffff\1\1\6\uffff";
    static final String dfa_12s = "\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\2\13\uffff\1\2\3\uffff\1\2\13\uffff\1\4\3\uffff\1\3\45\uffff\6\2",
            "",
            "\1\5\40\uffff\1\4",
            "",
            "\1\6\1\7\1\uffff\1\10",
            "\1\6\1\7\1\uffff\1\10",
            "\1\11",
            "\1\2\12\uffff\1\4\7\uffff\3\2\20\uffff\1\2\15\uffff\1\2\6\uffff\3\2",
            "\1\12\1\7\1\uffff\1\10",
            "\1\12\1\7\1\uffff\1\10"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2720:2: ( ( ( (lv_domainExpr_0_0= ruleJNIDomain ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) | (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) ) )";
        }
    }
    static final String dfa_14s = "\22\uffff";
    static final String dfa_15s = "\3\4\2\uffff\1\4\3\uffff\1\21\1\uffff\1\42\1\40\1\42\1\4\1\uffff\2\42";
    static final String dfa_16s = "\2\44\1\117\2\uffff\1\45\3\uffff\1\122\1\uffff\1\45\1\46\1\45\1\4\1\uffff\2\45";
    static final String dfa_17s = "\3\uffff\1\4\1\5\1\uffff\1\1\1\6\1\7\1\uffff\1\3\4\uffff\1\2\2\uffff";
    static final String dfa_18s = "\22\uffff}>";
    static final String[] dfa_19s = {
            "\1\3\13\uffff\1\2\3\uffff\1\1\17\uffff\1\4",
            "\1\7\33\uffff\1\6\3\uffff\1\5",
            "\1\11\13\uffff\1\10\3\uffff\1\10\17\uffff\1\10\1\uffff\1\12\43\uffff\6\10",
            "",
            "",
            "\1\13\40\uffff\1\14",
            "",
            "",
            "",
            "\1\10\20\uffff\2\12\2\uffff\1\12\1\uffff\3\10\20\uffff\1\10\24\uffff\3\10",
            "",
            "\1\15\1\16\1\uffff\1\14",
            "\1\6\5\uffff\1\17",
            "\1\15\1\16\1\uffff\1\14",
            "\1\20",
            "",
            "\1\21\1\16\1\uffff\1\14",
            "\1\21\1\16\1\uffff\1\14"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "5088:2: (this_JNIDomain_0= ruleJNIDomain | this_JNIRelation_1= ruleJNIRelation | this_JNIFunction_2= ruleJNIFunction | this_DefinedObject_3= ruleDefinedObject | this_RectangularDomain_4= ruleRectangularDomain | this_VariableDomain_5= ruleVariableDomain | (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' ) )";
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000DF800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000DF000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000DE000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000DC000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000D8000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000D0000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000110010L,0x000000000000FC00L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0xF6406710001101B0L,0x000000000000017DL});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000090010010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000110012L,0x000000000000FC00L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x001FFF3900234070L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001100000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x001FFF3900034070L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x001FFF3900034072L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00001F0000000072L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00001F0000000070L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00001F0000020070L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00001F2000000070L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000100000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0xF6406710001301B0L,0x000000000000017DL});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000800020000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x1000001000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0xF6406710003101B0L,0x000000000000017DL});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000650000000000L,0x000000000000007CL});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x1000001000010000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x001E000000004002L,0x0000000000000080L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0800070000000002L,0x0000000000070000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});

}