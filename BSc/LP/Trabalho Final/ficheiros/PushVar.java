import java.util.*;

public class PushVar extends Instrucao
{
    int n1,n2;

    public PushVar(int n1, int n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }

    public String toString()
    {
        return "push_var " + n1 + " " + n2;
    }

    public void executar(TISC maquina)
    {
        RegistosAtivacao temp = maquina.registosAtivacao.peek();

      /*  if(n1 == 0)
        {
           // temp.printString();
            maquina.getPilha().push(temp.getVariaveis()[n2-1]);
        }
        else
        {*/
            for(int i = 0 ; i< n1; i++)
            {
                temp = maquina.registosAtivacao.get(temp.acessLink);
            }
            maquina.getPilha().push(temp.getVariaveis()[n2-1]);
            //System.out.println(maquina.getPilha().toString());

        //}
        maquina.pc++;
    }
    
}