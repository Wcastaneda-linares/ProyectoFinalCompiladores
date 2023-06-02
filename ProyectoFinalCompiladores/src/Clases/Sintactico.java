
package Clases;

import java_cup.runtime.*;
import java.util.Hashtable;
import Tablas.TablaSimbolos;
import traductor.Traducir;


public class Sintactico extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\012\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\003\000\002\004\005\000\002\004\006" +
    "\000\002\004\006\000\002\004\006\000\002\004\007\000" +
    "\002\004\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\022\000\006\016\010\073\004\001\002\000\004\016" +
    "\021\001\002\000\010\002\ufffe\016\ufffe\073\ufffe\001\002" +
    "\000\004\002\020\001\002\000\010\002\000\016\010\073" +
    "\004\001\002\000\004\073\011\001\002\000\006\025\012" +
    "\033\013\001\002\000\012\002\ufffd\016\ufffd\026\016\073" +
    "\ufffd\001\002\000\004\025\014\001\002\000\012\002\ufffc" +
    "\016\ufffc\026\015\073\ufffc\001\002\000\010\002\ufff9\016" +
    "\ufff9\073\ufff9\001\002\000\010\002\ufffa\016\ufffa\073\ufffa" +
    "\001\002\000\010\002\uffff\016\uffff\073\uffff\001\002\000" +
    "\004\002\001\001\002\000\004\025\022\001\002\000\006" +
    "\026\023\060\024\001\002\000\010\002\ufff8\016\ufff8\073" +
    "\ufff8\001\002\000\010\002\ufffb\016\ufffb\073\ufffb\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\022\000\010\002\005\003\006\004\004\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\004\016\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    /**Metodo al que se llama automáticamente ante algún error sintactico.*/
    public void syntax_error(Symbol s){
        System.out.println("Error Sintactico en la Línea " +(s.right+1) + ". Identificador "
        +s.value + " no se reconoce la expresion." );
    }

    /**Metodo al que se llama en el momento en que ya no es posible una recuperación de
    errores.*/
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
    //   System.out.println("Error Sintactico en la Línea " + (s.right+1)+ ". Identificador " +
     //   s.value + " no se reconoce la expresion.");
    }



}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintactico$actions {


TablaSimbolos tablasimbolos=new TablaSimbolos();
Traducir tra=new Traducir();

  private final Sintactico parser;

  /** Constructor */
  CUP$Sintactico$actions(Sintactico parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // REGLAS ::= aux_futuro pro_personal verbo_regular advio_tiempo 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		tra.simplepregunta(a.toString().toLowerCase()+" "+b.toString().toLowerCase()+" "+c.toString().toLowerCase()+" "+d.toString().toLowerCase());
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("REGLAS",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // REGLAS ::= pro_personal aux_futuro advio_negacion verbo_regular advio_tiempo 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		tra.simplenega(a.toString().toLowerCase()+" "+b.toString().toLowerCase()+" "+c.toString().toLowerCase()+" "+d.toString().toLowerCase()+" "+e.toString().toLowerCase());
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("REGLAS",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // REGLAS ::= pro_personal aux_futuro verbo_regular advio_tiempo 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		tra.simpleafir(a.toString().toLowerCase()+" "+b.toString().toLowerCase()+" "+c.toString().toLowerCase()+" "+d.toString().toLowerCase());
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("REGLAS",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // REGLAS ::= aux_futuro pro_personal verbo_regular interrogacioncerrado 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		tra.tobepregunta(a.toString().toLowerCase()+" "+b.toString().toLowerCase()+" "+c.toString().toLowerCase());
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("REGLAS",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // REGLAS ::= pro_personal aux_futuro advio_negacion verbo_regular 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		tra.tobenegacion(a.toString().toLowerCase()+" "+b.toString().toLowerCase()+" "+c.toString().toLowerCase()+" "+d.toString().toLowerCase());
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("REGLAS",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // REGLAS ::= pro_personal aux_futuro verbo_regular 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		tra.tobeafirmacion(a.toString().toLowerCase()+" "+b.toString().toLowerCase()+" "+c.toString().toLowerCase());
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("REGLAS",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // REGLA ::= REGLAS 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("REGLA",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // REGLA ::= REGLA REGLAS 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("REGLA",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIAL ::= REGLA 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("INICIAL",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIAL EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintactico$parser.done_parsing();
          return CUP$Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

