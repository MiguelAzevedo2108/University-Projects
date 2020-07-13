public class Jump extends Instrucao
{
    String etiqueta;

    public Jump(String etiqueta)
    {
        this.etiqueta = etiqueta;
    }

    public String toString()
    {
        return "jump " + etiqueta;
    }
        
    public void executar(TISC maquina)
    {
        maquina.pc = maquina.getEtiquetas().get(etiqueta);
    }
}
