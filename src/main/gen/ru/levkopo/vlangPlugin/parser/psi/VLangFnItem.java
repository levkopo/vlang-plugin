// This is a generated file. Not intended for manual editing.
package ru.levkopo.vlangPlugin.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VLangFnItem extends PsiElement {

  @NotNull
  List<VLangArg> getArgList();

  @Nullable
  VLangAttribute getAttribute();

  @NotNull
  List<VLangStatement> getStatementList();

  @Nullable
  VLangType getType();

}
