//import java.io.*; 
import java.util.*; 
// Tiny Instruction Set Computer
public class TISC 
{
	  /** Executa o programa TISC carregado na maquina. */
  	Hashtable<String,Integer> etiquetas; // etiquetas
	ArrayList<Instrucao> mem_instrucoes;
	Stack <Integer> pilhaAvaliacao;		//pilha de avaliacao
	Stack <RegistosAtivacao> registosAtivacao;	//memoria de execucao
	Stack <Integer> list_auxiliar;
	int pc;
	RegistosAtivacao ep;

 	public TISC()
	{
		etiquetas = new Hashtable<String,Integer>();
		mem_instrucoes = new ArrayList<>();
		pilhaAvaliacao = new Stack<>();
		list_auxiliar = new Stack<>();
		registosAtivacao = new Stack<>();
		//pc = 0;
	}
	
	public void adicionarEtiqueta(String key)
	{
		etiquetas.put(key,mem_instrucoes.size());
	}

  	public Hashtable<String,Integer> getEtiquetas()
	{
		return etiquetas;
	}

	public ArrayList<Instrucao> getMemInst()
	{
		return mem_instrucoes;
	}

	public Stack<Integer> getPilha()
	{
		return pilhaAvaliacao;
	}

	public Stack <Integer> getList()
	{
		return list_auxiliar;
	}

  	public void executa()
  	{
		RegistosAtivacao main = new RegistosAtivacao();
		main.acessLink = -1;
		main.nome = "main";
		registosAtivacao.push(main);
		pc = etiquetas.get("program");
		
		while(!registosAtivacao.isEmpty())
		{ 
			//System.out.println("a executar -> "+ mem_instrucoes.get(pc).toString() + " PC -> " + (pc+1));
			//System.out.println(pilhaAvaliacao.toString());
			mem_instrucoes.get(pc).executar(this);
			//System.out.println(pilhaAvaliacao.toString());
		}
  	}

	public void show()
	{
		for(int i = 0; i < mem_instrucoes.size(); i++)
		{
			System.out.println(mem_instrucoes.get(i));
		}
		
	}
}
