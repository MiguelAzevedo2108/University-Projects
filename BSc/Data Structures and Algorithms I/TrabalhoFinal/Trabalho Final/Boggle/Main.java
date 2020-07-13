package Boggle;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void dicionario(HashTable <String> prefixos, HashTable <String> palavras, String filename) throws IOException
    {
        // Esta funcao ira ler de um ficheiro de palavras (dicionario em Ingles) e ira gerar todos os prefixos das mesmas inserido-os numa Tabela de Hash
        // Caso existam prefixos repetidos estes nao irao ser adicionados

        // Tambem foi criada outra tabela de Hash apenas com todas as palavras do dicionario Ingles

        FileInputStream fstream = new FileInputStream(filename);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

        while ((strLine = br.readLine()) != null)           // Leitura do Ficheiro
        {
            int palavraSize = strLine.length();

            for(int i = 1; i < palavraSize; i++)
            {
                String prefixo = strLine.substring(0,i);        // Criacao de prefixos

                if(prefixos.procurar(prefixo) == null)            // Caso o prefixo gerado nao esteja na Tabela de Hash e inserido
                {
                    prefixos.insere(prefixo);
                }
            }
            palavras.insere(strLine);                          // Sao inseridas todas as palavras do dicionario noutra Tabela de Hash
        }
        fstream.close();
    }

    public static void main(String[] args) throws IOException, InvalidNodeException
    {
        Hash <String> prefixos = new Hash<>(11);        // Criacao da Tabela de Hash com todos os Prefixos
        Hash <String> palavras = new Hash<>(11);        // Criacao da Tabela de Hash com todas as Palavras

        Boggle boggle = new Boggle("matrizEnunciado.txt");       // Criacao do Boggle
        dicionario(prefixos,palavras,"dicionarioCompleto.txt");   // Insercao de todos os prefixos e palavras nas respectivas Tabelas de Hash

        LinkedList<Position>[] sol = boggle.solve(palavras, prefixos);     // LinkedList com as solucoes do Boggle

        for(int i = 0 ; i < boggle.size() ; i++)
        {
            System.out.println(sol[i].outPutCorreto(sol[i]));             // Prints como pedido no Enunciado do Trabalho
        }
    }
}
