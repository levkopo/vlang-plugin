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

public class VLangFnExprImpl extends VLangExprImpl implements VLangFnExpr {

  public VLangFnExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull VLangVisitor visitor) {
    visitor.visitFnExpr(this);
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
