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

public class VLangMatchItemImpl extends ASTWrapperPsiElement implements VLangMatchItem {

  public VLangMatchItemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VLangVisitor visitor) {
    visitor.visitMatchItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VLangVisitor) accept((VLangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<VLangExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VLangExpr.class);
  }

}
