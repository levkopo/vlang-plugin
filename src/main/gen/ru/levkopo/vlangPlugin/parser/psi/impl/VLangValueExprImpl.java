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

public class VLangValueExprImpl extends VLangExprImpl implements VLangValueExpr {

  public VLangValueExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull VLangVisitor visitor) {
    visitor.visitValueExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VLangVisitor) accept((VLangVisitor)visitor);
    else super.accept(visitor);
  }

}
