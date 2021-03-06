/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package ru.levkopo.vlangPlugin.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import ru.levkopo.vlangPlugin.parser.psi.VLangTypes;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>v.flex</tt>
 */
class VLangLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int WAITING_VALUE = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [12, 6, 3]
   * Total runtime size is 15632 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>9]<<6)|((ch>>3)&0x3f)]<<3)|(ch&0x7)];
  }

  /* The ZZ_CMAP_Z table has 2176 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
    "\20\1\21\1\22\3\21\1\23\1\24\1\25\1\21\14\26\1\27\50\26\1\30\2\26\1\31\1\32"+
    "\1\33\1\34\25\26\1\35\20\21\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1"+
    "\47\1\50\1\21\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\21\1\26\1\60\1\61\5\21"+
    "\2\26\1\62\7\21\1\26\1\63\20\21\1\26\1\64\1\21\1\65\13\26\1\66\1\26\1\67\22"+
    "\21\1\70\5\21\1\71\11\21\1\72\1\73\1\74\1\75\1\21\1\76\2\21\1\77\3\21\1\100"+
    "\2\21\1\101\1\102\7\21\123\26\1\103\7\26\1\104\1\105\12\26\1\106\24\21\1\26"+
    "\1\107\u0582\21\1\110\u017f\21");

  /* The ZZ_CMAP_Y table has 4672 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\2\0\1\2\1\3\1\4\1\5\1\6\2\7\1\10\1\11\1\12\1\13\1\14\1\15\4\0\1\16"+
    "\1\17\1\16\2\7\1\20\3\7\1\20\71\7\1\21\1\7\1\22\1\0\1\23\1\24\2\0\16\7\1\25"+
    "\1\26\1\27\1\30\2\7\1\31\11\7\1\32\21\7\1\31\25\7\1\6\3\7\1\20\1\33\1\6\4"+
    "\7\1\0\1\6\4\7\1\32\1\34\1\0\3\7\2\35\3\0\1\7\1\35\10\7\1\4\1\36\14\7\1\37"+
    "\1\40\1\7\1\41\1\4\1\42\2\0\7\7\1\43\14\7\1\22\1\0\1\4\1\44\4\7\1\45\1\16"+
    "\5\7\1\45\2\0\3\7\1\46\10\0\2\7\1\25\1\45\2\0\1\47\1\7\1\31\17\7\1\50\1\4"+
    "\1\6\1\7\1\37\1\40\1\51\2\7\1\41\1\52\1\53\1\40\1\54\1\55\1\56\1\50\1\4\1"+
    "\22\1\0\1\57\1\60\1\51\2\7\1\41\1\61\1\62\1\60\1\63\1\33\1\64\1\65\1\4\1\45"+
    "\1\0\1\57\1\32\1\31\2\7\1\41\1\66\1\53\1\32\1\67\1\70\1\0\1\50\1\4\1\0\1\33"+
    "\1\57\1\40\1\51\2\7\1\41\1\66\1\53\1\40\1\63\1\71\1\56\1\50\1\4\1\33\1\0\1"+
    "\72\1\73\1\74\1\75\1\76\1\73\1\7\1\21\1\73\1\74\1\77\1\0\1\65\1\4\2\0\1\37"+
    "\1\25\1\41\2\7\1\41\1\7\1\100\1\25\1\74\1\101\1\35\1\50\1\4\2\0\1\37\1\25"+
    "\1\41\2\7\1\41\1\37\1\53\1\25\1\74\1\101\1\27\1\50\1\4\1\102\1\0\1\57\1\25"+
    "\1\41\4\7\1\43\1\25\1\103\1\47\1\55\1\50\1\4\1\0\1\104\1\72\1\7\1\20\1\104"+
    "\2\7\1\31\1\105\1\20\1\106\1\107\1\7\1\65\1\4\1\110\1\0\1\6\6\7\1\35\1\7\1"+
    "\20\1\4\1\111\4\0\1\112\1\113\1\47\1\6\1\114\1\72\1\7\1\67\1\107\1\45\1\4"+
    "\1\115\4\0\1\70\2\0\1\22\1\4\1\111\1\116\1\117\1\7\1\6\3\7\1\23\1\6\1\7\1"+
    "\25\2\7\1\6\3\7\1\23\1\27\7\0\10\7\1\4\1\111\10\7\1\4\1\120\4\7\1\32\1\17"+
    "\5\7\1\121\51\7\1\74\1\20\1\74\5\7\1\74\4\7\1\74\1\20\1\74\1\7\1\20\7\7\1"+
    "\74\10\7\1\43\4\0\2\7\2\0\12\7\2\45\1\6\114\7\1\40\2\7\1\6\2\7\1\35\11\7\1"+
    "\73\1\7\1\70\1\7\1\25\1\23\1\0\2\7\1\23\1\0\2\7\1\46\1\0\1\7\1\25\1\122\1"+
    "\0\12\7\1\123\1\124\1\4\1\111\3\0\1\125\1\4\1\111\13\7\1\0\5\7\1\35\10\7\1"+
    "\45\1\0\3\7\1\20\1\7\1\46\1\7\1\46\1\65\1\4\3\7\1\45\1\23\1\0\5\7\1\46\3\7"+
    "\1\22\1\4\1\111\4\0\3\7\1\46\7\7\1\20\3\7\1\40\1\4\1\111\1\4\1\111\1\55\1"+
    "\0\1\7\1\20\10\0\11\7\1\46\1\4\1\111\1\0\1\126\1\46\1\0\6\7\1\4\1\44\6\7\1"+
    "\46\1\0\7\7\1\0\1\4\1\127\1\4\1\44\3\7\1\45\1\7\1\70\10\0\1\121\3\7\1\20\1"+
    "\22\36\7\1\45\1\126\42\7\2\45\4\7\2\45\1\7\1\130\3\7\1\45\6\7\1\25\1\107\1"+
    "\131\1\23\1\132\1\46\1\7\1\23\1\131\1\23\5\0\1\133\1\0\1\55\1\70\1\0\1\134"+
    "\3\0\1\33\1\55\2\0\1\7\1\23\6\0\4\7\1\70\1\0\1\106\1\104\1\105\1\135\1\24"+
    "\1\136\1\7\1\53\1\137\1\140\2\0\5\7\1\70\144\0\1\71\6\7\1\22\42\0\5\7\1\20"+
    "\5\7\1\20\20\7\1\23\1\126\1\46\1\0\4\7\1\32\1\17\7\7\1\55\1\0\1\55\2\7\1\20"+
    "\1\0\10\20\4\7\5\0\1\55\72\0\1\137\3\0\1\6\1\7\1\135\1\23\1\6\11\7\1\20\1"+
    "\141\1\6\12\7\1\121\1\137\4\7\1\45\1\6\12\7\1\20\2\0\3\7\1\35\6\0\170\7\1"+
    "\45\11\0\72\7\1\45\5\0\21\7\1\23\10\0\5\7\1\45\41\7\1\23\2\7\1\4\1\142\2\0"+
    "\6\7\1\121\1\32\16\7\1\22\3\0\1\55\1\7\1\104\14\7\1\51\3\7\1\20\1\7\7\0\1"+
    "\55\6\7\3\0\6\7\1\46\1\0\10\7\1\45\1\0\1\4\1\111\3\7\1\143\1\4\1\44\3\7\1"+
    "\45\4\7\1\46\1\0\3\7\1\23\10\7\1\70\1\55\1\4\1\111\2\7\1\4\1\144\6\7\1\20"+
    "\1\0\1\7\1\45\1\4\1\111\2\7\1\20\1\104\10\7\1\35\2\0\1\125\2\7\1\145\1\0\3"+
    "\146\1\0\2\20\5\7\1\121\1\45\1\0\17\7\1\147\1\4\1\111\64\7\1\46\1\0\2\7\1"+
    "\20\1\126\5\7\1\46\40\0\55\7\1\45\15\7\1\22\4\0\1\20\1\0\1\126\1\137\1\7\1"+
    "\41\1\20\1\107\1\150\15\7\1\22\3\0\1\126\54\7\1\45\2\0\10\7\1\104\6\7\5\0"+
    "\1\7\1\46\2\7\2\0\2\7\1\76\2\0\1\137\4\0\1\25\20\7\1\23\2\0\1\4\1\111\1\6"+
    "\2\7\1\60\1\6\2\7\1\35\1\71\12\7\1\20\3\104\1\151\4\0\1\7\1\37\2\7\1\20\2"+
    "\7\1\152\1\7\1\45\1\7\1\45\4\0\17\7\1\35\10\0\6\7\1\23\20\0\1\17\20\0\3\7"+
    "\1\23\6\7\1\70\1\0\1\70\3\0\4\7\2\0\3\7\1\35\5\7\1\35\3\7\1\45\4\7\1\46\1"+
    "\7\1\135\5\0\23\7\1\45\1\4\1\111\4\7\1\46\4\7\1\46\5\7\1\0\6\7\1\46\23\0\46"+
    "\7\1\20\1\0\2\7\1\45\1\0\1\7\23\0\1\45\1\41\4\7\1\32\1\153\2\7\1\45\1\0\2"+
    "\7\1\20\1\0\3\7\1\20\10\0\2\7\1\147\1\0\2\7\1\45\1\0\3\7\1\22\10\0\7\7\1\71"+
    "\10\0\1\154\1\47\1\37\1\6\2\7\1\46\1\60\4\0\3\7\1\23\3\7\1\23\4\0\1\7\1\6"+
    "\2\7\1\20\3\0\6\7\1\45\1\0\2\7\1\45\1\0\2\7\1\35\1\0\2\7\1\22\15\0\11\7\1"+
    "\70\6\0\6\7\1\35\1\0\6\7\1\35\41\0\10\7\1\20\3\0\1\65\1\4\1\0\1\55\7\7\1\35"+
    "\2\0\3\7\1\70\1\4\1\111\6\7\1\155\1\4\2\0\4\7\1\156\1\0\10\7\1\23\1\151\1"+
    "\4\1\157\4\0\2\7\1\31\4\7\1\27\10\0\1\20\1\136\1\7\1\32\1\7\1\70\7\7\1\35"+
    "\1\4\1\111\1\37\1\40\1\51\2\7\1\41\1\66\1\53\1\40\1\63\1\77\1\137\1\132\2"+
    "\23\21\0\11\7\1\35\1\4\1\111\4\0\10\7\1\32\1\0\1\4\1\111\24\0\6\7\1\45\1\7"+
    "\1\70\2\0\1\45\4\0\10\7\1\160\1\0\1\4\1\111\4\0\7\7\1\0\1\4\1\111\6\0\3\7"+
    "\1\100\1\7\1\46\1\4\1\111\54\0\10\7\1\4\1\111\1\0\1\55\70\0\7\7\1\70\40\0"+
    "\1\7\1\41\4\7\1\20\1\7\1\70\1\0\1\4\1\111\2\0\1\104\3\7\1\104\2\7\1\6\1\20"+
    "\51\0\63\7\1\22\14\0\15\7\1\20\2\0\30\7\1\46\27\0\5\7\1\20\72\0\10\7\1\20"+
    "\67\0\7\7\1\70\3\7\1\20\1\4\1\111\14\0\3\7\1\45\1\23\1\0\6\7\1\20\1\0\1\46"+
    "\1\0\1\4\1\111\1\126\2\7\1\137\2\7\56\0\10\7\1\23\1\0\5\7\1\20\1\0\1\55\2"+
    "\7\10\0\1\70\3\0\75\7\1\23\2\0\36\7\1\35\41\0\1\22\77\0\15\7\1\35\1\7\1\23"+
    "\1\7\1\70\1\7\1\161\130\0\1\137\1\100\1\35\1\126\1\43\1\46\3\0\1\162\22\0"+
    "\1\151\67\0\12\7\1\25\10\7\1\25\1\163\1\164\1\7\1\165\1\37\7\7\1\32\1\43\2"+
    "\25\3\7\1\166\1\107\1\104\1\41\51\7\1\45\3\7\1\41\2\7\1\121\3\7\1\121\2\7"+
    "\1\25\3\7\1\25\2\7\1\20\3\7\1\20\3\7\1\41\3\7\1\41\2\7\1\121\1\50\6\4\6\7"+
    "\1\20\1\126\5\7\1\23\1\17\1\0\1\134\2\0\1\126\1\6\1\7\52\0\1\20\2\7\1\51\1"+
    "\150\1\35\72\0\30\7\1\23\1\0\1\20\5\0\11\7\1\35\1\4\1\111\24\0\1\37\3\7\1"+
    "\112\1\6\1\121\1\167\1\106\1\170\1\112\1\130\1\112\2\121\1\64\1\7\1\31\1\7"+
    "\1\46\1\57\1\31\1\7\1\46\116\0\3\7\1\22\3\7\1\22\3\7\1\22\16\0\32\7\1\20\5"+
    "\0\106\7\1\23\1\0\33\7\1\45\120\7\1\22\53\0\3\7\1\45\134\0\36\7\2\0");

  /* The ZZ_CMAP_A table has 968 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\2\2\1\1\2\2\0\1\3\1\53\1\64\1\5\1\62\1\61\1\56\1\63\1\41\1\43"+
    "\1\44\1\45\1\50\1\46\1\47\1\4\12\66\1\52\1\42\1\54\1\6\1\55\1\51\1\0\22\67"+
    "\1\37\1\0\1\40\1\60\1\34\1\65\1\24\1\27\1\21\1\11\1\14\1\26\1\31\1\25\1\15"+
    "\1\67\1\33\1\13\1\7\1\22\1\10\1\16\1\32\1\17\1\23\1\20\1\12\3\67\1\30\1\67"+
    "\1\35\1\57\1\36\7\0\1\1\4\0\1\67\12\0\1\67\2\0\7\67\1\0\2\67\4\0\4\67\6\0"+
    "\5\67\7\0\1\67\1\0\1\67\1\0\5\67\1\0\2\67\2\0\4\67\1\0\1\67\6\0\1\67\1\0\3"+
    "\67\1\0\1\67\1\0\4\67\1\0\13\67\1\0\1\67\1\0\1\67\7\0\2\67\1\0\2\67\1\0\4"+
    "\67\5\0\2\66\4\0\6\67\1\0\10\67\2\0\2\67\1\0\6\67\2\66\3\67\2\0\4\67\2\0\3"+
    "\67\2\66\14\67\2\0\4\67\10\0\10\67\2\0\2\66\1\67\2\0\6\67\1\0\1\67\3\0\4\67"+
    "\2\0\5\67\2\0\4\67\10\0\1\67\4\0\2\67\1\0\1\67\1\0\3\67\1\0\6\67\4\0\2\67"+
    "\1\0\2\67\1\0\2\67\1\0\2\67\2\0\1\67\1\0\3\67\2\0\3\67\3\0\4\67\1\0\1\67\7"+
    "\0\2\66\1\67\1\0\2\67\1\0\5\67\1\0\3\67\2\0\1\67\15\0\2\67\2\0\2\67\1\0\6"+
    "\67\3\0\3\67\1\0\4\67\3\0\2\67\1\0\1\67\1\0\2\67\3\0\2\67\3\0\1\67\6\0\3\67"+
    "\3\0\3\67\5\0\2\67\2\0\2\67\5\0\1\67\1\0\5\67\3\0\12\67\1\0\1\67\4\0\1\67"+
    "\4\0\6\67\1\0\1\67\3\0\2\67\4\0\2\66\7\0\2\67\1\0\1\67\2\0\2\67\1\0\1\67\2"+
    "\0\1\67\3\0\3\67\1\0\1\67\1\0\1\67\2\66\2\0\4\67\5\0\1\67\1\0\1\67\1\0\1\67"+
    "\4\0\2\67\2\66\4\67\2\0\3\67\1\0\5\67\1\0\2\67\4\0\4\67\3\0\1\67\4\0\2\67"+
    "\5\0\3\67\5\0\5\67\2\66\3\0\3\67\1\0\1\67\1\0\1\67\1\0\1\67\1\0\1\67\2\0\3"+
    "\67\1\0\6\67\2\0\2\67\2\1\12\0\1\67\4\0\5\67\2\0\1\67\1\0\4\67\1\0\1\67\5"+
    "\0\5\67\4\0\1\67\2\0\2\67\2\0\3\67\2\66\2\67\7\0\1\67\1\0\1\67\2\0\2\66\5"+
    "\67\3\0\5\67\2\0\6\67\1\0\3\67\1\0\2\67\2\0\2\67\1\0\2\67\1\0\2\67\2\0\3\67"+
    "\3\0\3\67\1\0\2\67\1\0\2\67\3\0\1\67\2\0\5\67\1\0\2\67\1\0\5\67\1\0\2\66\4"+
    "\67\2\0\1\67\1\0\2\66\1\67\1\0\1\67\3\0\1\67\3\0\1\67\3\0\2\67\3\0\2\67\3"+
    "\0\4\67\4\0\1\67\2\0\2\67\2\0\4\67\1\0\4\67\1\0\1\67\1\0\5\67\1\0\4\67\2\0"+
    "\1\67\1\0\1\67\5\0\1\67\1\0\1\67\1\0\3\67");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\22\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\3\1\1\35\1\3"+
    "\1\36\1\37\3\6\1\31\5\6\1\40\1\41\7\6"+
    "\1\42\1\6\1\43\2\6\1\44\1\6\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\0\1\53\1\0\1\53"+
    "\2\0\1\6\1\54\1\55\10\6\1\56\7\6\1\57"+
    "\4\6\1\60\1\61\5\6\1\62\1\63\4\6\1\64"+
    "\1\65\2\6\1\66\2\6\1\67\2\6\1\70\1\71"+
    "\1\72\6\6\1\73\1\6\1\74\1\6\1\75\1\76"+
    "\1\77\1\6\1\100\2\6\1\101\7\6\1\102\1\103"+
    "\1\104\1\105";

  private static int [] zzUnpackAction() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\70\0\160\0\250\0\340\0\u0118\0\u0150\0\u0188"+
    "\0\u01c0\0\u01f8\0\u0230\0\u0268\0\u02a0\0\u02d8\0\u0310\0\u0348"+
    "\0\u0380\0\u03b8\0\u03f0\0\u0428\0\u0460\0\u0498\0\u04d0\0\u0508"+
    "\0\u0540\0\160\0\160\0\160\0\160\0\160\0\160\0\160"+
    "\0\160\0\160\0\160\0\160\0\160\0\160\0\u0578\0\u05b0"+
    "\0\u05e8\0\u0620\0\160\0\160\0\160\0\160\0\160\0\u0658"+
    "\0\u0690\0\u06c8\0\u0700\0\160\0\u0738\0\160\0\u0770\0\u07a8"+
    "\0\u07e0\0\u0268\0\u0818\0\u0850\0\u0888\0\u08c0\0\u08f8\0\u0930"+
    "\0\u0268\0\u0968\0\u09a0\0\u09d8\0\u0a10\0\u0a48\0\u0a80\0\u0ab8"+
    "\0\u0268\0\u0af0\0\u0268\0\u0b28\0\u0b60\0\u0b98\0\u0bd0\0\160"+
    "\0\160\0\160\0\160\0\160\0\160\0\u0658\0\u0658\0\u0690"+
    "\0\u0690\0\u0c08\0\u0c40\0\u0c78\0\u0268\0\u0268\0\u0cb0\0\u0ce8"+
    "\0\u0d20\0\u0d58\0\u0d90\0\u0dc8\0\u0e00\0\u0e38\0\u0268\0\u0e70"+
    "\0\u0ea8\0\u0ee0\0\u0f18\0\u0f50\0\u0f88\0\u0fc0\0\u0268\0\u0ff8"+
    "\0\u1030\0\u1068\0\u10a0\0\160\0\u0c40\0\u10d8\0\u1110\0\u1148"+
    "\0\u1180\0\u11b8\0\u0268\0\u0268\0\u11f0\0\u1228\0\u1260\0\u1298"+
    "\0\u0268\0\u0268\0\u12d0\0\u1308\0\u0268\0\u1340\0\u1378\0\u0268"+
    "\0\u13b0\0\u13e8\0\u0268\0\u0268\0\u0268\0\u1420\0\u1458\0\u1490"+
    "\0\u14c8\0\u1500\0\u1538\0\u0268\0\u1570\0\u0268\0\u15a8\0\u0268"+
    "\0\u0268\0\u0268\0\u15e0\0\u0268\0\u1618\0\u1650\0\u0268\0\u1688"+
    "\0\u16c0\0\u16f8\0\u1730\0\u1768\0\u17a0\0\u17d8\0\u0268\0\u0268"+
    "\0\u0268\0\u0268";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\3\4\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\14\1\26\1\27\1\14\1\30"+
    "\2\14\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
    "\1\60\1\61\1\62\1\63\1\14\1\3\3\4\1\64"+
    "\1\3\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\14\1\26\1\27\1\14\1\30\2\14\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62"+
    "\1\63\1\14\71\0\3\4\70\0\1\65\63\0\2\6"+
    "\1\0\65\6\6\0\1\66\70\0\1\14\1\67\1\14"+
    "\1\70\11\14\1\71\10\14\31\0\2\14\7\0\10\14"+
    "\1\72\15\14\31\0\2\14\7\0\5\14\1\73\20\14"+
    "\31\0\2\14\7\0\13\14\1\74\12\14\31\0\2\14"+
    "\7\0\26\14\31\0\2\14\7\0\4\14\1\75\6\14"+
    "\1\76\12\14\31\0\2\14\7\0\1\77\12\14\1\100"+
    "\3\14\1\101\6\14\31\0\2\14\7\0\3\14\1\102"+
    "\22\14\31\0\2\14\7\0\5\14\1\103\20\14\31\0"+
    "\2\14\7\0\10\14\1\104\10\14\1\105\4\14\31\0"+
    "\2\14\7\0\1\14\1\106\24\14\31\0\2\14\7\0"+
    "\1\14\1\107\24\14\31\0\2\14\7\0\11\14\1\110"+
    "\14\14\31\0\2\14\7\0\14\14\1\111\11\14\31\0"+
    "\2\14\7\0\1\14\1\112\11\14\1\113\1\14\1\114"+
    "\10\14\31\0\2\14\7\0\10\14\1\115\15\14\31\0"+
    "\2\14\7\0\1\14\1\116\24\14\31\0\2\14\7\0"+
    "\25\14\1\117\31\0\2\14\6\0\1\120\67\0\1\121"+
    "\67\0\1\122\45\0\1\123\21\0\1\124\46\0\1\125"+
    "\12\0\1\126\2\0\60\126\1\127\4\126\1\130\2\0"+
    "\61\130\1\131\3\130\1\132\2\0\65\132\7\0\26\14"+
    "\12\0\1\133\16\0\1\63\1\14\2\65\1\0\65\65"+
    "\7\0\2\14\1\134\23\14\31\0\2\14\7\0\11\14"+
    "\1\135\14\14\31\0\2\14\7\0\7\14\1\136\1\14"+
    "\1\137\14\14\31\0\2\14\7\0\17\14\1\140\6\14"+
    "\31\0\2\14\7\0\6\14\1\141\5\14\1\142\11\14"+
    "\31\0\2\14\7\0\14\14\1\143\11\14\31\0\2\14"+
    "\7\0\3\14\1\144\22\14\31\0\2\14\7\0\7\14"+
    "\1\145\16\14\31\0\2\14\7\0\11\14\1\146\14\14"+
    "\31\0\2\14\7\0\20\14\1\147\5\14\31\0\2\14"+
    "\7\0\11\14\1\150\11\14\1\151\2\14\31\0\2\14"+
    "\7\0\3\14\1\152\22\14\31\0\2\14\7\0\7\14"+
    "\1\153\16\14\31\0\2\14\7\0\13\14\1\154\12\14"+
    "\31\0\2\14\7\0\13\14\1\155\12\14\31\0\2\14"+
    "\7\0\10\14\1\156\15\14\31\0\2\14\7\0\10\14"+
    "\1\157\15\14\31\0\2\14\7\0\4\14\1\160\21\14"+
    "\31\0\2\14\7\0\5\14\1\161\20\14\31\0\2\14"+
    "\7\0\11\14\1\162\14\14\31\0\2\14\7\0\22\14"+
    "\1\163\3\14\31\0\2\14\65\0\1\164\70\0\1\165"+
    "\10\0\3\14\1\166\22\14\31\0\2\14\7\0\12\14"+
    "\1\167\13\14\31\0\2\14\7\0\5\14\1\170\20\14"+
    "\31\0\2\14\7\0\1\14\1\171\24\14\31\0\2\14"+
    "\7\0\15\14\1\172\10\14\31\0\2\14\7\0\5\14"+
    "\1\173\20\14\31\0\2\14\7\0\1\174\25\14\31\0"+
    "\2\14\7\0\1\14\1\175\24\14\31\0\2\14\7\0"+
    "\5\14\1\176\20\14\31\0\2\14\7\0\3\14\1\177"+
    "\22\14\31\0\2\14\7\0\3\14\1\200\22\14\31\0"+
    "\2\14\7\0\5\14\1\201\20\14\31\0\2\14\7\0"+
    "\5\14\1\202\20\14\31\0\2\14\7\0\11\14\1\203"+
    "\2\14\1\204\11\14\31\0\2\14\7\0\5\14\1\205"+
    "\20\14\31\0\2\14\7\0\3\14\1\206\22\14\31\0"+
    "\2\14\7\0\14\14\1\152\11\14\31\0\2\14\7\0"+
    "\15\14\1\207\10\14\31\0\2\14\7\0\1\14\1\210"+
    "\24\14\31\0\2\14\7\0\4\14\1\211\21\14\31\0"+
    "\2\14\7\0\4\14\1\212\21\14\31\0\2\14\7\0"+
    "\16\14\1\213\7\14\31\0\2\14\7\0\10\14\1\214"+
    "\15\14\31\0\2\14\7\0\13\14\1\215\12\14\31\0"+
    "\2\14\7\0\17\14\1\216\6\14\31\0\2\14\7\0"+
    "\10\14\1\217\15\14\31\0\2\14\7\0\10\14\1\220"+
    "\15\14\31\0\2\14\7\0\10\14\1\221\15\14\31\0"+
    "\2\14\7\0\5\14\1\222\20\14\31\0\2\14\7\0"+
    "\6\14\1\223\17\14\31\0\2\14\7\0\11\14\1\224"+
    "\14\14\31\0\2\14\7\0\12\14\1\225\13\14\31\0"+
    "\2\14\7\0\24\14\1\226\1\14\31\0\2\14\7\0"+
    "\1\14\1\227\24\14\31\0\2\14\7\0\5\14\1\230"+
    "\20\14\31\0\2\14\7\0\5\14\1\231\20\14\31\0"+
    "\2\14\7\0\11\14\1\232\14\14\31\0\2\14\7\0"+
    "\17\14\1\233\6\14\31\0\2\14\7\0\13\14\1\234"+
    "\12\14\31\0\2\14\7\0\14\14\1\235\11\14\31\0"+
    "\2\14\7\0\13\14\1\236\12\14\31\0\2\14\7\0"+
    "\11\14\1\237\14\14\31\0\2\14\7\0\20\14\1\240"+
    "\5\14\31\0\2\14\7\0\15\14\1\241\10\14\31\0"+
    "\2\14\7\0\11\14\1\242\14\14\31\0\2\14\7\0"+
    "\3\14\1\243\22\14\31\0\2\14\7\0\15\14\1\244"+
    "\10\14\31\0\2\14\7\0\12\14\1\245\13\14\31\0"+
    "\2\14\7\0\5\14\1\246\20\14\31\0\2\14\7\0"+
    "\5\14\1\247\20\14\31\0\2\14\7\0\4\14\1\250"+
    "\21\14\31\0\2\14\7\0\5\14\1\251\20\14\31\0"+
    "\2\14\7\0\2\14\1\252\23\14\31\0\2\14";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6160];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\26\1\15\11\4\1\5\11\4\1\1\11"+
    "\1\1\1\11\31\1\6\11\1\0\1\1\1\0\1\1"+
    "\2\0\30\1\1\11\66\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  VLangLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 70: break;
          case 2: 
            { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 71: break;
          case 3: 
            { return VLangTypes.DIV;
            } 
            // fall through
          case 72: break;
          case 4: 
            { yybegin(YYINITIAL); return VLangTypes.CH;
            } 
            // fall through
          case 73: break;
          case 5: 
            { return VLangTypes.ASSIGN;
            } 
            // fall through
          case 74: break;
          case 6: 
            { return VLangTypes.ID;
            } 
            // fall through
          case 75: break;
          case 7: 
            { return VLangTypes.OPEN_BRACE;
            } 
            // fall through
          case 76: break;
          case 8: 
            { return VLangTypes.CLOSE_BRACE;
            } 
            // fall through
          case 77: break;
          case 9: 
            { return VLangTypes.OPEN_BRACKET;
            } 
            // fall through
          case 78: break;
          case 10: 
            { return VLangTypes.CLOSE_BRACKET;
            } 
            // fall through
          case 79: break;
          case 11: 
            { return VLangTypes.OPEN;
            } 
            // fall through
          case 80: break;
          case 12: 
            { return VLangTypes.SEMICOLON;
            } 
            // fall through
          case 81: break;
          case 13: 
            { return VLangTypes.CLOSE;
            } 
            // fall through
          case 82: break;
          case 14: 
            { return VLangTypes.MUL;
            } 
            // fall through
          case 83: break;
          case 15: 
            { return VLangTypes.PLUS;
            } 
            // fall through
          case 84: break;
          case 16: 
            { return VLangTypes.MINUS;
            } 
            // fall through
          case 85: break;
          case 17: 
            { return VLangTypes.DOT;
            } 
            // fall through
          case 86: break;
          case 18: 
            { return VLangTypes.COMMA;
            } 
            // fall through
          case 87: break;
          case 19: 
            { return VLangTypes.OPTION;
            } 
            // fall through
          case 88: break;
          case 20: 
            { return VLangTypes.COLON;
            } 
            // fall through
          case 89: break;
          case 21: 
            { return VLangTypes.NOT;
            } 
            // fall through
          case 90: break;
          case 22: 
            { return VLangTypes.LESS;
            } 
            // fall through
          case 91: break;
          case 23: 
            { return VLangTypes.GRANDE;
            } 
            // fall through
          case 92: break;
          case 24: 
            { return VLangTypes.AND;
            } 
            // fall through
          case 93: break;
          case 25: 
            { return VLangTypes.OR;
            } 
            // fall through
          case 94: break;
          case 26: 
            { return VLangTypes.XOR;
            } 
            // fall through
          case 95: break;
          case 27: 
            { return VLangTypes.REMAINDER;
            } 
            // fall through
          case 96: break;
          case 28: 
            { return VLangTypes.ATOMIC;
            } 
            // fall through
          case 97: break;
          case 29: 
            { return VLangTypes.NUMBER;
            } 
            // fall through
          case 98: break;
          case 30: 
            { yybegin(YYINITIAL); return VLangTypes.COMMENT;
            } 
            // fall through
          case 99: break;
          case 31: 
            { return VLangTypes.EQUALS;
            } 
            // fall through
          case 100: break;
          case 32: 
            { return VLangTypes.IN;
            } 
            // fall through
          case 101: break;
          case 33: 
            { return VLangTypes.IF;
            } 
            // fall through
          case 102: break;
          case 34: 
            { return VLangTypes.AS;
            } 
            // fall through
          case 103: break;
          case 35: 
            { return VLangTypes.FN;
            } 
            // fall through
          case 104: break;
          case 36: 
            { return VLangTypes.GO;
            } 
            // fall through
          case 105: break;
          case 37: 
            { return VLangTypes.INITIAL;
            } 
            // fall through
          case 106: break;
          case 38: 
            { return VLangTypes.NOT_EQUALS;
            } 
            // fall through
          case 107: break;
          case 39: 
            { return VLangTypes.LESS_EQUALS;
            } 
            // fall through
          case 108: break;
          case 40: 
            { return VLangTypes.LEFT_SHIFT;
            } 
            // fall through
          case 109: break;
          case 41: 
            { return VLangTypes.GRANDE_EQUALS;
            } 
            // fall through
          case 110: break;
          case 42: 
            { return VLangTypes.RIGHT_SHIFT;
            } 
            // fall through
          case 111: break;
          case 43: 
            { return VLangTypes.STRING;
            } 
            // fall through
          case 112: break;
          case 44: 
            { return VLangTypes.MUTABLE;
            } 
            // fall through
          case 113: break;
          case 45: 
            { return VLangTypes.MAP;
            } 
            // fall through
          case 114: break;
          case 46: 
            { return VLangTypes.PUB;
            } 
            // fall through
          case 115: break;
          case 47: 
            { return VLangTypes.FOR;
            } 
            // fall through
          case 116: break;
          case 48: 
            { return VLangTypes.CHAR;
            } 
            // fall through
          case 117: break;
          case 49: 
            { return VLangTypes.FLOAT;
            } 
            // fall through
          case 118: break;
          case 50: 
            { return VLangTypes.ELSE;
            } 
            // fall through
          case 119: break;
          case 51: 
            { return VLangTypes.ENUM;
            } 
            // fall through
          case 120: break;
          case 52: 
            { return VLangTypes.BOOL;
            } 
            // fall through
          case 121: break;
          case 53: 
            { return VLangTypes.TYPE_KW;
            } 
            // fall through
          case 122: break;
          case 54: 
            { return VLangTypes.NONE;
            } 
            // fall through
          case 123: break;
          case 55: 
            { return VLangTypes.GOTO;
            } 
            // fall through
          case 124: break;
          case 56: 
            { return VLangTypes.MATCH;
            } 
            // fall through
          case 125: break;
          case 57: 
            { return VLangTypes.DEFER;
            } 
            // fall through
          case 126: break;
          case 58: 
            { return VLangTypes.UNION;
            } 
            // fall through
          case 127: break;
          case 59: 
            { return VLangTypes.CONST;
            } 
            // fall through
          case 128: break;
          case 60: 
            { return VLangTypes.BREAK;
            } 
            // fall through
          case 129: break;
          case 61: 
            { return VLangTypes.MODULE;
            } 
            // fall through
          case 130: break;
          case 62: 
            { return VLangTypes.UNSAFE;
            } 
            // fall through
          case 131: break;
          case 63: 
            { return VLangTypes.IMPORT;
            } 
            // fall through
          case 132: break;
          case 64: 
            { return VLangTypes.RETURN;
            } 
            // fall through
          case 133: break;
          case 65: 
            { return VLangTypes.STRUCT;
            } 
            // fall through
          case 134: break;
          case 66: 
            { return VLangTypes.CONTINUE;
            } 
            // fall through
          case 135: break;
          case 67: 
            { return VLangTypes.GLOBAL;
            } 
            // fall through
          case 136: break;
          case 68: 
            { return VLangTypes.INTERFACE;
            } 
            // fall through
          case 137: break;
          case 69: 
            { return VLangTypes.REQUESTED;
            } 
            // fall through
          case 138: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
