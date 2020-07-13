import java.io.*; 
import java.util.*; 
// Programa principal para a implementacaoo da maquina abstracta TISC.

public class Main {
  public static void main(String args[])
    throws Exception
  {
    parser aParser = new parser();
    TISC maquina; //memoria de instrucoes

    // carrega o programa TISC
    maquina = (TISC) aParser.parse().value;

    // e executa-o
    if (maquina != null)
      maquina.executa();
  }
}
