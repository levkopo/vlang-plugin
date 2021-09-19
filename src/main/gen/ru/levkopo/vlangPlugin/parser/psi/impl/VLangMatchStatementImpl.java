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

public class VLangMatchStatementImpl extends ASTWrapperPsiElement implements VLangMatchStatement {

  public VLangMatchStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VLangVisitor visitor) {
    visitor.visitMatchStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VLangVisitor) accept((VLangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VLangElseMatchStmtItem getElseMatchStmtItem() {
    return findNotNullChildByClass(VLangElseMatchStmtItem.class);
  }

  @Override
  @NotNull
  public VLangExpr getExpr() {
    return findNotNullChildByClass(VLangExpr.class);
  }

  @Override
  @NotNull
  public List<VLangMatchStmtItem> getMatchStmtItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VLangMatchStmtItem.class);
  }

}
