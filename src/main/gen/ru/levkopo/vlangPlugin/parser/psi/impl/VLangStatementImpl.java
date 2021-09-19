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

public class VLangStatementImpl extends ASTWrapperPsiElement implements VLangStatement {

  public VLangStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VLangVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VLangVisitor) accept((VLangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VLangReturnStatement getReturnStatement() {
    return findChildByClass(VLangReturnStatement.class);
  }

  @Override
  @Nullable
  public VLangAtomicIF getAtomicIF() {
    return findChildByClass(VLangAtomicIF.class);
  }

  @Override
  @Nullable
  public VLangBreakStatement getBreakStatement() {
    return findChildByClass(VLangBreakStatement.class);
  }

  @Override
  @Nullable
  public VLangContinueStatement getContinueStatement() {
    return findChildByClass(VLangContinueStatement.class);
  }

  @Override
  @Nullable
  public VLangDeferStatement getDeferStatement() {
    return findChildByClass(VLangDeferStatement.class);
  }

  @Override
  @Nullable
  public VLangExpr getExpr() {
    return findChildByClass(VLangExpr.class);
  }

  @Override
  @Nullable
  public VLangForStatement getForStatement() {
    return findChildByClass(VLangForStatement.class);
  }

  @Override
  @Nullable
  public VLangGoStatement getGoStatement() {
    return findChildByClass(VLangGoStatement.class);
  }

  @Override
  @Nullable
  public VLangGotoStatement getGotoStatement() {
    return findChildByClass(VLangGotoStatement.class);
  }

  @Override
  @Nullable
  public VLangIfStatement getIfStatement() {
    return findChildByClass(VLangIfStatement.class);
  }

  @Override
  @Nullable
  public VLangLabelStatement getLabelStatement() {
    return findChildByClass(VLangLabelStatement.class);
  }

  @Override
  @Nullable
  public VLangMatchStatement getMatchStatement() {
    return findChildByClass(VLangMatchStatement.class);
  }

  @Override
  @Nullable
  public VLangUnaryMinus getUnaryMinus() {
    return findChildByClass(VLangUnaryMinus.class);
  }

  @Override
  @Nullable
  public VLangUnaryPlus getUnaryPlus() {
    return findChildByClass(VLangUnaryPlus.class);
  }

}
