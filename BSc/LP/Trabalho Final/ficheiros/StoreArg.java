import java.util.LinkedList;

public class StoreArg extends Instrucao
{
    int n1, n2;

    public StoreArg(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public String toString() {
        return "store_arg " + n1 + " " + n2;
    }

    public void executar(final TISC maquina)
	{
        RegistosAtivacao temp = maquina.registosAtivacao.peek();

        /*if(n1 == 0)
        {
            int topo = maquina.getPilha().pop();
            temp.args[n2-1] = topo;
        }
        else
        {*/
            for(int i = 0; i < n1; i++)
            {
                temp = maquina.registosAtivacao.get(temp.acessLink);
            }
            int topo = maquina.getPilha().pop();
            temp.args[n2-1] = topo;
       // }
        maquina.pc++;
	}
}