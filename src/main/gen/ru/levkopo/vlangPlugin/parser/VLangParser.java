// This is a generated file. Not intended for manual editing.
package ru.levkopo.vlangPlugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static ru.levkopo.vlangPlugin.parser.psi.VLangTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class VLangParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return file(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ACCESS_EXPR, ANDB_EXPR, AND_ASSIGN_EXPR, AND_EXPR,
      ARRAY_EXPR, ARRAY_TYPE_EXPR, ASSIGN_EXPR, CALL_FN_EXPR,
      DIV_ASSIGN_EXPR, DIV_EXPR, EQUALS_EXPR, EXPR,
      FN_EXPR, GRANDE_EQUALS_EXPR, GRANDE_EXPR, HEAP_EXPR,
      IF_EXPR, INITIALIZE_EXPR, IN_EXPR, LEFT_SHIFT_ASSIGN_EXPR,
      LEFT_SHIFT_EXPR, LESS_EQUALS_EXPR, LESS_EXPR, LINKS_EXPR,
      LINK_EXPR, MAP_EXPR, MAP_TYPE_EXPR, MATCH_EXPR,
      MINUS_ASSIGN_EXPR, MINUS_EXPR, MUL_ASSIGN_EXPR, MUL_EXPR,
      NOT_EQUALS_EXPR, NOT_EXPR, OPTION_IGNORE_EXPR, ORB_EXPR,
      OR_ASSIGN_EXPR, OR_EXPR, OR_OPTIONAL_EXPR, PAREN_EXPR,
      PLUS_ASSIGN_EXPR, PLUS_EXPR, RANGE_EXPR, REMAINDER_ASSIGN_EXPR,
      REMAINDER_EXPR, RIGHT_SHIFT_ASSIGN_EXPR, RIGHT_SHIFT_EXPR, STRUCTURE_CREATE_EXPR,
      THIS_ACCESS_EXPR, VALUE_EXPR, XOR_ASSIGN_EXPR, XOR_EXPR),
  };

  /* ********************************************************** */
  // RETURN expr?
  public static boolean Return_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Return_statement")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && Return_statement_1(b, l + 1);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  // expr?
  private static boolean Return_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Return_statement_1")) return false;
    expr(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // MUTABLE? ID type
  public static boolean arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg")) return false;
    if (!nextTokenIs(b, "<arg>", ID, MUTABLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARG, "<arg>");
    r = arg_0(b, l + 1);
    r = r && consumeToken(b, ID);
    r = r && type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // MUTABLE?
  private static boolean arg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_0")) return false;
    consumeToken(b, MUTABLE);
    return true;
  }

  /* ********************************************************** */
  // ATOMIC IF expr OPEN_BRACE CH* CLOSE_BRACE (ATOMIC ELSE OPEN_BRACE CH* CLOSE_BRACE)
  public static boolean atomicFileIF(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atomicFileIF")) return false;
    if (!nextTokenIs(b, ATOMIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ATOMIC, IF);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && atomicFileIF_4(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    r = r && atomicFileIF_6(b, l + 1);
    exit_section_(b, m, ATOMIC_FILE_IF, r);
    return r;
  }

  // CH*
  private static boolean atomicFileIF_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atomicFileIF_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, CH)) break;
      if (!empty_element_parsed_guard_(b, "atomicFileIF_4", c)) break;
    }
    return true;
  }

  // ATOMIC ELSE OPEN_BRACE CH* CLOSE_BRACE
  private static boolean atomicFileIF_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atomicFileIF_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ATOMIC, ELSE, OPEN_BRACE);
    r = r && atomicFileIF_6_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // CH*
  private static boolean atomicFileIF_6_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atomicFileIF_6_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, CH)) break;
      if (!empty_element_parsed_guard_(b, "atomicFileIF_6_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ATOMIC IF expr OPEN_BRACE statement* CLOSE_BRACE (ATOMIC ELSE OPEN_BRACE statement* CLOSE_BRACE)
  public static boolean atomicIF(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atomicIF")) return false;
    if (!nextTokenIs(b, ATOMIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ATOMIC, IF);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && atomicIF_4(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    r = r && atomicIF_6(b, l + 1);
    exit_section_(b, m, ATOMIC_IF, r);
    return r;
  }

  // statement*
  private static boolean atomicIF_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atomicIF_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "atomicIF_4", c)) break;
    }
    return true;
  }

  // ATOMIC ELSE OPEN_BRACE statement* CLOSE_BRACE
  private static boolean atomicIF_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atomicIF_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ATOMIC, ELSE, OPEN_BRACE);
    r = r && atomicIF_6_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement*
  private static boolean atomicIF_6_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atomicIF_6_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "atomicIF_6_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // OPEN_BRACKET IF? (UNSAFE|REQUESTED|ID) (COLON value_expr)? CLOSE_BRACKET
  public static boolean attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute")) return false;
    if (!nextTokenIs(b, OPEN_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACKET);
    r = r && attribute_1(b, l + 1);
    r = r && attribute_2(b, l + 1);
    r = r && attribute_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, ATTRIBUTE, r);
    return r;
  }

  // IF?
  private static boolean attribute_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_1")) return false;
    consumeToken(b, IF);
    return true;
  }

  // UNSAFE|REQUESTED|ID
  private static boolean attribute_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_2")) return false;
    boolean r;
    r = consumeToken(b, UNSAFE);
    if (!r) r = consumeToken(b, REQUESTED);
    if (!r) r = consumeToken(b, ID);
    return r;
  }

  // (COLON value_expr)?
  private static boolean attribute_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_3")) return false;
    attribute_3_0(b, l + 1);
    return true;
  }

  // COLON value_expr
  private static boolean attribute_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && value_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BREAK
  public static boolean break_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_statement")) return false;
    if (!nextTokenIs(b, BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BREAK);
    exit_section_(b, m, BREAK_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // (ID COLON expr)*
  public static boolean callFn_struct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callFn_struct")) return false;
    Marker m = enter_section_(b, l, _NONE_, CALL_FN_STRUCT, "<call fn struct>");
    while (true) {
      int c = current_position_(b);
      if (!callFn_struct_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "callFn_struct", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ID COLON expr
  private static boolean callFn_struct_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callFn_struct_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, COLON);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ID ASSIGN value_expr
  public static boolean constItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constItem")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, ASSIGN);
    r = r && value_expr(b, l + 1);
    exit_section_(b, m, CONST_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // CONST (OPEN constItem* CLOSE)|constItem
  static boolean constants(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constants")) return false;
    if (!nextTokenIs(b, "", CONST, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constants_0(b, l + 1);
    if (!r) r = constItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CONST (OPEN constItem* CLOSE)
  private static boolean constants_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constants_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST);
    r = r && constants_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPEN constItem* CLOSE
  private static boolean constants_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constants_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN);
    r = r && constants_0_1_1(b, l + 1);
    r = r && consumeToken(b, CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // constItem*
  private static boolean constants_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constants_0_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!constItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "constants_0_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // CONTINUE
  public static boolean continue_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_statement")) return false;
    if (!nextTokenIs(b, CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONTINUE);
    exit_section_(b, m, CONTINUE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // DEFER OPEN_BRACE statement* CLOSE_BRACE
  public static boolean defer_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defer_statement")) return false;
    if (!nextTokenIs(b, DEFER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEFER, OPEN_BRACE);
    r = r && defer_statement_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, DEFER_STATEMENT, r);
    return r;
  }

  // statement*
  private static boolean defer_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defer_statement_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "defer_statement_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ELSE OPEN_BRACE expr* CLOSE_BRACE
  public static boolean elseMatchItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elseMatchItem")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ELSE, OPEN_BRACE);
    r = r && elseMatchItem_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, ELSE_MATCH_ITEM, r);
    return r;
  }

  // expr*
  private static boolean elseMatchItem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elseMatchItem_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr(b, l + 1, -1)) break;
      if (!empty_element_parsed_guard_(b, "elseMatchItem_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ELSE OPEN_BRACE statement* CLOSE_BRACE
  public static boolean elseMatchStmtItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elseMatchStmtItem")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ELSE, OPEN_BRACE);
    r = r && elseMatchStmtItem_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, ELSE_MATCH_STMT_ITEM, r);
    return r;
  }

  // statement*
  private static boolean elseMatchStmtItem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elseMatchStmtItem_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "elseMatchStmtItem_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // attribute? ENUM ID OPEN_BRACE ID* CLOSE_BRACE
  public static boolean enumItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumItem")) return false;
    if (!nextTokenIs(b, "<enum item>", ENUM, OPEN_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_ITEM, "<enum item>");
    r = enumItem_0(b, l + 1);
    r = r && consumeTokens(b, 0, ENUM, ID, OPEN_BRACE);
    r = r && enumItem_4(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attribute?
  private static boolean enumItem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumItem_0")) return false;
    attribute(b, l + 1);
    return true;
  }

  // ID*
  private static boolean enumItem_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumItem_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, ID)) break;
      if (!empty_element_parsed_guard_(b, "enumItem_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // moduleName? (COMMENT|importModule)* (CH|atomicFileIF)* (
  //                             typeItem      |
  //                             constants     |
  //                             enumItem      |
  //                             interfaceItem |
  //                             unionItem     |
  //                             structItem    |
  //                             fnItem        |
  //                             fileGlobal
  //                             )*
  static boolean file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = file_0(b, l + 1);
    r = r && file_1(b, l + 1);
    r = r && file_2(b, l + 1);
    r = r && file_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // moduleName?
  private static boolean file_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_0")) return false;
    moduleName(b, l + 1);
    return true;
  }

  // (COMMENT|importModule)*
  private static boolean file_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!file_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file_1", c)) break;
    }
    return true;
  }

  // COMMENT|importModule
  private static boolean file_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_1_0")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = importModule(b, l + 1);
    return r;
  }

  // (CH|atomicFileIF)*
  private static boolean file_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!file_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file_2", c)) break;
    }
    return true;
  }

  // CH|atomicFileIF
  private static boolean file_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_2_0")) return false;
    boolean r;
    r = consumeToken(b, CH);
    if (!r) r = atomicFileIF(b, l + 1);
    return r;
  }

  // (
  //                             typeItem      |
  //                             constants     |
  //                             enumItem      |
  //                             interfaceItem |
  //                             unionItem     |
  //                             structItem    |
  //                             fnItem        |
  //                             fileGlobal
  //                             )*
  private static boolean file_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!file_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file_3", c)) break;
    }
    return true;
  }

  // typeItem      |
  //                             constants     |
  //                             enumItem      |
  //                             interfaceItem |
  //                             unionItem     |
  //                             structItem    |
  //                             fnItem        |
  //                             fileGlobal
  private static boolean file_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_3_0")) return false;
    boolean r;
    r = typeItem(b, l + 1);
    if (!r) r = constants(b, l + 1);
    if (!r) r = enumItem(b, l + 1);
    if (!r) r = interfaceItem(b, l + 1);
    if (!r) r = unionItem(b, l + 1);
    if (!r) r = structItem(b, l + 1);
    if (!r) r = fnItem(b, l + 1);
    if (!r) r = fileGlobal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // GLOBAL OPEN structItem_* CLOSE
  public static boolean fileGlobal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fileGlobal")) return false;
    if (!nextTokenIs(b, GLOBAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GLOBAL, OPEN);
    r = r && fileGlobal_2(b, l + 1);
    r = r && consumeToken(b, CLOSE);
    exit_section_(b, m, FILE_GLOBAL, r);
    return r;
  }

  // structItem_*
  private static boolean fileGlobal_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fileGlobal_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!structItem_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fileGlobal_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // attribute? PUB? FN (OPEN arg CLOSE)? ID OPEN (arg ((COMMA arg)*)?)? CLOSE type?
  //     (OPEN_BRACE statement* CLOSE_BRACE)?
  public static boolean fnItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FN_ITEM, "<fn item>");
    r = fnItem_0(b, l + 1);
    r = r && fnItem_1(b, l + 1);
    r = r && consumeToken(b, FN);
    r = r && fnItem_3(b, l + 1);
    r = r && consumeTokens(b, 0, ID, OPEN);
    r = r && fnItem_6(b, l + 1);
    r = r && consumeToken(b, CLOSE);
    r = r && fnItem_8(b, l + 1);
    r = r && fnItem_9(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attribute?
  private static boolean fnItem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnItem_0")) return false;
    attribute(b, l + 1);
    return true;
  }

  // PUB?
  private static boolean fnItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnItem_1")) return false;
    consumeToken(b, PUB);
    return true;
  }

  // (OPEN arg CLOSE)?
  private static boolean fnItem_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnItem_3")) return false;
    fnItem_3_0(b, l + 1);
    return true;
  }

  // OPEN arg CLOSE
  private static boolean fnItem_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnItem_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN);
    r = r && arg(b, l + 1);
    r = r && consumeToken(b, CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (arg ((COMMA arg)*)?)?
  private static boolean fnItem_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnItem_6")) return false;
    fnItem_6_0(b, l + 1);
    return true;
  }

  // arg ((COMMA arg)*)?
  private static boolean fnItem_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnItem_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arg(b, l + 1);
    r = r && fnItem_6_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((COMMA arg)*)?
  private static boolean fnItem_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnItem_6_0_1")) return false;
    fnItem_6_0_1_0(b, l + 1);
    return true;
  }

  // (COMMA arg)*
  private static boolean fnItem_6_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnItem_6_0_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!fnItem_6_0_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fnItem_6_0_1_0", c)) break;
    }
    return true;
  }

  // COMMA arg
  private static boolean fnItem_6_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnItem_6_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type?
  private static boolean fnItem_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnItem_8")) return false;
    type(b, l + 1);
    return true;
  }

  // (OPEN_BRACE statement* CLOSE_BRACE)?
  private static boolean fnItem_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnItem_9")) return false;
    fnItem_9_0(b, l + 1);
    return true;
  }

  // OPEN_BRACE statement* CLOSE_BRACE
  private static boolean fnItem_9_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnItem_9_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && fnItem_9_0_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement*
  private static boolean fnItem_9_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnItem_9_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fnItem_9_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // FOR (expr SEMICOLON expr SEMICOLON expr|expr)?
  //         OPEN_BRACE statement* CLOSE_BRACE
  public static boolean for_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && for_statement_1(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && for_statement_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, FOR_STATEMENT, r);
    return r;
  }

  // (expr SEMICOLON expr SEMICOLON expr|expr)?
  private static boolean for_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_1")) return false;
    for_statement_1_0(b, l + 1);
    return true;
  }

  // expr SEMICOLON expr SEMICOLON expr|expr
  private static boolean for_statement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = for_statement_1_0_0(b, l + 1);
    if (!r) r = expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expr SEMICOLON expr SEMICOLON expr
  private static boolean for_statement_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement*
  private static boolean for_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "for_statement_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // GO expr
  public static boolean go_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "go_statement")) return false;
    if (!nextTokenIs(b, GO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GO);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, GO_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // GOTO ID
  public static boolean goto_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "goto_statement")) return false;
    if (!nextTokenIs(b, GOTO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GOTO, ID);
    exit_section_(b, m, GOTO_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // IF expr OPEN_BRACE statement* CLOSE_BRACE
  //     (ELSE (if_statement|OPEN_BRACE statement* CLOSE_BRACE))?
  public static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && if_statement_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    r = r && if_statement_5(b, l + 1);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  // statement*
  private static boolean if_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_statement_3", c)) break;
    }
    return true;
  }

  // (ELSE (if_statement|OPEN_BRACE statement* CLOSE_BRACE))?
  private static boolean if_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5")) return false;
    if_statement_5_0(b, l + 1);
    return true;
  }

  // ELSE (if_statement|OPEN_BRACE statement* CLOSE_BRACE)
  private static boolean if_statement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && if_statement_5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // if_statement|OPEN_BRACE statement* CLOSE_BRACE
  private static boolean if_statement_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = if_statement(b, l + 1);
    if (!r) r = if_statement_5_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPEN_BRACE statement* CLOSE_BRACE
  private static boolean if_statement_5_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && if_statement_5_0_1_1_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement*
  private static boolean if_statement_5_0_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5_0_1_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_statement_5_0_1_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IMPORT ID ((DOT ID)*)? (AS ID)? (OPEN_BRACE (ID ((COMMA ID)*)?)? CLOSE_BRACE)?
  public static boolean importModule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importModule")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IMPORT, ID);
    r = r && importModule_2(b, l + 1);
    r = r && importModule_3(b, l + 1);
    r = r && importModule_4(b, l + 1);
    exit_section_(b, m, IMPORT_MODULE, r);
    return r;
  }

  // ((DOT ID)*)?
  private static boolean importModule_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importModule_2")) return false;
    importModule_2_0(b, l + 1);
    return true;
  }

  // (DOT ID)*
  private static boolean importModule_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importModule_2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!importModule_2_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "importModule_2_0", c)) break;
    }
    return true;
  }

  // DOT ID
  private static boolean importModule_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importModule_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AS ID)?
  private static boolean importModule_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importModule_3")) return false;
    importModule_3_0(b, l + 1);
    return true;
  }

  // AS ID
  private static boolean importModule_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importModule_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AS, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OPEN_BRACE (ID ((COMMA ID)*)?)? CLOSE_BRACE)?
  private static boolean importModule_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importModule_4")) return false;
    importModule_4_0(b, l + 1);
    return true;
  }

  // OPEN_BRACE (ID ((COMMA ID)*)?)? CLOSE_BRACE
  private static boolean importModule_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importModule_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && importModule_4_0_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ID ((COMMA ID)*)?)?
  private static boolean importModule_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importModule_4_0_1")) return false;
    importModule_4_0_1_0(b, l + 1);
    return true;
  }

  // ID ((COMMA ID)*)?
  private static boolean importModule_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importModule_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && importModule_4_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((COMMA ID)*)?
  private static boolean importModule_4_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importModule_4_0_1_0_1")) return false;
    importModule_4_0_1_0_1_0(b, l + 1);
    return true;
  }

  // (COMMA ID)*
  private static boolean importModule_4_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importModule_4_0_1_0_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!importModule_4_0_1_0_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "importModule_4_0_1_0_1_0", c)) break;
    }
    return true;
  }

  // COMMA ID
  private static boolean importModule_4_0_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importModule_4_0_1_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INTERFACE OPEN_BRACE (ID OPEN (type (COMMA type)*)? type?|ID type) CLOSE_BRACE
  public static boolean interfaceItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceItem")) return false;
    if (!nextTokenIs(b, INTERFACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INTERFACE, OPEN_BRACE);
    r = r && interfaceItem_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, INTERFACE_ITEM, r);
    return r;
  }

  // ID OPEN (type (COMMA type)*)? type?|ID type
  private static boolean interfaceItem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceItem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interfaceItem_2_0(b, l + 1);
    if (!r) r = interfaceItem_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID OPEN (type (COMMA type)*)? type?
  private static boolean interfaceItem_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceItem_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, OPEN);
    r = r && interfaceItem_2_0_2(b, l + 1);
    r = r && interfaceItem_2_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (type (COMMA type)*)?
  private static boolean interfaceItem_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceItem_2_0_2")) return false;
    interfaceItem_2_0_2_0(b, l + 1);
    return true;
  }

  // type (COMMA type)*
  private static boolean interfaceItem_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceItem_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && interfaceItem_2_0_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA type)*
  private static boolean interfaceItem_2_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceItem_2_0_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!interfaceItem_2_0_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interfaceItem_2_0_2_0_1", c)) break;
    }
    return true;
  }

  // COMMA type
  private static boolean interfaceItem_2_0_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceItem_2_0_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type?
  private static boolean interfaceItem_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceItem_2_0_3")) return false;
    type(b, l + 1);
    return true;
  }

  // ID type
  private static boolean interfaceItem_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceItem_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ID COLON
  public static boolean label_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "label_statement")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, COLON);
    exit_section_(b, m, LABEL_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // value_expr COLON expr
  public static boolean mapItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAP_ITEM, "<map item>");
    r = value_expr(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expr OPEN_BRACE expr* CLOSE_BRACE
  public static boolean matchItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATCH_ITEM, "<match item>");
    r = expr(b, l + 1, -1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && matchItem_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expr*
  private static boolean matchItem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchItem_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr(b, l + 1, -1)) break;
      if (!empty_element_parsed_guard_(b, "matchItem_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ID OPEN_BRACE statement* CLOSE_BRACE
  public static boolean matchStmtItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchStmtItem")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, OPEN_BRACE);
    r = r && matchStmtItem_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, MATCH_STMT_ITEM, r);
    return r;
  }

  // statement*
  private static boolean matchStmtItem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchStmtItem_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "matchStmtItem_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // MATCH expr OPEN_BRACE (matchStmtItem)* elseMatchStmtItem CLOSE_BRACE
  public static boolean match_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_statement")) return false;
    if (!nextTokenIs(b, MATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MATCH);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && match_statement_3(b, l + 1);
    r = r && elseMatchStmtItem(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, MATCH_STATEMENT, r);
    return r;
  }

  // (matchStmtItem)*
  private static boolean match_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_statement_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!match_statement_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "match_statement_3", c)) break;
    }
    return true;
  }

  // (matchStmtItem)
  private static boolean match_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchStmtItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MODULE ID
  public static boolean moduleName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleName")) return false;
    if (!nextTokenIs(b, MODULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MODULE, ID);
    exit_section_(b, m, MODULE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // if_statement        |
  //               atomicIF            |
  //               continue_statement  |
  //               break_statement     |
  //               label_statement     |
  //               goto_statement      |
  //               go_statement        |
  //               for_statement       |
  //               match_statement     |
  //               defer_statement     |
  //               Return_statement    |
  //               unaryGroup          |
  //               expr
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = if_statement(b, l + 1);
    if (!r) r = atomicIF(b, l + 1);
    if (!r) r = continue_statement(b, l + 1);
    if (!r) r = break_statement(b, l + 1);
    if (!r) r = label_statement(b, l + 1);
    if (!r) r = goto_statement(b, l + 1);
    if (!r) r = go_statement(b, l + 1);
    if (!r) r = for_statement(b, l + 1);
    if (!r) r = match_statement(b, l + 1);
    if (!r) r = defer_statement(b, l + 1);
    if (!r) r = Return_statement(b, l + 1);
    if (!r) r = unaryGroup(b, l + 1);
    if (!r) r = expr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // attribute? PUB? STRUCT ID OPEN_BRACE (structItem_|ID)* (
  //                 (GLOBAL|PUB? MUTABLE?) COLON structItem_*)* CLOSE_BRACE
  public static boolean structItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_ITEM, "<struct item>");
    r = structItem_0(b, l + 1);
    r = r && structItem_1(b, l + 1);
    r = r && consumeTokens(b, 0, STRUCT, ID, OPEN_BRACE);
    r = r && structItem_5(b, l + 1);
    r = r && structItem_6(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attribute?
  private static boolean structItem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structItem_0")) return false;
    attribute(b, l + 1);
    return true;
  }

  // PUB?
  private static boolean structItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structItem_1")) return false;
    consumeToken(b, PUB);
    return true;
  }

  // (structItem_|ID)*
  private static boolean structItem_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structItem_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!structItem_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "structItem_5", c)) break;
    }
    return true;
  }

  // structItem_|ID
  private static boolean structItem_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structItem_5_0")) return false;
    boolean r;
    r = structItem_(b, l + 1);
    if (!r) r = consumeToken(b, ID);
    return r;
  }

  // (
  //                 (GLOBAL|PUB? MUTABLE?) COLON structItem_*)*
  private static boolean structItem_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structItem_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!structItem_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "structItem_6", c)) break;
    }
    return true;
  }

  // (GLOBAL|PUB? MUTABLE?) COLON structItem_*
  private static boolean structItem_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structItem_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = structItem_6_0_0(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && structItem_6_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // GLOBAL|PUB? MUTABLE?
  private static boolean structItem_6_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structItem_6_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GLOBAL);
    if (!r) r = structItem_6_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PUB? MUTABLE?
  private static boolean structItem_6_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structItem_6_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = structItem_6_0_0_1_0(b, l + 1);
    r = r && structItem_6_0_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PUB?
  private static boolean structItem_6_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structItem_6_0_0_1_0")) return false;
    consumeToken(b, PUB);
    return true;
  }

  // MUTABLE?
  private static boolean structItem_6_0_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structItem_6_0_0_1_1")) return false;
    consumeToken(b, MUTABLE);
    return true;
  }

  // structItem_*
  private static boolean structItem_6_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structItem_6_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!structItem_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "structItem_6_0_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ID (type (ASSIGN expr)?|ASSIGN expr) attribute?
  public static boolean structItem_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structItem_")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && structItem__1(b, l + 1);
    r = r && structItem__2(b, l + 1);
    exit_section_(b, m, STRUCT_ITEM_, r);
    return r;
  }

  // type (ASSIGN expr)?|ASSIGN expr
  private static boolean structItem__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structItem__1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = structItem__1_0(b, l + 1);
    if (!r) r = structItem__1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type (ASSIGN expr)?
  private static boolean structItem__1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structItem__1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && structItem__1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ASSIGN expr)?
  private static boolean structItem__1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structItem__1_0_1")) return false;
    structItem__1_0_1_0(b, l + 1);
    return true;
  }

  // ASSIGN expr
  private static boolean structItem__1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structItem__1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ASSIGN expr
  private static boolean structItem__1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structItem__1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // attribute?
  private static boolean structItem__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structItem__2")) return false;
    attribute(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (ID COLON)? expr
  public static boolean structureCreateItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structureCreateItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCTURE_CREATE_ITEM, "<structure create item>");
    r = structureCreateItem_0(b, l + 1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ID COLON)?
  private static boolean structureCreateItem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structureCreateItem_0")) return false;
    structureCreateItem_0_0(b, l + 1);
    return true;
  }

  // ID COLON
  private static boolean structureCreateItem_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structureCreateItem_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FN OPEN (type ((COMMA type)*)?)? CLOSE type |
  //          OPEN_BRACKET CLOSE_BRACKET type             |
  //          MAP OPEN_BRACKET type CLOSE_BRACKET type    |
  //          OPTION type?                                |
  //          AND type                                    |
  //          ID (DOT ID)*
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = type_0(b, l + 1);
    if (!r) r = type_1(b, l + 1);
    if (!r) r = type_2(b, l + 1);
    if (!r) r = type_3(b, l + 1);
    if (!r) r = type_4(b, l + 1);
    if (!r) r = type_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // FN OPEN (type ((COMMA type)*)?)? CLOSE type
  private static boolean type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FN, OPEN);
    r = r && type_0_2(b, l + 1);
    r = r && consumeToken(b, CLOSE);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (type ((COMMA type)*)?)?
  private static boolean type_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_0_2")) return false;
    type_0_2_0(b, l + 1);
    return true;
  }

  // type ((COMMA type)*)?
  private static boolean type_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && type_0_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((COMMA type)*)?
  private static boolean type_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_0_2_0_1")) return false;
    type_0_2_0_1_0(b, l + 1);
    return true;
  }

  // (COMMA type)*
  private static boolean type_0_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_0_2_0_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_0_2_0_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_0_2_0_1_0", c)) break;
    }
    return true;
  }

  // COMMA type
  private static boolean type_0_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_0_2_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPEN_BRACKET CLOSE_BRACKET type
  private static boolean type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_BRACKET, CLOSE_BRACKET);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MAP OPEN_BRACKET type CLOSE_BRACKET type
  private static boolean type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MAP, OPEN_BRACKET);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPTION type?
  private static boolean type_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPTION);
    r = r && type_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type?
  private static boolean type_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_3_1")) return false;
    type(b, l + 1);
    return true;
  }

  // AND type
  private static boolean type_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID (DOT ID)*
  private static boolean type_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && type_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DOT ID)*
  private static boolean type_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_5_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_5_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_5_1", c)) break;
    }
    return true;
  }

  // DOT ID
  private static boolean type_5_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_5_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TYPE_KW ID ASSIGN expr
  public static boolean typeItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeItem")) return false;
    if (!nextTokenIs(b, TYPE_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPE_KW, ID, ASSIGN);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, TYPE_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // unaryPlus | unaryMinus
  static boolean unaryGroup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryGroup")) return false;
    boolean r;
    r = unaryPlus(b, l + 1);
    if (!r) r = unaryMinus(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // expr MINUS MINUS
  public static boolean unaryMinus(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryMinus")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_MINUS, "<unary minus>");
    r = expr(b, l + 1, -1);
    r = r && consumeTokens(b, 0, MINUS, MINUS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expr PLUS PLUS
  public static boolean unaryPlus(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryPlus")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_PLUS, "<unary plus>");
    r = expr(b, l + 1, -1);
    r = r && consumeTokens(b, 0, PLUS, PLUS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // UNION ID OPEN_BRACE structItem_* CLOSE_BRACE
  public static boolean unionItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unionItem")) return false;
    if (!nextTokenIs(b, UNION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, UNION, ID, OPEN_BRACE);
    r = r && unionItem_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, UNION_ITEM, r);
    return r;
  }

  // structItem_*
  private static boolean unionItem_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unionItem_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!structItem_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "unionItem_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Expression root: expr
  // Operator priority table:
  // 0: BINARY(or_expr)
  // 1: BINARY(and_expr)
  // 2: BINARY(equals_expr)
  // 3: BINARY(not_equals_expr)
  // 4: BINARY(less_equals_expr)
  // 5: BINARY(less_expr)
  // 6: BINARY(grande_equals_expr)
  // 7: BINARY(grande_expr)
  // 8: BINARY(assign_expr)
  // 9: BINARY(plus_assign_expr)
  // 10: BINARY(minus_assign_expr)
  // 11: BINARY(mul_assign_expr)
  // 12: BINARY(div_assign_expr)
  // 13: BINARY(remainder_assign_expr)
  // 14: BINARY(and_assign_expr)
  // 15: BINARY(or_assign_expr)
  // 16: BINARY(xor_assign_expr)
  // 17: BINARY(left_shift_assign_expr)
  // 18: BINARY(right_shift_assign_expr)
  // 19: BINARY(plus_expr)
  // 20: BINARY(minus_expr)
  // 21: BINARY(orb_expr)
  // 22: BINARY(xor_expr)
  // 23: BINARY(mul_expr)
  // 24: BINARY(div_expr)
  // 25: BINARY(remainder_expr)
  // 26: BINARY(left_shift_expr)
  // 27: BINARY(right_shift_expr)
  // 28: BINARY(andb_expr)
  // 29: BINARY(range_expr)
  // 30: PREFIX(paren_expr) ATOM(map_expr) ATOM(map_type_expr) PREFIX(initialize_expr)
  //    ATOM(callFn_expr) ATOM(structureCreate_expr) ATOM(link_expr) POSTFIX(links_expr)
  //    PREFIX(match_expr) ATOM(if_expr) ATOM(fn_expr) ATOM(array_type_expr)
  //    ATOM(array_expr) POSTFIX(option_ignore_expr) POSTFIX(or_optional_expr) BINARY(in_expr)
  //    PREFIX(not_expr) BINARY(access_expr) PREFIX(this_access_expr) PREFIX(heap_expr)
  //    ATOM(value_expr)
  public static boolean expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr")) return false;
    addVariant(b, "<expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = heap_expr(b, l + 1);
    if (!r) r = paren_expr(b, l + 1);
    if (!r) r = map_expr(b, l + 1);
    if (!r) r = map_type_expr(b, l + 1);
    if (!r) r = initialize_expr(b, l + 1);
    if (!r) r = callFn_expr(b, l + 1);
    if (!r) r = structureCreate_expr(b, l + 1);
    if (!r) r = link_expr(b, l + 1);
    if (!r) r = match_expr(b, l + 1);
    if (!r) r = if_expr(b, l + 1);
    if (!r) r = fn_expr(b, l + 1);
    if (!r) r = array_type_expr(b, l + 1);
    if (!r) r = array_expr(b, l + 1);
    if (!r) r = not_expr(b, l + 1);
    if (!r) r = this_access_expr(b, l + 1);
    if (!r) r = value_expr(b, l + 1);
    p = r;
    r = r && expr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && parseTokensSmart(b, 0, OR, OR)) {
        r = expr(b, l, 0);
        exit_section_(b, l, m, OR_EXPR, r, true, null);
      }
      else if (g < 1 && parseTokensSmart(b, 0, AND, AND)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, AND_EXPR, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, EQUALS)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, EQUALS_EXPR, r, true, null);
      }
      else if (g < 3 && consumeTokenSmart(b, NOT_EQUALS)) {
        r = expr(b, l, 3);
        exit_section_(b, l, m, NOT_EQUALS_EXPR, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, LESS_EQUALS)) {
        r = expr(b, l, 4);
        exit_section_(b, l, m, LESS_EQUALS_EXPR, r, true, null);
      }
      else if (g < 5 && consumeTokenSmart(b, LESS)) {
        r = expr(b, l, 5);
        exit_section_(b, l, m, LESS_EXPR, r, true, null);
      }
      else if (g < 6 && consumeTokenSmart(b, GRANDE_EQUALS)) {
        r = expr(b, l, 6);
        exit_section_(b, l, m, GRANDE_EQUALS_EXPR, r, true, null);
      }
      else if (g < 7 && consumeTokenSmart(b, GRANDE)) {
        r = expr(b, l, 7);
        exit_section_(b, l, m, GRANDE_EXPR, r, true, null);
      }
      else if (g < 8 && consumeTokenSmart(b, ASSIGN)) {
        r = expr(b, l, 8);
        exit_section_(b, l, m, ASSIGN_EXPR, r, true, null);
      }
      else if (g < 9 && parseTokensSmart(b, 0, PLUS, ASSIGN)) {
        r = expr(b, l, 9);
        exit_section_(b, l, m, PLUS_ASSIGN_EXPR, r, true, null);
      }
      else if (g < 10 && parseTokensSmart(b, 0, MINUS, ASSIGN)) {
        r = expr(b, l, 10);
        exit_section_(b, l, m, MINUS_ASSIGN_EXPR, r, true, null);
      }
      else if (g < 11 && parseTokensSmart(b, 0, MUL, ASSIGN)) {
        r = expr(b, l, 11);
        exit_section_(b, l, m, MUL_ASSIGN_EXPR, r, true, null);
      }
      else if (g < 12 && parseTokensSmart(b, 0, DIV, ASSIGN)) {
        r = expr(b, l, 12);
        exit_section_(b, l, m, DIV_ASSIGN_EXPR, r, true, null);
      }
      else if (g < 13 && parseTokensSmart(b, 0, REMAINDER, ASSIGN)) {
        r = expr(b, l, 13);
        exit_section_(b, l, m, REMAINDER_ASSIGN_EXPR, r, true, null);
      }
      else if (g < 14 && parseTokensSmart(b, 0, AND, ASSIGN)) {
        r = expr(b, l, 14);
        exit_section_(b, l, m, AND_ASSIGN_EXPR, r, true, null);
      }
      else if (g < 15 && parseTokensSmart(b, 0, OR, ASSIGN)) {
        r = expr(b, l, 15);
        exit_section_(b, l, m, OR_ASSIGN_EXPR, r, true, null);
      }
      else if (g < 16 && parseTokensSmart(b, 0, XOR, ASSIGN)) {
        r = expr(b, l, 16);
        exit_section_(b, l, m, XOR_ASSIGN_EXPR, r, true, null);
      }
      else if (g < 17 && parseTokensSmart(b, 0, LEFT_SHIFT, ASSIGN)) {
        r = expr(b, l, 17);
        exit_section_(b, l, m, LEFT_SHIFT_ASSIGN_EXPR, r, true, null);
      }
      else if (g < 18 && parseTokensSmart(b, 0, RIGHT_SHIFT, ASSIGN)) {
        r = expr(b, l, 18);
        exit_section_(b, l, m, RIGHT_SHIFT_ASSIGN_EXPR, r, true, null);
      }
      else if (g < 19 && consumeTokenSmart(b, PLUS)) {
        r = expr(b, l, 19);
        exit_section_(b, l, m, PLUS_EXPR, r, true, null);
      }
      else if (g < 20 && consumeTokenSmart(b, MINUS)) {
        r = expr(b, l, 20);
        exit_section_(b, l, m, MINUS_EXPR, r, true, null);
      }
      else if (g < 21 && consumeTokenSmart(b, OR)) {
        r = expr(b, l, 21);
        exit_section_(b, l, m, ORB_EXPR, r, true, null);
      }
      else if (g < 22 && consumeTokenSmart(b, XOR)) {
        r = expr(b, l, 22);
        exit_section_(b, l, m, XOR_EXPR, r, true, null);
      }
      else if (g < 23 && consumeTokenSmart(b, MUL)) {
        r = expr(b, l, 23);
        exit_section_(b, l, m, MUL_EXPR, r, true, null);
      }
      else if (g < 24 && consumeTokenSmart(b, DIV)) {
        r = expr(b, l, 24);
        exit_section_(b, l, m, DIV_EXPR, r, true, null);
      }
      else if (g < 25 && consumeTokenSmart(b, REMAINDER)) {
        r = expr(b, l, 25);
        exit_section_(b, l, m, REMAINDER_EXPR, r, true, null);
      }
      else if (g < 26 && consumeTokenSmart(b, LEFT_SHIFT)) {
        r = expr(b, l, 26);
        exit_section_(b, l, m, LEFT_SHIFT_EXPR, r, true, null);
      }
      else if (g < 27 && consumeTokenSmart(b, RIGHT_SHIFT)) {
        r = expr(b, l, 27);
        exit_section_(b, l, m, RIGHT_SHIFT_EXPR, r, true, null);
      }
      else if (g < 28 && consumeTokenSmart(b, AND)) {
        r = expr(b, l, 28);
        exit_section_(b, l, m, ANDB_EXPR, r, true, null);
      }
      else if (g < 29 && parseTokensSmart(b, 0, DOT, DOT)) {
        r = expr(b, l, 29);
        exit_section_(b, l, m, RANGE_EXPR, r, true, null);
      }
      else if (g < 30 && leftMarkerIs(b, LINK_EXPR) && links_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, LINKS_EXPR, r, true, null);
      }
      else if (g < 30 && consumeTokenSmart(b, OPTION)) {
        r = true;
        exit_section_(b, l, m, OPTION_IGNORE_EXPR, r, true, null);
      }
      else if (g < 30 && or_optional_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, OR_OPTIONAL_EXPR, r, true, null);
      }
      else if (g < 30 && in_expr_0(b, l + 1)) {
        r = expr(b, l, 30);
        exit_section_(b, l, m, IN_EXPR, r, true, null);
      }
      else if (g < 30 && consumeTokenSmart(b, DOT)) {
        r = expr(b, l, 30);
        exit_section_(b, l, m, ACCESS_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  public static boolean heap_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "heap_expr")) return false;
    if (!nextTokenIsSmart(b, AND)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, AND);
    p = r;
    r = p && expr(b, l, -1);
    exit_section_(b, l, m, HEAP_EXPR, r, p, null);
    return r || p;
  }

  public static boolean paren_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr")) return false;
    if (!nextTokenIsSmart(b, OPEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, OPEN);
    p = r;
    r = p && expr(b, l, -1);
    r = p && report_error_(b, consumeToken(b, CLOSE)) && r;
    exit_section_(b, l, m, PAREN_EXPR, r, p, null);
    return r || p;
  }

  // MAP OPEN_BRACE (mapItem*)? CLOSE_BRACE
  public static boolean map_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_expr")) return false;
    if (!nextTokenIsSmart(b, MAP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, MAP, OPEN_BRACE);
    r = r && map_expr_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, MAP_EXPR, r);
    return r;
  }

  // (mapItem*)?
  private static boolean map_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_expr_2")) return false;
    map_expr_2_0(b, l + 1);
    return true;
  }

  // mapItem*
  private static boolean map_expr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_expr_2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!mapItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "map_expr_2_0", c)) break;
    }
    return true;
  }

  // MAP OPEN_BRACKET type CLOSE_BRACKET type OPEN_BRACE (mapItem*)? CLOSE_BRACE
  public static boolean map_type_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_type_expr")) return false;
    if (!nextTokenIsSmart(b, MAP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, MAP, OPEN_BRACKET);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && map_type_expr_6(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, MAP_TYPE_EXPR, r);
    return r;
  }

  // (mapItem*)?
  private static boolean map_type_expr_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_type_expr_6")) return false;
    map_type_expr_6_0(b, l + 1);
    return true;
  }

  // mapItem*
  private static boolean map_type_expr_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_type_expr_6_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!mapItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "map_type_expr_6_0", c)) break;
    }
    return true;
  }

  public static boolean initialize_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initialize_expr")) return false;
    if (!nextTokenIsSmart(b, ID, MUTABLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = initialize_expr_0(b, l + 1);
    p = r;
    r = p && expr(b, l, -1);
    exit_section_(b, l, m, INITIALIZE_EXPR, r, p, null);
    return r || p;
  }

  // MUTABLE? ID INITIAL
  private static boolean initialize_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initialize_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = initialize_expr_0_0(b, l + 1);
    r = r && consumeTokensSmart(b, 0, ID, INITIAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // MUTABLE?
  private static boolean initialize_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initialize_expr_0_0")) return false;
    consumeTokenSmart(b, MUTABLE);
    return true;
  }

  // ID OPEN callFn_struct (expr (COMMA expr)*)? CLOSE
  public static boolean callFn_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callFn_expr")) return false;
    if (!nextTokenIsSmart(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, ID, OPEN);
    r = r && callFn_struct(b, l + 1);
    r = r && callFn_expr_3(b, l + 1);
    r = r && consumeToken(b, CLOSE);
    exit_section_(b, m, CALL_FN_EXPR, r);
    return r;
  }

  // (expr (COMMA expr)*)?
  private static boolean callFn_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callFn_expr_3")) return false;
    callFn_expr_3_0(b, l + 1);
    return true;
  }

  // expr (COMMA expr)*
  private static boolean callFn_expr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callFn_expr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && callFn_expr_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA expr)*
  private static boolean callFn_expr_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callFn_expr_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!callFn_expr_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "callFn_expr_3_0_1", c)) break;
    }
    return true;
  }

  // COMMA expr
  private static boolean callFn_expr_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callFn_expr_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID OPEN_BRACE (structureCreateItem*)? CLOSE_BRACE
  public static boolean structureCreate_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structureCreate_expr")) return false;
    if (!nextTokenIsSmart(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, ID, OPEN_BRACE);
    r = r && structureCreate_expr_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, STRUCTURE_CREATE_EXPR, r);
    return r;
  }

  // (structureCreateItem*)?
  private static boolean structureCreate_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structureCreate_expr_2")) return false;
    structureCreate_expr_2_0(b, l + 1);
    return true;
  }

  // structureCreateItem*
  private static boolean structureCreate_expr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structureCreate_expr_2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!structureCreateItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "structureCreate_expr_2_0", c)) break;
    }
    return true;
  }

  // ID
  public static boolean link_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "link_expr")) return false;
    if (!nextTokenIsSmart(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, ID);
    exit_section_(b, m, LINK_EXPR, r);
    return r;
  }

  // (COMMA link_expr)*
  private static boolean links_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "links_expr_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!links_expr_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "links_expr_0", c)) break;
    }
    return true;
  }

  // COMMA link_expr
  private static boolean links_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "links_expr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && link_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean match_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_expr")) return false;
    if (!nextTokenIsSmart(b, MATCH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, MATCH);
    p = r;
    r = p && expr(b, l, -1);
    r = p && report_error_(b, match_expr_1(b, l + 1)) && r;
    exit_section_(b, l, m, MATCH_EXPR, r, p, null);
    return r || p;
  }

  // OPEN_BRACE (matchItem)* elseMatchItem CLOSE_BRACE
  private static boolean match_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && match_expr_1_1(b, l + 1);
    r = r && elseMatchItem(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (matchItem)*
  private static boolean match_expr_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_expr_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!match_expr_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "match_expr_1_1", c)) break;
    }
    return true;
  }

  // (matchItem)
  private static boolean match_expr_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_expr_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IF expr OPEN_BRACE expr* CLOSE_BRACE (ELSE (if_expr|OPEN_BRACE expr* CLOSE_BRACE))?
  public static boolean if_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr")) return false;
    if (!nextTokenIsSmart(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, IF);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && if_expr_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    r = r && if_expr_5(b, l + 1);
    exit_section_(b, m, IF_EXPR, r);
    return r;
  }

  // expr*
  private static boolean if_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr(b, l + 1, -1)) break;
      if (!empty_element_parsed_guard_(b, "if_expr_3", c)) break;
    }
    return true;
  }

  // (ELSE (if_expr|OPEN_BRACE expr* CLOSE_BRACE))?
  private static boolean if_expr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr_5")) return false;
    if_expr_5_0(b, l + 1);
    return true;
  }

  // ELSE (if_expr|OPEN_BRACE expr* CLOSE_BRACE)
  private static boolean if_expr_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, ELSE);
    r = r && if_expr_5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // if_expr|OPEN_BRACE expr* CLOSE_BRACE
  private static boolean if_expr_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr_5_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = if_expr(b, l + 1);
    if (!r) r = if_expr_5_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPEN_BRACE expr* CLOSE_BRACE
  private static boolean if_expr_5_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr_5_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, OPEN_BRACE);
    r = r && if_expr_5_0_1_1_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // expr*
  private static boolean if_expr_5_0_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr_5_0_1_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr(b, l + 1, -1)) break;
      if (!empty_element_parsed_guard_(b, "if_expr_5_0_1_1_1", c)) break;
    }
    return true;
  }

  // FN ID OPEN (arg ((COMMA arg)*)?)? CLOSE type? OPEN_BRACE statement* CLOSE_BRACE
  public static boolean fn_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_expr")) return false;
    if (!nextTokenIsSmart(b, FN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, FN, ID, OPEN);
    r = r && fn_expr_3(b, l + 1);
    r = r && consumeToken(b, CLOSE);
    r = r && fn_expr_5(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && fn_expr_7(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, FN_EXPR, r);
    return r;
  }

  // (arg ((COMMA arg)*)?)?
  private static boolean fn_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_expr_3")) return false;
    fn_expr_3_0(b, l + 1);
    return true;
  }

  // arg ((COMMA arg)*)?
  private static boolean fn_expr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_expr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arg(b, l + 1);
    r = r && fn_expr_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((COMMA arg)*)?
  private static boolean fn_expr_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_expr_3_0_1")) return false;
    fn_expr_3_0_1_0(b, l + 1);
    return true;
  }

  // (COMMA arg)*
  private static boolean fn_expr_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_expr_3_0_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!fn_expr_3_0_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fn_expr_3_0_1_0", c)) break;
    }
    return true;
  }

  // COMMA arg
  private static boolean fn_expr_3_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_expr_3_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type?
  private static boolean fn_expr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_expr_5")) return false;
    type(b, l + 1);
    return true;
  }

  // statement*
  private static boolean fn_expr_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_expr_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fn_expr_7", c)) break;
    }
    return true;
  }

  // OPEN_BRACKET NUMBER? CLOSE_BRACKET type OPEN_BRACE (expr ((COMMA expr)*)?)? CLOSE_BRACE
  public static boolean array_type_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_expr")) return false;
    if (!nextTokenIsSmart(b, OPEN_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, OPEN_BRACKET);
    r = r && array_type_expr_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && array_type_expr_5(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, ARRAY_TYPE_EXPR, r);
    return r;
  }

  // NUMBER?
  private static boolean array_type_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_expr_1")) return false;
    consumeTokenSmart(b, NUMBER);
    return true;
  }

  // (expr ((COMMA expr)*)?)?
  private static boolean array_type_expr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_expr_5")) return false;
    array_type_expr_5_0(b, l + 1);
    return true;
  }

  // expr ((COMMA expr)*)?
  private static boolean array_type_expr_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_expr_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && array_type_expr_5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((COMMA expr)*)?
  private static boolean array_type_expr_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_expr_5_0_1")) return false;
    array_type_expr_5_0_1_0(b, l + 1);
    return true;
  }

  // (COMMA expr)*
  private static boolean array_type_expr_5_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_expr_5_0_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!array_type_expr_5_0_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_type_expr_5_0_1_0", c)) break;
    }
    return true;
  }

  // COMMA expr
  private static boolean array_type_expr_5_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_expr_5_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPEN_BRACKET (expr ((COMMA expr)*)?)? CLOSE_BRACKET
  public static boolean array_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expr")) return false;
    if (!nextTokenIsSmart(b, OPEN_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, OPEN_BRACKET);
    r = r && array_expr_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, ARRAY_EXPR, r);
    return r;
  }

  // (expr ((COMMA expr)*)?)?
  private static boolean array_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expr_1")) return false;
    array_expr_1_0(b, l + 1);
    return true;
  }

  // expr ((COMMA expr)*)?
  private static boolean array_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && array_expr_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((COMMA expr)*)?
  private static boolean array_expr_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expr_1_0_1")) return false;
    array_expr_1_0_1_0(b, l + 1);
    return true;
  }

  // (COMMA expr)*
  private static boolean array_expr_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expr_1_0_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!array_expr_1_0_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_expr_1_0_1_0", c)) break;
    }
    return true;
  }

  // COMMA expr
  private static boolean array_expr_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expr_1_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OR OPEN_BRACE statement* CLOSE_BRACKET
  private static boolean or_optional_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_optional_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, OR, OPEN_BRACE);
    r = r && or_optional_expr_0_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement*
  private static boolean or_optional_expr_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_optional_expr_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "or_optional_expr_0_2", c)) break;
    }
    return true;
  }

  // NOT? IN
  private static boolean in_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "in_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = in_expr_0_0(b, l + 1);
    r = r && consumeToken(b, IN);
    exit_section_(b, m, null, r);
    return r;
  }

  // NOT?
  private static boolean in_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "in_expr_0_0")) return false;
    consumeTokenSmart(b, NOT);
    return true;
  }

  public static boolean not_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_expr")) return false;
    if (!nextTokenIsSmart(b, NOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, NOT);
    p = r;
    r = p && expr(b, l, -1);
    exit_section_(b, l, m, NOT_EXPR, r, p, null);
    return r || p;
  }

  public static boolean this_access_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "this_access_expr")) return false;
    if (!nextTokenIsSmart(b, DOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, DOT);
    p = r;
    r = p && expr(b, l, -1);
    exit_section_(b, l, m, THIS_ACCESS_EXPR, r, p, null);
    return r || p;
  }

  // NUMBER|FLOAT|STRING|CHAR|BOOL|NONE
  public static boolean value_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_EXPR, "<value expr>");
    r = consumeTokenSmart(b, NUMBER);
    if (!r) r = consumeTokenSmart(b, FLOAT);
    if (!r) r = consumeTokenSmart(b, STRING);
    if (!r) r = consumeTokenSmart(b, CHAR);
    if (!r) r = consumeTokenSmart(b, BOOL);
    if (!r) r = consumeTokenSmart(b, NONE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
