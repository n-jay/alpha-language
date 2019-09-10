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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'constant'", "'='", "'external'", "'('", "')'", "'import'", "'package'", "'{'", "'}'", "'affine'", "'define'", "'inputs'", "','", "'outputs'", "'locals'", "'over'", "'while'", "'.'", "'when'", "'else'", "'let'", "':'", "';'", "'fuzzy'", "'->'", "'['", "']'", "'[['", "']]'", "'.*'", "'{}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'and'", "'or'", "'&'", "'|'", "'>='", "'>'", "'<'", "'<='", "'^'", "'with'", "'if'", "'then'", "'auto'", "'case'", "'@'", "'val'", "'reduce'", "'argreduce'", "'conv'", "'select'", "'from'", "'min'", "'max'", "'prod'", "'sum'", "'xor'", "'!='", "'not'", "'as'", "'domain'", "'range'", "'complement'", "'affine-hull'", "'poly-hull'", "'reverse'", "'cross'", "'intersectRange'", "'subtractRange'"
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
    public static final int T__12=12;
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
    public static final int RULE_ML_COMMENT=9;
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
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
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
    // InternalAlpha.g:71:1: ruleAlphaRoot returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImports ) )* ( ( (lv_elements_1_1= ruleAlphaConstant | lv_elements_1_2= ruleExternalFunction | lv_elements_1_3= ruleAlphaPackage | lv_elements_1_4= ruleAlphaSystem ) ) )* ) ;
    public final EObject ruleAlphaRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_elements_1_1 = null;

        EObject lv_elements_1_2 = null;

        EObject lv_elements_1_3 = null;

        EObject lv_elements_1_4 = null;



        	enterRule();

        try {
            // InternalAlpha.g:77:2: ( ( ( (lv_imports_0_0= ruleImports ) )* ( ( (lv_elements_1_1= ruleAlphaConstant | lv_elements_1_2= ruleExternalFunction | lv_elements_1_3= ruleAlphaPackage | lv_elements_1_4= ruleAlphaSystem ) ) )* ) )
            // InternalAlpha.g:78:2: ( ( (lv_imports_0_0= ruleImports ) )* ( ( (lv_elements_1_1= ruleAlphaConstant | lv_elements_1_2= ruleExternalFunction | lv_elements_1_3= ruleAlphaPackage | lv_elements_1_4= ruleAlphaSystem ) ) )* )
            {
            // InternalAlpha.g:78:2: ( ( (lv_imports_0_0= ruleImports ) )* ( ( (lv_elements_1_1= ruleAlphaConstant | lv_elements_1_2= ruleExternalFunction | lv_elements_1_3= ruleAlphaPackage | lv_elements_1_4= ruleAlphaSystem ) ) )* )
            // InternalAlpha.g:79:3: ( (lv_imports_0_0= ruleImports ) )* ( ( (lv_elements_1_1= ruleAlphaConstant | lv_elements_1_2= ruleExternalFunction | lv_elements_1_3= ruleAlphaPackage | lv_elements_1_4= ruleAlphaSystem ) ) )*
            {
            // InternalAlpha.g:79:3: ( (lv_imports_0_0= ruleImports ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAlpha.g:80:4: (lv_imports_0_0= ruleImports )
            	    {
            	    // InternalAlpha.g:80:4: (lv_imports_0_0= ruleImports )
            	    // InternalAlpha.g:81:5: lv_imports_0_0= ruleImports
            	    {

            	    					newCompositeNode(grammarAccess.getAlphaRootAccess().getImportsImportsParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImports();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlphaRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"alpha.model.Alpha.Imports");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalAlpha.g:98:3: ( ( (lv_elements_1_1= ruleAlphaConstant | lv_elements_1_2= ruleExternalFunction | lv_elements_1_3= ruleAlphaPackage | lv_elements_1_4= ruleAlphaSystem ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12||LA3_0==14||LA3_0==18||LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAlpha.g:99:4: ( (lv_elements_1_1= ruleAlphaConstant | lv_elements_1_2= ruleExternalFunction | lv_elements_1_3= ruleAlphaPackage | lv_elements_1_4= ruleAlphaSystem ) )
            	    {
            	    // InternalAlpha.g:99:4: ( (lv_elements_1_1= ruleAlphaConstant | lv_elements_1_2= ruleExternalFunction | lv_elements_1_3= ruleAlphaPackage | lv_elements_1_4= ruleAlphaSystem ) )
            	    // InternalAlpha.g:100:5: (lv_elements_1_1= ruleAlphaConstant | lv_elements_1_2= ruleExternalFunction | lv_elements_1_3= ruleAlphaPackage | lv_elements_1_4= ruleAlphaSystem )
            	    {
            	    // InternalAlpha.g:100:5: (lv_elements_1_1= ruleAlphaConstant | lv_elements_1_2= ruleExternalFunction | lv_elements_1_3= ruleAlphaPackage | lv_elements_1_4= ruleAlphaSystem )
            	    int alt2=4;
            	    switch ( input.LA(1) ) {
            	    case 12:
            	        {
            	        alt2=1;
            	        }
            	        break;
            	    case 14:
            	        {
            	        alt2=2;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt2=3;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt2=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt2) {
            	        case 1 :
            	            // InternalAlpha.g:101:6: lv_elements_1_1= ruleAlphaConstant
            	            {

            	            						newCompositeNode(grammarAccess.getAlphaRootAccess().getElementsAlphaConstantParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_4);
            	            lv_elements_1_1=ruleAlphaConstant();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getAlphaRootRule());
            	            						}
            	            						add(
            	            							current,
            	            							"elements",
            	            							lv_elements_1_1,
            	            							"alpha.model.Alpha.AlphaConstant");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalAlpha.g:117:6: lv_elements_1_2= ruleExternalFunction
            	            {

            	            						newCompositeNode(grammarAccess.getAlphaRootAccess().getElementsExternalFunctionParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_4);
            	            lv_elements_1_2=ruleExternalFunction();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getAlphaRootRule());
            	            						}
            	            						add(
            	            							current,
            	            							"elements",
            	            							lv_elements_1_2,
            	            							"alpha.model.Alpha.ExternalFunction");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalAlpha.g:133:6: lv_elements_1_3= ruleAlphaPackage
            	            {

            	            						newCompositeNode(grammarAccess.getAlphaRootAccess().getElementsAlphaPackageParserRuleCall_1_0_2());
            	            					
            	            pushFollow(FOLLOW_4);
            	            lv_elements_1_3=ruleAlphaPackage();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getAlphaRootRule());
            	            						}
            	            						add(
            	            							current,
            	            							"elements",
            	            							lv_elements_1_3,
            	            							"alpha.model.Alpha.AlphaPackage");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalAlpha.g:149:6: lv_elements_1_4= ruleAlphaSystem
            	            {

            	            						newCompositeNode(grammarAccess.getAlphaRootAccess().getElementsAlphaSystemParserRuleCall_1_0_3());
            	            					
            	            pushFollow(FOLLOW_4);
            	            lv_elements_1_4=ruleAlphaSystem();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getAlphaRootRule());
            	            						}
            	            						add(
            	            							current,
            	            							"elements",
            	            							lv_elements_1_4,
            	            							"alpha.model.Alpha.AlphaSystem");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleAlphaRoot"


    // $ANTLR start "entryRuleAlphaConstant"
    // InternalAlpha.g:171:1: entryRuleAlphaConstant returns [EObject current=null] : iv_ruleAlphaConstant= ruleAlphaConstant EOF ;
    public final EObject entryRuleAlphaConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaConstant = null;


        try {
            // InternalAlpha.g:171:54: (iv_ruleAlphaConstant= ruleAlphaConstant EOF )
            // InternalAlpha.g:172:2: iv_ruleAlphaConstant= ruleAlphaConstant EOF
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
    // InternalAlpha.g:178:1: ruleAlphaConstant returns [EObject current=null] : (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleAlphaConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:184:2: ( (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalAlpha.g:185:2: (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalAlpha.g:185:2: (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalAlpha.g:186:3: otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAlphaConstantAccess().getConstantKeyword_0());
            		
            // InternalAlpha.g:190:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAlpha.g:191:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAlpha.g:191:4: (lv_name_1_0= RULE_ID )
            // InternalAlpha.g:192:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getAlphaConstantAccess().getEqualsSignKeyword_2());
            		
            // InternalAlpha.g:212:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalAlpha.g:213:4: (lv_value_3_0= RULE_INT )
            {
            // InternalAlpha.g:213:4: (lv_value_3_0= RULE_INT )
            // InternalAlpha.g:214:5: lv_value_3_0= RULE_INT
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
    // InternalAlpha.g:234:1: entryRuleExternalFunction returns [EObject current=null] : iv_ruleExternalFunction= ruleExternalFunction EOF ;
    public final EObject entryRuleExternalFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalFunction = null;


        try {
            // InternalAlpha.g:234:57: (iv_ruleExternalFunction= ruleExternalFunction EOF )
            // InternalAlpha.g:235:2: iv_ruleExternalFunction= ruleExternalFunction EOF
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
    // InternalAlpha.g:241:1: ruleExternalFunction returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_cardinality_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleExternalFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_cardinality_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAlpha.g:247:2: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_cardinality_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalAlpha.g:248:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_cardinality_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalAlpha.g:248:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_cardinality_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalAlpha.g:249:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_cardinality_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalFunctionAccess().getExternalKeyword_0());
            		
            // InternalAlpha.g:253:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAlpha.g:254:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAlpha.g:254:4: (lv_name_1_0= RULE_ID )
            // InternalAlpha.g:255:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalAlpha.g:275:3: ( (lv_cardinality_3_0= RULE_INT ) )
            // InternalAlpha.g:276:4: (lv_cardinality_3_0= RULE_INT )
            {
            // InternalAlpha.g:276:4: (lv_cardinality_3_0= RULE_INT )
            // InternalAlpha.g:277:5: lv_cardinality_3_0= RULE_INT
            {
            lv_cardinality_3_0=(Token)match(input,RULE_INT,FOLLOW_9); 

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

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalAlpha.g:301:1: entryRuleImports returns [EObject current=null] : iv_ruleImports= ruleImports EOF ;
    public final EObject entryRuleImports() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImports = null;


        try {
            // InternalAlpha.g:301:48: (iv_ruleImports= ruleImports EOF )
            // InternalAlpha.g:302:2: iv_ruleImports= ruleImports EOF
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
    // InternalAlpha.g:308:1: ruleImports returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImports() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:314:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalAlpha.g:315:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalAlpha.g:315:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalAlpha.g:316:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportsAccess().getImportKeyword_0());
            		
            // InternalAlpha.g:320:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalAlpha.g:321:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalAlpha.g:321:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalAlpha.g:322:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // InternalAlpha.g:343:1: entryRuleAlphaPackage returns [EObject current=null] : iv_ruleAlphaPackage= ruleAlphaPackage EOF ;
    public final EObject entryRuleAlphaPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaPackage = null;


        try {
            // InternalAlpha.g:343:53: (iv_ruleAlphaPackage= ruleAlphaPackage EOF )
            // InternalAlpha.g:344:2: iv_ruleAlphaPackage= ruleAlphaPackage EOF
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
    // InternalAlpha.g:350:1: ruleAlphaPackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem ) ) )* otherlv_4= '}' ) ;
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
            // InternalAlpha.g:356:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem ) ) )* otherlv_4= '}' ) )
            // InternalAlpha.g:357:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem ) ) )* otherlv_4= '}' )
            {
            // InternalAlpha.g:357:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem ) ) )* otherlv_4= '}' )
            // InternalAlpha.g:358:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAlphaPackageAccess().getPackageKeyword_0());
            		
            // InternalAlpha.g:362:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAlpha.g:363:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAlpha.g:363:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAlpha.g:364:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getAlphaPackageAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_2=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAlphaPackageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlpha.g:385:3: ( ( (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12||LA5_0==14||LA5_0==18||LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAlpha.g:386:4: ( (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem ) )
            	    {
            	    // InternalAlpha.g:386:4: ( (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem ) )
            	    // InternalAlpha.g:387:5: (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem )
            	    {
            	    // InternalAlpha.g:387:5: (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem )
            	    int alt4=4;
            	    switch ( input.LA(1) ) {
            	    case 12:
            	        {
            	        alt4=1;
            	        }
            	        break;
            	    case 14:
            	        {
            	        alt4=2;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt4=3;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt4=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt4) {
            	        case 1 :
            	            // InternalAlpha.g:388:6: lv_elements_3_1= ruleAlphaConstant
            	            {

            	            						newCompositeNode(grammarAccess.getAlphaPackageAccess().getElementsAlphaConstantParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_11);
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
            	            // InternalAlpha.g:404:6: lv_elements_3_2= ruleExternalFunction
            	            {

            	            						newCompositeNode(grammarAccess.getAlphaPackageAccess().getElementsExternalFunctionParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FOLLOW_11);
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
            	            // InternalAlpha.g:420:6: lv_elements_3_3= ruleAlphaPackage
            	            {

            	            						newCompositeNode(grammarAccess.getAlphaPackageAccess().getElementsAlphaPackageParserRuleCall_3_0_2());
            	            					
            	            pushFollow(FOLLOW_11);
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
            	            // InternalAlpha.g:436:6: lv_elements_3_4= ruleAlphaSystem
            	            {

            	            						newCompositeNode(grammarAccess.getAlphaPackageAccess().getElementsAlphaSystemParserRuleCall_3_0_3());
            	            					
            	            pushFollow(FOLLOW_11);
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
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalAlpha.g:462:1: entryRuleAlphaSystem returns [EObject current=null] : iv_ruleAlphaSystem= ruleAlphaSystem EOF ;
    public final EObject entryRuleAlphaSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaSystem = null;


        try {
            // InternalAlpha.g:462:52: (iv_ruleAlphaSystem= ruleAlphaSystem EOF )
            // InternalAlpha.g:463:2: iv_ruleAlphaSystem= ruleAlphaSystem EOF
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
    // InternalAlpha.g:469:1: ruleAlphaSystem returns [EObject current=null] : (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomain ) ) (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )? (otherlv_5= 'inputs' ( ( (lv_inputs_6_0= ruleVariable ) ) | ( ( (lv_inputs_7_0= ruleVariableNameOnly ) ) otherlv_8= ',' ( ( (lv_inputs_9_0= ruleVariableNameOnly ) ) otherlv_10= ',' )* ( (lv_inputs_11_0= ruleVariable ) ) ) | ( (lv_inputs_12_0= ruleFuzzyVariable ) ) | ( ( (lv_inputs_13_0= ruleFuzzyVariableNameOnly ) ) otherlv_14= ',' ( ( (lv_inputs_15_0= ruleFuzzyVariableNameOnly ) ) otherlv_16= ',' )* ( (lv_inputs_17_0= ruleFuzzyVariable ) ) ) )+ )? (otherlv_18= 'outputs' ( ( (lv_outputs_19_0= ruleVariable ) ) | ( ( (lv_outputs_20_0= ruleVariableNameOnly ) ) otherlv_21= ',' ( ( (lv_outputs_22_0= ruleVariableNameOnly ) ) otherlv_23= ',' )* ( (lv_outputs_24_0= ruleVariable ) ) ) | ( (lv_outputs_25_0= ruleFuzzyVariable ) ) | ( ( (lv_outputs_26_0= ruleFuzzyVariableNameOnly ) ) otherlv_27= ',' ( ( (lv_outputs_28_0= ruleFuzzyVariableNameOnly ) ) otherlv_29= ',' )* ( (lv_outputs_30_0= ruleFuzzyVariable ) ) ) )+ )? (otherlv_31= 'locals' ( ( (lv_locals_32_0= ruleVariable ) ) | ( ( (lv_locals_33_0= ruleVariableNameOnly ) ) otherlv_34= ',' ( ( (lv_locals_35_0= ruleVariableNameOnly ) ) otherlv_36= ',' )* ( (lv_locals_37_0= ruleVariable ) ) ) | ( (lv_locals_38_0= ruleFuzzyVariable ) ) | ( ( (lv_locals_39_0= ruleFuzzyVariableNameOnly ) ) otherlv_40= ',' ( ( (lv_locals_41_0= ruleFuzzyVariableNameOnly ) ) otherlv_42= ',' )* ( (lv_locals_43_0= ruleFuzzyVariable ) ) ) )+ )? (otherlv_44= 'over' ( (lv_whileDomainExpr_45_0= ruleCalculatorExpression ) ) otherlv_46= 'while' otherlv_47= '(' ( (lv_testExpression_48_0= ruleAlphaExpression ) ) otherlv_49= ')' )? ( (lv_systemBodies_50_0= ruleSystemBody ) )* otherlv_51= '.' ) ;
    public final EObject ruleAlphaSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameterDomainExpr_2_0 = null;

        EObject lv_definedObjects_4_0 = null;

        EObject lv_inputs_6_0 = null;

        EObject lv_inputs_7_0 = null;

        EObject lv_inputs_9_0 = null;

        EObject lv_inputs_11_0 = null;

        EObject lv_inputs_12_0 = null;

        EObject lv_inputs_13_0 = null;

        EObject lv_inputs_15_0 = null;

        EObject lv_inputs_17_0 = null;

        EObject lv_outputs_19_0 = null;

        EObject lv_outputs_20_0 = null;

        EObject lv_outputs_22_0 = null;

        EObject lv_outputs_24_0 = null;

        EObject lv_outputs_25_0 = null;

        EObject lv_outputs_26_0 = null;

        EObject lv_outputs_28_0 = null;

        EObject lv_outputs_30_0 = null;

        EObject lv_locals_32_0 = null;

        EObject lv_locals_33_0 = null;

        EObject lv_locals_35_0 = null;

        EObject lv_locals_37_0 = null;

        EObject lv_locals_38_0 = null;

        EObject lv_locals_39_0 = null;

        EObject lv_locals_41_0 = null;

        EObject lv_locals_43_0 = null;

        EObject lv_whileDomainExpr_45_0 = null;

        EObject lv_testExpression_48_0 = null;

        EObject lv_systemBodies_50_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:475:2: ( (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomain ) ) (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )? (otherlv_5= 'inputs' ( ( (lv_inputs_6_0= ruleVariable ) ) | ( ( (lv_inputs_7_0= ruleVariableNameOnly ) ) otherlv_8= ',' ( ( (lv_inputs_9_0= ruleVariableNameOnly ) ) otherlv_10= ',' )* ( (lv_inputs_11_0= ruleVariable ) ) ) | ( (lv_inputs_12_0= ruleFuzzyVariable ) ) | ( ( (lv_inputs_13_0= ruleFuzzyVariableNameOnly ) ) otherlv_14= ',' ( ( (lv_inputs_15_0= ruleFuzzyVariableNameOnly ) ) otherlv_16= ',' )* ( (lv_inputs_17_0= ruleFuzzyVariable ) ) ) )+ )? (otherlv_18= 'outputs' ( ( (lv_outputs_19_0= ruleVariable ) ) | ( ( (lv_outputs_20_0= ruleVariableNameOnly ) ) otherlv_21= ',' ( ( (lv_outputs_22_0= ruleVariableNameOnly ) ) otherlv_23= ',' )* ( (lv_outputs_24_0= ruleVariable ) ) ) | ( (lv_outputs_25_0= ruleFuzzyVariable ) ) | ( ( (lv_outputs_26_0= ruleFuzzyVariableNameOnly ) ) otherlv_27= ',' ( ( (lv_outputs_28_0= ruleFuzzyVariableNameOnly ) ) otherlv_29= ',' )* ( (lv_outputs_30_0= ruleFuzzyVariable ) ) ) )+ )? (otherlv_31= 'locals' ( ( (lv_locals_32_0= ruleVariable ) ) | ( ( (lv_locals_33_0= ruleVariableNameOnly ) ) otherlv_34= ',' ( ( (lv_locals_35_0= ruleVariableNameOnly ) ) otherlv_36= ',' )* ( (lv_locals_37_0= ruleVariable ) ) ) | ( (lv_locals_38_0= ruleFuzzyVariable ) ) | ( ( (lv_locals_39_0= ruleFuzzyVariableNameOnly ) ) otherlv_40= ',' ( ( (lv_locals_41_0= ruleFuzzyVariableNameOnly ) ) otherlv_42= ',' )* ( (lv_locals_43_0= ruleFuzzyVariable ) ) ) )+ )? (otherlv_44= 'over' ( (lv_whileDomainExpr_45_0= ruleCalculatorExpression ) ) otherlv_46= 'while' otherlv_47= '(' ( (lv_testExpression_48_0= ruleAlphaExpression ) ) otherlv_49= ')' )? ( (lv_systemBodies_50_0= ruleSystemBody ) )* otherlv_51= '.' ) )
            // InternalAlpha.g:476:2: (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomain ) ) (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )? (otherlv_5= 'inputs' ( ( (lv_inputs_6_0= ruleVariable ) ) | ( ( (lv_inputs_7_0= ruleVariableNameOnly ) ) otherlv_8= ',' ( ( (lv_inputs_9_0= ruleVariableNameOnly ) ) otherlv_10= ',' )* ( (lv_inputs_11_0= ruleVariable ) ) ) | ( (lv_inputs_12_0= ruleFuzzyVariable ) ) | ( ( (lv_inputs_13_0= ruleFuzzyVariableNameOnly ) ) otherlv_14= ',' ( ( (lv_inputs_15_0= ruleFuzzyVariableNameOnly ) ) otherlv_16= ',' )* ( (lv_inputs_17_0= ruleFuzzyVariable ) ) ) )+ )? (otherlv_18= 'outputs' ( ( (lv_outputs_19_0= ruleVariable ) ) | ( ( (lv_outputs_20_0= ruleVariableNameOnly ) ) otherlv_21= ',' ( ( (lv_outputs_22_0= ruleVariableNameOnly ) ) otherlv_23= ',' )* ( (lv_outputs_24_0= ruleVariable ) ) ) | ( (lv_outputs_25_0= ruleFuzzyVariable ) ) | ( ( (lv_outputs_26_0= ruleFuzzyVariableNameOnly ) ) otherlv_27= ',' ( ( (lv_outputs_28_0= ruleFuzzyVariableNameOnly ) ) otherlv_29= ',' )* ( (lv_outputs_30_0= ruleFuzzyVariable ) ) ) )+ )? (otherlv_31= 'locals' ( ( (lv_locals_32_0= ruleVariable ) ) | ( ( (lv_locals_33_0= ruleVariableNameOnly ) ) otherlv_34= ',' ( ( (lv_locals_35_0= ruleVariableNameOnly ) ) otherlv_36= ',' )* ( (lv_locals_37_0= ruleVariable ) ) ) | ( (lv_locals_38_0= ruleFuzzyVariable ) ) | ( ( (lv_locals_39_0= ruleFuzzyVariableNameOnly ) ) otherlv_40= ',' ( ( (lv_locals_41_0= ruleFuzzyVariableNameOnly ) ) otherlv_42= ',' )* ( (lv_locals_43_0= ruleFuzzyVariable ) ) ) )+ )? (otherlv_44= 'over' ( (lv_whileDomainExpr_45_0= ruleCalculatorExpression ) ) otherlv_46= 'while' otherlv_47= '(' ( (lv_testExpression_48_0= ruleAlphaExpression ) ) otherlv_49= ')' )? ( (lv_systemBodies_50_0= ruleSystemBody ) )* otherlv_51= '.' )
            {
            // InternalAlpha.g:476:2: (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomain ) ) (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )? (otherlv_5= 'inputs' ( ( (lv_inputs_6_0= ruleVariable ) ) | ( ( (lv_inputs_7_0= ruleVariableNameOnly ) ) otherlv_8= ',' ( ( (lv_inputs_9_0= ruleVariableNameOnly ) ) otherlv_10= ',' )* ( (lv_inputs_11_0= ruleVariable ) ) ) | ( (lv_inputs_12_0= ruleFuzzyVariable ) ) | ( ( (lv_inputs_13_0= ruleFuzzyVariableNameOnly ) ) otherlv_14= ',' ( ( (lv_inputs_15_0= ruleFuzzyVariableNameOnly ) ) otherlv_16= ',' )* ( (lv_inputs_17_0= ruleFuzzyVariable ) ) ) )+ )? (otherlv_18= 'outputs' ( ( (lv_outputs_19_0= ruleVariable ) ) | ( ( (lv_outputs_20_0= ruleVariableNameOnly ) ) otherlv_21= ',' ( ( (lv_outputs_22_0= ruleVariableNameOnly ) ) otherlv_23= ',' )* ( (lv_outputs_24_0= ruleVariable ) ) ) | ( (lv_outputs_25_0= ruleFuzzyVariable ) ) | ( ( (lv_outputs_26_0= ruleFuzzyVariableNameOnly ) ) otherlv_27= ',' ( ( (lv_outputs_28_0= ruleFuzzyVariableNameOnly ) ) otherlv_29= ',' )* ( (lv_outputs_30_0= ruleFuzzyVariable ) ) ) )+ )? (otherlv_31= 'locals' ( ( (lv_locals_32_0= ruleVariable ) ) | ( ( (lv_locals_33_0= ruleVariableNameOnly ) ) otherlv_34= ',' ( ( (lv_locals_35_0= ruleVariableNameOnly ) ) otherlv_36= ',' )* ( (lv_locals_37_0= ruleVariable ) ) ) | ( (lv_locals_38_0= ruleFuzzyVariable ) ) | ( ( (lv_locals_39_0= ruleFuzzyVariableNameOnly ) ) otherlv_40= ',' ( ( (lv_locals_41_0= ruleFuzzyVariableNameOnly ) ) otherlv_42= ',' )* ( (lv_locals_43_0= ruleFuzzyVariable ) ) ) )+ )? (otherlv_44= 'over' ( (lv_whileDomainExpr_45_0= ruleCalculatorExpression ) ) otherlv_46= 'while' otherlv_47= '(' ( (lv_testExpression_48_0= ruleAlphaExpression ) ) otherlv_49= ')' )? ( (lv_systemBodies_50_0= ruleSystemBody ) )* otherlv_51= '.' )
            // InternalAlpha.g:477:3: otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomain ) ) (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )? (otherlv_5= 'inputs' ( ( (lv_inputs_6_0= ruleVariable ) ) | ( ( (lv_inputs_7_0= ruleVariableNameOnly ) ) otherlv_8= ',' ( ( (lv_inputs_9_0= ruleVariableNameOnly ) ) otherlv_10= ',' )* ( (lv_inputs_11_0= ruleVariable ) ) ) | ( (lv_inputs_12_0= ruleFuzzyVariable ) ) | ( ( (lv_inputs_13_0= ruleFuzzyVariableNameOnly ) ) otherlv_14= ',' ( ( (lv_inputs_15_0= ruleFuzzyVariableNameOnly ) ) otherlv_16= ',' )* ( (lv_inputs_17_0= ruleFuzzyVariable ) ) ) )+ )? (otherlv_18= 'outputs' ( ( (lv_outputs_19_0= ruleVariable ) ) | ( ( (lv_outputs_20_0= ruleVariableNameOnly ) ) otherlv_21= ',' ( ( (lv_outputs_22_0= ruleVariableNameOnly ) ) otherlv_23= ',' )* ( (lv_outputs_24_0= ruleVariable ) ) ) | ( (lv_outputs_25_0= ruleFuzzyVariable ) ) | ( ( (lv_outputs_26_0= ruleFuzzyVariableNameOnly ) ) otherlv_27= ',' ( ( (lv_outputs_28_0= ruleFuzzyVariableNameOnly ) ) otherlv_29= ',' )* ( (lv_outputs_30_0= ruleFuzzyVariable ) ) ) )+ )? (otherlv_31= 'locals' ( ( (lv_locals_32_0= ruleVariable ) ) | ( ( (lv_locals_33_0= ruleVariableNameOnly ) ) otherlv_34= ',' ( ( (lv_locals_35_0= ruleVariableNameOnly ) ) otherlv_36= ',' )* ( (lv_locals_37_0= ruleVariable ) ) ) | ( (lv_locals_38_0= ruleFuzzyVariable ) ) | ( ( (lv_locals_39_0= ruleFuzzyVariableNameOnly ) ) otherlv_40= ',' ( ( (lv_locals_41_0= ruleFuzzyVariableNameOnly ) ) otherlv_42= ',' )* ( (lv_locals_43_0= ruleFuzzyVariable ) ) ) )+ )? (otherlv_44= 'over' ( (lv_whileDomainExpr_45_0= ruleCalculatorExpression ) ) otherlv_46= 'while' otherlv_47= '(' ( (lv_testExpression_48_0= ruleAlphaExpression ) ) otherlv_49= ')' )? ( (lv_systemBodies_50_0= ruleSystemBody ) )* otherlv_51= '.'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAlphaSystemAccess().getAffineKeyword_0());
            		
            // InternalAlpha.g:481:3: ( (lv_name_1_0= ruleSystemName ) )
            // InternalAlpha.g:482:4: (lv_name_1_0= ruleSystemName )
            {
            // InternalAlpha.g:482:4: (lv_name_1_0= ruleSystemName )
            // InternalAlpha.g:483:5: lv_name_1_0= ruleSystemName
            {

            					newCompositeNode(grammarAccess.getAlphaSystemAccess().getNameSystemNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalAlpha.g:500:3: ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomain ) )
            // InternalAlpha.g:501:4: (lv_parameterDomainExpr_2_0= ruleJNIParamDomain )
            {
            // InternalAlpha.g:501:4: (lv_parameterDomainExpr_2_0= ruleJNIParamDomain )
            // InternalAlpha.g:502:5: lv_parameterDomainExpr_2_0= ruleJNIParamDomain
            {

            					newCompositeNode(grammarAccess.getAlphaSystemAccess().getParameterDomainExprJNIParamDomainParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalAlpha.g:519:3: (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlpha.g:520:4: otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getAlphaSystemAccess().getDefineKeyword_3_0());
                    			
                    // InternalAlpha.g:524:4: ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalAlpha.g:525:5: (lv_definedObjects_4_0= rulePolyhedralObject )
                    	    {
                    	    // InternalAlpha.g:525:5: (lv_definedObjects_4_0= rulePolyhedralObject )
                    	    // InternalAlpha.g:526:6: lv_definedObjects_4_0= rulePolyhedralObject
                    	    {

                    	    						newCompositeNode(grammarAccess.getAlphaSystemAccess().getDefinedObjectsPolyhedralObjectParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
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
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }

            // InternalAlpha.g:544:3: (otherlv_5= 'inputs' ( ( (lv_inputs_6_0= ruleVariable ) ) | ( ( (lv_inputs_7_0= ruleVariableNameOnly ) ) otherlv_8= ',' ( ( (lv_inputs_9_0= ruleVariableNameOnly ) ) otherlv_10= ',' )* ( (lv_inputs_11_0= ruleVariable ) ) ) | ( (lv_inputs_12_0= ruleFuzzyVariable ) ) | ( ( (lv_inputs_13_0= ruleFuzzyVariableNameOnly ) ) otherlv_14= ',' ( ( (lv_inputs_15_0= ruleFuzzyVariableNameOnly ) ) otherlv_16= ',' )* ( (lv_inputs_17_0= ruleFuzzyVariable ) ) ) )+ )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAlpha.g:545:4: otherlv_5= 'inputs' ( ( (lv_inputs_6_0= ruleVariable ) ) | ( ( (lv_inputs_7_0= ruleVariableNameOnly ) ) otherlv_8= ',' ( ( (lv_inputs_9_0= ruleVariableNameOnly ) ) otherlv_10= ',' )* ( (lv_inputs_11_0= ruleVariable ) ) ) | ( (lv_inputs_12_0= ruleFuzzyVariable ) ) | ( ( (lv_inputs_13_0= ruleFuzzyVariableNameOnly ) ) otherlv_14= ',' ( ( (lv_inputs_15_0= ruleFuzzyVariableNameOnly ) ) otherlv_16= ',' )* ( (lv_inputs_17_0= ruleFuzzyVariable ) ) ) )+
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getAlphaSystemAccess().getInputsKeyword_4_0());
                    			
                    // InternalAlpha.g:549:4: ( ( (lv_inputs_6_0= ruleVariable ) ) | ( ( (lv_inputs_7_0= ruleVariableNameOnly ) ) otherlv_8= ',' ( ( (lv_inputs_9_0= ruleVariableNameOnly ) ) otherlv_10= ',' )* ( (lv_inputs_11_0= ruleVariable ) ) ) | ( (lv_inputs_12_0= ruleFuzzyVariable ) ) | ( ( (lv_inputs_13_0= ruleFuzzyVariableNameOnly ) ) otherlv_14= ',' ( ( (lv_inputs_15_0= ruleFuzzyVariableNameOnly ) ) otherlv_16= ',' )* ( (lv_inputs_17_0= ruleFuzzyVariable ) ) ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=5;
                        alt10 = dfa10.predict(input);
                        switch (alt10) {
                    	case 1 :
                    	    // InternalAlpha.g:550:5: ( (lv_inputs_6_0= ruleVariable ) )
                    	    {
                    	    // InternalAlpha.g:550:5: ( (lv_inputs_6_0= ruleVariable ) )
                    	    // InternalAlpha.g:551:6: (lv_inputs_6_0= ruleVariable )
                    	    {
                    	    // InternalAlpha.g:551:6: (lv_inputs_6_0= ruleVariable )
                    	    // InternalAlpha.g:552:7: lv_inputs_6_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlphaSystemAccess().getInputsVariableParserRuleCall_4_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_inputs_6_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputs",
                    	    								lv_inputs_6_0,
                    	    								"alpha.model.Alpha.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAlpha.g:570:5: ( ( (lv_inputs_7_0= ruleVariableNameOnly ) ) otherlv_8= ',' ( ( (lv_inputs_9_0= ruleVariableNameOnly ) ) otherlv_10= ',' )* ( (lv_inputs_11_0= ruleVariable ) ) )
                    	    {
                    	    // InternalAlpha.g:570:5: ( ( (lv_inputs_7_0= ruleVariableNameOnly ) ) otherlv_8= ',' ( ( (lv_inputs_9_0= ruleVariableNameOnly ) ) otherlv_10= ',' )* ( (lv_inputs_11_0= ruleVariable ) ) )
                    	    // InternalAlpha.g:571:6: ( (lv_inputs_7_0= ruleVariableNameOnly ) ) otherlv_8= ',' ( ( (lv_inputs_9_0= ruleVariableNameOnly ) ) otherlv_10= ',' )* ( (lv_inputs_11_0= ruleVariable ) )
                    	    {
                    	    // InternalAlpha.g:571:6: ( (lv_inputs_7_0= ruleVariableNameOnly ) )
                    	    // InternalAlpha.g:572:7: (lv_inputs_7_0= ruleVariableNameOnly )
                    	    {
                    	    // InternalAlpha.g:572:7: (lv_inputs_7_0= ruleVariableNameOnly )
                    	    // InternalAlpha.g:573:8: lv_inputs_7_0= ruleVariableNameOnly
                    	    {

                    	    								newCompositeNode(grammarAccess.getAlphaSystemAccess().getInputsVariableNameOnlyParserRuleCall_4_1_1_0_0());
                    	    							
                    	    pushFollow(FOLLOW_17);
                    	    lv_inputs_7_0=ruleVariableNameOnly();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"inputs",
                    	    									lv_inputs_7_0,
                    	    									"alpha.model.Alpha.VariableNameOnly");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    otherlv_8=(Token)match(input,24,FOLLOW_5); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getAlphaSystemAccess().getCommaKeyword_4_1_1_1());
                    	    					
                    	    // InternalAlpha.g:594:6: ( ( (lv_inputs_9_0= ruleVariableNameOnly ) ) otherlv_10= ',' )*
                    	    loop8:
                    	    do {
                    	        int alt8=2;
                    	        int LA8_0 = input.LA(1);

                    	        if ( (LA8_0==RULE_ID) ) {
                    	            int LA8_1 = input.LA(2);

                    	            if ( (LA8_1==24) ) {
                    	                alt8=1;
                    	            }


                    	        }


                    	        switch (alt8) {
                    	    	case 1 :
                    	    	    // InternalAlpha.g:595:7: ( (lv_inputs_9_0= ruleVariableNameOnly ) ) otherlv_10= ','
                    	    	    {
                    	    	    // InternalAlpha.g:595:7: ( (lv_inputs_9_0= ruleVariableNameOnly ) )
                    	    	    // InternalAlpha.g:596:8: (lv_inputs_9_0= ruleVariableNameOnly )
                    	    	    {
                    	    	    // InternalAlpha.g:596:8: (lv_inputs_9_0= ruleVariableNameOnly )
                    	    	    // InternalAlpha.g:597:9: lv_inputs_9_0= ruleVariableNameOnly
                    	    	    {

                    	    	    									newCompositeNode(grammarAccess.getAlphaSystemAccess().getInputsVariableNameOnlyParserRuleCall_4_1_1_2_0_0());
                    	    	    								
                    	    	    pushFollow(FOLLOW_17);
                    	    	    lv_inputs_9_0=ruleVariableNameOnly();

                    	    	    state._fsp--;


                    	    	    									if (current==null) {
                    	    	    										current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    	    									}
                    	    	    									add(
                    	    	    										current,
                    	    	    										"inputs",
                    	    	    										lv_inputs_9_0,
                    	    	    										"alpha.model.Alpha.VariableNameOnly");
                    	    	    									afterParserOrEnumRuleCall();
                    	    	    								

                    	    	    }


                    	    	    }

                    	    	    otherlv_10=(Token)match(input,24,FOLLOW_5); 

                    	    	    							newLeafNode(otherlv_10, grammarAccess.getAlphaSystemAccess().getCommaKeyword_4_1_1_2_1());
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop8;
                    	        }
                    	    } while (true);

                    	    // InternalAlpha.g:619:6: ( (lv_inputs_11_0= ruleVariable ) )
                    	    // InternalAlpha.g:620:7: (lv_inputs_11_0= ruleVariable )
                    	    {
                    	    // InternalAlpha.g:620:7: (lv_inputs_11_0= ruleVariable )
                    	    // InternalAlpha.g:621:8: lv_inputs_11_0= ruleVariable
                    	    {

                    	    								newCompositeNode(grammarAccess.getAlphaSystemAccess().getInputsVariableParserRuleCall_4_1_1_3_0());
                    	    							
                    	    pushFollow(FOLLOW_16);
                    	    lv_inputs_11_0=ruleVariable();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"inputs",
                    	    									lv_inputs_11_0,
                    	    									"alpha.model.Alpha.Variable");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalAlpha.g:640:5: ( (lv_inputs_12_0= ruleFuzzyVariable ) )
                    	    {
                    	    // InternalAlpha.g:640:5: ( (lv_inputs_12_0= ruleFuzzyVariable ) )
                    	    // InternalAlpha.g:641:6: (lv_inputs_12_0= ruleFuzzyVariable )
                    	    {
                    	    // InternalAlpha.g:641:6: (lv_inputs_12_0= ruleFuzzyVariable )
                    	    // InternalAlpha.g:642:7: lv_inputs_12_0= ruleFuzzyVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlphaSystemAccess().getInputsFuzzyVariableParserRuleCall_4_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_inputs_12_0=ruleFuzzyVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputs",
                    	    								lv_inputs_12_0,
                    	    								"alpha.model.Alpha.FuzzyVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalAlpha.g:660:5: ( ( (lv_inputs_13_0= ruleFuzzyVariableNameOnly ) ) otherlv_14= ',' ( ( (lv_inputs_15_0= ruleFuzzyVariableNameOnly ) ) otherlv_16= ',' )* ( (lv_inputs_17_0= ruleFuzzyVariable ) ) )
                    	    {
                    	    // InternalAlpha.g:660:5: ( ( (lv_inputs_13_0= ruleFuzzyVariableNameOnly ) ) otherlv_14= ',' ( ( (lv_inputs_15_0= ruleFuzzyVariableNameOnly ) ) otherlv_16= ',' )* ( (lv_inputs_17_0= ruleFuzzyVariable ) ) )
                    	    // InternalAlpha.g:661:6: ( (lv_inputs_13_0= ruleFuzzyVariableNameOnly ) ) otherlv_14= ',' ( ( (lv_inputs_15_0= ruleFuzzyVariableNameOnly ) ) otherlv_16= ',' )* ( (lv_inputs_17_0= ruleFuzzyVariable ) )
                    	    {
                    	    // InternalAlpha.g:661:6: ( (lv_inputs_13_0= ruleFuzzyVariableNameOnly ) )
                    	    // InternalAlpha.g:662:7: (lv_inputs_13_0= ruleFuzzyVariableNameOnly )
                    	    {
                    	    // InternalAlpha.g:662:7: (lv_inputs_13_0= ruleFuzzyVariableNameOnly )
                    	    // InternalAlpha.g:663:8: lv_inputs_13_0= ruleFuzzyVariableNameOnly
                    	    {

                    	    								newCompositeNode(grammarAccess.getAlphaSystemAccess().getInputsFuzzyVariableNameOnlyParserRuleCall_4_1_3_0_0());
                    	    							
                    	    pushFollow(FOLLOW_17);
                    	    lv_inputs_13_0=ruleFuzzyVariableNameOnly();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"inputs",
                    	    									lv_inputs_13_0,
                    	    									"alpha.model.Alpha.FuzzyVariableNameOnly");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    otherlv_14=(Token)match(input,24,FOLLOW_15); 

                    	    						newLeafNode(otherlv_14, grammarAccess.getAlphaSystemAccess().getCommaKeyword_4_1_3_1());
                    	    					
                    	    // InternalAlpha.g:684:6: ( ( (lv_inputs_15_0= ruleFuzzyVariableNameOnly ) ) otherlv_16= ',' )*
                    	    loop9:
                    	    do {
                    	        int alt9=2;
                    	        int LA9_0 = input.LA(1);

                    	        if ( (LA9_0==RULE_ID) ) {
                    	            alt9=1;
                    	        }


                    	        switch (alt9) {
                    	    	case 1 :
                    	    	    // InternalAlpha.g:685:7: ( (lv_inputs_15_0= ruleFuzzyVariableNameOnly ) ) otherlv_16= ','
                    	    	    {
                    	    	    // InternalAlpha.g:685:7: ( (lv_inputs_15_0= ruleFuzzyVariableNameOnly ) )
                    	    	    // InternalAlpha.g:686:8: (lv_inputs_15_0= ruleFuzzyVariableNameOnly )
                    	    	    {
                    	    	    // InternalAlpha.g:686:8: (lv_inputs_15_0= ruleFuzzyVariableNameOnly )
                    	    	    // InternalAlpha.g:687:9: lv_inputs_15_0= ruleFuzzyVariableNameOnly
                    	    	    {

                    	    	    									newCompositeNode(grammarAccess.getAlphaSystemAccess().getInputsFuzzyVariableNameOnlyParserRuleCall_4_1_3_2_0_0());
                    	    	    								
                    	    	    pushFollow(FOLLOW_17);
                    	    	    lv_inputs_15_0=ruleFuzzyVariableNameOnly();

                    	    	    state._fsp--;


                    	    	    									if (current==null) {
                    	    	    										current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    	    									}
                    	    	    									add(
                    	    	    										current,
                    	    	    										"inputs",
                    	    	    										lv_inputs_15_0,
                    	    	    										"alpha.model.Alpha.FuzzyVariableNameOnly");
                    	    	    									afterParserOrEnumRuleCall();
                    	    	    								

                    	    	    }


                    	    	    }

                    	    	    otherlv_16=(Token)match(input,24,FOLLOW_15); 

                    	    	    							newLeafNode(otherlv_16, grammarAccess.getAlphaSystemAccess().getCommaKeyword_4_1_3_2_1());
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop9;
                    	        }
                    	    } while (true);

                    	    // InternalAlpha.g:709:6: ( (lv_inputs_17_0= ruleFuzzyVariable ) )
                    	    // InternalAlpha.g:710:7: (lv_inputs_17_0= ruleFuzzyVariable )
                    	    {
                    	    // InternalAlpha.g:710:7: (lv_inputs_17_0= ruleFuzzyVariable )
                    	    // InternalAlpha.g:711:8: lv_inputs_17_0= ruleFuzzyVariable
                    	    {

                    	    								newCompositeNode(grammarAccess.getAlphaSystemAccess().getInputsFuzzyVariableParserRuleCall_4_1_3_3_0());
                    	    							
                    	    pushFollow(FOLLOW_16);
                    	    lv_inputs_17_0=ruleFuzzyVariable();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"inputs",
                    	    									lv_inputs_17_0,
                    	    									"alpha.model.Alpha.FuzzyVariable");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    }
                    break;

            }

            // InternalAlpha.g:731:3: (otherlv_18= 'outputs' ( ( (lv_outputs_19_0= ruleVariable ) ) | ( ( (lv_outputs_20_0= ruleVariableNameOnly ) ) otherlv_21= ',' ( ( (lv_outputs_22_0= ruleVariableNameOnly ) ) otherlv_23= ',' )* ( (lv_outputs_24_0= ruleVariable ) ) ) | ( (lv_outputs_25_0= ruleFuzzyVariable ) ) | ( ( (lv_outputs_26_0= ruleFuzzyVariableNameOnly ) ) otherlv_27= ',' ( ( (lv_outputs_28_0= ruleFuzzyVariableNameOnly ) ) otherlv_29= ',' )* ( (lv_outputs_30_0= ruleFuzzyVariable ) ) ) )+ )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAlpha.g:732:4: otherlv_18= 'outputs' ( ( (lv_outputs_19_0= ruleVariable ) ) | ( ( (lv_outputs_20_0= ruleVariableNameOnly ) ) otherlv_21= ',' ( ( (lv_outputs_22_0= ruleVariableNameOnly ) ) otherlv_23= ',' )* ( (lv_outputs_24_0= ruleVariable ) ) ) | ( (lv_outputs_25_0= ruleFuzzyVariable ) ) | ( ( (lv_outputs_26_0= ruleFuzzyVariableNameOnly ) ) otherlv_27= ',' ( ( (lv_outputs_28_0= ruleFuzzyVariableNameOnly ) ) otherlv_29= ',' )* ( (lv_outputs_30_0= ruleFuzzyVariable ) ) ) )+
                    {
                    otherlv_18=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_18, grammarAccess.getAlphaSystemAccess().getOutputsKeyword_5_0());
                    			
                    // InternalAlpha.g:736:4: ( ( (lv_outputs_19_0= ruleVariable ) ) | ( ( (lv_outputs_20_0= ruleVariableNameOnly ) ) otherlv_21= ',' ( ( (lv_outputs_22_0= ruleVariableNameOnly ) ) otherlv_23= ',' )* ( (lv_outputs_24_0= ruleVariable ) ) ) | ( (lv_outputs_25_0= ruleFuzzyVariable ) ) | ( ( (lv_outputs_26_0= ruleFuzzyVariableNameOnly ) ) otherlv_27= ',' ( ( (lv_outputs_28_0= ruleFuzzyVariableNameOnly ) ) otherlv_29= ',' )* ( (lv_outputs_30_0= ruleFuzzyVariable ) ) ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=5;
                        alt14 = dfa14.predict(input);
                        switch (alt14) {
                    	case 1 :
                    	    // InternalAlpha.g:737:5: ( (lv_outputs_19_0= ruleVariable ) )
                    	    {
                    	    // InternalAlpha.g:737:5: ( (lv_outputs_19_0= ruleVariable ) )
                    	    // InternalAlpha.g:738:6: (lv_outputs_19_0= ruleVariable )
                    	    {
                    	    // InternalAlpha.g:738:6: (lv_outputs_19_0= ruleVariable )
                    	    // InternalAlpha.g:739:7: lv_outputs_19_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlphaSystemAccess().getOutputsVariableParserRuleCall_5_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_outputs_19_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outputs",
                    	    								lv_outputs_19_0,
                    	    								"alpha.model.Alpha.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAlpha.g:757:5: ( ( (lv_outputs_20_0= ruleVariableNameOnly ) ) otherlv_21= ',' ( ( (lv_outputs_22_0= ruleVariableNameOnly ) ) otherlv_23= ',' )* ( (lv_outputs_24_0= ruleVariable ) ) )
                    	    {
                    	    // InternalAlpha.g:757:5: ( ( (lv_outputs_20_0= ruleVariableNameOnly ) ) otherlv_21= ',' ( ( (lv_outputs_22_0= ruleVariableNameOnly ) ) otherlv_23= ',' )* ( (lv_outputs_24_0= ruleVariable ) ) )
                    	    // InternalAlpha.g:758:6: ( (lv_outputs_20_0= ruleVariableNameOnly ) ) otherlv_21= ',' ( ( (lv_outputs_22_0= ruleVariableNameOnly ) ) otherlv_23= ',' )* ( (lv_outputs_24_0= ruleVariable ) )
                    	    {
                    	    // InternalAlpha.g:758:6: ( (lv_outputs_20_0= ruleVariableNameOnly ) )
                    	    // InternalAlpha.g:759:7: (lv_outputs_20_0= ruleVariableNameOnly )
                    	    {
                    	    // InternalAlpha.g:759:7: (lv_outputs_20_0= ruleVariableNameOnly )
                    	    // InternalAlpha.g:760:8: lv_outputs_20_0= ruleVariableNameOnly
                    	    {

                    	    								newCompositeNode(grammarAccess.getAlphaSystemAccess().getOutputsVariableNameOnlyParserRuleCall_5_1_1_0_0());
                    	    							
                    	    pushFollow(FOLLOW_17);
                    	    lv_outputs_20_0=ruleVariableNameOnly();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"outputs",
                    	    									lv_outputs_20_0,
                    	    									"alpha.model.Alpha.VariableNameOnly");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    otherlv_21=(Token)match(input,24,FOLLOW_5); 

                    	    						newLeafNode(otherlv_21, grammarAccess.getAlphaSystemAccess().getCommaKeyword_5_1_1_1());
                    	    					
                    	    // InternalAlpha.g:781:6: ( ( (lv_outputs_22_0= ruleVariableNameOnly ) ) otherlv_23= ',' )*
                    	    loop12:
                    	    do {
                    	        int alt12=2;
                    	        int LA12_0 = input.LA(1);

                    	        if ( (LA12_0==RULE_ID) ) {
                    	            int LA12_1 = input.LA(2);

                    	            if ( (LA12_1==24) ) {
                    	                alt12=1;
                    	            }


                    	        }


                    	        switch (alt12) {
                    	    	case 1 :
                    	    	    // InternalAlpha.g:782:7: ( (lv_outputs_22_0= ruleVariableNameOnly ) ) otherlv_23= ','
                    	    	    {
                    	    	    // InternalAlpha.g:782:7: ( (lv_outputs_22_0= ruleVariableNameOnly ) )
                    	    	    // InternalAlpha.g:783:8: (lv_outputs_22_0= ruleVariableNameOnly )
                    	    	    {
                    	    	    // InternalAlpha.g:783:8: (lv_outputs_22_0= ruleVariableNameOnly )
                    	    	    // InternalAlpha.g:784:9: lv_outputs_22_0= ruleVariableNameOnly
                    	    	    {

                    	    	    									newCompositeNode(grammarAccess.getAlphaSystemAccess().getOutputsVariableNameOnlyParserRuleCall_5_1_1_2_0_0());
                    	    	    								
                    	    	    pushFollow(FOLLOW_17);
                    	    	    lv_outputs_22_0=ruleVariableNameOnly();

                    	    	    state._fsp--;


                    	    	    									if (current==null) {
                    	    	    										current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    	    									}
                    	    	    									add(
                    	    	    										current,
                    	    	    										"outputs",
                    	    	    										lv_outputs_22_0,
                    	    	    										"alpha.model.Alpha.VariableNameOnly");
                    	    	    									afterParserOrEnumRuleCall();
                    	    	    								

                    	    	    }


                    	    	    }

                    	    	    otherlv_23=(Token)match(input,24,FOLLOW_5); 

                    	    	    							newLeafNode(otherlv_23, grammarAccess.getAlphaSystemAccess().getCommaKeyword_5_1_1_2_1());
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop12;
                    	        }
                    	    } while (true);

                    	    // InternalAlpha.g:806:6: ( (lv_outputs_24_0= ruleVariable ) )
                    	    // InternalAlpha.g:807:7: (lv_outputs_24_0= ruleVariable )
                    	    {
                    	    // InternalAlpha.g:807:7: (lv_outputs_24_0= ruleVariable )
                    	    // InternalAlpha.g:808:8: lv_outputs_24_0= ruleVariable
                    	    {

                    	    								newCompositeNode(grammarAccess.getAlphaSystemAccess().getOutputsVariableParserRuleCall_5_1_1_3_0());
                    	    							
                    	    pushFollow(FOLLOW_18);
                    	    lv_outputs_24_0=ruleVariable();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"outputs",
                    	    									lv_outputs_24_0,
                    	    									"alpha.model.Alpha.Variable");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalAlpha.g:827:5: ( (lv_outputs_25_0= ruleFuzzyVariable ) )
                    	    {
                    	    // InternalAlpha.g:827:5: ( (lv_outputs_25_0= ruleFuzzyVariable ) )
                    	    // InternalAlpha.g:828:6: (lv_outputs_25_0= ruleFuzzyVariable )
                    	    {
                    	    // InternalAlpha.g:828:6: (lv_outputs_25_0= ruleFuzzyVariable )
                    	    // InternalAlpha.g:829:7: lv_outputs_25_0= ruleFuzzyVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlphaSystemAccess().getOutputsFuzzyVariableParserRuleCall_5_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_outputs_25_0=ruleFuzzyVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outputs",
                    	    								lv_outputs_25_0,
                    	    								"alpha.model.Alpha.FuzzyVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalAlpha.g:847:5: ( ( (lv_outputs_26_0= ruleFuzzyVariableNameOnly ) ) otherlv_27= ',' ( ( (lv_outputs_28_0= ruleFuzzyVariableNameOnly ) ) otherlv_29= ',' )* ( (lv_outputs_30_0= ruleFuzzyVariable ) ) )
                    	    {
                    	    // InternalAlpha.g:847:5: ( ( (lv_outputs_26_0= ruleFuzzyVariableNameOnly ) ) otherlv_27= ',' ( ( (lv_outputs_28_0= ruleFuzzyVariableNameOnly ) ) otherlv_29= ',' )* ( (lv_outputs_30_0= ruleFuzzyVariable ) ) )
                    	    // InternalAlpha.g:848:6: ( (lv_outputs_26_0= ruleFuzzyVariableNameOnly ) ) otherlv_27= ',' ( ( (lv_outputs_28_0= ruleFuzzyVariableNameOnly ) ) otherlv_29= ',' )* ( (lv_outputs_30_0= ruleFuzzyVariable ) )
                    	    {
                    	    // InternalAlpha.g:848:6: ( (lv_outputs_26_0= ruleFuzzyVariableNameOnly ) )
                    	    // InternalAlpha.g:849:7: (lv_outputs_26_0= ruleFuzzyVariableNameOnly )
                    	    {
                    	    // InternalAlpha.g:849:7: (lv_outputs_26_0= ruleFuzzyVariableNameOnly )
                    	    // InternalAlpha.g:850:8: lv_outputs_26_0= ruleFuzzyVariableNameOnly
                    	    {

                    	    								newCompositeNode(grammarAccess.getAlphaSystemAccess().getOutputsFuzzyVariableNameOnlyParserRuleCall_5_1_3_0_0());
                    	    							
                    	    pushFollow(FOLLOW_17);
                    	    lv_outputs_26_0=ruleFuzzyVariableNameOnly();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"outputs",
                    	    									lv_outputs_26_0,
                    	    									"alpha.model.Alpha.FuzzyVariableNameOnly");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    otherlv_27=(Token)match(input,24,FOLLOW_15); 

                    	    						newLeafNode(otherlv_27, grammarAccess.getAlphaSystemAccess().getCommaKeyword_5_1_3_1());
                    	    					
                    	    // InternalAlpha.g:871:6: ( ( (lv_outputs_28_0= ruleFuzzyVariableNameOnly ) ) otherlv_29= ',' )*
                    	    loop13:
                    	    do {
                    	        int alt13=2;
                    	        int LA13_0 = input.LA(1);

                    	        if ( (LA13_0==RULE_ID) ) {
                    	            alt13=1;
                    	        }


                    	        switch (alt13) {
                    	    	case 1 :
                    	    	    // InternalAlpha.g:872:7: ( (lv_outputs_28_0= ruleFuzzyVariableNameOnly ) ) otherlv_29= ','
                    	    	    {
                    	    	    // InternalAlpha.g:872:7: ( (lv_outputs_28_0= ruleFuzzyVariableNameOnly ) )
                    	    	    // InternalAlpha.g:873:8: (lv_outputs_28_0= ruleFuzzyVariableNameOnly )
                    	    	    {
                    	    	    // InternalAlpha.g:873:8: (lv_outputs_28_0= ruleFuzzyVariableNameOnly )
                    	    	    // InternalAlpha.g:874:9: lv_outputs_28_0= ruleFuzzyVariableNameOnly
                    	    	    {

                    	    	    									newCompositeNode(grammarAccess.getAlphaSystemAccess().getOutputsFuzzyVariableNameOnlyParserRuleCall_5_1_3_2_0_0());
                    	    	    								
                    	    	    pushFollow(FOLLOW_17);
                    	    	    lv_outputs_28_0=ruleFuzzyVariableNameOnly();

                    	    	    state._fsp--;


                    	    	    									if (current==null) {
                    	    	    										current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    	    									}
                    	    	    									add(
                    	    	    										current,
                    	    	    										"outputs",
                    	    	    										lv_outputs_28_0,
                    	    	    										"alpha.model.Alpha.FuzzyVariableNameOnly");
                    	    	    									afterParserOrEnumRuleCall();
                    	    	    								

                    	    	    }


                    	    	    }

                    	    	    otherlv_29=(Token)match(input,24,FOLLOW_15); 

                    	    	    							newLeafNode(otherlv_29, grammarAccess.getAlphaSystemAccess().getCommaKeyword_5_1_3_2_1());
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop13;
                    	        }
                    	    } while (true);

                    	    // InternalAlpha.g:896:6: ( (lv_outputs_30_0= ruleFuzzyVariable ) )
                    	    // InternalAlpha.g:897:7: (lv_outputs_30_0= ruleFuzzyVariable )
                    	    {
                    	    // InternalAlpha.g:897:7: (lv_outputs_30_0= ruleFuzzyVariable )
                    	    // InternalAlpha.g:898:8: lv_outputs_30_0= ruleFuzzyVariable
                    	    {

                    	    								newCompositeNode(grammarAccess.getAlphaSystemAccess().getOutputsFuzzyVariableParserRuleCall_5_1_3_3_0());
                    	    							
                    	    pushFollow(FOLLOW_18);
                    	    lv_outputs_30_0=ruleFuzzyVariable();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"outputs",
                    	    									lv_outputs_30_0,
                    	    									"alpha.model.Alpha.FuzzyVariable");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    }
                    break;

            }

            // InternalAlpha.g:918:3: (otherlv_31= 'locals' ( ( (lv_locals_32_0= ruleVariable ) ) | ( ( (lv_locals_33_0= ruleVariableNameOnly ) ) otherlv_34= ',' ( ( (lv_locals_35_0= ruleVariableNameOnly ) ) otherlv_36= ',' )* ( (lv_locals_37_0= ruleVariable ) ) ) | ( (lv_locals_38_0= ruleFuzzyVariable ) ) | ( ( (lv_locals_39_0= ruleFuzzyVariableNameOnly ) ) otherlv_40= ',' ( ( (lv_locals_41_0= ruleFuzzyVariableNameOnly ) ) otherlv_42= ',' )* ( (lv_locals_43_0= ruleFuzzyVariable ) ) ) )+ )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAlpha.g:919:4: otherlv_31= 'locals' ( ( (lv_locals_32_0= ruleVariable ) ) | ( ( (lv_locals_33_0= ruleVariableNameOnly ) ) otherlv_34= ',' ( ( (lv_locals_35_0= ruleVariableNameOnly ) ) otherlv_36= ',' )* ( (lv_locals_37_0= ruleVariable ) ) ) | ( (lv_locals_38_0= ruleFuzzyVariable ) ) | ( ( (lv_locals_39_0= ruleFuzzyVariableNameOnly ) ) otherlv_40= ',' ( ( (lv_locals_41_0= ruleFuzzyVariableNameOnly ) ) otherlv_42= ',' )* ( (lv_locals_43_0= ruleFuzzyVariable ) ) ) )+
                    {
                    otherlv_31=(Token)match(input,26,FOLLOW_15); 

                    				newLeafNode(otherlv_31, grammarAccess.getAlphaSystemAccess().getLocalsKeyword_6_0());
                    			
                    // InternalAlpha.g:923:4: ( ( (lv_locals_32_0= ruleVariable ) ) | ( ( (lv_locals_33_0= ruleVariableNameOnly ) ) otherlv_34= ',' ( ( (lv_locals_35_0= ruleVariableNameOnly ) ) otherlv_36= ',' )* ( (lv_locals_37_0= ruleVariable ) ) ) | ( (lv_locals_38_0= ruleFuzzyVariable ) ) | ( ( (lv_locals_39_0= ruleFuzzyVariableNameOnly ) ) otherlv_40= ',' ( ( (lv_locals_41_0= ruleFuzzyVariableNameOnly ) ) otherlv_42= ',' )* ( (lv_locals_43_0= ruleFuzzyVariable ) ) ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=5;
                        alt18 = dfa18.predict(input);
                        switch (alt18) {
                    	case 1 :
                    	    // InternalAlpha.g:924:5: ( (lv_locals_32_0= ruleVariable ) )
                    	    {
                    	    // InternalAlpha.g:924:5: ( (lv_locals_32_0= ruleVariable ) )
                    	    // InternalAlpha.g:925:6: (lv_locals_32_0= ruleVariable )
                    	    {
                    	    // InternalAlpha.g:925:6: (lv_locals_32_0= ruleVariable )
                    	    // InternalAlpha.g:926:7: lv_locals_32_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlphaSystemAccess().getLocalsVariableParserRuleCall_6_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_locals_32_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"locals",
                    	    								lv_locals_32_0,
                    	    								"alpha.model.Alpha.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAlpha.g:944:5: ( ( (lv_locals_33_0= ruleVariableNameOnly ) ) otherlv_34= ',' ( ( (lv_locals_35_0= ruleVariableNameOnly ) ) otherlv_36= ',' )* ( (lv_locals_37_0= ruleVariable ) ) )
                    	    {
                    	    // InternalAlpha.g:944:5: ( ( (lv_locals_33_0= ruleVariableNameOnly ) ) otherlv_34= ',' ( ( (lv_locals_35_0= ruleVariableNameOnly ) ) otherlv_36= ',' )* ( (lv_locals_37_0= ruleVariable ) ) )
                    	    // InternalAlpha.g:945:6: ( (lv_locals_33_0= ruleVariableNameOnly ) ) otherlv_34= ',' ( ( (lv_locals_35_0= ruleVariableNameOnly ) ) otherlv_36= ',' )* ( (lv_locals_37_0= ruleVariable ) )
                    	    {
                    	    // InternalAlpha.g:945:6: ( (lv_locals_33_0= ruleVariableNameOnly ) )
                    	    // InternalAlpha.g:946:7: (lv_locals_33_0= ruleVariableNameOnly )
                    	    {
                    	    // InternalAlpha.g:946:7: (lv_locals_33_0= ruleVariableNameOnly )
                    	    // InternalAlpha.g:947:8: lv_locals_33_0= ruleVariableNameOnly
                    	    {

                    	    								newCompositeNode(grammarAccess.getAlphaSystemAccess().getLocalsVariableNameOnlyParserRuleCall_6_1_1_0_0());
                    	    							
                    	    pushFollow(FOLLOW_17);
                    	    lv_locals_33_0=ruleVariableNameOnly();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"locals",
                    	    									lv_locals_33_0,
                    	    									"alpha.model.Alpha.VariableNameOnly");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    otherlv_34=(Token)match(input,24,FOLLOW_5); 

                    	    						newLeafNode(otherlv_34, grammarAccess.getAlphaSystemAccess().getCommaKeyword_6_1_1_1());
                    	    					
                    	    // InternalAlpha.g:968:6: ( ( (lv_locals_35_0= ruleVariableNameOnly ) ) otherlv_36= ',' )*
                    	    loop16:
                    	    do {
                    	        int alt16=2;
                    	        int LA16_0 = input.LA(1);

                    	        if ( (LA16_0==RULE_ID) ) {
                    	            int LA16_1 = input.LA(2);

                    	            if ( (LA16_1==24) ) {
                    	                alt16=1;
                    	            }


                    	        }


                    	        switch (alt16) {
                    	    	case 1 :
                    	    	    // InternalAlpha.g:969:7: ( (lv_locals_35_0= ruleVariableNameOnly ) ) otherlv_36= ','
                    	    	    {
                    	    	    // InternalAlpha.g:969:7: ( (lv_locals_35_0= ruleVariableNameOnly ) )
                    	    	    // InternalAlpha.g:970:8: (lv_locals_35_0= ruleVariableNameOnly )
                    	    	    {
                    	    	    // InternalAlpha.g:970:8: (lv_locals_35_0= ruleVariableNameOnly )
                    	    	    // InternalAlpha.g:971:9: lv_locals_35_0= ruleVariableNameOnly
                    	    	    {

                    	    	    									newCompositeNode(grammarAccess.getAlphaSystemAccess().getLocalsVariableNameOnlyParserRuleCall_6_1_1_2_0_0());
                    	    	    								
                    	    	    pushFollow(FOLLOW_17);
                    	    	    lv_locals_35_0=ruleVariableNameOnly();

                    	    	    state._fsp--;


                    	    	    									if (current==null) {
                    	    	    										current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    	    									}
                    	    	    									add(
                    	    	    										current,
                    	    	    										"locals",
                    	    	    										lv_locals_35_0,
                    	    	    										"alpha.model.Alpha.VariableNameOnly");
                    	    	    									afterParserOrEnumRuleCall();
                    	    	    								

                    	    	    }


                    	    	    }

                    	    	    otherlv_36=(Token)match(input,24,FOLLOW_5); 

                    	    	    							newLeafNode(otherlv_36, grammarAccess.getAlphaSystemAccess().getCommaKeyword_6_1_1_2_1());
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop16;
                    	        }
                    	    } while (true);

                    	    // InternalAlpha.g:993:6: ( (lv_locals_37_0= ruleVariable ) )
                    	    // InternalAlpha.g:994:7: (lv_locals_37_0= ruleVariable )
                    	    {
                    	    // InternalAlpha.g:994:7: (lv_locals_37_0= ruleVariable )
                    	    // InternalAlpha.g:995:8: lv_locals_37_0= ruleVariable
                    	    {

                    	    								newCompositeNode(grammarAccess.getAlphaSystemAccess().getLocalsVariableParserRuleCall_6_1_1_3_0());
                    	    							
                    	    pushFollow(FOLLOW_19);
                    	    lv_locals_37_0=ruleVariable();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"locals",
                    	    									lv_locals_37_0,
                    	    									"alpha.model.Alpha.Variable");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalAlpha.g:1014:5: ( (lv_locals_38_0= ruleFuzzyVariable ) )
                    	    {
                    	    // InternalAlpha.g:1014:5: ( (lv_locals_38_0= ruleFuzzyVariable ) )
                    	    // InternalAlpha.g:1015:6: (lv_locals_38_0= ruleFuzzyVariable )
                    	    {
                    	    // InternalAlpha.g:1015:6: (lv_locals_38_0= ruleFuzzyVariable )
                    	    // InternalAlpha.g:1016:7: lv_locals_38_0= ruleFuzzyVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlphaSystemAccess().getLocalsFuzzyVariableParserRuleCall_6_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_locals_38_0=ruleFuzzyVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"locals",
                    	    								lv_locals_38_0,
                    	    								"alpha.model.Alpha.FuzzyVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalAlpha.g:1034:5: ( ( (lv_locals_39_0= ruleFuzzyVariableNameOnly ) ) otherlv_40= ',' ( ( (lv_locals_41_0= ruleFuzzyVariableNameOnly ) ) otherlv_42= ',' )* ( (lv_locals_43_0= ruleFuzzyVariable ) ) )
                    	    {
                    	    // InternalAlpha.g:1034:5: ( ( (lv_locals_39_0= ruleFuzzyVariableNameOnly ) ) otherlv_40= ',' ( ( (lv_locals_41_0= ruleFuzzyVariableNameOnly ) ) otherlv_42= ',' )* ( (lv_locals_43_0= ruleFuzzyVariable ) ) )
                    	    // InternalAlpha.g:1035:6: ( (lv_locals_39_0= ruleFuzzyVariableNameOnly ) ) otherlv_40= ',' ( ( (lv_locals_41_0= ruleFuzzyVariableNameOnly ) ) otherlv_42= ',' )* ( (lv_locals_43_0= ruleFuzzyVariable ) )
                    	    {
                    	    // InternalAlpha.g:1035:6: ( (lv_locals_39_0= ruleFuzzyVariableNameOnly ) )
                    	    // InternalAlpha.g:1036:7: (lv_locals_39_0= ruleFuzzyVariableNameOnly )
                    	    {
                    	    // InternalAlpha.g:1036:7: (lv_locals_39_0= ruleFuzzyVariableNameOnly )
                    	    // InternalAlpha.g:1037:8: lv_locals_39_0= ruleFuzzyVariableNameOnly
                    	    {

                    	    								newCompositeNode(grammarAccess.getAlphaSystemAccess().getLocalsFuzzyVariableNameOnlyParserRuleCall_6_1_3_0_0());
                    	    							
                    	    pushFollow(FOLLOW_17);
                    	    lv_locals_39_0=ruleFuzzyVariableNameOnly();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"locals",
                    	    									lv_locals_39_0,
                    	    									"alpha.model.Alpha.FuzzyVariableNameOnly");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    otherlv_40=(Token)match(input,24,FOLLOW_15); 

                    	    						newLeafNode(otherlv_40, grammarAccess.getAlphaSystemAccess().getCommaKeyword_6_1_3_1());
                    	    					
                    	    // InternalAlpha.g:1058:6: ( ( (lv_locals_41_0= ruleFuzzyVariableNameOnly ) ) otherlv_42= ',' )*
                    	    loop17:
                    	    do {
                    	        int alt17=2;
                    	        int LA17_0 = input.LA(1);

                    	        if ( (LA17_0==RULE_ID) ) {
                    	            alt17=1;
                    	        }


                    	        switch (alt17) {
                    	    	case 1 :
                    	    	    // InternalAlpha.g:1059:7: ( (lv_locals_41_0= ruleFuzzyVariableNameOnly ) ) otherlv_42= ','
                    	    	    {
                    	    	    // InternalAlpha.g:1059:7: ( (lv_locals_41_0= ruleFuzzyVariableNameOnly ) )
                    	    	    // InternalAlpha.g:1060:8: (lv_locals_41_0= ruleFuzzyVariableNameOnly )
                    	    	    {
                    	    	    // InternalAlpha.g:1060:8: (lv_locals_41_0= ruleFuzzyVariableNameOnly )
                    	    	    // InternalAlpha.g:1061:9: lv_locals_41_0= ruleFuzzyVariableNameOnly
                    	    	    {

                    	    	    									newCompositeNode(grammarAccess.getAlphaSystemAccess().getLocalsFuzzyVariableNameOnlyParserRuleCall_6_1_3_2_0_0());
                    	    	    								
                    	    	    pushFollow(FOLLOW_17);
                    	    	    lv_locals_41_0=ruleFuzzyVariableNameOnly();

                    	    	    state._fsp--;


                    	    	    									if (current==null) {
                    	    	    										current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    	    									}
                    	    	    									add(
                    	    	    										current,
                    	    	    										"locals",
                    	    	    										lv_locals_41_0,
                    	    	    										"alpha.model.Alpha.FuzzyVariableNameOnly");
                    	    	    									afterParserOrEnumRuleCall();
                    	    	    								

                    	    	    }


                    	    	    }

                    	    	    otherlv_42=(Token)match(input,24,FOLLOW_15); 

                    	    	    							newLeafNode(otherlv_42, grammarAccess.getAlphaSystemAccess().getCommaKeyword_6_1_3_2_1());
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop17;
                    	        }
                    	    } while (true);

                    	    // InternalAlpha.g:1083:6: ( (lv_locals_43_0= ruleFuzzyVariable ) )
                    	    // InternalAlpha.g:1084:7: (lv_locals_43_0= ruleFuzzyVariable )
                    	    {
                    	    // InternalAlpha.g:1084:7: (lv_locals_43_0= ruleFuzzyVariable )
                    	    // InternalAlpha.g:1085:8: lv_locals_43_0= ruleFuzzyVariable
                    	    {

                    	    								newCompositeNode(grammarAccess.getAlphaSystemAccess().getLocalsFuzzyVariableParserRuleCall_6_1_3_3_0());
                    	    							
                    	    pushFollow(FOLLOW_19);
                    	    lv_locals_43_0=ruleFuzzyVariable();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"locals",
                    	    									lv_locals_43_0,
                    	    									"alpha.model.Alpha.FuzzyVariable");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    }
                    break;

            }

            // InternalAlpha.g:1105:3: (otherlv_44= 'over' ( (lv_whileDomainExpr_45_0= ruleCalculatorExpression ) ) otherlv_46= 'while' otherlv_47= '(' ( (lv_testExpression_48_0= ruleAlphaExpression ) ) otherlv_49= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAlpha.g:1106:4: otherlv_44= 'over' ( (lv_whileDomainExpr_45_0= ruleCalculatorExpression ) ) otherlv_46= 'while' otherlv_47= '(' ( (lv_testExpression_48_0= ruleAlphaExpression ) ) otherlv_49= ')'
                    {
                    otherlv_44=(Token)match(input,27,FOLLOW_20); 

                    				newLeafNode(otherlv_44, grammarAccess.getAlphaSystemAccess().getOverKeyword_7_0());
                    			
                    // InternalAlpha.g:1110:4: ( (lv_whileDomainExpr_45_0= ruleCalculatorExpression ) )
                    // InternalAlpha.g:1111:5: (lv_whileDomainExpr_45_0= ruleCalculatorExpression )
                    {
                    // InternalAlpha.g:1111:5: (lv_whileDomainExpr_45_0= ruleCalculatorExpression )
                    // InternalAlpha.g:1112:6: lv_whileDomainExpr_45_0= ruleCalculatorExpression
                    {

                    						newCompositeNode(grammarAccess.getAlphaSystemAccess().getWhileDomainExprCalculatorExpressionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_whileDomainExpr_45_0=ruleCalculatorExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    						}
                    						set(
                    							current,
                    							"whileDomainExpr",
                    							lv_whileDomainExpr_45_0,
                    							"alpha.model.Alpha.CalculatorExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_46=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_46, grammarAccess.getAlphaSystemAccess().getWhileKeyword_7_2());
                    			
                    otherlv_47=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_47, grammarAccess.getAlphaSystemAccess().getLeftParenthesisKeyword_7_3());
                    			
                    // InternalAlpha.g:1137:4: ( (lv_testExpression_48_0= ruleAlphaExpression ) )
                    // InternalAlpha.g:1138:5: (lv_testExpression_48_0= ruleAlphaExpression )
                    {
                    // InternalAlpha.g:1138:5: (lv_testExpression_48_0= ruleAlphaExpression )
                    // InternalAlpha.g:1139:6: lv_testExpression_48_0= ruleAlphaExpression
                    {

                    						newCompositeNode(grammarAccess.getAlphaSystemAccess().getTestExpressionAlphaExpressionParserRuleCall_7_4_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_testExpression_48_0=ruleAlphaExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    						}
                    						set(
                    							current,
                    							"testExpression",
                    							lv_testExpression_48_0,
                    							"alpha.model.Alpha.AlphaExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_49=(Token)match(input,16,FOLLOW_23); 

                    				newLeafNode(otherlv_49, grammarAccess.getAlphaSystemAccess().getRightParenthesisKeyword_7_5());
                    			

                    }
                    break;

            }

            // InternalAlpha.g:1161:3: ( (lv_systemBodies_50_0= ruleSystemBody ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=30 && LA21_0<=32)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAlpha.g:1162:4: (lv_systemBodies_50_0= ruleSystemBody )
            	    {
            	    // InternalAlpha.g:1162:4: (lv_systemBodies_50_0= ruleSystemBody )
            	    // InternalAlpha.g:1163:5: lv_systemBodies_50_0= ruleSystemBody
            	    {

            	    					newCompositeNode(grammarAccess.getAlphaSystemAccess().getSystemBodiesSystemBodyParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_systemBodies_50_0=ruleSystemBody();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"systemBodies",
            	    						lv_systemBodies_50_0,
            	    						"alpha.model.Alpha.SystemBody");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_51=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_51, grammarAccess.getAlphaSystemAccess().getFullStopKeyword_9());
            		

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


    // $ANTLR start "entryRuleSystemBody"
    // InternalAlpha.g:1188:1: entryRuleSystemBody returns [EObject current=null] : iv_ruleSystemBody= ruleSystemBody EOF ;
    public final EObject entryRuleSystemBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemBody = null;


        try {
            // InternalAlpha.g:1188:51: (iv_ruleSystemBody= ruleSystemBody EOF )
            // InternalAlpha.g:1189:2: iv_ruleSystemBody= ruleSystemBody EOF
            {
             newCompositeNode(grammarAccess.getSystemBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemBody=ruleSystemBody();

            state._fsp--;

             current =iv_ruleSystemBody; 
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
    // $ANTLR end "entryRuleSystemBody"


    // $ANTLR start "ruleSystemBody"
    // InternalAlpha.g:1195:1: ruleSystemBody returns [EObject current=null] : ( () ( (otherlv_1= 'when' ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation ) ) ) | otherlv_3= 'else' )? otherlv_4= 'let' ( (lv_equations_5_0= ruleEquation ) )* ) ;
    public final EObject ruleSystemBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_parameterDomainExpr_2_0 = null;

        EObject lv_equations_5_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1201:2: ( ( () ( (otherlv_1= 'when' ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation ) ) ) | otherlv_3= 'else' )? otherlv_4= 'let' ( (lv_equations_5_0= ruleEquation ) )* ) )
            // InternalAlpha.g:1202:2: ( () ( (otherlv_1= 'when' ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation ) ) ) | otherlv_3= 'else' )? otherlv_4= 'let' ( (lv_equations_5_0= ruleEquation ) )* )
            {
            // InternalAlpha.g:1202:2: ( () ( (otherlv_1= 'when' ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation ) ) ) | otherlv_3= 'else' )? otherlv_4= 'let' ( (lv_equations_5_0= ruleEquation ) )* )
            // InternalAlpha.g:1203:3: () ( (otherlv_1= 'when' ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation ) ) ) | otherlv_3= 'else' )? otherlv_4= 'let' ( (lv_equations_5_0= ruleEquation ) )*
            {
            // InternalAlpha.g:1203:3: ()
            // InternalAlpha.g:1204:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSystemBodyAccess().getSystemBodyAction_0(),
            					current);
            			

            }

            // InternalAlpha.g:1210:3: ( (otherlv_1= 'when' ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation ) ) ) | otherlv_3= 'else' )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            else if ( (LA22_0==31) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // InternalAlpha.g:1211:4: (otherlv_1= 'when' ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation ) ) )
                    {
                    // InternalAlpha.g:1211:4: (otherlv_1= 'when' ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation ) ) )
                    // InternalAlpha.g:1212:5: otherlv_1= 'when' ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_10); 

                    					newLeafNode(otherlv_1, grammarAccess.getSystemBodyAccess().getWhenKeyword_1_0_0());
                    				
                    // InternalAlpha.g:1216:5: ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation ) )
                    // InternalAlpha.g:1217:6: (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation )
                    {
                    // InternalAlpha.g:1217:6: (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation )
                    // InternalAlpha.g:1218:7: lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation
                    {

                    							newCompositeNode(grammarAccess.getSystemBodyAccess().getParameterDomainExprJNIParamDomainInArrayNotationParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_24);
                    lv_parameterDomainExpr_2_0=ruleJNIParamDomainInArrayNotation();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSystemBodyRule());
                    							}
                    							set(
                    								current,
                    								"parameterDomainExpr",
                    								lv_parameterDomainExpr_2_0,
                    								"alpha.model.Alpha.JNIParamDomainInArrayNotation");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlpha.g:1237:4: otherlv_3= 'else'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getSystemBodyAccess().getElseKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemBodyAccess().getLetKeyword_2());
            		
            // InternalAlpha.g:1246:3: ( (lv_equations_5_0= ruleEquation ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==15||LA23_0==27||LA23_0==33||LA23_0==57) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAlpha.g:1247:4: (lv_equations_5_0= ruleEquation )
            	    {
            	    // InternalAlpha.g:1247:4: (lv_equations_5_0= ruleEquation )
            	    // InternalAlpha.g:1248:5: lv_equations_5_0= ruleEquation
            	    {

            	    					newCompositeNode(grammarAccess.getSystemBodyAccess().getEquationsEquationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_equations_5_0=ruleEquation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemBodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"equations",
            	    						lv_equations_5_0,
            	    						"alpha.model.Alpha.Equation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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
    // $ANTLR end "ruleSystemBody"


    // $ANTLR start "entryRuleVariable"
    // InternalAlpha.g:1269:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalAlpha.g:1269:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalAlpha.g:1270:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalAlpha.g:1276:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_domainExpr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1282:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) ) (otherlv_3= ';' )? ) )
            // InternalAlpha.g:1283:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) ) (otherlv_3= ';' )? )
            {
            // InternalAlpha.g:1283:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) ) (otherlv_3= ';' )? )
            // InternalAlpha.g:1284:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) ) (otherlv_3= ';' )?
            {
            // InternalAlpha.g:1284:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:1285:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:1285:4: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:1286:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"alpha.model.Alpha.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getColonKeyword_1());
            		
            // InternalAlpha.g:1306:3: ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:1307:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:1307:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
            // InternalAlpha.g:1308:5: lv_domainExpr_2_0= ruleCalculatorExpression
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getDomainExprCalculatorExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_domainExpr_2_0=ruleCalculatorExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"domainExpr",
            						lv_domainExpr_2_0,
            						"alpha.model.Alpha.CalculatorExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:1325:3: (otherlv_3= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAlpha.g:1326:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getSemicolonKeyword_3());
                    			

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleFuzzyVariable"
    // InternalAlpha.g:1335:1: entryRuleFuzzyVariable returns [EObject current=null] : iv_ruleFuzzyVariable= ruleFuzzyVariable EOF ;
    public final EObject entryRuleFuzzyVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyVariable = null;


        try {
            // InternalAlpha.g:1335:54: (iv_ruleFuzzyVariable= ruleFuzzyVariable EOF )
            // InternalAlpha.g:1336:2: iv_ruleFuzzyVariable= ruleFuzzyVariable EOF
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
    // InternalAlpha.g:1342:1: ruleFuzzyVariable returns [EObject current=null] : (otherlv_0= 'fuzzy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domainExpr_3_0= ruleCalculatorExpression ) ) otherlv_4= '->' ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) ) (otherlv_6= ';' )? ) ;
    public final EObject ruleFuzzyVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_domainExpr_3_0 = null;

        EObject lv_rangeExpr_5_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1348:2: ( (otherlv_0= 'fuzzy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domainExpr_3_0= ruleCalculatorExpression ) ) otherlv_4= '->' ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) ) (otherlv_6= ';' )? ) )
            // InternalAlpha.g:1349:2: (otherlv_0= 'fuzzy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domainExpr_3_0= ruleCalculatorExpression ) ) otherlv_4= '->' ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) ) (otherlv_6= ';' )? )
            {
            // InternalAlpha.g:1349:2: (otherlv_0= 'fuzzy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domainExpr_3_0= ruleCalculatorExpression ) ) otherlv_4= '->' ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) ) (otherlv_6= ';' )? )
            // InternalAlpha.g:1350:3: otherlv_0= 'fuzzy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domainExpr_3_0= ruleCalculatorExpression ) ) otherlv_4= '->' ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) ) (otherlv_6= ';' )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFuzzyVariableAccess().getFuzzyKeyword_0());
            		
            // InternalAlpha.g:1354:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAlpha.g:1355:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAlpha.g:1355:4: (lv_name_1_0= RULE_ID )
            // InternalAlpha.g:1356:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFuzzyVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuzzyVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"alpha.model.Alpha.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getFuzzyVariableAccess().getColonKeyword_2());
            		
            // InternalAlpha.g:1376:3: ( (lv_domainExpr_3_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:1377:4: (lv_domainExpr_3_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:1377:4: (lv_domainExpr_3_0= ruleCalculatorExpression )
            // InternalAlpha.g:1378:5: lv_domainExpr_3_0= ruleCalculatorExpression
            {

            					newCompositeNode(grammarAccess.getFuzzyVariableAccess().getDomainExprCalculatorExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_domainExpr_3_0=ruleCalculatorExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuzzyVariableRule());
            					}
            					set(
            						current,
            						"domainExpr",
            						lv_domainExpr_3_0,
            						"alpha.model.Alpha.CalculatorExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getFuzzyVariableAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalAlpha.g:1399:3: ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:1400:4: (lv_rangeExpr_5_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:1400:4: (lv_rangeExpr_5_0= ruleCalculatorExpression )
            // InternalAlpha.g:1401:5: lv_rangeExpr_5_0= ruleCalculatorExpression
            {

            					newCompositeNode(grammarAccess.getFuzzyVariableAccess().getRangeExprCalculatorExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_27);
            lv_rangeExpr_5_0=ruleCalculatorExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuzzyVariableRule());
            					}
            					set(
            						current,
            						"rangeExpr",
            						lv_rangeExpr_5_0,
            						"alpha.model.Alpha.CalculatorExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:1418:3: (otherlv_6= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAlpha.g:1419:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getFuzzyVariableAccess().getSemicolonKeyword_6());
                    			

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


    // $ANTLR start "entryRuleVariableNameOnly"
    // InternalAlpha.g:1428:1: entryRuleVariableNameOnly returns [EObject current=null] : iv_ruleVariableNameOnly= ruleVariableNameOnly EOF ;
    public final EObject entryRuleVariableNameOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableNameOnly = null;


        try {
            // InternalAlpha.g:1428:57: (iv_ruleVariableNameOnly= ruleVariableNameOnly EOF )
            // InternalAlpha.g:1429:2: iv_ruleVariableNameOnly= ruleVariableNameOnly EOF
            {
             newCompositeNode(grammarAccess.getVariableNameOnlyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableNameOnly=ruleVariableNameOnly();

            state._fsp--;

             current =iv_ruleVariableNameOnly; 
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
    // $ANTLR end "entryRuleVariableNameOnly"


    // $ANTLR start "ruleVariableNameOnly"
    // InternalAlpha.g:1435:1: ruleVariableNameOnly returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableNameOnly() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:1441:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalAlpha.g:1442:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalAlpha.g:1442:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:1443:3: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:1443:3: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:1444:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableNameOnlyAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableNameOnlyRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"alpha.model.Alpha.ID");
            			

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
    // $ANTLR end "ruleVariableNameOnly"


    // $ANTLR start "entryRuleFuzzyVariableNameOnly"
    // InternalAlpha.g:1463:1: entryRuleFuzzyVariableNameOnly returns [EObject current=null] : iv_ruleFuzzyVariableNameOnly= ruleFuzzyVariableNameOnly EOF ;
    public final EObject entryRuleFuzzyVariableNameOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyVariableNameOnly = null;


        try {
            // InternalAlpha.g:1463:62: (iv_ruleFuzzyVariableNameOnly= ruleFuzzyVariableNameOnly EOF )
            // InternalAlpha.g:1464:2: iv_ruleFuzzyVariableNameOnly= ruleFuzzyVariableNameOnly EOF
            {
             newCompositeNode(grammarAccess.getFuzzyVariableNameOnlyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuzzyVariableNameOnly=ruleFuzzyVariableNameOnly();

            state._fsp--;

             current =iv_ruleFuzzyVariableNameOnly; 
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
    // $ANTLR end "entryRuleFuzzyVariableNameOnly"


    // $ANTLR start "ruleFuzzyVariableNameOnly"
    // InternalAlpha.g:1470:1: ruleFuzzyVariableNameOnly returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFuzzyVariableNameOnly() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:1476:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalAlpha.g:1477:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalAlpha.g:1477:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:1478:3: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:1478:3: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:1479:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFuzzyVariableNameOnlyAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFuzzyVariableNameOnlyRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"alpha.model.Alpha.ID");
            			

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
    // $ANTLR end "ruleFuzzyVariableNameOnly"


    // $ANTLR start "entryRuleJNIDomain"
    // InternalAlpha.g:1498:1: entryRuleJNIDomain returns [EObject current=null] : iv_ruleJNIDomain= ruleJNIDomain EOF ;
    public final EObject entryRuleJNIDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIDomain = null;


        try {
            // InternalAlpha.g:1498:50: (iv_ruleJNIDomain= ruleJNIDomain EOF )
            // InternalAlpha.g:1499:2: iv_ruleJNIDomain= ruleJNIDomain EOF
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
    // InternalAlpha.g:1505:1: ruleJNIDomain returns [EObject current=null] : ( (lv_islString_0_0= ruleAISLSet ) ) ;
    public final EObject ruleJNIDomain() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_islString_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1511:2: ( ( (lv_islString_0_0= ruleAISLSet ) ) )
            // InternalAlpha.g:1512:2: ( (lv_islString_0_0= ruleAISLSet ) )
            {
            // InternalAlpha.g:1512:2: ( (lv_islString_0_0= ruleAISLSet ) )
            // InternalAlpha.g:1513:3: (lv_islString_0_0= ruleAISLSet )
            {
            // InternalAlpha.g:1513:3: (lv_islString_0_0= ruleAISLSet )
            // InternalAlpha.g:1514:4: lv_islString_0_0= ruleAISLSet
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
    // InternalAlpha.g:1534:1: entryRuleJNIDomainInArrayNotation returns [EObject current=null] : iv_ruleJNIDomainInArrayNotation= ruleJNIDomainInArrayNotation EOF ;
    public final EObject entryRuleJNIDomainInArrayNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIDomainInArrayNotation = null;


        try {
            // InternalAlpha.g:1534:65: (iv_ruleJNIDomainInArrayNotation= ruleJNIDomainInArrayNotation EOF )
            // InternalAlpha.g:1535:2: iv_ruleJNIDomainInArrayNotation= ruleJNIDomainInArrayNotation EOF
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
    // InternalAlpha.g:1541:1: ruleJNIDomainInArrayNotation returns [EObject current=null] : (otherlv_0= '{' otherlv_1= ':' ( (lv_islString_2_0= ruleAISLString ) ) otherlv_3= '}' ) ;
    public final EObject ruleJNIDomainInArrayNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_islString_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1547:2: ( (otherlv_0= '{' otherlv_1= ':' ( (lv_islString_2_0= ruleAISLString ) ) otherlv_3= '}' ) )
            // InternalAlpha.g:1548:2: (otherlv_0= '{' otherlv_1= ':' ( (lv_islString_2_0= ruleAISLString ) ) otherlv_3= '}' )
            {
            // InternalAlpha.g:1548:2: (otherlv_0= '{' otherlv_1= ':' ( (lv_islString_2_0= ruleAISLString ) ) otherlv_3= '}' )
            // InternalAlpha.g:1549:3: otherlv_0= '{' otherlv_1= ':' ( (lv_islString_2_0= ruleAISLString ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getJNIDomainInArrayNotationAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getJNIDomainInArrayNotationAccess().getColonKeyword_1());
            		
            // InternalAlpha.g:1557:3: ( (lv_islString_2_0= ruleAISLString ) )
            // InternalAlpha.g:1558:4: (lv_islString_2_0= ruleAISLString )
            {
            // InternalAlpha.g:1558:4: (lv_islString_2_0= ruleAISLString )
            // InternalAlpha.g:1559:5: lv_islString_2_0= ruleAISLString
            {

            					newCompositeNode(grammarAccess.getJNIDomainInArrayNotationAccess().getIslStringAISLStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalAlpha.g:1584:1: entryRuleJNIParamDomain returns [EObject current=null] : iv_ruleJNIParamDomain= ruleJNIParamDomain EOF ;
    public final EObject entryRuleJNIParamDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIParamDomain = null;


        try {
            // InternalAlpha.g:1584:55: (iv_ruleJNIParamDomain= ruleJNIParamDomain EOF )
            // InternalAlpha.g:1585:2: iv_ruleJNIParamDomain= ruleJNIParamDomain EOF
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
    // InternalAlpha.g:1591:1: ruleJNIParamDomain returns [EObject current=null] : ( (lv_islString_0_0= ruleAParamDomain ) ) ;
    public final EObject ruleJNIParamDomain() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_islString_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1597:2: ( ( (lv_islString_0_0= ruleAParamDomain ) ) )
            // InternalAlpha.g:1598:2: ( (lv_islString_0_0= ruleAParamDomain ) )
            {
            // InternalAlpha.g:1598:2: ( (lv_islString_0_0= ruleAParamDomain ) )
            // InternalAlpha.g:1599:3: (lv_islString_0_0= ruleAParamDomain )
            {
            // InternalAlpha.g:1599:3: (lv_islString_0_0= ruleAParamDomain )
            // InternalAlpha.g:1600:4: lv_islString_0_0= ruleAParamDomain
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


    // $ANTLR start "entryRuleJNIParamDomainInArrayNotation"
    // InternalAlpha.g:1620:1: entryRuleJNIParamDomainInArrayNotation returns [EObject current=null] : iv_ruleJNIParamDomainInArrayNotation= ruleJNIParamDomainInArrayNotation EOF ;
    public final EObject entryRuleJNIParamDomainInArrayNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIParamDomainInArrayNotation = null;


        try {
            // InternalAlpha.g:1620:70: (iv_ruleJNIParamDomainInArrayNotation= ruleJNIParamDomainInArrayNotation EOF )
            // InternalAlpha.g:1621:2: iv_ruleJNIParamDomainInArrayNotation= ruleJNIParamDomainInArrayNotation EOF
            {
             newCompositeNode(grammarAccess.getJNIParamDomainInArrayNotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJNIParamDomainInArrayNotation=ruleJNIParamDomainInArrayNotation();

            state._fsp--;

             current =iv_ruleJNIParamDomainInArrayNotation; 
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
    // $ANTLR end "entryRuleJNIParamDomainInArrayNotation"


    // $ANTLR start "ruleJNIParamDomainInArrayNotation"
    // InternalAlpha.g:1627:1: ruleJNIParamDomainInArrayNotation returns [EObject current=null] : ( (lv_islString_0_0= ruleAParamDomainInArrayNotation ) ) ;
    public final EObject ruleJNIParamDomainInArrayNotation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_islString_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1633:2: ( ( (lv_islString_0_0= ruleAParamDomainInArrayNotation ) ) )
            // InternalAlpha.g:1634:2: ( (lv_islString_0_0= ruleAParamDomainInArrayNotation ) )
            {
            // InternalAlpha.g:1634:2: ( (lv_islString_0_0= ruleAParamDomainInArrayNotation ) )
            // InternalAlpha.g:1635:3: (lv_islString_0_0= ruleAParamDomainInArrayNotation )
            {
            // InternalAlpha.g:1635:3: (lv_islString_0_0= ruleAParamDomainInArrayNotation )
            // InternalAlpha.g:1636:4: lv_islString_0_0= ruleAParamDomainInArrayNotation
            {

            				newCompositeNode(grammarAccess.getJNIParamDomainInArrayNotationAccess().getIslStringAParamDomainInArrayNotationParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_islString_0_0=ruleAParamDomainInArrayNotation();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getJNIParamDomainInArrayNotationRule());
            				}
            				set(
            					current,
            					"islString",
            					lv_islString_0_0,
            					"alpha.model.Alpha.AParamDomainInArrayNotation");
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
    // $ANTLR end "ruleJNIParamDomainInArrayNotation"


    // $ANTLR start "entryRuleJNIRelation"
    // InternalAlpha.g:1656:1: entryRuleJNIRelation returns [EObject current=null] : iv_ruleJNIRelation= ruleJNIRelation EOF ;
    public final EObject entryRuleJNIRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIRelation = null;


        try {
            // InternalAlpha.g:1656:52: (iv_ruleJNIRelation= ruleJNIRelation EOF )
            // InternalAlpha.g:1657:2: iv_ruleJNIRelation= ruleJNIRelation EOF
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
    // InternalAlpha.g:1663:1: ruleJNIRelation returns [EObject current=null] : ( (lv_islString_0_0= ruleAISLRelation ) ) ;
    public final EObject ruleJNIRelation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_islString_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1669:2: ( ( (lv_islString_0_0= ruleAISLRelation ) ) )
            // InternalAlpha.g:1670:2: ( (lv_islString_0_0= ruleAISLRelation ) )
            {
            // InternalAlpha.g:1670:2: ( (lv_islString_0_0= ruleAISLRelation ) )
            // InternalAlpha.g:1671:3: (lv_islString_0_0= ruleAISLRelation )
            {
            // InternalAlpha.g:1671:3: (lv_islString_0_0= ruleAISLRelation )
            // InternalAlpha.g:1672:4: lv_islString_0_0= ruleAISLRelation
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
    // InternalAlpha.g:1692:1: entryRuleJNIFunction returns [EObject current=null] : iv_ruleJNIFunction= ruleJNIFunction EOF ;
    public final EObject entryRuleJNIFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIFunction = null;


        try {
            // InternalAlpha.g:1692:52: (iv_ruleJNIFunction= ruleJNIFunction EOF )
            // InternalAlpha.g:1693:2: iv_ruleJNIFunction= ruleJNIFunction EOF
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
    // InternalAlpha.g:1699:1: ruleJNIFunction returns [EObject current=null] : ( (lv_alphaFunction_0_0= ruleAlphaFunction ) ) ;
    public final EObject ruleJNIFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_alphaFunction_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1705:2: ( ( (lv_alphaFunction_0_0= ruleAlphaFunction ) ) )
            // InternalAlpha.g:1706:2: ( (lv_alphaFunction_0_0= ruleAlphaFunction ) )
            {
            // InternalAlpha.g:1706:2: ( (lv_alphaFunction_0_0= ruleAlphaFunction ) )
            // InternalAlpha.g:1707:3: (lv_alphaFunction_0_0= ruleAlphaFunction )
            {
            // InternalAlpha.g:1707:3: (lv_alphaFunction_0_0= ruleAlphaFunction )
            // InternalAlpha.g:1708:4: lv_alphaFunction_0_0= ruleAlphaFunction
            {

            				newCompositeNode(grammarAccess.getJNIFunctionAccess().getAlphaFunctionAlphaFunctionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_alphaFunction_0_0=ruleAlphaFunction();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getJNIFunctionRule());
            				}
            				set(
            					current,
            					"alphaFunction",
            					lv_alphaFunction_0_0,
            					"alpha.model.Alpha.AlphaFunction");
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
    // InternalAlpha.g:1728:1: entryRuleJNIFunctionInArrayNotation returns [EObject current=null] : iv_ruleJNIFunctionInArrayNotation= ruleJNIFunctionInArrayNotation EOF ;
    public final EObject entryRuleJNIFunctionInArrayNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIFunctionInArrayNotation = null;


        try {
            // InternalAlpha.g:1728:67: (iv_ruleJNIFunctionInArrayNotation= ruleJNIFunctionInArrayNotation EOF )
            // InternalAlpha.g:1729:2: iv_ruleJNIFunctionInArrayNotation= ruleJNIFunctionInArrayNotation EOF
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
    // InternalAlpha.g:1735:1: ruleJNIFunctionInArrayNotation returns [EObject current=null] : (otherlv_0= '[' () ( ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleJNIFunctionInArrayNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arrayNotation_2_0 = null;

        AntlrDatatypeRuleToken lv_arrayNotation_4_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1741:2: ( (otherlv_0= '[' () ( ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )* )? otherlv_5= ']' ) )
            // InternalAlpha.g:1742:2: (otherlv_0= '[' () ( ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )* )? otherlv_5= ']' )
            {
            // InternalAlpha.g:1742:2: (otherlv_0= '[' () ( ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )* )? otherlv_5= ']' )
            // InternalAlpha.g:1743:3: otherlv_0= '[' () ( ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )* )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getJNIFunctionInArrayNotationAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAlpha.g:1747:3: ()
            // InternalAlpha.g:1748:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJNIFunctionInArrayNotationAccess().getJNIFunctionInArrayNotationAction_1(),
            					current);
            			

            }

            // InternalAlpha.g:1754:3: ( ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_WS)||LA27_0==13||(LA27_0>=15 && LA27_0<=16)||(LA27_0>=43 && LA27_0<=47)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAlpha.g:1755:4: ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )*
                    {
                    // InternalAlpha.g:1755:4: ( (lv_arrayNotation_2_0= ruleAISLExpression ) )
                    // InternalAlpha.g:1756:5: (lv_arrayNotation_2_0= ruleAISLExpression )
                    {
                    // InternalAlpha.g:1756:5: (lv_arrayNotation_2_0= ruleAISLExpression )
                    // InternalAlpha.g:1757:6: lv_arrayNotation_2_0= ruleAISLExpression
                    {

                    						newCompositeNode(grammarAccess.getJNIFunctionInArrayNotationAccess().getArrayNotationAISLExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_32);
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

                    // InternalAlpha.g:1774:4: (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==24) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalAlpha.g:1775:5: otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_33); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getJNIFunctionInArrayNotationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlpha.g:1779:5: ( (lv_arrayNotation_4_0= ruleAISLExpression ) )
                    	    // InternalAlpha.g:1780:6: (lv_arrayNotation_4_0= ruleAISLExpression )
                    	    {
                    	    // InternalAlpha.g:1780:6: (lv_arrayNotation_4_0= ruleAISLExpression )
                    	    // InternalAlpha.g:1781:7: lv_arrayNotation_4_0= ruleAISLExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getJNIFunctionInArrayNotationAccess().getArrayNotationAISLExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
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
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,38,FOLLOW_2); 

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


    // $ANTLR start "entryRuleJNIPolynomial"
    // InternalAlpha.g:1808:1: entryRuleJNIPolynomial returns [EObject current=null] : iv_ruleJNIPolynomial= ruleJNIPolynomial EOF ;
    public final EObject entryRuleJNIPolynomial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIPolynomial = null;


        try {
            // InternalAlpha.g:1808:54: (iv_ruleJNIPolynomial= ruleJNIPolynomial EOF )
            // InternalAlpha.g:1809:2: iv_ruleJNIPolynomial= ruleJNIPolynomial EOF
            {
             newCompositeNode(grammarAccess.getJNIPolynomialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJNIPolynomial=ruleJNIPolynomial();

            state._fsp--;

             current =iv_ruleJNIPolynomial; 
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
    // $ANTLR end "entryRuleJNIPolynomial"


    // $ANTLR start "ruleJNIPolynomial"
    // InternalAlpha.g:1815:1: ruleJNIPolynomial returns [EObject current=null] : ( (lv_islString_0_0= ruleAISLPWQPolynomial ) ) ;
    public final EObject ruleJNIPolynomial() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_islString_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1821:2: ( ( (lv_islString_0_0= ruleAISLPWQPolynomial ) ) )
            // InternalAlpha.g:1822:2: ( (lv_islString_0_0= ruleAISLPWQPolynomial ) )
            {
            // InternalAlpha.g:1822:2: ( (lv_islString_0_0= ruleAISLPWQPolynomial ) )
            // InternalAlpha.g:1823:3: (lv_islString_0_0= ruleAISLPWQPolynomial )
            {
            // InternalAlpha.g:1823:3: (lv_islString_0_0= ruleAISLPWQPolynomial )
            // InternalAlpha.g:1824:4: lv_islString_0_0= ruleAISLPWQPolynomial
            {

            				newCompositeNode(grammarAccess.getJNIPolynomialAccess().getIslStringAISLPWQPolynomialParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_islString_0_0=ruleAISLPWQPolynomial();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getJNIPolynomialRule());
            				}
            				set(
            					current,
            					"islString",
            					lv_islString_0_0,
            					"alpha.model.Alpha.AISLPWQPolynomial");
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
    // $ANTLR end "ruleJNIPolynomial"


    // $ANTLR start "entryRuleJNIPolynomialInArrayNotation"
    // InternalAlpha.g:1844:1: entryRuleJNIPolynomialInArrayNotation returns [EObject current=null] : iv_ruleJNIPolynomialInArrayNotation= ruleJNIPolynomialInArrayNotation EOF ;
    public final EObject entryRuleJNIPolynomialInArrayNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIPolynomialInArrayNotation = null;


        try {
            // InternalAlpha.g:1844:69: (iv_ruleJNIPolynomialInArrayNotation= ruleJNIPolynomialInArrayNotation EOF )
            // InternalAlpha.g:1845:2: iv_ruleJNIPolynomialInArrayNotation= ruleJNIPolynomialInArrayNotation EOF
            {
             newCompositeNode(grammarAccess.getJNIPolynomialInArrayNotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJNIPolynomialInArrayNotation=ruleJNIPolynomialInArrayNotation();

            state._fsp--;

             current =iv_ruleJNIPolynomialInArrayNotation; 
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
    // $ANTLR end "entryRuleJNIPolynomialInArrayNotation"


    // $ANTLR start "ruleJNIPolynomialInArrayNotation"
    // InternalAlpha.g:1851:1: ruleJNIPolynomialInArrayNotation returns [EObject current=null] : (otherlv_0= '{' ( (lv_arrayNotation_1_0= ruleAISLQPolynomialBody ) ) (otherlv_2= ';' ( (lv_arrayNotation_3_0= ruleAISLQPolynomialBody ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleJNIPolynomialInArrayNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_arrayNotation_1_0 = null;

        AntlrDatatypeRuleToken lv_arrayNotation_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1857:2: ( (otherlv_0= '{' ( (lv_arrayNotation_1_0= ruleAISLQPolynomialBody ) ) (otherlv_2= ';' ( (lv_arrayNotation_3_0= ruleAISLQPolynomialBody ) ) )* otherlv_4= '}' ) )
            // InternalAlpha.g:1858:2: (otherlv_0= '{' ( (lv_arrayNotation_1_0= ruleAISLQPolynomialBody ) ) (otherlv_2= ';' ( (lv_arrayNotation_3_0= ruleAISLQPolynomialBody ) ) )* otherlv_4= '}' )
            {
            // InternalAlpha.g:1858:2: (otherlv_0= '{' ( (lv_arrayNotation_1_0= ruleAISLQPolynomialBody ) ) (otherlv_2= ';' ( (lv_arrayNotation_3_0= ruleAISLQPolynomialBody ) ) )* otherlv_4= '}' )
            // InternalAlpha.g:1859:3: otherlv_0= '{' ( (lv_arrayNotation_1_0= ruleAISLQPolynomialBody ) ) (otherlv_2= ';' ( (lv_arrayNotation_3_0= ruleAISLQPolynomialBody ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getJNIPolynomialInArrayNotationAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAlpha.g:1863:3: ( (lv_arrayNotation_1_0= ruleAISLQPolynomialBody ) )
            // InternalAlpha.g:1864:4: (lv_arrayNotation_1_0= ruleAISLQPolynomialBody )
            {
            // InternalAlpha.g:1864:4: (lv_arrayNotation_1_0= ruleAISLQPolynomialBody )
            // InternalAlpha.g:1865:5: lv_arrayNotation_1_0= ruleAISLQPolynomialBody
            {

            					newCompositeNode(grammarAccess.getJNIPolynomialInArrayNotationAccess().getArrayNotationAISLQPolynomialBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_arrayNotation_1_0=ruleAISLQPolynomialBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJNIPolynomialInArrayNotationRule());
            					}
            					add(
            						current,
            						"arrayNotation",
            						lv_arrayNotation_1_0,
            						"alpha.model.Alpha.AISLQPolynomialBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:1882:3: (otherlv_2= ';' ( (lv_arrayNotation_3_0= ruleAISLQPolynomialBody ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==34) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAlpha.g:1883:4: otherlv_2= ';' ( (lv_arrayNotation_3_0= ruleAISLQPolynomialBody ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_34); 

            	    				newLeafNode(otherlv_2, grammarAccess.getJNIPolynomialInArrayNotationAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalAlpha.g:1887:4: ( (lv_arrayNotation_3_0= ruleAISLQPolynomialBody ) )
            	    // InternalAlpha.g:1888:5: (lv_arrayNotation_3_0= ruleAISLQPolynomialBody )
            	    {
            	    // InternalAlpha.g:1888:5: (lv_arrayNotation_3_0= ruleAISLQPolynomialBody )
            	    // InternalAlpha.g:1889:6: lv_arrayNotation_3_0= ruleAISLQPolynomialBody
            	    {

            	    						newCompositeNode(grammarAccess.getJNIPolynomialInArrayNotationAccess().getArrayNotationAISLQPolynomialBodyParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_arrayNotation_3_0=ruleAISLQPolynomialBody();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJNIPolynomialInArrayNotationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"arrayNotation",
            	    							lv_arrayNotation_3_0,
            	    							"alpha.model.Alpha.AISLQPolynomialBody");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getJNIPolynomialInArrayNotationAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleJNIPolynomialInArrayNotation"


    // $ANTLR start "entryRuleFuzzyFunction"
    // InternalAlpha.g:1915:1: entryRuleFuzzyFunction returns [EObject current=null] : iv_ruleFuzzyFunction= ruleFuzzyFunction EOF ;
    public final EObject entryRuleFuzzyFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyFunction = null;


        try {
            // InternalAlpha.g:1915:54: (iv_ruleFuzzyFunction= ruleFuzzyFunction EOF )
            // InternalAlpha.g:1916:2: iv_ruleFuzzyFunction= ruleFuzzyFunction EOF
            {
             newCompositeNode(grammarAccess.getFuzzyFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuzzyFunction=ruleFuzzyFunction();

            state._fsp--;

             current =iv_ruleFuzzyFunction; 
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
    // $ANTLR end "entryRuleFuzzyFunction"


    // $ANTLR start "ruleFuzzyFunction"
    // InternalAlpha.g:1922:1: ruleFuzzyFunction returns [EObject current=null] : (otherlv_0= '(' ( (lv_alphaString_1_0= ruleAISLWrappedBasicRelation ) ) (otherlv_2= ';' ( (lv_indirections_3_0= ruleFuzzyVariableUse ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleFuzzyFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_alphaString_1_0 = null;

        EObject lv_indirections_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1928:2: ( (otherlv_0= '(' ( (lv_alphaString_1_0= ruleAISLWrappedBasicRelation ) ) (otherlv_2= ';' ( (lv_indirections_3_0= ruleFuzzyVariableUse ) ) )* otherlv_4= ')' ) )
            // InternalAlpha.g:1929:2: (otherlv_0= '(' ( (lv_alphaString_1_0= ruleAISLWrappedBasicRelation ) ) (otherlv_2= ';' ( (lv_indirections_3_0= ruleFuzzyVariableUse ) ) )* otherlv_4= ')' )
            {
            // InternalAlpha.g:1929:2: (otherlv_0= '(' ( (lv_alphaString_1_0= ruleAISLWrappedBasicRelation ) ) (otherlv_2= ';' ( (lv_indirections_3_0= ruleFuzzyVariableUse ) ) )* otherlv_4= ')' )
            // InternalAlpha.g:1930:3: otherlv_0= '(' ( (lv_alphaString_1_0= ruleAISLWrappedBasicRelation ) ) (otherlv_2= ';' ( (lv_indirections_3_0= ruleFuzzyVariableUse ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFuzzyFunctionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalAlpha.g:1934:3: ( (lv_alphaString_1_0= ruleAISLWrappedBasicRelation ) )
            // InternalAlpha.g:1935:4: (lv_alphaString_1_0= ruleAISLWrappedBasicRelation )
            {
            // InternalAlpha.g:1935:4: (lv_alphaString_1_0= ruleAISLWrappedBasicRelation )
            // InternalAlpha.g:1936:5: lv_alphaString_1_0= ruleAISLWrappedBasicRelation
            {

            					newCompositeNode(grammarAccess.getFuzzyFunctionAccess().getAlphaStringAISLWrappedBasicRelationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
            lv_alphaString_1_0=ruleAISLWrappedBasicRelation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuzzyFunctionRule());
            					}
            					set(
            						current,
            						"alphaString",
            						lv_alphaString_1_0,
            						"alpha.model.Alpha.AISLWrappedBasicRelation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:1953:3: (otherlv_2= ';' ( (lv_indirections_3_0= ruleFuzzyVariableUse ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==34) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAlpha.g:1954:4: otherlv_2= ';' ( (lv_indirections_3_0= ruleFuzzyVariableUse ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFuzzyFunctionAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalAlpha.g:1958:4: ( (lv_indirections_3_0= ruleFuzzyVariableUse ) )
            	    // InternalAlpha.g:1959:5: (lv_indirections_3_0= ruleFuzzyVariableUse )
            	    {
            	    // InternalAlpha.g:1959:5: (lv_indirections_3_0= ruleFuzzyVariableUse )
            	    // InternalAlpha.g:1960:6: lv_indirections_3_0= ruleFuzzyVariableUse
            	    {

            	    						newCompositeNode(grammarAccess.getFuzzyFunctionAccess().getIndirectionsFuzzyVariableUseParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_indirections_3_0=ruleFuzzyVariableUse();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFuzzyFunctionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"indirections",
            	    							lv_indirections_3_0,
            	    							"alpha.model.Alpha.FuzzyVariableUse");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFuzzyFunctionAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFuzzyFunction"


    // $ANTLR start "entryRuleFuzzyVariableUse"
    // InternalAlpha.g:1986:1: entryRuleFuzzyVariableUse returns [EObject current=null] : iv_ruleFuzzyVariableUse= ruleFuzzyVariableUse EOF ;
    public final EObject entryRuleFuzzyVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyVariableUse = null;


        try {
            // InternalAlpha.g:1986:57: (iv_ruleFuzzyVariableUse= ruleFuzzyVariableUse EOF )
            // InternalAlpha.g:1987:2: iv_ruleFuzzyVariableUse= ruleFuzzyVariableUse EOF
            {
             newCompositeNode(grammarAccess.getFuzzyVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuzzyVariableUse=ruleFuzzyVariableUse();

            state._fsp--;

             current =iv_ruleFuzzyVariableUse; 
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
    // $ANTLR end "entryRuleFuzzyVariableUse"


    // $ANTLR start "ruleFuzzyVariableUse"
    // InternalAlpha.g:1993:1: ruleFuzzyVariableUse returns [EObject current=null] : (this_NestedFuzzyFunction_0= ruleNestedFuzzyFunction | this_AffineFuzzyVariableUse_1= ruleAffineFuzzyVariableUse ) ;
    public final EObject ruleFuzzyVariableUse() throws RecognitionException {
        EObject current = null;

        EObject this_NestedFuzzyFunction_0 = null;

        EObject this_AffineFuzzyVariableUse_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1999:2: ( (this_NestedFuzzyFunction_0= ruleNestedFuzzyFunction | this_AffineFuzzyVariableUse_1= ruleAffineFuzzyVariableUse ) )
            // InternalAlpha.g:2000:2: (this_NestedFuzzyFunction_0= ruleNestedFuzzyFunction | this_AffineFuzzyVariableUse_1= ruleAffineFuzzyVariableUse )
            {
            // InternalAlpha.g:2000:2: (this_NestedFuzzyFunction_0= ruleNestedFuzzyFunction | this_AffineFuzzyVariableUse_1= ruleAffineFuzzyVariableUse )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==13) ) {
                    int LA30_2 = input.LA(3);

                    if ( (LA30_2==RULE_ID) ) {
                        int LA30_3 = input.LA(4);

                        if ( (LA30_3==37) ) {
                            alt30=2;
                        }
                        else if ( (LA30_3==19) ) {
                            alt30=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 30, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalAlpha.g:2001:3: this_NestedFuzzyFunction_0= ruleNestedFuzzyFunction
                    {

                    			newCompositeNode(grammarAccess.getFuzzyVariableUseAccess().getNestedFuzzyFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NestedFuzzyFunction_0=ruleNestedFuzzyFunction();

                    state._fsp--;


                    			current = this_NestedFuzzyFunction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:2010:3: this_AffineFuzzyVariableUse_1= ruleAffineFuzzyVariableUse
                    {

                    			newCompositeNode(grammarAccess.getFuzzyVariableUseAccess().getAffineFuzzyVariableUseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AffineFuzzyVariableUse_1=ruleAffineFuzzyVariableUse();

                    state._fsp--;


                    			current = this_AffineFuzzyVariableUse_1;
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
    // $ANTLR end "ruleFuzzyVariableUse"


    // $ANTLR start "entryRuleNestedFuzzyFunction"
    // InternalAlpha.g:2022:1: entryRuleNestedFuzzyFunction returns [EObject current=null] : iv_ruleNestedFuzzyFunction= ruleNestedFuzzyFunction EOF ;
    public final EObject entryRuleNestedFuzzyFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedFuzzyFunction = null;


        try {
            // InternalAlpha.g:2022:60: (iv_ruleNestedFuzzyFunction= ruleNestedFuzzyFunction EOF )
            // InternalAlpha.g:2023:2: iv_ruleNestedFuzzyFunction= ruleNestedFuzzyFunction EOF
            {
             newCompositeNode(grammarAccess.getNestedFuzzyFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNestedFuzzyFunction=ruleNestedFuzzyFunction();

            state._fsp--;

             current =iv_ruleNestedFuzzyFunction; 
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
    // $ANTLR end "entryRuleNestedFuzzyFunction"


    // $ANTLR start "ruleNestedFuzzyFunction"
    // InternalAlpha.g:2029:1: ruleNestedFuzzyFunction returns [EObject current=null] : ( ( (lv_fuzzyIndex_0_0= ruleIndexName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_alphaString_4_0= ruleAISLWrappedBasicRelation ) ) (otherlv_5= ';' ( (lv_indirections_6_0= ruleFuzzyVariableUse ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleNestedFuzzyFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_fuzzyIndex_0_0 = null;

        AntlrDatatypeRuleToken lv_alphaString_4_0 = null;

        EObject lv_indirections_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2035:2: ( ( ( (lv_fuzzyIndex_0_0= ruleIndexName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_alphaString_4_0= ruleAISLWrappedBasicRelation ) ) (otherlv_5= ';' ( (lv_indirections_6_0= ruleFuzzyVariableUse ) ) )* otherlv_7= '}' ) )
            // InternalAlpha.g:2036:2: ( ( (lv_fuzzyIndex_0_0= ruleIndexName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_alphaString_4_0= ruleAISLWrappedBasicRelation ) ) (otherlv_5= ';' ( (lv_indirections_6_0= ruleFuzzyVariableUse ) ) )* otherlv_7= '}' )
            {
            // InternalAlpha.g:2036:2: ( ( (lv_fuzzyIndex_0_0= ruleIndexName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_alphaString_4_0= ruleAISLWrappedBasicRelation ) ) (otherlv_5= ';' ( (lv_indirections_6_0= ruleFuzzyVariableUse ) ) )* otherlv_7= '}' )
            // InternalAlpha.g:2037:3: ( (lv_fuzzyIndex_0_0= ruleIndexName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_alphaString_4_0= ruleAISLWrappedBasicRelation ) ) (otherlv_5= ';' ( (lv_indirections_6_0= ruleFuzzyVariableUse ) ) )* otherlv_7= '}'
            {
            // InternalAlpha.g:2037:3: ( (lv_fuzzyIndex_0_0= ruleIndexName ) )
            // InternalAlpha.g:2038:4: (lv_fuzzyIndex_0_0= ruleIndexName )
            {
            // InternalAlpha.g:2038:4: (lv_fuzzyIndex_0_0= ruleIndexName )
            // InternalAlpha.g:2039:5: lv_fuzzyIndex_0_0= ruleIndexName
            {

            					newCompositeNode(grammarAccess.getNestedFuzzyFunctionAccess().getFuzzyIndexIndexNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_fuzzyIndex_0_0=ruleIndexName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNestedFuzzyFunctionRule());
            					}
            					set(
            						current,
            						"fuzzyIndex",
            						lv_fuzzyIndex_0_0,
            						"alpha.model.Alpha.IndexName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getNestedFuzzyFunctionAccess().getEqualsSignKeyword_1());
            		
            // InternalAlpha.g:2060:3: ( (otherlv_2= RULE_ID ) )
            // InternalAlpha.g:2061:4: (otherlv_2= RULE_ID )
            {
            // InternalAlpha.g:2061:4: (otherlv_2= RULE_ID )
            // InternalAlpha.g:2062:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNestedFuzzyFunctionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getNestedFuzzyFunctionAccess().getFuzzyVariableFuzzyVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getNestedFuzzyFunctionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAlpha.g:2077:3: ( (lv_alphaString_4_0= ruleAISLWrappedBasicRelation ) )
            // InternalAlpha.g:2078:4: (lv_alphaString_4_0= ruleAISLWrappedBasicRelation )
            {
            // InternalAlpha.g:2078:4: (lv_alphaString_4_0= ruleAISLWrappedBasicRelation )
            // InternalAlpha.g:2079:5: lv_alphaString_4_0= ruleAISLWrappedBasicRelation
            {

            					newCompositeNode(grammarAccess.getNestedFuzzyFunctionAccess().getAlphaStringAISLWrappedBasicRelationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_35);
            lv_alphaString_4_0=ruleAISLWrappedBasicRelation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNestedFuzzyFunctionRule());
            					}
            					set(
            						current,
            						"alphaString",
            						lv_alphaString_4_0,
            						"alpha.model.Alpha.AISLWrappedBasicRelation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:2096:3: (otherlv_5= ';' ( (lv_indirections_6_0= ruleFuzzyVariableUse ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==34) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAlpha.g:2097:4: otherlv_5= ';' ( (lv_indirections_6_0= ruleFuzzyVariableUse ) )
            	    {
            	    otherlv_5=(Token)match(input,34,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getNestedFuzzyFunctionAccess().getSemicolonKeyword_5_0());
            	    			
            	    // InternalAlpha.g:2101:4: ( (lv_indirections_6_0= ruleFuzzyVariableUse ) )
            	    // InternalAlpha.g:2102:5: (lv_indirections_6_0= ruleFuzzyVariableUse )
            	    {
            	    // InternalAlpha.g:2102:5: (lv_indirections_6_0= ruleFuzzyVariableUse )
            	    // InternalAlpha.g:2103:6: lv_indirections_6_0= ruleFuzzyVariableUse
            	    {

            	    						newCompositeNode(grammarAccess.getNestedFuzzyFunctionAccess().getIndirectionsFuzzyVariableUseParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_indirections_6_0=ruleFuzzyVariableUse();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNestedFuzzyFunctionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"indirections",
            	    							lv_indirections_6_0,
            	    							"alpha.model.Alpha.FuzzyVariableUse");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getNestedFuzzyFunctionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleNestedFuzzyFunction"


    // $ANTLR start "entryRuleAffineFuzzyVariableUse"
    // InternalAlpha.g:2129:1: entryRuleAffineFuzzyVariableUse returns [EObject current=null] : iv_ruleAffineFuzzyVariableUse= ruleAffineFuzzyVariableUse EOF ;
    public final EObject entryRuleAffineFuzzyVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffineFuzzyVariableUse = null;


        try {
            // InternalAlpha.g:2129:63: (iv_ruleAffineFuzzyVariableUse= ruleAffineFuzzyVariableUse EOF )
            // InternalAlpha.g:2130:2: iv_ruleAffineFuzzyVariableUse= ruleAffineFuzzyVariableUse EOF
            {
             newCompositeNode(grammarAccess.getAffineFuzzyVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAffineFuzzyVariableUse=ruleAffineFuzzyVariableUse();

            state._fsp--;

             current =iv_ruleAffineFuzzyVariableUse; 
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
    // $ANTLR end "entryRuleAffineFuzzyVariableUse"


    // $ANTLR start "ruleAffineFuzzyVariableUse"
    // InternalAlpha.g:2136:1: ruleAffineFuzzyVariableUse returns [EObject current=null] : ( ( (lv_fuzzyIndex_0_0= ruleIndexName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_useFunction_3_0= ruleJNIFunctionInArrayNotation ) ) ) ;
    public final EObject ruleAffineFuzzyVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_fuzzyIndex_0_0 = null;

        EObject lv_useFunction_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2142:2: ( ( ( (lv_fuzzyIndex_0_0= ruleIndexName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_useFunction_3_0= ruleJNIFunctionInArrayNotation ) ) ) )
            // InternalAlpha.g:2143:2: ( ( (lv_fuzzyIndex_0_0= ruleIndexName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_useFunction_3_0= ruleJNIFunctionInArrayNotation ) ) )
            {
            // InternalAlpha.g:2143:2: ( ( (lv_fuzzyIndex_0_0= ruleIndexName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_useFunction_3_0= ruleJNIFunctionInArrayNotation ) ) )
            // InternalAlpha.g:2144:3: ( (lv_fuzzyIndex_0_0= ruleIndexName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_useFunction_3_0= ruleJNIFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:2144:3: ( (lv_fuzzyIndex_0_0= ruleIndexName ) )
            // InternalAlpha.g:2145:4: (lv_fuzzyIndex_0_0= ruleIndexName )
            {
            // InternalAlpha.g:2145:4: (lv_fuzzyIndex_0_0= ruleIndexName )
            // InternalAlpha.g:2146:5: lv_fuzzyIndex_0_0= ruleIndexName
            {

            					newCompositeNode(grammarAccess.getAffineFuzzyVariableUseAccess().getFuzzyIndexIndexNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_fuzzyIndex_0_0=ruleIndexName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAffineFuzzyVariableUseRule());
            					}
            					set(
            						current,
            						"fuzzyIndex",
            						lv_fuzzyIndex_0_0,
            						"alpha.model.Alpha.IndexName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAffineFuzzyVariableUseAccess().getEqualsSignKeyword_1());
            		
            // InternalAlpha.g:2167:3: ( (otherlv_2= RULE_ID ) )
            // InternalAlpha.g:2168:4: (otherlv_2= RULE_ID )
            {
            // InternalAlpha.g:2168:4: (otherlv_2= RULE_ID )
            // InternalAlpha.g:2169:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAffineFuzzyVariableUseRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_2, grammarAccess.getAffineFuzzyVariableUseAccess().getFuzzyVariableFuzzyVariableCrossReference_2_0());
            				

            }


            }

            // InternalAlpha.g:2180:3: ( (lv_useFunction_3_0= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:2181:4: (lv_useFunction_3_0= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:2181:4: (lv_useFunction_3_0= ruleJNIFunctionInArrayNotation )
            // InternalAlpha.g:2182:5: lv_useFunction_3_0= ruleJNIFunctionInArrayNotation
            {

            					newCompositeNode(grammarAccess.getAffineFuzzyVariableUseAccess().getUseFunctionJNIFunctionInArrayNotationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_useFunction_3_0=ruleJNIFunctionInArrayNotation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAffineFuzzyVariableUseRule());
            					}
            					set(
            						current,
            						"useFunction",
            						lv_useFunction_3_0,
            						"alpha.model.Alpha.JNIFunctionInArrayNotation");
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
    // $ANTLR end "ruleAffineFuzzyVariableUse"


    // $ANTLR start "entryRuleFuzzyFunctionInArrayNotation"
    // InternalAlpha.g:2203:1: entryRuleFuzzyFunctionInArrayNotation returns [EObject current=null] : iv_ruleFuzzyFunctionInArrayNotation= ruleFuzzyFunctionInArrayNotation EOF ;
    public final EObject entryRuleFuzzyFunctionInArrayNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyFunctionInArrayNotation = null;


        try {
            // InternalAlpha.g:2203:69: (iv_ruleFuzzyFunctionInArrayNotation= ruleFuzzyFunctionInArrayNotation EOF )
            // InternalAlpha.g:2204:2: iv_ruleFuzzyFunctionInArrayNotation= ruleFuzzyFunctionInArrayNotation EOF
            {
             newCompositeNode(grammarAccess.getFuzzyFunctionInArrayNotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuzzyFunctionInArrayNotation=ruleFuzzyFunctionInArrayNotation();

            state._fsp--;

             current =iv_ruleFuzzyFunctionInArrayNotation; 
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
    // $ANTLR end "entryRuleFuzzyFunctionInArrayNotation"


    // $ANTLR start "ruleFuzzyFunctionInArrayNotation"
    // InternalAlpha.g:2210:1: ruleFuzzyFunctionInArrayNotation returns [EObject current=null] : (otherlv_0= '[[' () ( ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )* )? otherlv_5= ']]' ) ;
    public final EObject ruleFuzzyFunctionInArrayNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arrayNotation_2_0 = null;

        AntlrDatatypeRuleToken lv_arrayNotation_4_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2216:2: ( (otherlv_0= '[[' () ( ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )* )? otherlv_5= ']]' ) )
            // InternalAlpha.g:2217:2: (otherlv_0= '[[' () ( ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )* )? otherlv_5= ']]' )
            {
            // InternalAlpha.g:2217:2: (otherlv_0= '[[' () ( ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )* )? otherlv_5= ']]' )
            // InternalAlpha.g:2218:3: otherlv_0= '[[' () ( ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )* )? otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getFuzzyFunctionInArrayNotationAccess().getLeftSquareBracketLeftSquareBracketKeyword_0());
            		
            // InternalAlpha.g:2222:3: ()
            // InternalAlpha.g:2223:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFuzzyFunctionInArrayNotationAccess().getFuzzyFunctionInArrayNotationAction_1(),
            					current);
            			

            }

            // InternalAlpha.g:2229:3: ( ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_WS)||LA33_0==13||(LA33_0>=37 && LA33_0<=38)||(LA33_0>=43 && LA33_0<=47)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAlpha.g:2230:4: ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )*
                    {
                    // InternalAlpha.g:2230:4: ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) )
                    // InternalAlpha.g:2231:5: (lv_arrayNotation_2_0= ruleAISLFuzzyExpression )
                    {
                    // InternalAlpha.g:2231:5: (lv_arrayNotation_2_0= ruleAISLFuzzyExpression )
                    // InternalAlpha.g:2232:6: lv_arrayNotation_2_0= ruleAISLFuzzyExpression
                    {

                    						newCompositeNode(grammarAccess.getFuzzyFunctionInArrayNotationAccess().getArrayNotationAISLFuzzyExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_arrayNotation_2_0=ruleAISLFuzzyExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuzzyFunctionInArrayNotationRule());
                    						}
                    						add(
                    							current,
                    							"arrayNotation",
                    							lv_arrayNotation_2_0,
                    							"alpha.model.Alpha.AISLFuzzyExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlpha.g:2249:4: (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==24) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalAlpha.g:2250:5: otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_39); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFuzzyFunctionInArrayNotationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlpha.g:2254:5: ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) )
                    	    // InternalAlpha.g:2255:6: (lv_arrayNotation_4_0= ruleAISLFuzzyExpression )
                    	    {
                    	    // InternalAlpha.g:2255:6: (lv_arrayNotation_4_0= ruleAISLFuzzyExpression )
                    	    // InternalAlpha.g:2256:7: lv_arrayNotation_4_0= ruleAISLFuzzyExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getFuzzyFunctionInArrayNotationAccess().getArrayNotationAISLFuzzyExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    lv_arrayNotation_4_0=ruleAISLFuzzyExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFuzzyFunctionInArrayNotationRule());
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
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFuzzyFunctionInArrayNotationAccess().getRightSquareBracketRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleFuzzyFunctionInArrayNotation"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAlpha.g:2283:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlpha.g:2283:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlpha.g:2284:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlpha.g:2290:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAlpha.g:2296:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAlpha.g:2297:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAlpha.g:2297:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAlpha.g:2298:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_40); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalAlpha.g:2305:3: (kw= '.' this_ID_2= RULE_ID )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==29) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAlpha.g:2306:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,29,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_40); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalAlpha.g:2323:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAlpha.g:2323:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAlpha.g:2324:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalAlpha.g:2330:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2336:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalAlpha.g:2337:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalAlpha.g:2337:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalAlpha.g:2338:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:2348:3: (kw= '.*' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==41) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAlpha.g:2349:4: kw= '.*'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

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
    // InternalAlpha.g:2359:1: entryRuleSystemName returns [String current=null] : iv_ruleSystemName= ruleSystemName EOF ;
    public final String entryRuleSystemName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSystemName = null;


        try {
            // InternalAlpha.g:2359:50: (iv_ruleSystemName= ruleSystemName EOF )
            // InternalAlpha.g:2360:2: iv_ruleSystemName= ruleSystemName EOF
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
    // InternalAlpha.g:2366:1: ruleSystemName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleSystemName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:2372:2: (this_ID_0= RULE_ID )
            // InternalAlpha.g:2373:2: this_ID_0= RULE_ID
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
    // InternalAlpha.g:2383:1: entryRuleIndexName returns [String current=null] : iv_ruleIndexName= ruleIndexName EOF ;
    public final String entryRuleIndexName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIndexName = null;


        try {
            // InternalAlpha.g:2383:49: (iv_ruleIndexName= ruleIndexName EOF )
            // InternalAlpha.g:2384:2: iv_ruleIndexName= ruleIndexName EOF
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
    // InternalAlpha.g:2390:1: ruleIndexName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleIndexName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:2396:2: (this_ID_0= RULE_ID )
            // InternalAlpha.g:2397:2: this_ID_0= RULE_ID
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
    // InternalAlpha.g:2407:1: entryRuleAIndexList returns [String current=null] : iv_ruleAIndexList= ruleAIndexList EOF ;
    public final String entryRuleAIndexList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAIndexList = null;


        try {
            // InternalAlpha.g:2407:50: (iv_ruleAIndexList= ruleAIndexList EOF )
            // InternalAlpha.g:2408:2: iv_ruleAIndexList= ruleAIndexList EOF
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
    // InternalAlpha.g:2414:1: ruleAIndexList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IndexName_0= ruleIndexName (kw= ',' this_IndexName_2= ruleIndexName )* )? ;
    public final AntlrDatatypeRuleToken ruleAIndexList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IndexName_0 = null;

        AntlrDatatypeRuleToken this_IndexName_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2420:2: ( (this_IndexName_0= ruleIndexName (kw= ',' this_IndexName_2= ruleIndexName )* )? )
            // InternalAlpha.g:2421:2: (this_IndexName_0= ruleIndexName (kw= ',' this_IndexName_2= ruleIndexName )* )?
            {
            // InternalAlpha.g:2421:2: (this_IndexName_0= ruleIndexName (kw= ',' this_IndexName_2= ruleIndexName )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAlpha.g:2422:3: this_IndexName_0= ruleIndexName (kw= ',' this_IndexName_2= ruleIndexName )*
                    {

                    			newCompositeNode(grammarAccess.getAIndexListAccess().getIndexNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_42);
                    this_IndexName_0=ruleIndexName();

                    state._fsp--;


                    			current.merge(this_IndexName_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		
                    // InternalAlpha.g:2432:3: (kw= ',' this_IndexName_2= ruleIndexName )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==24) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalAlpha.g:2433:4: kw= ',' this_IndexName_2= ruleIndexName
                    	    {
                    	    kw=(Token)match(input,24,FOLLOW_5); 

                    	    				current.merge(kw);
                    	    				newLeafNode(kw, grammarAccess.getAIndexListAccess().getCommaKeyword_1_0());
                    	    			

                    	    				newCompositeNode(grammarAccess.getAIndexListAccess().getIndexNameParserRuleCall_1_1());
                    	    			
                    	    pushFollow(FOLLOW_42);
                    	    this_IndexName_2=ruleIndexName();

                    	    state._fsp--;


                    	    				current.merge(this_IndexName_2);
                    	    			

                    	    				afterParserOrEnumRuleCall();
                    	    			

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
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
    // InternalAlpha.g:2453:1: entryRuleAParamDomain returns [String current=null] : iv_ruleAParamDomain= ruleAParamDomain EOF ;
    public final String entryRuleAParamDomain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAParamDomain = null;


        try {
            // InternalAlpha.g:2453:52: (iv_ruleAParamDomain= ruleAParamDomain EOF )
            // InternalAlpha.g:2454:2: iv_ruleAParamDomain= ruleAParamDomain EOF
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
    // InternalAlpha.g:2460:1: ruleAParamDomain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_AISLString_6= ruleAISLString kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleAParamDomain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AIndexList_1 = null;

        AntlrDatatypeRuleToken this_AISLString_6 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2466:2: ( (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_AISLString_6= ruleAISLString kw= '}' ) )
            // InternalAlpha.g:2467:2: (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_AISLString_6= ruleAISLString kw= '}' )
            {
            // InternalAlpha.g:2467:2: (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_AISLString_6= ruleAISLString kw= '}' )
            // InternalAlpha.g:2468:3: kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_AISLString_6= ruleAISLString kw= '}'
            {
            kw=(Token)match(input,37,FOLLOW_43); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAParamDomainAccess().getAIndexListParserRuleCall_1());
            		
            pushFollow(FOLLOW_44);
            this_AIndexList_1=ruleAIndexList();

            state._fsp--;


            			current.merge(this_AIndexList_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,38,FOLLOW_28); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getRightSquareBracketKeyword_2());
            		
            kw=(Token)match(input,36,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            kw=(Token)match(input,19,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getLeftCurlyBracketKeyword_4());
            		
            kw=(Token)match(input,33,FOLLOW_29); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getColonKeyword_5());
            		

            			newCompositeNode(grammarAccess.getAParamDomainAccess().getAISLStringParserRuleCall_6());
            		
            pushFollow(FOLLOW_30);
            this_AISLString_6=ruleAISLString();

            state._fsp--;


            			current.merge(this_AISLString_6);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,20,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAParamDomainInArrayNotation"
    // InternalAlpha.g:2522:1: entryRuleAParamDomainInArrayNotation returns [String current=null] : iv_ruleAParamDomainInArrayNotation= ruleAParamDomainInArrayNotation EOF ;
    public final String entryRuleAParamDomainInArrayNotation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAParamDomainInArrayNotation = null;


        try {
            // InternalAlpha.g:2522:67: (iv_ruleAParamDomainInArrayNotation= ruleAParamDomainInArrayNotation EOF )
            // InternalAlpha.g:2523:2: iv_ruleAParamDomainInArrayNotation= ruleAParamDomainInArrayNotation EOF
            {
             newCompositeNode(grammarAccess.getAParamDomainInArrayNotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAParamDomainInArrayNotation=ruleAParamDomainInArrayNotation();

            state._fsp--;

             current =iv_ruleAParamDomainInArrayNotation.getText(); 
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
    // $ANTLR end "entryRuleAParamDomainInArrayNotation"


    // $ANTLR start "ruleAParamDomainInArrayNotation"
    // InternalAlpha.g:2529:1: ruleAParamDomainInArrayNotation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' kw= ':' this_AISLString_2= ruleAISLString kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleAParamDomainInArrayNotation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLString_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2535:2: ( (kw= '{' kw= ':' this_AISLString_2= ruleAISLString kw= '}' ) )
            // InternalAlpha.g:2536:2: (kw= '{' kw= ':' this_AISLString_2= ruleAISLString kw= '}' )
            {
            // InternalAlpha.g:2536:2: (kw= '{' kw= ':' this_AISLString_2= ruleAISLString kw= '}' )
            // InternalAlpha.g:2537:3: kw= '{' kw= ':' this_AISLString_2= ruleAISLString kw= '}'
            {
            kw=(Token)match(input,19,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainInArrayNotationAccess().getLeftCurlyBracketKeyword_0());
            		
            kw=(Token)match(input,33,FOLLOW_29); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainInArrayNotationAccess().getColonKeyword_1());
            		

            			newCompositeNode(grammarAccess.getAParamDomainInArrayNotationAccess().getAISLStringParserRuleCall_2());
            		
            pushFollow(FOLLOW_30);
            this_AISLString_2=ruleAISLString();

            state._fsp--;


            			current.merge(this_AISLString_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,20,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainInArrayNotationAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleAParamDomainInArrayNotation"


    // $ANTLR start "entryRuleAISLSet"
    // InternalAlpha.g:2566:1: entryRuleAISLSet returns [String current=null] : iv_ruleAISLSet= ruleAISLSet EOF ;
    public final String entryRuleAISLSet() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLSet = null;


        try {
            // InternalAlpha.g:2566:47: (iv_ruleAISLSet= ruleAISLSet EOF )
            // InternalAlpha.g:2567:2: iv_ruleAISLSet= ruleAISLSet EOF
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
    // InternalAlpha.g:2573:1: ruleAISLSet returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}' ) | kw= '{}' ) ;
    public final AntlrDatatypeRuleToken ruleAISLSet() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLBasicSet_1 = null;

        AntlrDatatypeRuleToken this_AISLBasicSet_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2579:2: ( ( (kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}' ) | kw= '{}' ) )
            // InternalAlpha.g:2580:2: ( (kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}' ) | kw= '{}' )
            {
            // InternalAlpha.g:2580:2: ( (kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}' ) | kw= '{}' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==19) ) {
                alt39=1;
            }
            else if ( (LA39_0==42) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalAlpha.g:2581:3: (kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}' )
                    {
                    // InternalAlpha.g:2581:3: (kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}' )
                    // InternalAlpha.g:2582:4: kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}'
                    {
                    kw=(Token)match(input,19,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAISLSetAccess().getLeftCurlyBracketKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getAISLSetAccess().getAISLBasicSetParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_35);
                    this_AISLBasicSet_1=ruleAISLBasicSet();

                    state._fsp--;


                    				current.merge(this_AISLBasicSet_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalAlpha.g:2597:4: (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==34) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalAlpha.g:2598:5: kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet
                    	    {
                    	    kw=(Token)match(input,34,FOLLOW_12); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getAISLSetAccess().getSemicolonKeyword_0_2_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getAISLSetAccess().getAISLBasicSetParserRuleCall_0_2_1());
                    	    				
                    	    pushFollow(FOLLOW_35);
                    	    this_AISLBasicSet_3=ruleAISLBasicSet();

                    	    state._fsp--;


                    	    					current.merge(this_AISLBasicSet_3);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    kw=(Token)match(input,20,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAISLSetAccess().getRightCurlyBracketKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlpha.g:2621:3: kw= '{}'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAISLSetAccess().getLeftCurlyBracketRightCurlyBracketKeyword_1());
                    		

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
    // $ANTLR end "ruleAISLSet"


    // $ANTLR start "entryRuleAISLBasicSet"
    // InternalAlpha.g:2630:1: entryRuleAISLBasicSet returns [String current=null] : iv_ruleAISLBasicSet= ruleAISLBasicSet EOF ;
    public final String entryRuleAISLBasicSet() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLBasicSet = null;


        try {
            // InternalAlpha.g:2630:52: (iv_ruleAISLBasicSet= ruleAISLBasicSet EOF )
            // InternalAlpha.g:2631:2: iv_ruleAISLBasicSet= ruleAISLBasicSet EOF
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
    // InternalAlpha.g:2637:1: ruleAISLBasicSet returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_4= ruleAISLString ) ;
    public final AntlrDatatypeRuleToken ruleAISLBasicSet() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLExpressionList_1 = null;

        AntlrDatatypeRuleToken this_AISLString_4 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2643:2: ( (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_4= ruleAISLString ) )
            // InternalAlpha.g:2644:2: (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_4= ruleAISLString )
            {
            // InternalAlpha.g:2644:2: (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_4= ruleAISLString )
            // InternalAlpha.g:2645:3: kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_4= ruleAISLString
            {
            kw=(Token)match(input,37,FOLLOW_31); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicSetAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAISLBasicSetAccess().getAISLExpressionListParserRuleCall_1());
            		
            pushFollow(FOLLOW_44);
            this_AISLExpressionList_1=ruleAISLExpressionList();

            state._fsp--;


            			current.merge(this_AISLExpressionList_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,38,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicSetAccess().getRightSquareBracketKeyword_2());
            		
            kw=(Token)match(input,33,FOLLOW_45); 

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
    // InternalAlpha.g:2684:1: entryRuleAISLRelation returns [String current=null] : iv_ruleAISLRelation= ruleAISLRelation EOF ;
    public final String entryRuleAISLRelation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLRelation = null;


        try {
            // InternalAlpha.g:2684:52: (iv_ruleAISLRelation= ruleAISLRelation EOF )
            // InternalAlpha.g:2685:2: iv_ruleAISLRelation= ruleAISLRelation EOF
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
    // InternalAlpha.g:2691:1: ruleAISLRelation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_AISLBasicRelation_1= ruleAISLBasicRelation (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleAISLRelation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLBasicRelation_1 = null;

        AntlrDatatypeRuleToken this_AISLBasicRelation_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2697:2: ( (kw= '{' this_AISLBasicRelation_1= ruleAISLBasicRelation (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )* kw= '}' ) )
            // InternalAlpha.g:2698:2: (kw= '{' this_AISLBasicRelation_1= ruleAISLBasicRelation (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )* kw= '}' )
            {
            // InternalAlpha.g:2698:2: (kw= '{' this_AISLBasicRelation_1= ruleAISLBasicRelation (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )* kw= '}' )
            // InternalAlpha.g:2699:3: kw= '{' this_AISLBasicRelation_1= ruleAISLBasicRelation (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )* kw= '}'
            {
            kw=(Token)match(input,19,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLRelationAccess().getLeftCurlyBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAISLRelationAccess().getAISLBasicRelationParserRuleCall_1());
            		
            pushFollow(FOLLOW_35);
            this_AISLBasicRelation_1=ruleAISLBasicRelation();

            state._fsp--;


            			current.merge(this_AISLBasicRelation_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:2714:3: (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==34) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAlpha.g:2715:4: kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation
            	    {
            	    kw=(Token)match(input,34,FOLLOW_12); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getAISLRelationAccess().getSemicolonKeyword_2_0());
            	    			

            	    				newCompositeNode(grammarAccess.getAISLRelationAccess().getAISLBasicRelationParserRuleCall_2_1());
            	    			
            	    pushFollow(FOLLOW_35);
            	    this_AISLBasicRelation_3=ruleAISLBasicRelation();

            	    state._fsp--;


            	    				current.merge(this_AISLBasicRelation_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            kw=(Token)match(input,20,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAISLQPolynomial"
    // InternalAlpha.g:2740:1: entryRuleAISLQPolynomial returns [String current=null] : iv_ruleAISLQPolynomial= ruleAISLQPolynomial EOF ;
    public final String entryRuleAISLQPolynomial() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLQPolynomial = null;


        try {
            // InternalAlpha.g:2740:55: (iv_ruleAISLQPolynomial= ruleAISLQPolynomial EOF )
            // InternalAlpha.g:2741:2: iv_ruleAISLQPolynomial= ruleAISLQPolynomial EOF
            {
             newCompositeNode(grammarAccess.getAISLQPolynomialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAISLQPolynomial=ruleAISLQPolynomial();

            state._fsp--;

             current =iv_ruleAISLQPolynomial.getText(); 
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
    // $ANTLR end "entryRuleAISLQPolynomial"


    // $ANTLR start "ruleAISLQPolynomial"
    // InternalAlpha.g:2747:1: ruleAISLQPolynomial returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= '->' this_AISLQPolynomialBody_4= ruleAISLQPolynomialBody ) ;
    public final AntlrDatatypeRuleToken ruleAISLQPolynomial() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLExpressionList_1 = null;

        AntlrDatatypeRuleToken this_AISLQPolynomialBody_4 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2753:2: ( (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= '->' this_AISLQPolynomialBody_4= ruleAISLQPolynomialBody ) )
            // InternalAlpha.g:2754:2: (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= '->' this_AISLQPolynomialBody_4= ruleAISLQPolynomialBody )
            {
            // InternalAlpha.g:2754:2: (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= '->' this_AISLQPolynomialBody_4= ruleAISLQPolynomialBody )
            // InternalAlpha.g:2755:3: kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= '->' this_AISLQPolynomialBody_4= ruleAISLQPolynomialBody
            {
            kw=(Token)match(input,37,FOLLOW_31); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLQPolynomialAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAISLQPolynomialAccess().getAISLExpressionListParserRuleCall_1());
            		
            pushFollow(FOLLOW_44);
            this_AISLExpressionList_1=ruleAISLExpressionList();

            state._fsp--;


            			current.merge(this_AISLExpressionList_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,38,FOLLOW_28); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLQPolynomialAccess().getRightSquareBracketKeyword_2());
            		
            kw=(Token)match(input,36,FOLLOW_34); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLQPolynomialAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		

            			newCompositeNode(grammarAccess.getAISLQPolynomialAccess().getAISLQPolynomialBodyParserRuleCall_4());
            		
            pushFollow(FOLLOW_2);
            this_AISLQPolynomialBody_4=ruleAISLQPolynomialBody();

            state._fsp--;


            			current.merge(this_AISLQPolynomialBody_4);
            		

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
    // $ANTLR end "ruleAISLQPolynomial"


    // $ANTLR start "entryRuleAISLQPolynomialBody"
    // InternalAlpha.g:2794:1: entryRuleAISLQPolynomialBody returns [String current=null] : iv_ruleAISLQPolynomialBody= ruleAISLQPolynomialBody EOF ;
    public final String entryRuleAISLQPolynomialBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLQPolynomialBody = null;


        try {
            // InternalAlpha.g:2794:59: (iv_ruleAISLQPolynomialBody= ruleAISLQPolynomialBody EOF )
            // InternalAlpha.g:2795:2: iv_ruleAISLQPolynomialBody= ruleAISLQPolynomialBody EOF
            {
             newCompositeNode(grammarAccess.getAISLQPolynomialBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAISLQPolynomialBody=ruleAISLQPolynomialBody();

            state._fsp--;

             current =iv_ruleAISLQPolynomialBody.getText(); 
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
    // $ANTLR end "entryRuleAISLQPolynomialBody"


    // $ANTLR start "ruleAISLQPolynomialBody"
    // InternalAlpha.g:2801:1: ruleAISLQPolynomialBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AISLPolynomialExpression_0= ruleAISLPolynomialExpression (kw= ':' this_AISLString_2= ruleAISLString )? ) ;
    public final AntlrDatatypeRuleToken ruleAISLQPolynomialBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLPolynomialExpression_0 = null;

        AntlrDatatypeRuleToken this_AISLString_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2807:2: ( (this_AISLPolynomialExpression_0= ruleAISLPolynomialExpression (kw= ':' this_AISLString_2= ruleAISLString )? ) )
            // InternalAlpha.g:2808:2: (this_AISLPolynomialExpression_0= ruleAISLPolynomialExpression (kw= ':' this_AISLString_2= ruleAISLString )? )
            {
            // InternalAlpha.g:2808:2: (this_AISLPolynomialExpression_0= ruleAISLPolynomialExpression (kw= ':' this_AISLString_2= ruleAISLString )? )
            // InternalAlpha.g:2809:3: this_AISLPolynomialExpression_0= ruleAISLPolynomialExpression (kw= ':' this_AISLString_2= ruleAISLString )?
            {

            			newCompositeNode(grammarAccess.getAISLQPolynomialBodyAccess().getAISLPolynomialExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_AISLPolynomialExpression_0=ruleAISLPolynomialExpression();

            state._fsp--;


            			current.merge(this_AISLPolynomialExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:2819:3: (kw= ':' this_AISLString_2= ruleAISLString )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==33) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAlpha.g:2820:4: kw= ':' this_AISLString_2= ruleAISLString
                    {
                    kw=(Token)match(input,33,FOLLOW_45); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAISLQPolynomialBodyAccess().getColonKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getAISLQPolynomialBodyAccess().getAISLStringParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_AISLString_2=ruleAISLString();

                    state._fsp--;


                    				current.merge(this_AISLString_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleAISLQPolynomialBody"


    // $ANTLR start "entryRuleAISLPWQPolynomial"
    // InternalAlpha.g:2840:1: entryRuleAISLPWQPolynomial returns [String current=null] : iv_ruleAISLPWQPolynomial= ruleAISLPWQPolynomial EOF ;
    public final String entryRuleAISLPWQPolynomial() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLPWQPolynomial = null;


        try {
            // InternalAlpha.g:2840:57: (iv_ruleAISLPWQPolynomial= ruleAISLPWQPolynomial EOF )
            // InternalAlpha.g:2841:2: iv_ruleAISLPWQPolynomial= ruleAISLPWQPolynomial EOF
            {
             newCompositeNode(grammarAccess.getAISLPWQPolynomialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAISLPWQPolynomial=ruleAISLPWQPolynomial();

            state._fsp--;

             current =iv_ruleAISLPWQPolynomial.getText(); 
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
    // $ANTLR end "entryRuleAISLPWQPolynomial"


    // $ANTLR start "ruleAISLPWQPolynomial"
    // InternalAlpha.g:2847:1: ruleAISLPWQPolynomial returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_AISLQPolynomial_1= ruleAISLQPolynomial (kw= ';' this_AISLQPolynomial_3= ruleAISLQPolynomial )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleAISLPWQPolynomial() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLQPolynomial_1 = null;

        AntlrDatatypeRuleToken this_AISLQPolynomial_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2853:2: ( (kw= '{' this_AISLQPolynomial_1= ruleAISLQPolynomial (kw= ';' this_AISLQPolynomial_3= ruleAISLQPolynomial )* kw= '}' ) )
            // InternalAlpha.g:2854:2: (kw= '{' this_AISLQPolynomial_1= ruleAISLQPolynomial (kw= ';' this_AISLQPolynomial_3= ruleAISLQPolynomial )* kw= '}' )
            {
            // InternalAlpha.g:2854:2: (kw= '{' this_AISLQPolynomial_1= ruleAISLQPolynomial (kw= ';' this_AISLQPolynomial_3= ruleAISLQPolynomial )* kw= '}' )
            // InternalAlpha.g:2855:3: kw= '{' this_AISLQPolynomial_1= ruleAISLQPolynomial (kw= ';' this_AISLQPolynomial_3= ruleAISLQPolynomial )* kw= '}'
            {
            kw=(Token)match(input,19,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLPWQPolynomialAccess().getLeftCurlyBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAISLPWQPolynomialAccess().getAISLQPolynomialParserRuleCall_1());
            		
            pushFollow(FOLLOW_35);
            this_AISLQPolynomial_1=ruleAISLQPolynomial();

            state._fsp--;


            			current.merge(this_AISLQPolynomial_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:2870:3: (kw= ';' this_AISLQPolynomial_3= ruleAISLQPolynomial )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==34) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalAlpha.g:2871:4: kw= ';' this_AISLQPolynomial_3= ruleAISLQPolynomial
            	    {
            	    kw=(Token)match(input,34,FOLLOW_12); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getAISLPWQPolynomialAccess().getSemicolonKeyword_2_0());
            	    			

            	    				newCompositeNode(grammarAccess.getAISLPWQPolynomialAccess().getAISLQPolynomialParserRuleCall_2_1());
            	    			
            	    pushFollow(FOLLOW_35);
            	    this_AISLQPolynomial_3=ruleAISLQPolynomial();

            	    state._fsp--;


            	    				current.merge(this_AISLQPolynomial_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            kw=(Token)match(input,20,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLPWQPolynomialAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleAISLPWQPolynomial"


    // $ANTLR start "entryRuleAISLString"
    // InternalAlpha.g:2896:1: entryRuleAISLString returns [String current=null] : iv_ruleAISLString= ruleAISLString EOF ;
    public final String entryRuleAISLString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLString = null;


        try {
            // InternalAlpha.g:2896:50: (iv_ruleAISLString= ruleAISLString EOF )
            // InternalAlpha.g:2897:2: iv_ruleAISLString= ruleAISLString EOF
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
    // InternalAlpha.g:2903:1: ruleAISLString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= 'and' | kw= 'or' | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | kw= '&' | kw= '|' | this_WS_17= RULE_WS | kw= '>=' | kw= '>' | kw= '=' | kw= '<' | kw= '<=' )* ;
    public final AntlrDatatypeRuleToken ruleAISLString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token kw=null;
        Token this_WS_17=null;
        AntlrDatatypeRuleToken this_IndexName_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2909:2: ( (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= 'and' | kw= 'or' | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | kw= '&' | kw= '|' | this_WS_17= RULE_WS | kw= '>=' | kw= '>' | kw= '=' | kw= '<' | kw= '<=' )* )
            // InternalAlpha.g:2910:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= 'and' | kw= 'or' | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | kw= '&' | kw= '|' | this_WS_17= RULE_WS | kw= '>=' | kw= '>' | kw= '=' | kw= '<' | kw= '<=' )*
            {
            // InternalAlpha.g:2910:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= 'and' | kw= 'or' | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | kw= '&' | kw= '|' | this_WS_17= RULE_WS | kw= '>=' | kw= '>' | kw= '=' | kw= '<' | kw= '<=' )*
            loop43:
            do {
                int alt43=24;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt43=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt43=2;
                    }
                    break;
                case 43:
                    {
                    alt43=3;
                    }
                    break;
                case 44:
                    {
                    alt43=4;
                    }
                    break;
                case 45:
                    {
                    alt43=5;
                    }
                    break;
                case 46:
                    {
                    alt43=6;
                    }
                    break;
                case 47:
                    {
                    alt43=7;
                    }
                    break;
                case 48:
                    {
                    alt43=8;
                    }
                    break;
                case 49:
                    {
                    alt43=9;
                    }
                    break;
                case 37:
                    {
                    alt43=10;
                    }
                    break;
                case 38:
                    {
                    alt43=11;
                    }
                    break;
                case 15:
                    {
                    alt43=12;
                    }
                    break;
                case 16:
                    {
                    alt43=13;
                    }
                    break;
                case 24:
                    {
                    alt43=14;
                    }
                    break;
                case 33:
                    {
                    alt43=15;
                    }
                    break;
                case 50:
                    {
                    alt43=16;
                    }
                    break;
                case 51:
                    {
                    alt43=17;
                    }
                    break;
                case RULE_WS:
                    {
                    alt43=18;
                    }
                    break;
                case 52:
                    {
                    alt43=19;
                    }
                    break;
                case 53:
                    {
                    alt43=20;
                    }
                    break;
                case 13:
                    {
                    alt43=21;
                    }
                    break;
                case 54:
                    {
                    alt43=22;
                    }
                    break;
                case 55:
                    {
                    alt43=23;
                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // InternalAlpha.g:2911:3: this_IndexName_0= ruleIndexName
            	    {

            	    			newCompositeNode(grammarAccess.getAISLStringAccess().getIndexNameParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_47);
            	    this_IndexName_0=ruleIndexName();

            	    state._fsp--;


            	    			current.merge(this_IndexName_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalAlpha.g:2922:3: this_INT_1= RULE_INT
            	    {
            	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_47); 

            	    			current.merge(this_INT_1);
            	    		

            	    			newLeafNode(this_INT_1, grammarAccess.getAISLStringAccess().getINTTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalAlpha.g:2930:3: kw= '+'
            	    {
            	    kw=(Token)match(input,43,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getPlusSignKeyword_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalAlpha.g:2936:3: kw= '-'
            	    {
            	    kw=(Token)match(input,44,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getHyphenMinusKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalAlpha.g:2942:3: kw= '*'
            	    {
            	    kw=(Token)match(input,45,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getAsteriskKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalAlpha.g:2948:3: kw= '/'
            	    {
            	    kw=(Token)match(input,46,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getSolidusKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalAlpha.g:2954:3: kw= '%'
            	    {
            	    kw=(Token)match(input,47,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getPercentSignKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalAlpha.g:2960:3: kw= 'and'
            	    {
            	    kw=(Token)match(input,48,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getAndKeyword_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalAlpha.g:2966:3: kw= 'or'
            	    {
            	    kw=(Token)match(input,49,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getOrKeyword_8());
            	    		

            	    }
            	    break;
            	case 10 :
            	    // InternalAlpha.g:2972:3: kw= '['
            	    {
            	    kw=(Token)match(input,37,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getLeftSquareBracketKeyword_9());
            	    		

            	    }
            	    break;
            	case 11 :
            	    // InternalAlpha.g:2978:3: kw= ']'
            	    {
            	    kw=(Token)match(input,38,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getRightSquareBracketKeyword_10());
            	    		

            	    }
            	    break;
            	case 12 :
            	    // InternalAlpha.g:2984:3: kw= '('
            	    {
            	    kw=(Token)match(input,15,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getLeftParenthesisKeyword_11());
            	    		

            	    }
            	    break;
            	case 13 :
            	    // InternalAlpha.g:2990:3: kw= ')'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getRightParenthesisKeyword_12());
            	    		

            	    }
            	    break;
            	case 14 :
            	    // InternalAlpha.g:2996:3: kw= ','
            	    {
            	    kw=(Token)match(input,24,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getCommaKeyword_13());
            	    		

            	    }
            	    break;
            	case 15 :
            	    // InternalAlpha.g:3002:3: kw= ':'
            	    {
            	    kw=(Token)match(input,33,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getColonKeyword_14());
            	    		

            	    }
            	    break;
            	case 16 :
            	    // InternalAlpha.g:3008:3: kw= '&'
            	    {
            	    kw=(Token)match(input,50,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getAmpersandKeyword_15());
            	    		

            	    }
            	    break;
            	case 17 :
            	    // InternalAlpha.g:3014:3: kw= '|'
            	    {
            	    kw=(Token)match(input,51,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getVerticalLineKeyword_16());
            	    		

            	    }
            	    break;
            	case 18 :
            	    // InternalAlpha.g:3020:3: this_WS_17= RULE_WS
            	    {
            	    this_WS_17=(Token)match(input,RULE_WS,FOLLOW_47); 

            	    			current.merge(this_WS_17);
            	    		

            	    			newLeafNode(this_WS_17, grammarAccess.getAISLStringAccess().getWSTerminalRuleCall_17());
            	    		

            	    }
            	    break;
            	case 19 :
            	    // InternalAlpha.g:3028:3: kw= '>='
            	    {
            	    kw=(Token)match(input,52,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getGreaterThanSignEqualsSignKeyword_18());
            	    		

            	    }
            	    break;
            	case 20 :
            	    // InternalAlpha.g:3034:3: kw= '>'
            	    {
            	    kw=(Token)match(input,53,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getGreaterThanSignKeyword_19());
            	    		

            	    }
            	    break;
            	case 21 :
            	    // InternalAlpha.g:3040:3: kw= '='
            	    {
            	    kw=(Token)match(input,13,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getEqualsSignKeyword_20());
            	    		

            	    }
            	    break;
            	case 22 :
            	    // InternalAlpha.g:3046:3: kw= '<'
            	    {
            	    kw=(Token)match(input,54,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getLessThanSignKeyword_21());
            	    		

            	    }
            	    break;
            	case 23 :
            	    // InternalAlpha.g:3052:3: kw= '<='
            	    {
            	    kw=(Token)match(input,55,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getLessThanSignEqualsSignKeyword_22());
            	    		

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalAlpha.g:3061:1: entryRuleAISLExpression returns [String current=null] : iv_ruleAISLExpression= ruleAISLExpression EOF ;
    public final String entryRuleAISLExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLExpression = null;


        try {
            // InternalAlpha.g:3061:54: (iv_ruleAISLExpression= ruleAISLExpression EOF )
            // InternalAlpha.g:3062:2: iv_ruleAISLExpression= ruleAISLExpression EOF
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
    // InternalAlpha.g:3068:1: ruleAISLExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '(' | kw= ')' | this_WS_10= RULE_WS )+ ;
    public final AntlrDatatypeRuleToken ruleAISLExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token kw=null;
        Token this_WS_10=null;
        AntlrDatatypeRuleToken this_IndexName_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3074:2: ( (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '(' | kw= ')' | this_WS_10= RULE_WS )+ )
            // InternalAlpha.g:3075:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '(' | kw= ')' | this_WS_10= RULE_WS )+
            {
            // InternalAlpha.g:3075:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '(' | kw= ')' | this_WS_10= RULE_WS )+
            int cnt44=0;
            loop44:
            do {
                int alt44=12;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt44=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt44=2;
                    }
                    break;
                case 13:
                    {
                    alt44=3;
                    }
                    break;
                case 43:
                    {
                    alt44=4;
                    }
                    break;
                case 44:
                    {
                    alt44=5;
                    }
                    break;
                case 45:
                    {
                    alt44=6;
                    }
                    break;
                case 46:
                    {
                    alt44=7;
                    }
                    break;
                case 47:
                    {
                    alt44=8;
                    }
                    break;
                case 15:
                    {
                    alt44=9;
                    }
                    break;
                case 16:
                    {
                    alt44=10;
                    }
                    break;
                case RULE_WS:
                    {
                    alt44=11;
                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // InternalAlpha.g:3076:3: this_IndexName_0= ruleIndexName
            	    {

            	    			newCompositeNode(grammarAccess.getAISLExpressionAccess().getIndexNameParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_48);
            	    this_IndexName_0=ruleIndexName();

            	    state._fsp--;


            	    			current.merge(this_IndexName_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalAlpha.g:3087:3: this_INT_1= RULE_INT
            	    {
            	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_48); 

            	    			current.merge(this_INT_1);
            	    		

            	    			newLeafNode(this_INT_1, grammarAccess.getAISLExpressionAccess().getINTTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalAlpha.g:3095:3: kw= '='
            	    {
            	    kw=(Token)match(input,13,FOLLOW_48); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getEqualsSignKeyword_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalAlpha.g:3101:3: kw= '+'
            	    {
            	    kw=(Token)match(input,43,FOLLOW_48); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getPlusSignKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalAlpha.g:3107:3: kw= '-'
            	    {
            	    kw=(Token)match(input,44,FOLLOW_48); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getHyphenMinusKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalAlpha.g:3113:3: kw= '*'
            	    {
            	    kw=(Token)match(input,45,FOLLOW_48); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getAsteriskKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalAlpha.g:3119:3: kw= '/'
            	    {
            	    kw=(Token)match(input,46,FOLLOW_48); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getSolidusKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalAlpha.g:3125:3: kw= '%'
            	    {
            	    kw=(Token)match(input,47,FOLLOW_48); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getPercentSignKeyword_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalAlpha.g:3131:3: kw= '('
            	    {
            	    kw=(Token)match(input,15,FOLLOW_48); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getLeftParenthesisKeyword_8());
            	    		

            	    }
            	    break;
            	case 10 :
            	    // InternalAlpha.g:3137:3: kw= ')'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_48); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getRightParenthesisKeyword_9());
            	    		

            	    }
            	    break;
            	case 11 :
            	    // InternalAlpha.g:3143:3: this_WS_10= RULE_WS
            	    {
            	    this_WS_10=(Token)match(input,RULE_WS,FOLLOW_48); 

            	    			current.merge(this_WS_10);
            	    		

            	    			newLeafNode(this_WS_10, grammarAccess.getAISLExpressionAccess().getWSTerminalRuleCall_10());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
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


    // $ANTLR start "entryRuleAISLPolynomialExpression"
    // InternalAlpha.g:3154:1: entryRuleAISLPolynomialExpression returns [String current=null] : iv_ruleAISLPolynomialExpression= ruleAISLPolynomialExpression EOF ;
    public final String entryRuleAISLPolynomialExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLPolynomialExpression = null;


        try {
            // InternalAlpha.g:3154:64: (iv_ruleAISLPolynomialExpression= ruleAISLPolynomialExpression EOF )
            // InternalAlpha.g:3155:2: iv_ruleAISLPolynomialExpression= ruleAISLPolynomialExpression EOF
            {
             newCompositeNode(grammarAccess.getAISLPolynomialExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAISLPolynomialExpression=ruleAISLPolynomialExpression();

            state._fsp--;

             current =iv_ruleAISLPolynomialExpression.getText(); 
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
    // $ANTLR end "entryRuleAISLPolynomialExpression"


    // $ANTLR start "ruleAISLPolynomialExpression"
    // InternalAlpha.g:3161:1: ruleAISLPolynomialExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '(' | kw= ')' | kw= '^' )+ ;
    public final AntlrDatatypeRuleToken ruleAISLPolynomialExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_IndexName_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3167:2: ( (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '(' | kw= ')' | kw= '^' )+ )
            // InternalAlpha.g:3168:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '(' | kw= ')' | kw= '^' )+
            {
            // InternalAlpha.g:3168:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '(' | kw= ')' | kw= '^' )+
            int cnt45=0;
            loop45:
            do {
                int alt45=10;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt45=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt45=2;
                    }
                    break;
                case 43:
                    {
                    alt45=3;
                    }
                    break;
                case 44:
                    {
                    alt45=4;
                    }
                    break;
                case 45:
                    {
                    alt45=5;
                    }
                    break;
                case 46:
                    {
                    alt45=6;
                    }
                    break;
                case 15:
                    {
                    alt45=7;
                    }
                    break;
                case 16:
                    {
                    alt45=8;
                    }
                    break;
                case 56:
                    {
                    alt45=9;
                    }
                    break;

                }

                switch (alt45) {
            	case 1 :
            	    // InternalAlpha.g:3169:3: this_IndexName_0= ruleIndexName
            	    {

            	    			newCompositeNode(grammarAccess.getAISLPolynomialExpressionAccess().getIndexNameParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_49);
            	    this_IndexName_0=ruleIndexName();

            	    state._fsp--;


            	    			current.merge(this_IndexName_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalAlpha.g:3180:3: this_INT_1= RULE_INT
            	    {
            	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_49); 

            	    			current.merge(this_INT_1);
            	    		

            	    			newLeafNode(this_INT_1, grammarAccess.getAISLPolynomialExpressionAccess().getINTTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalAlpha.g:3188:3: kw= '+'
            	    {
            	    kw=(Token)match(input,43,FOLLOW_49); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLPolynomialExpressionAccess().getPlusSignKeyword_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalAlpha.g:3194:3: kw= '-'
            	    {
            	    kw=(Token)match(input,44,FOLLOW_49); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLPolynomialExpressionAccess().getHyphenMinusKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalAlpha.g:3200:3: kw= '*'
            	    {
            	    kw=(Token)match(input,45,FOLLOW_49); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLPolynomialExpressionAccess().getAsteriskKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalAlpha.g:3206:3: kw= '/'
            	    {
            	    kw=(Token)match(input,46,FOLLOW_49); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLPolynomialExpressionAccess().getSolidusKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalAlpha.g:3212:3: kw= '('
            	    {
            	    kw=(Token)match(input,15,FOLLOW_49); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLPolynomialExpressionAccess().getLeftParenthesisKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalAlpha.g:3218:3: kw= ')'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_49); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLPolynomialExpressionAccess().getRightParenthesisKeyword_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalAlpha.g:3224:3: kw= '^'
            	    {
            	    kw=(Token)match(input,56,FOLLOW_49); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLPolynomialExpressionAccess().getCircumflexAccentKeyword_8());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
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
    // $ANTLR end "ruleAISLPolynomialExpression"


    // $ANTLR start "entryRuleAISLExpressionLiteral"
    // InternalAlpha.g:3233:1: entryRuleAISLExpressionLiteral returns [String current=null] : iv_ruleAISLExpressionLiteral= ruleAISLExpressionLiteral EOF ;
    public final String entryRuleAISLExpressionLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLExpressionLiteral = null;


        try {
            // InternalAlpha.g:3233:61: (iv_ruleAISLExpressionLiteral= ruleAISLExpressionLiteral EOF )
            // InternalAlpha.g:3234:2: iv_ruleAISLExpressionLiteral= ruleAISLExpressionLiteral EOF
            {
             newCompositeNode(grammarAccess.getAISLExpressionLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAISLExpressionLiteral=ruleAISLExpressionLiteral();

            state._fsp--;

             current =iv_ruleAISLExpressionLiteral.getText(); 
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
    // $ANTLR end "entryRuleAISLExpressionLiteral"


    // $ANTLR start "ruleAISLExpressionLiteral"
    // InternalAlpha.g:3240:1: ruleAISLExpressionLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_IndexName_1= ruleIndexName | this_INT_2= RULE_INT | this_WS_3= RULE_WS )+ ) ;
    public final AntlrDatatypeRuleToken ruleAISLExpressionLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_WS_3=null;
        AntlrDatatypeRuleToken this_IndexName_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3246:2: ( ( (kw= '-' )? (this_IndexName_1= ruleIndexName | this_INT_2= RULE_INT | this_WS_3= RULE_WS )+ ) )
            // InternalAlpha.g:3247:2: ( (kw= '-' )? (this_IndexName_1= ruleIndexName | this_INT_2= RULE_INT | this_WS_3= RULE_WS )+ )
            {
            // InternalAlpha.g:3247:2: ( (kw= '-' )? (this_IndexName_1= ruleIndexName | this_INT_2= RULE_INT | this_WS_3= RULE_WS )+ )
            // InternalAlpha.g:3248:3: (kw= '-' )? (this_IndexName_1= ruleIndexName | this_INT_2= RULE_INT | this_WS_3= RULE_WS )+
            {
            // InternalAlpha.g:3248:3: (kw= '-' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==44) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAlpha.g:3249:4: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_50); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAISLExpressionLiteralAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalAlpha.g:3255:3: (this_IndexName_1= ruleIndexName | this_INT_2= RULE_INT | this_WS_3= RULE_WS )+
            int cnt47=0;
            loop47:
            do {
                int alt47=4;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt47=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt47=2;
                    }
                    break;
                case RULE_WS:
                    {
                    alt47=3;
                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // InternalAlpha.g:3256:4: this_IndexName_1= ruleIndexName
            	    {

            	    				newCompositeNode(grammarAccess.getAISLExpressionLiteralAccess().getIndexNameParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_51);
            	    this_IndexName_1=ruleIndexName();

            	    state._fsp--;


            	    				current.merge(this_IndexName_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalAlpha.g:3267:4: this_INT_2= RULE_INT
            	    {
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_51); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getAISLExpressionLiteralAccess().getINTTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalAlpha.g:3275:4: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_51); 

            	    				current.merge(this_WS_3);
            	    			

            	    				newLeafNode(this_WS_3, grammarAccess.getAISLExpressionLiteralAccess().getWSTerminalRuleCall_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
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
    // $ANTLR end "ruleAISLExpressionLiteral"


    // $ANTLR start "entryRuleAISLExpressionOperator"
    // InternalAlpha.g:3287:1: entryRuleAISLExpressionOperator returns [String current=null] : iv_ruleAISLExpressionOperator= ruleAISLExpressionOperator EOF ;
    public final String entryRuleAISLExpressionOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLExpressionOperator = null;


        try {
            // InternalAlpha.g:3287:62: (iv_ruleAISLExpressionOperator= ruleAISLExpressionOperator EOF )
            // InternalAlpha.g:3288:2: iv_ruleAISLExpressionOperator= ruleAISLExpressionOperator EOF
            {
             newCompositeNode(grammarAccess.getAISLExpressionOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAISLExpressionOperator=ruleAISLExpressionOperator();

            state._fsp--;

             current =iv_ruleAISLExpressionOperator.getText(); 
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
    // $ANTLR end "entryRuleAISLExpressionOperator"


    // $ANTLR start "ruleAISLExpressionOperator"
    // InternalAlpha.g:3294:1: ruleAISLExpressionOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleAISLExpressionOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:3300:2: ( (kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' ) )
            // InternalAlpha.g:3301:2: (kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' )
            {
            // InternalAlpha.g:3301:2: (kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' )
            int alt48=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt48=1;
                }
                break;
            case 43:
                {
                alt48=2;
                }
                break;
            case 44:
                {
                alt48=3;
                }
                break;
            case 45:
                {
                alt48=4;
                }
                break;
            case 46:
                {
                alt48=5;
                }
                break;
            case 47:
                {
                alt48=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalAlpha.g:3302:3: kw= '='
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAISLExpressionOperatorAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3308:3: kw= '+'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAISLExpressionOperatorAccess().getPlusSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:3314:3: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAISLExpressionOperatorAccess().getHyphenMinusKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:3320:3: kw= '*'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAISLExpressionOperatorAccess().getAsteriskKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:3326:3: kw= '/'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAISLExpressionOperatorAccess().getSolidusKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:3332:3: kw= '%'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAISLExpressionOperatorAccess().getPercentSignKeyword_5());
                    		

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
    // $ANTLR end "ruleAISLExpressionOperator"


    // $ANTLR start "entryRuleAISLExpressionList"
    // InternalAlpha.g:3341:1: entryRuleAISLExpressionList returns [String current=null] : iv_ruleAISLExpressionList= ruleAISLExpressionList EOF ;
    public final String entryRuleAISLExpressionList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLExpressionList = null;


        try {
            // InternalAlpha.g:3341:58: (iv_ruleAISLExpressionList= ruleAISLExpressionList EOF )
            // InternalAlpha.g:3342:2: iv_ruleAISLExpressionList= ruleAISLExpressionList EOF
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
    // InternalAlpha.g:3348:1: ruleAISLExpressionList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AISLExpression_0= ruleAISLExpression (kw= ',' this_AISLExpression_2= ruleAISLExpression )* )? ;
    public final AntlrDatatypeRuleToken ruleAISLExpressionList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLExpression_0 = null;

        AntlrDatatypeRuleToken this_AISLExpression_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3354:2: ( (this_AISLExpression_0= ruleAISLExpression (kw= ',' this_AISLExpression_2= ruleAISLExpression )* )? )
            // InternalAlpha.g:3355:2: (this_AISLExpression_0= ruleAISLExpression (kw= ',' this_AISLExpression_2= ruleAISLExpression )* )?
            {
            // InternalAlpha.g:3355:2: (this_AISLExpression_0= ruleAISLExpression (kw= ',' this_AISLExpression_2= ruleAISLExpression )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_WS)||LA50_0==13||(LA50_0>=15 && LA50_0<=16)||(LA50_0>=43 && LA50_0<=47)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAlpha.g:3356:3: this_AISLExpression_0= ruleAISLExpression (kw= ',' this_AISLExpression_2= ruleAISLExpression )*
                    {

                    			newCompositeNode(grammarAccess.getAISLExpressionListAccess().getAISLExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_42);
                    this_AISLExpression_0=ruleAISLExpression();

                    state._fsp--;


                    			current.merge(this_AISLExpression_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		
                    // InternalAlpha.g:3366:3: (kw= ',' this_AISLExpression_2= ruleAISLExpression )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==24) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalAlpha.g:3367:4: kw= ',' this_AISLExpression_2= ruleAISLExpression
                    	    {
                    	    kw=(Token)match(input,24,FOLLOW_33); 

                    	    				current.merge(kw);
                    	    				newLeafNode(kw, grammarAccess.getAISLExpressionListAccess().getCommaKeyword_1_0());
                    	    			

                    	    				newCompositeNode(grammarAccess.getAISLExpressionListAccess().getAISLExpressionParserRuleCall_1_1());
                    	    			
                    	    pushFollow(FOLLOW_42);
                    	    this_AISLExpression_2=ruleAISLExpression();

                    	    state._fsp--;


                    	    				current.merge(this_AISLExpression_2);
                    	    			

                    	    				afterParserOrEnumRuleCall();
                    	    			

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
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


    // $ANTLR start "entryRuleAlphaFunctionTerminalExpression"
    // InternalAlpha.g:3387:1: entryRuleAlphaFunctionTerminalExpression returns [EObject current=null] : iv_ruleAlphaFunctionTerminalExpression= ruleAlphaFunctionTerminalExpression EOF ;
    public final EObject entryRuleAlphaFunctionTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaFunctionTerminalExpression = null;


        try {
            // InternalAlpha.g:3387:72: (iv_ruleAlphaFunctionTerminalExpression= ruleAlphaFunctionTerminalExpression EOF )
            // InternalAlpha.g:3388:2: iv_ruleAlphaFunctionTerminalExpression= ruleAlphaFunctionTerminalExpression EOF
            {
             newCompositeNode(grammarAccess.getAlphaFunctionTerminalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlphaFunctionTerminalExpression=ruleAlphaFunctionTerminalExpression();

            state._fsp--;

             current =iv_ruleAlphaFunctionTerminalExpression; 
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
    // $ANTLR end "entryRuleAlphaFunctionTerminalExpression"


    // $ANTLR start "ruleAlphaFunctionTerminalExpression"
    // InternalAlpha.g:3394:1: ruleAlphaFunctionTerminalExpression returns [EObject current=null] : (this_AlphaFunctionLiteral_0= ruleAlphaFunctionLiteral | (otherlv_1= '(' this_AlphaFunctionBinaryExpression_2= ruleAlphaFunctionBinaryExpression otherlv_3= ')' ) ) ;
    public final EObject ruleAlphaFunctionTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_AlphaFunctionLiteral_0 = null;

        EObject this_AlphaFunctionBinaryExpression_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3400:2: ( (this_AlphaFunctionLiteral_0= ruleAlphaFunctionLiteral | (otherlv_1= '(' this_AlphaFunctionBinaryExpression_2= ruleAlphaFunctionBinaryExpression otherlv_3= ')' ) ) )
            // InternalAlpha.g:3401:2: (this_AlphaFunctionLiteral_0= ruleAlphaFunctionLiteral | (otherlv_1= '(' this_AlphaFunctionBinaryExpression_2= ruleAlphaFunctionBinaryExpression otherlv_3= ')' ) )
            {
            // InternalAlpha.g:3401:2: (this_AlphaFunctionLiteral_0= ruleAlphaFunctionLiteral | (otherlv_1= '(' this_AlphaFunctionBinaryExpression_2= ruleAlphaFunctionBinaryExpression otherlv_3= ')' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_WS)||LA51_0==44) ) {
                alt51=1;
            }
            else if ( (LA51_0==15) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalAlpha.g:3402:3: this_AlphaFunctionLiteral_0= ruleAlphaFunctionLiteral
                    {

                    			newCompositeNode(grammarAccess.getAlphaFunctionTerminalExpressionAccess().getAlphaFunctionLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AlphaFunctionLiteral_0=ruleAlphaFunctionLiteral();

                    state._fsp--;


                    			current = this_AlphaFunctionLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3411:3: (otherlv_1= '(' this_AlphaFunctionBinaryExpression_2= ruleAlphaFunctionBinaryExpression otherlv_3= ')' )
                    {
                    // InternalAlpha.g:3411:3: (otherlv_1= '(' this_AlphaFunctionBinaryExpression_2= ruleAlphaFunctionBinaryExpression otherlv_3= ')' )
                    // InternalAlpha.g:3412:4: otherlv_1= '(' this_AlphaFunctionBinaryExpression_2= ruleAlphaFunctionBinaryExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_52); 

                    				newLeafNode(otherlv_1, grammarAccess.getAlphaFunctionTerminalExpressionAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getAlphaFunctionTerminalExpressionAccess().getAlphaFunctionBinaryExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_AlphaFunctionBinaryExpression_2=ruleAlphaFunctionBinaryExpression();

                    state._fsp--;


                    				current = this_AlphaFunctionBinaryExpression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAlphaFunctionTerminalExpressionAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // $ANTLR end "ruleAlphaFunctionTerminalExpression"


    // $ANTLR start "entryRuleAlphaFunctionBinaryExpression"
    // InternalAlpha.g:3433:1: entryRuleAlphaFunctionBinaryExpression returns [EObject current=null] : iv_ruleAlphaFunctionBinaryExpression= ruleAlphaFunctionBinaryExpression EOF ;
    public final EObject entryRuleAlphaFunctionBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaFunctionBinaryExpression = null;


        try {
            // InternalAlpha.g:3433:70: (iv_ruleAlphaFunctionBinaryExpression= ruleAlphaFunctionBinaryExpression EOF )
            // InternalAlpha.g:3434:2: iv_ruleAlphaFunctionBinaryExpression= ruleAlphaFunctionBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getAlphaFunctionBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlphaFunctionBinaryExpression=ruleAlphaFunctionBinaryExpression();

            state._fsp--;

             current =iv_ruleAlphaFunctionBinaryExpression; 
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
    // $ANTLR end "entryRuleAlphaFunctionBinaryExpression"


    // $ANTLR start "ruleAlphaFunctionBinaryExpression"
    // InternalAlpha.g:3440:1: ruleAlphaFunctionBinaryExpression returns [EObject current=null] : (this_AlphaFunctionTerminalExpression_0= ruleAlphaFunctionTerminalExpression ( () ( (lv_operator_2_0= ruleAISLExpressionOperator ) ) ( (lv_right_3_0= ruleAlphaFunctionTerminalExpression ) ) )* ) ;
    public final EObject ruleAlphaFunctionBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AlphaFunctionTerminalExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3446:2: ( (this_AlphaFunctionTerminalExpression_0= ruleAlphaFunctionTerminalExpression ( () ( (lv_operator_2_0= ruleAISLExpressionOperator ) ) ( (lv_right_3_0= ruleAlphaFunctionTerminalExpression ) ) )* ) )
            // InternalAlpha.g:3447:2: (this_AlphaFunctionTerminalExpression_0= ruleAlphaFunctionTerminalExpression ( () ( (lv_operator_2_0= ruleAISLExpressionOperator ) ) ( (lv_right_3_0= ruleAlphaFunctionTerminalExpression ) ) )* )
            {
            // InternalAlpha.g:3447:2: (this_AlphaFunctionTerminalExpression_0= ruleAlphaFunctionTerminalExpression ( () ( (lv_operator_2_0= ruleAISLExpressionOperator ) ) ( (lv_right_3_0= ruleAlphaFunctionTerminalExpression ) ) )* )
            // InternalAlpha.g:3448:3: this_AlphaFunctionTerminalExpression_0= ruleAlphaFunctionTerminalExpression ( () ( (lv_operator_2_0= ruleAISLExpressionOperator ) ) ( (lv_right_3_0= ruleAlphaFunctionTerminalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAlphaFunctionBinaryExpressionAccess().getAlphaFunctionTerminalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_53);
            this_AlphaFunctionTerminalExpression_0=ruleAlphaFunctionTerminalExpression();

            state._fsp--;


            			current = this_AlphaFunctionTerminalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:3456:3: ( () ( (lv_operator_2_0= ruleAISLExpressionOperator ) ) ( (lv_right_3_0= ruleAlphaFunctionTerminalExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==13||(LA52_0>=43 && LA52_0<=47)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalAlpha.g:3457:4: () ( (lv_operator_2_0= ruleAISLExpressionOperator ) ) ( (lv_right_3_0= ruleAlphaFunctionTerminalExpression ) )
            	    {
            	    // InternalAlpha.g:3457:4: ()
            	    // InternalAlpha.g:3458:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAlphaFunctionBinaryExpressionAccess().getAlphaFunctionBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:3464:4: ( (lv_operator_2_0= ruleAISLExpressionOperator ) )
            	    // InternalAlpha.g:3465:5: (lv_operator_2_0= ruleAISLExpressionOperator )
            	    {
            	    // InternalAlpha.g:3465:5: (lv_operator_2_0= ruleAISLExpressionOperator )
            	    // InternalAlpha.g:3466:6: lv_operator_2_0= ruleAISLExpressionOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAlphaFunctionBinaryExpressionAccess().getOperatorAISLExpressionOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_52);
            	    lv_operator_2_0=ruleAISLExpressionOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAlphaFunctionBinaryExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"alpha.model.Alpha.AISLExpressionOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAlpha.g:3483:4: ( (lv_right_3_0= ruleAlphaFunctionTerminalExpression ) )
            	    // InternalAlpha.g:3484:5: (lv_right_3_0= ruleAlphaFunctionTerminalExpression )
            	    {
            	    // InternalAlpha.g:3484:5: (lv_right_3_0= ruleAlphaFunctionTerminalExpression )
            	    // InternalAlpha.g:3485:6: lv_right_3_0= ruleAlphaFunctionTerminalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAlphaFunctionBinaryExpressionAccess().getRightAlphaFunctionTerminalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_53);
            	    lv_right_3_0=ruleAlphaFunctionTerminalExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAlphaFunctionBinaryExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"alpha.model.Alpha.AlphaFunctionTerminalExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // $ANTLR end "ruleAlphaFunctionBinaryExpression"


    // $ANTLR start "entryRuleAlphaFunctionLiteral"
    // InternalAlpha.g:3507:1: entryRuleAlphaFunctionLiteral returns [EObject current=null] : iv_ruleAlphaFunctionLiteral= ruleAlphaFunctionLiteral EOF ;
    public final EObject entryRuleAlphaFunctionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaFunctionLiteral = null;


        try {
            // InternalAlpha.g:3507:61: (iv_ruleAlphaFunctionLiteral= ruleAlphaFunctionLiteral EOF )
            // InternalAlpha.g:3508:2: iv_ruleAlphaFunctionLiteral= ruleAlphaFunctionLiteral EOF
            {
             newCompositeNode(grammarAccess.getAlphaFunctionLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlphaFunctionLiteral=ruleAlphaFunctionLiteral();

            state._fsp--;

             current =iv_ruleAlphaFunctionLiteral; 
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
    // $ANTLR end "entryRuleAlphaFunctionLiteral"


    // $ANTLR start "ruleAlphaFunctionLiteral"
    // InternalAlpha.g:3514:1: ruleAlphaFunctionLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleAISLExpressionLiteral ) ) ) ;
    public final EObject ruleAlphaFunctionLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3520:2: ( ( () ( (lv_value_1_0= ruleAISLExpressionLiteral ) ) ) )
            // InternalAlpha.g:3521:2: ( () ( (lv_value_1_0= ruleAISLExpressionLiteral ) ) )
            {
            // InternalAlpha.g:3521:2: ( () ( (lv_value_1_0= ruleAISLExpressionLiteral ) ) )
            // InternalAlpha.g:3522:3: () ( (lv_value_1_0= ruleAISLExpressionLiteral ) )
            {
            // InternalAlpha.g:3522:3: ()
            // InternalAlpha.g:3523:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlphaFunctionLiteralAccess().getAlphaFunctionLiteralAction_0(),
            					current);
            			

            }

            // InternalAlpha.g:3529:3: ( (lv_value_1_0= ruleAISLExpressionLiteral ) )
            // InternalAlpha.g:3530:4: (lv_value_1_0= ruleAISLExpressionLiteral )
            {
            // InternalAlpha.g:3530:4: (lv_value_1_0= ruleAISLExpressionLiteral )
            // InternalAlpha.g:3531:5: lv_value_1_0= ruleAISLExpressionLiteral
            {

            					newCompositeNode(grammarAccess.getAlphaFunctionLiteralAccess().getValueAISLExpressionLiteralParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleAISLExpressionLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlphaFunctionLiteralRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"alpha.model.Alpha.AISLExpressionLiteral");
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
    // $ANTLR end "ruleAlphaFunctionLiteral"


    // $ANTLR start "entryRuleAlphaFunctionExpression"
    // InternalAlpha.g:3552:1: entryRuleAlphaFunctionExpression returns [EObject current=null] : iv_ruleAlphaFunctionExpression= ruleAlphaFunctionExpression EOF ;
    public final EObject entryRuleAlphaFunctionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaFunctionExpression = null;


        try {
            // InternalAlpha.g:3552:64: (iv_ruleAlphaFunctionExpression= ruleAlphaFunctionExpression EOF )
            // InternalAlpha.g:3553:2: iv_ruleAlphaFunctionExpression= ruleAlphaFunctionExpression EOF
            {
             newCompositeNode(grammarAccess.getAlphaFunctionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlphaFunctionExpression=ruleAlphaFunctionExpression();

            state._fsp--;

             current =iv_ruleAlphaFunctionExpression; 
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
    // $ANTLR end "entryRuleAlphaFunctionExpression"


    // $ANTLR start "ruleAlphaFunctionExpression"
    // InternalAlpha.g:3559:1: ruleAlphaFunctionExpression returns [EObject current=null] : this_AlphaFunctionBinaryExpression_0= ruleAlphaFunctionBinaryExpression ;
    public final EObject ruleAlphaFunctionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AlphaFunctionBinaryExpression_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3565:2: (this_AlphaFunctionBinaryExpression_0= ruleAlphaFunctionBinaryExpression )
            // InternalAlpha.g:3566:2: this_AlphaFunctionBinaryExpression_0= ruleAlphaFunctionBinaryExpression
            {

            		newCompositeNode(grammarAccess.getAlphaFunctionExpressionAccess().getAlphaFunctionBinaryExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AlphaFunctionBinaryExpression_0=ruleAlphaFunctionBinaryExpression();

            state._fsp--;


            		current = this_AlphaFunctionBinaryExpression_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleAlphaFunctionExpression"


    // $ANTLR start "entryRuleAlphaFunction"
    // InternalAlpha.g:3577:1: entryRuleAlphaFunction returns [EObject current=null] : iv_ruleAlphaFunction= ruleAlphaFunction EOF ;
    public final EObject entryRuleAlphaFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaFunction = null;


        try {
            // InternalAlpha.g:3577:54: (iv_ruleAlphaFunction= ruleAlphaFunction EOF )
            // InternalAlpha.g:3578:2: iv_ruleAlphaFunction= ruleAlphaFunction EOF
            {
             newCompositeNode(grammarAccess.getAlphaFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlphaFunction=ruleAlphaFunction();

            state._fsp--;

             current =iv_ruleAlphaFunction; 
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
    // $ANTLR end "entryRuleAlphaFunction"


    // $ANTLR start "ruleAlphaFunction"
    // InternalAlpha.g:3584:1: ruleAlphaFunction returns [EObject current=null] : (otherlv_0= '(' ( (lv_indexList_1_0= ruleAIndexList ) ) otherlv_2= '->' ( ( (lv_exprs_3_0= ruleAlphaFunctionExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= ruleAlphaFunctionExpression ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleAlphaFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_indexList_1_0 = null;

        EObject lv_exprs_3_0 = null;

        EObject lv_exprs_5_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3590:2: ( (otherlv_0= '(' ( (lv_indexList_1_0= ruleAIndexList ) ) otherlv_2= '->' ( ( (lv_exprs_3_0= ruleAlphaFunctionExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= ruleAlphaFunctionExpression ) ) )* )? otherlv_6= ')' ) )
            // InternalAlpha.g:3591:2: (otherlv_0= '(' ( (lv_indexList_1_0= ruleAIndexList ) ) otherlv_2= '->' ( ( (lv_exprs_3_0= ruleAlphaFunctionExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= ruleAlphaFunctionExpression ) ) )* )? otherlv_6= ')' )
            {
            // InternalAlpha.g:3591:2: (otherlv_0= '(' ( (lv_indexList_1_0= ruleAIndexList ) ) otherlv_2= '->' ( ( (lv_exprs_3_0= ruleAlphaFunctionExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= ruleAlphaFunctionExpression ) ) )* )? otherlv_6= ')' )
            // InternalAlpha.g:3592:3: otherlv_0= '(' ( (lv_indexList_1_0= ruleAIndexList ) ) otherlv_2= '->' ( ( (lv_exprs_3_0= ruleAlphaFunctionExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= ruleAlphaFunctionExpression ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getAlphaFunctionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalAlpha.g:3596:3: ( (lv_indexList_1_0= ruleAIndexList ) )
            // InternalAlpha.g:3597:4: (lv_indexList_1_0= ruleAIndexList )
            {
            // InternalAlpha.g:3597:4: (lv_indexList_1_0= ruleAIndexList )
            // InternalAlpha.g:3598:5: lv_indexList_1_0= ruleAIndexList
            {

            					newCompositeNode(grammarAccess.getAlphaFunctionAccess().getIndexListAIndexListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_indexList_1_0=ruleAIndexList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlphaFunctionRule());
            					}
            					set(
            						current,
            						"indexList",
            						lv_indexList_1_0,
            						"alpha.model.Alpha.AIndexList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getAlphaFunctionAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalAlpha.g:3619:3: ( ( (lv_exprs_3_0= ruleAlphaFunctionExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= ruleAlphaFunctionExpression ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_WS)||LA54_0==15||LA54_0==44) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAlpha.g:3620:4: ( (lv_exprs_3_0= ruleAlphaFunctionExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= ruleAlphaFunctionExpression ) ) )*
                    {
                    // InternalAlpha.g:3620:4: ( (lv_exprs_3_0= ruleAlphaFunctionExpression ) )
                    // InternalAlpha.g:3621:5: (lv_exprs_3_0= ruleAlphaFunctionExpression )
                    {
                    // InternalAlpha.g:3621:5: (lv_exprs_3_0= ruleAlphaFunctionExpression )
                    // InternalAlpha.g:3622:6: lv_exprs_3_0= ruleAlphaFunctionExpression
                    {

                    						newCompositeNode(grammarAccess.getAlphaFunctionAccess().getExprsAlphaFunctionExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_exprs_3_0=ruleAlphaFunctionExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlphaFunctionRule());
                    						}
                    						add(
                    							current,
                    							"exprs",
                    							lv_exprs_3_0,
                    							"alpha.model.Alpha.AlphaFunctionExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlpha.g:3639:4: (otherlv_4= ',' ( (lv_exprs_5_0= ruleAlphaFunctionExpression ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==24) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalAlpha.g:3640:5: otherlv_4= ',' ( (lv_exprs_5_0= ruleAlphaFunctionExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FOLLOW_52); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getAlphaFunctionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalAlpha.g:3644:5: ( (lv_exprs_5_0= ruleAlphaFunctionExpression ) )
                    	    // InternalAlpha.g:3645:6: (lv_exprs_5_0= ruleAlphaFunctionExpression )
                    	    {
                    	    // InternalAlpha.g:3645:6: (lv_exprs_5_0= ruleAlphaFunctionExpression )
                    	    // InternalAlpha.g:3646:7: lv_exprs_5_0= ruleAlphaFunctionExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlphaFunctionAccess().getExprsAlphaFunctionExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_56);
                    	    lv_exprs_5_0=ruleAlphaFunctionExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlphaFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"exprs",
                    	    								lv_exprs_5_0,
                    	    								"alpha.model.Alpha.AlphaFunctionExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAlphaFunctionAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleAlphaFunction"


    // $ANTLR start "entryRuleAISLBasicRelation"
    // InternalAlpha.g:3673:1: entryRuleAISLBasicRelation returns [String current=null] : iv_ruleAISLBasicRelation= ruleAISLBasicRelation EOF ;
    public final String entryRuleAISLBasicRelation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLBasicRelation = null;


        try {
            // InternalAlpha.g:3673:57: (iv_ruleAISLBasicRelation= ruleAISLBasicRelation EOF )
            // InternalAlpha.g:3674:2: iv_ruleAISLBasicRelation= ruleAISLBasicRelation EOF
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
    // InternalAlpha.g:3680:1: ruleAISLBasicRelation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_5= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_8= ruleAISLString ) ;
    public final AntlrDatatypeRuleToken ruleAISLBasicRelation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLExpressionList_1 = null;

        AntlrDatatypeRuleToken this_AISLExpressionList_5 = null;

        AntlrDatatypeRuleToken this_AISLString_8 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3686:2: ( (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_5= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_8= ruleAISLString ) )
            // InternalAlpha.g:3687:2: (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_5= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_8= ruleAISLString )
            {
            // InternalAlpha.g:3687:2: (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_5= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_8= ruleAISLString )
            // InternalAlpha.g:3688:3: kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_5= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_8= ruleAISLString
            {
            kw=(Token)match(input,37,FOLLOW_31); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAISLBasicRelationAccess().getAISLExpressionListParserRuleCall_1());
            		
            pushFollow(FOLLOW_44);
            this_AISLExpressionList_1=ruleAISLExpressionList();

            state._fsp--;


            			current.merge(this_AISLExpressionList_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,38,FOLLOW_28); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getRightSquareBracketKeyword_2());
            		
            kw=(Token)match(input,36,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            kw=(Token)match(input,37,FOLLOW_31); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getLeftSquareBracketKeyword_4());
            		

            			newCompositeNode(grammarAccess.getAISLBasicRelationAccess().getAISLExpressionListParserRuleCall_5());
            		
            pushFollow(FOLLOW_44);
            this_AISLExpressionList_5=ruleAISLExpressionList();

            state._fsp--;


            			current.merge(this_AISLExpressionList_5);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,38,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getRightSquareBracketKeyword_6());
            		
            kw=(Token)match(input,33,FOLLOW_45); 

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


    // $ANTLR start "entryRuleAISLWrappedBasicRelation"
    // InternalAlpha.g:3752:1: entryRuleAISLWrappedBasicRelation returns [String current=null] : iv_ruleAISLWrappedBasicRelation= ruleAISLWrappedBasicRelation EOF ;
    public final String entryRuleAISLWrappedBasicRelation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLWrappedBasicRelation = null;


        try {
            // InternalAlpha.g:3752:64: (iv_ruleAISLWrappedBasicRelation= ruleAISLWrappedBasicRelation EOF )
            // InternalAlpha.g:3753:2: iv_ruleAISLWrappedBasicRelation= ruleAISLWrappedBasicRelation EOF
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
    // InternalAlpha.g:3759:1: ruleAISLWrappedBasicRelation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= '[' this_AIndexList_2= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_6= ruleAISLExpressionList kw= ']' kw= ']' kw= '->' kw= '[' this_AISLExpressionList_11= ruleAISLExpressionList kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleAISLWrappedBasicRelation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AIndexList_2 = null;

        AntlrDatatypeRuleToken this_AISLExpressionList_6 = null;

        AntlrDatatypeRuleToken this_AISLExpressionList_11 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3765:2: ( (kw= '[' kw= '[' this_AIndexList_2= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_6= ruleAISLExpressionList kw= ']' kw= ']' kw= '->' kw= '[' this_AISLExpressionList_11= ruleAISLExpressionList kw= ']' ) )
            // InternalAlpha.g:3766:2: (kw= '[' kw= '[' this_AIndexList_2= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_6= ruleAISLExpressionList kw= ']' kw= ']' kw= '->' kw= '[' this_AISLExpressionList_11= ruleAISLExpressionList kw= ']' )
            {
            // InternalAlpha.g:3766:2: (kw= '[' kw= '[' this_AIndexList_2= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_6= ruleAISLExpressionList kw= ']' kw= ']' kw= '->' kw= '[' this_AISLExpressionList_11= ruleAISLExpressionList kw= ']' )
            // InternalAlpha.g:3767:3: kw= '[' kw= '[' this_AIndexList_2= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_6= ruleAISLExpressionList kw= ']' kw= ']' kw= '->' kw= '[' this_AISLExpressionList_11= ruleAISLExpressionList kw= ']'
            {
            kw=(Token)match(input,37,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getLeftSquareBracketKeyword_0());
            		
            kw=(Token)match(input,37,FOLLOW_43); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getLeftSquareBracketKeyword_1());
            		

            			newCompositeNode(grammarAccess.getAISLWrappedBasicRelationAccess().getAIndexListParserRuleCall_2());
            		
            pushFollow(FOLLOW_44);
            this_AIndexList_2=ruleAIndexList();

            state._fsp--;


            			current.merge(this_AIndexList_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,38,FOLLOW_28); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getRightSquareBracketKeyword_3());
            		
            kw=(Token)match(input,36,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            kw=(Token)match(input,37,FOLLOW_31); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getLeftSquareBracketKeyword_5());
            		

            			newCompositeNode(grammarAccess.getAISLWrappedBasicRelationAccess().getAISLExpressionListParserRuleCall_6());
            		
            pushFollow(FOLLOW_44);
            this_AISLExpressionList_6=ruleAISLExpressionList();

            state._fsp--;


            			current.merge(this_AISLExpressionList_6);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,38,FOLLOW_44); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getRightSquareBracketKeyword_7());
            		
            kw=(Token)match(input,38,FOLLOW_28); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getRightSquareBracketKeyword_8());
            		
            kw=(Token)match(input,36,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getHyphenMinusGreaterThanSignKeyword_9());
            		
            kw=(Token)match(input,37,FOLLOW_31); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getLeftSquareBracketKeyword_10());
            		

            			newCompositeNode(grammarAccess.getAISLWrappedBasicRelationAccess().getAISLExpressionListParserRuleCall_11());
            		
            pushFollow(FOLLOW_44);
            this_AISLExpressionList_11=ruleAISLExpressionList();

            state._fsp--;


            			current.merge(this_AISLExpressionList_11);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,38,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getRightSquareBracketKeyword_12());
            		

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


    // $ANTLR start "entryRuleAISLFuzzyExpression"
    // InternalAlpha.g:3851:1: entryRuleAISLFuzzyExpression returns [String current=null] : iv_ruleAISLFuzzyExpression= ruleAISLFuzzyExpression EOF ;
    public final String entryRuleAISLFuzzyExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLFuzzyExpression = null;


        try {
            // InternalAlpha.g:3851:59: (iv_ruleAISLFuzzyExpression= ruleAISLFuzzyExpression EOF )
            // InternalAlpha.g:3852:2: iv_ruleAISLFuzzyExpression= ruleAISLFuzzyExpression EOF
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
    // InternalAlpha.g:3858:1: ruleAISLFuzzyExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '[' | kw= ']' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_10= RULE_WS )+ ;
    public final AntlrDatatypeRuleToken ruleAISLFuzzyExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token kw=null;
        Token this_WS_10=null;
        AntlrDatatypeRuleToken this_IndexName_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3864:2: ( (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '[' | kw= ']' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_10= RULE_WS )+ )
            // InternalAlpha.g:3865:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '[' | kw= ']' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_10= RULE_WS )+
            {
            // InternalAlpha.g:3865:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '[' | kw= ']' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_10= RULE_WS )+
            int cnt55=0;
            loop55:
            do {
                int alt55=12;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt55=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt55=2;
                    }
                    break;
                case 37:
                    {
                    alt55=3;
                    }
                    break;
                case 38:
                    {
                    alt55=4;
                    }
                    break;
                case 13:
                    {
                    alt55=5;
                    }
                    break;
                case 43:
                    {
                    alt55=6;
                    }
                    break;
                case 44:
                    {
                    alt55=7;
                    }
                    break;
                case 45:
                    {
                    alt55=8;
                    }
                    break;
                case 46:
                    {
                    alt55=9;
                    }
                    break;
                case 47:
                    {
                    alt55=10;
                    }
                    break;
                case RULE_WS:
                    {
                    alt55=11;
                    }
                    break;

                }

                switch (alt55) {
            	case 1 :
            	    // InternalAlpha.g:3866:3: this_IndexName_0= ruleIndexName
            	    {

            	    			newCompositeNode(grammarAccess.getAISLFuzzyExpressionAccess().getIndexNameParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_57);
            	    this_IndexName_0=ruleIndexName();

            	    state._fsp--;


            	    			current.merge(this_IndexName_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalAlpha.g:3877:3: this_INT_1= RULE_INT
            	    {
            	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_57); 

            	    			current.merge(this_INT_1);
            	    		

            	    			newLeafNode(this_INT_1, grammarAccess.getAISLFuzzyExpressionAccess().getINTTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalAlpha.g:3885:3: kw= '['
            	    {
            	    kw=(Token)match(input,37,FOLLOW_57); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getLeftSquareBracketKeyword_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalAlpha.g:3891:3: kw= ']'
            	    {
            	    kw=(Token)match(input,38,FOLLOW_57); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getRightSquareBracketKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalAlpha.g:3897:3: kw= '='
            	    {
            	    kw=(Token)match(input,13,FOLLOW_57); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getEqualsSignKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalAlpha.g:3903:3: kw= '+'
            	    {
            	    kw=(Token)match(input,43,FOLLOW_57); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getPlusSignKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalAlpha.g:3909:3: kw= '-'
            	    {
            	    kw=(Token)match(input,44,FOLLOW_57); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getHyphenMinusKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalAlpha.g:3915:3: kw= '*'
            	    {
            	    kw=(Token)match(input,45,FOLLOW_57); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getAsteriskKeyword_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalAlpha.g:3921:3: kw= '/'
            	    {
            	    kw=(Token)match(input,46,FOLLOW_57); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getSolidusKeyword_8());
            	    		

            	    }
            	    break;
            	case 10 :
            	    // InternalAlpha.g:3927:3: kw= '%'
            	    {
            	    kw=(Token)match(input,47,FOLLOW_57); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getPercentSignKeyword_9());
            	    		

            	    }
            	    break;
            	case 11 :
            	    // InternalAlpha.g:3933:3: this_WS_10= RULE_WS
            	    {
            	    this_WS_10=(Token)match(input,RULE_WS,FOLLOW_57); 

            	    			current.merge(this_WS_10);
            	    		

            	    			newLeafNode(this_WS_10, grammarAccess.getAISLFuzzyExpressionAccess().getWSTerminalRuleCall_10());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
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


    // $ANTLR start "entryRuleEquation"
    // InternalAlpha.g:3944:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // InternalAlpha.g:3944:49: (iv_ruleEquation= ruleEquation EOF )
            // InternalAlpha.g:3945:2: iv_ruleEquation= ruleEquation EOF
            {
             newCompositeNode(grammarAccess.getEquationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquation=ruleEquation();

            state._fsp--;

             current =iv_ruleEquation; 
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
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // InternalAlpha.g:3951:1: ruleEquation returns [EObject current=null] : (this_StandardEquation_0= ruleStandardEquation | this_UseEquation_1= ruleUseEquation ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        EObject this_StandardEquation_0 = null;

        EObject this_UseEquation_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3957:2: ( (this_StandardEquation_0= ruleStandardEquation | this_UseEquation_1= ruleUseEquation ) )
            // InternalAlpha.g:3958:2: (this_StandardEquation_0= ruleStandardEquation | this_UseEquation_1= ruleUseEquation )
            {
            // InternalAlpha.g:3958:2: (this_StandardEquation_0= ruleStandardEquation | this_UseEquation_1= ruleUseEquation )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            else if ( (LA56_0==15||LA56_0==27||LA56_0==33||LA56_0==57) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalAlpha.g:3959:3: this_StandardEquation_0= ruleStandardEquation
                    {

                    			newCompositeNode(grammarAccess.getEquationAccess().getStandardEquationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StandardEquation_0=ruleStandardEquation();

                    state._fsp--;


                    			current = this_StandardEquation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3968:3: this_UseEquation_1= ruleUseEquation
                    {

                    			newCompositeNode(grammarAccess.getEquationAccess().getUseEquationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UseEquation_1=ruleUseEquation();

                    state._fsp--;


                    			current = this_UseEquation_1;
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
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleStandardEquation"
    // InternalAlpha.g:3980:1: entryRuleStandardEquation returns [EObject current=null] : iv_ruleStandardEquation= ruleStandardEquation EOF ;
    public final EObject entryRuleStandardEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardEquation = null;


        try {
            // InternalAlpha.g:3980:57: (iv_ruleStandardEquation= ruleStandardEquation EOF )
            // InternalAlpha.g:3981:2: iv_ruleStandardEquation= ruleStandardEquation EOF
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
    // InternalAlpha.g:3987:1: ruleStandardEquation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )? otherlv_6= '=' ( (lv_expr_7_0= ruleAlphaExpression ) ) otherlv_8= ';' ) ;
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
            // InternalAlpha.g:3993:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )? otherlv_6= '=' ( (lv_expr_7_0= ruleAlphaExpression ) ) otherlv_8= ';' ) )
            // InternalAlpha.g:3994:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )? otherlv_6= '=' ( (lv_expr_7_0= ruleAlphaExpression ) ) otherlv_8= ';' )
            {
            // InternalAlpha.g:3994:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )? otherlv_6= '=' ( (lv_expr_7_0= ruleAlphaExpression ) ) otherlv_8= ';' )
            // InternalAlpha.g:3995:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )? otherlv_6= '=' ( (lv_expr_7_0= ruleAlphaExpression ) ) otherlv_8= ';'
            {
            // InternalAlpha.g:3995:3: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:3996:4: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:3996:4: (otherlv_0= RULE_ID )
            // InternalAlpha.g:3997:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStandardEquationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_58); 

            					newLeafNode(otherlv_0, grammarAccess.getStandardEquationAccess().getVariableVariableCrossReference_0_0());
            				

            }


            }

            // InternalAlpha.g:4008:3: (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==37) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAlpha.g:4009:4: otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getStandardEquationAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAlpha.g:4013:4: ( (lv_indexNames_2_0= ruleIndexName ) )
                    // InternalAlpha.g:4014:5: (lv_indexNames_2_0= ruleIndexName )
                    {
                    // InternalAlpha.g:4014:5: (lv_indexNames_2_0= ruleIndexName )
                    // InternalAlpha.g:4015:6: lv_indexNames_2_0= ruleIndexName
                    {

                    						newCompositeNode(grammarAccess.getStandardEquationAccess().getIndexNamesIndexNameParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_32);
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

                    // InternalAlpha.g:4032:4: (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==24) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalAlpha.g:4033:5: otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getStandardEquationAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalAlpha.g:4037:5: ( (lv_indexNames_4_0= ruleIndexName ) )
                    	    // InternalAlpha.g:4038:6: (lv_indexNames_4_0= ruleIndexName )
                    	    {
                    	    // InternalAlpha.g:4038:6: (lv_indexNames_4_0= ruleIndexName )
                    	    // InternalAlpha.g:4039:7: lv_indexNames_4_0= ruleIndexName
                    	    {

                    	    							newCompositeNode(grammarAccess.getStandardEquationAccess().getIndexNamesIndexNameParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
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
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getStandardEquationAccess().getRightSquareBracketKeyword_1_3());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getStandardEquationAccess().getEqualsSignKeyword_2());
            		
            // InternalAlpha.g:4066:3: ( (lv_expr_7_0= ruleAlphaExpression ) )
            // InternalAlpha.g:4067:4: (lv_expr_7_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:4067:4: (lv_expr_7_0= ruleAlphaExpression )
            // InternalAlpha.g:4068:5: lv_expr_7_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getStandardEquationAccess().getExprAlphaExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_59);
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

            otherlv_8=(Token)match(input,34,FOLLOW_2); 

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
    // InternalAlpha.g:4093:1: entryRuleUseEquation returns [EObject current=null] : iv_ruleUseEquation= ruleUseEquation EOF ;
    public final EObject entryRuleUseEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseEquation = null;


        try {
            // InternalAlpha.g:4093:52: (iv_ruleUseEquation= ruleUseEquation EOF )
            // InternalAlpha.g:4094:2: iv_ruleUseEquation= ruleUseEquation EOF
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
    // InternalAlpha.g:4100:1: ruleUseEquation returns [EObject current=null] : ( ( (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) )? (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )? otherlv_9= '(' ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )? otherlv_13= ')' otherlv_14= '=' ( ( ruleQualifiedName ) ) ( (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation ) ) otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' ) ;
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
            // InternalAlpha.g:4106:2: ( ( ( (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) )? (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )? otherlv_9= '(' ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )? otherlv_13= ')' otherlv_14= '=' ( ( ruleQualifiedName ) ) ( (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation ) ) otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' ) )
            // InternalAlpha.g:4107:2: ( ( (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) )? (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )? otherlv_9= '(' ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )? otherlv_13= ')' otherlv_14= '=' ( ( ruleQualifiedName ) ) ( (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation ) ) otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' )
            {
            // InternalAlpha.g:4107:2: ( ( (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) )? (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )? otherlv_9= '(' ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )? otherlv_13= ')' otherlv_14= '=' ( ( ruleQualifiedName ) ) ( (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation ) ) otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' )
            // InternalAlpha.g:4108:3: ( (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) )? (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )? otherlv_9= '(' ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )? otherlv_13= ')' otherlv_14= '=' ( ( ruleQualifiedName ) ) ( (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation ) ) otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';'
            {
            // InternalAlpha.g:4108:3: ( (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) )? (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==27||LA63_0==33||LA63_0==57) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAlpha.g:4109:4: (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) )? (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':'
                    {
                    // InternalAlpha.g:4109:4: (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==27) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalAlpha.g:4110:5: otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) )
                            {
                            otherlv_0=(Token)match(input,27,FOLLOW_20); 

                            					newLeafNode(otherlv_0, grammarAccess.getUseEquationAccess().getOverKeyword_0_0_0());
                            				
                            // InternalAlpha.g:4114:5: ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) )
                            // InternalAlpha.g:4115:6: (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression )
                            {
                            // InternalAlpha.g:4115:6: (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression )
                            // InternalAlpha.g:4116:7: lv_instantiationDomainExpr_1_0= ruleCalculatorExpression
                            {

                            							newCompositeNode(grammarAccess.getUseEquationAccess().getInstantiationDomainExprCalculatorExpressionParserRuleCall_0_0_1_0());
                            						
                            pushFollow(FOLLOW_60);
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


                            }
                            break;

                    }

                    // InternalAlpha.g:4134:4: (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==57) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalAlpha.g:4135:5: otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )?
                            {
                            otherlv_2=(Token)match(input,57,FOLLOW_61); 

                            					newLeafNode(otherlv_2, grammarAccess.getUseEquationAccess().getWithKeyword_0_1_0());
                            				
                            // InternalAlpha.g:4139:5: (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )?
                            int alt61=2;
                            int LA61_0 = input.LA(1);

                            if ( (LA61_0==37) ) {
                                alt61=1;
                            }
                            switch (alt61) {
                                case 1 :
                                    // InternalAlpha.g:4140:6: otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']'
                                    {
                                    otherlv_3=(Token)match(input,37,FOLLOW_5); 

                                    						newLeafNode(otherlv_3, grammarAccess.getUseEquationAccess().getLeftSquareBracketKeyword_0_1_1_0());
                                    					
                                    // InternalAlpha.g:4144:6: ( (lv_subsystemDims_4_0= ruleIndexName ) )
                                    // InternalAlpha.g:4145:7: (lv_subsystemDims_4_0= ruleIndexName )
                                    {
                                    // InternalAlpha.g:4145:7: (lv_subsystemDims_4_0= ruleIndexName )
                                    // InternalAlpha.g:4146:8: lv_subsystemDims_4_0= ruleIndexName
                                    {

                                    								newCompositeNode(grammarAccess.getUseEquationAccess().getSubsystemDimsIndexNameParserRuleCall_0_1_1_1_0());
                                    							
                                    pushFollow(FOLLOW_32);
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

                                    // InternalAlpha.g:4163:6: (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )*
                                    loop60:
                                    do {
                                        int alt60=2;
                                        int LA60_0 = input.LA(1);

                                        if ( (LA60_0==24) ) {
                                            alt60=1;
                                        }


                                        switch (alt60) {
                                    	case 1 :
                                    	    // InternalAlpha.g:4164:7: otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) )
                                    	    {
                                    	    otherlv_5=(Token)match(input,24,FOLLOW_5); 

                                    	    							newLeafNode(otherlv_5, grammarAccess.getUseEquationAccess().getCommaKeyword_0_1_1_2_0());
                                    	    						
                                    	    // InternalAlpha.g:4168:7: ( (lv_subsystemDims_6_0= ruleIndexName ) )
                                    	    // InternalAlpha.g:4169:8: (lv_subsystemDims_6_0= ruleIndexName )
                                    	    {
                                    	    // InternalAlpha.g:4169:8: (lv_subsystemDims_6_0= ruleIndexName )
                                    	    // InternalAlpha.g:4170:9: lv_subsystemDims_6_0= ruleIndexName
                                    	    {

                                    	    									newCompositeNode(grammarAccess.getUseEquationAccess().getSubsystemDimsIndexNameParserRuleCall_0_1_1_2_1_0());
                                    	    								
                                    	    pushFollow(FOLLOW_32);
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
                                    	    break loop60;
                                        }
                                    } while (true);

                                    otherlv_7=(Token)match(input,38,FOLLOW_26); 

                                    						newLeafNode(otherlv_7, grammarAccess.getUseEquationAccess().getRightSquareBracketKeyword_0_1_1_3());
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,33,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getUseEquationAccess().getColonKeyword_0_2());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_62); 

            			newLeafNode(otherlv_9, grammarAccess.getUseEquationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:4203:3: ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_ID && LA65_0<=RULE_INT)||LA65_0==RULE_BOOLEAN||LA65_0==15||LA65_0==19||LA65_0==39||(LA65_0>=42 && LA65_0<=45)||(LA65_0>=48 && LA65_0<=49)||LA65_0==58||(LA65_0>=60 && LA65_0<=61)||(LA65_0>=63 && LA65_0<=67)||(LA65_0>=69 && LA65_0<=73)||LA65_0==75) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalAlpha.g:4204:4: ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )*
                    {
                    // InternalAlpha.g:4204:4: ( (lv_outputExprs_10_0= ruleAlphaExpression ) )
                    // InternalAlpha.g:4205:5: (lv_outputExprs_10_0= ruleAlphaExpression )
                    {
                    // InternalAlpha.g:4205:5: (lv_outputExprs_10_0= ruleAlphaExpression )
                    // InternalAlpha.g:4206:6: lv_outputExprs_10_0= ruleAlphaExpression
                    {

                    						newCompositeNode(grammarAccess.getUseEquationAccess().getOutputExprsAlphaExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_56);
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

                    // InternalAlpha.g:4223:4: (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==24) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalAlpha.g:4224:5: otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,24,FOLLOW_22); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getUseEquationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlpha.g:4228:5: ( (lv_outputExprs_12_0= ruleAlphaExpression ) )
                    	    // InternalAlpha.g:4229:6: (lv_outputExprs_12_0= ruleAlphaExpression )
                    	    {
                    	    // InternalAlpha.g:4229:6: (lv_outputExprs_12_0= ruleAlphaExpression )
                    	    // InternalAlpha.g:4230:7: lv_outputExprs_12_0= ruleAlphaExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseEquationAccess().getOutputExprsAlphaExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_56);
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
                    	    break loop64;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_13, grammarAccess.getUseEquationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_14=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getUseEquationAccess().getEqualsSignKeyword_4());
            		
            // InternalAlpha.g:4257:3: ( ( ruleQualifiedName ) )
            // InternalAlpha.g:4258:4: ( ruleQualifiedName )
            {
            // InternalAlpha.g:4258:4: ( ruleQualifiedName )
            // InternalAlpha.g:4259:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseEquationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getUseEquationAccess().getSystemAlphaSystemCrossReference_5_0());
            				
            pushFollow(FOLLOW_12);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:4273:3: ( (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:4274:4: (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:4274:4: (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation )
            // InternalAlpha.g:4275:5: lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation
            {

            					newCompositeNode(grammarAccess.getUseEquationAccess().getCallParamsExprJNIFunctionInArrayNotationParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_17=(Token)match(input,15,FOLLOW_62); 

            			newLeafNode(otherlv_17, grammarAccess.getUseEquationAccess().getLeftParenthesisKeyword_7());
            		
            // InternalAlpha.g:4296:3: ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=RULE_ID && LA67_0<=RULE_INT)||LA67_0==RULE_BOOLEAN||LA67_0==15||LA67_0==19||LA67_0==39||(LA67_0>=42 && LA67_0<=45)||(LA67_0>=48 && LA67_0<=49)||LA67_0==58||(LA67_0>=60 && LA67_0<=61)||(LA67_0>=63 && LA67_0<=67)||(LA67_0>=69 && LA67_0<=73)||LA67_0==75) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalAlpha.g:4297:4: ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )*
                    {
                    // InternalAlpha.g:4297:4: ( (lv_inputExprs_18_0= ruleAlphaExpression ) )
                    // InternalAlpha.g:4298:5: (lv_inputExprs_18_0= ruleAlphaExpression )
                    {
                    // InternalAlpha.g:4298:5: (lv_inputExprs_18_0= ruleAlphaExpression )
                    // InternalAlpha.g:4299:6: lv_inputExprs_18_0= ruleAlphaExpression
                    {

                    						newCompositeNode(grammarAccess.getUseEquationAccess().getInputExprsAlphaExpressionParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_56);
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

                    // InternalAlpha.g:4316:4: (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==24) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalAlpha.g:4317:5: otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) )
                    	    {
                    	    otherlv_19=(Token)match(input,24,FOLLOW_22); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getUseEquationAccess().getCommaKeyword_8_1_0());
                    	    				
                    	    // InternalAlpha.g:4321:5: ( (lv_inputExprs_20_0= ruleAlphaExpression ) )
                    	    // InternalAlpha.g:4322:6: (lv_inputExprs_20_0= ruleAlphaExpression )
                    	    {
                    	    // InternalAlpha.g:4322:6: (lv_inputExprs_20_0= ruleAlphaExpression )
                    	    // InternalAlpha.g:4323:7: lv_inputExprs_20_0= ruleAlphaExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseEquationAccess().getInputExprsAlphaExpressionParserRuleCall_8_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_56);
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
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_21=(Token)match(input,16,FOLLOW_59); 

            			newLeafNode(otherlv_21, grammarAccess.getUseEquationAccess().getRightParenthesisKeyword_9());
            		
            otherlv_22=(Token)match(input,34,FOLLOW_2); 

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
    // InternalAlpha.g:4354:1: entryRuleAlphaExpression returns [EObject current=null] : iv_ruleAlphaExpression= ruleAlphaExpression EOF ;
    public final EObject entryRuleAlphaExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaExpression = null;


        try {
            // InternalAlpha.g:4354:56: (iv_ruleAlphaExpression= ruleAlphaExpression EOF )
            // InternalAlpha.g:4355:2: iv_ruleAlphaExpression= ruleAlphaExpression EOF
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
    // InternalAlpha.g:4361:1: ruleAlphaExpression returns [EObject current=null] : (this_IfExpression_0= ruleIfExpression | this_RestrictExpression_1= ruleRestrictExpression | this_AutoRestrictExpression_2= ruleAutoRestrictExpression | this_OrExpression_3= ruleOrExpression ) ;
    public final EObject ruleAlphaExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IfExpression_0 = null;

        EObject this_RestrictExpression_1 = null;

        EObject this_AutoRestrictExpression_2 = null;

        EObject this_OrExpression_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4367:2: ( (this_IfExpression_0= ruleIfExpression | this_RestrictExpression_1= ruleRestrictExpression | this_AutoRestrictExpression_2= ruleAutoRestrictExpression | this_OrExpression_3= ruleOrExpression ) )
            // InternalAlpha.g:4368:2: (this_IfExpression_0= ruleIfExpression | this_RestrictExpression_1= ruleRestrictExpression | this_AutoRestrictExpression_2= ruleAutoRestrictExpression | this_OrExpression_3= ruleOrExpression )
            {
            // InternalAlpha.g:4368:2: (this_IfExpression_0= ruleIfExpression | this_RestrictExpression_1= ruleRestrictExpression | this_AutoRestrictExpression_2= ruleAutoRestrictExpression | this_OrExpression_3= ruleOrExpression )
            int alt68=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt68=1;
                }
                break;
            case 19:
            case 42:
                {
                alt68=2;
                }
                break;
            case 60:
                {
                alt68=3;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_BOOLEAN:
            case 15:
            case 39:
            case 43:
            case 44:
            case 45:
            case 48:
            case 49:
            case 61:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 75:
                {
                alt68=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalAlpha.g:4369:3: this_IfExpression_0= ruleIfExpression
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
                    // InternalAlpha.g:4378:3: this_RestrictExpression_1= ruleRestrictExpression
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
                    // InternalAlpha.g:4387:3: this_AutoRestrictExpression_2= ruleAutoRestrictExpression
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
                    // InternalAlpha.g:4396:3: this_OrExpression_3= ruleOrExpression
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
    // InternalAlpha.g:4408:1: entryRuleAlphaTerminalExpression returns [EObject current=null] : iv_ruleAlphaTerminalExpression= ruleAlphaTerminalExpression EOF ;
    public final EObject entryRuleAlphaTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaTerminalExpression = null;


        try {
            // InternalAlpha.g:4408:64: (iv_ruleAlphaTerminalExpression= ruleAlphaTerminalExpression EOF )
            // InternalAlpha.g:4409:2: iv_ruleAlphaTerminalExpression= ruleAlphaTerminalExpression EOF
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
    // InternalAlpha.g:4415:1: ruleAlphaTerminalExpression returns [EObject current=null] : ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_ConstantExpression_4= ruleConstantExpression | this_VariableExpression_5= ruleVariableExpression | this_DependenceExpression_6= ruleDependenceExpression | this_FuzzyDependenceExpression_7= ruleFuzzyDependenceExpression | this_IndexExpression_8= ruleIndexExpression | this_PolynomialIndexExpression_9= rulePolynomialIndexExpression | this_FuzzyIndexExpression_10= ruleFuzzyIndexExpression | this_Reductions_11= ruleReductions | this_ConvolutionExpression_12= ruleConvolutionExpression | this_MultiArgExpression_13= ruleMultiArgExpression | this_ExternalMultiArgExpression_14= ruleExternalMultiArgExpression | this_SelectExpression_15= ruleSelectExpression ) ;
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

        EObject this_PolynomialIndexExpression_9 = null;

        EObject this_FuzzyIndexExpression_10 = null;

        EObject this_Reductions_11 = null;

        EObject this_ConvolutionExpression_12 = null;

        EObject this_MultiArgExpression_13 = null;

        EObject this_ExternalMultiArgExpression_14 = null;

        EObject this_SelectExpression_15 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4421:2: ( ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_ConstantExpression_4= ruleConstantExpression | this_VariableExpression_5= ruleVariableExpression | this_DependenceExpression_6= ruleDependenceExpression | this_FuzzyDependenceExpression_7= ruleFuzzyDependenceExpression | this_IndexExpression_8= ruleIndexExpression | this_PolynomialIndexExpression_9= rulePolynomialIndexExpression | this_FuzzyIndexExpression_10= ruleFuzzyIndexExpression | this_Reductions_11= ruleReductions | this_ConvolutionExpression_12= ruleConvolutionExpression | this_MultiArgExpression_13= ruleMultiArgExpression | this_ExternalMultiArgExpression_14= ruleExternalMultiArgExpression | this_SelectExpression_15= ruleSelectExpression ) )
            // InternalAlpha.g:4422:2: ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_ConstantExpression_4= ruleConstantExpression | this_VariableExpression_5= ruleVariableExpression | this_DependenceExpression_6= ruleDependenceExpression | this_FuzzyDependenceExpression_7= ruleFuzzyDependenceExpression | this_IndexExpression_8= ruleIndexExpression | this_PolynomialIndexExpression_9= rulePolynomialIndexExpression | this_FuzzyIndexExpression_10= ruleFuzzyIndexExpression | this_Reductions_11= ruleReductions | this_ConvolutionExpression_12= ruleConvolutionExpression | this_MultiArgExpression_13= ruleMultiArgExpression | this_ExternalMultiArgExpression_14= ruleExternalMultiArgExpression | this_SelectExpression_15= ruleSelectExpression )
            {
            // InternalAlpha.g:4422:2: ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_ConstantExpression_4= ruleConstantExpression | this_VariableExpression_5= ruleVariableExpression | this_DependenceExpression_6= ruleDependenceExpression | this_FuzzyDependenceExpression_7= ruleFuzzyDependenceExpression | this_IndexExpression_8= ruleIndexExpression | this_PolynomialIndexExpression_9= rulePolynomialIndexExpression | this_FuzzyIndexExpression_10= ruleFuzzyIndexExpression | this_Reductions_11= ruleReductions | this_ConvolutionExpression_12= ruleConvolutionExpression | this_MultiArgExpression_13= ruleMultiArgExpression | this_ExternalMultiArgExpression_14= ruleExternalMultiArgExpression | this_SelectExpression_15= ruleSelectExpression )
            int alt69=14;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // InternalAlpha.g:4423:3: (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' )
                    {
                    // InternalAlpha.g:4423:3: (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' )
                    // InternalAlpha.g:4424:4: otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_0, grammarAccess.getAlphaTerminalExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getAlphaExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_AlphaExpression_1=ruleAlphaExpression();

                    state._fsp--;


                    				current = this_AlphaExpression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getAlphaTerminalExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4442:3: this_CaseExpression_3= ruleCaseExpression
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
                    // InternalAlpha.g:4451:3: this_ConstantExpression_4= ruleConstantExpression
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
                    // InternalAlpha.g:4460:3: this_VariableExpression_5= ruleVariableExpression
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
                    // InternalAlpha.g:4469:3: this_DependenceExpression_6= ruleDependenceExpression
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
                    // InternalAlpha.g:4478:3: this_FuzzyDependenceExpression_7= ruleFuzzyDependenceExpression
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
                    // InternalAlpha.g:4487:3: this_IndexExpression_8= ruleIndexExpression
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
                    // InternalAlpha.g:4496:3: this_PolynomialIndexExpression_9= rulePolynomialIndexExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getPolynomialIndexExpressionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_PolynomialIndexExpression_9=rulePolynomialIndexExpression();

                    state._fsp--;


                    			current = this_PolynomialIndexExpression_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalAlpha.g:4505:3: this_FuzzyIndexExpression_10= ruleFuzzyIndexExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getFuzzyIndexExpressionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuzzyIndexExpression_10=ruleFuzzyIndexExpression();

                    state._fsp--;


                    			current = this_FuzzyIndexExpression_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalAlpha.g:4514:3: this_Reductions_11= ruleReductions
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getReductionsParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reductions_11=ruleReductions();

                    state._fsp--;


                    			current = this_Reductions_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalAlpha.g:4523:3: this_ConvolutionExpression_12= ruleConvolutionExpression
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
                    // InternalAlpha.g:4532:3: this_MultiArgExpression_13= ruleMultiArgExpression
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
                    // InternalAlpha.g:4541:3: this_ExternalMultiArgExpression_14= ruleExternalMultiArgExpression
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
                    // InternalAlpha.g:4550:3: this_SelectExpression_15= ruleSelectExpression
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


    // $ANTLR start "entryRuleAlphaUnaryTerminalExpression"
    // InternalAlpha.g:4562:1: entryRuleAlphaUnaryTerminalExpression returns [EObject current=null] : iv_ruleAlphaUnaryTerminalExpression= ruleAlphaUnaryTerminalExpression EOF ;
    public final EObject entryRuleAlphaUnaryTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaUnaryTerminalExpression = null;


        try {
            // InternalAlpha.g:4562:69: (iv_ruleAlphaUnaryTerminalExpression= ruleAlphaUnaryTerminalExpression EOF )
            // InternalAlpha.g:4563:2: iv_ruleAlphaUnaryTerminalExpression= ruleAlphaUnaryTerminalExpression EOF
            {
             newCompositeNode(grammarAccess.getAlphaUnaryTerminalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlphaUnaryTerminalExpression=ruleAlphaUnaryTerminalExpression();

            state._fsp--;

             current =iv_ruleAlphaUnaryTerminalExpression; 
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
    // $ANTLR end "entryRuleAlphaUnaryTerminalExpression"


    // $ANTLR start "ruleAlphaUnaryTerminalExpression"
    // InternalAlpha.g:4569:1: ruleAlphaUnaryTerminalExpression returns [EObject current=null] : ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_VariableExpression_4= ruleVariableExpression | this_IndexExpression_5= ruleIndexExpression | this_PolynomialIndexExpression_6= rulePolynomialIndexExpression | this_FuzzyIndexExpression_7= ruleFuzzyIndexExpression | this_Reductions_8= ruleReductions | this_ConvolutionExpression_9= ruleConvolutionExpression | this_MultiArgExpression_10= ruleMultiArgExpression | this_ExternalMultiArgExpression_11= ruleExternalMultiArgExpression | this_SelectExpression_12= ruleSelectExpression ) ;
    public final EObject ruleAlphaUnaryTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AlphaExpression_1 = null;

        EObject this_CaseExpression_3 = null;

        EObject this_VariableExpression_4 = null;

        EObject this_IndexExpression_5 = null;

        EObject this_PolynomialIndexExpression_6 = null;

        EObject this_FuzzyIndexExpression_7 = null;

        EObject this_Reductions_8 = null;

        EObject this_ConvolutionExpression_9 = null;

        EObject this_MultiArgExpression_10 = null;

        EObject this_ExternalMultiArgExpression_11 = null;

        EObject this_SelectExpression_12 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4575:2: ( ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_VariableExpression_4= ruleVariableExpression | this_IndexExpression_5= ruleIndexExpression | this_PolynomialIndexExpression_6= rulePolynomialIndexExpression | this_FuzzyIndexExpression_7= ruleFuzzyIndexExpression | this_Reductions_8= ruleReductions | this_ConvolutionExpression_9= ruleConvolutionExpression | this_MultiArgExpression_10= ruleMultiArgExpression | this_ExternalMultiArgExpression_11= ruleExternalMultiArgExpression | this_SelectExpression_12= ruleSelectExpression ) )
            // InternalAlpha.g:4576:2: ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_VariableExpression_4= ruleVariableExpression | this_IndexExpression_5= ruleIndexExpression | this_PolynomialIndexExpression_6= rulePolynomialIndexExpression | this_FuzzyIndexExpression_7= ruleFuzzyIndexExpression | this_Reductions_8= ruleReductions | this_ConvolutionExpression_9= ruleConvolutionExpression | this_MultiArgExpression_10= ruleMultiArgExpression | this_ExternalMultiArgExpression_11= ruleExternalMultiArgExpression | this_SelectExpression_12= ruleSelectExpression )
            {
            // InternalAlpha.g:4576:2: ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_VariableExpression_4= ruleVariableExpression | this_IndexExpression_5= ruleIndexExpression | this_PolynomialIndexExpression_6= rulePolynomialIndexExpression | this_FuzzyIndexExpression_7= ruleFuzzyIndexExpression | this_Reductions_8= ruleReductions | this_ConvolutionExpression_9= ruleConvolutionExpression | this_MultiArgExpression_10= ruleMultiArgExpression | this_ExternalMultiArgExpression_11= ruleExternalMultiArgExpression | this_SelectExpression_12= ruleSelectExpression )
            int alt70=11;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // InternalAlpha.g:4577:3: (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' )
                    {
                    // InternalAlpha.g:4577:3: (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' )
                    // InternalAlpha.g:4578:4: otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_0, grammarAccess.getAlphaUnaryTerminalExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getAlphaUnaryTerminalExpressionAccess().getAlphaExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_AlphaExpression_1=ruleAlphaExpression();

                    state._fsp--;


                    				current = this_AlphaExpression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getAlphaUnaryTerminalExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4596:3: this_CaseExpression_3= ruleCaseExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaUnaryTerminalExpressionAccess().getCaseExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CaseExpression_3=ruleCaseExpression();

                    state._fsp--;


                    			current = this_CaseExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:4605:3: this_VariableExpression_4= ruleVariableExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaUnaryTerminalExpressionAccess().getVariableExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableExpression_4=ruleVariableExpression();

                    state._fsp--;


                    			current = this_VariableExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:4614:3: this_IndexExpression_5= ruleIndexExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaUnaryTerminalExpressionAccess().getIndexExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IndexExpression_5=ruleIndexExpression();

                    state._fsp--;


                    			current = this_IndexExpression_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:4623:3: this_PolynomialIndexExpression_6= rulePolynomialIndexExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaUnaryTerminalExpressionAccess().getPolynomialIndexExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PolynomialIndexExpression_6=rulePolynomialIndexExpression();

                    state._fsp--;


                    			current = this_PolynomialIndexExpression_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:4632:3: this_FuzzyIndexExpression_7= ruleFuzzyIndexExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaUnaryTerminalExpressionAccess().getFuzzyIndexExpressionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuzzyIndexExpression_7=ruleFuzzyIndexExpression();

                    state._fsp--;


                    			current = this_FuzzyIndexExpression_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAlpha.g:4641:3: this_Reductions_8= ruleReductions
                    {

                    			newCompositeNode(grammarAccess.getAlphaUnaryTerminalExpressionAccess().getReductionsParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reductions_8=ruleReductions();

                    state._fsp--;


                    			current = this_Reductions_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalAlpha.g:4650:3: this_ConvolutionExpression_9= ruleConvolutionExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaUnaryTerminalExpressionAccess().getConvolutionExpressionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConvolutionExpression_9=ruleConvolutionExpression();

                    state._fsp--;


                    			current = this_ConvolutionExpression_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalAlpha.g:4659:3: this_MultiArgExpression_10= ruleMultiArgExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaUnaryTerminalExpressionAccess().getMultiArgExpressionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiArgExpression_10=ruleMultiArgExpression();

                    state._fsp--;


                    			current = this_MultiArgExpression_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalAlpha.g:4668:3: this_ExternalMultiArgExpression_11= ruleExternalMultiArgExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaUnaryTerminalExpressionAccess().getExternalMultiArgExpressionParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalMultiArgExpression_11=ruleExternalMultiArgExpression();

                    state._fsp--;


                    			current = this_ExternalMultiArgExpression_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalAlpha.g:4677:3: this_SelectExpression_12= ruleSelectExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaUnaryTerminalExpressionAccess().getSelectExpressionParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectExpression_12=ruleSelectExpression();

                    state._fsp--;


                    			current = this_SelectExpression_12;
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
    // $ANTLR end "ruleAlphaUnaryTerminalExpression"


    // $ANTLR start "entryRuleReductions"
    // InternalAlpha.g:4689:1: entryRuleReductions returns [EObject current=null] : iv_ruleReductions= ruleReductions EOF ;
    public final EObject entryRuleReductions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReductions = null;


        try {
            // InternalAlpha.g:4689:51: (iv_ruleReductions= ruleReductions EOF )
            // InternalAlpha.g:4690:2: iv_ruleReductions= ruleReductions EOF
            {
             newCompositeNode(grammarAccess.getReductionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReductions=ruleReductions();

            state._fsp--;

             current =iv_ruleReductions; 
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
    // $ANTLR end "entryRuleReductions"


    // $ANTLR start "ruleReductions"
    // InternalAlpha.g:4696:1: ruleReductions returns [EObject current=null] : (this_ReduceExpression_0= ruleReduceExpression | this_ArgReduceExpression_1= ruleArgReduceExpression | this_ExternalReduceExpression_2= ruleExternalReduceExpression | this_ExternalArgReduceExpression_3= ruleExternalArgReduceExpression | this_FuzzyReduceExpression_4= ruleFuzzyReduceExpression | this_FuzzyArgReduceExpression_5= ruleFuzzyArgReduceExpression | this_ExternalFuzzyReduceExpression_6= ruleExternalFuzzyReduceExpression | this_ExternalFuzzyArgReduceExpression_7= ruleExternalFuzzyArgReduceExpression ) ;
    public final EObject ruleReductions() throws RecognitionException {
        EObject current = null;

        EObject this_ReduceExpression_0 = null;

        EObject this_ArgReduceExpression_1 = null;

        EObject this_ExternalReduceExpression_2 = null;

        EObject this_ExternalArgReduceExpression_3 = null;

        EObject this_FuzzyReduceExpression_4 = null;

        EObject this_FuzzyArgReduceExpression_5 = null;

        EObject this_ExternalFuzzyReduceExpression_6 = null;

        EObject this_ExternalFuzzyArgReduceExpression_7 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4702:2: ( (this_ReduceExpression_0= ruleReduceExpression | this_ArgReduceExpression_1= ruleArgReduceExpression | this_ExternalReduceExpression_2= ruleExternalReduceExpression | this_ExternalArgReduceExpression_3= ruleExternalArgReduceExpression | this_FuzzyReduceExpression_4= ruleFuzzyReduceExpression | this_FuzzyArgReduceExpression_5= ruleFuzzyArgReduceExpression | this_ExternalFuzzyReduceExpression_6= ruleExternalFuzzyReduceExpression | this_ExternalFuzzyArgReduceExpression_7= ruleExternalFuzzyArgReduceExpression ) )
            // InternalAlpha.g:4703:2: (this_ReduceExpression_0= ruleReduceExpression | this_ArgReduceExpression_1= ruleArgReduceExpression | this_ExternalReduceExpression_2= ruleExternalReduceExpression | this_ExternalArgReduceExpression_3= ruleExternalArgReduceExpression | this_FuzzyReduceExpression_4= ruleFuzzyReduceExpression | this_FuzzyArgReduceExpression_5= ruleFuzzyArgReduceExpression | this_ExternalFuzzyReduceExpression_6= ruleExternalFuzzyReduceExpression | this_ExternalFuzzyArgReduceExpression_7= ruleExternalFuzzyArgReduceExpression )
            {
            // InternalAlpha.g:4703:2: (this_ReduceExpression_0= ruleReduceExpression | this_ArgReduceExpression_1= ruleArgReduceExpression | this_ExternalReduceExpression_2= ruleExternalReduceExpression | this_ExternalArgReduceExpression_3= ruleExternalArgReduceExpression | this_FuzzyReduceExpression_4= ruleFuzzyReduceExpression | this_FuzzyArgReduceExpression_5= ruleFuzzyArgReduceExpression | this_ExternalFuzzyReduceExpression_6= ruleExternalFuzzyReduceExpression | this_ExternalFuzzyArgReduceExpression_7= ruleExternalFuzzyArgReduceExpression )
            int alt71=8;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // InternalAlpha.g:4704:3: this_ReduceExpression_0= ruleReduceExpression
                    {

                    			newCompositeNode(grammarAccess.getReductionsAccess().getReduceExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReduceExpression_0=ruleReduceExpression();

                    state._fsp--;


                    			current = this_ReduceExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4713:3: this_ArgReduceExpression_1= ruleArgReduceExpression
                    {

                    			newCompositeNode(grammarAccess.getReductionsAccess().getArgReduceExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArgReduceExpression_1=ruleArgReduceExpression();

                    state._fsp--;


                    			current = this_ArgReduceExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:4722:3: this_ExternalReduceExpression_2= ruleExternalReduceExpression
                    {

                    			newCompositeNode(grammarAccess.getReductionsAccess().getExternalReduceExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalReduceExpression_2=ruleExternalReduceExpression();

                    state._fsp--;


                    			current = this_ExternalReduceExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:4731:3: this_ExternalArgReduceExpression_3= ruleExternalArgReduceExpression
                    {

                    			newCompositeNode(grammarAccess.getReductionsAccess().getExternalArgReduceExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalArgReduceExpression_3=ruleExternalArgReduceExpression();

                    state._fsp--;


                    			current = this_ExternalArgReduceExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:4740:3: this_FuzzyReduceExpression_4= ruleFuzzyReduceExpression
                    {

                    			newCompositeNode(grammarAccess.getReductionsAccess().getFuzzyReduceExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuzzyReduceExpression_4=ruleFuzzyReduceExpression();

                    state._fsp--;


                    			current = this_FuzzyReduceExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:4749:3: this_FuzzyArgReduceExpression_5= ruleFuzzyArgReduceExpression
                    {

                    			newCompositeNode(grammarAccess.getReductionsAccess().getFuzzyArgReduceExpressionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuzzyArgReduceExpression_5=ruleFuzzyArgReduceExpression();

                    state._fsp--;


                    			current = this_FuzzyArgReduceExpression_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAlpha.g:4758:3: this_ExternalFuzzyReduceExpression_6= ruleExternalFuzzyReduceExpression
                    {

                    			newCompositeNode(grammarAccess.getReductionsAccess().getExternalFuzzyReduceExpressionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalFuzzyReduceExpression_6=ruleExternalFuzzyReduceExpression();

                    state._fsp--;


                    			current = this_ExternalFuzzyReduceExpression_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalAlpha.g:4767:3: this_ExternalFuzzyArgReduceExpression_7= ruleExternalFuzzyArgReduceExpression
                    {

                    			newCompositeNode(grammarAccess.getReductionsAccess().getExternalFuzzyArgReduceExpressionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalFuzzyArgReduceExpression_7=ruleExternalFuzzyArgReduceExpression();

                    state._fsp--;


                    			current = this_ExternalFuzzyArgReduceExpression_7;
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
    // $ANTLR end "ruleReductions"


    // $ANTLR start "entryRuleIfExpression"
    // InternalAlpha.g:4779:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // InternalAlpha.g:4779:53: (iv_ruleIfExpression= ruleIfExpression EOF )
            // InternalAlpha.g:4780:2: iv_ruleIfExpression= ruleIfExpression EOF
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
    // InternalAlpha.g:4786:1: ruleIfExpression returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condExpr_1_0= ruleAlphaExpression ) ) otherlv_2= 'then' ( (lv_thenExpr_3_0= ruleAlphaExpression ) ) otherlv_4= 'else' ( (lv_elseExpr_5_0= ruleAlphaExpression ) ) ) ;
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
            // InternalAlpha.g:4792:2: ( (otherlv_0= 'if' ( (lv_condExpr_1_0= ruleAlphaExpression ) ) otherlv_2= 'then' ( (lv_thenExpr_3_0= ruleAlphaExpression ) ) otherlv_4= 'else' ( (lv_elseExpr_5_0= ruleAlphaExpression ) ) ) )
            // InternalAlpha.g:4793:2: (otherlv_0= 'if' ( (lv_condExpr_1_0= ruleAlphaExpression ) ) otherlv_2= 'then' ( (lv_thenExpr_3_0= ruleAlphaExpression ) ) otherlv_4= 'else' ( (lv_elseExpr_5_0= ruleAlphaExpression ) ) )
            {
            // InternalAlpha.g:4793:2: (otherlv_0= 'if' ( (lv_condExpr_1_0= ruleAlphaExpression ) ) otherlv_2= 'then' ( (lv_thenExpr_3_0= ruleAlphaExpression ) ) otherlv_4= 'else' ( (lv_elseExpr_5_0= ruleAlphaExpression ) ) )
            // InternalAlpha.g:4794:3: otherlv_0= 'if' ( (lv_condExpr_1_0= ruleAlphaExpression ) ) otherlv_2= 'then' ( (lv_thenExpr_3_0= ruleAlphaExpression ) ) otherlv_4= 'else' ( (lv_elseExpr_5_0= ruleAlphaExpression ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getIfExpressionAccess().getIfKeyword_0());
            		
            // InternalAlpha.g:4798:3: ( (lv_condExpr_1_0= ruleAlphaExpression ) )
            // InternalAlpha.g:4799:4: (lv_condExpr_1_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:4799:4: (lv_condExpr_1_0= ruleAlphaExpression )
            // InternalAlpha.g:4800:5: lv_condExpr_1_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getIfExpressionAccess().getCondExprAlphaExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_63);
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

            otherlv_2=(Token)match(input,59,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getIfExpressionAccess().getThenKeyword_2());
            		
            // InternalAlpha.g:4821:3: ( (lv_thenExpr_3_0= ruleAlphaExpression ) )
            // InternalAlpha.g:4822:4: (lv_thenExpr_3_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:4822:4: (lv_thenExpr_3_0= ruleAlphaExpression )
            // InternalAlpha.g:4823:5: lv_thenExpr_3_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getIfExpressionAccess().getThenExprAlphaExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_64);
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

            otherlv_4=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getIfExpressionAccess().getElseKeyword_4());
            		
            // InternalAlpha.g:4844:3: ( (lv_elseExpr_5_0= ruleAlphaExpression ) )
            // InternalAlpha.g:4845:4: (lv_elseExpr_5_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:4845:4: (lv_elseExpr_5_0= ruleAlphaExpression )
            // InternalAlpha.g:4846:5: lv_elseExpr_5_0= ruleAlphaExpression
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
    // InternalAlpha.g:4867:1: entryRuleRestrictExpression returns [EObject current=null] : iv_ruleRestrictExpression= ruleRestrictExpression EOF ;
    public final EObject entryRuleRestrictExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictExpression = null;


        try {
            // InternalAlpha.g:4867:59: (iv_ruleRestrictExpression= ruleRestrictExpression EOF )
            // InternalAlpha.g:4868:2: iv_ruleRestrictExpression= ruleRestrictExpression EOF
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
    // InternalAlpha.g:4874:1: ruleRestrictExpression returns [EObject current=null] : ( ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) | (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) ) ) ;
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
            // InternalAlpha.g:4880:2: ( ( ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) | (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) ) ) )
            // InternalAlpha.g:4881:2: ( ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) | (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) ) )
            {
            // InternalAlpha.g:4881:2: ( ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) | (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) ) )
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // InternalAlpha.g:4882:3: ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) )
                    {
                    // InternalAlpha.g:4882:3: ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) )
                    // InternalAlpha.g:4883:4: ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) )
                    {
                    // InternalAlpha.g:4883:4: ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) )
                    // InternalAlpha.g:4884:5: ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) )
                    {
                    // InternalAlpha.g:4884:5: ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) )
                    // InternalAlpha.g:4885:6: (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation )
                    {
                    // InternalAlpha.g:4885:6: (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation )
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==19) ) {
                        int LA72_1 = input.LA(2);

                        if ( (LA72_1==33) ) {
                            alt72=2;
                        }
                        else if ( (LA72_1==37) ) {
                            alt72=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 72, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA72_0==42) ) {
                        alt72=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 0, input);

                        throw nvae;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalAlpha.g:4886:7: lv_domainExpr_0_1= ruleJNIDomain
                            {

                            							newCompositeNode(grammarAccess.getRestrictExpressionAccess().getDomainExprJNIDomainParserRuleCall_0_0_0_0());
                            						
                            pushFollow(FOLLOW_26);
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
                            // InternalAlpha.g:4902:7: lv_domainExpr_0_2= ruleJNIDomainInArrayNotation
                            {

                            							newCompositeNode(grammarAccess.getRestrictExpressionAccess().getDomainExprJNIDomainInArrayNotationParserRuleCall_0_0_0_1());
                            						
                            pushFollow(FOLLOW_26);
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

                    otherlv_1=(Token)match(input,33,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getRestrictExpressionAccess().getColonKeyword_0_1());
                    			
                    // InternalAlpha.g:4924:4: ( (lv_expr_2_0= ruleAlphaExpression ) )
                    // InternalAlpha.g:4925:5: (lv_expr_2_0= ruleAlphaExpression )
                    {
                    // InternalAlpha.g:4925:5: (lv_expr_2_0= ruleAlphaExpression )
                    // InternalAlpha.g:4926:6: lv_expr_2_0= ruleAlphaExpression
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
                    // InternalAlpha.g:4945:3: (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) )
                    {
                    // InternalAlpha.g:4945:3: (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) )
                    // InternalAlpha.g:4946:4: otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getRestrictExpressionAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalAlpha.g:4950:4: ( (lv_domainExpr_4_0= ruleCalculatorExpression ) )
                    // InternalAlpha.g:4951:5: (lv_domainExpr_4_0= ruleCalculatorExpression )
                    {
                    // InternalAlpha.g:4951:5: (lv_domainExpr_4_0= ruleCalculatorExpression )
                    // InternalAlpha.g:4952:6: lv_domainExpr_4_0= ruleCalculatorExpression
                    {

                    						newCompositeNode(grammarAccess.getRestrictExpressionAccess().getDomainExprCalculatorExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_5=(Token)match(input,20,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getRestrictExpressionAccess().getRightCurlyBracketKeyword_1_2());
                    			
                    otherlv_6=(Token)match(input,33,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getRestrictExpressionAccess().getColonKeyword_1_3());
                    			
                    // InternalAlpha.g:4977:4: ( (lv_expr_7_0= ruleAlphaExpression ) )
                    // InternalAlpha.g:4978:5: (lv_expr_7_0= ruleAlphaExpression )
                    {
                    // InternalAlpha.g:4978:5: (lv_expr_7_0= ruleAlphaExpression )
                    // InternalAlpha.g:4979:6: lv_expr_7_0= ruleAlphaExpression
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
    // InternalAlpha.g:5001:1: entryRuleAutoRestrictExpression returns [EObject current=null] : iv_ruleAutoRestrictExpression= ruleAutoRestrictExpression EOF ;
    public final EObject entryRuleAutoRestrictExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoRestrictExpression = null;


        try {
            // InternalAlpha.g:5001:63: (iv_ruleAutoRestrictExpression= ruleAutoRestrictExpression EOF )
            // InternalAlpha.g:5002:2: iv_ruleAutoRestrictExpression= ruleAutoRestrictExpression EOF
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
    // InternalAlpha.g:5008:1: ruleAutoRestrictExpression returns [EObject current=null] : (otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) ;
    public final EObject ruleAutoRestrictExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5014:2: ( (otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) )
            // InternalAlpha.g:5015:2: (otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) )
            {
            // InternalAlpha.g:5015:2: (otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) )
            // InternalAlpha.g:5016:3: otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAutoRestrictExpressionAccess().getAutoKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getAutoRestrictExpressionAccess().getColonKeyword_1());
            		
            // InternalAlpha.g:5024:3: ( (lv_expr_2_0= ruleAlphaExpression ) )
            // InternalAlpha.g:5025:4: (lv_expr_2_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:5025:4: (lv_expr_2_0= ruleAlphaExpression )
            // InternalAlpha.g:5026:5: lv_expr_2_0= ruleAlphaExpression
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
    // InternalAlpha.g:5047:1: entryRuleCaseExpression returns [EObject current=null] : iv_ruleCaseExpression= ruleCaseExpression EOF ;
    public final EObject entryRuleCaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseExpression = null;


        try {
            // InternalAlpha.g:5047:55: (iv_ruleCaseExpression= ruleCaseExpression EOF )
            // InternalAlpha.g:5048:2: iv_ruleCaseExpression= ruleCaseExpression EOF
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
    // InternalAlpha.g:5054:1: ruleCaseExpression returns [EObject current=null] : (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' ) ;
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
            // InternalAlpha.g:5060:2: ( (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' ) )
            // InternalAlpha.g:5061:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' )
            {
            // InternalAlpha.g:5061:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' )
            // InternalAlpha.g:5062:3: otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_65); 

            			newLeafNode(otherlv_0, grammarAccess.getCaseExpressionAccess().getCaseKeyword_0());
            		
            // InternalAlpha.g:5066:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_ID) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalAlpha.g:5067:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalAlpha.g:5067:4: (lv_name_1_0= RULE_ID )
                    // InternalAlpha.g:5068:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getCaseExpressionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlpha.g:5088:3: ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+
            int cnt75=0;
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( ((LA75_0>=RULE_ID && LA75_0<=RULE_INT)||LA75_0==RULE_BOOLEAN||LA75_0==15||LA75_0==19||LA75_0==39||(LA75_0>=42 && LA75_0<=45)||(LA75_0>=48 && LA75_0<=49)||LA75_0==58||(LA75_0>=60 && LA75_0<=61)||(LA75_0>=63 && LA75_0<=67)||(LA75_0>=69 && LA75_0<=73)||LA75_0==75) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalAlpha.g:5089:4: ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';'
            	    {
            	    // InternalAlpha.g:5089:4: ( (lv_exprs_3_0= ruleAlphaExpression ) )
            	    // InternalAlpha.g:5090:5: (lv_exprs_3_0= ruleAlphaExpression )
            	    {
            	    // InternalAlpha.g:5090:5: (lv_exprs_3_0= ruleAlphaExpression )
            	    // InternalAlpha.g:5091:6: lv_exprs_3_0= ruleAlphaExpression
            	    {

            	    						newCompositeNode(grammarAccess.getCaseExpressionAccess().getExprsAlphaExpressionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_59);
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

            	    otherlv_4=(Token)match(input,34,FOLLOW_66); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCaseExpressionAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt75 >= 1 ) break loop75;
                        EarlyExitException eee =
                            new EarlyExitException(75, input);
                        throw eee;
                }
                cnt75++;
            } while (true);

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

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
    // InternalAlpha.g:5121:1: entryRuleDependenceExpression returns [EObject current=null] : iv_ruleDependenceExpression= ruleDependenceExpression EOF ;
    public final EObject entryRuleDependenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependenceExpression = null;


        try {
            // InternalAlpha.g:5121:61: (iv_ruleDependenceExpression= ruleDependenceExpression EOF )
            // InternalAlpha.g:5122:2: iv_ruleDependenceExpression= ruleDependenceExpression EOF
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
    // InternalAlpha.g:5128:1: ruleDependenceExpression returns [EObject current=null] : ( ( ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) ) ) | ( ( (lv_expr_5_0= ruleConstantExpression ) ) ( (lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation ) ) ) ) ;
    public final EObject ruleDependenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_functionExpr_0_0 = null;

        EObject lv_expr_2_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_functionExpr_4_0 = null;

        EObject lv_expr_5_0 = null;

        EObject lv_functionExpr_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5134:2: ( ( ( ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) ) ) | ( ( (lv_expr_5_0= ruleConstantExpression ) ) ( (lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation ) ) ) ) )
            // InternalAlpha.g:5135:2: ( ( ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) ) ) | ( ( (lv_expr_5_0= ruleConstantExpression ) ) ( (lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation ) ) ) )
            {
            // InternalAlpha.g:5135:2: ( ( ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) ) ) | ( ( (lv_expr_5_0= ruleConstantExpression ) ) ( (lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation ) ) ) )
            int alt76=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt76=1;
                }
                break;
            case RULE_ID:
                {
                alt76=2;
                }
                break;
            case RULE_INT:
            case RULE_BOOLEAN:
            case 44:
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
                    // InternalAlpha.g:5136:3: ( ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) )
                    {
                    // InternalAlpha.g:5136:3: ( ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) )
                    // InternalAlpha.g:5137:4: ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) )
                    {
                    // InternalAlpha.g:5137:4: ( (lv_functionExpr_0_0= ruleJNIFunction ) )
                    // InternalAlpha.g:5138:5: (lv_functionExpr_0_0= ruleJNIFunction )
                    {
                    // InternalAlpha.g:5138:5: (lv_functionExpr_0_0= ruleJNIFunction )
                    // InternalAlpha.g:5139:6: lv_functionExpr_0_0= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getDependenceExpressionAccess().getFunctionExprJNIFunctionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_67);
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

                    otherlv_1=(Token)match(input,62,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getDependenceExpressionAccess().getCommercialAtKeyword_0_1());
                    			
                    // InternalAlpha.g:5160:4: ( (lv_expr_2_0= ruleAlphaTerminalExpression ) )
                    // InternalAlpha.g:5161:5: (lv_expr_2_0= ruleAlphaTerminalExpression )
                    {
                    // InternalAlpha.g:5161:5: (lv_expr_2_0= ruleAlphaTerminalExpression )
                    // InternalAlpha.g:5162:6: lv_expr_2_0= ruleAlphaTerminalExpression
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
                    // InternalAlpha.g:5181:3: ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) ) )
                    {
                    // InternalAlpha.g:5181:3: ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) ) )
                    // InternalAlpha.g:5182:4: ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) )
                    {
                    // InternalAlpha.g:5182:4: ( (lv_expr_3_0= ruleVariableExpression ) )
                    // InternalAlpha.g:5183:5: (lv_expr_3_0= ruleVariableExpression )
                    {
                    // InternalAlpha.g:5183:5: (lv_expr_3_0= ruleVariableExpression )
                    // InternalAlpha.g:5184:6: lv_expr_3_0= ruleVariableExpression
                    {

                    						newCompositeNode(grammarAccess.getDependenceExpressionAccess().getExprVariableExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_12);
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

                    // InternalAlpha.g:5201:4: ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) )
                    // InternalAlpha.g:5202:5: (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation )
                    {
                    // InternalAlpha.g:5202:5: (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation )
                    // InternalAlpha.g:5203:6: lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation
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
                case 3 :
                    // InternalAlpha.g:5222:3: ( ( (lv_expr_5_0= ruleConstantExpression ) ) ( (lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation ) ) )
                    {
                    // InternalAlpha.g:5222:3: ( ( (lv_expr_5_0= ruleConstantExpression ) ) ( (lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation ) ) )
                    // InternalAlpha.g:5223:4: ( (lv_expr_5_0= ruleConstantExpression ) ) ( (lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation ) )
                    {
                    // InternalAlpha.g:5223:4: ( (lv_expr_5_0= ruleConstantExpression ) )
                    // InternalAlpha.g:5224:5: (lv_expr_5_0= ruleConstantExpression )
                    {
                    // InternalAlpha.g:5224:5: (lv_expr_5_0= ruleConstantExpression )
                    // InternalAlpha.g:5225:6: lv_expr_5_0= ruleConstantExpression
                    {

                    						newCompositeNode(grammarAccess.getDependenceExpressionAccess().getExprConstantExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_expr_5_0=ruleConstantExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDependenceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_5_0,
                    							"alpha.model.Alpha.ConstantExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlpha.g:5242:4: ( (lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation ) )
                    // InternalAlpha.g:5243:5: (lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation )
                    {
                    // InternalAlpha.g:5243:5: (lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation )
                    // InternalAlpha.g:5244:6: lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getDependenceExpressionAccess().getFunctionExprJNIFunctionInArrayNotationParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_functionExpr_6_0=ruleJNIFunctionInArrayNotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDependenceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"functionExpr",
                    							lv_functionExpr_6_0,
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
    // InternalAlpha.g:5266:1: entryRuleFuzzyDependenceExpression returns [EObject current=null] : iv_ruleFuzzyDependenceExpression= ruleFuzzyDependenceExpression EOF ;
    public final EObject entryRuleFuzzyDependenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyDependenceExpression = null;


        try {
            // InternalAlpha.g:5266:66: (iv_ruleFuzzyDependenceExpression= ruleFuzzyDependenceExpression EOF )
            // InternalAlpha.g:5267:2: iv_ruleFuzzyDependenceExpression= ruleFuzzyDependenceExpression EOF
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
    // InternalAlpha.g:5273:1: ruleFuzzyDependenceExpression returns [EObject current=null] : ( ( ( (lv_fuzzyFunction_0_0= ruleFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation ) ) ) ) ;
    public final EObject ruleFuzzyDependenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_fuzzyFunction_0_0 = null;

        EObject lv_expr_2_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_fuzzyFunction_4_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5279:2: ( ( ( ( (lv_fuzzyFunction_0_0= ruleFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation ) ) ) ) )
            // InternalAlpha.g:5280:2: ( ( ( (lv_fuzzyFunction_0_0= ruleFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation ) ) ) )
            {
            // InternalAlpha.g:5280:2: ( ( ( (lv_fuzzyFunction_0_0= ruleFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation ) ) ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==15) ) {
                alt77=1;
            }
            else if ( (LA77_0==RULE_ID) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalAlpha.g:5281:3: ( ( (lv_fuzzyFunction_0_0= ruleFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) )
                    {
                    // InternalAlpha.g:5281:3: ( ( (lv_fuzzyFunction_0_0= ruleFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) )
                    // InternalAlpha.g:5282:4: ( (lv_fuzzyFunction_0_0= ruleFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) )
                    {
                    // InternalAlpha.g:5282:4: ( (lv_fuzzyFunction_0_0= ruleFuzzyFunction ) )
                    // InternalAlpha.g:5283:5: (lv_fuzzyFunction_0_0= ruleFuzzyFunction )
                    {
                    // InternalAlpha.g:5283:5: (lv_fuzzyFunction_0_0= ruleFuzzyFunction )
                    // InternalAlpha.g:5284:6: lv_fuzzyFunction_0_0= ruleFuzzyFunction
                    {

                    						newCompositeNode(grammarAccess.getFuzzyDependenceExpressionAccess().getFuzzyFunctionFuzzyFunctionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_fuzzyFunction_0_0=ruleFuzzyFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuzzyDependenceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"fuzzyFunction",
                    							lv_fuzzyFunction_0_0,
                    							"alpha.model.Alpha.FuzzyFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,62,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getFuzzyDependenceExpressionAccess().getCommercialAtKeyword_0_1());
                    			
                    // InternalAlpha.g:5305:4: ( (lv_expr_2_0= ruleAlphaTerminalExpression ) )
                    // InternalAlpha.g:5306:5: (lv_expr_2_0= ruleAlphaTerminalExpression )
                    {
                    // InternalAlpha.g:5306:5: (lv_expr_2_0= ruleAlphaTerminalExpression )
                    // InternalAlpha.g:5307:6: lv_expr_2_0= ruleAlphaTerminalExpression
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
                    // InternalAlpha.g:5326:3: ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation ) ) )
                    {
                    // InternalAlpha.g:5326:3: ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation ) ) )
                    // InternalAlpha.g:5327:4: ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation ) )
                    {
                    // InternalAlpha.g:5327:4: ( (lv_expr_3_0= ruleVariableExpression ) )
                    // InternalAlpha.g:5328:5: (lv_expr_3_0= ruleVariableExpression )
                    {
                    // InternalAlpha.g:5328:5: (lv_expr_3_0= ruleVariableExpression )
                    // InternalAlpha.g:5329:6: lv_expr_3_0= ruleVariableExpression
                    {

                    						newCompositeNode(grammarAccess.getFuzzyDependenceExpressionAccess().getExprVariableExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_68);
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

                    // InternalAlpha.g:5346:4: ( (lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation ) )
                    // InternalAlpha.g:5347:5: (lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation )
                    {
                    // InternalAlpha.g:5347:5: (lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation )
                    // InternalAlpha.g:5348:6: lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getFuzzyDependenceExpressionAccess().getFuzzyFunctionFuzzyFunctionInArrayNotationParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_fuzzyFunction_4_0=ruleFuzzyFunctionInArrayNotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuzzyDependenceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"fuzzyFunction",
                    							lv_fuzzyFunction_4_0,
                    							"alpha.model.Alpha.FuzzyFunctionInArrayNotation");
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
    // InternalAlpha.g:5370:1: entryRuleIndexExpression returns [EObject current=null] : iv_ruleIndexExpression= ruleIndexExpression EOF ;
    public final EObject entryRuleIndexExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexExpression = null;


        try {
            // InternalAlpha.g:5370:56: (iv_ruleIndexExpression= ruleIndexExpression EOF )
            // InternalAlpha.g:5371:2: iv_ruleIndexExpression= ruleIndexExpression EOF
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
    // InternalAlpha.g:5377:1: ruleIndexExpression returns [EObject current=null] : ( (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) ) ) | (otherlv_2= 'val' ( (lv_functionExpr_3_0= ruleJNIFunctionInArrayNotation ) ) ) ) ;
    public final EObject ruleIndexExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_functionExpr_1_0 = null;

        EObject lv_functionExpr_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5383:2: ( ( (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) ) ) | (otherlv_2= 'val' ( (lv_functionExpr_3_0= ruleJNIFunctionInArrayNotation ) ) ) ) )
            // InternalAlpha.g:5384:2: ( (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) ) ) | (otherlv_2= 'val' ( (lv_functionExpr_3_0= ruleJNIFunctionInArrayNotation ) ) ) )
            {
            // InternalAlpha.g:5384:2: ( (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) ) ) | (otherlv_2= 'val' ( (lv_functionExpr_3_0= ruleJNIFunctionInArrayNotation ) ) ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==63) ) {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==15) ) {
                    alt78=1;
                }
                else if ( (LA78_1==37) ) {
                    alt78=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalAlpha.g:5385:3: (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) ) )
                    {
                    // InternalAlpha.g:5385:3: (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) ) )
                    // InternalAlpha.g:5386:4: otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) )
                    {
                    otherlv_0=(Token)match(input,63,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getIndexExpressionAccess().getValKeyword_0_0());
                    			
                    // InternalAlpha.g:5390:4: ( (lv_functionExpr_1_0= ruleJNIFunction ) )
                    // InternalAlpha.g:5391:5: (lv_functionExpr_1_0= ruleJNIFunction )
                    {
                    // InternalAlpha.g:5391:5: (lv_functionExpr_1_0= ruleJNIFunction )
                    // InternalAlpha.g:5392:6: lv_functionExpr_1_0= ruleJNIFunction
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
                    // InternalAlpha.g:5411:3: (otherlv_2= 'val' ( (lv_functionExpr_3_0= ruleJNIFunctionInArrayNotation ) ) )
                    {
                    // InternalAlpha.g:5411:3: (otherlv_2= 'val' ( (lv_functionExpr_3_0= ruleJNIFunctionInArrayNotation ) ) )
                    // InternalAlpha.g:5412:4: otherlv_2= 'val' ( (lv_functionExpr_3_0= ruleJNIFunctionInArrayNotation ) )
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getIndexExpressionAccess().getValKeyword_1_0());
                    			
                    // InternalAlpha.g:5416:4: ( (lv_functionExpr_3_0= ruleJNIFunctionInArrayNotation ) )
                    // InternalAlpha.g:5417:5: (lv_functionExpr_3_0= ruleJNIFunctionInArrayNotation )
                    {
                    // InternalAlpha.g:5417:5: (lv_functionExpr_3_0= ruleJNIFunctionInArrayNotation )
                    // InternalAlpha.g:5418:6: lv_functionExpr_3_0= ruleJNIFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getIndexExpressionAccess().getFunctionExprJNIFunctionInArrayNotationParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_functionExpr_3_0=ruleJNIFunctionInArrayNotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIndexExpressionRule());
                    						}
                    						set(
                    							current,
                    							"functionExpr",
                    							lv_functionExpr_3_0,
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
    // $ANTLR end "ruleIndexExpression"


    // $ANTLR start "entryRulePolynomialIndexExpression"
    // InternalAlpha.g:5440:1: entryRulePolynomialIndexExpression returns [EObject current=null] : iv_rulePolynomialIndexExpression= rulePolynomialIndexExpression EOF ;
    public final EObject entryRulePolynomialIndexExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolynomialIndexExpression = null;


        try {
            // InternalAlpha.g:5440:66: (iv_rulePolynomialIndexExpression= rulePolynomialIndexExpression EOF )
            // InternalAlpha.g:5441:2: iv_rulePolynomialIndexExpression= rulePolynomialIndexExpression EOF
            {
             newCompositeNode(grammarAccess.getPolynomialIndexExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolynomialIndexExpression=rulePolynomialIndexExpression();

            state._fsp--;

             current =iv_rulePolynomialIndexExpression; 
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
    // $ANTLR end "entryRulePolynomialIndexExpression"


    // $ANTLR start "rulePolynomialIndexExpression"
    // InternalAlpha.g:5447:1: rulePolynomialIndexExpression returns [EObject current=null] : ( (otherlv_0= 'val' ( (lv_polynomialExpr_1_0= ruleJNIPolynomial ) ) ) | (otherlv_2= 'val' ( (lv_polynomialExpr_3_0= ruleJNIPolynomialInArrayNotation ) ) ) ) ;
    public final EObject rulePolynomialIndexExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_polynomialExpr_1_0 = null;

        EObject lv_polynomialExpr_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5453:2: ( ( (otherlv_0= 'val' ( (lv_polynomialExpr_1_0= ruleJNIPolynomial ) ) ) | (otherlv_2= 'val' ( (lv_polynomialExpr_3_0= ruleJNIPolynomialInArrayNotation ) ) ) ) )
            // InternalAlpha.g:5454:2: ( (otherlv_0= 'val' ( (lv_polynomialExpr_1_0= ruleJNIPolynomial ) ) ) | (otherlv_2= 'val' ( (lv_polynomialExpr_3_0= ruleJNIPolynomialInArrayNotation ) ) ) )
            {
            // InternalAlpha.g:5454:2: ( (otherlv_0= 'val' ( (lv_polynomialExpr_1_0= ruleJNIPolynomial ) ) ) | (otherlv_2= 'val' ( (lv_polynomialExpr_3_0= ruleJNIPolynomialInArrayNotation ) ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==63) ) {
                int LA79_1 = input.LA(2);

                if ( (LA79_1==19) ) {
                    int LA79_2 = input.LA(3);

                    if ( ((LA79_2>=RULE_ID && LA79_2<=RULE_INT)||(LA79_2>=15 && LA79_2<=16)||(LA79_2>=43 && LA79_2<=46)||LA79_2==56) ) {
                        alt79=2;
                    }
                    else if ( (LA79_2==37) ) {
                        alt79=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalAlpha.g:5455:3: (otherlv_0= 'val' ( (lv_polynomialExpr_1_0= ruleJNIPolynomial ) ) )
                    {
                    // InternalAlpha.g:5455:3: (otherlv_0= 'val' ( (lv_polynomialExpr_1_0= ruleJNIPolynomial ) ) )
                    // InternalAlpha.g:5456:4: otherlv_0= 'val' ( (lv_polynomialExpr_1_0= ruleJNIPolynomial ) )
                    {
                    otherlv_0=(Token)match(input,63,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getPolynomialIndexExpressionAccess().getValKeyword_0_0());
                    			
                    // InternalAlpha.g:5460:4: ( (lv_polynomialExpr_1_0= ruleJNIPolynomial ) )
                    // InternalAlpha.g:5461:5: (lv_polynomialExpr_1_0= ruleJNIPolynomial )
                    {
                    // InternalAlpha.g:5461:5: (lv_polynomialExpr_1_0= ruleJNIPolynomial )
                    // InternalAlpha.g:5462:6: lv_polynomialExpr_1_0= ruleJNIPolynomial
                    {

                    						newCompositeNode(grammarAccess.getPolynomialIndexExpressionAccess().getPolynomialExprJNIPolynomialParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_polynomialExpr_1_0=ruleJNIPolynomial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPolynomialIndexExpressionRule());
                    						}
                    						set(
                    							current,
                    							"polynomialExpr",
                    							lv_polynomialExpr_1_0,
                    							"alpha.model.Alpha.JNIPolynomial");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5481:3: (otherlv_2= 'val' ( (lv_polynomialExpr_3_0= ruleJNIPolynomialInArrayNotation ) ) )
                    {
                    // InternalAlpha.g:5481:3: (otherlv_2= 'val' ( (lv_polynomialExpr_3_0= ruleJNIPolynomialInArrayNotation ) ) )
                    // InternalAlpha.g:5482:4: otherlv_2= 'val' ( (lv_polynomialExpr_3_0= ruleJNIPolynomialInArrayNotation ) )
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getPolynomialIndexExpressionAccess().getValKeyword_1_0());
                    			
                    // InternalAlpha.g:5486:4: ( (lv_polynomialExpr_3_0= ruleJNIPolynomialInArrayNotation ) )
                    // InternalAlpha.g:5487:5: (lv_polynomialExpr_3_0= ruleJNIPolynomialInArrayNotation )
                    {
                    // InternalAlpha.g:5487:5: (lv_polynomialExpr_3_0= ruleJNIPolynomialInArrayNotation )
                    // InternalAlpha.g:5488:6: lv_polynomialExpr_3_0= ruleJNIPolynomialInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getPolynomialIndexExpressionAccess().getPolynomialExprJNIPolynomialInArrayNotationParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_polynomialExpr_3_0=ruleJNIPolynomialInArrayNotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPolynomialIndexExpressionRule());
                    						}
                    						set(
                    							current,
                    							"polynomialExpr",
                    							lv_polynomialExpr_3_0,
                    							"alpha.model.Alpha.JNIPolynomialInArrayNotation");
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
    // $ANTLR end "rulePolynomialIndexExpression"


    // $ANTLR start "entryRuleFuzzyIndexExpression"
    // InternalAlpha.g:5510:1: entryRuleFuzzyIndexExpression returns [EObject current=null] : iv_ruleFuzzyIndexExpression= ruleFuzzyIndexExpression EOF ;
    public final EObject entryRuleFuzzyIndexExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyIndexExpression = null;


        try {
            // InternalAlpha.g:5510:61: (iv_ruleFuzzyIndexExpression= ruleFuzzyIndexExpression EOF )
            // InternalAlpha.g:5511:2: iv_ruleFuzzyIndexExpression= ruleFuzzyIndexExpression EOF
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
    // InternalAlpha.g:5517:1: ruleFuzzyIndexExpression returns [EObject current=null] : ( (otherlv_0= 'val' ( (lv_fuzzyFunction_1_0= ruleFuzzyFunction ) ) ) | ( (lv_fuzzyFunction_2_0= ruleFuzzyFunctionInArrayNotation ) ) ) ;
    public final EObject ruleFuzzyIndexExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fuzzyFunction_1_0 = null;

        EObject lv_fuzzyFunction_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5523:2: ( ( (otherlv_0= 'val' ( (lv_fuzzyFunction_1_0= ruleFuzzyFunction ) ) ) | ( (lv_fuzzyFunction_2_0= ruleFuzzyFunctionInArrayNotation ) ) ) )
            // InternalAlpha.g:5524:2: ( (otherlv_0= 'val' ( (lv_fuzzyFunction_1_0= ruleFuzzyFunction ) ) ) | ( (lv_fuzzyFunction_2_0= ruleFuzzyFunctionInArrayNotation ) ) )
            {
            // InternalAlpha.g:5524:2: ( (otherlv_0= 'val' ( (lv_fuzzyFunction_1_0= ruleFuzzyFunction ) ) ) | ( (lv_fuzzyFunction_2_0= ruleFuzzyFunctionInArrayNotation ) ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==63) ) {
                alt80=1;
            }
            else if ( (LA80_0==39) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalAlpha.g:5525:3: (otherlv_0= 'val' ( (lv_fuzzyFunction_1_0= ruleFuzzyFunction ) ) )
                    {
                    // InternalAlpha.g:5525:3: (otherlv_0= 'val' ( (lv_fuzzyFunction_1_0= ruleFuzzyFunction ) ) )
                    // InternalAlpha.g:5526:4: otherlv_0= 'val' ( (lv_fuzzyFunction_1_0= ruleFuzzyFunction ) )
                    {
                    otherlv_0=(Token)match(input,63,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getFuzzyIndexExpressionAccess().getValKeyword_0_0());
                    			
                    // InternalAlpha.g:5530:4: ( (lv_fuzzyFunction_1_0= ruleFuzzyFunction ) )
                    // InternalAlpha.g:5531:5: (lv_fuzzyFunction_1_0= ruleFuzzyFunction )
                    {
                    // InternalAlpha.g:5531:5: (lv_fuzzyFunction_1_0= ruleFuzzyFunction )
                    // InternalAlpha.g:5532:6: lv_fuzzyFunction_1_0= ruleFuzzyFunction
                    {

                    						newCompositeNode(grammarAccess.getFuzzyIndexExpressionAccess().getFuzzyFunctionFuzzyFunctionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_fuzzyFunction_1_0=ruleFuzzyFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuzzyIndexExpressionRule());
                    						}
                    						set(
                    							current,
                    							"fuzzyFunction",
                    							lv_fuzzyFunction_1_0,
                    							"alpha.model.Alpha.FuzzyFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5551:3: ( (lv_fuzzyFunction_2_0= ruleFuzzyFunctionInArrayNotation ) )
                    {
                    // InternalAlpha.g:5551:3: ( (lv_fuzzyFunction_2_0= ruleFuzzyFunctionInArrayNotation ) )
                    // InternalAlpha.g:5552:4: (lv_fuzzyFunction_2_0= ruleFuzzyFunctionInArrayNotation )
                    {
                    // InternalAlpha.g:5552:4: (lv_fuzzyFunction_2_0= ruleFuzzyFunctionInArrayNotation )
                    // InternalAlpha.g:5553:5: lv_fuzzyFunction_2_0= ruleFuzzyFunctionInArrayNotation
                    {

                    					newCompositeNode(grammarAccess.getFuzzyIndexExpressionAccess().getFuzzyFunctionFuzzyFunctionInArrayNotationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_fuzzyFunction_2_0=ruleFuzzyFunctionInArrayNotation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFuzzyIndexExpressionRule());
                    					}
                    					set(
                    						current,
                    						"fuzzyFunction",
                    						lv_fuzzyFunction_2_0,
                    						"alpha.model.Alpha.FuzzyFunctionInArrayNotation");
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
    // InternalAlpha.g:5574:1: entryRuleReduceExpression returns [EObject current=null] : iv_ruleReduceExpression= ruleReduceExpression EOF ;
    public final EObject entryRuleReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReduceExpression = null;


        try {
            // InternalAlpha.g:5574:57: (iv_ruleReduceExpression= ruleReduceExpression EOF )
            // InternalAlpha.g:5575:2: iv_ruleReduceExpression= ruleReduceExpression EOF
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
    // InternalAlpha.g:5581:1: ruleReduceExpression returns [EObject current=null] : (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
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
            // InternalAlpha.g:5587:2: ( (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:5588:2: (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:5588:2: (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:5589:3: otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getReduceExpressionAccess().getReduceKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_69); 

            			newLeafNode(otherlv_1, grammarAccess.getReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:5597:3: ( (lv_operator_2_0= ruleAREDUCTION_OP ) )
            // InternalAlpha.g:5598:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            {
            // InternalAlpha.g:5598:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            // InternalAlpha.g:5599:5: lv_operator_2_0= ruleAREDUCTION_OP
            {

            					newCompositeNode(grammarAccess.getReduceExpressionAccess().getOperatorAREDUCTION_OPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_3=(Token)match(input,24,FOLLOW_70); 

            			newLeafNode(otherlv_3, grammarAccess.getReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:5620:3: ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) )
            // InternalAlpha.g:5621:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:5621:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:5622:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:5622:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==15) ) {
                alt81=1;
            }
            else if ( (LA81_0==37) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalAlpha.g:5623:6: lv_projectionExpr_4_1= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getReduceExpressionAccess().getProjectionExprJNIFunctionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_17);
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
                    // InternalAlpha.g:5639:6: lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getReduceExpressionAccess().getProjectionExprJNIFunctionInArrayNotationParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_17);
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

            otherlv_5=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:5661:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:5662:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:5662:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:5663:5: lv_body_6_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getReduceExpressionAccess().getBodyAlphaExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

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
    // InternalAlpha.g:5688:1: entryRuleExternalReduceExpression returns [EObject current=null] : iv_ruleExternalReduceExpression= ruleExternalReduceExpression EOF ;
    public final EObject entryRuleExternalReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalReduceExpression = null;


        try {
            // InternalAlpha.g:5688:65: (iv_ruleExternalReduceExpression= ruleExternalReduceExpression EOF )
            // InternalAlpha.g:5689:2: iv_ruleExternalReduceExpression= ruleExternalReduceExpression EOF
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
    // InternalAlpha.g:5695:1: ruleExternalReduceExpression returns [EObject current=null] : (otherlv_0= 'reduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleExternalReduceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_projectionExpr_4_1 = null;

        EObject lv_projectionExpr_4_2 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5701:2: ( (otherlv_0= 'reduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:5702:2: (otherlv_0= 'reduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:5702:2: (otherlv_0= 'reduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:5703:3: otherlv_0= 'reduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalReduceExpressionAccess().getReduceKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:5711:3: ( ( ruleQualifiedName ) )
            // InternalAlpha.g:5712:4: ( ruleQualifiedName )
            {
            // InternalAlpha.g:5712:4: ( ruleQualifiedName )
            // InternalAlpha.g:5713:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalReduceExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternalReduceExpressionAccess().getExternalFunctionExternalFunctionCrossReference_2_0());
            				
            pushFollow(FOLLOW_17);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_70); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:5731:3: ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) )
            // InternalAlpha.g:5732:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:5732:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:5733:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:5733:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==15) ) {
                alt82=1;
            }
            else if ( (LA82_0==37) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalAlpha.g:5734:6: lv_projectionExpr_4_1= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getExternalReduceExpressionAccess().getProjectionExprJNIFunctionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_17);
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
                    // InternalAlpha.g:5750:6: lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getExternalReduceExpressionAccess().getProjectionExprJNIFunctionInArrayNotationParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_17);
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

            otherlv_5=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:5772:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:5773:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:5773:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:5774:5: lv_body_6_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getExternalReduceExpressionAccess().getBodyAlphaExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

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
    // InternalAlpha.g:5799:1: entryRuleArgReduceExpression returns [EObject current=null] : iv_ruleArgReduceExpression= ruleArgReduceExpression EOF ;
    public final EObject entryRuleArgReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgReduceExpression = null;


        try {
            // InternalAlpha.g:5799:60: (iv_ruleArgReduceExpression= ruleArgReduceExpression EOF )
            // InternalAlpha.g:5800:2: iv_ruleArgReduceExpression= ruleArgReduceExpression EOF
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
    // InternalAlpha.g:5806:1: ruleArgReduceExpression returns [EObject current=null] : (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
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
            // InternalAlpha.g:5812:2: ( (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:5813:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:5813:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:5814:3: otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getArgReduceExpressionAccess().getArgreduceKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_69); 

            			newLeafNode(otherlv_1, grammarAccess.getArgReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:5822:3: ( (lv_operator_2_0= ruleAREDUCTION_OP ) )
            // InternalAlpha.g:5823:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            {
            // InternalAlpha.g:5823:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            // InternalAlpha.g:5824:5: lv_operator_2_0= ruleAREDUCTION_OP
            {

            					newCompositeNode(grammarAccess.getArgReduceExpressionAccess().getOperatorAREDUCTION_OPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_3=(Token)match(input,24,FOLLOW_70); 

            			newLeafNode(otherlv_3, grammarAccess.getArgReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:5845:3: ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) )
            // InternalAlpha.g:5846:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:5846:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:5847:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:5847:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==15) ) {
                alt83=1;
            }
            else if ( (LA83_0==37) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalAlpha.g:5848:6: lv_projectionExpr_4_1= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getArgReduceExpressionAccess().getProjectionExprJNIFunctionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_17);
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
                    // InternalAlpha.g:5864:6: lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getArgReduceExpressionAccess().getProjectionExprJNIFunctionInArrayNotationParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_17);
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

            otherlv_5=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getArgReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:5886:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:5887:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:5887:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:5888:5: lv_body_6_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getArgReduceExpressionAccess().getBodyAlphaExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

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
    // InternalAlpha.g:5913:1: entryRuleExternalArgReduceExpression returns [EObject current=null] : iv_ruleExternalArgReduceExpression= ruleExternalArgReduceExpression EOF ;
    public final EObject entryRuleExternalArgReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalArgReduceExpression = null;


        try {
            // InternalAlpha.g:5913:68: (iv_ruleExternalArgReduceExpression= ruleExternalArgReduceExpression EOF )
            // InternalAlpha.g:5914:2: iv_ruleExternalArgReduceExpression= ruleExternalArgReduceExpression EOF
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
    // InternalAlpha.g:5920:1: ruleExternalArgReduceExpression returns [EObject current=null] : (otherlv_0= 'argreduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleExternalArgReduceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_projectionExpr_4_1 = null;

        EObject lv_projectionExpr_4_2 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5926:2: ( (otherlv_0= 'argreduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:5927:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:5927:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:5928:3: otherlv_0= 'argreduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalArgReduceExpressionAccess().getArgreduceKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalArgReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:5936:3: ( ( ruleQualifiedName ) )
            // InternalAlpha.g:5937:4: ( ruleQualifiedName )
            {
            // InternalAlpha.g:5937:4: ( ruleQualifiedName )
            // InternalAlpha.g:5938:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalArgReduceExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternalArgReduceExpressionAccess().getExternalFunctionExternalFunctionCrossReference_2_0());
            				
            pushFollow(FOLLOW_17);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_70); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalArgReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:5956:3: ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) )
            // InternalAlpha.g:5957:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:5957:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:5958:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:5958:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==15) ) {
                alt84=1;
            }
            else if ( (LA84_0==37) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalAlpha.g:5959:6: lv_projectionExpr_4_1= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getExternalArgReduceExpressionAccess().getProjectionExprJNIFunctionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_17);
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
                    // InternalAlpha.g:5975:6: lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getExternalArgReduceExpressionAccess().getProjectionExprJNIFunctionInArrayNotationParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_17);
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

            otherlv_5=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalArgReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:5997:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:5998:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:5998:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:5999:5: lv_body_6_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getExternalArgReduceExpressionAccess().getBodyAlphaExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFuzzyReduceExpression"
    // InternalAlpha.g:6024:1: entryRuleFuzzyReduceExpression returns [EObject current=null] : iv_ruleFuzzyReduceExpression= ruleFuzzyReduceExpression EOF ;
    public final EObject entryRuleFuzzyReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyReduceExpression = null;


        try {
            // InternalAlpha.g:6024:62: (iv_ruleFuzzyReduceExpression= ruleFuzzyReduceExpression EOF )
            // InternalAlpha.g:6025:2: iv_ruleFuzzyReduceExpression= ruleFuzzyReduceExpression EOF
            {
             newCompositeNode(grammarAccess.getFuzzyReduceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuzzyReduceExpression=ruleFuzzyReduceExpression();

            state._fsp--;

             current =iv_ruleFuzzyReduceExpression; 
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
    // $ANTLR end "entryRuleFuzzyReduceExpression"


    // $ANTLR start "ruleFuzzyReduceExpression"
    // InternalAlpha.g:6031:1: ruleFuzzyReduceExpression returns [EObject current=null] : (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleFuzzyReduceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_projectionFunction_4_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:6037:2: ( (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:6038:2: (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:6038:2: (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:6039:3: otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFuzzyReduceExpressionAccess().getReduceKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_69); 

            			newLeafNode(otherlv_1, grammarAccess.getFuzzyReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:6047:3: ( (lv_operator_2_0= ruleAREDUCTION_OP ) )
            // InternalAlpha.g:6048:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            {
            // InternalAlpha.g:6048:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            // InternalAlpha.g:6049:5: lv_operator_2_0= ruleAREDUCTION_OP
            {

            					newCompositeNode(grammarAccess.getFuzzyReduceExpressionAccess().getOperatorAREDUCTION_OPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_operator_2_0=ruleAREDUCTION_OP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuzzyReduceExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"alpha.model.Alpha.AREDUCTION_OP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getFuzzyReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:6070:3: ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) )
            // InternalAlpha.g:6071:4: (lv_projectionFunction_4_0= ruleFuzzyFunction )
            {
            // InternalAlpha.g:6071:4: (lv_projectionFunction_4_0= ruleFuzzyFunction )
            // InternalAlpha.g:6072:5: lv_projectionFunction_4_0= ruleFuzzyFunction
            {

            					newCompositeNode(grammarAccess.getFuzzyReduceExpressionAccess().getProjectionFunctionFuzzyFunctionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_projectionFunction_4_0=ruleFuzzyFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuzzyReduceExpressionRule());
            					}
            					set(
            						current,
            						"projectionFunction",
            						lv_projectionFunction_4_0,
            						"alpha.model.Alpha.FuzzyFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getFuzzyReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:6093:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:6094:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:6094:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:6095:5: lv_body_6_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getFuzzyReduceExpressionAccess().getBodyAlphaExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_body_6_0=ruleAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuzzyReduceExpressionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"alpha.model.Alpha.AlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getFuzzyReduceExpressionAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleFuzzyReduceExpression"


    // $ANTLR start "entryRuleExternalFuzzyReduceExpression"
    // InternalAlpha.g:6120:1: entryRuleExternalFuzzyReduceExpression returns [EObject current=null] : iv_ruleExternalFuzzyReduceExpression= ruleExternalFuzzyReduceExpression EOF ;
    public final EObject entryRuleExternalFuzzyReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalFuzzyReduceExpression = null;


        try {
            // InternalAlpha.g:6120:70: (iv_ruleExternalFuzzyReduceExpression= ruleExternalFuzzyReduceExpression EOF )
            // InternalAlpha.g:6121:2: iv_ruleExternalFuzzyReduceExpression= ruleExternalFuzzyReduceExpression EOF
            {
             newCompositeNode(grammarAccess.getExternalFuzzyReduceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalFuzzyReduceExpression=ruleExternalFuzzyReduceExpression();

            state._fsp--;

             current =iv_ruleExternalFuzzyReduceExpression; 
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
    // $ANTLR end "entryRuleExternalFuzzyReduceExpression"


    // $ANTLR start "ruleExternalFuzzyReduceExpression"
    // InternalAlpha.g:6127:1: ruleExternalFuzzyReduceExpression returns [EObject current=null] : (otherlv_0= 'reduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleExternalFuzzyReduceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_projectionFunction_4_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:6133:2: ( (otherlv_0= 'reduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:6134:2: (otherlv_0= 'reduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:6134:2: (otherlv_0= 'reduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:6135:3: otherlv_0= 'reduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalFuzzyReduceExpressionAccess().getReduceKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalFuzzyReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:6143:3: ( ( ruleQualifiedName ) )
            // InternalAlpha.g:6144:4: ( ruleQualifiedName )
            {
            // InternalAlpha.g:6144:4: ( ruleQualifiedName )
            // InternalAlpha.g:6145:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalFuzzyReduceExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternalFuzzyReduceExpressionAccess().getExternalFunctionExternalFunctionCrossReference_2_0());
            				
            pushFollow(FOLLOW_17);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalFuzzyReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:6163:3: ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) )
            // InternalAlpha.g:6164:4: (lv_projectionFunction_4_0= ruleFuzzyFunction )
            {
            // InternalAlpha.g:6164:4: (lv_projectionFunction_4_0= ruleFuzzyFunction )
            // InternalAlpha.g:6165:5: lv_projectionFunction_4_0= ruleFuzzyFunction
            {

            					newCompositeNode(grammarAccess.getExternalFuzzyReduceExpressionAccess().getProjectionFunctionFuzzyFunctionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_projectionFunction_4_0=ruleFuzzyFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalFuzzyReduceExpressionRule());
            					}
            					set(
            						current,
            						"projectionFunction",
            						lv_projectionFunction_4_0,
            						"alpha.model.Alpha.FuzzyFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalFuzzyReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:6186:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:6187:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:6187:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:6188:5: lv_body_6_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getExternalFuzzyReduceExpressionAccess().getBodyAlphaExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_body_6_0=ruleAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalFuzzyReduceExpressionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"alpha.model.Alpha.AlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExternalFuzzyReduceExpressionAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleExternalFuzzyReduceExpression"


    // $ANTLR start "entryRuleFuzzyArgReduceExpression"
    // InternalAlpha.g:6213:1: entryRuleFuzzyArgReduceExpression returns [EObject current=null] : iv_ruleFuzzyArgReduceExpression= ruleFuzzyArgReduceExpression EOF ;
    public final EObject entryRuleFuzzyArgReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyArgReduceExpression = null;


        try {
            // InternalAlpha.g:6213:65: (iv_ruleFuzzyArgReduceExpression= ruleFuzzyArgReduceExpression EOF )
            // InternalAlpha.g:6214:2: iv_ruleFuzzyArgReduceExpression= ruleFuzzyArgReduceExpression EOF
            {
             newCompositeNode(grammarAccess.getFuzzyArgReduceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuzzyArgReduceExpression=ruleFuzzyArgReduceExpression();

            state._fsp--;

             current =iv_ruleFuzzyArgReduceExpression; 
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
    // $ANTLR end "entryRuleFuzzyArgReduceExpression"


    // $ANTLR start "ruleFuzzyArgReduceExpression"
    // InternalAlpha.g:6220:1: ruleFuzzyArgReduceExpression returns [EObject current=null] : (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleFuzzyArgReduceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_projectionFunction_4_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:6226:2: ( (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:6227:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:6227:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:6228:3: otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFuzzyArgReduceExpressionAccess().getArgreduceKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_69); 

            			newLeafNode(otherlv_1, grammarAccess.getFuzzyArgReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:6236:3: ( (lv_operator_2_0= ruleAREDUCTION_OP ) )
            // InternalAlpha.g:6237:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            {
            // InternalAlpha.g:6237:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            // InternalAlpha.g:6238:5: lv_operator_2_0= ruleAREDUCTION_OP
            {

            					newCompositeNode(grammarAccess.getFuzzyArgReduceExpressionAccess().getOperatorAREDUCTION_OPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_operator_2_0=ruleAREDUCTION_OP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuzzyArgReduceExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"alpha.model.Alpha.AREDUCTION_OP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getFuzzyArgReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:6259:3: ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) )
            // InternalAlpha.g:6260:4: (lv_projectionFunction_4_0= ruleFuzzyFunction )
            {
            // InternalAlpha.g:6260:4: (lv_projectionFunction_4_0= ruleFuzzyFunction )
            // InternalAlpha.g:6261:5: lv_projectionFunction_4_0= ruleFuzzyFunction
            {

            					newCompositeNode(grammarAccess.getFuzzyArgReduceExpressionAccess().getProjectionFunctionFuzzyFunctionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_projectionFunction_4_0=ruleFuzzyFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuzzyArgReduceExpressionRule());
            					}
            					set(
            						current,
            						"projectionFunction",
            						lv_projectionFunction_4_0,
            						"alpha.model.Alpha.FuzzyFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getFuzzyArgReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:6282:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:6283:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:6283:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:6284:5: lv_body_6_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getFuzzyArgReduceExpressionAccess().getBodyAlphaExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_body_6_0=ruleAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuzzyArgReduceExpressionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"alpha.model.Alpha.AlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getFuzzyArgReduceExpressionAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleFuzzyArgReduceExpression"


    // $ANTLR start "entryRuleExternalFuzzyArgReduceExpression"
    // InternalAlpha.g:6309:1: entryRuleExternalFuzzyArgReduceExpression returns [EObject current=null] : iv_ruleExternalFuzzyArgReduceExpression= ruleExternalFuzzyArgReduceExpression EOF ;
    public final EObject entryRuleExternalFuzzyArgReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalFuzzyArgReduceExpression = null;


        try {
            // InternalAlpha.g:6309:73: (iv_ruleExternalFuzzyArgReduceExpression= ruleExternalFuzzyArgReduceExpression EOF )
            // InternalAlpha.g:6310:2: iv_ruleExternalFuzzyArgReduceExpression= ruleExternalFuzzyArgReduceExpression EOF
            {
             newCompositeNode(grammarAccess.getExternalFuzzyArgReduceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalFuzzyArgReduceExpression=ruleExternalFuzzyArgReduceExpression();

            state._fsp--;

             current =iv_ruleExternalFuzzyArgReduceExpression; 
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
    // $ANTLR end "entryRuleExternalFuzzyArgReduceExpression"


    // $ANTLR start "ruleExternalFuzzyArgReduceExpression"
    // InternalAlpha.g:6316:1: ruleExternalFuzzyArgReduceExpression returns [EObject current=null] : (otherlv_0= 'argreduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleExternalFuzzyArgReduceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_projectionFunction_4_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:6322:2: ( (otherlv_0= 'argreduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:6323:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:6323:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:6324:3: otherlv_0= 'argreduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalFuzzyArgReduceExpressionAccess().getArgreduceKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalFuzzyArgReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:6332:3: ( ( ruleQualifiedName ) )
            // InternalAlpha.g:6333:4: ( ruleQualifiedName )
            {
            // InternalAlpha.g:6333:4: ( ruleQualifiedName )
            // InternalAlpha.g:6334:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalFuzzyArgReduceExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternalFuzzyArgReduceExpressionAccess().getExternalFunctionExternalFunctionCrossReference_2_0());
            				
            pushFollow(FOLLOW_17);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalFuzzyArgReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:6352:3: ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) )
            // InternalAlpha.g:6353:4: (lv_projectionFunction_4_0= ruleFuzzyFunction )
            {
            // InternalAlpha.g:6353:4: (lv_projectionFunction_4_0= ruleFuzzyFunction )
            // InternalAlpha.g:6354:5: lv_projectionFunction_4_0= ruleFuzzyFunction
            {

            					newCompositeNode(grammarAccess.getExternalFuzzyArgReduceExpressionAccess().getProjectionFunctionFuzzyFunctionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_projectionFunction_4_0=ruleFuzzyFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalFuzzyArgReduceExpressionRule());
            					}
            					set(
            						current,
            						"projectionFunction",
            						lv_projectionFunction_4_0,
            						"alpha.model.Alpha.FuzzyFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalFuzzyArgReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:6375:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:6376:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:6376:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:6377:5: lv_body_6_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getExternalFuzzyArgReduceExpressionAccess().getBodyAlphaExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_body_6_0=ruleAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalFuzzyArgReduceExpressionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"alpha.model.Alpha.AlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExternalFuzzyArgReduceExpressionAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleExternalFuzzyArgReduceExpression"


    // $ANTLR start "entryRuleConvolutionExpression"
    // InternalAlpha.g:6402:1: entryRuleConvolutionExpression returns [EObject current=null] : iv_ruleConvolutionExpression= ruleConvolutionExpression EOF ;
    public final EObject entryRuleConvolutionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConvolutionExpression = null;


        try {
            // InternalAlpha.g:6402:62: (iv_ruleConvolutionExpression= ruleConvolutionExpression EOF )
            // InternalAlpha.g:6403:2: iv_ruleConvolutionExpression= ruleConvolutionExpression EOF
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
    // InternalAlpha.g:6409:1: ruleConvolutionExpression returns [EObject current=null] : (otherlv_0= 'conv' otherlv_1= '(' ( (lv_kernelDomainExpr_2_0= ruleCalculatorExpression ) ) otherlv_3= ',' ( (lv_kernelExpression_4_0= ruleAlphaExpression ) ) otherlv_5= ',' ( (lv_dataExpression_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
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
            // InternalAlpha.g:6415:2: ( (otherlv_0= 'conv' otherlv_1= '(' ( (lv_kernelDomainExpr_2_0= ruleCalculatorExpression ) ) otherlv_3= ',' ( (lv_kernelExpression_4_0= ruleAlphaExpression ) ) otherlv_5= ',' ( (lv_dataExpression_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:6416:2: (otherlv_0= 'conv' otherlv_1= '(' ( (lv_kernelDomainExpr_2_0= ruleCalculatorExpression ) ) otherlv_3= ',' ( (lv_kernelExpression_4_0= ruleAlphaExpression ) ) otherlv_5= ',' ( (lv_dataExpression_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:6416:2: (otherlv_0= 'conv' otherlv_1= '(' ( (lv_kernelDomainExpr_2_0= ruleCalculatorExpression ) ) otherlv_3= ',' ( (lv_kernelExpression_4_0= ruleAlphaExpression ) ) otherlv_5= ',' ( (lv_dataExpression_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:6417:3: otherlv_0= 'conv' otherlv_1= '(' ( (lv_kernelDomainExpr_2_0= ruleCalculatorExpression ) ) otherlv_3= ',' ( (lv_kernelExpression_4_0= ruleAlphaExpression ) ) otherlv_5= ',' ( (lv_dataExpression_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getConvolutionExpressionAccess().getConvKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getConvolutionExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:6425:3: ( (lv_kernelDomainExpr_2_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:6426:4: (lv_kernelDomainExpr_2_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:6426:4: (lv_kernelDomainExpr_2_0= ruleCalculatorExpression )
            // InternalAlpha.g:6427:5: lv_kernelDomainExpr_2_0= ruleCalculatorExpression
            {

            					newCompositeNode(grammarAccess.getConvolutionExpressionAccess().getKernelDomainExprCalculatorExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_3=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getConvolutionExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:6448:3: ( (lv_kernelExpression_4_0= ruleAlphaExpression ) )
            // InternalAlpha.g:6449:4: (lv_kernelExpression_4_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:6449:4: (lv_kernelExpression_4_0= ruleAlphaExpression )
            // InternalAlpha.g:6450:5: lv_kernelExpression_4_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getConvolutionExpressionAccess().getKernelExpressionAlphaExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_5=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getConvolutionExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:6471:3: ( (lv_dataExpression_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:6472:4: (lv_dataExpression_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:6472:4: (lv_dataExpression_6_0= ruleAlphaExpression )
            // InternalAlpha.g:6473:5: lv_dataExpression_6_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getConvolutionExpressionAccess().getDataExpressionAlphaExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

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
    // InternalAlpha.g:6498:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // InternalAlpha.g:6498:57: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // InternalAlpha.g:6499:2: iv_ruleSelectExpression= ruleSelectExpression EOF
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
    // InternalAlpha.g:6505:1: ruleSelectExpression returns [EObject current=null] : (otherlv_0= 'select' ( (lv_relationExpr_1_0= ruleCalculatorExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAlphaTerminalExpression ) ) ) ;
    public final EObject ruleSelectExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_relationExpr_1_0 = null;

        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:6511:2: ( (otherlv_0= 'select' ( (lv_relationExpr_1_0= ruleCalculatorExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAlphaTerminalExpression ) ) ) )
            // InternalAlpha.g:6512:2: (otherlv_0= 'select' ( (lv_relationExpr_1_0= ruleCalculatorExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAlphaTerminalExpression ) ) )
            {
            // InternalAlpha.g:6512:2: (otherlv_0= 'select' ( (lv_relationExpr_1_0= ruleCalculatorExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAlphaTerminalExpression ) ) )
            // InternalAlpha.g:6513:3: otherlv_0= 'select' ( (lv_relationExpr_1_0= ruleCalculatorExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAlphaTerminalExpression ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectExpressionAccess().getSelectKeyword_0());
            		
            // InternalAlpha.g:6517:3: ( (lv_relationExpr_1_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:6518:4: (lv_relationExpr_1_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:6518:4: (lv_relationExpr_1_0= ruleCalculatorExpression )
            // InternalAlpha.g:6519:5: lv_relationExpr_1_0= ruleCalculatorExpression
            {

            					newCompositeNode(grammarAccess.getSelectExpressionAccess().getRelationExprCalculatorExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_71);
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

            otherlv_2=(Token)match(input,68,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectExpressionAccess().getFromKeyword_2());
            		
            // InternalAlpha.g:6540:3: ( (lv_expr_3_0= ruleAlphaTerminalExpression ) )
            // InternalAlpha.g:6541:4: (lv_expr_3_0= ruleAlphaTerminalExpression )
            {
            // InternalAlpha.g:6541:4: (lv_expr_3_0= ruleAlphaTerminalExpression )
            // InternalAlpha.g:6542:5: lv_expr_3_0= ruleAlphaTerminalExpression
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
    // InternalAlpha.g:6563:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalAlpha.g:6563:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalAlpha.g:6564:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalAlpha.g:6570:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:6576:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalAlpha.g:6577:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalAlpha.g:6577:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalAlpha.g:6578:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_72);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:6586:3: ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==49||LA85_0==73) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalAlpha.g:6587:4: () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalAlpha.g:6587:4: ()
            	    // InternalAlpha.g:6588:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:6594:4: ( (lv_operator_2_0= ruleAOrOP ) )
            	    // InternalAlpha.g:6595:5: (lv_operator_2_0= ruleAOrOP )
            	    {
            	    // InternalAlpha.g:6595:5: (lv_operator_2_0= ruleAOrOP )
            	    // InternalAlpha.g:6596:6: lv_operator_2_0= ruleAOrOP
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorAOrOPParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
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

            	    // InternalAlpha.g:6613:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalAlpha.g:6614:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalAlpha.g:6614:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalAlpha.g:6615:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_72);
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
            	    break loop85;
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
    // InternalAlpha.g:6637:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalAlpha.g:6637:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalAlpha.g:6638:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalAlpha.g:6644:1: ruleAndExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:6650:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // InternalAlpha.g:6651:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // InternalAlpha.g:6651:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // InternalAlpha.g:6652:3: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_73);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;


            			current = this_RelationalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:6660:3: ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==48) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalAlpha.g:6661:4: () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // InternalAlpha.g:6661:4: ()
            	    // InternalAlpha.g:6662:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:6668:4: ( (lv_operator_2_0= ruleAAndOP ) )
            	    // InternalAlpha.g:6669:5: (lv_operator_2_0= ruleAAndOP )
            	    {
            	    // InternalAlpha.g:6669:5: (lv_operator_2_0= ruleAAndOP )
            	    // InternalAlpha.g:6670:6: lv_operator_2_0= ruleAAndOP
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAAndOPParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
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

            	    // InternalAlpha.g:6687:4: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // InternalAlpha.g:6688:5: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // InternalAlpha.g:6688:5: (lv_right_3_0= ruleRelationalExpression )
            	    // InternalAlpha.g:6689:6: lv_right_3_0= ruleRelationalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightRelationalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_73);
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
            	    break loop86;
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
    // InternalAlpha.g:6711:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalAlpha.g:6711:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalAlpha.g:6712:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
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
    // InternalAlpha.g:6718:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:6724:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalAlpha.g:6725:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalAlpha.g:6725:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            // InternalAlpha.g:6726:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_74);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:6734:3: ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==13||(LA87_0>=52 && LA87_0<=55)||LA87_0==74) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalAlpha.g:6735:4: () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalAlpha.g:6735:4: ()
            	    // InternalAlpha.g:6736:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRelationalExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:6742:4: ( (lv_operator_2_0= ruleARelationalOP ) )
            	    // InternalAlpha.g:6743:5: (lv_operator_2_0= ruleARelationalOP )
            	    {
            	    // InternalAlpha.g:6743:5: (lv_operator_2_0= ruleARelationalOP )
            	    // InternalAlpha.g:6744:6: lv_operator_2_0= ruleARelationalOP
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorARelationalOPParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
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

            	    // InternalAlpha.g:6761:4: ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    // InternalAlpha.g:6762:5: (lv_right_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalAlpha.g:6762:5: (lv_right_3_0= ruleAdditiveExpression )
            	    // InternalAlpha.g:6763:6: lv_right_3_0= ruleAdditiveExpression
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_74);
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
            	    break loop87;
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
    // InternalAlpha.g:6785:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalAlpha.g:6785:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalAlpha.g:6786:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalAlpha.g:6792:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:6798:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalAlpha.g:6799:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalAlpha.g:6799:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalAlpha.g:6800:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_75);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:6808:3: ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( ((LA88_0>=43 && LA88_0<=44)) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalAlpha.g:6809:4: () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalAlpha.g:6809:4: ()
            	    // InternalAlpha.g:6810:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:6816:4: ( (lv_operator_2_0= ruleAAdditiveOP ) )
            	    // InternalAlpha.g:6817:5: (lv_operator_2_0= ruleAAdditiveOP )
            	    {
            	    // InternalAlpha.g:6817:5: (lv_operator_2_0= ruleAAdditiveOP )
            	    // InternalAlpha.g:6818:6: lv_operator_2_0= ruleAAdditiveOP
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAAdditiveOPParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
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

            	    // InternalAlpha.g:6835:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalAlpha.g:6836:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalAlpha.g:6836:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalAlpha.g:6837:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_75);
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
            	    break loop88;
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
    // InternalAlpha.g:6859:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalAlpha.g:6859:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalAlpha.g:6860:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalAlpha.g:6866:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_MinMaxExpression_0= ruleMinMaxExpression ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MinMaxExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:6872:2: ( (this_MinMaxExpression_0= ruleMinMaxExpression ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )* ) )
            // InternalAlpha.g:6873:2: (this_MinMaxExpression_0= ruleMinMaxExpression ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )* )
            {
            // InternalAlpha.g:6873:2: (this_MinMaxExpression_0= ruleMinMaxExpression ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )* )
            // InternalAlpha.g:6874:3: this_MinMaxExpression_0= ruleMinMaxExpression ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getMinMaxExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_76);
            this_MinMaxExpression_0=ruleMinMaxExpression();

            state._fsp--;


            			current = this_MinMaxExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:6882:3: ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( ((LA89_0>=45 && LA89_0<=46)) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalAlpha.g:6883:4: () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) )
            	    {
            	    // InternalAlpha.g:6883:4: ()
            	    // InternalAlpha.g:6884:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:6890:4: ( (lv_operator_2_0= ruleAMultiplicativeOP ) )
            	    // InternalAlpha.g:6891:5: (lv_operator_2_0= ruleAMultiplicativeOP )
            	    {
            	    // InternalAlpha.g:6891:5: (lv_operator_2_0= ruleAMultiplicativeOP )
            	    // InternalAlpha.g:6892:6: lv_operator_2_0= ruleAMultiplicativeOP
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAMultiplicativeOPParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
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

            	    // InternalAlpha.g:6909:4: ( (lv_right_3_0= ruleMinMaxExpression ) )
            	    // InternalAlpha.g:6910:5: (lv_right_3_0= ruleMinMaxExpression )
            	    {
            	    // InternalAlpha.g:6910:5: (lv_right_3_0= ruleMinMaxExpression )
            	    // InternalAlpha.g:6911:6: lv_right_3_0= ruleMinMaxExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightMinMaxExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_76);
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
            	    break loop89;
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
    // InternalAlpha.g:6933:1: entryRuleMinMaxExpression returns [EObject current=null] : iv_ruleMinMaxExpression= ruleMinMaxExpression EOF ;
    public final EObject entryRuleMinMaxExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinMaxExpression = null;


        try {
            // InternalAlpha.g:6933:57: (iv_ruleMinMaxExpression= ruleMinMaxExpression EOF )
            // InternalAlpha.g:6934:2: iv_ruleMinMaxExpression= ruleMinMaxExpression EOF
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
    // InternalAlpha.g:6940:1: ruleMinMaxExpression returns [EObject current=null] : (this_UnaryOrTerminalExpression_0= ruleUnaryOrTerminalExpression ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )* ) ;
    public final EObject ruleMinMaxExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOrTerminalExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:6946:2: ( (this_UnaryOrTerminalExpression_0= ruleUnaryOrTerminalExpression ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )* ) )
            // InternalAlpha.g:6947:2: (this_UnaryOrTerminalExpression_0= ruleUnaryOrTerminalExpression ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )* )
            {
            // InternalAlpha.g:6947:2: (this_UnaryOrTerminalExpression_0= ruleUnaryOrTerminalExpression ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )* )
            // InternalAlpha.g:6948:3: this_UnaryOrTerminalExpression_0= ruleUnaryOrTerminalExpression ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMinMaxExpressionAccess().getUnaryOrTerminalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_77);
            this_UnaryOrTerminalExpression_0=ruleUnaryOrTerminalExpression();

            state._fsp--;


            			current = this_UnaryOrTerminalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:6956:3: ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( ((LA90_0>=69 && LA90_0<=70)) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalAlpha.g:6957:4: () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) )
            	    {
            	    // InternalAlpha.g:6957:4: ()
            	    // InternalAlpha.g:6958:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMinMaxExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:6964:4: ( (lv_operator_2_0= ruleAMINMAX_OP ) )
            	    // InternalAlpha.g:6965:5: (lv_operator_2_0= ruleAMINMAX_OP )
            	    {
            	    // InternalAlpha.g:6965:5: (lv_operator_2_0= ruleAMINMAX_OP )
            	    // InternalAlpha.g:6966:6: lv_operator_2_0= ruleAMINMAX_OP
            	    {

            	    						newCompositeNode(grammarAccess.getMinMaxExpressionAccess().getOperatorAMINMAX_OPParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
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

            	    // InternalAlpha.g:6983:4: ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) )
            	    // InternalAlpha.g:6984:5: (lv_right_3_0= ruleUnaryOrTerminalExpression )
            	    {
            	    // InternalAlpha.g:6984:5: (lv_right_3_0= ruleUnaryOrTerminalExpression )
            	    // InternalAlpha.g:6985:6: lv_right_3_0= ruleUnaryOrTerminalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMinMaxExpressionAccess().getRightUnaryOrTerminalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_77);
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
            	    break loop90;
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
    // InternalAlpha.g:7007:1: entryRuleMultiArgExpression returns [EObject current=null] : iv_ruleMultiArgExpression= ruleMultiArgExpression EOF ;
    public final EObject entryRuleMultiArgExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiArgExpression = null;


        try {
            // InternalAlpha.g:7007:59: (iv_ruleMultiArgExpression= ruleMultiArgExpression EOF )
            // InternalAlpha.g:7008:2: iv_ruleMultiArgExpression= ruleMultiArgExpression EOF
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
    // InternalAlpha.g:7014:1: ruleMultiArgExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAREDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' ) ;
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
            // InternalAlpha.g:7020:2: ( ( ( (lv_operator_0_0= ruleAREDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' ) )
            // InternalAlpha.g:7021:2: ( ( (lv_operator_0_0= ruleAREDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' )
            {
            // InternalAlpha.g:7021:2: ( ( (lv_operator_0_0= ruleAREDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' )
            // InternalAlpha.g:7022:3: ( (lv_operator_0_0= ruleAREDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')'
            {
            // InternalAlpha.g:7022:3: ( (lv_operator_0_0= ruleAREDUCTION_OP ) )
            // InternalAlpha.g:7023:4: (lv_operator_0_0= ruleAREDUCTION_OP )
            {
            // InternalAlpha.g:7023:4: (lv_operator_0_0= ruleAREDUCTION_OP )
            // InternalAlpha.g:7024:5: lv_operator_0_0= ruleAREDUCTION_OP
            {

            					newCompositeNode(grammarAccess.getMultiArgExpressionAccess().getOperatorAREDUCTION_OPParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_1=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiArgExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:7045:3: ( (lv_exprs_2_0= ruleAlphaExpression ) )
            // InternalAlpha.g:7046:4: (lv_exprs_2_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:7046:4: (lv_exprs_2_0= ruleAlphaExpression )
            // InternalAlpha.g:7047:5: lv_exprs_2_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getMultiArgExpressionAccess().getExprsAlphaExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_56);
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

            // InternalAlpha.g:7064:3: (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==24) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalAlpha.g:7065:4: otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_22); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMultiArgExpressionAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalAlpha.g:7069:4: ( (lv_exprs_4_0= ruleAlphaExpression ) )
            	    // InternalAlpha.g:7070:5: (lv_exprs_4_0= ruleAlphaExpression )
            	    {
            	    // InternalAlpha.g:7070:5: (lv_exprs_4_0= ruleAlphaExpression )
            	    // InternalAlpha.g:7071:6: lv_exprs_4_0= ruleAlphaExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiArgExpressionAccess().getExprsAlphaExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_56);
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
            	    break loop91;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

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
    // InternalAlpha.g:7097:1: entryRuleExternalMultiArgExpression returns [EObject current=null] : iv_ruleExternalMultiArgExpression= ruleExternalMultiArgExpression EOF ;
    public final EObject entryRuleExternalMultiArgExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalMultiArgExpression = null;


        try {
            // InternalAlpha.g:7097:67: (iv_ruleExternalMultiArgExpression= ruleExternalMultiArgExpression EOF )
            // InternalAlpha.g:7098:2: iv_ruleExternalMultiArgExpression= ruleExternalMultiArgExpression EOF
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
    // InternalAlpha.g:7104:1: ruleExternalMultiArgExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleExternalMultiArgExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exprs_2_0 = null;

        EObject lv_exprs_4_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:7110:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' ) )
            // InternalAlpha.g:7111:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' )
            {
            // InternalAlpha.g:7111:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' )
            // InternalAlpha.g:7112:3: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')'
            {
            // InternalAlpha.g:7112:3: ( ( ruleQualifiedName ) )
            // InternalAlpha.g:7113:4: ( ruleQualifiedName )
            {
            // InternalAlpha.g:7113:4: ( ruleQualifiedName )
            // InternalAlpha.g:7114:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalMultiArgExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternalMultiArgExpressionAccess().getExternalFunctionExternalFunctionCrossReference_0_0());
            				
            pushFollow(FOLLOW_8);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalMultiArgExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:7132:3: ( (lv_exprs_2_0= ruleAlphaExpression ) )
            // InternalAlpha.g:7133:4: (lv_exprs_2_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:7133:4: (lv_exprs_2_0= ruleAlphaExpression )
            // InternalAlpha.g:7134:5: lv_exprs_2_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getExternalMultiArgExpressionAccess().getExprsAlphaExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_56);
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

            // InternalAlpha.g:7151:3: (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==24) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalAlpha.g:7152:4: otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_22); 

            	    				newLeafNode(otherlv_3, grammarAccess.getExternalMultiArgExpressionAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalAlpha.g:7156:4: ( (lv_exprs_4_0= ruleAlphaExpression ) )
            	    // InternalAlpha.g:7157:5: (lv_exprs_4_0= ruleAlphaExpression )
            	    {
            	    // InternalAlpha.g:7157:5: (lv_exprs_4_0= ruleAlphaExpression )
            	    // InternalAlpha.g:7158:6: lv_exprs_4_0= ruleAlphaExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExternalMultiArgExpressionAccess().getExprsAlphaExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_56);
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
            	    break loop92;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

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
    // InternalAlpha.g:7184:1: entryRuleUnaryOrTerminalExpression returns [EObject current=null] : iv_ruleUnaryOrTerminalExpression= ruleUnaryOrTerminalExpression EOF ;
    public final EObject entryRuleUnaryOrTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOrTerminalExpression = null;


        try {
            // InternalAlpha.g:7184:66: (iv_ruleUnaryOrTerminalExpression= ruleUnaryOrTerminalExpression EOF )
            // InternalAlpha.g:7185:2: iv_ruleUnaryOrTerminalExpression= ruleUnaryOrTerminalExpression EOF
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
    // InternalAlpha.g:7191:1: ruleUnaryOrTerminalExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression | this_AlphaTerminalExpression_1= ruleAlphaTerminalExpression ) ;
    public final EObject ruleUnaryOrTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        EObject this_AlphaTerminalExpression_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:7197:2: ( (this_UnaryExpression_0= ruleUnaryExpression | this_AlphaTerminalExpression_1= ruleAlphaTerminalExpression ) )
            // InternalAlpha.g:7198:2: (this_UnaryExpression_0= ruleUnaryExpression | this_AlphaTerminalExpression_1= ruleAlphaTerminalExpression )
            {
            // InternalAlpha.g:7198:2: (this_UnaryExpression_0= ruleUnaryExpression | this_AlphaTerminalExpression_1= ruleAlphaTerminalExpression )
            int alt93=2;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt93=1;
                }
                break;
            case 44:
                {
                int LA93_2 = input.LA(2);

                if ( (LA93_2==RULE_ID||LA93_2==15||LA93_2==39||LA93_2==43||LA93_2==45||(LA93_2>=48 && LA93_2<=49)||LA93_2==61||(LA93_2>=63 && LA93_2<=67)||(LA93_2>=69 && LA93_2<=73)) ) {
                    alt93=1;
                }
                else if ( (LA93_2==RULE_INT) ) {
                    alt93=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_BOOLEAN:
            case 15:
            case 39:
            case 43:
            case 45:
            case 48:
            case 49:
            case 61:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
                {
                alt93=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalAlpha.g:7199:3: this_UnaryExpression_0= ruleUnaryExpression
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
                    // InternalAlpha.g:7208:3: this_AlphaTerminalExpression_1= ruleAlphaTerminalExpression
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
    // InternalAlpha.g:7220:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlpha.g:7220:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlpha.g:7221:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalAlpha.g:7227:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAUnaryOP ) ) ( (lv_expr_1_0= ruleAlphaUnaryTerminalExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:7233:2: ( ( ( (lv_operator_0_0= ruleAUnaryOP ) ) ( (lv_expr_1_0= ruleAlphaUnaryTerminalExpression ) ) ) )
            // InternalAlpha.g:7234:2: ( ( (lv_operator_0_0= ruleAUnaryOP ) ) ( (lv_expr_1_0= ruleAlphaUnaryTerminalExpression ) ) )
            {
            // InternalAlpha.g:7234:2: ( ( (lv_operator_0_0= ruleAUnaryOP ) ) ( (lv_expr_1_0= ruleAlphaUnaryTerminalExpression ) ) )
            // InternalAlpha.g:7235:3: ( (lv_operator_0_0= ruleAUnaryOP ) ) ( (lv_expr_1_0= ruleAlphaUnaryTerminalExpression ) )
            {
            // InternalAlpha.g:7235:3: ( (lv_operator_0_0= ruleAUnaryOP ) )
            // InternalAlpha.g:7236:4: (lv_operator_0_0= ruleAUnaryOP )
            {
            // InternalAlpha.g:7236:4: (lv_operator_0_0= ruleAUnaryOP )
            // InternalAlpha.g:7237:5: lv_operator_0_0= ruleAUnaryOP
            {

            					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorAUnaryOPParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalAlpha.g:7254:3: ( (lv_expr_1_0= ruleAlphaUnaryTerminalExpression ) )
            // InternalAlpha.g:7255:4: (lv_expr_1_0= ruleAlphaUnaryTerminalExpression )
            {
            // InternalAlpha.g:7255:4: (lv_expr_1_0= ruleAlphaUnaryTerminalExpression )
            // InternalAlpha.g:7256:5: lv_expr_1_0= ruleAlphaUnaryTerminalExpression
            {

            					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExprAlphaUnaryTerminalExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_1_0=ruleAlphaUnaryTerminalExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"alpha.model.Alpha.AlphaUnaryTerminalExpression");
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
    // InternalAlpha.g:7277:1: entryRuleVariableExpression returns [EObject current=null] : iv_ruleVariableExpression= ruleVariableExpression EOF ;
    public final EObject entryRuleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpression = null;


        try {
            // InternalAlpha.g:7277:59: (iv_ruleVariableExpression= ruleVariableExpression EOF )
            // InternalAlpha.g:7278:2: iv_ruleVariableExpression= ruleVariableExpression EOF
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
    // InternalAlpha.g:7284:1: ruleVariableExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:7290:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalAlpha.g:7291:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalAlpha.g:7291:2: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:7292:3: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:7292:3: (otherlv_0= RULE_ID )
            // InternalAlpha.g:7293:4: otherlv_0= RULE_ID
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
    // InternalAlpha.g:7307:1: entryRuleConstantExpression returns [EObject current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final EObject entryRuleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantExpression = null;


        try {
            // InternalAlpha.g:7307:59: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // InternalAlpha.g:7308:2: iv_ruleConstantExpression= ruleConstantExpression EOF
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
    // InternalAlpha.g:7314:1: ruleConstantExpression returns [EObject current=null] : (this_BooleanExpression_0= ruleBooleanExpression | this_RealExpression_1= ruleRealExpression | this_IntegerExpression_2= ruleIntegerExpression ) ;
    public final EObject ruleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpression_0 = null;

        EObject this_RealExpression_1 = null;

        EObject this_IntegerExpression_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:7320:2: ( (this_BooleanExpression_0= ruleBooleanExpression | this_RealExpression_1= ruleRealExpression | this_IntegerExpression_2= ruleIntegerExpression ) )
            // InternalAlpha.g:7321:2: (this_BooleanExpression_0= ruleBooleanExpression | this_RealExpression_1= ruleRealExpression | this_IntegerExpression_2= ruleIntegerExpression )
            {
            // InternalAlpha.g:7321:2: (this_BooleanExpression_0= ruleBooleanExpression | this_RealExpression_1= ruleRealExpression | this_IntegerExpression_2= ruleIntegerExpression )
            int alt94=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt94=1;
                }
                break;
            case 44:
                {
                int LA94_2 = input.LA(2);

                if ( (LA94_2==RULE_INT) ) {
                    int LA94_3 = input.LA(3);

                    if ( (LA94_3==EOF||LA94_3==13||LA94_3==16||LA94_3==24||LA94_3==31||LA94_3==34||LA94_3==37||(LA94_3>=43 && LA94_3<=46)||(LA94_3>=48 && LA94_3<=49)||(LA94_3>=52 && LA94_3<=55)||LA94_3==59||(LA94_3>=69 && LA94_3<=70)||(LA94_3>=73 && LA94_3<=74)) ) {
                        alt94=3;
                    }
                    else if ( (LA94_3==29) ) {
                        alt94=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 94, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA94_3 = input.LA(2);

                if ( (LA94_3==EOF||LA94_3==13||LA94_3==16||LA94_3==24||LA94_3==31||LA94_3==34||LA94_3==37||(LA94_3>=43 && LA94_3<=46)||(LA94_3>=48 && LA94_3<=49)||(LA94_3>=52 && LA94_3<=55)||LA94_3==59||(LA94_3>=69 && LA94_3<=70)||(LA94_3>=73 && LA94_3<=74)) ) {
                    alt94=3;
                }
                else if ( (LA94_3==29) ) {
                    alt94=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 94, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // InternalAlpha.g:7322:3: this_BooleanExpression_0= ruleBooleanExpression
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
                    // InternalAlpha.g:7331:3: this_RealExpression_1= ruleRealExpression
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
                    // InternalAlpha.g:7340:3: this_IntegerExpression_2= ruleIntegerExpression
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
    // InternalAlpha.g:7352:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalAlpha.g:7352:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalAlpha.g:7353:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
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
    // InternalAlpha.g:7359:1: ruleBooleanExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:7365:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalAlpha.g:7366:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalAlpha.g:7366:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalAlpha.g:7367:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalAlpha.g:7367:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalAlpha.g:7368:4: lv_value_0_0= RULE_BOOLEAN
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
    // InternalAlpha.g:7387:1: entryRuleIntegerExpression returns [EObject current=null] : iv_ruleIntegerExpression= ruleIntegerExpression EOF ;
    public final EObject entryRuleIntegerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerExpression = null;


        try {
            // InternalAlpha.g:7387:58: (iv_ruleIntegerExpression= ruleIntegerExpression EOF )
            // InternalAlpha.g:7388:2: iv_ruleIntegerExpression= ruleIntegerExpression EOF
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
    // InternalAlpha.g:7394:1: ruleIntegerExpression returns [EObject current=null] : ( (lv_value_0_0= ruleSINT ) ) ;
    public final EObject ruleIntegerExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:7400:2: ( ( (lv_value_0_0= ruleSINT ) ) )
            // InternalAlpha.g:7401:2: ( (lv_value_0_0= ruleSINT ) )
            {
            // InternalAlpha.g:7401:2: ( (lv_value_0_0= ruleSINT ) )
            // InternalAlpha.g:7402:3: (lv_value_0_0= ruleSINT )
            {
            // InternalAlpha.g:7402:3: (lv_value_0_0= ruleSINT )
            // InternalAlpha.g:7403:4: lv_value_0_0= ruleSINT
            {

            				newCompositeNode(grammarAccess.getIntegerExpressionAccess().getValueSINTParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleSINT();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getIntegerExpressionRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"alpha.model.Alpha.SINT");
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
    // $ANTLR end "ruleIntegerExpression"


    // $ANTLR start "entryRuleRealExpression"
    // InternalAlpha.g:7423:1: entryRuleRealExpression returns [EObject current=null] : iv_ruleRealExpression= ruleRealExpression EOF ;
    public final EObject entryRuleRealExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealExpression = null;


        try {
            // InternalAlpha.g:7423:55: (iv_ruleRealExpression= ruleRealExpression EOF )
            // InternalAlpha.g:7424:2: iv_ruleRealExpression= ruleRealExpression EOF
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
    // InternalAlpha.g:7430:1: ruleRealExpression returns [EObject current=null] : ( (lv_value_0_0= ruleFLOAT ) ) ;
    public final EObject ruleRealExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:7436:2: ( ( (lv_value_0_0= ruleFLOAT ) ) )
            // InternalAlpha.g:7437:2: ( (lv_value_0_0= ruleFLOAT ) )
            {
            // InternalAlpha.g:7437:2: ( (lv_value_0_0= ruleFLOAT ) )
            // InternalAlpha.g:7438:3: (lv_value_0_0= ruleFLOAT )
            {
            // InternalAlpha.g:7438:3: (lv_value_0_0= ruleFLOAT )
            // InternalAlpha.g:7439:4: lv_value_0_0= ruleFLOAT
            {

            				newCompositeNode(grammarAccess.getRealExpressionAccess().getValueFLOATParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleFLOAT();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRealExpressionRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"alpha.model.Alpha.FLOAT");
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
    // $ANTLR end "ruleRealExpression"


    // $ANTLR start "entryRuleAREDUCTION_OP"
    // InternalAlpha.g:7459:1: entryRuleAREDUCTION_OP returns [String current=null] : iv_ruleAREDUCTION_OP= ruleAREDUCTION_OP EOF ;
    public final String entryRuleAREDUCTION_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAREDUCTION_OP = null;


        try {
            // InternalAlpha.g:7459:53: (iv_ruleAREDUCTION_OP= ruleAREDUCTION_OP EOF )
            // InternalAlpha.g:7460:2: iv_ruleAREDUCTION_OP= ruleAREDUCTION_OP EOF
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
    // InternalAlpha.g:7466:1: ruleAREDUCTION_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'min' | kw= 'max' | kw= 'prod' | kw= 'sum' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= '+' | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleAREDUCTION_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:7472:2: ( (kw= 'min' | kw= 'max' | kw= 'prod' | kw= 'sum' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= '+' | kw= '*' ) )
            // InternalAlpha.g:7473:2: (kw= 'min' | kw= 'max' | kw= 'prod' | kw= 'sum' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= '+' | kw= '*' )
            {
            // InternalAlpha.g:7473:2: (kw= 'min' | kw= 'max' | kw= 'prod' | kw= 'sum' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= '+' | kw= '*' )
            int alt95=9;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt95=1;
                }
                break;
            case 70:
                {
                alt95=2;
                }
                break;
            case 71:
                {
                alt95=3;
                }
                break;
            case 72:
                {
                alt95=4;
                }
                break;
            case 48:
                {
                alt95=5;
                }
                break;
            case 49:
                {
                alt95=6;
                }
                break;
            case 73:
                {
                alt95=7;
                }
                break;
            case 43:
                {
                alt95=8;
                }
                break;
            case 45:
                {
                alt95=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalAlpha.g:7474:3: kw= 'min'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getMinKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:7480:3: kw= 'max'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getMaxKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:7486:3: kw= 'prod'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getProdKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:7492:3: kw= 'sum'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getSumKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:7498:3: kw= 'and'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getAndKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:7504:3: kw= 'or'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getOrKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalAlpha.g:7510:3: kw= 'xor'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getXorKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalAlpha.g:7516:3: kw= '+'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getPlusSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalAlpha.g:7522:3: kw= '*'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

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
    // InternalAlpha.g:7531:1: entryRuleAOrOP returns [String current=null] : iv_ruleAOrOP= ruleAOrOP EOF ;
    public final String entryRuleAOrOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAOrOP = null;


        try {
            // InternalAlpha.g:7531:45: (iv_ruleAOrOP= ruleAOrOP EOF )
            // InternalAlpha.g:7532:2: iv_ruleAOrOP= ruleAOrOP EOF
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
    // InternalAlpha.g:7538:1: ruleAOrOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'or' | kw= 'xor' ) ;
    public final AntlrDatatypeRuleToken ruleAOrOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:7544:2: ( (kw= 'or' | kw= 'xor' ) )
            // InternalAlpha.g:7545:2: (kw= 'or' | kw= 'xor' )
            {
            // InternalAlpha.g:7545:2: (kw= 'or' | kw= 'xor' )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==49) ) {
                alt96=1;
            }
            else if ( (LA96_0==73) ) {
                alt96=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // InternalAlpha.g:7546:3: kw= 'or'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAOrOPAccess().getOrKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:7552:3: kw= 'xor'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

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
    // InternalAlpha.g:7561:1: entryRuleAAndOP returns [String current=null] : iv_ruleAAndOP= ruleAAndOP EOF ;
    public final String entryRuleAAndOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAAndOP = null;


        try {
            // InternalAlpha.g:7561:46: (iv_ruleAAndOP= ruleAAndOP EOF )
            // InternalAlpha.g:7562:2: iv_ruleAAndOP= ruleAAndOP EOF
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
    // InternalAlpha.g:7568:1: ruleAAndOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'and' ;
    public final AntlrDatatypeRuleToken ruleAAndOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:7574:2: (kw= 'and' )
            // InternalAlpha.g:7575:2: kw= 'and'
            {
            kw=(Token)match(input,48,FOLLOW_2); 

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
    // InternalAlpha.g:7583:1: entryRuleARelationalOP returns [String current=null] : iv_ruleARelationalOP= ruleARelationalOP EOF ;
    public final String entryRuleARelationalOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleARelationalOP = null;


        try {
            // InternalAlpha.g:7583:53: (iv_ruleARelationalOP= ruleARelationalOP EOF )
            // InternalAlpha.g:7584:2: iv_ruleARelationalOP= ruleARelationalOP EOF
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
    // InternalAlpha.g:7590:1: ruleARelationalOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '!=' | kw= '>=' | kw= '>' | kw= '<' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken ruleARelationalOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:7596:2: ( (kw= '=' | kw= '!=' | kw= '>=' | kw= '>' | kw= '<' | kw= '<=' ) )
            // InternalAlpha.g:7597:2: (kw= '=' | kw= '!=' | kw= '>=' | kw= '>' | kw= '<' | kw= '<=' )
            {
            // InternalAlpha.g:7597:2: (kw= '=' | kw= '!=' | kw= '>=' | kw= '>' | kw= '<' | kw= '<=' )
            int alt97=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt97=1;
                }
                break;
            case 74:
                {
                alt97=2;
                }
                break;
            case 52:
                {
                alt97=3;
                }
                break;
            case 53:
                {
                alt97=4;
                }
                break;
            case 54:
                {
                alt97=5;
                }
                break;
            case 55:
                {
                alt97=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // InternalAlpha.g:7598:3: kw= '='
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:7604:3: kw= '!='
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getExclamationMarkEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:7610:3: kw= '>='
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getGreaterThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:7616:3: kw= '>'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getGreaterThanSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:7622:3: kw= '<'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getLessThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:7628:3: kw= '<='
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

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
    // InternalAlpha.g:7637:1: entryRuleAAdditiveOP returns [String current=null] : iv_ruleAAdditiveOP= ruleAAdditiveOP EOF ;
    public final String entryRuleAAdditiveOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAAdditiveOP = null;


        try {
            // InternalAlpha.g:7637:51: (iv_ruleAAdditiveOP= ruleAAdditiveOP EOF )
            // InternalAlpha.g:7638:2: iv_ruleAAdditiveOP= ruleAAdditiveOP EOF
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
    // InternalAlpha.g:7644:1: ruleAAdditiveOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAAdditiveOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:7650:2: ( (kw= '+' | kw= '-' ) )
            // InternalAlpha.g:7651:2: (kw= '+' | kw= '-' )
            {
            // InternalAlpha.g:7651:2: (kw= '+' | kw= '-' )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==43) ) {
                alt98=1;
            }
            else if ( (LA98_0==44) ) {
                alt98=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // InternalAlpha.g:7652:3: kw= '+'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAAdditiveOPAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:7658:3: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

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
    // InternalAlpha.g:7667:1: entryRuleAMultiplicativeOP returns [String current=null] : iv_ruleAMultiplicativeOP= ruleAMultiplicativeOP EOF ;
    public final String entryRuleAMultiplicativeOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAMultiplicativeOP = null;


        try {
            // InternalAlpha.g:7667:57: (iv_ruleAMultiplicativeOP= ruleAMultiplicativeOP EOF )
            // InternalAlpha.g:7668:2: iv_ruleAMultiplicativeOP= ruleAMultiplicativeOP EOF
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
    // InternalAlpha.g:7674:1: ruleAMultiplicativeOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleAMultiplicativeOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:7680:2: ( (kw= '*' | kw= '/' ) )
            // InternalAlpha.g:7681:2: (kw= '*' | kw= '/' )
            {
            // InternalAlpha.g:7681:2: (kw= '*' | kw= '/' )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==45) ) {
                alt99=1;
            }
            else if ( (LA99_0==46) ) {
                alt99=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // InternalAlpha.g:7682:3: kw= '*'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAMultiplicativeOPAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:7688:3: kw= '/'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

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
    // InternalAlpha.g:7697:1: entryRuleAMINMAX_OP returns [String current=null] : iv_ruleAMINMAX_OP= ruleAMINMAX_OP EOF ;
    public final String entryRuleAMINMAX_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAMINMAX_OP = null;


        try {
            // InternalAlpha.g:7697:50: (iv_ruleAMINMAX_OP= ruleAMINMAX_OP EOF )
            // InternalAlpha.g:7698:2: iv_ruleAMINMAX_OP= ruleAMINMAX_OP EOF
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
    // InternalAlpha.g:7704:1: ruleAMINMAX_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'min' | kw= 'max' ) ;
    public final AntlrDatatypeRuleToken ruleAMINMAX_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:7710:2: ( (kw= 'min' | kw= 'max' ) )
            // InternalAlpha.g:7711:2: (kw= 'min' | kw= 'max' )
            {
            // InternalAlpha.g:7711:2: (kw= 'min' | kw= 'max' )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==69) ) {
                alt100=1;
            }
            else if ( (LA100_0==70) ) {
                alt100=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // InternalAlpha.g:7712:3: kw= 'min'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAMINMAX_OPAccess().getMinKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:7718:3: kw= 'max'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

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
    // InternalAlpha.g:7727:1: entryRuleAUnaryOP returns [String current=null] : iv_ruleAUnaryOP= ruleAUnaryOP EOF ;
    public final String entryRuleAUnaryOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAUnaryOP = null;


        try {
            // InternalAlpha.g:7727:48: (iv_ruleAUnaryOP= ruleAUnaryOP EOF )
            // InternalAlpha.g:7728:2: iv_ruleAUnaryOP= ruleAUnaryOP EOF
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
    // InternalAlpha.g:7734:1: ruleAUnaryOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'not' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAUnaryOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:7740:2: ( (kw= 'not' | kw= '-' ) )
            // InternalAlpha.g:7741:2: (kw= 'not' | kw= '-' )
            {
            // InternalAlpha.g:7741:2: (kw= 'not' | kw= '-' )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==75) ) {
                alt101=1;
            }
            else if ( (LA101_0==44) ) {
                alt101=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // InternalAlpha.g:7742:3: kw= 'not'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryOPAccess().getNotKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:7748:3: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

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
    // InternalAlpha.g:7757:1: entryRulePolyhedralObject returns [EObject current=null] : iv_rulePolyhedralObject= rulePolyhedralObject EOF ;
    public final EObject entryRulePolyhedralObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyhedralObject = null;


        try {
            // InternalAlpha.g:7757:57: (iv_rulePolyhedralObject= rulePolyhedralObject EOF )
            // InternalAlpha.g:7758:2: iv_rulePolyhedralObject= rulePolyhedralObject EOF
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
    // InternalAlpha.g:7764:1: rulePolyhedralObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleCalculatorExpression ) ) ) ;
    public final EObject rulePolyhedralObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:7770:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleCalculatorExpression ) ) ) )
            // InternalAlpha.g:7771:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleCalculatorExpression ) ) )
            {
            // InternalAlpha.g:7771:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleCalculatorExpression ) ) )
            // InternalAlpha.g:7772:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleCalculatorExpression ) )
            {
            // InternalAlpha.g:7772:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:7773:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:7773:4: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:7774:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_1=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getPolyhedralObjectAccess().getEqualsSignKeyword_1());
            		
            // InternalAlpha.g:7794:3: ( (lv_expr_2_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:7795:4: (lv_expr_2_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:7795:4: (lv_expr_2_0= ruleCalculatorExpression )
            // InternalAlpha.g:7796:5: lv_expr_2_0= ruleCalculatorExpression
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
    // InternalAlpha.g:7817:1: entryRuleCalculatorExpression returns [EObject current=null] : iv_ruleCalculatorExpression= ruleCalculatorExpression EOF ;
    public final EObject entryRuleCalculatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculatorExpression = null;


        try {
            // InternalAlpha.g:7817:61: (iv_ruleCalculatorExpression= ruleCalculatorExpression EOF )
            // InternalAlpha.g:7818:2: iv_ruleCalculatorExpression= ruleCalculatorExpression EOF
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
    // InternalAlpha.g:7824:1: ruleCalculatorExpression returns [EObject current=null] : (this_UnaryOrTerminalCalculatorExpression_0= ruleUnaryOrTerminalCalculatorExpression ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )* ) ;
    public final EObject ruleCalculatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOrTerminalCalculatorExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:7830:2: ( (this_UnaryOrTerminalCalculatorExpression_0= ruleUnaryOrTerminalCalculatorExpression ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )* ) )
            // InternalAlpha.g:7831:2: (this_UnaryOrTerminalCalculatorExpression_0= ruleUnaryOrTerminalCalculatorExpression ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )* )
            {
            // InternalAlpha.g:7831:2: (this_UnaryOrTerminalCalculatorExpression_0= ruleUnaryOrTerminalCalculatorExpression ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )* )
            // InternalAlpha.g:7832:3: this_UnaryOrTerminalCalculatorExpression_0= ruleUnaryOrTerminalCalculatorExpression ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getCalculatorExpressionAccess().getUnaryOrTerminalCalculatorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_78);
            this_UnaryOrTerminalCalculatorExpression_0=ruleUnaryOrTerminalCalculatorExpression();

            state._fsp--;


            			current = this_UnaryOrTerminalCalculatorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:7840:3: ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( ((LA102_0>=43 && LA102_0<=45)||LA102_0==62||(LA102_0>=83 && LA102_0<=85)) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // InternalAlpha.g:7841:4: () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) )
            	    {
            	    // InternalAlpha.g:7841:4: ()
            	    // InternalAlpha.g:7842:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCalculatorExpressionAccess().getBinaryCalculatorExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:7848:4: ( (lv_operator_2_0= ruleABinaryCalcOp ) )
            	    // InternalAlpha.g:7849:5: (lv_operator_2_0= ruleABinaryCalcOp )
            	    {
            	    // InternalAlpha.g:7849:5: (lv_operator_2_0= ruleABinaryCalcOp )
            	    // InternalAlpha.g:7850:6: lv_operator_2_0= ruleABinaryCalcOp
            	    {

            	    						newCompositeNode(grammarAccess.getCalculatorExpressionAccess().getOperatorABinaryCalcOpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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

            	    // InternalAlpha.g:7867:4: ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) )
            	    // InternalAlpha.g:7868:5: (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression )
            	    {
            	    // InternalAlpha.g:7868:5: (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression )
            	    // InternalAlpha.g:7869:6: lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getCalculatorExpressionAccess().getRightUnaryOrTerminalCalculatorExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_78);
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
            	    break loop102;
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
    // InternalAlpha.g:7891:1: entryRuleUnaryOrTerminalCalculatorExpression returns [EObject current=null] : iv_ruleUnaryOrTerminalCalculatorExpression= ruleUnaryOrTerminalCalculatorExpression EOF ;
    public final EObject entryRuleUnaryOrTerminalCalculatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOrTerminalCalculatorExpression = null;


        try {
            // InternalAlpha.g:7891:76: (iv_ruleUnaryOrTerminalCalculatorExpression= ruleUnaryOrTerminalCalculatorExpression EOF )
            // InternalAlpha.g:7892:2: iv_ruleUnaryOrTerminalCalculatorExpression= ruleUnaryOrTerminalCalculatorExpression EOF
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
    // InternalAlpha.g:7898:1: ruleUnaryOrTerminalCalculatorExpression returns [EObject current=null] : (this_UnaryCalculatorExpression_0= ruleUnaryCalculatorExpression | this_CalculatorExpressionTerminal_1= ruleCalculatorExpressionTerminal ) ;
    public final EObject ruleUnaryOrTerminalCalculatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryCalculatorExpression_0 = null;

        EObject this_CalculatorExpressionTerminal_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:7904:2: ( (this_UnaryCalculatorExpression_0= ruleUnaryCalculatorExpression | this_CalculatorExpressionTerminal_1= ruleCalculatorExpressionTerminal ) )
            // InternalAlpha.g:7905:2: (this_UnaryCalculatorExpression_0= ruleUnaryCalculatorExpression | this_CalculatorExpressionTerminal_1= ruleCalculatorExpressionTerminal )
            {
            // InternalAlpha.g:7905:2: (this_UnaryCalculatorExpression_0= ruleUnaryCalculatorExpression | this_CalculatorExpressionTerminal_1= ruleCalculatorExpressionTerminal )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( ((LA103_0>=77 && LA103_0<=82)) ) {
                alt103=1;
            }
            else if ( (LA103_0==RULE_ID||LA103_0==15||LA103_0==19||LA103_0==37||LA103_0==42) ) {
                alt103=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // InternalAlpha.g:7906:3: this_UnaryCalculatorExpression_0= ruleUnaryCalculatorExpression
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
                    // InternalAlpha.g:7915:3: this_CalculatorExpressionTerminal_1= ruleCalculatorExpressionTerminal
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
    // InternalAlpha.g:7927:1: entryRuleCalculatorExpressionTerminal returns [EObject current=null] : iv_ruleCalculatorExpressionTerminal= ruleCalculatorExpressionTerminal EOF ;
    public final EObject entryRuleCalculatorExpressionTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculatorExpressionTerminal = null;


        try {
            // InternalAlpha.g:7927:69: (iv_ruleCalculatorExpressionTerminal= ruleCalculatorExpressionTerminal EOF )
            // InternalAlpha.g:7928:2: iv_ruleCalculatorExpressionTerminal= ruleCalculatorExpressionTerminal EOF
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
    // InternalAlpha.g:7934:1: ruleCalculatorExpressionTerminal returns [EObject current=null] : (this_JNIDomain_0= ruleJNIDomain | this_JNIRelation_1= ruleJNIRelation | this_JNIFunction_2= ruleJNIFunction | this_DefinedObject_3= ruleDefinedObject | this_RectangularDomain_4= ruleRectangularDomain | this_VariableDomain_5= ruleVariableDomain | (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' ) ) ;
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
            // InternalAlpha.g:7940:2: ( (this_JNIDomain_0= ruleJNIDomain | this_JNIRelation_1= ruleJNIRelation | this_JNIFunction_2= ruleJNIFunction | this_DefinedObject_3= ruleDefinedObject | this_RectangularDomain_4= ruleRectangularDomain | this_VariableDomain_5= ruleVariableDomain | (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' ) ) )
            // InternalAlpha.g:7941:2: (this_JNIDomain_0= ruleJNIDomain | this_JNIRelation_1= ruleJNIRelation | this_JNIFunction_2= ruleJNIFunction | this_DefinedObject_3= ruleDefinedObject | this_RectangularDomain_4= ruleRectangularDomain | this_VariableDomain_5= ruleVariableDomain | (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' ) )
            {
            // InternalAlpha.g:7941:2: (this_JNIDomain_0= ruleJNIDomain | this_JNIRelation_1= ruleJNIRelation | this_JNIFunction_2= ruleJNIFunction | this_DefinedObject_3= ruleDefinedObject | this_RectangularDomain_4= ruleRectangularDomain | this_VariableDomain_5= ruleVariableDomain | (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' ) )
            int alt104=7;
            alt104 = dfa104.predict(input);
            switch (alt104) {
                case 1 :
                    // InternalAlpha.g:7942:3: this_JNIDomain_0= ruleJNIDomain
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
                    // InternalAlpha.g:7951:3: this_JNIRelation_1= ruleJNIRelation
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
                    // InternalAlpha.g:7960:3: this_JNIFunction_2= ruleJNIFunction
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
                    // InternalAlpha.g:7969:3: this_DefinedObject_3= ruleDefinedObject
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
                    // InternalAlpha.g:7978:3: this_RectangularDomain_4= ruleRectangularDomain
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
                    // InternalAlpha.g:7987:3: this_VariableDomain_5= ruleVariableDomain
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
                    // InternalAlpha.g:7996:3: (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' )
                    {
                    // InternalAlpha.g:7996:3: (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' )
                    // InternalAlpha.g:7997:4: otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getCalculatorExpressionTerminalAccess().getLeftParenthesisKeyword_6_0());
                    			

                    				newCompositeNode(grammarAccess.getCalculatorExpressionTerminalAccess().getCalculatorExpressionParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_CalculatorExpression_7=ruleCalculatorExpression();

                    state._fsp--;


                    				current = this_CalculatorExpression_7;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_8=(Token)match(input,16,FOLLOW_2); 

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
    // InternalAlpha.g:8018:1: entryRuleUnaryCalculatorExpression returns [EObject current=null] : iv_ruleUnaryCalculatorExpression= ruleUnaryCalculatorExpression EOF ;
    public final EObject entryRuleUnaryCalculatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryCalculatorExpression = null;


        try {
            // InternalAlpha.g:8018:66: (iv_ruleUnaryCalculatorExpression= ruleUnaryCalculatorExpression EOF )
            // InternalAlpha.g:8019:2: iv_ruleUnaryCalculatorExpression= ruleUnaryCalculatorExpression EOF
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
    // InternalAlpha.g:8025:1: ruleUnaryCalculatorExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAUnaryCalcOp ) ) ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) ) ) ;
    public final EObject ruleUnaryCalculatorExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:8031:2: ( ( ( (lv_operator_0_0= ruleAUnaryCalcOp ) ) ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) ) ) )
            // InternalAlpha.g:8032:2: ( ( (lv_operator_0_0= ruleAUnaryCalcOp ) ) ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) ) )
            {
            // InternalAlpha.g:8032:2: ( ( (lv_operator_0_0= ruleAUnaryCalcOp ) ) ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) ) )
            // InternalAlpha.g:8033:3: ( (lv_operator_0_0= ruleAUnaryCalcOp ) ) ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) )
            {
            // InternalAlpha.g:8033:3: ( (lv_operator_0_0= ruleAUnaryCalcOp ) )
            // InternalAlpha.g:8034:4: (lv_operator_0_0= ruleAUnaryCalcOp )
            {
            // InternalAlpha.g:8034:4: (lv_operator_0_0= ruleAUnaryCalcOp )
            // InternalAlpha.g:8035:5: lv_operator_0_0= ruleAUnaryCalcOp
            {

            					newCompositeNode(grammarAccess.getUnaryCalculatorExpressionAccess().getOperatorAUnaryCalcOpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalAlpha.g:8052:3: ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) )
            // InternalAlpha.g:8053:4: (lv_expr_1_0= ruleCalculatorExpressionTerminal )
            {
            // InternalAlpha.g:8053:4: (lv_expr_1_0= ruleCalculatorExpressionTerminal )
            // InternalAlpha.g:8054:5: lv_expr_1_0= ruleCalculatorExpressionTerminal
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
    // InternalAlpha.g:8075:1: entryRuleVariableDomain returns [EObject current=null] : iv_ruleVariableDomain= ruleVariableDomain EOF ;
    public final EObject entryRuleVariableDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDomain = null;


        try {
            // InternalAlpha.g:8075:55: (iv_ruleVariableDomain= ruleVariableDomain EOF )
            // InternalAlpha.g:8076:2: iv_ruleVariableDomain= ruleVariableDomain EOF
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
    // InternalAlpha.g:8082:1: ruleVariableDomain returns [EObject current=null] : (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' ) ;
    public final EObject ruleVariableDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalAlpha.g:8088:2: ( (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' ) )
            // InternalAlpha.g:8089:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' )
            {
            // InternalAlpha.g:8089:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' )
            // InternalAlpha.g:8090:3: otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDomainAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAlpha.g:8094:3: ( (otherlv_1= RULE_ID ) )
            // InternalAlpha.g:8095:4: (otherlv_1= RULE_ID )
            {
            // InternalAlpha.g:8095:4: (otherlv_1= RULE_ID )
            // InternalAlpha.g:8096:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDomainRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getVariableDomainAccess().getVariableVariableCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

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
    // InternalAlpha.g:8115:1: entryRuleRectangularDomain returns [EObject current=null] : iv_ruleRectangularDomain= ruleRectangularDomain EOF ;
    public final EObject entryRuleRectangularDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangularDomain = null;


        try {
            // InternalAlpha.g:8115:58: (iv_ruleRectangularDomain= ruleRectangularDomain EOF )
            // InternalAlpha.g:8116:2: iv_ruleRectangularDomain= ruleRectangularDomain EOF
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
    // InternalAlpha.g:8122:1: ruleRectangularDomain returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleAISLExpression ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleAISLExpression ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? ) | (otherlv_11= '[' ( (lv_lowerBounds_12_0= ruleAISLExpression ) ) otherlv_13= ':' ( (lv_upperBounds_14_0= ruleAISLExpression ) ) (otherlv_15= ',' ( (lv_lowerBounds_16_0= ruleAISLExpression ) ) otherlv_17= ':' ( (lv_upperBounds_18_0= ruleAISLExpression ) ) )* otherlv_19= ']' (otherlv_20= 'as' otherlv_21= '[' ( (lv_indexNames_22_0= ruleIndexName ) ) (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )* otherlv_25= ']' )? ) ) ;
    public final EObject ruleRectangularDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_upperBounds_1_0 = null;

        AntlrDatatypeRuleToken lv_upperBounds_3_0 = null;

        AntlrDatatypeRuleToken lv_indexNames_7_0 = null;

        AntlrDatatypeRuleToken lv_indexNames_9_0 = null;

        AntlrDatatypeRuleToken lv_lowerBounds_12_0 = null;

        AntlrDatatypeRuleToken lv_upperBounds_14_0 = null;

        AntlrDatatypeRuleToken lv_lowerBounds_16_0 = null;

        AntlrDatatypeRuleToken lv_upperBounds_18_0 = null;

        AntlrDatatypeRuleToken lv_indexNames_22_0 = null;

        AntlrDatatypeRuleToken lv_indexNames_24_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:8128:2: ( ( (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleAISLExpression ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleAISLExpression ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? ) | (otherlv_11= '[' ( (lv_lowerBounds_12_0= ruleAISLExpression ) ) otherlv_13= ':' ( (lv_upperBounds_14_0= ruleAISLExpression ) ) (otherlv_15= ',' ( (lv_lowerBounds_16_0= ruleAISLExpression ) ) otherlv_17= ':' ( (lv_upperBounds_18_0= ruleAISLExpression ) ) )* otherlv_19= ']' (otherlv_20= 'as' otherlv_21= '[' ( (lv_indexNames_22_0= ruleIndexName ) ) (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )* otherlv_25= ']' )? ) ) )
            // InternalAlpha.g:8129:2: ( (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleAISLExpression ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleAISLExpression ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? ) | (otherlv_11= '[' ( (lv_lowerBounds_12_0= ruleAISLExpression ) ) otherlv_13= ':' ( (lv_upperBounds_14_0= ruleAISLExpression ) ) (otherlv_15= ',' ( (lv_lowerBounds_16_0= ruleAISLExpression ) ) otherlv_17= ':' ( (lv_upperBounds_18_0= ruleAISLExpression ) ) )* otherlv_19= ']' (otherlv_20= 'as' otherlv_21= '[' ( (lv_indexNames_22_0= ruleIndexName ) ) (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )* otherlv_25= ']' )? ) )
            {
            // InternalAlpha.g:8129:2: ( (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleAISLExpression ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleAISLExpression ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? ) | (otherlv_11= '[' ( (lv_lowerBounds_12_0= ruleAISLExpression ) ) otherlv_13= ':' ( (lv_upperBounds_14_0= ruleAISLExpression ) ) (otherlv_15= ',' ( (lv_lowerBounds_16_0= ruleAISLExpression ) ) otherlv_17= ':' ( (lv_upperBounds_18_0= ruleAISLExpression ) ) )* otherlv_19= ']' (otherlv_20= 'as' otherlv_21= '[' ( (lv_indexNames_22_0= ruleIndexName ) ) (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )* otherlv_25= ']' )? ) )
            int alt111=2;
            alt111 = dfa111.predict(input);
            switch (alt111) {
                case 1 :
                    // InternalAlpha.g:8130:3: (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleAISLExpression ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleAISLExpression ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? )
                    {
                    // InternalAlpha.g:8130:3: (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleAISLExpression ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleAISLExpression ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? )
                    // InternalAlpha.g:8131:4: otherlv_0= '[' ( (lv_upperBounds_1_0= ruleAISLExpression ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleAISLExpression ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )?
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_33); 

                    				newLeafNode(otherlv_0, grammarAccess.getRectangularDomainAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalAlpha.g:8135:4: ( (lv_upperBounds_1_0= ruleAISLExpression ) )
                    // InternalAlpha.g:8136:5: (lv_upperBounds_1_0= ruleAISLExpression )
                    {
                    // InternalAlpha.g:8136:5: (lv_upperBounds_1_0= ruleAISLExpression )
                    // InternalAlpha.g:8137:6: lv_upperBounds_1_0= ruleAISLExpression
                    {

                    						newCompositeNode(grammarAccess.getRectangularDomainAccess().getUpperBoundsAISLExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_upperBounds_1_0=ruleAISLExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRectangularDomainRule());
                    						}
                    						add(
                    							current,
                    							"upperBounds",
                    							lv_upperBounds_1_0,
                    							"alpha.model.Alpha.AISLExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlpha.g:8154:4: (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleAISLExpression ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==24) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalAlpha.g:8155:5: otherlv_2= ',' ( (lv_upperBounds_3_0= ruleAISLExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,24,FOLLOW_33); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getRectangularDomainAccess().getCommaKeyword_0_2_0());
                    	    				
                    	    // InternalAlpha.g:8159:5: ( (lv_upperBounds_3_0= ruleAISLExpression ) )
                    	    // InternalAlpha.g:8160:6: (lv_upperBounds_3_0= ruleAISLExpression )
                    	    {
                    	    // InternalAlpha.g:8160:6: (lv_upperBounds_3_0= ruleAISLExpression )
                    	    // InternalAlpha.g:8161:7: lv_upperBounds_3_0= ruleAISLExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getRectangularDomainAccess().getUpperBoundsAISLExpressionParserRuleCall_0_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    lv_upperBounds_3_0=ruleAISLExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRectangularDomainRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"upperBounds",
                    	    								lv_upperBounds_3_0,
                    	    								"alpha.model.Alpha.AISLExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,38,FOLLOW_79); 

                    				newLeafNode(otherlv_4, grammarAccess.getRectangularDomainAccess().getRightSquareBracketKeyword_0_3());
                    			
                    // InternalAlpha.g:8183:4: (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==76) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // InternalAlpha.g:8184:5: otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']'
                            {
                            otherlv_5=(Token)match(input,76,FOLLOW_12); 

                            					newLeafNode(otherlv_5, grammarAccess.getRectangularDomainAccess().getAsKeyword_0_4_0());
                            				
                            otherlv_6=(Token)match(input,37,FOLLOW_5); 

                            					newLeafNode(otherlv_6, grammarAccess.getRectangularDomainAccess().getLeftSquareBracketKeyword_0_4_1());
                            				
                            // InternalAlpha.g:8192:5: ( (lv_indexNames_7_0= ruleIndexName ) )
                            // InternalAlpha.g:8193:6: (lv_indexNames_7_0= ruleIndexName )
                            {
                            // InternalAlpha.g:8193:6: (lv_indexNames_7_0= ruleIndexName )
                            // InternalAlpha.g:8194:7: lv_indexNames_7_0= ruleIndexName
                            {

                            							newCompositeNode(grammarAccess.getRectangularDomainAccess().getIndexNamesIndexNameParserRuleCall_0_4_2_0());
                            						
                            pushFollow(FOLLOW_32);
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

                            // InternalAlpha.g:8211:5: (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )*
                            loop106:
                            do {
                                int alt106=2;
                                int LA106_0 = input.LA(1);

                                if ( (LA106_0==24) ) {
                                    alt106=1;
                                }


                                switch (alt106) {
                            	case 1 :
                            	    // InternalAlpha.g:8212:6: otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) )
                            	    {
                            	    otherlv_8=(Token)match(input,24,FOLLOW_5); 

                            	    						newLeafNode(otherlv_8, grammarAccess.getRectangularDomainAccess().getCommaKeyword_0_4_3_0());
                            	    					
                            	    // InternalAlpha.g:8216:6: ( (lv_indexNames_9_0= ruleIndexName ) )
                            	    // InternalAlpha.g:8217:7: (lv_indexNames_9_0= ruleIndexName )
                            	    {
                            	    // InternalAlpha.g:8217:7: (lv_indexNames_9_0= ruleIndexName )
                            	    // InternalAlpha.g:8218:8: lv_indexNames_9_0= ruleIndexName
                            	    {

                            	    								newCompositeNode(grammarAccess.getRectangularDomainAccess().getIndexNamesIndexNameParserRuleCall_0_4_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_32);
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
                            	    break loop106;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,38,FOLLOW_2); 

                            					newLeafNode(otherlv_10, grammarAccess.getRectangularDomainAccess().getRightSquareBracketKeyword_0_4_4());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlpha.g:8243:3: (otherlv_11= '[' ( (lv_lowerBounds_12_0= ruleAISLExpression ) ) otherlv_13= ':' ( (lv_upperBounds_14_0= ruleAISLExpression ) ) (otherlv_15= ',' ( (lv_lowerBounds_16_0= ruleAISLExpression ) ) otherlv_17= ':' ( (lv_upperBounds_18_0= ruleAISLExpression ) ) )* otherlv_19= ']' (otherlv_20= 'as' otherlv_21= '[' ( (lv_indexNames_22_0= ruleIndexName ) ) (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )* otherlv_25= ']' )? )
                    {
                    // InternalAlpha.g:8243:3: (otherlv_11= '[' ( (lv_lowerBounds_12_0= ruleAISLExpression ) ) otherlv_13= ':' ( (lv_upperBounds_14_0= ruleAISLExpression ) ) (otherlv_15= ',' ( (lv_lowerBounds_16_0= ruleAISLExpression ) ) otherlv_17= ':' ( (lv_upperBounds_18_0= ruleAISLExpression ) ) )* otherlv_19= ']' (otherlv_20= 'as' otherlv_21= '[' ( (lv_indexNames_22_0= ruleIndexName ) ) (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )* otherlv_25= ']' )? )
                    // InternalAlpha.g:8244:4: otherlv_11= '[' ( (lv_lowerBounds_12_0= ruleAISLExpression ) ) otherlv_13= ':' ( (lv_upperBounds_14_0= ruleAISLExpression ) ) (otherlv_15= ',' ( (lv_lowerBounds_16_0= ruleAISLExpression ) ) otherlv_17= ':' ( (lv_upperBounds_18_0= ruleAISLExpression ) ) )* otherlv_19= ']' (otherlv_20= 'as' otherlv_21= '[' ( (lv_indexNames_22_0= ruleIndexName ) ) (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )* otherlv_25= ']' )?
                    {
                    otherlv_11=(Token)match(input,37,FOLLOW_33); 

                    				newLeafNode(otherlv_11, grammarAccess.getRectangularDomainAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAlpha.g:8248:4: ( (lv_lowerBounds_12_0= ruleAISLExpression ) )
                    // InternalAlpha.g:8249:5: (lv_lowerBounds_12_0= ruleAISLExpression )
                    {
                    // InternalAlpha.g:8249:5: (lv_lowerBounds_12_0= ruleAISLExpression )
                    // InternalAlpha.g:8250:6: lv_lowerBounds_12_0= ruleAISLExpression
                    {

                    						newCompositeNode(grammarAccess.getRectangularDomainAccess().getLowerBoundsAISLExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_lowerBounds_12_0=ruleAISLExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRectangularDomainRule());
                    						}
                    						add(
                    							current,
                    							"lowerBounds",
                    							lv_lowerBounds_12_0,
                    							"alpha.model.Alpha.AISLExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,33,FOLLOW_33); 

                    				newLeafNode(otherlv_13, grammarAccess.getRectangularDomainAccess().getColonKeyword_1_2());
                    			
                    // InternalAlpha.g:8271:4: ( (lv_upperBounds_14_0= ruleAISLExpression ) )
                    // InternalAlpha.g:8272:5: (lv_upperBounds_14_0= ruleAISLExpression )
                    {
                    // InternalAlpha.g:8272:5: (lv_upperBounds_14_0= ruleAISLExpression )
                    // InternalAlpha.g:8273:6: lv_upperBounds_14_0= ruleAISLExpression
                    {

                    						newCompositeNode(grammarAccess.getRectangularDomainAccess().getUpperBoundsAISLExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_upperBounds_14_0=ruleAISLExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRectangularDomainRule());
                    						}
                    						add(
                    							current,
                    							"upperBounds",
                    							lv_upperBounds_14_0,
                    							"alpha.model.Alpha.AISLExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlpha.g:8290:4: (otherlv_15= ',' ( (lv_lowerBounds_16_0= ruleAISLExpression ) ) otherlv_17= ':' ( (lv_upperBounds_18_0= ruleAISLExpression ) ) )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==24) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // InternalAlpha.g:8291:5: otherlv_15= ',' ( (lv_lowerBounds_16_0= ruleAISLExpression ) ) otherlv_17= ':' ( (lv_upperBounds_18_0= ruleAISLExpression ) )
                    	    {
                    	    otherlv_15=(Token)match(input,24,FOLLOW_33); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getRectangularDomainAccess().getCommaKeyword_1_4_0());
                    	    				
                    	    // InternalAlpha.g:8295:5: ( (lv_lowerBounds_16_0= ruleAISLExpression ) )
                    	    // InternalAlpha.g:8296:6: (lv_lowerBounds_16_0= ruleAISLExpression )
                    	    {
                    	    // InternalAlpha.g:8296:6: (lv_lowerBounds_16_0= ruleAISLExpression )
                    	    // InternalAlpha.g:8297:7: lv_lowerBounds_16_0= ruleAISLExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getRectangularDomainAccess().getLowerBoundsAISLExpressionParserRuleCall_1_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    lv_lowerBounds_16_0=ruleAISLExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRectangularDomainRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"lowerBounds",
                    	    								lv_lowerBounds_16_0,
                    	    								"alpha.model.Alpha.AISLExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_17=(Token)match(input,33,FOLLOW_33); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getRectangularDomainAccess().getColonKeyword_1_4_2());
                    	    				
                    	    // InternalAlpha.g:8318:5: ( (lv_upperBounds_18_0= ruleAISLExpression ) )
                    	    // InternalAlpha.g:8319:6: (lv_upperBounds_18_0= ruleAISLExpression )
                    	    {
                    	    // InternalAlpha.g:8319:6: (lv_upperBounds_18_0= ruleAISLExpression )
                    	    // InternalAlpha.g:8320:7: lv_upperBounds_18_0= ruleAISLExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getRectangularDomainAccess().getUpperBoundsAISLExpressionParserRuleCall_1_4_3_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    lv_upperBounds_18_0=ruleAISLExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRectangularDomainRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"upperBounds",
                    	    								lv_upperBounds_18_0,
                    	    								"alpha.model.Alpha.AISLExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop108;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,38,FOLLOW_79); 

                    				newLeafNode(otherlv_19, grammarAccess.getRectangularDomainAccess().getRightSquareBracketKeyword_1_5());
                    			
                    // InternalAlpha.g:8342:4: (otherlv_20= 'as' otherlv_21= '[' ( (lv_indexNames_22_0= ruleIndexName ) ) (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )* otherlv_25= ']' )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==76) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // InternalAlpha.g:8343:5: otherlv_20= 'as' otherlv_21= '[' ( (lv_indexNames_22_0= ruleIndexName ) ) (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )* otherlv_25= ']'
                            {
                            otherlv_20=(Token)match(input,76,FOLLOW_12); 

                            					newLeafNode(otherlv_20, grammarAccess.getRectangularDomainAccess().getAsKeyword_1_6_0());
                            				
                            otherlv_21=(Token)match(input,37,FOLLOW_5); 

                            					newLeafNode(otherlv_21, grammarAccess.getRectangularDomainAccess().getLeftSquareBracketKeyword_1_6_1());
                            				
                            // InternalAlpha.g:8351:5: ( (lv_indexNames_22_0= ruleIndexName ) )
                            // InternalAlpha.g:8352:6: (lv_indexNames_22_0= ruleIndexName )
                            {
                            // InternalAlpha.g:8352:6: (lv_indexNames_22_0= ruleIndexName )
                            // InternalAlpha.g:8353:7: lv_indexNames_22_0= ruleIndexName
                            {

                            							newCompositeNode(grammarAccess.getRectangularDomainAccess().getIndexNamesIndexNameParserRuleCall_1_6_2_0());
                            						
                            pushFollow(FOLLOW_32);
                            lv_indexNames_22_0=ruleIndexName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRectangularDomainRule());
                            							}
                            							add(
                            								current,
                            								"indexNames",
                            								lv_indexNames_22_0,
                            								"alpha.model.Alpha.IndexName");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalAlpha.g:8370:5: (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )*
                            loop109:
                            do {
                                int alt109=2;
                                int LA109_0 = input.LA(1);

                                if ( (LA109_0==24) ) {
                                    alt109=1;
                                }


                                switch (alt109) {
                            	case 1 :
                            	    // InternalAlpha.g:8371:6: otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) )
                            	    {
                            	    otherlv_23=(Token)match(input,24,FOLLOW_5); 

                            	    						newLeafNode(otherlv_23, grammarAccess.getRectangularDomainAccess().getCommaKeyword_1_6_3_0());
                            	    					
                            	    // InternalAlpha.g:8375:6: ( (lv_indexNames_24_0= ruleIndexName ) )
                            	    // InternalAlpha.g:8376:7: (lv_indexNames_24_0= ruleIndexName )
                            	    {
                            	    // InternalAlpha.g:8376:7: (lv_indexNames_24_0= ruleIndexName )
                            	    // InternalAlpha.g:8377:8: lv_indexNames_24_0= ruleIndexName
                            	    {

                            	    								newCompositeNode(grammarAccess.getRectangularDomainAccess().getIndexNamesIndexNameParserRuleCall_1_6_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_32);
                            	    lv_indexNames_24_0=ruleIndexName();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getRectangularDomainRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"indexNames",
                            	    									lv_indexNames_24_0,
                            	    									"alpha.model.Alpha.IndexName");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop109;
                                }
                            } while (true);

                            otherlv_25=(Token)match(input,38,FOLLOW_2); 

                            					newLeafNode(otherlv_25, grammarAccess.getRectangularDomainAccess().getRightSquareBracketKeyword_1_6_4());
                            				

                            }
                            break;

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
    // $ANTLR end "ruleRectangularDomain"


    // $ANTLR start "entryRuleDefinedObject"
    // InternalAlpha.g:8405:1: entryRuleDefinedObject returns [EObject current=null] : iv_ruleDefinedObject= ruleDefinedObject EOF ;
    public final EObject entryRuleDefinedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinedObject = null;


        try {
            // InternalAlpha.g:8405:54: (iv_ruleDefinedObject= ruleDefinedObject EOF )
            // InternalAlpha.g:8406:2: iv_ruleDefinedObject= ruleDefinedObject EOF
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
    // InternalAlpha.g:8412:1: ruleDefinedObject returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDefinedObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:8418:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalAlpha.g:8419:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalAlpha.g:8419:2: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:8420:3: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:8420:3: (otherlv_0= RULE_ID )
            // InternalAlpha.g:8421:4: otherlv_0= RULE_ID
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
    // InternalAlpha.g:8435:1: entryRuleAUnaryCalcOp returns [String current=null] : iv_ruleAUnaryCalcOp= ruleAUnaryCalcOp EOF ;
    public final String entryRuleAUnaryCalcOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAUnaryCalcOp = null;


        try {
            // InternalAlpha.g:8435:52: (iv_ruleAUnaryCalcOp= ruleAUnaryCalcOp EOF )
            // InternalAlpha.g:8436:2: iv_ruleAUnaryCalcOp= ruleAUnaryCalcOp EOF
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
    // InternalAlpha.g:8442:1: ruleAUnaryCalcOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'domain' | kw= 'range' | kw= 'complement' | kw= 'affine-hull' | kw= 'poly-hull' | kw= 'reverse' ) ;
    public final AntlrDatatypeRuleToken ruleAUnaryCalcOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:8448:2: ( (kw= 'domain' | kw= 'range' | kw= 'complement' | kw= 'affine-hull' | kw= 'poly-hull' | kw= 'reverse' ) )
            // InternalAlpha.g:8449:2: (kw= 'domain' | kw= 'range' | kw= 'complement' | kw= 'affine-hull' | kw= 'poly-hull' | kw= 'reverse' )
            {
            // InternalAlpha.g:8449:2: (kw= 'domain' | kw= 'range' | kw= 'complement' | kw= 'affine-hull' | kw= 'poly-hull' | kw= 'reverse' )
            int alt112=6;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt112=1;
                }
                break;
            case 78:
                {
                alt112=2;
                }
                break;
            case 79:
                {
                alt112=3;
                }
                break;
            case 80:
                {
                alt112=4;
                }
                break;
            case 81:
                {
                alt112=5;
                }
                break;
            case 82:
                {
                alt112=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // InternalAlpha.g:8450:3: kw= 'domain'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getDomainKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:8456:3: kw= 'range'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getRangeKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:8462:3: kw= 'complement'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getComplementKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:8468:3: kw= 'affine-hull'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getAffineHullKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:8474:3: kw= 'poly-hull'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getPolyHullKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:8480:3: kw= 'reverse'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

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
    // InternalAlpha.g:8489:1: entryRuleABinaryCalcOp returns [String current=null] : iv_ruleABinaryCalcOp= ruleABinaryCalcOp EOF ;
    public final String entryRuleABinaryCalcOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleABinaryCalcOp = null;


        try {
            // InternalAlpha.g:8489:53: (iv_ruleABinaryCalcOp= ruleABinaryCalcOp EOF )
            // InternalAlpha.g:8490:2: iv_ruleABinaryCalcOp= ruleABinaryCalcOp EOF
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
    // InternalAlpha.g:8496:1: ruleABinaryCalcOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'cross' | kw= '+' | kw= '-' | kw= '*' | kw= '@' | kw= 'intersectRange' | kw= 'subtractRange' ) ;
    public final AntlrDatatypeRuleToken ruleABinaryCalcOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:8502:2: ( (kw= 'cross' | kw= '+' | kw= '-' | kw= '*' | kw= '@' | kw= 'intersectRange' | kw= 'subtractRange' ) )
            // InternalAlpha.g:8503:2: (kw= 'cross' | kw= '+' | kw= '-' | kw= '*' | kw= '@' | kw= 'intersectRange' | kw= 'subtractRange' )
            {
            // InternalAlpha.g:8503:2: (kw= 'cross' | kw= '+' | kw= '-' | kw= '*' | kw= '@' | kw= 'intersectRange' | kw= 'subtractRange' )
            int alt113=7;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt113=1;
                }
                break;
            case 43:
                {
                alt113=2;
                }
                break;
            case 44:
                {
                alt113=3;
                }
                break;
            case 45:
                {
                alt113=4;
                }
                break;
            case 62:
                {
                alt113=5;
                }
                break;
            case 84:
                {
                alt113=6;
                }
                break;
            case 85:
                {
                alt113=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // InternalAlpha.g:8504:3: kw= 'cross'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getCrossKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:8510:3: kw= '+'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getPlusSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:8516:3: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getHyphenMinusKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:8522:3: kw= '*'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getAsteriskKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:8528:3: kw= '@'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getCommercialAtKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:8534:3: kw= 'intersectRange'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getIntersectRangeKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalAlpha.g:8540:3: kw= 'subtractRange'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getSubtractRangeKeyword_6());
                    		

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


    // $ANTLR start "entryRuleFLOAT"
    // InternalAlpha.g:8549:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalAlpha.g:8549:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalAlpha.g:8550:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT.getText(); 
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
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalAlpha.g:8556:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalAlpha.g:8562:2: ( ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            // InternalAlpha.g:8563:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            {
            // InternalAlpha.g:8563:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // InternalAlpha.g:8564:3: (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            // InternalAlpha.g:8564:3: (kw= '-' )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==44) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalAlpha.g:8565:4: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFLOATAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_80); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_1());
            		
            kw=(Token)match(input,29,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleSINT"
    // InternalAlpha.g:8594:1: entryRuleSINT returns [String current=null] : iv_ruleSINT= ruleSINT EOF ;
    public final String entryRuleSINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSINT = null;


        try {
            // InternalAlpha.g:8594:44: (iv_ruleSINT= ruleSINT EOF )
            // InternalAlpha.g:8595:2: iv_ruleSINT= ruleSINT EOF
            {
             newCompositeNode(grammarAccess.getSINTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSINT=ruleSINT();

            state._fsp--;

             current =iv_ruleSINT.getText(); 
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
    // $ANTLR end "entryRuleSINT"


    // $ANTLR start "ruleSINT"
    // InternalAlpha.g:8601:1: ruleSINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalAlpha.g:8607:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalAlpha.g:8608:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalAlpha.g:8608:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalAlpha.g:8609:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalAlpha.g:8609:3: (kw= '-' )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==44) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalAlpha.g:8610:4: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSINTAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getSINTAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleSINT"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA104 dfa104 = new DFA104(this);
    protected DFA111 dfa111 = new DFA111(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\30\1\uffff\1\4\1\uffff\1\30\1\uffff\1\4\1\uffff";
    static final String dfa_3s = "\1\43\1\uffff\1\41\1\uffff\1\43\1\uffff\1\41\1\uffff\1\43\1\uffff";
    static final String dfa_4s = "\1\uffff\1\5\1\uffff\1\3\1\uffff\1\1\1\uffff\1\4\1\uffff\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\24\uffff\3\1\1\uffff\4\1\2\uffff\1\3",
            "",
            "\1\4\10\uffff\1\5",
            "",
            "\1\6\36\uffff\1\7",
            "",
            "\1\10\10\uffff\1\11",
            "",
            "\1\6\36\uffff\1\7",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()+ loopback of 549:4: ( ( (lv_inputs_6_0= ruleVariable ) ) | ( ( (lv_inputs_7_0= ruleVariableNameOnly ) ) otherlv_8= ',' ( ( (lv_inputs_9_0= ruleVariableNameOnly ) ) otherlv_10= ',' )* ( (lv_inputs_11_0= ruleVariable ) ) ) | ( (lv_inputs_12_0= ruleFuzzyVariable ) ) | ( ( (lv_inputs_13_0= ruleFuzzyVariableNameOnly ) ) otherlv_14= ',' ( ( (lv_inputs_15_0= ruleFuzzyVariableNameOnly ) ) otherlv_16= ',' )* ( (lv_inputs_17_0= ruleFuzzyVariable ) ) ) )+";
        }
    }
    static final String[] dfa_7s = {
            "\1\2\25\uffff\2\1\1\uffff\4\1\2\uffff\1\3",
            "",
            "\1\4\10\uffff\1\5",
            "",
            "\1\6\36\uffff\1\7",
            "",
            "\1\10\10\uffff\1\11",
            "",
            "\1\6\36\uffff\1\7",
            ""
    };
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 736:4: ( ( (lv_outputs_19_0= ruleVariable ) ) | ( ( (lv_outputs_20_0= ruleVariableNameOnly ) ) otherlv_21= ',' ( ( (lv_outputs_22_0= ruleVariableNameOnly ) ) otherlv_23= ',' )* ( (lv_outputs_24_0= ruleVariable ) ) ) | ( (lv_outputs_25_0= ruleFuzzyVariable ) ) | ( ( (lv_outputs_26_0= ruleFuzzyVariableNameOnly ) ) otherlv_27= ',' ( ( (lv_outputs_28_0= ruleFuzzyVariableNameOnly ) ) otherlv_29= ',' )* ( (lv_outputs_30_0= ruleFuzzyVariable ) ) ) )+";
        }
    }
    static final String[] dfa_8s = {
            "\1\2\26\uffff\1\1\1\uffff\4\1\2\uffff\1\3",
            "",
            "\1\4\10\uffff\1\5",
            "",
            "\1\6\36\uffff\1\7",
            "",
            "\1\10\10\uffff\1\11",
            "",
            "\1\6\36\uffff\1\7",
            ""
    };
    static final short[][] dfa_8 = unpackEncodedStringArray(dfa_8s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_8;
        }
        public String getDescription() {
            return "()+ loopback of 923:4: ( ( (lv_locals_32_0= ruleVariable ) ) | ( ( (lv_locals_33_0= ruleVariableNameOnly ) ) otherlv_34= ',' ( ( (lv_locals_35_0= ruleVariableNameOnly ) ) otherlv_36= ',' )* ( (lv_locals_37_0= ruleVariable ) ) ) | ( (lv_locals_38_0= ruleFuzzyVariable ) ) | ( ( (lv_locals_39_0= ruleFuzzyVariableNameOnly ) ) otherlv_40= ',' ( ( (lv_locals_41_0= ruleFuzzyVariableNameOnly ) ) otherlv_42= ',' )* ( (lv_locals_43_0= ruleFuzzyVariable ) ) ) )+";
        }
    }
    static final String dfa_9s = "\31\uffff";
    static final String dfa_10s = "\3\uffff\1\21\1\uffff\1\21\1\23\21\uffff\1\21";
    static final String dfa_11s = "\2\4\1\uffff\1\15\1\5\2\15\1\17\5\uffff\1\15\4\uffff\1\5\4\uffff\1\4\1\15";
    static final String dfa_12s = "\1\111\1\113\1\uffff\1\112\1\5\2\112\1\45\5\uffff\1\112\4\uffff\1\5\4\uffff\1\45\1\112";
    static final String dfa_13s = "\2\uffff\1\2\5\uffff\1\11\1\12\1\13\1\14\1\16\1\uffff\1\5\1\1\1\6\1\3\1\uffff\1\4\1\15\1\7\1\10\2\uffff";
    static final String dfa_14s = "\31\uffff}>";
    static final String[] dfa_15s = {
            "\1\6\1\5\1\uffff\1\3\7\uffff\1\1\27\uffff\1\10\3\uffff\1\13\1\4\1\13\2\uffff\2\13\13\uffff\1\2\1\uffff\1\7\2\11\1\12\1\14\1\uffff\5\13",
            "\1\15\1\17\1\uffff\1\17\7\uffff\1\17\3\uffff\1\17\20\uffff\1\16\1\20\1\uffff\1\17\2\uffff\4\17\2\uffff\2\17\10\uffff\1\17\1\uffff\2\17\1\uffff\5\17\1\uffff\5\17\1\uffff\1\17",
            "",
            "\1\21\2\uffff\1\21\7\uffff\1\21\6\uffff\1\21\2\uffff\1\21\2\uffff\1\16\5\uffff\4\21\1\uffff\2\21\2\uffff\4\21\3\uffff\1\21\11\uffff\2\21\2\uffff\2\21",
            "\1\5",
            "\1\21\2\uffff\1\21\7\uffff\1\21\4\uffff\1\22\1\uffff\1\21\2\uffff\1\21\2\uffff\1\16\5\uffff\4\21\1\uffff\2\21\2\uffff\4\21\3\uffff\1\21\11\uffff\2\21\2\uffff\2\21",
            "\1\23\1\uffff\1\24\1\23\7\uffff\1\23\4\uffff\1\24\1\uffff\1\23\2\uffff\1\23\2\uffff\1\16\1\uffff\1\20\3\uffff\4\23\1\uffff\2\23\2\uffff\4\23\3\uffff\1\23\11\uffff\2\23\2\uffff\2\23",
            "\1\27\3\uffff\1\26\21\uffff\1\25",
            "",
            "",
            "",
            "",
            "",
            "\1\17\1\uffff\2\17\7\uffff\1\16\4\uffff\1\17\6\uffff\1\16\1\17\1\uffff\1\17\3\uffff\4\17\1\uffff\2\17\2\uffff\4\17\15\uffff\2\17\2\uffff\2\17",
            "",
            "",
            "",
            "",
            "\1\30",
            "",
            "",
            "",
            "",
            "\1\25\37\uffff\1\25\1\10",
            "\1\21\2\uffff\1\21\7\uffff\1\21\6\uffff\1\21\2\uffff\1\21\2\uffff\1\16\5\uffff\4\21\1\uffff\2\21\2\uffff\4\21\3\uffff\1\21\11\uffff\2\21\2\uffff\2\21"
    };

    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final char[] dfa_12 = DFA.unpackEncodedStringToUnsignedChars(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[][] dfa_15 = unpackEncodedStringArray(dfa_15s);

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = dfa_9;
            this.eof = dfa_10;
            this.min = dfa_11;
            this.max = dfa_12;
            this.accept = dfa_13;
            this.special = dfa_14;
            this.transition = dfa_15;
        }
        public String getDescription() {
            return "4422:2: ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_ConstantExpression_4= ruleConstantExpression | this_VariableExpression_5= ruleVariableExpression | this_DependenceExpression_6= ruleDependenceExpression | this_FuzzyDependenceExpression_7= ruleFuzzyDependenceExpression | this_IndexExpression_8= ruleIndexExpression | this_PolynomialIndexExpression_9= rulePolynomialIndexExpression | this_FuzzyIndexExpression_10= ruleFuzzyIndexExpression | this_Reductions_11= ruleReductions | this_ConvolutionExpression_12= ruleConvolutionExpression | this_MultiArgExpression_13= ruleMultiArgExpression | this_ExternalMultiArgExpression_14= ruleExternalMultiArgExpression | this_SelectExpression_15= ruleSelectExpression )";
        }
    }
    static final String dfa_16s = "\17\uffff";
    static final String dfa_17s = "\3\uffff\1\13\13\uffff";
    static final String dfa_18s = "\1\4\2\uffff\1\15\1\17\10\uffff\1\4\1\uffff";
    static final String dfa_19s = "\1\111\2\uffff\1\112\1\45\10\uffff\1\45\1\uffff";
    static final String dfa_20s = "\1\uffff\1\1\1\2\2\uffff\1\6\1\7\1\10\1\11\1\13\1\12\1\3\1\4\1\uffff\1\5";
    static final String dfa_21s = "\17\uffff}>";
    static final String[] dfa_22s = {
            "\1\3\12\uffff\1\1\27\uffff\1\5\3\uffff\1\10\1\uffff\1\10\2\uffff\2\10\13\uffff\1\2\1\uffff\1\4\2\6\1\7\1\11\1\uffff\5\10",
            "",
            "",
            "\1\13\1\uffff\1\12\1\13\7\uffff\1\13\4\uffff\1\12\1\uffff\1\13\2\uffff\1\13\10\uffff\4\13\1\uffff\2\13\2\uffff\4\13\3\uffff\1\13\11\uffff\2\13\2\uffff\2\13",
            "\1\15\3\uffff\1\16\21\uffff\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\37\uffff\1\14\1\5",
            ""
    };

    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = dfa_16;
            this.eof = dfa_17;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_21;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "4576:2: ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_VariableExpression_4= ruleVariableExpression | this_IndexExpression_5= ruleIndexExpression | this_PolynomialIndexExpression_6= rulePolynomialIndexExpression | this_FuzzyIndexExpression_7= ruleFuzzyIndexExpression | this_Reductions_8= ruleReductions | this_ConvolutionExpression_9= ruleConvolutionExpression | this_MultiArgExpression_10= ruleMultiArgExpression | this_ExternalMultiArgExpression_11= ruleExternalMultiArgExpression | this_SelectExpression_12= ruleSelectExpression )";
        }
    }
    static final String dfa_23s = "\55\uffff";
    static final String dfa_24s = "\1\100\2\17\2\4\24\30\1\4\3\17\1\4\1\17\1\30\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\1\30\1\4\5\uffff";
    static final String dfa_25s = "\1\101\2\17\2\111\1\35\22\30\1\35\1\4\3\45\1\4\1\45\1\35\1\45\1\uffff\1\45\1\uffff\1\45\1\uffff\1\35\1\45\5\uffff";
    static final String dfa_26s = "\41\uffff\1\3\1\uffff\1\1\1\uffff\1\2\2\uffff\1\4\1\7\1\5\1\6\1\10";
    static final String dfa_27s = "\55\uffff}>";
    static final String[] dfa_28s = {
            "\1\1\1\2",
            "\1\3",
            "\1\4",
            "\1\5\46\uffff\1\15\1\uffff\1\16\2\uffff\1\12\1\13\23\uffff\1\6\1\7\1\10\1\11\1\14",
            "\1\30\46\uffff\1\26\1\uffff\1\27\2\uffff\1\23\1\24\23\uffff\1\17\1\20\1\21\1\22\1\25",
            "\1\32\4\uffff\1\31",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\36\4\uffff\1\35",
            "\1\37",
            "\1\40\25\uffff\1\41",
            "\1\42\25\uffff\1\43",
            "\1\44\25\uffff\1\45",
            "\1\46",
            "\1\47\25\uffff\1\50",
            "\1\32\4\uffff\1\31",
            "\1\41\37\uffff\1\41\1\51",
            "",
            "\1\43\37\uffff\1\43\1\52",
            "",
            "\1\45\37\uffff\1\45\1\53",
            "",
            "\1\36\4\uffff\1\35",
            "\1\50\37\uffff\1\50\1\54",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = dfa_23;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "4703:2: (this_ReduceExpression_0= ruleReduceExpression | this_ArgReduceExpression_1= ruleArgReduceExpression | this_ExternalReduceExpression_2= ruleExternalReduceExpression | this_ExternalArgReduceExpression_3= ruleExternalArgReduceExpression | this_FuzzyReduceExpression_4= ruleFuzzyReduceExpression | this_FuzzyArgReduceExpression_5= ruleFuzzyArgReduceExpression | this_ExternalFuzzyReduceExpression_6= ruleExternalFuzzyReduceExpression | this_ExternalFuzzyArgReduceExpression_7= ruleExternalFuzzyArgReduceExpression )";
        }
    }
    static final String dfa_29s = "\35\uffff";
    static final String dfa_30s = "\1\23\1\4\2\uffff\15\4\1\24\13\4";
    static final String dfa_31s = "\1\52\1\122\2\uffff\15\57\1\125\13\57";
    static final String dfa_32s = "\2\uffff\1\1\1\2\31\uffff";
    static final String dfa_33s = "\35\uffff}>";
    static final String[] dfa_34s = {
            "\1\1\26\uffff\1\2",
            "\1\3\12\uffff\1\3\3\uffff\1\3\15\uffff\1\2\3\uffff\1\4\4\uffff\1\3\42\uffff\6\3",
            "",
            "",
            "\1\5\1\6\1\17\6\uffff\1\7\1\uffff\1\15\1\16\25\uffff\1\2\4\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\5\1\6\1\17\6\uffff\1\7\1\uffff\1\15\1\16\7\uffff\1\20\10\uffff\1\3\4\uffff\1\21\4\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\5\1\6\1\17\6\uffff\1\7\1\uffff\1\15\1\16\7\uffff\1\20\10\uffff\1\3\4\uffff\1\21\4\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\5\1\6\1\17\6\uffff\1\7\1\uffff\1\15\1\16\7\uffff\1\20\10\uffff\1\3\4\uffff\1\21\4\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\5\1\6\1\17\6\uffff\1\7\1\uffff\1\15\1\16\7\uffff\1\20\10\uffff\1\3\4\uffff\1\21\4\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\5\1\6\1\17\6\uffff\1\7\1\uffff\1\15\1\16\7\uffff\1\20\10\uffff\1\3\4\uffff\1\21\4\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\5\1\6\1\17\6\uffff\1\7\1\uffff\1\15\1\16\7\uffff\1\20\10\uffff\1\3\4\uffff\1\21\4\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\5\1\6\1\17\6\uffff\1\7\1\uffff\1\15\1\16\7\uffff\1\20\10\uffff\1\3\4\uffff\1\21\4\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\5\1\6\1\17\6\uffff\1\7\1\uffff\1\15\1\16\7\uffff\1\20\10\uffff\1\3\4\uffff\1\21\4\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\5\1\6\1\17\6\uffff\1\7\1\uffff\1\15\1\16\7\uffff\1\20\10\uffff\1\3\4\uffff\1\21\4\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\5\1\6\1\17\6\uffff\1\7\1\uffff\1\15\1\16\7\uffff\1\20\10\uffff\1\3\4\uffff\1\21\4\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\5\1\6\1\17\6\uffff\1\7\1\uffff\1\15\1\16\7\uffff\1\20\10\uffff\1\3\4\uffff\1\21\4\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\22\1\23\1\34\6\uffff\1\24\1\uffff\1\32\1\33\32\uffff\1\25\1\26\1\27\1\30\1\31",
            "\1\3\14\uffff\1\2\11\uffff\3\3\20\uffff\1\3\15\uffff\1\3\6\uffff\3\3",
            "\1\22\1\23\1\34\6\uffff\1\24\1\uffff\1\32\1\33\7\uffff\1\20\15\uffff\1\21\4\uffff\1\25\1\26\1\27\1\30\1\31",
            "\1\22\1\23\1\34\6\uffff\1\24\1\uffff\1\32\1\33\7\uffff\1\20\15\uffff\1\21\4\uffff\1\25\1\26\1\27\1\30\1\31",
            "\1\22\1\23\1\34\6\uffff\1\24\1\uffff\1\32\1\33\7\uffff\1\20\15\uffff\1\21\4\uffff\1\25\1\26\1\27\1\30\1\31",
            "\1\22\1\23\1\34\6\uffff\1\24\1\uffff\1\32\1\33\7\uffff\1\20\15\uffff\1\21\4\uffff\1\25\1\26\1\27\1\30\1\31",
            "\1\22\1\23\1\34\6\uffff\1\24\1\uffff\1\32\1\33\7\uffff\1\20\15\uffff\1\21\4\uffff\1\25\1\26\1\27\1\30\1\31",
            "\1\22\1\23\1\34\6\uffff\1\24\1\uffff\1\32\1\33\7\uffff\1\20\15\uffff\1\21\4\uffff\1\25\1\26\1\27\1\30\1\31",
            "\1\22\1\23\1\34\6\uffff\1\24\1\uffff\1\32\1\33\7\uffff\1\20\15\uffff\1\21\4\uffff\1\25\1\26\1\27\1\30\1\31",
            "\1\22\1\23\1\34\6\uffff\1\24\1\uffff\1\32\1\33\7\uffff\1\20\15\uffff\1\21\4\uffff\1\25\1\26\1\27\1\30\1\31",
            "\1\22\1\23\1\34\6\uffff\1\24\1\uffff\1\32\1\33\7\uffff\1\20\15\uffff\1\21\4\uffff\1\25\1\26\1\27\1\30\1\31",
            "\1\22\1\23\1\34\6\uffff\1\24\1\uffff\1\32\1\33\7\uffff\1\20\15\uffff\1\21\4\uffff\1\25\1\26\1\27\1\30\1\31",
            "\1\22\1\23\1\34\6\uffff\1\24\1\uffff\1\32\1\33\7\uffff\1\20\15\uffff\1\21\4\uffff\1\25\1\26\1\27\1\30\1\31"
    };

    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[][] dfa_34 = unpackEncodedStringArray(dfa_34s);

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_29;
            this.eof = dfa_29;
            this.min = dfa_30;
            this.max = dfa_31;
            this.accept = dfa_32;
            this.special = dfa_33;
            this.transition = dfa_34;
        }
        public String getDescription() {
            return "4881:2: ( ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) | (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) ) )";
        }
    }
    static final String dfa_35s = "\44\uffff";
    static final String dfa_36s = "\2\4\1\uffff\1\4\2\uffff\1\4\1\uffff\1\20\2\uffff\13\4\1\41\1\4\1\uffff\13\4";
    static final String dfa_37s = "\1\52\1\45\1\uffff\1\122\2\uffff\1\57\1\uffff\1\125\2\uffff\13\57\1\44\1\57\1\uffff\13\57";
    static final String dfa_38s = "\2\uffff\1\1\1\uffff\1\4\1\5\1\uffff\1\6\1\uffff\1\3\1\7\15\uffff\1\2\13\uffff";
    static final String dfa_39s = "\44\uffff}>";
    static final String[] dfa_40s = {
            "\1\4\12\uffff\1\3\3\uffff\1\1\21\uffff\1\5\4\uffff\1\2",
            "\1\7\40\uffff\1\6",
            "",
            "\1\10\12\uffff\1\12\3\uffff\1\12\20\uffff\1\11\1\12\4\uffff\1\12\42\uffff\6\12",
            "",
            "",
            "\1\13\1\14\1\25\6\uffff\1\15\1\uffff\1\23\1\24\25\uffff\1\26\4\uffff\1\16\1\17\1\20\1\21\1\22",
            "",
            "\1\12\7\uffff\1\11\13\uffff\1\11\6\uffff\3\12\20\uffff\1\12\24\uffff\3\12",
            "",
            "",
            "\1\13\1\14\1\25\6\uffff\1\15\1\uffff\1\23\1\24\7\uffff\1\27\15\uffff\1\26\4\uffff\1\16\1\17\1\20\1\21\1\22",
            "\1\13\1\14\1\25\6\uffff\1\15\1\uffff\1\23\1\24\7\uffff\1\27\15\uffff\1\26\4\uffff\1\16\1\17\1\20\1\21\1\22",
            "\1\13\1\14\1\25\6\uffff\1\15\1\uffff\1\23\1\24\7\uffff\1\27\15\uffff\1\26\4\uffff\1\16\1\17\1\20\1\21\1\22",
            "\1\13\1\14\1\25\6\uffff\1\15\1\uffff\1\23\1\24\7\uffff\1\27\15\uffff\1\26\4\uffff\1\16\1\17\1\20\1\21\1\22",
            "\1\13\1\14\1\25\6\uffff\1\15\1\uffff\1\23\1\24\7\uffff\1\27\15\uffff\1\26\4\uffff\1\16\1\17\1\20\1\21\1\22",
            "\1\13\1\14\1\25\6\uffff\1\15\1\uffff\1\23\1\24\7\uffff\1\27\15\uffff\1\26\4\uffff\1\16\1\17\1\20\1\21\1\22",
            "\1\13\1\14\1\25\6\uffff\1\15\1\uffff\1\23\1\24\7\uffff\1\27\15\uffff\1\26\4\uffff\1\16\1\17\1\20\1\21\1\22",
            "\1\13\1\14\1\25\6\uffff\1\15\1\uffff\1\23\1\24\7\uffff\1\27\15\uffff\1\26\4\uffff\1\16\1\17\1\20\1\21\1\22",
            "\1\13\1\14\1\25\6\uffff\1\15\1\uffff\1\23\1\24\7\uffff\1\27\15\uffff\1\26\4\uffff\1\16\1\17\1\20\1\21\1\22",
            "\1\13\1\14\1\25\6\uffff\1\15\1\uffff\1\23\1\24\7\uffff\1\27\15\uffff\1\26\4\uffff\1\16\1\17\1\20\1\21\1\22",
            "\1\13\1\14\1\25\6\uffff\1\15\1\uffff\1\23\1\24\7\uffff\1\27\15\uffff\1\26\4\uffff\1\16\1\17\1\20\1\21\1\22",
            "\1\2\2\uffff\1\30",
            "\1\31\1\32\1\43\6\uffff\1\33\1\uffff\1\41\1\42\32\uffff\1\34\1\35\1\36\1\37\1\40",
            "",
            "\1\31\1\32\1\43\6\uffff\1\33\1\uffff\1\41\1\42\7\uffff\1\27\15\uffff\1\26\4\uffff\1\34\1\35\1\36\1\37\1\40",
            "\1\31\1\32\1\43\6\uffff\1\33\1\uffff\1\41\1\42\7\uffff\1\27\15\uffff\1\26\4\uffff\1\34\1\35\1\36\1\37\1\40",
            "\1\31\1\32\1\43\6\uffff\1\33\1\uffff\1\41\1\42\7\uffff\1\27\15\uffff\1\26\4\uffff\1\34\1\35\1\36\1\37\1\40",
            "\1\31\1\32\1\43\6\uffff\1\33\1\uffff\1\41\1\42\7\uffff\1\27\15\uffff\1\26\4\uffff\1\34\1\35\1\36\1\37\1\40",
            "\1\31\1\32\1\43\6\uffff\1\33\1\uffff\1\41\1\42\7\uffff\1\27\15\uffff\1\26\4\uffff\1\34\1\35\1\36\1\37\1\40",
            "\1\31\1\32\1\43\6\uffff\1\33\1\uffff\1\41\1\42\7\uffff\1\27\15\uffff\1\26\4\uffff\1\34\1\35\1\36\1\37\1\40",
            "\1\31\1\32\1\43\6\uffff\1\33\1\uffff\1\41\1\42\7\uffff\1\27\15\uffff\1\26\4\uffff\1\34\1\35\1\36\1\37\1\40",
            "\1\31\1\32\1\43\6\uffff\1\33\1\uffff\1\41\1\42\7\uffff\1\27\15\uffff\1\26\4\uffff\1\34\1\35\1\36\1\37\1\40",
            "\1\31\1\32\1\43\6\uffff\1\33\1\uffff\1\41\1\42\7\uffff\1\27\15\uffff\1\26\4\uffff\1\34\1\35\1\36\1\37\1\40",
            "\1\31\1\32\1\43\6\uffff\1\33\1\uffff\1\41\1\42\7\uffff\1\27\15\uffff\1\26\4\uffff\1\34\1\35\1\36\1\37\1\40",
            "\1\31\1\32\1\43\6\uffff\1\33\1\uffff\1\41\1\42\7\uffff\1\27\15\uffff\1\26\4\uffff\1\34\1\35\1\36\1\37\1\40"
    };

    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[][] dfa_40 = unpackEncodedStringArray(dfa_40s);

    class DFA104 extends DFA {

        public DFA104(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 104;
            this.eot = dfa_35;
            this.eof = dfa_35;
            this.min = dfa_36;
            this.max = dfa_37;
            this.accept = dfa_38;
            this.special = dfa_39;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "7941:2: (this_JNIDomain_0= ruleJNIDomain | this_JNIRelation_1= ruleJNIRelation | this_JNIFunction_2= ruleJNIFunction | this_DefinedObject_3= ruleDefinedObject | this_RectangularDomain_4= ruleRectangularDomain | this_VariableDomain_5= ruleVariableDomain | (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' ) )";
        }
    }
    static final String dfa_41s = "\1\45\14\4\2\uffff";
    static final String dfa_42s = "\1\45\14\57\2\uffff";
    static final String dfa_43s = "\15\uffff\1\2\1\1";
    static final String[] dfa_44s = {
            "\1\1",
            "\1\2\1\3\1\14\6\uffff\1\4\1\uffff\1\12\1\13\32\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\2\1\3\1\14\6\uffff\1\4\1\uffff\1\12\1\13\7\uffff\1\16\10\uffff\1\15\4\uffff\1\16\4\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\2\1\3\1\14\6\uffff\1\4\1\uffff\1\12\1\13\7\uffff\1\16\10\uffff\1\15\4\uffff\1\16\4\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\2\1\3\1\14\6\uffff\1\4\1\uffff\1\12\1\13\7\uffff\1\16\10\uffff\1\15\4\uffff\1\16\4\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\2\1\3\1\14\6\uffff\1\4\1\uffff\1\12\1\13\7\uffff\1\16\10\uffff\1\15\4\uffff\1\16\4\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\2\1\3\1\14\6\uffff\1\4\1\uffff\1\12\1\13\7\uffff\1\16\10\uffff\1\15\4\uffff\1\16\4\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\2\1\3\1\14\6\uffff\1\4\1\uffff\1\12\1\13\7\uffff\1\16\10\uffff\1\15\4\uffff\1\16\4\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\2\1\3\1\14\6\uffff\1\4\1\uffff\1\12\1\13\7\uffff\1\16\10\uffff\1\15\4\uffff\1\16\4\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\2\1\3\1\14\6\uffff\1\4\1\uffff\1\12\1\13\7\uffff\1\16\10\uffff\1\15\4\uffff\1\16\4\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\2\1\3\1\14\6\uffff\1\4\1\uffff\1\12\1\13\7\uffff\1\16\10\uffff\1\15\4\uffff\1\16\4\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\2\1\3\1\14\6\uffff\1\4\1\uffff\1\12\1\13\7\uffff\1\16\10\uffff\1\15\4\uffff\1\16\4\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\2\1\3\1\14\6\uffff\1\4\1\uffff\1\12\1\13\7\uffff\1\16\10\uffff\1\15\4\uffff\1\16\4\uffff\1\5\1\6\1\7\1\10\1\11",
            "",
            ""
    };
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA111 extends DFA {

        public DFA111(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 111;
            this.eot = dfa_16;
            this.eof = dfa_16;
            this.min = dfa_41;
            this.max = dfa_42;
            this.accept = dfa_43;
            this.special = dfa_21;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "8129:2: ( (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleAISLExpression ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleAISLExpression ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? ) | (otherlv_11= '[' ( (lv_lowerBounds_12_0= ruleAISLExpression ) ) otherlv_13= ':' ( (lv_upperBounds_14_0= ruleAISLExpression ) ) (otherlv_15= ',' ( (lv_lowerBounds_16_0= ruleAISLExpression ) ) otherlv_17= ':' ( (lv_upperBounds_18_0= ruleAISLExpression ) ) )* otherlv_19= ']' (otherlv_20= 'as' otherlv_21= '[' ( (lv_indexNames_22_0= ruleIndexName ) ) (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )* otherlv_25= ']' )? ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000265002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000245002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000345000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000001EEC00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001EE800010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000009EE000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000009EC000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000009E8000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000042000088010L,0x000000000007E000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0xB4033C80000880B0L,0x0000000000000BEFL});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0200000208008012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00FFF8620111A070L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000F8400001A070L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004001000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000F8000001A070L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100780000018030L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000F96000002070L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010001000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000F86000002070L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00FFF8620101A070L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00FFF8620101A072L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000F8000001A072L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0100780000018032L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000100000008070L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000F80000002002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000100000018070L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000F86000002072L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0200000200000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000002200000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0xB4033C80000980B0L,0x0000000000000BEFL});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0xB4033C80001880B0L,0x0000000000000BEFL});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x8000008000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0003280000000000L,0x00000000000003E0L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0002000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x00F0000000002002L,0x0000000000000400L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x4000380000000002L,0x0000000000380000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000020000000L});

}