package ru.levkopo.vlangPlugin.parser;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import ru.levkopo.vlangPlugin.parser.psi.VLangTypes;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class VLangSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey ASSIGN =
            createTextAttributesKey("VLANG_ASSIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey PARENTHESES =
                createTextAttributesKey("VLANG_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey BRACES =
                createTextAttributesKey("VLANG_BRACES", DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey BRACKETS =
                createTextAttributesKey("VLANG_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey ID =
            createTextAttributesKey("VLANG_ID", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("VLANG_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("VLANG_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("VLANG_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("VLANG_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey COMMA =
            createTextAttributesKey("VLANG_COMMA", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("VLANG_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);


    private static final TextAttributesKey[] ASSIGN_KEYS = new TextAttributesKey[]{ASSIGN};
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] ID_KEYS = new TextAttributesKey[]{ID};
    private static final TextAttributesKey[] PARENTHESES_KEYS = new TextAttributesKey[]{PARENTHESES};
    private static final TextAttributesKey[] BRACES_KEYS = new TextAttributesKey[]{BRACES};
    private static final TextAttributesKey[] BRACKETS_KEYS = new TextAttributesKey[]{BRACKETS};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] COMMA_KEYS = new TextAttributesKey[]{COMMA};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new VLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(VLangTypes.ID)) {
            return ID_KEYS;
        } else if (tokenType.equals(VLangTypes.TYPE)) {
            return KEYWORD_KEYS;
        }else if(tokenType.equals(VLangTypes.MODULE)
               ||tokenType.equals(VLangTypes.BOOL)
               ||tokenType.equals(VLangTypes.IMPORT)
               ||tokenType.equals(VLangTypes.AS)
               ||tokenType.equals(VLangTypes.FN)
               ||tokenType.equals(VLangTypes.MUTABLE)
               ||tokenType.equals(VLangTypes.GO)
               ||tokenType.equals(VLangTypes.IF)
               ||tokenType.equals(VLangTypes.STRUCT)
               ||tokenType.equals(VLangTypes.MATCH)
               ||tokenType.equals(VLangTypes.ELSE)
               ||tokenType.equals(VLangTypes.MAP)
               ||tokenType.equals(VLangTypes.IN)
               ||tokenType.equals(VLangTypes.FOR)
               ||tokenType.equals(VLangTypes.OR)
               ||tokenType.equals(VLangTypes.RETURN)
               ||tokenType.equals(VLangTypes.ENUM)
               ||tokenType.equals(VLangTypes.TYPE_KW)
               ||tokenType.equals(VLangTypes.INTERFACE)
               ||tokenType.equals(VLangTypes.UNION)
               ||tokenType.equals(VLangTypes.DEFER)
               ||tokenType.equals(VLangTypes.GOTO)
               ||tokenType.equals(VLangTypes.UNSAFE)
               ||tokenType.equals(VLangTypes.GLOBAL)
               ||tokenType.equals(VLangTypes.REQUESTED)
               ||tokenType.equals(VLangTypes.CONTINUE)
               ||tokenType.equals(VLangTypes.BREAK)
               ||tokenType.equals(VLangTypes.PUB)
               ||tokenType.equals(VLangTypes.CONST)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(VLangTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(VLangTypes.OPEN)
                 ||tokenType.equals(VLangTypes.CLOSE)) {
            return PARENTHESES_KEYS;
        } else if (tokenType.equals(VLangTypes.OPEN_BRACE)
                 ||tokenType.equals(VLangTypes.CLOSE_BRACE)) {
            return BRACES_KEYS;
        } else if (tokenType.equals(VLangTypes.OPEN_BRACKET)
                 ||tokenType.equals(VLangTypes.CLOSE_BRACKET)) {
            return BRACKETS_KEYS;
        } else if (tokenType.equals(VLangTypes.NUMBER)
                  ||tokenType.equals(VLangTypes.FLOAT)) {
            return NUMBER_KEYS;
        } else if (tokenType.equals(VLangTypes.STRING)
                  ||tokenType.equals(VLangTypes.CHAR)) {
            return STRING_KEYS;
        } else if (tokenType.equals(VLangTypes.ASSIGN)
                  ||tokenType.equals(VLangTypes.INITIAL)) {
            return ASSIGN_KEYS;
        } else if (tokenType.equals(VLangTypes.COMMA)) {
            return COMMA_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
