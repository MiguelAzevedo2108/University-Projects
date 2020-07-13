package Queue;
import java.util.Scanner;

public class Main
{
    public static void chegadaPessoas(Queue q,int horaChegada,int numPessoas)
    {
        for(int i = 0; i<numPessoas;i++)
        {
            Pessoa p = new Pessoa(horaChegada);
            q.enqueue(p);
        }
    }

    public static int chegadaBus(Queue q, int horaDeChegada, int numVagas)
    {
        int tempo = 0;

        for(int i = 0; i<numVagas;i++)
        {
            Pessoa remove = (Pessoa) q.front();
            tempo += horaDeChegada - remove.getHoraDeChegada();
            q.dequeue();
        }
        return tempo;
    }

    public static void main(String[] args)
    {
        int pessoas = 0;
        float tempo = 0;
        int c = 0;
        boolean empty = true;

        Scanner scanner = new Scanner (System.in);

        Queue <Pessoa> queue = new Queue <Pessoa>(20);

        while(empty)
        {
            System.out.print("Option : ");
            String option = scanner.next();

            if(option.equals("P"))
            {
                System.out.print("Hora de Chegada: ");
                int horaChegada = scanner.nextInt();

                System.out.print("Pessoas: ");
                int numeroPessoas = scanner.nextInt();

                pessoas = pessoas + numeroPessoas;
                c = c + numeroPessoas;

                chegadaPessoas(queue,horaChegada,numeroPessoas);

                System.out.println("Hora " + horaChegada + ", " + numeroPessoas + " pessoas chegaram" + ", " + "estao " + pessoas + " na fila");
            }
            else if(option.equals("B"))
            {
                System.out.print("Hora de Chegada: ");
                int horaChegada = scanner.nextInt();

                System.out.print("Vagas no autocarro: ");
                int numeroVagas = scanner.nextInt();

                tempo = tempo + chegadaBus(queue,horaChegada,numeroVagas);

                pessoas = pessoas - numeroVagas;

                System.out.print("Hora " + horaChegada + ", " + numeroVagas + " pessoas chegaram" + ", " + "ficam " + pessoas + "\n");
            }
            if(queue.isEmpty())
            {
                empty = false;
            }
        }
        System.out.println();
        System.out.print("Tempo médio: " + tempo/c);
    }
}
