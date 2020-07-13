public class PushInt extends Instrucao
{
    int a;

    public PushInt(int a)
    {
        this.a = a;
    }

    public String toString()
    {
        return "push_int " + a;
    }

    public void executar(TISC maquina)
    {
        maquina.getPilha().push(a);
       // System.out.println(maquina.getPilha().toString());
        maquina.pc++;
    }
 
}