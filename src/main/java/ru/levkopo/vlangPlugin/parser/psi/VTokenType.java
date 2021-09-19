package ru.levkopo.vlangPlugin.parser.psi;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.levkopo.vlangPlugin.VLanguage;

public class VTokenType extends IElementType {
    public VTokenType(@NonNls @NotNull String debugName) {
        super(debugName, VLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "v_token."+super.toString();
    }
}
