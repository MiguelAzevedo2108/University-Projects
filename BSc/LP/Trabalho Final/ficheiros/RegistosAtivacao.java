public class RegistosAtivacao
{
    int args[];
    int variaveis[];
    int programcounter_antigo;
    int acessLink;
    String nome;
    public RegistosAtivacao()
    {
    }
  
    public void setArgs(int n2)
    {
        args = new int[n2];
    }
  
    public void setVariaveis(int n1)
    {
        variaveis = new int[n1];
    }
    
    public int[] getArgs()
    {
        return args;
    }

    public int[] getVariaveis()
    {
        return variaveis;
    }

    public void setProgramCounter_antigo(int programcounter_antigo)
    {
        this.programcounter_antigo = programcounter_antigo;
    }   

    public int getProgramCounter_antigo()
    {
        return programcounter_antigo;
    }

	public void setAcessLink(int acessLink)
	{
		this.acessLink = acessLink;
	}

	public int getAcessLink()
	{
		return acessLink; //aponta para o ambito onde as funcoes sao declaradas
	}
    public String toString()
    {
        return nome;
    }
   /* public void printString()
    {
        System.out.println(nome);
    }
    public void ola()

    {   System.out.print("VARIAVEIS -> ");
        for(int i = 0; i< variaveis.length;i++)
        {
            System.out.print(variaveis[i] + " ");
        }
        System.out.println();
    }*/
}