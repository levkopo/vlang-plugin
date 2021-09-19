// This is a generated file. Not intended for manual editing.
package ru.levkopo.vlangPlugin.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VLangStatement extends PsiElement {

  @Nullable
  VLangReturnStatement getReturnStatement();

  @Nullable
  VLangAtomicIF getAtomicIF();

  @Nullable
  VLangBreakStatement getBreakStatement();

  @Nullable
  VLangContinueStatement getContinueStatement();

  @Nullable
  VLangDeferStatement getDeferStatement();

  @Nullable
  VLangExpr getExpr();

  @Nullable
  VLangForStatement getForStatement();

  @Nullable
  VLangGoStatement getGoStatement();

  @Nullable
  VLangGotoStatement getGotoStatement();

  @Nullable
  VLangIfStatement getIfStatement();

  @Nullable
  VLangLabelStatement getLabelStatement();

  @Nullable
  VLangMatchStatement getMatchStatement();

  @Nullable
  VLangUnaryMinus getUnaryMinus();

  @Nullable
  VLangUnaryPlus getUnaryPlus();

}
