package ru.levkopo.vlangPlugin.settings;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.sun.istack.Nullable;
import org.jetbrains.annotations.NotNull;
import ru.levkopo.vlangPlugin.data.Icons;
import ru.levkopo.vlangPlugin.parser.VLangSyntaxHighlighter;

import javax.swing.*;
import java.util.Map;

public class VLangColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Keyword", VLangSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Comment", VLangSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("Identifier", VLangSyntaxHighlighter.ID),
            new AttributesDescriptor("Parentheses", VLangSyntaxHighlighter.PARENTHESES),
            new AttributesDescriptor("Bad value", VLangSyntaxHighlighter.BAD_CHARACTER),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return Icons.V_FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new VLangSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "fn main() {\n" +
                "    areas := ['game', 'web', 'tools', 'science', 'systems',\n" +
                "              'embedded', 'drivers', 'GUI', 'mobile']\n" +
                "    for area in areas {\n" +
                "        println('Hello, $area developers!')\n" +
                "    }\n" +
                "}";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "V Language";
    }
}
