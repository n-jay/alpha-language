package alpha.commands.model.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import alpha.commands.model.services.CommandsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCommandsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "':'", "'@Bind'", "'('", "';'", "','", "')'", "'='", "'=>'", "'_'", "'Void'", "'AlphaNode'", "'AlphaCompleteVisitable'", "'AlphaVisitable'", "'AlphaExpressionVisitable'", "'AlphaRoot'", "'AlphaSystem'", "'SystemBody'", "'Variable'", "'Equation'", "'StandardEquation'", "'UseEquation'", "'AlphaExpression'", "'AbstractReduceExpression'", "'BinaryExpression'", "'DependenceExpression'", "'ReduceExpression'", "'AffineFunction'", "'Domain'", "'ParameterDomain'", "'List<AlphaRoot>'", "'String'", "'List<String>'", "'String[]'", "'int'", "'List<Integer>'", "'int[]'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCommandsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCommandsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCommandsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCommands.g"; }



     	private CommandsGrammarAccess grammarAccess;

        public InternalCommandsParser(TokenStream input, CommandsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AlphaCommandsRoot";
       	}

       	@Override
       	protected CommandsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAlphaCommandsRoot"
    // InternalCommands.g:64:1: entryRuleAlphaCommandsRoot returns [EObject current=null] : iv_ruleAlphaCommandsRoot= ruleAlphaCommandsRoot EOF ;
    public final EObject entryRuleAlphaCommandsRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaCommandsRoot = null;


        try {
            // InternalCommands.g:64:58: (iv_ruleAlphaCommandsRoot= ruleAlphaCommandsRoot EOF )
            // InternalCommands.g:65:2: iv_ruleAlphaCommandsRoot= ruleAlphaCommandsRoot EOF
            {
             newCompositeNode(grammarAccess.getAlphaCommandsRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlphaCommandsRoot=ruleAlphaCommandsRoot();

            state._fsp--;

             current =iv_ruleAlphaCommandsRoot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlphaCommandsRoot"


    // $ANTLR start "ruleAlphaCommandsRoot"
    // InternalCommands.g:71:1: ruleAlphaCommandsRoot returns [EObject current=null] : ( (lv_categories_0_0= ruleAlphaCommandCategory ) )* ;
    public final EObject ruleAlphaCommandsRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_categories_0_0 = null;



        	enterRule();

        try {
            // InternalCommands.g:77:2: ( ( (lv_categories_0_0= ruleAlphaCommandCategory ) )* )
            // InternalCommands.g:78:2: ( (lv_categories_0_0= ruleAlphaCommandCategory ) )*
            {
            // InternalCommands.g:78:2: ( (lv_categories_0_0= ruleAlphaCommandCategory ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCommands.g:79:3: (lv_categories_0_0= ruleAlphaCommandCategory )
            	    {
            	    // InternalCommands.g:79:3: (lv_categories_0_0= ruleAlphaCommandCategory )
            	    // InternalCommands.g:80:4: lv_categories_0_0= ruleAlphaCommandCategory
            	    {

            	    				newCompositeNode(grammarAccess.getAlphaCommandsRootAccess().getCategoriesAlphaCommandCategoryParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_categories_0_0=ruleAlphaCommandCategory();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getAlphaCommandsRootRule());
            	    				}
            	    				add(
            	    					current,
            	    					"categories",
            	    					lv_categories_0_0,
            	    					"alpha.commands.model.Commands.AlphaCommandCategory");
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
    // $ANTLR end "ruleAlphaCommandsRoot"


    // $ANTLR start "entryRuleAlphaCommandCategory"
    // InternalCommands.g:100:1: entryRuleAlphaCommandCategory returns [EObject current=null] : iv_ruleAlphaCommandCategory= ruleAlphaCommandCategory EOF ;
    public final EObject entryRuleAlphaCommandCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaCommandCategory = null;


        try {
            // InternalCommands.g:100:61: (iv_ruleAlphaCommandCategory= ruleAlphaCommandCategory EOF )
            // InternalCommands.g:101:2: iv_ruleAlphaCommandCategory= ruleAlphaCommandCategory EOF
            {
             newCompositeNode(grammarAccess.getAlphaCommandCategoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlphaCommandCategory=ruleAlphaCommandCategory();

            state._fsp--;

             current =iv_ruleAlphaCommandCategory; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlphaCommandCategory"


    // $ANTLR start "ruleAlphaCommandCategory"
    // InternalCommands.g:107:1: ruleAlphaCommandCategory returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_commands_2_0= ruleAlphaCommand ) )* otherlv_3= '}' ) ;
    public final EObject ruleAlphaCommandCategory() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_commands_2_0 = null;



        	enterRule();

        try {
            // InternalCommands.g:113:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_commands_2_0= ruleAlphaCommand ) )* otherlv_3= '}' ) )
            // InternalCommands.g:114:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_commands_2_0= ruleAlphaCommand ) )* otherlv_3= '}' )
            {
            // InternalCommands.g:114:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_commands_2_0= ruleAlphaCommand ) )* otherlv_3= '}' )
            // InternalCommands.g:115:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_commands_2_0= ruleAlphaCommand ) )* otherlv_3= '}'
            {
            // InternalCommands.g:115:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCommands.g:116:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCommands.g:116:4: (lv_name_0_0= RULE_ID )
            // InternalCommands.g:117:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAlphaCommandCategoryAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlphaCommandCategoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAlphaCommandCategoryAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCommands.g:137:3: ( (lv_commands_2_0= ruleAlphaCommand ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCommands.g:138:4: (lv_commands_2_0= ruleAlphaCommand )
            	    {
            	    // InternalCommands.g:138:4: (lv_commands_2_0= ruleAlphaCommand )
            	    // InternalCommands.g:139:5: lv_commands_2_0= ruleAlphaCommand
            	    {

            	    					newCompositeNode(grammarAccess.getAlphaCommandCategoryAccess().getCommandsAlphaCommandParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_commands_2_0=ruleAlphaCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlphaCommandCategoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_2_0,
            	    						"alpha.commands.model.Commands.AlphaCommand");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAlphaCommandCategoryAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlphaCommandCategory"


    // $ANTLR start "entryRuleAlphaCommand"
    // InternalCommands.g:164:1: entryRuleAlphaCommand returns [EObject current=null] : iv_ruleAlphaCommand= ruleAlphaCommand EOF ;
    public final EObject entryRuleAlphaCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaCommand = null;


        try {
            // InternalCommands.g:164:53: (iv_ruleAlphaCommand= ruleAlphaCommand EOF )
            // InternalCommands.g:165:2: iv_ruleAlphaCommand= ruleAlphaCommand EOF
            {
             newCompositeNode(grammarAccess.getAlphaCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlphaCommand=ruleAlphaCommand();

            state._fsp--;

             current =iv_ruleAlphaCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlphaCommand"


    // $ANTLR start "ruleAlphaCommand"
    // InternalCommands.g:171:1: ruleAlphaCommand returns [EObject current=null] : ( ( (lv_binding_0_0= ruleCommandBinding ) )? ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_signature_4_0= ruleAlphaCommandSignature ) ) ( (lv_specializations_5_0= ruleAlphaCommandSpecialization ) )* ) ;
    public final EObject ruleAlphaCommand() throws RecognitionException {
        EObject current = null;

        Token lv_label_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_binding_0_0 = null;

        EObject lv_signature_4_0 = null;

        EObject lv_specializations_5_0 = null;



        	enterRule();

        try {
            // InternalCommands.g:177:2: ( ( ( (lv_binding_0_0= ruleCommandBinding ) )? ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_signature_4_0= ruleAlphaCommandSignature ) ) ( (lv_specializations_5_0= ruleAlphaCommandSpecialization ) )* ) )
            // InternalCommands.g:178:2: ( ( (lv_binding_0_0= ruleCommandBinding ) )? ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_signature_4_0= ruleAlphaCommandSignature ) ) ( (lv_specializations_5_0= ruleAlphaCommandSpecialization ) )* )
            {
            // InternalCommands.g:178:2: ( ( (lv_binding_0_0= ruleCommandBinding ) )? ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_signature_4_0= ruleAlphaCommandSignature ) ) ( (lv_specializations_5_0= ruleAlphaCommandSpecialization ) )* )
            // InternalCommands.g:179:3: ( (lv_binding_0_0= ruleCommandBinding ) )? ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_signature_4_0= ruleAlphaCommandSignature ) ) ( (lv_specializations_5_0= ruleAlphaCommandSpecialization ) )*
            {
            // InternalCommands.g:179:3: ( (lv_binding_0_0= ruleCommandBinding ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCommands.g:180:4: (lv_binding_0_0= ruleCommandBinding )
                    {
                    // InternalCommands.g:180:4: (lv_binding_0_0= ruleCommandBinding )
                    // InternalCommands.g:181:5: lv_binding_0_0= ruleCommandBinding
                    {

                    					newCompositeNode(grammarAccess.getAlphaCommandAccess().getBindingCommandBindingParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_binding_0_0=ruleCommandBinding();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAlphaCommandRule());
                    					}
                    					set(
                    						current,
                    						"binding",
                    						lv_binding_0_0,
                    						"alpha.commands.model.Commands.CommandBinding");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCommands.g:198:3: ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==13) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // InternalCommands.g:199:4: ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':'
                    {
                    // InternalCommands.g:199:4: ( (lv_label_1_0= RULE_ID ) )
                    // InternalCommands.g:200:5: (lv_label_1_0= RULE_ID )
                    {
                    // InternalCommands.g:200:5: (lv_label_1_0= RULE_ID )
                    // InternalCommands.g:201:6: lv_label_1_0= RULE_ID
                    {
                    lv_label_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_label_1_0, grammarAccess.getAlphaCommandAccess().getLabelIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAlphaCommandRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"label",
                    							lv_label_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getAlphaCommandAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCommands.g:222:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalCommands.g:223:4: (lv_name_3_0= RULE_ID )
            {
            // InternalCommands.g:223:4: (lv_name_3_0= RULE_ID )
            // InternalCommands.g:224:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_3_0, grammarAccess.getAlphaCommandAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlphaCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCommands.g:240:3: ( (lv_signature_4_0= ruleAlphaCommandSignature ) )
            // InternalCommands.g:241:4: (lv_signature_4_0= ruleAlphaCommandSignature )
            {
            // InternalCommands.g:241:4: (lv_signature_4_0= ruleAlphaCommandSignature )
            // InternalCommands.g:242:5: lv_signature_4_0= ruleAlphaCommandSignature
            {

            					newCompositeNode(grammarAccess.getAlphaCommandAccess().getSignatureAlphaCommandSignatureParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_signature_4_0=ruleAlphaCommandSignature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlphaCommandRule());
            					}
            					set(
            						current,
            						"signature",
            						lv_signature_4_0,
            						"alpha.commands.model.Commands.AlphaCommandSignature");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCommands.g:259:3: ( (lv_specializations_5_0= ruleAlphaCommandSpecialization ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCommands.g:260:4: (lv_specializations_5_0= ruleAlphaCommandSpecialization )
            	    {
            	    // InternalCommands.g:260:4: (lv_specializations_5_0= ruleAlphaCommandSpecialization )
            	    // InternalCommands.g:261:5: lv_specializations_5_0= ruleAlphaCommandSpecialization
            	    {

            	    					newCompositeNode(grammarAccess.getAlphaCommandAccess().getSpecializationsAlphaCommandSpecializationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_specializations_5_0=ruleAlphaCommandSpecialization();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlphaCommandRule());
            	    					}
            	    					add(
            	    						current,
            	    						"specializations",
            	    						lv_specializations_5_0,
            	    						"alpha.commands.model.Commands.AlphaCommandSpecialization");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleAlphaCommand"


    // $ANTLR start "entryRuleCommandBinding"
    // InternalCommands.g:282:1: entryRuleCommandBinding returns [EObject current=null] : iv_ruleCommandBinding= ruleCommandBinding EOF ;
    public final EObject entryRuleCommandBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandBinding = null;


        try {
            // InternalCommands.g:282:55: (iv_ruleCommandBinding= ruleCommandBinding EOF )
            // InternalCommands.g:283:2: iv_ruleCommandBinding= ruleCommandBinding EOF
            {
             newCompositeNode(grammarAccess.getCommandBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandBinding=ruleCommandBinding();

            state._fsp--;

             current =iv_ruleCommandBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandBinding"


    // $ANTLR start "ruleCommandBinding"
    // InternalCommands.g:289:1: ruleCommandBinding returns [EObject current=null] : (otherlv_0= '@Bind' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ( ( (lv_argumentBindings_4_0= ruleArgumentBinding ) ) | ( (lv_argumentRenamings_5_0= ruleArgumentRenaming ) ) ) (otherlv_6= ',' ( ( (lv_argumentBindings_7_0= ruleArgumentBinding ) ) | ( (lv_argumentRenamings_8_0= ruleArgumentRenaming ) ) ) )* otherlv_9= ')' ) ;
    public final EObject ruleCommandBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_argumentBindings_4_0 = null;

        EObject lv_argumentRenamings_5_0 = null;

        EObject lv_argumentBindings_7_0 = null;

        EObject lv_argumentRenamings_8_0 = null;



        	enterRule();

        try {
            // InternalCommands.g:295:2: ( (otherlv_0= '@Bind' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ( ( (lv_argumentBindings_4_0= ruleArgumentBinding ) ) | ( (lv_argumentRenamings_5_0= ruleArgumentRenaming ) ) ) (otherlv_6= ',' ( ( (lv_argumentBindings_7_0= ruleArgumentBinding ) ) | ( (lv_argumentRenamings_8_0= ruleArgumentRenaming ) ) ) )* otherlv_9= ')' ) )
            // InternalCommands.g:296:2: (otherlv_0= '@Bind' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ( ( (lv_argumentBindings_4_0= ruleArgumentBinding ) ) | ( (lv_argumentRenamings_5_0= ruleArgumentRenaming ) ) ) (otherlv_6= ',' ( ( (lv_argumentBindings_7_0= ruleArgumentBinding ) ) | ( (lv_argumentRenamings_8_0= ruleArgumentRenaming ) ) ) )* otherlv_9= ')' )
            {
            // InternalCommands.g:296:2: (otherlv_0= '@Bind' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ( ( (lv_argumentBindings_4_0= ruleArgumentBinding ) ) | ( (lv_argumentRenamings_5_0= ruleArgumentRenaming ) ) ) (otherlv_6= ',' ( ( (lv_argumentBindings_7_0= ruleArgumentBinding ) ) | ( (lv_argumentRenamings_8_0= ruleArgumentRenaming ) ) ) )* otherlv_9= ')' )
            // InternalCommands.g:297:3: otherlv_0= '@Bind' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ( ( (lv_argumentBindings_4_0= ruleArgumentBinding ) ) | ( (lv_argumentRenamings_5_0= ruleArgumentRenaming ) ) ) (otherlv_6= ',' ( ( (lv_argumentBindings_7_0= ruleArgumentBinding ) ) | ( (lv_argumentRenamings_8_0= ruleArgumentRenaming ) ) ) )* otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandBindingAccess().getBindKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandBindingAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCommands.g:305:3: ( (otherlv_2= RULE_ID ) )
            // InternalCommands.g:306:4: (otherlv_2= RULE_ID )
            {
            // InternalCommands.g:306:4: (otherlv_2= RULE_ID )
            // InternalCommands.g:307:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandBindingRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getCommandBindingAccess().getBindTargetCommandAlphaCommandCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getCommandBindingAccess().getSemicolonKeyword_3());
            		
            // InternalCommands.g:322:3: ( ( (lv_argumentBindings_4_0= ruleArgumentBinding ) ) | ( (lv_argumentRenamings_5_0= ruleArgumentRenaming ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==19) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==RULE_ID) ) {
                        alt6=2;
                    }
                    else if ( (LA6_2==15) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCommands.g:323:4: ( (lv_argumentBindings_4_0= ruleArgumentBinding ) )
                    {
                    // InternalCommands.g:323:4: ( (lv_argumentBindings_4_0= ruleArgumentBinding ) )
                    // InternalCommands.g:324:5: (lv_argumentBindings_4_0= ruleArgumentBinding )
                    {
                    // InternalCommands.g:324:5: (lv_argumentBindings_4_0= ruleArgumentBinding )
                    // InternalCommands.g:325:6: lv_argumentBindings_4_0= ruleArgumentBinding
                    {

                    						newCompositeNode(grammarAccess.getCommandBindingAccess().getArgumentBindingsArgumentBindingParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_argumentBindings_4_0=ruleArgumentBinding();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandBindingRule());
                    						}
                    						add(
                    							current,
                    							"argumentBindings",
                    							lv_argumentBindings_4_0,
                    							"alpha.commands.model.Commands.ArgumentBinding");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCommands.g:343:4: ( (lv_argumentRenamings_5_0= ruleArgumentRenaming ) )
                    {
                    // InternalCommands.g:343:4: ( (lv_argumentRenamings_5_0= ruleArgumentRenaming ) )
                    // InternalCommands.g:344:5: (lv_argumentRenamings_5_0= ruleArgumentRenaming )
                    {
                    // InternalCommands.g:344:5: (lv_argumentRenamings_5_0= ruleArgumentRenaming )
                    // InternalCommands.g:345:6: lv_argumentRenamings_5_0= ruleArgumentRenaming
                    {

                    						newCompositeNode(grammarAccess.getCommandBindingAccess().getArgumentRenamingsArgumentRenamingParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_argumentRenamings_5_0=ruleArgumentRenaming();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandBindingRule());
                    						}
                    						add(
                    							current,
                    							"argumentRenamings",
                    							lv_argumentRenamings_5_0,
                    							"alpha.commands.model.Commands.ArgumentRenaming");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCommands.g:363:3: (otherlv_6= ',' ( ( (lv_argumentBindings_7_0= ruleArgumentBinding ) ) | ( (lv_argumentRenamings_8_0= ruleArgumentRenaming ) ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCommands.g:364:4: otherlv_6= ',' ( ( (lv_argumentBindings_7_0= ruleArgumentBinding ) ) | ( (lv_argumentRenamings_8_0= ruleArgumentRenaming ) ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getCommandBindingAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalCommands.g:368:4: ( ( (lv_argumentBindings_7_0= ruleArgumentBinding ) ) | ( (lv_argumentRenamings_8_0= ruleArgumentRenaming ) ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==RULE_ID) ) {
            	        int LA7_1 = input.LA(2);

            	        if ( (LA7_1==19) ) {
            	            int LA7_2 = input.LA(3);

            	            if ( (LA7_2==15) ) {
            	                alt7=1;
            	            }
            	            else if ( (LA7_2==RULE_ID) ) {
            	                alt7=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 7, 2, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 7, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalCommands.g:369:5: ( (lv_argumentBindings_7_0= ruleArgumentBinding ) )
            	            {
            	            // InternalCommands.g:369:5: ( (lv_argumentBindings_7_0= ruleArgumentBinding ) )
            	            // InternalCommands.g:370:6: (lv_argumentBindings_7_0= ruleArgumentBinding )
            	            {
            	            // InternalCommands.g:370:6: (lv_argumentBindings_7_0= ruleArgumentBinding )
            	            // InternalCommands.g:371:7: lv_argumentBindings_7_0= ruleArgumentBinding
            	            {

            	            							newCompositeNode(grammarAccess.getCommandBindingAccess().getArgumentBindingsArgumentBindingParserRuleCall_5_1_0_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_argumentBindings_7_0=ruleArgumentBinding();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getCommandBindingRule());
            	            							}
            	            							add(
            	            								current,
            	            								"argumentBindings",
            	            								lv_argumentBindings_7_0,
            	            								"alpha.commands.model.Commands.ArgumentBinding");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCommands.g:389:5: ( (lv_argumentRenamings_8_0= ruleArgumentRenaming ) )
            	            {
            	            // InternalCommands.g:389:5: ( (lv_argumentRenamings_8_0= ruleArgumentRenaming ) )
            	            // InternalCommands.g:390:6: (lv_argumentRenamings_8_0= ruleArgumentRenaming )
            	            {
            	            // InternalCommands.g:390:6: (lv_argumentRenamings_8_0= ruleArgumentRenaming )
            	            // InternalCommands.g:391:7: lv_argumentRenamings_8_0= ruleArgumentRenaming
            	            {

            	            							newCompositeNode(grammarAccess.getCommandBindingAccess().getArgumentRenamingsArgumentRenamingParserRuleCall_5_1_1_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_argumentRenamings_8_0=ruleArgumentRenaming();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getCommandBindingRule());
            	            							}
            	            							add(
            	            								current,
            	            								"argumentRenamings",
            	            								lv_argumentRenamings_8_0,
            	            								"alpha.commands.model.Commands.ArgumentRenaming");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCommandBindingAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandBinding"


    // $ANTLR start "entryRuleArgumentBinding"
    // InternalCommands.g:418:1: entryRuleArgumentBinding returns [EObject current=null] : iv_ruleArgumentBinding= ruleArgumentBinding EOF ;
    public final EObject entryRuleArgumentBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentBinding = null;


        try {
            // InternalCommands.g:418:56: (iv_ruleArgumentBinding= ruleArgumentBinding EOF )
            // InternalCommands.g:419:2: iv_ruleArgumentBinding= ruleArgumentBinding EOF
            {
             newCompositeNode(grammarAccess.getArgumentBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgumentBinding=ruleArgumentBinding();

            state._fsp--;

             current =iv_ruleArgumentBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgumentBinding"


    // $ANTLR start "ruleArgumentBinding"
    // InternalCommands.g:425:1: ruleArgumentBinding returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleArgumentBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalCommands.g:431:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' ) )
            // InternalCommands.g:432:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )
            {
            // InternalCommands.g:432:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )
            // InternalCommands.g:433:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')'
            {
            // InternalCommands.g:433:3: ( (otherlv_0= RULE_ID ) )
            // InternalCommands.g:434:4: (otherlv_0= RULE_ID )
            {
            // InternalCommands.g:434:4: (otherlv_0= RULE_ID )
            // InternalCommands.g:435:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgumentBindingRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_0, grammarAccess.getArgumentBindingAccess().getBindTargetAlphaCommandArgumentCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getArgumentBindingAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getArgumentBindingAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCommands.g:454:3: ( (otherlv_3= RULE_ID ) )
            // InternalCommands.g:455:4: (otherlv_3= RULE_ID )
            {
            // InternalCommands.g:455:4: (otherlv_3= RULE_ID )
            // InternalCommands.g:456:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgumentBindingRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_3, grammarAccess.getArgumentBindingAccess().getBindSourceAlphaCommandArgumentCrossReference_3_0());
            				

            }


            }

            // InternalCommands.g:467:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCommands.g:468:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getArgumentBindingAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCommands.g:472:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalCommands.g:473:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalCommands.g:473:5: (otherlv_5= RULE_ID )
            	    // InternalCommands.g:474:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getArgumentBindingRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    						newLeafNode(otherlv_5, grammarAccess.getArgumentBindingAccess().getBindSourceAlphaCommandArgumentCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getArgumentBindingAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgumentBinding"


    // $ANTLR start "entryRuleArgumentRenaming"
    // InternalCommands.g:494:1: entryRuleArgumentRenaming returns [EObject current=null] : iv_ruleArgumentRenaming= ruleArgumentRenaming EOF ;
    public final EObject entryRuleArgumentRenaming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentRenaming = null;


        try {
            // InternalCommands.g:494:57: (iv_ruleArgumentRenaming= ruleArgumentRenaming EOF )
            // InternalCommands.g:495:2: iv_ruleArgumentRenaming= ruleArgumentRenaming EOF
            {
             newCompositeNode(grammarAccess.getArgumentRenamingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgumentRenaming=ruleArgumentRenaming();

            state._fsp--;

             current =iv_ruleArgumentRenaming; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgumentRenaming"


    // $ANTLR start "ruleArgumentRenaming"
    // InternalCommands.g:501:1: ruleArgumentRenaming returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleArgumentRenaming() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCommands.g:507:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalCommands.g:508:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalCommands.g:508:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // InternalCommands.g:509:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            // InternalCommands.g:509:3: ( (otherlv_0= RULE_ID ) )
            // InternalCommands.g:510:4: (otherlv_0= RULE_ID )
            {
            // InternalCommands.g:510:4: (otherlv_0= RULE_ID )
            // InternalCommands.g:511:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgumentRenamingRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_0, grammarAccess.getArgumentRenamingAccess().getBindTargetAlphaCommandArgumentCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getArgumentRenamingAccess().getEqualsSignKeyword_1());
            		
            // InternalCommands.g:526:3: ( (otherlv_2= RULE_ID ) )
            // InternalCommands.g:527:4: (otherlv_2= RULE_ID )
            {
            // InternalCommands.g:527:4: (otherlv_2= RULE_ID )
            // InternalCommands.g:528:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgumentRenamingRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getArgumentRenamingAccess().getBindSourceAlphaCommandArgumentCrossReference_2_0());
            				

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
    // $ANTLR end "ruleArgumentRenaming"


    // $ANTLR start "entryRuleAlphaCommandSignature"
    // InternalCommands.g:543:1: entryRuleAlphaCommandSignature returns [EObject current=null] : iv_ruleAlphaCommandSignature= ruleAlphaCommandSignature EOF ;
    public final EObject entryRuleAlphaCommandSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaCommandSignature = null;


        try {
            // InternalCommands.g:543:62: (iv_ruleAlphaCommandSignature= ruleAlphaCommandSignature EOF )
            // InternalCommands.g:544:2: iv_ruleAlphaCommandSignature= ruleAlphaCommandSignature EOF
            {
             newCompositeNode(grammarAccess.getAlphaCommandSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlphaCommandSignature=ruleAlphaCommandSignature();

            state._fsp--;

             current =iv_ruleAlphaCommandSignature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlphaCommandSignature"


    // $ANTLR start "ruleAlphaCommandSignature"
    // InternalCommands.g:550:1: ruleAlphaCommandSignature returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAlphaCommandArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleAlphaCommandArgument ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (lv_returnType_7_0= ruleArgumentType ) ) )? ) ;
    public final EObject ruleAlphaCommandSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;

        AntlrDatatypeRuleToken lv_returnType_7_0 = null;



        	enterRule();

        try {
            // InternalCommands.g:556:2: ( ( () otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAlphaCommandArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleAlphaCommandArgument ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (lv_returnType_7_0= ruleArgumentType ) ) )? ) )
            // InternalCommands.g:557:2: ( () otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAlphaCommandArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleAlphaCommandArgument ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (lv_returnType_7_0= ruleArgumentType ) ) )? )
            {
            // InternalCommands.g:557:2: ( () otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAlphaCommandArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleAlphaCommandArgument ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (lv_returnType_7_0= ruleArgumentType ) ) )? )
            // InternalCommands.g:558:3: () otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAlphaCommandArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleAlphaCommandArgument ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (lv_returnType_7_0= ruleArgumentType ) ) )?
            {
            // InternalCommands.g:558:3: ()
            // InternalCommands.g:559:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlphaCommandSignatureAccess().getAlphaCommandSignatureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAlphaCommandSignatureAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCommands.g:569:3: ( ( (lv_arguments_2_0= ruleAlphaCommandArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleAlphaCommandArgument ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=22 && LA11_0<=48)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCommands.g:570:4: ( (lv_arguments_2_0= ruleAlphaCommandArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleAlphaCommandArgument ) ) )*
                    {
                    // InternalCommands.g:570:4: ( (lv_arguments_2_0= ruleAlphaCommandArgument ) )
                    // InternalCommands.g:571:5: (lv_arguments_2_0= ruleAlphaCommandArgument )
                    {
                    // InternalCommands.g:571:5: (lv_arguments_2_0= ruleAlphaCommandArgument )
                    // InternalCommands.g:572:6: lv_arguments_2_0= ruleAlphaCommandArgument
                    {

                    						newCompositeNode(grammarAccess.getAlphaCommandSignatureAccess().getArgumentsAlphaCommandArgumentParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_arguments_2_0=ruleAlphaCommandArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlphaCommandSignatureRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_2_0,
                    							"alpha.commands.model.Commands.AlphaCommandArgument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCommands.g:589:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleAlphaCommandArgument ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==17) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalCommands.g:590:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleAlphaCommandArgument ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_14); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAlphaCommandSignatureAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalCommands.g:594:5: ( (lv_arguments_4_0= ruleAlphaCommandArgument ) )
                    	    // InternalCommands.g:595:6: (lv_arguments_4_0= ruleAlphaCommandArgument )
                    	    {
                    	    // InternalCommands.g:595:6: (lv_arguments_4_0= ruleAlphaCommandArgument )
                    	    // InternalCommands.g:596:7: lv_arguments_4_0= ruleAlphaCommandArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlphaCommandSignatureAccess().getArgumentsAlphaCommandArgumentParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_arguments_4_0=ruleAlphaCommandArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlphaCommandSignatureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_4_0,
                    	    								"alpha.commands.model.Commands.AlphaCommandArgument");
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

            otherlv_5=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getAlphaCommandSignatureAccess().getRightParenthesisKeyword_3());
            		
            // InternalCommands.g:619:3: (otherlv_6= ':' ( (lv_returnType_7_0= ruleArgumentType ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCommands.g:620:4: otherlv_6= ':' ( (lv_returnType_7_0= ruleArgumentType ) )
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getAlphaCommandSignatureAccess().getColonKeyword_4_0());
                    			
                    // InternalCommands.g:624:4: ( (lv_returnType_7_0= ruleArgumentType ) )
                    // InternalCommands.g:625:5: (lv_returnType_7_0= ruleArgumentType )
                    {
                    // InternalCommands.g:625:5: (lv_returnType_7_0= ruleArgumentType )
                    // InternalCommands.g:626:6: lv_returnType_7_0= ruleArgumentType
                    {

                    						newCompositeNode(grammarAccess.getAlphaCommandSignatureAccess().getReturnTypeArgumentTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_returnType_7_0=ruleArgumentType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlphaCommandSignatureRule());
                    						}
                    						set(
                    							current,
                    							"returnType",
                    							lv_returnType_7_0,
                    							"alpha.commands.model.Commands.ArgumentType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleAlphaCommandSignature"


    // $ANTLR start "entryRuleAlphaCommandSpecialization"
    // InternalCommands.g:648:1: entryRuleAlphaCommandSpecialization returns [EObject current=null] : iv_ruleAlphaCommandSpecialization= ruleAlphaCommandSpecialization EOF ;
    public final EObject entryRuleAlphaCommandSpecialization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaCommandSpecialization = null;


        try {
            // InternalCommands.g:648:67: (iv_ruleAlphaCommandSpecialization= ruleAlphaCommandSpecialization EOF )
            // InternalCommands.g:649:2: iv_ruleAlphaCommandSpecialization= ruleAlphaCommandSpecialization EOF
            {
             newCompositeNode(grammarAccess.getAlphaCommandSpecializationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlphaCommandSpecialization=ruleAlphaCommandSpecialization();

            state._fsp--;

             current =iv_ruleAlphaCommandSpecialization; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlphaCommandSpecialization"


    // $ANTLR start "ruleAlphaCommandSpecialization"
    // InternalCommands.g:655:1: ruleAlphaCommandSpecialization returns [EObject current=null] : ( () otherlv_1= '=>' otherlv_2= '(' ( ( (lv_arguments_3_0= ruleCommandArgumentSpecialization ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleCommandArgumentSpecialization ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleAlphaCommandSpecialization() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalCommands.g:661:2: ( ( () otherlv_1= '=>' otherlv_2= '(' ( ( (lv_arguments_3_0= ruleCommandArgumentSpecialization ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleCommandArgumentSpecialization ) ) )* )? otherlv_6= ')' ) )
            // InternalCommands.g:662:2: ( () otherlv_1= '=>' otherlv_2= '(' ( ( (lv_arguments_3_0= ruleCommandArgumentSpecialization ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleCommandArgumentSpecialization ) ) )* )? otherlv_6= ')' )
            {
            // InternalCommands.g:662:2: ( () otherlv_1= '=>' otherlv_2= '(' ( ( (lv_arguments_3_0= ruleCommandArgumentSpecialization ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleCommandArgumentSpecialization ) ) )* )? otherlv_6= ')' )
            // InternalCommands.g:663:3: () otherlv_1= '=>' otherlv_2= '(' ( ( (lv_arguments_3_0= ruleCommandArgumentSpecialization ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleCommandArgumentSpecialization ) ) )* )? otherlv_6= ')'
            {
            // InternalCommands.g:663:3: ()
            // InternalCommands.g:664:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlphaCommandSpecializationAccess().getAlphaCommandSpecializationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAlphaCommandSpecializationAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getAlphaCommandSpecializationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCommands.g:678:3: ( ( (lv_arguments_3_0= ruleCommandArgumentSpecialization ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleCommandArgumentSpecialization ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING||(LA14_0>=21 && LA14_0<=48)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCommands.g:679:4: ( (lv_arguments_3_0= ruleCommandArgumentSpecialization ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleCommandArgumentSpecialization ) ) )*
                    {
                    // InternalCommands.g:679:4: ( (lv_arguments_3_0= ruleCommandArgumentSpecialization ) )
                    // InternalCommands.g:680:5: (lv_arguments_3_0= ruleCommandArgumentSpecialization )
                    {
                    // InternalCommands.g:680:5: (lv_arguments_3_0= ruleCommandArgumentSpecialization )
                    // InternalCommands.g:681:6: lv_arguments_3_0= ruleCommandArgumentSpecialization
                    {

                    						newCompositeNode(grammarAccess.getAlphaCommandSpecializationAccess().getArgumentsCommandArgumentSpecializationParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_arguments_3_0=ruleCommandArgumentSpecialization();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlphaCommandSpecializationRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_0,
                    							"alpha.commands.model.Commands.CommandArgumentSpecialization");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCommands.g:698:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleCommandArgumentSpecialization ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==17) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalCommands.g:699:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleCommandArgumentSpecialization ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_17); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getAlphaCommandSpecializationAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalCommands.g:703:5: ( (lv_arguments_5_0= ruleCommandArgumentSpecialization ) )
                    	    // InternalCommands.g:704:6: (lv_arguments_5_0= ruleCommandArgumentSpecialization )
                    	    {
                    	    // InternalCommands.g:704:6: (lv_arguments_5_0= ruleCommandArgumentSpecialization )
                    	    // InternalCommands.g:705:7: lv_arguments_5_0= ruleCommandArgumentSpecialization
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlphaCommandSpecializationAccess().getArgumentsCommandArgumentSpecializationParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_arguments_5_0=ruleCommandArgumentSpecialization();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlphaCommandSpecializationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_5_0,
                    	    								"alpha.commands.model.Commands.CommandArgumentSpecialization");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


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

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAlphaCommandSpecializationAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlphaCommandSpecialization"


    // $ANTLR start "entryRuleAlphaCommandArgument"
    // InternalCommands.g:732:1: entryRuleAlphaCommandArgument returns [EObject current=null] : iv_ruleAlphaCommandArgument= ruleAlphaCommandArgument EOF ;
    public final EObject entryRuleAlphaCommandArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlphaCommandArgument = null;


        try {
            // InternalCommands.g:732:61: (iv_ruleAlphaCommandArgument= ruleAlphaCommandArgument EOF )
            // InternalCommands.g:733:2: iv_ruleAlphaCommandArgument= ruleAlphaCommandArgument EOF
            {
             newCompositeNode(grammarAccess.getAlphaCommandArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlphaCommandArgument=ruleAlphaCommandArgument();

            state._fsp--;

             current =iv_ruleAlphaCommandArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlphaCommandArgument"


    // $ANTLR start "ruleAlphaCommandArgument"
    // InternalCommands.g:739:1: ruleAlphaCommandArgument returns [EObject current=null] : ( ( (lv_argumentType_0_0= ruleArgumentType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAlphaCommandArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_argumentType_0_0 = null;



        	enterRule();

        try {
            // InternalCommands.g:745:2: ( ( ( (lv_argumentType_0_0= ruleArgumentType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalCommands.g:746:2: ( ( (lv_argumentType_0_0= ruleArgumentType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalCommands.g:746:2: ( ( (lv_argumentType_0_0= ruleArgumentType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalCommands.g:747:3: ( (lv_argumentType_0_0= ruleArgumentType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalCommands.g:747:3: ( (lv_argumentType_0_0= ruleArgumentType ) )
            // InternalCommands.g:748:4: (lv_argumentType_0_0= ruleArgumentType )
            {
            // InternalCommands.g:748:4: (lv_argumentType_0_0= ruleArgumentType )
            // InternalCommands.g:749:5: lv_argumentType_0_0= ruleArgumentType
            {

            					newCompositeNode(grammarAccess.getAlphaCommandArgumentAccess().getArgumentTypeArgumentTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_argumentType_0_0=ruleArgumentType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlphaCommandArgumentRule());
            					}
            					set(
            						current,
            						"argumentType",
            						lv_argumentType_0_0,
            						"alpha.commands.model.Commands.ArgumentType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCommands.g:766:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCommands.g:767:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCommands.g:767:4: (lv_name_1_0= RULE_ID )
            // InternalCommands.g:768:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAlphaCommandArgumentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlphaCommandArgumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleAlphaCommandArgument"


    // $ANTLR start "entryRuleCommandArgumentSpecialization"
    // InternalCommands.g:788:1: entryRuleCommandArgumentSpecialization returns [EObject current=null] : iv_ruleCommandArgumentSpecialization= ruleCommandArgumentSpecialization EOF ;
    public final EObject entryRuleCommandArgumentSpecialization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandArgumentSpecialization = null;


        try {
            // InternalCommands.g:788:70: (iv_ruleCommandArgumentSpecialization= ruleCommandArgumentSpecialization EOF )
            // InternalCommands.g:789:2: iv_ruleCommandArgumentSpecialization= ruleCommandArgumentSpecialization EOF
            {
             newCompositeNode(grammarAccess.getCommandArgumentSpecializationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandArgumentSpecialization=ruleCommandArgumentSpecialization();

            state._fsp--;

             current =iv_ruleCommandArgumentSpecialization; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandArgumentSpecialization"


    // $ANTLR start "ruleCommandArgumentSpecialization"
    // InternalCommands.g:795:1: ruleCommandArgumentSpecialization returns [EObject current=null] : (this_OverrideArgument_0= ruleOverrideArgument | this_DefaultValueArgument_1= ruleDefaultValueArgument | this_SameAsParentArgument_2= ruleSameAsParentArgument ) ;
    public final EObject ruleCommandArgumentSpecialization() throws RecognitionException {
        EObject current = null;

        EObject this_OverrideArgument_0 = null;

        EObject this_DefaultValueArgument_1 = null;

        EObject this_SameAsParentArgument_2 = null;



        	enterRule();

        try {
            // InternalCommands.g:801:2: ( (this_OverrideArgument_0= ruleOverrideArgument | this_DefaultValueArgument_1= ruleDefaultValueArgument | this_SameAsParentArgument_2= ruleSameAsParentArgument ) )
            // InternalCommands.g:802:2: (this_OverrideArgument_0= ruleOverrideArgument | this_DefaultValueArgument_1= ruleDefaultValueArgument | this_SameAsParentArgument_2= ruleSameAsParentArgument )
            {
            // InternalCommands.g:802:2: (this_OverrideArgument_0= ruleOverrideArgument | this_DefaultValueArgument_1= ruleDefaultValueArgument | this_SameAsParentArgument_2= ruleSameAsParentArgument )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt15=1;
                }
                break;
            case RULE_STRING:
                {
                alt15=2;
                }
                break;
            case 21:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalCommands.g:803:3: this_OverrideArgument_0= ruleOverrideArgument
                    {

                    			newCompositeNode(grammarAccess.getCommandArgumentSpecializationAccess().getOverrideArgumentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OverrideArgument_0=ruleOverrideArgument();

                    state._fsp--;


                    			current = this_OverrideArgument_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCommands.g:812:3: this_DefaultValueArgument_1= ruleDefaultValueArgument
                    {

                    			newCompositeNode(grammarAccess.getCommandArgumentSpecializationAccess().getDefaultValueArgumentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefaultValueArgument_1=ruleDefaultValueArgument();

                    state._fsp--;


                    			current = this_DefaultValueArgument_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCommands.g:821:3: this_SameAsParentArgument_2= ruleSameAsParentArgument
                    {

                    			newCompositeNode(grammarAccess.getCommandArgumentSpecializationAccess().getSameAsParentArgumentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SameAsParentArgument_2=ruleSameAsParentArgument();

                    state._fsp--;


                    			current = this_SameAsParentArgument_2;
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
    // $ANTLR end "ruleCommandArgumentSpecialization"


    // $ANTLR start "entryRuleOverrideArgument"
    // InternalCommands.g:833:1: entryRuleOverrideArgument returns [EObject current=null] : iv_ruleOverrideArgument= ruleOverrideArgument EOF ;
    public final EObject entryRuleOverrideArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverrideArgument = null;


        try {
            // InternalCommands.g:833:57: (iv_ruleOverrideArgument= ruleOverrideArgument EOF )
            // InternalCommands.g:834:2: iv_ruleOverrideArgument= ruleOverrideArgument EOF
            {
             newCompositeNode(grammarAccess.getOverrideArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOverrideArgument=ruleOverrideArgument();

            state._fsp--;

             current =iv_ruleOverrideArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOverrideArgument"


    // $ANTLR start "ruleOverrideArgument"
    // InternalCommands.g:840:1: ruleOverrideArgument returns [EObject current=null] : ( ( (lv_argumentType_0_0= ruleArgumentType ) ) ( (lv_name_1_0= RULE_ID ) )? ) ;
    public final EObject ruleOverrideArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_argumentType_0_0 = null;



        	enterRule();

        try {
            // InternalCommands.g:846:2: ( ( ( (lv_argumentType_0_0= ruleArgumentType ) ) ( (lv_name_1_0= RULE_ID ) )? ) )
            // InternalCommands.g:847:2: ( ( (lv_argumentType_0_0= ruleArgumentType ) ) ( (lv_name_1_0= RULE_ID ) )? )
            {
            // InternalCommands.g:847:2: ( ( (lv_argumentType_0_0= ruleArgumentType ) ) ( (lv_name_1_0= RULE_ID ) )? )
            // InternalCommands.g:848:3: ( (lv_argumentType_0_0= ruleArgumentType ) ) ( (lv_name_1_0= RULE_ID ) )?
            {
            // InternalCommands.g:848:3: ( (lv_argumentType_0_0= ruleArgumentType ) )
            // InternalCommands.g:849:4: (lv_argumentType_0_0= ruleArgumentType )
            {
            // InternalCommands.g:849:4: (lv_argumentType_0_0= ruleArgumentType )
            // InternalCommands.g:850:5: lv_argumentType_0_0= ruleArgumentType
            {

            					newCompositeNode(grammarAccess.getOverrideArgumentAccess().getArgumentTypeArgumentTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_argumentType_0_0=ruleArgumentType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOverrideArgumentRule());
            					}
            					set(
            						current,
            						"argumentType",
            						lv_argumentType_0_0,
            						"alpha.commands.model.Commands.ArgumentType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCommands.g:867:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCommands.g:868:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalCommands.g:868:4: (lv_name_1_0= RULE_ID )
                    // InternalCommands.g:869:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getOverrideArgumentAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOverrideArgumentRule());
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


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOverrideArgument"


    // $ANTLR start "entryRuleDefaultValueArgument"
    // InternalCommands.g:889:1: entryRuleDefaultValueArgument returns [EObject current=null] : iv_ruleDefaultValueArgument= ruleDefaultValueArgument EOF ;
    public final EObject entryRuleDefaultValueArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValueArgument = null;


        try {
            // InternalCommands.g:889:61: (iv_ruleDefaultValueArgument= ruleDefaultValueArgument EOF )
            // InternalCommands.g:890:2: iv_ruleDefaultValueArgument= ruleDefaultValueArgument EOF
            {
             newCompositeNode(grammarAccess.getDefaultValueArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultValueArgument=ruleDefaultValueArgument();

            state._fsp--;

             current =iv_ruleDefaultValueArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultValueArgument"


    // $ANTLR start "ruleDefaultValueArgument"
    // InternalCommands.g:896:1: ruleDefaultValueArgument returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleDefaultValueArgument() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalCommands.g:902:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalCommands.g:903:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalCommands.g:903:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalCommands.g:904:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalCommands.g:904:3: (lv_value_0_0= RULE_STRING )
            // InternalCommands.g:905:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getDefaultValueArgumentAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDefaultValueArgumentRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleDefaultValueArgument"


    // $ANTLR start "entryRuleSameAsParentArgument"
    // InternalCommands.g:924:1: entryRuleSameAsParentArgument returns [EObject current=null] : iv_ruleSameAsParentArgument= ruleSameAsParentArgument EOF ;
    public final EObject entryRuleSameAsParentArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSameAsParentArgument = null;


        try {
            // InternalCommands.g:924:61: (iv_ruleSameAsParentArgument= ruleSameAsParentArgument EOF )
            // InternalCommands.g:925:2: iv_ruleSameAsParentArgument= ruleSameAsParentArgument EOF
            {
             newCompositeNode(grammarAccess.getSameAsParentArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSameAsParentArgument=ruleSameAsParentArgument();

            state._fsp--;

             current =iv_ruleSameAsParentArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSameAsParentArgument"


    // $ANTLR start "ruleSameAsParentArgument"
    // InternalCommands.g:931:1: ruleSameAsParentArgument returns [EObject current=null] : ( () otherlv_1= '_' ) ;
    public final EObject ruleSameAsParentArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCommands.g:937:2: ( ( () otherlv_1= '_' ) )
            // InternalCommands.g:938:2: ( () otherlv_1= '_' )
            {
            // InternalCommands.g:938:2: ( () otherlv_1= '_' )
            // InternalCommands.g:939:3: () otherlv_1= '_'
            {
            // InternalCommands.g:939:3: ()
            // InternalCommands.g:940:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSameAsParentArgumentAccess().getSameAsParentArgumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSameAsParentArgumentAccess().get_Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSameAsParentArgument"


    // $ANTLR start "entryRuleArgumentType"
    // InternalCommands.g:954:1: entryRuleArgumentType returns [String current=null] : iv_ruleArgumentType= ruleArgumentType EOF ;
    public final String entryRuleArgumentType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArgumentType = null;


        try {
            // InternalCommands.g:954:52: (iv_ruleArgumentType= ruleArgumentType EOF )
            // InternalCommands.g:955:2: iv_ruleArgumentType= ruleArgumentType EOF
            {
             newCompositeNode(grammarAccess.getArgumentTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgumentType=ruleArgumentType();

            state._fsp--;

             current =iv_ruleArgumentType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgumentType"


    // $ANTLR start "ruleArgumentType"
    // InternalCommands.g:961:1: ruleArgumentType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Void' | kw= 'AlphaNode' | kw= 'AlphaCompleteVisitable' | kw= 'AlphaVisitable' | kw= 'AlphaExpressionVisitable' | kw= 'AlphaRoot' | kw= 'AlphaSystem' | kw= 'SystemBody' | kw= 'Variable' | kw= 'Equation' | kw= 'StandardEquation' | kw= 'UseEquation' | kw= 'AlphaExpression' | kw= 'AbstractReduceExpression' | kw= 'BinaryExpression' | kw= 'DependenceExpression' | kw= 'ReduceExpression' | kw= 'AffineFunction' | kw= 'Domain' | kw= 'ParameterDomain' | kw= 'List<AlphaRoot>' | kw= 'String' | kw= 'List<String>' | kw= 'String[]' | kw= 'int' | kw= 'List<Integer>' | kw= 'int[]' ) ;
    public final AntlrDatatypeRuleToken ruleArgumentType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCommands.g:967:2: ( (kw= 'Void' | kw= 'AlphaNode' | kw= 'AlphaCompleteVisitable' | kw= 'AlphaVisitable' | kw= 'AlphaExpressionVisitable' | kw= 'AlphaRoot' | kw= 'AlphaSystem' | kw= 'SystemBody' | kw= 'Variable' | kw= 'Equation' | kw= 'StandardEquation' | kw= 'UseEquation' | kw= 'AlphaExpression' | kw= 'AbstractReduceExpression' | kw= 'BinaryExpression' | kw= 'DependenceExpression' | kw= 'ReduceExpression' | kw= 'AffineFunction' | kw= 'Domain' | kw= 'ParameterDomain' | kw= 'List<AlphaRoot>' | kw= 'String' | kw= 'List<String>' | kw= 'String[]' | kw= 'int' | kw= 'List<Integer>' | kw= 'int[]' ) )
            // InternalCommands.g:968:2: (kw= 'Void' | kw= 'AlphaNode' | kw= 'AlphaCompleteVisitable' | kw= 'AlphaVisitable' | kw= 'AlphaExpressionVisitable' | kw= 'AlphaRoot' | kw= 'AlphaSystem' | kw= 'SystemBody' | kw= 'Variable' | kw= 'Equation' | kw= 'StandardEquation' | kw= 'UseEquation' | kw= 'AlphaExpression' | kw= 'AbstractReduceExpression' | kw= 'BinaryExpression' | kw= 'DependenceExpression' | kw= 'ReduceExpression' | kw= 'AffineFunction' | kw= 'Domain' | kw= 'ParameterDomain' | kw= 'List<AlphaRoot>' | kw= 'String' | kw= 'List<String>' | kw= 'String[]' | kw= 'int' | kw= 'List<Integer>' | kw= 'int[]' )
            {
            // InternalCommands.g:968:2: (kw= 'Void' | kw= 'AlphaNode' | kw= 'AlphaCompleteVisitable' | kw= 'AlphaVisitable' | kw= 'AlphaExpressionVisitable' | kw= 'AlphaRoot' | kw= 'AlphaSystem' | kw= 'SystemBody' | kw= 'Variable' | kw= 'Equation' | kw= 'StandardEquation' | kw= 'UseEquation' | kw= 'AlphaExpression' | kw= 'AbstractReduceExpression' | kw= 'BinaryExpression' | kw= 'DependenceExpression' | kw= 'ReduceExpression' | kw= 'AffineFunction' | kw= 'Domain' | kw= 'ParameterDomain' | kw= 'List<AlphaRoot>' | kw= 'String' | kw= 'List<String>' | kw= 'String[]' | kw= 'int' | kw= 'List<Integer>' | kw= 'int[]' )
            int alt17=27;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt17=1;
                }
                break;
            case 23:
                {
                alt17=2;
                }
                break;
            case 24:
                {
                alt17=3;
                }
                break;
            case 25:
                {
                alt17=4;
                }
                break;
            case 26:
                {
                alt17=5;
                }
                break;
            case 27:
                {
                alt17=6;
                }
                break;
            case 28:
                {
                alt17=7;
                }
                break;
            case 29:
                {
                alt17=8;
                }
                break;
            case 30:
                {
                alt17=9;
                }
                break;
            case 31:
                {
                alt17=10;
                }
                break;
            case 32:
                {
                alt17=11;
                }
                break;
            case 33:
                {
                alt17=12;
                }
                break;
            case 34:
                {
                alt17=13;
                }
                break;
            case 35:
                {
                alt17=14;
                }
                break;
            case 36:
                {
                alt17=15;
                }
                break;
            case 37:
                {
                alt17=16;
                }
                break;
            case 38:
                {
                alt17=17;
                }
                break;
            case 39:
                {
                alt17=18;
                }
                break;
            case 40:
                {
                alt17=19;
                }
                break;
            case 41:
                {
                alt17=20;
                }
                break;
            case 42:
                {
                alt17=21;
                }
                break;
            case 43:
                {
                alt17=22;
                }
                break;
            case 44:
                {
                alt17=23;
                }
                break;
            case 45:
                {
                alt17=24;
                }
                break;
            case 46:
                {
                alt17=25;
                }
                break;
            case 47:
                {
                alt17=26;
                }
                break;
            case 48:
                {
                alt17=27;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalCommands.g:969:3: kw= 'Void'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getVoidKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCommands.g:975:3: kw= 'AlphaNode'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getAlphaNodeKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCommands.g:981:3: kw= 'AlphaCompleteVisitable'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getAlphaCompleteVisitableKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalCommands.g:987:3: kw= 'AlphaVisitable'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getAlphaVisitableKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalCommands.g:993:3: kw= 'AlphaExpressionVisitable'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getAlphaExpressionVisitableKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalCommands.g:999:3: kw= 'AlphaRoot'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getAlphaRootKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalCommands.g:1005:3: kw= 'AlphaSystem'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getAlphaSystemKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalCommands.g:1011:3: kw= 'SystemBody'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getSystemBodyKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalCommands.g:1017:3: kw= 'Variable'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getVariableKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalCommands.g:1023:3: kw= 'Equation'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getEquationKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalCommands.g:1029:3: kw= 'StandardEquation'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getStandardEquationKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalCommands.g:1035:3: kw= 'UseEquation'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getUseEquationKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalCommands.g:1041:3: kw= 'AlphaExpression'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getAlphaExpressionKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalCommands.g:1047:3: kw= 'AbstractReduceExpression'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getAbstractReduceExpressionKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalCommands.g:1053:3: kw= 'BinaryExpression'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getBinaryExpressionKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalCommands.g:1059:3: kw= 'DependenceExpression'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getDependenceExpressionKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalCommands.g:1065:3: kw= 'ReduceExpression'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getReduceExpressionKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalCommands.g:1071:3: kw= 'AffineFunction'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getAffineFunctionKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalCommands.g:1077:3: kw= 'Domain'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getDomainKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalCommands.g:1083:3: kw= 'ParameterDomain'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getParameterDomainKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalCommands.g:1089:3: kw= 'List<AlphaRoot>'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getListAlphaRootKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalCommands.g:1095:3: kw= 'String'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getStringKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalCommands.g:1101:3: kw= 'List<String>'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getListStringKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalCommands.g:1107:3: kw= 'String[]'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getStringKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalCommands.g:1113:3: kw= 'int'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getIntKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalCommands.g:1119:3: kw= 'List<Integer>'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getListIntegerKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalCommands.g:1125:3: kw= 'int[]'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArgumentTypeAccess().getIntKeyword_26());
                    		

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
    // $ANTLR end "ruleArgumentType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0001FFFFFFC40000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001FFFFFFC00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001FFFFFFE40020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001FFFFFFE00020L});

}