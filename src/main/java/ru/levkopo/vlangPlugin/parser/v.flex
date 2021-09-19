package ru.levkopo.vlangPlugin.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import ru.levkopo.vlangPlugin.parser.psi.VLangTypes;
import com.intellij.psi.TokenType;

%%


%class VLangLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\R
WHITE_SPACE=[\ \n\t\f]
FIRST_VALUE_CHARACTER=[^ \n\f\\] | "\\"{CRLF} | "\\".
VALUE_CHARACTER=[^\n\f\\] | "\\"{CRLF} | "\\".
END_OF_LINE_COMMENT=("//")[^\r\n]*
END_OF_LINE_C=("#")[^\r\n]*
SEPARATOR=[:=]
KEY_CHARACTER=[^:=\ \n\t\f\\] | "\\ "

%state WAITING_VALUE

%%

<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return VLangTypes.COMMENT; }
<YYINITIAL> {END_OF_LINE_C}                                 { yybegin(YYINITIAL); return VLangTypes.CH; }

"module"                                                    { return VLangTypes.MODULE; }
"import"                                                    { return VLangTypes.IMPORT; }
"const"                                                     { return VLangTypes.CONST; }
"struct"                                                    { return VLangTypes.STRUCT; }
"match"                                                     { return VLangTypes.MATCH; }
"as"                                                        { return VLangTypes.AS; }
"fn"                                                        { return VLangTypes.FN; }
"in"                                                        { return VLangTypes.IN; }
"mut"                                                       { return VLangTypes.MUTABLE; }
"map"                                                       { return VLangTypes.MAP; }
"for"                                                       { return VLangTypes.FOR; }
"pub"                                                       { return VLangTypes.PUB; }
"else"                                                      { return VLangTypes.ELSE; }
"enum"                                                      { return VLangTypes.ENUM; }
"type"                                                      { return VLangTypes.TYPE_KW; }
"if"                                                        { return VLangTypes.IF; }
"goto"                                                      { return VLangTypes.GOTO; }
"unsafe"                                                    { return VLangTypes.UNSAFE; }
"requested"                                                 { return VLangTypes.REQUESTED; }
"continue"                                                  { return VLangTypes.CONTINUE; }
"break"                                                     { return VLangTypes.BREAK; }
"go"                                                        { return VLangTypes.GO; }
"or"                                                        { return VLangTypes.OR; }
"return"                                                    { return VLangTypes.RETURN; }
"interface"                                                 { return VLangTypes.INTERFACE; }
"union"                                                     { return VLangTypes.UNION; }
"defer"                                                     { return VLangTypes.DEFER; }
"true"|"false"                                              { return VLangTypes.BOOL; }
"none"                                                      { return VLangTypes.NONE; }
"__global"                                                  { return VLangTypes.GLOBAL; }
"{"                                                         { return VLangTypes.OPEN_BRACE; }
"}"                                                         { return VLangTypes.CLOSE_BRACE; }
"["                                                         { return VLangTypes.OPEN_BRACKET; }
"]"                                                         { return VLangTypes.CLOSE_BRACKET; }
"("                                                         { return VLangTypes.OPEN; }
";"                                                         { return VLangTypes.SEMICOLON; }
")"                                                         { return VLangTypes.CLOSE; }
"/"                                                         { return VLangTypes.DIV; }
"*"                                                         { return VLangTypes.MUL; }
"+"                                                         { return VLangTypes.PLUS; }
"-"                                                         { return VLangTypes.MINUS; }
"."                                                         { return VLangTypes.DOT; }
","                                                         { return VLangTypes.COMMA; }
"?"                                                         { return VLangTypes.OPTION; }
":"                                                         { return VLangTypes.COLON; }
":="                                                        { return VLangTypes.INITIAL; }
"=="                                                        { return VLangTypes.EQUALS; }
"!="                                                        { return VLangTypes.NOT_EQUALS; }
"<"                                                         { return VLangTypes.LESS; }
"<="                                                        { return VLangTypes.LESS_EQUALS; }
">"                                                         { return VLangTypes.GRANDE; }
">="                                                        { return VLangTypes.GRANDE_EQUALS; }
"&"                                                         { return VLangTypes.AND; }
"|"                                                         { return VLangTypes.OR; }
"^"                                                         { return VLangTypes.XOR; }
"!"                                                         { return VLangTypes.NOT; }
"<<"                                                        { return VLangTypes.LEFT_SHIFT; }
">>"                                                        { return VLangTypes.RIGHT_SHIFT; }
"="                                                         { return VLangTypes.ASSIGN; }
"%"                                                         { return VLangTypes.REMAINDER; }
"$"                                                         { return VLangTypes.ATOMIC; }
\'.+?\'|\".+?\"                                             { return VLangTypes.STRING; }
\`.\`                                                       { return VLangTypes.CHAR; }
\d+\.\d+                                                    { return VLangTypes.FLOAT; }
\d+                                                         { return VLangTypes.NUMBER; }
\w+                                                         { return VLangTypes.ID; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }