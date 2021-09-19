package ru.levkopo.vlangPlugin.file.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import ru.levkopo.vlangPlugin.VLanguage;
import ru.levkopo.vlangPlugin.file.VFileType;

public class VFile extends PsiFileBase {
    public VFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, VLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return VFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "V Language File";
    }
}
