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

public class VLangStructItem_Impl extends ASTWrapperPsiElement implements VLangStructItem_ {

  public VLangStructItem_Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VLangVisitor visitor) {
    visitor.visitStructItem_(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VLangVisitor) accept((VLangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VLangAttribute getAttribute() {
    return findChildByClass(VLangAttribute.class);
  }

  @Override
  @Nullable
  public VLangExpr getExpr() {
    return findChildByClass(VLangExpr.class);
  }

  @Override
  @Nullable
  public VLangType getType() {
    return findChildByClass(VLangType.class);
  }

}
