// This is a generated file. Not intended for manual editing.
package ru.levkopo.vlangPlugin.parser.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ru.levkopo.vlangPlugin.parser.psi.VLangTypes.*;
import ru.levkopo.vlangPlugin.parser.psi.*;

public class VLangArrayTypeExprImpl extends VLangExprImpl implements VLangArrayTypeExpr {

  public VLangArrayTypeExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull VLangVisitor visitor) {
    visitor.visitArrayTypeExpr(this);
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

  @Override
  @NotNull
  public VLangType getType() {
    return findNotNullChildByClass(VLangType.class);
  }

}
