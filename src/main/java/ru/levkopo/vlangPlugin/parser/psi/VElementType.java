package ru.levkopo.vlangPlugin.parser.psi;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.levkopo.vlangPlugin.VLanguage;

public class VElementType extends IElementType {
    public VElementType(@NonNls @NotNull String debugName) {
        super(debugName, VLanguage.INSTANCE);
    }
}
