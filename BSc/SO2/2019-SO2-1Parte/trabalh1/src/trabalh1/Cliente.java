package trabalh1;

import java.util.Scanner;
import java.util.ArrayList;

public class Cliente 
{
    public static void main(String[]args)
    {
        String regHost = "localhost";
    	String regPort = "9000";  
    	String frase= "";
            
    	regHost= args[0];
    	regPort= args[1];
        
        if (args.length !=2) 
        { 
    	    System.out.println
    		("Usage: java so2.rmi.PalavrasClient registryHost registryPort frase");
    	    System.exit(1);
    	}
        
        try
        {
            
            Inter interfac = (Inter)java.rmi.Naming.lookup("rmi://" + regHost + ":" + regPort + "/Inter");
            Scanner reader = new Scanner(System.in);
            
            int opcao = -1;
                
            while(opcao != 0)
            {
                System.out.print("\nQual a operação que deseja fazer :\n "
                    + "1-Criar um novo questionario\n "
                    + "2-Consultar questionarios\n "
                    + "3-Apagar questionario\n "
                    + "4-Obter lista de perguntas de um questionario\n "
                    + "5-Responder a um questionario\n"
                    + "6-Consultar o numero de vezes que um questionario foi respondido\n"
                    + "7-Obter media do valor respondido em cada questao de um questionario\n"
                    + "0-Exit\n"
                    + "\n");
                System.out.print("Opcao: ");
            
                opcao = reader.nextInt();
            
                switch(opcao)
                {

                    case 1:                      //Criar um novo questionario
                        int x = 0;
                        String[] perguntas = new String[5];

                        Scanner read = new Scanner(System.in);

                        System.out.print("Id do novo questionario: ");
                        String id = read.nextLine();
                      
                        while(id.charAt(0) == '0' || id.charAt(0) == '2' || id.charAt(0) == '2' || id.charAt(0) == '3' || id.charAt(0) == '4' || id.charAt(0) == '5' || id.charAt(0) == '6' || id.charAt(0) == '7' || id.charAt(0) == '8' || id.charAt(0) == '9')
                        {
                            System.out.print("Id invalido, tente novamente: ");
                            id = read.nextLine();
                        }

                        System.out.print("Nome do novo questionario: ");
                        String nome = read.nextLine();

                        System.out.print("Numero de perguntas entre 3 a 5 do questionario: ");
                        int numero = read.nextInt();
                        
                        while(numero < 3 || numero > 5 )
                        {
                            System.out.print("Numero invalido, insira um numero entre 3 a 5: ");
                            numero = read.nextInt();
                        }

                        while(x < numero)
                        {
                            Scanner readerrrr = new Scanner(System.in);
                            System.out.println("Diga a pergunta: ");
                            String pergu = readerrrr.nextLine();
                            perguntas[x] = pergu;
                            x++;
                        }  

                        String criar = interfac.CriarQuest(id, nome, numero, perguntas);
                        System.out.println(criar);

                        break;
                        
                    case 2:                         //Consultar questionarios

                        ArrayList<String> arrayQuestionario = interfac.ConsultQuest();
                      
                        if(arrayQuestionario.isEmpty() == true)
                        {
                            System.out.println("Ainda nao foram inseridos questionarios!");
                        }

                        else
                        {
                            for(int i = 0; i < arrayQuestionario.size(); i = i + 3)
                            {
                                System.out.println("linha : " + arrayQuestionario.get(i) + " | " + arrayQuestionario.get(i + 1) + " | " + arrayQuestionario.get(i + 2));
                            }
                        }

                        break;

                    case 3:                         //Apagar questionario
                        Scanner reade = new Scanner(System.in);
                        
                        ArrayList<String> arrayToDel = interfac.ConsultQuest();
                        
                        if(arrayToDel.isEmpty() == true)
                        {
                            System.out.println("Ainda nao foram inseridos questionarios!");
                            break;
                        }
                        
                        for(int i = 0; i < arrayToDel.size(); i = i + 3)
                        {
                            System.out.println("linha : " + arrayToDel.get(i) + " | " + arrayToDel.get(i + 1) + " | " + arrayToDel.get(i + 2));
                        }
                        
                        System.out.print("Id do questionario que deseja eliminar: ");
                        String delete = reade.nextLine();
                        int questNum = interfac.SaberN(delete);
                        
                        while(questNum == 0)
                        {
                            System.out.print("Id nao existente! Insira novo Id: ");
                            delete = reade.nextLine();
                            questNum = interfac.SaberN(delete);
                        }
                        
                        String apaga = interfac.ApagaQuest(delete, questNum);
                        
                        System.out.println(apaga);

                        break;

                    case 4:                         //Obter lista de perguntas de um questionario

                        Scanner readee = new Scanner(System.in);
                        
                        ArrayList<String> arrayConsult = interfac.ConsultQuest();

                        if(arrayConsult.isEmpty() == true)
                        {
                            System.out.println("Ainda nao foram inseridos questionarios!");
                            break;
                        }                        

                        else
                        {
                            for(int i = 0;i < arrayConsult.size(); i = i + 3)
                            {
                                System.out.println("id : " + arrayConsult.get(i) + " , Nome do questionario: " + arrayConsult.get(i + 1));
                            }
                        }
                        
                        System.out.print("Id do questionario que deseja consultar: ");
                        String searchId = readee.nextLine();
                        int nums = interfac.SaberN(searchId);
                        
                        while(nums == 0)
                        {
                            System.out.print("Id nao existente! Insira novo Id: ");
                            
                            searchId = readee.nextLine();
                            nums = interfac.SaberN(searchId);
                        }

                        ArrayList<String> question = interfac.Questions(searchId);

                        for(int n = 0; n < question.size(); n++)
                        {
                            System.out.println("Pergunta: " + question.get(n));
                        }

                        break;


                    case 5:                     //Responder a um questionario

                        Scanner readerr = new Scanner(System.in);
                        
                        ArrayList<String> arrayResponder = interfac.ConsultQuest();
                        
                        if(arrayResponder.isEmpty() == true)
                        {
                            System.out.println("Ainda nao foram inseridos questionarios!");
                            break;
                        }

                        else
                        {
                            for(int i = 0; i < arrayResponder.size(); i = i + 3)
                            {
                                System.out.println("id : " + arrayResponder.get(i) + " , Nome do questionario: " + arrayResponder.get(i + 1));
                            }
                        }
                        
                        System.out.print("Id do questionario que deseja responder: ");
                        String idResponder = readerr.nextLine();
                        
                        int numquest = interfac.SaberN(idResponder);
                        
                        while(numquest == 0)
                        {
                            System.out.print("Id nao existente! Insira novo Id: ");
                            
                            idResponder = readerr.nextLine();
                            numquest = interfac.SaberN(idResponder);
                        }
                        
                        ArrayList<String> QuestResponder = interfac.Questions(idResponder);

                        int[] respostas = new int[numquest];
                        
                        for(int i = 0; i < numquest; i++)
                        {
                            System.out.print(QuestResponder.get(i) + ": ");

                            int answer = readerr.nextInt();
                            while(answer < 1 || answer > 10)
                            {
                                System.out.print("Resposta incorreta! Insira um valor entre 1 e 10: ");
                                answer = readerr.nextInt();
                            }
                            respostas[i] = answer;
                        }
                        
                        String resposta = interfac.AnswerQuest(idResponder, numquest, respostas);
                        int unico = interfac.addUnique(idResponder);
                        
                        System.out.print(resposta);
                        System.out.print("\nO Id da sua resposta é :" + unico + "\n");
                        
                        break;


                    case 6:                //Consultar o numero de vezes que um questionario foi respondido
                        Scanner reeader = new Scanner(System.in);
                        
                        ArrayList<String> arraycheck = interfac.ConsultQuest();

                        if(arraycheck.isEmpty() == true)
                        {
                            System.out.println("Ainda nao foram inseridos questionarios!");
                            break;
                        }

                        else
                        {
                            for(int i = 0; si < arraycheck.size(); i = i + 3)
                            {
                                System.out.println("id : " + arraycheck.get(i) + ", Nome do questionario: " + arraycheck.get(i + 1));
                            }
                        }
                        
                        System.out.print("Questionario: ");
                        String nomequest = reeader.nextLine();

                        int num = interfac.SaberN(nomequest);

                        while(num == 0)
                        {
                            System.out.print("Questionario invalido! Insira um novo id: ");
                            nomequest = reeader.nextLine();
                            
                            num = interfac.SaberN(nomequest);
                        }

                        if(interfac.VezesQuest(nomequest) == 1)
                        {
                            System.out.println("O questionario " + nomequest + " foi respondido "+ interfac.VezesQuest(nomequest) + " vez");
                        }
                        else
                        {
                            System.out.println("O questionario " + nomequest + " foi respondido "+ interfac.VezesQuest(nomequest) + " vezes");
                            
                        }
                        
                        break;

                    case 7:                      //Obter media do valor respondido em cada questao de um questionario
                        Scanner reeaderr = new Scanner(System.in);

                        ArrayList<String> arrayMedia = interfac.ConsultQuest();
                        
                        if(arrayMedia.isEmpty() == true)
                        {
                            System.out.println("Ainda nao foram inseridos questionarios!");
                            break;
                        }

                        else
                        {
                            for(int i = 0;i < arrayMedia.size(); i = i + 3)
                            {
                                System.out.println("id : " + arrayMedia.get(i) + ", Nome do questionario: " + arrayMedia.get(i + 1));
                            }
                        }
                        
                        System.out.print("Questionario: ");
                        
                        String nomequest1 = reeaderr.nextLine();
                        
                        int numero1 = interfac.SaberN(nomequest1);
                        
                        while(numero1 == 0)
                        {
                            System.out.print("Questionario invalido! Insira um novo id: ");
                            nomequest1 = reeaderr.nextLine();
                            
                            numero1 = interfac.SaberN(nomequest1);
                        }
                           
                        if(interfac.VezesQuest(nomequest1) == 0)
                        {
                            System.out.print("O questionario " + nomequest1 + "ainda nao foi respondido!\n");
                            break;
                            
                        }
                        
                        else
                        {
                            int array[] = interfac.Media(nomequest1);

                            int n = interfac.SaberN(nomequest1);


                            for(int i = 0 ; i<n;i++)
                            {
                                System.out.println("A media da pergunta " + (i + 1) + " : "+ array[i]);
                            }
                            
                        }
                        
                        break;

                    default:
                        break;
                }
            }    
        }
        
        catch (Exception ex) {
	    ex.printStackTrace();
	}
    }
}