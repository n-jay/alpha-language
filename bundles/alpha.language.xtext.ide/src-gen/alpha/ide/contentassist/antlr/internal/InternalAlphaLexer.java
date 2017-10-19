package alpha.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlphaLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_OP_AND=11;
    public static final int RULE_OP_EQ=20;
    public static final int RULE_BOOLEAN=26;
    public static final int RULE_OP_MIN=17;
    public static final int RULE_OP_NAND=5;
    public static final int RULE_OP_MUL=9;
    public static final int RULE_OP_NE=25;
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
    public static final int RULE_REAL=27;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_OP_GE=21;
    public static final int RULE_ML_COMMENT=29;
    public static final int RULE_UNION=14;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_OP_OR=12;
    public static final int RULE_OP_GT=22;
    public static final int RULE_STRING=28;
    public static final int RULE_OP_DIV=10;
    public static final int RULE_SL_COMMENT=30;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_OP_LE=23;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__32=32;
    public static final int RULE_OP_MOD=19;
    public static final int RULE_OP_PLUS=7;
    public static final int RULE_OP_LT=24;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=31;
    public static final int RULE_OP_MAX=18;
    public static final int RULE_INTERSECTION=13;
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

    public InternalAlphaLexer() {;} 
    public InternalAlphaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAlphaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAlpha.g"; }

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11:7: ( '[' )
            // InternalAlpha.g:11:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:12:7: ( ']' )
            // InternalAlpha.g:12:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:13:7: ( '(' )
            // InternalAlpha.g:13:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:14:7: ( ')' )
            // InternalAlpha.g:14:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:15:7: ( ',' )
            // InternalAlpha.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:16:7: ( ':' )
            // InternalAlpha.g:16:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:17:7: ( 'package' )
            // InternalAlpha.g:17:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:18:7: ( '{' )
            // InternalAlpha.g:18:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:19:7: ( '}' )
            // InternalAlpha.g:19:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:20:7: ( 'import' )
            // InternalAlpha.g:20:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:21:7: ( 'external' )
            // InternalAlpha.g:21:9: 'external'
            {
            match("external"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:22:7: ( ';' )
            // InternalAlpha.g:22:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:23:7: ( 'affine' )
            // InternalAlpha.g:23:9: 'affine'
            {
            match("affine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:24:7: ( '.' )
            // InternalAlpha.g:24:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:25:7: ( 'inputs' )
            // InternalAlpha.g:25:9: 'inputs'
            {
            match("inputs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:26:7: ( 'outputs' )
            // InternalAlpha.g:26:9: 'outputs'
            {
            match("outputs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:27:7: ( 'locals' )
            // InternalAlpha.g:27:9: 'locals'
            {
            match("locals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:28:7: ( 'fuzzy' )
            // InternalAlpha.g:28:9: 'fuzzy'
            {
            match("fuzzy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:29:7: ( 'let' )
            // InternalAlpha.g:29:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:30:7: ( '.*' )
            // InternalAlpha.g:30:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:31:7: ( '\\'' )
            // InternalAlpha.g:31:9: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:32:7: ( 'D' )
            // InternalAlpha.g:32:9: 'D'
            {
            match('D'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:33:7: ( 'times' )
            // InternalAlpha.g:33:9: 'times'
            {
            match("times"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:34:7: ( '->' )
            // InternalAlpha.g:34:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:35:7: ( 'over' )
            // InternalAlpha.g:35:9: 'over'
            {
            match("over"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:36:7: ( 'with' )
            // InternalAlpha.g:36:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:37:7: ( 'case' )
            // InternalAlpha.g:37:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:38:7: ( '@' )
            // InternalAlpha.g:38:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:39:7: ( 'if' )
            // InternalAlpha.g:39:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:40:7: ( 'then' )
            // InternalAlpha.g:40:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:41:7: ( 'else' )
            // InternalAlpha.g:41:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:42:7: ( 'val(' )
            // InternalAlpha.g:42:9: 'val('
            {
            match("val("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:43:7: ( 'reduce' )
            // InternalAlpha.g:43:9: 'reduce'
            {
            match("reduce"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:44:7: ( 'argreduce' )
            // InternalAlpha.g:44:9: 'argreduce'
            {
            match("argreduce"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:45:7: ( 'not' )
            // InternalAlpha.g:45:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "RULE_OP_AND"
    public final void mRULE_OP_AND() throws RecognitionException {
        try {
            int _type = RULE_OP_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11269:13: ( 'and' )
            // InternalAlpha.g:11269:15: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP_AND"

    // $ANTLR start "RULE_OP_MAX"
    public final void mRULE_OP_MAX() throws RecognitionException {
        try {
            int _type = RULE_OP_MAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11271:13: ( 'max' )
            // InternalAlpha.g:11271:15: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP_MAX"

    // $ANTLR start "RULE_OP_MIN"
    public final void mRULE_OP_MIN() throws RecognitionException {
        try {
            int _type = RULE_OP_MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11273:13: ( 'min' )
            // InternalAlpha.g:11273:15: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP_MIN"

    // $ANTLR start "RULE_OP_MUL"
    public final void mRULE_OP_MUL() throws RecognitionException {
        try {
            int _type = RULE_OP_MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11275:13: ( '*' )
            // InternalAlpha.g:11275:15: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP_MUL"

    // $ANTLR start "RULE_OP_OR"
    public final void mRULE_OP_OR() throws RecognitionException {
        try {
            int _type = RULE_OP_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11277:12: ( 'or' )
            // InternalAlpha.g:11277:14: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP_OR"

    // $ANTLR start "RULE_OP_XOR"
    public final void mRULE_OP_XOR() throws RecognitionException {
        try {
            int _type = RULE_OP_XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11279:13: ( 'xor' )
            // InternalAlpha.g:11279:15: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP_XOR"

    // $ANTLR start "RULE_OP_PLUS"
    public final void mRULE_OP_PLUS() throws RecognitionException {
        try {
            int _type = RULE_OP_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11281:14: ( '+' )
            // InternalAlpha.g:11281:16: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP_PLUS"

    // $ANTLR start "RULE_OP_MINUS"
    public final void mRULE_OP_MINUS() throws RecognitionException {
        try {
            int _type = RULE_OP_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11283:15: ( '-' )
            // InternalAlpha.g:11283:17: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP_MINUS"

    // $ANTLR start "RULE_OP_DIV"
    public final void mRULE_OP_DIV() throws RecognitionException {
        try {
            int _type = RULE_OP_DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11285:13: ( '/' )
            // InternalAlpha.g:11285:15: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP_DIV"

    // $ANTLR start "RULE_OP_MOD"
    public final void mRULE_OP_MOD() throws RecognitionException {
        try {
            int _type = RULE_OP_MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11287:13: ( '%' )
            // InternalAlpha.g:11287:15: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP_MOD"

    // $ANTLR start "RULE_OP_NAND"
    public final void mRULE_OP_NAND() throws RecognitionException {
        try {
            int _type = RULE_OP_NAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11289:14: ( 'nand' )
            // InternalAlpha.g:11289:16: 'nand'
            {
            match("nand"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP_NAND"

    // $ANTLR start "RULE_OP_EQ"
    public final void mRULE_OP_EQ() throws RecognitionException {
        try {
            int _type = RULE_OP_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11291:12: ( '=' )
            // InternalAlpha.g:11291:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP_EQ"

    // $ANTLR start "RULE_OP_GE"
    public final void mRULE_OP_GE() throws RecognitionException {
        try {
            int _type = RULE_OP_GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11293:12: ( '>=' )
            // InternalAlpha.g:11293:14: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP_GE"

    // $ANTLR start "RULE_OP_GT"
    public final void mRULE_OP_GT() throws RecognitionException {
        try {
            int _type = RULE_OP_GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11295:12: ( '>' )
            // InternalAlpha.g:11295:14: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP_GT"

    // $ANTLR start "RULE_OP_LE"
    public final void mRULE_OP_LE() throws RecognitionException {
        try {
            int _type = RULE_OP_LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11297:12: ( '<=' )
            // InternalAlpha.g:11297:14: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP_LE"

    // $ANTLR start "RULE_OP_LT"
    public final void mRULE_OP_LT() throws RecognitionException {
        try {
            int _type = RULE_OP_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11299:12: ( '<' )
            // InternalAlpha.g:11299:14: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP_LT"

    // $ANTLR start "RULE_OP_NE"
    public final void mRULE_OP_NE() throws RecognitionException {
        try {
            int _type = RULE_OP_NE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11301:12: ( '!=' )
            // InternalAlpha.g:11301:14: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP_NE"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11303:14: ( ( 'true' | 'false' ) )
            // InternalAlpha.g:11303:16: ( 'true' | 'false' )
            {
            // InternalAlpha.g:11303:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAlpha.g:11303:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalAlpha.g:11303:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_REAL"
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11305:11: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // InternalAlpha.g:11305:13: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // InternalAlpha.g:11305:13: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAlpha.g:11305:14: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('.'); 
            // InternalAlpha.g:11305:29: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAlpha.g:11305:30: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL"

    // $ANTLR start "RULE_INTERSECTION"
    public final void mRULE_INTERSECTION() throws RecognitionException {
        try {
            int _type = RULE_INTERSECTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11307:19: ( '&&' )
            // InternalAlpha.g:11307:21: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTERSECTION"

    // $ANTLR start "RULE_UNION"
    public final void mRULE_UNION() throws RecognitionException {
        try {
            int _type = RULE_UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11309:12: ( '||' )
            // InternalAlpha.g:11309:14: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNION"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11311:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalAlpha.g:11311:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalAlpha.g:11311:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    alt4=1;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAlpha.g:11311:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalAlpha.g:11311:27: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11313:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAlpha.g:11313:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAlpha.g:11313:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAlpha.g:11313:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAlpha.g:11313:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAlpha.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11315:10: ( ( '0' .. '9' )+ )
            // InternalAlpha.g:11315:12: ( '0' .. '9' )+
            {
            // InternalAlpha.g:11315:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAlpha.g:11315:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11317:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAlpha.g:11317:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAlpha.g:11317:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAlpha.g:11317:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11319:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAlpha.g:11319:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAlpha.g:11319:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAlpha.g:11319:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalAlpha.g:11319:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAlpha.g:11319:41: ( '\\r' )? '\\n'
                    {
                    // InternalAlpha.g:11319:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalAlpha.g:11319:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11321:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAlpha.g:11321:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAlpha.g:11321:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAlpha.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlpha.g:11323:16: ( . )
            // InternalAlpha.g:11323:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalAlpha.g:1:8: ( T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | RULE_OP_AND | RULE_OP_MAX | RULE_OP_MIN | RULE_OP_MUL | RULE_OP_OR | RULE_OP_XOR | RULE_OP_PLUS | RULE_OP_MINUS | RULE_OP_DIV | RULE_OP_MOD | RULE_OP_NAND | RULE_OP_EQ | RULE_OP_GE | RULE_OP_GT | RULE_OP_LE | RULE_OP_LT | RULE_OP_NE | RULE_BOOLEAN | RULE_REAL | RULE_INTERSECTION | RULE_UNION | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=63;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalAlpha.g:1:10: T__32
                {
                mT__32(); 

                }
                break;
            case 2 :
                // InternalAlpha.g:1:16: T__33
                {
                mT__33(); 

                }
                break;
            case 3 :
                // InternalAlpha.g:1:22: T__34
                {
                mT__34(); 

                }
                break;
            case 4 :
                // InternalAlpha.g:1:28: T__35
                {
                mT__35(); 

                }
                break;
            case 5 :
                // InternalAlpha.g:1:34: T__36
                {
                mT__36(); 

                }
                break;
            case 6 :
                // InternalAlpha.g:1:40: T__37
                {
                mT__37(); 

                }
                break;
            case 7 :
                // InternalAlpha.g:1:46: T__38
                {
                mT__38(); 

                }
                break;
            case 8 :
                // InternalAlpha.g:1:52: T__39
                {
                mT__39(); 

                }
                break;
            case 9 :
                // InternalAlpha.g:1:58: T__40
                {
                mT__40(); 

                }
                break;
            case 10 :
                // InternalAlpha.g:1:64: T__41
                {
                mT__41(); 

                }
                break;
            case 11 :
                // InternalAlpha.g:1:70: T__42
                {
                mT__42(); 

                }
                break;
            case 12 :
                // InternalAlpha.g:1:76: T__43
                {
                mT__43(); 

                }
                break;
            case 13 :
                // InternalAlpha.g:1:82: T__44
                {
                mT__44(); 

                }
                break;
            case 14 :
                // InternalAlpha.g:1:88: T__45
                {
                mT__45(); 

                }
                break;
            case 15 :
                // InternalAlpha.g:1:94: T__46
                {
                mT__46(); 

                }
                break;
            case 16 :
                // InternalAlpha.g:1:100: T__47
                {
                mT__47(); 

                }
                break;
            case 17 :
                // InternalAlpha.g:1:106: T__48
                {
                mT__48(); 

                }
                break;
            case 18 :
                // InternalAlpha.g:1:112: T__49
                {
                mT__49(); 

                }
                break;
            case 19 :
                // InternalAlpha.g:1:118: T__50
                {
                mT__50(); 

                }
                break;
            case 20 :
                // InternalAlpha.g:1:124: T__51
                {
                mT__51(); 

                }
                break;
            case 21 :
                // InternalAlpha.g:1:130: T__52
                {
                mT__52(); 

                }
                break;
            case 22 :
                // InternalAlpha.g:1:136: T__53
                {
                mT__53(); 

                }
                break;
            case 23 :
                // InternalAlpha.g:1:142: T__54
                {
                mT__54(); 

                }
                break;
            case 24 :
                // InternalAlpha.g:1:148: T__55
                {
                mT__55(); 

                }
                break;
            case 25 :
                // InternalAlpha.g:1:154: T__56
                {
                mT__56(); 

                }
                break;
            case 26 :
                // InternalAlpha.g:1:160: T__57
                {
                mT__57(); 

                }
                break;
            case 27 :
                // InternalAlpha.g:1:166: T__58
                {
                mT__58(); 

                }
                break;
            case 28 :
                // InternalAlpha.g:1:172: T__59
                {
                mT__59(); 

                }
                break;
            case 29 :
                // InternalAlpha.g:1:178: T__60
                {
                mT__60(); 

                }
                break;
            case 30 :
                // InternalAlpha.g:1:184: T__61
                {
                mT__61(); 

                }
                break;
            case 31 :
                // InternalAlpha.g:1:190: T__62
                {
                mT__62(); 

                }
                break;
            case 32 :
                // InternalAlpha.g:1:196: T__63
                {
                mT__63(); 

                }
                break;
            case 33 :
                // InternalAlpha.g:1:202: T__64
                {
                mT__64(); 

                }
                break;
            case 34 :
                // InternalAlpha.g:1:208: T__65
                {
                mT__65(); 

                }
                break;
            case 35 :
                // InternalAlpha.g:1:214: T__66
                {
                mT__66(); 

                }
                break;
            case 36 :
                // InternalAlpha.g:1:220: RULE_OP_AND
                {
                mRULE_OP_AND(); 

                }
                break;
            case 37 :
                // InternalAlpha.g:1:232: RULE_OP_MAX
                {
                mRULE_OP_MAX(); 

                }
                break;
            case 38 :
                // InternalAlpha.g:1:244: RULE_OP_MIN
                {
                mRULE_OP_MIN(); 

                }
                break;
            case 39 :
                // InternalAlpha.g:1:256: RULE_OP_MUL
                {
                mRULE_OP_MUL(); 

                }
                break;
            case 40 :
                // InternalAlpha.g:1:268: RULE_OP_OR
                {
                mRULE_OP_OR(); 

                }
                break;
            case 41 :
                // InternalAlpha.g:1:279: RULE_OP_XOR
                {
                mRULE_OP_XOR(); 

                }
                break;
            case 42 :
                // InternalAlpha.g:1:291: RULE_OP_PLUS
                {
                mRULE_OP_PLUS(); 

                }
                break;
            case 43 :
                // InternalAlpha.g:1:304: RULE_OP_MINUS
                {
                mRULE_OP_MINUS(); 

                }
                break;
            case 44 :
                // InternalAlpha.g:1:318: RULE_OP_DIV
                {
                mRULE_OP_DIV(); 

                }
                break;
            case 45 :
                // InternalAlpha.g:1:330: RULE_OP_MOD
                {
                mRULE_OP_MOD(); 

                }
                break;
            case 46 :
                // InternalAlpha.g:1:342: RULE_OP_NAND
                {
                mRULE_OP_NAND(); 

                }
                break;
            case 47 :
                // InternalAlpha.g:1:355: RULE_OP_EQ
                {
                mRULE_OP_EQ(); 

                }
                break;
            case 48 :
                // InternalAlpha.g:1:366: RULE_OP_GE
                {
                mRULE_OP_GE(); 

                }
                break;
            case 49 :
                // InternalAlpha.g:1:377: RULE_OP_GT
                {
                mRULE_OP_GT(); 

                }
                break;
            case 50 :
                // InternalAlpha.g:1:388: RULE_OP_LE
                {
                mRULE_OP_LE(); 

                }
                break;
            case 51 :
                // InternalAlpha.g:1:399: RULE_OP_LT
                {
                mRULE_OP_LT(); 

                }
                break;
            case 52 :
                // InternalAlpha.g:1:410: RULE_OP_NE
                {
                mRULE_OP_NE(); 

                }
                break;
            case 53 :
                // InternalAlpha.g:1:421: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 54 :
                // InternalAlpha.g:1:434: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 55 :
                // InternalAlpha.g:1:444: RULE_INTERSECTION
                {
                mRULE_INTERSECTION(); 

                }
                break;
            case 56 :
                // InternalAlpha.g:1:462: RULE_UNION
                {
                mRULE_UNION(); 

                }
                break;
            case 57 :
                // InternalAlpha.g:1:473: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 58 :
                // InternalAlpha.g:1:485: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 59 :
                // InternalAlpha.g:1:493: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 60 :
                // InternalAlpha.g:1:502: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 61 :
                // InternalAlpha.g:1:518: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 62 :
                // InternalAlpha.g:1:534: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 63 :
                // InternalAlpha.g:1:542: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\7\uffff\1\65\2\uffff\2\65\1\uffff\1\65\1\102\3\65\1\uffff\1\113\1\65\1\120\2\65\1\uffff\4\65\1\uffff\1\65\1\uffff\1\137\2\uffff\1\143\1\145\1\55\1\147\4\55\11\uffff\1\65\3\uffff\2\65\1\161\2\65\1\uffff\3\65\2\uffff\2\65\1\171\4\65\2\uffff\3\65\2\uffff\2\65\1\uffff\6\65\1\uffff\1\65\14\uffff\1\147\5\uffff\3\65\1\uffff\4\65\1\u0091\2\65\1\uffff\1\65\1\u0095\11\65\1\u009f\1\65\1\u00a1\1\u00a2\1\u00a3\4\65\1\u00a8\2\65\1\uffff\1\65\1\u00ac\1\65\1\uffff\3\65\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\uffff\1\65\1\uffff\1\u00b6\3\uffff\4\65\1\uffff\3\65\1\uffff\1\65\1\u00bf\1\u00b2\1\u00c0\4\uffff\1\65\1\uffff\1\65\1\u00c3\1\u00c4\1\65\1\u00c6\2\65\1\u00c9\2\uffff\1\u00ca\1\u00cb\2\uffff\1\65\1\uffff\1\65\1\u00ce\3\uffff\1\u00cf\1\65\2\uffff\1\u00d1\1\uffff";
    static final String DFA13_eofS =
        "\u00d2\uffff";
    static final String DFA13_minS =
        "\1\0\6\uffff\1\141\2\uffff\1\146\1\154\1\uffff\1\146\1\52\1\162\1\145\1\141\1\uffff\1\60\1\150\1\76\1\151\1\141\1\uffff\1\141\1\145\2\141\1\uffff\1\157\1\uffff\1\52\2\uffff\3\75\1\56\1\46\1\174\1\0\1\101\11\uffff\1\143\3\uffff\2\160\1\60\1\164\1\163\1\uffff\1\146\1\147\1\144\2\uffff\1\164\1\145\1\60\1\143\1\164\1\172\1\154\2\uffff\1\155\1\145\1\165\2\uffff\1\164\1\163\1\uffff\1\154\1\144\1\164\1\156\1\170\1\156\1\uffff\1\162\14\uffff\1\56\5\uffff\1\153\1\157\1\165\1\uffff\2\145\1\151\1\162\1\60\1\160\1\162\1\uffff\1\141\1\60\1\172\1\163\1\145\1\156\1\145\1\150\1\145\1\50\1\165\1\60\1\144\3\60\1\141\1\162\1\164\1\162\1\60\1\156\1\145\1\uffff\1\165\1\60\1\154\1\uffff\1\171\1\145\1\163\4\60\1\uffff\1\143\1\uffff\1\60\3\uffff\1\147\1\164\1\163\1\156\1\uffff\1\145\1\144\1\164\1\uffff\1\163\3\60\4\uffff\1\145\1\uffff\1\145\2\60\1\141\1\60\1\165\1\163\1\60\2\uffff\2\60\2\uffff\1\154\1\uffff\1\143\1\60\3\uffff\1\60\1\145\2\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\6\uffff\1\141\2\uffff\1\156\1\170\1\uffff\1\162\1\52\1\166\1\157\1\165\1\uffff\1\172\1\162\1\76\1\151\1\141\1\uffff\1\141\1\145\1\157\1\151\1\uffff\1\157\1\uffff\1\57\2\uffff\3\75\1\71\1\46\1\174\1\uffff\1\172\11\uffff\1\143\3\uffff\2\160\1\172\1\164\1\163\1\uffff\1\146\1\147\1\144\2\uffff\1\164\1\145\1\172\1\143\1\164\1\172\1\154\2\uffff\1\155\1\145\1\165\2\uffff\1\164\1\163\1\uffff\1\154\1\144\1\164\1\156\1\170\1\156\1\uffff\1\162\14\uffff\1\71\5\uffff\1\153\1\157\1\165\1\uffff\2\145\1\151\1\162\1\172\1\160\1\162\1\uffff\1\141\2\172\1\163\1\145\1\156\1\145\1\150\1\145\1\50\1\165\1\172\1\144\3\172\1\141\1\162\1\164\1\162\1\172\1\156\1\145\1\uffff\1\165\1\172\1\154\1\uffff\1\171\1\145\1\163\4\172\1\uffff\1\143\1\uffff\1\172\3\uffff\1\147\1\164\1\163\1\156\1\uffff\1\145\1\144\1\164\1\uffff\1\163\3\172\4\uffff\1\145\1\uffff\1\145\2\172\1\141\1\172\1\165\1\163\1\172\2\uffff\2\172\2\uffff\1\154\1\uffff\1\143\1\172\3\uffff\1\172\1\145\2\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\2\uffff\1\14\5\uffff\1\25\5\uffff\1\34\4\uffff\1\47\1\uffff\1\52\1\uffff\1\55\1\57\10\uffff\1\72\1\76\1\77\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\72\1\10\1\11\5\uffff\1\14\3\uffff\1\24\1\16\7\uffff\1\25\1\26\3\uffff\1\30\1\53\2\uffff\1\34\6\uffff\1\47\1\uffff\1\52\1\74\1\75\1\54\1\55\1\57\1\60\1\61\1\62\1\63\1\64\1\73\1\uffff\1\66\1\67\1\70\1\71\1\76\3\uffff\1\35\7\uffff\1\50\27\uffff\1\44\3\uffff\1\23\7\uffff\1\40\1\uffff\1\43\1\uffff\1\45\1\46\1\51\4\uffff\1\37\3\uffff\1\31\4\uffff\1\36\1\65\1\32\1\33\1\uffff\1\56\10\uffff\1\22\1\27\2\uffff\1\12\1\17\1\uffff\1\15\2\uffff\1\21\1\41\1\7\2\uffff\1\20\1\13\1\uffff\1\42";
    static final String DFA13_specialS =
        "\1\1\50\uffff\1\0\u00a8\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\55\2\54\2\55\1\54\22\55\1\54\1\45\1\51\2\55\1\41\1\47\1\22\1\3\1\4\1\35\1\37\1\5\1\25\1\16\1\40\12\46\1\6\1\14\1\44\1\42\1\43\1\55\1\30\3\53\1\23\26\53\1\1\1\55\1\2\1\52\1\53\1\55\1\15\1\53\1\27\1\53\1\13\1\21\2\53\1\12\2\53\1\20\1\34\1\33\1\17\1\7\1\53\1\32\1\53\1\24\1\53\1\31\1\26\1\36\2\53\1\10\1\50\1\11\uff82\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64",
            "",
            "",
            "\1\72\6\uffff\1\70\1\71",
            "\1\74\13\uffff\1\73",
            "",
            "\1\76\7\uffff\1\100\3\uffff\1\77",
            "\1\101",
            "\1\105\2\uffff\1\103\1\104",
            "\1\107\11\uffff\1\106",
            "\1\111\23\uffff\1\110",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\115\1\114\10\uffff\1\116",
            "\1\117",
            "\1\121",
            "\1\122",
            "",
            "\1\124",
            "\1\125",
            "\1\127\15\uffff\1\126",
            "\1\130\7\uffff\1\131",
            "",
            "\1\133",
            "",
            "\1\135\4\uffff\1\136",
            "",
            "",
            "\1\142",
            "\1\144",
            "\1\146",
            "\1\151\1\uffff\12\150",
            "\1\152",
            "\1\153",
            "\0\154",
            "\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\156",
            "",
            "",
            "",
            "\1\157",
            "\1\160",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\162",
            "\1\163",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "",
            "\1\167",
            "\1\170",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "",
            "\1\u0081",
            "\1\u0082",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "\1\u0089",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\151\1\uffff\12\150",
            "",
            "",
            "",
            "",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00a0",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u00b5",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00c5",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00c7",
            "\1\u00c8",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00d0",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | RULE_OP_AND | RULE_OP_MAX | RULE_OP_MIN | RULE_OP_MUL | RULE_OP_OR | RULE_OP_XOR | RULE_OP_PLUS | RULE_OP_MINUS | RULE_OP_DIV | RULE_OP_MOD | RULE_OP_NAND | RULE_OP_EQ | RULE_OP_GE | RULE_OP_GT | RULE_OP_LE | RULE_OP_LT | RULE_OP_NE | RULE_BOOLEAN | RULE_REAL | RULE_INTERSECTION | RULE_UNION | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_41 = input.LA(1);

                        s = -1;
                        if ( ((LA13_41>='\u0000' && LA13_41<='\uFFFF')) ) {s = 108;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='[') ) {s = 1;}

                        else if ( (LA13_0==']') ) {s = 2;}

                        else if ( (LA13_0=='(') ) {s = 3;}

                        else if ( (LA13_0==')') ) {s = 4;}

                        else if ( (LA13_0==',') ) {s = 5;}

                        else if ( (LA13_0==':') ) {s = 6;}

                        else if ( (LA13_0=='p') ) {s = 7;}

                        else if ( (LA13_0=='{') ) {s = 8;}

                        else if ( (LA13_0=='}') ) {s = 9;}

                        else if ( (LA13_0=='i') ) {s = 10;}

                        else if ( (LA13_0=='e') ) {s = 11;}

                        else if ( (LA13_0==';') ) {s = 12;}

                        else if ( (LA13_0=='a') ) {s = 13;}

                        else if ( (LA13_0=='.') ) {s = 14;}

                        else if ( (LA13_0=='o') ) {s = 15;}

                        else if ( (LA13_0=='l') ) {s = 16;}

                        else if ( (LA13_0=='f') ) {s = 17;}

                        else if ( (LA13_0=='\'') ) {s = 18;}

                        else if ( (LA13_0=='D') ) {s = 19;}

                        else if ( (LA13_0=='t') ) {s = 20;}

                        else if ( (LA13_0=='-') ) {s = 21;}

                        else if ( (LA13_0=='w') ) {s = 22;}

                        else if ( (LA13_0=='c') ) {s = 23;}

                        else if ( (LA13_0=='@') ) {s = 24;}

                        else if ( (LA13_0=='v') ) {s = 25;}

                        else if ( (LA13_0=='r') ) {s = 26;}

                        else if ( (LA13_0=='n') ) {s = 27;}

                        else if ( (LA13_0=='m') ) {s = 28;}

                        else if ( (LA13_0=='*') ) {s = 29;}

                        else if ( (LA13_0=='x') ) {s = 30;}

                        else if ( (LA13_0=='+') ) {s = 31;}

                        else if ( (LA13_0=='/') ) {s = 32;}

                        else if ( (LA13_0=='%') ) {s = 33;}

                        else if ( (LA13_0=='=') ) {s = 34;}

                        else if ( (LA13_0=='>') ) {s = 35;}

                        else if ( (LA13_0=='<') ) {s = 36;}

                        else if ( (LA13_0=='!') ) {s = 37;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 38;}

                        else if ( (LA13_0=='&') ) {s = 39;}

                        else if ( (LA13_0=='|') ) {s = 40;}

                        else if ( (LA13_0=='\"') ) {s = 41;}

                        else if ( (LA13_0=='^') ) {s = 42;}

                        else if ( ((LA13_0>='A' && LA13_0<='C')||(LA13_0>='E' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='b'||LA13_0=='d'||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='k')||LA13_0=='q'||LA13_0=='s'||LA13_0=='u'||(LA13_0>='y' && LA13_0<='z')) ) {s = 43;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 44;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='$')||LA13_0=='?'||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}