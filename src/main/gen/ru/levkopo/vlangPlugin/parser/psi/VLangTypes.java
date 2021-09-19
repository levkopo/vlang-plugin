// This is a generated file. Not intended for manual editing.
package ru.levkopo.vlangPlugin.parser.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import ru.levkopo.vlangPlugin.parser.psi.impl.*;

public interface VLangTypes {

  IElementType ACCESS_EXPR = new VElementType("ACCESS_EXPR");
  IElementType ANDB_EXPR = new VElementType("ANDB_EXPR");
  IElementType AND_ASSIGN_EXPR = new VElementType("AND_ASSIGN_EXPR");
  IElementType AND_EXPR = new VElementType("AND_EXPR");
  IElementType ARG = new VElementType("ARG");
  IElementType ARRAY_EXPR = new VElementType("ARRAY_EXPR");
  IElementType ARRAY_TYPE_EXPR = new VElementType("ARRAY_TYPE_EXPR");
  IElementType ASSIGN_EXPR = new VElementType("ASSIGN_EXPR");
  IElementType ATOMIC_FILE_IF = new VElementType("ATOMIC_FILE_IF");
  IElementType ATOMIC_IF = new VElementType("ATOMIC_IF");
  IElementType ATTRIBUTE = new VElementType("ATTRIBUTE");
  IElementType BREAK_STATEMENT = new VElementType("BREAK_STATEMENT");
  IElementType CALL_FN_EXPR = new VElementType("CALL_FN_EXPR");
  IElementType CALL_FN_STRUCT = new VElementType("CALL_FN_STRUCT");
  IElementType CONST_ITEM = new VElementType("CONST_ITEM");
  IElementType CONTINUE_STATEMENT = new VElementType("CONTINUE_STATEMENT");
  IElementType DEFER_STATEMENT = new VElementType("DEFER_STATEMENT");
  IElementType DIV_ASSIGN_EXPR = new VElementType("DIV_ASSIGN_EXPR");
  IElementType DIV_EXPR = new VElementType("DIV_EXPR");
  IElementType ELSE_MATCH_ITEM = new VElementType("ELSE_MATCH_ITEM");
  IElementType ELSE_MATCH_STMT_ITEM = new VElementType("ELSE_MATCH_STMT_ITEM");
  IElementType ENUM_ITEM = new VElementType("ENUM_ITEM");
  IElementType EQUALS_EXPR = new VElementType("EQUALS_EXPR");
  IElementType EXPR = new VElementType("EXPR");
  IElementType FILE_GLOBAL = new VElementType("FILE_GLOBAL");
  IElementType FN_EXPR = new VElementType("FN_EXPR");
  IElementType FN_ITEM = new VElementType("FN_ITEM");
  IElementType FOR_STATEMENT = new VElementType("FOR_STATEMENT");
  IElementType GOTO_STATEMENT = new VElementType("GOTO_STATEMENT");
  IElementType GO_STATEMENT = new VElementType("GO_STATEMENT");
  IElementType GRANDE_EQUALS_EXPR = new VElementType("GRANDE_EQUALS_EXPR");
  IElementType GRANDE_EXPR = new VElementType("GRANDE_EXPR");
  IElementType HEAP_EXPR = new VElementType("HEAP_EXPR");
  IElementType IF_EXPR = new VElementType("IF_EXPR");
  IElementType IF_STATEMENT = new VElementType("IF_STATEMENT");
  IElementType IMPORT_MODULE = new VElementType("IMPORT_MODULE");
  IElementType INITIALIZE_EXPR = new VElementType("INITIALIZE_EXPR");
  IElementType INTERFACE_ITEM = new VElementType("INTERFACE_ITEM");
  IElementType IN_EXPR = new VElementType("IN_EXPR");
  IElementType LABEL_STATEMENT = new VElementType("LABEL_STATEMENT");
  IElementType LEFT_SHIFT_ASSIGN_EXPR = new VElementType("LEFT_SHIFT_ASSIGN_EXPR");
  IElementType LEFT_SHIFT_EXPR = new VElementType("LEFT_SHIFT_EXPR");
  IElementType LESS_EQUALS_EXPR = new VElementType("LESS_EQUALS_EXPR");
  IElementType LESS_EXPR = new VElementType("LESS_EXPR");
  IElementType LINKS_EXPR = new VElementType("LINKS_EXPR");
  IElementType LINK_EXPR = new VElementType("LINK_EXPR");
  IElementType MAP_EXPR = new VElementType("MAP_EXPR");
  IElementType MAP_ITEM = new VElementType("MAP_ITEM");
  IElementType MAP_TYPE_EXPR = new VElementType("MAP_TYPE_EXPR");
  IElementType MATCH_EXPR = new VElementType("MATCH_EXPR");
  IElementType MATCH_ITEM = new VElementType("MATCH_ITEM");
  IElementType MATCH_STATEMENT = new VElementType("MATCH_STATEMENT");
  IElementType MATCH_STMT_ITEM = new VElementType("MATCH_STMT_ITEM");
  IElementType MINUS_ASSIGN_EXPR = new VElementType("MINUS_ASSIGN_EXPR");
  IElementType MINUS_EXPR = new VElementType("MINUS_EXPR");
  IElementType MODULE_NAME = new VElementType("MODULE_NAME");
  IElementType MUL_ASSIGN_EXPR = new VElementType("MUL_ASSIGN_EXPR");
  IElementType MUL_EXPR = new VElementType("MUL_EXPR");
  IElementType NOT_EQUALS_EXPR = new VElementType("NOT_EQUALS_EXPR");
  IElementType NOT_EXPR = new VElementType("NOT_EXPR");
  IElementType OPTION_IGNORE_EXPR = new VElementType("OPTION_IGNORE_EXPR");
  IElementType ORB_EXPR = new VElementType("ORB_EXPR");
  IElementType OR_ASSIGN_EXPR = new VElementType("OR_ASSIGN_EXPR");
  IElementType OR_EXPR = new VElementType("OR_EXPR");
  IElementType OR_OPTIONAL_EXPR = new VElementType("OR_OPTIONAL_EXPR");
  IElementType PAREN_EXPR = new VElementType("PAREN_EXPR");
  IElementType PLUS_ASSIGN_EXPR = new VElementType("PLUS_ASSIGN_EXPR");
  IElementType PLUS_EXPR = new VElementType("PLUS_EXPR");
  IElementType RANGE_EXPR = new VElementType("RANGE_EXPR");
  IElementType REMAINDER_ASSIGN_EXPR = new VElementType("REMAINDER_ASSIGN_EXPR");
  IElementType REMAINDER_EXPR = new VElementType("REMAINDER_EXPR");
  IElementType RETURN_STATEMENT = new VElementType("RETURN_STATEMENT");
  IElementType RIGHT_SHIFT_ASSIGN_EXPR = new VElementType("RIGHT_SHIFT_ASSIGN_EXPR");
  IElementType RIGHT_SHIFT_EXPR = new VElementType("RIGHT_SHIFT_EXPR");
  IElementType STATEMENT = new VElementType("STATEMENT");
  IElementType STRUCTURE_CREATE_EXPR = new VElementType("STRUCTURE_CREATE_EXPR");
  IElementType STRUCTURE_CREATE_ITEM = new VElementType("STRUCTURE_CREATE_ITEM");
  IElementType STRUCT_ITEM = new VElementType("STRUCT_ITEM");
  IElementType STRUCT_ITEM_ = new VElementType("STRUCT_ITEM_");
  IElementType THIS_ACCESS_EXPR = new VElementType("THIS_ACCESS_EXPR");
  IElementType TYPE = new VElementType("TYPE");
  IElementType TYPE_ITEM = new VElementType("TYPE_ITEM");
  IElementType UNARY_MINUS = new VElementType("UNARY_MINUS");
  IElementType UNARY_PLUS = new VElementType("UNARY_PLUS");
  IElementType UNION_ITEM = new VElementType("UNION_ITEM");
  IElementType VALUE_EXPR = new VElementType("VALUE_EXPR");
  IElementType XOR_ASSIGN_EXPR = new VElementType("XOR_ASSIGN_EXPR");
  IElementType XOR_EXPR = new VElementType("XOR_EXPR");

