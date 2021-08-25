/* The following code was generated by JFlex 1.4.3 on 25/08/21 09:23 */

package com.alexsantos.proyecto01.analyzer.fca;
import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 25/08/21 09:23 from the specification file
 * <tt>/home/alex/Documentos/USAC/Compi1/proyecto01/proyecto01/src/main/java/com/alexsantos/proyecto01/analyzer/fca/scanner.lex</tt>
 */
public class FCAScanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\12\1\13\1\0\1\12\1\14\22\0\1\12\1\0\1\7"+
    "\1\10\3\0\1\7\1\23\1\24\1\11\1\0\1\15\1\0\1\3"+
    "\1\0\12\1\1\16\1\20\1\0\1\17\3\0\1\33\1\45\1\42"+
    "\1\40\1\30\1\43\1\27\1\53\1\41\1\54\1\2\1\44\1\46"+
    "\1\31\1\35\1\34\1\2\1\32\1\37\1\36\1\47\1\52\1\2"+
    "\1\50\1\51\1\2\1\25\1\0\1\26\1\0\1\4\1\0\1\33"+
    "\1\45\1\42\1\40\1\30\1\43\1\27\1\53\1\41\1\54\1\2"+
    "\1\44\1\46\1\31\1\35\1\34\1\2\1\32\1\37\1\36\1\47"+
    "\1\52\1\2\1\50\1\51\1\2\1\21\1\0\1\22\123\0\1\2"+
    "\37\0\1\2\u1f2a\0\1\5\1\6\udfe2\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\2\1\2\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\10\3\1\2\1\0\1\17\2\0\12\3\2\4\1\0"+
    "\14\3\1\20\23\3\1\21\1\22\1\3\1\23\4\3"+
    "\1\24\1\25\1\26\1\3\1\27\1\30\13\3\1\31"+
    "\14\3\1\32\1\33\4\3\1\34\11\3\1\35";

  private static int [] zzUnpackAction() {
    int [] result = new int[131];
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
    "\0\0\0\55\0\132\0\207\0\264\0\341\0\u010e\0\u013b"+
    "\0\55\0\55\0\55\0\55\0\55\0\55\0\55\0\55"+
    "\0\55\0\55\0\u0168\0\u0195\0\u01c2\0\u01ef\0\u021c\0\u0249"+
    "\0\u0276\0\u02a3\0\u02d0\0\341\0\55\0\u02fd\0\u032a\0\u0357"+
    "\0\u0384\0\u03b1\0\u03de\0\u040b\0\u0438\0\u0465\0\u0492\0\u04bf"+
    "\0\u04ec\0\55\0\u02fd\0\u0519\0\u0546\0\u0573\0\u05a0\0\u05cd"+
    "\0\u05fa\0\u0627\0\u0654\0\u0681\0\u06ae\0\u06db\0\u0708\0\u0735"+
    "\0\207\0\u0762\0\u078f\0\u07bc\0\u07e9\0\u0816\0\u0843\0\u0870"+
    "\0\u089d\0\u08ca\0\u08f7\0\u0924\0\u0951\0\u097e\0\u09ab\0\u09d8"+
    "\0\u0a05\0\u0a32\0\u0a5f\0\u0a8c\0\u0ab9\0\207\0\u0ae6\0\207"+
    "\0\u0b13\0\u0b40\0\u0b6d\0\u0b9a\0\207\0\207\0\207\0\u0bc7"+
    "\0\207\0\207\0\u0bf4\0\u0c21\0\u0c4e\0\u0c7b\0\u0ca8\0\u0cd5"+
    "\0\u0d02\0\u0d2f\0\u0d5c\0\u0d89\0\u0db6\0\207\0\u0de3\0\u0e10"+
    "\0\u0e3d\0\u0e6a\0\u0e97\0\u0ec4\0\u0ef1\0\u0f1e\0\u0f4b\0\u0f78"+
    "\0\u0fa5\0\u0fd2\0\207\0\207\0\u0fff\0\u102c\0\u1059\0\u1086"+
    "\0\207\0\u10b3\0\u10e0\0\u110d\0\u113a\0\u1167\0\u1194\0\u11c1"+
    "\0\u11ee\0\u121b\0\207";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[131];
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
    "\1\2\1\3\1\4\1\2\1\5\1\6\1\2\1\6"+
    "\1\7\1\2\3\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\2\4"+
    "\1\25\2\4\1\26\1\27\1\30\1\4\1\31\7\4"+
    "\1\32\2\4\56\0\1\3\1\0\1\33\52\0\2\4"+
    "\1\0\1\4\22\0\26\4\2\0\1\4\24\0\26\4"+
    "\6\34\2\35\3\34\1\35\41\34\10\0\1\36\1\37"+
    "\55\0\3\10\41\0\2\4\1\0\1\4\22\0\1\4"+
    "\1\40\1\4\1\41\22\4\1\0\2\4\1\0\1\4"+
    "\22\0\25\4\1\42\1\0\2\4\1\0\1\4\22\0"+
    "\3\4\1\43\22\4\1\0\2\4\1\0\1\4\22\0"+
    "\12\4\1\44\13\4\1\0\2\4\1\0\1\4\22\0"+
    "\7\4\1\45\16\4\1\0\2\4\1\0\1\4\22\0"+
    "\1\4\1\46\4\4\1\47\17\4\1\0\2\4\1\0"+
    "\1\4\22\0\6\4\1\50\17\4\1\0\2\4\1\0"+
    "\1\4\22\0\4\4\1\51\21\4\1\0\1\33\53\0"+
    "\13\36\1\52\1\53\40\36\11\37\1\54\43\37\1\0"+
    "\2\4\1\0\1\4\22\0\2\4\1\55\23\4\1\0"+
    "\2\4\1\0\1\4\22\0\4\4\1\56\21\4\1\0"+
    "\2\4\1\0\1\4\22\0\1\4\1\57\24\4\1\0"+
    "\2\4\1\0\1\4\22\0\13\4\1\60\12\4\1\0"+
    "\2\4\1\0\1\4\22\0\7\4\1\61\16\4\1\0"+
    "\2\4\1\0\1\4\22\0\3\4\1\62\22\4\1\0"+
    "\2\4\1\0\1\4\22\0\14\4\1\63\11\4\1\0"+
    "\2\4\1\0\1\4\22\0\20\4\1\64\5\4\1\0"+
    "\2\4\1\0\1\4\22\0\17\4\1\65\6\4\1\0"+
    "\2\4\1\0\1\4\22\0\15\4\1\66\10\4\10\0"+
    "\1\52\45\0\2\4\1\0\1\4\22\0\1\4\1\67"+
    "\24\4\1\0\2\4\1\0\1\4\22\0\14\4\1\70"+
    "\11\4\1\0\2\4\1\0\1\4\22\0\21\4\1\71"+
    "\4\4\1\0\2\4\1\0\1\4\22\0\24\4\1\72"+
    "\1\4\1\0\2\4\1\0\1\4\22\0\20\4\1\73"+
    "\5\4\1\0\2\4\1\0\1\4\22\0\12\4\1\74"+
    "\13\4\1\0\2\4\1\0\1\4\22\0\12\4\1\75"+
    "\13\4\1\0\2\4\1\0\1\4\22\0\16\4\1\76"+
    "\7\4\1\0\2\4\1\0\1\4\22\0\5\4\1\77"+
    "\20\4\1\0\2\4\1\0\1\4\22\0\6\4\1\100"+
    "\17\4\1\0\2\4\1\0\1\4\22\0\3\4\1\101"+
    "\22\4\1\0\2\4\1\0\1\4\22\0\12\4\1\102"+
    "\13\4\1\0\2\4\1\0\1\4\22\0\12\4\1\103"+
    "\13\4\1\0\2\4\1\0\1\4\22\0\15\4\1\104"+
    "\10\4\1\0\2\4\1\0\1\4\22\0\2\4\1\105"+
    "\23\4\1\0\2\4\1\0\1\4\22\0\2\4\1\106"+
    "\23\4\1\0\2\4\1\0\1\4\22\0\15\4\1\107"+
    "\10\4\1\0\2\4\1\0\1\4\22\0\4\4\1\110"+
    "\21\4\1\0\2\4\1\0\1\4\22\0\3\4\1\111"+
    "\22\4\1\0\2\4\1\0\1\4\22\0\4\4\1\112"+
    "\21\4\1\0\2\4\1\0\1\4\22\0\13\4\1\113"+
    "\12\4\1\0\2\4\1\0\1\4\22\0\23\4\1\114"+
    "\2\4\1\0\2\4\1\0\1\4\22\0\6\4\1\115"+
    "\17\4\1\0\2\4\1\0\1\4\22\0\1\116\25\4"+
    "\1\0\2\4\1\0\1\4\22\0\12\4\1\117\13\4"+
    "\1\0\2\4\1\0\1\4\22\0\1\4\1\120\24\4"+
    "\1\0\2\4\1\0\1\4\22\0\3\4\1\121\22\4"+
    "\1\0\2\4\1\0\1\4\22\0\1\4\1\122\24\4"+
    "\1\0\2\4\1\0\1\4\22\0\3\4\1\123\22\4"+
    "\1\0\2\4\1\0\1\4\22\0\4\4\1\124\21\4"+
    "\1\0\2\4\1\0\1\4\22\0\6\4\1\125\17\4"+
    "\1\0\2\4\1\0\1\4\22\0\21\4\1\126\1\127"+
    "\3\4\1\0\2\4\1\0\1\4\22\0\3\4\1\130"+
    "\22\4\1\0\2\4\1\0\1\4\22\0\1\4\1\131"+
    "\24\4\1\0\2\4\1\0\1\4\22\0\10\4\1\132"+
    "\15\4\1\0\2\4\1\0\1\4\22\0\3\4\1\133"+
    "\22\4\1\0\2\4\1\0\1\4\22\0\5\4\1\134"+
    "\7\4\1\135\1\136\7\4\1\0\2\4\1\0\1\4"+
    "\22\0\1\137\25\4\1\0\2\4\1\0\1\4\22\0"+
    "\1\4\1\140\24\4\1\0\2\4\1\0\1\4\22\0"+
    "\12\4\1\141\13\4\1\0\2\4\1\0\1\4\22\0"+
    "\12\4\1\142\13\4\1\0\2\4\1\0\1\4\22\0"+
    "\4\4\1\143\21\4\1\0\2\4\1\0\1\4\22\0"+
    "\15\4\1\144\10\4\1\0\2\4\1\0\1\4\22\0"+
    "\5\4\1\145\20\4\1\0\2\4\1\0\1\4\22\0"+
    "\1\4\1\146\24\4\1\0\2\4\1\0\1\4\22\0"+
    "\2\4\1\147\23\4\1\0\2\4\1\0\1\4\22\0"+
    "\3\4\1\150\22\4\1\0\2\4\1\0\1\4\22\0"+
    "\6\4\1\151\17\4\1\0\2\4\1\0\1\4\22\0"+
    "\6\4\1\152\17\4\1\0\2\4\1\0\1\4\22\0"+
    "\1\4\1\153\24\4\1\0\2\4\1\0\1\4\22\0"+
    "\3\4\1\154\22\4\1\0\2\4\1\0\1\4\22\0"+
    "\16\4\1\155\7\4\1\0\2\4\1\0\1\4\22\0"+
    "\3\4\1\156\22\4\1\0\2\4\1\0\1\4\22\0"+
    "\4\4\1\157\21\4\1\0\2\4\1\0\1\4\22\0"+
    "\4\4\1\160\21\4\1\0\2\4\1\0\1\4\22\0"+
    "\4\4\1\161\21\4\1\0\2\4\1\0\1\4\22\0"+
    "\7\4\1\162\16\4\1\0\2\4\1\0\1\4\22\0"+
    "\10\4\1\163\15\4\1\0\2\4\1\0\1\4\22\0"+
    "\10\4\1\164\15\4\1\0\2\4\1\0\1\4\22\0"+
    "\15\4\1\165\10\4\1\0\2\4\1\0\1\4\22\0"+
    "\1\4\1\166\24\4\1\0\2\4\1\0\1\4\22\0"+
    "\1\4\1\167\24\4\1\0\2\4\1\0\1\4\22\0"+
    "\1\4\1\170\24\4\1\0\2\4\1\0\1\4\22\0"+
    "\10\4\1\171\15\4\1\0\2\4\1\0\1\4\22\0"+
    "\10\4\1\172\15\4\1\0\2\4\1\0\1\4\22\0"+
    "\7\4\1\173\16\4\1\0\2\4\1\0\1\4\22\0"+
    "\4\4\1\174\21\4\1\0\2\4\1\0\1\4\22\0"+
    "\11\4\1\175\14\4\1\0\2\4\1\0\1\4\22\0"+
    "\12\4\1\176\13\4\1\0\2\4\1\0\1\4\22\0"+
    "\10\4\1\177\15\4\1\0\2\4\1\0\1\4\22\0"+
    "\7\4\1\200\16\4\1\0\2\4\1\0\1\4\22\0"+
    "\12\4\1\201\13\4\1\0\2\4\1\0\1\4\22\0"+
    "\13\4\1\202\12\4\1\0\2\4\1\0\1\4\22\0"+
    "\6\4\1\203\17\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4680];
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
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\6\1\12\11\11\1\1\0\1\11\2\0"+
    "\12\1\1\11\1\1\1\0\127\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[131];
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
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

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
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public FCAScanner(java.io.Reader in) {
      yyline = 1;
    yycolumn = 1;
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public FCAScanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 192) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
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
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
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
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 19: 
          { return new Symbol(sym.doubletype,yycolumn,yyline,yytext());
          }
        case 30: break;
        case 25: 
          { return new Symbol(sym.piegraph,yycolumn,yyline,yytext());
          }
        case 31: break;
        case 6: 
          { return new Symbol(sym.colom,yycolumn,yyline,yytext());
          }
        case 32: break;
        case 23: 
          { return new Symbol(sym.compare,yycolumn,yyline,yytext());
          }
        case 33: break;
        case 14: 
          { return new Symbol(sym.closesquarebracket,yycolumn,yyline,yytext());
          }
        case 34: break;
        case 7: 
          { return new Symbol(sym.equals,yycolumn,yyline,yytext());
          }
        case 35: break;
        case 11: 
          { return new Symbol(sym.openparenthesis,yycolumn,yyline,yytext());
          }
        case 36: break;
        case 13: 
          { return new Symbol(sym.opensquarebracket,yycolumn,yyline,yytext());
          }
        case 37: break;
        case 5: 
          { return new Symbol(sym.comma,yycolumn,yyline,yytext());
          }
        case 38: break;
        case 21: 
          { return new Symbol(sym.bgtitlex,yycolumn,yyline,yytext());
          }
        case 39: break;
        case 16: 
          { return new Symbol(sym.xaxis,yycolumn,yyline,yytext());
          }
        case 40: break;
        case 2: 
          { return new Symbol(sym.decimal,yyline,yycolumn, yytext());
          }
        case 41: break;
        case 28: 
          { return new Symbol(sym.setglobals,yycolumn,yyline,yytext());
          }
        case 42: break;
        case 12: 
          { return new Symbol(sym.closeparenthesis,yycolumn,yyline,yytext());
          }
        case 43: break;
        case 9: 
          { return new Symbol(sym.openbracket,yycolumn,yyline,yytext());
          }
        case 44: break;
        case 27: 
          { return new Symbol(sym.bargraph,yycolumn,yyline,yytext());
          }
        case 45: break;
        case 26: 
          { return new Symbol(sym.linegraph,yycolumn,yyline,yytext());
          }
        case 46: break;
        case 15: 
          { return new Symbol(sym.strtext,yyline,yycolumn, yytext());
          }
        case 47: break;
        case 3: 
          { return new Symbol(sym.id,yycolumn,yyline,yytext());
          }
        case 48: break;
        case 22: 
          { return new Symbol(sym.bgtitley,yycolumn,yyline,yytext());
          }
        case 49: break;
        case 18: 
          { return new Symbol(sym.strtype,yycolumn,yyline,yytext());
          }
        case 50: break;
        case 8: 
          { return new Symbol(sym.semicolom,yycolumn,yyline,yytext());
          }
        case 51: break;
        case 29: 
          { return new Symbol(sym.main,yycolumn,yyline,yytext());
          }
        case 52: break;
        case 20: 
          { return new Symbol(sym.file,yycolumn,yyline,yytext());
          }
        case 53: break;
        case 1: 
          { System.out.println("\nError lexico en la linea " + yyline +
        " columna " + yycolumn + " componente: " + yytext() + ".\n");
          }
        case 54: break;
        case 17: 
          { return new Symbol(sym.title,yycolumn,yyline,yytext());
          }
        case 55: break;
        case 24: 
          { return new Symbol(sym.values,yycolumn,yyline,yytext());
          }
        case 56: break;
        case 4: 
          { 
          }
        case 57: break;
        case 10: 
          { return new Symbol(sym.closebracket,yycolumn,yyline,yytext());
          }
        case 58: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
