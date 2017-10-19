package alpha.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import alpha.services.AlphaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlphaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_OP_PLUS", "RULE_OP_MINUS", "RULE_OP_MUL", "RULE_OP_DIV", "RULE_OP_AND", "RULE_OP_OR", "RULE_INTERSECTION", "RULE_UNION", "RULE_WS", "RULE_OP_EQ", "RULE_OP_XOR", "RULE_OP_NAND", "RULE_OP_MIN", "RULE_OP_MAX", "RULE_BOOLEAN", "RULE_REAL", "RULE_OP_MOD", "RULE_OP_GE", "RULE_OP_GT", "RULE_OP_LE", "RULE_OP_LT", "RULE_OP_NE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'import'", "'external'", "';'", "'('", "')'", "'affine'", "'inputs'", "'outputs'", "'locals'", "'fuzzy'", "'let'", "'.'", "','", "'.*'", "'\\''", "'['", "']'", "':'", "'D'", "'times'", "'->'", "'over'", "'with'", "'not'", "'case'", "'@'", "'if'", "'then'", "'else'", "'val('", "'reduce'", "'argreduce'"
    };
    public static final int T__50=50;
    public static final int RULE_OP_AND=10;
    public static final int RULE_OP_EQ=15;
    public static final int RULE_BOOLEAN=20;
    public static final int RULE_OP_MIN=18;
    public static final int RULE_OP_NAND=17;
    public static final int RULE_OP_MUL=8;
    public static final int RULE_OP_NE=27;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_OP_MINUS=7;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_REAL=21;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_OP_GE=23;
    public static final int RULE_ML_COMMENT=29;
    public static final int RULE_UNION=13;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_OP_OR=11;
    public static final int RULE_OP_GT=24;
    public static final int RULE_STRING=28;
    public static final int RULE_OP_DIV=9;
    public static final int RULE_SL_COMMENT=30;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_OP_LE=25;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__32=32;
    public static final int RULE_OP_MOD=22;
    public static final int RULE_OP_PLUS=6;
    public static final int RULE_OP_LT=26;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=31;
    public static final int RULE_OP_MAX=19;
    public static final int RULE_INTERSECTION=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int RULE_OP_XOR=16;
    public static final int T__45=45;
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
        	return "AStart";
       	}

       	@Override
       	protected AlphaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAStart"
    // InternalAlpha.g:64:1: entryRuleAStart returns [EObject current=null] : iv_ruleAStart= ruleAStart EOF ;
    public final EObject entryRuleAStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAStart = null;


        try {
            // InternalAlpha.g:64:47: (iv_ruleAStart= ruleAStart EOF )
            // InternalAlpha.g:65:2: iv_ruleAStart= ruleAStart EOF
            {
             newCompositeNode(grammarAccess.getAStartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAStart=ruleAStart();

            state._fsp--;

             current =iv_ruleAStart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAStart"


    // $ANTLR start "ruleAStart"
    // InternalAlpha.g:71:1: ruleAStart returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleAStart() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:77:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalAlpha.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalAlpha.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==32||(LA1_0>=35 && LA1_0<=36)||LA1_0==40) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAlpha.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalAlpha.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalAlpha.g:80:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getAStartAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getAStartRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"alpha.Alpha.AbstractElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleAStart"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalAlpha.g:100:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalAlpha.g:100:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalAlpha.g:101:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalAlpha.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_APackageDeclaration_0= ruleAPackageDeclaration | this_AAffineSystem_1= ruleAAffineSystem | this_AImport_2= ruleAImport | this_AExternalFunctionDeclaration_3= ruleAExternalFunctionDeclaration ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_APackageDeclaration_0 = null;

        EObject this_AAffineSystem_1 = null;

        EObject this_AImport_2 = null;

        EObject this_AExternalFunctionDeclaration_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:113:2: ( (this_APackageDeclaration_0= ruleAPackageDeclaration | this_AAffineSystem_1= ruleAAffineSystem | this_AImport_2= ruleAImport | this_AExternalFunctionDeclaration_3= ruleAExternalFunctionDeclaration ) )
            // InternalAlpha.g:114:2: (this_APackageDeclaration_0= ruleAPackageDeclaration | this_AAffineSystem_1= ruleAAffineSystem | this_AImport_2= ruleAImport | this_AExternalFunctionDeclaration_3= ruleAExternalFunctionDeclaration )
            {
            // InternalAlpha.g:114:2: (this_APackageDeclaration_0= ruleAPackageDeclaration | this_AAffineSystem_1= ruleAAffineSystem | this_AImport_2= ruleAImport | this_AExternalFunctionDeclaration_3= ruleAExternalFunctionDeclaration )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt2=1;
                }
                break;
            case 40:
                {
                alt2=2;
                }
                break;
            case 35:
                {
                alt2=3;
                }
                break;
            case 36:
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
                    // InternalAlpha.g:115:3: this_APackageDeclaration_0= ruleAPackageDeclaration
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getAPackageDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_APackageDeclaration_0=ruleAPackageDeclaration();

                    state._fsp--;


                    			current = this_APackageDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:124:3: this_AAffineSystem_1= ruleAAffineSystem
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getAAffineSystemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AAffineSystem_1=ruleAAffineSystem();

                    state._fsp--;


                    			current = this_AAffineSystem_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:133:3: this_AImport_2= ruleAImport
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getAImportParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AImport_2=ruleAImport();

                    state._fsp--;


                    			current = this_AImport_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:142:3: this_AExternalFunctionDeclaration_3= ruleAExternalFunctionDeclaration
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getAExternalFunctionDeclarationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AExternalFunctionDeclaration_3=ruleAExternalFunctionDeclaration();

                    state._fsp--;


                    			current = this_AExternalFunctionDeclaration_3;
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleAPackageDeclaration"
    // InternalAlpha.g:154:1: entryRuleAPackageDeclaration returns [EObject current=null] : iv_ruleAPackageDeclaration= ruleAPackageDeclaration EOF ;
    public final EObject entryRuleAPackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAPackageDeclaration = null;


        try {
            // InternalAlpha.g:154:60: (iv_ruleAPackageDeclaration= ruleAPackageDeclaration EOF )
            // InternalAlpha.g:155:2: iv_ruleAPackageDeclaration= ruleAPackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAPackageDeclaration=ruleAPackageDeclaration();

            state._fsp--;

             current =iv_ruleAPackageDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAPackageDeclaration"


    // $ANTLR start "ruleAPackageDeclaration"
    // InternalAlpha.g:161:1: ruleAPackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleAPackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:167:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // InternalAlpha.g:168:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // InternalAlpha.g:168:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // InternalAlpha.g:169:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAPackageDeclarationAccess().getPackageKeyword_0());
            		
            // InternalAlpha.g:173:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAlpha.g:174:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAlpha.g:174:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAlpha.g:175:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getAPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAPackageDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"alpha.Alpha.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlpha.g:196:3: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==32||(LA3_0>=35 && LA3_0<=36)||LA3_0==40) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAlpha.g:197:4: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // InternalAlpha.g:197:4: (lv_elements_3_0= ruleAbstractElement )
            	    // InternalAlpha.g:198:5: lv_elements_3_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getAPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAPackageDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"alpha.Alpha.AbstractElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAPackageDeclarationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAPackageDeclaration"


    // $ANTLR start "entryRuleAImport"
    // InternalAlpha.g:223:1: entryRuleAImport returns [EObject current=null] : iv_ruleAImport= ruleAImport EOF ;
    public final EObject entryRuleAImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAImport = null;


        try {
            // InternalAlpha.g:223:48: (iv_ruleAImport= ruleAImport EOF )
            // InternalAlpha.g:224:2: iv_ruleAImport= ruleAImport EOF
            {
             newCompositeNode(grammarAccess.getAImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAImport=ruleAImport();

            state._fsp--;

             current =iv_ruleAImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAImport"


    // $ANTLR start "ruleAImport"
    // InternalAlpha.g:230:1: ruleAImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleAImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:236:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalAlpha.g:237:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalAlpha.g:237:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalAlpha.g:238:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAImportAccess().getImportKeyword_0());
            		
            // InternalAlpha.g:242:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalAlpha.g:243:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalAlpha.g:243:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalAlpha.g:244:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getAImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"alpha.Alpha.QualifiedNameWithWildcard");
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
    // $ANTLR end "ruleAImport"


    // $ANTLR start "entryRuleAExternalFunctionDeclaration"
    // InternalAlpha.g:265:1: entryRuleAExternalFunctionDeclaration returns [EObject current=null] : iv_ruleAExternalFunctionDeclaration= ruleAExternalFunctionDeclaration EOF ;
    public final EObject entryRuleAExternalFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAExternalFunctionDeclaration = null;


        try {
            // InternalAlpha.g:265:69: (iv_ruleAExternalFunctionDeclaration= ruleAExternalFunctionDeclaration EOF )
            // InternalAlpha.g:266:2: iv_ruleAExternalFunctionDeclaration= ruleAExternalFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAExternalFunctionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAExternalFunctionDeclaration=ruleAExternalFunctionDeclaration();

            state._fsp--;

             current =iv_ruleAExternalFunctionDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAExternalFunctionDeclaration"


    // $ANTLR start "ruleAExternalFunctionDeclaration"
    // InternalAlpha.g:272:1: ruleAExternalFunctionDeclaration returns [EObject current=null] : (otherlv_0= 'external' this_AExternalFunction_1= ruleAExternalFunction otherlv_2= ';' ) ;
    public final EObject ruleAExternalFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AExternalFunction_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:278:2: ( (otherlv_0= 'external' this_AExternalFunction_1= ruleAExternalFunction otherlv_2= ';' ) )
            // InternalAlpha.g:279:2: (otherlv_0= 'external' this_AExternalFunction_1= ruleAExternalFunction otherlv_2= ';' )
            {
            // InternalAlpha.g:279:2: (otherlv_0= 'external' this_AExternalFunction_1= ruleAExternalFunction otherlv_2= ';' )
            // InternalAlpha.g:280:3: otherlv_0= 'external' this_AExternalFunction_1= ruleAExternalFunction otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAExternalFunctionDeclarationAccess().getExternalKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAExternalFunctionDeclarationAccess().getAExternalFunctionParserRuleCall_1());
            		
            pushFollow(FOLLOW_7);
            this_AExternalFunction_1=ruleAExternalFunction();

            state._fsp--;


            			current = this_AExternalFunction_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAExternalFunctionDeclarationAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAExternalFunctionDeclaration"


    // $ANTLR start "entryRuleAExternalFunction"
    // InternalAlpha.g:300:1: entryRuleAExternalFunction returns [EObject current=null] : iv_ruleAExternalFunction= ruleAExternalFunction EOF ;
    public final EObject entryRuleAExternalFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAExternalFunction = null;


        try {
            // InternalAlpha.g:300:58: (iv_ruleAExternalFunction= ruleAExternalFunction EOF )
            // InternalAlpha.g:301:2: iv_ruleAExternalFunction= ruleAExternalFunction EOF
            {
             newCompositeNode(grammarAccess.getAExternalFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAExternalFunction=ruleAExternalFunction();

            state._fsp--;

             current =iv_ruleAExternalFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAExternalFunction"


    // $ANTLR start "ruleAExternalFunction"
    // InternalAlpha.g:307:1: ruleAExternalFunction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputCardinarity_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleAExternalFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_inputCardinarity_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAlpha.g:313:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputCardinarity_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalAlpha.g:314:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputCardinarity_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalAlpha.g:314:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputCardinarity_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalAlpha.g:315:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputCardinarity_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            // InternalAlpha.g:315:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:316:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:316:4: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:317:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAExternalFunctionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAExternalFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAExternalFunctionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:337:3: ( (lv_inputCardinarity_2_0= RULE_INT ) )
            // InternalAlpha.g:338:4: (lv_inputCardinarity_2_0= RULE_INT )
            {
            // InternalAlpha.g:338:4: (lv_inputCardinarity_2_0= RULE_INT )
            // InternalAlpha.g:339:5: lv_inputCardinarity_2_0= RULE_INT
            {
            lv_inputCardinarity_2_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_inputCardinarity_2_0, grammarAccess.getAExternalFunctionAccess().getInputCardinarityINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAExternalFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"inputCardinarity",
            						lv_inputCardinarity_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAExternalFunctionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAExternalFunction"


    // $ANTLR start "entryRuleAAffineSystem"
    // InternalAlpha.g:363:1: entryRuleAAffineSystem returns [EObject current=null] : iv_ruleAAffineSystem= ruleAAffineSystem EOF ;
    public final EObject entryRuleAAffineSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAAffineSystem = null;


        try {
            // InternalAlpha.g:363:54: (iv_ruleAAffineSystem= ruleAAffineSystem EOF )
            // InternalAlpha.g:364:2: iv_ruleAAffineSystem= ruleAAffineSystem EOF
            {
             newCompositeNode(grammarAccess.getAAffineSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAAffineSystem=ruleAAffineSystem();

            state._fsp--;

             current =iv_ruleAAffineSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAAffineSystem"


    // $ANTLR start "ruleAAffineSystem"
    // InternalAlpha.g:370:1: ruleAAffineSystem returns [EObject current=null] : (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameters_2_0= ruleAParamDomain ) ) (otherlv_3= 'inputs' ( (lv_inputDeclarations_4_0= ruleAVariableDeclaration ) )* )? (otherlv_5= 'outputs' ( (lv_outputDeclarations_6_0= ruleAVariableDeclaration ) )* )? (otherlv_7= 'locals' ( (lv_localvarDeclarations_8_0= ruleAVariableDeclaration ) )* )? (otherlv_9= 'fuzzy' ( (lv_fuzzyVariables_10_0= ruleAFuzzyVariableDeclaration ) )* )? (otherlv_11= 'let' ( (lv_useEquations_12_0= ruleAUseEquation ) )* ( (lv_equations_13_0= ruleAEquation ) )* )? otherlv_14= '.' ) ;
    public final EObject ruleAAffineSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_inputDeclarations_4_0 = null;

        EObject lv_outputDeclarations_6_0 = null;

        EObject lv_localvarDeclarations_8_0 = null;

        EObject lv_fuzzyVariables_10_0 = null;

        EObject lv_useEquations_12_0 = null;

        EObject lv_equations_13_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:376:2: ( (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameters_2_0= ruleAParamDomain ) ) (otherlv_3= 'inputs' ( (lv_inputDeclarations_4_0= ruleAVariableDeclaration ) )* )? (otherlv_5= 'outputs' ( (lv_outputDeclarations_6_0= ruleAVariableDeclaration ) )* )? (otherlv_7= 'locals' ( (lv_localvarDeclarations_8_0= ruleAVariableDeclaration ) )* )? (otherlv_9= 'fuzzy' ( (lv_fuzzyVariables_10_0= ruleAFuzzyVariableDeclaration ) )* )? (otherlv_11= 'let' ( (lv_useEquations_12_0= ruleAUseEquation ) )* ( (lv_equations_13_0= ruleAEquation ) )* )? otherlv_14= '.' ) )
            // InternalAlpha.g:377:2: (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameters_2_0= ruleAParamDomain ) ) (otherlv_3= 'inputs' ( (lv_inputDeclarations_4_0= ruleAVariableDeclaration ) )* )? (otherlv_5= 'outputs' ( (lv_outputDeclarations_6_0= ruleAVariableDeclaration ) )* )? (otherlv_7= 'locals' ( (lv_localvarDeclarations_8_0= ruleAVariableDeclaration ) )* )? (otherlv_9= 'fuzzy' ( (lv_fuzzyVariables_10_0= ruleAFuzzyVariableDeclaration ) )* )? (otherlv_11= 'let' ( (lv_useEquations_12_0= ruleAUseEquation ) )* ( (lv_equations_13_0= ruleAEquation ) )* )? otherlv_14= '.' )
            {
            // InternalAlpha.g:377:2: (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameters_2_0= ruleAParamDomain ) ) (otherlv_3= 'inputs' ( (lv_inputDeclarations_4_0= ruleAVariableDeclaration ) )* )? (otherlv_5= 'outputs' ( (lv_outputDeclarations_6_0= ruleAVariableDeclaration ) )* )? (otherlv_7= 'locals' ( (lv_localvarDeclarations_8_0= ruleAVariableDeclaration ) )* )? (otherlv_9= 'fuzzy' ( (lv_fuzzyVariables_10_0= ruleAFuzzyVariableDeclaration ) )* )? (otherlv_11= 'let' ( (lv_useEquations_12_0= ruleAUseEquation ) )* ( (lv_equations_13_0= ruleAEquation ) )* )? otherlv_14= '.' )
            // InternalAlpha.g:378:3: otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameters_2_0= ruleAParamDomain ) ) (otherlv_3= 'inputs' ( (lv_inputDeclarations_4_0= ruleAVariableDeclaration ) )* )? (otherlv_5= 'outputs' ( (lv_outputDeclarations_6_0= ruleAVariableDeclaration ) )* )? (otherlv_7= 'locals' ( (lv_localvarDeclarations_8_0= ruleAVariableDeclaration ) )* )? (otherlv_9= 'fuzzy' ( (lv_fuzzyVariables_10_0= ruleAFuzzyVariableDeclaration ) )* )? (otherlv_11= 'let' ( (lv_useEquations_12_0= ruleAUseEquation ) )* ( (lv_equations_13_0= ruleAEquation ) )* )? otherlv_14= '.'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAAffineSystemAccess().getAffineKeyword_0());
            		
            // InternalAlpha.g:382:3: ( (lv_name_1_0= ruleSystemName ) )
            // InternalAlpha.g:383:4: (lv_name_1_0= ruleSystemName )
            {
            // InternalAlpha.g:383:4: (lv_name_1_0= ruleSystemName )
            // InternalAlpha.g:384:5: lv_name_1_0= ruleSystemName
            {

            					newCompositeNode(grammarAccess.getAAffineSystemAccess().getNameSystemNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleSystemName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAAffineSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"alpha.Alpha.SystemName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:401:3: ( (lv_parameters_2_0= ruleAParamDomain ) )
            // InternalAlpha.g:402:4: (lv_parameters_2_0= ruleAParamDomain )
            {
            // InternalAlpha.g:402:4: (lv_parameters_2_0= ruleAParamDomain )
            // InternalAlpha.g:403:5: lv_parameters_2_0= ruleAParamDomain
            {

            					newCompositeNode(grammarAccess.getAAffineSystemAccess().getParametersAParamDomainParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_parameters_2_0=ruleAParamDomain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAAffineSystemRule());
            					}
            					set(
            						current,
            						"parameters",
            						lv_parameters_2_0,
            						"alpha.Alpha.AParamDomain");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:420:3: (otherlv_3= 'inputs' ( (lv_inputDeclarations_4_0= ruleAVariableDeclaration ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==41) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAlpha.g:421:4: otherlv_3= 'inputs' ( (lv_inputDeclarations_4_0= ruleAVariableDeclaration ) )*
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getAAffineSystemAccess().getInputsKeyword_3_0());
                    			
                    // InternalAlpha.g:425:4: ( (lv_inputDeclarations_4_0= ruleAVariableDeclaration ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalAlpha.g:426:5: (lv_inputDeclarations_4_0= ruleAVariableDeclaration )
                    	    {
                    	    // InternalAlpha.g:426:5: (lv_inputDeclarations_4_0= ruleAVariableDeclaration )
                    	    // InternalAlpha.g:427:6: lv_inputDeclarations_4_0= ruleAVariableDeclaration
                    	    {

                    	    						newCompositeNode(grammarAccess.getAAffineSystemAccess().getInputDeclarationsAVariableDeclarationParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_inputDeclarations_4_0=ruleAVariableDeclaration();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAAffineSystemRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inputDeclarations",
                    	    							lv_inputDeclarations_4_0,
                    	    							"alpha.Alpha.AVariableDeclaration");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAlpha.g:445:3: (otherlv_5= 'outputs' ( (lv_outputDeclarations_6_0= ruleAVariableDeclaration ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==42) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlpha.g:446:4: otherlv_5= 'outputs' ( (lv_outputDeclarations_6_0= ruleAVariableDeclaration ) )*
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getAAffineSystemAccess().getOutputsKeyword_4_0());
                    			
                    // InternalAlpha.g:450:4: ( (lv_outputDeclarations_6_0= ruleAVariableDeclaration ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalAlpha.g:451:5: (lv_outputDeclarations_6_0= ruleAVariableDeclaration )
                    	    {
                    	    // InternalAlpha.g:451:5: (lv_outputDeclarations_6_0= ruleAVariableDeclaration )
                    	    // InternalAlpha.g:452:6: lv_outputDeclarations_6_0= ruleAVariableDeclaration
                    	    {

                    	    						newCompositeNode(grammarAccess.getAAffineSystemAccess().getOutputDeclarationsAVariableDeclarationParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_outputDeclarations_6_0=ruleAVariableDeclaration();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAAffineSystemRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"outputDeclarations",
                    	    							lv_outputDeclarations_6_0,
                    	    							"alpha.Alpha.AVariableDeclaration");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAlpha.g:470:3: (otherlv_7= 'locals' ( (lv_localvarDeclarations_8_0= ruleAVariableDeclaration ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==43) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAlpha.g:471:4: otherlv_7= 'locals' ( (lv_localvarDeclarations_8_0= ruleAVariableDeclaration ) )*
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getAAffineSystemAccess().getLocalsKeyword_5_0());
                    			
                    // InternalAlpha.g:475:4: ( (lv_localvarDeclarations_8_0= ruleAVariableDeclaration ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalAlpha.g:476:5: (lv_localvarDeclarations_8_0= ruleAVariableDeclaration )
                    	    {
                    	    // InternalAlpha.g:476:5: (lv_localvarDeclarations_8_0= ruleAVariableDeclaration )
                    	    // InternalAlpha.g:477:6: lv_localvarDeclarations_8_0= ruleAVariableDeclaration
                    	    {

                    	    						newCompositeNode(grammarAccess.getAAffineSystemAccess().getLocalvarDeclarationsAVariableDeclarationParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_localvarDeclarations_8_0=ruleAVariableDeclaration();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAAffineSystemRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"localvarDeclarations",
                    	    							lv_localvarDeclarations_8_0,
                    	    							"alpha.Alpha.AVariableDeclaration");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAlpha.g:495:3: (otherlv_9= 'fuzzy' ( (lv_fuzzyVariables_10_0= ruleAFuzzyVariableDeclaration ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAlpha.g:496:4: otherlv_9= 'fuzzy' ( (lv_fuzzyVariables_10_0= ruleAFuzzyVariableDeclaration ) )*
                    {
                    otherlv_9=(Token)match(input,44,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getAAffineSystemAccess().getFuzzyKeyword_6_0());
                    			
                    // InternalAlpha.g:500:4: ( (lv_fuzzyVariables_10_0= ruleAFuzzyVariableDeclaration ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalAlpha.g:501:5: (lv_fuzzyVariables_10_0= ruleAFuzzyVariableDeclaration )
                    	    {
                    	    // InternalAlpha.g:501:5: (lv_fuzzyVariables_10_0= ruleAFuzzyVariableDeclaration )
                    	    // InternalAlpha.g:502:6: lv_fuzzyVariables_10_0= ruleAFuzzyVariableDeclaration
                    	    {

                    	    						newCompositeNode(grammarAccess.getAAffineSystemAccess().getFuzzyVariablesAFuzzyVariableDeclarationParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_fuzzyVariables_10_0=ruleAFuzzyVariableDeclaration();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAAffineSystemRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fuzzyVariables",
                    	    							lv_fuzzyVariables_10_0,
                    	    							"alpha.Alpha.AFuzzyVariableDeclaration");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAlpha.g:520:3: (otherlv_11= 'let' ( (lv_useEquations_12_0= ruleAUseEquation ) )* ( (lv_equations_13_0= ruleAEquation ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==45) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAlpha.g:521:4: otherlv_11= 'let' ( (lv_useEquations_12_0= ruleAUseEquation ) )* ( (lv_equations_13_0= ruleAEquation ) )*
                    {
                    otherlv_11=(Token)match(input,45,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getAAffineSystemAccess().getLetKeyword_7_0());
                    			
                    // InternalAlpha.g:525:4: ( (lv_useEquations_12_0= ruleAUseEquation ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==56) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalAlpha.g:526:5: (lv_useEquations_12_0= ruleAUseEquation )
                    	    {
                    	    // InternalAlpha.g:526:5: (lv_useEquations_12_0= ruleAUseEquation )
                    	    // InternalAlpha.g:527:6: lv_useEquations_12_0= ruleAUseEquation
                    	    {

                    	    						newCompositeNode(grammarAccess.getAAffineSystemAccess().getUseEquationsAUseEquationParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_useEquations_12_0=ruleAUseEquation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAAffineSystemRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"useEquations",
                    	    							lv_useEquations_12_0,
                    	    							"alpha.Alpha.AUseEquation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // InternalAlpha.g:544:4: ( (lv_equations_13_0= ruleAEquation ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalAlpha.g:545:5: (lv_equations_13_0= ruleAEquation )
                    	    {
                    	    // InternalAlpha.g:545:5: (lv_equations_13_0= ruleAEquation )
                    	    // InternalAlpha.g:546:6: lv_equations_13_0= ruleAEquation
                    	    {

                    	    						newCompositeNode(grammarAccess.getAAffineSystemAccess().getEquationsAEquationParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_equations_13_0=ruleAEquation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAAffineSystemRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"equations",
                    	    							lv_equations_13_0,
                    	    							"alpha.Alpha.AEquation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getAAffineSystemAccess().getFullStopKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAAffineSystem"


    // $ANTLR start "entryRuleAVariableDeclaration"
    // InternalAlpha.g:572:1: entryRuleAVariableDeclaration returns [EObject current=null] : iv_ruleAVariableDeclaration= ruleAVariableDeclaration EOF ;
    public final EObject entryRuleAVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAVariableDeclaration = null;


        try {
            // InternalAlpha.g:572:61: (iv_ruleAVariableDeclaration= ruleAVariableDeclaration EOF )
            // InternalAlpha.g:573:2: iv_ruleAVariableDeclaration= ruleAVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAVariableDeclaration=ruleAVariableDeclaration();

            state._fsp--;

             current =iv_ruleAVariableDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAVariableDeclaration"


    // $ANTLR start "ruleAVariableDeclaration"
    // InternalAlpha.g:579:1: ruleAVariableDeclaration returns [EObject current=null] : ( ( (lv_varList_0_0= ruleAVariableList ) ) ( (lv_domain_1_0= ruleADomainExpression ) )? otherlv_2= ';' ) ;
    public final EObject ruleAVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_varList_0_0 = null;

        EObject lv_domain_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:585:2: ( ( ( (lv_varList_0_0= ruleAVariableList ) ) ( (lv_domain_1_0= ruleADomainExpression ) )? otherlv_2= ';' ) )
            // InternalAlpha.g:586:2: ( ( (lv_varList_0_0= ruleAVariableList ) ) ( (lv_domain_1_0= ruleADomainExpression ) )? otherlv_2= ';' )
            {
            // InternalAlpha.g:586:2: ( ( (lv_varList_0_0= ruleAVariableList ) ) ( (lv_domain_1_0= ruleADomainExpression ) )? otherlv_2= ';' )
            // InternalAlpha.g:587:3: ( (lv_varList_0_0= ruleAVariableList ) ) ( (lv_domain_1_0= ruleADomainExpression ) )? otherlv_2= ';'
            {
            // InternalAlpha.g:587:3: ( (lv_varList_0_0= ruleAVariableList ) )
            // InternalAlpha.g:588:4: (lv_varList_0_0= ruleAVariableList )
            {
            // InternalAlpha.g:588:4: (lv_varList_0_0= ruleAVariableList )
            // InternalAlpha.g:589:5: lv_varList_0_0= ruleAVariableList
            {

            					newCompositeNode(grammarAccess.getAVariableDeclarationAccess().getVarListAVariableListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_varList_0_0=ruleAVariableList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAVariableDeclarationRule());
            					}
            					add(
            						current,
            						"varList",
            						lv_varList_0_0,
            						"alpha.Alpha.AVariableList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:606:3: ( (lv_domain_1_0= ruleADomainExpression ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33||LA15_0==53) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAlpha.g:607:4: (lv_domain_1_0= ruleADomainExpression )
                    {
                    // InternalAlpha.g:607:4: (lv_domain_1_0= ruleADomainExpression )
                    // InternalAlpha.g:608:5: lv_domain_1_0= ruleADomainExpression
                    {

                    					newCompositeNode(grammarAccess.getAVariableDeclarationAccess().getDomainADomainExpressionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_domain_1_0=ruleADomainExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAVariableDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"domain",
                    						lv_domain_1_0,
                    						"alpha.Alpha.ADomainExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAVariableDeclarationAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAVariableDeclaration"


    // $ANTLR start "entryRuleAVariableList"
    // InternalAlpha.g:633:1: entryRuleAVariableList returns [EObject current=null] : iv_ruleAVariableList= ruleAVariableList EOF ;
    public final EObject entryRuleAVariableList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAVariableList = null;


        try {
            // InternalAlpha.g:633:54: (iv_ruleAVariableList= ruleAVariableList EOF )
            // InternalAlpha.g:634:2: iv_ruleAVariableList= ruleAVariableList EOF
            {
             newCompositeNode(grammarAccess.getAVariableListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAVariableList=ruleAVariableList();

            state._fsp--;

             current =iv_ruleAVariableList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAVariableList"


    // $ANTLR start "ruleAVariableList"
    // InternalAlpha.g:640:1: ruleAVariableList returns [EObject current=null] : ( ( (lv_vars_0_0= ruleAVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleAVariable ) ) )* ) ;
    public final EObject ruleAVariableList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_vars_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:646:2: ( ( ( (lv_vars_0_0= ruleAVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleAVariable ) ) )* ) )
            // InternalAlpha.g:647:2: ( ( (lv_vars_0_0= ruleAVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleAVariable ) ) )* )
            {
            // InternalAlpha.g:647:2: ( ( (lv_vars_0_0= ruleAVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleAVariable ) ) )* )
            // InternalAlpha.g:648:3: ( (lv_vars_0_0= ruleAVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleAVariable ) ) )*
            {
            // InternalAlpha.g:648:3: ( (lv_vars_0_0= ruleAVariable ) )
            // InternalAlpha.g:649:4: (lv_vars_0_0= ruleAVariable )
            {
            // InternalAlpha.g:649:4: (lv_vars_0_0= ruleAVariable )
            // InternalAlpha.g:650:5: lv_vars_0_0= ruleAVariable
            {

            					newCompositeNode(grammarAccess.getAVariableListAccess().getVarsAVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_vars_0_0=ruleAVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAVariableListRule());
            					}
            					add(
            						current,
            						"vars",
            						lv_vars_0_0,
            						"alpha.Alpha.AVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:667:3: (otherlv_1= ',' ( (lv_vars_2_0= ruleAVariable ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==47) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAlpha.g:668:4: otherlv_1= ',' ( (lv_vars_2_0= ruleAVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,47,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAVariableListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalAlpha.g:672:4: ( (lv_vars_2_0= ruleAVariable ) )
            	    // InternalAlpha.g:673:5: (lv_vars_2_0= ruleAVariable )
            	    {
            	    // InternalAlpha.g:673:5: (lv_vars_2_0= ruleAVariable )
            	    // InternalAlpha.g:674:6: lv_vars_2_0= ruleAVariable
            	    {

            	    						newCompositeNode(grammarAccess.getAVariableListAccess().getVarsAVariableParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_vars_2_0=ruleAVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAVariableListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_2_0,
            	    							"alpha.Alpha.AVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleAVariableList"


    // $ANTLR start "entryRuleAVariable"
    // InternalAlpha.g:696:1: entryRuleAVariable returns [EObject current=null] : iv_ruleAVariable= ruleAVariable EOF ;
    public final EObject entryRuleAVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAVariable = null;


        try {
            // InternalAlpha.g:696:50: (iv_ruleAVariable= ruleAVariable EOF )
            // InternalAlpha.g:697:2: iv_ruleAVariable= ruleAVariable EOF
            {
             newCompositeNode(grammarAccess.getAVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAVariable=ruleAVariable();

            state._fsp--;

             current =iv_ruleAVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAVariable"


    // $ANTLR start "ruleAVariable"
    // InternalAlpha.g:703:1: ruleAVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:709:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalAlpha.g:710:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalAlpha.g:710:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:711:3: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:711:3: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:712:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleAVariable"


    // $ANTLR start "entryRuleAFuzzyVariableDeclaration"
    // InternalAlpha.g:731:1: entryRuleAFuzzyVariableDeclaration returns [EObject current=null] : iv_ruleAFuzzyVariableDeclaration= ruleAFuzzyVariableDeclaration EOF ;
    public final EObject entryRuleAFuzzyVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAFuzzyVariableDeclaration = null;


        try {
            // InternalAlpha.g:731:66: (iv_ruleAFuzzyVariableDeclaration= ruleAFuzzyVariableDeclaration EOF )
            // InternalAlpha.g:732:2: iv_ruleAFuzzyVariableDeclaration= ruleAFuzzyVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAFuzzyVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAFuzzyVariableDeclaration=ruleAFuzzyVariableDeclaration();

            state._fsp--;

             current =iv_ruleAFuzzyVariableDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAFuzzyVariableDeclaration"


    // $ANTLR start "ruleAFuzzyVariableDeclaration"
    // InternalAlpha.g:738:1: ruleAFuzzyVariableDeclaration returns [EObject current=null] : ( ( (lv_varList_0_0= ruleAVariableList ) ) ( (lv_relation_1_0= ruleARelation ) ) otherlv_2= ';' ) ;
    public final EObject ruleAFuzzyVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_varList_0_0 = null;

        EObject lv_relation_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:744:2: ( ( ( (lv_varList_0_0= ruleAVariableList ) ) ( (lv_relation_1_0= ruleARelation ) ) otherlv_2= ';' ) )
            // InternalAlpha.g:745:2: ( ( (lv_varList_0_0= ruleAVariableList ) ) ( (lv_relation_1_0= ruleARelation ) ) otherlv_2= ';' )
            {
            // InternalAlpha.g:745:2: ( ( (lv_varList_0_0= ruleAVariableList ) ) ( (lv_relation_1_0= ruleARelation ) ) otherlv_2= ';' )
            // InternalAlpha.g:746:3: ( (lv_varList_0_0= ruleAVariableList ) ) ( (lv_relation_1_0= ruleARelation ) ) otherlv_2= ';'
            {
            // InternalAlpha.g:746:3: ( (lv_varList_0_0= ruleAVariableList ) )
            // InternalAlpha.g:747:4: (lv_varList_0_0= ruleAVariableList )
            {
            // InternalAlpha.g:747:4: (lv_varList_0_0= ruleAVariableList )
            // InternalAlpha.g:748:5: lv_varList_0_0= ruleAVariableList
            {

            					newCompositeNode(grammarAccess.getAFuzzyVariableDeclarationAccess().getVarListAVariableListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_varList_0_0=ruleAVariableList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAFuzzyVariableDeclarationRule());
            					}
            					add(
            						current,
            						"varList",
            						lv_varList_0_0,
            						"alpha.Alpha.AVariableList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:765:3: ( (lv_relation_1_0= ruleARelation ) )
            // InternalAlpha.g:766:4: (lv_relation_1_0= ruleARelation )
            {
            // InternalAlpha.g:766:4: (lv_relation_1_0= ruleARelation )
            // InternalAlpha.g:767:5: lv_relation_1_0= ruleARelation
            {

            					newCompositeNode(grammarAccess.getAFuzzyVariableDeclarationAccess().getRelationARelationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_relation_1_0=ruleARelation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAFuzzyVariableDeclarationRule());
            					}
            					set(
            						current,
            						"relation",
            						lv_relation_1_0,
            						"alpha.Alpha.ARelation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAFuzzyVariableDeclarationAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAFuzzyVariableDeclaration"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAlpha.g:792:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlpha.g:792:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlpha.g:793:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlpha.g:799:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAlpha.g:805:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAlpha.g:806:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAlpha.g:806:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAlpha.g:807:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalAlpha.g:814:3: (kw= '.' this_ID_2= RULE_ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==46) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAlpha.g:815:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,46,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalAlpha.g:832:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAlpha.g:832:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAlpha.g:833:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalAlpha.g:839:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:845:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalAlpha.g:846:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalAlpha.g:846:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalAlpha.g:847:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:857:3: (kw= '.*' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==48) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAlpha.g:858:4: kw= '.*'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

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
    // InternalAlpha.g:868:1: entryRuleSystemName returns [String current=null] : iv_ruleSystemName= ruleSystemName EOF ;
    public final String entryRuleSystemName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSystemName = null;


        try {
            // InternalAlpha.g:868:50: (iv_ruleSystemName= ruleSystemName EOF )
            // InternalAlpha.g:869:2: iv_ruleSystemName= ruleSystemName EOF
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
    // InternalAlpha.g:875:1: ruleSystemName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleSystemName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:881:2: (this_ID_0= RULE_ID )
            // InternalAlpha.g:882:2: this_ID_0= RULE_ID
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
    // InternalAlpha.g:892:1: entryRuleIndexName returns [String current=null] : iv_ruleIndexName= ruleIndexName EOF ;
    public final String entryRuleIndexName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIndexName = null;


        try {
            // InternalAlpha.g:892:49: (iv_ruleIndexName= ruleIndexName EOF )
            // InternalAlpha.g:893:2: iv_ruleIndexName= ruleIndexName EOF
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
    // InternalAlpha.g:899:1: ruleIndexName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '\\'' )* ) ;
    public final AntlrDatatypeRuleToken ruleIndexName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:905:2: ( (this_ID_0= RULE_ID (kw= '\\'' )* ) )
            // InternalAlpha.g:906:2: (this_ID_0= RULE_ID (kw= '\\'' )* )
            {
            // InternalAlpha.g:906:2: (this_ID_0= RULE_ID (kw= '\\'' )* )
            // InternalAlpha.g:907:3: this_ID_0= RULE_ID (kw= '\\'' )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getIndexNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalAlpha.g:914:3: (kw= '\\'' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==49) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAlpha.g:915:4: kw= '\\''
            	    {
            	    kw=(Token)match(input,49,FOLLOW_23); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getIndexNameAccess().getApostropheKeyword_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop19;
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


    // $ANTLR start "entryRuleAIndexDimension"
    // InternalAlpha.g:925:1: entryRuleAIndexDimension returns [EObject current=null] : iv_ruleAIndexDimension= ruleAIndexDimension EOF ;
    public final EObject entryRuleAIndexDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAIndexDimension = null;


        try {
            // InternalAlpha.g:925:56: (iv_ruleAIndexDimension= ruleAIndexDimension EOF )
            // InternalAlpha.g:926:2: iv_ruleAIndexDimension= ruleAIndexDimension EOF
            {
             newCompositeNode(grammarAccess.getAIndexDimensionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAIndexDimension=ruleAIndexDimension();

            state._fsp--;

             current =iv_ruleAIndexDimension; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAIndexDimension"


    // $ANTLR start "ruleAIndexDimension"
    // InternalAlpha.g:932:1: ruleAIndexDimension returns [EObject current=null] : ( (lv_name_0_0= ruleIndexName ) ) ;
    public final EObject ruleAIndexDimension() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:938:2: ( ( (lv_name_0_0= ruleIndexName ) ) )
            // InternalAlpha.g:939:2: ( (lv_name_0_0= ruleIndexName ) )
            {
            // InternalAlpha.g:939:2: ( (lv_name_0_0= ruleIndexName ) )
            // InternalAlpha.g:940:3: (lv_name_0_0= ruleIndexName )
            {
            // InternalAlpha.g:940:3: (lv_name_0_0= ruleIndexName )
            // InternalAlpha.g:941:4: lv_name_0_0= ruleIndexName
            {

            				newCompositeNode(grammarAccess.getAIndexDimensionAccess().getNameIndexNameParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleIndexName();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAIndexDimensionRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"alpha.Alpha.IndexName");
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
    // $ANTLR end "ruleAIndexDimension"


    // $ANTLR start "entryRuleAIndexList"
    // InternalAlpha.g:961:1: entryRuleAIndexList returns [EObject current=null] : iv_ruleAIndexList= ruleAIndexList EOF ;
    public final EObject entryRuleAIndexList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAIndexList = null;


        try {
            // InternalAlpha.g:961:51: (iv_ruleAIndexList= ruleAIndexList EOF )
            // InternalAlpha.g:962:2: iv_ruleAIndexList= ruleAIndexList EOF
            {
             newCompositeNode(grammarAccess.getAIndexListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAIndexList=ruleAIndexList();

            state._fsp--;

             current =iv_ruleAIndexList; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalAlpha.g:968:1: ruleAIndexList returns [EObject current=null] : ( () ( ( (lv_ids_1_0= ruleAIndexDimension ) ) (otherlv_2= ',' ( (lv_ids_3_0= ruleAIndexDimension ) ) )* )? ) ;
    public final EObject ruleAIndexList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_ids_1_0 = null;

        EObject lv_ids_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:974:2: ( ( () ( ( (lv_ids_1_0= ruleAIndexDimension ) ) (otherlv_2= ',' ( (lv_ids_3_0= ruleAIndexDimension ) ) )* )? ) )
            // InternalAlpha.g:975:2: ( () ( ( (lv_ids_1_0= ruleAIndexDimension ) ) (otherlv_2= ',' ( (lv_ids_3_0= ruleAIndexDimension ) ) )* )? )
            {
            // InternalAlpha.g:975:2: ( () ( ( (lv_ids_1_0= ruleAIndexDimension ) ) (otherlv_2= ',' ( (lv_ids_3_0= ruleAIndexDimension ) ) )* )? )
            // InternalAlpha.g:976:3: () ( ( (lv_ids_1_0= ruleAIndexDimension ) ) (otherlv_2= ',' ( (lv_ids_3_0= ruleAIndexDimension ) ) )* )?
            {
            // InternalAlpha.g:976:3: ()
            // InternalAlpha.g:977:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAIndexListAccess().getAIndexListAction_0(),
            					current);
            			

            }

            // InternalAlpha.g:983:3: ( ( (lv_ids_1_0= ruleAIndexDimension ) ) (otherlv_2= ',' ( (lv_ids_3_0= ruleAIndexDimension ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAlpha.g:984:4: ( (lv_ids_1_0= ruleAIndexDimension ) ) (otherlv_2= ',' ( (lv_ids_3_0= ruleAIndexDimension ) ) )*
                    {
                    // InternalAlpha.g:984:4: ( (lv_ids_1_0= ruleAIndexDimension ) )
                    // InternalAlpha.g:985:5: (lv_ids_1_0= ruleAIndexDimension )
                    {
                    // InternalAlpha.g:985:5: (lv_ids_1_0= ruleAIndexDimension )
                    // InternalAlpha.g:986:6: lv_ids_1_0= ruleAIndexDimension
                    {

                    						newCompositeNode(grammarAccess.getAIndexListAccess().getIdsAIndexDimensionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_ids_1_0=ruleAIndexDimension();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAIndexListRule());
                    						}
                    						add(
                    							current,
                    							"ids",
                    							lv_ids_1_0,
                    							"alpha.Alpha.AIndexDimension");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlpha.g:1003:4: (otherlv_2= ',' ( (lv_ids_3_0= ruleAIndexDimension ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==47) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalAlpha.g:1004:5: otherlv_2= ',' ( (lv_ids_3_0= ruleAIndexDimension ) )
                    	    {
                    	    otherlv_2=(Token)match(input,47,FOLLOW_4); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getAIndexListAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalAlpha.g:1008:5: ( (lv_ids_3_0= ruleAIndexDimension ) )
                    	    // InternalAlpha.g:1009:6: (lv_ids_3_0= ruleAIndexDimension )
                    	    {
                    	    // InternalAlpha.g:1009:6: (lv_ids_3_0= ruleAIndexDimension )
                    	    // InternalAlpha.g:1010:7: lv_ids_3_0= ruleAIndexDimension
                    	    {

                    	    							newCompositeNode(grammarAccess.getAIndexListAccess().getIdsAIndexDimensionParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_ids_3_0=ruleAIndexDimension();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAIndexListRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ids",
                    	    								lv_ids_3_0,
                    	    								"alpha.Alpha.AIndexDimension");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


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
    // $ANTLR end "ruleAIndexList"


    // $ANTLR start "entryRuleADomainExpression"
    // InternalAlpha.g:1033:1: entryRuleADomainExpression returns [EObject current=null] : iv_ruleADomainExpression= ruleADomainExpression EOF ;
    public final EObject entryRuleADomainExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADomainExpression = null;


        try {
            // InternalAlpha.g:1033:58: (iv_ruleADomainExpression= ruleADomainExpression EOF )
            // InternalAlpha.g:1034:2: iv_ruleADomainExpression= ruleADomainExpression EOF
            {
             newCompositeNode(grammarAccess.getADomainExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleADomainExpression=ruleADomainExpression();

            state._fsp--;

             current =iv_ruleADomainExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleADomainExpression"


    // $ANTLR start "ruleADomainExpression"
    // InternalAlpha.g:1040:1: ruleADomainExpression returns [EObject current=null] : (this_ADomainProduct_0= ruleADomainProduct | this_ADomainTerminal_1= ruleADomainTerminal ) ;
    public final EObject ruleADomainExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ADomainProduct_0 = null;

        EObject this_ADomainTerminal_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1046:2: ( (this_ADomainProduct_0= ruleADomainProduct | this_ADomainTerminal_1= ruleADomainTerminal ) )
            // InternalAlpha.g:1047:2: (this_ADomainProduct_0= ruleADomainProduct | this_ADomainTerminal_1= ruleADomainTerminal )
            {
            // InternalAlpha.g:1047:2: (this_ADomainProduct_0= ruleADomainProduct | this_ADomainTerminal_1= ruleADomainTerminal )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalAlpha.g:1048:3: this_ADomainProduct_0= ruleADomainProduct
                    {

                    			newCompositeNode(grammarAccess.getADomainExpressionAccess().getADomainProductParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ADomainProduct_0=ruleADomainProduct();

                    state._fsp--;


                    			current = this_ADomainProduct_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:1057:3: this_ADomainTerminal_1= ruleADomainTerminal
                    {

                    			newCompositeNode(grammarAccess.getADomainExpressionAccess().getADomainTerminalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ADomainTerminal_1=ruleADomainTerminal();

                    state._fsp--;


                    			current = this_ADomainTerminal_1;
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
    // $ANTLR end "ruleADomainExpression"


    // $ANTLR start "entryRuleADomainTerminal"
    // InternalAlpha.g:1069:1: entryRuleADomainTerminal returns [EObject current=null] : iv_ruleADomainTerminal= ruleADomainTerminal EOF ;
    public final EObject entryRuleADomainTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADomainTerminal = null;


        try {
            // InternalAlpha.g:1069:56: (iv_ruleADomainTerminal= ruleADomainTerminal EOF )
            // InternalAlpha.g:1070:2: iv_ruleADomainTerminal= ruleADomainTerminal EOF
            {
             newCompositeNode(grammarAccess.getADomainTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleADomainTerminal=ruleADomainTerminal();

            state._fsp--;

             current =iv_ruleADomainTerminal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleADomainTerminal"


    // $ANTLR start "ruleADomainTerminal"
    // InternalAlpha.g:1076:1: ruleADomainTerminal returns [EObject current=null] : (this_AISLDomain_0= ruleAISLDomain | this_AVariableDomain_1= ruleAVariableDomain ) ;
    public final EObject ruleADomainTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_AISLDomain_0 = null;

        EObject this_AVariableDomain_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1082:2: ( (this_AISLDomain_0= ruleAISLDomain | this_AVariableDomain_1= ruleAVariableDomain ) )
            // InternalAlpha.g:1083:2: (this_AISLDomain_0= ruleAISLDomain | this_AVariableDomain_1= ruleAVariableDomain )
            {
            // InternalAlpha.g:1083:2: (this_AISLDomain_0= ruleAISLDomain | this_AVariableDomain_1= ruleAVariableDomain )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            else if ( (LA23_0==53) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalAlpha.g:1084:3: this_AISLDomain_0= ruleAISLDomain
                    {

                    			newCompositeNode(grammarAccess.getADomainTerminalAccess().getAISLDomainParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AISLDomain_0=ruleAISLDomain();

                    state._fsp--;


                    			current = this_AISLDomain_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:1093:3: this_AVariableDomain_1= ruleAVariableDomain
                    {

                    			newCompositeNode(grammarAccess.getADomainTerminalAccess().getAVariableDomainParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AVariableDomain_1=ruleAVariableDomain();

                    state._fsp--;


                    			current = this_AVariableDomain_1;
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
    // $ANTLR end "ruleADomainTerminal"


    // $ANTLR start "entryRuleAISLDomain"
    // InternalAlpha.g:1105:1: entryRuleAISLDomain returns [EObject current=null] : iv_ruleAISLDomain= ruleAISLDomain EOF ;
    public final EObject entryRuleAISLDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAISLDomain = null;


        try {
            // InternalAlpha.g:1105:51: (iv_ruleAISLDomain= ruleAISLDomain EOF )
            // InternalAlpha.g:1106:2: iv_ruleAISLDomain= ruleAISLDomain EOF
            {
             newCompositeNode(grammarAccess.getAISLDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAISLDomain=ruleAISLDomain();

            state._fsp--;

             current =iv_ruleAISLDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAISLDomain"


    // $ANTLR start "ruleAISLDomain"
    // InternalAlpha.g:1112:1: ruleAISLDomain returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= '[' ( (lv_dims_2_0= ruleAIndexList ) ) otherlv_3= ']' )? otherlv_4= ':' ( (lv_constraintString_5_0= ruleISLString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAISLDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_dims_2_0 = null;

        AntlrDatatypeRuleToken lv_constraintString_5_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1118:2: ( (otherlv_0= '{' (otherlv_1= '[' ( (lv_dims_2_0= ruleAIndexList ) ) otherlv_3= ']' )? otherlv_4= ':' ( (lv_constraintString_5_0= ruleISLString ) ) otherlv_6= '}' ) )
            // InternalAlpha.g:1119:2: (otherlv_0= '{' (otherlv_1= '[' ( (lv_dims_2_0= ruleAIndexList ) ) otherlv_3= ']' )? otherlv_4= ':' ( (lv_constraintString_5_0= ruleISLString ) ) otherlv_6= '}' )
            {
            // InternalAlpha.g:1119:2: (otherlv_0= '{' (otherlv_1= '[' ( (lv_dims_2_0= ruleAIndexList ) ) otherlv_3= ']' )? otherlv_4= ':' ( (lv_constraintString_5_0= ruleISLString ) ) otherlv_6= '}' )
            // InternalAlpha.g:1120:3: otherlv_0= '{' (otherlv_1= '[' ( (lv_dims_2_0= ruleAIndexList ) ) otherlv_3= ']' )? otherlv_4= ':' ( (lv_constraintString_5_0= ruleISLString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getAISLDomainAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAlpha.g:1124:3: (otherlv_1= '[' ( (lv_dims_2_0= ruleAIndexList ) ) otherlv_3= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==50) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAlpha.g:1125:4: otherlv_1= '[' ( (lv_dims_2_0= ruleAIndexList ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_25); 

                    				newLeafNode(otherlv_1, grammarAccess.getAISLDomainAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAlpha.g:1129:4: ( (lv_dims_2_0= ruleAIndexList ) )
                    // InternalAlpha.g:1130:5: (lv_dims_2_0= ruleAIndexList )
                    {
                    // InternalAlpha.g:1130:5: (lv_dims_2_0= ruleAIndexList )
                    // InternalAlpha.g:1131:6: lv_dims_2_0= ruleAIndexList
                    {

                    						newCompositeNode(grammarAccess.getAISLDomainAccess().getDimsAIndexListParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_dims_2_0=ruleAIndexList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAISLDomainRule());
                    						}
                    						set(
                    							current,
                    							"dims",
                    							lv_dims_2_0,
                    							"alpha.Alpha.AIndexList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,51,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getAISLDomainAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,52,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getAISLDomainAccess().getColonKeyword_2());
            		
            // InternalAlpha.g:1157:3: ( (lv_constraintString_5_0= ruleISLString ) )
            // InternalAlpha.g:1158:4: (lv_constraintString_5_0= ruleISLString )
            {
            // InternalAlpha.g:1158:4: (lv_constraintString_5_0= ruleISLString )
            // InternalAlpha.g:1159:5: lv_constraintString_5_0= ruleISLString
            {

            					newCompositeNode(grammarAccess.getAISLDomainAccess().getConstraintStringISLStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_constraintString_5_0=ruleISLString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAISLDomainRule());
            					}
            					set(
            						current,
            						"constraintString",
            						lv_constraintString_5_0,
            						"alpha.Alpha.ISLString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAISLDomainAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAISLDomain"


    // $ANTLR start "entryRuleAVariableDomain"
    // InternalAlpha.g:1184:1: entryRuleAVariableDomain returns [EObject current=null] : iv_ruleAVariableDomain= ruleAVariableDomain EOF ;
    public final EObject entryRuleAVariableDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAVariableDomain = null;


        try {
            // InternalAlpha.g:1184:56: (iv_ruleAVariableDomain= ruleAVariableDomain EOF )
            // InternalAlpha.g:1185:2: iv_ruleAVariableDomain= ruleAVariableDomain EOF
            {
             newCompositeNode(grammarAccess.getAVariableDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAVariableDomain=ruleAVariableDomain();

            state._fsp--;

             current =iv_ruleAVariableDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAVariableDomain"


    // $ANTLR start "ruleAVariableDomain"
    // InternalAlpha.g:1191:1: ruleAVariableDomain returns [EObject current=null] : (otherlv_0= 'D' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleAVariableDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAlpha.g:1197:2: ( (otherlv_0= 'D' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalAlpha.g:1198:2: (otherlv_0= 'D' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalAlpha.g:1198:2: (otherlv_0= 'D' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalAlpha.g:1199:3: otherlv_0= 'D' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAVariableDomainAccess().getDKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAVariableDomainAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:1207:3: ( (otherlv_2= RULE_ID ) )
            // InternalAlpha.g:1208:4: (otherlv_2= RULE_ID )
            {
            // InternalAlpha.g:1208:4: (otherlv_2= RULE_ID )
            // InternalAlpha.g:1209:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAVariableDomainRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getAVariableDomainAccess().getVarAVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAVariableDomainAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAVariableDomain"


    // $ANTLR start "entryRuleADomainProduct"
    // InternalAlpha.g:1228:1: entryRuleADomainProduct returns [EObject current=null] : iv_ruleADomainProduct= ruleADomainProduct EOF ;
    public final EObject entryRuleADomainProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADomainProduct = null;


        try {
            // InternalAlpha.g:1228:55: (iv_ruleADomainProduct= ruleADomainProduct EOF )
            // InternalAlpha.g:1229:2: iv_ruleADomainProduct= ruleADomainProduct EOF
            {
             newCompositeNode(grammarAccess.getADomainProductRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleADomainProduct=ruleADomainProduct();

            state._fsp--;

             current =iv_ruleADomainProduct; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleADomainProduct"


    // $ANTLR start "ruleADomainProduct"
    // InternalAlpha.g:1235:1: ruleADomainProduct returns [EObject current=null] : ( ( (lv_extension_0_0= ruleADomainTerminal ) ) otherlv_1= 'times' ( (lv_base_2_0= ruleADomainExpression ) ) ) ;
    public final EObject ruleADomainProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_extension_0_0 = null;

        EObject lv_base_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1241:2: ( ( ( (lv_extension_0_0= ruleADomainTerminal ) ) otherlv_1= 'times' ( (lv_base_2_0= ruleADomainExpression ) ) ) )
            // InternalAlpha.g:1242:2: ( ( (lv_extension_0_0= ruleADomainTerminal ) ) otherlv_1= 'times' ( (lv_base_2_0= ruleADomainExpression ) ) )
            {
            // InternalAlpha.g:1242:2: ( ( (lv_extension_0_0= ruleADomainTerminal ) ) otherlv_1= 'times' ( (lv_base_2_0= ruleADomainExpression ) ) )
            // InternalAlpha.g:1243:3: ( (lv_extension_0_0= ruleADomainTerminal ) ) otherlv_1= 'times' ( (lv_base_2_0= ruleADomainExpression ) )
            {
            // InternalAlpha.g:1243:3: ( (lv_extension_0_0= ruleADomainTerminal ) )
            // InternalAlpha.g:1244:4: (lv_extension_0_0= ruleADomainTerminal )
            {
            // InternalAlpha.g:1244:4: (lv_extension_0_0= ruleADomainTerminal )
            // InternalAlpha.g:1245:5: lv_extension_0_0= ruleADomainTerminal
            {

            					newCompositeNode(grammarAccess.getADomainProductAccess().getExtensionADomainTerminalParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_extension_0_0=ruleADomainTerminal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getADomainProductRule());
            					}
            					set(
            						current,
            						"extension",
            						lv_extension_0_0,
            						"alpha.Alpha.ADomainTerminal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getADomainProductAccess().getTimesKeyword_1());
            		
            // InternalAlpha.g:1266:3: ( (lv_base_2_0= ruleADomainExpression ) )
            // InternalAlpha.g:1267:4: (lv_base_2_0= ruleADomainExpression )
            {
            // InternalAlpha.g:1267:4: (lv_base_2_0= ruleADomainExpression )
            // InternalAlpha.g:1268:5: lv_base_2_0= ruleADomainExpression
            {

            					newCompositeNode(grammarAccess.getADomainProductAccess().getBaseADomainExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_base_2_0=ruleADomainExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getADomainProductRule());
            					}
            					set(
            						current,
            						"base",
            						lv_base_2_0,
            						"alpha.Alpha.ADomainExpression");
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
    // $ANTLR end "ruleADomainProduct"


    // $ANTLR start "entryRuleADomain"
    // InternalAlpha.g:1289:1: entryRuleADomain returns [EObject current=null] : iv_ruleADomain= ruleADomain EOF ;
    public final EObject entryRuleADomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADomain = null;


        try {
            // InternalAlpha.g:1289:48: (iv_ruleADomain= ruleADomain EOF )
            // InternalAlpha.g:1290:2: iv_ruleADomain= ruleADomain EOF
            {
             newCompositeNode(grammarAccess.getADomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleADomain=ruleADomain();

            state._fsp--;

             current =iv_ruleADomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleADomain"


    // $ANTLR start "ruleADomain"
    // InternalAlpha.g:1296:1: ruleADomain returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= '[' ( (lv_dims_2_0= ruleAIndexList ) ) otherlv_3= ']' )? otherlv_4= ':' ( (lv_constraintString_5_0= ruleISLString ) ) otherlv_6= '}' ) ;
    public final EObject ruleADomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_dims_2_0 = null;

        AntlrDatatypeRuleToken lv_constraintString_5_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1302:2: ( (otherlv_0= '{' (otherlv_1= '[' ( (lv_dims_2_0= ruleAIndexList ) ) otherlv_3= ']' )? otherlv_4= ':' ( (lv_constraintString_5_0= ruleISLString ) ) otherlv_6= '}' ) )
            // InternalAlpha.g:1303:2: (otherlv_0= '{' (otherlv_1= '[' ( (lv_dims_2_0= ruleAIndexList ) ) otherlv_3= ']' )? otherlv_4= ':' ( (lv_constraintString_5_0= ruleISLString ) ) otherlv_6= '}' )
            {
            // InternalAlpha.g:1303:2: (otherlv_0= '{' (otherlv_1= '[' ( (lv_dims_2_0= ruleAIndexList ) ) otherlv_3= ']' )? otherlv_4= ':' ( (lv_constraintString_5_0= ruleISLString ) ) otherlv_6= '}' )
            // InternalAlpha.g:1304:3: otherlv_0= '{' (otherlv_1= '[' ( (lv_dims_2_0= ruleAIndexList ) ) otherlv_3= ']' )? otherlv_4= ':' ( (lv_constraintString_5_0= ruleISLString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getADomainAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAlpha.g:1308:3: (otherlv_1= '[' ( (lv_dims_2_0= ruleAIndexList ) ) otherlv_3= ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==50) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAlpha.g:1309:4: otherlv_1= '[' ( (lv_dims_2_0= ruleAIndexList ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_25); 

                    				newLeafNode(otherlv_1, grammarAccess.getADomainAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAlpha.g:1313:4: ( (lv_dims_2_0= ruleAIndexList ) )
                    // InternalAlpha.g:1314:5: (lv_dims_2_0= ruleAIndexList )
                    {
                    // InternalAlpha.g:1314:5: (lv_dims_2_0= ruleAIndexList )
                    // InternalAlpha.g:1315:6: lv_dims_2_0= ruleAIndexList
                    {

                    						newCompositeNode(grammarAccess.getADomainAccess().getDimsAIndexListParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_dims_2_0=ruleAIndexList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getADomainRule());
                    						}
                    						set(
                    							current,
                    							"dims",
                    							lv_dims_2_0,
                    							"alpha.Alpha.AIndexList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,51,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getADomainAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,52,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getADomainAccess().getColonKeyword_2());
            		
            // InternalAlpha.g:1341:3: ( (lv_constraintString_5_0= ruleISLString ) )
            // InternalAlpha.g:1342:4: (lv_constraintString_5_0= ruleISLString )
            {
            // InternalAlpha.g:1342:4: (lv_constraintString_5_0= ruleISLString )
            // InternalAlpha.g:1343:5: lv_constraintString_5_0= ruleISLString
            {

            					newCompositeNode(grammarAccess.getADomainAccess().getConstraintStringISLStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_constraintString_5_0=ruleISLString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getADomainRule());
            					}
            					set(
            						current,
            						"constraintString",
            						lv_constraintString_5_0,
            						"alpha.Alpha.ISLString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getADomainAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleADomain"


    // $ANTLR start "entryRuleAParamDomain"
    // InternalAlpha.g:1368:1: entryRuleAParamDomain returns [EObject current=null] : iv_ruleAParamDomain= ruleAParamDomain EOF ;
    public final EObject entryRuleAParamDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAParamDomain = null;


        try {
            // InternalAlpha.g:1368:53: (iv_ruleAParamDomain= ruleAParamDomain EOF )
            // InternalAlpha.g:1369:2: iv_ruleAParamDomain= ruleAParamDomain EOF
            {
             newCompositeNode(grammarAccess.getAParamDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAParamDomain=ruleAParamDomain();

            state._fsp--;

             current =iv_ruleAParamDomain; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalAlpha.g:1375:1: ruleAParamDomain returns [EObject current=null] : (otherlv_0= '[' ( (lv_dims_1_0= ruleAIndexList ) ) otherlv_2= ']' otherlv_3= '->' otherlv_4= '{' otherlv_5= ':' ( (lv_constraintString_6_0= ruleISLString ) ) otherlv_7= '}' ) ;
    public final EObject ruleAParamDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_dims_1_0 = null;

        AntlrDatatypeRuleToken lv_constraintString_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1381:2: ( (otherlv_0= '[' ( (lv_dims_1_0= ruleAIndexList ) ) otherlv_2= ']' otherlv_3= '->' otherlv_4= '{' otherlv_5= ':' ( (lv_constraintString_6_0= ruleISLString ) ) otherlv_7= '}' ) )
            // InternalAlpha.g:1382:2: (otherlv_0= '[' ( (lv_dims_1_0= ruleAIndexList ) ) otherlv_2= ']' otherlv_3= '->' otherlv_4= '{' otherlv_5= ':' ( (lv_constraintString_6_0= ruleISLString ) ) otherlv_7= '}' )
            {
            // InternalAlpha.g:1382:2: (otherlv_0= '[' ( (lv_dims_1_0= ruleAIndexList ) ) otherlv_2= ']' otherlv_3= '->' otherlv_4= '{' otherlv_5= ':' ( (lv_constraintString_6_0= ruleISLString ) ) otherlv_7= '}' )
            // InternalAlpha.g:1383:3: otherlv_0= '[' ( (lv_dims_1_0= ruleAIndexList ) ) otherlv_2= ']' otherlv_3= '->' otherlv_4= '{' otherlv_5= ':' ( (lv_constraintString_6_0= ruleISLString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getAParamDomainAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAlpha.g:1387:3: ( (lv_dims_1_0= ruleAIndexList ) )
            // InternalAlpha.g:1388:4: (lv_dims_1_0= ruleAIndexList )
            {
            // InternalAlpha.g:1388:4: (lv_dims_1_0= ruleAIndexList )
            // InternalAlpha.g:1389:5: lv_dims_1_0= ruleAIndexList
            {

            					newCompositeNode(grammarAccess.getAParamDomainAccess().getDimsAIndexListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_dims_1_0=ruleAIndexList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAParamDomainRule());
            					}
            					set(
            						current,
            						"dims",
            						lv_dims_1_0,
            						"alpha.Alpha.AIndexList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,51,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getAParamDomainAccess().getRightSquareBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,55,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAParamDomainAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getAParamDomainAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,52,FOLLOW_28); 

            			newLeafNode(otherlv_5, grammarAccess.getAParamDomainAccess().getColonKeyword_5());
            		
            // InternalAlpha.g:1422:3: ( (lv_constraintString_6_0= ruleISLString ) )
            // InternalAlpha.g:1423:4: (lv_constraintString_6_0= ruleISLString )
            {
            // InternalAlpha.g:1423:4: (lv_constraintString_6_0= ruleISLString )
            // InternalAlpha.g:1424:5: lv_constraintString_6_0= ruleISLString
            {

            					newCompositeNode(grammarAccess.getAParamDomainAccess().getConstraintStringISLStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_29);
            lv_constraintString_6_0=ruleISLString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAParamDomainRule());
            					}
            					set(
            						current,
            						"constraintString",
            						lv_constraintString_6_0,
            						"alpha.Alpha.ISLString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAParamDomainAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleARelation"
    // InternalAlpha.g:1449:1: entryRuleARelation returns [EObject current=null] : iv_ruleARelation= ruleARelation EOF ;
    public final EObject entryRuleARelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARelation = null;


        try {
            // InternalAlpha.g:1449:50: (iv_ruleARelation= ruleARelation EOF )
            // InternalAlpha.g:1450:2: iv_ruleARelation= ruleARelation EOF
            {
             newCompositeNode(grammarAccess.getARelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleARelation=ruleARelation();

            state._fsp--;

             current =iv_ruleARelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleARelation"


    // $ANTLR start "ruleARelation"
    // InternalAlpha.g:1456:1: ruleARelation returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '[' ( (lv_inDims_2_0= ruleAIndexList ) ) otherlv_3= ']' otherlv_4= '->' otherlv_5= '[' ( (lv_outDims_6_0= ruleAIndexList ) ) otherlv_7= ']' ( (lv_constraintStr_8_0= ruleISLString ) ) otherlv_9= '}' ) ;
    public final EObject ruleARelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_inDims_2_0 = null;

        EObject lv_outDims_6_0 = null;

        AntlrDatatypeRuleToken lv_constraintStr_8_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1462:2: ( (otherlv_0= '{' otherlv_1= '[' ( (lv_inDims_2_0= ruleAIndexList ) ) otherlv_3= ']' otherlv_4= '->' otherlv_5= '[' ( (lv_outDims_6_0= ruleAIndexList ) ) otherlv_7= ']' ( (lv_constraintStr_8_0= ruleISLString ) ) otherlv_9= '}' ) )
            // InternalAlpha.g:1463:2: (otherlv_0= '{' otherlv_1= '[' ( (lv_inDims_2_0= ruleAIndexList ) ) otherlv_3= ']' otherlv_4= '->' otherlv_5= '[' ( (lv_outDims_6_0= ruleAIndexList ) ) otherlv_7= ']' ( (lv_constraintStr_8_0= ruleISLString ) ) otherlv_9= '}' )
            {
            // InternalAlpha.g:1463:2: (otherlv_0= '{' otherlv_1= '[' ( (lv_inDims_2_0= ruleAIndexList ) ) otherlv_3= ']' otherlv_4= '->' otherlv_5= '[' ( (lv_outDims_6_0= ruleAIndexList ) ) otherlv_7= ']' ( (lv_constraintStr_8_0= ruleISLString ) ) otherlv_9= '}' )
            // InternalAlpha.g:1464:3: otherlv_0= '{' otherlv_1= '[' ( (lv_inDims_2_0= ruleAIndexList ) ) otherlv_3= ']' otherlv_4= '->' otherlv_5= '[' ( (lv_outDims_6_0= ruleAIndexList ) ) otherlv_7= ']' ( (lv_constraintStr_8_0= ruleISLString ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getARelationAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,50,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getARelationAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalAlpha.g:1472:3: ( (lv_inDims_2_0= ruleAIndexList ) )
            // InternalAlpha.g:1473:4: (lv_inDims_2_0= ruleAIndexList )
            {
            // InternalAlpha.g:1473:4: (lv_inDims_2_0= ruleAIndexList )
            // InternalAlpha.g:1474:5: lv_inDims_2_0= ruleAIndexList
            {

            					newCompositeNode(grammarAccess.getARelationAccess().getInDimsAIndexListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_inDims_2_0=ruleAIndexList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getARelationRule());
            					}
            					set(
            						current,
            						"inDims",
            						lv_inDims_2_0,
            						"alpha.Alpha.AIndexList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,51,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getARelationAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,55,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getARelationAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            otherlv_5=(Token)match(input,50,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getARelationAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalAlpha.g:1503:3: ( (lv_outDims_6_0= ruleAIndexList ) )
            // InternalAlpha.g:1504:4: (lv_outDims_6_0= ruleAIndexList )
            {
            // InternalAlpha.g:1504:4: (lv_outDims_6_0= ruleAIndexList )
            // InternalAlpha.g:1505:5: lv_outDims_6_0= ruleAIndexList
            {

            					newCompositeNode(grammarAccess.getARelationAccess().getOutDimsAIndexListParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_26);
            lv_outDims_6_0=ruleAIndexList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getARelationRule());
            					}
            					set(
            						current,
            						"outDims",
            						lv_outDims_6_0,
            						"alpha.Alpha.AIndexList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,51,FOLLOW_28); 

            			newLeafNode(otherlv_7, grammarAccess.getARelationAccess().getRightSquareBracketKeyword_7());
            		
            // InternalAlpha.g:1526:3: ( (lv_constraintStr_8_0= ruleISLString ) )
            // InternalAlpha.g:1527:4: (lv_constraintStr_8_0= ruleISLString )
            {
            // InternalAlpha.g:1527:4: (lv_constraintStr_8_0= ruleISLString )
            // InternalAlpha.g:1528:5: lv_constraintStr_8_0= ruleISLString
            {

            					newCompositeNode(grammarAccess.getARelationAccess().getConstraintStrISLStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_29);
            lv_constraintStr_8_0=ruleISLString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getARelationRule());
            					}
            					set(
            						current,
            						"constraintStr",
            						lv_constraintStr_8_0,
            						"alpha.Alpha.ISLString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getARelationAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleARelation"


    // $ANTLR start "entryRuleISLString"
    // InternalAlpha.g:1553:1: entryRuleISLString returns [String current=null] : iv_ruleISLString= ruleISLString EOF ;
    public final String entryRuleISLString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleISLString = null;


        try {
            // InternalAlpha.g:1553:49: (iv_ruleISLString= ruleISLString EOF )
            // InternalAlpha.g:1554:2: iv_ruleISLString= ruleISLString EOF
            {
             newCompositeNode(grammarAccess.getISLStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleISLString=ruleISLString();

            state._fsp--;

             current =iv_ruleISLString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleISLString"


    // $ANTLR start "ruleISLString"
    // InternalAlpha.g:1560:1: ruleISLString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | this_OP_PLUS_2= RULE_OP_PLUS | this_OP_MINUS_3= RULE_OP_MINUS | this_OP_MUL_4= RULE_OP_MUL | this_OP_DIV_5= RULE_OP_DIV | this_OP_AND_6= RULE_OP_AND | this_OP_OR_7= RULE_OP_OR | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | this_INTERSECTION_14= RULE_INTERSECTION | this_UNION_15= RULE_UNION | this_WS_16= RULE_WS | this_RELATIONAL_OP_17= ruleRELATIONAL_OP )* ;
    public final AntlrDatatypeRuleToken ruleISLString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token this_OP_PLUS_2=null;
        Token this_OP_MINUS_3=null;
        Token this_OP_MUL_4=null;
        Token this_OP_DIV_5=null;
        Token this_OP_AND_6=null;
        Token this_OP_OR_7=null;
        Token kw=null;
        Token this_INTERSECTION_14=null;
        Token this_UNION_15=null;
        Token this_WS_16=null;
        AntlrDatatypeRuleToken this_IndexName_0 = null;

        AntlrDatatypeRuleToken this_RELATIONAL_OP_17 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1566:2: ( (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | this_OP_PLUS_2= RULE_OP_PLUS | this_OP_MINUS_3= RULE_OP_MINUS | this_OP_MUL_4= RULE_OP_MUL | this_OP_DIV_5= RULE_OP_DIV | this_OP_AND_6= RULE_OP_AND | this_OP_OR_7= RULE_OP_OR | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | this_INTERSECTION_14= RULE_INTERSECTION | this_UNION_15= RULE_UNION | this_WS_16= RULE_WS | this_RELATIONAL_OP_17= ruleRELATIONAL_OP )* )
            // InternalAlpha.g:1567:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | this_OP_PLUS_2= RULE_OP_PLUS | this_OP_MINUS_3= RULE_OP_MINUS | this_OP_MUL_4= RULE_OP_MUL | this_OP_DIV_5= RULE_OP_DIV | this_OP_AND_6= RULE_OP_AND | this_OP_OR_7= RULE_OP_OR | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | this_INTERSECTION_14= RULE_INTERSECTION | this_UNION_15= RULE_UNION | this_WS_16= RULE_WS | this_RELATIONAL_OP_17= ruleRELATIONAL_OP )*
            {
            // InternalAlpha.g:1567:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | this_OP_PLUS_2= RULE_OP_PLUS | this_OP_MINUS_3= RULE_OP_MINUS | this_OP_MUL_4= RULE_OP_MUL | this_OP_DIV_5= RULE_OP_DIV | this_OP_AND_6= RULE_OP_AND | this_OP_OR_7= RULE_OP_OR | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | this_INTERSECTION_14= RULE_INTERSECTION | this_UNION_15= RULE_UNION | this_WS_16= RULE_WS | this_RELATIONAL_OP_17= ruleRELATIONAL_OP )*
            loop26:
            do {
                int alt26=19;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt26=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt26=2;
                    }
                    break;
                case RULE_OP_PLUS:
                    {
                    alt26=3;
                    }
                    break;
                case RULE_OP_MINUS:
                    {
                    alt26=4;
                    }
                    break;
                case RULE_OP_MUL:
                    {
                    alt26=5;
                    }
                    break;
                case RULE_OP_DIV:
                    {
                    alt26=6;
                    }
                    break;
                case RULE_OP_AND:
                    {
                    alt26=7;
                    }
                    break;
                case RULE_OP_OR:
                    {
                    alt26=8;
                    }
                    break;
                case 50:
                    {
                    alt26=9;
                    }
                    break;
                case 51:
                    {
                    alt26=10;
                    }
                    break;
                case 38:
                    {
                    alt26=11;
                    }
                    break;
                case 39:
                    {
                    alt26=12;
                    }
                    break;
                case 47:
                    {
                    alt26=13;
                    }
                    break;
                case 52:
                    {
                    alt26=14;
                    }
                    break;
                case RULE_INTERSECTION:
                    {
                    alt26=15;
                    }
                    break;
                case RULE_UNION:
                    {
                    alt26=16;
                    }
                    break;
                case RULE_WS:
                    {
                    alt26=17;
                    }
                    break;
                case RULE_OP_EQ:
                case RULE_OP_GE:
                case RULE_OP_GT:
                case RULE_OP_LE:
                case RULE_OP_LT:
                case RULE_OP_NE:
                    {
                    alt26=18;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // InternalAlpha.g:1568:3: this_IndexName_0= ruleIndexName
            	    {

            	    			newCompositeNode(grammarAccess.getISLStringAccess().getIndexNameParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_33);
            	    this_IndexName_0=ruleIndexName();

            	    state._fsp--;


            	    			current.merge(this_IndexName_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalAlpha.g:1579:3: this_INT_1= RULE_INT
            	    {
            	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_33); 

            	    			current.merge(this_INT_1);
            	    		

            	    			newLeafNode(this_INT_1, grammarAccess.getISLStringAccess().getINTTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalAlpha.g:1587:3: this_OP_PLUS_2= RULE_OP_PLUS
            	    {
            	    this_OP_PLUS_2=(Token)match(input,RULE_OP_PLUS,FOLLOW_33); 

            	    			current.merge(this_OP_PLUS_2);
            	    		

            	    			newLeafNode(this_OP_PLUS_2, grammarAccess.getISLStringAccess().getOP_PLUSTerminalRuleCall_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalAlpha.g:1595:3: this_OP_MINUS_3= RULE_OP_MINUS
            	    {
            	    this_OP_MINUS_3=(Token)match(input,RULE_OP_MINUS,FOLLOW_33); 

            	    			current.merge(this_OP_MINUS_3);
            	    		

            	    			newLeafNode(this_OP_MINUS_3, grammarAccess.getISLStringAccess().getOP_MINUSTerminalRuleCall_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalAlpha.g:1603:3: this_OP_MUL_4= RULE_OP_MUL
            	    {
            	    this_OP_MUL_4=(Token)match(input,RULE_OP_MUL,FOLLOW_33); 

            	    			current.merge(this_OP_MUL_4);
            	    		

            	    			newLeafNode(this_OP_MUL_4, grammarAccess.getISLStringAccess().getOP_MULTerminalRuleCall_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalAlpha.g:1611:3: this_OP_DIV_5= RULE_OP_DIV
            	    {
            	    this_OP_DIV_5=(Token)match(input,RULE_OP_DIV,FOLLOW_33); 

            	    			current.merge(this_OP_DIV_5);
            	    		

            	    			newLeafNode(this_OP_DIV_5, grammarAccess.getISLStringAccess().getOP_DIVTerminalRuleCall_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalAlpha.g:1619:3: this_OP_AND_6= RULE_OP_AND
            	    {
            	    this_OP_AND_6=(Token)match(input,RULE_OP_AND,FOLLOW_33); 

            	    			current.merge(this_OP_AND_6);
            	    		

            	    			newLeafNode(this_OP_AND_6, grammarAccess.getISLStringAccess().getOP_ANDTerminalRuleCall_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalAlpha.g:1627:3: this_OP_OR_7= RULE_OP_OR
            	    {
            	    this_OP_OR_7=(Token)match(input,RULE_OP_OR,FOLLOW_33); 

            	    			current.merge(this_OP_OR_7);
            	    		

            	    			newLeafNode(this_OP_OR_7, grammarAccess.getISLStringAccess().getOP_ORTerminalRuleCall_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalAlpha.g:1635:3: kw= '['
            	    {
            	    kw=(Token)match(input,50,FOLLOW_33); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getISLStringAccess().getLeftSquareBracketKeyword_8());
            	    		

            	    }
            	    break;
            	case 10 :
            	    // InternalAlpha.g:1641:3: kw= ']'
            	    {
            	    kw=(Token)match(input,51,FOLLOW_33); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getISLStringAccess().getRightSquareBracketKeyword_9());
            	    		

            	    }
            	    break;
            	case 11 :
            	    // InternalAlpha.g:1647:3: kw= '('
            	    {
            	    kw=(Token)match(input,38,FOLLOW_33); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getISLStringAccess().getLeftParenthesisKeyword_10());
            	    		

            	    }
            	    break;
            	case 12 :
            	    // InternalAlpha.g:1653:3: kw= ')'
            	    {
            	    kw=(Token)match(input,39,FOLLOW_33); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getISLStringAccess().getRightParenthesisKeyword_11());
            	    		

            	    }
            	    break;
            	case 13 :
            	    // InternalAlpha.g:1659:3: kw= ','
            	    {
            	    kw=(Token)match(input,47,FOLLOW_33); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getISLStringAccess().getCommaKeyword_12());
            	    		

            	    }
            	    break;
            	case 14 :
            	    // InternalAlpha.g:1665:3: kw= ':'
            	    {
            	    kw=(Token)match(input,52,FOLLOW_33); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getISLStringAccess().getColonKeyword_13());
            	    		

            	    }
            	    break;
            	case 15 :
            	    // InternalAlpha.g:1671:3: this_INTERSECTION_14= RULE_INTERSECTION
            	    {
            	    this_INTERSECTION_14=(Token)match(input,RULE_INTERSECTION,FOLLOW_33); 

            	    			current.merge(this_INTERSECTION_14);
            	    		

            	    			newLeafNode(this_INTERSECTION_14, grammarAccess.getISLStringAccess().getINTERSECTIONTerminalRuleCall_14());
            	    		

            	    }
            	    break;
            	case 16 :
            	    // InternalAlpha.g:1679:3: this_UNION_15= RULE_UNION
            	    {
            	    this_UNION_15=(Token)match(input,RULE_UNION,FOLLOW_33); 

            	    			current.merge(this_UNION_15);
            	    		

            	    			newLeafNode(this_UNION_15, grammarAccess.getISLStringAccess().getUNIONTerminalRuleCall_15());
            	    		

            	    }
            	    break;
            	case 17 :
            	    // InternalAlpha.g:1687:3: this_WS_16= RULE_WS
            	    {
            	    this_WS_16=(Token)match(input,RULE_WS,FOLLOW_33); 

            	    			current.merge(this_WS_16);
            	    		

            	    			newLeafNode(this_WS_16, grammarAccess.getISLStringAccess().getWSTerminalRuleCall_16());
            	    		

            	    }
            	    break;
            	case 18 :
            	    // InternalAlpha.g:1695:3: this_RELATIONAL_OP_17= ruleRELATIONAL_OP
            	    {

            	    			newCompositeNode(grammarAccess.getISLStringAccess().getRELATIONAL_OPParserRuleCall_17());
            	    		
            	    pushFollow(FOLLOW_33);
            	    this_RELATIONAL_OP_17=ruleRELATIONAL_OP();

            	    state._fsp--;


            	    			current.merge(this_RELATIONAL_OP_17);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleISLString"


    // $ANTLR start "entryRuleAEquation"
    // InternalAlpha.g:1709:1: entryRuleAEquation returns [EObject current=null] : iv_ruleAEquation= ruleAEquation EOF ;
    public final EObject entryRuleAEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAEquation = null;


        try {
            // InternalAlpha.g:1709:50: (iv_ruleAEquation= ruleAEquation EOF )
            // InternalAlpha.g:1710:2: iv_ruleAEquation= ruleAEquation EOF
            {
             newCompositeNode(grammarAccess.getAEquationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAEquation=ruleAEquation();

            state._fsp--;

             current =iv_ruleAEquation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAEquation"


    // $ANTLR start "ruleAEquation"
    // InternalAlpha.g:1716:1: ruleAEquation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= ruleAIndexList ) ) otherlv_3= ']' )? this_OP_EQ_4= RULE_OP_EQ ( (lv_expr_5_0= ruleAAlphaExpression ) ) otherlv_6= ';' ) ;
    public final EObject ruleAEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_OP_EQ_4=null;
        Token otherlv_6=null;
        EObject lv_indexes_2_0 = null;

        EObject lv_expr_5_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1722:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= ruleAIndexList ) ) otherlv_3= ']' )? this_OP_EQ_4= RULE_OP_EQ ( (lv_expr_5_0= ruleAAlphaExpression ) ) otherlv_6= ';' ) )
            // InternalAlpha.g:1723:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= ruleAIndexList ) ) otherlv_3= ']' )? this_OP_EQ_4= RULE_OP_EQ ( (lv_expr_5_0= ruleAAlphaExpression ) ) otherlv_6= ';' )
            {
            // InternalAlpha.g:1723:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= ruleAIndexList ) ) otherlv_3= ']' )? this_OP_EQ_4= RULE_OP_EQ ( (lv_expr_5_0= ruleAAlphaExpression ) ) otherlv_6= ';' )
            // InternalAlpha.g:1724:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= ruleAIndexList ) ) otherlv_3= ']' )? this_OP_EQ_4= RULE_OP_EQ ( (lv_expr_5_0= ruleAAlphaExpression ) ) otherlv_6= ';'
            {
            // InternalAlpha.g:1724:3: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:1725:4: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:1725:4: (otherlv_0= RULE_ID )
            // InternalAlpha.g:1726:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAEquationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_0, grammarAccess.getAEquationAccess().getVarAVariableCrossReference_0_0());
            				

            }


            }

            // InternalAlpha.g:1737:3: (otherlv_1= '[' ( (lv_indexes_2_0= ruleAIndexList ) ) otherlv_3= ']' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==50) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAlpha.g:1738:4: otherlv_1= '[' ( (lv_indexes_2_0= ruleAIndexList ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_25); 

                    				newLeafNode(otherlv_1, grammarAccess.getAEquationAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAlpha.g:1742:4: ( (lv_indexes_2_0= ruleAIndexList ) )
                    // InternalAlpha.g:1743:5: (lv_indexes_2_0= ruleAIndexList )
                    {
                    // InternalAlpha.g:1743:5: (lv_indexes_2_0= ruleAIndexList )
                    // InternalAlpha.g:1744:6: lv_indexes_2_0= ruleAIndexList
                    {

                    						newCompositeNode(grammarAccess.getAEquationAccess().getIndexesAIndexListParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_indexes_2_0=ruleAIndexList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAEquationRule());
                    						}
                    						set(
                    							current,
                    							"indexes",
                    							lv_indexes_2_0,
                    							"alpha.Alpha.AIndexList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,51,FOLLOW_35); 

                    				newLeafNode(otherlv_3, grammarAccess.getAEquationAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            this_OP_EQ_4=(Token)match(input,RULE_OP_EQ,FOLLOW_36); 

            			newLeafNode(this_OP_EQ_4, grammarAccess.getAEquationAccess().getOP_EQTerminalRuleCall_2());
            		
            // InternalAlpha.g:1770:3: ( (lv_expr_5_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:1771:4: (lv_expr_5_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:1771:4: (lv_expr_5_0= ruleAAlphaExpression )
            // InternalAlpha.g:1772:5: lv_expr_5_0= ruleAAlphaExpression
            {

            					newCompositeNode(grammarAccess.getAEquationAccess().getExprAAlphaExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_expr_5_0=ruleAAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAEquationRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_5_0,
            						"alpha.Alpha.AAlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAEquationAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAEquation"


    // $ANTLR start "entryRuleAUseEquation"
    // InternalAlpha.g:1797:1: entryRuleAUseEquation returns [EObject current=null] : iv_ruleAUseEquation= ruleAUseEquation EOF ;
    public final EObject entryRuleAUseEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAUseEquation = null;


        try {
            // InternalAlpha.g:1797:53: (iv_ruleAUseEquation= ruleAUseEquation EOF )
            // InternalAlpha.g:1798:2: iv_ruleAUseEquation= ruleAUseEquation EOF
            {
             newCompositeNode(grammarAccess.getAUseEquationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAUseEquation=ruleAUseEquation();

            state._fsp--;

             current =iv_ruleAUseEquation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAUseEquation"


    // $ANTLR start "ruleAUseEquation"
    // InternalAlpha.g:1804:1: ruleAUseEquation returns [EObject current=null] : (otherlv_0= 'over' ( (lv_instantiationDomain_1_0= ruleADomain ) ) (otherlv_2= 'with' otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleAIndexList ) ) otherlv_5= ']' )? otherlv_6= ':' otherlv_7= '(' ( ( (lv_outputExprs_8_0= ruleAAlphaExpression ) ) (otherlv_9= ',' ( (lv_outputExprs_10_0= ruleAAlphaExpression ) ) )* )? otherlv_11= ')' this_OP_EQ_12= RULE_OP_EQ ( (otherlv_13= RULE_ID ) ) otherlv_14= '[' ( (lv_callParams_15_0= ruleAIndexList ) ) otherlv_16= ']' otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' ) ;
    public final EObject ruleAUseEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token this_OP_EQ_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_instantiationDomain_1_0 = null;

        EObject lv_subsystemDims_4_0 = null;

        EObject lv_outputExprs_8_0 = null;

        EObject lv_outputExprs_10_0 = null;

        EObject lv_callParams_15_0 = null;

        EObject lv_inputExprs_18_0 = null;

        EObject lv_inputExprs_20_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1810:2: ( (otherlv_0= 'over' ( (lv_instantiationDomain_1_0= ruleADomain ) ) (otherlv_2= 'with' otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleAIndexList ) ) otherlv_5= ']' )? otherlv_6= ':' otherlv_7= '(' ( ( (lv_outputExprs_8_0= ruleAAlphaExpression ) ) (otherlv_9= ',' ( (lv_outputExprs_10_0= ruleAAlphaExpression ) ) )* )? otherlv_11= ')' this_OP_EQ_12= RULE_OP_EQ ( (otherlv_13= RULE_ID ) ) otherlv_14= '[' ( (lv_callParams_15_0= ruleAIndexList ) ) otherlv_16= ']' otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' ) )
            // InternalAlpha.g:1811:2: (otherlv_0= 'over' ( (lv_instantiationDomain_1_0= ruleADomain ) ) (otherlv_2= 'with' otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleAIndexList ) ) otherlv_5= ']' )? otherlv_6= ':' otherlv_7= '(' ( ( (lv_outputExprs_8_0= ruleAAlphaExpression ) ) (otherlv_9= ',' ( (lv_outputExprs_10_0= ruleAAlphaExpression ) ) )* )? otherlv_11= ')' this_OP_EQ_12= RULE_OP_EQ ( (otherlv_13= RULE_ID ) ) otherlv_14= '[' ( (lv_callParams_15_0= ruleAIndexList ) ) otherlv_16= ']' otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' )
            {
            // InternalAlpha.g:1811:2: (otherlv_0= 'over' ( (lv_instantiationDomain_1_0= ruleADomain ) ) (otherlv_2= 'with' otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleAIndexList ) ) otherlv_5= ']' )? otherlv_6= ':' otherlv_7= '(' ( ( (lv_outputExprs_8_0= ruleAAlphaExpression ) ) (otherlv_9= ',' ( (lv_outputExprs_10_0= ruleAAlphaExpression ) ) )* )? otherlv_11= ')' this_OP_EQ_12= RULE_OP_EQ ( (otherlv_13= RULE_ID ) ) otherlv_14= '[' ( (lv_callParams_15_0= ruleAIndexList ) ) otherlv_16= ']' otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' )
            // InternalAlpha.g:1812:3: otherlv_0= 'over' ( (lv_instantiationDomain_1_0= ruleADomain ) ) (otherlv_2= 'with' otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleAIndexList ) ) otherlv_5= ']' )? otherlv_6= ':' otherlv_7= '(' ( ( (lv_outputExprs_8_0= ruleAAlphaExpression ) ) (otherlv_9= ',' ( (lv_outputExprs_10_0= ruleAAlphaExpression ) ) )* )? otherlv_11= ')' this_OP_EQ_12= RULE_OP_EQ ( (otherlv_13= RULE_ID ) ) otherlv_14= '[' ( (lv_callParams_15_0= ruleAIndexList ) ) otherlv_16= ']' otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAUseEquationAccess().getOverKeyword_0());
            		
            // InternalAlpha.g:1816:3: ( (lv_instantiationDomain_1_0= ruleADomain ) )
            // InternalAlpha.g:1817:4: (lv_instantiationDomain_1_0= ruleADomain )
            {
            // InternalAlpha.g:1817:4: (lv_instantiationDomain_1_0= ruleADomain )
            // InternalAlpha.g:1818:5: lv_instantiationDomain_1_0= ruleADomain
            {

            					newCompositeNode(grammarAccess.getAUseEquationAccess().getInstantiationDomainADomainParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_37);
            lv_instantiationDomain_1_0=ruleADomain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAUseEquationRule());
            					}
            					set(
            						current,
            						"instantiationDomain",
            						lv_instantiationDomain_1_0,
            						"alpha.Alpha.ADomain");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:1835:3: (otherlv_2= 'with' otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleAIndexList ) ) otherlv_5= ']' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==57) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAlpha.g:1836:4: otherlv_2= 'with' otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleAIndexList ) ) otherlv_5= ']'
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getAUseEquationAccess().getWithKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,50,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getAUseEquationAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    // InternalAlpha.g:1844:4: ( (lv_subsystemDims_4_0= ruleAIndexList ) )
                    // InternalAlpha.g:1845:5: (lv_subsystemDims_4_0= ruleAIndexList )
                    {
                    // InternalAlpha.g:1845:5: (lv_subsystemDims_4_0= ruleAIndexList )
                    // InternalAlpha.g:1846:6: lv_subsystemDims_4_0= ruleAIndexList
                    {

                    						newCompositeNode(grammarAccess.getAUseEquationAccess().getSubsystemDimsAIndexListParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_subsystemDims_4_0=ruleAIndexList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAUseEquationRule());
                    						}
                    						set(
                    							current,
                    							"subsystemDims",
                    							lv_subsystemDims_4_0,
                    							"alpha.Alpha.AIndexList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,51,FOLLOW_27); 

                    				newLeafNode(otherlv_5, grammarAccess.getAUseEquationAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,52,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getAUseEquationAccess().getColonKeyword_3());
            		
            otherlv_7=(Token)match(input,38,FOLLOW_38); 

            			newLeafNode(otherlv_7, grammarAccess.getAUseEquationAccess().getLeftParenthesisKeyword_4());
            		
            // InternalAlpha.g:1876:3: ( ( (lv_outputExprs_8_0= ruleAAlphaExpression ) ) (otherlv_9= ',' ( (lv_outputExprs_10_0= ruleAAlphaExpression ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_OP_MUL)||(LA30_0>=RULE_OP_AND && LA30_0<=RULE_OP_OR)||LA30_0==RULE_OP_XOR||(LA30_0>=RULE_OP_MIN && LA30_0<=RULE_REAL)||LA30_0==33||LA30_0==38||LA30_0==50||(LA30_0>=58 && LA30_0<=59)||LA30_0==61||(LA30_0>=64 && LA30_0<=66)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAlpha.g:1877:4: ( (lv_outputExprs_8_0= ruleAAlphaExpression ) ) (otherlv_9= ',' ( (lv_outputExprs_10_0= ruleAAlphaExpression ) ) )*
                    {
                    // InternalAlpha.g:1877:4: ( (lv_outputExprs_8_0= ruleAAlphaExpression ) )
                    // InternalAlpha.g:1878:5: (lv_outputExprs_8_0= ruleAAlphaExpression )
                    {
                    // InternalAlpha.g:1878:5: (lv_outputExprs_8_0= ruleAAlphaExpression )
                    // InternalAlpha.g:1879:6: lv_outputExprs_8_0= ruleAAlphaExpression
                    {

                    						newCompositeNode(grammarAccess.getAUseEquationAccess().getOutputExprsAAlphaExpressionParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_outputExprs_8_0=ruleAAlphaExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAUseEquationRule());
                    						}
                    						add(
                    							current,
                    							"outputExprs",
                    							lv_outputExprs_8_0,
                    							"alpha.Alpha.AAlphaExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlpha.g:1896:4: (otherlv_9= ',' ( (lv_outputExprs_10_0= ruleAAlphaExpression ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==47) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalAlpha.g:1897:5: otherlv_9= ',' ( (lv_outputExprs_10_0= ruleAAlphaExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,47,FOLLOW_36); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getAUseEquationAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalAlpha.g:1901:5: ( (lv_outputExprs_10_0= ruleAAlphaExpression ) )
                    	    // InternalAlpha.g:1902:6: (lv_outputExprs_10_0= ruleAAlphaExpression )
                    	    {
                    	    // InternalAlpha.g:1902:6: (lv_outputExprs_10_0= ruleAAlphaExpression )
                    	    // InternalAlpha.g:1903:7: lv_outputExprs_10_0= ruleAAlphaExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getAUseEquationAccess().getOutputExprsAAlphaExpressionParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_39);
                    	    lv_outputExprs_10_0=ruleAAlphaExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAUseEquationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outputExprs",
                    	    								lv_outputExprs_10_0,
                    	    								"alpha.Alpha.AAlphaExpression");
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

            otherlv_11=(Token)match(input,39,FOLLOW_35); 

            			newLeafNode(otherlv_11, grammarAccess.getAUseEquationAccess().getRightParenthesisKeyword_6());
            		
            this_OP_EQ_12=(Token)match(input,RULE_OP_EQ,FOLLOW_4); 

            			newLeafNode(this_OP_EQ_12, grammarAccess.getAUseEquationAccess().getOP_EQTerminalRuleCall_7());
            		
            // InternalAlpha.g:1930:3: ( (otherlv_13= RULE_ID ) )
            // InternalAlpha.g:1931:4: (otherlv_13= RULE_ID )
            {
            // InternalAlpha.g:1931:4: (otherlv_13= RULE_ID )
            // InternalAlpha.g:1932:5: otherlv_13= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAUseEquationRule());
            					}
            				
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_13, grammarAccess.getAUseEquationAccess().getSystemAAffineSystemCrossReference_8_0());
            				

            }


            }

            otherlv_14=(Token)match(input,50,FOLLOW_25); 

            			newLeafNode(otherlv_14, grammarAccess.getAUseEquationAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalAlpha.g:1947:3: ( (lv_callParams_15_0= ruleAIndexList ) )
            // InternalAlpha.g:1948:4: (lv_callParams_15_0= ruleAIndexList )
            {
            // InternalAlpha.g:1948:4: (lv_callParams_15_0= ruleAIndexList )
            // InternalAlpha.g:1949:5: lv_callParams_15_0= ruleAIndexList
            {

            					newCompositeNode(grammarAccess.getAUseEquationAccess().getCallParamsAIndexListParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_26);
            lv_callParams_15_0=ruleAIndexList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAUseEquationRule());
            					}
            					set(
            						current,
            						"callParams",
            						lv_callParams_15_0,
            						"alpha.Alpha.AIndexList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_16, grammarAccess.getAUseEquationAccess().getRightSquareBracketKeyword_11());
            		
            otherlv_17=(Token)match(input,38,FOLLOW_38); 

            			newLeafNode(otherlv_17, grammarAccess.getAUseEquationAccess().getLeftParenthesisKeyword_12());
            		
            // InternalAlpha.g:1974:3: ( ( (lv_inputExprs_18_0= ruleAAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAAlphaExpression ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_OP_MUL)||(LA32_0>=RULE_OP_AND && LA32_0<=RULE_OP_OR)||LA32_0==RULE_OP_XOR||(LA32_0>=RULE_OP_MIN && LA32_0<=RULE_REAL)||LA32_0==33||LA32_0==38||LA32_0==50||(LA32_0>=58 && LA32_0<=59)||LA32_0==61||(LA32_0>=64 && LA32_0<=66)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAlpha.g:1975:4: ( (lv_inputExprs_18_0= ruleAAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAAlphaExpression ) ) )*
                    {
                    // InternalAlpha.g:1975:4: ( (lv_inputExprs_18_0= ruleAAlphaExpression ) )
                    // InternalAlpha.g:1976:5: (lv_inputExprs_18_0= ruleAAlphaExpression )
                    {
                    // InternalAlpha.g:1976:5: (lv_inputExprs_18_0= ruleAAlphaExpression )
                    // InternalAlpha.g:1977:6: lv_inputExprs_18_0= ruleAAlphaExpression
                    {

                    						newCompositeNode(grammarAccess.getAUseEquationAccess().getInputExprsAAlphaExpressionParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_inputExprs_18_0=ruleAAlphaExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAUseEquationRule());
                    						}
                    						add(
                    							current,
                    							"inputExprs",
                    							lv_inputExprs_18_0,
                    							"alpha.Alpha.AAlphaExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlpha.g:1994:4: (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAAlphaExpression ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==47) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalAlpha.g:1995:5: otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAAlphaExpression ) )
                    	    {
                    	    otherlv_19=(Token)match(input,47,FOLLOW_36); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getAUseEquationAccess().getCommaKeyword_13_1_0());
                    	    				
                    	    // InternalAlpha.g:1999:5: ( (lv_inputExprs_20_0= ruleAAlphaExpression ) )
                    	    // InternalAlpha.g:2000:6: (lv_inputExprs_20_0= ruleAAlphaExpression )
                    	    {
                    	    // InternalAlpha.g:2000:6: (lv_inputExprs_20_0= ruleAAlphaExpression )
                    	    // InternalAlpha.g:2001:7: lv_inputExprs_20_0= ruleAAlphaExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getAUseEquationAccess().getInputExprsAAlphaExpressionParserRuleCall_13_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_39);
                    	    lv_inputExprs_20_0=ruleAAlphaExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAUseEquationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputExprs",
                    	    								lv_inputExprs_20_0,
                    	    								"alpha.Alpha.AAlphaExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_21=(Token)match(input,39,FOLLOW_7); 

            			newLeafNode(otherlv_21, grammarAccess.getAUseEquationAccess().getRightParenthesisKeyword_14());
            		
            otherlv_22=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getAUseEquationAccess().getSemicolonKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAUseEquation"


    // $ANTLR start "entryRuleAAlphaExpression"
    // InternalAlpha.g:2032:1: entryRuleAAlphaExpression returns [EObject current=null] : iv_ruleAAlphaExpression= ruleAAlphaExpression EOF ;
    public final EObject entryRuleAAlphaExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAAlphaExpression = null;


        try {
            // InternalAlpha.g:2032:57: (iv_ruleAAlphaExpression= ruleAAlphaExpression EOF )
            // InternalAlpha.g:2033:2: iv_ruleAAlphaExpression= ruleAAlphaExpression EOF
            {
             newCompositeNode(grammarAccess.getAAlphaExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAAlphaExpression=ruleAAlphaExpression();

            state._fsp--;

             current =iv_ruleAAlphaExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAAlphaExpression"


    // $ANTLR start "ruleAAlphaExpression"
    // InternalAlpha.g:2039:1: ruleAAlphaExpression returns [EObject current=null] : (this_AIfExpression_0= ruleAIfExpression | this_ARestrictExpression_1= ruleARestrictExpression | this_AOrExpression_2= ruleAOrExpression ) ;
    public final EObject ruleAAlphaExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AIfExpression_0 = null;

        EObject this_ARestrictExpression_1 = null;

        EObject this_AOrExpression_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2045:2: ( (this_AIfExpression_0= ruleAIfExpression | this_ARestrictExpression_1= ruleARestrictExpression | this_AOrExpression_2= ruleAOrExpression ) )
            // InternalAlpha.g:2046:2: (this_AIfExpression_0= ruleAIfExpression | this_ARestrictExpression_1= ruleARestrictExpression | this_AOrExpression_2= ruleAOrExpression )
            {
            // InternalAlpha.g:2046:2: (this_AIfExpression_0= ruleAIfExpression | this_ARestrictExpression_1= ruleARestrictExpression | this_AOrExpression_2= ruleAOrExpression )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt33=1;
                }
                break;
            case 33:
                {
                alt33=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_OP_PLUS:
            case RULE_OP_MINUS:
            case RULE_OP_MUL:
            case RULE_OP_AND:
            case RULE_OP_OR:
            case RULE_OP_XOR:
            case RULE_OP_MIN:
            case RULE_OP_MAX:
            case RULE_BOOLEAN:
            case RULE_REAL:
            case 38:
            case 50:
            case 58:
            case 59:
            case 64:
            case 65:
            case 66:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalAlpha.g:2047:3: this_AIfExpression_0= ruleAIfExpression
                    {

                    			newCompositeNode(grammarAccess.getAAlphaExpressionAccess().getAIfExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AIfExpression_0=ruleAIfExpression();

                    state._fsp--;


                    			current = this_AIfExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:2056:3: this_ARestrictExpression_1= ruleARestrictExpression
                    {

                    			newCompositeNode(grammarAccess.getAAlphaExpressionAccess().getARestrictExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ARestrictExpression_1=ruleARestrictExpression();

                    state._fsp--;


                    			current = this_ARestrictExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:2065:3: this_AOrExpression_2= ruleAOrExpression
                    {

                    			newCompositeNode(grammarAccess.getAAlphaExpressionAccess().getAOrExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AOrExpression_2=ruleAOrExpression();

                    state._fsp--;


                    			current = this_AOrExpression_2;
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
    // $ANTLR end "ruleAAlphaExpression"


    // $ANTLR start "entryRuleAAlphabetsTerminalExpression"
    // InternalAlpha.g:2077:1: entryRuleAAlphabetsTerminalExpression returns [EObject current=null] : iv_ruleAAlphabetsTerminalExpression= ruleAAlphabetsTerminalExpression EOF ;
    public final EObject entryRuleAAlphabetsTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAAlphabetsTerminalExpression = null;


        try {
            // InternalAlpha.g:2077:69: (iv_ruleAAlphabetsTerminalExpression= ruleAAlphabetsTerminalExpression EOF )
            // InternalAlpha.g:2078:2: iv_ruleAAlphabetsTerminalExpression= ruleAAlphabetsTerminalExpression EOF
            {
             newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAAlphabetsTerminalExpression=ruleAAlphabetsTerminalExpression();

            state._fsp--;

             current =iv_ruleAAlphabetsTerminalExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAAlphabetsTerminalExpression"


    // $ANTLR start "ruleAAlphabetsTerminalExpression"
    // InternalAlpha.g:2084:1: ruleAAlphabetsTerminalExpression returns [EObject current=null] : (this_AParanthesizedAlphabetsExpression_0= ruleAParanthesizedAlphabetsExpression | this_ACaseExpression_1= ruleACaseExpression | this_AReduceExpression_2= ruleAReduceExpression | this_AArgReduceExpression_3= ruleAArgReduceExpression | this_AMultiArgExpression_4= ruleAMultiArgExpression | this_AConstantExpression_5= ruleAConstantExpression | this_AVariableExpression_6= ruleAVariableExpression | this_AIndexExpression_7= ruleAIndexExpression | this_ADependenceExpression_8= ruleADependenceExpression | this_ADependenceInArrayNotation_9= ruleADependenceInArrayNotation ) ;
    public final EObject ruleAAlphabetsTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AParanthesizedAlphabetsExpression_0 = null;

        EObject this_ACaseExpression_1 = null;

        EObject this_AReduceExpression_2 = null;

        EObject this_AArgReduceExpression_3 = null;

        EObject this_AMultiArgExpression_4 = null;

        EObject this_AConstantExpression_5 = null;

        EObject this_AVariableExpression_6 = null;

        EObject this_AIndexExpression_7 = null;

        EObject this_ADependenceExpression_8 = null;

        EObject this_ADependenceInArrayNotation_9 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2090:2: ( (this_AParanthesizedAlphabetsExpression_0= ruleAParanthesizedAlphabetsExpression | this_ACaseExpression_1= ruleACaseExpression | this_AReduceExpression_2= ruleAReduceExpression | this_AArgReduceExpression_3= ruleAArgReduceExpression | this_AMultiArgExpression_4= ruleAMultiArgExpression | this_AConstantExpression_5= ruleAConstantExpression | this_AVariableExpression_6= ruleAVariableExpression | this_AIndexExpression_7= ruleAIndexExpression | this_ADependenceExpression_8= ruleADependenceExpression | this_ADependenceInArrayNotation_9= ruleADependenceInArrayNotation ) )
            // InternalAlpha.g:2091:2: (this_AParanthesizedAlphabetsExpression_0= ruleAParanthesizedAlphabetsExpression | this_ACaseExpression_1= ruleACaseExpression | this_AReduceExpression_2= ruleAReduceExpression | this_AArgReduceExpression_3= ruleAArgReduceExpression | this_AMultiArgExpression_4= ruleAMultiArgExpression | this_AConstantExpression_5= ruleAConstantExpression | this_AVariableExpression_6= ruleAVariableExpression | this_AIndexExpression_7= ruleAIndexExpression | this_ADependenceExpression_8= ruleADependenceExpression | this_ADependenceInArrayNotation_9= ruleADependenceInArrayNotation )
            {
            // InternalAlpha.g:2091:2: (this_AParanthesizedAlphabetsExpression_0= ruleAParanthesizedAlphabetsExpression | this_ACaseExpression_1= ruleACaseExpression | this_AReduceExpression_2= ruleAReduceExpression | this_AArgReduceExpression_3= ruleAArgReduceExpression | this_AMultiArgExpression_4= ruleAMultiArgExpression | this_AConstantExpression_5= ruleAConstantExpression | this_AVariableExpression_6= ruleAVariableExpression | this_AIndexExpression_7= ruleAIndexExpression | this_ADependenceExpression_8= ruleADependenceExpression | this_ADependenceInArrayNotation_9= ruleADependenceInArrayNotation )
            int alt34=10;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalAlpha.g:2092:3: this_AParanthesizedAlphabetsExpression_0= ruleAParanthesizedAlphabetsExpression
                    {

                    			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getAParanthesizedAlphabetsExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AParanthesizedAlphabetsExpression_0=ruleAParanthesizedAlphabetsExpression();

                    state._fsp--;


                    			current = this_AParanthesizedAlphabetsExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:2101:3: this_ACaseExpression_1= ruleACaseExpression
                    {

                    			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getACaseExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ACaseExpression_1=ruleACaseExpression();

                    state._fsp--;


                    			current = this_ACaseExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:2110:3: this_AReduceExpression_2= ruleAReduceExpression
                    {

                    			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getAReduceExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AReduceExpression_2=ruleAReduceExpression();

                    state._fsp--;


                    			current = this_AReduceExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:2119:3: this_AArgReduceExpression_3= ruleAArgReduceExpression
                    {

                    			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getAArgReduceExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AArgReduceExpression_3=ruleAArgReduceExpression();

                    state._fsp--;


                    			current = this_AArgReduceExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:2128:3: this_AMultiArgExpression_4= ruleAMultiArgExpression
                    {

                    			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getAMultiArgExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_AMultiArgExpression_4=ruleAMultiArgExpression();

                    state._fsp--;


                    			current = this_AMultiArgExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:2137:3: this_AConstantExpression_5= ruleAConstantExpression
                    {

                    			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getAConstantExpressionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_AConstantExpression_5=ruleAConstantExpression();

                    state._fsp--;


                    			current = this_AConstantExpression_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAlpha.g:2146:3: this_AVariableExpression_6= ruleAVariableExpression
                    {

                    			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getAVariableExpressionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_AVariableExpression_6=ruleAVariableExpression();

                    state._fsp--;


                    			current = this_AVariableExpression_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalAlpha.g:2155:3: this_AIndexExpression_7= ruleAIndexExpression
                    {

                    			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getAIndexExpressionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_AIndexExpression_7=ruleAIndexExpression();

                    state._fsp--;


                    			current = this_AIndexExpression_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalAlpha.g:2164:3: this_ADependenceExpression_8= ruleADependenceExpression
                    {

                    			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getADependenceExpressionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ADependenceExpression_8=ruleADependenceExpression();

                    state._fsp--;


                    			current = this_ADependenceExpression_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalAlpha.g:2173:3: this_ADependenceInArrayNotation_9= ruleADependenceInArrayNotation
                    {

                    			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getADependenceInArrayNotationParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ADependenceInArrayNotation_9=ruleADependenceInArrayNotation();

                    state._fsp--;


                    			current = this_ADependenceInArrayNotation_9;
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
    // $ANTLR end "ruleAAlphabetsTerminalExpression"


    // $ANTLR start "entryRuleAParanthesizedAlphabetsExpression"
    // InternalAlpha.g:2185:1: entryRuleAParanthesizedAlphabetsExpression returns [EObject current=null] : iv_ruleAParanthesizedAlphabetsExpression= ruleAParanthesizedAlphabetsExpression EOF ;
    public final EObject entryRuleAParanthesizedAlphabetsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAParanthesizedAlphabetsExpression = null;


        try {
            // InternalAlpha.g:2185:74: (iv_ruleAParanthesizedAlphabetsExpression= ruleAParanthesizedAlphabetsExpression EOF )
            // InternalAlpha.g:2186:2: iv_ruleAParanthesizedAlphabetsExpression= ruleAParanthesizedAlphabetsExpression EOF
            {
             newCompositeNode(grammarAccess.getAParanthesizedAlphabetsExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAParanthesizedAlphabetsExpression=ruleAParanthesizedAlphabetsExpression();

            state._fsp--;

             current =iv_ruleAParanthesizedAlphabetsExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAParanthesizedAlphabetsExpression"


    // $ANTLR start "ruleAParanthesizedAlphabetsExpression"
    // InternalAlpha.g:2192:1: ruleAParanthesizedAlphabetsExpression returns [EObject current=null] : (otherlv_0= '(' this_AAlphaExpression_1= ruleAAlphaExpression otherlv_2= ')' ) ;
    public final EObject ruleAParanthesizedAlphabetsExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AAlphaExpression_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2198:2: ( (otherlv_0= '(' this_AAlphaExpression_1= ruleAAlphaExpression otherlv_2= ')' ) )
            // InternalAlpha.g:2199:2: (otherlv_0= '(' this_AAlphaExpression_1= ruleAAlphaExpression otherlv_2= ')' )
            {
            // InternalAlpha.g:2199:2: (otherlv_0= '(' this_AAlphaExpression_1= ruleAAlphaExpression otherlv_2= ')' )
            // InternalAlpha.g:2200:3: otherlv_0= '(' this_AAlphaExpression_1= ruleAAlphaExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getAParanthesizedAlphabetsExpressionAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAParanthesizedAlphabetsExpressionAccess().getAAlphaExpressionParserRuleCall_1());
            		
            pushFollow(FOLLOW_10);
            this_AAlphaExpression_1=ruleAAlphaExpression();

            state._fsp--;


            			current = this_AAlphaExpression_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAParanthesizedAlphabetsExpressionAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAParanthesizedAlphabetsExpression"


    // $ANTLR start "entryRuleAOrExpression"
    // InternalAlpha.g:2220:1: entryRuleAOrExpression returns [EObject current=null] : iv_ruleAOrExpression= ruleAOrExpression EOF ;
    public final EObject entryRuleAOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAOrExpression = null;


        try {
            // InternalAlpha.g:2220:54: (iv_ruleAOrExpression= ruleAOrExpression EOF )
            // InternalAlpha.g:2221:2: iv_ruleAOrExpression= ruleAOrExpression EOF
            {
             newCompositeNode(grammarAccess.getAOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAOrExpression=ruleAOrExpression();

            state._fsp--;

             current =iv_ruleAOrExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAOrExpression"


    // $ANTLR start "ruleAOrExpression"
    // InternalAlpha.g:2227:1: ruleAOrExpression returns [EObject current=null] : (this_AAndExpression_0= ruleAAndExpression ( () ( ( (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR ) ) ) ( (lv_right_3_0= ruleAAndExpression ) ) )* ) ;
    public final EObject ruleAOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_AAndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2233:2: ( (this_AAndExpression_0= ruleAAndExpression ( () ( ( (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR ) ) ) ( (lv_right_3_0= ruleAAndExpression ) ) )* ) )
            // InternalAlpha.g:2234:2: (this_AAndExpression_0= ruleAAndExpression ( () ( ( (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR ) ) ) ( (lv_right_3_0= ruleAAndExpression ) ) )* )
            {
            // InternalAlpha.g:2234:2: (this_AAndExpression_0= ruleAAndExpression ( () ( ( (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR ) ) ) ( (lv_right_3_0= ruleAAndExpression ) ) )* )
            // InternalAlpha.g:2235:3: this_AAndExpression_0= ruleAAndExpression ( () ( ( (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR ) ) ) ( (lv_right_3_0= ruleAAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAOrExpressionAccess().getAAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_AAndExpression_0=ruleAAndExpression();

            state._fsp--;


            			current = this_AAndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:2243:3: ( () ( ( (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR ) ) ) ( (lv_right_3_0= ruleAAndExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_OP_OR||LA36_0==RULE_OP_XOR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAlpha.g:2244:4: () ( ( (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR ) ) ) ( (lv_right_3_0= ruleAAndExpression ) )
            	    {
            	    // InternalAlpha.g:2244:4: ()
            	    // InternalAlpha.g:2245:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAOrExpressionAccess().getAOrExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:2251:4: ( ( (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR ) ) )
            	    // InternalAlpha.g:2252:5: ( (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR ) )
            	    {
            	    // InternalAlpha.g:2252:5: ( (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR ) )
            	    // InternalAlpha.g:2253:6: (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR )
            	    {
            	    // InternalAlpha.g:2253:6: (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==RULE_OP_OR) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==RULE_OP_XOR) ) {
            	        alt35=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalAlpha.g:2254:7: lv_operator_2_1= RULE_OP_OR
            	            {
            	            lv_operator_2_1=(Token)match(input,RULE_OP_OR,FOLLOW_36); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAOrExpressionAccess().getOperatorOP_ORTerminalRuleCall_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAOrExpressionRule());
            	            							}
            	            							setWithLastConsumed(
            	            								current,
            	            								"operator",
            	            								lv_operator_2_1,
            	            								"alpha.Alpha.OP_OR");
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalAlpha.g:2269:7: lv_operator_2_2= RULE_OP_XOR
            	            {
            	            lv_operator_2_2=(Token)match(input,RULE_OP_XOR,FOLLOW_36); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getAOrExpressionAccess().getOperatorOP_XORTerminalRuleCall_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAOrExpressionRule());
            	            							}
            	            							setWithLastConsumed(
            	            								current,
            	            								"operator",
            	            								lv_operator_2_2,
            	            								"alpha.Alpha.OP_XOR");
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalAlpha.g:2286:4: ( (lv_right_3_0= ruleAAndExpression ) )
            	    // InternalAlpha.g:2287:5: (lv_right_3_0= ruleAAndExpression )
            	    {
            	    // InternalAlpha.g:2287:5: (lv_right_3_0= ruleAAndExpression )
            	    // InternalAlpha.g:2288:6: lv_right_3_0= ruleAAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAOrExpressionAccess().getRightAAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_right_3_0=ruleAAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"alpha.Alpha.AAndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // $ANTLR end "ruleAOrExpression"


    // $ANTLR start "entryRuleAAndExpression"
    // InternalAlpha.g:2310:1: entryRuleAAndExpression returns [EObject current=null] : iv_ruleAAndExpression= ruleAAndExpression EOF ;
    public final EObject entryRuleAAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAAndExpression = null;


        try {
            // InternalAlpha.g:2310:55: (iv_ruleAAndExpression= ruleAAndExpression EOF )
            // InternalAlpha.g:2311:2: iv_ruleAAndExpression= ruleAAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAAndExpression=ruleAAndExpression();

            state._fsp--;

             current =iv_ruleAAndExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAAndExpression"


    // $ANTLR start "ruleAAndExpression"
    // InternalAlpha.g:2317:1: ruleAAndExpression returns [EObject current=null] : (this_ARelationalExpression_0= ruleARelationalExpression ( () ( ( (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND ) ) ) ( (lv_right_3_0= ruleARelationalExpression ) ) )* ) ;
    public final EObject ruleAAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_ARelationalExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2323:2: ( (this_ARelationalExpression_0= ruleARelationalExpression ( () ( ( (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND ) ) ) ( (lv_right_3_0= ruleARelationalExpression ) ) )* ) )
            // InternalAlpha.g:2324:2: (this_ARelationalExpression_0= ruleARelationalExpression ( () ( ( (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND ) ) ) ( (lv_right_3_0= ruleARelationalExpression ) ) )* )
            {
            // InternalAlpha.g:2324:2: (this_ARelationalExpression_0= ruleARelationalExpression ( () ( ( (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND ) ) ) ( (lv_right_3_0= ruleARelationalExpression ) ) )* )
            // InternalAlpha.g:2325:3: this_ARelationalExpression_0= ruleARelationalExpression ( () ( ( (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND ) ) ) ( (lv_right_3_0= ruleARelationalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAAndExpressionAccess().getARelationalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_ARelationalExpression_0=ruleARelationalExpression();

            state._fsp--;


            			current = this_ARelationalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:2333:3: ( () ( ( (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND ) ) ) ( (lv_right_3_0= ruleARelationalExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_OP_AND||LA38_0==RULE_OP_NAND) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalAlpha.g:2334:4: () ( ( (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND ) ) ) ( (lv_right_3_0= ruleARelationalExpression ) )
            	    {
            	    // InternalAlpha.g:2334:4: ()
            	    // InternalAlpha.g:2335:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAAndExpressionAccess().getAAndExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:2341:4: ( ( (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND ) ) )
            	    // InternalAlpha.g:2342:5: ( (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND ) )
            	    {
            	    // InternalAlpha.g:2342:5: ( (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND ) )
            	    // InternalAlpha.g:2343:6: (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND )
            	    {
            	    // InternalAlpha.g:2343:6: (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND )
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==RULE_OP_AND) ) {
            	        alt37=1;
            	    }
            	    else if ( (LA37_0==RULE_OP_NAND) ) {
            	        alt37=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalAlpha.g:2344:7: lv_operator_2_1= RULE_OP_AND
            	            {
            	            lv_operator_2_1=(Token)match(input,RULE_OP_AND,FOLLOW_36); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAAndExpressionAccess().getOperatorOP_ANDTerminalRuleCall_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAAndExpressionRule());
            	            							}
            	            							setWithLastConsumed(
            	            								current,
            	            								"operator",
            	            								lv_operator_2_1,
            	            								"alpha.Alpha.OP_AND");
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalAlpha.g:2359:7: lv_operator_2_2= RULE_OP_NAND
            	            {
            	            lv_operator_2_2=(Token)match(input,RULE_OP_NAND,FOLLOW_36); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getAAndExpressionAccess().getOperatorOP_NANDTerminalRuleCall_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAAndExpressionRule());
            	            							}
            	            							setWithLastConsumed(
            	            								current,
            	            								"operator",
            	            								lv_operator_2_2,
            	            								"alpha.Alpha.OP_NAND");
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalAlpha.g:2376:4: ( (lv_right_3_0= ruleARelationalExpression ) )
            	    // InternalAlpha.g:2377:5: (lv_right_3_0= ruleARelationalExpression )
            	    {
            	    // InternalAlpha.g:2377:5: (lv_right_3_0= ruleARelationalExpression )
            	    // InternalAlpha.g:2378:6: lv_right_3_0= ruleARelationalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAAndExpressionAccess().getRightARelationalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_right_3_0=ruleARelationalExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"alpha.Alpha.ARelationalExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // $ANTLR end "ruleAAndExpression"


    // $ANTLR start "entryRuleARelationalExpression"
    // InternalAlpha.g:2400:1: entryRuleARelationalExpression returns [EObject current=null] : iv_ruleARelationalExpression= ruleARelationalExpression EOF ;
    public final EObject entryRuleARelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARelationalExpression = null;


        try {
            // InternalAlpha.g:2400:62: (iv_ruleARelationalExpression= ruleARelationalExpression EOF )
            // InternalAlpha.g:2401:2: iv_ruleARelationalExpression= ruleARelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getARelationalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleARelationalExpression=ruleARelationalExpression();

            state._fsp--;

             current =iv_ruleARelationalExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleARelationalExpression"


    // $ANTLR start "ruleARelationalExpression"
    // InternalAlpha.g:2407:1: ruleARelationalExpression returns [EObject current=null] : (this_AAdditiveExpression_0= ruleAAdditiveExpression ( () ( (lv_operator_2_0= ruleRELATIONAL_OP ) ) ( (lv_right_3_0= ruleAAdditiveExpression ) ) )* ) ;
    public final EObject ruleARelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AAdditiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2413:2: ( (this_AAdditiveExpression_0= ruleAAdditiveExpression ( () ( (lv_operator_2_0= ruleRELATIONAL_OP ) ) ( (lv_right_3_0= ruleAAdditiveExpression ) ) )* ) )
            // InternalAlpha.g:2414:2: (this_AAdditiveExpression_0= ruleAAdditiveExpression ( () ( (lv_operator_2_0= ruleRELATIONAL_OP ) ) ( (lv_right_3_0= ruleAAdditiveExpression ) ) )* )
            {
            // InternalAlpha.g:2414:2: (this_AAdditiveExpression_0= ruleAAdditiveExpression ( () ( (lv_operator_2_0= ruleRELATIONAL_OP ) ) ( (lv_right_3_0= ruleAAdditiveExpression ) ) )* )
            // InternalAlpha.g:2415:3: this_AAdditiveExpression_0= ruleAAdditiveExpression ( () ( (lv_operator_2_0= ruleRELATIONAL_OP ) ) ( (lv_right_3_0= ruleAAdditiveExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getARelationalExpressionAccess().getAAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_AAdditiveExpression_0=ruleAAdditiveExpression();

            state._fsp--;


            			current = this_AAdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:2423:3: ( () ( (lv_operator_2_0= ruleRELATIONAL_OP ) ) ( (lv_right_3_0= ruleAAdditiveExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_OP_EQ||(LA39_0>=RULE_OP_GE && LA39_0<=RULE_OP_NE)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAlpha.g:2424:4: () ( (lv_operator_2_0= ruleRELATIONAL_OP ) ) ( (lv_right_3_0= ruleAAdditiveExpression ) )
            	    {
            	    // InternalAlpha.g:2424:4: ()
            	    // InternalAlpha.g:2425:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getARelationalExpressionAccess().getARelationalExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:2431:4: ( (lv_operator_2_0= ruleRELATIONAL_OP ) )
            	    // InternalAlpha.g:2432:5: (lv_operator_2_0= ruleRELATIONAL_OP )
            	    {
            	    // InternalAlpha.g:2432:5: (lv_operator_2_0= ruleRELATIONAL_OP )
            	    // InternalAlpha.g:2433:6: lv_operator_2_0= ruleRELATIONAL_OP
            	    {

            	    						newCompositeNode(grammarAccess.getARelationalExpressionAccess().getOperatorRELATIONAL_OPParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_operator_2_0=ruleRELATIONAL_OP();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getARelationalExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"alpha.Alpha.RELATIONAL_OP");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAlpha.g:2450:4: ( (lv_right_3_0= ruleAAdditiveExpression ) )
            	    // InternalAlpha.g:2451:5: (lv_right_3_0= ruleAAdditiveExpression )
            	    {
            	    // InternalAlpha.g:2451:5: (lv_right_3_0= ruleAAdditiveExpression )
            	    // InternalAlpha.g:2452:6: lv_right_3_0= ruleAAdditiveExpression
            	    {

            	    						newCompositeNode(grammarAccess.getARelationalExpressionAccess().getRightAAdditiveExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_right_3_0=ruleAAdditiveExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getARelationalExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"alpha.Alpha.AAdditiveExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // $ANTLR end "ruleARelationalExpression"


    // $ANTLR start "entryRuleAAdditiveExpression"
    // InternalAlpha.g:2474:1: entryRuleAAdditiveExpression returns [EObject current=null] : iv_ruleAAdditiveExpression= ruleAAdditiveExpression EOF ;
    public final EObject entryRuleAAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAAdditiveExpression = null;


        try {
            // InternalAlpha.g:2474:60: (iv_ruleAAdditiveExpression= ruleAAdditiveExpression EOF )
            // InternalAlpha.g:2475:2: iv_ruleAAdditiveExpression= ruleAAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAAdditiveExpression=ruleAAdditiveExpression();

            state._fsp--;

             current =iv_ruleAAdditiveExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAAdditiveExpression"


    // $ANTLR start "ruleAAdditiveExpression"
    // InternalAlpha.g:2481:1: ruleAAdditiveExpression returns [EObject current=null] : (this_AMultiplicativeExpression_0= ruleAMultiplicativeExpression ( () ( ( (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS ) ) ) ( (lv_right_3_0= ruleAMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_AMultiplicativeExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2487:2: ( (this_AMultiplicativeExpression_0= ruleAMultiplicativeExpression ( () ( ( (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS ) ) ) ( (lv_right_3_0= ruleAMultiplicativeExpression ) ) )* ) )
            // InternalAlpha.g:2488:2: (this_AMultiplicativeExpression_0= ruleAMultiplicativeExpression ( () ( ( (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS ) ) ) ( (lv_right_3_0= ruleAMultiplicativeExpression ) ) )* )
            {
            // InternalAlpha.g:2488:2: (this_AMultiplicativeExpression_0= ruleAMultiplicativeExpression ( () ( ( (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS ) ) ) ( (lv_right_3_0= ruleAMultiplicativeExpression ) ) )* )
            // InternalAlpha.g:2489:3: this_AMultiplicativeExpression_0= ruleAMultiplicativeExpression ( () ( ( (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS ) ) ) ( (lv_right_3_0= ruleAMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAAdditiveExpressionAccess().getAMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_AMultiplicativeExpression_0=ruleAMultiplicativeExpression();

            state._fsp--;


            			current = this_AMultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:2497:3: ( () ( ( (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS ) ) ) ( (lv_right_3_0= ruleAMultiplicativeExpression ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=RULE_OP_PLUS && LA41_0<=RULE_OP_MINUS)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAlpha.g:2498:4: () ( ( (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS ) ) ) ( (lv_right_3_0= ruleAMultiplicativeExpression ) )
            	    {
            	    // InternalAlpha.g:2498:4: ()
            	    // InternalAlpha.g:2499:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAAdditiveExpressionAccess().getAAdditiveExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:2505:4: ( ( (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS ) ) )
            	    // InternalAlpha.g:2506:5: ( (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS ) )
            	    {
            	    // InternalAlpha.g:2506:5: ( (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS ) )
            	    // InternalAlpha.g:2507:6: (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS )
            	    {
            	    // InternalAlpha.g:2507:6: (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS )
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==RULE_OP_PLUS) ) {
            	        alt40=1;
            	    }
            	    else if ( (LA40_0==RULE_OP_MINUS) ) {
            	        alt40=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalAlpha.g:2508:7: lv_op_2_1= RULE_OP_PLUS
            	            {
            	            lv_op_2_1=(Token)match(input,RULE_OP_PLUS,FOLLOW_36); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getAAdditiveExpressionAccess().getOpOP_PLUSTerminalRuleCall_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAAdditiveExpressionRule());
            	            							}
            	            							setWithLastConsumed(
            	            								current,
            	            								"op",
            	            								lv_op_2_1,
            	            								"alpha.Alpha.OP_PLUS");
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalAlpha.g:2523:7: lv_op_2_2= RULE_OP_MINUS
            	            {
            	            lv_op_2_2=(Token)match(input,RULE_OP_MINUS,FOLLOW_36); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getAAdditiveExpressionAccess().getOpOP_MINUSTerminalRuleCall_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAAdditiveExpressionRule());
            	            							}
            	            							setWithLastConsumed(
            	            								current,
            	            								"op",
            	            								lv_op_2_2,
            	            								"alpha.Alpha.OP_MINUS");
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalAlpha.g:2540:4: ( (lv_right_3_0= ruleAMultiplicativeExpression ) )
            	    // InternalAlpha.g:2541:5: (lv_right_3_0= ruleAMultiplicativeExpression )
            	    {
            	    // InternalAlpha.g:2541:5: (lv_right_3_0= ruleAMultiplicativeExpression )
            	    // InternalAlpha.g:2542:6: lv_right_3_0= ruleAMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAAdditiveExpressionAccess().getRightAMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_right_3_0=ruleAMultiplicativeExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAAdditiveExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"alpha.Alpha.AMultiplicativeExpression");
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


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAAdditiveExpression"


    // $ANTLR start "entryRuleAMultiplicativeExpression"
    // InternalAlpha.g:2564:1: entryRuleAMultiplicativeExpression returns [EObject current=null] : iv_ruleAMultiplicativeExpression= ruleAMultiplicativeExpression EOF ;
    public final EObject entryRuleAMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAMultiplicativeExpression = null;


        try {
            // InternalAlpha.g:2564:66: (iv_ruleAMultiplicativeExpression= ruleAMultiplicativeExpression EOF )
            // InternalAlpha.g:2565:2: iv_ruleAMultiplicativeExpression= ruleAMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getAMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAMultiplicativeExpression=ruleAMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleAMultiplicativeExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAMultiplicativeExpression"


    // $ANTLR start "ruleAMultiplicativeExpression"
    // InternalAlpha.g:2571:1: ruleAMultiplicativeExpression returns [EObject current=null] : (this_AMinMaxExpression_0= ruleAMinMaxExpression ( () ( ( (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV ) ) ) ( (lv_right_3_0= ruleAMinMaxExpression ) ) )* ) ;
    public final EObject ruleAMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_AMinMaxExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2577:2: ( (this_AMinMaxExpression_0= ruleAMinMaxExpression ( () ( ( (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV ) ) ) ( (lv_right_3_0= ruleAMinMaxExpression ) ) )* ) )
            // InternalAlpha.g:2578:2: (this_AMinMaxExpression_0= ruleAMinMaxExpression ( () ( ( (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV ) ) ) ( (lv_right_3_0= ruleAMinMaxExpression ) ) )* )
            {
            // InternalAlpha.g:2578:2: (this_AMinMaxExpression_0= ruleAMinMaxExpression ( () ( ( (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV ) ) ) ( (lv_right_3_0= ruleAMinMaxExpression ) ) )* )
            // InternalAlpha.g:2579:3: this_AMinMaxExpression_0= ruleAMinMaxExpression ( () ( ( (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV ) ) ) ( (lv_right_3_0= ruleAMinMaxExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAMultiplicativeExpressionAccess().getAMinMaxExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_AMinMaxExpression_0=ruleAMinMaxExpression();

            state._fsp--;


            			current = this_AMinMaxExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:2587:3: ( () ( ( (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV ) ) ) ( (lv_right_3_0= ruleAMinMaxExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_OP_MUL && LA43_0<=RULE_OP_DIV)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalAlpha.g:2588:4: () ( ( (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV ) ) ) ( (lv_right_3_0= ruleAMinMaxExpression ) )
            	    {
            	    // InternalAlpha.g:2588:4: ()
            	    // InternalAlpha.g:2589:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAMultiplicativeExpressionAccess().getAMultiplicativeExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:2595:4: ( ( (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV ) ) )
            	    // InternalAlpha.g:2596:5: ( (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV ) )
            	    {
            	    // InternalAlpha.g:2596:5: ( (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV ) )
            	    // InternalAlpha.g:2597:6: (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV )
            	    {
            	    // InternalAlpha.g:2597:6: (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==RULE_OP_MUL) ) {
            	        alt42=1;
            	    }
            	    else if ( (LA42_0==RULE_OP_DIV) ) {
            	        alt42=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalAlpha.g:2598:7: lv_op_2_1= RULE_OP_MUL
            	            {
            	            lv_op_2_1=(Token)match(input,RULE_OP_MUL,FOLLOW_36); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getAMultiplicativeExpressionAccess().getOpOP_MULTerminalRuleCall_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAMultiplicativeExpressionRule());
            	            							}
            	            							setWithLastConsumed(
            	            								current,
            	            								"op",
            	            								lv_op_2_1,
            	            								"alpha.Alpha.OP_MUL");
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalAlpha.g:2613:7: lv_op_2_2= RULE_OP_DIV
            	            {
            	            lv_op_2_2=(Token)match(input,RULE_OP_DIV,FOLLOW_36); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getAMultiplicativeExpressionAccess().getOpOP_DIVTerminalRuleCall_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAMultiplicativeExpressionRule());
            	            							}
            	            							setWithLastConsumed(
            	            								current,
            	            								"op",
            	            								lv_op_2_2,
            	            								"alpha.Alpha.OP_DIV");
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalAlpha.g:2630:4: ( (lv_right_3_0= ruleAMinMaxExpression ) )
            	    // InternalAlpha.g:2631:5: (lv_right_3_0= ruleAMinMaxExpression )
            	    {
            	    // InternalAlpha.g:2631:5: (lv_right_3_0= ruleAMinMaxExpression )
            	    // InternalAlpha.g:2632:6: lv_right_3_0= ruleAMinMaxExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAMultiplicativeExpressionAccess().getRightAMinMaxExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_right_3_0=ruleAMinMaxExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAMultiplicativeExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"alpha.Alpha.AMinMaxExpression");
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


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAMultiplicativeExpression"


    // $ANTLR start "entryRuleAMinMaxExpression"
    // InternalAlpha.g:2654:1: entryRuleAMinMaxExpression returns [EObject current=null] : iv_ruleAMinMaxExpression= ruleAMinMaxExpression EOF ;
    public final EObject entryRuleAMinMaxExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAMinMaxExpression = null;


        try {
            // InternalAlpha.g:2654:58: (iv_ruleAMinMaxExpression= ruleAMinMaxExpression EOF )
            // InternalAlpha.g:2655:2: iv_ruleAMinMaxExpression= ruleAMinMaxExpression EOF
            {
             newCompositeNode(grammarAccess.getAMinMaxExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAMinMaxExpression=ruleAMinMaxExpression();

            state._fsp--;

             current =iv_ruleAMinMaxExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAMinMaxExpression"


    // $ANTLR start "ruleAMinMaxExpression"
    // InternalAlpha.g:2661:1: ruleAMinMaxExpression returns [EObject current=null] : (this_AUnaryOrTerminalExpression_0= ruleAUnaryOrTerminalExpression ( () ( ( (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalExpression ) ) )* ) ;
    public final EObject ruleAMinMaxExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_AUnaryOrTerminalExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2667:2: ( (this_AUnaryOrTerminalExpression_0= ruleAUnaryOrTerminalExpression ( () ( ( (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalExpression ) ) )* ) )
            // InternalAlpha.g:2668:2: (this_AUnaryOrTerminalExpression_0= ruleAUnaryOrTerminalExpression ( () ( ( (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalExpression ) ) )* )
            {
            // InternalAlpha.g:2668:2: (this_AUnaryOrTerminalExpression_0= ruleAUnaryOrTerminalExpression ( () ( ( (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalExpression ) ) )* )
            // InternalAlpha.g:2669:3: this_AUnaryOrTerminalExpression_0= ruleAUnaryOrTerminalExpression ( () ( ( (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAMinMaxExpressionAccess().getAUnaryOrTerminalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_AUnaryOrTerminalExpression_0=ruleAUnaryOrTerminalExpression();

            state._fsp--;


            			current = this_AUnaryOrTerminalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:2677:3: ( () ( ( (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_OP_MIN && LA45_0<=RULE_OP_MAX)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalAlpha.g:2678:4: () ( ( (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalExpression ) )
            	    {
            	    // InternalAlpha.g:2678:4: ()
            	    // InternalAlpha.g:2679:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAMinMaxExpressionAccess().getAMinMaxExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlpha.g:2685:4: ( ( (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX ) ) )
            	    // InternalAlpha.g:2686:5: ( (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX ) )
            	    {
            	    // InternalAlpha.g:2686:5: ( (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX ) )
            	    // InternalAlpha.g:2687:6: (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX )
            	    {
            	    // InternalAlpha.g:2687:6: (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==RULE_OP_MIN) ) {
            	        alt44=1;
            	    }
            	    else if ( (LA44_0==RULE_OP_MAX) ) {
            	        alt44=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalAlpha.g:2688:7: lv_op_2_1= RULE_OP_MIN
            	            {
            	            lv_op_2_1=(Token)match(input,RULE_OP_MIN,FOLLOW_36); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getAMinMaxExpressionAccess().getOpOP_MINTerminalRuleCall_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAMinMaxExpressionRule());
            	            							}
            	            							setWithLastConsumed(
            	            								current,
            	            								"op",
            	            								lv_op_2_1,
            	            								"alpha.Alpha.OP_MIN");
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalAlpha.g:2703:7: lv_op_2_2= RULE_OP_MAX
            	            {
            	            lv_op_2_2=(Token)match(input,RULE_OP_MAX,FOLLOW_36); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getAMinMaxExpressionAccess().getOpOP_MAXTerminalRuleCall_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAMinMaxExpressionRule());
            	            							}
            	            							setWithLastConsumed(
            	            								current,
            	            								"op",
            	            								lv_op_2_2,
            	            								"alpha.Alpha.OP_MAX");
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalAlpha.g:2720:4: ( (lv_right_3_0= ruleAUnaryOrTerminalExpression ) )
            	    // InternalAlpha.g:2721:5: (lv_right_3_0= ruleAUnaryOrTerminalExpression )
            	    {
            	    // InternalAlpha.g:2721:5: (lv_right_3_0= ruleAUnaryOrTerminalExpression )
            	    // InternalAlpha.g:2722:6: lv_right_3_0= ruleAUnaryOrTerminalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAMinMaxExpressionAccess().getRightAUnaryOrTerminalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_44);
            	    lv_right_3_0=ruleAUnaryOrTerminalExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAMinMaxExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"alpha.Alpha.AUnaryOrTerminalExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // $ANTLR end "ruleAMinMaxExpression"


    // $ANTLR start "entryRuleAUnaryOrTerminalExpression"
    // InternalAlpha.g:2744:1: entryRuleAUnaryOrTerminalExpression returns [EObject current=null] : iv_ruleAUnaryOrTerminalExpression= ruleAUnaryOrTerminalExpression EOF ;
    public final EObject entryRuleAUnaryOrTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAUnaryOrTerminalExpression = null;


        try {
            // InternalAlpha.g:2744:67: (iv_ruleAUnaryOrTerminalExpression= ruleAUnaryOrTerminalExpression EOF )
            // InternalAlpha.g:2745:2: iv_ruleAUnaryOrTerminalExpression= ruleAUnaryOrTerminalExpression EOF
            {
             newCompositeNode(grammarAccess.getAUnaryOrTerminalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAUnaryOrTerminalExpression=ruleAUnaryOrTerminalExpression();

            state._fsp--;

             current =iv_ruleAUnaryOrTerminalExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAUnaryOrTerminalExpression"


    // $ANTLR start "ruleAUnaryOrTerminalExpression"
    // InternalAlpha.g:2751:1: ruleAUnaryOrTerminalExpression returns [EObject current=null] : (this_AUnaryExpression_0= ruleAUnaryExpression | this_AAlphabetsTerminalExpression_1= ruleAAlphabetsTerminalExpression ) ;
    public final EObject ruleAUnaryOrTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AUnaryExpression_0 = null;

        EObject this_AAlphabetsTerminalExpression_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2757:2: ( (this_AUnaryExpression_0= ruleAUnaryExpression | this_AAlphabetsTerminalExpression_1= ruleAAlphabetsTerminalExpression ) )
            // InternalAlpha.g:2758:2: (this_AUnaryExpression_0= ruleAUnaryExpression | this_AAlphabetsTerminalExpression_1= ruleAAlphabetsTerminalExpression )
            {
            // InternalAlpha.g:2758:2: (this_AUnaryExpression_0= ruleAUnaryExpression | this_AAlphabetsTerminalExpression_1= ruleAAlphabetsTerminalExpression )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_OP_MINUS||LA46_0==58) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_OP_PLUS)||LA46_0==RULE_OP_MUL||(LA46_0>=RULE_OP_AND && LA46_0<=RULE_OP_OR)||LA46_0==RULE_OP_XOR||(LA46_0>=RULE_OP_MIN && LA46_0<=RULE_REAL)||LA46_0==38||LA46_0==50||LA46_0==59||(LA46_0>=64 && LA46_0<=66)) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalAlpha.g:2759:3: this_AUnaryExpression_0= ruleAUnaryExpression
                    {

                    			newCompositeNode(grammarAccess.getAUnaryOrTerminalExpressionAccess().getAUnaryExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AUnaryExpression_0=ruleAUnaryExpression();

                    state._fsp--;


                    			current = this_AUnaryExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:2768:3: this_AAlphabetsTerminalExpression_1= ruleAAlphabetsTerminalExpression
                    {

                    			newCompositeNode(grammarAccess.getAUnaryOrTerminalExpressionAccess().getAAlphabetsTerminalExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AAlphabetsTerminalExpression_1=ruleAAlphabetsTerminalExpression();

                    state._fsp--;


                    			current = this_AAlphabetsTerminalExpression_1;
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
    // $ANTLR end "ruleAUnaryOrTerminalExpression"


    // $ANTLR start "entryRuleAUnaryExpression"
    // InternalAlpha.g:2780:1: entryRuleAUnaryExpression returns [EObject current=null] : iv_ruleAUnaryExpression= ruleAUnaryExpression EOF ;
    public final EObject entryRuleAUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAUnaryExpression = null;


        try {
            // InternalAlpha.g:2780:57: (iv_ruleAUnaryExpression= ruleAUnaryExpression EOF )
            // InternalAlpha.g:2781:2: iv_ruleAUnaryExpression= ruleAUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getAUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAUnaryExpression=ruleAUnaryExpression();

            state._fsp--;

             current =iv_ruleAUnaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAUnaryExpression"


    // $ANTLR start "ruleAUnaryExpression"
    // InternalAlpha.g:2787:1: ruleAUnaryExpression returns [EObject current=null] : (this_ANotExpression_0= ruleANotExpression | this_ANegateExpression_1= ruleANegateExpression ) ;
    public final EObject ruleAUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ANotExpression_0 = null;

        EObject this_ANegateExpression_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2793:2: ( (this_ANotExpression_0= ruleANotExpression | this_ANegateExpression_1= ruleANegateExpression ) )
            // InternalAlpha.g:2794:2: (this_ANotExpression_0= ruleANotExpression | this_ANegateExpression_1= ruleANegateExpression )
            {
            // InternalAlpha.g:2794:2: (this_ANotExpression_0= ruleANotExpression | this_ANegateExpression_1= ruleANegateExpression )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==58) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_OP_MINUS) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalAlpha.g:2795:3: this_ANotExpression_0= ruleANotExpression
                    {

                    			newCompositeNode(grammarAccess.getAUnaryExpressionAccess().getANotExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ANotExpression_0=ruleANotExpression();

                    state._fsp--;


                    			current = this_ANotExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:2804:3: this_ANegateExpression_1= ruleANegateExpression
                    {

                    			newCompositeNode(grammarAccess.getAUnaryExpressionAccess().getANegateExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ANegateExpression_1=ruleANegateExpression();

                    state._fsp--;


                    			current = this_ANegateExpression_1;
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
    // $ANTLR end "ruleAUnaryExpression"


    // $ANTLR start "entryRuleANotExpression"
    // InternalAlpha.g:2816:1: entryRuleANotExpression returns [EObject current=null] : iv_ruleANotExpression= ruleANotExpression EOF ;
    public final EObject entryRuleANotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANotExpression = null;


        try {
            // InternalAlpha.g:2816:55: (iv_ruleANotExpression= ruleANotExpression EOF )
            // InternalAlpha.g:2817:2: iv_ruleANotExpression= ruleANotExpression EOF
            {
             newCompositeNode(grammarAccess.getANotExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleANotExpression=ruleANotExpression();

            state._fsp--;

             current =iv_ruleANotExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleANotExpression"


    // $ANTLR start "ruleANotExpression"
    // InternalAlpha.g:2823:1: ruleANotExpression returns [EObject current=null] : ( ( (lv_op_0_0= 'not' ) ) ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) ) ) ;
    public final EObject ruleANotExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2829:2: ( ( ( (lv_op_0_0= 'not' ) ) ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) ) ) )
            // InternalAlpha.g:2830:2: ( ( (lv_op_0_0= 'not' ) ) ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) ) )
            {
            // InternalAlpha.g:2830:2: ( ( (lv_op_0_0= 'not' ) ) ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) ) )
            // InternalAlpha.g:2831:3: ( (lv_op_0_0= 'not' ) ) ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) )
            {
            // InternalAlpha.g:2831:3: ( (lv_op_0_0= 'not' ) )
            // InternalAlpha.g:2832:4: (lv_op_0_0= 'not' )
            {
            // InternalAlpha.g:2832:4: (lv_op_0_0= 'not' )
            // InternalAlpha.g:2833:5: lv_op_0_0= 'not'
            {
            lv_op_0_0=(Token)match(input,58,FOLLOW_36); 

            					newLeafNode(lv_op_0_0, grammarAccess.getANotExpressionAccess().getOpNotKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getANotExpressionRule());
            					}
            					setWithLastConsumed(current, "op", lv_op_0_0, "not");
            				

            }


            }

            // InternalAlpha.g:2845:3: ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) )
            // InternalAlpha.g:2846:4: (lv_expr_1_0= ruleAAlphabetsTerminalExpression )
            {
            // InternalAlpha.g:2846:4: (lv_expr_1_0= ruleAAlphabetsTerminalExpression )
            // InternalAlpha.g:2847:5: lv_expr_1_0= ruleAAlphabetsTerminalExpression
            {

            					newCompositeNode(grammarAccess.getANotExpressionAccess().getExprAAlphabetsTerminalExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_1_0=ruleAAlphabetsTerminalExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getANotExpressionRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"alpha.Alpha.AAlphabetsTerminalExpression");
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
    // $ANTLR end "ruleANotExpression"


    // $ANTLR start "entryRuleANegateExpression"
    // InternalAlpha.g:2868:1: entryRuleANegateExpression returns [EObject current=null] : iv_ruleANegateExpression= ruleANegateExpression EOF ;
    public final EObject entryRuleANegateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANegateExpression = null;


        try {
            // InternalAlpha.g:2868:58: (iv_ruleANegateExpression= ruleANegateExpression EOF )
            // InternalAlpha.g:2869:2: iv_ruleANegateExpression= ruleANegateExpression EOF
            {
             newCompositeNode(grammarAccess.getANegateExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleANegateExpression=ruleANegateExpression();

            state._fsp--;

             current =iv_ruleANegateExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleANegateExpression"


    // $ANTLR start "ruleANegateExpression"
    // InternalAlpha.g:2875:1: ruleANegateExpression returns [EObject current=null] : ( ( (lv_op_0_0= RULE_OP_MINUS ) ) ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) ) ) ;
    public final EObject ruleANegateExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2881:2: ( ( ( (lv_op_0_0= RULE_OP_MINUS ) ) ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) ) ) )
            // InternalAlpha.g:2882:2: ( ( (lv_op_0_0= RULE_OP_MINUS ) ) ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) ) )
            {
            // InternalAlpha.g:2882:2: ( ( (lv_op_0_0= RULE_OP_MINUS ) ) ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) ) )
            // InternalAlpha.g:2883:3: ( (lv_op_0_0= RULE_OP_MINUS ) ) ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) )
            {
            // InternalAlpha.g:2883:3: ( (lv_op_0_0= RULE_OP_MINUS ) )
            // InternalAlpha.g:2884:4: (lv_op_0_0= RULE_OP_MINUS )
            {
            // InternalAlpha.g:2884:4: (lv_op_0_0= RULE_OP_MINUS )
            // InternalAlpha.g:2885:5: lv_op_0_0= RULE_OP_MINUS
            {
            lv_op_0_0=(Token)match(input,RULE_OP_MINUS,FOLLOW_36); 

            					newLeafNode(lv_op_0_0, grammarAccess.getANegateExpressionAccess().getOpOP_MINUSTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getANegateExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"op",
            						lv_op_0_0,
            						"alpha.Alpha.OP_MINUS");
            				

            }


            }

            // InternalAlpha.g:2901:3: ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) )
            // InternalAlpha.g:2902:4: (lv_expr_1_0= ruleAAlphabetsTerminalExpression )
            {
            // InternalAlpha.g:2902:4: (lv_expr_1_0= ruleAAlphabetsTerminalExpression )
            // InternalAlpha.g:2903:5: lv_expr_1_0= ruleAAlphabetsTerminalExpression
            {

            					newCompositeNode(grammarAccess.getANegateExpressionAccess().getExprAAlphabetsTerminalExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_1_0=ruleAAlphabetsTerminalExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getANegateExpressionRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"alpha.Alpha.AAlphabetsTerminalExpression");
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
    // $ANTLR end "ruleANegateExpression"


    // $ANTLR start "entryRuleACaseExpression"
    // InternalAlpha.g:2924:1: entryRuleACaseExpression returns [EObject current=null] : iv_ruleACaseExpression= ruleACaseExpression EOF ;
    public final EObject entryRuleACaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACaseExpression = null;


        try {
            // InternalAlpha.g:2924:56: (iv_ruleACaseExpression= ruleACaseExpression EOF )
            // InternalAlpha.g:2925:2: iv_ruleACaseExpression= ruleACaseExpression EOF
            {
             newCompositeNode(grammarAccess.getACaseExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleACaseExpression=ruleACaseExpression();

            state._fsp--;

             current =iv_ruleACaseExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleACaseExpression"


    // $ANTLR start "ruleACaseExpression"
    // InternalAlpha.g:2931:1: ruleACaseExpression returns [EObject current=null] : (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' ) ;
    public final EObject ruleACaseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2937:2: ( (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' ) )
            // InternalAlpha.g:2938:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' )
            {
            // InternalAlpha.g:2938:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' )
            // InternalAlpha.g:2939:3: otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getACaseExpressionAccess().getCaseKeyword_0());
            		
            // InternalAlpha.g:2943:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAlpha.g:2944:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalAlpha.g:2944:4: (lv_name_1_0= RULE_ID )
                    // InternalAlpha.g:2945:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getACaseExpressionAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getACaseExpressionRule());
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

            otherlv_2=(Token)match(input,33,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getACaseExpressionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlpha.g:2965:3: ( ( (lv_exprs_3_0= ruleAAlphaExpression ) ) otherlv_4= ';' )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_OP_MUL)||(LA49_0>=RULE_OP_AND && LA49_0<=RULE_OP_OR)||LA49_0==RULE_OP_XOR||(LA49_0>=RULE_OP_MIN && LA49_0<=RULE_REAL)||LA49_0==33||LA49_0==38||LA49_0==50||(LA49_0>=58 && LA49_0<=59)||LA49_0==61||(LA49_0>=64 && LA49_0<=66)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalAlpha.g:2966:4: ( (lv_exprs_3_0= ruleAAlphaExpression ) ) otherlv_4= ';'
            	    {
            	    // InternalAlpha.g:2966:4: ( (lv_exprs_3_0= ruleAAlphaExpression ) )
            	    // InternalAlpha.g:2967:5: (lv_exprs_3_0= ruleAAlphaExpression )
            	    {
            	    // InternalAlpha.g:2967:5: (lv_exprs_3_0= ruleAAlphaExpression )
            	    // InternalAlpha.g:2968:6: lv_exprs_3_0= ruleAAlphaExpression
            	    {

            	    						newCompositeNode(grammarAccess.getACaseExpressionAccess().getExprsAAlphaExpressionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_exprs_3_0=ruleAAlphaExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getACaseExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exprs",
            	    							lv_exprs_3_0,
            	    							"alpha.Alpha.AAlphaExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,37,FOLLOW_46); 

            	    				newLeafNode(otherlv_4, grammarAccess.getACaseExpressionAccess().getSemicolonKeyword_3_1());
            	    			

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

            otherlv_5=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getACaseExpressionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleACaseExpression"


    // $ANTLR start "entryRuleADependenceExpression"
    // InternalAlpha.g:2998:1: entryRuleADependenceExpression returns [EObject current=null] : iv_ruleADependenceExpression= ruleADependenceExpression EOF ;
    public final EObject entryRuleADependenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADependenceExpression = null;


        try {
            // InternalAlpha.g:2998:62: (iv_ruleADependenceExpression= ruleADependenceExpression EOF )
            // InternalAlpha.g:2999:2: iv_ruleADependenceExpression= ruleADependenceExpression EOF
            {
             newCompositeNode(grammarAccess.getADependenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleADependenceExpression=ruleADependenceExpression();

            state._fsp--;

             current =iv_ruleADependenceExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleADependenceExpression"


    // $ANTLR start "ruleADependenceExpression"
    // InternalAlpha.g:3005:1: ruleADependenceExpression returns [EObject current=null] : ( ( (lv_func_0_0= ruleAFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAAlphabetsTerminalExpression ) ) ) ;
    public final EObject ruleADependenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_func_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3011:2: ( ( ( (lv_func_0_0= ruleAFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAAlphabetsTerminalExpression ) ) ) )
            // InternalAlpha.g:3012:2: ( ( (lv_func_0_0= ruleAFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAAlphabetsTerminalExpression ) ) )
            {
            // InternalAlpha.g:3012:2: ( ( (lv_func_0_0= ruleAFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAAlphabetsTerminalExpression ) ) )
            // InternalAlpha.g:3013:3: ( (lv_func_0_0= ruleAFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAAlphabetsTerminalExpression ) )
            {
            // InternalAlpha.g:3013:3: ( (lv_func_0_0= ruleAFunction ) )
            // InternalAlpha.g:3014:4: (lv_func_0_0= ruleAFunction )
            {
            // InternalAlpha.g:3014:4: (lv_func_0_0= ruleAFunction )
            // InternalAlpha.g:3015:5: lv_func_0_0= ruleAFunction
            {

            					newCompositeNode(grammarAccess.getADependenceExpressionAccess().getFuncAFunctionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_47);
            lv_func_0_0=ruleAFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getADependenceExpressionRule());
            					}
            					set(
            						current,
            						"func",
            						lv_func_0_0,
            						"alpha.Alpha.AFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,60,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getADependenceExpressionAccess().getCommercialAtKeyword_1());
            		
            // InternalAlpha.g:3036:3: ( (lv_expr_2_0= ruleAAlphabetsTerminalExpression ) )
            // InternalAlpha.g:3037:4: (lv_expr_2_0= ruleAAlphabetsTerminalExpression )
            {
            // InternalAlpha.g:3037:4: (lv_expr_2_0= ruleAAlphabetsTerminalExpression )
            // InternalAlpha.g:3038:5: lv_expr_2_0= ruleAAlphabetsTerminalExpression
            {

            					newCompositeNode(grammarAccess.getADependenceExpressionAccess().getExprAAlphabetsTerminalExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleAAlphabetsTerminalExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getADependenceExpressionRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"alpha.Alpha.AAlphabetsTerminalExpression");
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
    // $ANTLR end "ruleADependenceExpression"


    // $ANTLR start "entryRuleADependenceInArrayNotation"
    // InternalAlpha.g:3059:1: entryRuleADependenceInArrayNotation returns [EObject current=null] : iv_ruleADependenceInArrayNotation= ruleADependenceInArrayNotation EOF ;
    public final EObject entryRuleADependenceInArrayNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADependenceInArrayNotation = null;


        try {
            // InternalAlpha.g:3059:67: (iv_ruleADependenceInArrayNotation= ruleADependenceInArrayNotation EOF )
            // InternalAlpha.g:3060:2: iv_ruleADependenceInArrayNotation= ruleADependenceInArrayNotation EOF
            {
             newCompositeNode(grammarAccess.getADependenceInArrayNotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleADependenceInArrayNotation=ruleADependenceInArrayNotation();

            state._fsp--;

             current =iv_ruleADependenceInArrayNotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleADependenceInArrayNotation"


    // $ANTLR start "ruleADependenceInArrayNotation"
    // InternalAlpha.g:3066:1: ruleADependenceInArrayNotation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_dep_2_0= ruleAIndexAffineExpressionList ) ) otherlv_3= ']' ) ;
    public final EObject ruleADependenceInArrayNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dep_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3072:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_dep_2_0= ruleAIndexAffineExpressionList ) ) otherlv_3= ']' ) )
            // InternalAlpha.g:3073:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_dep_2_0= ruleAIndexAffineExpressionList ) ) otherlv_3= ']' )
            {
            // InternalAlpha.g:3073:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_dep_2_0= ruleAIndexAffineExpressionList ) ) otherlv_3= ']' )
            // InternalAlpha.g:3074:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_dep_2_0= ruleAIndexAffineExpressionList ) ) otherlv_3= ']'
            {
            // InternalAlpha.g:3074:3: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:3075:4: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:3075:4: (otherlv_0= RULE_ID )
            // InternalAlpha.g:3076:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getADependenceInArrayNotationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getADependenceInArrayNotationAccess().getVarAVariableCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,50,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getADependenceInArrayNotationAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalAlpha.g:3091:3: ( (lv_dep_2_0= ruleAIndexAffineExpressionList ) )
            // InternalAlpha.g:3092:4: (lv_dep_2_0= ruleAIndexAffineExpressionList )
            {
            // InternalAlpha.g:3092:4: (lv_dep_2_0= ruleAIndexAffineExpressionList )
            // InternalAlpha.g:3093:5: lv_dep_2_0= ruleAIndexAffineExpressionList
            {

            					newCompositeNode(grammarAccess.getADependenceInArrayNotationAccess().getDepAIndexAffineExpressionListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_dep_2_0=ruleAIndexAffineExpressionList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getADependenceInArrayNotationRule());
            					}
            					set(
            						current,
            						"dep",
            						lv_dep_2_0,
            						"alpha.Alpha.AIndexAffineExpressionList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,51,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getADependenceInArrayNotationAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleADependenceInArrayNotation"


    // $ANTLR start "entryRuleAIfExpression"
    // InternalAlpha.g:3118:1: entryRuleAIfExpression returns [EObject current=null] : iv_ruleAIfExpression= ruleAIfExpression EOF ;
    public final EObject entryRuleAIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAIfExpression = null;


        try {
            // InternalAlpha.g:3118:54: (iv_ruleAIfExpression= ruleAIfExpression EOF )
            // InternalAlpha.g:3119:2: iv_ruleAIfExpression= ruleAIfExpression EOF
            {
             newCompositeNode(grammarAccess.getAIfExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAIfExpression=ruleAIfExpression();

            state._fsp--;

             current =iv_ruleAIfExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAIfExpression"


    // $ANTLR start "ruleAIfExpression"
    // InternalAlpha.g:3125:1: ruleAIfExpression returns [EObject current=null] : (otherlv_0= 'if' ( (lv_cond_1_0= ruleAAlphaExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleAAlphaExpression ) ) otherlv_4= 'else' ( (lv_else_5_0= ruleAAlphaExpression ) ) ) ;
    public final EObject ruleAIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cond_1_0 = null;

        EObject lv_then_3_0 = null;

        EObject lv_else_5_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3131:2: ( (otherlv_0= 'if' ( (lv_cond_1_0= ruleAAlphaExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleAAlphaExpression ) ) otherlv_4= 'else' ( (lv_else_5_0= ruleAAlphaExpression ) ) ) )
            // InternalAlpha.g:3132:2: (otherlv_0= 'if' ( (lv_cond_1_0= ruleAAlphaExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleAAlphaExpression ) ) otherlv_4= 'else' ( (lv_else_5_0= ruleAAlphaExpression ) ) )
            {
            // InternalAlpha.g:3132:2: (otherlv_0= 'if' ( (lv_cond_1_0= ruleAAlphaExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleAAlphaExpression ) ) otherlv_4= 'else' ( (lv_else_5_0= ruleAAlphaExpression ) ) )
            // InternalAlpha.g:3133:3: otherlv_0= 'if' ( (lv_cond_1_0= ruleAAlphaExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleAAlphaExpression ) ) otherlv_4= 'else' ( (lv_else_5_0= ruleAAlphaExpression ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getAIfExpressionAccess().getIfKeyword_0());
            		
            // InternalAlpha.g:3137:3: ( (lv_cond_1_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:3138:4: (lv_cond_1_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:3138:4: (lv_cond_1_0= ruleAAlphaExpression )
            // InternalAlpha.g:3139:5: lv_cond_1_0= ruleAAlphaExpression
            {

            					newCompositeNode(grammarAccess.getAIfExpressionAccess().getCondAAlphaExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_49);
            lv_cond_1_0=ruleAAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAIfExpressionRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_1_0,
            						"alpha.Alpha.AAlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,62,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getAIfExpressionAccess().getThenKeyword_2());
            		
            // InternalAlpha.g:3160:3: ( (lv_then_3_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:3161:4: (lv_then_3_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:3161:4: (lv_then_3_0= ruleAAlphaExpression )
            // InternalAlpha.g:3162:5: lv_then_3_0= ruleAAlphaExpression
            {

            					newCompositeNode(grammarAccess.getAIfExpressionAccess().getThenAAlphaExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_50);
            lv_then_3_0=ruleAAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAIfExpressionRule());
            					}
            					set(
            						current,
            						"then",
            						lv_then_3_0,
            						"alpha.Alpha.AAlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,63,FOLLOW_36); 

            			newLeafNode(otherlv_4, grammarAccess.getAIfExpressionAccess().getElseKeyword_4());
            		
            // InternalAlpha.g:3183:3: ( (lv_else_5_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:3184:4: (lv_else_5_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:3184:4: (lv_else_5_0= ruleAAlphaExpression )
            // InternalAlpha.g:3185:5: lv_else_5_0= ruleAAlphaExpression
            {

            					newCompositeNode(grammarAccess.getAIfExpressionAccess().getElseAAlphaExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_else_5_0=ruleAAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAIfExpressionRule());
            					}
            					set(
            						current,
            						"else",
            						lv_else_5_0,
            						"alpha.Alpha.AAlphaExpression");
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
    // $ANTLR end "ruleAIfExpression"


    // $ANTLR start "entryRuleAIndexExpression"
    // InternalAlpha.g:3206:1: entryRuleAIndexExpression returns [EObject current=null] : iv_ruleAIndexExpression= ruleAIndexExpression EOF ;
    public final EObject entryRuleAIndexExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAIndexExpression = null;


        try {
            // InternalAlpha.g:3206:57: (iv_ruleAIndexExpression= ruleAIndexExpression EOF )
            // InternalAlpha.g:3207:2: iv_ruleAIndexExpression= ruleAIndexExpression EOF
            {
             newCompositeNode(grammarAccess.getAIndexExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAIndexExpression=ruleAIndexExpression();

            state._fsp--;

             current =iv_ruleAIndexExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAIndexExpression"


    // $ANTLR start "ruleAIndexExpression"
    // InternalAlpha.g:3213:1: ruleAIndexExpression returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_func_1_0= ruleIndexAffineExpressionTerminal ) ) otherlv_2= ']' ) | (otherlv_3= 'val(' ( (lv_indexes_4_0= ruleAIndexList ) ) otherlv_5= '->' ( (lv_func_6_0= ruleIndexAffineExpressionTerminal ) ) otherlv_7= ')' ) ) ;
    public final EObject ruleAIndexExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_func_1_0 = null;

        EObject lv_indexes_4_0 = null;

        AntlrDatatypeRuleToken lv_func_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3219:2: ( ( (otherlv_0= '[' ( (lv_func_1_0= ruleIndexAffineExpressionTerminal ) ) otherlv_2= ']' ) | (otherlv_3= 'val(' ( (lv_indexes_4_0= ruleAIndexList ) ) otherlv_5= '->' ( (lv_func_6_0= ruleIndexAffineExpressionTerminal ) ) otherlv_7= ')' ) ) )
            // InternalAlpha.g:3220:2: ( (otherlv_0= '[' ( (lv_func_1_0= ruleIndexAffineExpressionTerminal ) ) otherlv_2= ']' ) | (otherlv_3= 'val(' ( (lv_indexes_4_0= ruleAIndexList ) ) otherlv_5= '->' ( (lv_func_6_0= ruleIndexAffineExpressionTerminal ) ) otherlv_7= ')' ) )
            {
            // InternalAlpha.g:3220:2: ( (otherlv_0= '[' ( (lv_func_1_0= ruleIndexAffineExpressionTerminal ) ) otherlv_2= ']' ) | (otherlv_3= 'val(' ( (lv_indexes_4_0= ruleAIndexList ) ) otherlv_5= '->' ( (lv_func_6_0= ruleIndexAffineExpressionTerminal ) ) otherlv_7= ')' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==50) ) {
                alt50=1;
            }
            else if ( (LA50_0==64) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalAlpha.g:3221:3: (otherlv_0= '[' ( (lv_func_1_0= ruleIndexAffineExpressionTerminal ) ) otherlv_2= ']' )
                    {
                    // InternalAlpha.g:3221:3: (otherlv_0= '[' ( (lv_func_1_0= ruleIndexAffineExpressionTerminal ) ) otherlv_2= ']' )
                    // InternalAlpha.g:3222:4: otherlv_0= '[' ( (lv_func_1_0= ruleIndexAffineExpressionTerminal ) ) otherlv_2= ']'
                    {
                    otherlv_0=(Token)match(input,50,FOLLOW_51); 

                    				newLeafNode(otherlv_0, grammarAccess.getAIndexExpressionAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalAlpha.g:3226:4: ( (lv_func_1_0= ruleIndexAffineExpressionTerminal ) )
                    // InternalAlpha.g:3227:5: (lv_func_1_0= ruleIndexAffineExpressionTerminal )
                    {
                    // InternalAlpha.g:3227:5: (lv_func_1_0= ruleIndexAffineExpressionTerminal )
                    // InternalAlpha.g:3228:6: lv_func_1_0= ruleIndexAffineExpressionTerminal
                    {

                    						newCompositeNode(grammarAccess.getAIndexExpressionAccess().getFuncIndexAffineExpressionTerminalParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_func_1_0=ruleIndexAffineExpressionTerminal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAIndexExpressionRule());
                    						}
                    						set(
                    							current,
                    							"func",
                    							lv_func_1_0,
                    							"alpha.Alpha.IndexAffineExpressionTerminal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,51,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getAIndexExpressionAccess().getRightSquareBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3251:3: (otherlv_3= 'val(' ( (lv_indexes_4_0= ruleAIndexList ) ) otherlv_5= '->' ( (lv_func_6_0= ruleIndexAffineExpressionTerminal ) ) otherlv_7= ')' )
                    {
                    // InternalAlpha.g:3251:3: (otherlv_3= 'val(' ( (lv_indexes_4_0= ruleAIndexList ) ) otherlv_5= '->' ( (lv_func_6_0= ruleIndexAffineExpressionTerminal ) ) otherlv_7= ')' )
                    // InternalAlpha.g:3252:4: otherlv_3= 'val(' ( (lv_indexes_4_0= ruleAIndexList ) ) otherlv_5= '->' ( (lv_func_6_0= ruleIndexAffineExpressionTerminal ) ) otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,64,FOLLOW_52); 

                    				newLeafNode(otherlv_3, grammarAccess.getAIndexExpressionAccess().getValKeyword_1_0());
                    			
                    // InternalAlpha.g:3256:4: ( (lv_indexes_4_0= ruleAIndexList ) )
                    // InternalAlpha.g:3257:5: (lv_indexes_4_0= ruleAIndexList )
                    {
                    // InternalAlpha.g:3257:5: (lv_indexes_4_0= ruleAIndexList )
                    // InternalAlpha.g:3258:6: lv_indexes_4_0= ruleAIndexList
                    {

                    						newCompositeNode(grammarAccess.getAIndexExpressionAccess().getIndexesAIndexListParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_indexes_4_0=ruleAIndexList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAIndexExpressionRule());
                    						}
                    						set(
                    							current,
                    							"indexes",
                    							lv_indexes_4_0,
                    							"alpha.Alpha.AIndexList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,55,FOLLOW_51); 

                    				newLeafNode(otherlv_5, grammarAccess.getAIndexExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_2());
                    			
                    // InternalAlpha.g:3279:4: ( (lv_func_6_0= ruleIndexAffineExpressionTerminal ) )
                    // InternalAlpha.g:3280:5: (lv_func_6_0= ruleIndexAffineExpressionTerminal )
                    {
                    // InternalAlpha.g:3280:5: (lv_func_6_0= ruleIndexAffineExpressionTerminal )
                    // InternalAlpha.g:3281:6: lv_func_6_0= ruleIndexAffineExpressionTerminal
                    {

                    						newCompositeNode(grammarAccess.getAIndexExpressionAccess().getFuncIndexAffineExpressionTerminalParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_func_6_0=ruleIndexAffineExpressionTerminal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAIndexExpressionRule());
                    						}
                    						set(
                    							current,
                    							"func",
                    							lv_func_6_0,
                    							"alpha.Alpha.IndexAffineExpressionTerminal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getAIndexExpressionAccess().getRightParenthesisKeyword_1_4());
                    			

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
    // $ANTLR end "ruleAIndexExpression"


    // $ANTLR start "entryRuleAReduceExpression"
    // InternalAlpha.g:3307:1: entryRuleAReduceExpression returns [EObject current=null] : iv_ruleAReduceExpression= ruleAReduceExpression EOF ;
    public final EObject entryRuleAReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAReduceExpression = null;


        try {
            // InternalAlpha.g:3307:58: (iv_ruleAReduceExpression= ruleAReduceExpression EOF )
            // InternalAlpha.g:3308:2: iv_ruleAReduceExpression= ruleAReduceExpression EOF
            {
             newCompositeNode(grammarAccess.getAReduceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAReduceExpression=ruleAReduceExpression();

            state._fsp--;

             current =iv_ruleAReduceExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAReduceExpression"


    // $ANTLR start "ruleAReduceExpression"
    // InternalAlpha.g:3314:1: ruleAReduceExpression returns [EObject current=null] : (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_op_2_0= ruleAReductionOperator ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_expr_6_0= ruleAAlphaExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleAReduceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_op_2_0 = null;

        EObject lv_projection_4_1 = null;

        EObject lv_projection_4_2 = null;

        EObject lv_expr_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3320:2: ( (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_op_2_0= ruleAReductionOperator ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_expr_6_0= ruleAAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:3321:2: (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_op_2_0= ruleAReductionOperator ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_expr_6_0= ruleAAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:3321:2: (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_op_2_0= ruleAReductionOperator ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_expr_6_0= ruleAAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:3322:3: otherlv_0= 'reduce' otherlv_1= '(' ( (lv_op_2_0= ruleAReductionOperator ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_expr_6_0= ruleAAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAReduceExpressionAccess().getReduceKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getAReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:3330:3: ( (lv_op_2_0= ruleAReductionOperator ) )
            // InternalAlpha.g:3331:4: (lv_op_2_0= ruleAReductionOperator )
            {
            // InternalAlpha.g:3331:4: (lv_op_2_0= ruleAReductionOperator )
            // InternalAlpha.g:3332:5: lv_op_2_0= ruleAReductionOperator
            {

            					newCompositeNode(grammarAccess.getAReduceExpressionAccess().getOpAReductionOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_54);
            lv_op_2_0=ruleAReductionOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAReduceExpressionRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_2_0,
            						"alpha.Alpha.AReductionOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,47,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getAReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:3353:3: ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) )
            // InternalAlpha.g:3354:4: ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:3354:4: ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) )
            // InternalAlpha.g:3355:5: (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation )
            {
            // InternalAlpha.g:3355:5: (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==38) ) {
                alt51=1;
            }
            else if ( (LA51_0==50) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalAlpha.g:3356:6: lv_projection_4_1= ruleAFunction
                    {

                    						newCompositeNode(grammarAccess.getAReduceExpressionAccess().getProjectionAFunctionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_projection_4_1=ruleAFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAReduceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"projection",
                    							lv_projection_4_1,
                    							"alpha.Alpha.AFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3372:6: lv_projection_4_2= ruleAFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getAReduceExpressionAccess().getProjectionAFunctionInArrayNotationParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_54);
                    lv_projection_4_2=ruleAFunctionInArrayNotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAReduceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"projection",
                    							lv_projection_4_2,
                    							"alpha.Alpha.AFunctionInArrayNotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,47,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getAReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:3394:3: ( (lv_expr_6_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:3395:4: (lv_expr_6_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:3395:4: (lv_expr_6_0= ruleAAlphaExpression )
            // InternalAlpha.g:3396:5: lv_expr_6_0= ruleAAlphaExpression
            {

            					newCompositeNode(grammarAccess.getAReduceExpressionAccess().getExprAAlphaExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_expr_6_0=ruleAAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAReduceExpressionRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_6_0,
            						"alpha.Alpha.AAlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAReduceExpressionAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAReduceExpression"


    // $ANTLR start "entryRuleAArgReduceExpression"
    // InternalAlpha.g:3421:1: entryRuleAArgReduceExpression returns [EObject current=null] : iv_ruleAArgReduceExpression= ruleAArgReduceExpression EOF ;
    public final EObject entryRuleAArgReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAArgReduceExpression = null;


        try {
            // InternalAlpha.g:3421:61: (iv_ruleAArgReduceExpression= ruleAArgReduceExpression EOF )
            // InternalAlpha.g:3422:2: iv_ruleAArgReduceExpression= ruleAArgReduceExpression EOF
            {
             newCompositeNode(grammarAccess.getAArgReduceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAArgReduceExpression=ruleAArgReduceExpression();

            state._fsp--;

             current =iv_ruleAArgReduceExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAArgReduceExpression"


    // $ANTLR start "ruleAArgReduceExpression"
    // InternalAlpha.g:3428:1: ruleAArgReduceExpression returns [EObject current=null] : (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_op_2_0= ruleAReductionOperator ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_expr_6_0= ruleAAlphaExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleAArgReduceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_op_2_0 = null;

        EObject lv_projection_4_1 = null;

        EObject lv_projection_4_2 = null;

        EObject lv_expr_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3434:2: ( (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_op_2_0= ruleAReductionOperator ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_expr_6_0= ruleAAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:3435:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_op_2_0= ruleAReductionOperator ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_expr_6_0= ruleAAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:3435:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_op_2_0= ruleAReductionOperator ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_expr_6_0= ruleAAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:3436:3: otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_op_2_0= ruleAReductionOperator ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_expr_6_0= ruleAAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAArgReduceExpressionAccess().getArgreduceKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getAArgReduceExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:3444:3: ( (lv_op_2_0= ruleAReductionOperator ) )
            // InternalAlpha.g:3445:4: (lv_op_2_0= ruleAReductionOperator )
            {
            // InternalAlpha.g:3445:4: (lv_op_2_0= ruleAReductionOperator )
            // InternalAlpha.g:3446:5: lv_op_2_0= ruleAReductionOperator
            {

            					newCompositeNode(grammarAccess.getAArgReduceExpressionAccess().getOpAReductionOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_54);
            lv_op_2_0=ruleAReductionOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAArgReduceExpressionRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_2_0,
            						"alpha.Alpha.AReductionOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,47,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getAArgReduceExpressionAccess().getCommaKeyword_3());
            		
            // InternalAlpha.g:3467:3: ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) )
            // InternalAlpha.g:3468:4: ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:3468:4: ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) )
            // InternalAlpha.g:3469:5: (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation )
            {
            // InternalAlpha.g:3469:5: (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==38) ) {
                alt52=1;
            }
            else if ( (LA52_0==50) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalAlpha.g:3470:6: lv_projection_4_1= ruleAFunction
                    {

                    						newCompositeNode(grammarAccess.getAArgReduceExpressionAccess().getProjectionAFunctionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_projection_4_1=ruleAFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAArgReduceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"projection",
                    							lv_projection_4_1,
                    							"alpha.Alpha.AFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3486:6: lv_projection_4_2= ruleAFunctionInArrayNotation
                    {

                    						newCompositeNode(grammarAccess.getAArgReduceExpressionAccess().getProjectionAFunctionInArrayNotationParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_54);
                    lv_projection_4_2=ruleAFunctionInArrayNotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAArgReduceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"projection",
                    							lv_projection_4_2,
                    							"alpha.Alpha.AFunctionInArrayNotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,47,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getAArgReduceExpressionAccess().getCommaKeyword_5());
            		
            // InternalAlpha.g:3508:3: ( (lv_expr_6_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:3509:4: (lv_expr_6_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:3509:4: (lv_expr_6_0= ruleAAlphaExpression )
            // InternalAlpha.g:3510:5: lv_expr_6_0= ruleAAlphaExpression
            {

            					newCompositeNode(grammarAccess.getAArgReduceExpressionAccess().getExprAAlphaExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_expr_6_0=ruleAAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAArgReduceExpressionRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_6_0,
            						"alpha.Alpha.AAlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAArgReduceExpressionAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAArgReduceExpression"


    // $ANTLR start "entryRuleARestrictExpression"
    // InternalAlpha.g:3535:1: entryRuleARestrictExpression returns [EObject current=null] : iv_ruleARestrictExpression= ruleARestrictExpression EOF ;
    public final EObject entryRuleARestrictExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARestrictExpression = null;


        try {
            // InternalAlpha.g:3535:60: (iv_ruleARestrictExpression= ruleARestrictExpression EOF )
            // InternalAlpha.g:3536:2: iv_ruleARestrictExpression= ruleARestrictExpression EOF
            {
             newCompositeNode(grammarAccess.getARestrictExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleARestrictExpression=ruleARestrictExpression();

            state._fsp--;

             current =iv_ruleARestrictExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleARestrictExpression"


    // $ANTLR start "ruleARestrictExpression"
    // InternalAlpha.g:3542:1: ruleARestrictExpression returns [EObject current=null] : ( ( (lv_domain_0_0= ruleADomain ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAAlphaExpression ) ) ) ;
    public final EObject ruleARestrictExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_domain_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3548:2: ( ( ( (lv_domain_0_0= ruleADomain ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAAlphaExpression ) ) ) )
            // InternalAlpha.g:3549:2: ( ( (lv_domain_0_0= ruleADomain ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAAlphaExpression ) ) )
            {
            // InternalAlpha.g:3549:2: ( ( (lv_domain_0_0= ruleADomain ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAAlphaExpression ) ) )
            // InternalAlpha.g:3550:3: ( (lv_domain_0_0= ruleADomain ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAAlphaExpression ) )
            {
            // InternalAlpha.g:3550:3: ( (lv_domain_0_0= ruleADomain ) )
            // InternalAlpha.g:3551:4: (lv_domain_0_0= ruleADomain )
            {
            // InternalAlpha.g:3551:4: (lv_domain_0_0= ruleADomain )
            // InternalAlpha.g:3552:5: lv_domain_0_0= ruleADomain
            {

            					newCompositeNode(grammarAccess.getARestrictExpressionAccess().getDomainADomainParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_domain_0_0=ruleADomain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getARestrictExpressionRule());
            					}
            					set(
            						current,
            						"domain",
            						lv_domain_0_0,
            						"alpha.Alpha.ADomain");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,52,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getARestrictExpressionAccess().getColonKeyword_1());
            		
            // InternalAlpha.g:3573:3: ( (lv_expr_2_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:3574:4: (lv_expr_2_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:3574:4: (lv_expr_2_0= ruleAAlphaExpression )
            // InternalAlpha.g:3575:5: lv_expr_2_0= ruleAAlphaExpression
            {

            					newCompositeNode(grammarAccess.getARestrictExpressionAccess().getExprAAlphaExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleAAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getARestrictExpressionRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"alpha.Alpha.AAlphaExpression");
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
    // $ANTLR end "ruleARestrictExpression"


    // $ANTLR start "entryRuleAVariableExpression"
    // InternalAlpha.g:3596:1: entryRuleAVariableExpression returns [EObject current=null] : iv_ruleAVariableExpression= ruleAVariableExpression EOF ;
    public final EObject entryRuleAVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAVariableExpression = null;


        try {
            // InternalAlpha.g:3596:60: (iv_ruleAVariableExpression= ruleAVariableExpression EOF )
            // InternalAlpha.g:3597:2: iv_ruleAVariableExpression= ruleAVariableExpression EOF
            {
             newCompositeNode(grammarAccess.getAVariableExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAVariableExpression=ruleAVariableExpression();

            state._fsp--;

             current =iv_ruleAVariableExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAVariableExpression"


    // $ANTLR start "ruleAVariableExpression"
    // InternalAlpha.g:3603:1: ruleAVariableExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleAVariableExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:3609:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalAlpha.g:3610:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalAlpha.g:3610:2: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:3611:3: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:3611:3: (otherlv_0= RULE_ID )
            // InternalAlpha.g:3612:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAVariableExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getAVariableExpressionAccess().getVarAVariableCrossReference_0());
            			

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
    // $ANTLR end "ruleAVariableExpression"


    // $ANTLR start "entryRuleAConstantExpression"
    // InternalAlpha.g:3626:1: entryRuleAConstantExpression returns [EObject current=null] : iv_ruleAConstantExpression= ruleAConstantExpression EOF ;
    public final EObject entryRuleAConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAConstantExpression = null;


        try {
            // InternalAlpha.g:3626:60: (iv_ruleAConstantExpression= ruleAConstantExpression EOF )
            // InternalAlpha.g:3627:2: iv_ruleAConstantExpression= ruleAConstantExpression EOF
            {
             newCompositeNode(grammarAccess.getAConstantExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAConstantExpression=ruleAConstantExpression();

            state._fsp--;

             current =iv_ruleAConstantExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAConstantExpression"


    // $ANTLR start "ruleAConstantExpression"
    // InternalAlpha.g:3633:1: ruleAConstantExpression returns [EObject current=null] : (this_ABooleanExpression_0= ruleABooleanExpression | this_ARealExpression_1= ruleARealExpression | this_AIntegerExpression_2= ruleAIntegerExpression ) ;
    public final EObject ruleAConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ABooleanExpression_0 = null;

        EObject this_ARealExpression_1 = null;

        EObject this_AIntegerExpression_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3639:2: ( (this_ABooleanExpression_0= ruleABooleanExpression | this_ARealExpression_1= ruleARealExpression | this_AIntegerExpression_2= ruleAIntegerExpression ) )
            // InternalAlpha.g:3640:2: (this_ABooleanExpression_0= ruleABooleanExpression | this_ARealExpression_1= ruleARealExpression | this_AIntegerExpression_2= ruleAIntegerExpression )
            {
            // InternalAlpha.g:3640:2: (this_ABooleanExpression_0= ruleABooleanExpression | this_ARealExpression_1= ruleARealExpression | this_AIntegerExpression_2= ruleAIntegerExpression )
            int alt53=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt53=1;
                }
                break;
            case RULE_REAL:
                {
                alt53=2;
                }
                break;
            case RULE_INT:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalAlpha.g:3641:3: this_ABooleanExpression_0= ruleABooleanExpression
                    {

                    			newCompositeNode(grammarAccess.getAConstantExpressionAccess().getABooleanExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ABooleanExpression_0=ruleABooleanExpression();

                    state._fsp--;


                    			current = this_ABooleanExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3650:3: this_ARealExpression_1= ruleARealExpression
                    {

                    			newCompositeNode(grammarAccess.getAConstantExpressionAccess().getARealExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ARealExpression_1=ruleARealExpression();

                    state._fsp--;


                    			current = this_ARealExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:3659:3: this_AIntegerExpression_2= ruleAIntegerExpression
                    {

                    			newCompositeNode(grammarAccess.getAConstantExpressionAccess().getAIntegerExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AIntegerExpression_2=ruleAIntegerExpression();

                    state._fsp--;


                    			current = this_AIntegerExpression_2;
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
    // $ANTLR end "ruleAConstantExpression"


    // $ANTLR start "entryRuleABooleanExpression"
    // InternalAlpha.g:3671:1: entryRuleABooleanExpression returns [EObject current=null] : iv_ruleABooleanExpression= ruleABooleanExpression EOF ;
    public final EObject entryRuleABooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleABooleanExpression = null;


        try {
            // InternalAlpha.g:3671:59: (iv_ruleABooleanExpression= ruleABooleanExpression EOF )
            // InternalAlpha.g:3672:2: iv_ruleABooleanExpression= ruleABooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getABooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleABooleanExpression=ruleABooleanExpression();

            state._fsp--;

             current =iv_ruleABooleanExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleABooleanExpression"


    // $ANTLR start "ruleABooleanExpression"
    // InternalAlpha.g:3678:1: ruleABooleanExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleABooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:3684:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalAlpha.g:3685:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalAlpha.g:3685:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalAlpha.g:3686:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalAlpha.g:3686:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalAlpha.g:3687:4: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getABooleanExpressionAccess().getValueBOOLEANTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getABooleanExpressionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"alpha.Alpha.BOOLEAN");
            			

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
    // $ANTLR end "ruleABooleanExpression"


    // $ANTLR start "entryRuleAIntegerExpression"
    // InternalAlpha.g:3706:1: entryRuleAIntegerExpression returns [EObject current=null] : iv_ruleAIntegerExpression= ruleAIntegerExpression EOF ;
    public final EObject entryRuleAIntegerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAIntegerExpression = null;


        try {
            // InternalAlpha.g:3706:59: (iv_ruleAIntegerExpression= ruleAIntegerExpression EOF )
            // InternalAlpha.g:3707:2: iv_ruleAIntegerExpression= ruleAIntegerExpression EOF
            {
             newCompositeNode(grammarAccess.getAIntegerExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAIntegerExpression=ruleAIntegerExpression();

            state._fsp--;

             current =iv_ruleAIntegerExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAIntegerExpression"


    // $ANTLR start "ruleAIntegerExpression"
    // InternalAlpha.g:3713:1: ruleAIntegerExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleAIntegerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:3719:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAlpha.g:3720:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAlpha.g:3720:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalAlpha.g:3721:3: (lv_value_0_0= RULE_INT )
            {
            // InternalAlpha.g:3721:3: (lv_value_0_0= RULE_INT )
            // InternalAlpha.g:3722:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getAIntegerExpressionAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAIntegerExpressionRule());
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
    // $ANTLR end "ruleAIntegerExpression"


    // $ANTLR start "entryRuleARealExpression"
    // InternalAlpha.g:3741:1: entryRuleARealExpression returns [EObject current=null] : iv_ruleARealExpression= ruleARealExpression EOF ;
    public final EObject entryRuleARealExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARealExpression = null;


        try {
            // InternalAlpha.g:3741:56: (iv_ruleARealExpression= ruleARealExpression EOF )
            // InternalAlpha.g:3742:2: iv_ruleARealExpression= ruleARealExpression EOF
            {
             newCompositeNode(grammarAccess.getARealExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleARealExpression=ruleARealExpression();

            state._fsp--;

             current =iv_ruleARealExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleARealExpression"


    // $ANTLR start "ruleARealExpression"
    // InternalAlpha.g:3748:1: ruleARealExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_REAL ) ) ;
    public final EObject ruleARealExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:3754:2: ( ( (lv_value_0_0= RULE_REAL ) ) )
            // InternalAlpha.g:3755:2: ( (lv_value_0_0= RULE_REAL ) )
            {
            // InternalAlpha.g:3755:2: ( (lv_value_0_0= RULE_REAL ) )
            // InternalAlpha.g:3756:3: (lv_value_0_0= RULE_REAL )
            {
            // InternalAlpha.g:3756:3: (lv_value_0_0= RULE_REAL )
            // InternalAlpha.g:3757:4: lv_value_0_0= RULE_REAL
            {
            lv_value_0_0=(Token)match(input,RULE_REAL,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getARealExpressionAccess().getValueREALTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getARealExpressionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"alpha.Alpha.REAL");
            			

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
    // $ANTLR end "ruleARealExpression"


    // $ANTLR start "entryRuleAMultiArgExpression"
    // InternalAlpha.g:3776:1: entryRuleAMultiArgExpression returns [EObject current=null] : iv_ruleAMultiArgExpression= ruleAMultiArgExpression EOF ;
    public final EObject entryRuleAMultiArgExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAMultiArgExpression = null;


        try {
            // InternalAlpha.g:3776:60: (iv_ruleAMultiArgExpression= ruleAMultiArgExpression EOF )
            // InternalAlpha.g:3777:2: iv_ruleAMultiArgExpression= ruleAMultiArgExpression EOF
            {
             newCompositeNode(grammarAccess.getAMultiArgExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAMultiArgExpression=ruleAMultiArgExpression();

            state._fsp--;

             current =iv_ruleAMultiArgExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAMultiArgExpression"


    // $ANTLR start "ruleAMultiArgExpression"
    // InternalAlpha.g:3783:1: ruleAMultiArgExpression returns [EObject current=null] : (this_AMultiArgArithmeticExpression_0= ruleAMultiArgArithmeticExpression | this_AMultiArgLogicalExpression_1= ruleAMultiArgLogicalExpression | this_AExternalFunctionCall_2= ruleAExternalFunctionCall ) ;
    public final EObject ruleAMultiArgExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AMultiArgArithmeticExpression_0 = null;

        EObject this_AMultiArgLogicalExpression_1 = null;

        EObject this_AExternalFunctionCall_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3789:2: ( (this_AMultiArgArithmeticExpression_0= ruleAMultiArgArithmeticExpression | this_AMultiArgLogicalExpression_1= ruleAMultiArgLogicalExpression | this_AExternalFunctionCall_2= ruleAExternalFunctionCall ) )
            // InternalAlpha.g:3790:2: (this_AMultiArgArithmeticExpression_0= ruleAMultiArgArithmeticExpression | this_AMultiArgLogicalExpression_1= ruleAMultiArgLogicalExpression | this_AExternalFunctionCall_2= ruleAExternalFunctionCall )
            {
            // InternalAlpha.g:3790:2: (this_AMultiArgArithmeticExpression_0= ruleAMultiArgArithmeticExpression | this_AMultiArgLogicalExpression_1= ruleAMultiArgLogicalExpression | this_AExternalFunctionCall_2= ruleAExternalFunctionCall )
            int alt54=3;
            switch ( input.LA(1) ) {
            case RULE_OP_PLUS:
            case RULE_OP_MUL:
            case RULE_OP_MIN:
            case RULE_OP_MAX:
                {
                alt54=1;
                }
                break;
            case RULE_OP_AND:
            case RULE_OP_OR:
            case RULE_OP_XOR:
                {
                alt54=2;
                }
                break;
            case RULE_ID:
                {
                alt54=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalAlpha.g:3791:3: this_AMultiArgArithmeticExpression_0= ruleAMultiArgArithmeticExpression
                    {

                    			newCompositeNode(grammarAccess.getAMultiArgExpressionAccess().getAMultiArgArithmeticExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AMultiArgArithmeticExpression_0=ruleAMultiArgArithmeticExpression();

                    state._fsp--;


                    			current = this_AMultiArgArithmeticExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3800:3: this_AMultiArgLogicalExpression_1= ruleAMultiArgLogicalExpression
                    {

                    			newCompositeNode(grammarAccess.getAMultiArgExpressionAccess().getAMultiArgLogicalExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AMultiArgLogicalExpression_1=ruleAMultiArgLogicalExpression();

                    state._fsp--;


                    			current = this_AMultiArgLogicalExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:3809:3: this_AExternalFunctionCall_2= ruleAExternalFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getAMultiArgExpressionAccess().getAExternalFunctionCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AExternalFunctionCall_2=ruleAExternalFunctionCall();

                    state._fsp--;


                    			current = this_AExternalFunctionCall_2;
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
    // $ANTLR end "ruleAMultiArgExpression"


    // $ANTLR start "entryRuleAMultiArgArithmeticExpression"
    // InternalAlpha.g:3821:1: entryRuleAMultiArgArithmeticExpression returns [EObject current=null] : iv_ruleAMultiArgArithmeticExpression= ruleAMultiArgArithmeticExpression EOF ;
    public final EObject entryRuleAMultiArgArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAMultiArgArithmeticExpression = null;


        try {
            // InternalAlpha.g:3821:70: (iv_ruleAMultiArgArithmeticExpression= ruleAMultiArgArithmeticExpression EOF )
            // InternalAlpha.g:3822:2: iv_ruleAMultiArgArithmeticExpression= ruleAMultiArgArithmeticExpression EOF
            {
             newCompositeNode(grammarAccess.getAMultiArgArithmeticExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAMultiArgArithmeticExpression=ruleAMultiArgArithmeticExpression();

            state._fsp--;

             current =iv_ruleAMultiArgArithmeticExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAMultiArgArithmeticExpression"


    // $ANTLR start "ruleAMultiArgArithmeticExpression"
    // InternalAlpha.g:3828:1: ruleAMultiArgArithmeticExpression returns [EObject current=null] : ( ( (lv_op_0_0= ruleARITHMETIC_REDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+ otherlv_5= ')' ) ;
    public final EObject ruleAMultiArgArithmeticExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_exprs_2_0 = null;

        EObject lv_exprs_4_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3834:2: ( ( ( (lv_op_0_0= ruleARITHMETIC_REDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+ otherlv_5= ')' ) )
            // InternalAlpha.g:3835:2: ( ( (lv_op_0_0= ruleARITHMETIC_REDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+ otherlv_5= ')' )
            {
            // InternalAlpha.g:3835:2: ( ( (lv_op_0_0= ruleARITHMETIC_REDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+ otherlv_5= ')' )
            // InternalAlpha.g:3836:3: ( (lv_op_0_0= ruleARITHMETIC_REDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+ otherlv_5= ')'
            {
            // InternalAlpha.g:3836:3: ( (lv_op_0_0= ruleARITHMETIC_REDUCTION_OP ) )
            // InternalAlpha.g:3837:4: (lv_op_0_0= ruleARITHMETIC_REDUCTION_OP )
            {
            // InternalAlpha.g:3837:4: (lv_op_0_0= ruleARITHMETIC_REDUCTION_OP )
            // InternalAlpha.g:3838:5: lv_op_0_0= ruleARITHMETIC_REDUCTION_OP
            {

            					newCompositeNode(grammarAccess.getAMultiArgArithmeticExpressionAccess().getOpARITHMETIC_REDUCTION_OPParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_op_0_0=ruleARITHMETIC_REDUCTION_OP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAMultiArgArithmeticExpressionRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_0_0,
            						"alpha.Alpha.ARITHMETIC_REDUCTION_OP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getAMultiArgArithmeticExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:3859:3: ( (lv_exprs_2_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:3860:4: (lv_exprs_2_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:3860:4: (lv_exprs_2_0= ruleAAlphaExpression )
            // InternalAlpha.g:3861:5: lv_exprs_2_0= ruleAAlphaExpression
            {

            					newCompositeNode(grammarAccess.getAMultiArgArithmeticExpressionAccess().getExprsAAlphaExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_54);
            lv_exprs_2_0=ruleAAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAMultiArgArithmeticExpressionRule());
            					}
            					add(
            						current,
            						"exprs",
            						lv_exprs_2_0,
            						"alpha.Alpha.AAlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:3878:3: (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==47) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalAlpha.g:3879:4: otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,47,FOLLOW_36); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAMultiArgArithmeticExpressionAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalAlpha.g:3883:4: ( (lv_exprs_4_0= ruleAAlphaExpression ) )
            	    // InternalAlpha.g:3884:5: (lv_exprs_4_0= ruleAAlphaExpression )
            	    {
            	    // InternalAlpha.g:3884:5: (lv_exprs_4_0= ruleAAlphaExpression )
            	    // InternalAlpha.g:3885:6: lv_exprs_4_0= ruleAAlphaExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAMultiArgArithmeticExpressionAccess().getExprsAAlphaExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_exprs_4_0=ruleAAlphaExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAMultiArgArithmeticExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exprs",
            	    							lv_exprs_4_0,
            	    							"alpha.Alpha.AAlphaExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


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

            otherlv_5=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAMultiArgArithmeticExpressionAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAMultiArgArithmeticExpression"


    // $ANTLR start "entryRuleAMultiArgLogicalExpression"
    // InternalAlpha.g:3911:1: entryRuleAMultiArgLogicalExpression returns [EObject current=null] : iv_ruleAMultiArgLogicalExpression= ruleAMultiArgLogicalExpression EOF ;
    public final EObject entryRuleAMultiArgLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAMultiArgLogicalExpression = null;


        try {
            // InternalAlpha.g:3911:67: (iv_ruleAMultiArgLogicalExpression= ruleAMultiArgLogicalExpression EOF )
            // InternalAlpha.g:3912:2: iv_ruleAMultiArgLogicalExpression= ruleAMultiArgLogicalExpression EOF
            {
             newCompositeNode(grammarAccess.getAMultiArgLogicalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAMultiArgLogicalExpression=ruleAMultiArgLogicalExpression();

            state._fsp--;

             current =iv_ruleAMultiArgLogicalExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAMultiArgLogicalExpression"


    // $ANTLR start "ruleAMultiArgLogicalExpression"
    // InternalAlpha.g:3918:1: ruleAMultiArgLogicalExpression returns [EObject current=null] : ( ( (lv_op_0_0= ruleLOGICAL_REDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+ otherlv_5= ')' ) ;
    public final EObject ruleAMultiArgLogicalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_exprs_2_0 = null;

        EObject lv_exprs_4_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3924:2: ( ( ( (lv_op_0_0= ruleLOGICAL_REDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+ otherlv_5= ')' ) )
            // InternalAlpha.g:3925:2: ( ( (lv_op_0_0= ruleLOGICAL_REDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+ otherlv_5= ')' )
            {
            // InternalAlpha.g:3925:2: ( ( (lv_op_0_0= ruleLOGICAL_REDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+ otherlv_5= ')' )
            // InternalAlpha.g:3926:3: ( (lv_op_0_0= ruleLOGICAL_REDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+ otherlv_5= ')'
            {
            // InternalAlpha.g:3926:3: ( (lv_op_0_0= ruleLOGICAL_REDUCTION_OP ) )
            // InternalAlpha.g:3927:4: (lv_op_0_0= ruleLOGICAL_REDUCTION_OP )
            {
            // InternalAlpha.g:3927:4: (lv_op_0_0= ruleLOGICAL_REDUCTION_OP )
            // InternalAlpha.g:3928:5: lv_op_0_0= ruleLOGICAL_REDUCTION_OP
            {

            					newCompositeNode(grammarAccess.getAMultiArgLogicalExpressionAccess().getOpLOGICAL_REDUCTION_OPParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_op_0_0=ruleLOGICAL_REDUCTION_OP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAMultiArgLogicalExpressionRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_0_0,
            						"alpha.Alpha.LOGICAL_REDUCTION_OP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getAMultiArgLogicalExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:3949:3: ( (lv_exprs_2_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:3950:4: (lv_exprs_2_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:3950:4: (lv_exprs_2_0= ruleAAlphaExpression )
            // InternalAlpha.g:3951:5: lv_exprs_2_0= ruleAAlphaExpression
            {

            					newCompositeNode(grammarAccess.getAMultiArgLogicalExpressionAccess().getExprsAAlphaExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_54);
            lv_exprs_2_0=ruleAAlphaExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAMultiArgLogicalExpressionRule());
            					}
            					add(
            						current,
            						"exprs",
            						lv_exprs_2_0,
            						"alpha.Alpha.AAlphaExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlpha.g:3968:3: (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==47) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalAlpha.g:3969:4: otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,47,FOLLOW_36); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAMultiArgLogicalExpressionAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalAlpha.g:3973:4: ( (lv_exprs_4_0= ruleAAlphaExpression ) )
            	    // InternalAlpha.g:3974:5: (lv_exprs_4_0= ruleAAlphaExpression )
            	    {
            	    // InternalAlpha.g:3974:5: (lv_exprs_4_0= ruleAAlphaExpression )
            	    // InternalAlpha.g:3975:6: lv_exprs_4_0= ruleAAlphaExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAMultiArgLogicalExpressionAccess().getExprsAAlphaExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_exprs_4_0=ruleAAlphaExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAMultiArgLogicalExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exprs",
            	    							lv_exprs_4_0,
            	    							"alpha.Alpha.AAlphaExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt56 >= 1 ) break loop56;
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
            } while (true);

            otherlv_5=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAMultiArgLogicalExpressionAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAMultiArgLogicalExpression"


    // $ANTLR start "entryRuleAExternalFunctionCall"
    // InternalAlpha.g:4001:1: entryRuleAExternalFunctionCall returns [EObject current=null] : iv_ruleAExternalFunctionCall= ruleAExternalFunctionCall EOF ;
    public final EObject entryRuleAExternalFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAExternalFunctionCall = null;


        try {
            // InternalAlpha.g:4001:62: (iv_ruleAExternalFunctionCall= ruleAExternalFunctionCall EOF )
            // InternalAlpha.g:4002:2: iv_ruleAExternalFunctionCall= ruleAExternalFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getAExternalFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAExternalFunctionCall=ruleAExternalFunctionCall();

            state._fsp--;

             current =iv_ruleAExternalFunctionCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAExternalFunctionCall"


    // $ANTLR start "ruleAExternalFunctionCall"
    // InternalAlpha.g:4008:1: ruleAExternalFunctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleAExternalFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exprs_2_0 = null;

        EObject lv_exprs_4_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4014:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalAlpha.g:4015:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalAlpha.g:4015:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )* )? otherlv_5= ')' )
            // InternalAlpha.g:4016:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalAlpha.g:4016:3: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:4017:4: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:4017:4: (otherlv_0= RULE_ID )
            // InternalAlpha.g:4018:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAExternalFunctionCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getAExternalFunctionCallAccess().getFuncAExternalFunctionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getAExternalFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlpha.g:4033:3: ( ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_OP_MUL)||(LA58_0>=RULE_OP_AND && LA58_0<=RULE_OP_OR)||LA58_0==RULE_OP_XOR||(LA58_0>=RULE_OP_MIN && LA58_0<=RULE_REAL)||LA58_0==33||LA58_0==38||LA58_0==50||(LA58_0>=58 && LA58_0<=59)||LA58_0==61||(LA58_0>=64 && LA58_0<=66)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAlpha.g:4034:4: ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )*
                    {
                    // InternalAlpha.g:4034:4: ( (lv_exprs_2_0= ruleAAlphaExpression ) )
                    // InternalAlpha.g:4035:5: (lv_exprs_2_0= ruleAAlphaExpression )
                    {
                    // InternalAlpha.g:4035:5: (lv_exprs_2_0= ruleAAlphaExpression )
                    // InternalAlpha.g:4036:6: lv_exprs_2_0= ruleAAlphaExpression
                    {

                    						newCompositeNode(grammarAccess.getAExternalFunctionCallAccess().getExprsAAlphaExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_exprs_2_0=ruleAAlphaExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAExternalFunctionCallRule());
                    						}
                    						add(
                    							current,
                    							"exprs",
                    							lv_exprs_2_0,
                    							"alpha.Alpha.AAlphaExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlpha.g:4053:4: (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==47) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalAlpha.g:4054:5: otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,47,FOLLOW_36); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAExternalFunctionCallAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlpha.g:4058:5: ( (lv_exprs_4_0= ruleAAlphaExpression ) )
                    	    // InternalAlpha.g:4059:6: (lv_exprs_4_0= ruleAAlphaExpression )
                    	    {
                    	    // InternalAlpha.g:4059:6: (lv_exprs_4_0= ruleAAlphaExpression )
                    	    // InternalAlpha.g:4060:7: lv_exprs_4_0= ruleAAlphaExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getAExternalFunctionCallAccess().getExprsAAlphaExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_39);
                    	    lv_exprs_4_0=ruleAAlphaExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAExternalFunctionCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"exprs",
                    	    								lv_exprs_4_0,
                    	    								"alpha.Alpha.AAlphaExpression");
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
                    break;

            }

            otherlv_5=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAExternalFunctionCallAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAExternalFunctionCall"


    // $ANTLR start "entryRuleIndexAffineExpression"
    // InternalAlpha.g:4087:1: entryRuleIndexAffineExpression returns [String current=null] : iv_ruleIndexAffineExpression= ruleIndexAffineExpression EOF ;
    public final String entryRuleIndexAffineExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIndexAffineExpression = null;


        try {
            // InternalAlpha.g:4087:61: (iv_ruleIndexAffineExpression= ruleIndexAffineExpression EOF )
            // InternalAlpha.g:4088:2: iv_ruleIndexAffineExpression= ruleIndexAffineExpression EOF
            {
             newCompositeNode(grammarAccess.getIndexAffineExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexAffineExpression=ruleIndexAffineExpression();

            state._fsp--;

             current =iv_ruleIndexAffineExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndexAffineExpression"


    // $ANTLR start "ruleIndexAffineExpression"
    // InternalAlpha.g:4094:1: ruleIndexAffineExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IndexAffineExpressionTerminal_0= ruleIndexAffineExpressionTerminal ( (this_OP_PLUS_1= RULE_OP_PLUS | this_OP_MINUS_2= RULE_OP_MINUS ) this_IndexAffineExpressionTerminal_3= ruleIndexAffineExpressionTerminal )* ) ;
    public final AntlrDatatypeRuleToken ruleIndexAffineExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_PLUS_1=null;
        Token this_OP_MINUS_2=null;
        AntlrDatatypeRuleToken this_IndexAffineExpressionTerminal_0 = null;

        AntlrDatatypeRuleToken this_IndexAffineExpressionTerminal_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4100:2: ( (this_IndexAffineExpressionTerminal_0= ruleIndexAffineExpressionTerminal ( (this_OP_PLUS_1= RULE_OP_PLUS | this_OP_MINUS_2= RULE_OP_MINUS ) this_IndexAffineExpressionTerminal_3= ruleIndexAffineExpressionTerminal )* ) )
            // InternalAlpha.g:4101:2: (this_IndexAffineExpressionTerminal_0= ruleIndexAffineExpressionTerminal ( (this_OP_PLUS_1= RULE_OP_PLUS | this_OP_MINUS_2= RULE_OP_MINUS ) this_IndexAffineExpressionTerminal_3= ruleIndexAffineExpressionTerminal )* )
            {
            // InternalAlpha.g:4101:2: (this_IndexAffineExpressionTerminal_0= ruleIndexAffineExpressionTerminal ( (this_OP_PLUS_1= RULE_OP_PLUS | this_OP_MINUS_2= RULE_OP_MINUS ) this_IndexAffineExpressionTerminal_3= ruleIndexAffineExpressionTerminal )* )
            // InternalAlpha.g:4102:3: this_IndexAffineExpressionTerminal_0= ruleIndexAffineExpressionTerminal ( (this_OP_PLUS_1= RULE_OP_PLUS | this_OP_MINUS_2= RULE_OP_MINUS ) this_IndexAffineExpressionTerminal_3= ruleIndexAffineExpressionTerminal )*
            {

            			newCompositeNode(grammarAccess.getIndexAffineExpressionAccess().getIndexAffineExpressionTerminalParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_IndexAffineExpressionTerminal_0=ruleIndexAffineExpressionTerminal();

            state._fsp--;


            			current.merge(this_IndexAffineExpressionTerminal_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlpha.g:4112:3: ( (this_OP_PLUS_1= RULE_OP_PLUS | this_OP_MINUS_2= RULE_OP_MINUS ) this_IndexAffineExpressionTerminal_3= ruleIndexAffineExpressionTerminal )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=RULE_OP_PLUS && LA60_0<=RULE_OP_MINUS)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalAlpha.g:4113:4: (this_OP_PLUS_1= RULE_OP_PLUS | this_OP_MINUS_2= RULE_OP_MINUS ) this_IndexAffineExpressionTerminal_3= ruleIndexAffineExpressionTerminal
            	    {
            	    // InternalAlpha.g:4113:4: (this_OP_PLUS_1= RULE_OP_PLUS | this_OP_MINUS_2= RULE_OP_MINUS )
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==RULE_OP_PLUS) ) {
            	        alt59=1;
            	    }
            	    else if ( (LA59_0==RULE_OP_MINUS) ) {
            	        alt59=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 59, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // InternalAlpha.g:4114:5: this_OP_PLUS_1= RULE_OP_PLUS
            	            {
            	            this_OP_PLUS_1=(Token)match(input,RULE_OP_PLUS,FOLLOW_51); 

            	            					current.merge(this_OP_PLUS_1);
            	            				

            	            					newLeafNode(this_OP_PLUS_1, grammarAccess.getIndexAffineExpressionAccess().getOP_PLUSTerminalRuleCall_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalAlpha.g:4122:5: this_OP_MINUS_2= RULE_OP_MINUS
            	            {
            	            this_OP_MINUS_2=(Token)match(input,RULE_OP_MINUS,FOLLOW_51); 

            	            					current.merge(this_OP_MINUS_2);
            	            				

            	            					newLeafNode(this_OP_MINUS_2, grammarAccess.getIndexAffineExpressionAccess().getOP_MINUSTerminalRuleCall_1_0_1());
            	            				

            	            }
            	            break;

            	    }


            	    				newCompositeNode(grammarAccess.getIndexAffineExpressionAccess().getIndexAffineExpressionTerminalParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_42);
            	    this_IndexAffineExpressionTerminal_3=ruleIndexAffineExpressionTerminal();

            	    state._fsp--;


            	    				current.merge(this_IndexAffineExpressionTerminal_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

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
    // $ANTLR end "ruleIndexAffineExpression"


    // $ANTLR start "entryRuleIndexAffineExpressionTerminal"
    // InternalAlpha.g:4145:1: entryRuleIndexAffineExpressionTerminal returns [String current=null] : iv_ruleIndexAffineExpressionTerminal= ruleIndexAffineExpressionTerminal EOF ;
    public final String entryRuleIndexAffineExpressionTerminal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIndexAffineExpressionTerminal = null;


        try {
            // InternalAlpha.g:4145:69: (iv_ruleIndexAffineExpressionTerminal= ruleIndexAffineExpressionTerminal EOF )
            // InternalAlpha.g:4146:2: iv_ruleIndexAffineExpressionTerminal= ruleIndexAffineExpressionTerminal EOF
            {
             newCompositeNode(grammarAccess.getIndexAffineExpressionTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexAffineExpressionTerminal=ruleIndexAffineExpressionTerminal();

            state._fsp--;

             current =iv_ruleIndexAffineExpressionTerminal.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndexAffineExpressionTerminal"


    // $ANTLR start "ruleIndexAffineExpressionTerminal"
    // InternalAlpha.g:4152:1: ruleIndexAffineExpressionTerminal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_OP_MINUS_0= RULE_OP_MINUS )? (this_INT_1= RULE_INT | ( (this_INT_2= RULE_INT )? this_IndexName_3= ruleIndexName ) ) ) ;
    public final AntlrDatatypeRuleToken ruleIndexAffineExpressionTerminal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_MINUS_0=null;
        Token this_INT_1=null;
        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_IndexName_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4158:2: ( ( (this_OP_MINUS_0= RULE_OP_MINUS )? (this_INT_1= RULE_INT | ( (this_INT_2= RULE_INT )? this_IndexName_3= ruleIndexName ) ) ) )
            // InternalAlpha.g:4159:2: ( (this_OP_MINUS_0= RULE_OP_MINUS )? (this_INT_1= RULE_INT | ( (this_INT_2= RULE_INT )? this_IndexName_3= ruleIndexName ) ) )
            {
            // InternalAlpha.g:4159:2: ( (this_OP_MINUS_0= RULE_OP_MINUS )? (this_INT_1= RULE_INT | ( (this_INT_2= RULE_INT )? this_IndexName_3= ruleIndexName ) ) )
            // InternalAlpha.g:4160:3: (this_OP_MINUS_0= RULE_OP_MINUS )? (this_INT_1= RULE_INT | ( (this_INT_2= RULE_INT )? this_IndexName_3= ruleIndexName ) )
            {
            // InternalAlpha.g:4160:3: (this_OP_MINUS_0= RULE_OP_MINUS )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_OP_MINUS) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalAlpha.g:4161:4: this_OP_MINUS_0= RULE_OP_MINUS
                    {
                    this_OP_MINUS_0=(Token)match(input,RULE_OP_MINUS,FOLLOW_56); 

                    				current.merge(this_OP_MINUS_0);
                    			

                    				newLeafNode(this_OP_MINUS_0, grammarAccess.getIndexAffineExpressionTerminalAccess().getOP_MINUSTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            // InternalAlpha.g:4169:3: (this_INT_1= RULE_INT | ( (this_INT_2= RULE_INT )? this_IndexName_3= ruleIndexName ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_INT) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==EOF||(LA63_1>=RULE_OP_PLUS && LA63_1<=RULE_OP_MINUS)||LA63_1==39||LA63_1==47||LA63_1==51) ) {
                    alt63=1;
                }
                else if ( (LA63_1==RULE_ID) ) {
                    alt63=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA63_0==RULE_ID) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalAlpha.g:4170:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getIndexAffineExpressionTerminalAccess().getINTTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4178:4: ( (this_INT_2= RULE_INT )? this_IndexName_3= ruleIndexName )
                    {
                    // InternalAlpha.g:4178:4: ( (this_INT_2= RULE_INT )? this_IndexName_3= ruleIndexName )
                    // InternalAlpha.g:4179:5: (this_INT_2= RULE_INT )? this_IndexName_3= ruleIndexName
                    {
                    // InternalAlpha.g:4179:5: (this_INT_2= RULE_INT )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_INT) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalAlpha.g:4180:6: this_INT_2= RULE_INT
                            {
                            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_4); 

                            						current.merge(this_INT_2);
                            					

                            						newLeafNode(this_INT_2, grammarAccess.getIndexAffineExpressionTerminalAccess().getINTTerminalRuleCall_1_1_0());
                            					

                            }
                            break;

                    }


                    					newCompositeNode(grammarAccess.getIndexAffineExpressionTerminalAccess().getIndexNameParserRuleCall_1_1_1());
                    				
                    pushFollow(FOLLOW_2);
                    this_IndexName_3=ruleIndexName();

                    state._fsp--;


                    					current.merge(this_IndexName_3);
                    				

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
    // $ANTLR end "ruleIndexAffineExpressionTerminal"


    // $ANTLR start "entryRuleAIndexAffineExpressionList"
    // InternalAlpha.g:4204:1: entryRuleAIndexAffineExpressionList returns [EObject current=null] : iv_ruleAIndexAffineExpressionList= ruleAIndexAffineExpressionList EOF ;
    public final EObject entryRuleAIndexAffineExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAIndexAffineExpressionList = null;


        try {
            // InternalAlpha.g:4204:67: (iv_ruleAIndexAffineExpressionList= ruleAIndexAffineExpressionList EOF )
            // InternalAlpha.g:4205:2: iv_ruleAIndexAffineExpressionList= ruleAIndexAffineExpressionList EOF
            {
             newCompositeNode(grammarAccess.getAIndexAffineExpressionListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAIndexAffineExpressionList=ruleAIndexAffineExpressionList();

            state._fsp--;

             current =iv_ruleAIndexAffineExpressionList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAIndexAffineExpressionList"


    // $ANTLR start "ruleAIndexAffineExpressionList"
    // InternalAlpha.g:4211:1: ruleAIndexAffineExpressionList returns [EObject current=null] : ( () ( ( (lv_exprs_1_0= ruleIndexAffineExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleIndexAffineExpression ) ) )* )? ) ;
    public final EObject ruleAIndexAffineExpressionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_exprs_1_0 = null;

        AntlrDatatypeRuleToken lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4217:2: ( ( () ( ( (lv_exprs_1_0= ruleIndexAffineExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleIndexAffineExpression ) ) )* )? ) )
            // InternalAlpha.g:4218:2: ( () ( ( (lv_exprs_1_0= ruleIndexAffineExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleIndexAffineExpression ) ) )* )? )
            {
            // InternalAlpha.g:4218:2: ( () ( ( (lv_exprs_1_0= ruleIndexAffineExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleIndexAffineExpression ) ) )* )? )
            // InternalAlpha.g:4219:3: () ( ( (lv_exprs_1_0= ruleIndexAffineExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleIndexAffineExpression ) ) )* )?
            {
            // InternalAlpha.g:4219:3: ()
            // InternalAlpha.g:4220:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAIndexAffineExpressionListAccess().getAIndexAffineExpressionListAction_0(),
            					current);
            			

            }

            // InternalAlpha.g:4226:3: ( ( (lv_exprs_1_0= ruleIndexAffineExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleIndexAffineExpression ) ) )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_ID && LA65_0<=RULE_INT)||LA65_0==RULE_OP_MINUS) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalAlpha.g:4227:4: ( (lv_exprs_1_0= ruleIndexAffineExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleIndexAffineExpression ) ) )*
                    {
                    // InternalAlpha.g:4227:4: ( (lv_exprs_1_0= ruleIndexAffineExpression ) )
                    // InternalAlpha.g:4228:5: (lv_exprs_1_0= ruleIndexAffineExpression )
                    {
                    // InternalAlpha.g:4228:5: (lv_exprs_1_0= ruleIndexAffineExpression )
                    // InternalAlpha.g:4229:6: lv_exprs_1_0= ruleIndexAffineExpression
                    {

                    						newCompositeNode(grammarAccess.getAIndexAffineExpressionListAccess().getExprsIndexAffineExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_exprs_1_0=ruleIndexAffineExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAIndexAffineExpressionListRule());
                    						}
                    						add(
                    							current,
                    							"exprs",
                    							lv_exprs_1_0,
                    							"alpha.Alpha.IndexAffineExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlpha.g:4246:4: (otherlv_2= ',' ( (lv_exprs_3_0= ruleIndexAffineExpression ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==47) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalAlpha.g:4247:5: otherlv_2= ',' ( (lv_exprs_3_0= ruleIndexAffineExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,47,FOLLOW_51); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getAIndexAffineExpressionListAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalAlpha.g:4251:5: ( (lv_exprs_3_0= ruleIndexAffineExpression ) )
                    	    // InternalAlpha.g:4252:6: (lv_exprs_3_0= ruleIndexAffineExpression )
                    	    {
                    	    // InternalAlpha.g:4252:6: (lv_exprs_3_0= ruleIndexAffineExpression )
                    	    // InternalAlpha.g:4253:7: lv_exprs_3_0= ruleIndexAffineExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getAIndexAffineExpressionListAccess().getExprsIndexAffineExpressionParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_exprs_3_0=ruleIndexAffineExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAIndexAffineExpressionListRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"exprs",
                    	    								lv_exprs_3_0,
                    	    								"alpha.Alpha.IndexAffineExpression");
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


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAIndexAffineExpressionList"


    // $ANTLR start "entryRuleAFunction"
    // InternalAlpha.g:4276:1: entryRuleAFunction returns [EObject current=null] : iv_ruleAFunction= ruleAFunction EOF ;
    public final EObject entryRuleAFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAFunction = null;


        try {
            // InternalAlpha.g:4276:50: (iv_ruleAFunction= ruleAFunction EOF )
            // InternalAlpha.g:4277:2: iv_ruleAFunction= ruleAFunction EOF
            {
             newCompositeNode(grammarAccess.getAFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAFunction=ruleAFunction();

            state._fsp--;

             current =iv_ruleAFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAFunction"


    // $ANTLR start "ruleAFunction"
    // InternalAlpha.g:4283:1: ruleAFunction returns [EObject current=null] : (otherlv_0= '(' ( (lv_indexes_1_0= ruleAIndexList ) ) otherlv_2= '->' ( (lv_func_3_0= ruleAIndexAffineExpressionList ) ) otherlv_4= ')' ) ;
    public final EObject ruleAFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_indexes_1_0 = null;

        EObject lv_func_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4289:2: ( (otherlv_0= '(' ( (lv_indexes_1_0= ruleAIndexList ) ) otherlv_2= '->' ( (lv_func_3_0= ruleAIndexAffineExpressionList ) ) otherlv_4= ')' ) )
            // InternalAlpha.g:4290:2: (otherlv_0= '(' ( (lv_indexes_1_0= ruleAIndexList ) ) otherlv_2= '->' ( (lv_func_3_0= ruleAIndexAffineExpressionList ) ) otherlv_4= ')' )
            {
            // InternalAlpha.g:4290:2: (otherlv_0= '(' ( (lv_indexes_1_0= ruleAIndexList ) ) otherlv_2= '->' ( (lv_func_3_0= ruleAIndexAffineExpressionList ) ) otherlv_4= ')' )
            // InternalAlpha.g:4291:3: otherlv_0= '(' ( (lv_indexes_1_0= ruleAIndexList ) ) otherlv_2= '->' ( (lv_func_3_0= ruleAIndexAffineExpressionList ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getAFunctionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalAlpha.g:4295:3: ( (lv_indexes_1_0= ruleAIndexList ) )
            // InternalAlpha.g:4296:4: (lv_indexes_1_0= ruleAIndexList )
            {
            // InternalAlpha.g:4296:4: (lv_indexes_1_0= ruleAIndexList )
            // InternalAlpha.g:4297:5: lv_indexes_1_0= ruleAIndexList
            {

            					newCompositeNode(grammarAccess.getAFunctionAccess().getIndexesAIndexListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
            lv_indexes_1_0=ruleAIndexList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAFunctionRule());
            					}
            					set(
            						current,
            						"indexes",
            						lv_indexes_1_0,
            						"alpha.Alpha.AIndexList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,55,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getAFunctionAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalAlpha.g:4318:3: ( (lv_func_3_0= ruleAIndexAffineExpressionList ) )
            // InternalAlpha.g:4319:4: (lv_func_3_0= ruleAIndexAffineExpressionList )
            {
            // InternalAlpha.g:4319:4: (lv_func_3_0= ruleAIndexAffineExpressionList )
            // InternalAlpha.g:4320:5: lv_func_3_0= ruleAIndexAffineExpressionList
            {

            					newCompositeNode(grammarAccess.getAFunctionAccess().getFuncAIndexAffineExpressionListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_func_3_0=ruleAIndexAffineExpressionList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAFunctionRule());
            					}
            					set(
            						current,
            						"func",
            						lv_func_3_0,
            						"alpha.Alpha.AIndexAffineExpressionList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAFunctionAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAFunction"


    // $ANTLR start "entryRuleAFunctionInArrayNotation"
    // InternalAlpha.g:4345:1: entryRuleAFunctionInArrayNotation returns [EObject current=null] : iv_ruleAFunctionInArrayNotation= ruleAFunctionInArrayNotation EOF ;
    public final EObject entryRuleAFunctionInArrayNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAFunctionInArrayNotation = null;


        try {
            // InternalAlpha.g:4345:65: (iv_ruleAFunctionInArrayNotation= ruleAFunctionInArrayNotation EOF )
            // InternalAlpha.g:4346:2: iv_ruleAFunctionInArrayNotation= ruleAFunctionInArrayNotation EOF
            {
             newCompositeNode(grammarAccess.getAFunctionInArrayNotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAFunctionInArrayNotation=ruleAFunctionInArrayNotation();

            state._fsp--;

             current =iv_ruleAFunctionInArrayNotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAFunctionInArrayNotation"


    // $ANTLR start "ruleAFunctionInArrayNotation"
    // InternalAlpha.g:4352:1: ruleAFunctionInArrayNotation returns [EObject current=null] : (otherlv_0= '[' ( (lv_newIds_1_0= ruleAIndexAffineExpressionList ) ) otherlv_2= ']' ) ;
    public final EObject ruleAFunctionInArrayNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_newIds_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4358:2: ( (otherlv_0= '[' ( (lv_newIds_1_0= ruleAIndexAffineExpressionList ) ) otherlv_2= ']' ) )
            // InternalAlpha.g:4359:2: (otherlv_0= '[' ( (lv_newIds_1_0= ruleAIndexAffineExpressionList ) ) otherlv_2= ']' )
            {
            // InternalAlpha.g:4359:2: (otherlv_0= '[' ( (lv_newIds_1_0= ruleAIndexAffineExpressionList ) ) otherlv_2= ']' )
            // InternalAlpha.g:4360:3: otherlv_0= '[' ( (lv_newIds_1_0= ruleAIndexAffineExpressionList ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getAFunctionInArrayNotationAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAlpha.g:4364:3: ( (lv_newIds_1_0= ruleAIndexAffineExpressionList ) )
            // InternalAlpha.g:4365:4: (lv_newIds_1_0= ruleAIndexAffineExpressionList )
            {
            // InternalAlpha.g:4365:4: (lv_newIds_1_0= ruleAIndexAffineExpressionList )
            // InternalAlpha.g:4366:5: lv_newIds_1_0= ruleAIndexAffineExpressionList
            {

            					newCompositeNode(grammarAccess.getAFunctionInArrayNotationAccess().getNewIdsAIndexAffineExpressionListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_newIds_1_0=ruleAIndexAffineExpressionList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAFunctionInArrayNotationRule());
            					}
            					set(
            						current,
            						"newIds",
            						lv_newIds_1_0,
            						"alpha.Alpha.AIndexAffineExpressionList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,51,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAFunctionInArrayNotationAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAFunctionInArrayNotation"


    // $ANTLR start "entryRuleAReductionOperator"
    // InternalAlpha.g:4391:1: entryRuleAReductionOperator returns [EObject current=null] : iv_ruleAReductionOperator= ruleAReductionOperator EOF ;
    public final EObject entryRuleAReductionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAReductionOperator = null;


        try {
            // InternalAlpha.g:4391:59: (iv_ruleAReductionOperator= ruleAReductionOperator EOF )
            // InternalAlpha.g:4392:2: iv_ruleAReductionOperator= ruleAReductionOperator EOF
            {
             newCompositeNode(grammarAccess.getAReductionOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAReductionOperator=ruleAReductionOperator();

            state._fsp--;

             current =iv_ruleAReductionOperator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAReductionOperator"


    // $ANTLR start "ruleAReductionOperator"
    // InternalAlpha.g:4398:1: ruleAReductionOperator returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_builtin_1_0= ruleREDUCTION_OP ) ) ) ;
    public final EObject ruleAReductionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_builtin_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4404:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_builtin_1_0= ruleREDUCTION_OP ) ) ) )
            // InternalAlpha.g:4405:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_builtin_1_0= ruleREDUCTION_OP ) ) )
            {
            // InternalAlpha.g:4405:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_builtin_1_0= ruleREDUCTION_OP ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                alt66=1;
            }
            else if ( (LA66_0==RULE_OP_PLUS||LA66_0==RULE_OP_MUL||(LA66_0>=RULE_OP_AND && LA66_0<=RULE_OP_OR)||LA66_0==RULE_OP_XOR||(LA66_0>=RULE_OP_MIN && LA66_0<=RULE_OP_MAX)) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalAlpha.g:4406:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalAlpha.g:4406:3: ( (otherlv_0= RULE_ID ) )
                    // InternalAlpha.g:4407:4: (otherlv_0= RULE_ID )
                    {
                    // InternalAlpha.g:4407:4: (otherlv_0= RULE_ID )
                    // InternalAlpha.g:4408:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAReductionOperatorRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getAReductionOperatorAccess().getOpAExternalFunctionCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4420:3: ( (lv_builtin_1_0= ruleREDUCTION_OP ) )
                    {
                    // InternalAlpha.g:4420:3: ( (lv_builtin_1_0= ruleREDUCTION_OP ) )
                    // InternalAlpha.g:4421:4: (lv_builtin_1_0= ruleREDUCTION_OP )
                    {
                    // InternalAlpha.g:4421:4: (lv_builtin_1_0= ruleREDUCTION_OP )
                    // InternalAlpha.g:4422:5: lv_builtin_1_0= ruleREDUCTION_OP
                    {

                    					newCompositeNode(grammarAccess.getAReductionOperatorAccess().getBuiltinREDUCTION_OPParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_builtin_1_0=ruleREDUCTION_OP();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAReductionOperatorRule());
                    					}
                    					set(
                    						current,
                    						"builtin",
                    						lv_builtin_1_0,
                    						"alpha.Alpha.REDUCTION_OP");
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
    // $ANTLR end "ruleAReductionOperator"


    // $ANTLR start "entryRuleREDUCTION_OP"
    // InternalAlpha.g:4443:1: entryRuleREDUCTION_OP returns [String current=null] : iv_ruleREDUCTION_OP= ruleREDUCTION_OP EOF ;
    public final String entryRuleREDUCTION_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREDUCTION_OP = null;


        try {
            // InternalAlpha.g:4443:52: (iv_ruleREDUCTION_OP= ruleREDUCTION_OP EOF )
            // InternalAlpha.g:4444:2: iv_ruleREDUCTION_OP= ruleREDUCTION_OP EOF
            {
             newCompositeNode(grammarAccess.getREDUCTION_OPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREDUCTION_OP=ruleREDUCTION_OP();

            state._fsp--;

             current =iv_ruleREDUCTION_OP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleREDUCTION_OP"


    // $ANTLR start "ruleREDUCTION_OP"
    // InternalAlpha.g:4450:1: ruleREDUCTION_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ARITHMETIC_REDUCTION_OP_0= ruleARITHMETIC_REDUCTION_OP | this_LOGICAL_REDUCTION_OP_1= ruleLOGICAL_REDUCTION_OP ) ;
    public final AntlrDatatypeRuleToken ruleREDUCTION_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ARITHMETIC_REDUCTION_OP_0 = null;

        AntlrDatatypeRuleToken this_LOGICAL_REDUCTION_OP_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4456:2: ( (this_ARITHMETIC_REDUCTION_OP_0= ruleARITHMETIC_REDUCTION_OP | this_LOGICAL_REDUCTION_OP_1= ruleLOGICAL_REDUCTION_OP ) )
            // InternalAlpha.g:4457:2: (this_ARITHMETIC_REDUCTION_OP_0= ruleARITHMETIC_REDUCTION_OP | this_LOGICAL_REDUCTION_OP_1= ruleLOGICAL_REDUCTION_OP )
            {
            // InternalAlpha.g:4457:2: (this_ARITHMETIC_REDUCTION_OP_0= ruleARITHMETIC_REDUCTION_OP | this_LOGICAL_REDUCTION_OP_1= ruleLOGICAL_REDUCTION_OP )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_OP_PLUS||LA67_0==RULE_OP_MUL||(LA67_0>=RULE_OP_MIN && LA67_0<=RULE_OP_MAX)) ) {
                alt67=1;
            }
            else if ( ((LA67_0>=RULE_OP_AND && LA67_0<=RULE_OP_OR)||LA67_0==RULE_OP_XOR) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalAlpha.g:4458:3: this_ARITHMETIC_REDUCTION_OP_0= ruleARITHMETIC_REDUCTION_OP
                    {

                    			newCompositeNode(grammarAccess.getREDUCTION_OPAccess().getARITHMETIC_REDUCTION_OPParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ARITHMETIC_REDUCTION_OP_0=ruleARITHMETIC_REDUCTION_OP();

                    state._fsp--;


                    			current.merge(this_ARITHMETIC_REDUCTION_OP_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4469:3: this_LOGICAL_REDUCTION_OP_1= ruleLOGICAL_REDUCTION_OP
                    {

                    			newCompositeNode(grammarAccess.getREDUCTION_OPAccess().getLOGICAL_REDUCTION_OPParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LOGICAL_REDUCTION_OP_1=ruleLOGICAL_REDUCTION_OP();

                    state._fsp--;


                    			current.merge(this_LOGICAL_REDUCTION_OP_1);
                    		

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
    // $ANTLR end "ruleREDUCTION_OP"


    // $ANTLR start "entryRuleARITHMETIC_REDUCTION_OP"
    // InternalAlpha.g:4483:1: entryRuleARITHMETIC_REDUCTION_OP returns [String current=null] : iv_ruleARITHMETIC_REDUCTION_OP= ruleARITHMETIC_REDUCTION_OP EOF ;
    public final String entryRuleARITHMETIC_REDUCTION_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleARITHMETIC_REDUCTION_OP = null;


        try {
            // InternalAlpha.g:4483:63: (iv_ruleARITHMETIC_REDUCTION_OP= ruleARITHMETIC_REDUCTION_OP EOF )
            // InternalAlpha.g:4484:2: iv_ruleARITHMETIC_REDUCTION_OP= ruleARITHMETIC_REDUCTION_OP EOF
            {
             newCompositeNode(grammarAccess.getARITHMETIC_REDUCTION_OPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleARITHMETIC_REDUCTION_OP=ruleARITHMETIC_REDUCTION_OP();

            state._fsp--;

             current =iv_ruleARITHMETIC_REDUCTION_OP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleARITHMETIC_REDUCTION_OP"


    // $ANTLR start "ruleARITHMETIC_REDUCTION_OP"
    // InternalAlpha.g:4490:1: ruleARITHMETIC_REDUCTION_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OP_MAX_0= RULE_OP_MAX | this_OP_MIN_1= RULE_OP_MIN | this_OP_MUL_2= RULE_OP_MUL | this_OP_PLUS_3= RULE_OP_PLUS ) ;
    public final AntlrDatatypeRuleToken ruleARITHMETIC_REDUCTION_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_MAX_0=null;
        Token this_OP_MIN_1=null;
        Token this_OP_MUL_2=null;
        Token this_OP_PLUS_3=null;


        	enterRule();

        try {
            // InternalAlpha.g:4496:2: ( (this_OP_MAX_0= RULE_OP_MAX | this_OP_MIN_1= RULE_OP_MIN | this_OP_MUL_2= RULE_OP_MUL | this_OP_PLUS_3= RULE_OP_PLUS ) )
            // InternalAlpha.g:4497:2: (this_OP_MAX_0= RULE_OP_MAX | this_OP_MIN_1= RULE_OP_MIN | this_OP_MUL_2= RULE_OP_MUL | this_OP_PLUS_3= RULE_OP_PLUS )
            {
            // InternalAlpha.g:4497:2: (this_OP_MAX_0= RULE_OP_MAX | this_OP_MIN_1= RULE_OP_MIN | this_OP_MUL_2= RULE_OP_MUL | this_OP_PLUS_3= RULE_OP_PLUS )
            int alt68=4;
            switch ( input.LA(1) ) {
            case RULE_OP_MAX:
                {
                alt68=1;
                }
                break;
            case RULE_OP_MIN:
                {
                alt68=2;
                }
                break;
            case RULE_OP_MUL:
                {
                alt68=3;
                }
                break;
            case RULE_OP_PLUS:
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
                    // InternalAlpha.g:4498:3: this_OP_MAX_0= RULE_OP_MAX
                    {
                    this_OP_MAX_0=(Token)match(input,RULE_OP_MAX,FOLLOW_2); 

                    			current.merge(this_OP_MAX_0);
                    		

                    			newLeafNode(this_OP_MAX_0, grammarAccess.getARITHMETIC_REDUCTION_OPAccess().getOP_MAXTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4506:3: this_OP_MIN_1= RULE_OP_MIN
                    {
                    this_OP_MIN_1=(Token)match(input,RULE_OP_MIN,FOLLOW_2); 

                    			current.merge(this_OP_MIN_1);
                    		

                    			newLeafNode(this_OP_MIN_1, grammarAccess.getARITHMETIC_REDUCTION_OPAccess().getOP_MINTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:4514:3: this_OP_MUL_2= RULE_OP_MUL
                    {
                    this_OP_MUL_2=(Token)match(input,RULE_OP_MUL,FOLLOW_2); 

                    			current.merge(this_OP_MUL_2);
                    		

                    			newLeafNode(this_OP_MUL_2, grammarAccess.getARITHMETIC_REDUCTION_OPAccess().getOP_MULTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:4522:3: this_OP_PLUS_3= RULE_OP_PLUS
                    {
                    this_OP_PLUS_3=(Token)match(input,RULE_OP_PLUS,FOLLOW_2); 

                    			current.merge(this_OP_PLUS_3);
                    		

                    			newLeafNode(this_OP_PLUS_3, grammarAccess.getARITHMETIC_REDUCTION_OPAccess().getOP_PLUSTerminalRuleCall_3());
                    		

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
    // $ANTLR end "ruleARITHMETIC_REDUCTION_OP"


    // $ANTLR start "entryRuleLOGICAL_REDUCTION_OP"
    // InternalAlpha.g:4533:1: entryRuleLOGICAL_REDUCTION_OP returns [String current=null] : iv_ruleLOGICAL_REDUCTION_OP= ruleLOGICAL_REDUCTION_OP EOF ;
    public final String entryRuleLOGICAL_REDUCTION_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOGICAL_REDUCTION_OP = null;


        try {
            // InternalAlpha.g:4533:60: (iv_ruleLOGICAL_REDUCTION_OP= ruleLOGICAL_REDUCTION_OP EOF )
            // InternalAlpha.g:4534:2: iv_ruleLOGICAL_REDUCTION_OP= ruleLOGICAL_REDUCTION_OP EOF
            {
             newCompositeNode(grammarAccess.getLOGICAL_REDUCTION_OPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLOGICAL_REDUCTION_OP=ruleLOGICAL_REDUCTION_OP();

            state._fsp--;

             current =iv_ruleLOGICAL_REDUCTION_OP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLOGICAL_REDUCTION_OP"


    // $ANTLR start "ruleLOGICAL_REDUCTION_OP"
    // InternalAlpha.g:4540:1: ruleLOGICAL_REDUCTION_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OP_AND_0= RULE_OP_AND | this_OP_OR_1= RULE_OP_OR | this_OP_XOR_2= RULE_OP_XOR ) ;
    public final AntlrDatatypeRuleToken ruleLOGICAL_REDUCTION_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_AND_0=null;
        Token this_OP_OR_1=null;
        Token this_OP_XOR_2=null;


        	enterRule();

        try {
            // InternalAlpha.g:4546:2: ( (this_OP_AND_0= RULE_OP_AND | this_OP_OR_1= RULE_OP_OR | this_OP_XOR_2= RULE_OP_XOR ) )
            // InternalAlpha.g:4547:2: (this_OP_AND_0= RULE_OP_AND | this_OP_OR_1= RULE_OP_OR | this_OP_XOR_2= RULE_OP_XOR )
            {
            // InternalAlpha.g:4547:2: (this_OP_AND_0= RULE_OP_AND | this_OP_OR_1= RULE_OP_OR | this_OP_XOR_2= RULE_OP_XOR )
            int alt69=3;
            switch ( input.LA(1) ) {
            case RULE_OP_AND:
                {
                alt69=1;
                }
                break;
            case RULE_OP_OR:
                {
                alt69=2;
                }
                break;
            case RULE_OP_XOR:
                {
                alt69=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalAlpha.g:4548:3: this_OP_AND_0= RULE_OP_AND
                    {
                    this_OP_AND_0=(Token)match(input,RULE_OP_AND,FOLLOW_2); 

                    			current.merge(this_OP_AND_0);
                    		

                    			newLeafNode(this_OP_AND_0, grammarAccess.getLOGICAL_REDUCTION_OPAccess().getOP_ANDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4556:3: this_OP_OR_1= RULE_OP_OR
                    {
                    this_OP_OR_1=(Token)match(input,RULE_OP_OR,FOLLOW_2); 

                    			current.merge(this_OP_OR_1);
                    		

                    			newLeafNode(this_OP_OR_1, grammarAccess.getLOGICAL_REDUCTION_OPAccess().getOP_ORTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:4564:3: this_OP_XOR_2= RULE_OP_XOR
                    {
                    this_OP_XOR_2=(Token)match(input,RULE_OP_XOR,FOLLOW_2); 

                    			current.merge(this_OP_XOR_2);
                    		

                    			newLeafNode(this_OP_XOR_2, grammarAccess.getLOGICAL_REDUCTION_OPAccess().getOP_XORTerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleLOGICAL_REDUCTION_OP"


    // $ANTLR start "entryRuleARITHMETIC_NONREDUCTION_OP"
    // InternalAlpha.g:4575:1: entryRuleARITHMETIC_NONREDUCTION_OP returns [String current=null] : iv_ruleARITHMETIC_NONREDUCTION_OP= ruleARITHMETIC_NONREDUCTION_OP EOF ;
    public final String entryRuleARITHMETIC_NONREDUCTION_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleARITHMETIC_NONREDUCTION_OP = null;


        try {
            // InternalAlpha.g:4575:66: (iv_ruleARITHMETIC_NONREDUCTION_OP= ruleARITHMETIC_NONREDUCTION_OP EOF )
            // InternalAlpha.g:4576:2: iv_ruleARITHMETIC_NONREDUCTION_OP= ruleARITHMETIC_NONREDUCTION_OP EOF
            {
             newCompositeNode(grammarAccess.getARITHMETIC_NONREDUCTION_OPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleARITHMETIC_NONREDUCTION_OP=ruleARITHMETIC_NONREDUCTION_OP();

            state._fsp--;

             current =iv_ruleARITHMETIC_NONREDUCTION_OP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleARITHMETIC_NONREDUCTION_OP"


    // $ANTLR start "ruleARITHMETIC_NONREDUCTION_OP"
    // InternalAlpha.g:4582:1: ruleARITHMETIC_NONREDUCTION_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OP_MINUS_0= RULE_OP_MINUS | this_OP_DIV_1= RULE_OP_DIV | this_OP_MOD_2= RULE_OP_MOD ) ;
    public final AntlrDatatypeRuleToken ruleARITHMETIC_NONREDUCTION_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_MINUS_0=null;
        Token this_OP_DIV_1=null;
        Token this_OP_MOD_2=null;


        	enterRule();

        try {
            // InternalAlpha.g:4588:2: ( (this_OP_MINUS_0= RULE_OP_MINUS | this_OP_DIV_1= RULE_OP_DIV | this_OP_MOD_2= RULE_OP_MOD ) )
            // InternalAlpha.g:4589:2: (this_OP_MINUS_0= RULE_OP_MINUS | this_OP_DIV_1= RULE_OP_DIV | this_OP_MOD_2= RULE_OP_MOD )
            {
            // InternalAlpha.g:4589:2: (this_OP_MINUS_0= RULE_OP_MINUS | this_OP_DIV_1= RULE_OP_DIV | this_OP_MOD_2= RULE_OP_MOD )
            int alt70=3;
            switch ( input.LA(1) ) {
            case RULE_OP_MINUS:
                {
                alt70=1;
                }
                break;
            case RULE_OP_DIV:
                {
                alt70=2;
                }
                break;
            case RULE_OP_MOD:
                {
                alt70=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalAlpha.g:4590:3: this_OP_MINUS_0= RULE_OP_MINUS
                    {
                    this_OP_MINUS_0=(Token)match(input,RULE_OP_MINUS,FOLLOW_2); 

                    			current.merge(this_OP_MINUS_0);
                    		

                    			newLeafNode(this_OP_MINUS_0, grammarAccess.getARITHMETIC_NONREDUCTION_OPAccess().getOP_MINUSTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4598:3: this_OP_DIV_1= RULE_OP_DIV
                    {
                    this_OP_DIV_1=(Token)match(input,RULE_OP_DIV,FOLLOW_2); 

                    			current.merge(this_OP_DIV_1);
                    		

                    			newLeafNode(this_OP_DIV_1, grammarAccess.getARITHMETIC_NONREDUCTION_OPAccess().getOP_DIVTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:4606:3: this_OP_MOD_2= RULE_OP_MOD
                    {
                    this_OP_MOD_2=(Token)match(input,RULE_OP_MOD,FOLLOW_2); 

                    			current.merge(this_OP_MOD_2);
                    		

                    			newLeafNode(this_OP_MOD_2, grammarAccess.getARITHMETIC_NONREDUCTION_OPAccess().getOP_MODTerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleARITHMETIC_NONREDUCTION_OP"


    // $ANTLR start "entryRuleLOGICAL_NONREDUCTION_OP"
    // InternalAlpha.g:4617:1: entryRuleLOGICAL_NONREDUCTION_OP returns [String current=null] : iv_ruleLOGICAL_NONREDUCTION_OP= ruleLOGICAL_NONREDUCTION_OP EOF ;
    public final String entryRuleLOGICAL_NONREDUCTION_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOGICAL_NONREDUCTION_OP = null;


        try {
            // InternalAlpha.g:4617:63: (iv_ruleLOGICAL_NONREDUCTION_OP= ruleLOGICAL_NONREDUCTION_OP EOF )
            // InternalAlpha.g:4618:2: iv_ruleLOGICAL_NONREDUCTION_OP= ruleLOGICAL_NONREDUCTION_OP EOF
            {
             newCompositeNode(grammarAccess.getLOGICAL_NONREDUCTION_OPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLOGICAL_NONREDUCTION_OP=ruleLOGICAL_NONREDUCTION_OP();

            state._fsp--;

             current =iv_ruleLOGICAL_NONREDUCTION_OP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLOGICAL_NONREDUCTION_OP"


    // $ANTLR start "ruleLOGICAL_NONREDUCTION_OP"
    // InternalAlpha.g:4624:1: ruleLOGICAL_NONREDUCTION_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_OP_NAND_0= RULE_OP_NAND ;
    public final AntlrDatatypeRuleToken ruleLOGICAL_NONREDUCTION_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_NAND_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:4630:2: (this_OP_NAND_0= RULE_OP_NAND )
            // InternalAlpha.g:4631:2: this_OP_NAND_0= RULE_OP_NAND
            {
            this_OP_NAND_0=(Token)match(input,RULE_OP_NAND,FOLLOW_2); 

            		current.merge(this_OP_NAND_0);
            	

            		newLeafNode(this_OP_NAND_0, grammarAccess.getLOGICAL_NONREDUCTION_OPAccess().getOP_NANDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLOGICAL_NONREDUCTION_OP"


    // $ANTLR start "entryRuleRELATIONAL_OP"
    // InternalAlpha.g:4641:1: entryRuleRELATIONAL_OP returns [String current=null] : iv_ruleRELATIONAL_OP= ruleRELATIONAL_OP EOF ;
    public final String entryRuleRELATIONAL_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRELATIONAL_OP = null;


        try {
            // InternalAlpha.g:4641:53: (iv_ruleRELATIONAL_OP= ruleRELATIONAL_OP EOF )
            // InternalAlpha.g:4642:2: iv_ruleRELATIONAL_OP= ruleRELATIONAL_OP EOF
            {
             newCompositeNode(grammarAccess.getRELATIONAL_OPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRELATIONAL_OP=ruleRELATIONAL_OP();

            state._fsp--;

             current =iv_ruleRELATIONAL_OP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRELATIONAL_OP"


    // $ANTLR start "ruleRELATIONAL_OP"
    // InternalAlpha.g:4648:1: ruleRELATIONAL_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OP_EQ_0= RULE_OP_EQ | this_OP_GE_1= RULE_OP_GE | this_OP_GT_2= RULE_OP_GT | this_OP_LE_3= RULE_OP_LE | this_OP_LT_4= RULE_OP_LT | this_OP_NE_5= RULE_OP_NE ) ;
    public final AntlrDatatypeRuleToken ruleRELATIONAL_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_EQ_0=null;
        Token this_OP_GE_1=null;
        Token this_OP_GT_2=null;
        Token this_OP_LE_3=null;
        Token this_OP_LT_4=null;
        Token this_OP_NE_5=null;


        	enterRule();

        try {
            // InternalAlpha.g:4654:2: ( (this_OP_EQ_0= RULE_OP_EQ | this_OP_GE_1= RULE_OP_GE | this_OP_GT_2= RULE_OP_GT | this_OP_LE_3= RULE_OP_LE | this_OP_LT_4= RULE_OP_LT | this_OP_NE_5= RULE_OP_NE ) )
            // InternalAlpha.g:4655:2: (this_OP_EQ_0= RULE_OP_EQ | this_OP_GE_1= RULE_OP_GE | this_OP_GT_2= RULE_OP_GT | this_OP_LE_3= RULE_OP_LE | this_OP_LT_4= RULE_OP_LT | this_OP_NE_5= RULE_OP_NE )
            {
            // InternalAlpha.g:4655:2: (this_OP_EQ_0= RULE_OP_EQ | this_OP_GE_1= RULE_OP_GE | this_OP_GT_2= RULE_OP_GT | this_OP_LE_3= RULE_OP_LE | this_OP_LT_4= RULE_OP_LT | this_OP_NE_5= RULE_OP_NE )
            int alt71=6;
            switch ( input.LA(1) ) {
            case RULE_OP_EQ:
                {
                alt71=1;
                }
                break;
            case RULE_OP_GE:
                {
                alt71=2;
                }
                break;
            case RULE_OP_GT:
                {
                alt71=3;
                }
                break;
            case RULE_OP_LE:
                {
                alt71=4;
                }
                break;
            case RULE_OP_LT:
                {
                alt71=5;
                }
                break;
            case RULE_OP_NE:
                {
                alt71=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalAlpha.g:4656:3: this_OP_EQ_0= RULE_OP_EQ
                    {
                    this_OP_EQ_0=(Token)match(input,RULE_OP_EQ,FOLLOW_2); 

                    			current.merge(this_OP_EQ_0);
                    		

                    			newLeafNode(this_OP_EQ_0, grammarAccess.getRELATIONAL_OPAccess().getOP_EQTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4664:3: this_OP_GE_1= RULE_OP_GE
                    {
                    this_OP_GE_1=(Token)match(input,RULE_OP_GE,FOLLOW_2); 

                    			current.merge(this_OP_GE_1);
                    		

                    			newLeafNode(this_OP_GE_1, grammarAccess.getRELATIONAL_OPAccess().getOP_GETerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:4672:3: this_OP_GT_2= RULE_OP_GT
                    {
                    this_OP_GT_2=(Token)match(input,RULE_OP_GT,FOLLOW_2); 

                    			current.merge(this_OP_GT_2);
                    		

                    			newLeafNode(this_OP_GT_2, grammarAccess.getRELATIONAL_OPAccess().getOP_GTTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:4680:3: this_OP_LE_3= RULE_OP_LE
                    {
                    this_OP_LE_3=(Token)match(input,RULE_OP_LE,FOLLOW_2); 

                    			current.merge(this_OP_LE_3);
                    		

                    			newLeafNode(this_OP_LE_3, grammarAccess.getRELATIONAL_OPAccess().getOP_LETerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:4688:3: this_OP_LT_4= RULE_OP_LT
                    {
                    this_OP_LT_4=(Token)match(input,RULE_OP_LT,FOLLOW_2); 

                    			current.merge(this_OP_LT_4);
                    		

                    			newLeafNode(this_OP_LT_4, grammarAccess.getRELATIONAL_OPAccess().getOP_LTTerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:4696:3: this_OP_NE_5= RULE_OP_NE
                    {
                    this_OP_NE_5=(Token)match(input,RULE_OP_NE,FOLLOW_2); 

                    			current.merge(this_OP_NE_5);
                    		

                    			newLeafNode(this_OP_NE_5, grammarAccess.getRELATIONAL_OPAccess().getOP_NETerminalRuleCall_5());
                    		

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
    // $ANTLR end "ruleRELATIONAL_OP"

    // Delegated rules


    protected DFA22 dfa22 = new DFA22(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String dfa_1s = "\51\uffff";
    static final String dfa_2s = "\37\uffff\1\45\6\uffff\1\45\2\uffff";
    static final String dfa_3s = "\1\41\1\62\1\46\3\4\1\57\1\64\27\4\1\45\1\47\1\57\2\4\2\uffff\1\45\2\57";
    static final String dfa_4s = "\1\65\1\64\1\46\1\63\1\64\1\4\1\63\30\64\1\66\1\47\1\63\1\4\1\64\2\uffff\1\66\2\63";
    static final String dfa_5s = "\44\uffff\1\1\1\2\3\uffff";
    static final String dfa_6s = "\51\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\23\uffff\1\2",
            "\1\3\1\uffff\1\4",
            "\1\5",
            "\1\6\56\uffff\1\7",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\40",
            "\1\42\1\uffff\1\41\1\uffff\1\7",
            "\1\4",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\1\uffff\1\43\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\2\uffff\1\20\1\21\1\25",
            "\1\45\20\uffff\1\44",
            "\1\46",
            "\1\42\1\uffff\1\41\1\uffff\1\7",
            "\1\47",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\26\1\27\1\30\1\31\7\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\37\3\uffff\1\22\1\23\7\uffff\1\24\1\uffff\1\43\1\20\1\21\1\25",
            "",
            "",
            "\1\45\20\uffff\1\44",
            "\1\42\1\uffff\1\50\1\uffff\1\7",
            "\1\42\1\uffff\1\50\1\uffff\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1047:2: (this_ADomainProduct_0= ruleADomainProduct | this_ADomainTerminal_1= ruleADomainTerminal )";
        }
    }
    static final String dfa_8s = "\16\uffff";
    static final String dfa_9s = "\6\uffff\1\14\7\uffff";
    static final String dfa_10s = "\2\4\4\uffff\1\6\3\uffff\1\6\3\uffff";
    static final String dfa_11s = "\2\102\4\uffff\1\77\3\uffff\1\67\3\uffff";
    static final String dfa_12s = "\2\uffff\1\2\1\3\1\4\1\5\1\uffff\1\6\1\10\1\1\1\uffff\1\11\1\7\1\12";
    static final String dfa_13s = "\16\uffff}>";
    static final String[] dfa_14s = {
            "\1\6\1\7\1\5\1\uffff\1\5\1\uffff\2\5\4\uffff\1\5\1\uffff\2\5\2\7\20\uffff\1\1\13\uffff\1\10\10\uffff\1\2\4\uffff\1\10\1\3\1\4",
            "\1\12\4\11\1\uffff\2\11\4\uffff\1\11\1\uffff\4\11\13\uffff\1\11\4\uffff\1\11\13\uffff\1\11\4\uffff\1\13\2\uffff\2\11\1\uffff\1\11\2\uffff\3\11",
            "",
            "",
            "",
            "",
            "\6\14\3\uffff\5\14\3\uffff\5\14\11\uffff\1\14\1\5\1\14\7\uffff\1\14\2\uffff\1\15\13\uffff\2\14",
            "",
            "",
            "",
            "\6\11\3\uffff\5\11\3\uffff\5\11\12\uffff\2\11\7\uffff\1\13\1\uffff\1\13\1\11\4\uffff\1\13",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2091:2: (this_AParanthesizedAlphabetsExpression_0= ruleAParanthesizedAlphabetsExpression | this_ACaseExpression_1= ruleACaseExpression | this_AReduceExpression_2= ruleAReduceExpression | this_AArgReduceExpression_3= ruleAArgReduceExpression | this_AMultiArgExpression_4= ruleAMultiArgExpression | this_AConstantExpression_5= ruleAConstantExpression | this_AVariableExpression_6= ruleAVariableExpression | this_AIndexExpression_7= ruleAIndexExpression | this_ADependenceExpression_8= ruleADependenceExpression | this_ADependenceInArrayNotation_9= ruleADependenceInArrayNotation )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000011900000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000011D00000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00007E0000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00007C0000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000780000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000700000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000600000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0100400000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0020002200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x001C80C40F80FFF0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0020000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x001C80C00F80FFF2L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x2C040042003D0DF0L,0x0000000000000007L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x2C0400C2003D0DF0L,0x0000000000000007L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000808000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000010802L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000020402L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2C040046003D0DF0L,0x0000000000000007L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00080000000000B0L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00000000000D0D50L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0004004000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x00000080000000B0L});

}