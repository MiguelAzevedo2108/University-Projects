public class Add extends Instrucao
{
	public String toString()
	{
		return "add";
	}

	public void executar(TISC maquina)
	{
		//System.out.println("aqui "+maquina.getPilha().toString());

		int o2 = maquina.getPilha().pop();
		int o1 = maquina.getPilha().pop();
		maquina.getPilha().push(o1+o2);
		//System.out.println(maquina.getPilha().toString());

		maquina.pc++;
	}
}