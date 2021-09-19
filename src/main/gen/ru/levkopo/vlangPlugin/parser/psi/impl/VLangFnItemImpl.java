// This is a generated file. Not intended for manual editing.
package ru.levkopo.vlangPlugin.parser.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ru.levkopo.vlangPlugin.parser.psi.VLangTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import ru.levkopo.vlangPlugin.parser.psi.*;

public class VLangFnItemImpl extends ASTWrapperPsiElement implements VLangFnItem {

  public VLangFnItemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VLangVisitor visitor) {
    visitor.visitFnItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VLangVisitor) accept((VLangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<VLangArg> getArgList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VLangArg.class);
  }

  @Override
  @Nullable
  public VLangAttribute getAttribute() {
    return findChildByClass(VLangAttribute.class);
  }

  @Override
  @NotNull
  public List<VLangStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VLangStatement.class);
  }

  @Override
  @Nullable
  public VLangType getType() {
    return findChildByClass(VLangType.class);
  }

}
