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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAlphaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_OP_EQ", "RULE_OP_PLUS", "RULE_OP_MINUS", "RULE_OP_MUL", "RULE_OP_DIV", "RULE_OP_MOD", "RULE_OP_AND", "RULE_OP_OR", "RULE_INTERSECTION", "RULE_UNION", "RULE_WS", "RULE_OP_XOR", "RULE_OP_NAND", "RULE_OP_MIN", "RULE_OP_MAX", "RULE_BOOLEAN", "RULE_REAL", "RULE_OP_GE", "RULE_OP_GT", "RULE_OP_LE", "RULE_OP_LT", "RULE_OP_NE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'import'", "'constant'", "'external'", "'('", "')'", "'affine'", "'define'", "'inputs'", "'outputs'", "'locals'", "'fuzzy'", "'over'", "'while'", "'let'", "'.'", "':'", "','", "'.*'", "'\\''", "'cross'", "'@'", "'->-'", "'->*'", "'domain'", "'range'", "'complement'", "'poly-hull'", "'affine-hull'", "'reverse'", "'['", "']'", "'as'", "';'", "'->'", "'with'", "'not'", "'case'", "'select'", "'from'", "'if'", "'then'", "'else'", "'val('", "'reduce'", "'argreduce'", "'conv'", "'auto'"
    };
    public static final int T__50=50;
    public static final int RULE_OP_AND=12;
    public static final int RULE_OP_EQ=6;
    public static final int RULE_BOOLEAN=21;
    public static final int RULE_OP_MIN=19;
    public static final int RULE_OP_NAND=18;
    public static final int RULE_OP_MUL=9;
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
    public static final int RULE_OP_MINUS=8;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_REAL=22;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_OP_GE=23;
    public static final int RULE_ML_COMMENT=29;
    public static final int T__67=67;
    public static final int RULE_UNION=15;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_OP_OR=13;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_OP_GT=24;
    public static final int RULE_STRING=28;
    public static final int RULE_OP_DIV=10;
    public static final int RULE_SL_COMMENT=30;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_OP_LE=25;
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
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_OP_MOD=11;
    public static final int T__80=80;
    public static final int RULE_OP_PLUS=7;
    public static final int T__81=81;
    public static final int RULE_OP_LT=26;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=31;
    public static final int RULE_OP_MAX=20;
    public static final int RULE_INTERSECTION=14;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int RULE_OP_XOR=17;
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAStartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAStart=ruleAStart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAStart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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

                if ( (LA1_0==32||(LA1_0>=35 && LA1_0<=37)||LA1_0==40) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAlpha.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalAlpha.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalAlpha.g:80:4: lv_elements_0_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getAStartAccess().getElementsAbstractElementParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_APackageDeclaration_0= ruleAPackageDeclaration | this_AAffineSystem_1= ruleAAffineSystem | this_AImport_2= ruleAImport | this_AExternalFunctionDeclaration_3= ruleAExternalFunctionDeclaration | this_AConstantDeclaration_4= ruleAConstantDeclaration ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_APackageDeclaration_0 = null;

        EObject this_AAffineSystem_1 = null;

        EObject this_AImport_2 = null;

        EObject this_AExternalFunctionDeclaration_3 = null;

        EObject this_AConstantDeclaration_4 = null;



        	enterRule();

        try {
            // InternalAlpha.g:113:2: ( (this_APackageDeclaration_0= ruleAPackageDeclaration | this_AAffineSystem_1= ruleAAffineSystem | this_AImport_2= ruleAImport | this_AExternalFunctionDeclaration_3= ruleAExternalFunctionDeclaration | this_AConstantDeclaration_4= ruleAConstantDeclaration ) )
            // InternalAlpha.g:114:2: (this_APackageDeclaration_0= ruleAPackageDeclaration | this_AAffineSystem_1= ruleAAffineSystem | this_AImport_2= ruleAImport | this_AExternalFunctionDeclaration_3= ruleAExternalFunctionDeclaration | this_AConstantDeclaration_4= ruleAConstantDeclaration )
            {
            // InternalAlpha.g:114:2: (this_APackageDeclaration_0= ruleAPackageDeclaration | this_AAffineSystem_1= ruleAAffineSystem | this_AImport_2= ruleAImport | this_AExternalFunctionDeclaration_3= ruleAExternalFunctionDeclaration | this_AConstantDeclaration_4= ruleAConstantDeclaration )
            int alt2=5;
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
            case 37:
                {
                alt2=4;
                }
                break;
            case 36:
                {
                alt2=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAlpha.g:115:3: this_APackageDeclaration_0= ruleAPackageDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractElementAccess().getAPackageDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_APackageDeclaration_0=ruleAPackageDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_APackageDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:124:3: this_AAffineSystem_1= ruleAAffineSystem
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractElementAccess().getAAffineSystemParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AAffineSystem_1=ruleAAffineSystem();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AAffineSystem_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:133:3: this_AImport_2= ruleAImport
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractElementAccess().getAImportParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AImport_2=ruleAImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AImport_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:142:3: this_AExternalFunctionDeclaration_3= ruleAExternalFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractElementAccess().getAExternalFunctionDeclarationParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AExternalFunctionDeclaration_3=ruleAExternalFunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AExternalFunctionDeclaration_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:151:3: this_AConstantDeclaration_4= ruleAConstantDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractElementAccess().getAConstantDeclarationParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AConstantDeclaration_4=ruleAConstantDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AConstantDeclaration_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:163:1: entryRuleAPackageDeclaration returns [EObject current=null] : iv_ruleAPackageDeclaration= ruleAPackageDeclaration EOF ;
    public final EObject entryRuleAPackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAPackageDeclaration = null;


        try {
            // InternalAlpha.g:163:60: (iv_ruleAPackageDeclaration= ruleAPackageDeclaration EOF )
            // InternalAlpha.g:164:2: iv_ruleAPackageDeclaration= ruleAPackageDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAPackageDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAPackageDeclaration=ruleAPackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAPackageDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:170:1: ruleAPackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleAPackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:176:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // InternalAlpha.g:177:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // InternalAlpha.g:177:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // InternalAlpha.g:178:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAPackageDeclarationAccess().getPackageKeyword_0());
              		
            }
            // InternalAlpha.g:182:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAlpha.g:183:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAlpha.g:183:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAlpha.g:184:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalAlpha.g:205:3: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==32||(LA3_0>=35 && LA3_0<=37)||LA3_0==40) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAlpha.g:206:4: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // InternalAlpha.g:206:4: (lv_elements_3_0= ruleAbstractElement )
            	    // InternalAlpha.g:207:5: lv_elements_3_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAPackageDeclarationAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:232:1: entryRuleAImport returns [EObject current=null] : iv_ruleAImport= ruleAImport EOF ;
    public final EObject entryRuleAImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAImport = null;


        try {
            // InternalAlpha.g:232:48: (iv_ruleAImport= ruleAImport EOF )
            // InternalAlpha.g:233:2: iv_ruleAImport= ruleAImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAImport=ruleAImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:239:1: ruleAImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleAImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:245:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalAlpha.g:246:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalAlpha.g:246:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalAlpha.g:247:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAImportAccess().getImportKeyword_0());
              		
            }
            // InternalAlpha.g:251:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalAlpha.g:252:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalAlpha.g:252:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalAlpha.g:253:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleAConstantDeclaration"
    // InternalAlpha.g:274:1: entryRuleAConstantDeclaration returns [EObject current=null] : iv_ruleAConstantDeclaration= ruleAConstantDeclaration EOF ;
    public final EObject entryRuleAConstantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAConstantDeclaration = null;


        try {
            // InternalAlpha.g:274:61: (iv_ruleAConstantDeclaration= ruleAConstantDeclaration EOF )
            // InternalAlpha.g:275:2: iv_ruleAConstantDeclaration= ruleAConstantDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAConstantDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAConstantDeclaration=ruleAConstantDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAConstantDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAConstantDeclaration"


    // $ANTLR start "ruleAConstantDeclaration"
    // InternalAlpha.g:281:1: ruleAConstantDeclaration returns [EObject current=null] : (otherlv_0= 'constant' this_AConstant_1= ruleAConstant ) ;
    public final EObject ruleAConstantDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_AConstant_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:287:2: ( (otherlv_0= 'constant' this_AConstant_1= ruleAConstant ) )
            // InternalAlpha.g:288:2: (otherlv_0= 'constant' this_AConstant_1= ruleAConstant )
            {
            // InternalAlpha.g:288:2: (otherlv_0= 'constant' this_AConstant_1= ruleAConstant )
            // InternalAlpha.g:289:3: otherlv_0= 'constant' this_AConstant_1= ruleAConstant
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAConstantDeclarationAccess().getConstantKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAConstantDeclarationAccess().getAConstantParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_AConstant_1=ruleAConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AConstant_1;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAConstantDeclaration"


    // $ANTLR start "entryRuleAExternalFunctionDeclaration"
    // InternalAlpha.g:305:1: entryRuleAExternalFunctionDeclaration returns [EObject current=null] : iv_ruleAExternalFunctionDeclaration= ruleAExternalFunctionDeclaration EOF ;
    public final EObject entryRuleAExternalFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAExternalFunctionDeclaration = null;


        try {
            // InternalAlpha.g:305:69: (iv_ruleAExternalFunctionDeclaration= ruleAExternalFunctionDeclaration EOF )
            // InternalAlpha.g:306:2: iv_ruleAExternalFunctionDeclaration= ruleAExternalFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAExternalFunctionDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAExternalFunctionDeclaration=ruleAExternalFunctionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAExternalFunctionDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:312:1: ruleAExternalFunctionDeclaration returns [EObject current=null] : (otherlv_0= 'external' this_AExternalFunction_1= ruleAExternalFunction ) ;
    public final EObject ruleAExternalFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_AExternalFunction_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:318:2: ( (otherlv_0= 'external' this_AExternalFunction_1= ruleAExternalFunction ) )
            // InternalAlpha.g:319:2: (otherlv_0= 'external' this_AExternalFunction_1= ruleAExternalFunction )
            {
            // InternalAlpha.g:319:2: (otherlv_0= 'external' this_AExternalFunction_1= ruleAExternalFunction )
            // InternalAlpha.g:320:3: otherlv_0= 'external' this_AExternalFunction_1= ruleAExternalFunction
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAExternalFunctionDeclarationAccess().getExternalKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAExternalFunctionDeclarationAccess().getAExternalFunctionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_AExternalFunction_1=ruleAExternalFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AExternalFunction_1;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:336:1: entryRuleAExternalFunction returns [EObject current=null] : iv_ruleAExternalFunction= ruleAExternalFunction EOF ;
    public final EObject entryRuleAExternalFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAExternalFunction = null;


        try {
            // InternalAlpha.g:336:58: (iv_ruleAExternalFunction= ruleAExternalFunction EOF )
            // InternalAlpha.g:337:2: iv_ruleAExternalFunction= ruleAExternalFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAExternalFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAExternalFunction=ruleAExternalFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAExternalFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:343:1: ruleAExternalFunction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputCardinarity_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleAExternalFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_inputCardinarity_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAlpha.g:349:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputCardinarity_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalAlpha.g:350:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputCardinarity_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalAlpha.g:350:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputCardinarity_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalAlpha.g:351:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputCardinarity_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            // InternalAlpha.g:351:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:352:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:352:4: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:353:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getAExternalFunctionAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_1=(Token)match(input,38,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAExternalFunctionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAlpha.g:373:3: ( (lv_inputCardinarity_2_0= RULE_INT ) )
            // InternalAlpha.g:374:4: (lv_inputCardinarity_2_0= RULE_INT )
            {
            // InternalAlpha.g:374:4: (lv_inputCardinarity_2_0= RULE_INT )
            // InternalAlpha.g:375:5: lv_inputCardinarity_2_0= RULE_INT
            {
            lv_inputCardinarity_2_0=(Token)match(input,RULE_INT,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_inputCardinarity_2_0, grammarAccess.getAExternalFunctionAccess().getInputCardinarityINTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAExternalFunctionAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleAConstant"
    // InternalAlpha.g:399:1: entryRuleAConstant returns [EObject current=null] : iv_ruleAConstant= ruleAConstant EOF ;
    public final EObject entryRuleAConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAConstant = null;


        try {
            // InternalAlpha.g:399:50: (iv_ruleAConstant= ruleAConstant EOF )
            // InternalAlpha.g:400:2: iv_ruleAConstant= ruleAConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAConstant=ruleAConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAConstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAConstant"


    // $ANTLR start "ruleAConstant"
    // InternalAlpha.g:406:1: ruleAConstant returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_OP_EQ_1= RULE_OP_EQ ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleAConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_OP_EQ_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:412:2: ( ( ( (lv_name_0_0= RULE_ID ) ) this_OP_EQ_1= RULE_OP_EQ ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalAlpha.g:413:2: ( ( (lv_name_0_0= RULE_ID ) ) this_OP_EQ_1= RULE_OP_EQ ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalAlpha.g:413:2: ( ( (lv_name_0_0= RULE_ID ) ) this_OP_EQ_1= RULE_OP_EQ ( (lv_value_2_0= RULE_INT ) ) )
            // InternalAlpha.g:414:3: ( (lv_name_0_0= RULE_ID ) ) this_OP_EQ_1= RULE_OP_EQ ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalAlpha.g:414:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:415:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:415:4: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:416:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getAConstantAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAConstantRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            this_OP_EQ_1=(Token)match(input,RULE_OP_EQ,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OP_EQ_1, grammarAccess.getAConstantAccess().getOP_EQTerminalRuleCall_1());
              		
            }
            // InternalAlpha.g:436:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalAlpha.g:437:4: (lv_value_2_0= RULE_INT )
            {
            // InternalAlpha.g:437:4: (lv_value_2_0= RULE_INT )
            // InternalAlpha.g:438:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_2_0, grammarAccess.getAConstantAccess().getValueINTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAConstantRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_2_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAConstant"


    // $ANTLR start "entryRuleAAffineSystem"
    // InternalAlpha.g:458:1: entryRuleAAffineSystem returns [EObject current=null] : iv_ruleAAffineSystem= ruleAAffineSystem EOF ;
    public final EObject entryRuleAAffineSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAAffineSystem = null;


        try {
            // InternalAlpha.g:458:54: (iv_ruleAAffineSystem= ruleAAffineSystem EOF )
            // InternalAlpha.g:459:2: iv_ruleAAffineSystem= ruleAAffineSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAAffineSystemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAAffineSystem=ruleAAffineSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAAffineSystem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:465:1: ruleAAffineSystem returns [EObject current=null] : (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameters_2_0= ruleAParamDomain ) ) (otherlv_3= 'define' ( (lv_polyObjects_4_0= rulePolyhedralObject ) )* )? (otherlv_5= 'inputs' ( (lv_inputDeclarations_6_0= ruleAVariableDeclaration ) )* )? (otherlv_7= 'outputs' ( (lv_outputDeclarations_8_0= ruleAVariableDeclaration ) )* )? (otherlv_9= 'locals' ( (lv_localvarDeclarations_10_0= ruleAVariableDeclaration ) )* )? (otherlv_11= 'fuzzy' ( (lv_fuzzyVariables_12_0= ruleAFuzzyVariableDeclaration ) )* )? (otherlv_13= 'over' ( (lv_whileDomain_14_0= ruleAPolyhedralObjectExpression ) ) ( (lv_while_15_0= 'while' ) ) otherlv_16= '(' ( (lv_testExpression_17_0= ruleAAlphaExpression ) ) otherlv_18= ')' )? (otherlv_19= 'let' ( (lv_useEquations_20_0= ruleAUseEquation ) )* ( (lv_equations_21_0= ruleAEquation ) )* )? otherlv_22= '.' ) ;
    public final EObject ruleAAffineSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_while_15_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_parameters_2_0 = null;

        EObject lv_polyObjects_4_0 = null;

        EObject lv_inputDeclarations_6_0 = null;

        EObject lv_outputDeclarations_8_0 = null;

        EObject lv_localvarDeclarations_10_0 = null;

        EObject lv_fuzzyVariables_12_0 = null;

        EObject lv_whileDomain_14_0 = null;

        EObject lv_testExpression_17_0 = null;

        EObject lv_useEquations_20_0 = null;

        EObject lv_equations_21_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:471:2: ( (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameters_2_0= ruleAParamDomain ) ) (otherlv_3= 'define' ( (lv_polyObjects_4_0= rulePolyhedralObject ) )* )? (otherlv_5= 'inputs' ( (lv_inputDeclarations_6_0= ruleAVariableDeclaration ) )* )? (otherlv_7= 'outputs' ( (lv_outputDeclarations_8_0= ruleAVariableDeclaration ) )* )? (otherlv_9= 'locals' ( (lv_localvarDeclarations_10_0= ruleAVariableDeclaration ) )* )? (otherlv_11= 'fuzzy' ( (lv_fuzzyVariables_12_0= ruleAFuzzyVariableDeclaration ) )* )? (otherlv_13= 'over' ( (lv_whileDomain_14_0= ruleAPolyhedralObjectExpression ) ) ( (lv_while_15_0= 'while' ) ) otherlv_16= '(' ( (lv_testExpression_17_0= ruleAAlphaExpression ) ) otherlv_18= ')' )? (otherlv_19= 'let' ( (lv_useEquations_20_0= ruleAUseEquation ) )* ( (lv_equations_21_0= ruleAEquation ) )* )? otherlv_22= '.' ) )
            // InternalAlpha.g:472:2: (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameters_2_0= ruleAParamDomain ) ) (otherlv_3= 'define' ( (lv_polyObjects_4_0= rulePolyhedralObject ) )* )? (otherlv_5= 'inputs' ( (lv_inputDeclarations_6_0= ruleAVariableDeclaration ) )* )? (otherlv_7= 'outputs' ( (lv_outputDeclarations_8_0= ruleAVariableDeclaration ) )* )? (otherlv_9= 'locals' ( (lv_localvarDeclarations_10_0= ruleAVariableDeclaration ) )* )? (otherlv_11= 'fuzzy' ( (lv_fuzzyVariables_12_0= ruleAFuzzyVariableDeclaration ) )* )? (otherlv_13= 'over' ( (lv_whileDomain_14_0= ruleAPolyhedralObjectExpression ) ) ( (lv_while_15_0= 'while' ) ) otherlv_16= '(' ( (lv_testExpression_17_0= ruleAAlphaExpression ) ) otherlv_18= ')' )? (otherlv_19= 'let' ( (lv_useEquations_20_0= ruleAUseEquation ) )* ( (lv_equations_21_0= ruleAEquation ) )* )? otherlv_22= '.' )
            {
            // InternalAlpha.g:472:2: (otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameters_2_0= ruleAParamDomain ) ) (otherlv_3= 'define' ( (lv_polyObjects_4_0= rulePolyhedralObject ) )* )? (otherlv_5= 'inputs' ( (lv_inputDeclarations_6_0= ruleAVariableDeclaration ) )* )? (otherlv_7= 'outputs' ( (lv_outputDeclarations_8_0= ruleAVariableDeclaration ) )* )? (otherlv_9= 'locals' ( (lv_localvarDeclarations_10_0= ruleAVariableDeclaration ) )* )? (otherlv_11= 'fuzzy' ( (lv_fuzzyVariables_12_0= ruleAFuzzyVariableDeclaration ) )* )? (otherlv_13= 'over' ( (lv_whileDomain_14_0= ruleAPolyhedralObjectExpression ) ) ( (lv_while_15_0= 'while' ) ) otherlv_16= '(' ( (lv_testExpression_17_0= ruleAAlphaExpression ) ) otherlv_18= ')' )? (otherlv_19= 'let' ( (lv_useEquations_20_0= ruleAUseEquation ) )* ( (lv_equations_21_0= ruleAEquation ) )* )? otherlv_22= '.' )
            // InternalAlpha.g:473:3: otherlv_0= 'affine' ( (lv_name_1_0= ruleSystemName ) ) ( (lv_parameters_2_0= ruleAParamDomain ) ) (otherlv_3= 'define' ( (lv_polyObjects_4_0= rulePolyhedralObject ) )* )? (otherlv_5= 'inputs' ( (lv_inputDeclarations_6_0= ruleAVariableDeclaration ) )* )? (otherlv_7= 'outputs' ( (lv_outputDeclarations_8_0= ruleAVariableDeclaration ) )* )? (otherlv_9= 'locals' ( (lv_localvarDeclarations_10_0= ruleAVariableDeclaration ) )* )? (otherlv_11= 'fuzzy' ( (lv_fuzzyVariables_12_0= ruleAFuzzyVariableDeclaration ) )* )? (otherlv_13= 'over' ( (lv_whileDomain_14_0= ruleAPolyhedralObjectExpression ) ) ( (lv_while_15_0= 'while' ) ) otherlv_16= '(' ( (lv_testExpression_17_0= ruleAAlphaExpression ) ) otherlv_18= ')' )? (otherlv_19= 'let' ( (lv_useEquations_20_0= ruleAUseEquation ) )* ( (lv_equations_21_0= ruleAEquation ) )* )? otherlv_22= '.'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAAffineSystemAccess().getAffineKeyword_0());
              		
            }
            // InternalAlpha.g:477:3: ( (lv_name_1_0= ruleSystemName ) )
            // InternalAlpha.g:478:4: (lv_name_1_0= ruleSystemName )
            {
            // InternalAlpha.g:478:4: (lv_name_1_0= ruleSystemName )
            // InternalAlpha.g:479:5: lv_name_1_0= ruleSystemName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAAffineSystemAccess().getNameSystemNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleSystemName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalAlpha.g:496:3: ( (lv_parameters_2_0= ruleAParamDomain ) )
            // InternalAlpha.g:497:4: (lv_parameters_2_0= ruleAParamDomain )
            {
            // InternalAlpha.g:497:4: (lv_parameters_2_0= ruleAParamDomain )
            // InternalAlpha.g:498:5: lv_parameters_2_0= ruleAParamDomain
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAAffineSystemAccess().getParametersAParamDomainParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_parameters_2_0=ruleAParamDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalAlpha.g:515:3: (otherlv_3= 'define' ( (lv_polyObjects_4_0= rulePolyhedralObject ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==41) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAlpha.g:516:4: otherlv_3= 'define' ( (lv_polyObjects_4_0= rulePolyhedralObject ) )*
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAAffineSystemAccess().getDefineKeyword_3_0());
                      			
                    }
                    // InternalAlpha.g:520:4: ( (lv_polyObjects_4_0= rulePolyhedralObject ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalAlpha.g:521:5: (lv_polyObjects_4_0= rulePolyhedralObject )
                    	    {
                    	    // InternalAlpha.g:521:5: (lv_polyObjects_4_0= rulePolyhedralObject )
                    	    // InternalAlpha.g:522:6: lv_polyObjects_4_0= rulePolyhedralObject
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getAAffineSystemAccess().getPolyObjectsPolyhedralObjectParserRuleCall_3_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_polyObjects_4_0=rulePolyhedralObject();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getAAffineSystemRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"polyObjects",
                    	      							lv_polyObjects_4_0,
                    	      							"alpha.Alpha.PolyhedralObject");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

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

            // InternalAlpha.g:540:3: (otherlv_5= 'inputs' ( (lv_inputDeclarations_6_0= ruleAVariableDeclaration ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==42) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlpha.g:541:4: otherlv_5= 'inputs' ( (lv_inputDeclarations_6_0= ruleAVariableDeclaration ) )*
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getAAffineSystemAccess().getInputsKeyword_4_0());
                      			
                    }
                    // InternalAlpha.g:545:4: ( (lv_inputDeclarations_6_0= ruleAVariableDeclaration ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalAlpha.g:546:5: (lv_inputDeclarations_6_0= ruleAVariableDeclaration )
                    	    {
                    	    // InternalAlpha.g:546:5: (lv_inputDeclarations_6_0= ruleAVariableDeclaration )
                    	    // InternalAlpha.g:547:6: lv_inputDeclarations_6_0= ruleAVariableDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getAAffineSystemAccess().getInputDeclarationsAVariableDeclarationParserRuleCall_4_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_inputDeclarations_6_0=ruleAVariableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getAAffineSystemRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"inputDeclarations",
                    	      							lv_inputDeclarations_6_0,
                    	      							"alpha.Alpha.AVariableDeclaration");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

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

            // InternalAlpha.g:565:3: (otherlv_7= 'outputs' ( (lv_outputDeclarations_8_0= ruleAVariableDeclaration ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==43) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAlpha.g:566:4: otherlv_7= 'outputs' ( (lv_outputDeclarations_8_0= ruleAVariableDeclaration ) )*
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getAAffineSystemAccess().getOutputsKeyword_5_0());
                      			
                    }
                    // InternalAlpha.g:570:4: ( (lv_outputDeclarations_8_0= ruleAVariableDeclaration ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalAlpha.g:571:5: (lv_outputDeclarations_8_0= ruleAVariableDeclaration )
                    	    {
                    	    // InternalAlpha.g:571:5: (lv_outputDeclarations_8_0= ruleAVariableDeclaration )
                    	    // InternalAlpha.g:572:6: lv_outputDeclarations_8_0= ruleAVariableDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getAAffineSystemAccess().getOutputDeclarationsAVariableDeclarationParserRuleCall_5_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_15);
                    	    lv_outputDeclarations_8_0=ruleAVariableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getAAffineSystemRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"outputDeclarations",
                    	      							lv_outputDeclarations_8_0,
                    	      							"alpha.Alpha.AVariableDeclaration");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

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

            // InternalAlpha.g:590:3: (otherlv_9= 'locals' ( (lv_localvarDeclarations_10_0= ruleAVariableDeclaration ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAlpha.g:591:4: otherlv_9= 'locals' ( (lv_localvarDeclarations_10_0= ruleAVariableDeclaration ) )*
                    {
                    otherlv_9=(Token)match(input,44,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getAAffineSystemAccess().getLocalsKeyword_6_0());
                      			
                    }
                    // InternalAlpha.g:595:4: ( (lv_localvarDeclarations_10_0= ruleAVariableDeclaration ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalAlpha.g:596:5: (lv_localvarDeclarations_10_0= ruleAVariableDeclaration )
                    	    {
                    	    // InternalAlpha.g:596:5: (lv_localvarDeclarations_10_0= ruleAVariableDeclaration )
                    	    // InternalAlpha.g:597:6: lv_localvarDeclarations_10_0= ruleAVariableDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getAAffineSystemAccess().getLocalvarDeclarationsAVariableDeclarationParserRuleCall_6_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    lv_localvarDeclarations_10_0=ruleAVariableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getAAffineSystemRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"localvarDeclarations",
                    	      							lv_localvarDeclarations_10_0,
                    	      							"alpha.Alpha.AVariableDeclaration");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

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

            // InternalAlpha.g:615:3: (otherlv_11= 'fuzzy' ( (lv_fuzzyVariables_12_0= ruleAFuzzyVariableDeclaration ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==45) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlpha.g:616:4: otherlv_11= 'fuzzy' ( (lv_fuzzyVariables_12_0= ruleAFuzzyVariableDeclaration ) )*
                    {
                    otherlv_11=(Token)match(input,45,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getAAffineSystemAccess().getFuzzyKeyword_7_0());
                      			
                    }
                    // InternalAlpha.g:620:4: ( (lv_fuzzyVariables_12_0= ruleAFuzzyVariableDeclaration ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalAlpha.g:621:5: (lv_fuzzyVariables_12_0= ruleAFuzzyVariableDeclaration )
                    	    {
                    	    // InternalAlpha.g:621:5: (lv_fuzzyVariables_12_0= ruleAFuzzyVariableDeclaration )
                    	    // InternalAlpha.g:622:6: lv_fuzzyVariables_12_0= ruleAFuzzyVariableDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getAAffineSystemAccess().getFuzzyVariablesAFuzzyVariableDeclarationParserRuleCall_7_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    lv_fuzzyVariables_12_0=ruleAFuzzyVariableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getAAffineSystemRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"fuzzyVariables",
                    	      							lv_fuzzyVariables_12_0,
                    	      							"alpha.Alpha.AFuzzyVariableDeclaration");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAlpha.g:640:3: (otherlv_13= 'over' ( (lv_whileDomain_14_0= ruleAPolyhedralObjectExpression ) ) ( (lv_while_15_0= 'while' ) ) otherlv_16= '(' ( (lv_testExpression_17_0= ruleAAlphaExpression ) ) otherlv_18= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==46) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAlpha.g:641:4: otherlv_13= 'over' ( (lv_whileDomain_14_0= ruleAPolyhedralObjectExpression ) ) ( (lv_while_15_0= 'while' ) ) otherlv_16= '(' ( (lv_testExpression_17_0= ruleAAlphaExpression ) ) otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,46,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getAAffineSystemAccess().getOverKeyword_8_0());
                      			
                    }
                    // InternalAlpha.g:645:4: ( (lv_whileDomain_14_0= ruleAPolyhedralObjectExpression ) )
                    // InternalAlpha.g:646:5: (lv_whileDomain_14_0= ruleAPolyhedralObjectExpression )
                    {
                    // InternalAlpha.g:646:5: (lv_whileDomain_14_0= ruleAPolyhedralObjectExpression )
                    // InternalAlpha.g:647:6: lv_whileDomain_14_0= ruleAPolyhedralObjectExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAAffineSystemAccess().getWhileDomainAPolyhedralObjectExpressionParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_whileDomain_14_0=ruleAPolyhedralObjectExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAAffineSystemRule());
                      						}
                      						set(
                      							current,
                      							"whileDomain",
                      							lv_whileDomain_14_0,
                      							"alpha.Alpha.APolyhedralObjectExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAlpha.g:664:4: ( (lv_while_15_0= 'while' ) )
                    // InternalAlpha.g:665:5: (lv_while_15_0= 'while' )
                    {
                    // InternalAlpha.g:665:5: (lv_while_15_0= 'while' )
                    // InternalAlpha.g:666:6: lv_while_15_0= 'while'
                    {
                    lv_while_15_0=(Token)match(input,47,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_while_15_0, grammarAccess.getAAffineSystemAccess().getWhileWhileKeyword_8_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAAffineSystemRule());
                      						}
                      						setWithLastConsumed(current, "while", true, "while");
                      					
                    }

                    }


                    }

                    otherlv_16=(Token)match(input,38,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getAAffineSystemAccess().getLeftParenthesisKeyword_8_3());
                      			
                    }
                    // InternalAlpha.g:682:4: ( (lv_testExpression_17_0= ruleAAlphaExpression ) )
                    // InternalAlpha.g:683:5: (lv_testExpression_17_0= ruleAAlphaExpression )
                    {
                    // InternalAlpha.g:683:5: (lv_testExpression_17_0= ruleAAlphaExpression )
                    // InternalAlpha.g:684:6: lv_testExpression_17_0= ruleAAlphaExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAAffineSystemAccess().getTestExpressionAAlphaExpressionParserRuleCall_8_4_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_testExpression_17_0=ruleAAlphaExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAAffineSystemRule());
                      						}
                      						set(
                      							current,
                      							"testExpression",
                      							lv_testExpression_17_0,
                      							"alpha.Alpha.AAlphaExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,39,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getAAffineSystemAccess().getRightParenthesisKeyword_8_5());
                      			
                    }

                    }
                    break;

            }

            // InternalAlpha.g:706:3: (otherlv_19= 'let' ( (lv_useEquations_20_0= ruleAUseEquation ) )* ( (lv_equations_21_0= ruleAEquation ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==48) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAlpha.g:707:4: otherlv_19= 'let' ( (lv_useEquations_20_0= ruleAUseEquation ) )* ( (lv_equations_21_0= ruleAEquation ) )*
                    {
                    otherlv_19=(Token)match(input,48,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getAAffineSystemAccess().getLetKeyword_9_0());
                      			
                    }
                    // InternalAlpha.g:711:4: ( (lv_useEquations_20_0= ruleAUseEquation ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==38||LA15_0==46) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalAlpha.g:712:5: (lv_useEquations_20_0= ruleAUseEquation )
                    	    {
                    	    // InternalAlpha.g:712:5: (lv_useEquations_20_0= ruleAUseEquation )
                    	    // InternalAlpha.g:713:6: lv_useEquations_20_0= ruleAUseEquation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getAAffineSystemAccess().getUseEquationsAUseEquationParserRuleCall_9_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_22);
                    	    lv_useEquations_20_0=ruleAUseEquation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getAAffineSystemRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"useEquations",
                    	      							lv_useEquations_20_0,
                    	      							"alpha.Alpha.AUseEquation");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    // InternalAlpha.g:730:4: ( (lv_equations_21_0= ruleAEquation ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalAlpha.g:731:5: (lv_equations_21_0= ruleAEquation )
                    	    {
                    	    // InternalAlpha.g:731:5: (lv_equations_21_0= ruleAEquation )
                    	    // InternalAlpha.g:732:6: lv_equations_21_0= ruleAEquation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getAAffineSystemAccess().getEquationsAEquationParserRuleCall_9_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_equations_21_0=ruleAEquation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getAAffineSystemRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"equations",
                    	      							lv_equations_21_0,
                    	      							"alpha.Alpha.AEquation");
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
                    break;

            }

            otherlv_22=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getAAffineSystemAccess().getFullStopKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:758:1: entryRuleAVariableDeclaration returns [EObject current=null] : iv_ruleAVariableDeclaration= ruleAVariableDeclaration EOF ;
    public final EObject entryRuleAVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAVariableDeclaration = null;


        try {
            // InternalAlpha.g:758:61: (iv_ruleAVariableDeclaration= ruleAVariableDeclaration EOF )
            // InternalAlpha.g:759:2: iv_ruleAVariableDeclaration= ruleAVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAVariableDeclaration=ruleAVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:765:1: ruleAVariableDeclaration returns [EObject current=null] : ( ( (lv_varList_0_0= ruleAVariableList ) ) (otherlv_1= ':' ( (lv_domain_2_0= ruleAPolyhedralObjectExpression ) ) )? ) ;
    public final EObject ruleAVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_varList_0_0 = null;

        EObject lv_domain_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:771:2: ( ( ( (lv_varList_0_0= ruleAVariableList ) ) (otherlv_1= ':' ( (lv_domain_2_0= ruleAPolyhedralObjectExpression ) ) )? ) )
            // InternalAlpha.g:772:2: ( ( (lv_varList_0_0= ruleAVariableList ) ) (otherlv_1= ':' ( (lv_domain_2_0= ruleAPolyhedralObjectExpression ) ) )? )
            {
            // InternalAlpha.g:772:2: ( ( (lv_varList_0_0= ruleAVariableList ) ) (otherlv_1= ':' ( (lv_domain_2_0= ruleAPolyhedralObjectExpression ) ) )? )
            // InternalAlpha.g:773:3: ( (lv_varList_0_0= ruleAVariableList ) ) (otherlv_1= ':' ( (lv_domain_2_0= ruleAPolyhedralObjectExpression ) ) )?
            {
            // InternalAlpha.g:773:3: ( (lv_varList_0_0= ruleAVariableList ) )
            // InternalAlpha.g:774:4: (lv_varList_0_0= ruleAVariableList )
            {
            // InternalAlpha.g:774:4: (lv_varList_0_0= ruleAVariableList )
            // InternalAlpha.g:775:5: lv_varList_0_0= ruleAVariableList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAVariableDeclarationAccess().getVarListAVariableListParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_varList_0_0=ruleAVariableList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAVariableDeclarationRule());
              					}
              					set(
              						current,
              						"varList",
              						lv_varList_0_0,
              						"alpha.Alpha.AVariableList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAlpha.g:792:3: (otherlv_1= ':' ( (lv_domain_2_0= ruleAPolyhedralObjectExpression ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==50) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAlpha.g:793:4: otherlv_1= ':' ( (lv_domain_2_0= ruleAPolyhedralObjectExpression ) )
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getAVariableDeclarationAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalAlpha.g:797:4: ( (lv_domain_2_0= ruleAPolyhedralObjectExpression ) )
                    // InternalAlpha.g:798:5: (lv_domain_2_0= ruleAPolyhedralObjectExpression )
                    {
                    // InternalAlpha.g:798:5: (lv_domain_2_0= ruleAPolyhedralObjectExpression )
                    // InternalAlpha.g:799:6: lv_domain_2_0= ruleAPolyhedralObjectExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAVariableDeclarationAccess().getDomainAPolyhedralObjectExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_domain_2_0=ruleAPolyhedralObjectExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAVariableDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"domain",
                      							lv_domain_2_0,
                      							"alpha.Alpha.APolyhedralObjectExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:821:1: entryRuleAVariableList returns [EObject current=null] : iv_ruleAVariableList= ruleAVariableList EOF ;
    public final EObject entryRuleAVariableList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAVariableList = null;


        try {
            // InternalAlpha.g:821:54: (iv_ruleAVariableList= ruleAVariableList EOF )
            // InternalAlpha.g:822:2: iv_ruleAVariableList= ruleAVariableList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAVariableListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAVariableList=ruleAVariableList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAVariableList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:828:1: ruleAVariableList returns [EObject current=null] : ( ( (lv_vars_0_0= ruleAVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleAVariable ) ) )* ) ;
    public final EObject ruleAVariableList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_vars_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:834:2: ( ( ( (lv_vars_0_0= ruleAVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleAVariable ) ) )* ) )
            // InternalAlpha.g:835:2: ( ( (lv_vars_0_0= ruleAVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleAVariable ) ) )* )
            {
            // InternalAlpha.g:835:2: ( ( (lv_vars_0_0= ruleAVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleAVariable ) ) )* )
            // InternalAlpha.g:836:3: ( (lv_vars_0_0= ruleAVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleAVariable ) ) )*
            {
            // InternalAlpha.g:836:3: ( (lv_vars_0_0= ruleAVariable ) )
            // InternalAlpha.g:837:4: (lv_vars_0_0= ruleAVariable )
            {
            // InternalAlpha.g:837:4: (lv_vars_0_0= ruleAVariable )
            // InternalAlpha.g:838:5: lv_vars_0_0= ruleAVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAVariableListAccess().getVarsAVariableParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_vars_0_0=ruleAVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalAlpha.g:855:3: (otherlv_1= ',' ( (lv_vars_2_0= ruleAVariable ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==51) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAlpha.g:856:4: otherlv_1= ',' ( (lv_vars_2_0= ruleAVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,51,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getAVariableListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAlpha.g:860:4: ( (lv_vars_2_0= ruleAVariable ) )
            	    // InternalAlpha.g:861:5: (lv_vars_2_0= ruleAVariable )
            	    {
            	    // InternalAlpha.g:861:5: (lv_vars_2_0= ruleAVariable )
            	    // InternalAlpha.g:862:6: lv_vars_2_0= ruleAVariable
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAVariableListAccess().getVarsAVariableParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_vars_2_0=ruleAVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:884:1: entryRuleAVariable returns [EObject current=null] : iv_ruleAVariable= ruleAVariable EOF ;
    public final EObject entryRuleAVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAVariable = null;


        try {
            // InternalAlpha.g:884:50: (iv_ruleAVariable= ruleAVariable EOF )
            // InternalAlpha.g:885:2: iv_ruleAVariable= ruleAVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAVariable=ruleAVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:891:1: ruleAVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:897:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalAlpha.g:898:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalAlpha.g:898:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:899:3: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:899:3: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:900:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getAVariableAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:919:1: entryRuleAFuzzyVariableDeclaration returns [EObject current=null] : iv_ruleAFuzzyVariableDeclaration= ruleAFuzzyVariableDeclaration EOF ;
    public final EObject entryRuleAFuzzyVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAFuzzyVariableDeclaration = null;


        try {
            // InternalAlpha.g:919:66: (iv_ruleAFuzzyVariableDeclaration= ruleAFuzzyVariableDeclaration EOF )
            // InternalAlpha.g:920:2: iv_ruleAFuzzyVariableDeclaration= ruleAFuzzyVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAFuzzyVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAFuzzyVariableDeclaration=ruleAFuzzyVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAFuzzyVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:926:1: ruleAFuzzyVariableDeclaration returns [EObject current=null] : ( ( (lv_varList_0_0= ruleAVariableList ) ) otherlv_1= ':' ( (lv_relation_2_0= ruleAPolyhedralObjectExpression ) ) ) ;
    public final EObject ruleAFuzzyVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_varList_0_0 = null;

        EObject lv_relation_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:932:2: ( ( ( (lv_varList_0_0= ruleAVariableList ) ) otherlv_1= ':' ( (lv_relation_2_0= ruleAPolyhedralObjectExpression ) ) ) )
            // InternalAlpha.g:933:2: ( ( (lv_varList_0_0= ruleAVariableList ) ) otherlv_1= ':' ( (lv_relation_2_0= ruleAPolyhedralObjectExpression ) ) )
            {
            // InternalAlpha.g:933:2: ( ( (lv_varList_0_0= ruleAVariableList ) ) otherlv_1= ':' ( (lv_relation_2_0= ruleAPolyhedralObjectExpression ) ) )
            // InternalAlpha.g:934:3: ( (lv_varList_0_0= ruleAVariableList ) ) otherlv_1= ':' ( (lv_relation_2_0= ruleAPolyhedralObjectExpression ) )
            {
            // InternalAlpha.g:934:3: ( (lv_varList_0_0= ruleAVariableList ) )
            // InternalAlpha.g:935:4: (lv_varList_0_0= ruleAVariableList )
            {
            // InternalAlpha.g:935:4: (lv_varList_0_0= ruleAVariableList )
            // InternalAlpha.g:936:5: lv_varList_0_0= ruleAVariableList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAFuzzyVariableDeclarationAccess().getVarListAVariableListParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_varList_0_0=ruleAVariableList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAFuzzyVariableDeclarationRule());
              					}
              					set(
              						current,
              						"varList",
              						lv_varList_0_0,
              						"alpha.Alpha.AVariableList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,50,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAFuzzyVariableDeclarationAccess().getColonKeyword_1());
              		
            }
            // InternalAlpha.g:957:3: ( (lv_relation_2_0= ruleAPolyhedralObjectExpression ) )
            // InternalAlpha.g:958:4: (lv_relation_2_0= ruleAPolyhedralObjectExpression )
            {
            // InternalAlpha.g:958:4: (lv_relation_2_0= ruleAPolyhedralObjectExpression )
            // InternalAlpha.g:959:5: lv_relation_2_0= ruleAPolyhedralObjectExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAFuzzyVariableDeclarationAccess().getRelationAPolyhedralObjectExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_relation_2_0=ruleAPolyhedralObjectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAFuzzyVariableDeclarationRule());
              					}
              					set(
              						current,
              						"relation",
              						lv_relation_2_0,
              						"alpha.Alpha.APolyhedralObjectExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:980:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlpha.g:980:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlpha.g:981:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:987:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAlpha.g:993:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAlpha.g:994:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAlpha.g:994:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAlpha.g:995:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAlpha.g:1002:3: (kw= '.' this_ID_2= RULE_ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==49) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAlpha.g:1003:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:1020:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAlpha.g:1020:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAlpha.g:1021:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:1027:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1033:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalAlpha.g:1034:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalAlpha.g:1034:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalAlpha.g:1035:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_28);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAlpha.g:1045:3: (kw= '.*' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==52) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAlpha.g:1046:4: kw= '.*'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:1056:1: entryRuleSystemName returns [String current=null] : iv_ruleSystemName= ruleSystemName EOF ;
    public final String entryRuleSystemName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSystemName = null;


        try {
            // InternalAlpha.g:1056:50: (iv_ruleSystemName= ruleSystemName EOF )
            // InternalAlpha.g:1057:2: iv_ruleSystemName= ruleSystemName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSystemName=ruleSystemName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystemName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:1063:1: ruleSystemName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleSystemName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:1069:2: (this_ID_0= RULE_ID )
            // InternalAlpha.g:1070:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getSystemNameAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:1080:1: entryRuleIndexName returns [String current=null] : iv_ruleIndexName= ruleIndexName EOF ;
    public final String entryRuleIndexName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIndexName = null;


        try {
            // InternalAlpha.g:1080:49: (iv_ruleIndexName= ruleIndexName EOF )
            // InternalAlpha.g:1081:2: iv_ruleIndexName= ruleIndexName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIndexName=ruleIndexName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:1087:1: ruleIndexName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '\\'' )* ) ;
    public final AntlrDatatypeRuleToken ruleIndexName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalAlpha.g:1093:2: ( (this_ID_0= RULE_ID (kw= '\\'' )* ) )
            // InternalAlpha.g:1094:2: (this_ID_0= RULE_ID (kw= '\\'' )* )
            {
            // InternalAlpha.g:1094:2: (this_ID_0= RULE_ID (kw= '\\'' )* )
            // InternalAlpha.g:1095:3: this_ID_0= RULE_ID (kw= '\\'' )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getIndexNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAlpha.g:1102:3: (kw= '\\'' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==53) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAlpha.g:1103:4: kw= '\\''
            	    {
            	    kw=(Token)match(input,53,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getIndexNameAccess().getApostropheKeyword_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:1113:1: entryRuleAIndexDimension returns [String current=null] : iv_ruleAIndexDimension= ruleAIndexDimension EOF ;
    public final String entryRuleAIndexDimension() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAIndexDimension = null;


        try {
            // InternalAlpha.g:1113:55: (iv_ruleAIndexDimension= ruleAIndexDimension EOF )
            // InternalAlpha.g:1114:2: iv_ruleAIndexDimension= ruleAIndexDimension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAIndexDimensionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAIndexDimension=ruleAIndexDimension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAIndexDimension.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:1120:1: ruleAIndexDimension returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IndexName_0= ruleIndexName ;
    public final AntlrDatatypeRuleToken ruleAIndexDimension() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IndexName_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1126:2: (this_IndexName_0= ruleIndexName )
            // InternalAlpha.g:1127:2: this_IndexName_0= ruleIndexName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getAIndexDimensionAccess().getIndexNameParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_IndexName_0=ruleIndexName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IndexName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:1140:1: entryRuleAIndexList returns [String current=null] : iv_ruleAIndexList= ruleAIndexList EOF ;
    public final String entryRuleAIndexList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAIndexList = null;


        try {
            // InternalAlpha.g:1140:50: (iv_ruleAIndexList= ruleAIndexList EOF )
            // InternalAlpha.g:1141:2: iv_ruleAIndexList= ruleAIndexList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAIndexListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAIndexList=ruleAIndexList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAIndexList.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:1147:1: ruleAIndexList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AIndexDimension_0= ruleAIndexDimension (kw= ',' this_AIndexDimension_2= ruleAIndexDimension )* )? ;
    public final AntlrDatatypeRuleToken ruleAIndexList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AIndexDimension_0 = null;

        AntlrDatatypeRuleToken this_AIndexDimension_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1153:2: ( (this_AIndexDimension_0= ruleAIndexDimension (kw= ',' this_AIndexDimension_2= ruleAIndexDimension )* )? )
            // InternalAlpha.g:1154:2: (this_AIndexDimension_0= ruleAIndexDimension (kw= ',' this_AIndexDimension_2= ruleAIndexDimension )* )?
            {
            // InternalAlpha.g:1154:2: (this_AIndexDimension_0= ruleAIndexDimension (kw= ',' this_AIndexDimension_2= ruleAIndexDimension )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAlpha.g:1155:3: this_AIndexDimension_0= ruleAIndexDimension (kw= ',' this_AIndexDimension_2= ruleAIndexDimension )*
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAIndexListAccess().getAIndexDimensionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_25);
                    this_AIndexDimension_0=ruleAIndexDimension();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_AIndexDimension_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }
                    // InternalAlpha.g:1165:3: (kw= ',' this_AIndexDimension_2= ruleAIndexDimension )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==51) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalAlpha.g:1166:4: kw= ',' this_AIndexDimension_2= ruleAIndexDimension
                    	    {
                    	    kw=(Token)match(input,51,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				current.merge(kw);
                    	      				newLeafNode(kw, grammarAccess.getAIndexListAccess().getCommaKeyword_1_0());
                    	      			
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      				newCompositeNode(grammarAccess.getAIndexListAccess().getAIndexDimensionParserRuleCall_1_1());
                    	      			
                    	    }
                    	    pushFollow(FOLLOW_25);
                    	    this_AIndexDimension_2=ruleAIndexDimension();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				current.merge(this_AIndexDimension_2);
                    	      			
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      				afterParserOrEnumRuleCall();
                    	      			
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRulePolyhedralObject"
    // InternalAlpha.g:1186:1: entryRulePolyhedralObject returns [EObject current=null] : iv_rulePolyhedralObject= rulePolyhedralObject EOF ;
    public final EObject entryRulePolyhedralObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyhedralObject = null;


        try {
            // InternalAlpha.g:1186:57: (iv_rulePolyhedralObject= rulePolyhedralObject EOF )
            // InternalAlpha.g:1187:2: iv_rulePolyhedralObject= rulePolyhedralObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPolyhedralObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePolyhedralObject=rulePolyhedralObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePolyhedralObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:1193:1: rulePolyhedralObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_OP_EQ_1= RULE_OP_EQ ( (lv_object_2_0= ruleAPolyhedralObjectExpression ) ) ) ;
    public final EObject rulePolyhedralObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_OP_EQ_1=null;
        EObject lv_object_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1199:2: ( ( ( (lv_name_0_0= RULE_ID ) ) this_OP_EQ_1= RULE_OP_EQ ( (lv_object_2_0= ruleAPolyhedralObjectExpression ) ) ) )
            // InternalAlpha.g:1200:2: ( ( (lv_name_0_0= RULE_ID ) ) this_OP_EQ_1= RULE_OP_EQ ( (lv_object_2_0= ruleAPolyhedralObjectExpression ) ) )
            {
            // InternalAlpha.g:1200:2: ( ( (lv_name_0_0= RULE_ID ) ) this_OP_EQ_1= RULE_OP_EQ ( (lv_object_2_0= ruleAPolyhedralObjectExpression ) ) )
            // InternalAlpha.g:1201:3: ( (lv_name_0_0= RULE_ID ) ) this_OP_EQ_1= RULE_OP_EQ ( (lv_object_2_0= ruleAPolyhedralObjectExpression ) )
            {
            // InternalAlpha.g:1201:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAlpha.g:1202:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAlpha.g:1202:4: (lv_name_0_0= RULE_ID )
            // InternalAlpha.g:1203:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getPolyhedralObjectAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            this_OP_EQ_1=(Token)match(input,RULE_OP_EQ,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OP_EQ_1, grammarAccess.getPolyhedralObjectAccess().getOP_EQTerminalRuleCall_1());
              		
            }
            // InternalAlpha.g:1223:3: ( (lv_object_2_0= ruleAPolyhedralObjectExpression ) )
            // InternalAlpha.g:1224:4: (lv_object_2_0= ruleAPolyhedralObjectExpression )
            {
            // InternalAlpha.g:1224:4: (lv_object_2_0= ruleAPolyhedralObjectExpression )
            // InternalAlpha.g:1225:5: lv_object_2_0= ruleAPolyhedralObjectExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPolyhedralObjectAccess().getObjectAPolyhedralObjectExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_object_2_0=ruleAPolyhedralObjectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPolyhedralObjectRule());
              					}
              					set(
              						current,
              						"object",
              						lv_object_2_0,
              						"alpha.Alpha.APolyhedralObjectExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleAPolyhedralObjectExpression"
    // InternalAlpha.g:1246:1: entryRuleAPolyhedralObjectExpression returns [EObject current=null] : iv_ruleAPolyhedralObjectExpression= ruleAPolyhedralObjectExpression EOF ;
    public final EObject entryRuleAPolyhedralObjectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAPolyhedralObjectExpression = null;


        try {
            // InternalAlpha.g:1246:68: (iv_ruleAPolyhedralObjectExpression= ruleAPolyhedralObjectExpression EOF )
            // InternalAlpha.g:1247:2: iv_ruleAPolyhedralObjectExpression= ruleAPolyhedralObjectExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAPolyhedralObjectExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAPolyhedralObjectExpression=ruleAPolyhedralObjectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAPolyhedralObjectExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAPolyhedralObjectExpression"


    // $ANTLR start "ruleAPolyhedralObjectExpression"
    // InternalAlpha.g:1253:1: ruleAPolyhedralObjectExpression returns [EObject current=null] : (this_AUnaryOrTerminalPolyObjExpression_0= ruleAUnaryOrTerminalPolyObjExpression ( () ( ( (lv_operator_2_1= 'cross' | lv_operator_2_2= RULE_OP_PLUS | lv_operator_2_3= RULE_OP_MINUS | lv_operator_2_4= RULE_OP_MUL | lv_operator_2_5= '@' | lv_operator_2_6= '->-' | lv_operator_2_7= '->*' ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalPolyObjExpression ) ) )* ) ;
    public final EObject ruleAPolyhedralObjectExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        Token lv_operator_2_4=null;
        Token lv_operator_2_5=null;
        Token lv_operator_2_6=null;
        Token lv_operator_2_7=null;
        EObject this_AUnaryOrTerminalPolyObjExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1259:2: ( (this_AUnaryOrTerminalPolyObjExpression_0= ruleAUnaryOrTerminalPolyObjExpression ( () ( ( (lv_operator_2_1= 'cross' | lv_operator_2_2= RULE_OP_PLUS | lv_operator_2_3= RULE_OP_MINUS | lv_operator_2_4= RULE_OP_MUL | lv_operator_2_5= '@' | lv_operator_2_6= '->-' | lv_operator_2_7= '->*' ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalPolyObjExpression ) ) )* ) )
            // InternalAlpha.g:1260:2: (this_AUnaryOrTerminalPolyObjExpression_0= ruleAUnaryOrTerminalPolyObjExpression ( () ( ( (lv_operator_2_1= 'cross' | lv_operator_2_2= RULE_OP_PLUS | lv_operator_2_3= RULE_OP_MINUS | lv_operator_2_4= RULE_OP_MUL | lv_operator_2_5= '@' | lv_operator_2_6= '->-' | lv_operator_2_7= '->*' ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalPolyObjExpression ) ) )* )
            {
            // InternalAlpha.g:1260:2: (this_AUnaryOrTerminalPolyObjExpression_0= ruleAUnaryOrTerminalPolyObjExpression ( () ( ( (lv_operator_2_1= 'cross' | lv_operator_2_2= RULE_OP_PLUS | lv_operator_2_3= RULE_OP_MINUS | lv_operator_2_4= RULE_OP_MUL | lv_operator_2_5= '@' | lv_operator_2_6= '->-' | lv_operator_2_7= '->*' ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalPolyObjExpression ) ) )* )
            // InternalAlpha.g:1261:3: this_AUnaryOrTerminalPolyObjExpression_0= ruleAUnaryOrTerminalPolyObjExpression ( () ( ( (lv_operator_2_1= 'cross' | lv_operator_2_2= RULE_OP_PLUS | lv_operator_2_3= RULE_OP_MINUS | lv_operator_2_4= RULE_OP_MUL | lv_operator_2_5= '@' | lv_operator_2_6= '->-' | lv_operator_2_7= '->*' ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalPolyObjExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAPolyhedralObjectExpressionAccess().getAUnaryOrTerminalPolyObjExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_30);
            this_AUnaryOrTerminalPolyObjExpression_0=ruleAUnaryOrTerminalPolyObjExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AUnaryOrTerminalPolyObjExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAlpha.g:1269:3: ( () ( ( (lv_operator_2_1= 'cross' | lv_operator_2_2= RULE_OP_PLUS | lv_operator_2_3= RULE_OP_MINUS | lv_operator_2_4= RULE_OP_MUL | lv_operator_2_5= '@' | lv_operator_2_6= '->-' | lv_operator_2_7= '->*' ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalPolyObjExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_OP_PLUS && LA26_0<=RULE_OP_MUL)||(LA26_0>=54 && LA26_0<=57)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAlpha.g:1270:4: () ( ( (lv_operator_2_1= 'cross' | lv_operator_2_2= RULE_OP_PLUS | lv_operator_2_3= RULE_OP_MINUS | lv_operator_2_4= RULE_OP_MUL | lv_operator_2_5= '@' | lv_operator_2_6= '->-' | lv_operator_2_7= '->*' ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalPolyObjExpression ) )
            	    {
            	    // InternalAlpha.g:1270:4: ()
            	    // InternalAlpha.g:1271:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAPolyhedralObjectExpressionAccess().getABinaryPolyObjExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalAlpha.g:1277:4: ( ( (lv_operator_2_1= 'cross' | lv_operator_2_2= RULE_OP_PLUS | lv_operator_2_3= RULE_OP_MINUS | lv_operator_2_4= RULE_OP_MUL | lv_operator_2_5= '@' | lv_operator_2_6= '->-' | lv_operator_2_7= '->*' ) ) )
            	    // InternalAlpha.g:1278:5: ( (lv_operator_2_1= 'cross' | lv_operator_2_2= RULE_OP_PLUS | lv_operator_2_3= RULE_OP_MINUS | lv_operator_2_4= RULE_OP_MUL | lv_operator_2_5= '@' | lv_operator_2_6= '->-' | lv_operator_2_7= '->*' ) )
            	    {
            	    // InternalAlpha.g:1278:5: ( (lv_operator_2_1= 'cross' | lv_operator_2_2= RULE_OP_PLUS | lv_operator_2_3= RULE_OP_MINUS | lv_operator_2_4= RULE_OP_MUL | lv_operator_2_5= '@' | lv_operator_2_6= '->-' | lv_operator_2_7= '->*' ) )
            	    // InternalAlpha.g:1279:6: (lv_operator_2_1= 'cross' | lv_operator_2_2= RULE_OP_PLUS | lv_operator_2_3= RULE_OP_MINUS | lv_operator_2_4= RULE_OP_MUL | lv_operator_2_5= '@' | lv_operator_2_6= '->-' | lv_operator_2_7= '->*' )
            	    {
            	    // InternalAlpha.g:1279:6: (lv_operator_2_1= 'cross' | lv_operator_2_2= RULE_OP_PLUS | lv_operator_2_3= RULE_OP_MINUS | lv_operator_2_4= RULE_OP_MUL | lv_operator_2_5= '@' | lv_operator_2_6= '->-' | lv_operator_2_7= '->*' )
            	    int alt25=7;
            	    switch ( input.LA(1) ) {
            	    case 54:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case RULE_OP_PLUS:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case RULE_OP_MINUS:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    case RULE_OP_MUL:
            	        {
            	        alt25=4;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt25=5;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt25=6;
            	        }
            	        break;
            	    case 57:
            	        {
            	        alt25=7;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // InternalAlpha.g:1280:7: lv_operator_2_1= 'cross'
            	            {
            	            lv_operator_2_1=(Token)match(input,54,FOLLOW_18); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_1, grammarAccess.getAPolyhedralObjectExpressionAccess().getOperatorCrossKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAPolyhedralObjectExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalAlpha.g:1291:7: lv_operator_2_2= RULE_OP_PLUS
            	            {
            	            lv_operator_2_2=(Token)match(input,RULE_OP_PLUS,FOLLOW_18); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_2, grammarAccess.getAPolyhedralObjectExpressionAccess().getOperatorOP_PLUSTerminalRuleCall_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAPolyhedralObjectExpressionRule());
            	              							}
            	              							setWithLastConsumed(
            	              								current,
            	              								"operator",
            	              								lv_operator_2_2,
            	              								"alpha.Alpha.OP_PLUS");
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalAlpha.g:1306:7: lv_operator_2_3= RULE_OP_MINUS
            	            {
            	            lv_operator_2_3=(Token)match(input,RULE_OP_MINUS,FOLLOW_18); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_3, grammarAccess.getAPolyhedralObjectExpressionAccess().getOperatorOP_MINUSTerminalRuleCall_1_1_0_2());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAPolyhedralObjectExpressionRule());
            	              							}
            	              							setWithLastConsumed(
            	              								current,
            	              								"operator",
            	              								lv_operator_2_3,
            	              								"alpha.Alpha.OP_MINUS");
            	              						
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalAlpha.g:1321:7: lv_operator_2_4= RULE_OP_MUL
            	            {
            	            lv_operator_2_4=(Token)match(input,RULE_OP_MUL,FOLLOW_18); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_4, grammarAccess.getAPolyhedralObjectExpressionAccess().getOperatorOP_MULTerminalRuleCall_1_1_0_3());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAPolyhedralObjectExpressionRule());
            	              							}
            	              							setWithLastConsumed(
            	              								current,
            	              								"operator",
            	              								lv_operator_2_4,
            	              								"alpha.Alpha.OP_MUL");
            	              						
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // InternalAlpha.g:1336:7: lv_operator_2_5= '@'
            	            {
            	            lv_operator_2_5=(Token)match(input,55,FOLLOW_18); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_5, grammarAccess.getAPolyhedralObjectExpressionAccess().getOperatorCommercialAtKeyword_1_1_0_4());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAPolyhedralObjectExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_5, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // InternalAlpha.g:1347:7: lv_operator_2_6= '->-'
            	            {
            	            lv_operator_2_6=(Token)match(input,56,FOLLOW_18); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_6, grammarAccess.getAPolyhedralObjectExpressionAccess().getOperatorHyphenMinusGreaterThanSignHyphenMinusKeyword_1_1_0_5());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAPolyhedralObjectExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_6, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // InternalAlpha.g:1358:7: lv_operator_2_7= '->*'
            	            {
            	            lv_operator_2_7=(Token)match(input,57,FOLLOW_18); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_7, grammarAccess.getAPolyhedralObjectExpressionAccess().getOperatorHyphenMinusGreaterThanSignAsteriskKeyword_1_1_0_6());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAPolyhedralObjectExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_7, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalAlpha.g:1371:4: ( (lv_right_3_0= ruleAUnaryOrTerminalPolyObjExpression ) )
            	    // InternalAlpha.g:1372:5: (lv_right_3_0= ruleAUnaryOrTerminalPolyObjExpression )
            	    {
            	    // InternalAlpha.g:1372:5: (lv_right_3_0= ruleAUnaryOrTerminalPolyObjExpression )
            	    // InternalAlpha.g:1373:6: lv_right_3_0= ruleAUnaryOrTerminalPolyObjExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAPolyhedralObjectExpressionAccess().getRightAUnaryOrTerminalPolyObjExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_right_3_0=ruleAUnaryOrTerminalPolyObjExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAPolyhedralObjectExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"alpha.Alpha.AUnaryOrTerminalPolyObjExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAPolyhedralObjectExpression"


    // $ANTLR start "entryRuleAUnaryOrTerminalPolyObjExpression"
    // InternalAlpha.g:1395:1: entryRuleAUnaryOrTerminalPolyObjExpression returns [EObject current=null] : iv_ruleAUnaryOrTerminalPolyObjExpression= ruleAUnaryOrTerminalPolyObjExpression EOF ;
    public final EObject entryRuleAUnaryOrTerminalPolyObjExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAUnaryOrTerminalPolyObjExpression = null;


        try {
            // InternalAlpha.g:1395:74: (iv_ruleAUnaryOrTerminalPolyObjExpression= ruleAUnaryOrTerminalPolyObjExpression EOF )
            // InternalAlpha.g:1396:2: iv_ruleAUnaryOrTerminalPolyObjExpression= ruleAUnaryOrTerminalPolyObjExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAUnaryOrTerminalPolyObjExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAUnaryOrTerminalPolyObjExpression=ruleAUnaryOrTerminalPolyObjExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAUnaryOrTerminalPolyObjExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAUnaryOrTerminalPolyObjExpression"


    // $ANTLR start "ruleAUnaryOrTerminalPolyObjExpression"
    // InternalAlpha.g:1402:1: ruleAUnaryOrTerminalPolyObjExpression returns [EObject current=null] : (this_AUnaryPolyObjExpression_0= ruleAUnaryPolyObjExpression | this_APolyObjTerminal_1= ruleAPolyObjTerminal ) ;
    public final EObject ruleAUnaryOrTerminalPolyObjExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AUnaryPolyObjExpression_0 = null;

        EObject this_APolyObjTerminal_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1408:2: ( (this_AUnaryPolyObjExpression_0= ruleAUnaryPolyObjExpression | this_APolyObjTerminal_1= ruleAPolyObjTerminal ) )
            // InternalAlpha.g:1409:2: (this_AUnaryPolyObjExpression_0= ruleAUnaryPolyObjExpression | this_APolyObjTerminal_1= ruleAPolyObjTerminal )
            {
            // InternalAlpha.g:1409:2: (this_AUnaryPolyObjExpression_0= ruleAUnaryPolyObjExpression | this_APolyObjTerminal_1= ruleAPolyObjTerminal )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=58 && LA27_0<=63)) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ID||LA27_0==33||LA27_0==38||LA27_0==64) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalAlpha.g:1410:3: this_AUnaryPolyObjExpression_0= ruleAUnaryPolyObjExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAUnaryOrTerminalPolyObjExpressionAccess().getAUnaryPolyObjExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AUnaryPolyObjExpression_0=ruleAUnaryPolyObjExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AUnaryPolyObjExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:1419:3: this_APolyObjTerminal_1= ruleAPolyObjTerminal
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAUnaryOrTerminalPolyObjExpressionAccess().getAPolyObjTerminalParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_APolyObjTerminal_1=ruleAPolyObjTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_APolyObjTerminal_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAUnaryOrTerminalPolyObjExpression"


    // $ANTLR start "entryRuleAPolyObjTerminal"
    // InternalAlpha.g:1431:1: entryRuleAPolyObjTerminal returns [EObject current=null] : iv_ruleAPolyObjTerminal= ruleAPolyObjTerminal EOF ;
    public final EObject entryRuleAPolyObjTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAPolyObjTerminal = null;


        try {
            // InternalAlpha.g:1431:57: (iv_ruleAPolyObjTerminal= ruleAPolyObjTerminal EOF )
            // InternalAlpha.g:1432:2: iv_ruleAPolyObjTerminal= ruleAPolyObjTerminal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAPolyObjTerminalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAPolyObjTerminal=ruleAPolyObjTerminal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAPolyObjTerminal; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAPolyObjTerminal"


    // $ANTLR start "ruleAPolyObjTerminal"
    // InternalAlpha.g:1438:1: ruleAPolyObjTerminal returns [EObject current=null] : (this_AISLSet_0= ruleAISLSet | this_AISLRelation_1= ruleAISLRelation | this_ADeclaredObject_2= ruleADeclaredObject | this_ARectangularDomain_3= ruleARectangularDomain | this_AVariableDomain_4= ruleAVariableDomain | (otherlv_5= '(' this_APolyhedralObjectExpression_6= ruleAPolyhedralObjectExpression otherlv_7= ')' ) ) ;
    public final EObject ruleAPolyObjTerminal() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_AISLSet_0 = null;

        EObject this_AISLRelation_1 = null;

        EObject this_ADeclaredObject_2 = null;

        EObject this_ARectangularDomain_3 = null;

        EObject this_AVariableDomain_4 = null;

        EObject this_APolyhedralObjectExpression_6 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1444:2: ( (this_AISLSet_0= ruleAISLSet | this_AISLRelation_1= ruleAISLRelation | this_ADeclaredObject_2= ruleADeclaredObject | this_ARectangularDomain_3= ruleARectangularDomain | this_AVariableDomain_4= ruleAVariableDomain | (otherlv_5= '(' this_APolyhedralObjectExpression_6= ruleAPolyhedralObjectExpression otherlv_7= ')' ) ) )
            // InternalAlpha.g:1445:2: (this_AISLSet_0= ruleAISLSet | this_AISLRelation_1= ruleAISLRelation | this_ADeclaredObject_2= ruleADeclaredObject | this_ARectangularDomain_3= ruleARectangularDomain | this_AVariableDomain_4= ruleAVariableDomain | (otherlv_5= '(' this_APolyhedralObjectExpression_6= ruleAPolyhedralObjectExpression otherlv_7= ')' ) )
            {
            // InternalAlpha.g:1445:2: (this_AISLSet_0= ruleAISLSet | this_AISLRelation_1= ruleAISLRelation | this_ADeclaredObject_2= ruleADeclaredObject | this_ARectangularDomain_3= ruleARectangularDomain | this_AVariableDomain_4= ruleAVariableDomain | (otherlv_5= '(' this_APolyhedralObjectExpression_6= ruleAPolyhedralObjectExpression otherlv_7= ')' ) )
            int alt28=6;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalAlpha.g:1446:3: this_AISLSet_0= ruleAISLSet
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAPolyObjTerminalAccess().getAISLSetParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AISLSet_0=ruleAISLSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AISLSet_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:1455:3: this_AISLRelation_1= ruleAISLRelation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAPolyObjTerminalAccess().getAISLRelationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AISLRelation_1=ruleAISLRelation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AISLRelation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:1464:3: this_ADeclaredObject_2= ruleADeclaredObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAPolyObjTerminalAccess().getADeclaredObjectParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ADeclaredObject_2=ruleADeclaredObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ADeclaredObject_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:1473:3: this_ARectangularDomain_3= ruleARectangularDomain
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAPolyObjTerminalAccess().getARectangularDomainParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ARectangularDomain_3=ruleARectangularDomain();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ARectangularDomain_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:1482:3: this_AVariableDomain_4= ruleAVariableDomain
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAPolyObjTerminalAccess().getAVariableDomainParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AVariableDomain_4=ruleAVariableDomain();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AVariableDomain_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:1491:3: (otherlv_5= '(' this_APolyhedralObjectExpression_6= ruleAPolyhedralObjectExpression otherlv_7= ')' )
                    {
                    // InternalAlpha.g:1491:3: (otherlv_5= '(' this_APolyhedralObjectExpression_6= ruleAPolyhedralObjectExpression otherlv_7= ')' )
                    // InternalAlpha.g:1492:4: otherlv_5= '(' this_APolyhedralObjectExpression_6= ruleAPolyhedralObjectExpression otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getAPolyObjTerminalAccess().getLeftParenthesisKeyword_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAPolyObjTerminalAccess().getAPolyhedralObjectExpressionParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_APolyhedralObjectExpression_6=ruleAPolyhedralObjectExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_APolyhedralObjectExpression_6;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_7=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getAPolyObjTerminalAccess().getRightParenthesisKeyword_5_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAPolyObjTerminal"


    // $ANTLR start "entryRuleAUnaryPolyObjExpression"
    // InternalAlpha.g:1513:1: entryRuleAUnaryPolyObjExpression returns [EObject current=null] : iv_ruleAUnaryPolyObjExpression= ruleAUnaryPolyObjExpression EOF ;
    public final EObject entryRuleAUnaryPolyObjExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAUnaryPolyObjExpression = null;


        try {
            // InternalAlpha.g:1513:64: (iv_ruleAUnaryPolyObjExpression= ruleAUnaryPolyObjExpression EOF )
            // InternalAlpha.g:1514:2: iv_ruleAUnaryPolyObjExpression= ruleAUnaryPolyObjExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAUnaryPolyObjExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAUnaryPolyObjExpression=ruleAUnaryPolyObjExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAUnaryPolyObjExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAUnaryPolyObjExpression"


    // $ANTLR start "ruleAUnaryPolyObjExpression"
    // InternalAlpha.g:1520:1: ruleAUnaryPolyObjExpression returns [EObject current=null] : ( ( ( (lv_op_0_1= 'domain' | lv_op_0_2= 'range' | lv_op_0_3= 'complement' | lv_op_0_4= 'poly-hull' | lv_op_0_5= 'affine-hull' | lv_op_0_6= 'reverse' ) ) ) ( (lv_expr_1_0= ruleAPolyObjTerminal ) ) ) ;
    public final EObject ruleAUnaryPolyObjExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        Token lv_op_0_3=null;
        Token lv_op_0_4=null;
        Token lv_op_0_5=null;
        Token lv_op_0_6=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1526:2: ( ( ( ( (lv_op_0_1= 'domain' | lv_op_0_2= 'range' | lv_op_0_3= 'complement' | lv_op_0_4= 'poly-hull' | lv_op_0_5= 'affine-hull' | lv_op_0_6= 'reverse' ) ) ) ( (lv_expr_1_0= ruleAPolyObjTerminal ) ) ) )
            // InternalAlpha.g:1527:2: ( ( ( (lv_op_0_1= 'domain' | lv_op_0_2= 'range' | lv_op_0_3= 'complement' | lv_op_0_4= 'poly-hull' | lv_op_0_5= 'affine-hull' | lv_op_0_6= 'reverse' ) ) ) ( (lv_expr_1_0= ruleAPolyObjTerminal ) ) )
            {
            // InternalAlpha.g:1527:2: ( ( ( (lv_op_0_1= 'domain' | lv_op_0_2= 'range' | lv_op_0_3= 'complement' | lv_op_0_4= 'poly-hull' | lv_op_0_5= 'affine-hull' | lv_op_0_6= 'reverse' ) ) ) ( (lv_expr_1_0= ruleAPolyObjTerminal ) ) )
            // InternalAlpha.g:1528:3: ( ( (lv_op_0_1= 'domain' | lv_op_0_2= 'range' | lv_op_0_3= 'complement' | lv_op_0_4= 'poly-hull' | lv_op_0_5= 'affine-hull' | lv_op_0_6= 'reverse' ) ) ) ( (lv_expr_1_0= ruleAPolyObjTerminal ) )
            {
            // InternalAlpha.g:1528:3: ( ( (lv_op_0_1= 'domain' | lv_op_0_2= 'range' | lv_op_0_3= 'complement' | lv_op_0_4= 'poly-hull' | lv_op_0_5= 'affine-hull' | lv_op_0_6= 'reverse' ) ) )
            // InternalAlpha.g:1529:4: ( (lv_op_0_1= 'domain' | lv_op_0_2= 'range' | lv_op_0_3= 'complement' | lv_op_0_4= 'poly-hull' | lv_op_0_5= 'affine-hull' | lv_op_0_6= 'reverse' ) )
            {
            // InternalAlpha.g:1529:4: ( (lv_op_0_1= 'domain' | lv_op_0_2= 'range' | lv_op_0_3= 'complement' | lv_op_0_4= 'poly-hull' | lv_op_0_5= 'affine-hull' | lv_op_0_6= 'reverse' ) )
            // InternalAlpha.g:1530:5: (lv_op_0_1= 'domain' | lv_op_0_2= 'range' | lv_op_0_3= 'complement' | lv_op_0_4= 'poly-hull' | lv_op_0_5= 'affine-hull' | lv_op_0_6= 'reverse' )
            {
            // InternalAlpha.g:1530:5: (lv_op_0_1= 'domain' | lv_op_0_2= 'range' | lv_op_0_3= 'complement' | lv_op_0_4= 'poly-hull' | lv_op_0_5= 'affine-hull' | lv_op_0_6= 'reverse' )
            int alt29=6;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt29=1;
                }
                break;
            case 59:
                {
                alt29=2;
                }
                break;
            case 60:
                {
                alt29=3;
                }
                break;
            case 61:
                {
                alt29=4;
                }
                break;
            case 62:
                {
                alt29=5;
                }
                break;
            case 63:
                {
                alt29=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalAlpha.g:1531:6: lv_op_0_1= 'domain'
                    {
                    lv_op_0_1=(Token)match(input,58,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_0_1, grammarAccess.getAUnaryPolyObjExpressionAccess().getOpDomainKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAUnaryPolyObjExpressionRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:1542:6: lv_op_0_2= 'range'
                    {
                    lv_op_0_2=(Token)match(input,59,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_0_2, grammarAccess.getAUnaryPolyObjExpressionAccess().getOpRangeKeyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAUnaryPolyObjExpressionRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_0_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:1553:6: lv_op_0_3= 'complement'
                    {
                    lv_op_0_3=(Token)match(input,60,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_0_3, grammarAccess.getAUnaryPolyObjExpressionAccess().getOpComplementKeyword_0_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAUnaryPolyObjExpressionRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_0_3, null);
                      					
                    }

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:1564:6: lv_op_0_4= 'poly-hull'
                    {
                    lv_op_0_4=(Token)match(input,61,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_0_4, grammarAccess.getAUnaryPolyObjExpressionAccess().getOpPolyHullKeyword_0_0_3());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAUnaryPolyObjExpressionRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_0_4, null);
                      					
                    }

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:1575:6: lv_op_0_5= 'affine-hull'
                    {
                    lv_op_0_5=(Token)match(input,62,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_0_5, grammarAccess.getAUnaryPolyObjExpressionAccess().getOpAffineHullKeyword_0_0_4());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAUnaryPolyObjExpressionRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_0_5, null);
                      					
                    }

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:1586:6: lv_op_0_6= 'reverse'
                    {
                    lv_op_0_6=(Token)match(input,63,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_0_6, grammarAccess.getAUnaryPolyObjExpressionAccess().getOpReverseKeyword_0_0_5());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAUnaryPolyObjExpressionRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_0_6, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalAlpha.g:1599:3: ( (lv_expr_1_0= ruleAPolyObjTerminal ) )
            // InternalAlpha.g:1600:4: (lv_expr_1_0= ruleAPolyObjTerminal )
            {
            // InternalAlpha.g:1600:4: (lv_expr_1_0= ruleAPolyObjTerminal )
            // InternalAlpha.g:1601:5: lv_expr_1_0= ruleAPolyObjTerminal
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAUnaryPolyObjExpressionAccess().getExprAPolyObjTerminalParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_1_0=ruleAPolyObjTerminal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAUnaryPolyObjExpressionRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"alpha.Alpha.APolyObjTerminal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAUnaryPolyObjExpression"


    // $ANTLR start "entryRuleAVariableDomain"
    // InternalAlpha.g:1622:1: entryRuleAVariableDomain returns [EObject current=null] : iv_ruleAVariableDomain= ruleAVariableDomain EOF ;
    public final EObject entryRuleAVariableDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAVariableDomain = null;


        try {
            // InternalAlpha.g:1622:56: (iv_ruleAVariableDomain= ruleAVariableDomain EOF )
            // InternalAlpha.g:1623:2: iv_ruleAVariableDomain= ruleAVariableDomain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAVariableDomainRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAVariableDomain=ruleAVariableDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAVariableDomain; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:1629:1: ruleAVariableDomain returns [EObject current=null] : (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' ) ;
    public final EObject ruleAVariableDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalAlpha.g:1635:2: ( (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' ) )
            // InternalAlpha.g:1636:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' )
            {
            // InternalAlpha.g:1636:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' )
            // InternalAlpha.g:1637:3: otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAVariableDomainAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAlpha.g:1641:3: ( (otherlv_1= RULE_ID ) )
            // InternalAlpha.g:1642:4: (otherlv_1= RULE_ID )
            {
            // InternalAlpha.g:1642:4: (otherlv_1= RULE_ID )
            // InternalAlpha.g:1643:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAVariableDomainRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getAVariableDomainAccess().getVarAVariableCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAVariableDomainAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleARectangularDomain"
    // InternalAlpha.g:1662:1: entryRuleARectangularDomain returns [EObject current=null] : iv_ruleARectangularDomain= ruleARectangularDomain EOF ;
    public final EObject entryRuleARectangularDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARectangularDomain = null;


        try {
            // InternalAlpha.g:1662:59: (iv_ruleARectangularDomain= ruleARectangularDomain EOF )
            // InternalAlpha.g:1663:2: iv_ruleARectangularDomain= ruleARectangularDomain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getARectangularDomainRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleARectangularDomain=ruleARectangularDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleARectangularDomain; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleARectangularDomain"


    // $ANTLR start "ruleARectangularDomain"
    // InternalAlpha.g:1669:1: ruleARectangularDomain returns [EObject current=null] : (otherlv_0= '[' ( (lv_dimensions_1_0= ruleAIndexList ) ) otherlv_2= ']' (otherlv_3= 'as' otherlv_4= '[' ( (lv_names_5_0= ruleAIndexList ) ) otherlv_6= ']' )? ) ;
    public final EObject ruleARectangularDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_dimensions_1_0 = null;

        AntlrDatatypeRuleToken lv_names_5_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1675:2: ( (otherlv_0= '[' ( (lv_dimensions_1_0= ruleAIndexList ) ) otherlv_2= ']' (otherlv_3= 'as' otherlv_4= '[' ( (lv_names_5_0= ruleAIndexList ) ) otherlv_6= ']' )? ) )
            // InternalAlpha.g:1676:2: (otherlv_0= '[' ( (lv_dimensions_1_0= ruleAIndexList ) ) otherlv_2= ']' (otherlv_3= 'as' otherlv_4= '[' ( (lv_names_5_0= ruleAIndexList ) ) otherlv_6= ']' )? )
            {
            // InternalAlpha.g:1676:2: (otherlv_0= '[' ( (lv_dimensions_1_0= ruleAIndexList ) ) otherlv_2= ']' (otherlv_3= 'as' otherlv_4= '[' ( (lv_names_5_0= ruleAIndexList ) ) otherlv_6= ']' )? )
            // InternalAlpha.g:1677:3: otherlv_0= '[' ( (lv_dimensions_1_0= ruleAIndexList ) ) otherlv_2= ']' (otherlv_3= 'as' otherlv_4= '[' ( (lv_names_5_0= ruleAIndexList ) ) otherlv_6= ']' )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getARectangularDomainAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalAlpha.g:1681:3: ( (lv_dimensions_1_0= ruleAIndexList ) )
            // InternalAlpha.g:1682:4: (lv_dimensions_1_0= ruleAIndexList )
            {
            // InternalAlpha.g:1682:4: (lv_dimensions_1_0= ruleAIndexList )
            // InternalAlpha.g:1683:5: lv_dimensions_1_0= ruleAIndexList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getARectangularDomainAccess().getDimensionsAIndexListParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_dimensions_1_0=ruleAIndexList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getARectangularDomainRule());
              					}
              					add(
              						current,
              						"dimensions",
              						lv_dimensions_1_0,
              						"alpha.Alpha.AIndexList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getARectangularDomainAccess().getRightSquareBracketKeyword_2());
              		
            }
            // InternalAlpha.g:1704:3: (otherlv_3= 'as' otherlv_4= '[' ( (lv_names_5_0= ruleAIndexList ) ) otherlv_6= ']' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==66) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAlpha.g:1705:4: otherlv_3= 'as' otherlv_4= '[' ( (lv_names_5_0= ruleAIndexList ) ) otherlv_6= ']'
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getARectangularDomainAccess().getAsKeyword_3_0());
                      			
                    }
                    otherlv_4=(Token)match(input,64,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getARectangularDomainAccess().getLeftSquareBracketKeyword_3_1());
                      			
                    }
                    // InternalAlpha.g:1713:4: ( (lv_names_5_0= ruleAIndexList ) )
                    // InternalAlpha.g:1714:5: (lv_names_5_0= ruleAIndexList )
                    {
                    // InternalAlpha.g:1714:5: (lv_names_5_0= ruleAIndexList )
                    // InternalAlpha.g:1715:6: lv_names_5_0= ruleAIndexList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getARectangularDomainAccess().getNamesAIndexListParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_33);
                    lv_names_5_0=ruleAIndexList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getARectangularDomainRule());
                      						}
                      						add(
                      							current,
                      							"names",
                      							lv_names_5_0,
                      							"alpha.Alpha.AIndexList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getARectangularDomainAccess().getRightSquareBracketKeyword_3_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleARectangularDomain"


    // $ANTLR start "entryRuleADeclaredObject"
    // InternalAlpha.g:1741:1: entryRuleADeclaredObject returns [EObject current=null] : iv_ruleADeclaredObject= ruleADeclaredObject EOF ;
    public final EObject entryRuleADeclaredObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADeclaredObject = null;


        try {
            // InternalAlpha.g:1741:56: (iv_ruleADeclaredObject= ruleADeclaredObject EOF )
            // InternalAlpha.g:1742:2: iv_ruleADeclaredObject= ruleADeclaredObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getADeclaredObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleADeclaredObject=ruleADeclaredObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleADeclaredObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleADeclaredObject"


    // $ANTLR start "ruleADeclaredObject"
    // InternalAlpha.g:1748:1: ruleADeclaredObject returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleADeclaredObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:1754:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalAlpha.g:1755:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalAlpha.g:1755:2: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:1756:3: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:1756:3: (otherlv_0= RULE_ID )
            // InternalAlpha.g:1757:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getADeclaredObjectRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getADeclaredObjectAccess().getObjectPolyhedralObjectCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleADeclaredObject"


    // $ANTLR start "entryRuleAISLSet"
    // InternalAlpha.g:1771:1: entryRuleAISLSet returns [EObject current=null] : iv_ruleAISLSet= ruleAISLSet EOF ;
    public final EObject entryRuleAISLSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAISLSet = null;


        try {
            // InternalAlpha.g:1771:48: (iv_ruleAISLSet= ruleAISLSet EOF )
            // InternalAlpha.g:1772:2: iv_ruleAISLSet= ruleAISLSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAISLSetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAISLSet=ruleAISLSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAISLSet; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:1778:1: ruleAISLSet returns [EObject current=null] : (otherlv_0= '{' ( (lv_sets_1_0= ruleAISLBasicSet ) ) (otherlv_2= ';' ( (lv_relations_3_0= ruleAISLBasicSet ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleAISLSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sets_1_0 = null;

        EObject lv_relations_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1784:2: ( (otherlv_0= '{' ( (lv_sets_1_0= ruleAISLBasicSet ) ) (otherlv_2= ';' ( (lv_relations_3_0= ruleAISLBasicSet ) ) )* otherlv_4= '}' ) )
            // InternalAlpha.g:1785:2: (otherlv_0= '{' ( (lv_sets_1_0= ruleAISLBasicSet ) ) (otherlv_2= ';' ( (lv_relations_3_0= ruleAISLBasicSet ) ) )* otherlv_4= '}' )
            {
            // InternalAlpha.g:1785:2: (otherlv_0= '{' ( (lv_sets_1_0= ruleAISLBasicSet ) ) (otherlv_2= ';' ( (lv_relations_3_0= ruleAISLBasicSet ) ) )* otherlv_4= '}' )
            // InternalAlpha.g:1786:3: otherlv_0= '{' ( (lv_sets_1_0= ruleAISLBasicSet ) ) (otherlv_2= ';' ( (lv_relations_3_0= ruleAISLBasicSet ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAISLSetAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAlpha.g:1790:3: ( (lv_sets_1_0= ruleAISLBasicSet ) )
            // InternalAlpha.g:1791:4: (lv_sets_1_0= ruleAISLBasicSet )
            {
            // InternalAlpha.g:1791:4: (lv_sets_1_0= ruleAISLBasicSet )
            // InternalAlpha.g:1792:5: lv_sets_1_0= ruleAISLBasicSet
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAISLSetAccess().getSetsAISLBasicSetParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_sets_1_0=ruleAISLBasicSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAISLSetRule());
              					}
              					add(
              						current,
              						"sets",
              						lv_sets_1_0,
              						"alpha.Alpha.AISLBasicSet");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAlpha.g:1809:3: (otherlv_2= ';' ( (lv_relations_3_0= ruleAISLBasicSet ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==67) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAlpha.g:1810:4: otherlv_2= ';' ( (lv_relations_3_0= ruleAISLBasicSet ) )
            	    {
            	    otherlv_2=(Token)match(input,67,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAISLSetAccess().getSemicolonKeyword_2_0());
            	      			
            	    }
            	    // InternalAlpha.g:1814:4: ( (lv_relations_3_0= ruleAISLBasicSet ) )
            	    // InternalAlpha.g:1815:5: (lv_relations_3_0= ruleAISLBasicSet )
            	    {
            	    // InternalAlpha.g:1815:5: (lv_relations_3_0= ruleAISLBasicSet )
            	    // InternalAlpha.g:1816:6: lv_relations_3_0= ruleAISLBasicSet
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAISLSetAccess().getRelationsAISLBasicSetParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_relations_3_0=ruleAISLBasicSet();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAISLSetRule());
            	      						}
            	      						add(
            	      							current,
            	      							"relations",
            	      							lv_relations_3_0,
            	      							"alpha.Alpha.AISLBasicSet");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_4=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAISLSetAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:1842:1: entryRuleAISLBasicSet returns [EObject current=null] : iv_ruleAISLBasicSet= ruleAISLBasicSet EOF ;
    public final EObject entryRuleAISLBasicSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAISLBasicSet = null;


        try {
            // InternalAlpha.g:1842:53: (iv_ruleAISLBasicSet= ruleAISLBasicSet EOF )
            // InternalAlpha.g:1843:2: iv_ruleAISLBasicSet= ruleAISLBasicSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAISLBasicSetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAISLBasicSet=ruleAISLBasicSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAISLBasicSet; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:1849:1: ruleAISLBasicSet returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_dims_1_0= ruleAIndexList ) ) otherlv_2= ']' )? otherlv_3= ':' ( (lv_constraintString_4_0= ruleISLString ) ) ) ;
    public final EObject ruleAISLBasicSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_dims_1_0 = null;

        AntlrDatatypeRuleToken lv_constraintString_4_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1855:2: ( ( (otherlv_0= '[' ( (lv_dims_1_0= ruleAIndexList ) ) otherlv_2= ']' )? otherlv_3= ':' ( (lv_constraintString_4_0= ruleISLString ) ) ) )
            // InternalAlpha.g:1856:2: ( (otherlv_0= '[' ( (lv_dims_1_0= ruleAIndexList ) ) otherlv_2= ']' )? otherlv_3= ':' ( (lv_constraintString_4_0= ruleISLString ) ) )
            {
            // InternalAlpha.g:1856:2: ( (otherlv_0= '[' ( (lv_dims_1_0= ruleAIndexList ) ) otherlv_2= ']' )? otherlv_3= ':' ( (lv_constraintString_4_0= ruleISLString ) ) )
            // InternalAlpha.g:1857:3: (otherlv_0= '[' ( (lv_dims_1_0= ruleAIndexList ) ) otherlv_2= ']' )? otherlv_3= ':' ( (lv_constraintString_4_0= ruleISLString ) )
            {
            // InternalAlpha.g:1857:3: (otherlv_0= '[' ( (lv_dims_1_0= ruleAIndexList ) ) otherlv_2= ']' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==64) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAlpha.g:1858:4: otherlv_0= '[' ( (lv_dims_1_0= ruleAIndexList ) ) otherlv_2= ']'
                    {
                    otherlv_0=(Token)match(input,64,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getAISLBasicSetAccess().getLeftSquareBracketKeyword_0_0());
                      			
                    }
                    // InternalAlpha.g:1862:4: ( (lv_dims_1_0= ruleAIndexList ) )
                    // InternalAlpha.g:1863:5: (lv_dims_1_0= ruleAIndexList )
                    {
                    // InternalAlpha.g:1863:5: (lv_dims_1_0= ruleAIndexList )
                    // InternalAlpha.g:1864:6: lv_dims_1_0= ruleAIndexList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAISLBasicSetAccess().getDimsAIndexListParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_33);
                    lv_dims_1_0=ruleAIndexList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAISLBasicSetRule());
                      						}
                      						set(
                      							current,
                      							"dims",
                      							lv_dims_1_0,
                      							"alpha.Alpha.AIndexList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,65,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAISLBasicSetAccess().getRightSquareBracketKeyword_0_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,50,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAISLBasicSetAccess().getColonKeyword_1());
              		
            }
            // InternalAlpha.g:1890:3: ( (lv_constraintString_4_0= ruleISLString ) )
            // InternalAlpha.g:1891:4: (lv_constraintString_4_0= ruleISLString )
            {
            // InternalAlpha.g:1891:4: (lv_constraintString_4_0= ruleISLString )
            // InternalAlpha.g:1892:5: lv_constraintString_4_0= ruleISLString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAISLBasicSetAccess().getConstraintStringISLStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_constraintString_4_0=ruleISLString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAISLBasicSetRule());
              					}
              					set(
              						current,
              						"constraintString",
              						lv_constraintString_4_0,
              						"alpha.Alpha.ISLString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:1913:1: entryRuleAISLRelation returns [EObject current=null] : iv_ruleAISLRelation= ruleAISLRelation EOF ;
    public final EObject entryRuleAISLRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAISLRelation = null;


        try {
            // InternalAlpha.g:1913:53: (iv_ruleAISLRelation= ruleAISLRelation EOF )
            // InternalAlpha.g:1914:2: iv_ruleAISLRelation= ruleAISLRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAISLRelationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAISLRelation=ruleAISLRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAISLRelation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:1920:1: ruleAISLRelation returns [EObject current=null] : (otherlv_0= '{' ( (lv_relations_1_0= ruleAISLBasicRelation ) ) (otherlv_2= ';' ( (lv_relations_3_0= ruleAISLBasicRelation ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleAISLRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_relations_1_0 = null;

        EObject lv_relations_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1926:2: ( (otherlv_0= '{' ( (lv_relations_1_0= ruleAISLBasicRelation ) ) (otherlv_2= ';' ( (lv_relations_3_0= ruleAISLBasicRelation ) ) )* otherlv_4= '}' ) )
            // InternalAlpha.g:1927:2: (otherlv_0= '{' ( (lv_relations_1_0= ruleAISLBasicRelation ) ) (otherlv_2= ';' ( (lv_relations_3_0= ruleAISLBasicRelation ) ) )* otherlv_4= '}' )
            {
            // InternalAlpha.g:1927:2: (otherlv_0= '{' ( (lv_relations_1_0= ruleAISLBasicRelation ) ) (otherlv_2= ';' ( (lv_relations_3_0= ruleAISLBasicRelation ) ) )* otherlv_4= '}' )
            // InternalAlpha.g:1928:3: otherlv_0= '{' ( (lv_relations_1_0= ruleAISLBasicRelation ) ) (otherlv_2= ';' ( (lv_relations_3_0= ruleAISLBasicRelation ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAISLRelationAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAlpha.g:1932:3: ( (lv_relations_1_0= ruleAISLBasicRelation ) )
            // InternalAlpha.g:1933:4: (lv_relations_1_0= ruleAISLBasicRelation )
            {
            // InternalAlpha.g:1933:4: (lv_relations_1_0= ruleAISLBasicRelation )
            // InternalAlpha.g:1934:5: lv_relations_1_0= ruleAISLBasicRelation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAISLRelationAccess().getRelationsAISLBasicRelationParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_relations_1_0=ruleAISLBasicRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAISLRelationRule());
              					}
              					add(
              						current,
              						"relations",
              						lv_relations_1_0,
              						"alpha.Alpha.AISLBasicRelation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAlpha.g:1951:3: (otherlv_2= ';' ( (lv_relations_3_0= ruleAISLBasicRelation ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==67) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAlpha.g:1952:4: otherlv_2= ';' ( (lv_relations_3_0= ruleAISLBasicRelation ) )
            	    {
            	    otherlv_2=(Token)match(input,67,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAISLRelationAccess().getSemicolonKeyword_2_0());
            	      			
            	    }
            	    // InternalAlpha.g:1956:4: ( (lv_relations_3_0= ruleAISLBasicRelation ) )
            	    // InternalAlpha.g:1957:5: (lv_relations_3_0= ruleAISLBasicRelation )
            	    {
            	    // InternalAlpha.g:1957:5: (lv_relations_3_0= ruleAISLBasicRelation )
            	    // InternalAlpha.g:1958:6: lv_relations_3_0= ruleAISLBasicRelation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAISLRelationAccess().getRelationsAISLBasicRelationParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_relations_3_0=ruleAISLBasicRelation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAISLRelationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"relations",
            	      							lv_relations_3_0,
            	      							"alpha.Alpha.AISLBasicRelation");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_4=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAISLRelationAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:1984:1: entryRuleAISLBasicRelation returns [EObject current=null] : iv_ruleAISLBasicRelation= ruleAISLBasicRelation EOF ;
    public final EObject entryRuleAISLBasicRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAISLBasicRelation = null;


        try {
            // InternalAlpha.g:1984:58: (iv_ruleAISLBasicRelation= ruleAISLBasicRelation EOF )
            // InternalAlpha.g:1985:2: iv_ruleAISLBasicRelation= ruleAISLBasicRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAISLBasicRelationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAISLBasicRelation=ruleAISLBasicRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAISLBasicRelation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:1991:1: ruleAISLBasicRelation returns [EObject current=null] : (otherlv_0= '[' ( (lv_inDims_1_0= ruleAIndexList ) ) otherlv_2= ']' otherlv_3= '->' otherlv_4= '[' ( (lv_outDims_5_0= ruleAIndexList ) ) otherlv_6= ']' otherlv_7= ':' ( (lv_constraintStr_8_0= ruleISLString ) ) ) ;
    public final EObject ruleAISLBasicRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_inDims_1_0 = null;

        AntlrDatatypeRuleToken lv_outDims_5_0 = null;

        AntlrDatatypeRuleToken lv_constraintStr_8_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:1997:2: ( (otherlv_0= '[' ( (lv_inDims_1_0= ruleAIndexList ) ) otherlv_2= ']' otherlv_3= '->' otherlv_4= '[' ( (lv_outDims_5_0= ruleAIndexList ) ) otherlv_6= ']' otherlv_7= ':' ( (lv_constraintStr_8_0= ruleISLString ) ) ) )
            // InternalAlpha.g:1998:2: (otherlv_0= '[' ( (lv_inDims_1_0= ruleAIndexList ) ) otherlv_2= ']' otherlv_3= '->' otherlv_4= '[' ( (lv_outDims_5_0= ruleAIndexList ) ) otherlv_6= ']' otherlv_7= ':' ( (lv_constraintStr_8_0= ruleISLString ) ) )
            {
            // InternalAlpha.g:1998:2: (otherlv_0= '[' ( (lv_inDims_1_0= ruleAIndexList ) ) otherlv_2= ']' otherlv_3= '->' otherlv_4= '[' ( (lv_outDims_5_0= ruleAIndexList ) ) otherlv_6= ']' otherlv_7= ':' ( (lv_constraintStr_8_0= ruleISLString ) ) )
            // InternalAlpha.g:1999:3: otherlv_0= '[' ( (lv_inDims_1_0= ruleAIndexList ) ) otherlv_2= ']' otherlv_3= '->' otherlv_4= '[' ( (lv_outDims_5_0= ruleAIndexList ) ) otherlv_6= ']' otherlv_7= ':' ( (lv_constraintStr_8_0= ruleISLString ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAISLBasicRelationAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalAlpha.g:2003:3: ( (lv_inDims_1_0= ruleAIndexList ) )
            // InternalAlpha.g:2004:4: (lv_inDims_1_0= ruleAIndexList )
            {
            // InternalAlpha.g:2004:4: (lv_inDims_1_0= ruleAIndexList )
            // InternalAlpha.g:2005:5: lv_inDims_1_0= ruleAIndexList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAISLBasicRelationAccess().getInDimsAIndexListParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_inDims_1_0=ruleAIndexList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAISLBasicRelationRule());
              					}
              					set(
              						current,
              						"inDims",
              						lv_inDims_1_0,
              						"alpha.Alpha.AIndexList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAISLBasicRelationAccess().getRightSquareBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,68,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAISLBasicRelationAccess().getHyphenMinusGreaterThanSignKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,64,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAISLBasicRelationAccess().getLeftSquareBracketKeyword_4());
              		
            }
            // InternalAlpha.g:2034:3: ( (lv_outDims_5_0= ruleAIndexList ) )
            // InternalAlpha.g:2035:4: (lv_outDims_5_0= ruleAIndexList )
            {
            // InternalAlpha.g:2035:4: (lv_outDims_5_0= ruleAIndexList )
            // InternalAlpha.g:2036:5: lv_outDims_5_0= ruleAIndexList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAISLBasicRelationAccess().getOutDimsAIndexListParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_outDims_5_0=ruleAIndexList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAISLBasicRelationRule());
              					}
              					set(
              						current,
              						"outDims",
              						lv_outDims_5_0,
              						"alpha.Alpha.AIndexList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,65,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getAISLBasicRelationAccess().getRightSquareBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,50,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getAISLBasicRelationAccess().getColonKeyword_7());
              		
            }
            // InternalAlpha.g:2061:3: ( (lv_constraintStr_8_0= ruleISLString ) )
            // InternalAlpha.g:2062:4: (lv_constraintStr_8_0= ruleISLString )
            {
            // InternalAlpha.g:2062:4: (lv_constraintStr_8_0= ruleISLString )
            // InternalAlpha.g:2063:5: lv_constraintStr_8_0= ruleISLString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAISLBasicRelationAccess().getConstraintStrISLStringParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_constraintStr_8_0=ruleISLString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAISLBasicRelationRule());
              					}
              					set(
              						current,
              						"constraintStr",
              						lv_constraintStr_8_0,
              						"alpha.Alpha.ISLString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleAParamDomain"
    // InternalAlpha.g:2084:1: entryRuleAParamDomain returns [String current=null] : iv_ruleAParamDomain= ruleAParamDomain EOF ;
    public final String entryRuleAParamDomain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAParamDomain = null;


        try {
            // InternalAlpha.g:2084:52: (iv_ruleAParamDomain= ruleAParamDomain EOF )
            // InternalAlpha.g:2085:2: iv_ruleAParamDomain= ruleAParamDomain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAParamDomainRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAParamDomain=ruleAParamDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAParamDomain.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:2091:1: ruleAParamDomain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_ISLString_6= ruleISLString kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleAParamDomain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AIndexList_1 = null;

        AntlrDatatypeRuleToken this_ISLString_6 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2097:2: ( (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_ISLString_6= ruleISLString kw= '}' ) )
            // InternalAlpha.g:2098:2: (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_ISLString_6= ruleISLString kw= '}' )
            {
            // InternalAlpha.g:2098:2: (kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_ISLString_6= ruleISLString kw= '}' )
            // InternalAlpha.g:2099:3: kw= '[' this_AIndexList_1= ruleAIndexList kw= ']' kw= '->' kw= '{' kw= ':' this_ISLString_6= ruleISLString kw= '}'
            {
            kw=(Token)match(input,64,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getLeftSquareBracketKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAParamDomainAccess().getAIndexListParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_33);
            this_AIndexList_1=ruleAIndexList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_AIndexList_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,65,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getRightSquareBracketKeyword_2());
              		
            }
            kw=(Token)match(input,68,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getHyphenMinusGreaterThanSignKeyword_3());
              		
            }
            kw=(Token)match(input,33,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            kw=(Token)match(input,50,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getColonKeyword_5());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAParamDomainAccess().getISLStringParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_31);
            this_ISLString_6=ruleISLString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ISLString_6);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getAParamDomainAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleISLString"
    // InternalAlpha.g:2153:1: entryRuleISLString returns [String current=null] : iv_ruleISLString= ruleISLString EOF ;
    public final String entryRuleISLString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleISLString = null;


        try {
            // InternalAlpha.g:2153:49: (iv_ruleISLString= ruleISLString EOF )
            // InternalAlpha.g:2154:2: iv_ruleISLString= ruleISLString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getISLStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleISLString=ruleISLString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleISLString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:2160:1: ruleISLString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | this_OP_PLUS_2= RULE_OP_PLUS | this_OP_MINUS_3= RULE_OP_MINUS | this_OP_MUL_4= RULE_OP_MUL | this_OP_DIV_5= RULE_OP_DIV | this_OP_MOD_6= RULE_OP_MOD | this_OP_AND_7= RULE_OP_AND | this_OP_OR_8= RULE_OP_OR | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | this_INTERSECTION_15= RULE_INTERSECTION | this_UNION_16= RULE_UNION | this_WS_17= RULE_WS | this_RELATIONAL_OP_18= ruleRELATIONAL_OP )* ;
    public final AntlrDatatypeRuleToken ruleISLString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token this_OP_PLUS_2=null;
        Token this_OP_MINUS_3=null;
        Token this_OP_MUL_4=null;
        Token this_OP_DIV_5=null;
        Token this_OP_MOD_6=null;
        Token this_OP_AND_7=null;
        Token this_OP_OR_8=null;
        Token kw=null;
        Token this_INTERSECTION_15=null;
        Token this_UNION_16=null;
        Token this_WS_17=null;
        AntlrDatatypeRuleToken this_IndexName_0 = null;

        AntlrDatatypeRuleToken this_RELATIONAL_OP_18 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2166:2: ( (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | this_OP_PLUS_2= RULE_OP_PLUS | this_OP_MINUS_3= RULE_OP_MINUS | this_OP_MUL_4= RULE_OP_MUL | this_OP_DIV_5= RULE_OP_DIV | this_OP_MOD_6= RULE_OP_MOD | this_OP_AND_7= RULE_OP_AND | this_OP_OR_8= RULE_OP_OR | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | this_INTERSECTION_15= RULE_INTERSECTION | this_UNION_16= RULE_UNION | this_WS_17= RULE_WS | this_RELATIONAL_OP_18= ruleRELATIONAL_OP )* )
            // InternalAlpha.g:2167:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | this_OP_PLUS_2= RULE_OP_PLUS | this_OP_MINUS_3= RULE_OP_MINUS | this_OP_MUL_4= RULE_OP_MUL | this_OP_DIV_5= RULE_OP_DIV | this_OP_MOD_6= RULE_OP_MOD | this_OP_AND_7= RULE_OP_AND | this_OP_OR_8= RULE_OP_OR | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | this_INTERSECTION_15= RULE_INTERSECTION | this_UNION_16= RULE_UNION | this_WS_17= RULE_WS | this_RELATIONAL_OP_18= ruleRELATIONAL_OP )*
            {
            // InternalAlpha.g:2167:2: (this_IndexName_0= ruleIndexName | this_INT_1= RULE_INT | this_OP_PLUS_2= RULE_OP_PLUS | this_OP_MINUS_3= RULE_OP_MINUS | this_OP_MUL_4= RULE_OP_MUL | this_OP_DIV_5= RULE_OP_DIV | this_OP_MOD_6= RULE_OP_MOD | this_OP_AND_7= RULE_OP_AND | this_OP_OR_8= RULE_OP_OR | kw= '[' | kw= ']' | kw= '(' | kw= ')' | kw= ',' | kw= ':' | this_INTERSECTION_15= RULE_INTERSECTION | this_UNION_16= RULE_UNION | this_WS_17= RULE_WS | this_RELATIONAL_OP_18= ruleRELATIONAL_OP )*
            loop34:
            do {
                int alt34=20;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt34=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt34=2;
                    }
                    break;
                case RULE_OP_PLUS:
                    {
                    alt34=3;
                    }
                    break;
                case RULE_OP_MINUS:
                    {
                    alt34=4;
                    }
                    break;
                case RULE_OP_MUL:
                    {
                    alt34=5;
                    }
                    break;
                case RULE_OP_DIV:
                    {
                    alt34=6;
                    }
                    break;
                case RULE_OP_MOD:
                    {
                    alt34=7;
                    }
                    break;
                case RULE_OP_AND:
                    {
                    alt34=8;
                    }
                    break;
                case RULE_OP_OR:
                    {
                    alt34=9;
                    }
                    break;
                case 64:
                    {
                    alt34=10;
                    }
                    break;
                case 65:
                    {
                    alt34=11;
                    }
                    break;
                case 38:
                    {
                    alt34=12;
                    }
                    break;
                case 39:
                    {
                    alt34=13;
                    }
                    break;
                case 51:
                    {
                    alt34=14;
                    }
                    break;
                case 50:
                    {
                    alt34=15;
                    }
                    break;
                case RULE_INTERSECTION:
                    {
                    alt34=16;
                    }
                    break;
                case RULE_UNION:
                    {
                    alt34=17;
                    }
                    break;
                case RULE_WS:
                    {
                    alt34=18;
                    }
                    break;
                case RULE_OP_EQ:
                case RULE_OP_GE:
                case RULE_OP_GT:
                case RULE_OP_LE:
                case RULE_OP_LT:
                case RULE_OP_NE:
                    {
                    alt34=19;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // InternalAlpha.g:2168:3: this_IndexName_0= ruleIndexName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getISLStringAccess().getIndexNameParserRuleCall_0());
            	      		
            	    }
            	    pushFollow(FOLLOW_40);
            	    this_IndexName_0=ruleIndexName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_IndexName_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalAlpha.g:2179:3: this_INT_1= RULE_INT
            	    {
            	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_INT_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_INT_1, grammarAccess.getISLStringAccess().getINTTerminalRuleCall_1());
            	      		
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalAlpha.g:2187:3: this_OP_PLUS_2= RULE_OP_PLUS
            	    {
            	    this_OP_PLUS_2=(Token)match(input,RULE_OP_PLUS,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_OP_PLUS_2);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_OP_PLUS_2, grammarAccess.getISLStringAccess().getOP_PLUSTerminalRuleCall_2());
            	      		
            	    }

            	    }
            	    break;
            	case 4 :
            	    // InternalAlpha.g:2195:3: this_OP_MINUS_3= RULE_OP_MINUS
            	    {
            	    this_OP_MINUS_3=(Token)match(input,RULE_OP_MINUS,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_OP_MINUS_3);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_OP_MINUS_3, grammarAccess.getISLStringAccess().getOP_MINUSTerminalRuleCall_3());
            	      		
            	    }

            	    }
            	    break;
            	case 5 :
            	    // InternalAlpha.g:2203:3: this_OP_MUL_4= RULE_OP_MUL
            	    {
            	    this_OP_MUL_4=(Token)match(input,RULE_OP_MUL,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_OP_MUL_4);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_OP_MUL_4, grammarAccess.getISLStringAccess().getOP_MULTerminalRuleCall_4());
            	      		
            	    }

            	    }
            	    break;
            	case 6 :
            	    // InternalAlpha.g:2211:3: this_OP_DIV_5= RULE_OP_DIV
            	    {
            	    this_OP_DIV_5=(Token)match(input,RULE_OP_DIV,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_OP_DIV_5);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_OP_DIV_5, grammarAccess.getISLStringAccess().getOP_DIVTerminalRuleCall_5());
            	      		
            	    }

            	    }
            	    break;
            	case 7 :
            	    // InternalAlpha.g:2219:3: this_OP_MOD_6= RULE_OP_MOD
            	    {
            	    this_OP_MOD_6=(Token)match(input,RULE_OP_MOD,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_OP_MOD_6);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_OP_MOD_6, grammarAccess.getISLStringAccess().getOP_MODTerminalRuleCall_6());
            	      		
            	    }

            	    }
            	    break;
            	case 8 :
            	    // InternalAlpha.g:2227:3: this_OP_AND_7= RULE_OP_AND
            	    {
            	    this_OP_AND_7=(Token)match(input,RULE_OP_AND,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_OP_AND_7);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_OP_AND_7, grammarAccess.getISLStringAccess().getOP_ANDTerminalRuleCall_7());
            	      		
            	    }

            	    }
            	    break;
            	case 9 :
            	    // InternalAlpha.g:2235:3: this_OP_OR_8= RULE_OP_OR
            	    {
            	    this_OP_OR_8=(Token)match(input,RULE_OP_OR,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_OP_OR_8);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_OP_OR_8, grammarAccess.getISLStringAccess().getOP_ORTerminalRuleCall_8());
            	      		
            	    }

            	    }
            	    break;
            	case 10 :
            	    // InternalAlpha.g:2243:3: kw= '['
            	    {
            	    kw=(Token)match(input,64,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getISLStringAccess().getLeftSquareBracketKeyword_9());
            	      		
            	    }

            	    }
            	    break;
            	case 11 :
            	    // InternalAlpha.g:2249:3: kw= ']'
            	    {
            	    kw=(Token)match(input,65,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getISLStringAccess().getRightSquareBracketKeyword_10());
            	      		
            	    }

            	    }
            	    break;
            	case 12 :
            	    // InternalAlpha.g:2255:3: kw= '('
            	    {
            	    kw=(Token)match(input,38,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getISLStringAccess().getLeftParenthesisKeyword_11());
            	      		
            	    }

            	    }
            	    break;
            	case 13 :
            	    // InternalAlpha.g:2261:3: kw= ')'
            	    {
            	    kw=(Token)match(input,39,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getISLStringAccess().getRightParenthesisKeyword_12());
            	      		
            	    }

            	    }
            	    break;
            	case 14 :
            	    // InternalAlpha.g:2267:3: kw= ','
            	    {
            	    kw=(Token)match(input,51,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getISLStringAccess().getCommaKeyword_13());
            	      		
            	    }

            	    }
            	    break;
            	case 15 :
            	    // InternalAlpha.g:2273:3: kw= ':'
            	    {
            	    kw=(Token)match(input,50,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getISLStringAccess().getColonKeyword_14());
            	      		
            	    }

            	    }
            	    break;
            	case 16 :
            	    // InternalAlpha.g:2279:3: this_INTERSECTION_15= RULE_INTERSECTION
            	    {
            	    this_INTERSECTION_15=(Token)match(input,RULE_INTERSECTION,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_INTERSECTION_15);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_INTERSECTION_15, grammarAccess.getISLStringAccess().getINTERSECTIONTerminalRuleCall_15());
            	      		
            	    }

            	    }
            	    break;
            	case 17 :
            	    // InternalAlpha.g:2287:3: this_UNION_16= RULE_UNION
            	    {
            	    this_UNION_16=(Token)match(input,RULE_UNION,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_UNION_16);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_UNION_16, grammarAccess.getISLStringAccess().getUNIONTerminalRuleCall_16());
            	      		
            	    }

            	    }
            	    break;
            	case 18 :
            	    // InternalAlpha.g:2295:3: this_WS_17= RULE_WS
            	    {
            	    this_WS_17=(Token)match(input,RULE_WS,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_WS_17);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_WS_17, grammarAccess.getISLStringAccess().getWSTerminalRuleCall_17());
            	      		
            	    }

            	    }
            	    break;
            	case 19 :
            	    // InternalAlpha.g:2303:3: this_RELATIONAL_OP_18= ruleRELATIONAL_OP
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getISLStringAccess().getRELATIONAL_OPParserRuleCall_18());
            	      		
            	    }
            	    pushFollow(FOLLOW_40);
            	    this_RELATIONAL_OP_18=ruleRELATIONAL_OP();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_RELATIONAL_OP_18);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:2317:1: entryRuleAEquation returns [EObject current=null] : iv_ruleAEquation= ruleAEquation EOF ;
    public final EObject entryRuleAEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAEquation = null;


        try {
            // InternalAlpha.g:2317:50: (iv_ruleAEquation= ruleAEquation EOF )
            // InternalAlpha.g:2318:2: iv_ruleAEquation= ruleAEquation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAEquationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAEquation=ruleAEquation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAEquation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:2324:1: ruleAEquation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= ruleAIndexList ) ) otherlv_3= ']' )? this_OP_EQ_4= RULE_OP_EQ ( (lv_expr_5_0= ruleAAlphaExpression ) ) otherlv_6= ';' ) ;
    public final EObject ruleAEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_OP_EQ_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_indexes_2_0 = null;

        EObject lv_expr_5_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2330:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= ruleAIndexList ) ) otherlv_3= ']' )? this_OP_EQ_4= RULE_OP_EQ ( (lv_expr_5_0= ruleAAlphaExpression ) ) otherlv_6= ';' ) )
            // InternalAlpha.g:2331:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= ruleAIndexList ) ) otherlv_3= ']' )? this_OP_EQ_4= RULE_OP_EQ ( (lv_expr_5_0= ruleAAlphaExpression ) ) otherlv_6= ';' )
            {
            // InternalAlpha.g:2331:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= ruleAIndexList ) ) otherlv_3= ']' )? this_OP_EQ_4= RULE_OP_EQ ( (lv_expr_5_0= ruleAAlphaExpression ) ) otherlv_6= ';' )
            // InternalAlpha.g:2332:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= ruleAIndexList ) ) otherlv_3= ']' )? this_OP_EQ_4= RULE_OP_EQ ( (lv_expr_5_0= ruleAAlphaExpression ) ) otherlv_6= ';'
            {
            // InternalAlpha.g:2332:3: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:2333:4: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:2333:4: (otherlv_0= RULE_ID )
            // InternalAlpha.g:2334:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAEquationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getAEquationAccess().getVarAVariableCrossReference_0_0());
              				
            }

            }


            }

            // InternalAlpha.g:2345:3: (otherlv_1= '[' ( (lv_indexes_2_0= ruleAIndexList ) ) otherlv_3= ']' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==64) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAlpha.g:2346:4: otherlv_1= '[' ( (lv_indexes_2_0= ruleAIndexList ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getAEquationAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalAlpha.g:2350:4: ( (lv_indexes_2_0= ruleAIndexList ) )
                    // InternalAlpha.g:2351:5: (lv_indexes_2_0= ruleAIndexList )
                    {
                    // InternalAlpha.g:2351:5: (lv_indexes_2_0= ruleAIndexList )
                    // InternalAlpha.g:2352:6: lv_indexes_2_0= ruleAIndexList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAEquationAccess().getIndexesAIndexListParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_33);
                    lv_indexes_2_0=ruleAIndexList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_3=(Token)match(input,65,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAEquationAccess().getRightSquareBracketKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            this_OP_EQ_4=(Token)match(input,RULE_OP_EQ,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OP_EQ_4, grammarAccess.getAEquationAccess().getOP_EQTerminalRuleCall_2());
              		
            }
            // InternalAlpha.g:2378:3: ( (lv_expr_5_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:2379:4: (lv_expr_5_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:2379:4: (lv_expr_5_0= ruleAAlphaExpression )
            // InternalAlpha.g:2380:5: lv_expr_5_0= ruleAAlphaExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAEquationAccess().getExprAAlphaExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_42);
            lv_expr_5_0=ruleAAlphaExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_6=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getAEquationAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:2405:1: entryRuleAUseEquation returns [EObject current=null] : iv_ruleAUseEquation= ruleAUseEquation EOF ;
    public final EObject entryRuleAUseEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAUseEquation = null;


        try {
            // InternalAlpha.g:2405:53: (iv_ruleAUseEquation= ruleAUseEquation EOF )
            // InternalAlpha.g:2406:2: iv_ruleAUseEquation= ruleAUseEquation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAUseEquationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAUseEquation=ruleAUseEquation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAUseEquation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:2412:1: ruleAUseEquation returns [EObject current=null] : ( (otherlv_0= 'over' ( (lv_instantiationDomain_1_0= ruleAPolyhedralObjectExpression ) ) (otherlv_2= 'with' otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleAIndexList ) ) otherlv_5= ']' )? otherlv_6= ':' )? otherlv_7= '(' ( ( (lv_outputExprs_8_0= ruleAAlphaExpression ) ) (otherlv_9= ',' ( (lv_outputExprs_10_0= ruleAAlphaExpression ) ) )* )? otherlv_11= ')' this_OP_EQ_12= RULE_OP_EQ ( (otherlv_13= RULE_ID ) ) otherlv_14= '[' ( (lv_callParams_15_0= ruleAIndexAffineExpressionList ) ) otherlv_16= ']' otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' ) ;
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

        AntlrDatatypeRuleToken lv_subsystemDims_4_0 = null;

        EObject lv_outputExprs_8_0 = null;

        EObject lv_outputExprs_10_0 = null;

        EObject lv_callParams_15_0 = null;

        EObject lv_inputExprs_18_0 = null;

        EObject lv_inputExprs_20_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2418:2: ( ( (otherlv_0= 'over' ( (lv_instantiationDomain_1_0= ruleAPolyhedralObjectExpression ) ) (otherlv_2= 'with' otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleAIndexList ) ) otherlv_5= ']' )? otherlv_6= ':' )? otherlv_7= '(' ( ( (lv_outputExprs_8_0= ruleAAlphaExpression ) ) (otherlv_9= ',' ( (lv_outputExprs_10_0= ruleAAlphaExpression ) ) )* )? otherlv_11= ')' this_OP_EQ_12= RULE_OP_EQ ( (otherlv_13= RULE_ID ) ) otherlv_14= '[' ( (lv_callParams_15_0= ruleAIndexAffineExpressionList ) ) otherlv_16= ']' otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' ) )
            // InternalAlpha.g:2419:2: ( (otherlv_0= 'over' ( (lv_instantiationDomain_1_0= ruleAPolyhedralObjectExpression ) ) (otherlv_2= 'with' otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleAIndexList ) ) otherlv_5= ']' )? otherlv_6= ':' )? otherlv_7= '(' ( ( (lv_outputExprs_8_0= ruleAAlphaExpression ) ) (otherlv_9= ',' ( (lv_outputExprs_10_0= ruleAAlphaExpression ) ) )* )? otherlv_11= ')' this_OP_EQ_12= RULE_OP_EQ ( (otherlv_13= RULE_ID ) ) otherlv_14= '[' ( (lv_callParams_15_0= ruleAIndexAffineExpressionList ) ) otherlv_16= ']' otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' )
            {
            // InternalAlpha.g:2419:2: ( (otherlv_0= 'over' ( (lv_instantiationDomain_1_0= ruleAPolyhedralObjectExpression ) ) (otherlv_2= 'with' otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleAIndexList ) ) otherlv_5= ']' )? otherlv_6= ':' )? otherlv_7= '(' ( ( (lv_outputExprs_8_0= ruleAAlphaExpression ) ) (otherlv_9= ',' ( (lv_outputExprs_10_0= ruleAAlphaExpression ) ) )* )? otherlv_11= ')' this_OP_EQ_12= RULE_OP_EQ ( (otherlv_13= RULE_ID ) ) otherlv_14= '[' ( (lv_callParams_15_0= ruleAIndexAffineExpressionList ) ) otherlv_16= ']' otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';' )
            // InternalAlpha.g:2420:3: (otherlv_0= 'over' ( (lv_instantiationDomain_1_0= ruleAPolyhedralObjectExpression ) ) (otherlv_2= 'with' otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleAIndexList ) ) otherlv_5= ']' )? otherlv_6= ':' )? otherlv_7= '(' ( ( (lv_outputExprs_8_0= ruleAAlphaExpression ) ) (otherlv_9= ',' ( (lv_outputExprs_10_0= ruleAAlphaExpression ) ) )* )? otherlv_11= ')' this_OP_EQ_12= RULE_OP_EQ ( (otherlv_13= RULE_ID ) ) otherlv_14= '[' ( (lv_callParams_15_0= ruleAIndexAffineExpressionList ) ) otherlv_16= ']' otherlv_17= '(' ( ( (lv_inputExprs_18_0= ruleAAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAAlphaExpression ) ) )* )? otherlv_21= ')' otherlv_22= ';'
            {
            // InternalAlpha.g:2420:3: (otherlv_0= 'over' ( (lv_instantiationDomain_1_0= ruleAPolyhedralObjectExpression ) ) (otherlv_2= 'with' otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleAIndexList ) ) otherlv_5= ']' )? otherlv_6= ':' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAlpha.g:2421:4: otherlv_0= 'over' ( (lv_instantiationDomain_1_0= ruleAPolyhedralObjectExpression ) ) (otherlv_2= 'with' otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleAIndexList ) ) otherlv_5= ']' )? otherlv_6= ':'
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getAUseEquationAccess().getOverKeyword_0_0());
                      			
                    }
                    // InternalAlpha.g:2425:4: ( (lv_instantiationDomain_1_0= ruleAPolyhedralObjectExpression ) )
                    // InternalAlpha.g:2426:5: (lv_instantiationDomain_1_0= ruleAPolyhedralObjectExpression )
                    {
                    // InternalAlpha.g:2426:5: (lv_instantiationDomain_1_0= ruleAPolyhedralObjectExpression )
                    // InternalAlpha.g:2427:6: lv_instantiationDomain_1_0= ruleAPolyhedralObjectExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAUseEquationAccess().getInstantiationDomainAPolyhedralObjectExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
                    lv_instantiationDomain_1_0=ruleAPolyhedralObjectExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAUseEquationRule());
                      						}
                      						set(
                      							current,
                      							"instantiationDomain",
                      							lv_instantiationDomain_1_0,
                      							"alpha.Alpha.APolyhedralObjectExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAlpha.g:2444:4: (otherlv_2= 'with' otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleAIndexList ) ) otherlv_5= ']' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==69) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalAlpha.g:2445:5: otherlv_2= 'with' otherlv_3= '[' ( (lv_subsystemDims_4_0= ruleAIndexList ) ) otherlv_5= ']'
                            {
                            otherlv_2=(Token)match(input,69,FOLLOW_11); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getAUseEquationAccess().getWithKeyword_0_2_0());
                              				
                            }
                            otherlv_3=(Token)match(input,64,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getAUseEquationAccess().getLeftSquareBracketKeyword_0_2_1());
                              				
                            }
                            // InternalAlpha.g:2453:5: ( (lv_subsystemDims_4_0= ruleAIndexList ) )
                            // InternalAlpha.g:2454:6: (lv_subsystemDims_4_0= ruleAIndexList )
                            {
                            // InternalAlpha.g:2454:6: (lv_subsystemDims_4_0= ruleAIndexList )
                            // InternalAlpha.g:2455:7: lv_subsystemDims_4_0= ruleAIndexList
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAUseEquationAccess().getSubsystemDimsAIndexListParserRuleCall_0_2_2_0());
                              						
                            }
                            pushFollow(FOLLOW_33);
                            lv_subsystemDims_4_0=ruleAIndexList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

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


                            }

                            otherlv_5=(Token)match(input,65,FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getAUseEquationAccess().getRightSquareBracketKeyword_0_2_3());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,50,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getAUseEquationAccess().getColonKeyword_0_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,38,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getAUseEquationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAlpha.g:2486:3: ( ( (lv_outputExprs_8_0= ruleAAlphaExpression ) ) (otherlv_9= ',' ( (lv_outputExprs_10_0= ruleAAlphaExpression ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_INT)||(LA39_0>=RULE_OP_PLUS && LA39_0<=RULE_OP_MUL)||(LA39_0>=RULE_OP_AND && LA39_0<=RULE_OP_OR)||LA39_0==RULE_OP_XOR||(LA39_0>=RULE_OP_MIN && LA39_0<=RULE_REAL)||LA39_0==33||LA39_0==38||LA39_0==64||(LA39_0>=70 && LA39_0<=72)||LA39_0==74||(LA39_0>=77 && LA39_0<=81)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAlpha.g:2487:4: ( (lv_outputExprs_8_0= ruleAAlphaExpression ) ) (otherlv_9= ',' ( (lv_outputExprs_10_0= ruleAAlphaExpression ) ) )*
                    {
                    // InternalAlpha.g:2487:4: ( (lv_outputExprs_8_0= ruleAAlphaExpression ) )
                    // InternalAlpha.g:2488:5: (lv_outputExprs_8_0= ruleAAlphaExpression )
                    {
                    // InternalAlpha.g:2488:5: (lv_outputExprs_8_0= ruleAAlphaExpression )
                    // InternalAlpha.g:2489:6: lv_outputExprs_8_0= ruleAAlphaExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAUseEquationAccess().getOutputExprsAAlphaExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
                    lv_outputExprs_8_0=ruleAAlphaExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalAlpha.g:2506:4: (otherlv_9= ',' ( (lv_outputExprs_10_0= ruleAAlphaExpression ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==51) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalAlpha.g:2507:5: otherlv_9= ',' ( (lv_outputExprs_10_0= ruleAAlphaExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,51,FOLLOW_20); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getAUseEquationAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalAlpha.g:2511:5: ( (lv_outputExprs_10_0= ruleAAlphaExpression ) )
                    	    // InternalAlpha.g:2512:6: (lv_outputExprs_10_0= ruleAAlphaExpression )
                    	    {
                    	    // InternalAlpha.g:2512:6: (lv_outputExprs_10_0= ruleAAlphaExpression )
                    	    // InternalAlpha.g:2513:7: lv_outputExprs_10_0= ruleAAlphaExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAUseEquationAccess().getOutputExprsAAlphaExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_45);
                    	    lv_outputExprs_10_0=ruleAAlphaExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,39,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getAUseEquationAccess().getRightParenthesisKeyword_3());
              		
            }
            this_OP_EQ_12=(Token)match(input,RULE_OP_EQ,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OP_EQ_12, grammarAccess.getAUseEquationAccess().getOP_EQTerminalRuleCall_4());
              		
            }
            // InternalAlpha.g:2540:3: ( (otherlv_13= RULE_ID ) )
            // InternalAlpha.g:2541:4: (otherlv_13= RULE_ID )
            {
            // InternalAlpha.g:2541:4: (otherlv_13= RULE_ID )
            // InternalAlpha.g:2542:5: otherlv_13= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAUseEquationRule());
              					}
              				
            }
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_13, grammarAccess.getAUseEquationAccess().getSystemAAffineSystemCrossReference_5_0());
              				
            }

            }


            }

            otherlv_14=(Token)match(input,64,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getAUseEquationAccess().getLeftSquareBracketKeyword_6());
              		
            }
            // InternalAlpha.g:2557:3: ( (lv_callParams_15_0= ruleAIndexAffineExpressionList ) )
            // InternalAlpha.g:2558:4: (lv_callParams_15_0= ruleAIndexAffineExpressionList )
            {
            // InternalAlpha.g:2558:4: (lv_callParams_15_0= ruleAIndexAffineExpressionList )
            // InternalAlpha.g:2559:5: lv_callParams_15_0= ruleAIndexAffineExpressionList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAUseEquationAccess().getCallParamsAIndexAffineExpressionListParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_callParams_15_0=ruleAIndexAffineExpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAUseEquationRule());
              					}
              					set(
              						current,
              						"callParams",
              						lv_callParams_15_0,
              						"alpha.Alpha.AIndexAffineExpressionList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_16=(Token)match(input,65,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getAUseEquationAccess().getRightSquareBracketKeyword_8());
              		
            }
            otherlv_17=(Token)match(input,38,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getAUseEquationAccess().getLeftParenthesisKeyword_9());
              		
            }
            // InternalAlpha.g:2584:3: ( ( (lv_inputExprs_18_0= ruleAAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAAlphaExpression ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_INT)||(LA41_0>=RULE_OP_PLUS && LA41_0<=RULE_OP_MUL)||(LA41_0>=RULE_OP_AND && LA41_0<=RULE_OP_OR)||LA41_0==RULE_OP_XOR||(LA41_0>=RULE_OP_MIN && LA41_0<=RULE_REAL)||LA41_0==33||LA41_0==38||LA41_0==64||(LA41_0>=70 && LA41_0<=72)||LA41_0==74||(LA41_0>=77 && LA41_0<=81)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAlpha.g:2585:4: ( (lv_inputExprs_18_0= ruleAAlphaExpression ) ) (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAAlphaExpression ) ) )*
                    {
                    // InternalAlpha.g:2585:4: ( (lv_inputExprs_18_0= ruleAAlphaExpression ) )
                    // InternalAlpha.g:2586:5: (lv_inputExprs_18_0= ruleAAlphaExpression )
                    {
                    // InternalAlpha.g:2586:5: (lv_inputExprs_18_0= ruleAAlphaExpression )
                    // InternalAlpha.g:2587:6: lv_inputExprs_18_0= ruleAAlphaExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAUseEquationAccess().getInputExprsAAlphaExpressionParserRuleCall_10_0_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
                    lv_inputExprs_18_0=ruleAAlphaExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalAlpha.g:2604:4: (otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAAlphaExpression ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==51) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalAlpha.g:2605:5: otherlv_19= ',' ( (lv_inputExprs_20_0= ruleAAlphaExpression ) )
                    	    {
                    	    otherlv_19=(Token)match(input,51,FOLLOW_20); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_19, grammarAccess.getAUseEquationAccess().getCommaKeyword_10_1_0());
                    	      				
                    	    }
                    	    // InternalAlpha.g:2609:5: ( (lv_inputExprs_20_0= ruleAAlphaExpression ) )
                    	    // InternalAlpha.g:2610:6: (lv_inputExprs_20_0= ruleAAlphaExpression )
                    	    {
                    	    // InternalAlpha.g:2610:6: (lv_inputExprs_20_0= ruleAAlphaExpression )
                    	    // InternalAlpha.g:2611:7: lv_inputExprs_20_0= ruleAAlphaExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAUseEquationAccess().getInputExprsAAlphaExpressionParserRuleCall_10_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_45);
                    	    lv_inputExprs_20_0=ruleAAlphaExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_21=(Token)match(input,39,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getAUseEquationAccess().getRightParenthesisKeyword_11());
              		
            }
            otherlv_22=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getAUseEquationAccess().getSemicolonKeyword_12());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:2642:1: entryRuleAAlphaExpression returns [EObject current=null] : iv_ruleAAlphaExpression= ruleAAlphaExpression EOF ;
    public final EObject entryRuleAAlphaExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAAlphaExpression = null;


        try {
            // InternalAlpha.g:2642:57: (iv_ruleAAlphaExpression= ruleAAlphaExpression EOF )
            // InternalAlpha.g:2643:2: iv_ruleAAlphaExpression= ruleAAlphaExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAAlphaExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAAlphaExpression=ruleAAlphaExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAAlphaExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:2649:1: ruleAAlphaExpression returns [EObject current=null] : (this_AIfExpression_0= ruleAIfExpression | this_ARestrictExpression_1= ruleARestrictExpression | this_AAutoRestrictExpression_2= ruleAAutoRestrictExpression | this_AOrExpression_3= ruleAOrExpression ) ;
    public final EObject ruleAAlphaExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AIfExpression_0 = null;

        EObject this_ARestrictExpression_1 = null;

        EObject this_AAutoRestrictExpression_2 = null;

        EObject this_AOrExpression_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2655:2: ( (this_AIfExpression_0= ruleAIfExpression | this_ARestrictExpression_1= ruleARestrictExpression | this_AAutoRestrictExpression_2= ruleAAutoRestrictExpression | this_AOrExpression_3= ruleAOrExpression ) )
            // InternalAlpha.g:2656:2: (this_AIfExpression_0= ruleAIfExpression | this_ARestrictExpression_1= ruleARestrictExpression | this_AAutoRestrictExpression_2= ruleAAutoRestrictExpression | this_AOrExpression_3= ruleAOrExpression )
            {
            // InternalAlpha.g:2656:2: (this_AIfExpression_0= ruleAIfExpression | this_ARestrictExpression_1= ruleARestrictExpression | this_AAutoRestrictExpression_2= ruleAAutoRestrictExpression | this_AOrExpression_3= ruleAOrExpression )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt42=1;
                }
                break;
            case 33:
                {
                alt42=2;
                }
                break;
            case RULE_ID:
                {
                int LA42_3 = input.LA(2);

                if ( (LA42_3==EOF||(LA42_3>=RULE_OP_EQ && LA42_3<=RULE_OP_DIV)||(LA42_3>=RULE_OP_AND && LA42_3<=RULE_OP_OR)||(LA42_3>=RULE_OP_XOR && LA42_3<=RULE_OP_MAX)||(LA42_3>=RULE_OP_GE && LA42_3<=RULE_OP_NE)||(LA42_3>=38 && LA42_3<=39)||LA42_3==51||LA42_3==64||LA42_3==67||(LA42_3>=75 && LA42_3<=76)) ) {
                    alt42=4;
                }
                else if ( (LA42_3==50) ) {
                    alt42=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 3, input);

                    throw nvae;
                }
                }
                break;
            case 81:
                {
                alt42=3;
                }
                break;
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
            case 64:
            case 70:
            case 71:
            case 72:
            case 77:
            case 78:
            case 79:
            case 80:
                {
                alt42=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalAlpha.g:2657:3: this_AIfExpression_0= ruleAIfExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAAlphaExpressionAccess().getAIfExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AIfExpression_0=ruleAIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AIfExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:2666:3: this_ARestrictExpression_1= ruleARestrictExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAAlphaExpressionAccess().getARestrictExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ARestrictExpression_1=ruleARestrictExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ARestrictExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:2675:3: this_AAutoRestrictExpression_2= ruleAAutoRestrictExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAAlphaExpressionAccess().getAAutoRestrictExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AAutoRestrictExpression_2=ruleAAutoRestrictExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AAutoRestrictExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:2684:3: this_AOrExpression_3= ruleAOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAAlphaExpressionAccess().getAOrExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AOrExpression_3=ruleAOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AOrExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:2696:1: entryRuleAAlphabetsTerminalExpression returns [EObject current=null] : iv_ruleAAlphabetsTerminalExpression= ruleAAlphabetsTerminalExpression EOF ;
    public final EObject entryRuleAAlphabetsTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAAlphabetsTerminalExpression = null;


        try {
            // InternalAlpha.g:2696:69: (iv_ruleAAlphabetsTerminalExpression= ruleAAlphabetsTerminalExpression EOF )
            // InternalAlpha.g:2697:2: iv_ruleAAlphabetsTerminalExpression= ruleAAlphabetsTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAAlphabetsTerminalExpression=ruleAAlphabetsTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAAlphabetsTerminalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:2703:1: ruleAAlphabetsTerminalExpression returns [EObject current=null] : (this_AParanthesizedAlphabetsExpression_0= ruleAParanthesizedAlphabetsExpression | this_ACaseExpression_1= ruleACaseExpression | this_AReduceExpression_2= ruleAReduceExpression | this_AArgReduceExpression_3= ruleAArgReduceExpression | this_AConvExpression_4= ruleAConvExpression | this_AMultiArgExpression_5= ruleAMultiArgExpression | this_AConstantExpression_6= ruleAConstantExpression | this_AVariableExpression_7= ruleAVariableExpression | this_AIndexExpression_8= ruleAIndexExpression | this_AIndexExpressionInArrayNotation_9= ruleAIndexExpressionInArrayNotation | this_ADependenceExpression_10= ruleADependenceExpression | this_ADependenceInArrayNotation_11= ruleADependenceInArrayNotation | this_ASelectDependenceExpression_12= ruleASelectDependenceExpression ) ;
    public final EObject ruleAAlphabetsTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AParanthesizedAlphabetsExpression_0 = null;

        EObject this_ACaseExpression_1 = null;

        EObject this_AReduceExpression_2 = null;

        EObject this_AArgReduceExpression_3 = null;

        EObject this_AConvExpression_4 = null;

        EObject this_AMultiArgExpression_5 = null;

        EObject this_AConstantExpression_6 = null;

        EObject this_AVariableExpression_7 = null;

        EObject this_AIndexExpression_8 = null;

        EObject this_AIndexExpressionInArrayNotation_9 = null;

        EObject this_ADependenceExpression_10 = null;

        EObject this_ADependenceInArrayNotation_11 = null;

        EObject this_ASelectDependenceExpression_12 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2709:2: ( (this_AParanthesizedAlphabetsExpression_0= ruleAParanthesizedAlphabetsExpression | this_ACaseExpression_1= ruleACaseExpression | this_AReduceExpression_2= ruleAReduceExpression | this_AArgReduceExpression_3= ruleAArgReduceExpression | this_AConvExpression_4= ruleAConvExpression | this_AMultiArgExpression_5= ruleAMultiArgExpression | this_AConstantExpression_6= ruleAConstantExpression | this_AVariableExpression_7= ruleAVariableExpression | this_AIndexExpression_8= ruleAIndexExpression | this_AIndexExpressionInArrayNotation_9= ruleAIndexExpressionInArrayNotation | this_ADependenceExpression_10= ruleADependenceExpression | this_ADependenceInArrayNotation_11= ruleADependenceInArrayNotation | this_ASelectDependenceExpression_12= ruleASelectDependenceExpression ) )
            // InternalAlpha.g:2710:2: (this_AParanthesizedAlphabetsExpression_0= ruleAParanthesizedAlphabetsExpression | this_ACaseExpression_1= ruleACaseExpression | this_AReduceExpression_2= ruleAReduceExpression | this_AArgReduceExpression_3= ruleAArgReduceExpression | this_AConvExpression_4= ruleAConvExpression | this_AMultiArgExpression_5= ruleAMultiArgExpression | this_AConstantExpression_6= ruleAConstantExpression | this_AVariableExpression_7= ruleAVariableExpression | this_AIndexExpression_8= ruleAIndexExpression | this_AIndexExpressionInArrayNotation_9= ruleAIndexExpressionInArrayNotation | this_ADependenceExpression_10= ruleADependenceExpression | this_ADependenceInArrayNotation_11= ruleADependenceInArrayNotation | this_ASelectDependenceExpression_12= ruleASelectDependenceExpression )
            {
            // InternalAlpha.g:2710:2: (this_AParanthesizedAlphabetsExpression_0= ruleAParanthesizedAlphabetsExpression | this_ACaseExpression_1= ruleACaseExpression | this_AReduceExpression_2= ruleAReduceExpression | this_AArgReduceExpression_3= ruleAArgReduceExpression | this_AConvExpression_4= ruleAConvExpression | this_AMultiArgExpression_5= ruleAMultiArgExpression | this_AConstantExpression_6= ruleAConstantExpression | this_AVariableExpression_7= ruleAVariableExpression | this_AIndexExpression_8= ruleAIndexExpression | this_AIndexExpressionInArrayNotation_9= ruleAIndexExpressionInArrayNotation | this_ADependenceExpression_10= ruleADependenceExpression | this_ADependenceInArrayNotation_11= ruleADependenceInArrayNotation | this_ASelectDependenceExpression_12= ruleASelectDependenceExpression )
            int alt43=13;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // InternalAlpha.g:2711:3: this_AParanthesizedAlphabetsExpression_0= ruleAParanthesizedAlphabetsExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getAParanthesizedAlphabetsExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AParanthesizedAlphabetsExpression_0=ruleAParanthesizedAlphabetsExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AParanthesizedAlphabetsExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:2720:3: this_ACaseExpression_1= ruleACaseExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getACaseExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ACaseExpression_1=ruleACaseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ACaseExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:2729:3: this_AReduceExpression_2= ruleAReduceExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getAReduceExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AReduceExpression_2=ruleAReduceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AReduceExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:2738:3: this_AArgReduceExpression_3= ruleAArgReduceExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getAArgReduceExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AArgReduceExpression_3=ruleAArgReduceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AArgReduceExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:2747:3: this_AConvExpression_4= ruleAConvExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getAConvExpressionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AConvExpression_4=ruleAConvExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AConvExpression_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:2756:3: this_AMultiArgExpression_5= ruleAMultiArgExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getAMultiArgExpressionParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AMultiArgExpression_5=ruleAMultiArgExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AMultiArgExpression_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAlpha.g:2765:3: this_AConstantExpression_6= ruleAConstantExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getAConstantExpressionParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AConstantExpression_6=ruleAConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AConstantExpression_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAlpha.g:2774:3: this_AVariableExpression_7= ruleAVariableExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getAVariableExpressionParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AVariableExpression_7=ruleAVariableExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AVariableExpression_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAlpha.g:2783:3: this_AIndexExpression_8= ruleAIndexExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getAIndexExpressionParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AIndexExpression_8=ruleAIndexExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AIndexExpression_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAlpha.g:2792:3: this_AIndexExpressionInArrayNotation_9= ruleAIndexExpressionInArrayNotation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getAIndexExpressionInArrayNotationParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AIndexExpressionInArrayNotation_9=ruleAIndexExpressionInArrayNotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AIndexExpressionInArrayNotation_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalAlpha.g:2801:3: this_ADependenceExpression_10= ruleADependenceExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getADependenceExpressionParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ADependenceExpression_10=ruleADependenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ADependenceExpression_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalAlpha.g:2810:3: this_ADependenceInArrayNotation_11= ruleADependenceInArrayNotation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getADependenceInArrayNotationParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ADependenceInArrayNotation_11=ruleADependenceInArrayNotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ADependenceInArrayNotation_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalAlpha.g:2819:3: this_ASelectDependenceExpression_12= ruleASelectDependenceExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAAlphabetsTerminalExpressionAccess().getASelectDependenceExpressionParserRuleCall_12());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ASelectDependenceExpression_12=ruleASelectDependenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ASelectDependenceExpression_12;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:2831:1: entryRuleAParanthesizedAlphabetsExpression returns [EObject current=null] : iv_ruleAParanthesizedAlphabetsExpression= ruleAParanthesizedAlphabetsExpression EOF ;
    public final EObject entryRuleAParanthesizedAlphabetsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAParanthesizedAlphabetsExpression = null;


        try {
            // InternalAlpha.g:2831:74: (iv_ruleAParanthesizedAlphabetsExpression= ruleAParanthesizedAlphabetsExpression EOF )
            // InternalAlpha.g:2832:2: iv_ruleAParanthesizedAlphabetsExpression= ruleAParanthesizedAlphabetsExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAParanthesizedAlphabetsExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAParanthesizedAlphabetsExpression=ruleAParanthesizedAlphabetsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAParanthesizedAlphabetsExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:2838:1: ruleAParanthesizedAlphabetsExpression returns [EObject current=null] : (otherlv_0= '(' this_AAlphaExpression_1= ruleAAlphaExpression otherlv_2= ')' ) ;
    public final EObject ruleAParanthesizedAlphabetsExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AAlphaExpression_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2844:2: ( (otherlv_0= '(' this_AAlphaExpression_1= ruleAAlphaExpression otherlv_2= ')' ) )
            // InternalAlpha.g:2845:2: (otherlv_0= '(' this_AAlphaExpression_1= ruleAAlphaExpression otherlv_2= ')' )
            {
            // InternalAlpha.g:2845:2: (otherlv_0= '(' this_AAlphaExpression_1= ruleAAlphaExpression otherlv_2= ')' )
            // InternalAlpha.g:2846:3: otherlv_0= '(' this_AAlphaExpression_1= ruleAAlphaExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAParanthesizedAlphabetsExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAParanthesizedAlphabetsExpressionAccess().getAAlphaExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_9);
            this_AAlphaExpression_1=ruleAAlphaExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AAlphaExpression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAParanthesizedAlphabetsExpressionAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:2866:1: entryRuleAOrExpression returns [EObject current=null] : iv_ruleAOrExpression= ruleAOrExpression EOF ;
    public final EObject entryRuleAOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAOrExpression = null;


        try {
            // InternalAlpha.g:2866:54: (iv_ruleAOrExpression= ruleAOrExpression EOF )
            // InternalAlpha.g:2867:2: iv_ruleAOrExpression= ruleAOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAOrExpression=ruleAOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:2873:1: ruleAOrExpression returns [EObject current=null] : (this_AAndExpression_0= ruleAAndExpression ( () ( ( (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR ) ) ) ( (lv_right_3_0= ruleAAndExpression ) ) )* ) ;
    public final EObject ruleAOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_AAndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2879:2: ( (this_AAndExpression_0= ruleAAndExpression ( () ( ( (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR ) ) ) ( (lv_right_3_0= ruleAAndExpression ) ) )* ) )
            // InternalAlpha.g:2880:2: (this_AAndExpression_0= ruleAAndExpression ( () ( ( (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR ) ) ) ( (lv_right_3_0= ruleAAndExpression ) ) )* )
            {
            // InternalAlpha.g:2880:2: (this_AAndExpression_0= ruleAAndExpression ( () ( ( (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR ) ) ) ( (lv_right_3_0= ruleAAndExpression ) ) )* )
            // InternalAlpha.g:2881:3: this_AAndExpression_0= ruleAAndExpression ( () ( ( (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR ) ) ) ( (lv_right_3_0= ruleAAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAOrExpressionAccess().getAAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_47);
            this_AAndExpression_0=ruleAAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAlpha.g:2889:3: ( () ( ( (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR ) ) ) ( (lv_right_3_0= ruleAAndExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_OP_OR||LA45_0==RULE_OP_XOR) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalAlpha.g:2890:4: () ( ( (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR ) ) ) ( (lv_right_3_0= ruleAAndExpression ) )
            	    {
            	    // InternalAlpha.g:2890:4: ()
            	    // InternalAlpha.g:2891:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAOrExpressionAccess().getAOrExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalAlpha.g:2897:4: ( ( (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR ) ) )
            	    // InternalAlpha.g:2898:5: ( (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR ) )
            	    {
            	    // InternalAlpha.g:2898:5: ( (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR ) )
            	    // InternalAlpha.g:2899:6: (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR )
            	    {
            	    // InternalAlpha.g:2899:6: (lv_operator_2_1= RULE_OP_OR | lv_operator_2_2= RULE_OP_XOR )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==RULE_OP_OR) ) {
            	        alt44=1;
            	    }
            	    else if ( (LA44_0==RULE_OP_XOR) ) {
            	        alt44=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalAlpha.g:2900:7: lv_operator_2_1= RULE_OP_OR
            	            {
            	            lv_operator_2_1=(Token)match(input,RULE_OP_OR,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_1, grammarAccess.getAOrExpressionAccess().getOperatorOP_ORTerminalRuleCall_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAOrExpressionRule());
            	              							}
            	              							setWithLastConsumed(
            	              								current,
            	              								"operator",
            	              								lv_operator_2_1,
            	              								"alpha.Alpha.OP_OR");
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalAlpha.g:2915:7: lv_operator_2_2= RULE_OP_XOR
            	            {
            	            lv_operator_2_2=(Token)match(input,RULE_OP_XOR,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_2, grammarAccess.getAOrExpressionAccess().getOperatorOP_XORTerminalRuleCall_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAOrExpressionRule());
            	              							}
            	              							setWithLastConsumed(
            	              								current,
            	              								"operator",
            	              								lv_operator_2_2,
            	              								"alpha.Alpha.OP_XOR");
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalAlpha.g:2932:4: ( (lv_right_3_0= ruleAAndExpression ) )
            	    // InternalAlpha.g:2933:5: (lv_right_3_0= ruleAAndExpression )
            	    {
            	    // InternalAlpha.g:2933:5: (lv_right_3_0= ruleAAndExpression )
            	    // InternalAlpha.g:2934:6: lv_right_3_0= ruleAAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAOrExpressionAccess().getRightAAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
            	    lv_right_3_0=ruleAAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:2956:1: entryRuleAAndExpression returns [EObject current=null] : iv_ruleAAndExpression= ruleAAndExpression EOF ;
    public final EObject entryRuleAAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAAndExpression = null;


        try {
            // InternalAlpha.g:2956:55: (iv_ruleAAndExpression= ruleAAndExpression EOF )
            // InternalAlpha.g:2957:2: iv_ruleAAndExpression= ruleAAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAAndExpression=ruleAAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:2963:1: ruleAAndExpression returns [EObject current=null] : (this_ARelationalExpression_0= ruleARelationalExpression ( () ( ( (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND ) ) ) ( (lv_right_3_0= ruleARelationalExpression ) ) )* ) ;
    public final EObject ruleAAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_ARelationalExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:2969:2: ( (this_ARelationalExpression_0= ruleARelationalExpression ( () ( ( (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND ) ) ) ( (lv_right_3_0= ruleARelationalExpression ) ) )* ) )
            // InternalAlpha.g:2970:2: (this_ARelationalExpression_0= ruleARelationalExpression ( () ( ( (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND ) ) ) ( (lv_right_3_0= ruleARelationalExpression ) ) )* )
            {
            // InternalAlpha.g:2970:2: (this_ARelationalExpression_0= ruleARelationalExpression ( () ( ( (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND ) ) ) ( (lv_right_3_0= ruleARelationalExpression ) ) )* )
            // InternalAlpha.g:2971:3: this_ARelationalExpression_0= ruleARelationalExpression ( () ( ( (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND ) ) ) ( (lv_right_3_0= ruleARelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAAndExpressionAccess().getARelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_48);
            this_ARelationalExpression_0=ruleARelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ARelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAlpha.g:2979:3: ( () ( ( (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND ) ) ) ( (lv_right_3_0= ruleARelationalExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_OP_AND||LA47_0==RULE_OP_NAND) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalAlpha.g:2980:4: () ( ( (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND ) ) ) ( (lv_right_3_0= ruleARelationalExpression ) )
            	    {
            	    // InternalAlpha.g:2980:4: ()
            	    // InternalAlpha.g:2981:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAAndExpressionAccess().getAAndExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalAlpha.g:2987:4: ( ( (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND ) ) )
            	    // InternalAlpha.g:2988:5: ( (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND ) )
            	    {
            	    // InternalAlpha.g:2988:5: ( (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND ) )
            	    // InternalAlpha.g:2989:6: (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND )
            	    {
            	    // InternalAlpha.g:2989:6: (lv_operator_2_1= RULE_OP_AND | lv_operator_2_2= RULE_OP_NAND )
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==RULE_OP_AND) ) {
            	        alt46=1;
            	    }
            	    else if ( (LA46_0==RULE_OP_NAND) ) {
            	        alt46=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 46, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalAlpha.g:2990:7: lv_operator_2_1= RULE_OP_AND
            	            {
            	            lv_operator_2_1=(Token)match(input,RULE_OP_AND,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_1, grammarAccess.getAAndExpressionAccess().getOperatorOP_ANDTerminalRuleCall_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAAndExpressionRule());
            	              							}
            	              							setWithLastConsumed(
            	              								current,
            	              								"operator",
            	              								lv_operator_2_1,
            	              								"alpha.Alpha.OP_AND");
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalAlpha.g:3005:7: lv_operator_2_2= RULE_OP_NAND
            	            {
            	            lv_operator_2_2=(Token)match(input,RULE_OP_NAND,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_2, grammarAccess.getAAndExpressionAccess().getOperatorOP_NANDTerminalRuleCall_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAAndExpressionRule());
            	              							}
            	              							setWithLastConsumed(
            	              								current,
            	              								"operator",
            	              								lv_operator_2_2,
            	              								"alpha.Alpha.OP_NAND");
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalAlpha.g:3022:4: ( (lv_right_3_0= ruleARelationalExpression ) )
            	    // InternalAlpha.g:3023:5: (lv_right_3_0= ruleARelationalExpression )
            	    {
            	    // InternalAlpha.g:3023:5: (lv_right_3_0= ruleARelationalExpression )
            	    // InternalAlpha.g:3024:6: lv_right_3_0= ruleARelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAAndExpressionAccess().getRightARelationalExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_48);
            	    lv_right_3_0=ruleARelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:3046:1: entryRuleARelationalExpression returns [EObject current=null] : iv_ruleARelationalExpression= ruleARelationalExpression EOF ;
    public final EObject entryRuleARelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARelationalExpression = null;


        try {
            // InternalAlpha.g:3046:62: (iv_ruleARelationalExpression= ruleARelationalExpression EOF )
            // InternalAlpha.g:3047:2: iv_ruleARelationalExpression= ruleARelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getARelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleARelationalExpression=ruleARelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleARelationalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:3053:1: ruleARelationalExpression returns [EObject current=null] : (this_AAdditiveExpression_0= ruleAAdditiveExpression ( () ( (lv_operator_2_0= ruleRELATIONAL_OP ) ) ( (lv_right_3_0= ruleAAdditiveExpression ) ) )* ) ;
    public final EObject ruleARelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AAdditiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3059:2: ( (this_AAdditiveExpression_0= ruleAAdditiveExpression ( () ( (lv_operator_2_0= ruleRELATIONAL_OP ) ) ( (lv_right_3_0= ruleAAdditiveExpression ) ) )* ) )
            // InternalAlpha.g:3060:2: (this_AAdditiveExpression_0= ruleAAdditiveExpression ( () ( (lv_operator_2_0= ruleRELATIONAL_OP ) ) ( (lv_right_3_0= ruleAAdditiveExpression ) ) )* )
            {
            // InternalAlpha.g:3060:2: (this_AAdditiveExpression_0= ruleAAdditiveExpression ( () ( (lv_operator_2_0= ruleRELATIONAL_OP ) ) ( (lv_right_3_0= ruleAAdditiveExpression ) ) )* )
            // InternalAlpha.g:3061:3: this_AAdditiveExpression_0= ruleAAdditiveExpression ( () ( (lv_operator_2_0= ruleRELATIONAL_OP ) ) ( (lv_right_3_0= ruleAAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getARelationalExpressionAccess().getAAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_AAdditiveExpression_0=ruleAAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAlpha.g:3069:3: ( () ( (lv_operator_2_0= ruleRELATIONAL_OP ) ) ( (lv_right_3_0= ruleAAdditiveExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_OP_EQ||(LA48_0>=RULE_OP_GE && LA48_0<=RULE_OP_NE)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalAlpha.g:3070:4: () ( (lv_operator_2_0= ruleRELATIONAL_OP ) ) ( (lv_right_3_0= ruleAAdditiveExpression ) )
            	    {
            	    // InternalAlpha.g:3070:4: ()
            	    // InternalAlpha.g:3071:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getARelationalExpressionAccess().getARelationalExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalAlpha.g:3077:4: ( (lv_operator_2_0= ruleRELATIONAL_OP ) )
            	    // InternalAlpha.g:3078:5: (lv_operator_2_0= ruleRELATIONAL_OP )
            	    {
            	    // InternalAlpha.g:3078:5: (lv_operator_2_0= ruleRELATIONAL_OP )
            	    // InternalAlpha.g:3079:6: lv_operator_2_0= ruleRELATIONAL_OP
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getARelationalExpressionAccess().getOperatorRELATIONAL_OPParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_operator_2_0=ruleRELATIONAL_OP();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // InternalAlpha.g:3096:4: ( (lv_right_3_0= ruleAAdditiveExpression ) )
            	    // InternalAlpha.g:3097:5: (lv_right_3_0= ruleAAdditiveExpression )
            	    {
            	    // InternalAlpha.g:3097:5: (lv_right_3_0= ruleAAdditiveExpression )
            	    // InternalAlpha.g:3098:6: lv_right_3_0= ruleAAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getARelationalExpressionAccess().getRightAAdditiveExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
            	    lv_right_3_0=ruleAAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:3120:1: entryRuleAAdditiveExpression returns [EObject current=null] : iv_ruleAAdditiveExpression= ruleAAdditiveExpression EOF ;
    public final EObject entryRuleAAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAAdditiveExpression = null;


        try {
            // InternalAlpha.g:3120:60: (iv_ruleAAdditiveExpression= ruleAAdditiveExpression EOF )
            // InternalAlpha.g:3121:2: iv_ruleAAdditiveExpression= ruleAAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAAdditiveExpression=ruleAAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:3127:1: ruleAAdditiveExpression returns [EObject current=null] : (this_AMultiplicativeExpression_0= ruleAMultiplicativeExpression ( () ( ( (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS ) ) ) ( (lv_right_3_0= ruleAMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_AMultiplicativeExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3133:2: ( (this_AMultiplicativeExpression_0= ruleAMultiplicativeExpression ( () ( ( (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS ) ) ) ( (lv_right_3_0= ruleAMultiplicativeExpression ) ) )* ) )
            // InternalAlpha.g:3134:2: (this_AMultiplicativeExpression_0= ruleAMultiplicativeExpression ( () ( ( (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS ) ) ) ( (lv_right_3_0= ruleAMultiplicativeExpression ) ) )* )
            {
            // InternalAlpha.g:3134:2: (this_AMultiplicativeExpression_0= ruleAMultiplicativeExpression ( () ( ( (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS ) ) ) ( (lv_right_3_0= ruleAMultiplicativeExpression ) ) )* )
            // InternalAlpha.g:3135:3: this_AMultiplicativeExpression_0= ruleAMultiplicativeExpression ( () ( ( (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS ) ) ) ( (lv_right_3_0= ruleAMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAAdditiveExpressionAccess().getAMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_49);
            this_AMultiplicativeExpression_0=ruleAMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAlpha.g:3143:3: ( () ( ( (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS ) ) ) ( (lv_right_3_0= ruleAMultiplicativeExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=RULE_OP_PLUS && LA50_0<=RULE_OP_MINUS)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalAlpha.g:3144:4: () ( ( (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS ) ) ) ( (lv_right_3_0= ruleAMultiplicativeExpression ) )
            	    {
            	    // InternalAlpha.g:3144:4: ()
            	    // InternalAlpha.g:3145:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAAdditiveExpressionAccess().getAAdditiveExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalAlpha.g:3151:4: ( ( (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS ) ) )
            	    // InternalAlpha.g:3152:5: ( (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS ) )
            	    {
            	    // InternalAlpha.g:3152:5: ( (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS ) )
            	    // InternalAlpha.g:3153:6: (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS )
            	    {
            	    // InternalAlpha.g:3153:6: (lv_op_2_1= RULE_OP_PLUS | lv_op_2_2= RULE_OP_MINUS )
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==RULE_OP_PLUS) ) {
            	        alt49=1;
            	    }
            	    else if ( (LA49_0==RULE_OP_MINUS) ) {
            	        alt49=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 49, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // InternalAlpha.g:3154:7: lv_op_2_1= RULE_OP_PLUS
            	            {
            	            lv_op_2_1=(Token)match(input,RULE_OP_PLUS,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getAAdditiveExpressionAccess().getOpOP_PLUSTerminalRuleCall_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAAdditiveExpressionRule());
            	              							}
            	              							setWithLastConsumed(
            	              								current,
            	              								"op",
            	              								lv_op_2_1,
            	              								"alpha.Alpha.OP_PLUS");
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalAlpha.g:3169:7: lv_op_2_2= RULE_OP_MINUS
            	            {
            	            lv_op_2_2=(Token)match(input,RULE_OP_MINUS,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getAAdditiveExpressionAccess().getOpOP_MINUSTerminalRuleCall_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAAdditiveExpressionRule());
            	              							}
            	              							setWithLastConsumed(
            	              								current,
            	              								"op",
            	              								lv_op_2_2,
            	              								"alpha.Alpha.OP_MINUS");
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalAlpha.g:3186:4: ( (lv_right_3_0= ruleAMultiplicativeExpression ) )
            	    // InternalAlpha.g:3187:5: (lv_right_3_0= ruleAMultiplicativeExpression )
            	    {
            	    // InternalAlpha.g:3187:5: (lv_right_3_0= ruleAMultiplicativeExpression )
            	    // InternalAlpha.g:3188:6: lv_right_3_0= ruleAMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAAdditiveExpressionAccess().getRightAMultiplicativeExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_49);
            	    lv_right_3_0=ruleAMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:3210:1: entryRuleAMultiplicativeExpression returns [EObject current=null] : iv_ruleAMultiplicativeExpression= ruleAMultiplicativeExpression EOF ;
    public final EObject entryRuleAMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAMultiplicativeExpression = null;


        try {
            // InternalAlpha.g:3210:66: (iv_ruleAMultiplicativeExpression= ruleAMultiplicativeExpression EOF )
            // InternalAlpha.g:3211:2: iv_ruleAMultiplicativeExpression= ruleAMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAMultiplicativeExpression=ruleAMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:3217:1: ruleAMultiplicativeExpression returns [EObject current=null] : (this_AMinMaxExpression_0= ruleAMinMaxExpression ( () ( ( (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV ) ) ) ( (lv_right_3_0= ruleAMinMaxExpression ) ) )* ) ;
    public final EObject ruleAMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_AMinMaxExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3223:2: ( (this_AMinMaxExpression_0= ruleAMinMaxExpression ( () ( ( (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV ) ) ) ( (lv_right_3_0= ruleAMinMaxExpression ) ) )* ) )
            // InternalAlpha.g:3224:2: (this_AMinMaxExpression_0= ruleAMinMaxExpression ( () ( ( (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV ) ) ) ( (lv_right_3_0= ruleAMinMaxExpression ) ) )* )
            {
            // InternalAlpha.g:3224:2: (this_AMinMaxExpression_0= ruleAMinMaxExpression ( () ( ( (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV ) ) ) ( (lv_right_3_0= ruleAMinMaxExpression ) ) )* )
            // InternalAlpha.g:3225:3: this_AMinMaxExpression_0= ruleAMinMaxExpression ( () ( ( (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV ) ) ) ( (lv_right_3_0= ruleAMinMaxExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAMultiplicativeExpressionAccess().getAMinMaxExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_50);
            this_AMinMaxExpression_0=ruleAMinMaxExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AMinMaxExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAlpha.g:3233:3: ( () ( ( (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV ) ) ) ( (lv_right_3_0= ruleAMinMaxExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=RULE_OP_MUL && LA52_0<=RULE_OP_DIV)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalAlpha.g:3234:4: () ( ( (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV ) ) ) ( (lv_right_3_0= ruleAMinMaxExpression ) )
            	    {
            	    // InternalAlpha.g:3234:4: ()
            	    // InternalAlpha.g:3235:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAMultiplicativeExpressionAccess().getAMultiplicativeExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalAlpha.g:3241:4: ( ( (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV ) ) )
            	    // InternalAlpha.g:3242:5: ( (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV ) )
            	    {
            	    // InternalAlpha.g:3242:5: ( (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV ) )
            	    // InternalAlpha.g:3243:6: (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV )
            	    {
            	    // InternalAlpha.g:3243:6: (lv_op_2_1= RULE_OP_MUL | lv_op_2_2= RULE_OP_DIV )
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==RULE_OP_MUL) ) {
            	        alt51=1;
            	    }
            	    else if ( (LA51_0==RULE_OP_DIV) ) {
            	        alt51=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 51, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // InternalAlpha.g:3244:7: lv_op_2_1= RULE_OP_MUL
            	            {
            	            lv_op_2_1=(Token)match(input,RULE_OP_MUL,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getAMultiplicativeExpressionAccess().getOpOP_MULTerminalRuleCall_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAMultiplicativeExpressionRule());
            	              							}
            	              							setWithLastConsumed(
            	              								current,
            	              								"op",
            	              								lv_op_2_1,
            	              								"alpha.Alpha.OP_MUL");
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalAlpha.g:3259:7: lv_op_2_2= RULE_OP_DIV
            	            {
            	            lv_op_2_2=(Token)match(input,RULE_OP_DIV,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getAMultiplicativeExpressionAccess().getOpOP_DIVTerminalRuleCall_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAMultiplicativeExpressionRule());
            	              							}
            	              							setWithLastConsumed(
            	              								current,
            	              								"op",
            	              								lv_op_2_2,
            	              								"alpha.Alpha.OP_DIV");
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalAlpha.g:3276:4: ( (lv_right_3_0= ruleAMinMaxExpression ) )
            	    // InternalAlpha.g:3277:5: (lv_right_3_0= ruleAMinMaxExpression )
            	    {
            	    // InternalAlpha.g:3277:5: (lv_right_3_0= ruleAMinMaxExpression )
            	    // InternalAlpha.g:3278:6: lv_right_3_0= ruleAMinMaxExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAMultiplicativeExpressionAccess().getRightAMinMaxExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_50);
            	    lv_right_3_0=ruleAMinMaxExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:3300:1: entryRuleAMinMaxExpression returns [EObject current=null] : iv_ruleAMinMaxExpression= ruleAMinMaxExpression EOF ;
    public final EObject entryRuleAMinMaxExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAMinMaxExpression = null;


        try {
            // InternalAlpha.g:3300:58: (iv_ruleAMinMaxExpression= ruleAMinMaxExpression EOF )
            // InternalAlpha.g:3301:2: iv_ruleAMinMaxExpression= ruleAMinMaxExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAMinMaxExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAMinMaxExpression=ruleAMinMaxExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAMinMaxExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:3307:1: ruleAMinMaxExpression returns [EObject current=null] : (this_AUnaryOrTerminalExpression_0= ruleAUnaryOrTerminalExpression ( () ( ( (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalExpression ) ) )* ) ;
    public final EObject ruleAMinMaxExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_AUnaryOrTerminalExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3313:2: ( (this_AUnaryOrTerminalExpression_0= ruleAUnaryOrTerminalExpression ( () ( ( (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalExpression ) ) )* ) )
            // InternalAlpha.g:3314:2: (this_AUnaryOrTerminalExpression_0= ruleAUnaryOrTerminalExpression ( () ( ( (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalExpression ) ) )* )
            {
            // InternalAlpha.g:3314:2: (this_AUnaryOrTerminalExpression_0= ruleAUnaryOrTerminalExpression ( () ( ( (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalExpression ) ) )* )
            // InternalAlpha.g:3315:3: this_AUnaryOrTerminalExpression_0= ruleAUnaryOrTerminalExpression ( () ( ( (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAMinMaxExpressionAccess().getAUnaryOrTerminalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_51);
            this_AUnaryOrTerminalExpression_0=ruleAUnaryOrTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AUnaryOrTerminalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAlpha.g:3323:3: ( () ( ( (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_OP_MIN && LA54_0<=RULE_OP_MAX)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalAlpha.g:3324:4: () ( ( (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX ) ) ) ( (lv_right_3_0= ruleAUnaryOrTerminalExpression ) )
            	    {
            	    // InternalAlpha.g:3324:4: ()
            	    // InternalAlpha.g:3325:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAMinMaxExpressionAccess().getAMinMaxExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalAlpha.g:3331:4: ( ( (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX ) ) )
            	    // InternalAlpha.g:3332:5: ( (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX ) )
            	    {
            	    // InternalAlpha.g:3332:5: ( (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX ) )
            	    // InternalAlpha.g:3333:6: (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX )
            	    {
            	    // InternalAlpha.g:3333:6: (lv_op_2_1= RULE_OP_MIN | lv_op_2_2= RULE_OP_MAX )
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==RULE_OP_MIN) ) {
            	        alt53=1;
            	    }
            	    else if ( (LA53_0==RULE_OP_MAX) ) {
            	        alt53=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 53, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // InternalAlpha.g:3334:7: lv_op_2_1= RULE_OP_MIN
            	            {
            	            lv_op_2_1=(Token)match(input,RULE_OP_MIN,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getAMinMaxExpressionAccess().getOpOP_MINTerminalRuleCall_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAMinMaxExpressionRule());
            	              							}
            	              							setWithLastConsumed(
            	              								current,
            	              								"op",
            	              								lv_op_2_1,
            	              								"alpha.Alpha.OP_MIN");
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalAlpha.g:3349:7: lv_op_2_2= RULE_OP_MAX
            	            {
            	            lv_op_2_2=(Token)match(input,RULE_OP_MAX,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getAMinMaxExpressionAccess().getOpOP_MAXTerminalRuleCall_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAMinMaxExpressionRule());
            	              							}
            	              							setWithLastConsumed(
            	              								current,
            	              								"op",
            	              								lv_op_2_2,
            	              								"alpha.Alpha.OP_MAX");
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalAlpha.g:3366:4: ( (lv_right_3_0= ruleAUnaryOrTerminalExpression ) )
            	    // InternalAlpha.g:3367:5: (lv_right_3_0= ruleAUnaryOrTerminalExpression )
            	    {
            	    // InternalAlpha.g:3367:5: (lv_right_3_0= ruleAUnaryOrTerminalExpression )
            	    // InternalAlpha.g:3368:6: lv_right_3_0= ruleAUnaryOrTerminalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAMinMaxExpressionAccess().getRightAUnaryOrTerminalExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_51);
            	    lv_right_3_0=ruleAUnaryOrTerminalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:3390:1: entryRuleAUnaryOrTerminalExpression returns [EObject current=null] : iv_ruleAUnaryOrTerminalExpression= ruleAUnaryOrTerminalExpression EOF ;
    public final EObject entryRuleAUnaryOrTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAUnaryOrTerminalExpression = null;


        try {
            // InternalAlpha.g:3390:67: (iv_ruleAUnaryOrTerminalExpression= ruleAUnaryOrTerminalExpression EOF )
            // InternalAlpha.g:3391:2: iv_ruleAUnaryOrTerminalExpression= ruleAUnaryOrTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAUnaryOrTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAUnaryOrTerminalExpression=ruleAUnaryOrTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAUnaryOrTerminalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:3397:1: ruleAUnaryOrTerminalExpression returns [EObject current=null] : (this_AUnaryExpression_0= ruleAUnaryExpression | this_AAlphabetsTerminalExpression_1= ruleAAlphabetsTerminalExpression ) ;
    public final EObject ruleAUnaryOrTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AUnaryExpression_0 = null;

        EObject this_AAlphabetsTerminalExpression_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3403:2: ( (this_AUnaryExpression_0= ruleAUnaryExpression | this_AAlphabetsTerminalExpression_1= ruleAAlphabetsTerminalExpression ) )
            // InternalAlpha.g:3404:2: (this_AUnaryExpression_0= ruleAUnaryExpression | this_AAlphabetsTerminalExpression_1= ruleAAlphabetsTerminalExpression )
            {
            // InternalAlpha.g:3404:2: (this_AUnaryExpression_0= ruleAUnaryExpression | this_AAlphabetsTerminalExpression_1= ruleAAlphabetsTerminalExpression )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_OP_MINUS||LA55_0==70) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_INT)||LA55_0==RULE_OP_PLUS||LA55_0==RULE_OP_MUL||(LA55_0>=RULE_OP_AND && LA55_0<=RULE_OP_OR)||LA55_0==RULE_OP_XOR||(LA55_0>=RULE_OP_MIN && LA55_0<=RULE_REAL)||LA55_0==38||LA55_0==64||(LA55_0>=71 && LA55_0<=72)||(LA55_0>=77 && LA55_0<=80)) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalAlpha.g:3405:3: this_AUnaryExpression_0= ruleAUnaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAUnaryOrTerminalExpressionAccess().getAUnaryExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AUnaryExpression_0=ruleAUnaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AUnaryExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3414:3: this_AAlphabetsTerminalExpression_1= ruleAAlphabetsTerminalExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAUnaryOrTerminalExpressionAccess().getAAlphabetsTerminalExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AAlphabetsTerminalExpression_1=ruleAAlphabetsTerminalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AAlphabetsTerminalExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:3426:1: entryRuleAUnaryExpression returns [EObject current=null] : iv_ruleAUnaryExpression= ruleAUnaryExpression EOF ;
    public final EObject entryRuleAUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAUnaryExpression = null;


        try {
            // InternalAlpha.g:3426:57: (iv_ruleAUnaryExpression= ruleAUnaryExpression EOF )
            // InternalAlpha.g:3427:2: iv_ruleAUnaryExpression= ruleAUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAUnaryExpression=ruleAUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAUnaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:3433:1: ruleAUnaryExpression returns [EObject current=null] : (this_ANotExpression_0= ruleANotExpression | this_ANegateExpression_1= ruleANegateExpression ) ;
    public final EObject ruleAUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ANotExpression_0 = null;

        EObject this_ANegateExpression_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3439:2: ( (this_ANotExpression_0= ruleANotExpression | this_ANegateExpression_1= ruleANegateExpression ) )
            // InternalAlpha.g:3440:2: (this_ANotExpression_0= ruleANotExpression | this_ANegateExpression_1= ruleANegateExpression )
            {
            // InternalAlpha.g:3440:2: (this_ANotExpression_0= ruleANotExpression | this_ANegateExpression_1= ruleANegateExpression )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==70) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_OP_MINUS) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalAlpha.g:3441:3: this_ANotExpression_0= ruleANotExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAUnaryExpressionAccess().getANotExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ANotExpression_0=ruleANotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ANotExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:3450:3: this_ANegateExpression_1= ruleANegateExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAUnaryExpressionAccess().getANegateExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ANegateExpression_1=ruleANegateExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ANegateExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:3462:1: entryRuleANotExpression returns [EObject current=null] : iv_ruleANotExpression= ruleANotExpression EOF ;
    public final EObject entryRuleANotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANotExpression = null;


        try {
            // InternalAlpha.g:3462:55: (iv_ruleANotExpression= ruleANotExpression EOF )
            // InternalAlpha.g:3463:2: iv_ruleANotExpression= ruleANotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getANotExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleANotExpression=ruleANotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleANotExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:3469:1: ruleANotExpression returns [EObject current=null] : ( ( (lv_op_0_0= 'not' ) ) ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) ) ) ;
    public final EObject ruleANotExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3475:2: ( ( ( (lv_op_0_0= 'not' ) ) ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) ) ) )
            // InternalAlpha.g:3476:2: ( ( (lv_op_0_0= 'not' ) ) ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) ) )
            {
            // InternalAlpha.g:3476:2: ( ( (lv_op_0_0= 'not' ) ) ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) ) )
            // InternalAlpha.g:3477:3: ( (lv_op_0_0= 'not' ) ) ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) )
            {
            // InternalAlpha.g:3477:3: ( (lv_op_0_0= 'not' ) )
            // InternalAlpha.g:3478:4: (lv_op_0_0= 'not' )
            {
            // InternalAlpha.g:3478:4: (lv_op_0_0= 'not' )
            // InternalAlpha.g:3479:5: lv_op_0_0= 'not'
            {
            lv_op_0_0=(Token)match(input,70,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_op_0_0, grammarAccess.getANotExpressionAccess().getOpNotKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getANotExpressionRule());
              					}
              					setWithLastConsumed(current, "op", lv_op_0_0, "not");
              				
            }

            }


            }

            // InternalAlpha.g:3491:3: ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) )
            // InternalAlpha.g:3492:4: (lv_expr_1_0= ruleAAlphabetsTerminalExpression )
            {
            // InternalAlpha.g:3492:4: (lv_expr_1_0= ruleAAlphabetsTerminalExpression )
            // InternalAlpha.g:3493:5: lv_expr_1_0= ruleAAlphabetsTerminalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getANotExpressionAccess().getExprAAlphabetsTerminalExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_1_0=ruleAAlphabetsTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:3514:1: entryRuleANegateExpression returns [EObject current=null] : iv_ruleANegateExpression= ruleANegateExpression EOF ;
    public final EObject entryRuleANegateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANegateExpression = null;


        try {
            // InternalAlpha.g:3514:58: (iv_ruleANegateExpression= ruleANegateExpression EOF )
            // InternalAlpha.g:3515:2: iv_ruleANegateExpression= ruleANegateExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getANegateExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleANegateExpression=ruleANegateExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleANegateExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:3521:1: ruleANegateExpression returns [EObject current=null] : ( ( (lv_op_0_0= RULE_OP_MINUS ) ) ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) ) ) ;
    public final EObject ruleANegateExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3527:2: ( ( ( (lv_op_0_0= RULE_OP_MINUS ) ) ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) ) ) )
            // InternalAlpha.g:3528:2: ( ( (lv_op_0_0= RULE_OP_MINUS ) ) ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) ) )
            {
            // InternalAlpha.g:3528:2: ( ( (lv_op_0_0= RULE_OP_MINUS ) ) ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) ) )
            // InternalAlpha.g:3529:3: ( (lv_op_0_0= RULE_OP_MINUS ) ) ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) )
            {
            // InternalAlpha.g:3529:3: ( (lv_op_0_0= RULE_OP_MINUS ) )
            // InternalAlpha.g:3530:4: (lv_op_0_0= RULE_OP_MINUS )
            {
            // InternalAlpha.g:3530:4: (lv_op_0_0= RULE_OP_MINUS )
            // InternalAlpha.g:3531:5: lv_op_0_0= RULE_OP_MINUS
            {
            lv_op_0_0=(Token)match(input,RULE_OP_MINUS,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_op_0_0, grammarAccess.getANegateExpressionAccess().getOpOP_MINUSTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            // InternalAlpha.g:3547:3: ( (lv_expr_1_0= ruleAAlphabetsTerminalExpression ) )
            // InternalAlpha.g:3548:4: (lv_expr_1_0= ruleAAlphabetsTerminalExpression )
            {
            // InternalAlpha.g:3548:4: (lv_expr_1_0= ruleAAlphabetsTerminalExpression )
            // InternalAlpha.g:3549:5: lv_expr_1_0= ruleAAlphabetsTerminalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getANegateExpressionAccess().getExprAAlphabetsTerminalExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_1_0=ruleAAlphabetsTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:3570:1: entryRuleACaseExpression returns [EObject current=null] : iv_ruleACaseExpression= ruleACaseExpression EOF ;
    public final EObject entryRuleACaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACaseExpression = null;


        try {
            // InternalAlpha.g:3570:56: (iv_ruleACaseExpression= ruleACaseExpression EOF )
            // InternalAlpha.g:3571:2: iv_ruleACaseExpression= ruleACaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getACaseExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleACaseExpression=ruleACaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleACaseExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:3577:1: ruleACaseExpression returns [EObject current=null] : (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' ) ;
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
            // InternalAlpha.g:3583:2: ( (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' ) )
            // InternalAlpha.g:3584:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' )
            {
            // InternalAlpha.g:3584:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}' )
            // InternalAlpha.g:3585:3: otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( (lv_exprs_3_0= ruleAAlphaExpression ) ) otherlv_4= ';' )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getACaseExpressionAccess().getCaseKeyword_0());
              		
            }
            // InternalAlpha.g:3589:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalAlpha.g:3590:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalAlpha.g:3590:4: (lv_name_1_0= RULE_ID )
                    // InternalAlpha.g:3591:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_1_0, grammarAccess.getACaseExpressionAccess().getNameIDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }

            otherlv_2=(Token)match(input,33,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getACaseExpressionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalAlpha.g:3611:3: ( ( (lv_exprs_3_0= ruleAAlphaExpression ) ) otherlv_4= ';' )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_INT)||(LA58_0>=RULE_OP_PLUS && LA58_0<=RULE_OP_MUL)||(LA58_0>=RULE_OP_AND && LA58_0<=RULE_OP_OR)||LA58_0==RULE_OP_XOR||(LA58_0>=RULE_OP_MIN && LA58_0<=RULE_REAL)||LA58_0==33||LA58_0==38||LA58_0==64||(LA58_0>=70 && LA58_0<=72)||LA58_0==74||(LA58_0>=77 && LA58_0<=81)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalAlpha.g:3612:4: ( (lv_exprs_3_0= ruleAAlphaExpression ) ) otherlv_4= ';'
            	    {
            	    // InternalAlpha.g:3612:4: ( (lv_exprs_3_0= ruleAAlphaExpression ) )
            	    // InternalAlpha.g:3613:5: (lv_exprs_3_0= ruleAAlphaExpression )
            	    {
            	    // InternalAlpha.g:3613:5: (lv_exprs_3_0= ruleAAlphaExpression )
            	    // InternalAlpha.g:3614:6: lv_exprs_3_0= ruleAAlphaExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getACaseExpressionAccess().getExprsAAlphaExpressionParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_exprs_3_0=ruleAAlphaExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    otherlv_4=(Token)match(input,67,FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getACaseExpressionAccess().getSemicolonKeyword_3_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);

            otherlv_5=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getACaseExpressionAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:3644:1: entryRuleADependenceExpression returns [EObject current=null] : iv_ruleADependenceExpression= ruleADependenceExpression EOF ;
    public final EObject entryRuleADependenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADependenceExpression = null;


        try {
            // InternalAlpha.g:3644:62: (iv_ruleADependenceExpression= ruleADependenceExpression EOF )
            // InternalAlpha.g:3645:2: iv_ruleADependenceExpression= ruleADependenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getADependenceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleADependenceExpression=ruleADependenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleADependenceExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:3651:1: ruleADependenceExpression returns [EObject current=null] : ( ( (lv_function_0_0= ruleAFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAAlphabetsTerminalExpression ) ) ) ;
    public final EObject ruleADependenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_function_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3657:2: ( ( ( (lv_function_0_0= ruleAFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAAlphabetsTerminalExpression ) ) ) )
            // InternalAlpha.g:3658:2: ( ( (lv_function_0_0= ruleAFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAAlphabetsTerminalExpression ) ) )
            {
            // InternalAlpha.g:3658:2: ( ( (lv_function_0_0= ruleAFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAAlphabetsTerminalExpression ) ) )
            // InternalAlpha.g:3659:3: ( (lv_function_0_0= ruleAFunction ) ) otherlv_1= '@' ( (lv_expr_2_0= ruleAAlphabetsTerminalExpression ) )
            {
            // InternalAlpha.g:3659:3: ( (lv_function_0_0= ruleAFunction ) )
            // InternalAlpha.g:3660:4: (lv_function_0_0= ruleAFunction )
            {
            // InternalAlpha.g:3660:4: (lv_function_0_0= ruleAFunction )
            // InternalAlpha.g:3661:5: lv_function_0_0= ruleAFunction
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getADependenceExpressionAccess().getFunctionAFunctionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_54);
            lv_function_0_0=ruleAFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getADependenceExpressionRule());
              					}
              					set(
              						current,
              						"function",
              						lv_function_0_0,
              						"alpha.Alpha.AFunction");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,55,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getADependenceExpressionAccess().getCommercialAtKeyword_1());
              		
            }
            // InternalAlpha.g:3682:3: ( (lv_expr_2_0= ruleAAlphabetsTerminalExpression ) )
            // InternalAlpha.g:3683:4: (lv_expr_2_0= ruleAAlphabetsTerminalExpression )
            {
            // InternalAlpha.g:3683:4: (lv_expr_2_0= ruleAAlphabetsTerminalExpression )
            // InternalAlpha.g:3684:5: lv_expr_2_0= ruleAAlphabetsTerminalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getADependenceExpressionAccess().getExprAAlphabetsTerminalExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleAAlphabetsTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleASelectDependenceExpression"
    // InternalAlpha.g:3705:1: entryRuleASelectDependenceExpression returns [EObject current=null] : iv_ruleASelectDependenceExpression= ruleASelectDependenceExpression EOF ;
    public final EObject entryRuleASelectDependenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleASelectDependenceExpression = null;


        try {
            // InternalAlpha.g:3705:68: (iv_ruleASelectDependenceExpression= ruleASelectDependenceExpression EOF )
            // InternalAlpha.g:3706:2: iv_ruleASelectDependenceExpression= ruleASelectDependenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getASelectDependenceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleASelectDependenceExpression=ruleASelectDependenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleASelectDependenceExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleASelectDependenceExpression"


    // $ANTLR start "ruleASelectDependenceExpression"
    // InternalAlpha.g:3712:1: ruleASelectDependenceExpression returns [EObject current=null] : (otherlv_0= 'select' ( (lv_relation_1_0= ruleAPolyhedralObjectExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAAlphabetsTerminalExpression ) ) ) ;
    public final EObject ruleASelectDependenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_relation_1_0 = null;

        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3718:2: ( (otherlv_0= 'select' ( (lv_relation_1_0= ruleAPolyhedralObjectExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAAlphabetsTerminalExpression ) ) ) )
            // InternalAlpha.g:3719:2: (otherlv_0= 'select' ( (lv_relation_1_0= ruleAPolyhedralObjectExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAAlphabetsTerminalExpression ) ) )
            {
            // InternalAlpha.g:3719:2: (otherlv_0= 'select' ( (lv_relation_1_0= ruleAPolyhedralObjectExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAAlphabetsTerminalExpression ) ) )
            // InternalAlpha.g:3720:3: otherlv_0= 'select' ( (lv_relation_1_0= ruleAPolyhedralObjectExpression ) ) otherlv_2= 'from' ( (lv_expr_3_0= ruleAAlphabetsTerminalExpression ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getASelectDependenceExpressionAccess().getSelectKeyword_0());
              		
            }
            // InternalAlpha.g:3724:3: ( (lv_relation_1_0= ruleAPolyhedralObjectExpression ) )
            // InternalAlpha.g:3725:4: (lv_relation_1_0= ruleAPolyhedralObjectExpression )
            {
            // InternalAlpha.g:3725:4: (lv_relation_1_0= ruleAPolyhedralObjectExpression )
            // InternalAlpha.g:3726:5: lv_relation_1_0= ruleAPolyhedralObjectExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getASelectDependenceExpressionAccess().getRelationAPolyhedralObjectExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_55);
            lv_relation_1_0=ruleAPolyhedralObjectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getASelectDependenceExpressionRule());
              					}
              					set(
              						current,
              						"relation",
              						lv_relation_1_0,
              						"alpha.Alpha.APolyhedralObjectExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,73,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getASelectDependenceExpressionAccess().getFromKeyword_2());
              		
            }
            // InternalAlpha.g:3747:3: ( (lv_expr_3_0= ruleAAlphabetsTerminalExpression ) )
            // InternalAlpha.g:3748:4: (lv_expr_3_0= ruleAAlphabetsTerminalExpression )
            {
            // InternalAlpha.g:3748:4: (lv_expr_3_0= ruleAAlphabetsTerminalExpression )
            // InternalAlpha.g:3749:5: lv_expr_3_0= ruleAAlphabetsTerminalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getASelectDependenceExpressionAccess().getExprAAlphabetsTerminalExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_3_0=ruleAAlphabetsTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getASelectDependenceExpressionRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_3_0,
              						"alpha.Alpha.AAlphabetsTerminalExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleASelectDependenceExpression"


    // $ANTLR start "entryRuleADependenceInArrayNotation"
    // InternalAlpha.g:3770:1: entryRuleADependenceInArrayNotation returns [EObject current=null] : iv_ruleADependenceInArrayNotation= ruleADependenceInArrayNotation EOF ;
    public final EObject entryRuleADependenceInArrayNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADependenceInArrayNotation = null;


        try {
            // InternalAlpha.g:3770:67: (iv_ruleADependenceInArrayNotation= ruleADependenceInArrayNotation EOF )
            // InternalAlpha.g:3771:2: iv_ruleADependenceInArrayNotation= ruleADependenceInArrayNotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getADependenceInArrayNotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleADependenceInArrayNotation=ruleADependenceInArrayNotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleADependenceInArrayNotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:3777:1: ruleADependenceInArrayNotation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_dep_2_0= ruleAIndexAffineExpressionList ) ) otherlv_3= ']' ) ;
    public final EObject ruleADependenceInArrayNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dep_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3783:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_dep_2_0= ruleAIndexAffineExpressionList ) ) otherlv_3= ']' ) )
            // InternalAlpha.g:3784:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_dep_2_0= ruleAIndexAffineExpressionList ) ) otherlv_3= ']' )
            {
            // InternalAlpha.g:3784:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_dep_2_0= ruleAIndexAffineExpressionList ) ) otherlv_3= ']' )
            // InternalAlpha.g:3785:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_dep_2_0= ruleAIndexAffineExpressionList ) ) otherlv_3= ']'
            {
            // InternalAlpha.g:3785:3: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:3786:4: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:3786:4: (otherlv_0= RULE_ID )
            // InternalAlpha.g:3787:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getADependenceInArrayNotationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getADependenceInArrayNotationAccess().getVarAVariableCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,64,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getADependenceInArrayNotationAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalAlpha.g:3802:3: ( (lv_dep_2_0= ruleAIndexAffineExpressionList ) )
            // InternalAlpha.g:3803:4: (lv_dep_2_0= ruleAIndexAffineExpressionList )
            {
            // InternalAlpha.g:3803:4: (lv_dep_2_0= ruleAIndexAffineExpressionList )
            // InternalAlpha.g:3804:5: lv_dep_2_0= ruleAIndexAffineExpressionList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getADependenceInArrayNotationAccess().getDepAIndexAffineExpressionListParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_dep_2_0=ruleAIndexAffineExpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getADependenceInArrayNotationAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:3829:1: entryRuleAIfExpression returns [EObject current=null] : iv_ruleAIfExpression= ruleAIfExpression EOF ;
    public final EObject entryRuleAIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAIfExpression = null;


        try {
            // InternalAlpha.g:3829:54: (iv_ruleAIfExpression= ruleAIfExpression EOF )
            // InternalAlpha.g:3830:2: iv_ruleAIfExpression= ruleAIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAIfExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAIfExpression=ruleAIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAIfExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:3836:1: ruleAIfExpression returns [EObject current=null] : (otherlv_0= 'if' ( (lv_cond_1_0= ruleAAlphaExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleAAlphaExpression ) ) otherlv_4= 'else' ( (lv_else_5_0= ruleAAlphaExpression ) ) ) ;
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
            // InternalAlpha.g:3842:2: ( (otherlv_0= 'if' ( (lv_cond_1_0= ruleAAlphaExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleAAlphaExpression ) ) otherlv_4= 'else' ( (lv_else_5_0= ruleAAlphaExpression ) ) ) )
            // InternalAlpha.g:3843:2: (otherlv_0= 'if' ( (lv_cond_1_0= ruleAAlphaExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleAAlphaExpression ) ) otherlv_4= 'else' ( (lv_else_5_0= ruleAAlphaExpression ) ) )
            {
            // InternalAlpha.g:3843:2: (otherlv_0= 'if' ( (lv_cond_1_0= ruleAAlphaExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleAAlphaExpression ) ) otherlv_4= 'else' ( (lv_else_5_0= ruleAAlphaExpression ) ) )
            // InternalAlpha.g:3844:3: otherlv_0= 'if' ( (lv_cond_1_0= ruleAAlphaExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleAAlphaExpression ) ) otherlv_4= 'else' ( (lv_else_5_0= ruleAAlphaExpression ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAIfExpressionAccess().getIfKeyword_0());
              		
            }
            // InternalAlpha.g:3848:3: ( (lv_cond_1_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:3849:4: (lv_cond_1_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:3849:4: (lv_cond_1_0= ruleAAlphaExpression )
            // InternalAlpha.g:3850:5: lv_cond_1_0= ruleAAlphaExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAIfExpressionAccess().getCondAAlphaExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_56);
            lv_cond_1_0=ruleAAlphaExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,75,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAIfExpressionAccess().getThenKeyword_2());
              		
            }
            // InternalAlpha.g:3871:3: ( (lv_then_3_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:3872:4: (lv_then_3_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:3872:4: (lv_then_3_0= ruleAAlphaExpression )
            // InternalAlpha.g:3873:5: lv_then_3_0= ruleAAlphaExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAIfExpressionAccess().getThenAAlphaExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_57);
            lv_then_3_0=ruleAAlphaExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_4=(Token)match(input,76,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAIfExpressionAccess().getElseKeyword_4());
              		
            }
            // InternalAlpha.g:3894:3: ( (lv_else_5_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:3895:4: (lv_else_5_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:3895:4: (lv_else_5_0= ruleAAlphaExpression )
            // InternalAlpha.g:3896:5: lv_else_5_0= ruleAAlphaExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAIfExpressionAccess().getElseAAlphaExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_else_5_0=ruleAAlphaExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:3917:1: entryRuleAIndexExpression returns [EObject current=null] : iv_ruleAIndexExpression= ruleAIndexExpression EOF ;
    public final EObject entryRuleAIndexExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAIndexExpression = null;


        try {
            // InternalAlpha.g:3917:57: (iv_ruleAIndexExpression= ruleAIndexExpression EOF )
            // InternalAlpha.g:3918:2: iv_ruleAIndexExpression= ruleAIndexExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAIndexExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAIndexExpression=ruleAIndexExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAIndexExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:3924:1: ruleAIndexExpression returns [EObject current=null] : (otherlv_0= 'val(' ( (lv_indexes_1_0= ruleAIndexList ) ) otherlv_2= '->' ( (lv_func_3_0= ruleIndexAffineExpressionTerminal ) ) otherlv_4= ')' ) ;
    public final EObject ruleAIndexExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_indexes_1_0 = null;

        AntlrDatatypeRuleToken lv_func_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3930:2: ( (otherlv_0= 'val(' ( (lv_indexes_1_0= ruleAIndexList ) ) otherlv_2= '->' ( (lv_func_3_0= ruleIndexAffineExpressionTerminal ) ) otherlv_4= ')' ) )
            // InternalAlpha.g:3931:2: (otherlv_0= 'val(' ( (lv_indexes_1_0= ruleAIndexList ) ) otherlv_2= '->' ( (lv_func_3_0= ruleIndexAffineExpressionTerminal ) ) otherlv_4= ')' )
            {
            // InternalAlpha.g:3931:2: (otherlv_0= 'val(' ( (lv_indexes_1_0= ruleAIndexList ) ) otherlv_2= '->' ( (lv_func_3_0= ruleIndexAffineExpressionTerminal ) ) otherlv_4= ')' )
            // InternalAlpha.g:3932:3: otherlv_0= 'val(' ( (lv_indexes_1_0= ruleAIndexList ) ) otherlv_2= '->' ( (lv_func_3_0= ruleIndexAffineExpressionTerminal ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAIndexExpressionAccess().getValKeyword_0());
              		
            }
            // InternalAlpha.g:3936:3: ( (lv_indexes_1_0= ruleAIndexList ) )
            // InternalAlpha.g:3937:4: (lv_indexes_1_0= ruleAIndexList )
            {
            // InternalAlpha.g:3937:4: (lv_indexes_1_0= ruleAIndexList )
            // InternalAlpha.g:3938:5: lv_indexes_1_0= ruleAIndexList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAIndexExpressionAccess().getIndexesAIndexListParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_indexes_1_0=ruleAIndexList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAIndexExpressionRule());
              					}
              					set(
              						current,
              						"indexes",
              						lv_indexes_1_0,
              						"alpha.Alpha.AIndexList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,68,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAIndexExpressionAccess().getHyphenMinusGreaterThanSignKeyword_2());
              		
            }
            // InternalAlpha.g:3959:3: ( (lv_func_3_0= ruleIndexAffineExpressionTerminal ) )
            // InternalAlpha.g:3960:4: (lv_func_3_0= ruleIndexAffineExpressionTerminal )
            {
            // InternalAlpha.g:3960:4: (lv_func_3_0= ruleIndexAffineExpressionTerminal )
            // InternalAlpha.g:3961:5: lv_func_3_0= ruleIndexAffineExpressionTerminal
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAIndexExpressionAccess().getFuncIndexAffineExpressionTerminalParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_func_3_0=ruleIndexAffineExpressionTerminal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAIndexExpressionRule());
              					}
              					set(
              						current,
              						"func",
              						lv_func_3_0,
              						"alpha.Alpha.IndexAffineExpressionTerminal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAIndexExpressionAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleAIndexExpressionInArrayNotation"
    // InternalAlpha.g:3986:1: entryRuleAIndexExpressionInArrayNotation returns [EObject current=null] : iv_ruleAIndexExpressionInArrayNotation= ruleAIndexExpressionInArrayNotation EOF ;
    public final EObject entryRuleAIndexExpressionInArrayNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAIndexExpressionInArrayNotation = null;


        try {
            // InternalAlpha.g:3986:72: (iv_ruleAIndexExpressionInArrayNotation= ruleAIndexExpressionInArrayNotation EOF )
            // InternalAlpha.g:3987:2: iv_ruleAIndexExpressionInArrayNotation= ruleAIndexExpressionInArrayNotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAIndexExpressionInArrayNotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAIndexExpressionInArrayNotation=ruleAIndexExpressionInArrayNotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAIndexExpressionInArrayNotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAIndexExpressionInArrayNotation"


    // $ANTLR start "ruleAIndexExpressionInArrayNotation"
    // InternalAlpha.g:3993:1: ruleAIndexExpressionInArrayNotation returns [EObject current=null] : (otherlv_0= '[' ( (lv_func_1_0= ruleIndexAffineExpressionTerminal ) ) otherlv_2= ']' ) ;
    public final EObject ruleAIndexExpressionInArrayNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_func_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:3999:2: ( (otherlv_0= '[' ( (lv_func_1_0= ruleIndexAffineExpressionTerminal ) ) otherlv_2= ']' ) )
            // InternalAlpha.g:4000:2: (otherlv_0= '[' ( (lv_func_1_0= ruleIndexAffineExpressionTerminal ) ) otherlv_2= ']' )
            {
            // InternalAlpha.g:4000:2: (otherlv_0= '[' ( (lv_func_1_0= ruleIndexAffineExpressionTerminal ) ) otherlv_2= ']' )
            // InternalAlpha.g:4001:3: otherlv_0= '[' ( (lv_func_1_0= ruleIndexAffineExpressionTerminal ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAIndexExpressionInArrayNotationAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalAlpha.g:4005:3: ( (lv_func_1_0= ruleIndexAffineExpressionTerminal ) )
            // InternalAlpha.g:4006:4: (lv_func_1_0= ruleIndexAffineExpressionTerminal )
            {
            // InternalAlpha.g:4006:4: (lv_func_1_0= ruleIndexAffineExpressionTerminal )
            // InternalAlpha.g:4007:5: lv_func_1_0= ruleIndexAffineExpressionTerminal
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAIndexExpressionInArrayNotationAccess().getFuncIndexAffineExpressionTerminalParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_func_1_0=ruleIndexAffineExpressionTerminal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAIndexExpressionInArrayNotationRule());
              					}
              					set(
              						current,
              						"func",
              						lv_func_1_0,
              						"alpha.Alpha.IndexAffineExpressionTerminal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAIndexExpressionInArrayNotationAccess().getRightSquareBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAIndexExpressionInArrayNotation"


    // $ANTLR start "entryRuleAReduceExpression"
    // InternalAlpha.g:4032:1: entryRuleAReduceExpression returns [EObject current=null] : iv_ruleAReduceExpression= ruleAReduceExpression EOF ;
    public final EObject entryRuleAReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAReduceExpression = null;


        try {
            // InternalAlpha.g:4032:58: (iv_ruleAReduceExpression= ruleAReduceExpression EOF )
            // InternalAlpha.g:4033:2: iv_ruleAReduceExpression= ruleAReduceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAReduceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAReduceExpression=ruleAReduceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAReduceExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:4039:1: ruleAReduceExpression returns [EObject current=null] : (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_op_2_0= ruleAReductionOperator ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_expr_6_0= ruleAAlphaExpression ) ) otherlv_7= ')' ) ;
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
            // InternalAlpha.g:4045:2: ( (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_op_2_0= ruleAReductionOperator ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_expr_6_0= ruleAAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:4046:2: (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_op_2_0= ruleAReductionOperator ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_expr_6_0= ruleAAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:4046:2: (otherlv_0= 'reduce' otherlv_1= '(' ( (lv_op_2_0= ruleAReductionOperator ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_expr_6_0= ruleAAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:4047:3: otherlv_0= 'reduce' otherlv_1= '(' ( (lv_op_2_0= ruleAReductionOperator ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_expr_6_0= ruleAAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAReduceExpressionAccess().getReduceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,38,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAReduceExpressionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAlpha.g:4055:3: ( (lv_op_2_0= ruleAReductionOperator ) )
            // InternalAlpha.g:4056:4: (lv_op_2_0= ruleAReductionOperator )
            {
            // InternalAlpha.g:4056:4: (lv_op_2_0= ruleAReductionOperator )
            // InternalAlpha.g:4057:5: lv_op_2_0= ruleAReductionOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAReduceExpressionAccess().getOpAReductionOperatorParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_61);
            lv_op_2_0=ruleAReductionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,51,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAReduceExpressionAccess().getCommaKeyword_3());
              		
            }
            // InternalAlpha.g:4078:3: ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) )
            // InternalAlpha.g:4079:4: ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:4079:4: ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) )
            // InternalAlpha.g:4080:5: (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation )
            {
            // InternalAlpha.g:4080:5: (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==38) ) {
                alt59=1;
            }
            else if ( (LA59_0==64) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalAlpha.g:4081:6: lv_projection_4_1= ruleAFunction
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAReduceExpressionAccess().getProjectionAFunctionParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_61);
                    lv_projection_4_1=ruleAFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4097:6: lv_projection_4_2= ruleAFunctionInArrayNotation
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAReduceExpressionAccess().getProjectionAFunctionInArrayNotationParserRuleCall_4_0_1());
                      					
                    }
                    pushFollow(FOLLOW_61);
                    lv_projection_4_2=ruleAFunctionInArrayNotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,51,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAReduceExpressionAccess().getCommaKeyword_5());
              		
            }
            // InternalAlpha.g:4119:3: ( (lv_expr_6_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:4120:4: (lv_expr_6_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:4120:4: (lv_expr_6_0= ruleAAlphaExpression )
            // InternalAlpha.g:4121:5: lv_expr_6_0= ruleAAlphaExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAReduceExpressionAccess().getExprAAlphaExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_expr_6_0=ruleAAlphaExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_7=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getAReduceExpressionAccess().getRightParenthesisKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:4146:1: entryRuleAArgReduceExpression returns [EObject current=null] : iv_ruleAArgReduceExpression= ruleAArgReduceExpression EOF ;
    public final EObject entryRuleAArgReduceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAArgReduceExpression = null;


        try {
            // InternalAlpha.g:4146:61: (iv_ruleAArgReduceExpression= ruleAArgReduceExpression EOF )
            // InternalAlpha.g:4147:2: iv_ruleAArgReduceExpression= ruleAArgReduceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAArgReduceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAArgReduceExpression=ruleAArgReduceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAArgReduceExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:4153:1: ruleAArgReduceExpression returns [EObject current=null] : (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_op_2_0= ruleAReductionOperator ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_expr_6_0= ruleAAlphaExpression ) ) otherlv_7= ')' ) ;
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
            // InternalAlpha.g:4159:2: ( (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_op_2_0= ruleAReductionOperator ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_expr_6_0= ruleAAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:4160:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_op_2_0= ruleAReductionOperator ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_expr_6_0= ruleAAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:4160:2: (otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_op_2_0= ruleAReductionOperator ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_expr_6_0= ruleAAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:4161:3: otherlv_0= 'argreduce' otherlv_1= '(' ( (lv_op_2_0= ruleAReductionOperator ) ) otherlv_3= ',' ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) ) otherlv_5= ',' ( (lv_expr_6_0= ruleAAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAArgReduceExpressionAccess().getArgreduceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,38,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAArgReduceExpressionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAlpha.g:4169:3: ( (lv_op_2_0= ruleAReductionOperator ) )
            // InternalAlpha.g:4170:4: (lv_op_2_0= ruleAReductionOperator )
            {
            // InternalAlpha.g:4170:4: (lv_op_2_0= ruleAReductionOperator )
            // InternalAlpha.g:4171:5: lv_op_2_0= ruleAReductionOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAArgReduceExpressionAccess().getOpAReductionOperatorParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_61);
            lv_op_2_0=ruleAReductionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,51,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAArgReduceExpressionAccess().getCommaKeyword_3());
              		
            }
            // InternalAlpha.g:4192:3: ( ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) ) )
            // InternalAlpha.g:4193:4: ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) )
            {
            // InternalAlpha.g:4193:4: ( (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation ) )
            // InternalAlpha.g:4194:5: (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation )
            {
            // InternalAlpha.g:4194:5: (lv_projection_4_1= ruleAFunction | lv_projection_4_2= ruleAFunctionInArrayNotation )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==38) ) {
                alt60=1;
            }
            else if ( (LA60_0==64) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalAlpha.g:4195:6: lv_projection_4_1= ruleAFunction
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAArgReduceExpressionAccess().getProjectionAFunctionParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_61);
                    lv_projection_4_1=ruleAFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4211:6: lv_projection_4_2= ruleAFunctionInArrayNotation
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAArgReduceExpressionAccess().getProjectionAFunctionInArrayNotationParserRuleCall_4_0_1());
                      					
                    }
                    pushFollow(FOLLOW_61);
                    lv_projection_4_2=ruleAFunctionInArrayNotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,51,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAArgReduceExpressionAccess().getCommaKeyword_5());
              		
            }
            // InternalAlpha.g:4233:3: ( (lv_expr_6_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:4234:4: (lv_expr_6_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:4234:4: (lv_expr_6_0= ruleAAlphaExpression )
            // InternalAlpha.g:4235:5: lv_expr_6_0= ruleAAlphaExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAArgReduceExpressionAccess().getExprAAlphaExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_expr_6_0=ruleAAlphaExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_7=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getAArgReduceExpressionAccess().getRightParenthesisKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleAConvExpression"
    // InternalAlpha.g:4260:1: entryRuleAConvExpression returns [EObject current=null] : iv_ruleAConvExpression= ruleAConvExpression EOF ;
    public final EObject entryRuleAConvExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAConvExpression = null;


        try {
            // InternalAlpha.g:4260:56: (iv_ruleAConvExpression= ruleAConvExpression EOF )
            // InternalAlpha.g:4261:2: iv_ruleAConvExpression= ruleAConvExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAConvExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAConvExpression=ruleAConvExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAConvExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAConvExpression"


    // $ANTLR start "ruleAConvExpression"
    // InternalAlpha.g:4267:1: ruleAConvExpression returns [EObject current=null] : (otherlv_0= 'conv' otherlv_1= '(' ( (lv_domain_2_0= ruleAPolyhedralObjectExpression ) ) otherlv_3= ',' ( (lv_kernel_4_0= ruleAAlphaExpression ) ) otherlv_5= ',' ( (lv_data_6_0= ruleAAlphaExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleAConvExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_domain_2_0 = null;

        EObject lv_kernel_4_0 = null;

        EObject lv_data_6_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4273:2: ( (otherlv_0= 'conv' otherlv_1= '(' ( (lv_domain_2_0= ruleAPolyhedralObjectExpression ) ) otherlv_3= ',' ( (lv_kernel_4_0= ruleAAlphaExpression ) ) otherlv_5= ',' ( (lv_data_6_0= ruleAAlphaExpression ) ) otherlv_7= ')' ) )
            // InternalAlpha.g:4274:2: (otherlv_0= 'conv' otherlv_1= '(' ( (lv_domain_2_0= ruleAPolyhedralObjectExpression ) ) otherlv_3= ',' ( (lv_kernel_4_0= ruleAAlphaExpression ) ) otherlv_5= ',' ( (lv_data_6_0= ruleAAlphaExpression ) ) otherlv_7= ')' )
            {
            // InternalAlpha.g:4274:2: (otherlv_0= 'conv' otherlv_1= '(' ( (lv_domain_2_0= ruleAPolyhedralObjectExpression ) ) otherlv_3= ',' ( (lv_kernel_4_0= ruleAAlphaExpression ) ) otherlv_5= ',' ( (lv_data_6_0= ruleAAlphaExpression ) ) otherlv_7= ')' )
            // InternalAlpha.g:4275:3: otherlv_0= 'conv' otherlv_1= '(' ( (lv_domain_2_0= ruleAPolyhedralObjectExpression ) ) otherlv_3= ',' ( (lv_kernel_4_0= ruleAAlphaExpression ) ) otherlv_5= ',' ( (lv_data_6_0= ruleAAlphaExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAConvExpressionAccess().getConvKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,38,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAConvExpressionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAlpha.g:4283:3: ( (lv_domain_2_0= ruleAPolyhedralObjectExpression ) )
            // InternalAlpha.g:4284:4: (lv_domain_2_0= ruleAPolyhedralObjectExpression )
            {
            // InternalAlpha.g:4284:4: (lv_domain_2_0= ruleAPolyhedralObjectExpression )
            // InternalAlpha.g:4285:5: lv_domain_2_0= ruleAPolyhedralObjectExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAConvExpressionAccess().getDomainAPolyhedralObjectExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_61);
            lv_domain_2_0=ruleAPolyhedralObjectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAConvExpressionRule());
              					}
              					set(
              						current,
              						"domain",
              						lv_domain_2_0,
              						"alpha.Alpha.APolyhedralObjectExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,51,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAConvExpressionAccess().getCommaKeyword_3());
              		
            }
            // InternalAlpha.g:4306:3: ( (lv_kernel_4_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:4307:4: (lv_kernel_4_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:4307:4: (lv_kernel_4_0= ruleAAlphaExpression )
            // InternalAlpha.g:4308:5: lv_kernel_4_0= ruleAAlphaExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAConvExpressionAccess().getKernelAAlphaExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_61);
            lv_kernel_4_0=ruleAAlphaExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAConvExpressionRule());
              					}
              					set(
              						current,
              						"kernel",
              						lv_kernel_4_0,
              						"alpha.Alpha.AAlphaExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,51,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAConvExpressionAccess().getCommaKeyword_5());
              		
            }
            // InternalAlpha.g:4329:3: ( (lv_data_6_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:4330:4: (lv_data_6_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:4330:4: (lv_data_6_0= ruleAAlphaExpression )
            // InternalAlpha.g:4331:5: lv_data_6_0= ruleAAlphaExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAConvExpressionAccess().getDataAAlphaExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_data_6_0=ruleAAlphaExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAConvExpressionRule());
              					}
              					set(
              						current,
              						"data",
              						lv_data_6_0,
              						"alpha.Alpha.AAlphaExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getAConvExpressionAccess().getRightParenthesisKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAConvExpression"


    // $ANTLR start "entryRuleARestrictExpression"
    // InternalAlpha.g:4356:1: entryRuleARestrictExpression returns [EObject current=null] : iv_ruleARestrictExpression= ruleARestrictExpression EOF ;
    public final EObject entryRuleARestrictExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARestrictExpression = null;


        try {
            // InternalAlpha.g:4356:60: (iv_ruleARestrictExpression= ruleARestrictExpression EOF )
            // InternalAlpha.g:4357:2: iv_ruleARestrictExpression= ruleARestrictExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getARestrictExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleARestrictExpression=ruleARestrictExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleARestrictExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:4363:1: ruleARestrictExpression returns [EObject current=null] : ( ( (lv_domain_0_0= ruleAPolyObjectInRestrict ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAAlphaExpression ) ) ) ;
    public final EObject ruleARestrictExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_domain_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4369:2: ( ( ( (lv_domain_0_0= ruleAPolyObjectInRestrict ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAAlphaExpression ) ) ) )
            // InternalAlpha.g:4370:2: ( ( (lv_domain_0_0= ruleAPolyObjectInRestrict ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAAlphaExpression ) ) )
            {
            // InternalAlpha.g:4370:2: ( ( (lv_domain_0_0= ruleAPolyObjectInRestrict ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAAlphaExpression ) ) )
            // InternalAlpha.g:4371:3: ( (lv_domain_0_0= ruleAPolyObjectInRestrict ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleAAlphaExpression ) )
            {
            // InternalAlpha.g:4371:3: ( (lv_domain_0_0= ruleAPolyObjectInRestrict ) )
            // InternalAlpha.g:4372:4: (lv_domain_0_0= ruleAPolyObjectInRestrict )
            {
            // InternalAlpha.g:4372:4: (lv_domain_0_0= ruleAPolyObjectInRestrict )
            // InternalAlpha.g:4373:5: lv_domain_0_0= ruleAPolyObjectInRestrict
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getARestrictExpressionAccess().getDomainAPolyObjectInRestrictParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_domain_0_0=ruleAPolyObjectInRestrict();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getARestrictExpressionRule());
              					}
              					set(
              						current,
              						"domain",
              						lv_domain_0_0,
              						"alpha.Alpha.APolyObjectInRestrict");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,50,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getARestrictExpressionAccess().getColonKeyword_1());
              		
            }
            // InternalAlpha.g:4394:3: ( (lv_expr_2_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:4395:4: (lv_expr_2_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:4395:4: (lv_expr_2_0= ruleAAlphaExpression )
            // InternalAlpha.g:4396:5: lv_expr_2_0= ruleAAlphaExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getARestrictExpressionAccess().getExprAAlphaExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleAAlphaExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleAPolyObjectInRestrict"
    // InternalAlpha.g:4417:1: entryRuleAPolyObjectInRestrict returns [EObject current=null] : iv_ruleAPolyObjectInRestrict= ruleAPolyObjectInRestrict EOF ;
    public final EObject entryRuleAPolyObjectInRestrict() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAPolyObjectInRestrict = null;


        try {
            // InternalAlpha.g:4417:62: (iv_ruleAPolyObjectInRestrict= ruleAPolyObjectInRestrict EOF )
            // InternalAlpha.g:4418:2: iv_ruleAPolyObjectInRestrict= ruleAPolyObjectInRestrict EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAPolyObjectInRestrictRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAPolyObjectInRestrict=ruleAPolyObjectInRestrict();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAPolyObjectInRestrict; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAPolyObjectInRestrict"


    // $ANTLR start "ruleAPolyObjectInRestrict"
    // InternalAlpha.g:4424:1: ruleAPolyObjectInRestrict returns [EObject current=null] : (this_AISLSet_0= ruleAISLSet | this_AISLRelation_1= ruleAISLRelation | this_ADeclaredObject_2= ruleADeclaredObject | ( ( ruleAVariableDomain )=>this_AVariableDomain_3= ruleAVariableDomain ) | (otherlv_4= '{' this_APolyhedralObjectExpression_5= ruleAPolyhedralObjectExpression otherlv_6= '}' ) ) ;
    public final EObject ruleAPolyObjectInRestrict() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_AISLSet_0 = null;

        EObject this_AISLRelation_1 = null;

        EObject this_ADeclaredObject_2 = null;

        EObject this_AVariableDomain_3 = null;

        EObject this_APolyhedralObjectExpression_5 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4430:2: ( (this_AISLSet_0= ruleAISLSet | this_AISLRelation_1= ruleAISLRelation | this_ADeclaredObject_2= ruleADeclaredObject | ( ( ruleAVariableDomain )=>this_AVariableDomain_3= ruleAVariableDomain ) | (otherlv_4= '{' this_APolyhedralObjectExpression_5= ruleAPolyhedralObjectExpression otherlv_6= '}' ) ) )
            // InternalAlpha.g:4431:2: (this_AISLSet_0= ruleAISLSet | this_AISLRelation_1= ruleAISLRelation | this_ADeclaredObject_2= ruleADeclaredObject | ( ( ruleAVariableDomain )=>this_AVariableDomain_3= ruleAVariableDomain ) | (otherlv_4= '{' this_APolyhedralObjectExpression_5= ruleAPolyhedralObjectExpression otherlv_6= '}' ) )
            {
            // InternalAlpha.g:4431:2: (this_AISLSet_0= ruleAISLSet | this_AISLRelation_1= ruleAISLRelation | this_ADeclaredObject_2= ruleADeclaredObject | ( ( ruleAVariableDomain )=>this_AVariableDomain_3= ruleAVariableDomain ) | (otherlv_4= '{' this_APolyhedralObjectExpression_5= ruleAPolyhedralObjectExpression otherlv_6= '}' ) )
            int alt61=5;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // InternalAlpha.g:4432:3: this_AISLSet_0= ruleAISLSet
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAPolyObjectInRestrictAccess().getAISLSetParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AISLSet_0=ruleAISLSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AISLSet_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4441:3: this_AISLRelation_1= ruleAISLRelation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAPolyObjectInRestrictAccess().getAISLRelationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AISLRelation_1=ruleAISLRelation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AISLRelation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:4450:3: this_ADeclaredObject_2= ruleADeclaredObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAPolyObjectInRestrictAccess().getADeclaredObjectParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ADeclaredObject_2=ruleADeclaredObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ADeclaredObject_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:4459:3: ( ( ruleAVariableDomain )=>this_AVariableDomain_3= ruleAVariableDomain )
                    {
                    // InternalAlpha.g:4459:3: ( ( ruleAVariableDomain )=>this_AVariableDomain_3= ruleAVariableDomain )
                    // InternalAlpha.g:4460:4: ( ruleAVariableDomain )=>this_AVariableDomain_3= ruleAVariableDomain
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAPolyObjectInRestrictAccess().getAVariableDomainParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_AVariableDomain_3=ruleAVariableDomain();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_AVariableDomain_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAlpha.g:4471:3: (otherlv_4= '{' this_APolyhedralObjectExpression_5= ruleAPolyhedralObjectExpression otherlv_6= '}' )
                    {
                    // InternalAlpha.g:4471:3: (otherlv_4= '{' this_APolyhedralObjectExpression_5= ruleAPolyhedralObjectExpression otherlv_6= '}' )
                    // InternalAlpha.g:4472:4: otherlv_4= '{' this_APolyhedralObjectExpression_5= ruleAPolyhedralObjectExpression otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAPolyObjectInRestrictAccess().getLeftCurlyBracketKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAPolyObjectInRestrictAccess().getAPolyhedralObjectExpressionParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_APolyhedralObjectExpression_5=ruleAPolyhedralObjectExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_APolyhedralObjectExpression_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_6=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getAPolyObjectInRestrictAccess().getRightCurlyBracketKeyword_4_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAPolyObjectInRestrict"


    // $ANTLR start "entryRuleAAutoRestrictExpression"
    // InternalAlpha.g:4493:1: entryRuleAAutoRestrictExpression returns [EObject current=null] : iv_ruleAAutoRestrictExpression= ruleAAutoRestrictExpression EOF ;
    public final EObject entryRuleAAutoRestrictExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAAutoRestrictExpression = null;


        try {
            // InternalAlpha.g:4493:64: (iv_ruleAAutoRestrictExpression= ruleAAutoRestrictExpression EOF )
            // InternalAlpha.g:4494:2: iv_ruleAAutoRestrictExpression= ruleAAutoRestrictExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAAutoRestrictExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAAutoRestrictExpression=ruleAAutoRestrictExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAAutoRestrictExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAAutoRestrictExpression"


    // $ANTLR start "ruleAAutoRestrictExpression"
    // InternalAlpha.g:4500:1: ruleAAutoRestrictExpression returns [EObject current=null] : (otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAAlphaExpression ) ) ) ;
    public final EObject ruleAAutoRestrictExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4506:2: ( (otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAAlphaExpression ) ) ) )
            // InternalAlpha.g:4507:2: (otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAAlphaExpression ) ) )
            {
            // InternalAlpha.g:4507:2: (otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAAlphaExpression ) ) )
            // InternalAlpha.g:4508:3: otherlv_0= 'auto' otherlv_1= ':' ( (lv_expr_2_0= ruleAAlphaExpression ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAAutoRestrictExpressionAccess().getAutoKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,50,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAAutoRestrictExpressionAccess().getColonKeyword_1());
              		
            }
            // InternalAlpha.g:4516:3: ( (lv_expr_2_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:4517:4: (lv_expr_2_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:4517:4: (lv_expr_2_0= ruleAAlphaExpression )
            // InternalAlpha.g:4518:5: lv_expr_2_0= ruleAAlphaExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAAutoRestrictExpressionAccess().getExprAAlphaExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleAAlphaExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAAutoRestrictExpressionRule());
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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAAutoRestrictExpression"


    // $ANTLR start "entryRuleAVariableExpression"
    // InternalAlpha.g:4539:1: entryRuleAVariableExpression returns [EObject current=null] : iv_ruleAVariableExpression= ruleAVariableExpression EOF ;
    public final EObject entryRuleAVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAVariableExpression = null;


        try {
            // InternalAlpha.g:4539:60: (iv_ruleAVariableExpression= ruleAVariableExpression EOF )
            // InternalAlpha.g:4540:2: iv_ruleAVariableExpression= ruleAVariableExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAVariableExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAVariableExpression=ruleAVariableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAVariableExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:4546:1: ruleAVariableExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleAVariableExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:4552:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalAlpha.g:4553:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalAlpha.g:4553:2: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:4554:3: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:4554:3: (otherlv_0= RULE_ID )
            // InternalAlpha.g:4555:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getAVariableExpressionRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getAVariableExpressionAccess().getVarAVariableCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:4569:1: entryRuleAConstantExpression returns [EObject current=null] : iv_ruleAConstantExpression= ruleAConstantExpression EOF ;
    public final EObject entryRuleAConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAConstantExpression = null;


        try {
            // InternalAlpha.g:4569:60: (iv_ruleAConstantExpression= ruleAConstantExpression EOF )
            // InternalAlpha.g:4570:2: iv_ruleAConstantExpression= ruleAConstantExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAConstantExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAConstantExpression=ruleAConstantExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAConstantExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:4576:1: ruleAConstantExpression returns [EObject current=null] : (this_ABooleanExpression_0= ruleABooleanExpression | this_ARealExpression_1= ruleARealExpression | this_AIntegerExpression_2= ruleAIntegerExpression ) ;
    public final EObject ruleAConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ABooleanExpression_0 = null;

        EObject this_ARealExpression_1 = null;

        EObject this_AIntegerExpression_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4582:2: ( (this_ABooleanExpression_0= ruleABooleanExpression | this_ARealExpression_1= ruleARealExpression | this_AIntegerExpression_2= ruleAIntegerExpression ) )
            // InternalAlpha.g:4583:2: (this_ABooleanExpression_0= ruleABooleanExpression | this_ARealExpression_1= ruleARealExpression | this_AIntegerExpression_2= ruleAIntegerExpression )
            {
            // InternalAlpha.g:4583:2: (this_ABooleanExpression_0= ruleABooleanExpression | this_ARealExpression_1= ruleARealExpression | this_AIntegerExpression_2= ruleAIntegerExpression )
            int alt62=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt62=1;
                }
                break;
            case RULE_REAL:
                {
                alt62=2;
                }
                break;
            case RULE_INT:
                {
                alt62=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalAlpha.g:4584:3: this_ABooleanExpression_0= ruleABooleanExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAConstantExpressionAccess().getABooleanExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ABooleanExpression_0=ruleABooleanExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ABooleanExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4593:3: this_ARealExpression_1= ruleARealExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAConstantExpressionAccess().getARealExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ARealExpression_1=ruleARealExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ARealExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:4602:3: this_AIntegerExpression_2= ruleAIntegerExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAConstantExpressionAccess().getAIntegerExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AIntegerExpression_2=ruleAIntegerExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AIntegerExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:4614:1: entryRuleABooleanExpression returns [EObject current=null] : iv_ruleABooleanExpression= ruleABooleanExpression EOF ;
    public final EObject entryRuleABooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleABooleanExpression = null;


        try {
            // InternalAlpha.g:4614:59: (iv_ruleABooleanExpression= ruleABooleanExpression EOF )
            // InternalAlpha.g:4615:2: iv_ruleABooleanExpression= ruleABooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getABooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleABooleanExpression=ruleABooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleABooleanExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:4621:1: ruleABooleanExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleABooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:4627:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalAlpha.g:4628:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalAlpha.g:4628:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalAlpha.g:4629:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalAlpha.g:4629:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalAlpha.g:4630:4: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getABooleanExpressionAccess().getValueBOOLEANTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:4649:1: entryRuleAIntegerExpression returns [EObject current=null] : iv_ruleAIntegerExpression= ruleAIntegerExpression EOF ;
    public final EObject entryRuleAIntegerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAIntegerExpression = null;


        try {
            // InternalAlpha.g:4649:59: (iv_ruleAIntegerExpression= ruleAIntegerExpression EOF )
            // InternalAlpha.g:4650:2: iv_ruleAIntegerExpression= ruleAIntegerExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAIntegerExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAIntegerExpression=ruleAIntegerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAIntegerExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:4656:1: ruleAIntegerExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleAIntegerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:4662:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAlpha.g:4663:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAlpha.g:4663:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalAlpha.g:4664:3: (lv_value_0_0= RULE_INT )
            {
            // InternalAlpha.g:4664:3: (lv_value_0_0= RULE_INT )
            // InternalAlpha.g:4665:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getAIntegerExpressionAccess().getValueINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:4684:1: entryRuleARealExpression returns [EObject current=null] : iv_ruleARealExpression= ruleARealExpression EOF ;
    public final EObject entryRuleARealExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARealExpression = null;


        try {
            // InternalAlpha.g:4684:56: (iv_ruleARealExpression= ruleARealExpression EOF )
            // InternalAlpha.g:4685:2: iv_ruleARealExpression= ruleARealExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getARealExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleARealExpression=ruleARealExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleARealExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:4691:1: ruleARealExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_REAL ) ) ;
    public final EObject ruleARealExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:4697:2: ( ( (lv_value_0_0= RULE_REAL ) ) )
            // InternalAlpha.g:4698:2: ( (lv_value_0_0= RULE_REAL ) )
            {
            // InternalAlpha.g:4698:2: ( (lv_value_0_0= RULE_REAL ) )
            // InternalAlpha.g:4699:3: (lv_value_0_0= RULE_REAL )
            {
            // InternalAlpha.g:4699:3: (lv_value_0_0= RULE_REAL )
            // InternalAlpha.g:4700:4: lv_value_0_0= RULE_REAL
            {
            lv_value_0_0=(Token)match(input,RULE_REAL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getARealExpressionAccess().getValueREALTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:4719:1: entryRuleAMultiArgExpression returns [EObject current=null] : iv_ruleAMultiArgExpression= ruleAMultiArgExpression EOF ;
    public final EObject entryRuleAMultiArgExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAMultiArgExpression = null;


        try {
            // InternalAlpha.g:4719:60: (iv_ruleAMultiArgExpression= ruleAMultiArgExpression EOF )
            // InternalAlpha.g:4720:2: iv_ruleAMultiArgExpression= ruleAMultiArgExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAMultiArgExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAMultiArgExpression=ruleAMultiArgExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAMultiArgExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:4726:1: ruleAMultiArgExpression returns [EObject current=null] : (this_AMultiArgArithmeticExpression_0= ruleAMultiArgArithmeticExpression | this_AMultiArgLogicalExpression_1= ruleAMultiArgLogicalExpression | this_AExternalFunctionCall_2= ruleAExternalFunctionCall ) ;
    public final EObject ruleAMultiArgExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AMultiArgArithmeticExpression_0 = null;

        EObject this_AMultiArgLogicalExpression_1 = null;

        EObject this_AExternalFunctionCall_2 = null;



        	enterRule();

        try {
            // InternalAlpha.g:4732:2: ( (this_AMultiArgArithmeticExpression_0= ruleAMultiArgArithmeticExpression | this_AMultiArgLogicalExpression_1= ruleAMultiArgLogicalExpression | this_AExternalFunctionCall_2= ruleAExternalFunctionCall ) )
            // InternalAlpha.g:4733:2: (this_AMultiArgArithmeticExpression_0= ruleAMultiArgArithmeticExpression | this_AMultiArgLogicalExpression_1= ruleAMultiArgLogicalExpression | this_AExternalFunctionCall_2= ruleAExternalFunctionCall )
            {
            // InternalAlpha.g:4733:2: (this_AMultiArgArithmeticExpression_0= ruleAMultiArgArithmeticExpression | this_AMultiArgLogicalExpression_1= ruleAMultiArgLogicalExpression | this_AExternalFunctionCall_2= ruleAExternalFunctionCall )
            int alt63=3;
            switch ( input.LA(1) ) {
            case RULE_OP_PLUS:
            case RULE_OP_MUL:
            case RULE_OP_MIN:
            case RULE_OP_MAX:
                {
                alt63=1;
                }
                break;
            case RULE_OP_AND:
            case RULE_OP_OR:
            case RULE_OP_XOR:
                {
                alt63=2;
                }
                break;
            case RULE_ID:
                {
                alt63=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalAlpha.g:4734:3: this_AMultiArgArithmeticExpression_0= ruleAMultiArgArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAMultiArgExpressionAccess().getAMultiArgArithmeticExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AMultiArgArithmeticExpression_0=ruleAMultiArgArithmeticExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AMultiArgArithmeticExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:4743:3: this_AMultiArgLogicalExpression_1= ruleAMultiArgLogicalExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAMultiArgExpressionAccess().getAMultiArgLogicalExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AMultiArgLogicalExpression_1=ruleAMultiArgLogicalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AMultiArgLogicalExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:4752:3: this_AExternalFunctionCall_2= ruleAExternalFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAMultiArgExpressionAccess().getAExternalFunctionCallParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AExternalFunctionCall_2=ruleAExternalFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AExternalFunctionCall_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:4764:1: entryRuleAMultiArgArithmeticExpression returns [EObject current=null] : iv_ruleAMultiArgArithmeticExpression= ruleAMultiArgArithmeticExpression EOF ;
    public final EObject entryRuleAMultiArgArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAMultiArgArithmeticExpression = null;


        try {
            // InternalAlpha.g:4764:70: (iv_ruleAMultiArgArithmeticExpression= ruleAMultiArgArithmeticExpression EOF )
            // InternalAlpha.g:4765:2: iv_ruleAMultiArgArithmeticExpression= ruleAMultiArgArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAMultiArgArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAMultiArgArithmeticExpression=ruleAMultiArgArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAMultiArgArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:4771:1: ruleAMultiArgArithmeticExpression returns [EObject current=null] : ( ( (lv_op_0_0= ruleARITHMETIC_REDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+ otherlv_5= ')' ) ;
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
            // InternalAlpha.g:4777:2: ( ( ( (lv_op_0_0= ruleARITHMETIC_REDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+ otherlv_5= ')' ) )
            // InternalAlpha.g:4778:2: ( ( (lv_op_0_0= ruleARITHMETIC_REDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+ otherlv_5= ')' )
            {
            // InternalAlpha.g:4778:2: ( ( (lv_op_0_0= ruleARITHMETIC_REDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+ otherlv_5= ')' )
            // InternalAlpha.g:4779:3: ( (lv_op_0_0= ruleARITHMETIC_REDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+ otherlv_5= ')'
            {
            // InternalAlpha.g:4779:3: ( (lv_op_0_0= ruleARITHMETIC_REDUCTION_OP ) )
            // InternalAlpha.g:4780:4: (lv_op_0_0= ruleARITHMETIC_REDUCTION_OP )
            {
            // InternalAlpha.g:4780:4: (lv_op_0_0= ruleARITHMETIC_REDUCTION_OP )
            // InternalAlpha.g:4781:5: lv_op_0_0= ruleARITHMETIC_REDUCTION_OP
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAMultiArgArithmeticExpressionAccess().getOpARITHMETIC_REDUCTION_OPParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_op_0_0=ruleARITHMETIC_REDUCTION_OP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_1=(Token)match(input,38,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAMultiArgArithmeticExpressionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAlpha.g:4802:3: ( (lv_exprs_2_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:4803:4: (lv_exprs_2_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:4803:4: (lv_exprs_2_0= ruleAAlphaExpression )
            // InternalAlpha.g:4804:5: lv_exprs_2_0= ruleAAlphaExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAMultiArgArithmeticExpressionAccess().getExprsAAlphaExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_61);
            lv_exprs_2_0=ruleAAlphaExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalAlpha.g:4821:3: (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==51) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalAlpha.g:4822:4: otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,51,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getAMultiArgArithmeticExpressionAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalAlpha.g:4826:4: ( (lv_exprs_4_0= ruleAAlphaExpression ) )
            	    // InternalAlpha.g:4827:5: (lv_exprs_4_0= ruleAAlphaExpression )
            	    {
            	    // InternalAlpha.g:4827:5: (lv_exprs_4_0= ruleAAlphaExpression )
            	    // InternalAlpha.g:4828:6: lv_exprs_4_0= ruleAAlphaExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAMultiArgArithmeticExpressionAccess().getExprsAAlphaExpressionParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_exprs_4_0=ruleAAlphaExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    if ( cnt64 >= 1 ) break loop64;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
            } while (true);

            otherlv_5=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAMultiArgArithmeticExpressionAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:4854:1: entryRuleAMultiArgLogicalExpression returns [EObject current=null] : iv_ruleAMultiArgLogicalExpression= ruleAMultiArgLogicalExpression EOF ;
    public final EObject entryRuleAMultiArgLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAMultiArgLogicalExpression = null;


        try {
            // InternalAlpha.g:4854:67: (iv_ruleAMultiArgLogicalExpression= ruleAMultiArgLogicalExpression EOF )
            // InternalAlpha.g:4855:2: iv_ruleAMultiArgLogicalExpression= ruleAMultiArgLogicalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAMultiArgLogicalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAMultiArgLogicalExpression=ruleAMultiArgLogicalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAMultiArgLogicalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:4861:1: ruleAMultiArgLogicalExpression returns [EObject current=null] : ( ( (lv_op_0_0= ruleLOGICAL_REDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+ otherlv_5= ')' ) ;
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
            // InternalAlpha.g:4867:2: ( ( ( (lv_op_0_0= ruleLOGICAL_REDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+ otherlv_5= ')' ) )
            // InternalAlpha.g:4868:2: ( ( (lv_op_0_0= ruleLOGICAL_REDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+ otherlv_5= ')' )
            {
            // InternalAlpha.g:4868:2: ( ( (lv_op_0_0= ruleLOGICAL_REDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+ otherlv_5= ')' )
            // InternalAlpha.g:4869:3: ( (lv_op_0_0= ruleLOGICAL_REDUCTION_OP ) ) otherlv_1= '(' ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+ otherlv_5= ')'
            {
            // InternalAlpha.g:4869:3: ( (lv_op_0_0= ruleLOGICAL_REDUCTION_OP ) )
            // InternalAlpha.g:4870:4: (lv_op_0_0= ruleLOGICAL_REDUCTION_OP )
            {
            // InternalAlpha.g:4870:4: (lv_op_0_0= ruleLOGICAL_REDUCTION_OP )
            // InternalAlpha.g:4871:5: lv_op_0_0= ruleLOGICAL_REDUCTION_OP
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAMultiArgLogicalExpressionAccess().getOpLOGICAL_REDUCTION_OPParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_op_0_0=ruleLOGICAL_REDUCTION_OP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_1=(Token)match(input,38,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAMultiArgLogicalExpressionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAlpha.g:4892:3: ( (lv_exprs_2_0= ruleAAlphaExpression ) )
            // InternalAlpha.g:4893:4: (lv_exprs_2_0= ruleAAlphaExpression )
            {
            // InternalAlpha.g:4893:4: (lv_exprs_2_0= ruleAAlphaExpression )
            // InternalAlpha.g:4894:5: lv_exprs_2_0= ruleAAlphaExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAMultiArgLogicalExpressionAccess().getExprsAAlphaExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_61);
            lv_exprs_2_0=ruleAAlphaExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalAlpha.g:4911:3: (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )+
            int cnt65=0;
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==51) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalAlpha.g:4912:4: otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,51,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getAMultiArgLogicalExpressionAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalAlpha.g:4916:4: ( (lv_exprs_4_0= ruleAAlphaExpression ) )
            	    // InternalAlpha.g:4917:5: (lv_exprs_4_0= ruleAAlphaExpression )
            	    {
            	    // InternalAlpha.g:4917:5: (lv_exprs_4_0= ruleAAlphaExpression )
            	    // InternalAlpha.g:4918:6: lv_exprs_4_0= ruleAAlphaExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAMultiArgLogicalExpressionAccess().getExprsAAlphaExpressionParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_exprs_4_0=ruleAAlphaExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    if ( cnt65 >= 1 ) break loop65;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
            } while (true);

            otherlv_5=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAMultiArgLogicalExpressionAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:4944:1: entryRuleAExternalFunctionCall returns [EObject current=null] : iv_ruleAExternalFunctionCall= ruleAExternalFunctionCall EOF ;
    public final EObject entryRuleAExternalFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAExternalFunctionCall = null;


        try {
            // InternalAlpha.g:4944:62: (iv_ruleAExternalFunctionCall= ruleAExternalFunctionCall EOF )
            // InternalAlpha.g:4945:2: iv_ruleAExternalFunctionCall= ruleAExternalFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAExternalFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAExternalFunctionCall=ruleAExternalFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAExternalFunctionCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:4951:1: ruleAExternalFunctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )* )? otherlv_5= ')' ) ;
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
            // InternalAlpha.g:4957:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalAlpha.g:4958:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalAlpha.g:4958:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )* )? otherlv_5= ')' )
            // InternalAlpha.g:4959:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalAlpha.g:4959:3: ( (otherlv_0= RULE_ID ) )
            // InternalAlpha.g:4960:4: (otherlv_0= RULE_ID )
            {
            // InternalAlpha.g:4960:4: (otherlv_0= RULE_ID )
            // InternalAlpha.g:4961:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAExternalFunctionCallRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getAExternalFunctionCallAccess().getFuncAExternalFunctionCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAExternalFunctionCallAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAlpha.g:4976:3: ( ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=RULE_ID && LA67_0<=RULE_INT)||(LA67_0>=RULE_OP_PLUS && LA67_0<=RULE_OP_MUL)||(LA67_0>=RULE_OP_AND && LA67_0<=RULE_OP_OR)||LA67_0==RULE_OP_XOR||(LA67_0>=RULE_OP_MIN && LA67_0<=RULE_REAL)||LA67_0==33||LA67_0==38||LA67_0==64||(LA67_0>=70 && LA67_0<=72)||LA67_0==74||(LA67_0>=77 && LA67_0<=81)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalAlpha.g:4977:4: ( (lv_exprs_2_0= ruleAAlphaExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )*
                    {
                    // InternalAlpha.g:4977:4: ( (lv_exprs_2_0= ruleAAlphaExpression ) )
                    // InternalAlpha.g:4978:5: (lv_exprs_2_0= ruleAAlphaExpression )
                    {
                    // InternalAlpha.g:4978:5: (lv_exprs_2_0= ruleAAlphaExpression )
                    // InternalAlpha.g:4979:6: lv_exprs_2_0= ruleAAlphaExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAExternalFunctionCallAccess().getExprsAAlphaExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
                    lv_exprs_2_0=ruleAAlphaExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalAlpha.g:4996:4: (otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==51) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalAlpha.g:4997:5: otherlv_3= ',' ( (lv_exprs_4_0= ruleAAlphaExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,51,FOLLOW_20); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getAExternalFunctionCallAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalAlpha.g:5001:5: ( (lv_exprs_4_0= ruleAAlphaExpression ) )
                    	    // InternalAlpha.g:5002:6: (lv_exprs_4_0= ruleAAlphaExpression )
                    	    {
                    	    // InternalAlpha.g:5002:6: (lv_exprs_4_0= ruleAAlphaExpression )
                    	    // InternalAlpha.g:5003:7: lv_exprs_4_0= ruleAAlphaExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAExternalFunctionCallAccess().getExprsAAlphaExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_45);
                    	    lv_exprs_4_0=ruleAAlphaExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAExternalFunctionCallAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:5030:1: entryRuleIndexAffineExpression returns [String current=null] : iv_ruleIndexAffineExpression= ruleIndexAffineExpression EOF ;
    public final String entryRuleIndexAffineExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIndexAffineExpression = null;


        try {
            // InternalAlpha.g:5030:61: (iv_ruleIndexAffineExpression= ruleIndexAffineExpression EOF )
            // InternalAlpha.g:5031:2: iv_ruleIndexAffineExpression= ruleIndexAffineExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexAffineExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIndexAffineExpression=ruleIndexAffineExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexAffineExpression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:5037:1: ruleIndexAffineExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IndexAffineExpressionTerminal_0= ruleIndexAffineExpressionTerminal ( (this_OP_PLUS_1= RULE_OP_PLUS | this_OP_MINUS_2= RULE_OP_MINUS ) this_IndexAffineExpressionTerminal_3= ruleIndexAffineExpressionTerminal )* ) ;
    public final AntlrDatatypeRuleToken ruleIndexAffineExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_PLUS_1=null;
        Token this_OP_MINUS_2=null;
        AntlrDatatypeRuleToken this_IndexAffineExpressionTerminal_0 = null;

        AntlrDatatypeRuleToken this_IndexAffineExpressionTerminal_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5043:2: ( (this_IndexAffineExpressionTerminal_0= ruleIndexAffineExpressionTerminal ( (this_OP_PLUS_1= RULE_OP_PLUS | this_OP_MINUS_2= RULE_OP_MINUS ) this_IndexAffineExpressionTerminal_3= ruleIndexAffineExpressionTerminal )* ) )
            // InternalAlpha.g:5044:2: (this_IndexAffineExpressionTerminal_0= ruleIndexAffineExpressionTerminal ( (this_OP_PLUS_1= RULE_OP_PLUS | this_OP_MINUS_2= RULE_OP_MINUS ) this_IndexAffineExpressionTerminal_3= ruleIndexAffineExpressionTerminal )* )
            {
            // InternalAlpha.g:5044:2: (this_IndexAffineExpressionTerminal_0= ruleIndexAffineExpressionTerminal ( (this_OP_PLUS_1= RULE_OP_PLUS | this_OP_MINUS_2= RULE_OP_MINUS ) this_IndexAffineExpressionTerminal_3= ruleIndexAffineExpressionTerminal )* )
            // InternalAlpha.g:5045:3: this_IndexAffineExpressionTerminal_0= ruleIndexAffineExpressionTerminal ( (this_OP_PLUS_1= RULE_OP_PLUS | this_OP_MINUS_2= RULE_OP_MINUS ) this_IndexAffineExpressionTerminal_3= ruleIndexAffineExpressionTerminal )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIndexAffineExpressionAccess().getIndexAffineExpressionTerminalParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_49);
            this_IndexAffineExpressionTerminal_0=ruleIndexAffineExpressionTerminal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IndexAffineExpressionTerminal_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAlpha.g:5055:3: ( (this_OP_PLUS_1= RULE_OP_PLUS | this_OP_MINUS_2= RULE_OP_MINUS ) this_IndexAffineExpressionTerminal_3= ruleIndexAffineExpressionTerminal )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( ((LA69_0>=RULE_OP_PLUS && LA69_0<=RULE_OP_MINUS)) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalAlpha.g:5056:4: (this_OP_PLUS_1= RULE_OP_PLUS | this_OP_MINUS_2= RULE_OP_MINUS ) this_IndexAffineExpressionTerminal_3= ruleIndexAffineExpressionTerminal
            	    {
            	    // InternalAlpha.g:5056:4: (this_OP_PLUS_1= RULE_OP_PLUS | this_OP_MINUS_2= RULE_OP_MINUS )
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==RULE_OP_PLUS) ) {
            	        alt68=1;
            	    }
            	    else if ( (LA68_0==RULE_OP_MINUS) ) {
            	        alt68=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 68, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // InternalAlpha.g:5057:5: this_OP_PLUS_1= RULE_OP_PLUS
            	            {
            	            this_OP_PLUS_1=(Token)match(input,RULE_OP_PLUS,FOLLOW_59); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_OP_PLUS_1);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_OP_PLUS_1, grammarAccess.getIndexAffineExpressionAccess().getOP_PLUSTerminalRuleCall_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalAlpha.g:5065:5: this_OP_MINUS_2= RULE_OP_MINUS
            	            {
            	            this_OP_MINUS_2=(Token)match(input,RULE_OP_MINUS,FOLLOW_59); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_OP_MINUS_2);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_OP_MINUS_2, grammarAccess.getIndexAffineExpressionAccess().getOP_MINUSTerminalRuleCall_1_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getIndexAffineExpressionAccess().getIndexAffineExpressionTerminalParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_49);
            	    this_IndexAffineExpressionTerminal_3=ruleIndexAffineExpressionTerminal();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_IndexAffineExpressionTerminal_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:5088:1: entryRuleIndexAffineExpressionTerminal returns [String current=null] : iv_ruleIndexAffineExpressionTerminal= ruleIndexAffineExpressionTerminal EOF ;
    public final String entryRuleIndexAffineExpressionTerminal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIndexAffineExpressionTerminal = null;


        try {
            // InternalAlpha.g:5088:69: (iv_ruleIndexAffineExpressionTerminal= ruleIndexAffineExpressionTerminal EOF )
            // InternalAlpha.g:5089:2: iv_ruleIndexAffineExpressionTerminal= ruleIndexAffineExpressionTerminal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexAffineExpressionTerminalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIndexAffineExpressionTerminal=ruleIndexAffineExpressionTerminal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexAffineExpressionTerminal.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:5095:1: ruleIndexAffineExpressionTerminal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_OP_MINUS_0= RULE_OP_MINUS )? (this_INT_1= RULE_INT | ( (this_INT_2= RULE_INT )? this_IndexName_3= ruleIndexName ) ) ) ;
    public final AntlrDatatypeRuleToken ruleIndexAffineExpressionTerminal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_MINUS_0=null;
        Token this_INT_1=null;
        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_IndexName_3 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5101:2: ( ( (this_OP_MINUS_0= RULE_OP_MINUS )? (this_INT_1= RULE_INT | ( (this_INT_2= RULE_INT )? this_IndexName_3= ruleIndexName ) ) ) )
            // InternalAlpha.g:5102:2: ( (this_OP_MINUS_0= RULE_OP_MINUS )? (this_INT_1= RULE_INT | ( (this_INT_2= RULE_INT )? this_IndexName_3= ruleIndexName ) ) )
            {
            // InternalAlpha.g:5102:2: ( (this_OP_MINUS_0= RULE_OP_MINUS )? (this_INT_1= RULE_INT | ( (this_INT_2= RULE_INT )? this_IndexName_3= ruleIndexName ) ) )
            // InternalAlpha.g:5103:3: (this_OP_MINUS_0= RULE_OP_MINUS )? (this_INT_1= RULE_INT | ( (this_INT_2= RULE_INT )? this_IndexName_3= ruleIndexName ) )
            {
            // InternalAlpha.g:5103:3: (this_OP_MINUS_0= RULE_OP_MINUS )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_OP_MINUS) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalAlpha.g:5104:4: this_OP_MINUS_0= RULE_OP_MINUS
                    {
                    this_OP_MINUS_0=(Token)match(input,RULE_OP_MINUS,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_OP_MINUS_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP_MINUS_0, grammarAccess.getIndexAffineExpressionTerminalAccess().getOP_MINUSTerminalRuleCall_0());
                      			
                    }

                    }
                    break;

            }

            // InternalAlpha.g:5112:3: (this_INT_1= RULE_INT | ( (this_INT_2= RULE_INT )? this_IndexName_3= ruleIndexName ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_INT) ) {
                int LA72_1 = input.LA(2);

                if ( (LA72_1==RULE_ID) ) {
                    alt72=2;
                }
                else if ( (LA72_1==EOF||(LA72_1>=RULE_OP_PLUS && LA72_1<=RULE_OP_MINUS)||LA72_1==39||LA72_1==51||LA72_1==65) ) {
                    alt72=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA72_0==RULE_ID) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalAlpha.g:5113:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_1, grammarAccess.getIndexAffineExpressionTerminalAccess().getINTTerminalRuleCall_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5121:4: ( (this_INT_2= RULE_INT )? this_IndexName_3= ruleIndexName )
                    {
                    // InternalAlpha.g:5121:4: ( (this_INT_2= RULE_INT )? this_IndexName_3= ruleIndexName )
                    // InternalAlpha.g:5122:5: (this_INT_2= RULE_INT )? this_IndexName_3= ruleIndexName
                    {
                    // InternalAlpha.g:5122:5: (this_INT_2= RULE_INT )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==RULE_INT) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalAlpha.g:5123:6: this_INT_2= RULE_INT
                            {
                            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_INT_2);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newLeafNode(this_INT_2, grammarAccess.getIndexAffineExpressionTerminalAccess().getINTTerminalRuleCall_1_1_0());
                              					
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIndexAffineExpressionTerminalAccess().getIndexNameParserRuleCall_1_1_1());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    this_IndexName_3=ruleIndexName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_IndexName_3);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:5147:1: entryRuleAIndexAffineExpressionList returns [EObject current=null] : iv_ruleAIndexAffineExpressionList= ruleAIndexAffineExpressionList EOF ;
    public final EObject entryRuleAIndexAffineExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAIndexAffineExpressionList = null;


        try {
            // InternalAlpha.g:5147:67: (iv_ruleAIndexAffineExpressionList= ruleAIndexAffineExpressionList EOF )
            // InternalAlpha.g:5148:2: iv_ruleAIndexAffineExpressionList= ruleAIndexAffineExpressionList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAIndexAffineExpressionListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAIndexAffineExpressionList=ruleAIndexAffineExpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAIndexAffineExpressionList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:5154:1: ruleAIndexAffineExpressionList returns [EObject current=null] : ( () ( ( (lv_exprs_1_0= ruleIndexAffineExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleIndexAffineExpression ) ) )* )? ) ;
    public final EObject ruleAIndexAffineExpressionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_exprs_1_0 = null;

        AntlrDatatypeRuleToken lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5160:2: ( ( () ( ( (lv_exprs_1_0= ruleIndexAffineExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleIndexAffineExpression ) ) )* )? ) )
            // InternalAlpha.g:5161:2: ( () ( ( (lv_exprs_1_0= ruleIndexAffineExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleIndexAffineExpression ) ) )* )? )
            {
            // InternalAlpha.g:5161:2: ( () ( ( (lv_exprs_1_0= ruleIndexAffineExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleIndexAffineExpression ) ) )* )? )
            // InternalAlpha.g:5162:3: () ( ( (lv_exprs_1_0= ruleIndexAffineExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleIndexAffineExpression ) ) )* )?
            {
            // InternalAlpha.g:5162:3: ()
            // InternalAlpha.g:5163:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAIndexAffineExpressionListAccess().getAIndexAffineExpressionListAction_0(),
              					current);
              			
            }

            }

            // InternalAlpha.g:5169:3: ( ( (lv_exprs_1_0= ruleIndexAffineExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleIndexAffineExpression ) ) )* )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=RULE_ID && LA74_0<=RULE_INT)||LA74_0==RULE_OP_MINUS) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalAlpha.g:5170:4: ( (lv_exprs_1_0= ruleIndexAffineExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleIndexAffineExpression ) ) )*
                    {
                    // InternalAlpha.g:5170:4: ( (lv_exprs_1_0= ruleIndexAffineExpression ) )
                    // InternalAlpha.g:5171:5: (lv_exprs_1_0= ruleIndexAffineExpression )
                    {
                    // InternalAlpha.g:5171:5: (lv_exprs_1_0= ruleIndexAffineExpression )
                    // InternalAlpha.g:5172:6: lv_exprs_1_0= ruleIndexAffineExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAIndexAffineExpressionListAccess().getExprsIndexAffineExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_exprs_1_0=ruleIndexAffineExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalAlpha.g:5189:4: (otherlv_2= ',' ( (lv_exprs_3_0= ruleIndexAffineExpression ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==51) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalAlpha.g:5190:5: otherlv_2= ',' ( (lv_exprs_3_0= ruleIndexAffineExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,51,FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getAIndexAffineExpressionListAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalAlpha.g:5194:5: ( (lv_exprs_3_0= ruleIndexAffineExpression ) )
                    	    // InternalAlpha.g:5195:6: (lv_exprs_3_0= ruleIndexAffineExpression )
                    	    {
                    	    // InternalAlpha.g:5195:6: (lv_exprs_3_0= ruleIndexAffineExpression )
                    	    // InternalAlpha.g:5196:7: lv_exprs_3_0= ruleIndexAffineExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAIndexAffineExpressionListAccess().getExprsIndexAffineExpressionParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_25);
                    	    lv_exprs_3_0=ruleIndexAffineExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:5219:1: entryRuleAFunction returns [EObject current=null] : iv_ruleAFunction= ruleAFunction EOF ;
    public final EObject entryRuleAFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAFunction = null;


        try {
            // InternalAlpha.g:5219:50: (iv_ruleAFunction= ruleAFunction EOF )
            // InternalAlpha.g:5220:2: iv_ruleAFunction= ruleAFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAFunction=ruleAFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:5226:1: ruleAFunction returns [EObject current=null] : (otherlv_0= '(' ( (lv_indexes_1_0= ruleAIndexList ) ) otherlv_2= '->' ( (lv_func_3_0= ruleAIndexAffineExpressionList ) ) otherlv_4= ')' ) ;
    public final EObject ruleAFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_indexes_1_0 = null;

        EObject lv_func_3_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5232:2: ( (otherlv_0= '(' ( (lv_indexes_1_0= ruleAIndexList ) ) otherlv_2= '->' ( (lv_func_3_0= ruleAIndexAffineExpressionList ) ) otherlv_4= ')' ) )
            // InternalAlpha.g:5233:2: (otherlv_0= '(' ( (lv_indexes_1_0= ruleAIndexList ) ) otherlv_2= '->' ( (lv_func_3_0= ruleAIndexAffineExpressionList ) ) otherlv_4= ')' )
            {
            // InternalAlpha.g:5233:2: (otherlv_0= '(' ( (lv_indexes_1_0= ruleAIndexList ) ) otherlv_2= '->' ( (lv_func_3_0= ruleAIndexAffineExpressionList ) ) otherlv_4= ')' )
            // InternalAlpha.g:5234:3: otherlv_0= '(' ( (lv_indexes_1_0= ruleAIndexList ) ) otherlv_2= '->' ( (lv_func_3_0= ruleAIndexAffineExpressionList ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAFunctionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalAlpha.g:5238:3: ( (lv_indexes_1_0= ruleAIndexList ) )
            // InternalAlpha.g:5239:4: (lv_indexes_1_0= ruleAIndexList )
            {
            // InternalAlpha.g:5239:4: (lv_indexes_1_0= ruleAIndexList )
            // InternalAlpha.g:5240:5: lv_indexes_1_0= ruleAIndexList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAFunctionAccess().getIndexesAIndexListParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_indexes_1_0=ruleAIndexList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,68,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAFunctionAccess().getHyphenMinusGreaterThanSignKeyword_2());
              		
            }
            // InternalAlpha.g:5261:3: ( (lv_func_3_0= ruleAIndexAffineExpressionList ) )
            // InternalAlpha.g:5262:4: (lv_func_3_0= ruleAIndexAffineExpressionList )
            {
            // InternalAlpha.g:5262:4: (lv_func_3_0= ruleAIndexAffineExpressionList )
            // InternalAlpha.g:5263:5: lv_func_3_0= ruleAIndexAffineExpressionList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAFunctionAccess().getFuncAIndexAffineExpressionListParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_func_3_0=ruleAIndexAffineExpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_4=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAFunctionAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:5288:1: entryRuleAFunctionInArrayNotation returns [EObject current=null] : iv_ruleAFunctionInArrayNotation= ruleAFunctionInArrayNotation EOF ;
    public final EObject entryRuleAFunctionInArrayNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAFunctionInArrayNotation = null;


        try {
            // InternalAlpha.g:5288:65: (iv_ruleAFunctionInArrayNotation= ruleAFunctionInArrayNotation EOF )
            // InternalAlpha.g:5289:2: iv_ruleAFunctionInArrayNotation= ruleAFunctionInArrayNotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAFunctionInArrayNotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAFunctionInArrayNotation=ruleAFunctionInArrayNotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAFunctionInArrayNotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:5295:1: ruleAFunctionInArrayNotation returns [EObject current=null] : (otherlv_0= '[' ( (lv_newIds_1_0= ruleAIndexAffineExpressionList ) ) otherlv_2= ']' ) ;
    public final EObject ruleAFunctionInArrayNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_newIds_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5301:2: ( (otherlv_0= '[' ( (lv_newIds_1_0= ruleAIndexAffineExpressionList ) ) otherlv_2= ']' ) )
            // InternalAlpha.g:5302:2: (otherlv_0= '[' ( (lv_newIds_1_0= ruleAIndexAffineExpressionList ) ) otherlv_2= ']' )
            {
            // InternalAlpha.g:5302:2: (otherlv_0= '[' ( (lv_newIds_1_0= ruleAIndexAffineExpressionList ) ) otherlv_2= ']' )
            // InternalAlpha.g:5303:3: otherlv_0= '[' ( (lv_newIds_1_0= ruleAIndexAffineExpressionList ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAFunctionInArrayNotationAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalAlpha.g:5307:3: ( (lv_newIds_1_0= ruleAIndexAffineExpressionList ) )
            // InternalAlpha.g:5308:4: (lv_newIds_1_0= ruleAIndexAffineExpressionList )
            {
            // InternalAlpha.g:5308:4: (lv_newIds_1_0= ruleAIndexAffineExpressionList )
            // InternalAlpha.g:5309:5: lv_newIds_1_0= ruleAIndexAffineExpressionList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAFunctionInArrayNotationAccess().getNewIdsAIndexAffineExpressionListParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_newIds_1_0=ruleAIndexAffineExpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAFunctionInArrayNotationAccess().getRightSquareBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:5334:1: entryRuleAReductionOperator returns [EObject current=null] : iv_ruleAReductionOperator= ruleAReductionOperator EOF ;
    public final EObject entryRuleAReductionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAReductionOperator = null;


        try {
            // InternalAlpha.g:5334:59: (iv_ruleAReductionOperator= ruleAReductionOperator EOF )
            // InternalAlpha.g:5335:2: iv_ruleAReductionOperator= ruleAReductionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAReductionOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAReductionOperator=ruleAReductionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAReductionOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:5341:1: ruleAReductionOperator returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_builtin_1_0= ruleREDUCTION_OP ) ) ) ;
    public final EObject ruleAReductionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_builtin_1_0 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5347:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_builtin_1_0= ruleREDUCTION_OP ) ) ) )
            // InternalAlpha.g:5348:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_builtin_1_0= ruleREDUCTION_OP ) ) )
            {
            // InternalAlpha.g:5348:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_builtin_1_0= ruleREDUCTION_OP ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_OP_PLUS||LA75_0==RULE_OP_MUL||(LA75_0>=RULE_OP_AND && LA75_0<=RULE_OP_OR)||LA75_0==RULE_OP_XOR||(LA75_0>=RULE_OP_MIN && LA75_0<=RULE_OP_MAX)) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalAlpha.g:5349:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalAlpha.g:5349:3: ( (otherlv_0= RULE_ID ) )
                    // InternalAlpha.g:5350:4: (otherlv_0= RULE_ID )
                    {
                    // InternalAlpha.g:5350:4: (otherlv_0= RULE_ID )
                    // InternalAlpha.g:5351:5: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAReductionOperatorRule());
                      					}
                      				
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getAReductionOperatorAccess().getOpAExternalFunctionCrossReference_0_0());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5363:3: ( (lv_builtin_1_0= ruleREDUCTION_OP ) )
                    {
                    // InternalAlpha.g:5363:3: ( (lv_builtin_1_0= ruleREDUCTION_OP ) )
                    // InternalAlpha.g:5364:4: (lv_builtin_1_0= ruleREDUCTION_OP )
                    {
                    // InternalAlpha.g:5364:4: (lv_builtin_1_0= ruleREDUCTION_OP )
                    // InternalAlpha.g:5365:5: lv_builtin_1_0= ruleREDUCTION_OP
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAReductionOperatorAccess().getBuiltinREDUCTION_OPParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_builtin_1_0=ruleREDUCTION_OP();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:5386:1: entryRuleREDUCTION_OP returns [String current=null] : iv_ruleREDUCTION_OP= ruleREDUCTION_OP EOF ;
    public final String entryRuleREDUCTION_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREDUCTION_OP = null;


        try {
            // InternalAlpha.g:5386:52: (iv_ruleREDUCTION_OP= ruleREDUCTION_OP EOF )
            // InternalAlpha.g:5387:2: iv_ruleREDUCTION_OP= ruleREDUCTION_OP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getREDUCTION_OPRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleREDUCTION_OP=ruleREDUCTION_OP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleREDUCTION_OP.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:5393:1: ruleREDUCTION_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ARITHMETIC_REDUCTION_OP_0= ruleARITHMETIC_REDUCTION_OP | this_LOGICAL_REDUCTION_OP_1= ruleLOGICAL_REDUCTION_OP ) ;
    public final AntlrDatatypeRuleToken ruleREDUCTION_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ARITHMETIC_REDUCTION_OP_0 = null;

        AntlrDatatypeRuleToken this_LOGICAL_REDUCTION_OP_1 = null;



        	enterRule();

        try {
            // InternalAlpha.g:5399:2: ( (this_ARITHMETIC_REDUCTION_OP_0= ruleARITHMETIC_REDUCTION_OP | this_LOGICAL_REDUCTION_OP_1= ruleLOGICAL_REDUCTION_OP ) )
            // InternalAlpha.g:5400:2: (this_ARITHMETIC_REDUCTION_OP_0= ruleARITHMETIC_REDUCTION_OP | this_LOGICAL_REDUCTION_OP_1= ruleLOGICAL_REDUCTION_OP )
            {
            // InternalAlpha.g:5400:2: (this_ARITHMETIC_REDUCTION_OP_0= ruleARITHMETIC_REDUCTION_OP | this_LOGICAL_REDUCTION_OP_1= ruleLOGICAL_REDUCTION_OP )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_OP_PLUS||LA76_0==RULE_OP_MUL||(LA76_0>=RULE_OP_MIN && LA76_0<=RULE_OP_MAX)) ) {
                alt76=1;
            }
            else if ( ((LA76_0>=RULE_OP_AND && LA76_0<=RULE_OP_OR)||LA76_0==RULE_OP_XOR) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalAlpha.g:5401:3: this_ARITHMETIC_REDUCTION_OP_0= ruleARITHMETIC_REDUCTION_OP
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getREDUCTION_OPAccess().getARITHMETIC_REDUCTION_OPParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ARITHMETIC_REDUCTION_OP_0=ruleARITHMETIC_REDUCTION_OP();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ARITHMETIC_REDUCTION_OP_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5412:3: this_LOGICAL_REDUCTION_OP_1= ruleLOGICAL_REDUCTION_OP
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getREDUCTION_OPAccess().getLOGICAL_REDUCTION_OPParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LOGICAL_REDUCTION_OP_1=ruleLOGICAL_REDUCTION_OP();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LOGICAL_REDUCTION_OP_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:5426:1: entryRuleARITHMETIC_REDUCTION_OP returns [String current=null] : iv_ruleARITHMETIC_REDUCTION_OP= ruleARITHMETIC_REDUCTION_OP EOF ;
    public final String entryRuleARITHMETIC_REDUCTION_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleARITHMETIC_REDUCTION_OP = null;


        try {
            // InternalAlpha.g:5426:63: (iv_ruleARITHMETIC_REDUCTION_OP= ruleARITHMETIC_REDUCTION_OP EOF )
            // InternalAlpha.g:5427:2: iv_ruleARITHMETIC_REDUCTION_OP= ruleARITHMETIC_REDUCTION_OP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getARITHMETIC_REDUCTION_OPRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleARITHMETIC_REDUCTION_OP=ruleARITHMETIC_REDUCTION_OP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleARITHMETIC_REDUCTION_OP.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:5433:1: ruleARITHMETIC_REDUCTION_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OP_MAX_0= RULE_OP_MAX | this_OP_MIN_1= RULE_OP_MIN | this_OP_MUL_2= RULE_OP_MUL | this_OP_PLUS_3= RULE_OP_PLUS ) ;
    public final AntlrDatatypeRuleToken ruleARITHMETIC_REDUCTION_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_MAX_0=null;
        Token this_OP_MIN_1=null;
        Token this_OP_MUL_2=null;
        Token this_OP_PLUS_3=null;


        	enterRule();

        try {
            // InternalAlpha.g:5439:2: ( (this_OP_MAX_0= RULE_OP_MAX | this_OP_MIN_1= RULE_OP_MIN | this_OP_MUL_2= RULE_OP_MUL | this_OP_PLUS_3= RULE_OP_PLUS ) )
            // InternalAlpha.g:5440:2: (this_OP_MAX_0= RULE_OP_MAX | this_OP_MIN_1= RULE_OP_MIN | this_OP_MUL_2= RULE_OP_MUL | this_OP_PLUS_3= RULE_OP_PLUS )
            {
            // InternalAlpha.g:5440:2: (this_OP_MAX_0= RULE_OP_MAX | this_OP_MIN_1= RULE_OP_MIN | this_OP_MUL_2= RULE_OP_MUL | this_OP_PLUS_3= RULE_OP_PLUS )
            int alt77=4;
            switch ( input.LA(1) ) {
            case RULE_OP_MAX:
                {
                alt77=1;
                }
                break;
            case RULE_OP_MIN:
                {
                alt77=2;
                }
                break;
            case RULE_OP_MUL:
                {
                alt77=3;
                }
                break;
            case RULE_OP_PLUS:
                {
                alt77=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalAlpha.g:5441:3: this_OP_MAX_0= RULE_OP_MAX
                    {
                    this_OP_MAX_0=(Token)match(input,RULE_OP_MAX,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP_MAX_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP_MAX_0, grammarAccess.getARITHMETIC_REDUCTION_OPAccess().getOP_MAXTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5449:3: this_OP_MIN_1= RULE_OP_MIN
                    {
                    this_OP_MIN_1=(Token)match(input,RULE_OP_MIN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP_MIN_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP_MIN_1, grammarAccess.getARITHMETIC_REDUCTION_OPAccess().getOP_MINTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:5457:3: this_OP_MUL_2= RULE_OP_MUL
                    {
                    this_OP_MUL_2=(Token)match(input,RULE_OP_MUL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP_MUL_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP_MUL_2, grammarAccess.getARITHMETIC_REDUCTION_OPAccess().getOP_MULTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:5465:3: this_OP_PLUS_3= RULE_OP_PLUS
                    {
                    this_OP_PLUS_3=(Token)match(input,RULE_OP_PLUS,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP_PLUS_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP_PLUS_3, grammarAccess.getARITHMETIC_REDUCTION_OPAccess().getOP_PLUSTerminalRuleCall_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:5476:1: entryRuleLOGICAL_REDUCTION_OP returns [String current=null] : iv_ruleLOGICAL_REDUCTION_OP= ruleLOGICAL_REDUCTION_OP EOF ;
    public final String entryRuleLOGICAL_REDUCTION_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOGICAL_REDUCTION_OP = null;


        try {
            // InternalAlpha.g:5476:60: (iv_ruleLOGICAL_REDUCTION_OP= ruleLOGICAL_REDUCTION_OP EOF )
            // InternalAlpha.g:5477:2: iv_ruleLOGICAL_REDUCTION_OP= ruleLOGICAL_REDUCTION_OP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLOGICAL_REDUCTION_OPRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLOGICAL_REDUCTION_OP=ruleLOGICAL_REDUCTION_OP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLOGICAL_REDUCTION_OP.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:5483:1: ruleLOGICAL_REDUCTION_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OP_AND_0= RULE_OP_AND | this_OP_OR_1= RULE_OP_OR | this_OP_XOR_2= RULE_OP_XOR ) ;
    public final AntlrDatatypeRuleToken ruleLOGICAL_REDUCTION_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_AND_0=null;
        Token this_OP_OR_1=null;
        Token this_OP_XOR_2=null;


        	enterRule();

        try {
            // InternalAlpha.g:5489:2: ( (this_OP_AND_0= RULE_OP_AND | this_OP_OR_1= RULE_OP_OR | this_OP_XOR_2= RULE_OP_XOR ) )
            // InternalAlpha.g:5490:2: (this_OP_AND_0= RULE_OP_AND | this_OP_OR_1= RULE_OP_OR | this_OP_XOR_2= RULE_OP_XOR )
            {
            // InternalAlpha.g:5490:2: (this_OP_AND_0= RULE_OP_AND | this_OP_OR_1= RULE_OP_OR | this_OP_XOR_2= RULE_OP_XOR )
            int alt78=3;
            switch ( input.LA(1) ) {
            case RULE_OP_AND:
                {
                alt78=1;
                }
                break;
            case RULE_OP_OR:
                {
                alt78=2;
                }
                break;
            case RULE_OP_XOR:
                {
                alt78=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalAlpha.g:5491:3: this_OP_AND_0= RULE_OP_AND
                    {
                    this_OP_AND_0=(Token)match(input,RULE_OP_AND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP_AND_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP_AND_0, grammarAccess.getLOGICAL_REDUCTION_OPAccess().getOP_ANDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5499:3: this_OP_OR_1= RULE_OP_OR
                    {
                    this_OP_OR_1=(Token)match(input,RULE_OP_OR,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP_OR_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP_OR_1, grammarAccess.getLOGICAL_REDUCTION_OPAccess().getOP_ORTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:5507:3: this_OP_XOR_2= RULE_OP_XOR
                    {
                    this_OP_XOR_2=(Token)match(input,RULE_OP_XOR,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP_XOR_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP_XOR_2, grammarAccess.getLOGICAL_REDUCTION_OPAccess().getOP_XORTerminalRuleCall_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:5518:1: entryRuleARITHMETIC_NONREDUCTION_OP returns [String current=null] : iv_ruleARITHMETIC_NONREDUCTION_OP= ruleARITHMETIC_NONREDUCTION_OP EOF ;
    public final String entryRuleARITHMETIC_NONREDUCTION_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleARITHMETIC_NONREDUCTION_OP = null;


        try {
            // InternalAlpha.g:5518:66: (iv_ruleARITHMETIC_NONREDUCTION_OP= ruleARITHMETIC_NONREDUCTION_OP EOF )
            // InternalAlpha.g:5519:2: iv_ruleARITHMETIC_NONREDUCTION_OP= ruleARITHMETIC_NONREDUCTION_OP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getARITHMETIC_NONREDUCTION_OPRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleARITHMETIC_NONREDUCTION_OP=ruleARITHMETIC_NONREDUCTION_OP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleARITHMETIC_NONREDUCTION_OP.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:5525:1: ruleARITHMETIC_NONREDUCTION_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OP_MINUS_0= RULE_OP_MINUS | this_OP_DIV_1= RULE_OP_DIV | this_OP_MOD_2= RULE_OP_MOD ) ;
    public final AntlrDatatypeRuleToken ruleARITHMETIC_NONREDUCTION_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_MINUS_0=null;
        Token this_OP_DIV_1=null;
        Token this_OP_MOD_2=null;


        	enterRule();

        try {
            // InternalAlpha.g:5531:2: ( (this_OP_MINUS_0= RULE_OP_MINUS | this_OP_DIV_1= RULE_OP_DIV | this_OP_MOD_2= RULE_OP_MOD ) )
            // InternalAlpha.g:5532:2: (this_OP_MINUS_0= RULE_OP_MINUS | this_OP_DIV_1= RULE_OP_DIV | this_OP_MOD_2= RULE_OP_MOD )
            {
            // InternalAlpha.g:5532:2: (this_OP_MINUS_0= RULE_OP_MINUS | this_OP_DIV_1= RULE_OP_DIV | this_OP_MOD_2= RULE_OP_MOD )
            int alt79=3;
            switch ( input.LA(1) ) {
            case RULE_OP_MINUS:
                {
                alt79=1;
                }
                break;
            case RULE_OP_DIV:
                {
                alt79=2;
                }
                break;
            case RULE_OP_MOD:
                {
                alt79=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalAlpha.g:5533:3: this_OP_MINUS_0= RULE_OP_MINUS
                    {
                    this_OP_MINUS_0=(Token)match(input,RULE_OP_MINUS,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP_MINUS_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP_MINUS_0, grammarAccess.getARITHMETIC_NONREDUCTION_OPAccess().getOP_MINUSTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5541:3: this_OP_DIV_1= RULE_OP_DIV
                    {
                    this_OP_DIV_1=(Token)match(input,RULE_OP_DIV,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP_DIV_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP_DIV_1, grammarAccess.getARITHMETIC_NONREDUCTION_OPAccess().getOP_DIVTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:5549:3: this_OP_MOD_2= RULE_OP_MOD
                    {
                    this_OP_MOD_2=(Token)match(input,RULE_OP_MOD,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP_MOD_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP_MOD_2, grammarAccess.getARITHMETIC_NONREDUCTION_OPAccess().getOP_MODTerminalRuleCall_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:5560:1: entryRuleLOGICAL_NONREDUCTION_OP returns [String current=null] : iv_ruleLOGICAL_NONREDUCTION_OP= ruleLOGICAL_NONREDUCTION_OP EOF ;
    public final String entryRuleLOGICAL_NONREDUCTION_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOGICAL_NONREDUCTION_OP = null;


        try {
            // InternalAlpha.g:5560:63: (iv_ruleLOGICAL_NONREDUCTION_OP= ruleLOGICAL_NONREDUCTION_OP EOF )
            // InternalAlpha.g:5561:2: iv_ruleLOGICAL_NONREDUCTION_OP= ruleLOGICAL_NONREDUCTION_OP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLOGICAL_NONREDUCTION_OPRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLOGICAL_NONREDUCTION_OP=ruleLOGICAL_NONREDUCTION_OP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLOGICAL_NONREDUCTION_OP.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:5567:1: ruleLOGICAL_NONREDUCTION_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_OP_NAND_0= RULE_OP_NAND ;
    public final AntlrDatatypeRuleToken ruleLOGICAL_NONREDUCTION_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_NAND_0=null;


        	enterRule();

        try {
            // InternalAlpha.g:5573:2: (this_OP_NAND_0= RULE_OP_NAND )
            // InternalAlpha.g:5574:2: this_OP_NAND_0= RULE_OP_NAND
            {
            this_OP_NAND_0=(Token)match(input,RULE_OP_NAND,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_OP_NAND_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_OP_NAND_0, grammarAccess.getLOGICAL_NONREDUCTION_OPAccess().getOP_NANDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAlpha.g:5584:1: entryRuleRELATIONAL_OP returns [String current=null] : iv_ruleRELATIONAL_OP= ruleRELATIONAL_OP EOF ;
    public final String entryRuleRELATIONAL_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRELATIONAL_OP = null;


        try {
            // InternalAlpha.g:5584:53: (iv_ruleRELATIONAL_OP= ruleRELATIONAL_OP EOF )
            // InternalAlpha.g:5585:2: iv_ruleRELATIONAL_OP= ruleRELATIONAL_OP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRELATIONAL_OPRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRELATIONAL_OP=ruleRELATIONAL_OP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRELATIONAL_OP.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalAlpha.g:5591:1: ruleRELATIONAL_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OP_EQ_0= RULE_OP_EQ | this_OP_GE_1= RULE_OP_GE | this_OP_GT_2= RULE_OP_GT | this_OP_LE_3= RULE_OP_LE | this_OP_LT_4= RULE_OP_LT | this_OP_NE_5= RULE_OP_NE ) ;
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
            // InternalAlpha.g:5597:2: ( (this_OP_EQ_0= RULE_OP_EQ | this_OP_GE_1= RULE_OP_GE | this_OP_GT_2= RULE_OP_GT | this_OP_LE_3= RULE_OP_LE | this_OP_LT_4= RULE_OP_LT | this_OP_NE_5= RULE_OP_NE ) )
            // InternalAlpha.g:5598:2: (this_OP_EQ_0= RULE_OP_EQ | this_OP_GE_1= RULE_OP_GE | this_OP_GT_2= RULE_OP_GT | this_OP_LE_3= RULE_OP_LE | this_OP_LT_4= RULE_OP_LT | this_OP_NE_5= RULE_OP_NE )
            {
            // InternalAlpha.g:5598:2: (this_OP_EQ_0= RULE_OP_EQ | this_OP_GE_1= RULE_OP_GE | this_OP_GT_2= RULE_OP_GT | this_OP_LE_3= RULE_OP_LE | this_OP_LT_4= RULE_OP_LT | this_OP_NE_5= RULE_OP_NE )
            int alt80=6;
            switch ( input.LA(1) ) {
            case RULE_OP_EQ:
                {
                alt80=1;
                }
                break;
            case RULE_OP_GE:
                {
                alt80=2;
                }
                break;
            case RULE_OP_GT:
                {
                alt80=3;
                }
                break;
            case RULE_OP_LE:
                {
                alt80=4;
                }
                break;
            case RULE_OP_LT:
                {
                alt80=5;
                }
                break;
            case RULE_OP_NE:
                {
                alt80=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalAlpha.g:5599:3: this_OP_EQ_0= RULE_OP_EQ
                    {
                    this_OP_EQ_0=(Token)match(input,RULE_OP_EQ,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP_EQ_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP_EQ_0, grammarAccess.getRELATIONAL_OPAccess().getOP_EQTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAlpha.g:5607:3: this_OP_GE_1= RULE_OP_GE
                    {
                    this_OP_GE_1=(Token)match(input,RULE_OP_GE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP_GE_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP_GE_1, grammarAccess.getRELATIONAL_OPAccess().getOP_GETerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAlpha.g:5615:3: this_OP_GT_2= RULE_OP_GT
                    {
                    this_OP_GT_2=(Token)match(input,RULE_OP_GT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP_GT_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP_GT_2, grammarAccess.getRELATIONAL_OPAccess().getOP_GTTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAlpha.g:5623:3: this_OP_LE_3= RULE_OP_LE
                    {
                    this_OP_LE_3=(Token)match(input,RULE_OP_LE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP_LE_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP_LE_3, grammarAccess.getRELATIONAL_OPAccess().getOP_LETerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAlpha.g:5631:3: this_OP_LT_4= RULE_OP_LT
                    {
                    this_OP_LT_4=(Token)match(input,RULE_OP_LT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP_LT_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP_LT_4, grammarAccess.getRELATIONAL_OPAccess().getOP_LTTerminalRuleCall_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAlpha.g:5639:3: this_OP_NE_5= RULE_OP_NE
                    {
                    this_OP_NE_5=(Token)match(input,RULE_OP_NE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP_NE_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP_NE_5, grammarAccess.getRELATIONAL_OPAccess().getOP_NETerminalRuleCall_5());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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

    // $ANTLR start synpred1_InternalAlpha
    public final void synpred1_InternalAlpha_fragment() throws RecognitionException {   
        // InternalAlpha.g:4460:4: ( ruleAVariableDomain )
        // InternalAlpha.g:4460:5: ruleAVariableDomain
        {
        pushFollow(FOLLOW_2);
        ruleAVariableDomain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalAlpha

    // Delegated rules

    public final boolean synpred1_InternalAlpha() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalAlpha_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA28 dfa28 = new DFA28(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA61 dfa61 = new DFA61(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\2\4\3\uffff\1\4\2\uffff\1\63\1\62\1\63\1\4\1\uffff\2\63";
    static final String dfa_3s = "\2\100\3\uffff\1\101\2\uffff\1\101\1\104\1\101\1\4\1\uffff\2\101";
    static final String dfa_4s = "\2\uffff\1\3\1\4\1\6\1\uffff\1\1\1\5\4\uffff\1\2\2\uffff";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\34\uffff\1\1\4\uffff\1\4\31\uffff\1\3",
            "\1\7\55\uffff\1\6\15\uffff\1\5",
            "",
            "",
            "",
            "\1\10\74\uffff\1\11",
            "",
            "",
            "\1\13\1\uffff\1\12\13\uffff\1\11",
            "\1\6\21\uffff\1\14",
            "\1\13\1\uffff\1\12\13\uffff\1\11",
            "\1\15",
            "",
            "\1\13\1\uffff\1\16\13\uffff\1\11",
            "\1\13\1\uffff\1\16\13\uffff\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1445:2: (this_AISLSet_0= ruleAISLSet | this_AISLRelation_1= ruleAISLRelation | this_ADeclaredObject_2= ruleADeclaredObject | this_ARectangularDomain_3= ruleARectangularDomain | this_AVariableDomain_4= ruleAVariableDomain | (otherlv_5= '(' this_APolyhedralObjectExpression_6= ruleAPolyhedralObjectExpression otherlv_7= ')' ) )";
        }
    }
    static final String dfa_7s = "\21\uffff";
    static final String dfa_8s = "\7\uffff\1\20\11\uffff";
    static final String dfa_9s = "\2\4\5\uffff\1\6\4\uffff\1\6\4\uffff";
    static final String dfa_10s = "\1\120\1\121\5\uffff\1\114\4\uffff\1\104\4\uffff";
    static final String dfa_11s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\11\1\12\1\15\1\uffff\1\13\1\1\1\14\1\10";
    static final String dfa_12s = "\21\uffff}>";
    static final String[] dfa_13s = {
            "\1\7\1\10\1\uffff\1\6\1\uffff\1\6\2\uffff\2\6\3\uffff\1\6\1\uffff\2\6\2\10\17\uffff\1\1\31\uffff\1\12\6\uffff\1\2\1\13\4\uffff\1\11\1\3\1\4\1\5",
            "\1\14\1\16\1\uffff\3\16\2\uffff\2\16\3\uffff\1\16\1\uffff\4\16\12\uffff\1\16\4\uffff\1\16\31\uffff\1\16\3\uffff\1\15\1\uffff\3\16\1\uffff\1\16\2\uffff\5\16",
            "",
            "",
            "",
            "",
            "",
            "\5\20\1\uffff\2\20\3\uffff\4\20\2\uffff\5\20\12\uffff\1\6\1\20\13\uffff\1\20\14\uffff\1\17\2\uffff\1\20\7\uffff\2\20",
            "",
            "",
            "",
            "",
            "\5\16\1\uffff\2\16\3\uffff\4\16\2\uffff\5\16\12\uffff\2\16\12\uffff\1\16\1\15\1\uffff\1\15\12\uffff\1\16\3\uffff\1\15",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2710:2: (this_AParanthesizedAlphabetsExpression_0= ruleAParanthesizedAlphabetsExpression | this_ACaseExpression_1= ruleACaseExpression | this_AReduceExpression_2= ruleAReduceExpression | this_AArgReduceExpression_3= ruleAArgReduceExpression | this_AConvExpression_4= ruleAConvExpression | this_AMultiArgExpression_5= ruleAMultiArgExpression | this_AConstantExpression_6= ruleAConstantExpression | this_AVariableExpression_7= ruleAVariableExpression | this_AIndexExpression_8= ruleAIndexExpression | this_AIndexExpressionInArrayNotation_9= ruleAIndexExpressionInArrayNotation | this_ADependenceExpression_10= ruleADependenceExpression | this_ADependenceInArrayNotation_11= ruleADependenceInArrayNotation | this_ASelectDependenceExpression_12= ruleASelectDependenceExpression )";
        }
    }
    static final String dfa_14s = "\20\uffff";
    static final String dfa_15s = "\2\4\1\uffff\1\7\1\uffff\1\4\1\uffff\1\0\1\63\1\7\1\uffff\1\63\1\4\1\uffff\2\63";
    static final String dfa_16s = "\1\41\1\100\1\uffff\1\71\1\uffff\1\101\1\uffff\1\0\1\101\1\104\1\uffff\1\101\1\4\1\uffff\2\101";
    static final String dfa_17s = "\2\uffff\1\3\1\uffff\1\5\1\uffff\1\1\3\uffff\1\4\2\uffff\1\2\2\uffff";
    static final String dfa_18s = "\7\uffff\1\0\10\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\34\uffff\1\1",
            "\1\3\34\uffff\1\4\4\uffff\1\4\13\uffff\1\6\7\uffff\6\4\1\5",
            "",
            "\3\4\30\uffff\1\7\23\uffff\4\4",
            "",
            "\1\10\74\uffff\1\11",
            "",
            "\1\uffff",
            "\1\14\1\uffff\1\13\13\uffff\1\11",
            "\3\4\30\uffff\1\4\17\uffff\1\6\3\uffff\4\4\10\uffff\1\4\1\uffff\1\15",
            "",
            "\1\14\1\uffff\1\13\13\uffff\1\11",
            "\1\16",
            "",
            "\1\14\1\uffff\1\17\13\uffff\1\11",
            "\1\14\1\uffff\1\17\13\uffff\1\11"
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
            return "4431:2: (this_AISLSet_0= ruleAISLSet | this_AISLRelation_1= ruleAISLRelation | this_ADeclaredObject_2= ruleADeclaredObject | ( ( ruleAVariableDomain )=>this_AVariableDomain_3= ruleAVariableDomain ) | (otherlv_4= '{' this_APolyhedralObjectExpression_5= ruleAPolyhedralObjectExpression otherlv_6= '}' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_7 = input.LA(1);

                         
                        int index61_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalAlpha()) ) {s = 10;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index61_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000013900000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000013D00000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00037E0000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00037C0000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0003780000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0003700000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0003600000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0003400000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xFC00004200000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000042007A33B0L,0x000000000003E5C1L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002404000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x03C0000000000382L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000C00C00F81FFF0L,0x0000000000000003L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000C00C40F81FFF0L,0x0000000000000003L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000C00C00F81FFF2L,0x0000000000000003L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000001L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000000C2007A33B0L,0x000000000003E5C1L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008008000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000130L,0x0000000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000022002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000041002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00000046007A33B0L,0x000000000003E5C1L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x00000000001A3290L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000008000000130L});

}