package Boggle;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boggle
{
	Position[][] matriz;
	int size = 0;

	public Boggle(String filename) throws IOException
	{
		this.matriz = lerBoggle(filename);
	}

	public boolean compare(String str1, String str2)
	{
		// Esta funcao tem como objetivo poder utilizar uma comparacao de strings com strings e nulls pois o .equals n�o pode comparar a nulls
		
		return (str1 == null ? str2 == null : str1.equals(str2));
	}

	public int size()
	{
		return size;
	}
	
    public Position [][] lerBoggle(String filename) throws IOException
    {
    	// Esta funcao ira ler de um ficheiro uma matriz de characteres que consequentemente irá ser a nossa matriz Boggle

        FileInputStream fstream = new FileInputStream(filename);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        Position matriz[][] = new Position[6][6];
        String strLine=br.readLine();

        int i = 0;

        // Primeira linha de nulls
        for(int j = 0; j < 6; j++)								// E criado uma moldura (border) em volta da nossa matriz com elementos a NULL
        {														// A matriz boggle ira ser uma matriz 6x6 em que a linha/coluna = 0 ira ser toda a NULL
        	matriz[i][j] = null;
        }
        
        i++;

        for (int line = 0 ; line < 4 ; line ++)
        {
            for (int j = 0; j < 6; j++)
            {
                if(j == 0 || j == 5)
                    matriz[i][j] = null;
                else{                                               // Sao inseridos na matriz Boggle objetios "Position" nas positions 1-4
                    Character c = strLine.charAt(line*4+j-1);
                    Position letra = new Position(Character.toLowerCase(c),i,j);
                    matriz[i][j] = letra;
                }
            }
            i++;
        }

        // Ultima linha de NULLS							// A matriz boggle ira ser uma matriz 6x6 em que a linha/coluna = 5 ira ser toda a NULL
        for(int j = 0; j < 6; j++)
        {
        	matriz[i][j] = null;
        }
        return matriz;
    }

    private void solve								// Esta funcao ira resolver o Boggle recursivamente
    (Hash<String> palavra, Hash<String> prefixo, LinkedList<Position> ll, LinkedList<Position>[] sol, int llsize, int i, int j) throws InvalidNodeException
	{
    	Position letra = matriz[i][j];

    	if(letra == null || letra.foiVisitado())
    	{
    		// Caso a posicao a ser lida seja um valor da Moldura, ou seja, com valor NULL
    		return;
    	}

    	ll.add(llsize, letra);
    	llsize++;

    	String comp1 = ll.toString();

		if(letra!=null && !(compare(prefixo.procurar(comp1),comp1)) && !(compare(palavra.procurar(comp1), comp1)))
		{
			// Nao ser palavra nem prefixo

    		ll.remove(llsize-1);
    		llsize--;
    		return;
    	}

    	else if(letra!=null && compare(prefixo.procurar(comp1),comp1))
    	{
			// SER PREFIXO

    		letra.setVisitado(true);
    	}

    	if(compare(palavra.procurar(comp1),comp1) && (compare(prefixo.procurar(comp1),comp1)))
    	{
    		// SER PALAVRA E PREFIXO

			letra.setVisitado(true);

			LinkedList<Position> newl = new LinkedList<>();
			newl = ll.copy(newl);
			sol[size] = newl;				// Sendo palavra guardamos a LinkedList num array SOLUCOES que ira conter todas as palavras encontradas no Boggle
			size++;
    	}

    	else if(compare(palavra.procurar(comp1),comp1) && !(compare(prefixo.procurar(comp1),comp1)))
    	{
    		// SER PALAVRA E NAO SER PREFIXO

			letra.setVisitado(false);

			LinkedList<Position> newl = new LinkedList<Position>();
			newl= ll.copy(newl);
			sol[size]=newl; 				// Sendo palavra guardamos a LinkedList num array SOLUCOES que ira conter todas as palavras encontradas no Boggle
			size++;

			ll.remove(llsize-1);
			llsize--;

			return;
    	}

    	if(compare(prefixo.procurar(comp1),comp1))
    	{
    		// Sendo prefixo usamos recursividade para ver as possibilidades de ligacao

    		// N
    		solve(palavra,prefixo,ll,sol,llsize,i-1,j);
			// NE
			solve(palavra,prefixo,ll,sol,llsize,i-1,j+1);
    		// E
    		solve(palavra,prefixo,ll,sol,llsize,i,j+1);
    		// SE
    		solve(palavra,prefixo,ll,sol,llsize,i+1,j+1);
    		// S
    		solve(palavra,prefixo,ll,sol,llsize,i+1,j);
    		// SW
    		solve(palavra,prefixo,ll,sol,llsize,i+1,j-1);
    		// W
    		solve(palavra,prefixo,ll,sol,llsize,i,j-1);
    		// NW
    		solve(palavra,prefixo,ll,sol,llsize,i-1,j-1);
    	}

		ll.remove(llsize-1);
		llsize--;
    	letra.setVisitado(false);

    	return;
    }
    
    public LinkedList<Position>[] solve(Hash<String> palavra, Hash<String> prefixo) throws IOException, InvalidNodeException
    {
    	LinkedList<Position>[] sol = new LinkedList[1000];
    	LinkedList<Position> temp = new LinkedList<>();

    	for(int i = 0; i < 6; i++)
    	{
    		for(int j = 0; j < 6; j++)
    		{
    			if((i != 0 && i != 5) && (j != 0 && j != 5))			// Resolucao por completo do Boggle
    		    	solve(palavra,prefixo,temp,sol,0,i,j);
    		}
    	}
        return sol;
    }
}
