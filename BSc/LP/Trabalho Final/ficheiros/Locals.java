public class Locals extends Instrucao
{
    int n1,n2;

    public Locals(int n1, int n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }

    public String toString()
    {
        return "locals " + n1 + " " + n2;
    }
    
    public void executar(TISC maquina)
    {
        RegistosAtivacao registo = maquina.registosAtivacao.peek();
        //System.out.println(maquina.getList().toString());

        if(n1 > 0)
        {
            registo.setArgs(n1);
         //   System.out.println("stack auxiliar-> "+ maquina.getList().toString());
            for(int i = 0; i < n1; i++)
            {
                registo.args[i] = maquina.getList().get(i);
               // System.out.println("args -> "+ registo.args[i]);
            }
        }
        if(n2 > 0)
        {
            registo.setVariaveis(n2);
        }
        maquina.ep = registo;
        maquina.pc++;

    }
}