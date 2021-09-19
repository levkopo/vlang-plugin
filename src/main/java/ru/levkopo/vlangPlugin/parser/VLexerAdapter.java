package ru.levkopo.vlangPlugin.parser;

import com.intellij.lexer.FlexAdapter;

public class VLexerAdapter extends FlexAdapter {
    public VLexerAdapter() {
        super(new VLangLexer(null));
    }
}
