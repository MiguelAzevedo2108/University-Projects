public class Call extends Instrucao
{
    int n;
    String etiqueta;

    public Call(int n, String etiqueta)
    {
        this.n = n;
        this.etiqueta = etiqueta;
    }

    public String toString()
    {
        return "call " + n + " " + etiqueta;
    }
    
    public void executar(TISC maquina)
	{
        RegistosAtivacao registo = new RegistosAtivacao();
        registo.setProgramCounter_antigo(maquina.pc+1);
        registo.nome = etiqueta;        
        if(n == -1)
        {
            registo.acessLink = maquina.registosAtivacao.size()-1;
        }
        else
        {
            RegistosAtivacao temp = maquina.ep;
            
            for(int i = 0; i < n; i++)
            {
                temp = maquina.registosAtivacao.get(temp.acessLink);
            }
            registo.acessLink = temp.acessLink;
        }
        //System.out.println("SALTA PARA -> " + registo.toString() + " COM ACESSLINK -> " + registo.getAcessLink());
        maquina.registosAtivacao.push(registo);

        maquina.ep = registo;
        maquina.pc = maquina.getEtiquetas().get(etiqueta);
    }
}