  IElementType AND = new VTokenType("AND");
  IElementType AS = new VTokenType("AS");
  IElementType ASSIGN = new VTokenType("ASSIGN");
  IElementType ATOMIC = new VTokenType("ATOMIC");
  IElementType BOOL = new VTokenType("BOOL");
  IElementType BREAK = new VTokenType("BREAK");
  IElementType CH = new VTokenType("CH");
  IElementType CHAR = new VTokenType("CHAR");
  IElementType CLOSE = new VTokenType("CLOSE");
  IElementType CLOSE_BRACE = new VTokenType("CLOSE_BRACE");
  IElementType CLOSE_BRACKET = new VTokenType("CLOSE_BRACKET");
  IElementType COLON = new VTokenType("COLON");
  IElementType COMMA = new VTokenType("COMMA");
  IElementType COMMENT = new VTokenType("COMMENT");
  IElementType CONST = new VTokenType("CONST");
  IElementType CONTINUE = new VTokenType("CONTINUE");
  IElementType DEFER = new VTokenType("DEFER");
  IElementType DIV = new VTokenType("DIV");
  IElementType DOT = new VTokenType("DOT");
  IElementType ELSE = new VTokenType("ELSE");
  IElementType ENUM = new VTokenType("ENUM");
  IElementType EQUALS = new VTokenType("EQUALS");
  IElementType FLOAT = new VTokenType("FLOAT");
  IElementType FN = new VTokenType("FN");
  IElementType FOR = new VTokenType("FOR");
  IElementType GLOBAL = new VTokenType("GLOBAL");
  IElementType GO = new VTokenType("GO");
  IElementType GOTO = new VTokenType("GOTO");
  IElementType GRANDE = new VTokenType("GRANDE");
  IElementType GRANDE_EQUALS = new VTokenType("GRANDE_EQUALS");
  IElementType ID = new VTokenType("ID");
  IElementType IF = new VTokenType("IF");
  IElementType IMPORT = new VTokenType("IMPORT");
  IElementType IN = new VTokenType("IN");
  IElementType INITIAL = new VTokenType("INITIAL");
  IElementType INTERFACE = new VTokenType("INTERFACE");
  IElementType LEFT_SHIFT = new VTokenType("LEFT_SHIFT");
  IElementType LESS = new VTokenType("LESS");
  IElementType LESS_EQUALS = new VTokenType("LESS_EQUALS");
  IElementType MAP = new VTokenType("MAP");
  IElementType MATCH = new VTokenType("MATCH");
  IElementType MINUS = new VTokenType("MINUS");
  IElementType MODULE = new VTokenType("MODULE");
  IElementType MUL = new VTokenType("MUL");
  IElementType MUTABLE = new VTokenType("MUTABLE");
  IElementType NONE = new VTokenType("NONE");
  IElementType NOT = new VTokenType("NOT");
  IElementType NOT_EQUALS = new VTokenType("NOT_EQUALS");
  IElementType NUMBER = new VTokenType("NUMBER");
  IElementType OPEN = new VTokenType("OPEN");
  IElementType OPEN_BRACE = new VTokenType("OPEN_BRACE");
  IElementType OPEN_BRACKET = new VTokenType("OPEN_BRACKET");
  IElementType OPTION = new VTokenType("OPTION");
  IElementType OR = new VTokenType("OR");
  IElementType PLUS = new VTokenType("PLUS");
  IElementType PUB = new VTokenType("PUB");
  IElementType REMAINDER = new VTokenType("REMAINDER");
  IElementType REQUESTED = new VTokenType("REQUESTED");
  IElementType RETURN = new VTokenType("RETURN");
  IElementType RIGHT_SHIFT = new VTokenType("RIGHT_SHIFT");
  IElementType SEMICOLON = new VTokenType("SEMICOLON");
  IElementType STRING = new VTokenType("STRING");
  IElementType STRUCT = new VTokenType("STRUCT");
  IElementType TYPE_KW = new VTokenType("TYPE_KW");
  IElementType UNION = new VTokenType("UNION");
  IElementType UNSAFE = new VTokenType("UNSAFE");
  IElementType XOR = new VTokenType("XOR");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ACCESS_EXPR) {
        return new VLangAccessExprImpl(node);
      }
      else if (type == ANDB_EXPR) {
        return new VLangAndbExprImpl(node);
      }
      else if (type == AND_ASSIGN_EXPR) {
        return new VLangAndAssignExprImpl(node);
      }
      else if (type == AND_EXPR) {
        return new VLangAndExprImpl(node);
      }
      else if (type == ARG) {
        return new VLangArgImpl(node);
      }
      else if (type == ARRAY_EXPR) {
        return new VLangArrayExprImpl(node);
      }
      else if (type == ARRAY_TYPE_EXPR) {
        return new VLangArrayTypeExprImpl(node);
      }
      else if (type == ASSIGN_EXPR) {
        return new VLangAssignExprImpl(node);
      }
      else if (type == ATOMIC_FILE_IF) {
        return new VLangAtomicFileIFImpl(node);
      }
      else if (type == ATOMIC_IF) {
        return new VLangAtomicIFImpl(node);
      }
      else if (type == ATTRIBUTE) {
        return new VLangAttributeImpl(node);
      }
      else if (type == BREAK_STATEMENT) {
        return new VLangBreakStatementImpl(node);
      }
      else if (type == CALL_FN_EXPR) {
        return new VLangCallFnExprImpl(node);
      }
      else if (type == CALL_FN_STRUCT) {
        return new VLangCallFnStructImpl(node);
      }
      else if (type == CONST_ITEM) {
        return new VLangConstItemImpl(node);
      }
      else if (type == CONTINUE_STATEMENT) {
        return new VLangContinueStatementImpl(node);
      }
      else if (type == DEFER_STATEMENT) {
        return new VLangDeferStatementImpl(node);
      }
      else if (type == DIV_ASSIGN_EXPR) {
        return new VLangDivAssignExprImpl(node);
      }
      else if (type == DIV_EXPR) {
        return new VLangDivExprImpl(node);
      }
      else if (type == ELSE_MATCH_ITEM) {
        return new VLangElseMatchItemImpl(node);
      }
      else if (type == ELSE_MATCH_STMT_ITEM) {
        return new VLangElseMatchStmtItemImpl(node);
      }
      else if (type == ENUM_ITEM) {
        return new VLangEnumItemImpl(node);
      }
      else if (type == EQUALS_EXPR) {
        return new VLangEqualsExprImpl(node);
      }
      else if (type == FILE_GLOBAL) {
        return new VLangFileGlobalImpl(node);
      }
      else if (type == FN_EXPR) {
        return new VLangFnExprImpl(node);
      }
      else if (type == FN_ITEM) {
        return new VLangFnItemImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new VLangForStatementImpl(node);
      }
      else if (type == GOTO_STATEMENT) {
        return new VLangGotoStatementImpl(node);
      }
      else if (type == GO_STATEMENT) {
        return new VLangGoStatementImpl(node);
      }
      else if (type == GRANDE_EQUALS_EXPR) {
        return new VLangGrandeEqualsExprImpl(node);
      }
      else if (type == GRANDE_EXPR) {
        return new VLangGrandeExprImpl(node);
      }
      else if (type == HEAP_EXPR) {
        return new VLangHeapExprImpl(node);
      }
      else if (type == IF_EXPR) {
        return new VLangIfExprImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new VLangIfStatementImpl(node);
      }
      else if (type == IMPORT_MODULE) {
        return new VLangImportModuleImpl(node);
      }
      else if (type == INITIALIZE_EXPR) {
        return new VLangInitializeExprImpl(node);
      }
      else if (type == INTERFACE_ITEM) {
        return new VLangInterfaceItemImpl(node);
      }
      else if (type == IN_EXPR) {
        return new VLangInExprImpl(node);
      }
      else if (type == LABEL_STATEMENT) {
        return new VLangLabelStatementImpl(node);
      }
      else if (type == LEFT_SHIFT_ASSIGN_EXPR) {
        return new VLangLeftShiftAssignExprImpl(node);
      }
      else if (type == LEFT_SHIFT_EXPR) {
        return new VLangLeftShiftExprImpl(node);
      }
      else if (type == LESS_EQUALS_EXPR) {
        return new VLangLessEqualsExprImpl(node);
      }
      else if (type == LESS_EXPR) {
        return new VLangLessExprImpl(node);
      }
      else if (type == LINKS_EXPR) {
        return new VLangLinksExprImpl(node);
      }
      else if (type == LINK_EXPR) {
        return new VLangLinkExprImpl(node);
      }
      else if (type == MAP_EXPR) {
        return new VLangMapExprImpl(node);
      }
      else if (type == MAP_ITEM) {
        return new VLangMapItemImpl(node);
      }
      else if (type == MAP_TYPE_EXPR) {
        return new VLangMapTypeExprImpl(node);
      }
      else if (type == MATCH_EXPR) {
        return new VLangMatchExprImpl(node);
      }
      else if (type == MATCH_ITEM) {
        return new VLangMatchItemImpl(node);
      }
      else if (type == MATCH_STATEMENT) {
        return new VLangMatchStatementImpl(node);
      }
      else if (type == MATCH_STMT_ITEM) {
        return new VLangMatchStmtItemImpl(node);
      }
      else if (type == MINUS_ASSIGN_EXPR) {
        return new VLangMinusAssignExprImpl(node);
      }
      else if (type == MINUS_EXPR) {
        return new VLangMinusExprImpl(node);
      }
      else if (type == MODULE_NAME) {
        return new VLangModuleNameImpl(node);
      }
      else if (type == MUL_ASSIGN_EXPR) {
        return new VLangMulAssignExprImpl(node);
      }
      else if (type == MUL_EXPR) {
        return new VLangMulExprImpl(node);
      }
      else if (type == NOT_EQUALS_EXPR) {
        return new VLangNotEqualsExprImpl(node);
      }
      else if (type == NOT_EXPR) {
        return new VLangNotExprImpl(node);
      }
      else if (type == OPTION_IGNORE_EXPR) {
        return new VLangOptionIgnoreExprImpl(node);
      }
      else if (type == ORB_EXPR) {
        return new VLangOrbExprImpl(node);
      }
      else if (type == OR_ASSIGN_EXPR) {
        return new VLangOrAssignExprImpl(node);
      }
      else if (type == OR_EXPR) {
        return new VLangOrExprImpl(node);
      }
      else if (type == OR_OPTIONAL_EXPR) {
        return new VLangOrOptionalExprImpl(node);
      }
      else if (type == PAREN_EXPR) {
        return new VLangParenExprImpl(node);
      }
      else if (type == PLUS_ASSIGN_EXPR) {
        return new VLangPlusAssignExprImpl(node);
      }
      else if (type == PLUS_EXPR) {
        return new VLangPlusExprImpl(node);
      }
      else if (type == RANGE_EXPR) {
        return new VLangRangeExprImpl(node);
      }
      else if (type == REMAINDER_ASSIGN_EXPR) {
        return new VLangRemainderAssignExprImpl(node);
      }
      else if (type == REMAINDER_EXPR) {
        return new VLangRemainderExprImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new VLangReturnStatementImpl(node);
      }
      else if (type == RIGHT_SHIFT_ASSIGN_EXPR) {
        return new VLangRightShiftAssignExprImpl(node);
      }
      else if (type == RIGHT_SHIFT_EXPR) {
        return new VLangRightShiftExprImpl(node);
      }
      else if (type == STATEMENT) {
        return new VLangStatementImpl(node);
      }
      else if (type == STRUCTURE_CREATE_EXPR) {
        return new VLangStructureCreateExprImpl(node);
      }
      else if (type == STRUCTURE_CREATE_ITEM) {
        return new VLangStructureCreateItemImpl(node);
      }
      else if (type == STRUCT_ITEM) {
        return new VLangStructItemImpl(node);
      }
      else if (type == STRUCT_ITEM_) {
        return new VLangStructItem_Impl(node);
      }
      else if (type == THIS_ACCESS_EXPR) {
        return new VLangThisAccessExprImpl(node);
      }
      else if (type == TYPE) {
        return new VLangTypeImpl(node);
      }
      else if (type == TYPE_ITEM) {
        return new VLangTypeItemImpl(node);
      }
      else if (type == UNARY_MINUS) {
        return new VLangUnaryMinusImpl(node);
      }
      else if (type == UNARY_PLUS) {
        return new VLangUnaryPlusImpl(node);
      }
      else if (type == UNION_ITEM) {
        return new VLangUnionItemImpl(node);
      }
      else if (type == VALUE_EXPR) {
        return new VLangValueExprImpl(node);
      }
      else if (type == XOR_ASSIGN_EXPR) {
        return new VLangXorAssignExprImpl(node);
      }
      else if (type == XOR_EXPR) {
        return new VLangXorExprImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
