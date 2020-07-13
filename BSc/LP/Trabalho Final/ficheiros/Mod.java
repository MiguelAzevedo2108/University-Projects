public class Mod extends Instrucao
{
	public String toString()
	{
		return "mod";
	}

	public void executar(TISC maquina)
    {
        int o2 = maquina.getPilha().pop();
        int o1 = maquina.getPilha().pop();
        maquina.getPilha().push(o1%o2);
        maquina.pc++;
    }
}

