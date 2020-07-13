public class Jeq extends Instrucao
{
    String etiqueta;

    public Jeq(String etiqueta)
    {
        this.etiqueta = etiqueta;
    }

    public String toString()
    {
        return "jeq " + etiqueta;
    }

    public void executar(TISC maquina)
    {
       int o2 = maquina.getPilha().pop();
       int o1 = maquina.getPilha().pop();

       if(o1 == o2)
       {
            maquina.pc = maquina.getEtiquetas().get(etiqueta);
       }
       else
       {
           maquina.pc++;
       }
    }
}