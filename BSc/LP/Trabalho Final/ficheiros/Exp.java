import java.lang.Math; 

public class Exp extends Instrucao
{
	public String toString()
	{
		return "exp";
	}

	public void executar(TISC maquina)
	{
		int o2 = maquina.getPilha().pop();
		int o1 = maquina.getPilha().pop();
		double o3 = Math.pow(o1,o2);
		int resultado = (int)o3;
		maquina.getPilha().push(resultado);
		maquina.pc++;
	}
}