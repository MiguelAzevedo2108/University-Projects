public class Print_str extends Instrucao
{
    String string;

    public Print_str(String string)
    {
        this.string = string;
    }

    public String toString()
    {
        return "print_str " + string;
    }
    
    public void executar(TISC maquina)
    {
        System.out.print(" "+string);
        maquina.pc++;
    }
}