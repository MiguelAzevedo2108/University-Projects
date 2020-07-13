public class Print extends Instrucao
{
    public String toString()
    {
        return "print";
    }
    public void executar(TISC maquina)
    {
        System.out.print(maquina.getPilha().pop());
        maquina.pc++;
    }
}