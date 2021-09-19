package ru.levkopo.vlangPlugin.file;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.levkopo.vlangPlugin.VLanguage;
import ru.levkopo.vlangPlugin.data.Icons;

import javax.swing.*;

public class VFileType extends LanguageFileType {
    public static final VFileType INSTANCE = new VFileType();

    protected VFileType() {
        super(VLanguage.INSTANCE);
    }

    @Override
    public @NonNls
    @NotNull String getName() {
        return "V Language File";
    }

    @Override
    public @NotNull String getDescription() {
        return "Simple V language file";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "v";
    }

    @Override
    public @Nullable Icon getIcon() {
        return Icons.V_FILE;
    }
}
