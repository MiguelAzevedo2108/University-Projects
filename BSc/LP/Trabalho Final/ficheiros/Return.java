public class Return extends Instrucao
{
    public String toString()
    {
        return "return";
    }
    
    public void executar(TISC maquina)
    {
        RegistosAtivacao temp = maquina.registosAtivacao.pop();
        if(!maquina.registosAtivacao.empty())
        {
           // System.out.println("ACABA -> " + temp.toString() + "VAI PARA " + maquina.registosAtivacao.peek().toString());
            maquina.pc = temp.programcounter_antigo++;
           // maquina.pc++;
            maquina.ep = maquina.registosAtivacao.peek();
        }
    }
}