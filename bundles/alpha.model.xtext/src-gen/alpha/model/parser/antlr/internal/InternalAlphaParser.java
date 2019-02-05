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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_BOOLEAN", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'constant'", "'='", "'external'", "'('", "')'", "'import'", "'package'", "'{'", "'}'", "'affine'", "'define'", "'inputs'", "'outputs'", "'locals'", "'over'", "'while'", "'.'", "'when'", "'else'", "'let'", "':'", "';'", "'fuzzy'", "'->'", "'['", "','", "']'", "'[['", "']]'", "'.*'", "'+'", "'-'", "'*'", "'/'", "'%'", "'and'", "'or'", "'&'", "'|'", "'>='", "'>'", "'<'", "'<='", "'with'", "'if'", "'then'", "'auto'", "'case'", "'@'", "'val'", "'reduce'", "'argreduce'", "'conv'", "'select'", "'from'", "'min'", "'max'", "'prod'", "'sum'", "'xor'", "'!='", "'not'", "'as'", "'domain'", "'range'", "'complement'", "'affine-hull'", "'poly-hull'", "'reverse'", "'cross'", "'->-'", "'->*'"
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
    public static final int T__84=84;
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

                if ( (LA1_0==18) ) {
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

                if ( (LA3_0==13||LA3_0==15||LA3_0==19||LA3_0==22) ) {
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
            	    case 13:
            	        {
            	        alt2=1;
            	        }
            	        break;
            	    case 15:
            	        {
            	        alt2=2;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt2=3;
            	        }
            	        break;
            	    case 22:
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
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

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
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_7); 

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
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

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
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAlphaPackageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlpha.g:385:3: ( ( (lv_elements_3_1= ruleAlphaConstant | lv_elements_3_2= ruleExternalFunction | lv_elements_3_3= ruleAlphaPackage | lv_elements_3_4= ruleAlphaSystem ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13||LA5_0==15||LA5_0==19||LA5_0==22) ) {
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
            	    case 13:
            	        {
            	        alt4=1;
            	        }
            	        break;
            	    case 15:
            	        {
            	        alt4=2;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt4=3;
            	        }
            	        break;
            	    case 22:
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
    // InternalAlpha.g:469:1: ruleAlphaSystem returns [EObject current=null] : (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomain ) ) (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )? (otherlv_5= 'inputs' ( ( (lv_inputs_6_0= ruleInputVariable ) ) | ( (lv_inputs_7_0= ruleFuzzyInputVariable ) ) )+ )? (otherlv_8= 'outputs' ( ( (lv_outputs_9_0= ruleOutputVariable ) ) | ( (lv_outputs_10_0= ruleFuzzyOutputVariable ) ) )+ )? (otherlv_11= 'locals' ( ( (lv_locals_12_0= ruleLocalVariable ) ) | ( (lv_locals_13_0= ruleFuzzyLocalVariable ) ) )+ )? (otherlv_14= 'over' ( (lv_whileDomainExpr_15_0= ruleCalculatorExpression ) ) otherlv_16= 'while' otherlv_17= '(' ( (lv_testExpression_18_0= ruleAlphaExpression ) ) otherlv_19= ')' )? ( (lv_systemBodies_20_0= ruleSystemBody ) )* otherlv_21= '.' ) ;
    public final EObject ruleAlphaSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameterDomainExpr_2_0 = null;

        EObject lv_definedObjects_4_0 = null;

        EObject lv_inputs_6_0 = null;

        EObject lv_inputs_7_0 = null;

        EObject lv_outputs_9_0 = null;

        EObject lv_outputs_10_0 = null;

        EObject lv_locals_12_0 = null;

        EObject lv_locals_13_0 = null;

        EObject lv_whileDomainExpr_15_0 = null;

        EObject lv_testExpression_18_0 = null;

        EObject lv_systemBodies_20_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:475:2: ( (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomain ) ) (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )? (otherlv_5= 'inputs' ( ( (lv_inputs_6_0= ruleInputVariable ) ) | ( (lv_inputs_7_0= ruleFuzzyInputVariable ) ) )+ )? (otherlv_8= 'outputs' ( ( (lv_outputs_9_0= ruleOutputVariable ) ) | ( (lv_outputs_10_0= ruleFuzzyOutputVariable ) ) )+ )? (otherlv_11= 'locals' ( ( (lv_locals_12_0= ruleLocalVariable ) ) | ( (lv_locals_13_0= ruleFuzzyLocalVariable ) ) )+ )? (otherlv_14= 'over' ( (lv_whileDomainExpr_15_0= ruleCalculatorExpression ) ) otherlv_16= 'while' otherlv_17= '(' ( (lv_testExpression_18_0= ruleAlphaExpression ) ) otherlv_19= ')' )? ( (lv_systemBodies_20_0= ruleSystemBody ) )* otherlv_21= '.' ) )
            // InternalAlpha.g:476:2: (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomain ) ) (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )? (otherlv_5= 'inputs' ( ( (lv_inputs_6_0= ruleInputVariable ) ) | ( (lv_inputs_7_0= ruleFuzzyInputVariable ) ) )+ )? (otherlv_8= 'outputs' ( ( (lv_outputs_9_0= ruleOutputVariable ) ) | ( (lv_outputs_10_0= ruleFuzzyOutputVariable ) ) )+ )? (otherlv_11= 'locals' ( ( (lv_locals_12_0= ruleLocalVariable ) ) | ( (lv_locals_13_0= ruleFuzzyLocalVariable ) ) )+ )? (otherlv_14= 'over' ( (lv_whileDomainExpr_15_0= ruleCalculatorExpression ) ) otherlv_16= 'while' otherlv_17= '(' ( (lv_testExpression_18_0= ruleAlphaExpression ) ) otherlv_19= ')' )? ( (lv_systemBodies_20_0= ruleSystemBody ) )* otherlv_21= '.' )
            {
            // InternalAlpha.g:476:2: (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomain ) ) (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )? (otherlv_5= 'inputs' ( ( (lv_inputs_6_0= ruleInputVariable ) ) | ( (lv_inputs_7_0= ruleFuzzyInputVariable ) ) )+ )? (otherlv_8= 'outputs' ( ( (lv_outputs_9_0= ruleOutputVariable ) ) | ( (lv_outputs_10_0= ruleFuzzyOutputVariable ) ) )+ )? (otherlv_11= 'locals' ( ( (lv_locals_12_0= ruleLocalVariable ) ) | ( (lv_locals_13_0= ruleFuzzyLocalVariable ) ) )+ )? (otherlv_14= 'over' ( (lv_whileDomainExpr_15_0= ruleCalculatorExpression ) ) otherlv_16= 'while' otherlv_17= '(' ( (lv_testExpression_18_0= ruleAlphaExpression ) ) otherlv_19= ')' )? ( (lv_systemBodies_20_0= ruleSystemBody ) )* otherlv_21= '.' )
            // InternalAlpha.g:477:3: otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomain ) ) (otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+ )? (otherlv_5= 'inputs' ( ( (lv_inputs_6_0= ruleInputVariable ) ) | ( (lv_inputs_7_0= ruleFuzzyInputVariable ) ) )+ )? (otherlv_8= 'outputs' ( ( (lv_outputs_9_0= ruleOutputVariable ) ) | ( (lv_outputs_10_0= ruleFuzzyOutputVariable ) ) )+ )? (otherlv_11= 'locals' ( ( (lv_locals_12_0= ruleLocalVariable ) ) | ( (lv_locals_13_0= ruleFuzzyLocalVariable ) ) )+ )? (otherlv_14= 'over' ( (lv_whileDomainExpr_15_0= ruleCalculatorExpression ) ) otherlv_16= 'while' otherlv_17= '(' ( (lv_testExpression_18_0= ruleAlphaExpression ) ) otherlv_19= ')' )? ( (lv_systemBodies_20_0= ruleSystemBody ) )* otherlv_21= '.'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

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

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlpha.g:520:4: otherlv_3= 'define' ( (lv_definedObjects_4_0= rulePolyhedralObject ) )+
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_5); 

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

            // InternalAlpha.g:544:3: (otherlv_5= 'inputs' ( ( (lv_inputs_6_0= ruleInputVariable ) ) | ( (lv_inputs_7_0= ruleFuzzyInputVariable ) ) )+ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAlpha.g:545:4: otherlv_5= 'inputs' ( ( (lv_inputs_6_0= ruleInputVariable ) ) | ( (lv_inputs_7_0= ruleFuzzyInputVariable ) ) )+
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getAlphaSystemAccess().getInputsKeyword_4_0());
                    			
                    // InternalAlpha.g:549:4: ( ( (lv_inputs_6_0= ruleInputVariable ) ) | ( (lv_inputs_7_0= ruleFuzzyInputVariable ) ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }
                        else if ( (LA8_0==35) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalAlpha.g:550:5: ( (lv_inputs_6_0= ruleInputVariable ) )
                    	    {
                    	    // InternalAlpha.g:550:5: ( (lv_inputs_6_0= ruleInputVariable ) )
                    	    // InternalAlpha.g:551:6: (lv_inputs_6_0= ruleInputVariable )
                    	    {
                    	    // InternalAlpha.g:551:6: (lv_inputs_6_0= ruleInputVariable )
                    	    // InternalAlpha.g:552:7: lv_inputs_6_0= ruleInputVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlphaSystemAccess().getInputsInputVariableParserRuleCall_4_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
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


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAlpha.g:570:5: ( (lv_inputs_7_0= ruleFuzzyInputVariable ) )
                    	    {
                    	    // InternalAlpha.g:570:5: ( (lv_inputs_7_0= ruleFuzzyInputVariable ) )
                    	    // InternalAlpha.g:571:6: (lv_inputs_7_0= ruleFuzzyInputVariable )
                    	    {
                    	    // InternalAlpha.g:571:6: (lv_inputs_7_0= ruleFuzzyInputVariable )
                    	    // InternalAlpha.g:572:7: lv_inputs_7_0= ruleFuzzyInputVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlphaSystemAccess().getInputsFuzzyInputVariableParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_inputs_7_0=ruleFuzzyInputVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputs",
                    	    								lv_inputs_7_0,
                    	    								"alpha.model.Alpha.FuzzyInputVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;

            }

            // InternalAlpha.g:591:3: (otherlv_8= 'outputs' ( ( (lv_outputs_9_0= ruleOutputVariable ) ) | ( (lv_outputs_10_0= ruleFuzzyOutputVariable ) ) )+ )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAlpha.g:592:4: otherlv_8= 'outputs' ( ( (lv_outputs_9_0= ruleOutputVariable ) ) | ( (lv_outputs_10_0= ruleFuzzyOutputVariable ) ) )+
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getAlphaSystemAccess().getOutputsKeyword_5_0());
                    			
                    // InternalAlpha.g:596:4: ( ( (lv_outputs_9_0= ruleOutputVariable ) ) | ( (lv_outputs_10_0= ruleFuzzyOutputVariable ) ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }
                        else if ( (LA10_0==35) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalAlpha.g:597:5: ( (lv_outputs_9_0= ruleOutputVariable ) )
                    	    {
                    	    // InternalAlpha.g:597:5: ( (lv_outputs_9_0= ruleOutputVariable ) )
                    	    // InternalAlpha.g:598:6: (lv_outputs_9_0= ruleOutputVariable )
                    	    {
                    	    // InternalAlpha.g:598:6: (lv_outputs_9_0= ruleOutputVariable )
                    	    // InternalAlpha.g:599:7: lv_outputs_9_0= ruleOutputVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlphaSystemAccess().getOutputsOutputVariableParserRuleCall_5_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_outputs_9_0=ruleOutputVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outputs",
                    	    								lv_outputs_9_0,
                    	    								"alpha.model.Alpha.OutputVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAlpha.g:617:5: ( (lv_outputs_10_0= ruleFuzzyOutputVariable ) )
                    	    {
                    	    // InternalAlpha.g:617:5: ( (lv_outputs_10_0= ruleFuzzyOutputVariable ) )
                    	    // InternalAlpha.g:618:6: (lv_outputs_10_0= ruleFuzzyOutputVariable )
                    	    {
                    	    // InternalAlpha.g:618:6: (lv_outputs_10_0= ruleFuzzyOutputVariable )
                    	    // InternalAlpha.g:619:7: lv_outputs_10_0= ruleFuzzyOutputVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlphaSystemAccess().getOutputsFuzzyOutputVariableParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_outputs_10_0=ruleFuzzyOutputVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outputs",
                    	    								lv_outputs_10_0,
                    	    								"alpha.model.Alpha.FuzzyOutputVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalAlpha.g:638:3: (otherlv_11= 'locals' ( ( (lv_locals_12_0= ruleLocalVariable ) ) | ( (lv_locals_13_0= ruleFuzzyLocalVariable ) ) )+ )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlpha.g:639:4: otherlv_11= 'locals' ( ( (lv_locals_12_0= ruleLocalVariable ) ) | ( (lv_locals_13_0= ruleFuzzyLocalVariable ) ) )+
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getAlphaSystemAccess().getLocalsKeyword_6_0());
                    			
                    // InternalAlpha.g:643:4: ( ( (lv_locals_12_0= ruleLocalVariable ) ) | ( (lv_locals_13_0= ruleFuzzyLocalVariable ) ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }
                        else if ( (LA12_0==35) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalAlpha.g:644:5: ( (lv_locals_12_0= ruleLocalVariable ) )
                    	    {
                    	    // InternalAlpha.g:644:5: ( (lv_locals_12_0= ruleLocalVariable ) )
                    	    // InternalAlpha.g:645:6: (lv_locals_12_0= ruleLocalVariable )
                    	    {
                    	    // InternalAlpha.g:645:6: (lv_locals_12_0= ruleLocalVariable )
                    	    // InternalAlpha.g:646:7: lv_locals_12_0= ruleLocalVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlphaSystemAccess().getLocalsLocalVariableParserRuleCall_6_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_locals_12_0=ruleLocalVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"locals",
                    	    								lv_locals_12_0,
                    	    								"alpha.model.Alpha.LocalVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAlpha.g:664:5: ( (lv_locals_13_0= ruleFuzzyLocalVariable ) )
                    	    {
                    	    // InternalAlpha.g:664:5: ( (lv_locals_13_0= ruleFuzzyLocalVariable ) )
                    	    // InternalAlpha.g:665:6: (lv_locals_13_0= ruleFuzzyLocalVariable )
                    	    {
                    	    // InternalAlpha.g:665:6: (lv_locals_13_0= ruleFuzzyLocalVariable )
                    	    // InternalAlpha.g:666:7: lv_locals_13_0= ruleFuzzyLocalVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlphaSystemAccess().getLocalsFuzzyLocalVariableParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_locals_13_0=ruleFuzzyLocalVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"locals",
                    	    								lv_locals_13_0,
                    	    								"alpha.model.Alpha.FuzzyLocalVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    }
                    break;

            }

            // InternalAlpha.g:685:3: (otherlv_14= 'over' ( (lv_whileDomainExpr_15_0= ruleCalculatorExpression ) ) otherlv_16= 'while' otherlv_17= '(' ( (lv_testExpression_18_0= ruleAlphaExpression ) ) otherlv_19= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAlpha.g:686:4: otherlv_14= 'over' ( (lv_whileDomainExpr_15_0= ruleCalculatorExpression ) ) otherlv_16= 'while' otherlv_17= '(' ( (lv_testExpression_18_0= ruleAlphaExpression ) ) otherlv_19= ')'
                    {
                    otherlv_14=(Token)match(input,27,FOLLOW_19); 

                    				newLeafNode(otherlv_14, grammarAccess.getAlphaSystemAccess().getOverKeyword_7_0());
                    			
                    // InternalAlpha.g:690:4: ( (lv_whileDomainExpr_15_0= ruleCalculatorExpression ) )
                    // InternalAlpha.g:691:5: (lv_whileDomainExpr_15_0= ruleCalculatorExpression )
                    {
                    // InternalAlpha.g:691:5: (lv_whileDomainExpr_15_0= ruleCalculatorExpression )
                    // InternalAlpha.g:692:6: lv_whileDomainExpr_15_0= ruleCalculatorExpression
                    {

                    						newCompositeNode(grammarAccess.getAlphaSystemAccess().getWhileDomainExprCalculatorExpressionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_whileDomainExpr_15_0=ruleCalculatorExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    						}
                    						set(
                    							current,
                    							"whileDomainExpr",
                    							lv_whileDomainExpr_15_0,
                    							"alpha.model.Alpha.CalculatorExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_16, grammarAccess.getAlphaSystemAccess().getWhileKeyword_7_2());
                    			
                    otherlv_17=(Token)match(input,16,FOLLOW_21); 

                    				newLeafNode(otherlv_17, grammarAccess.getAlphaSystemAccess().getLeftParenthesisKeyword_7_3());
                    			
                    // InternalAlpha.g:717:4: ( (lv_testExpression_18_0= ruleAlphaExpression ) )
                    // InternalAlpha.g:718:5: (lv_testExpression_18_0= ruleAlphaExpression )
                    {
                    // InternalAlpha.g:718:5: (lv_testExpression_18_0= ruleAlphaExpression )
                    // InternalAlpha.g:719:6: lv_testExpression_18_0= ruleAlphaExpression
                    {

                    						newCompositeNode(grammarAccess.getAlphaSystemAccess().getTestExpressionAlphaExpressionParserRuleCall_7_4_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_testExpression_18_0=ruleAlphaExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
                    						}
                    						set(
                    							current,
                    							"testExpression",
                    							lv_testExpression_18_0,
                    							"alpha.model.Alpha.AlphaExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,17,FOLLOW_22); 

                    				newLeafNode(otherlv_19, grammarAccess.getAlphaSystemAccess().getRightParenthesisKeyword_7_5());
                    			

                    }
                    break;

            }

            // InternalAlpha.g:741:3: ( (lv_systemBodies_20_0= ruleSystemBody ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=30 && LA15_0<=32)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAlpha.g:742:4: (lv_systemBodies_20_0= ruleSystemBody )
            	    {
            	    // InternalAlpha.g:742:4: (lv_systemBodies_20_0= ruleSystemBody )
            	    // InternalAlpha.g:743:5: lv_systemBodies_20_0= ruleSystemBody
            	    {

            	    					newCompositeNode(grammarAccess.getAlphaSystemAccess().getSystemBodiesSystemBodyParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_systemBodies_20_0=ruleSystemBody();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlphaSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"systemBodies",
            	    						lv_systemBodies_20_0,
            	    						"alpha.model.Alpha.SystemBody");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_21=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getAlphaSystemAccess().getFullStopKeyword_9());
            		

            }


            }


            	leaveRule();

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
    // InternalAlpha.g:768:1: entryRuleSystemBody returns [EObject current=null] : iv_ruleSystemBody= ruleSystemBody EOF ;
    public final EObject entryRuleSystemBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemBody = null;


        try {
            // InternalAlpha.g:768:51: (iv_ruleSystemBody= ruleSystemBody EOF )
            // InternalAlpha.g:769:2: iv_ruleSystemBody= ruleSystemBody EOF
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
    // InternalAlpha.g:775:1: ruleSystemBody returns [EObject current=null] : ( () ( (otherlv_1= 'when' ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation ) ) ) | otherlv_3= 'else' )? otherlv_4= 'let' ( (lv_useEquations_5_0= ruleUseEquation ) )* ( (lv_equations_6_0= ruleStandardEquation ) )* ) ;
    public final EObject ruleSystemBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_parameterDomainExpr_2_0 = null;

        EObject lv_useEquations_5_0 = null;

        EObject lv_equations_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:781:2: ( ( () ( (otherlv_1= 'when' ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation ) ) ) | otherlv_3= 'else' )? otherlv_4= 'let' ( (lv_useEquations_5_0= ruleUseEquation ) )* ( (lv_equations_6_0= ruleStandardEquation ) )* ) )
            // InternalAlpha.g:782:2: ( () ( (otherlv_1= 'when' ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation ) ) ) | otherlv_3= 'else' )? otherlv_4= 'let' ( (lv_useEquations_5_0= ruleUseEquation ) )* ( (lv_equations_6_0= ruleStandardEquation ) )* )
            {
            // InternalAlpha.g:782:2: ( () ( (otherlv_1= 'when' ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation ) ) ) | otherlv_3= 'else' )? otherlv_4= 'let' ( (lv_useEquations_5_0= ruleUseEquation ) )* ( (lv_equations_6_0= ruleStandardEquation ) )* )
            // InternalAlpha.g:783:3: () ( (otherlv_1= 'when' ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation ) ) ) | otherlv_3= 'else' )? otherlv_4= 'let' ( (lv_useEquations_5_0= ruleUseEquation ) )* ( (lv_equations_6_0= ruleStandardEquation ) )*
            {
            // InternalAlpha.g:783:3: ()
            // InternalAlpha.g:784:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSystemBodyAccess().getSystemBodyAction_0(),
            					current);
            			

            }

            // InternalAlpha.g:790:3: ( (otherlv_1= 'when' ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation ) ) ) | otherlv_3= 'else' )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            else if ( (LA16_0==31) ) {
                alt16=2;
            }
            switch (alt16) {
                case 1 :
                    // InternalAlpha.g:791:4: (otherlv_1= 'when' ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation ) ) )
                    {
                    // InternalAlpha.g:791:4: (otherlv_1= 'when' ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation ) ) )
                    // InternalAlpha.g:792:5: otherlv_1= 'when' ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_10); 

                    					newLeafNode(otherlv_1, grammarAccess.getSystemBodyAccess().getWhenKeyword_1_0_0());
                    				
                    // InternalAlpha.g:796:5: ( (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation ) )
                    // InternalAlpha.g:797:6: (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation )
                    {
                    // InternalAlpha.g:797:6: (lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation )
                    // InternalAlpha.g:798:7: lv_parameterDomainExpr_2_0= ruleJNIParamDomainInArrayNotation
                    {

                    							newCompositeNode(grammarAccess.getSystemBodyAccess().getParameterDomainExprJNIParamDomainInArrayNotationParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_23);
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
                    // InternalAlpha.g:817:4: otherlv_3= 'else'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getSystemBodyAccess().getElseKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,32,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemBodyAccess().getLetKeyword_2());
            		
            // InternalAlpha.g:826:3: ( (lv_useEquations_5_0= ruleUseEquation ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16||LA17_0==27||LA17_0==33||LA17_0==56) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAlpha.g:827:4: (lv_useEquations_5_0= ruleUseEquation )
            	    {
            	    // InternalAlpha.g:827:4: (lv_useEquations_5_0= ruleUseEquation )
            	    // InternalAlpha.g:828:5: lv_useEquations_5_0= ruleUseEquation
            	    {

            	    					newCompositeNode(grammarAccess.getSystemBodyAccess().getUseEquationsUseEquationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_useEquations_5_0=ruleUseEquation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemBodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"useEquations",
            	    						lv_useEquations_5_0,
            	    						"alpha.model.Alpha.UseEquation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalAlpha.g:845:3: ( (lv_equations_6_0= ruleStandardEquation ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAlpha.g:846:4: (lv_equations_6_0= ruleStandardEquation )
            	    {
            	    // InternalAlpha.g:846:4: (lv_equations_6_0= ruleStandardEquation )
            	    // InternalAlpha.g:847:5: lv_equations_6_0= ruleStandardEquation
            	    {

            	    					newCompositeNode(grammarAccess.getSystemBodyAccess().getEquationsStandardEquationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_equations_6_0=ruleStandardEquation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemBodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"equations",
            	    						lv_equations_6_0,
            	    						"alpha.model.Alpha.StandardEquation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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


    // $ANTLR start "entryRuleInputVariable"
    // InternalAlpha.g:868:1: entryRuleInputVariable returns [EObject current=null] : iv_ruleInputVariable= ruleInputVariable EOF ;
    public final EObject entryRuleInputVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputVariable = null;


        try {
            // InternalAlpha.g:868:54: (iv_ruleInputVariable= ruleInputVariable EOF )
            // InternalAlpha.g:869:2: iv_ruleInputVariable= ruleInputVariable EOF
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
    // InternalAlpha.g:875:1: ruleInputVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleInputVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_domainExpr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:881:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? ) )
            // InternalAlpha.g:882:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? )
            {
            // InternalAlpha.g:882:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? )
            // InternalAlpha.g:883:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )?
            {
            // InternalAlpha.g:883:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:884:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:884:4: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:885:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            otherlv_1=(Token)match(input,33,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getInputVariableAccess().getColonKeyword_1());
            		
            // InternalAlpha.g:905:3: ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==16||LA19_0==20||LA19_0==37||(LA19_0>=76 && LA19_0<=81)) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==EOF||LA19_2==RULE_ID||(LA19_2>=25 && LA19_2<=27)||(LA19_2>=29 && LA19_2<=32)||(LA19_2>=34 && LA19_2<=35)||(LA19_2>=43 && LA19_2<=45)||LA19_2==61||(LA19_2>=82 && LA19_2<=84)) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalAlpha.g:906:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
                    {
                    // InternalAlpha.g:906:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
                    // InternalAlpha.g:907:5: lv_domainExpr_2_0= ruleCalculatorExpression
                    {

                    					newCompositeNode(grammarAccess.getInputVariableAccess().getDomainExprCalculatorExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_28);
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

            // InternalAlpha.g:924:3: (otherlv_3= ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAlpha.g:925:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalAlpha.g:934:1: entryRuleOutputVariable returns [EObject current=null] : iv_ruleOutputVariable= ruleOutputVariable EOF ;
    public final EObject entryRuleOutputVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputVariable = null;


        try {
            // InternalAlpha.g:934:55: (iv_ruleOutputVariable= ruleOutputVariable EOF )
            // InternalAlpha.g:935:2: iv_ruleOutputVariable= ruleOutputVariable EOF
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
    // InternalAlpha.g:941:1: ruleOutputVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleOutputVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_domainExpr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:947:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? ) )
            // InternalAlpha.g:948:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? )
            {
            // InternalAlpha.g:948:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? )
            // InternalAlpha.g:949:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )?
            {
            // InternalAlpha.g:949:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:950:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:950:4: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:951:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            otherlv_1=(Token)match(input,33,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputVariableAccess().getColonKeyword_1());
            		
            // InternalAlpha.g:971:3: ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==16||LA21_0==20||LA21_0==37||(LA21_0>=76 && LA21_0<=81)) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==EOF||LA21_2==RULE_ID||(LA21_2>=26 && LA21_2<=27)||(LA21_2>=29 && LA21_2<=32)||(LA21_2>=34 && LA21_2<=35)||(LA21_2>=43 && LA21_2<=45)||LA21_2==61||(LA21_2>=82 && LA21_2<=84)) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalAlpha.g:972:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
                    {
                    // InternalAlpha.g:972:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
                    // InternalAlpha.g:973:5: lv_domainExpr_2_0= ruleCalculatorExpression
                    {

                    					newCompositeNode(grammarAccess.getOutputVariableAccess().getDomainExprCalculatorExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_28);
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

            // InternalAlpha.g:990:3: (otherlv_3= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAlpha.g:991:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalAlpha.g:1000:1: entryRuleLocalVariable returns [EObject current=null] : iv_ruleLocalVariable= ruleLocalVariable EOF ;
    public final EObject entryRuleLocalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariable = null;


        try {
            // InternalAlpha.g:1000:54: (iv_ruleLocalVariable= ruleLocalVariable EOF )
            // InternalAlpha.g:1001:2: iv_ruleLocalVariable= ruleLocalVariable EOF
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
    // InternalAlpha.g:1007:1: ruleLocalVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleLocalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_domainExpr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1013:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? ) )
            // InternalAlpha.g:1014:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? )
            {
            // InternalAlpha.g:1014:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )? )
            // InternalAlpha.g:1015:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )? (otherlv_3= ';' )?
            {
            // InternalAlpha.g:1015:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:1016:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:1016:4: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:1017:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            otherlv_1=(Token)match(input,33,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalVariableAccess().getColonKeyword_1());
            		
            // InternalAlpha.g:1037:3: ( (lv_domainExpr_2_0= ruleCalculatorExpression ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==16||LA23_0==20||LA23_0==37||(LA23_0>=76 && LA23_0<=81)) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==EOF||LA23_2==RULE_ID||LA23_2==27||(LA23_2>=29 && LA23_2<=32)||(LA23_2>=34 && LA23_2<=35)||(LA23_2>=43 && LA23_2<=45)||LA23_2==61||(LA23_2>=82 && LA23_2<=84)) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalAlpha.g:1038:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
                    {
                    // InternalAlpha.g:1038:4: (lv_domainExpr_2_0= ruleCalculatorExpression )
                    // InternalAlpha.g:1039:5: lv_domainExpr_2_0= ruleCalculatorExpression
                    {

                    					newCompositeNode(grammarAccess.getLocalVariableAccess().getDomainExprCalculatorExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_28);
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

            // InternalAlpha.g:1056:3: (otherlv_3= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAlpha.g:1057:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFuzzyInputVariable"
    // InternalAlpha.g:1066:1: entryRuleFuzzyInputVariable returns [EObject current=null] : iv_ruleFuzzyInputVariable= ruleFuzzyInputVariable EOF ;
    public final EObject entryRuleFuzzyInputVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyInputVariable = null;


        try {
            // InternalAlpha.g:1066:59: (iv_ruleFuzzyInputVariable= ruleFuzzyInputVariable EOF )
            // InternalAlpha.g:1067:2: iv_ruleFuzzyInputVariable= ruleFuzzyInputVariable EOF
            {
             newCompositeNode(grammarAccess.getFuzzyInputVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuzzyInputVariable=ruleFuzzyInputVariable();

            state._fsp--;

             current =iv_ruleFuzzyInputVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuzzyInputVariable"


    // $ANTLR start "ruleFuzzyInputVariable"
    // InternalAlpha.g:1073:1: ruleFuzzyInputVariable returns [EObject current=null] : (otherlv_0= 'fuzzy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domainExpr_3_0= ruleCalculatorExpression ) ) otherlv_4= '->' ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) ) (otherlv_6= ';' )? ) ;
    public final EObject ruleFuzzyInputVariable() throws RecognitionException {
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
            // InternalAlpha.g:1079:2: ( (otherlv_0= 'fuzzy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domainExpr_3_0= ruleCalculatorExpression ) ) otherlv_4= '->' ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) ) (otherlv_6= ';' )? ) )
            // InternalAlpha.g:1080:2: (otherlv_0= 'fuzzy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domainExpr_3_0= ruleCalculatorExpression ) ) otherlv_4= '->' ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) ) (otherlv_6= ';' )? )
            {
            // InternalAlpha.g:1080:2: (otherlv_0= 'fuzzy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domainExpr_3_0= ruleCalculatorExpression ) ) otherlv_4= '->' ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) ) (otherlv_6= ';' )? )
            // InternalAlpha.g:1081:3: otherlv_0= 'fuzzy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domainExpr_3_0= ruleCalculatorExpression ) ) otherlv_4= '->' ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) ) (otherlv_6= ';' )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFuzzyInputVariableAccess().getFuzzyKeyword_0());
            		
            // InternalAlpha.g:1085:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAlpha.g:1086:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAlpha.g:1086:4: (lv_name_1_0= RULE_ID )
            // InternalAlpha.g:1087:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFuzzyInputVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuzzyInputVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"alpha.model.Alpha.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getFuzzyInputVariableAccess().getColonKeyword_2());
            		
            // InternalAlpha.g:1107:3: ( (lv_domainExpr_3_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:1108:4: (lv_domainExpr_3_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:1108:4: (lv_domainExpr_3_0= ruleCalculatorExpression )
            // InternalAlpha.g:1109:5: lv_domainExpr_3_0= ruleCalculatorExpression
            {

            					newCompositeNode(grammarAccess.getFuzzyInputVariableAccess().getDomainExprCalculatorExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_domainExpr_3_0=ruleCalculatorExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuzzyInputVariableRule());
            					}
            					set(
            						current,
            						"domainExpr",
            						lv_domainExpr_3_0,
            						"alpha.model.Alpha.CalculatorExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getFuzzyInputVariableAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalAlpha.g:1130:3: ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:1131:4: (lv_rangeExpr_5_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:1131:4: (lv_rangeExpr_5_0= ruleCalculatorExpression )
            // InternalAlpha.g:1132:5: lv_rangeExpr_5_0= ruleCalculatorExpression
            {

            					newCompositeNode(grammarAccess.getFuzzyInputVariableAccess().getRangeExprCalculatorExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_28);
            lv_rangeExpr_5_0=ruleCalculatorExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuzzyInputVariableRule());
            					}
            					set(
            						current,
            						"rangeExpr",
            						lv_rangeExpr_5_0,
            						"alpha.model.Alpha.CalculatorExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:1149:3: (otherlv_6= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAlpha.g:1150:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getFuzzyInputVariableAccess().getSemicolonKeyword_6());
                    			

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
    // $ANTLR end "ruleFuzzyInputVariable"


    // $ANTLR start "entryRuleFuzzyOutputVariable"
    // InternalAlpha.g:1159:1: entryRuleFuzzyOutputVariable returns [EObject current=null] : iv_ruleFuzzyOutputVariable= ruleFuzzyOutputVariable EOF ;
    public final EObject entryRuleFuzzyOutputVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyOutputVariable = null;


        try {
            // InternalAlpha.g:1159:60: (iv_ruleFuzzyOutputVariable= ruleFuzzyOutputVariable EOF )
            // InternalAlpha.g:1160:2: iv_ruleFuzzyOutputVariable= ruleFuzzyOutputVariable EOF
            {
             newCompositeNode(grammarAccess.getFuzzyOutputVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuzzyOutputVariable=ruleFuzzyOutputVariable();

            state._fsp--;

             current =iv_ruleFuzzyOutputVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuzzyOutputVariable"


    // $ANTLR start "ruleFuzzyOutputVariable"
    // InternalAlpha.g:1166:1: ruleFuzzyOutputVariable returns [EObject current=null] : (otherlv_0= 'fuzzy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domainExpr_3_0= ruleCalculatorExpression ) ) otherlv_4= '->' ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) ) (otherlv_6= ';' )? ) ;
    public final EObject ruleFuzzyOutputVariable() throws RecognitionException {
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
            // InternalAlpha.g:1172:2: ( (otherlv_0= 'fuzzy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domainExpr_3_0= ruleCalculatorExpression ) ) otherlv_4= '->' ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) ) (otherlv_6= ';' )? ) )
            // InternalAlpha.g:1173:2: (otherlv_0= 'fuzzy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domainExpr_3_0= ruleCalculatorExpression ) ) otherlv_4= '->' ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) ) (otherlv_6= ';' )? )
            {
            // InternalAlpha.g:1173:2: (otherlv_0= 'fuzzy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domainExpr_3_0= ruleCalculatorExpression ) ) otherlv_4= '->' ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) ) (otherlv_6= ';' )? )
            // InternalAlpha.g:1174:3: otherlv_0= 'fuzzy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domainExpr_3_0= ruleCalculatorExpression ) ) otherlv_4= '->' ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) ) (otherlv_6= ';' )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFuzzyOutputVariableAccess().getFuzzyKeyword_0());
            		
            // InternalAlpha.g:1178:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAlpha.g:1179:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAlpha.g:1179:4: (lv_name_1_0= RULE_ID )
            // InternalAlpha.g:1180:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFuzzyOutputVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuzzyOutputVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"alpha.model.Alpha.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getFuzzyOutputVariableAccess().getColonKeyword_2());
            		
            // InternalAlpha.g:1200:3: ( (lv_domainExpr_3_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:1201:4: (lv_domainExpr_3_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:1201:4: (lv_domainExpr_3_0= ruleCalculatorExpression )
            // InternalAlpha.g:1202:5: lv_domainExpr_3_0= ruleCalculatorExpression
            {

            					newCompositeNode(grammarAccess.getFuzzyOutputVariableAccess().getDomainExprCalculatorExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_domainExpr_3_0=ruleCalculatorExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuzzyOutputVariableRule());
            					}
            					set(
            						current,
            						"domainExpr",
            						lv_domainExpr_3_0,
            						"alpha.model.Alpha.CalculatorExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getFuzzyOutputVariableAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalAlpha.g:1223:3: ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:1224:4: (lv_rangeExpr_5_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:1224:4: (lv_rangeExpr_5_0= ruleCalculatorExpression )
            // InternalAlpha.g:1225:5: lv_rangeExpr_5_0= ruleCalculatorExpression
            {

            					newCompositeNode(grammarAccess.getFuzzyOutputVariableAccess().getRangeExprCalculatorExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_28);
            lv_rangeExpr_5_0=ruleCalculatorExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuzzyOutputVariableRule());
            					}
            					set(
            						current,
            						"rangeExpr",
            						lv_rangeExpr_5_0,
            						"alpha.model.Alpha.CalculatorExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:1242:3: (otherlv_6= ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAlpha.g:1243:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getFuzzyOutputVariableAccess().getSemicolonKeyword_6());
                    			

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
    // $ANTLR end "ruleFuzzyOutputVariable"


    // $ANTLR start "entryRuleFuzzyLocalVariable"
    // InternalAlpha.g:1252:1: entryRuleFuzzyLocalVariable returns [EObject current=null] : iv_ruleFuzzyLocalVariable= ruleFuzzyLocalVariable EOF ;
    public final EObject entryRuleFuzzyLocalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyLocalVariable = null;


        try {
            // InternalAlpha.g:1252:59: (iv_ruleFuzzyLocalVariable= ruleFuzzyLocalVariable EOF )
            // InternalAlpha.g:1253:2: iv_ruleFuzzyLocalVariable= ruleFuzzyLocalVariable EOF
            {
             newCompositeNode(grammarAccess.getFuzzyLocalVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuzzyLocalVariable=ruleFuzzyLocalVariable();

            state._fsp--;

             current =iv_ruleFuzzyLocalVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuzzyLocalVariable"


    // $ANTLR start "ruleFuzzyLocalVariable"
    // InternalAlpha.g:1259:1: ruleFuzzyLocalVariable returns [EObject current=null] : (otherlv_0= 'fuzzy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domainExpr_3_0= ruleCalculatorExpression ) ) otherlv_4= '->' ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) ) (otherlv_6= ';' )? ) ;
    public final EObject ruleFuzzyLocalVariable() throws RecognitionException {
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
            // InternalAlpha.g:1265:2: ( (otherlv_0= 'fuzzy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domainExpr_3_0= ruleCalculatorExpression ) ) otherlv_4= '->' ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) ) (otherlv_6= ';' )? ) )
            // InternalAlpha.g:1266:2: (otherlv_0= 'fuzzy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domainExpr_3_0= ruleCalculatorExpression ) ) otherlv_4= '->' ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) ) (otherlv_6= ';' )? )
            {
            // InternalAlpha.g:1266:2: (otherlv_0= 'fuzzy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domainExpr_3_0= ruleCalculatorExpression ) ) otherlv_4= '->' ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) ) (otherlv_6= ';' )? )
            // InternalAlpha.g:1267:3: otherlv_0= 'fuzzy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domainExpr_3_0= ruleCalculatorExpression ) ) otherlv_4= '->' ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) ) (otherlv_6= ';' )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFuzzyLocalVariableAccess().getFuzzyKeyword_0());
            		
            // InternalAlpha.g:1271:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAlpha.g:1272:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAlpha.g:1272:4: (lv_name_1_0= RULE_ID )
            // InternalAlpha.g:1273:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFuzzyLocalVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuzzyLocalVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"alpha.model.Alpha.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getFuzzyLocalVariableAccess().getColonKeyword_2());
            		
            // InternalAlpha.g:1293:3: ( (lv_domainExpr_3_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:1294:4: (lv_domainExpr_3_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:1294:4: (lv_domainExpr_3_0= ruleCalculatorExpression )
            // InternalAlpha.g:1295:5: lv_domainExpr_3_0= ruleCalculatorExpression
            {

            					newCompositeNode(grammarAccess.getFuzzyLocalVariableAccess().getDomainExprCalculatorExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_domainExpr_3_0=ruleCalculatorExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuzzyLocalVariableRule());
            					}
            					set(
            						current,
            						"domainExpr",
            						lv_domainExpr_3_0,
            						"alpha.model.Alpha.CalculatorExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getFuzzyLocalVariableAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalAlpha.g:1316:3: ( (lv_rangeExpr_5_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:1317:4: (lv_rangeExpr_5_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:1317:4: (lv_rangeExpr_5_0= ruleCalculatorExpression )
            // InternalAlpha.g:1318:5: lv_rangeExpr_5_0= ruleCalculatorExpression
            {

            					newCompositeNode(grammarAccess.getFuzzyLocalVariableAccess().getRangeExprCalculatorExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_28);
            lv_rangeExpr_5_0=ruleCalculatorExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuzzyLocalVariableRule());
            					}
            					set(
            						current,
            						"rangeExpr",
            						lv_rangeExpr_5_0,
            						"alpha.model.Alpha.CalculatorExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:1335:3: (otherlv_6= ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAlpha.g:1336:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getFuzzyLocalVariableAccess().getSemicolonKeyword_6());
                    			

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
    // $ANTLR end "ruleFuzzyLocalVariable"


    // $ANTLR start "entryRuleJNIDomain"
    // InternalAlpha.g:1345:1: entryRuleJNIDomain returns [EObject current=null] : iv_ruleJNIDomain= ruleJNIDomain EOF ;
    public final EObject entryRuleJNIDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIDomain = null;


        try {
            // InternalAlpha.g:1345:50: (iv_ruleJNIDomain= ruleJNIDomain EOF )
            // InternalAlpha.g:1346:2: iv_ruleJNIDomain= ruleJNIDomain EOF
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
    // InternalAlpha.g:1352:1: ruleJNIDomain returns [EObject current=null] : ( (lv_islString_0_0= ruleAISLSet ) ) ;
    public final EObject ruleJNIDomain() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_islString_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1358:2: ( ( (lv_islString_0_0= ruleAISLSet ) ) )
            // InternalAlpha.g:1359:2: ( (lv_islString_0_0= ruleAISLSet ) )
            {
            // InternalAlpha.g:1359:2: ( (lv_islString_0_0= ruleAISLSet ) )
            // InternalAlpha.g:1360:3: (lv_islString_0_0= ruleAISLSet )
            {
            // InternalAlpha.g:1360:3: (lv_islString_0_0= ruleAISLSet )
            // InternalAlpha.g:1361:4: lv_islString_0_0= ruleAISLSet
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
    // InternalAlpha.g:1381:1: entryRuleJNIDomainInArrayNotation returns [EObject current=null] : iv_ruleJNIDomainInArrayNotation= ruleJNIDomainInArrayNotation EOF ;
    public final EObject entryRuleJNIDomainInArrayNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIDomainInArrayNotation = null;


        try {
            // InternalAlpha.g:1381:65: (iv_ruleJNIDomainInArrayNotation= ruleJNIDomainInArrayNotation EOF )
            // InternalAlpha.g:1382:2: iv_ruleJNIDomainInArrayNotation= ruleJNIDomainInArrayNotation EOF
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
    // InternalAlpha.g:1388:1: ruleJNIDomainInArrayNotation returns [EObject current=null] : (otherlv_0= '{' otherlv_1= ':' ( (lv_islString_2_0= ruleAISLString ) ) otherlv_3= '}' ) ;
    public final EObject ruleJNIDomainInArrayNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_islString_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1394:2: ( (otherlv_0= '{' otherlv_1= ':' ( (lv_islString_2_0= ruleAISLString ) ) otherlv_3= '}' ) )
            // InternalAlpha.g:1395:2: (otherlv_0= '{' otherlv_1= ':' ( (lv_islString_2_0= ruleAISLString ) ) otherlv_3= '}' )
            {
            // InternalAlpha.g:1395:2: (otherlv_0= '{' otherlv_1= ':' ( (lv_islString_2_0= ruleAISLString ) ) otherlv_3= '}' )
            // InternalAlpha.g:1396:3: otherlv_0= '{' otherlv_1= ':' ( (lv_islString_2_0= ruleAISLString ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getJNIDomainInArrayNotationAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getJNIDomainInArrayNotationAccess().getColonKeyword_1());
            		
            // InternalAlpha.g:1404:3: ( (lv_islString_2_0= ruleAISLString ) )
            // InternalAlpha.g:1405:4: (lv_islString_2_0= ruleAISLString )
            {
            // InternalAlpha.g:1405:4: (lv_islString_2_0= ruleAISLString )
            // InternalAlpha.g:1406:5: lv_islString_2_0= ruleAISLString
            {

            					newCompositeNode(grammarAccess.getJNIDomainInArrayNotationAccess().getIslStringAISLStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
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
    // InternalAlpha.g:1431:1: entryRuleJNIParamDomain returns [EObject current=null] : iv_ruleJNIParamDomain= ruleJNIParamDomain EOF ;
    public final EObject entryRuleJNIParamDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIParamDomain = null;


        try {
            // InternalAlpha.g:1431:55: (iv_ruleJNIParamDomain= ruleJNIParamDomain EOF )
            // InternalAlpha.g:1432:2: iv_ruleJNIParamDomain= ruleJNIParamDomain EOF
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
    // InternalAlpha.g:1438:1: ruleJNIParamDomain returns [EObject current=null] : ( (lv_islString_0_0= ruleAParamDomain ) ) ;
    public final EObject ruleJNIParamDomain() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_islString_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1444:2: ( ( (lv_islString_0_0= ruleAParamDomain ) ) )
            // InternalAlpha.g:1445:2: ( (lv_islString_0_0= ruleAParamDomain ) )
            {
            // InternalAlpha.g:1445:2: ( (lv_islString_0_0= ruleAParamDomain ) )
            // InternalAlpha.g:1446:3: (lv_islString_0_0= ruleAParamDomain )
            {
            // InternalAlpha.g:1446:3: (lv_islString_0_0= ruleAParamDomain )
            // InternalAlpha.g:1447:4: lv_islString_0_0= ruleAParamDomain
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
    // InternalAlpha.g:1467:1: entryRuleJNIParamDomainInArrayNotation returns [EObject current=null] : iv_ruleJNIParamDomainInArrayNotation= ruleJNIParamDomainInArrayNotation EOF ;
    public final EObject entryRuleJNIParamDomainInArrayNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIParamDomainInArrayNotation = null;


        try {
            // InternalAlpha.g:1467:70: (iv_ruleJNIParamDomainInArrayNotation= ruleJNIParamDomainInArrayNotation EOF )
            // InternalAlpha.g:1468:2: iv_ruleJNIParamDomainInArrayNotation= ruleJNIParamDomainInArrayNotation EOF
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
    // InternalAlpha.g:1474:1: ruleJNIParamDomainInArrayNotation returns [EObject current=null] : ( (lv_islString_0_0= ruleAParamDomainInArrayNotation ) ) ;
    public final EObject ruleJNIParamDomainInArrayNotation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_islString_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1480:2: ( ( (lv_islString_0_0= ruleAParamDomainInArrayNotation ) ) )
            // InternalAlpha.g:1481:2: ( (lv_islString_0_0= ruleAParamDomainInArrayNotation ) )
            {
            // InternalAlpha.g:1481:2: ( (lv_islString_0_0= ruleAParamDomainInArrayNotation ) )
            // InternalAlpha.g:1482:3: (lv_islString_0_0= ruleAParamDomainInArrayNotation )
            {
            // InternalAlpha.g:1482:3: (lv_islString_0_0= ruleAParamDomainInArrayNotation )
            // InternalAlpha.g:1483:4: lv_islString_0_0= ruleAParamDomainInArrayNotation
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
    // InternalAlpha.g:1503:1: entryRuleJNIRelation returns [EObject current=null] : iv_ruleJNIRelation= ruleJNIRelation EOF ;
    public final EObject entryRuleJNIRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIRelation = null;


        try {
            // InternalAlpha.g:1503:52: (iv_ruleJNIRelation= ruleJNIRelation EOF )
            // InternalAlpha.g:1504:2: iv_ruleJNIRelation= ruleJNIRelation EOF
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
    // InternalAlpha.g:1510:1: ruleJNIRelation returns [EObject current=null] : ( (lv_islString_0_0= ruleAISLRelation ) ) ;
    public final EObject ruleJNIRelation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_islString_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1516:2: ( ( (lv_islString_0_0= ruleAISLRelation ) ) )
            // InternalAlpha.g:1517:2: ( (lv_islString_0_0= ruleAISLRelation ) )
            {
            // InternalAlpha.g:1517:2: ( (lv_islString_0_0= ruleAISLRelation ) )
            // InternalAlpha.g:1518:3: (lv_islString_0_0= ruleAISLRelation )
            {
            // InternalAlpha.g:1518:3: (lv_islString_0_0= ruleAISLRelation )
            // InternalAlpha.g:1519:4: lv_islString_0_0= ruleAISLRelation
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
    // InternalAlpha.g:1539:1: entryRuleJNIFunction returns [EObject current=null] : iv_ruleJNIFunction= ruleJNIFunction EOF ;
    public final EObject entryRuleJNIFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIFunction = null;


        try {
            // InternalAlpha.g:1539:52: (iv_ruleJNIFunction= ruleJNIFunction EOF )
            // InternalAlpha.g:1540:2: iv_ruleJNIFunction= ruleJNIFunction EOF
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
    // InternalAlpha.g:1546:1: ruleJNIFunction returns [EObject current=null] : ( (lv_alphaString_0_0= ruleAAlphaFunction ) ) ;
    public final EObject ruleJNIFunction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_alphaString_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1552:2: ( ( (lv_alphaString_0_0= ruleAAlphaFunction ) ) )
            // InternalAlpha.g:1553:2: ( (lv_alphaString_0_0= ruleAAlphaFunction ) )
            {
            // InternalAlpha.g:1553:2: ( (lv_alphaString_0_0= ruleAAlphaFunction ) )
            // InternalAlpha.g:1554:3: (lv_alphaString_0_0= ruleAAlphaFunction )
            {
            // InternalAlpha.g:1554:3: (lv_alphaString_0_0= ruleAAlphaFunction )
            // InternalAlpha.g:1555:4: lv_alphaString_0_0= ruleAAlphaFunction
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
    // InternalAlpha.g:1575:1: entryRuleJNIFunctionInArrayNotation returns [EObject current=null] : iv_ruleJNIFunctionInArrayNotation= ruleJNIFunctionInArrayNotation EOF ;
    public final EObject entryRuleJNIFunctionInArrayNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNIFunctionInArrayNotation = null;


        try {
            // InternalAlpha.g:1575:67: (iv_ruleJNIFunctionInArrayNotation= ruleJNIFunctionInArrayNotation EOF )
            // InternalAlpha.g:1576:2: iv_ruleJNIFunctionInArrayNotation= ruleJNIFunctionInArrayNotation EOF
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
    // InternalAlpha.g:1582:1: ruleJNIFunctionInArrayNotation returns [EObject current=null] : (otherlv_0= '[' () ( ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleJNIFunctionInArrayNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arrayNotation_2_0 = null;

        AntlrDatatypeRuleToken lv_arrayNotation_4_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1588:2: ( (otherlv_0= '[' () ( ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )* )? otherlv_5= ']' ) )
            // InternalAlpha.g:1589:2: (otherlv_0= '[' () ( ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )* )? otherlv_5= ']' )
            {
            // InternalAlpha.g:1589:2: (otherlv_0= '[' () ( ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )* )? otherlv_5= ']' )
            // InternalAlpha.g:1590:3: otherlv_0= '[' () ( ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )* )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getJNIFunctionInArrayNotationAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAlpha.g:1594:3: ()
            // InternalAlpha.g:1595:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJNIFunctionInArrayNotationAccess().getJNIFunctionInArrayNotationAction_1(),
            					current);
            			

            }

            // InternalAlpha.g:1601:3: ( ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_WS)||LA29_0==14||(LA29_0>=43 && LA29_0<=47)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAlpha.g:1602:4: ( (lv_arrayNotation_2_0= ruleAISLExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )*
                    {
                    // InternalAlpha.g:1602:4: ( (lv_arrayNotation_2_0= ruleAISLExpression ) )
                    // InternalAlpha.g:1603:5: (lv_arrayNotation_2_0= ruleAISLExpression )
                    {
                    // InternalAlpha.g:1603:5: (lv_arrayNotation_2_0= ruleAISLExpression )
                    // InternalAlpha.g:1604:6: lv_arrayNotation_2_0= ruleAISLExpression
                    {

                    						newCompositeNode(grammarAccess.getJNIFunctionInArrayNotationAccess().getArrayNotationAISLExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    // InternalAlpha.g:1621:4: (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==38) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalAlpha.g:1622:5: otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,38,FOLLOW_34); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getJNIFunctionInArrayNotationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlpha.g:1626:5: ( (lv_arrayNotation_4_0= ruleAISLExpression ) )
                    	    // InternalAlpha.g:1627:6: (lv_arrayNotation_4_0= ruleAISLExpression )
                    	    {
                    	    // InternalAlpha.g:1627:6: (lv_arrayNotation_4_0= ruleAISLExpression )
                    	    // InternalAlpha.g:1628:7: lv_arrayNotation_4_0= ruleAISLExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getJNIFunctionInArrayNotationAccess().getArrayNotationAISLExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
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
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,39,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFuzzyFunction"
    // InternalAlpha.g:1655:1: entryRuleFuzzyFunction returns [EObject current=null] : iv_ruleFuzzyFunction= ruleFuzzyFunction EOF ;
    public final EObject entryRuleFuzzyFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyFunction = null;


        try {
            // InternalAlpha.g:1655:54: (iv_ruleFuzzyFunction= ruleFuzzyFunction EOF )
            // InternalAlpha.g:1656:2: iv_ruleFuzzyFunction= ruleFuzzyFunction EOF
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
    // InternalAlpha.g:1662:1: ruleFuzzyFunction returns [EObject current=null] : (otherlv_0= '(' ( (lv_alphaString_1_0= ruleAISLWrappedBasicRelation ) ) (otherlv_2= ';' ( (lv_indirections_3_0= ruleFuzzyVariableUse ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleFuzzyFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_alphaString_1_0 = null;

        EObject lv_indirections_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1668:2: ( (otherlv_0= '(' ( (lv_alphaString_1_0= ruleAISLWrappedBasicRelation ) ) (otherlv_2= ';' ( (lv_indirections_3_0= ruleFuzzyVariableUse ) ) )* otherlv_4= ')' ) )
            // InternalAlpha.g:1669:2: (otherlv_0= '(' ( (lv_alphaString_1_0= ruleAISLWrappedBasicRelation ) ) (otherlv_2= ';' ( (lv_indirections_3_0= ruleFuzzyVariableUse ) ) )* otherlv_4= ')' )
            {
            // InternalAlpha.g:1669:2: (otherlv_0= '(' ( (lv_alphaString_1_0= ruleAISLWrappedBasicRelation ) ) (otherlv_2= ';' ( (lv_indirections_3_0= ruleFuzzyVariableUse ) ) )* otherlv_4= ')' )
            // InternalAlpha.g:1670:3: otherlv_0= '(' ( (lv_alphaString_1_0= ruleAISLWrappedBasicRelation ) ) (otherlv_2= ';' ( (lv_indirections_3_0= ruleFuzzyVariableUse ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFuzzyFunctionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalAlpha.g:1674:3: ( (lv_alphaString_1_0= ruleAISLWrappedBasicRelation ) )
            // InternalAlpha.g:1675:4: (lv_alphaString_1_0= ruleAISLWrappedBasicRelation )
            {
            // InternalAlpha.g:1675:4: (lv_alphaString_1_0= ruleAISLWrappedBasicRelation )
            // InternalAlpha.g:1676:5: lv_alphaString_1_0= ruleAISLWrappedBasicRelation
            {

            					newCompositeNode(grammarAccess.getFuzzyFunctionAccess().getAlphaStringAISLWrappedBasicRelationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
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

            // InternalAlpha.g:1693:3: (otherlv_2= ';' ( (lv_indirections_3_0= ruleFuzzyVariableUse ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==34) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAlpha.g:1694:4: otherlv_2= ';' ( (lv_indirections_3_0= ruleFuzzyVariableUse ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFuzzyFunctionAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalAlpha.g:1698:4: ( (lv_indirections_3_0= ruleFuzzyVariableUse ) )
            	    // InternalAlpha.g:1699:5: (lv_indirections_3_0= ruleFuzzyVariableUse )
            	    {
            	    // InternalAlpha.g:1699:5: (lv_indirections_3_0= ruleFuzzyVariableUse )
            	    // InternalAlpha.g:1700:6: lv_indirections_3_0= ruleFuzzyVariableUse
            	    {

            	    						newCompositeNode(grammarAccess.getFuzzyFunctionAccess().getIndirectionsFuzzyVariableUseParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
            	    break loop30;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAlpha.g:1726:1: entryRuleFuzzyVariableUse returns [EObject current=null] : iv_ruleFuzzyVariableUse= ruleFuzzyVariableUse EOF ;
    public final EObject entryRuleFuzzyVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyVariableUse = null;


        try {
            // InternalAlpha.g:1726:57: (iv_ruleFuzzyVariableUse= ruleFuzzyVariableUse EOF )
            // InternalAlpha.g:1727:2: iv_ruleFuzzyVariableUse= ruleFuzzyVariableUse EOF
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
    // InternalAlpha.g:1733:1: ruleFuzzyVariableUse returns [EObject current=null] : (this_NestedFuzzyFunction_0= ruleNestedFuzzyFunction | this_AffineFuzzyVariableUse_1= ruleAffineFuzzyVariableUse ) ;
    public final EObject ruleFuzzyVariableUse() throws RecognitionException {
        EObject current = null;

        EObject this_NestedFuzzyFunction_0 = null;

        EObject this_AffineFuzzyVariableUse_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1739:2: ( (this_NestedFuzzyFunction_0= ruleNestedFuzzyFunction | this_AffineFuzzyVariableUse_1= ruleAffineFuzzyVariableUse ) )
            // InternalAlpha.g:1740:2: (this_NestedFuzzyFunction_0= ruleNestedFuzzyFunction | this_AffineFuzzyVariableUse_1= ruleAffineFuzzyVariableUse )
            {
            // InternalAlpha.g:1740:2: (this_NestedFuzzyFunction_0= ruleNestedFuzzyFunction | this_AffineFuzzyVariableUse_1= ruleAffineFuzzyVariableUse )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==14) ) {
                    int LA31_2 = input.LA(3);

                    if ( (LA31_2==RULE_ID) ) {
                        int LA31_3 = input.LA(4);

                        if ( (LA31_3==37) ) {
                            alt31=2;
                        }
                        else if ( (LA31_3==20) ) {
                            alt31=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalAlpha.g:1741:3: this_NestedFuzzyFunction_0= ruleNestedFuzzyFunction
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
                    // InternalAlpha.g:1750:3: this_AffineFuzzyVariableUse_1= ruleAffineFuzzyVariableUse
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
    // InternalAlpha.g:1762:1: entryRuleNestedFuzzyFunction returns [EObject current=null] : iv_ruleNestedFuzzyFunction= ruleNestedFuzzyFunction EOF ;
    public final EObject entryRuleNestedFuzzyFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedFuzzyFunction = null;


        try {
            // InternalAlpha.g:1762:60: (iv_ruleNestedFuzzyFunction= ruleNestedFuzzyFunction EOF )
            // InternalAlpha.g:1763:2: iv_ruleNestedFuzzyFunction= ruleNestedFuzzyFunction EOF
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
    // InternalAlpha.g:1769:1: ruleNestedFuzzyFunction returns [EObject current=null] : ( ( (lv_fuzzyIndex_0_0= ruleIndexName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_alphaString_4_0= ruleAISLWrappedBasicRelation ) ) (otherlv_5= ';' ( (lv_indirections_6_0= ruleFuzzyVariableUse ) ) )* otherlv_7= '}' ) ;
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
            // InternalAlpha.g:1775:2: ( ( ( (lv_fuzzyIndex_0_0= ruleIndexName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_alphaString_4_0= ruleAISLWrappedBasicRelation ) ) (otherlv_5= ';' ( (lv_indirections_6_0= ruleFuzzyVariableUse ) ) )* otherlv_7= '}' ) )
            // InternalAlpha.g:1776:2: ( ( (lv_fuzzyIndex_0_0= ruleIndexName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_alphaString_4_0= ruleAISLWrappedBasicRelation ) ) (otherlv_5= ';' ( (lv_indirections_6_0= ruleFuzzyVariableUse ) ) )* otherlv_7= '}' )
            {
            // InternalAlpha.g:1776:2: ( ( (lv_fuzzyIndex_0_0= ruleIndexName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_alphaString_4_0= ruleAISLWrappedBasicRelation ) ) (otherlv_5= ';' ( (lv_indirections_6_0= ruleFuzzyVariableUse ) ) )* otherlv_7= '}' )
            // InternalAlpha.g:1777:3: ( (lv_fuzzyIndex_0_0= ruleIndexName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_alphaString_4_0= ruleAISLWrappedBasicRelation ) ) (otherlv_5= ';' ( (lv_indirections_6_0= ruleFuzzyVariableUse ) ) )* otherlv_7= '}'
            {
            // InternalAlpha.g:1777:3: ( (lv_fuzzyIndex_0_0= ruleIndexName ) )
            // InternalAlpha.g:1778:4: (lv_fuzzyIndex_0_0= ruleIndexName )
            {
            // InternalAlpha.g:1778:4: (lv_fuzzyIndex_0_0= ruleIndexName )
            // InternalAlpha.g:1779:5: lv_fuzzyIndex_0_0= ruleIndexName
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

            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getNestedFuzzyFunctionAccess().getEqualsSignKeyword_1());
            		
            // InternalAlpha.g:1800:3: ( (otherlv_2= RULE_ID ) )
            // InternalAlpha.g:1801:4: (otherlv_2= RULE_ID )
            {
            // InternalAlpha.g:1801:4: (otherlv_2= RULE_ID )
            // InternalAlpha.g:1802:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNestedFuzzyFunctionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getNestedFuzzyFunctionAccess().getFuzzyVariableFuzzyVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getNestedFuzzyFunctionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAlpha.g:1817:3: ( (lv_alphaString_4_0= ruleAISLWrappedBasicRelation ) )
            // InternalAlpha.g:1818:4: (lv_alphaString_4_0= ruleAISLWrappedBasicRelation )
            {
            // InternalAlpha.g:1818:4: (lv_alphaString_4_0= ruleAISLWrappedBasicRelation )
            // InternalAlpha.g:1819:5: lv_alphaString_4_0= ruleAISLWrappedBasicRelation
            {

            					newCompositeNode(grammarAccess.getNestedFuzzyFunctionAccess().getAlphaStringAISLWrappedBasicRelationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalAlpha.g:1836:3: (otherlv_5= ';' ( (lv_indirections_6_0= ruleFuzzyVariableUse ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==34) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAlpha.g:1837:4: otherlv_5= ';' ( (lv_indirections_6_0= ruleFuzzyVariableUse ) )
            	    {
            	    otherlv_5=(Token)match(input,34,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getNestedFuzzyFunctionAccess().getSemicolonKeyword_5_0());
            	    			
            	    // InternalAlpha.g:1841:4: ( (lv_indirections_6_0= ruleFuzzyVariableUse ) )
            	    // InternalAlpha.g:1842:5: (lv_indirections_6_0= ruleFuzzyVariableUse )
            	    {
            	    // InternalAlpha.g:1842:5: (lv_indirections_6_0= ruleFuzzyVariableUse )
            	    // InternalAlpha.g:1843:6: lv_indirections_6_0= ruleFuzzyVariableUse
            	    {

            	    						newCompositeNode(grammarAccess.getNestedFuzzyFunctionAccess().getIndirectionsFuzzyVariableUseParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
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
            	    break loop32;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

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
    // InternalAlpha.g:1869:1: entryRuleAffineFuzzyVariableUse returns [EObject current=null] : iv_ruleAffineFuzzyVariableUse= ruleAffineFuzzyVariableUse EOF ;
    public final EObject entryRuleAffineFuzzyVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffineFuzzyVariableUse = null;


        try {
            // InternalAlpha.g:1869:63: (iv_ruleAffineFuzzyVariableUse= ruleAffineFuzzyVariableUse EOF )
            // InternalAlpha.g:1870:2: iv_ruleAffineFuzzyVariableUse= ruleAffineFuzzyVariableUse EOF
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
    // InternalAlpha.g:1876:1: ruleAffineFuzzyVariableUse returns [EObject current=null] : ( ( (lv_fuzzyIndex_0_0= ruleIndexName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_useFunction_3_0= ruleJNIFunctionInArrayNotation ) ) ) ;
    public final EObject ruleAffineFuzzyVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_fuzzyIndex_0_0 = null;

        EObject lv_useFunction_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1882:2: ( ( ( (lv_fuzzyIndex_0_0= ruleIndexName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_useFunction_3_0= ruleJNIFunctionInArrayNotation ) ) ) )
            // InternalAlpha.g:1883:2: ( ( (lv_fuzzyIndex_0_0= ruleIndexName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_useFunction_3_0= ruleJNIFunctionInArrayNotation ) ) )
            {
            // InternalAlpha.g:1883:2: ( ( (lv_fuzzyIndex_0_0= ruleIndexName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_useFunction_3_0= ruleJNIFunctionInArrayNotation ) ) )
            // InternalAlpha.g:1884:3: ( (lv_fuzzyIndex_0_0= ruleIndexName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_useFunction_3_0= ruleJNIFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:1884:3: ( (lv_fuzzyIndex_0_0= ruleIndexName ) )
            // InternalAlpha.g:1885:4: (lv_fuzzyIndex_0_0= ruleIndexName )
            {
            // InternalAlpha.g:1885:4: (lv_fuzzyIndex_0_0= ruleIndexName )
            // InternalAlpha.g:1886:5: lv_fuzzyIndex_0_0= ruleIndexName
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

            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAffineFuzzyVariableUseAccess().getEqualsSignKeyword_1());
            		
            // InternalAlpha.g:1907:3: ( (otherlv_2= RULE_ID ) )
            // InternalAlpha.g:1908:4: (otherlv_2= RULE_ID )
            {
            // InternalAlpha.g:1908:4: (otherlv_2= RULE_ID )
            // InternalAlpha.g:1909:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAffineFuzzyVariableUseRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(otherlv_2, grammarAccess.getAffineFuzzyVariableUseAccess().getFuzzyVariableFuzzyVariableCrossReference_2_0());
            				

            }


            }

            // InternalAlpha.g:1920:3: ( (lv_useFunction_3_0= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:1921:4: (lv_useFunction_3_0= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:1921:4: (lv_useFunction_3_0= ruleJNIFunctionInArrayNotation )
            // InternalAlpha.g:1922:5: lv_useFunction_3_0= ruleJNIFunctionInArrayNotation
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
    // InternalAlpha.g:1943:1: entryRuleFuzzyFunctionInArrayNotation returns [EObject current=null] : iv_ruleFuzzyFunctionInArrayNotation= ruleFuzzyFunctionInArrayNotation EOF ;
    public final EObject entryRuleFuzzyFunctionInArrayNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyFunctionInArrayNotation = null;


        try {
            // InternalAlpha.g:1943:69: (iv_ruleFuzzyFunctionInArrayNotation= ruleFuzzyFunctionInArrayNotation EOF )
            // InternalAlpha.g:1944:2: iv_ruleFuzzyFunctionInArrayNotation= ruleFuzzyFunctionInArrayNotation EOF
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
    // InternalAlpha.g:1950:1: ruleFuzzyFunctionInArrayNotation returns [EObject current=null] : (otherlv_0= '[[' () ( ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )* )? otherlv_5= ']]' ) ;
    public final EObject ruleFuzzyFunctionInArrayNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arrayNotation_2_0 = null;

        AntlrDatatypeRuleToken lv_arrayNotation_4_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1956:2: ( (otherlv_0= '[[' () ( ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )* )? otherlv_5= ']]' ) )
            // InternalAlpha.g:1957:2: (otherlv_0= '[[' () ( ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )* )? otherlv_5= ']]' )
            {
            // InternalAlpha.g:1957:2: (otherlv_0= '[[' () ( ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )* )? otherlv_5= ']]' )
            // InternalAlpha.g:1958:3: otherlv_0= '[[' () ( ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )* )? otherlv_5= ']]'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getFuzzyFunctionInArrayNotationAccess().getLeftSquareBracketLeftSquareBracketKeyword_0());
            		
            // InternalAlpha.g:1962:3: ()
            // InternalAlpha.g:1963:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFuzzyFunctionInArrayNotationAccess().getFuzzyFunctionInArrayNotationAction_1(),
            					current);
            			

            }

            // InternalAlpha.g:1969:3: ( ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_WS)||LA34_0==14||LA34_0==37||LA34_0==39||(LA34_0>=43 && LA34_0<=47)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAlpha.g:1970:4: ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) ) (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )*
                    {
                    // InternalAlpha.g:1970:4: ( (lv_arrayNotation_2_0= ruleAISLFuzzyExpression ) )
                    // InternalAlpha.g:1971:5: (lv_arrayNotation_2_0= ruleAISLFuzzyExpression )
                    {
                    // InternalAlpha.g:1971:5: (lv_arrayNotation_2_0= ruleAISLFuzzyExpression )
                    // InternalAlpha.g:1972:6: lv_arrayNotation_2_0= ruleAISLFuzzyExpression
                    {

                    						newCompositeNode(grammarAccess.getFuzzyFunctionInArrayNotationAccess().getArrayNotationAISLFuzzyExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_39);
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

                    // InternalAlpha.g:1989:4: (otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==38) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalAlpha.g:1990:5: otherlv_3= ',' ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,38,FOLLOW_40); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFuzzyFunctionInArrayNotationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlpha.g:1994:5: ( (lv_arrayNotation_4_0= ruleAISLFuzzyExpression ) )
                    	    // InternalAlpha.g:1995:6: (lv_arrayNotation_4_0= ruleAISLFuzzyExpression )
                    	    {
                    	    // InternalAlpha.g:1995:6: (lv_arrayNotation_4_0= ruleAISLFuzzyExpression )
                    	    // InternalAlpha.g:1996:7: lv_arrayNotation_4_0= ruleAISLFuzzyExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getFuzzyFunctionInArrayNotationAccess().getArrayNotationAISLFuzzyExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_39);
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
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,41,FOLLOW_2); 

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
    // InternalAlpha.g:2023:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlpha.g:2023:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlpha.g:2024:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlpha.g:2030:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAlpha.g:2036:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAlpha.g:2037:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAlpha.g:2037:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAlpha.g:2038:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_41); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalAlpha.g:2045:3: (kw= '.' this_ID_2= RULE_ID )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==29) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAlpha.g:2046:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,29,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_41); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalAlpha.g:2063:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAlpha.g:2063:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAlpha.g:2064:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalAlpha.g:2070:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2076:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalAlpha.g:2077:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalAlpha.g:2077:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalAlpha.g:2078:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:2088:3: (kw= '.*' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==42) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAlpha.g:2089:4: kw= '.*'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

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
    // InternalAlpha.g:2099:1: entryRuleSystemName returns [String current=null] : iv_ruleSystemName= ruleSystemName EOF ;
    public final String entryRuleSystemName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSystemName = null;


        try {
            // InternalAlpha.g:2099:50: (iv_ruleSystemName= ruleSystemName EOF )
            // InternalAlpha.g:2100:2: iv_ruleSystemName= ruleSystemName EOF
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
    // InternalAlpha.g:2106:1: ruleSystemName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleSystemName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:2112:2: (this_ID_0= RULE_ID )
            // InternalAlpha.g:2113:2: this_ID_0= RULE_ID
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
    // InternalAlpha.g:2123:1: entryRuleIndexName returns [String current=null] : iv_ruleIndexName= ruleIndexName EOF ;
    public final String entryRuleIndexName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIndexName = null;


        try {
            // InternalAlpha.g:2123:49: (iv_ruleIndexName= ruleIndexName EOF )
            // InternalAlpha.g:2124:2: iv_ruleIndexName= ruleIndexName EOF
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
    // InternalAlpha.g:2130:1: ruleIndexName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleIndexName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:2136:2: (this_ID_0= RULE_ID )
            // InternalAlpha.g:2137:2: this_ID_0= RULE_ID
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
    // InternalAlpha.g:2147:1: entryRuleAIndexList returns [String current=null] : iv_ruleAIndexList= ruleAIndexList EOF ;
    public final String entryRuleAIndexList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAIndexList = null;


        try {
            // InternalAlpha.g:2147:50: (iv_ruleAIndexList= ruleAIndexList EOF )
            // InternalAlpha.g:2148:2: iv_ruleAIndexList= ruleAIndexList EOF
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
    // InternalAlpha.g:2154:1: ruleAIndexList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IndexName_0= ruleIndexName (kw= ',' this_IndexName_2= ruleIndexName )* )? ;
    public final AntlrDatatypeRuleToken ruleAIndexList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IndexName_0 = null;

        AntlrDatatypeRuleToken this_IndexName_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2160:2: ( (this_IndexName_0= ruleIndexName (kw= ',' this_IndexName_2= ruleIndexName )* )? )
            // InternalAlpha.g:2161:2: (this_IndexName_0= ruleIndexName (kw= ',' this_IndexName_2= ruleIndexName )* )?
            {
            // InternalAlpha.g:2161:2: (this_IndexName_0= ruleIndexName (kw= ',' this_IndexName_2= ruleIndexName )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAlpha.g:2162:3: this_IndexName_0= ruleIndexName (kw= ',' this_IndexName_2= ruleIndexName )*
                    {

                    			newCompositeNode(grammarAccess.getAIndexListAccess().getIndexNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_43);
                    this_IndexName_0=ruleIndexName();

                    state._fsp--;


                    			current.merge(this_IndexName_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		
                    // InternalAlpha.g:2172:3: (kw= ',' this_IndexName_2= ruleIndexName )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==38) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalAlpha.g:2173:4: kw= ',' this_IndexName_2= ruleIndexName
                    	    {
                    	    kw=(Token)match(input,38,FOLLOW_5); 

                    	    				current.merge(kw);
                    	    				newLeafNode(kw, grammarAccess.getAIndexListAccess().getCommaKeyword_1_0());
                    	    			

                    	    				newCompositeNode(grammarAccess.getAIndexListAccess().getIndexNameParserRuleCall_1_1());
                    	    			
                    	    pushFollow(FOLLOW_43);
                    	    this_IndexName_2=ruleIndexName();

                    	    state._fsp--;


                    	    				current.merge(this_IndexName_2);
                    	    			

                    	    				afterParserOrEnumRuleCall();
                    	    			

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
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
    // InternalAlpha.g:2193:1: entryRuleAParamDomain returns [String current=null] : iv_ruleAParamDomain= ruleAParamDomain EOF ;
    public final String entryRuleAParamDomain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAParamDomain = null;


        try {
            // InternalAlpha.g:2193:52: (iv_ruleAParamDomain= ruleAParamDomain EOF )
            // InternalAlpha.g:2194:2: iv_ruleAParamDomain= ruleAParamDomain EOF
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
    // InternalAlpha.g:2200:1: ruleAParamDomain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_AISLString_6= ruleAISLString kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleAParamDomain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AIndexList_1 = null;

        AntlrDatatypeRuleToken this_AISLString_6 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2206:2: ( (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_AISLString_6= ruleAISLString kw= '}' ) )
            // InternalAlpha.g:2207:2: (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_AISLString_6= ruleAISLString kw= '}' )
            {
            // InternalAlpha.g:2207:2: (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_AISLString_6= ruleAISLString kw= '}' )
            // InternalAlpha.g:2208:3: kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_AISLString_6= ruleAISLString kw= '}'
            {
            kw=(Token)match(input,37,FOLLOW_44); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAParamDomainAccess().getAIndexListParserRuleCall_1());
            		
            pushFollow(FOLLOW_45);
            this_AIndexList_1=ruleAIndexList();

            state._fsp--;


            			current.merge(this_AIndexList_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,39,FOLLOW_29); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getRightSquareBracketKeyword_2());
            		
            kw=(Token)match(input,36,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            kw=(Token)match(input,20,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getLeftCurlyBracketKeyword_4());
            		
            kw=(Token)match(input,33,FOLLOW_30); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getColonKeyword_5());
            		

            			newCompositeNode(grammarAccess.getAParamDomainAccess().getAISLStringParserRuleCall_6());
            		
            pushFollow(FOLLOW_31);
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


    // $ANTLR start "entryRuleAParamDomainInArrayNotation"
    // InternalAlpha.g:2262:1: entryRuleAParamDomainInArrayNotation returns [String current=null] : iv_ruleAParamDomainInArrayNotation= ruleAParamDomainInArrayNotation EOF ;
    public final String entryRuleAParamDomainInArrayNotation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAParamDomainInArrayNotation = null;


        try {
            // InternalAlpha.g:2262:67: (iv_ruleAParamDomainInArrayNotation= ruleAParamDomainInArrayNotation EOF )
            // InternalAlpha.g:2263:2: iv_ruleAParamDomainInArrayNotation= ruleAParamDomainInArrayNotation EOF
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
    // InternalAlpha.g:2269:1: ruleAParamDomainInArrayNotation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' kw= ':' this_AISLString_2= ruleAISLString kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleAParamDomainInArrayNotation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLString_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2275:2: ( (kw= '{' kw= ':' this_AISLString_2= ruleAISLString kw= '}' ) )
            // InternalAlpha.g:2276:2: (kw= '{' kw= ':' this_AISLString_2= ruleAISLString kw= '}' )
            {
            // InternalAlpha.g:2276:2: (kw= '{' kw= ':' this_AISLString_2= ruleAISLString kw= '}' )
            // InternalAlpha.g:2277:3: kw= '{' kw= ':' this_AISLString_2= ruleAISLString kw= '}'
            {
            kw=(Token)match(input,20,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainInArrayNotationAccess().getLeftCurlyBracketKeyword_0());
            		
            kw=(Token)match(input,33,FOLLOW_30); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAParamDomainInArrayNotationAccess().getColonKeyword_1());
            		

            			newCompositeNode(grammarAccess.getAParamDomainInArrayNotationAccess().getAISLStringParserRuleCall_2());
            		
            pushFollow(FOLLOW_31);
            this_AISLString_2=ruleAISLString();

            state._fsp--;


            			current.merge(this_AISLString_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,21,FOLLOW_2); 

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
    // InternalAlpha.g:2306:1: entryRuleAISLSet returns [String current=null] : iv_ruleAISLSet= ruleAISLSet EOF ;
    public final String entryRuleAISLSet() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLSet = null;


        try {
            // InternalAlpha.g:2306:47: (iv_ruleAISLSet= ruleAISLSet EOF )
            // InternalAlpha.g:2307:2: iv_ruleAISLSet= ruleAISLSet EOF
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
    // InternalAlpha.g:2313:1: ruleAISLSet returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleAISLSet() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLBasicSet_1 = null;

        AntlrDatatypeRuleToken this_AISLBasicSet_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2319:2: ( (kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}' ) )
            // InternalAlpha.g:2320:2: (kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}' )
            {
            // InternalAlpha.g:2320:2: (kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}' )
            // InternalAlpha.g:2321:3: kw= '{' this_AISLBasicSet_1= ruleAISLBasicSet (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )* kw= '}'
            {
            kw=(Token)match(input,20,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLSetAccess().getLeftCurlyBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAISLSetAccess().getAISLBasicSetParserRuleCall_1());
            		
            pushFollow(FOLLOW_36);
            this_AISLBasicSet_1=ruleAISLBasicSet();

            state._fsp--;


            			current.merge(this_AISLBasicSet_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:2336:3: (kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==34) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAlpha.g:2337:4: kw= ';' this_AISLBasicSet_3= ruleAISLBasicSet
            	    {
            	    kw=(Token)match(input,34,FOLLOW_12); 

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
            	    break loop39;
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
    // InternalAlpha.g:2362:1: entryRuleAISLBasicSet returns [String current=null] : iv_ruleAISLBasicSet= ruleAISLBasicSet EOF ;
    public final String entryRuleAISLBasicSet() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLBasicSet = null;


        try {
            // InternalAlpha.g:2362:52: (iv_ruleAISLBasicSet= ruleAISLBasicSet EOF )
            // InternalAlpha.g:2363:2: iv_ruleAISLBasicSet= ruleAISLBasicSet EOF
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
    // InternalAlpha.g:2369:1: ruleAISLBasicSet returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_4= ruleAISLString ) ;
    public final AntlrDatatypeRuleToken ruleAISLBasicSet() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLExpressionList_1 = null;

        AntlrDatatypeRuleToken this_AISLString_4 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2375:2: ( (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_4= ruleAISLString ) )
            // InternalAlpha.g:2376:2: (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_4= ruleAISLString )
            {
            // InternalAlpha.g:2376:2: (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_4= ruleAISLString )
            // InternalAlpha.g:2377:3: kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_4= ruleAISLString
            {
            kw=(Token)match(input,37,FOLLOW_32); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicSetAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAISLBasicSetAccess().getAISLExpressionListParserRuleCall_1());
            		
            pushFollow(FOLLOW_45);
            this_AISLExpressionList_1=ruleAISLExpressionList();

            state._fsp--;


            			current.merge(this_AISLExpressionList_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,39,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicSetAccess().getRightSquareBracketKeyword_2());
            		
            kw=(Token)match(input,33,FOLLOW_46); 

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
    // InternalAlpha.g:2416:1: entryRuleAISLRelation returns [String current=null] : iv_ruleAISLRelation= ruleAISLRelation EOF ;
    public final String entryRuleAISLRelation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLRelation = null;


        try {
            // InternalAlpha.g:2416:52: (iv_ruleAISLRelation= ruleAISLRelation EOF )
            // InternalAlpha.g:2417:2: iv_ruleAISLRelation= ruleAISLRelation EOF
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
    // InternalAlpha.g:2423:1: ruleAISLRelation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_AISLBasicRelation_1= ruleAISLBasicRelation (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleAISLRelation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLBasicRelation_1 = null;

        AntlrDatatypeRuleToken this_AISLBasicRelation_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2429:2: ( (kw= '{' this_AISLBasicRelation_1= ruleAISLBasicRelation (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )* kw= '}' ) )
            // InternalAlpha.g:2430:2: (kw= '{' this_AISLBasicRelation_1= ruleAISLBasicRelation (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )* kw= '}' )
            {
            // InternalAlpha.g:2430:2: (kw= '{' this_AISLBasicRelation_1= ruleAISLBasicRelation (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )* kw= '}' )
            // InternalAlpha.g:2431:3: kw= '{' this_AISLBasicRelation_1= ruleAISLBasicRelation (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )* kw= '}'
            {
            kw=(Token)match(input,20,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLRelationAccess().getLeftCurlyBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAISLRelationAccess().getAISLBasicRelationParserRuleCall_1());
            		
            pushFollow(FOLLOW_36);
            this_AISLBasicRelation_1=ruleAISLBasicRelation();

            state._fsp--;


            			current.merge(this_AISLBasicRelation_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:2446:3: (kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==34) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAlpha.g:2447:4: kw= ';' this_AISLBasicRelation_3= ruleAISLBasicRelation
            	    {
            	    kw=(Token)match(input,34,FOLLOW_12); 

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
            	    break loop40;
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
    // InternalAlpha.g:2472:1: entryRuleAISLString returns [String current=null] : iv_ruleAISLString= ruleAISLString EOF ;
    public final String entryRuleAISLString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLString = null;


        try {
            // InternalAlpha.g:2472:50: (iv_ruleAISLString= ruleAISLString EOF )
            // InternalAlpha.g:2473:2: iv_ruleAISLString= ruleAISLString EOF
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
    // InternalAlpha.g:2479:1: ruleAISLString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= 'and' | kw= 'or' | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | kw= '&' | kw= '|' | this_WS_17= RULE_WS | kw= '>=' | kw= '>' | kw= '=' | kw= '<' | kw= '<=' )* ;
    public final AntlrDatatypeRuleToken ruleAISLString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token kw=null;
        Token this_WS_17=null;
        AntlrDatatypeRuleToken this_IndexName_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2485:2: ( (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= 'and' | kw= 'or' | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | kw= '&' | kw= '|' | this_WS_17= RULE_WS | kw= '>=' | kw= '>' | kw= '=' | kw= '<' | kw= '<=' )* )
            // InternalAlpha.g:2486:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= 'and' | kw= 'or' | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | kw= '&' | kw= '|' | this_WS_17= RULE_WS | kw= '>=' | kw= '>' | kw= '=' | kw= '<' | kw= '<=' )*
            {
            // InternalAlpha.g:2486:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= 'and' | kw= 'or' | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | kw= '&' | kw= '|' | this_WS_17= RULE_WS | kw= '>=' | kw= '>' | kw= '=' | kw= '<' | kw= '<=' )*
            loop41:
            do {
                int alt41=24;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt41=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt41=2;
                    }
                    break;
                case 43:
                    {
                    alt41=3;
                    }
                    break;
                case 44:
                    {
                    alt41=4;
                    }
                    break;
                case 45:
                    {
                    alt41=5;
                    }
                    break;
                case 46:
                    {
                    alt41=6;
                    }
                    break;
                case 47:
                    {
                    alt41=7;
                    }
                    break;
                case 48:
                    {
                    alt41=8;
                    }
                    break;
                case 49:
                    {
                    alt41=9;
                    }
                    break;
                case 37:
                    {
                    alt41=10;
                    }
                    break;
                case 39:
                    {
                    alt41=11;
                    }
                    break;
                case 16:
                    {
                    alt41=12;
                    }
                    break;
                case 17:
                    {
                    alt41=13;
                    }
                    break;
                case 38:
                    {
                    alt41=14;
                    }
                    break;
                case 33:
                    {
                    alt41=15;
                    }
                    break;
                case 50:
                    {
                    alt41=16;
                    }
                    break;
                case 51:
                    {
                    alt41=17;
                    }
                    break;
                case RULE_WS:
                    {
                    alt41=18;
                    }
                    break;
                case 52:
                    {
                    alt41=19;
                    }
                    break;
                case 53:
                    {
                    alt41=20;
                    }
                    break;
                case 14:
                    {
                    alt41=21;
                    }
                    break;
                case 54:
                    {
                    alt41=22;
                    }
                    break;
                case 55:
                    {
                    alt41=23;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // InternalAlpha.g:2487:3: this_IndexName_0= ruleIndexName
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
            	    // InternalAlpha.g:2498:3: this_INT_1= RULE_INT
            	    {
            	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_47); 

            	    			current.merge(this_INT_1);
            	    		

            	    			newLeafNode(this_INT_1, grammarAccess.getAISLStringAccess().getINTTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalAlpha.g:2506:3: kw= '+'
            	    {
            	    kw=(Token)match(input,43,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getPlusSignKeyword_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalAlpha.g:2512:3: kw= '-'
            	    {
            	    kw=(Token)match(input,44,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getHyphenMinusKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalAlpha.g:2518:3: kw= '*'
            	    {
            	    kw=(Token)match(input,45,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getAsteriskKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalAlpha.g:2524:3: kw= '/'
            	    {
            	    kw=(Token)match(input,46,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getSolidusKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalAlpha.g:2530:3: kw= '%'
            	    {
            	    kw=(Token)match(input,47,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getPercentSignKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalAlpha.g:2536:3: kw= 'and'
            	    {
            	    kw=(Token)match(input,48,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getAndKeyword_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalAlpha.g:2542:3: kw= 'or'
            	    {
            	    kw=(Token)match(input,49,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getOrKeyword_8());
            	    		

            	    }
            	    break;
            	case 10 :
            	    // InternalAlpha.g:2548:3: kw= '['
            	    {
            	    kw=(Token)match(input,37,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getLeftSquareBracketKeyword_9());
            	    		

            	    }
            	    break;
            	case 11 :
            	    // InternalAlpha.g:2554:3: kw= ']'
            	    {
            	    kw=(Token)match(input,39,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getRightSquareBracketKeyword_10());
            	    		

            	    }
            	    break;
            	case 12 :
            	    // InternalAlpha.g:2560:3: kw= '('
            	    {
            	    kw=(Token)match(input,16,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getLeftParenthesisKeyword_11());
            	    		

            	    }
            	    break;
            	case 13 :
            	    // InternalAlpha.g:2566:3: kw= ')'
            	    {
            	    kw=(Token)match(input,17,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getRightParenthesisKeyword_12());
            	    		

            	    }
            	    break;
            	case 14 :
            	    // InternalAlpha.g:2572:3: kw= ','
            	    {
            	    kw=(Token)match(input,38,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getCommaKeyword_13());
            	    		

            	    }
            	    break;
            	case 15 :
            	    // InternalAlpha.g:2578:3: kw= ':'
            	    {
            	    kw=(Token)match(input,33,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getColonKeyword_14());
            	    		

            	    }
            	    break;
            	case 16 :
            	    // InternalAlpha.g:2584:3: kw= '&'
            	    {
            	    kw=(Token)match(input,50,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getAmpersandKeyword_15());
            	    		

            	    }
            	    break;
            	case 17 :
            	    // InternalAlpha.g:2590:3: kw= '|'
            	    {
            	    kw=(Token)match(input,51,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getVerticalLineKeyword_16());
            	    		

            	    }
            	    break;
            	case 18 :
            	    // InternalAlpha.g:2596:3: this_WS_17= RULE_WS
            	    {
            	    this_WS_17=(Token)match(input,RULE_WS,FOLLOW_47); 

            	    			current.merge(this_WS_17);
            	    		

            	    			newLeafNode(this_WS_17, grammarAccess.getAISLStringAccess().getWSTerminalRuleCall_17());
            	    		

            	    }
            	    break;
            	case 19 :
            	    // InternalAlpha.g:2604:3: kw= '>='
            	    {
            	    kw=(Token)match(input,52,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getGreaterThanSignEqualsSignKeyword_18());
            	    		

            	    }
            	    break;
            	case 20 :
            	    // InternalAlpha.g:2610:3: kw= '>'
            	    {
            	    kw=(Token)match(input,53,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getGreaterThanSignKeyword_19());
            	    		

            	    }
            	    break;
            	case 21 :
            	    // InternalAlpha.g:2616:3: kw= '='
            	    {
            	    kw=(Token)match(input,14,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getEqualsSignKeyword_20());
            	    		

            	    }
            	    break;
            	case 22 :
            	    // InternalAlpha.g:2622:3: kw= '<'
            	    {
            	    kw=(Token)match(input,54,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getLessThanSignKeyword_21());
            	    		

            	    }
            	    break;
            	case 23 :
            	    // InternalAlpha.g:2628:3: kw= '<='
            	    {
            	    kw=(Token)match(input,55,FOLLOW_47); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLStringAccess().getLessThanSignEqualsSignKeyword_22());
            	    		

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalAlpha.g:2637:1: entryRuleAISLExpression returns [String current=null] : iv_ruleAISLExpression= ruleAISLExpression EOF ;
    public final String entryRuleAISLExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLExpression = null;


        try {
            // InternalAlpha.g:2637:54: (iv_ruleAISLExpression= ruleAISLExpression EOF )
            // InternalAlpha.g:2638:2: iv_ruleAISLExpression= ruleAISLExpression EOF
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
    // InternalAlpha.g:2644:1: ruleAISLExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_8= RULE_WS )+ ;
    public final AntlrDatatypeRuleToken ruleAISLExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token kw=null;
        Token this_WS_8=null;
        AntlrDatatypeRuleToken this_IndexName_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2650:2: ( (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_8= RULE_WS )+ )
            // InternalAlpha.g:2651:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_8= RULE_WS )+
            {
            // InternalAlpha.g:2651:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_8= RULE_WS )+
            int cnt42=0;
            loop42:
            do {
                int alt42=10;
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
                case 14:
                    {
                    alt42=3;
                    }
                    break;
                case 43:
                    {
                    alt42=4;
                    }
                    break;
                case 44:
                    {
                    alt42=5;
                    }
                    break;
                case 45:
                    {
                    alt42=6;
                    }
                    break;
                case 46:
                    {
                    alt42=7;
                    }
                    break;
                case 47:
                    {
                    alt42=8;
                    }
                    break;
                case RULE_WS:
                    {
                    alt42=9;
                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // InternalAlpha.g:2652:3: this_IndexName_0= ruleIndexName
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
            	    // InternalAlpha.g:2663:3: this_INT_1= RULE_INT
            	    {
            	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_48); 

            	    			current.merge(this_INT_1);
            	    		

            	    			newLeafNode(this_INT_1, grammarAccess.getAISLExpressionAccess().getINTTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalAlpha.g:2671:3: kw= '='
            	    {
            	    kw=(Token)match(input,14,FOLLOW_48); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getEqualsSignKeyword_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalAlpha.g:2677:3: kw= '+'
            	    {
            	    kw=(Token)match(input,43,FOLLOW_48); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getPlusSignKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalAlpha.g:2683:3: kw= '-'
            	    {
            	    kw=(Token)match(input,44,FOLLOW_48); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getHyphenMinusKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalAlpha.g:2689:3: kw= '*'
            	    {
            	    kw=(Token)match(input,45,FOLLOW_48); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getAsteriskKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalAlpha.g:2695:3: kw= '/'
            	    {
            	    kw=(Token)match(input,46,FOLLOW_48); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getSolidusKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalAlpha.g:2701:3: kw= '%'
            	    {
            	    kw=(Token)match(input,47,FOLLOW_48); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLExpressionAccess().getPercentSignKeyword_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalAlpha.g:2707:3: this_WS_8= RULE_WS
            	    {
            	    this_WS_8=(Token)match(input,RULE_WS,FOLLOW_48); 

            	    			current.merge(this_WS_8);
            	    		

            	    			newLeafNode(this_WS_8, grammarAccess.getAISLExpressionAccess().getWSTerminalRuleCall_8());
            	    		

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
    // $ANTLR end "ruleAISLExpression"


    // $ANTLR start "entryRuleAISLExpressionList"
    // InternalAlpha.g:2718:1: entryRuleAISLExpressionList returns [String current=null] : iv_ruleAISLExpressionList= ruleAISLExpressionList EOF ;
    public final String entryRuleAISLExpressionList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLExpressionList = null;


        try {
            // InternalAlpha.g:2718:58: (iv_ruleAISLExpressionList= ruleAISLExpressionList EOF )
            // InternalAlpha.g:2719:2: iv_ruleAISLExpressionList= ruleAISLExpressionList EOF
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
    // InternalAlpha.g:2725:1: ruleAISLExpressionList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AISLExpression_0= ruleAISLExpression (kw= ',' this_AISLExpression_2= ruleAISLExpression )* )? ;
    public final AntlrDatatypeRuleToken ruleAISLExpressionList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLExpression_0 = null;

        AntlrDatatypeRuleToken this_AISLExpression_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2731:2: ( (this_AISLExpression_0= ruleAISLExpression (kw= ',' this_AISLExpression_2= ruleAISLExpression )* )? )
            // InternalAlpha.g:2732:2: (this_AISLExpression_0= ruleAISLExpression (kw= ',' this_AISLExpression_2= ruleAISLExpression )* )?
            {
            // InternalAlpha.g:2732:2: (this_AISLExpression_0= ruleAISLExpression (kw= ',' this_AISLExpression_2= ruleAISLExpression )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_WS)||LA44_0==14||(LA44_0>=43 && LA44_0<=47)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAlpha.g:2733:3: this_AISLExpression_0= ruleAISLExpression (kw= ',' this_AISLExpression_2= ruleAISLExpression )*
                    {

                    			newCompositeNode(grammarAccess.getAISLExpressionListAccess().getAISLExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_43);
                    this_AISLExpression_0=ruleAISLExpression();

                    state._fsp--;


                    			current.merge(this_AISLExpression_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		
                    // InternalAlpha.g:2743:3: (kw= ',' this_AISLExpression_2= ruleAISLExpression )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==38) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalAlpha.g:2744:4: kw= ',' this_AISLExpression_2= ruleAISLExpression
                    	    {
                    	    kw=(Token)match(input,38,FOLLOW_34); 

                    	    				current.merge(kw);
                    	    				newLeafNode(kw, grammarAccess.getAISLExpressionListAccess().getCommaKeyword_1_0());
                    	    			

                    	    				newCompositeNode(grammarAccess.getAISLExpressionListAccess().getAISLExpressionParserRuleCall_1_1());
                    	    			
                    	    pushFollow(FOLLOW_43);
                    	    this_AISLExpression_2=ruleAISLExpression();

                    	    state._fsp--;


                    	    				current.merge(this_AISLExpression_2);
                    	    			

                    	    				afterParserOrEnumRuleCall();
                    	    			

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
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
    // InternalAlpha.g:2764:1: entryRuleAAlphaFunction returns [String current=null] : iv_ruleAAlphaFunction= ruleAAlphaFunction EOF ;
    public final String entryRuleAAlphaFunction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAAlphaFunction = null;


        try {
            // InternalAlpha.g:2764:54: (iv_ruleAAlphaFunction= ruleAAlphaFunction EOF )
            // InternalAlpha.g:2765:2: iv_ruleAAlphaFunction= ruleAAlphaFunction EOF
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
    // InternalAlpha.g:2771:1: ruleAAlphaFunction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_AIndexList_1= ruleAIndexList kw= '->' this_AISLExpressionList_3= ruleAISLExpressionList kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleAAlphaFunction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AIndexList_1 = null;

        AntlrDatatypeRuleToken this_AISLExpressionList_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2777:2: ( (kw= '(' this_AIndexList_1= ruleAIndexList kw= '->' this_AISLExpressionList_3= ruleAISLExpressionList kw= ')' ) )
            // InternalAlpha.g:2778:2: (kw= '(' this_AIndexList_1= ruleAIndexList kw= '->' this_AISLExpressionList_3= ruleAISLExpressionList kw= ')' )
            {
            // InternalAlpha.g:2778:2: (kw= '(' this_AIndexList_1= ruleAIndexList kw= '->' this_AISLExpressionList_3= ruleAISLExpressionList kw= ')' )
            // InternalAlpha.g:2779:3: kw= '(' this_AIndexList_1= ruleAIndexList kw= '->' this_AISLExpressionList_3= ruleAISLExpressionList kw= ')'
            {
            kw=(Token)match(input,16,FOLLOW_49); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAAlphaFunctionAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAAlphaFunctionAccess().getAIndexListParserRuleCall_1());
            		
            pushFollow(FOLLOW_29);
            this_AIndexList_1=ruleAIndexList();

            state._fsp--;


            			current.merge(this_AIndexList_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,36,FOLLOW_50); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAAlphaFunctionAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		

            			newCompositeNode(grammarAccess.getAAlphaFunctionAccess().getAISLExpressionListParserRuleCall_3());
            		
            pushFollow(FOLLOW_9);
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
    // InternalAlpha.g:2818:1: entryRuleAISLBasicRelation returns [String current=null] : iv_ruleAISLBasicRelation= ruleAISLBasicRelation EOF ;
    public final String entryRuleAISLBasicRelation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLBasicRelation = null;


        try {
            // InternalAlpha.g:2818:57: (iv_ruleAISLBasicRelation= ruleAISLBasicRelation EOF )
            // InternalAlpha.g:2819:2: iv_ruleAISLBasicRelation= ruleAISLBasicRelation EOF
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
    // InternalAlpha.g:2825:1: ruleAISLBasicRelation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_5= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_8= ruleAISLString ) ;
    public final AntlrDatatypeRuleToken ruleAISLBasicRelation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AISLExpressionList_1 = null;

        AntlrDatatypeRuleToken this_AISLExpressionList_5 = null;

        AntlrDatatypeRuleToken this_AISLString_8 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2831:2: ( (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_5= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_8= ruleAISLString ) )
            // InternalAlpha.g:2832:2: (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_5= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_8= ruleAISLString )
            {
            // InternalAlpha.g:2832:2: (kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_5= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_8= ruleAISLString )
            // InternalAlpha.g:2833:3: kw= '[' this_AISLExpressionList_1= ruleAISLExpressionList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_5= ruleAISLExpressionList kw= ']' kw= ':' this_AISLString_8= ruleAISLString
            {
            kw=(Token)match(input,37,FOLLOW_32); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAISLBasicRelationAccess().getAISLExpressionListParserRuleCall_1());
            		
            pushFollow(FOLLOW_45);
            this_AISLExpressionList_1=ruleAISLExpressionList();

            state._fsp--;


            			current.merge(this_AISLExpressionList_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,39,FOLLOW_29); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getRightSquareBracketKeyword_2());
            		
            kw=(Token)match(input,36,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            kw=(Token)match(input,37,FOLLOW_32); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getLeftSquareBracketKeyword_4());
            		

            			newCompositeNode(grammarAccess.getAISLBasicRelationAccess().getAISLExpressionListParserRuleCall_5());
            		
            pushFollow(FOLLOW_45);
            this_AISLExpressionList_5=ruleAISLExpressionList();

            state._fsp--;


            			current.merge(this_AISLExpressionList_5);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,39,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLBasicRelationAccess().getRightSquareBracketKeyword_6());
            		
            kw=(Token)match(input,33,FOLLOW_46); 

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
    // InternalAlpha.g:2897:1: entryRuleAISLWrappedBasicRelation returns [String current=null] : iv_ruleAISLWrappedBasicRelation= ruleAISLWrappedBasicRelation EOF ;
    public final String entryRuleAISLWrappedBasicRelation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLWrappedBasicRelation = null;


        try {
            // InternalAlpha.g:2897:64: (iv_ruleAISLWrappedBasicRelation= ruleAISLWrappedBasicRelation EOF )
            // InternalAlpha.g:2898:2: iv_ruleAISLWrappedBasicRelation= ruleAISLWrappedBasicRelation EOF
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
    // InternalAlpha.g:2904:1: ruleAISLWrappedBasicRelation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= '[' this_AIndexList_2= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_6= ruleAISLExpressionList kw= ']' kw= ']' kw= '->' kw= '[' this_AISLExpressionList_11= ruleAISLExpressionList kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleAISLWrappedBasicRelation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AIndexList_2 = null;

        AntlrDatatypeRuleToken this_AISLExpressionList_6 = null;

        AntlrDatatypeRuleToken this_AISLExpressionList_11 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2910:2: ( (kw= '[' kw= '[' this_AIndexList_2= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_6= ruleAISLExpressionList kw= ']' kw= ']' kw= '->' kw= '[' this_AISLExpressionList_11= ruleAISLExpressionList kw= ']' ) )
            // InternalAlpha.g:2911:2: (kw= '[' kw= '[' this_AIndexList_2= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_6= ruleAISLExpressionList kw= ']' kw= ']' kw= '->' kw= '[' this_AISLExpressionList_11= ruleAISLExpressionList kw= ']' )
            {
            // InternalAlpha.g:2911:2: (kw= '[' kw= '[' this_AIndexList_2= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_6= ruleAISLExpressionList kw= ']' kw= ']' kw= '->' kw= '[' this_AISLExpressionList_11= ruleAISLExpressionList kw= ']' )
            // InternalAlpha.g:2912:3: kw= '[' kw= '[' this_AIndexList_2= ruleAIndexList kw= ']' kw= '->' kw= '[' this_AISLExpressionList_6= ruleAISLExpressionList kw= ']' kw= ']' kw= '->' kw= '[' this_AISLExpressionList_11= ruleAISLExpressionList kw= ']'
            {
            kw=(Token)match(input,37,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getLeftSquareBracketKeyword_0());
            		
            kw=(Token)match(input,37,FOLLOW_44); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getLeftSquareBracketKeyword_1());
            		

            			newCompositeNode(grammarAccess.getAISLWrappedBasicRelationAccess().getAIndexListParserRuleCall_2());
            		
            pushFollow(FOLLOW_45);
            this_AIndexList_2=ruleAIndexList();

            state._fsp--;


            			current.merge(this_AIndexList_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,39,FOLLOW_29); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getRightSquareBracketKeyword_3());
            		
            kw=(Token)match(input,36,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            kw=(Token)match(input,37,FOLLOW_32); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getLeftSquareBracketKeyword_5());
            		

            			newCompositeNode(grammarAccess.getAISLWrappedBasicRelationAccess().getAISLExpressionListParserRuleCall_6());
            		
            pushFollow(FOLLOW_45);
            this_AISLExpressionList_6=ruleAISLExpressionList();

            state._fsp--;


            			current.merge(this_AISLExpressionList_6);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,39,FOLLOW_45); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getRightSquareBracketKeyword_7());
            		
            kw=(Token)match(input,39,FOLLOW_29); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getRightSquareBracketKeyword_8());
            		
            kw=(Token)match(input,36,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getHyphenMinusGreaterThanSignKeyword_9());
            		
            kw=(Token)match(input,37,FOLLOW_32); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAISLWrappedBasicRelationAccess().getLeftSquareBracketKeyword_10());
            		

            			newCompositeNode(grammarAccess.getAISLWrappedBasicRelationAccess().getAISLExpressionListParserRuleCall_11());
            		
            pushFollow(FOLLOW_45);
            this_AISLExpressionList_11=ruleAISLExpressionList();

            state._fsp--;


            			current.merge(this_AISLExpressionList_11);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,39,FOLLOW_2); 

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
    // InternalAlpha.g:2996:1: entryRuleAISLFuzzyExpression returns [String current=null] : iv_ruleAISLFuzzyExpression= ruleAISLFuzzyExpression EOF ;
    public final String entryRuleAISLFuzzyExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAISLFuzzyExpression = null;


        try {
            // InternalAlpha.g:2996:59: (iv_ruleAISLFuzzyExpression= ruleAISLFuzzyExpression EOF )
            // InternalAlpha.g:2997:2: iv_ruleAISLFuzzyExpression= ruleAISLFuzzyExpression EOF
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
    // InternalAlpha.g:3003:1: ruleAISLFuzzyExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '[' | kw= ']' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_10= RULE_WS )+ ;
    public final AntlrDatatypeRuleToken ruleAISLFuzzyExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token kw=null;
        Token this_WS_10=null;
        AntlrDatatypeRuleToken this_IndexName_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3009:2: ( (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '[' | kw= ']' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_10= RULE_WS )+ )
            // InternalAlpha.g:3010:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '[' | kw= ']' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_10= RULE_WS )+
            {
            // InternalAlpha.g:3010:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | kw= '[' | kw= ']' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | this_WS_10= RULE_WS )+
            int cnt45=0;
            loop45:
            do {
                int alt45=12;
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
                case 37:
                    {
                    alt45=3;
                    }
                    break;
                case 39:
                    {
                    alt45=4;
                    }
                    break;
                case 14:
                    {
                    alt45=5;
                    }
                    break;
                case 43:
                    {
                    alt45=6;
                    }
                    break;
                case 44:
                    {
                    alt45=7;
                    }
                    break;
                case 45:
                    {
                    alt45=8;
                    }
                    break;
                case 46:
                    {
                    alt45=9;
                    }
                    break;
                case 47:
                    {
                    alt45=10;
                    }
                    break;
                case RULE_WS:
                    {
                    alt45=11;
                    }
                    break;

                }

                switch (alt45) {
            	case 1 :
            	    // InternalAlpha.g:3011:3: this_IndexName_0= ruleIndexName
            	    {

            	    			newCompositeNode(grammarAccess.getAISLFuzzyExpressionAccess().getIndexNameParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_51);
            	    this_IndexName_0=ruleIndexName();

            	    state._fsp--;


            	    			current.merge(this_IndexName_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalAlpha.g:3022:3: this_INT_1= RULE_INT
            	    {
            	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_51); 

            	    			current.merge(this_INT_1);
            	    		

            	    			newLeafNode(this_INT_1, grammarAccess.getAISLFuzzyExpressionAccess().getINTTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalAlpha.g:3030:3: kw= '['
            	    {
            	    kw=(Token)match(input,37,FOLLOW_51); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getLeftSquareBracketKeyword_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalAlpha.g:3036:3: kw= ']'
            	    {
            	    kw=(Token)match(input,39,FOLLOW_51); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getRightSquareBracketKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalAlpha.g:3042:3: kw= '='
            	    {
            	    kw=(Token)match(input,14,FOLLOW_51); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getEqualsSignKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalAlpha.g:3048:3: kw= '+'
            	    {
            	    kw=(Token)match(input,43,FOLLOW_51); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getPlusSignKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalAlpha.g:3054:3: kw= '-'
            	    {
            	    kw=(Token)match(input,44,FOLLOW_51); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getHyphenMinusKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalAlpha.g:3060:3: kw= '*'
            	    {
            	    kw=(Token)match(input,45,FOLLOW_51); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getAsteriskKeyword_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalAlpha.g:3066:3: kw= '/'
            	    {
            	    kw=(Token)match(input,46,FOLLOW_51); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getSolidusKeyword_8());
            	    		

            	    }
            	    break;
            	case 10 :
            	    // InternalAlpha.g:3072:3: kw= '%'
            	    {
            	    kw=(Token)match(input,47,FOLLOW_51); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAISLFuzzyExpressionAccess().getPercentSignKeyword_9());
            	    		

            	    }
            	    break;
            	case 11 :
            	    // InternalAlpha.g:3078:3: this_WS_10= RULE_WS
            	    {
            	    this_WS_10=(Token)match(input,RULE_WS,FOLLOW_51); 

            	    			current.merge(this_WS_10);
            	    		

            	    			newLeafNode(this_WS_10, grammarAccess.getAISLFuzzyExpressionAccess().getWSTerminalRuleCall_10());
            	    		

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
    // $ANTLR end "ruleAISLFuzzyExpression"


    // $ANTLR start "entryRuleStandardEquation"
    // InternalAlpha.g:3089:1: entryRuleStandardEquation returns [EObject current=null] : iv_ruleStandardEquation= ruleStandardEquation EOF ;
    public final EObject entryRuleStandardEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardEquation = null;


        try {
            // InternalAlpha.g:3089:57: (iv_ruleStandardEquation= ruleStandardEquation EOF )
            // InternalAlpha.g:3090:2: iv_ruleStandardEquation= ruleStandardEquation EOF
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
    // InternalAlpha.g:3096:1: ruleStandardEquation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )? otherlv_6= '=' ( (lv_expr_7_0= ruleAlphaExpression ) ) otherlv_8= ';' ) ;
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
            // InternalAlpha.g:3102:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )? otherlv_6= '=' ( (lv_expr_7_0= ruleAlphaExpression ) ) otherlv_8= ';' ) )
            // InternalAlpha.g:3103:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )? otherlv_6= '=' ( (lv_expr_7_0= ruleAlphaExpression ) ) otherlv_8= ';' )
            {
            // InternalAlpha.g:3103:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )? otherlv_6= '=' ( (lv_expr_7_0= ruleAlphaExpression ) ) otherlv_8= ';' )
            // InternalAlpha.g:3104:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )? otherlv_6= '=' ( (lv_expr_7_0= ruleAlphaExpression ) ) otherlv_8= ';'
            {
            // InternalAlpha.g:3104:3: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:3105:4: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:3105:4: (otherlv_0= RULE_ID )
            // InternalAlpha.g:3106:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStandardEquationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_52); 

            					newLeafNode(otherlv_0, grammarAccess.getStandardEquationAccess().getVariableVariableCrossReference_0_0());
            				

            }


            }

            // InternalAlpha.g:3117:3: (otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==37) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAlpha.g:3118:4: otherlv_1= '[' ( (lv_indexNames_2_0= ruleIndexName ) ) (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )* otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getStandardEquationAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAlpha.g:3122:4: ( (lv_indexNames_2_0= ruleIndexName ) )
                    // InternalAlpha.g:3123:5: (lv_indexNames_2_0= ruleIndexName )
                    {
                    // InternalAlpha.g:3123:5: (lv_indexNames_2_0= ruleIndexName )
                    // InternalAlpha.g:3124:6: lv_indexNames_2_0= ruleIndexName
                    {

                    						newCompositeNode(grammarAccess.getStandardEquationAccess().getIndexNamesIndexNameParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    // InternalAlpha.g:3141:4: (otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==38) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalAlpha.g:3142:5: otherlv_3= ',' ( (lv_indexNames_4_0= ruleIndexName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,38,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getStandardEquationAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalAlpha.g:3146:5: ( (lv_indexNames_4_0= ruleIndexName ) )
                    	    // InternalAlpha.g:3147:6: (lv_indexNames_4_0= ruleIndexName )
                    	    {
                    	    // InternalAlpha.g:3147:6: (lv_indexNames_4_0= ruleIndexName )
                    	    // InternalAlpha.g:3148:7: lv_indexNames_4_0= ruleIndexName
                    	    {

                    	    							newCompositeNode(grammarAccess.getStandardEquationAccess().getIndexNamesIndexNameParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
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
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getStandardEquationAccess().getRightSquareBracketKeyword_1_3());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getStandardEquationAccess().getEqualsSignKeyword_2());
            		
            // InternalAlpha.g:3175:3: ( (lv_expr_7_0= ruleAlphaExpression ) )
            // InternalAlpha.g:3176:4: (lv_expr_7_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:3176:4: (lv_expr_7_0= ruleAlphaExpression )
            // InternalAlpha.g:3177:5: lv_expr_7_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getStandardEquationAccess().getExprAlphaExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_53);
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
    // InternalAlpha.g:3202:1: entryRuleUseEquation returns [EObject current=null] : iv_ruleUseEquation= ruleUseEquation EOF ;
    public final EObject entryRuleUseEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseEquation = null;


        try {
            // InternalAlpha.g:3202:52: (iv_ruleUseEquation= ruleUseEquation EOF )
            // InternalAlpha.g:3203:2: iv_ruleUseEquation= ruleUseEquation EOF
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
    // InternalAlpha.g:3209:1: ruleUseEquation returns [EObject current=null] : ( ( (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) )? (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )? otherlv_9= '(' ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )? otherlv_13= ')' otherlv_14= '=' ( ( ruleQualifiedName ) ) ( (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation ) ) otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' ) ;
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
            // InternalAlpha.g:3215:2: ( ( ( (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) )? (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )? otherlv_9= '(' ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )? otherlv_13= ')' otherlv_14= '=' ( ( ruleQualifiedName ) ) ( (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation ) ) otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' ) )
            // InternalAlpha.g:3216:2: ( ( (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) )? (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )? otherlv_9= '(' ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )? otherlv_13= ')' otherlv_14= '=' ( ( ruleQualifiedName ) ) ( (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation ) ) otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' )
            {
            // InternalAlpha.g:3216:2: ( ( (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) )? (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )? otherlv_9= '(' ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )? otherlv_13= ')' otherlv_14= '=' ( ( ruleQualifiedName ) ) ( (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation ) ) otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' )
            // InternalAlpha.g:3217:3: ( (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) )? (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )? otherlv_9= '(' ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )? otherlv_13= ')' otherlv_14= '=' ( ( ruleQualifiedName ) ) ( (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation ) ) otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';'
            {
            // InternalAlpha.g:3217:3: ( (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) )? (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==27||LA52_0==33||LA52_0==56) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAlpha.g:3218:4: (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) )? (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )? otherlv_8= ':'
                    {
                    // InternalAlpha.g:3218:4: (otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==27) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalAlpha.g:3219:5: otherlv_0= 'over' ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) )
                            {
                            otherlv_0=(Token)match(input,27,FOLLOW_19); 

                            					newLeafNode(otherlv_0, grammarAccess.getUseEquationAccess().getOverKeyword_0_0_0());
                            				
                            // InternalAlpha.g:3223:5: ( (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression ) )
                            // InternalAlpha.g:3224:6: (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression )
                            {
                            // InternalAlpha.g:3224:6: (lv_instantiationDomainExpr_1_0= ruleCalculatorExpression )
                            // InternalAlpha.g:3225:7: lv_instantiationDomainExpr_1_0= ruleCalculatorExpression
                            {

                            							newCompositeNode(grammarAccess.getUseEquationAccess().getInstantiationDomainExprCalculatorExpressionParserRuleCall_0_0_1_0());
                            						
                            pushFollow(FOLLOW_54);
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

                    // InternalAlpha.g:3243:4: (otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )? )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==56) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalAlpha.g:3244:5: otherlv_2= 'with' (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )?
                            {
                            otherlv_2=(Token)match(input,56,FOLLOW_55); 

                            					newLeafNode(otherlv_2, grammarAccess.getUseEquationAccess().getWithKeyword_0_1_0());
                            				
                            // InternalAlpha.g:3248:5: (otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']' )?
                            int alt50=2;
                            int LA50_0 = input.LA(1);

                            if ( (LA50_0==37) ) {
                                alt50=1;
                            }
                            switch (alt50) {
                                case 1 :
                                    // InternalAlpha.g:3249:6: otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleIndexName ) ) (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )* otherlv_7= ']'
                                    {
                                    otherlv_3=(Token)match(input,37,FOLLOW_5); 

                                    						newLeafNode(otherlv_3, grammarAccess.getUseEquationAccess().getLeftSquareBracketKeyword_0_1_1_0());
                                    					
                                    // InternalAlpha.g:3253:6: ( (lv_subsystemDims_4_0= ruleIndexName ) )
                                    // InternalAlpha.g:3254:7: (lv_subsystemDims_4_0= ruleIndexName )
                                    {
                                    // InternalAlpha.g:3254:7: (lv_subsystemDims_4_0= ruleIndexName )
                                    // InternalAlpha.g:3255:8: lv_subsystemDims_4_0= ruleIndexName
                                    {

                                    								newCompositeNode(grammarAccess.getUseEquationAccess().getSubsystemDimsIndexNameParserRuleCall_0_1_1_1_0());
                                    							
                                    pushFollow(FOLLOW_33);
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

                                    // InternalAlpha.g:3272:6: (otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) ) )*
                                    loop49:
                                    do {
                                        int alt49=2;
                                        int LA49_0 = input.LA(1);

                                        if ( (LA49_0==38) ) {
                                            alt49=1;
                                        }


                                        switch (alt49) {
                                    	case 1 :
                                    	    // InternalAlpha.g:3273:7: otherlv_5= ',' ( (lv_subsystemDims_6_0= ruleIndexName ) )
                                    	    {
                                    	    otherlv_5=(Token)match(input,38,FOLLOW_5); 

                                    	    							newLeafNode(otherlv_5, grammarAccess.getUseEquationAccess().getCommaKeyword_0_1_1_2_0());
                                    	    						
                                    	    // InternalAlpha.g:3277:7: ( (lv_subsystemDims_6_0= ruleIndexName ) )
                                    	    // InternalAlpha.g:3278:8: (lv_subsystemDims_6_0= ruleIndexName )
                                    	    {
                                    	    // InternalAlpha.g:3278:8: (lv_subsystemDims_6_0= ruleIndexName )
                                    	    // InternalAlpha.g:3279:9: lv_subsystemDims_6_0= ruleIndexName
                                    	    {

                                    	    									newCompositeNode(grammarAccess.getUseEquationAccess().getSubsystemDimsIndexNameParserRuleCall_0_1_1_2_1_0());
                                    	    								
                                    	    pushFollow(FOLLOW_33);
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
                                    	    break loop49;
                                        }
                                    } while (true);

                                    otherlv_7=(Token)match(input,39,FOLLOW_26); 

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

            otherlv_9=(Token)match(input,16,FOLLOW_56); 

            			newLeafNode(otherlv_9, grammarAccess.getUseEquationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:3312:3: ( ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_INT)||(LA54_0>=RULE_BOOLEAN && LA54_0<=RULE_FLOAT)||LA54_0==16||LA54_0==20||LA54_0==37||LA54_0==40||(LA54_0>=43 && LA54_0<=45)||(LA54_0>=48 && LA54_0<=49)||LA54_0==57||(LA54_0>=59 && LA54_0<=60)||(LA54_0>=62 && LA54_0<=66)||(LA54_0>=68 && LA54_0<=72)||LA54_0==74) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAlpha.g:3313:4: ( (lv_outputExprs_10_0= ruleAlphaExpression ) ) (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )*
                    {
                    // InternalAlpha.g:3313:4: ( (lv_outputExprs_10_0= ruleAlphaExpression ) )
                    // InternalAlpha.g:3314:5: (lv_outputExprs_10_0= ruleAlphaExpression )
                    {
                    // InternalAlpha.g:3314:5: (lv_outputExprs_10_0= ruleAlphaExpression )
                    // InternalAlpha.g:3315:6: lv_outputExprs_10_0= ruleAlphaExpression
                    {

                    						newCompositeNode(grammarAccess.getUseEquationAccess().getOutputExprsAlphaExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_57);
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

                    // InternalAlpha.g:3332:4: (otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==38) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalAlpha.g:3333:5: otherlv_11= ',' ( (lv_outputExprs_12_0= ruleAlphaExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,38,FOLLOW_21); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getUseEquationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlpha.g:3337:5: ( (lv_outputExprs_12_0= ruleAlphaExpression ) )
                    	    // InternalAlpha.g:3338:6: (lv_outputExprs_12_0= ruleAlphaExpression )
                    	    {
                    	    // InternalAlpha.g:3338:6: (lv_outputExprs_12_0= ruleAlphaExpression )
                    	    // InternalAlpha.g:3339:7: lv_outputExprs_12_0= ruleAlphaExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseEquationAccess().getOutputExprsAlphaExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_57);
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
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_13, grammarAccess.getUseEquationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_14=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getUseEquationAccess().getEqualsSignKeyword_4());
            		
            // InternalAlpha.g:3366:3: ( ( ruleQualifiedName ) )
            // InternalAlpha.g:3367:4: ( ruleQualifiedName )
            {
            // InternalAlpha.g:3367:4: ( ruleQualifiedName )
            // InternalAlpha.g:3368:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseEquationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getUseEquationAccess().getSystemAlphaSystemCrossReference_5_0());
            				
            pushFollow(FOLLOW_37);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:3382:3: ( (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:3383:4: (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:3383:4: (lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation )
            // InternalAlpha.g:3384:5: lv_callParamsExpr_16_0= ruleJNIFunctionInArrayNotation
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

            otherlv_17=(Token)match(input,16,FOLLOW_56); 

            			newLeafNode(otherlv_17, grammarAccess.getUseEquationAccess().getLeftParenthesisKeyword_7());
            		
            // InternalAlpha.g:3405:3: ( ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_INT)||(LA56_0>=RULE_BOOLEAN && LA56_0<=RULE_FLOAT)||LA56_0==16||LA56_0==20||LA56_0==37||LA56_0==40||(LA56_0>=43 && LA56_0<=45)||(LA56_0>=48 && LA56_0<=49)||LA56_0==57||(LA56_0>=59 && LA56_0<=60)||(LA56_0>=62 && LA56_0<=66)||(LA56_0>=68 && LA56_0<=72)||LA56_0==74) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalAlpha.g:3406:4: ( (lv_inputExprs_18_0= ruleAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )*
                    {
                    // InternalAlpha.g:3406:4: ( (lv_inputExprs_18_0= ruleAlphaExpression ) )
                    // InternalAlpha.g:3407:5: (lv_inputExprs_18_0= ruleAlphaExpression )
                    {
                    // InternalAlpha.g:3407:5: (lv_inputExprs_18_0= ruleAlphaExpression )
                    // InternalAlpha.g:3408:6: lv_inputExprs_18_0= ruleAlphaExpression
                    {

                    						newCompositeNode(grammarAccess.getUseEquationAccess().getInputExprsAlphaExpressionParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_57);
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

                    // InternalAlpha.g:3425:4: (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==38) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalAlpha.g:3426:5: otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAlphaExpression ) )
                    	    {
                    	    otherlv_19=(Token)match(input,38,FOLLOW_21); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getUseEquationAccess().getCommaKeyword_8_1_0());
                    	    				
                    	    // InternalAlpha.g:3430:5: ( (lv_inputExprs_20_0= ruleAlphaExpression ) )
                    	    // InternalAlpha.g:3431:6: (lv_inputExprs_20_0= ruleAlphaExpression )
                    	    {
                    	    // InternalAlpha.g:3431:6: (lv_inputExprs_20_0= ruleAlphaExpression )
                    	    // InternalAlpha.g:3432:7: lv_inputExprs_20_0= ruleAlphaExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseEquationAccess().getInputExprsAlphaExpressionParserRuleCall_8_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_57);
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
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_21=(Token)match(input,17,FOLLOW_53); 

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
    // InternalAlpha.g:3463:1: entryRuleAlphaExpression returns [EObject current=null] : iv_ruleAlphaExpression= ruleAlphaExpression EOF ;
    public final EObject entryRuleAlphaExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaExpression = null;


        try {
            // InternalAlpha.g:3463:56: (iv_ruleAlphaExpression= ruleAlphaExpression EOF )
            // InternalAlpha.g:3464:2: iv_ruleAlphaExpression= ruleAlphaExpression EOF
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
    // InternalAlpha.g:3470:1: ruleAlphaExpression returns [EObject current=null] : (this_IfExpression_0= ruleIfExpression | this_RestrictExpression_1= ruleRestrictExpression | this_AutoRestrictExpression_2= ruleAutoRestrictExpression | this_OrExpression_3= ruleOrExpression ) ;
    public final EObject ruleAlphaExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IfExpression_0 = null;

        EObject this_RestrictExpression_1 = null;

        EObject this_AutoRestrictExpression_2 = null;

        EObject this_OrExpression_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3476:2: ( (this_IfExpression_0= ruleIfExpression | this_RestrictExpression_1= ruleRestrictExpression | this_AutoRestrictExpression_2= ruleAutoRestrictExpression | this_OrExpression_3= ruleOrExpression ) )
            // InternalAlpha.g:3477:2: (this_IfExpression_0= ruleIfExpression | this_RestrictExpression_1= ruleRestrictExpression | this_AutoRestrictExpression_2= ruleAutoRestrictExpression | this_OrExpression_3= ruleOrExpression )
            {
            // InternalAlpha.g:3477:2: (this_IfExpression_0= ruleIfExpression | this_RestrictExpression_1= ruleRestrictExpression | this_AutoRestrictExpression_2= ruleAutoRestrictExpression | this_OrExpression_3= ruleOrExpression )
            int alt57=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt57=1;
                }
                break;
            case 20:
                {
                alt57=2;
                }
                break;
            case 59:
                {
                alt57=3;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_BOOLEAN:
            case RULE_FLOAT:
            case 16:
            case 37:
            case 40:
            case 43:
            case 44:
            case 45:
            case 48:
            case 49:
            case 60:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 74:
                {
                alt57=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalAlpha.g:3478:3: this_IfExpression_0= ruleIfExpression
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
                    // InternalAlpha.g:3487:3: this_RestrictExpression_1= ruleRestrictExpression
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
                    // InternalAlpha.g:3496:3: this_AutoRestrictExpression_2= ruleAutoRestrictExpression
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
                    // InternalAlpha.g:3505:3: this_OrExpression_3= ruleOrExpression
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
    // InternalAlpha.g:3517:1: entryRuleAlphaTerminalExpression returns [EObject current=null] : iv_ruleAlphaTerminalExpression= ruleAlphaTerminalExpression EOF ;
    public final EObject entryRuleAlphaTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaTerminalExpression = null;


        try {
            // InternalAlpha.g:3517:64: (iv_ruleAlphaTerminalExpression= ruleAlphaTerminalExpression EOF )
            // InternalAlpha.g:3518:2: iv_ruleAlphaTerminalExpression= ruleAlphaTerminalExpression EOF
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
    // InternalAlpha.g:3524:1: ruleAlphaTerminalExpression returns [EObject current=null] : ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_ConstantExpression_4= ruleConstantExpression | this_VariableExpression_5= ruleVariableExpression | this_DependenceExpression_6= ruleDependenceExpression | this_FuzzyDependenceExpression_7= ruleFuzzyDependenceExpression | this_IndexExpression_8= ruleIndexExpression | this_FuzzyIndexExpression_9= ruleFuzzyIndexExpression | this_Reductions_10= ruleReductions | this_ConvolutionExpression_11= ruleConvolutionExpression | this_MultiArgExpression_12= ruleMultiArgExpression | this_ExternalMultiArgExpression_13= ruleExternalMultiArgExpression | this_SelectExpression_14= ruleSelectExpression ) ;
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

        EObject this_Reductions_10 = null;

        EObject this_ConvolutionExpression_11 = null;

        EObject this_MultiArgExpression_12 = null;

        EObject this_ExternalMultiArgExpression_13 = null;

        EObject this_SelectExpression_14 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3530:2: ( ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_ConstantExpression_4= ruleConstantExpression | this_VariableExpression_5= ruleVariableExpression | this_DependenceExpression_6= ruleDependenceExpression | this_FuzzyDependenceExpression_7= ruleFuzzyDependenceExpression | this_IndexExpression_8= ruleIndexExpression | this_FuzzyIndexExpression_9= ruleFuzzyIndexExpression | this_Reductions_10= ruleReductions | this_ConvolutionExpression_11= ruleConvolutionExpression | this_MultiArgExpression_12= ruleMultiArgExpression | this_ExternalMultiArgExpression_13= ruleExternalMultiArgExpression | this_SelectExpression_14= ruleSelectExpression ) )
            // InternalAlpha.g:3531:2: ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_ConstantExpression_4= ruleConstantExpression | this_VariableExpression_5= ruleVariableExpression | this_DependenceExpression_6= ruleDependenceExpression | this_FuzzyDependenceExpression_7= ruleFuzzyDependenceExpression | this_IndexExpression_8= ruleIndexExpression | this_FuzzyIndexExpression_9= ruleFuzzyIndexExpression | this_Reductions_10= ruleReductions | this_ConvolutionExpression_11= ruleConvolutionExpression | this_MultiArgExpression_12= ruleMultiArgExpression | this_ExternalMultiArgExpression_13= ruleExternalMultiArgExpression | this_SelectExpression_14= ruleSelectExpression )
            {
            // InternalAlpha.g:3531:2: ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_ConstantExpression_4= ruleConstantExpression | this_VariableExpression_5= ruleVariableExpression | this_DependenceExpression_6= ruleDependenceExpression | this_FuzzyDependenceExpression_7= ruleFuzzyDependenceExpression | this_IndexExpression_8= ruleIndexExpression | this_FuzzyIndexExpression_9= ruleFuzzyIndexExpression | this_Reductions_10= ruleReductions | this_ConvolutionExpression_11= ruleConvolutionExpression | this_MultiArgExpression_12= ruleMultiArgExpression | this_ExternalMultiArgExpression_13= ruleExternalMultiArgExpression | this_SelectExpression_14= ruleSelectExpression )
            int alt58=13;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // InternalAlpha.g:3532:3: (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' )
                    {
                    // InternalAlpha.g:3532:3: (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' )
                    // InternalAlpha.g:3533:4: otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getAlphaTerminalExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getAlphaExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_9);
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
                    // InternalAlpha.g:3551:3: this_CaseExpression_3= ruleCaseExpression
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
                    // InternalAlpha.g:3560:3: this_ConstantExpression_4= ruleConstantExpression
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
                    // InternalAlpha.g:3569:3: this_VariableExpression_5= ruleVariableExpression
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
                    // InternalAlpha.g:3578:3: this_DependenceExpression_6= ruleDependenceExpression
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
                    // InternalAlpha.g:3587:3: this_FuzzyDependenceExpression_7= ruleFuzzyDependenceExpression
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
                    // InternalAlpha.g:3596:3: this_IndexExpression_8= ruleIndexExpression
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
                    // InternalAlpha.g:3605:3: this_FuzzyIndexExpression_9= ruleFuzzyIndexExpression
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
                    // InternalAlpha.g:3614:3: this_Reductions_10= ruleReductions
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getReductionsParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reductions_10=ruleReductions();

                    state._fsp--;


                    			current = this_Reductions_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalAlpha.g:3623:3: this_ConvolutionExpression_11= ruleConvolutionExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getConvolutionExpressionParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConvolutionExpression_11=ruleConvolutionExpression();

                    state._fsp--;


                    			current = this_ConvolutionExpression_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalAlpha.g:3632:3: this_MultiArgExpression_12= ruleMultiArgExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getMultiArgExpressionParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiArgExpression_12=ruleMultiArgExpression();

                    state._fsp--;


                    			current = this_MultiArgExpression_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalAlpha.g:3641:3: this_ExternalMultiArgExpression_13= ruleExternalMultiArgExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getExternalMultiArgExpressionParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalMultiArgExpression_13=ruleExternalMultiArgExpression();

                    state._fsp--;


                    			current = this_ExternalMultiArgExpression_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalAlpha.g:3650:3: this_SelectExpression_14= ruleSelectExpression
                    {

                    			newCompositeNode(grammarAccess.getAlphaTerminalExpressionAccess().getSelectExpressionParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectExpression_14=ruleSelectExpression();

                    state._fsp--;


                    			current = this_SelectExpression_14;
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


    // $ANTLR start "entryRuleReductions"
    // InternalAlpha.g:3662:1: entryRuleReductions returns [EObject current=null] : iv_ruleReductions= ruleReductions EOF ;
    public final EObject entryRuleReductions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReductions = null;


        try {
            // InternalAlpha.g:3662:51: (iv_ruleReductions= ruleReductions EOF )
            // InternalAlpha.g:3663:2: iv_ruleReductions= ruleReductions EOF
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
    // InternalAlpha.g:3669:1: ruleReductions returns [EObject current=null] : (this_ReduceExpression_0= ruleReduceExpression | this_ArgReduceExpression_1= ruleArgReduceExpression | this_ExternalReduceExpression_2= ruleExternalReduceExpression | this_ExternalArgReduceExpression_3= ruleExternalArgReduceExpression | this_FuzzyReduceExpression_4= ruleFuzzyReduceExpression | this_FuzzyArgReduceExpression_5= ruleFuzzyArgReduceExpression | this_ExternalFuzzyReduceExpression_6= ruleExternalFuzzyReduceExpression | this_ExternalFuzzyArgReduceExpression_7= ruleExternalFuzzyArgReduceExpression ) ;
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
            // InternalAlpha.g:3675:2: ( (this_ReduceExpression_0= ruleReduceExpression | this_ArgReduceExpression_1= ruleArgReduceExpression | this_ExternalReduceExpression_2= ruleExternalReduceExpression | this_ExternalArgReduceExpression_3= ruleExternalArgReduceExpression | this_FuzzyReduceExpression_4= ruleFuzzyReduceExpression | this_FuzzyArgReduceExpression_5= ruleFuzzyArgReduceExpression | this_ExternalFuzzyReduceExpression_6= ruleExternalFuzzyReduceExpression | this_ExternalFuzzyArgReduceExpression_7= ruleExternalFuzzyArgReduceExpression ) )
            // InternalAlpha.g:3676:2: (this_ReduceExpression_0= ruleReduceExpression | this_ArgReduceExpression_1= ruleArgReduceExpression | this_ExternalReduceExpression_2= ruleExternalReduceExpression | this_ExternalArgReduceExpression_3= ruleExternalArgReduceExpression | this_FuzzyReduceExpression_4= ruleFuzzyReduceExpression | this_FuzzyArgReduceExpression_5= ruleFuzzyArgReduceExpression | this_ExternalFuzzyReduceExpression_6= ruleExternalFuzzyReduceExpression | this_ExternalFuzzyArgReduceExpression_7= ruleExternalFuzzyArgReduceExpression )
            {
            // InternalAlpha.g:3676:2: (this_ReduceExpression_0= ruleReduceExpression | this_ArgReduceExpression_1= ruleArgReduceExpression | this_ExternalReduceExpression_2= ruleExternalReduceExpression | this_ExternalArgReduceExpression_3= ruleExternalArgReduceExpression | this_FuzzyReduceExpression_4= ruleFuzzyReduceExpression | this_FuzzyArgReduceExpression_5= ruleFuzzyArgReduceExpression | this_ExternalFuzzyReduceExpression_6= ruleExternalFuzzyReduceExpression | this_ExternalFuzzyArgReduceExpression_7= ruleExternalFuzzyArgReduceExpression )
            int alt59=8;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // InternalAlpha.g:3677:3: this_ReduceExpression_0= ruleReduceExpression
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
                    // InternalAlpha.g:3686:3: this_ArgReduceExpression_1= ruleArgReduceExpression
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
                    // InternalAlpha.g:3695:3: this_ExternalReduceExpression_2= ruleExternalReduceExpression
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
                    // InternalAlpha.g:3704:3: this_ExternalArgReduceExpression_3= ruleExternalArgReduceExpression
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
                    // InternalAlpha.g:3713:3: this_FuzzyReduceExpression_4= ruleFuzzyReduceExpression
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
                    // InternalAlpha.g:3722:3: this_FuzzyArgReduceExpression_5= ruleFuzzyArgReduceExpression
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
                    // InternalAlpha.g:3731:3: this_ExternalFuzzyReduceExpression_6= ruleExternalFuzzyReduceExpression
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
                    // InternalAlpha.g:3740:3: this_ExternalFuzzyArgReduceExpression_7= ruleExternalFuzzyArgReduceExpression
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
    // InternalAlpha.g:3752:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // InternalAlpha.g:3752:53: (iv_ruleIfExpression= ruleIfExpression EOF )
            // InternalAlpha.g:3753:2: iv_ruleIfExpression= ruleIfExpression EOF
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
    // InternalAlpha.g:3759:1: ruleIfExpression returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condExpr_1_0= ruleAlphaExpression ) ) otherlv_2= 'then' ( (lv_thenExpr_3_0= ruleAlphaExpression ) ) otherlv_4= 'else' ( (lv_elseExpr_5_0= ruleAlphaExpression ) ) ) ;
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
            // InternalAlpha.g:3765:2: ( (otherlv_0= 'if' ( (lv_condExpr_1_0= ruleAlphaExpression ) ) otherlv_2= 'then' ( (lv_thenExpr_3_0= ruleAlphaExpression ) ) otherlv_4= 'else' ( (lv_elseExpr_5_0= ruleAlphaExpression ) ) ) )
            // InternalAlpha.g:3766:2: (otherlv_0= 'if' ( (lv_condExpr_1_0= ruleAlphaExpression ) ) otherlv_2= 'then' ( (lv_thenExpr_3_0= ruleAlphaExpression ) ) otherlv_4= 'else' ( (lv_elseExpr_5_0= ruleAlphaExpression ) ) )
            {
            // InternalAlpha.g:3766:2: (otherlv_0= 'if' ( (lv_condExpr_1_0= ruleAlphaExpression ) ) otherlv_2= 'then' ( (lv_thenExpr_3_0= ruleAlphaExpression ) ) otherlv_4= 'else' ( (lv_elseExpr_5_0= ruleAlphaExpression ) ) )
            // InternalAlpha.g:3767:3: otherlv_0= 'if' ( (lv_condExpr_1_0= ruleAlphaExpression ) ) otherlv_2= 'then' ( (lv_thenExpr_3_0= ruleAlphaExpression ) ) otherlv_4= 'else' ( (lv_elseExpr_5_0= ruleAlphaExpression ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getIfExpressionAccess().getIfKeyword_0());
            		
            // InternalAlpha.g:3771:3: ( (lv_condExpr_1_0= ruleAlphaExpression ) )
            // InternalAlpha.g:3772:4: (lv_condExpr_1_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:3772:4: (lv_condExpr_1_0= ruleAlphaExpression )
            // InternalAlpha.g:3773:5: lv_condExpr_1_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getIfExpressionAccess().getCondExprAlphaExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_58);
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

            otherlv_2=(Token)match(input,58,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getIfExpressionAccess().getThenKeyword_2());
            		
            // InternalAlpha.g:3794:3: ( (lv_thenExpr_3_0= ruleAlphaExpression ) )
            // InternalAlpha.g:3795:4: (lv_thenExpr_3_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:3795:4: (lv_thenExpr_3_0= ruleAlphaExpression )
            // InternalAlpha.g:3796:5: lv_thenExpr_3_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getIfExpressionAccess().getThenExprAlphaExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_59);
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

            otherlv_4=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getIfExpressionAccess().getElseKeyword_4());
            		
            // InternalAlpha.g:3817:3: ( (lv_elseExpr_5_0= ruleAlphaExpression ) )
            // InternalAlpha.g:3818:4: (lv_elseExpr_5_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:3818:4: (lv_elseExpr_5_0= ruleAlphaExpression )
            // InternalAlpha.g:3819:5: lv_elseExpr_5_0= ruleAlphaExpression
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
    // InternalAlpha.g:3840:1: entryRuleRestrictExpression returns [EObject current=null] : iv_ruleRestrictExpression= ruleRestrictExpression EOF ;
    public final EObject entryRuleRestrictExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictExpression = null;


        try {
            // InternalAlpha.g:3840:59: (iv_ruleRestrictExpression= ruleRestrictExpression EOF )
            // InternalAlpha.g:3841:2: iv_ruleRestrictExpression= ruleRestrictExpression EOF
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
    // InternalAlpha.g:3847:1: ruleRestrictExpression returns [EObject current=null] : ( ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) | (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) ) ) ;
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
            // InternalAlpha.g:3853:2: ( ( ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) | (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) ) ) )
            // InternalAlpha.g:3854:2: ( ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) | (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) ) )
            {
            // InternalAlpha.g:3854:2: ( ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) | (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) ) )
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // InternalAlpha.g:3855:3: ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) )
                    {
                    // InternalAlpha.g:3855:3: ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) )
                    // InternalAlpha.g:3856:4: ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) )
                    {
                    // InternalAlpha.g:3856:4: ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) )
                    // InternalAlpha.g:3857:5: ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) )
                    {
                    // InternalAlpha.g:3857:5: ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) )
                    // InternalAlpha.g:3858:6: (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation )
                    {
                    // InternalAlpha.g:3858:6: (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation )
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==20) ) {
                        int LA60_1 = input.LA(2);

                        if ( (LA60_1==33) ) {
                            alt60=2;
                        }
                        else if ( (LA60_1==37) ) {
                            alt60=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 60, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 0, input);

                        throw nvae;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalAlpha.g:3859:7: lv_domainExpr_0_1= ruleJNIDomain
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
                            // InternalAlpha.g:3875:7: lv_domainExpr_0_2= ruleJNIDomainInArrayNotation
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

                    otherlv_1=(Token)match(input,33,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getRestrictExpressionAccess().getColonKeyword_0_1());
                    			
                    // InternalAlpha.g:3897:4: ( (lv_expr_2_0= ruleAlphaExpression ) )
                    // InternalAlpha.g:3898:5: (lv_expr_2_0= ruleAlphaExpression )
                    {
                    // InternalAlpha.g:3898:5: (lv_expr_2_0= ruleAlphaExpression )
                    // InternalAlpha.g:3899:6: lv_expr_2_0= ruleAlphaExpression
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
                    // InternalAlpha.g:3918:3: (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) )
                    {
                    // InternalAlpha.g:3918:3: (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) )
                    // InternalAlpha.g:3919:4: otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getRestrictExpressionAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalAlpha.g:3923:4: ( (lv_domainExpr_4_0= ruleCalculatorExpression ) )
                    // InternalAlpha.g:3924:5: (lv_domainExpr_4_0= ruleCalculatorExpression )
                    {
                    // InternalAlpha.g:3924:5: (lv_domainExpr_4_0= ruleCalculatorExpression )
                    // InternalAlpha.g:3925:6: lv_domainExpr_4_0= ruleCalculatorExpression
                    {

                    						newCompositeNode(grammarAccess.getRestrictExpressionAccess().getDomainExprCalculatorExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_31);
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

                    otherlv_5=(Token)match(input,21,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getRestrictExpressionAccess().getRightCurlyBracketKeyword_1_2());
                    			
                    otherlv_6=(Token)match(input,33,FOLLOW_21); 

                    				newLeafNode(otherlv_6, grammarAccess.getRestrictExpressionAccess().getColonKeyword_1_3());
                    			
                    // InternalAlpha.g:3950:4: ( (lv_expr_7_0= ruleAlphaExpression ) )
                    // InternalAlpha.g:3951:5: (lv_expr_7_0= ruleAlphaExpression )
                    {
                    // InternalAlpha.g:3951:5: (lv_expr_7_0= ruleAlphaExpression )
                    // InternalAlpha.g:3952:6: lv_expr_7_0= ruleAlphaExpression
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
    // InternalAlpha.g:3974:1: entryRuleAutoRestrictExpression returns [EObject current=null] : iv_ruleAutoRestrictExpression= ruleAutoRestrictExpression EOF ;
    public final EObject entryRuleAutoRestrictExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoRestrictExpression = null;


        try {
            // InternalAlpha.g:3974:63: (iv_ruleAutoRestrictExpression= ruleAutoRestrictExpression EOF )
            // InternalAlpha.g:3975:2: iv_ruleAutoRestrictExpression= ruleAutoRestrictExpression EOF
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
    // InternalAlpha.g:3981:1: ruleAutoRestrictExpression returns [EObject current=null] : (otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) ;
    public final EObject ruleAutoRestrictExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3987:2: ( (otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) )
            // InternalAlpha.g:3988:2: (otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) )
            {
            // InternalAlpha.g:3988:2: (otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) )
            // InternalAlpha.g:3989:3: otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAutoRestrictExpressionAccess().getAutoKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAutoRestrictExpressionAccess().getColonKeyword_1());
            		
            // InternalAlpha.g:3997:3: ( (lv_expr_2_0= ruleAlphaExpression ) )
            // InternalAlpha.g:3998:4: (lv_expr_2_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:3998:4: (lv_expr_2_0= ruleAlphaExpression )
            // InternalAlpha.g:3999:5: lv_expr_2_0= ruleAlphaExpression
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
    // InternalAlpha.g:4020:1: entryRuleCaseExpression returns [EObject current=null] : iv_ruleCaseExpression= ruleCaseExpression EOF ;
    public final EObject entryRuleCaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseExpression = null;


        try {
            // InternalAlpha.g:4020:55: (iv_ruleCaseExpression= ruleCaseExpression EOF )
            // InternalAlpha.g:4021:2: iv_ruleCaseExpression= ruleCaseExpression EOF
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
    // InternalAlpha.g:4027:1: ruleCaseExpression returns [EObject current=null] : (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' ) ;
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
            // InternalAlpha.g:4033:2: ( (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' ) )
            // InternalAlpha.g:4034:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' )
            {
            // InternalAlpha.g:4034:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' )
            // InternalAlpha.g:4035:3: otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getCaseExpressionAccess().getCaseKeyword_0());
            		
            // InternalAlpha.g:4039:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalAlpha.g:4040:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalAlpha.g:4040:4: (lv_name_1_0= RULE_ID )
                    // InternalAlpha.g:4041:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getCaseExpressionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlpha.g:4061:3: ( ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';' )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=RULE_ID && LA63_0<=RULE_INT)||(LA63_0>=RULE_BOOLEAN && LA63_0<=RULE_FLOAT)||LA63_0==16||LA63_0==20||LA63_0==37||LA63_0==40||(LA63_0>=43 && LA63_0<=45)||(LA63_0>=48 && LA63_0<=49)||LA63_0==57||(LA63_0>=59 && LA63_0<=60)||(LA63_0>=62 && LA63_0<=66)||(LA63_0>=68 && LA63_0<=72)||LA63_0==74) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalAlpha.g:4062:4: ( (lv_exprs_3_0= ruleAlphaExpression ) ) otherlv_4= ';'
            	    {
            	    // InternalAlpha.g:4062:4: ( (lv_exprs_3_0= ruleAlphaExpression ) )
            	    // InternalAlpha.g:4063:5: (lv_exprs_3_0= ruleAlphaExpression )
            	    {
            	    // InternalAlpha.g:4063:5: (lv_exprs_3_0= ruleAlphaExpression )
            	    // InternalAlpha.g:4064:6: lv_exprs_3_0= ruleAlphaExpression
            	    {

            	    						newCompositeNode(grammarAccess.getCaseExpressionAccess().getExprsAlphaExpressionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_53);
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

            	    otherlv_4=(Token)match(input,34,FOLLOW_61); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCaseExpressionAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
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
    // InternalAlpha.g:4094:1: entryRuleDependenceExpression returns [EObject current=null] : iv_ruleDependenceExpression= ruleDependenceExpression EOF ;
    public final EObject entryRuleDependenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependenceExpression = null;


        try {
            // InternalAlpha.g:4094:61: (iv_ruleDependenceExpression= ruleDependenceExpression EOF )
            // InternalAlpha.g:4095:2: iv_ruleDependenceExpression= ruleDependenceExpression EOF
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
    // InternalAlpha.g:4101:1: ruleDependenceExpression returns [EObject current=null] : ( ( ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) ) ) | ( ( (lv_expr_5_0= ruleConstantExpression ) ) ( (lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation ) ) ) ) ;
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
            // InternalAlpha.g:4107:2: ( ( ( ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) ) ) | ( ( (lv_expr_5_0= ruleConstantExpression ) ) ( (lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation ) ) ) ) )
            // InternalAlpha.g:4108:2: ( ( ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) ) ) | ( ( (lv_expr_5_0= ruleConstantExpression ) ) ( (lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation ) ) ) )
            {
            // InternalAlpha.g:4108:2: ( ( ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) ) ) | ( ( (lv_expr_5_0= ruleConstantExpression ) ) ( (lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation ) ) ) )
            int alt64=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt64=1;
                }
                break;
            case RULE_ID:
                {
                alt64=2;
                }
                break;
            case RULE_INT:
            case RULE_BOOLEAN:
            case RULE_FLOAT:
                {
                alt64=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalAlpha.g:4109:3: ( ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) )
                    {
                    // InternalAlpha.g:4109:3: ( ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) )
                    // InternalAlpha.g:4110:4: ( (lv_functionExpr_0_0= ruleJNIFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) )
                    {
                    // InternalAlpha.g:4110:4: ( (lv_functionExpr_0_0= ruleJNIFunction ) )
                    // InternalAlpha.g:4111:5: (lv_functionExpr_0_0= ruleJNIFunction )
                    {
                    // InternalAlpha.g:4111:5: (lv_functionExpr_0_0= ruleJNIFunction )
                    // InternalAlpha.g:4112:6: lv_functionExpr_0_0= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getDependenceExpressionAccess().getFunctionExprJNIFunctionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_62);
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

                    otherlv_1=(Token)match(input,61,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getDependenceExpressionAccess().getCommercialAtKeyword_0_1());
                    			
                    // InternalAlpha.g:4133:4: ( (lv_expr_2_0= ruleAlphaTerminalExpression ) )
                    // InternalAlpha.g:4134:5: (lv_expr_2_0= ruleAlphaTerminalExpression )
                    {
                    // InternalAlpha.g:4134:5: (lv_expr_2_0= ruleAlphaTerminalExpression )
                    // InternalAlpha.g:4135:6: lv_expr_2_0= ruleAlphaTerminalExpression
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
                    // InternalAlpha.g:4154:3: ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) ) )
                    {
                    // InternalAlpha.g:4154:3: ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) ) )
                    // InternalAlpha.g:4155:4: ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) )
                    {
                    // InternalAlpha.g:4155:4: ( (lv_expr_3_0= ruleVariableExpression ) )
                    // InternalAlpha.g:4156:5: (lv_expr_3_0= ruleVariableExpression )
                    {
                    // InternalAlpha.g:4156:5: (lv_expr_3_0= ruleVariableExpression )
                    // InternalAlpha.g:4157:6: lv_expr_3_0= ruleVariableExpression
                    {

                    						newCompositeNode(grammarAccess.getDependenceExpressionAccess().getExprVariableExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_37);
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

                    // InternalAlpha.g:4174:4: ( (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation ) )
                    // InternalAlpha.g:4175:5: (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation )
                    {
                    // InternalAlpha.g:4175:5: (lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation )
                    // InternalAlpha.g:4176:6: lv_functionExpr_4_0= ruleJNIFunctionInArrayNotation
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
                    // InternalAlpha.g:4195:3: ( ( (lv_expr_5_0= ruleConstantExpression ) ) ( (lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation ) ) )
                    {
                    // InternalAlpha.g:4195:3: ( ( (lv_expr_5_0= ruleConstantExpression ) ) ( (lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation ) ) )
                    // InternalAlpha.g:4196:4: ( (lv_expr_5_0= ruleConstantExpression ) ) ( (lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation ) )
                    {
                    // InternalAlpha.g:4196:4: ( (lv_expr_5_0= ruleConstantExpression ) )
                    // InternalAlpha.g:4197:5: (lv_expr_5_0= ruleConstantExpression )
                    {
                    // InternalAlpha.g:4197:5: (lv_expr_5_0= ruleConstantExpression )
                    // InternalAlpha.g:4198:6: lv_expr_5_0= ruleConstantExpression
                    {

                    						newCompositeNode(grammarAccess.getDependenceExpressionAccess().getExprConstantExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_37);
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

                    // InternalAlpha.g:4215:4: ( (lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation ) )
                    // InternalAlpha.g:4216:5: (lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation )
                    {
                    // InternalAlpha.g:4216:5: (lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation )
                    // InternalAlpha.g:4217:6: lv_functionExpr_6_0= ruleJNIFunctionInArrayNotation
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
    // InternalAlpha.g:4239:1: entryRuleFuzzyDependenceExpression returns [EObject current=null] : iv_ruleFuzzyDependenceExpression= ruleFuzzyDependenceExpression EOF ;
    public final EObject entryRuleFuzzyDependenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyDependenceExpression = null;


        try {
            // InternalAlpha.g:4239:66: (iv_ruleFuzzyDependenceExpression= ruleFuzzyDependenceExpression EOF )
            // InternalAlpha.g:4240:2: iv_ruleFuzzyDependenceExpression= ruleFuzzyDependenceExpression EOF
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
    // InternalAlpha.g:4246:1: ruleFuzzyDependenceExpression returns [EObject current=null] : ( ( ( (lv_fuzzyFunction_0_0= ruleFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation ) ) ) ) ;
    public final EObject ruleFuzzyDependenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_fuzzyFunction_0_0 = null;

        EObject lv_expr_2_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_fuzzyFunction_4_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4252:2: ( ( ( ( (lv_fuzzyFunction_0_0= ruleFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation ) ) ) ) )
            // InternalAlpha.g:4253:2: ( ( ( (lv_fuzzyFunction_0_0= ruleFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation ) ) ) )
            {
            // InternalAlpha.g:4253:2: ( ( ( (lv_fuzzyFunction_0_0= ruleFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) ) | ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation ) ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==16) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_ID) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalAlpha.g:4254:3: ( ( (lv_fuzzyFunction_0_0= ruleFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) )
                    {
                    // InternalAlpha.g:4254:3: ( ( (lv_fuzzyFunction_0_0= ruleFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) ) )
                    // InternalAlpha.g:4255:4: ( (lv_fuzzyFunction_0_0= ruleFuzzyFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAlphaTerminalExpression ) )
                    {
                    // InternalAlpha.g:4255:4: ( (lv_fuzzyFunction_0_0= ruleFuzzyFunction ) )
                    // InternalAlpha.g:4256:5: (lv_fuzzyFunction_0_0= ruleFuzzyFunction )
                    {
                    // InternalAlpha.g:4256:5: (lv_fuzzyFunction_0_0= ruleFuzzyFunction )
                    // InternalAlpha.g:4257:6: lv_fuzzyFunction_0_0= ruleFuzzyFunction
                    {

                    						newCompositeNode(grammarAccess.getFuzzyDependenceExpressionAccess().getFuzzyFunctionFuzzyFunctionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_62);
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

                    otherlv_1=(Token)match(input,61,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getFuzzyDependenceExpressionAccess().getCommercialAtKeyword_0_1());
                    			
                    // InternalAlpha.g:4278:4: ( (lv_expr_2_0= ruleAlphaTerminalExpression ) )
                    // InternalAlpha.g:4279:5: (lv_expr_2_0= ruleAlphaTerminalExpression )
                    {
                    // InternalAlpha.g:4279:5: (lv_expr_2_0= ruleAlphaTerminalExpression )
                    // InternalAlpha.g:4280:6: lv_expr_2_0= ruleAlphaTerminalExpression
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
                    // InternalAlpha.g:4299:3: ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation ) ) )
                    {
                    // InternalAlpha.g:4299:3: ( ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation ) ) )
                    // InternalAlpha.g:4300:4: ( (lv_expr_3_0= ruleVariableExpression ) ) ( (lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation ) )
                    {
                    // InternalAlpha.g:4300:4: ( (lv_expr_3_0= ruleVariableExpression ) )
                    // InternalAlpha.g:4301:5: (lv_expr_3_0= ruleVariableExpression )
                    {
                    // InternalAlpha.g:4301:5: (lv_expr_3_0= ruleVariableExpression )
                    // InternalAlpha.g:4302:6: lv_expr_3_0= ruleVariableExpression
                    {

                    						newCompositeNode(grammarAccess.getFuzzyDependenceExpressionAccess().getExprVariableExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_63);
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

                    // InternalAlpha.g:4319:4: ( (lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation ) )
                    // InternalAlpha.g:4320:5: (lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation )
                    {
                    // InternalAlpha.g:4320:5: (lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation )
                    // InternalAlpha.g:4321:6: lv_fuzzyFunction_4_0= ruleFuzzyFunctionInArrayNotation
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
    // InternalAlpha.g:4343:1: entryRuleIndexExpression returns [EObject current=null] : iv_ruleIndexExpression= ruleIndexExpression EOF ;
    public final EObject entryRuleIndexExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexExpression = null;


        try {
            // InternalAlpha.g:4343:56: (iv_ruleIndexExpression= ruleIndexExpression EOF )
            // InternalAlpha.g:4344:2: iv_ruleIndexExpression= ruleIndexExpression EOF
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
    // InternalAlpha.g:4350:1: ruleIndexExpression returns [EObject current=null] : ( (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) ) ) | ( (lv_functionExpr_2_0= ruleJNIFunctionInArrayNotation ) ) ) ;
    public final EObject ruleIndexExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_functionExpr_1_0 = null;

        EObject lv_functionExpr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4356:2: ( ( (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) ) ) | ( (lv_functionExpr_2_0= ruleJNIFunctionInArrayNotation ) ) ) )
            // InternalAlpha.g:4357:2: ( (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) ) ) | ( (lv_functionExpr_2_0= ruleJNIFunctionInArrayNotation ) ) )
            {
            // InternalAlpha.g:4357:2: ( (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) ) ) | ( (lv_functionExpr_2_0= ruleJNIFunctionInArrayNotation ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==62) ) {
                alt66=1;
            }
            else if ( (LA66_0==37) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalAlpha.g:4358:3: (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) ) )
                    {
                    // InternalAlpha.g:4358:3: (otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) ) )
                    // InternalAlpha.g:4359:4: otherlv_0= 'val' ( (lv_functionExpr_1_0= ruleJNIFunction ) )
                    {
                    otherlv_0=(Token)match(input,62,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getIndexExpressionAccess().getValKeyword_0_0());
                    			
                    // InternalAlpha.g:4363:4: ( (lv_functionExpr_1_0= ruleJNIFunction ) )
                    // InternalAlpha.g:4364:5: (lv_functionExpr_1_0= ruleJNIFunction )
                    {
                    // InternalAlpha.g:4364:5: (lv_functionExpr_1_0= ruleJNIFunction )
                    // InternalAlpha.g:4365:6: lv_functionExpr_1_0= ruleJNIFunction
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
                    // InternalAlpha.g:4384:3: ( (lv_functionExpr_2_0= ruleJNIFunctionInArrayNotation ) )
                    {
                    // InternalAlpha.g:4384:3: ( (lv_functionExpr_2_0= ruleJNIFunctionInArrayNotation ) )
                    // InternalAlpha.g:4385:4: (lv_functionExpr_2_0= ruleJNIFunctionInArrayNotation )
                    {
                    // InternalAlpha.g:4385:4: (lv_functionExpr_2_0= ruleJNIFunctionInArrayNotation )
                    // InternalAlpha.g:4386:5: lv_functionExpr_2_0= ruleJNIFunctionInArrayNotation
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
    // InternalAlpha.g:4407:1: entryRuleFuzzyIndexExpression returns [EObject current=null] : iv_ruleFuzzyIndexExpression= ruleFuzzyIndexExpression EOF ;
    public final EObject entryRuleFuzzyIndexExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyIndexExpression = null;


        try {
            // InternalAlpha.g:4407:61: (iv_ruleFuzzyIndexExpression= ruleFuzzyIndexExpression EOF )
            // InternalAlpha.g:4408:2: iv_ruleFuzzyIndexExpression= ruleFuzzyIndexExpression EOF
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
    // InternalAlpha.g:4414:1: ruleFuzzyIndexExpression returns [EObject current=null] : ( (otherlv_0= 'val' ( (lv_fuzzyFunction_1_0= ruleFuzzyFunction ) ) ) | ( (lv_fuzzyFunction_2_0= ruleFuzzyFunctionInArrayNotation ) ) ) ;
    public final EObject ruleFuzzyIndexExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fuzzyFunction_1_0 = null;

        EObject lv_fuzzyFunction_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4420:2: ( ( (otherlv_0= 'val' ( (lv_fuzzyFunction_1_0= ruleFuzzyFunction ) ) ) | ( (lv_fuzzyFunction_2_0= ruleFuzzyFunctionInArrayNotation ) ) ) )
            // InternalAlpha.g:4421:2: ( (otherlv_0= 'val' ( (lv_fuzzyFunction_1_0= ruleFuzzyFunction ) ) ) | ( (lv_fuzzyFunction_2_0= ruleFuzzyFunctionInArrayNotation ) ) )
            {
            // InternalAlpha.g:4421:2: ( (otherlv_0= 'val' ( (lv_fuzzyFunction_1_0= ruleFuzzyFunction ) ) ) | ( (lv_fuzzyFunction_2_0= ruleFuzzyFunctionInArrayNotation ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==62) ) {
                alt67=1;
            }
            else if ( (LA67_0==40) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalAlpha.g:4422:3: (otherlv_0= 'val' ( (lv_fuzzyFunction_1_0= ruleFuzzyFunction ) ) )
                    {
                    // InternalAlpha.g:4422:3: (otherlv_0= 'val' ( (lv_fuzzyFunction_1_0= ruleFuzzyFunction ) ) )
                    // InternalAlpha.g:4423:4: otherlv_0= 'val' ( (lv_fuzzyFunction_1_0= ruleFuzzyFunction ) )
                    {
                    otherlv_0=(Token)match(input,62,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getFuzzyIndexExpressionAccess().getValKeyword_0_0());
                    			
                    // InternalAlpha.g:4427:4: ( (lv_fuzzyFunction_1_0= ruleFuzzyFunction ) )
                    // InternalAlpha.g:4428:5: (lv_fuzzyFunction_1_0= ruleFuzzyFunction )
                    {
                    // InternalAlpha.g:4428:5: (lv_fuzzyFunction_1_0= ruleFuzzyFunction )
                    // InternalAlpha.g:4429:6: lv_fuzzyFunction_1_0= ruleFuzzyFunction
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
                    // InternalAlpha.g:4448:3: ( (lv_fuzzyFunction_2_0= ruleFuzzyFunctionInArrayNotation ) )
                    {
                    // InternalAlpha.g:4448:3: ( (lv_fuzzyFunction_2_0= ruleFuzzyFunctionInArrayNotation ) )
                    // InternalAlpha.g:4449:4: (lv_fuzzyFunction_2_0= ruleFuzzyFunctionInArrayNotation )
                    {
                    // InternalAlpha.g:4449:4: (lv_fuzzyFunction_2_0= ruleFuzzyFunctionInArrayNotation )
                    // InternalAlpha.g:4450:5: lv_fuzzyFunction_2_0= ruleFuzzyFunctionInArrayNotation
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
    // InternalAlpha.g:4471:1: entryRuleReduceExpression returns [EObject current=null] : iv_ruleReduceExpression= ruleReduceExpression EOF ;
    public final EObject entryRuleReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReduceExpression = null;


        try {
            // InternalAlpha.g:4471:57: (iv_ruleReduceExpression= ruleReduceExpression EOF )
            // InternalAlpha.g:4472:2: iv_ruleReduceExpression= ruleReduceExpression EOF
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
    // InternalAlpha.g:4478:1: ruleReduceExpression returns [EObject current=null] : (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
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
            // InternalAlpha.g:4484:2: ( (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:4485:2: (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:4485:2: (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:4486:3: otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getReduceExpressionAccess().getReduceKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_64); 

            			newLeafNode(otherlv_1, grammarAccess.getReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:4494:3: ( (lv_operator_2_0= ruleAREDUCTION_OP ) )
            // InternalAlpha.g:4495:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            {
            // InternalAlpha.g:4495:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            // InternalAlpha.g:4496:5: lv_operator_2_0= ruleAREDUCTION_OP
            {

            					newCompositeNode(grammarAccess.getReduceExpressionAccess().getOperatorAREDUCTION_OPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_65);
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

            otherlv_3=(Token)match(input,38,FOLLOW_66); 

            			newLeafNode(otherlv_3, grammarAccess.getReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:4517:3: ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) )
            // InternalAlpha.g:4518:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:4518:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:4519:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:4519:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==16) ) {
                alt68=1;
            }
            else if ( (LA68_0==37) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalAlpha.g:4520:6: lv_projectionExpr_4_1= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getReduceExpressionAccess().getProjectionExprJNIFunctionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_65);
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
                    // InternalAlpha.g:4536:6: lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getReduceExpressionAccess().getProjectionExprJNIFunctionInArrayNotationParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_65);
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

            otherlv_5=(Token)match(input,38,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:4558:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:4559:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:4559:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:4560:5: lv_body_6_0= ruleAlphaExpression
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
    // InternalAlpha.g:4585:1: entryRuleExternalReduceExpression returns [EObject current=null] : iv_ruleExternalReduceExpression= ruleExternalReduceExpression EOF ;
    public final EObject entryRuleExternalReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalReduceExpression = null;


        try {
            // InternalAlpha.g:4585:65: (iv_ruleExternalReduceExpression= ruleExternalReduceExpression EOF )
            // InternalAlpha.g:4586:2: iv_ruleExternalReduceExpression= ruleExternalReduceExpression EOF
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
    // InternalAlpha.g:4592:1: ruleExternalReduceExpression returns [EObject current=null] : (otherlv_0= 'reduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
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
            // InternalAlpha.g:4598:2: ( (otherlv_0= 'reduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:4599:2: (otherlv_0= 'reduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:4599:2: (otherlv_0= 'reduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:4600:3: otherlv_0= 'reduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalReduceExpressionAccess().getReduceKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:4608:3: ( ( ruleQualifiedName ) )
            // InternalAlpha.g:4609:4: ( ruleQualifiedName )
            {
            // InternalAlpha.g:4609:4: ( ruleQualifiedName )
            // InternalAlpha.g:4610:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalReduceExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternalReduceExpressionAccess().getExternalFunctionExternalFunctionCrossReference_2_0());
            				
            pushFollow(FOLLOW_65);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_66); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:4628:3: ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) )
            // InternalAlpha.g:4629:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:4629:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:4630:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:4630:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==16) ) {
                alt69=1;
            }
            else if ( (LA69_0==37) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalAlpha.g:4631:6: lv_projectionExpr_4_1= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getExternalReduceExpressionAccess().getProjectionExprJNIFunctionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_65);
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
                    // InternalAlpha.g:4647:6: lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getExternalReduceExpressionAccess().getProjectionExprJNIFunctionInArrayNotationParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_65);
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

            otherlv_5=(Token)match(input,38,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:4669:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:4670:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:4670:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:4671:5: lv_body_6_0= ruleAlphaExpression
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
    // InternalAlpha.g:4696:1: entryRuleArgReduceExpression returns [EObject current=null] : iv_ruleArgReduceExpression= ruleArgReduceExpression EOF ;
    public final EObject entryRuleArgReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgReduceExpression = null;


        try {
            // InternalAlpha.g:4696:60: (iv_ruleArgReduceExpression= ruleArgReduceExpression EOF )
            // InternalAlpha.g:4697:2: iv_ruleArgReduceExpression= ruleArgReduceExpression EOF
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
    // InternalAlpha.g:4703:1: ruleArgReduceExpression returns [EObject current=null] : (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
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
            // InternalAlpha.g:4709:2: ( (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:4710:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:4710:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:4711:3: otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getArgReduceExpressionAccess().getArgreduceKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_64); 

            			newLeafNode(otherlv_1, grammarAccess.getArgReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:4719:3: ( (lv_operator_2_0= ruleAREDUCTION_OP ) )
            // InternalAlpha.g:4720:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            {
            // InternalAlpha.g:4720:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            // InternalAlpha.g:4721:5: lv_operator_2_0= ruleAREDUCTION_OP
            {

            					newCompositeNode(grammarAccess.getArgReduceExpressionAccess().getOperatorAREDUCTION_OPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_65);
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

            otherlv_3=(Token)match(input,38,FOLLOW_66); 

            			newLeafNode(otherlv_3, grammarAccess.getArgReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:4742:3: ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) )
            // InternalAlpha.g:4743:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:4743:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:4744:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:4744:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==16) ) {
                alt70=1;
            }
            else if ( (LA70_0==37) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalAlpha.g:4745:6: lv_projectionExpr_4_1= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getArgReduceExpressionAccess().getProjectionExprJNIFunctionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_65);
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
                    // InternalAlpha.g:4761:6: lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getArgReduceExpressionAccess().getProjectionExprJNIFunctionInArrayNotationParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_65);
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

            otherlv_5=(Token)match(input,38,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getArgReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:4783:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:4784:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:4784:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:4785:5: lv_body_6_0= ruleAlphaExpression
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
    // InternalAlpha.g:4810:1: entryRuleExternalArgReduceExpression returns [EObject current=null] : iv_ruleExternalArgReduceExpression= ruleExternalArgReduceExpression EOF ;
    public final EObject entryRuleExternalArgReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalArgReduceExpression = null;


        try {
            // InternalAlpha.g:4810:68: (iv_ruleExternalArgReduceExpression= ruleExternalArgReduceExpression EOF )
            // InternalAlpha.g:4811:2: iv_ruleExternalArgReduceExpression= ruleExternalArgReduceExpression EOF
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
    // InternalAlpha.g:4817:1: ruleExternalArgReduceExpression returns [EObject current=null] : (otherlv_0= 'argreduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
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
            // InternalAlpha.g:4823:2: ( (otherlv_0= 'argreduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:4824:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:4824:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:4825:3: otherlv_0= 'argreduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalArgReduceExpressionAccess().getArgreduceKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalArgReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:4833:3: ( ( ruleQualifiedName ) )
            // InternalAlpha.g:4834:4: ( ruleQualifiedName )
            {
            // InternalAlpha.g:4834:4: ( ruleQualifiedName )
            // InternalAlpha.g:4835:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalArgReduceExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternalArgReduceExpressionAccess().getExternalFunctionExternalFunctionCrossReference_2_0());
            				
            pushFollow(FOLLOW_65);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_66); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalArgReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:4853:3: ( ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) ) )
            // InternalAlpha.g:4854:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:4854:4: ( (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation ) )
            // InternalAlpha.g:4855:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            {
            // InternalAlpha.g:4855:5: (lv_projectionExpr_4_1= ruleJNIFunction | lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==16) ) {
                alt71=1;
            }
            else if ( (LA71_0==37) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalAlpha.g:4856:6: lv_projectionExpr_4_1= ruleJNIFunction
                    {

                    						newCompositeNode(grammarAccess.getExternalArgReduceExpressionAccess().getProjectionExprJNIFunctionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_65);
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
                    // InternalAlpha.g:4872:6: lv_projectionExpr_4_2= ruleJNIFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getExternalArgReduceExpressionAccess().getProjectionExprJNIFunctionInArrayNotationParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_65);
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

            otherlv_5=(Token)match(input,38,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalArgReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:4894:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:4895:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:4895:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:4896:5: lv_body_6_0= ruleAlphaExpression
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


    // $ANTLR start "entryRuleFuzzyReduceExpression"
    // InternalAlpha.g:4921:1: entryRuleFuzzyReduceExpression returns [EObject current=null] : iv_ruleFuzzyReduceExpression= ruleFuzzyReduceExpression EOF ;
    public final EObject entryRuleFuzzyReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyReduceExpression = null;


        try {
            // InternalAlpha.g:4921:62: (iv_ruleFuzzyReduceExpression= ruleFuzzyReduceExpression EOF )
            // InternalAlpha.g:4922:2: iv_ruleFuzzyReduceExpression= ruleFuzzyReduceExpression EOF
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
    // InternalAlpha.g:4928:1: ruleFuzzyReduceExpression returns [EObject current=null] : (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
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
            // InternalAlpha.g:4934:2: ( (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:4935:2: (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:4935:2: (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:4936:3: otherlv_0= 'reduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFuzzyReduceExpressionAccess().getReduceKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_64); 

            			newLeafNode(otherlv_1, grammarAccess.getFuzzyReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:4944:3: ( (lv_operator_2_0= ruleAREDUCTION_OP ) )
            // InternalAlpha.g:4945:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            {
            // InternalAlpha.g:4945:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            // InternalAlpha.g:4946:5: lv_operator_2_0= ruleAREDUCTION_OP
            {

            					newCompositeNode(grammarAccess.getFuzzyReduceExpressionAccess().getOperatorAREDUCTION_OPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_65);
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

            otherlv_3=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getFuzzyReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:4967:3: ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) )
            // InternalAlpha.g:4968:4: (lv_projectionFunction_4_0= ruleFuzzyFunction )
            {
            // InternalAlpha.g:4968:4: (lv_projectionFunction_4_0= ruleFuzzyFunction )
            // InternalAlpha.g:4969:5: lv_projectionFunction_4_0= ruleFuzzyFunction
            {

            					newCompositeNode(grammarAccess.getFuzzyReduceExpressionAccess().getProjectionFunctionFuzzyFunctionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_65);
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

            otherlv_5=(Token)match(input,38,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getFuzzyReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:4990:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:4991:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:4991:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:4992:5: lv_body_6_0= ruleAlphaExpression
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

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAlpha.g:5017:1: entryRuleExternalFuzzyReduceExpression returns [EObject current=null] : iv_ruleExternalFuzzyReduceExpression= ruleExternalFuzzyReduceExpression EOF ;
    public final EObject entryRuleExternalFuzzyReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalFuzzyReduceExpression = null;


        try {
            // InternalAlpha.g:5017:70: (iv_ruleExternalFuzzyReduceExpression= ruleExternalFuzzyReduceExpression EOF )
            // InternalAlpha.g:5018:2: iv_ruleExternalFuzzyReduceExpression= ruleExternalFuzzyReduceExpression EOF
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
    // InternalAlpha.g:5024:1: ruleExternalFuzzyReduceExpression returns [EObject current=null] : (otherlv_0= 'reduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
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
            // InternalAlpha.g:5030:2: ( (otherlv_0= 'reduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:5031:2: (otherlv_0= 'reduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:5031:2: (otherlv_0= 'reduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:5032:3: otherlv_0= 'reduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalFuzzyReduceExpressionAccess().getReduceKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalFuzzyReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:5040:3: ( ( ruleQualifiedName ) )
            // InternalAlpha.g:5041:4: ( ruleQualifiedName )
            {
            // InternalAlpha.g:5041:4: ( ruleQualifiedName )
            // InternalAlpha.g:5042:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalFuzzyReduceExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternalFuzzyReduceExpressionAccess().getExternalFunctionExternalFunctionCrossReference_2_0());
            				
            pushFollow(FOLLOW_65);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalFuzzyReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:5060:3: ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) )
            // InternalAlpha.g:5061:4: (lv_projectionFunction_4_0= ruleFuzzyFunction )
            {
            // InternalAlpha.g:5061:4: (lv_projectionFunction_4_0= ruleFuzzyFunction )
            // InternalAlpha.g:5062:5: lv_projectionFunction_4_0= ruleFuzzyFunction
            {

            					newCompositeNode(grammarAccess.getExternalFuzzyReduceExpressionAccess().getProjectionFunctionFuzzyFunctionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_65);
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

            otherlv_5=(Token)match(input,38,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalFuzzyReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:5083:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:5084:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:5084:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:5085:5: lv_body_6_0= ruleAlphaExpression
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

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAlpha.g:5110:1: entryRuleFuzzyArgReduceExpression returns [EObject current=null] : iv_ruleFuzzyArgReduceExpression= ruleFuzzyArgReduceExpression EOF ;
    public final EObject entryRuleFuzzyArgReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyArgReduceExpression = null;


        try {
            // InternalAlpha.g:5110:65: (iv_ruleFuzzyArgReduceExpression= ruleFuzzyArgReduceExpression EOF )
            // InternalAlpha.g:5111:2: iv_ruleFuzzyArgReduceExpression= ruleFuzzyArgReduceExpression EOF
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
    // InternalAlpha.g:5117:1: ruleFuzzyArgReduceExpression returns [EObject current=null] : (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
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
            // InternalAlpha.g:5123:2: ( (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:5124:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:5124:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:5125:3: otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_operator_2_0= ruleAREDUCTION_OP ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFuzzyArgReduceExpressionAccess().getArgreduceKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_64); 

            			newLeafNode(otherlv_1, grammarAccess.getFuzzyArgReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:5133:3: ( (lv_operator_2_0= ruleAREDUCTION_OP ) )
            // InternalAlpha.g:5134:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            {
            // InternalAlpha.g:5134:4: (lv_operator_2_0= ruleAREDUCTION_OP )
            // InternalAlpha.g:5135:5: lv_operator_2_0= ruleAREDUCTION_OP
            {

            					newCompositeNode(grammarAccess.getFuzzyArgReduceExpressionAccess().getOperatorAREDUCTION_OPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_65);
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

            otherlv_3=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getFuzzyArgReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:5156:3: ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) )
            // InternalAlpha.g:5157:4: (lv_projectionFunction_4_0= ruleFuzzyFunction )
            {
            // InternalAlpha.g:5157:4: (lv_projectionFunction_4_0= ruleFuzzyFunction )
            // InternalAlpha.g:5158:5: lv_projectionFunction_4_0= ruleFuzzyFunction
            {

            					newCompositeNode(grammarAccess.getFuzzyArgReduceExpressionAccess().getProjectionFunctionFuzzyFunctionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_65);
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

            otherlv_5=(Token)match(input,38,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getFuzzyArgReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:5179:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:5180:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:5180:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:5181:5: lv_body_6_0= ruleAlphaExpression
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

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAlpha.g:5206:1: entryRuleExternalFuzzyArgReduceExpression returns [EObject current=null] : iv_ruleExternalFuzzyArgReduceExpression= ruleExternalFuzzyArgReduceExpression EOF ;
    public final EObject entryRuleExternalFuzzyArgReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalFuzzyArgReduceExpression = null;


        try {
            // InternalAlpha.g:5206:73: (iv_ruleExternalFuzzyArgReduceExpression= ruleExternalFuzzyArgReduceExpression EOF )
            // InternalAlpha.g:5207:2: iv_ruleExternalFuzzyArgReduceExpression= ruleExternalFuzzyArgReduceExpression EOF
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
    // InternalAlpha.g:5213:1: ruleExternalFuzzyArgReduceExpression returns [EObject current=null] : (otherlv_0= 'argreduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
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
            // InternalAlpha.g:5219:2: ( (otherlv_0= 'argreduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:5220:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:5220:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:5221:3: otherlv_0= 'argreduce' otherlv_1= '(' ( ( ruleQualifiedName ) ) otherlv_3= ',' ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) ) otherlv_5= ',' ( (lv_body_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalFuzzyArgReduceExpressionAccess().getArgreduceKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalFuzzyArgReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:5229:3: ( ( ruleQualifiedName ) )
            // InternalAlpha.g:5230:4: ( ruleQualifiedName )
            {
            // InternalAlpha.g:5230:4: ( ruleQualifiedName )
            // InternalAlpha.g:5231:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalFuzzyArgReduceExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternalFuzzyArgReduceExpressionAccess().getExternalFunctionExternalFunctionCrossReference_2_0());
            				
            pushFollow(FOLLOW_65);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalFuzzyArgReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:5249:3: ( (lv_projectionFunction_4_0= ruleFuzzyFunction ) )
            // InternalAlpha.g:5250:4: (lv_projectionFunction_4_0= ruleFuzzyFunction )
            {
            // InternalAlpha.g:5250:4: (lv_projectionFunction_4_0= ruleFuzzyFunction )
            // InternalAlpha.g:5251:5: lv_projectionFunction_4_0= ruleFuzzyFunction
            {

            					newCompositeNode(grammarAccess.getExternalFuzzyArgReduceExpressionAccess().getProjectionFunctionFuzzyFunctionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_65);
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

            otherlv_5=(Token)match(input,38,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalFuzzyArgReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:5272:3: ( (lv_body_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:5273:4: (lv_body_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:5273:4: (lv_body_6_0= ruleAlphaExpression )
            // InternalAlpha.g:5274:5: lv_body_6_0= ruleAlphaExpression
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

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAlpha.g:5299:1: entryRuleConvolutionExpression returns [EObject current=null] : iv_ruleConvolutionExpression= ruleConvolutionExpression EOF ;
    public final EObject entryRuleConvolutionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConvolutionExpression = null;


        try {
            // InternalAlpha.g:5299:62: (iv_ruleConvolutionExpression= ruleConvolutionExpression EOF )
            // InternalAlpha.g:5300:2: iv_ruleConvolutionExpression= ruleConvolutionExpression EOF
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
    // InternalAlpha.g:5306:1: ruleConvolutionExpression returns [EObject current=null] : (otherlv_0= 'conv' otherlv_1= '(' ( (lv_kernelDomainExpr_2_0= ruleCalculatorExpression ) ) otherlv_3= ',' ( (lv_kernelExpression_4_0= ruleAlphaExpression ) ) otherlv_5= ',' ( (lv_dataExpression_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) ;
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
            // InternalAlpha.g:5312:2: ( (otherlv_0= 'conv' otherlv_1= '(' ( (lv_kernelDomainExpr_2_0= ruleCalculatorExpression ) ) otherlv_3= ',' ( (lv_kernelExpression_4_0= ruleAlphaExpression ) ) otherlv_5= ',' ( (lv_dataExpression_6_0= ruleAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:5313:2: (otherlv_0= 'conv' otherlv_1= '(' ( (lv_kernelDomainExpr_2_0= ruleCalculatorExpression ) ) otherlv_3= ',' ( (lv_kernelExpression_4_0= ruleAlphaExpression ) ) otherlv_5= ',' ( (lv_dataExpression_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:5313:2: (otherlv_0= 'conv' otherlv_1= '(' ( (lv_kernelDomainExpr_2_0= ruleCalculatorExpression ) ) otherlv_3= ',' ( (lv_kernelExpression_4_0= ruleAlphaExpression ) ) otherlv_5= ',' ( (lv_dataExpression_6_0= ruleAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:5314:3: otherlv_0= 'conv' otherlv_1= '(' ( (lv_kernelDomainExpr_2_0= ruleCalculatorExpression ) ) otherlv_3= ',' ( (lv_kernelExpression_4_0= ruleAlphaExpression ) ) otherlv_5= ',' ( (lv_dataExpression_6_0= ruleAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getConvolutionExpressionAccess().getConvKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getConvolutionExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:5322:3: ( (lv_kernelDomainExpr_2_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:5323:4: (lv_kernelDomainExpr_2_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:5323:4: (lv_kernelDomainExpr_2_0= ruleCalculatorExpression )
            // InternalAlpha.g:5324:5: lv_kernelDomainExpr_2_0= ruleCalculatorExpression
            {

            					newCompositeNode(grammarAccess.getConvolutionExpressionAccess().getKernelDomainExprCalculatorExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_65);
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

            otherlv_3=(Token)match(input,38,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getConvolutionExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:5345:3: ( (lv_kernelExpression_4_0= ruleAlphaExpression ) )
            // InternalAlpha.g:5346:4: (lv_kernelExpression_4_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:5346:4: (lv_kernelExpression_4_0= ruleAlphaExpression )
            // InternalAlpha.g:5347:5: lv_kernelExpression_4_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getConvolutionExpressionAccess().getKernelExpressionAlphaExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_65);
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

            otherlv_5=(Token)match(input,38,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getConvolutionExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:5368:3: ( (lv_dataExpression_6_0= ruleAlphaExpression ) )
            // InternalAlpha.g:5369:4: (lv_dataExpression_6_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:5369:4: (lv_dataExpression_6_0= ruleAlphaExpression )
            // InternalAlpha.g:5370:5: lv_dataExpression_6_0= ruleAlphaExpression
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
    // InternalAlpha.g:5395:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // InternalAlpha.g:5395:57: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // InternalAlpha.g:5396:2: iv_ruleSelectExpression= ruleSelectExpression EOF
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
    // InternalAlpha.g:5402:1: ruleSelectExpression returns [EObject current=null] : (otherlv_0= 'select' ( (lv_relationExpr_1_0= ruleCalculatorExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAlphaTerminalExpression ) ) ) ;
    public final EObject ruleSelectExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_relationExpr_1_0 = null;

        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5408:2: ( (otherlv_0= 'select' ( (lv_relationExpr_1_0= ruleCalculatorExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAlphaTerminalExpression ) ) ) )
            // InternalAlpha.g:5409:2: (otherlv_0= 'select' ( (lv_relationExpr_1_0= ruleCalculatorExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAlphaTerminalExpression ) ) )
            {
            // InternalAlpha.g:5409:2: (otherlv_0= 'select' ( (lv_relationExpr_1_0= ruleCalculatorExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAlphaTerminalExpression ) ) )
            // InternalAlpha.g:5410:3: otherlv_0= 'select' ( (lv_relationExpr_1_0= ruleCalculatorExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAlphaTerminalExpression ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectExpressionAccess().getSelectKeyword_0());
            		
            // InternalAlpha.g:5414:3: ( (lv_relationExpr_1_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:5415:4: (lv_relationExpr_1_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:5415:4: (lv_relationExpr_1_0= ruleCalculatorExpression )
            // InternalAlpha.g:5416:5: lv_relationExpr_1_0= ruleCalculatorExpression
            {

            					newCompositeNode(grammarAccess.getSelectExpressionAccess().getRelationExprCalculatorExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_67);
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

            otherlv_2=(Token)match(input,67,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectExpressionAccess().getFromKeyword_2());
            		
            // InternalAlpha.g:5437:3: ( (lv_expr_3_0= ruleAlphaTerminalExpression ) )
            // InternalAlpha.g:5438:4: (lv_expr_3_0= ruleAlphaTerminalExpression )
            {
            // InternalAlpha.g:5438:4: (lv_expr_3_0= ruleAlphaTerminalExpression )
            // InternalAlpha.g:5439:5: lv_expr_3_0= ruleAlphaTerminalExpression
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
    // InternalAlpha.g:5460:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalAlpha.g:5460:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalAlpha.g:5461:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalAlpha.g:5467:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5473:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalAlpha.g:5474:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalAlpha.g:5474:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalAlpha.g:5475:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_68);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:5483:3: ( () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==49||LA72_0==72) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalAlpha.g:5484:4: () ( (lv_operator_2_0= ruleAOrOP ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalAlpha.g:5484:4: ()
            	    // InternalAlpha.g:5485:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:5491:4: ( (lv_operator_2_0= ruleAOrOP ) )
            	    // InternalAlpha.g:5492:5: (lv_operator_2_0= ruleAOrOP )
            	    {
            	    // InternalAlpha.g:5492:5: (lv_operator_2_0= ruleAOrOP )
            	    // InternalAlpha.g:5493:6: lv_operator_2_0= ruleAOrOP
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorAOrOPParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
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

            	    // InternalAlpha.g:5510:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalAlpha.g:5511:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalAlpha.g:5511:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalAlpha.g:5512:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_68);
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalAlpha.g:5534:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalAlpha.g:5534:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalAlpha.g:5535:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalAlpha.g:5541:1: ruleAndExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5547:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // InternalAlpha.g:5548:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // InternalAlpha.g:5548:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // InternalAlpha.g:5549:3: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_69);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;


            			current = this_RelationalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:5557:3: ( () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==48) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalAlpha.g:5558:4: () ( (lv_operator_2_0= ruleAAndOP ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // InternalAlpha.g:5558:4: ()
            	    // InternalAlpha.g:5559:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:5565:4: ( (lv_operator_2_0= ruleAAndOP ) )
            	    // InternalAlpha.g:5566:5: (lv_operator_2_0= ruleAAndOP )
            	    {
            	    // InternalAlpha.g:5566:5: (lv_operator_2_0= ruleAAndOP )
            	    // InternalAlpha.g:5567:6: lv_operator_2_0= ruleAAndOP
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAAndOPParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
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

            	    // InternalAlpha.g:5584:4: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // InternalAlpha.g:5585:5: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // InternalAlpha.g:5585:5: (lv_right_3_0= ruleRelationalExpression )
            	    // InternalAlpha.g:5586:6: lv_right_3_0= ruleRelationalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightRelationalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_69);
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalAlpha.g:5608:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalAlpha.g:5608:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalAlpha.g:5609:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
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
    // InternalAlpha.g:5615:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5621:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalAlpha.g:5622:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalAlpha.g:5622:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            // InternalAlpha.g:5623:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_70);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:5631:3: ( () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==14||(LA74_0>=52 && LA74_0<=55)||LA74_0==73) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalAlpha.g:5632:4: () ( (lv_operator_2_0= ruleARelationalOP ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalAlpha.g:5632:4: ()
            	    // InternalAlpha.g:5633:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRelationalExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:5639:4: ( (lv_operator_2_0= ruleARelationalOP ) )
            	    // InternalAlpha.g:5640:5: (lv_operator_2_0= ruleARelationalOP )
            	    {
            	    // InternalAlpha.g:5640:5: (lv_operator_2_0= ruleARelationalOP )
            	    // InternalAlpha.g:5641:6: lv_operator_2_0= ruleARelationalOP
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorARelationalOPParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
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

            	    // InternalAlpha.g:5658:4: ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    // InternalAlpha.g:5659:5: (lv_right_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalAlpha.g:5659:5: (lv_right_3_0= ruleAdditiveExpression )
            	    // InternalAlpha.g:5660:6: lv_right_3_0= ruleAdditiveExpression
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_70);
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
            	    break loop74;
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
    // InternalAlpha.g:5682:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalAlpha.g:5682:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalAlpha.g:5683:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalAlpha.g:5689:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5695:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalAlpha.g:5696:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalAlpha.g:5696:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalAlpha.g:5697:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_71);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:5705:3: ( () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( ((LA75_0>=43 && LA75_0<=44)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalAlpha.g:5706:4: () ( (lv_operator_2_0= ruleAAdditiveOP ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalAlpha.g:5706:4: ()
            	    // InternalAlpha.g:5707:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:5713:4: ( (lv_operator_2_0= ruleAAdditiveOP ) )
            	    // InternalAlpha.g:5714:5: (lv_operator_2_0= ruleAAdditiveOP )
            	    {
            	    // InternalAlpha.g:5714:5: (lv_operator_2_0= ruleAAdditiveOP )
            	    // InternalAlpha.g:5715:6: lv_operator_2_0= ruleAAdditiveOP
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAAdditiveOPParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
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

            	    // InternalAlpha.g:5732:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalAlpha.g:5733:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalAlpha.g:5733:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalAlpha.g:5734:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_71);
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
            	    break loop75;
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
    // InternalAlpha.g:5756:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalAlpha.g:5756:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalAlpha.g:5757:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalAlpha.g:5763:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_MinMaxExpression_0= ruleMinMaxExpression ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MinMaxExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5769:2: ( (this_MinMaxExpression_0= ruleMinMaxExpression ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )* ) )
            // InternalAlpha.g:5770:2: (this_MinMaxExpression_0= ruleMinMaxExpression ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )* )
            {
            // InternalAlpha.g:5770:2: (this_MinMaxExpression_0= ruleMinMaxExpression ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )* )
            // InternalAlpha.g:5771:3: this_MinMaxExpression_0= ruleMinMaxExpression ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getMinMaxExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_72);
            this_MinMaxExpression_0=ruleMinMaxExpression();

            state._fsp--;


            			current = this_MinMaxExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:5779:3: ( () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( ((LA76_0>=45 && LA76_0<=46)) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalAlpha.g:5780:4: () ( (lv_operator_2_0= ruleAMultiplicativeOP ) ) ( (lv_right_3_0= ruleMinMaxExpression ) )
            	    {
            	    // InternalAlpha.g:5780:4: ()
            	    // InternalAlpha.g:5781:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:5787:4: ( (lv_operator_2_0= ruleAMultiplicativeOP ) )
            	    // InternalAlpha.g:5788:5: (lv_operator_2_0= ruleAMultiplicativeOP )
            	    {
            	    // InternalAlpha.g:5788:5: (lv_operator_2_0= ruleAMultiplicativeOP )
            	    // InternalAlpha.g:5789:6: lv_operator_2_0= ruleAMultiplicativeOP
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAMultiplicativeOPParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
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

            	    // InternalAlpha.g:5806:4: ( (lv_right_3_0= ruleMinMaxExpression ) )
            	    // InternalAlpha.g:5807:5: (lv_right_3_0= ruleMinMaxExpression )
            	    {
            	    // InternalAlpha.g:5807:5: (lv_right_3_0= ruleMinMaxExpression )
            	    // InternalAlpha.g:5808:6: lv_right_3_0= ruleMinMaxExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightMinMaxExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_72);
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
            	    break loop76;
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
    // InternalAlpha.g:5830:1: entryRuleMinMaxExpression returns [EObject current=null] : iv_ruleMinMaxExpression= ruleMinMaxExpression EOF ;
    public final EObject entryRuleMinMaxExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinMaxExpression = null;


        try {
            // InternalAlpha.g:5830:57: (iv_ruleMinMaxExpression= ruleMinMaxExpression EOF )
            // InternalAlpha.g:5831:2: iv_ruleMinMaxExpression= ruleMinMaxExpression EOF
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
    // InternalAlpha.g:5837:1: ruleMinMaxExpression returns [EObject current=null] : (this_UnaryOrTerminalExpression_0= ruleUnaryOrTerminalExpression ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )* ) ;
    public final EObject ruleMinMaxExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOrTerminalExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5843:2: ( (this_UnaryOrTerminalExpression_0= ruleUnaryOrTerminalExpression ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )* ) )
            // InternalAlpha.g:5844:2: (this_UnaryOrTerminalExpression_0= ruleUnaryOrTerminalExpression ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )* )
            {
            // InternalAlpha.g:5844:2: (this_UnaryOrTerminalExpression_0= ruleUnaryOrTerminalExpression ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )* )
            // InternalAlpha.g:5845:3: this_UnaryOrTerminalExpression_0= ruleUnaryOrTerminalExpression ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMinMaxExpressionAccess().getUnaryOrTerminalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_73);
            this_UnaryOrTerminalExpression_0=ruleUnaryOrTerminalExpression();

            state._fsp--;


            			current = this_UnaryOrTerminalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:5853:3: ( () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=68 && LA77_0<=69)) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalAlpha.g:5854:4: () ( (lv_operator_2_0= ruleAMINMAX_OP ) ) ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) )
            	    {
            	    // InternalAlpha.g:5854:4: ()
            	    // InternalAlpha.g:5855:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMinMaxExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:5861:4: ( (lv_operator_2_0= ruleAMINMAX_OP ) )
            	    // InternalAlpha.g:5862:5: (lv_operator_2_0= ruleAMINMAX_OP )
            	    {
            	    // InternalAlpha.g:5862:5: (lv_operator_2_0= ruleAMINMAX_OP )
            	    // InternalAlpha.g:5863:6: lv_operator_2_0= ruleAMINMAX_OP
            	    {

            	    						newCompositeNode(grammarAccess.getMinMaxExpressionAccess().getOperatorAMINMAX_OPParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
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

            	    // InternalAlpha.g:5880:4: ( (lv_right_3_0= ruleUnaryOrTerminalExpression ) )
            	    // InternalAlpha.g:5881:5: (lv_right_3_0= ruleUnaryOrTerminalExpression )
            	    {
            	    // InternalAlpha.g:5881:5: (lv_right_3_0= ruleUnaryOrTerminalExpression )
            	    // InternalAlpha.g:5882:6: lv_right_3_0= ruleUnaryOrTerminalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMinMaxExpressionAccess().getRightUnaryOrTerminalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_73);
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
            	    break loop77;
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
    // InternalAlpha.g:5904:1: entryRuleMultiArgExpression returns [EObject current=null] : iv_ruleMultiArgExpression= ruleMultiArgExpression EOF ;
    public final EObject entryRuleMultiArgExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiArgExpression = null;


        try {
            // InternalAlpha.g:5904:59: (iv_ruleMultiArgExpression= ruleMultiArgExpression EOF )
            // InternalAlpha.g:5905:2: iv_ruleMultiArgExpression= ruleMultiArgExpression EOF
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
    // InternalAlpha.g:5911:1: ruleMultiArgExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAREDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' ) ;
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
            // InternalAlpha.g:5917:2: ( ( ( (lv_operator_0_0= ruleAREDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' ) )
            // InternalAlpha.g:5918:2: ( ( (lv_operator_0_0= ruleAREDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' )
            {
            // InternalAlpha.g:5918:2: ( ( (lv_operator_0_0= ruleAREDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' )
            // InternalAlpha.g:5919:3: ( (lv_operator_0_0= ruleAREDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')'
            {
            // InternalAlpha.g:5919:3: ( (lv_operator_0_0= ruleAREDUCTION_OP ) )
            // InternalAlpha.g:5920:4: (lv_operator_0_0= ruleAREDUCTION_OP )
            {
            // InternalAlpha.g:5920:4: (lv_operator_0_0= ruleAREDUCTION_OP )
            // InternalAlpha.g:5921:5: lv_operator_0_0= ruleAREDUCTION_OP
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

            otherlv_1=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiArgExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:5942:3: ( (lv_exprs_2_0= ruleAlphaExpression ) )
            // InternalAlpha.g:5943:4: (lv_exprs_2_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:5943:4: (lv_exprs_2_0= ruleAlphaExpression )
            // InternalAlpha.g:5944:5: lv_exprs_2_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getMultiArgExpressionAccess().getExprsAlphaExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_57);
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

            // InternalAlpha.g:5961:3: (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==38) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalAlpha.g:5962:4: otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,38,FOLLOW_21); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMultiArgExpressionAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalAlpha.g:5966:4: ( (lv_exprs_4_0= ruleAlphaExpression ) )
            	    // InternalAlpha.g:5967:5: (lv_exprs_4_0= ruleAlphaExpression )
            	    {
            	    // InternalAlpha.g:5967:5: (lv_exprs_4_0= ruleAlphaExpression )
            	    // InternalAlpha.g:5968:6: lv_exprs_4_0= ruleAlphaExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiArgExpressionAccess().getExprsAlphaExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_57);
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
            	    break loop78;
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
    // InternalAlpha.g:5994:1: entryRuleExternalMultiArgExpression returns [EObject current=null] : iv_ruleExternalMultiArgExpression= ruleExternalMultiArgExpression EOF ;
    public final EObject entryRuleExternalMultiArgExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalMultiArgExpression = null;


        try {
            // InternalAlpha.g:5994:67: (iv_ruleExternalMultiArgExpression= ruleExternalMultiArgExpression EOF )
            // InternalAlpha.g:5995:2: iv_ruleExternalMultiArgExpression= ruleExternalMultiArgExpression EOF
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
    // InternalAlpha.g:6001:1: ruleExternalMultiArgExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleExternalMultiArgExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exprs_2_0 = null;

        EObject lv_exprs_4_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:6007:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' ) )
            // InternalAlpha.g:6008:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' )
            {
            // InternalAlpha.g:6008:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')' )
            // InternalAlpha.g:6009:3: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )* otherlv_5= ')'
            {
            // InternalAlpha.g:6009:3: ( ( ruleQualifiedName ) )
            // InternalAlpha.g:6010:4: ( ruleQualifiedName )
            {
            // InternalAlpha.g:6010:4: ( ruleQualifiedName )
            // InternalAlpha.g:6011:5: ruleQualifiedName
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

            otherlv_1=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalMultiArgExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:6029:3: ( (lv_exprs_2_0= ruleAlphaExpression ) )
            // InternalAlpha.g:6030:4: (lv_exprs_2_0= ruleAlphaExpression )
            {
            // InternalAlpha.g:6030:4: (lv_exprs_2_0= ruleAlphaExpression )
            // InternalAlpha.g:6031:5: lv_exprs_2_0= ruleAlphaExpression
            {

            					newCompositeNode(grammarAccess.getExternalMultiArgExpressionAccess().getExprsAlphaExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_57);
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

            // InternalAlpha.g:6048:3: (otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==38) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalAlpha.g:6049:4: otherlv_3= ',' ( (lv_exprs_4_0= ruleAlphaExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,38,FOLLOW_21); 

            	    				newLeafNode(otherlv_3, grammarAccess.getExternalMultiArgExpressionAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalAlpha.g:6053:4: ( (lv_exprs_4_0= ruleAlphaExpression ) )
            	    // InternalAlpha.g:6054:5: (lv_exprs_4_0= ruleAlphaExpression )
            	    {
            	    // InternalAlpha.g:6054:5: (lv_exprs_4_0= ruleAlphaExpression )
            	    // InternalAlpha.g:6055:6: lv_exprs_4_0= ruleAlphaExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExternalMultiArgExpressionAccess().getExprsAlphaExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_57);
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
            	    break loop79;
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
    // InternalAlpha.g:6081:1: entryRuleUnaryOrTerminalExpression returns [EObject current=null] : iv_ruleUnaryOrTerminalExpression= ruleUnaryOrTerminalExpression EOF ;
    public final EObject entryRuleUnaryOrTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOrTerminalExpression = null;


        try {
            // InternalAlpha.g:6081:66: (iv_ruleUnaryOrTerminalExpression= ruleUnaryOrTerminalExpression EOF )
            // InternalAlpha.g:6082:2: iv_ruleUnaryOrTerminalExpression= ruleUnaryOrTerminalExpression EOF
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
    // InternalAlpha.g:6088:1: ruleUnaryOrTerminalExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression | this_AlphaTerminalExpression_1= ruleAlphaTerminalExpression ) ;
    public final EObject ruleUnaryOrTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        EObject this_AlphaTerminalExpression_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:6094:2: ( (this_UnaryExpression_0= ruleUnaryExpression | this_AlphaTerminalExpression_1= ruleAlphaTerminalExpression ) )
            // InternalAlpha.g:6095:2: (this_UnaryExpression_0= ruleUnaryExpression | this_AlphaTerminalExpression_1= ruleAlphaTerminalExpression )
            {
            // InternalAlpha.g:6095:2: (this_UnaryExpression_0= ruleUnaryExpression | this_AlphaTerminalExpression_1= ruleAlphaTerminalExpression )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==44||LA80_0==74) ) {
                alt80=1;
            }
            else if ( ((LA80_0>=RULE_ID && LA80_0<=RULE_INT)||(LA80_0>=RULE_BOOLEAN && LA80_0<=RULE_FLOAT)||LA80_0==16||LA80_0==37||LA80_0==40||LA80_0==43||LA80_0==45||(LA80_0>=48 && LA80_0<=49)||LA80_0==60||(LA80_0>=62 && LA80_0<=66)||(LA80_0>=68 && LA80_0<=72)) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalAlpha.g:6096:3: this_UnaryExpression_0= ruleUnaryExpression
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
                    // InternalAlpha.g:6105:3: this_AlphaTerminalExpression_1= ruleAlphaTerminalExpression
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
    // InternalAlpha.g:6117:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlpha.g:6117:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlpha.g:6118:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalAlpha.g:6124:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAUnaryOP ) ) ( (lv_expr_1_0= ruleAlphaTerminalExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:6130:2: ( ( ( (lv_operator_0_0= ruleAUnaryOP ) ) ( (lv_expr_1_0= ruleAlphaTerminalExpression ) ) ) )
            // InternalAlpha.g:6131:2: ( ( (lv_operator_0_0= ruleAUnaryOP ) ) ( (lv_expr_1_0= ruleAlphaTerminalExpression ) ) )
            {
            // InternalAlpha.g:6131:2: ( ( (lv_operator_0_0= ruleAUnaryOP ) ) ( (lv_expr_1_0= ruleAlphaTerminalExpression ) ) )
            // InternalAlpha.g:6132:3: ( (lv_operator_0_0= ruleAUnaryOP ) ) ( (lv_expr_1_0= ruleAlphaTerminalExpression ) )
            {
            // InternalAlpha.g:6132:3: ( (lv_operator_0_0= ruleAUnaryOP ) )
            // InternalAlpha.g:6133:4: (lv_operator_0_0= ruleAUnaryOP )
            {
            // InternalAlpha.g:6133:4: (lv_operator_0_0= ruleAUnaryOP )
            // InternalAlpha.g:6134:5: lv_operator_0_0= ruleAUnaryOP
            {

            					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorAUnaryOPParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalAlpha.g:6151:3: ( (lv_expr_1_0= ruleAlphaTerminalExpression ) )
            // InternalAlpha.g:6152:4: (lv_expr_1_0= ruleAlphaTerminalExpression )
            {
            // InternalAlpha.g:6152:4: (lv_expr_1_0= ruleAlphaTerminalExpression )
            // InternalAlpha.g:6153:5: lv_expr_1_0= ruleAlphaTerminalExpression
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
    // InternalAlpha.g:6174:1: entryRuleVariableExpression returns [EObject current=null] : iv_ruleVariableExpression= ruleVariableExpression EOF ;
    public final EObject entryRuleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpression = null;


        try {
            // InternalAlpha.g:6174:59: (iv_ruleVariableExpression= ruleVariableExpression EOF )
            // InternalAlpha.g:6175:2: iv_ruleVariableExpression= ruleVariableExpression EOF
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
    // InternalAlpha.g:6181:1: ruleVariableExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:6187:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalAlpha.g:6188:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalAlpha.g:6188:2: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:6189:3: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:6189:3: (otherlv_0= RULE_ID )
            // InternalAlpha.g:6190:4: otherlv_0= RULE_ID
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
    // InternalAlpha.g:6204:1: entryRuleConstantExpression returns [EObject current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final EObject entryRuleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantExpression = null;


        try {
            // InternalAlpha.g:6204:59: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // InternalAlpha.g:6205:2: iv_ruleConstantExpression= ruleConstantExpression EOF
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
    // InternalAlpha.g:6211:1: ruleConstantExpression returns [EObject current=null] : (this_BooleanExpression_0= ruleBooleanExpression | this_RealExpression_1= ruleRealExpression | this_IntegerExpression_2= ruleIntegerExpression ) ;
    public final EObject ruleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpression_0 = null;

        EObject this_RealExpression_1 = null;

        EObject this_IntegerExpression_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:6217:2: ( (this_BooleanExpression_0= ruleBooleanExpression | this_RealExpression_1= ruleRealExpression | this_IntegerExpression_2= ruleIntegerExpression ) )
            // InternalAlpha.g:6218:2: (this_BooleanExpression_0= ruleBooleanExpression | this_RealExpression_1= ruleRealExpression | this_IntegerExpression_2= ruleIntegerExpression )
            {
            // InternalAlpha.g:6218:2: (this_BooleanExpression_0= ruleBooleanExpression | this_RealExpression_1= ruleRealExpression | this_IntegerExpression_2= ruleIntegerExpression )
            int alt81=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt81=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt81=2;
                }
                break;
            case RULE_INT:
                {
                alt81=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalAlpha.g:6219:3: this_BooleanExpression_0= ruleBooleanExpression
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
                    // InternalAlpha.g:6228:3: this_RealExpression_1= ruleRealExpression
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
                    // InternalAlpha.g:6237:3: this_IntegerExpression_2= ruleIntegerExpression
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
    // InternalAlpha.g:6249:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalAlpha.g:6249:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalAlpha.g:6250:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
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
    // InternalAlpha.g:6256:1: ruleBooleanExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:6262:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalAlpha.g:6263:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalAlpha.g:6263:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalAlpha.g:6264:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalAlpha.g:6264:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalAlpha.g:6265:4: lv_value_0_0= RULE_BOOLEAN
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
    // InternalAlpha.g:6284:1: entryRuleIntegerExpression returns [EObject current=null] : iv_ruleIntegerExpression= ruleIntegerExpression EOF ;
    public final EObject entryRuleIntegerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerExpression = null;


        try {
            // InternalAlpha.g:6284:58: (iv_ruleIntegerExpression= ruleIntegerExpression EOF )
            // InternalAlpha.g:6285:2: iv_ruleIntegerExpression= ruleIntegerExpression EOF
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
    // InternalAlpha.g:6291:1: ruleIntegerExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:6297:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAlpha.g:6298:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAlpha.g:6298:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalAlpha.g:6299:3: (lv_value_0_0= RULE_INT )
            {
            // InternalAlpha.g:6299:3: (lv_value_0_0= RULE_INT )
            // InternalAlpha.g:6300:4: lv_value_0_0= RULE_INT
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
    // InternalAlpha.g:6319:1: entryRuleRealExpression returns [EObject current=null] : iv_ruleRealExpression= ruleRealExpression EOF ;
    public final EObject entryRuleRealExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealExpression = null;


        try {
            // InternalAlpha.g:6319:55: (iv_ruleRealExpression= ruleRealExpression EOF )
            // InternalAlpha.g:6320:2: iv_ruleRealExpression= ruleRealExpression EOF
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
    // InternalAlpha.g:6326:1: ruleRealExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleRealExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:6332:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalAlpha.g:6333:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalAlpha.g:6333:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalAlpha.g:6334:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalAlpha.g:6334:3: (lv_value_0_0= RULE_FLOAT )
            // InternalAlpha.g:6335:4: lv_value_0_0= RULE_FLOAT
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
    // InternalAlpha.g:6354:1: entryRuleAREDUCTION_OP returns [String current=null] : iv_ruleAREDUCTION_OP= ruleAREDUCTION_OP EOF ;
    public final String entryRuleAREDUCTION_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAREDUCTION_OP = null;


        try {
            // InternalAlpha.g:6354:53: (iv_ruleAREDUCTION_OP= ruleAREDUCTION_OP EOF )
            // InternalAlpha.g:6355:2: iv_ruleAREDUCTION_OP= ruleAREDUCTION_OP EOF
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
    // InternalAlpha.g:6361:1: ruleAREDUCTION_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'min' | kw= 'max' | kw= 'prod' | kw= 'sum' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= '+' | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleAREDUCTION_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:6367:2: ( (kw= 'min' | kw= 'max' | kw= 'prod' | kw= 'sum' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= '+' | kw= '*' ) )
            // InternalAlpha.g:6368:2: (kw= 'min' | kw= 'max' | kw= 'prod' | kw= 'sum' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= '+' | kw= '*' )
            {
            // InternalAlpha.g:6368:2: (kw= 'min' | kw= 'max' | kw= 'prod' | kw= 'sum' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= '+' | kw= '*' )
            int alt82=9;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt82=1;
                }
                break;
            case 69:
                {
                alt82=2;
                }
                break;
            case 70:
                {
                alt82=3;
                }
                break;
            case 71:
                {
                alt82=4;
                }
                break;
            case 48:
                {
                alt82=5;
                }
                break;
            case 49:
                {
                alt82=6;
                }
                break;
            case 72:
                {
                alt82=7;
                }
                break;
            case 43:
                {
                alt82=8;
                }
                break;
            case 45:
                {
                alt82=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalAlpha.g:6369:3: kw= 'min'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getMinKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:6375:3: kw= 'max'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getMaxKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:6381:3: kw= 'prod'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getProdKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:6387:3: kw= 'sum'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getSumKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:6393:3: kw= 'and'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getAndKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:6399:3: kw= 'or'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getOrKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalAlpha.g:6405:3: kw= 'xor'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getXorKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalAlpha.g:6411:3: kw= '+'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAREDUCTION_OPAccess().getPlusSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalAlpha.g:6417:3: kw= '*'
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
    // InternalAlpha.g:6426:1: entryRuleAOrOP returns [String current=null] : iv_ruleAOrOP= ruleAOrOP EOF ;
    public final String entryRuleAOrOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAOrOP = null;


        try {
            // InternalAlpha.g:6426:45: (iv_ruleAOrOP= ruleAOrOP EOF )
            // InternalAlpha.g:6427:2: iv_ruleAOrOP= ruleAOrOP EOF
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
    // InternalAlpha.g:6433:1: ruleAOrOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'or' | kw= 'xor' ) ;
    public final AntlrDatatypeRuleToken ruleAOrOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:6439:2: ( (kw= 'or' | kw= 'xor' ) )
            // InternalAlpha.g:6440:2: (kw= 'or' | kw= 'xor' )
            {
            // InternalAlpha.g:6440:2: (kw= 'or' | kw= 'xor' )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==49) ) {
                alt83=1;
            }
            else if ( (LA83_0==72) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalAlpha.g:6441:3: kw= 'or'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAOrOPAccess().getOrKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:6447:3: kw= 'xor'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

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
    // InternalAlpha.g:6456:1: entryRuleAAndOP returns [String current=null] : iv_ruleAAndOP= ruleAAndOP EOF ;
    public final String entryRuleAAndOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAAndOP = null;


        try {
            // InternalAlpha.g:6456:46: (iv_ruleAAndOP= ruleAAndOP EOF )
            // InternalAlpha.g:6457:2: iv_ruleAAndOP= ruleAAndOP EOF
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
    // InternalAlpha.g:6463:1: ruleAAndOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'and' ;
    public final AntlrDatatypeRuleToken ruleAAndOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:6469:2: (kw= 'and' )
            // InternalAlpha.g:6470:2: kw= 'and'
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
    // InternalAlpha.g:6478:1: entryRuleARelationalOP returns [String current=null] : iv_ruleARelationalOP= ruleARelationalOP EOF ;
    public final String entryRuleARelationalOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleARelationalOP = null;


        try {
            // InternalAlpha.g:6478:53: (iv_ruleARelationalOP= ruleARelationalOP EOF )
            // InternalAlpha.g:6479:2: iv_ruleARelationalOP= ruleARelationalOP EOF
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
    // InternalAlpha.g:6485:1: ruleARelationalOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '!=' | kw= '>=' | kw= '>' | kw= '<' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken ruleARelationalOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:6491:2: ( (kw= '=' | kw= '!=' | kw= '>=' | kw= '>' | kw= '<' | kw= '<=' ) )
            // InternalAlpha.g:6492:2: (kw= '=' | kw= '!=' | kw= '>=' | kw= '>' | kw= '<' | kw= '<=' )
            {
            // InternalAlpha.g:6492:2: (kw= '=' | kw= '!=' | kw= '>=' | kw= '>' | kw= '<' | kw= '<=' )
            int alt84=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt84=1;
                }
                break;
            case 73:
                {
                alt84=2;
                }
                break;
            case 52:
                {
                alt84=3;
                }
                break;
            case 53:
                {
                alt84=4;
                }
                break;
            case 54:
                {
                alt84=5;
                }
                break;
            case 55:
                {
                alt84=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalAlpha.g:6493:3: kw= '='
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:6499:3: kw= '!='
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getExclamationMarkEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:6505:3: kw= '>='
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getGreaterThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:6511:3: kw= '>'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getGreaterThanSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:6517:3: kw= '<'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getARelationalOPAccess().getLessThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:6523:3: kw= '<='
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
    // InternalAlpha.g:6532:1: entryRuleAAdditiveOP returns [String current=null] : iv_ruleAAdditiveOP= ruleAAdditiveOP EOF ;
    public final String entryRuleAAdditiveOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAAdditiveOP = null;


        try {
            // InternalAlpha.g:6532:51: (iv_ruleAAdditiveOP= ruleAAdditiveOP EOF )
            // InternalAlpha.g:6533:2: iv_ruleAAdditiveOP= ruleAAdditiveOP EOF
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
    // InternalAlpha.g:6539:1: ruleAAdditiveOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAAdditiveOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:6545:2: ( (kw= '+' | kw= '-' ) )
            // InternalAlpha.g:6546:2: (kw= '+' | kw= '-' )
            {
            // InternalAlpha.g:6546:2: (kw= '+' | kw= '-' )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==43) ) {
                alt85=1;
            }
            else if ( (LA85_0==44) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalAlpha.g:6547:3: kw= '+'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAAdditiveOPAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:6553:3: kw= '-'
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
    // InternalAlpha.g:6562:1: entryRuleAMultiplicativeOP returns [String current=null] : iv_ruleAMultiplicativeOP= ruleAMultiplicativeOP EOF ;
    public final String entryRuleAMultiplicativeOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAMultiplicativeOP = null;


        try {
            // InternalAlpha.g:6562:57: (iv_ruleAMultiplicativeOP= ruleAMultiplicativeOP EOF )
            // InternalAlpha.g:6563:2: iv_ruleAMultiplicativeOP= ruleAMultiplicativeOP EOF
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
    // InternalAlpha.g:6569:1: ruleAMultiplicativeOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleAMultiplicativeOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:6575:2: ( (kw= '*' | kw= '/' ) )
            // InternalAlpha.g:6576:2: (kw= '*' | kw= '/' )
            {
            // InternalAlpha.g:6576:2: (kw= '*' | kw= '/' )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==45) ) {
                alt86=1;
            }
            else if ( (LA86_0==46) ) {
                alt86=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalAlpha.g:6577:3: kw= '*'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAMultiplicativeOPAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:6583:3: kw= '/'
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
    // InternalAlpha.g:6592:1: entryRuleAMINMAX_OP returns [String current=null] : iv_ruleAMINMAX_OP= ruleAMINMAX_OP EOF ;
    public final String entryRuleAMINMAX_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAMINMAX_OP = null;


        try {
            // InternalAlpha.g:6592:50: (iv_ruleAMINMAX_OP= ruleAMINMAX_OP EOF )
            // InternalAlpha.g:6593:2: iv_ruleAMINMAX_OP= ruleAMINMAX_OP EOF
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
    // InternalAlpha.g:6599:1: ruleAMINMAX_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'min' | kw= 'max' ) ;
    public final AntlrDatatypeRuleToken ruleAMINMAX_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:6605:2: ( (kw= 'min' | kw= 'max' ) )
            // InternalAlpha.g:6606:2: (kw= 'min' | kw= 'max' )
            {
            // InternalAlpha.g:6606:2: (kw= 'min' | kw= 'max' )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==68) ) {
                alt87=1;
            }
            else if ( (LA87_0==69) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalAlpha.g:6607:3: kw= 'min'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAMINMAX_OPAccess().getMinKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:6613:3: kw= 'max'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

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
    // InternalAlpha.g:6622:1: entryRuleAUnaryOP returns [String current=null] : iv_ruleAUnaryOP= ruleAUnaryOP EOF ;
    public final String entryRuleAUnaryOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAUnaryOP = null;


        try {
            // InternalAlpha.g:6622:48: (iv_ruleAUnaryOP= ruleAUnaryOP EOF )
            // InternalAlpha.g:6623:2: iv_ruleAUnaryOP= ruleAUnaryOP EOF
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
    // InternalAlpha.g:6629:1: ruleAUnaryOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'not' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAUnaryOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:6635:2: ( (kw= 'not' | kw= '-' ) )
            // InternalAlpha.g:6636:2: (kw= 'not' | kw= '-' )
            {
            // InternalAlpha.g:6636:2: (kw= 'not' | kw= '-' )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==74) ) {
                alt88=1;
            }
            else if ( (LA88_0==44) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalAlpha.g:6637:3: kw= 'not'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryOPAccess().getNotKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:6643:3: kw= '-'
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
    // InternalAlpha.g:6652:1: entryRulePolyhedralObject returns [EObject current=null] : iv_rulePolyhedralObject= rulePolyhedralObject EOF ;
    public final EObject entryRulePolyhedralObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyhedralObject = null;


        try {
            // InternalAlpha.g:6652:57: (iv_rulePolyhedralObject= rulePolyhedralObject EOF )
            // InternalAlpha.g:6653:2: iv_rulePolyhedralObject= rulePolyhedralObject EOF
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
    // InternalAlpha.g:6659:1: rulePolyhedralObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleCalculatorExpression ) ) ) ;
    public final EObject rulePolyhedralObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:6665:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleCalculatorExpression ) ) ) )
            // InternalAlpha.g:6666:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleCalculatorExpression ) ) )
            {
            // InternalAlpha.g:6666:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleCalculatorExpression ) ) )
            // InternalAlpha.g:6667:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleCalculatorExpression ) )
            {
            // InternalAlpha.g:6667:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:6668:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:6668:4: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:6669:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getPolyhedralObjectAccess().getEqualsSignKeyword_1());
            		
            // InternalAlpha.g:6689:3: ( (lv_expr_2_0= ruleCalculatorExpression ) )
            // InternalAlpha.g:6690:4: (lv_expr_2_0= ruleCalculatorExpression )
            {
            // InternalAlpha.g:6690:4: (lv_expr_2_0= ruleCalculatorExpression )
            // InternalAlpha.g:6691:5: lv_expr_2_0= ruleCalculatorExpression
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
    // InternalAlpha.g:6712:1: entryRuleCalculatorExpression returns [EObject current=null] : iv_ruleCalculatorExpression= ruleCalculatorExpression EOF ;
    public final EObject entryRuleCalculatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculatorExpression = null;


        try {
            // InternalAlpha.g:6712:61: (iv_ruleCalculatorExpression= ruleCalculatorExpression EOF )
            // InternalAlpha.g:6713:2: iv_ruleCalculatorExpression= ruleCalculatorExpression EOF
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
    // InternalAlpha.g:6719:1: ruleCalculatorExpression returns [EObject current=null] : (this_UnaryOrTerminalCalculatorExpression_0= ruleUnaryOrTerminalCalculatorExpression ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )* ) ;
    public final EObject ruleCalculatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOrTerminalCalculatorExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:6725:2: ( (this_UnaryOrTerminalCalculatorExpression_0= ruleUnaryOrTerminalCalculatorExpression ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )* ) )
            // InternalAlpha.g:6726:2: (this_UnaryOrTerminalCalculatorExpression_0= ruleUnaryOrTerminalCalculatorExpression ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )* )
            {
            // InternalAlpha.g:6726:2: (this_UnaryOrTerminalCalculatorExpression_0= ruleUnaryOrTerminalCalculatorExpression ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )* )
            // InternalAlpha.g:6727:3: this_UnaryOrTerminalCalculatorExpression_0= ruleUnaryOrTerminalCalculatorExpression ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getCalculatorExpressionAccess().getUnaryOrTerminalCalculatorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_74);
            this_UnaryOrTerminalCalculatorExpression_0=ruleUnaryOrTerminalCalculatorExpression();

            state._fsp--;


            			current = this_UnaryOrTerminalCalculatorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:6735:3: ( () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( ((LA89_0>=43 && LA89_0<=45)||LA89_0==61||(LA89_0>=82 && LA89_0<=84)) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalAlpha.g:6736:4: () ( (lv_operator_2_0= ruleABinaryCalcOp ) ) ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) )
            	    {
            	    // InternalAlpha.g:6736:4: ()
            	    // InternalAlpha.g:6737:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCalculatorExpressionAccess().getBinaryCalculatorExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:6743:4: ( (lv_operator_2_0= ruleABinaryCalcOp ) )
            	    // InternalAlpha.g:6744:5: (lv_operator_2_0= ruleABinaryCalcOp )
            	    {
            	    // InternalAlpha.g:6744:5: (lv_operator_2_0= ruleABinaryCalcOp )
            	    // InternalAlpha.g:6745:6: lv_operator_2_0= ruleABinaryCalcOp
            	    {

            	    						newCompositeNode(grammarAccess.getCalculatorExpressionAccess().getOperatorABinaryCalcOpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
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

            	    // InternalAlpha.g:6762:4: ( (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression ) )
            	    // InternalAlpha.g:6763:5: (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression )
            	    {
            	    // InternalAlpha.g:6763:5: (lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression )
            	    // InternalAlpha.g:6764:6: lv_right_3_0= ruleUnaryOrTerminalCalculatorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getCalculatorExpressionAccess().getRightUnaryOrTerminalCalculatorExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_74);
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
    // $ANTLR end "ruleCalculatorExpression"


    // $ANTLR start "entryRuleUnaryOrTerminalCalculatorExpression"
    // InternalAlpha.g:6786:1: entryRuleUnaryOrTerminalCalculatorExpression returns [EObject current=null] : iv_ruleUnaryOrTerminalCalculatorExpression= ruleUnaryOrTerminalCalculatorExpression EOF ;
    public final EObject entryRuleUnaryOrTerminalCalculatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOrTerminalCalculatorExpression = null;


        try {
            // InternalAlpha.g:6786:76: (iv_ruleUnaryOrTerminalCalculatorExpression= ruleUnaryOrTerminalCalculatorExpression EOF )
            // InternalAlpha.g:6787:2: iv_ruleUnaryOrTerminalCalculatorExpression= ruleUnaryOrTerminalCalculatorExpression EOF
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
    // InternalAlpha.g:6793:1: ruleUnaryOrTerminalCalculatorExpression returns [EObject current=null] : (this_UnaryCalculatorExpression_0= ruleUnaryCalculatorExpression | this_CalculatorExpressionTerminal_1= ruleCalculatorExpressionTerminal ) ;
    public final EObject ruleUnaryOrTerminalCalculatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryCalculatorExpression_0 = null;

        EObject this_CalculatorExpressionTerminal_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:6799:2: ( (this_UnaryCalculatorExpression_0= ruleUnaryCalculatorExpression | this_CalculatorExpressionTerminal_1= ruleCalculatorExpressionTerminal ) )
            // InternalAlpha.g:6800:2: (this_UnaryCalculatorExpression_0= ruleUnaryCalculatorExpression | this_CalculatorExpressionTerminal_1= ruleCalculatorExpressionTerminal )
            {
            // InternalAlpha.g:6800:2: (this_UnaryCalculatorExpression_0= ruleUnaryCalculatorExpression | this_CalculatorExpressionTerminal_1= ruleCalculatorExpressionTerminal )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( ((LA90_0>=76 && LA90_0<=81)) ) {
                alt90=1;
            }
            else if ( (LA90_0==RULE_ID||LA90_0==16||LA90_0==20||LA90_0==37) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // InternalAlpha.g:6801:3: this_UnaryCalculatorExpression_0= ruleUnaryCalculatorExpression
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
                    // InternalAlpha.g:6810:3: this_CalculatorExpressionTerminal_1= ruleCalculatorExpressionTerminal
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
    // InternalAlpha.g:6822:1: entryRuleCalculatorExpressionTerminal returns [EObject current=null] : iv_ruleCalculatorExpressionTerminal= ruleCalculatorExpressionTerminal EOF ;
    public final EObject entryRuleCalculatorExpressionTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculatorExpressionTerminal = null;


        try {
            // InternalAlpha.g:6822:69: (iv_ruleCalculatorExpressionTerminal= ruleCalculatorExpressionTerminal EOF )
            // InternalAlpha.g:6823:2: iv_ruleCalculatorExpressionTerminal= ruleCalculatorExpressionTerminal EOF
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
    // InternalAlpha.g:6829:1: ruleCalculatorExpressionTerminal returns [EObject current=null] : (this_JNIDomain_0= ruleJNIDomain | this_JNIRelation_1= ruleJNIRelation | this_JNIFunction_2= ruleJNIFunction | this_DefinedObject_3= ruleDefinedObject | this_RectangularDomain_4= ruleRectangularDomain | this_VariableDomain_5= ruleVariableDomain | (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' ) ) ;
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
            // InternalAlpha.g:6835:2: ( (this_JNIDomain_0= ruleJNIDomain | this_JNIRelation_1= ruleJNIRelation | this_JNIFunction_2= ruleJNIFunction | this_DefinedObject_3= ruleDefinedObject | this_RectangularDomain_4= ruleRectangularDomain | this_VariableDomain_5= ruleVariableDomain | (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' ) ) )
            // InternalAlpha.g:6836:2: (this_JNIDomain_0= ruleJNIDomain | this_JNIRelation_1= ruleJNIRelation | this_JNIFunction_2= ruleJNIFunction | this_DefinedObject_3= ruleDefinedObject | this_RectangularDomain_4= ruleRectangularDomain | this_VariableDomain_5= ruleVariableDomain | (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' ) )
            {
            // InternalAlpha.g:6836:2: (this_JNIDomain_0= ruleJNIDomain | this_JNIRelation_1= ruleJNIRelation | this_JNIFunction_2= ruleJNIFunction | this_DefinedObject_3= ruleDefinedObject | this_RectangularDomain_4= ruleRectangularDomain | this_VariableDomain_5= ruleVariableDomain | (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' ) )
            int alt91=7;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // InternalAlpha.g:6837:3: this_JNIDomain_0= ruleJNIDomain
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
                    // InternalAlpha.g:6846:3: this_JNIRelation_1= ruleJNIRelation
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
                    // InternalAlpha.g:6855:3: this_JNIFunction_2= ruleJNIFunction
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
                    // InternalAlpha.g:6864:3: this_DefinedObject_3= ruleDefinedObject
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
                    // InternalAlpha.g:6873:3: this_RectangularDomain_4= ruleRectangularDomain
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
                    // InternalAlpha.g:6882:3: this_VariableDomain_5= ruleVariableDomain
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
                    // InternalAlpha.g:6891:3: (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' )
                    {
                    // InternalAlpha.g:6891:3: (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' )
                    // InternalAlpha.g:6892:4: otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getCalculatorExpressionTerminalAccess().getLeftParenthesisKeyword_6_0());
                    			

                    				newCompositeNode(grammarAccess.getCalculatorExpressionTerminalAccess().getCalculatorExpressionParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_9);
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
    // InternalAlpha.g:6913:1: entryRuleUnaryCalculatorExpression returns [EObject current=null] : iv_ruleUnaryCalculatorExpression= ruleUnaryCalculatorExpression EOF ;
    public final EObject entryRuleUnaryCalculatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryCalculatorExpression = null;


        try {
            // InternalAlpha.g:6913:66: (iv_ruleUnaryCalculatorExpression= ruleUnaryCalculatorExpression EOF )
            // InternalAlpha.g:6914:2: iv_ruleUnaryCalculatorExpression= ruleUnaryCalculatorExpression EOF
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
    // InternalAlpha.g:6920:1: ruleUnaryCalculatorExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAUnaryCalcOp ) ) ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) ) ) ;
    public final EObject ruleUnaryCalculatorExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:6926:2: ( ( ( (lv_operator_0_0= ruleAUnaryCalcOp ) ) ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) ) ) )
            // InternalAlpha.g:6927:2: ( ( (lv_operator_0_0= ruleAUnaryCalcOp ) ) ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) ) )
            {
            // InternalAlpha.g:6927:2: ( ( (lv_operator_0_0= ruleAUnaryCalcOp ) ) ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) ) )
            // InternalAlpha.g:6928:3: ( (lv_operator_0_0= ruleAUnaryCalcOp ) ) ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) )
            {
            // InternalAlpha.g:6928:3: ( (lv_operator_0_0= ruleAUnaryCalcOp ) )
            // InternalAlpha.g:6929:4: (lv_operator_0_0= ruleAUnaryCalcOp )
            {
            // InternalAlpha.g:6929:4: (lv_operator_0_0= ruleAUnaryCalcOp )
            // InternalAlpha.g:6930:5: lv_operator_0_0= ruleAUnaryCalcOp
            {

            					newCompositeNode(grammarAccess.getUnaryCalculatorExpressionAccess().getOperatorAUnaryCalcOpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalAlpha.g:6947:3: ( (lv_expr_1_0= ruleCalculatorExpressionTerminal ) )
            // InternalAlpha.g:6948:4: (lv_expr_1_0= ruleCalculatorExpressionTerminal )
            {
            // InternalAlpha.g:6948:4: (lv_expr_1_0= ruleCalculatorExpressionTerminal )
            // InternalAlpha.g:6949:5: lv_expr_1_0= ruleCalculatorExpressionTerminal
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
    // InternalAlpha.g:6970:1: entryRuleVariableDomain returns [EObject current=null] : iv_ruleVariableDomain= ruleVariableDomain EOF ;
    public final EObject entryRuleVariableDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDomain = null;


        try {
            // InternalAlpha.g:6970:55: (iv_ruleVariableDomain= ruleVariableDomain EOF )
            // InternalAlpha.g:6971:2: iv_ruleVariableDomain= ruleVariableDomain EOF
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
    // InternalAlpha.g:6977:1: ruleVariableDomain returns [EObject current=null] : (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' ) ;
    public final EObject ruleVariableDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalAlpha.g:6983:2: ( (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' ) )
            // InternalAlpha.g:6984:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' )
            {
            // InternalAlpha.g:6984:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' )
            // InternalAlpha.g:6985:3: otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDomainAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAlpha.g:6989:3: ( (otherlv_1= RULE_ID ) )
            // InternalAlpha.g:6990:4: (otherlv_1= RULE_ID )
            {
            // InternalAlpha.g:6990:4: (otherlv_1= RULE_ID )
            // InternalAlpha.g:6991:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDomainRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_31); 

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
    // InternalAlpha.g:7010:1: entryRuleRectangularDomain returns [EObject current=null] : iv_ruleRectangularDomain= ruleRectangularDomain EOF ;
    public final EObject entryRuleRectangularDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangularDomain = null;


        try {
            // InternalAlpha.g:7010:58: (iv_ruleRectangularDomain= ruleRectangularDomain EOF )
            // InternalAlpha.g:7011:2: iv_ruleRectangularDomain= ruleRectangularDomain EOF
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
    // InternalAlpha.g:7017:1: ruleRectangularDomain returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleAISLExpression ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleAISLExpression ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? ) | (otherlv_11= '[' ( (lv_lowerBounds_12_0= ruleAISLExpression ) ) otherlv_13= ':' ( (lv_upperBounds_14_0= ruleAISLExpression ) ) (otherlv_15= ',' ( (lv_lowerBounds_16_0= ruleAISLExpression ) ) otherlv_17= ':' ( (lv_upperBounds_18_0= ruleAISLExpression ) ) )* otherlv_19= ']' (otherlv_20= 'as' otherlv_21= '[' ( (lv_indexNames_22_0= ruleIndexName ) ) (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )* otherlv_25= ']' )? ) ) ;
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
            // InternalAlpha.g:7023:2: ( ( (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleAISLExpression ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleAISLExpression ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? ) | (otherlv_11= '[' ( (lv_lowerBounds_12_0= ruleAISLExpression ) ) otherlv_13= ':' ( (lv_upperBounds_14_0= ruleAISLExpression ) ) (otherlv_15= ',' ( (lv_lowerBounds_16_0= ruleAISLExpression ) ) otherlv_17= ':' ( (lv_upperBounds_18_0= ruleAISLExpression ) ) )* otherlv_19= ']' (otherlv_20= 'as' otherlv_21= '[' ( (lv_indexNames_22_0= ruleIndexName ) ) (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )* otherlv_25= ']' )? ) ) )
            // InternalAlpha.g:7024:2: ( (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleAISLExpression ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleAISLExpression ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? ) | (otherlv_11= '[' ( (lv_lowerBounds_12_0= ruleAISLExpression ) ) otherlv_13= ':' ( (lv_upperBounds_14_0= ruleAISLExpression ) ) (otherlv_15= ',' ( (lv_lowerBounds_16_0= ruleAISLExpression ) ) otherlv_17= ':' ( (lv_upperBounds_18_0= ruleAISLExpression ) ) )* otherlv_19= ']' (otherlv_20= 'as' otherlv_21= '[' ( (lv_indexNames_22_0= ruleIndexName ) ) (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )* otherlv_25= ']' )? ) )
            {
            // InternalAlpha.g:7024:2: ( (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleAISLExpression ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleAISLExpression ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? ) | (otherlv_11= '[' ( (lv_lowerBounds_12_0= ruleAISLExpression ) ) otherlv_13= ':' ( (lv_upperBounds_14_0= ruleAISLExpression ) ) (otherlv_15= ',' ( (lv_lowerBounds_16_0= ruleAISLExpression ) ) otherlv_17= ':' ( (lv_upperBounds_18_0= ruleAISLExpression ) ) )* otherlv_19= ']' (otherlv_20= 'as' otherlv_21= '[' ( (lv_indexNames_22_0= ruleIndexName ) ) (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )* otherlv_25= ']' )? ) )
            int alt98=2;
            alt98 = dfa98.predict(input);
            switch (alt98) {
                case 1 :
                    // InternalAlpha.g:7025:3: (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleAISLExpression ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleAISLExpression ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? )
                    {
                    // InternalAlpha.g:7025:3: (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleAISLExpression ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleAISLExpression ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? )
                    // InternalAlpha.g:7026:4: otherlv_0= '[' ( (lv_upperBounds_1_0= ruleAISLExpression ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleAISLExpression ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )?
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_34); 

                    				newLeafNode(otherlv_0, grammarAccess.getRectangularDomainAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalAlpha.g:7030:4: ( (lv_upperBounds_1_0= ruleAISLExpression ) )
                    // InternalAlpha.g:7031:5: (lv_upperBounds_1_0= ruleAISLExpression )
                    {
                    // InternalAlpha.g:7031:5: (lv_upperBounds_1_0= ruleAISLExpression )
                    // InternalAlpha.g:7032:6: lv_upperBounds_1_0= ruleAISLExpression
                    {

                    						newCompositeNode(grammarAccess.getRectangularDomainAccess().getUpperBoundsAISLExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    // InternalAlpha.g:7049:4: (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleAISLExpression ) ) )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==38) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // InternalAlpha.g:7050:5: otherlv_2= ',' ( (lv_upperBounds_3_0= ruleAISLExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,38,FOLLOW_34); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getRectangularDomainAccess().getCommaKeyword_0_2_0());
                    	    				
                    	    // InternalAlpha.g:7054:5: ( (lv_upperBounds_3_0= ruleAISLExpression ) )
                    	    // InternalAlpha.g:7055:6: (lv_upperBounds_3_0= ruleAISLExpression )
                    	    {
                    	    // InternalAlpha.g:7055:6: (lv_upperBounds_3_0= ruleAISLExpression )
                    	    // InternalAlpha.g:7056:7: lv_upperBounds_3_0= ruleAISLExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getRectangularDomainAccess().getUpperBoundsAISLExpressionParserRuleCall_0_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
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
                    	    break loop92;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,39,FOLLOW_75); 

                    				newLeafNode(otherlv_4, grammarAccess.getRectangularDomainAccess().getRightSquareBracketKeyword_0_3());
                    			
                    // InternalAlpha.g:7078:4: (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==75) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // InternalAlpha.g:7079:5: otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']'
                            {
                            otherlv_5=(Token)match(input,75,FOLLOW_12); 

                            					newLeafNode(otherlv_5, grammarAccess.getRectangularDomainAccess().getAsKeyword_0_4_0());
                            				
                            otherlv_6=(Token)match(input,37,FOLLOW_5); 

                            					newLeafNode(otherlv_6, grammarAccess.getRectangularDomainAccess().getLeftSquareBracketKeyword_0_4_1());
                            				
                            // InternalAlpha.g:7087:5: ( (lv_indexNames_7_0= ruleIndexName ) )
                            // InternalAlpha.g:7088:6: (lv_indexNames_7_0= ruleIndexName )
                            {
                            // InternalAlpha.g:7088:6: (lv_indexNames_7_0= ruleIndexName )
                            // InternalAlpha.g:7089:7: lv_indexNames_7_0= ruleIndexName
                            {

                            							newCompositeNode(grammarAccess.getRectangularDomainAccess().getIndexNamesIndexNameParserRuleCall_0_4_2_0());
                            						
                            pushFollow(FOLLOW_33);
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

                            // InternalAlpha.g:7106:5: (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )*
                            loop93:
                            do {
                                int alt93=2;
                                int LA93_0 = input.LA(1);

                                if ( (LA93_0==38) ) {
                                    alt93=1;
                                }


                                switch (alt93) {
                            	case 1 :
                            	    // InternalAlpha.g:7107:6: otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) )
                            	    {
                            	    otherlv_8=(Token)match(input,38,FOLLOW_5); 

                            	    						newLeafNode(otherlv_8, grammarAccess.getRectangularDomainAccess().getCommaKeyword_0_4_3_0());
                            	    					
                            	    // InternalAlpha.g:7111:6: ( (lv_indexNames_9_0= ruleIndexName ) )
                            	    // InternalAlpha.g:7112:7: (lv_indexNames_9_0= ruleIndexName )
                            	    {
                            	    // InternalAlpha.g:7112:7: (lv_indexNames_9_0= ruleIndexName )
                            	    // InternalAlpha.g:7113:8: lv_indexNames_9_0= ruleIndexName
                            	    {

                            	    								newCompositeNode(grammarAccess.getRectangularDomainAccess().getIndexNamesIndexNameParserRuleCall_0_4_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_33);
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
                            	    break loop93;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,39,FOLLOW_2); 

                            					newLeafNode(otherlv_10, grammarAccess.getRectangularDomainAccess().getRightSquareBracketKeyword_0_4_4());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlpha.g:7138:3: (otherlv_11= '[' ( (lv_lowerBounds_12_0= ruleAISLExpression ) ) otherlv_13= ':' ( (lv_upperBounds_14_0= ruleAISLExpression ) ) (otherlv_15= ',' ( (lv_lowerBounds_16_0= ruleAISLExpression ) ) otherlv_17= ':' ( (lv_upperBounds_18_0= ruleAISLExpression ) ) )* otherlv_19= ']' (otherlv_20= 'as' otherlv_21= '[' ( (lv_indexNames_22_0= ruleIndexName ) ) (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )* otherlv_25= ']' )? )
                    {
                    // InternalAlpha.g:7138:3: (otherlv_11= '[' ( (lv_lowerBounds_12_0= ruleAISLExpression ) ) otherlv_13= ':' ( (lv_upperBounds_14_0= ruleAISLExpression ) ) (otherlv_15= ',' ( (lv_lowerBounds_16_0= ruleAISLExpression ) ) otherlv_17= ':' ( (lv_upperBounds_18_0= ruleAISLExpression ) ) )* otherlv_19= ']' (otherlv_20= 'as' otherlv_21= '[' ( (lv_indexNames_22_0= ruleIndexName ) ) (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )* otherlv_25= ']' )? )
                    // InternalAlpha.g:7139:4: otherlv_11= '[' ( (lv_lowerBounds_12_0= ruleAISLExpression ) ) otherlv_13= ':' ( (lv_upperBounds_14_0= ruleAISLExpression ) ) (otherlv_15= ',' ( (lv_lowerBounds_16_0= ruleAISLExpression ) ) otherlv_17= ':' ( (lv_upperBounds_18_0= ruleAISLExpression ) ) )* otherlv_19= ']' (otherlv_20= 'as' otherlv_21= '[' ( (lv_indexNames_22_0= ruleIndexName ) ) (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )* otherlv_25= ']' )?
                    {
                    otherlv_11=(Token)match(input,37,FOLLOW_34); 

                    				newLeafNode(otherlv_11, grammarAccess.getRectangularDomainAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAlpha.g:7143:4: ( (lv_lowerBounds_12_0= ruleAISLExpression ) )
                    // InternalAlpha.g:7144:5: (lv_lowerBounds_12_0= ruleAISLExpression )
                    {
                    // InternalAlpha.g:7144:5: (lv_lowerBounds_12_0= ruleAISLExpression )
                    // InternalAlpha.g:7145:6: lv_lowerBounds_12_0= ruleAISLExpression
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

                    otherlv_13=(Token)match(input,33,FOLLOW_34); 

                    				newLeafNode(otherlv_13, grammarAccess.getRectangularDomainAccess().getColonKeyword_1_2());
                    			
                    // InternalAlpha.g:7166:4: ( (lv_upperBounds_14_0= ruleAISLExpression ) )
                    // InternalAlpha.g:7167:5: (lv_upperBounds_14_0= ruleAISLExpression )
                    {
                    // InternalAlpha.g:7167:5: (lv_upperBounds_14_0= ruleAISLExpression )
                    // InternalAlpha.g:7168:6: lv_upperBounds_14_0= ruleAISLExpression
                    {

                    						newCompositeNode(grammarAccess.getRectangularDomainAccess().getUpperBoundsAISLExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    // InternalAlpha.g:7185:4: (otherlv_15= ',' ( (lv_lowerBounds_16_0= ruleAISLExpression ) ) otherlv_17= ':' ( (lv_upperBounds_18_0= ruleAISLExpression ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==38) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalAlpha.g:7186:5: otherlv_15= ',' ( (lv_lowerBounds_16_0= ruleAISLExpression ) ) otherlv_17= ':' ( (lv_upperBounds_18_0= ruleAISLExpression ) )
                    	    {
                    	    otherlv_15=(Token)match(input,38,FOLLOW_34); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getRectangularDomainAccess().getCommaKeyword_1_4_0());
                    	    				
                    	    // InternalAlpha.g:7190:5: ( (lv_lowerBounds_16_0= ruleAISLExpression ) )
                    	    // InternalAlpha.g:7191:6: (lv_lowerBounds_16_0= ruleAISLExpression )
                    	    {
                    	    // InternalAlpha.g:7191:6: (lv_lowerBounds_16_0= ruleAISLExpression )
                    	    // InternalAlpha.g:7192:7: lv_lowerBounds_16_0= ruleAISLExpression
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

                    	    otherlv_17=(Token)match(input,33,FOLLOW_34); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getRectangularDomainAccess().getColonKeyword_1_4_2());
                    	    				
                    	    // InternalAlpha.g:7213:5: ( (lv_upperBounds_18_0= ruleAISLExpression ) )
                    	    // InternalAlpha.g:7214:6: (lv_upperBounds_18_0= ruleAISLExpression )
                    	    {
                    	    // InternalAlpha.g:7214:6: (lv_upperBounds_18_0= ruleAISLExpression )
                    	    // InternalAlpha.g:7215:7: lv_upperBounds_18_0= ruleAISLExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getRectangularDomainAccess().getUpperBoundsAISLExpressionParserRuleCall_1_4_3_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
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
                    	    break loop95;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,39,FOLLOW_75); 

                    				newLeafNode(otherlv_19, grammarAccess.getRectangularDomainAccess().getRightSquareBracketKeyword_1_5());
                    			
                    // InternalAlpha.g:7237:4: (otherlv_20= 'as' otherlv_21= '[' ( (lv_indexNames_22_0= ruleIndexName ) ) (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )* otherlv_25= ']' )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==75) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // InternalAlpha.g:7238:5: otherlv_20= 'as' otherlv_21= '[' ( (lv_indexNames_22_0= ruleIndexName ) ) (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )* otherlv_25= ']'
                            {
                            otherlv_20=(Token)match(input,75,FOLLOW_12); 

                            					newLeafNode(otherlv_20, grammarAccess.getRectangularDomainAccess().getAsKeyword_1_6_0());
                            				
                            otherlv_21=(Token)match(input,37,FOLLOW_5); 

                            					newLeafNode(otherlv_21, grammarAccess.getRectangularDomainAccess().getLeftSquareBracketKeyword_1_6_1());
                            				
                            // InternalAlpha.g:7246:5: ( (lv_indexNames_22_0= ruleIndexName ) )
                            // InternalAlpha.g:7247:6: (lv_indexNames_22_0= ruleIndexName )
                            {
                            // InternalAlpha.g:7247:6: (lv_indexNames_22_0= ruleIndexName )
                            // InternalAlpha.g:7248:7: lv_indexNames_22_0= ruleIndexName
                            {

                            							newCompositeNode(grammarAccess.getRectangularDomainAccess().getIndexNamesIndexNameParserRuleCall_1_6_2_0());
                            						
                            pushFollow(FOLLOW_33);
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

                            // InternalAlpha.g:7265:5: (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )*
                            loop96:
                            do {
                                int alt96=2;
                                int LA96_0 = input.LA(1);

                                if ( (LA96_0==38) ) {
                                    alt96=1;
                                }


                                switch (alt96) {
                            	case 1 :
                            	    // InternalAlpha.g:7266:6: otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) )
                            	    {
                            	    otherlv_23=(Token)match(input,38,FOLLOW_5); 

                            	    						newLeafNode(otherlv_23, grammarAccess.getRectangularDomainAccess().getCommaKeyword_1_6_3_0());
                            	    					
                            	    // InternalAlpha.g:7270:6: ( (lv_indexNames_24_0= ruleIndexName ) )
                            	    // InternalAlpha.g:7271:7: (lv_indexNames_24_0= ruleIndexName )
                            	    {
                            	    // InternalAlpha.g:7271:7: (lv_indexNames_24_0= ruleIndexName )
                            	    // InternalAlpha.g:7272:8: lv_indexNames_24_0= ruleIndexName
                            	    {

                            	    								newCompositeNode(grammarAccess.getRectangularDomainAccess().getIndexNamesIndexNameParserRuleCall_1_6_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_33);
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
                            	    break loop96;
                                }
                            } while (true);

                            otherlv_25=(Token)match(input,39,FOLLOW_2); 

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
    // InternalAlpha.g:7300:1: entryRuleDefinedObject returns [EObject current=null] : iv_ruleDefinedObject= ruleDefinedObject EOF ;
    public final EObject entryRuleDefinedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinedObject = null;


        try {
            // InternalAlpha.g:7300:54: (iv_ruleDefinedObject= ruleDefinedObject EOF )
            // InternalAlpha.g:7301:2: iv_ruleDefinedObject= ruleDefinedObject EOF
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
    // InternalAlpha.g:7307:1: ruleDefinedObject returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDefinedObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:7313:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalAlpha.g:7314:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalAlpha.g:7314:2: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:7315:3: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:7315:3: (otherlv_0= RULE_ID )
            // InternalAlpha.g:7316:4: otherlv_0= RULE_ID
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
    // InternalAlpha.g:7330:1: entryRuleAUnaryCalcOp returns [String current=null] : iv_ruleAUnaryCalcOp= ruleAUnaryCalcOp EOF ;
    public final String entryRuleAUnaryCalcOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAUnaryCalcOp = null;


        try {
            // InternalAlpha.g:7330:52: (iv_ruleAUnaryCalcOp= ruleAUnaryCalcOp EOF )
            // InternalAlpha.g:7331:2: iv_ruleAUnaryCalcOp= ruleAUnaryCalcOp EOF
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
    // InternalAlpha.g:7337:1: ruleAUnaryCalcOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'domain' | kw= 'range' | kw= 'complement' | kw= 'affine-hull' | kw= 'poly-hull' | kw= 'reverse' ) ;
    public final AntlrDatatypeRuleToken ruleAUnaryCalcOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:7343:2: ( (kw= 'domain' | kw= 'range' | kw= 'complement' | kw= 'affine-hull' | kw= 'poly-hull' | kw= 'reverse' ) )
            // InternalAlpha.g:7344:2: (kw= 'domain' | kw= 'range' | kw= 'complement' | kw= 'affine-hull' | kw= 'poly-hull' | kw= 'reverse' )
            {
            // InternalAlpha.g:7344:2: (kw= 'domain' | kw= 'range' | kw= 'complement' | kw= 'affine-hull' | kw= 'poly-hull' | kw= 'reverse' )
            int alt99=6;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt99=1;
                }
                break;
            case 77:
                {
                alt99=2;
                }
                break;
            case 78:
                {
                alt99=3;
                }
                break;
            case 79:
                {
                alt99=4;
                }
                break;
            case 80:
                {
                alt99=5;
                }
                break;
            case 81:
                {
                alt99=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // InternalAlpha.g:7345:3: kw= 'domain'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getDomainKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:7351:3: kw= 'range'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getRangeKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:7357:3: kw= 'complement'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getComplementKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:7363:3: kw= 'affine-hull'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getAffineHullKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:7369:3: kw= 'poly-hull'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAUnaryCalcOpAccess().getPolyHullKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:7375:3: kw= 'reverse'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

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
    // InternalAlpha.g:7384:1: entryRuleABinaryCalcOp returns [String current=null] : iv_ruleABinaryCalcOp= ruleABinaryCalcOp EOF ;
    public final String entryRuleABinaryCalcOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleABinaryCalcOp = null;


        try {
            // InternalAlpha.g:7384:53: (iv_ruleABinaryCalcOp= ruleABinaryCalcOp EOF )
            // InternalAlpha.g:7385:2: iv_ruleABinaryCalcOp= ruleABinaryCalcOp EOF
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
    // InternalAlpha.g:7391:1: ruleABinaryCalcOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'cross' | kw= '+' | kw= '-' | kw= '*' | kw= '@' | kw= '->-' | kw= '->*' ) ;
    public final AntlrDatatypeRuleToken ruleABinaryCalcOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:7397:2: ( (kw= 'cross' | kw= '+' | kw= '-' | kw= '*' | kw= '@' | kw= '->-' | kw= '->*' ) )
            // InternalAlpha.g:7398:2: (kw= 'cross' | kw= '+' | kw= '-' | kw= '*' | kw= '@' | kw= '->-' | kw= '->*' )
            {
            // InternalAlpha.g:7398:2: (kw= 'cross' | kw= '+' | kw= '-' | kw= '*' | kw= '@' | kw= '->-' | kw= '->*' )
            int alt100=7;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt100=1;
                }
                break;
            case 43:
                {
                alt100=2;
                }
                break;
            case 44:
                {
                alt100=3;
                }
                break;
            case 45:
                {
                alt100=4;
                }
                break;
            case 61:
                {
                alt100=5;
                }
                break;
            case 83:
                {
                alt100=6;
                }
                break;
            case 84:
                {
                alt100=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // InternalAlpha.g:7399:3: kw= 'cross'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getCrossKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:7405:3: kw= '+'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getPlusSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:7411:3: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getHyphenMinusKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:7417:3: kw= '*'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getAsteriskKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:7423:3: kw= '@'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getCommercialAtKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:7429:3: kw= '->-'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getABinaryCalcOpAccess().getHyphenMinusGreaterThanSignHyphenMinusKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalAlpha.g:7435:3: kw= '->*'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

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


    protected DFA58 dfa58 = new DFA58(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA91 dfa91 = new DFA91(this);
    protected DFA98 dfa98 = new DFA98(this);
    static final String dfa_1s = "\27\uffff";
    static final String dfa_2s = "\3\uffff\3\22\1\25\20\uffff";
    static final String dfa_3s = "\2\4\1\uffff\4\16\1\20\7\uffff\1\16\1\4\5\uffff\1\4";
    static final String dfa_4s = "\1\110\1\112\1\uffff\4\111\1\20\7\uffff\1\111\1\57\5\uffff\1\45";
    static final String dfa_5s = "\2\uffff\1\2\5\uffff\1\7\1\10\1\11\1\12\1\13\1\15\1\1\2\uffff\1\5\1\3\1\14\1\6\1\4\1\uffff";
    static final String dfa_6s = "\27\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\1\5\1\uffff\1\3\1\4\7\uffff\1\1\24\uffff\1\10\2\uffff\1\11\2\uffff\1\14\1\uffff\1\14\2\uffff\2\14\12\uffff\1\2\1\uffff\1\7\2\12\1\13\1\15\1\uffff\5\14",
            "\1\17\1\16\1\uffff\2\16\7\uffff\1\16\3\uffff\1\16\17\uffff\1\21\1\20\2\uffff\1\16\2\uffff\3\16\2\uffff\2\16\7\uffff\1\16\1\uffff\2\16\1\uffff\5\16\1\uffff\5\16\1\uffff\1\16",
            "",
            "\1\22\2\uffff\1\22\15\uffff\1\22\2\uffff\1\22\2\uffff\1\21\1\22\4\uffff\4\22\1\uffff\2\22\2\uffff\4\22\2\uffff\1\22\11\uffff\2\22\2\uffff\2\22",
            "\1\22\2\uffff\1\22\15\uffff\1\22\2\uffff\1\22\2\uffff\1\21\1\22\4\uffff\4\22\1\uffff\2\22\2\uffff\4\22\2\uffff\1\22\11\uffff\2\22\2\uffff\2\22",
            "\1\22\2\uffff\1\22\15\uffff\1\22\2\uffff\1\22\2\uffff\1\21\1\22\4\uffff\4\22\1\uffff\2\22\2\uffff\4\22\2\uffff\1\22\11\uffff\2\22\2\uffff\2\22",
            "\1\25\1\uffff\1\23\1\25\13\uffff\1\23\1\uffff\1\25\2\uffff\1\25\2\uffff\1\21\1\25\1\uffff\1\24\2\uffff\4\25\1\uffff\2\25\2\uffff\4\25\2\uffff\1\25\11\uffff\2\25\2\uffff\2\25",
            "\1\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16\1\uffff\2\16\13\uffff\1\16\6\uffff\1\21\1\16\1\21\1\uffff\1\16\2\uffff\4\16\1\uffff\2\16\2\uffff\4\16\14\uffff\2\16\2\uffff\2\16",
            "\3\16\7\uffff\1\16\26\uffff\1\24\1\uffff\1\16\3\uffff\5\16",
            "",
            "",
            "",
            "",
            "",
            "\1\10\37\uffff\1\10\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3531:2: ( (otherlv_0= '(' this_AlphaExpression_1= ruleAlphaExpression otherlv_2= ')' ) | this_CaseExpression_3= ruleCaseExpression | this_ConstantExpression_4= ruleConstantExpression | this_VariableExpression_5= ruleVariableExpression | this_DependenceExpression_6= ruleDependenceExpression | this_FuzzyDependenceExpression_7= ruleFuzzyDependenceExpression | this_IndexExpression_8= ruleIndexExpression | this_FuzzyIndexExpression_9= ruleFuzzyIndexExpression | this_Reductions_10= ruleReductions | this_ConvolutionExpression_11= ruleConvolutionExpression | this_MultiArgExpression_12= ruleMultiArgExpression | this_ExternalMultiArgExpression_13= ruleExternalMultiArgExpression | this_SelectExpression_14= ruleSelectExpression )";
        }
    }
    static final String dfa_8s = "\55\uffff";
    static final String dfa_9s = "\1\77\2\20\2\4\11\46\1\35\11\46\1\35\1\20\1\4\2\20\1\4\1\20\1\4\1\uffff\1\35\1\4\1\uffff\1\4\1\uffff\1\35\1\4\5\uffff";
    static final String dfa_10s = "\1\100\2\20\2\110\24\46\1\45\1\4\2\45\1\4\2\45\1\uffff\1\46\1\45\1\uffff\1\45\1\uffff\1\46\1\45\5\uffff";
    static final String dfa_11s = "\40\uffff\1\1\2\uffff\1\3\1\uffff\1\2\2\uffff\1\4\1\5\1\7\1\6\1\10";
    static final String dfa_12s = "\55\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\2",
            "\1\3",
            "\1\4",
            "\1\16\46\uffff\1\14\1\uffff\1\15\2\uffff\1\11\1\12\22\uffff\1\5\1\6\1\7\1\10\1\13",
            "\1\30\46\uffff\1\26\1\uffff\1\27\2\uffff\1\23\1\24\22\uffff\1\17\1\20\1\21\1\22\1\25",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\32\10\uffff\1\33",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\35\10\uffff\1\36",
            "\1\37\24\uffff\1\40",
            "\1\41",
            "\1\42\24\uffff\1\43",
            "\1\44\24\uffff\1\45",
            "\1\46",
            "\1\47\24\uffff\1\50",
            "\1\40\37\uffff\1\40\1\51",
            "",
            "\1\32\10\uffff\1\33",
            "\1\43\37\uffff\1\43\1\52",
            "",
            "\1\45\37\uffff\1\45\1\53",
            "",
            "\1\35\10\uffff\1\36",
            "\1\50\37\uffff\1\50\1\54",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3676:2: (this_ReduceExpression_0= ruleReduceExpression | this_ArgReduceExpression_1= ruleArgReduceExpression | this_ExternalReduceExpression_2= ruleExternalReduceExpression | this_ExternalArgReduceExpression_3= ruleExternalArgReduceExpression | this_FuzzyReduceExpression_4= ruleFuzzyReduceExpression | this_FuzzyArgReduceExpression_5= ruleFuzzyArgReduceExpression | this_ExternalFuzzyReduceExpression_6= ruleExternalFuzzyReduceExpression | this_ExternalFuzzyArgReduceExpression_7= ruleExternalFuzzyArgReduceExpression )";
        }
    }
    static final String dfa_14s = "\31\uffff";
    static final String dfa_15s = "\1\24\1\4\1\uffff\1\4\1\uffff\12\4\1\25\11\4";
    static final String dfa_16s = "\1\24\1\121\1\uffff\1\57\1\uffff\12\57\1\124\11\57";
    static final String dfa_17s = "\2\uffff\1\2\1\uffff\1\1\24\uffff";
    static final String dfa_18s = "\31\uffff}>";
    static final String[] dfa_19s = {
            "\1\1",
            "\1\2\13\uffff\1\2\3\uffff\1\2\14\uffff\1\4\3\uffff\1\3\46\uffff\6\2",
            "",
            "\1\5\1\6\1\15\7\uffff\1\7\30\uffff\1\4\3\uffff\1\10\1\11\1\12\1\13\1\14",
            "",
            "\1\5\1\6\1\15\7\uffff\1\7\22\uffff\1\2\4\uffff\1\16\1\17\3\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\5\1\6\1\15\7\uffff\1\7\22\uffff\1\2\4\uffff\1\16\1\17\3\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\5\1\6\1\15\7\uffff\1\7\22\uffff\1\2\4\uffff\1\16\1\17\3\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\5\1\6\1\15\7\uffff\1\7\22\uffff\1\2\4\uffff\1\16\1\17\3\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\5\1\6\1\15\7\uffff\1\7\22\uffff\1\2\4\uffff\1\16\1\17\3\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\5\1\6\1\15\7\uffff\1\7\22\uffff\1\2\4\uffff\1\16\1\17\3\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\5\1\6\1\15\7\uffff\1\7\22\uffff\1\2\4\uffff\1\16\1\17\3\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\5\1\6\1\15\7\uffff\1\7\22\uffff\1\2\4\uffff\1\16\1\17\3\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\5\1\6\1\15\7\uffff\1\7\22\uffff\1\2\4\uffff\1\16\1\17\3\uffff\1\10\1\11\1\12\1\13\1\14",
            "\1\20\1\21\1\30\7\uffff\1\22\34\uffff\1\23\1\24\1\25\1\26\1\27",
            "\1\2\13\uffff\1\4\11\uffff\3\2\17\uffff\1\2\15\uffff\1\2\6\uffff\3\2",
            "\1\20\1\21\1\30\7\uffff\1\22\27\uffff\1\16\1\17\3\uffff\1\23\1\24\1\25\1\26\1\27",
            "\1\20\1\21\1\30\7\uffff\1\22\27\uffff\1\16\1\17\3\uffff\1\23\1\24\1\25\1\26\1\27",
            "\1\20\1\21\1\30\7\uffff\1\22\27\uffff\1\16\1\17\3\uffff\1\23\1\24\1\25\1\26\1\27",
            "\1\20\1\21\1\30\7\uffff\1\22\27\uffff\1\16\1\17\3\uffff\1\23\1\24\1\25\1\26\1\27",
            "\1\20\1\21\1\30\7\uffff\1\22\27\uffff\1\16\1\17\3\uffff\1\23\1\24\1\25\1\26\1\27",
            "\1\20\1\21\1\30\7\uffff\1\22\27\uffff\1\16\1\17\3\uffff\1\23\1\24\1\25\1\26\1\27",
            "\1\20\1\21\1\30\7\uffff\1\22\27\uffff\1\16\1\17\3\uffff\1\23\1\24\1\25\1\26\1\27",
            "\1\20\1\21\1\30\7\uffff\1\22\27\uffff\1\16\1\17\3\uffff\1\23\1\24\1\25\1\26\1\27",
            "\1\20\1\21\1\30\7\uffff\1\22\27\uffff\1\16\1\17\3\uffff\1\23\1\24\1\25\1\26\1\27"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "3854:2: ( ( ( ( (lv_domainExpr_0_1= ruleJNIDomain | lv_domainExpr_0_2= ruleJNIDomainInArrayNotation ) ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAlphaExpression ) ) ) | (otherlv_3= '{' ( (lv_domainExpr_4_0= ruleCalculatorExpression ) ) otherlv_5= '}' otherlv_6= ':' ( (lv_expr_7_0= ruleAlphaExpression ) ) ) )";
        }
    }
    static final String dfa_20s = "\40\uffff";
    static final String dfa_21s = "\3\4\2\uffff\1\4\2\uffff\1\21\1\uffff\11\4\1\41\1\4\2\uffff\11\4";
    static final String dfa_22s = "\2\45\1\121\2\uffff\1\57\2\uffff\1\124\1\uffff\11\57\1\44\1\57\2\uffff\11\57";
    static final String dfa_23s = "\3\uffff\1\4\1\5\1\uffff\1\6\1\7\1\uffff\1\3\13\uffff\1\2\1\1\11\uffff";
    static final String dfa_24s = "\40\uffff}>";
    static final String[] dfa_25s = {
            "\1\3\13\uffff\1\2\3\uffff\1\1\20\uffff\1\4",
            "\1\6\40\uffff\1\5",
            "\1\10\13\uffff\1\7\3\uffff\1\7\17\uffff\1\11\1\7\46\uffff\6\7",
            "",
            "",
            "\1\12\1\13\1\22\7\uffff\1\14\30\uffff\1\23\3\uffff\1\15\1\16\1\17\1\20\1\21",
            "",
            "",
            "\1\7\22\uffff\1\11\1\uffff\1\11\4\uffff\3\7\17\uffff\1\7\24\uffff\3\7",
            "",
            "\1\12\1\13\1\22\7\uffff\1\14\27\uffff\1\24\1\23\3\uffff\1\15\1\16\1\17\1\20\1\21",
            "\1\12\1\13\1\22\7\uffff\1\14\27\uffff\1\24\1\23\3\uffff\1\15\1\16\1\17\1\20\1\21",
            "\1\12\1\13\1\22\7\uffff\1\14\27\uffff\1\24\1\23\3\uffff\1\15\1\16\1\17\1\20\1\21",
            "\1\12\1\13\1\22\7\uffff\1\14\27\uffff\1\24\1\23\3\uffff\1\15\1\16\1\17\1\20\1\21",
            "\1\12\1\13\1\22\7\uffff\1\14\27\uffff\1\24\1\23\3\uffff\1\15\1\16\1\17\1\20\1\21",
            "\1\12\1\13\1\22\7\uffff\1\14\27\uffff\1\24\1\23\3\uffff\1\15\1\16\1\17\1\20\1\21",
            "\1\12\1\13\1\22\7\uffff\1\14\27\uffff\1\24\1\23\3\uffff\1\15\1\16\1\17\1\20\1\21",
            "\1\12\1\13\1\22\7\uffff\1\14\27\uffff\1\24\1\23\3\uffff\1\15\1\16\1\17\1\20\1\21",
            "\1\12\1\13\1\22\7\uffff\1\14\27\uffff\1\24\1\23\3\uffff\1\15\1\16\1\17\1\20\1\21",
            "\1\26\2\uffff\1\25",
            "\1\27\1\30\1\37\7\uffff\1\31\34\uffff\1\32\1\33\1\34\1\35\1\36",
            "",
            "",
            "\1\27\1\30\1\37\7\uffff\1\31\27\uffff\1\24\1\23\3\uffff\1\32\1\33\1\34\1\35\1\36",
            "\1\27\1\30\1\37\7\uffff\1\31\27\uffff\1\24\1\23\3\uffff\1\32\1\33\1\34\1\35\1\36",
            "\1\27\1\30\1\37\7\uffff\1\31\27\uffff\1\24\1\23\3\uffff\1\32\1\33\1\34\1\35\1\36",
            "\1\27\1\30\1\37\7\uffff\1\31\27\uffff\1\24\1\23\3\uffff\1\32\1\33\1\34\1\35\1\36",
            "\1\27\1\30\1\37\7\uffff\1\31\27\uffff\1\24\1\23\3\uffff\1\32\1\33\1\34\1\35\1\36",
            "\1\27\1\30\1\37\7\uffff\1\31\27\uffff\1\24\1\23\3\uffff\1\32\1\33\1\34\1\35\1\36",
            "\1\27\1\30\1\37\7\uffff\1\31\27\uffff\1\24\1\23\3\uffff\1\32\1\33\1\34\1\35\1\36",
            "\1\27\1\30\1\37\7\uffff\1\31\27\uffff\1\24\1\23\3\uffff\1\32\1\33\1\34\1\35\1\36",
            "\1\27\1\30\1\37\7\uffff\1\31\27\uffff\1\24\1\23\3\uffff\1\32\1\33\1\34\1\35\1\36"
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "6836:2: (this_JNIDomain_0= ruleJNIDomain | this_JNIRelation_1= ruleJNIRelation | this_JNIFunction_2= ruleJNIFunction | this_DefinedObject_3= ruleDefinedObject | this_RectangularDomain_4= ruleRectangularDomain | this_VariableDomain_5= ruleVariableDomain | (otherlv_6= '(' this_CalculatorExpression_7= ruleCalculatorExpression otherlv_8= ')' ) )";
        }
    }
    static final String dfa_26s = "\15\uffff";
    static final String dfa_27s = "\1\45\12\4\2\uffff";
    static final String dfa_28s = "\1\45\12\57\2\uffff";
    static final String dfa_29s = "\13\uffff\1\2\1\1";
    static final String dfa_30s = "\15\uffff}>";
    static final String[] dfa_31s = {
            "\1\1",
            "\1\2\1\3\1\12\7\uffff\1\4\34\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\2\1\3\1\12\7\uffff\1\4\22\uffff\1\13\4\uffff\2\14\3\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\2\1\3\1\12\7\uffff\1\4\22\uffff\1\13\4\uffff\2\14\3\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\2\1\3\1\12\7\uffff\1\4\22\uffff\1\13\4\uffff\2\14\3\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\2\1\3\1\12\7\uffff\1\4\22\uffff\1\13\4\uffff\2\14\3\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\2\1\3\1\12\7\uffff\1\4\22\uffff\1\13\4\uffff\2\14\3\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\2\1\3\1\12\7\uffff\1\4\22\uffff\1\13\4\uffff\2\14\3\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\2\1\3\1\12\7\uffff\1\4\22\uffff\1\13\4\uffff\2\14\3\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\2\1\3\1\12\7\uffff\1\4\22\uffff\1\13\4\uffff\2\14\3\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\2\1\3\1\12\7\uffff\1\4\22\uffff\1\13\4\uffff\2\14\3\uffff\1\5\1\6\1\7\1\10\1\11",
            "",
            ""
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA98 extends DFA {

        public DFA98(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 98;
            this.eot = dfa_26;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "7024:2: ( (otherlv_0= '[' ( (lv_upperBounds_1_0= ruleAISLExpression ) ) (otherlv_2= ',' ( (lv_upperBounds_3_0= ruleAISLExpression ) ) )* otherlv_4= ']' (otherlv_5= 'as' otherlv_6= '[' ( (lv_indexNames_7_0= ruleIndexName ) ) (otherlv_8= ',' ( (lv_indexNames_9_0= ruleIndexName ) ) )* otherlv_10= ']' )? ) | (otherlv_11= '[' ( (lv_lowerBounds_12_0= ruleAISLExpression ) ) otherlv_13= ':' ( (lv_upperBounds_14_0= ruleAISLExpression ) ) (otherlv_15= ',' ( (lv_lowerBounds_16_0= ruleAISLExpression ) ) otherlv_17= ':' ( (lv_upperBounds_18_0= ruleAISLExpression ) ) )* otherlv_19= ']' (otherlv_20= 'as' otherlv_21= '[' ( (lv_indexNames_22_0= ruleIndexName ) ) (otherlv_23= ',' ( (lv_indexNames_24_0= ruleIndexName ) ) )* otherlv_25= ']' )? ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000004CA002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000048A002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000068A000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000001EF800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001EF000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000009EE000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000009EC000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000009E8000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000110010L,0x000000000003F000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xDA033920001101B0L,0x00000000000005F7L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0100000208010012L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002400110012L,0x000000000003F000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00FFF8E200234070L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000F88000004070L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000F80000004070L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x4000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000FAA000004070L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000F8A000004070L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00FFF8E200034070L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00FFF8E200034072L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000F80000004072L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000F80000024070L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000F8A000004072L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0100000200000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000002200000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0xDA033920001301B0L,0x00000000000005F7L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0xDA033920003101B0L,0x00000000000005F7L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x4000010000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0003280000000000L,0x00000000000001F0L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x4000002000010000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0002000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x00F0000000004002L,0x0000000000000200L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x2000380000000002L,0x00000000001C0000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});

}