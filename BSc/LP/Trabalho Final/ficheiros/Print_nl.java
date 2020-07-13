public class Print_nl extends Instrucao
{
    public String toString()
    {
        return "print_nl";
    }
    public void executar(TISC maquina)
    {
        System.out.println();
        maquina.pc++;
    }
}