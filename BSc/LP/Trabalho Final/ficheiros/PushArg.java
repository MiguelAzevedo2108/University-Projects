import java.util.LinkedList;

public class PushArg extends Instrucao
{
    int n1,n2;

    public PushArg(int n1,int n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }

    public String toString()
    {
        return "push_arg " + n1 + " " + n2;
    }

    public void executar(TISC maquina)
    {
       RegistosAtivacao temp = maquina.registosAtivacao.peek();

        if(n1 == 0)
        {
            maquina.getPilha().push(temp.getArgs()[n2-1]);
        }
        else
        {
            for(int i = 0; i < n1; i++)
            {
                temp = maquina.registosAtivacao.get(temp.acessLink);
            }
           //temp.ola();
            maquina.getPilha().push(temp.getArgs()[n2-1]);

        }
        maquina.pc++;
    }
}