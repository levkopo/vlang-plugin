package ru.levkopo.vlangPlugin;

import com.intellij.lang.Language;

public class VLanguage extends Language {
    public static final VLanguage INSTANCE = new VLanguage();

    protected VLanguage() {
        super("vlang");
    }
}
