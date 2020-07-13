public class SetArg extends Instrucao
{
    int n1;
    public SetArg(int n1)
    {
        this.n1 = n1;
    }

    public String toString()
    {
        return "set_arg " + n1;
    }

    public void executar(TISC maquina)
	{
        maquina.getList().add(n1-1,maquina.getPilha().pop());
       // System.out.println(maquina.getPilha().toString());
       // maquina.getList().add(maquina.getPilha().pop());
        maquina.pc++;
	}
}
    