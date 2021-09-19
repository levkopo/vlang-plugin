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

public class VLangMapTypeExprImpl extends VLangExprImpl implements VLangMapTypeExpr {

  public VLangMapTypeExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull VLangVisitor visitor) {
    visitor.visitMapTypeExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VLangVisitor) accept((VLangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<VLangMapItem> getMapItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VLangMapItem.class);
  }

  @Override
  @NotNull
  public List<VLangType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VLangType.class);
  }

}
