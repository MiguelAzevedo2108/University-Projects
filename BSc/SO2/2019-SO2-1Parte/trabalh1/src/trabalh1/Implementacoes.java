package trabalh1;

import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Implementacoes extends UnicastRemoteObject implements Inter, java.io.Serializable{
    Connect conector = new Connect();
    
    public Implementacoes() throws java.rmi.RemoteException
    {
        super();
    }
    
    public int SaberN(String id) throws java.rmi.RemoteException
    {
        
        int nquestions = 0;
        try 
        {
            conector.connect();
        } 
        
        catch (Exception ex) 
        {
            Logger.getLogger(Implementacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Statement stm = conector.getStatement();
        
        try
        {
            ResultSet keeps = stm.executeQuery("select * from questionarios");
            while(keeps.next())
            {
                String verifica = keeps.getString("id");
                
               
                if(verifica.equals(id))
                {
                    ResultSet keeper = stm.executeQuery("select * from questionarios where id = '" + id + "'");
                    keeper.next();
            
                    nquestions = keeper.getInt("nperguntas");
                    keeper.close();
                    keeps.close();
                    break;    
                }
                
            }
            stm.close();
                
        }
        
        catch(Exception e)
        {
                e.printStackTrace();
                System.out.print("Problems...");
        }
        
        conector.disconnect();
        
        return nquestions;
    }
    
    public int addUnique(String id) throws java.rmi.RemoteException
    {
        int unique = 1;
        try 
        {
            conector.connect();
        } 
        
        catch (Exception ex) 
        {
            Logger.getLogger(Implementacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Statement stm = conector.getStatement();
        
        try
        {
            ResultSet keepo = stm.executeQuery("select * from respostas");
            if(keepo.wasNull())
            {
                stm.executeUpdate("Insert values into respostas("+unique+", '"+id+"')");
                keepo.close();
                stm.close();
                conector.disconnect();
                return unique;
            }
            
            while(keepo.next())
            {
                
                unique++;
                
            }
            
            
            stm.executeUpdate("Insert into respostas values("+unique+", '"+id+"')");
            keepo.close();
            stm.close();
            conector.disconnect();
            return unique;
            
                
        }
        
        catch(Exception e)
        {
                e.printStackTrace();
                System.out.print("Problems...");
        }
        
        conector.disconnect();
        
        return unique;
        
    }
    
    
    public String CriarQuest(String id, String nome, int numero, String[] perguntas) throws java.rmi.RemoteException
    {      
        
        String criado = "Questionario criado sem sucesso!";

        try 
        {
            conector.connect();
        } 
        
        catch (Exception ex) 
        {
            Logger.getLogger(Implementacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        Statement stm = conector.getStatement();

        try{
            ResultSet keeper = stm.executeQuery("select * from questionarios");

            while(keeper.next())
            {
                String verifica = keeper.getString("id");
               
                if(verifica.equals(id))
                {
                    criado = "Id do Questionario ja existente!";
                    stm.close();
                    keeper.close();
                    conector.disconnect();
                    return criado;
                }
            }
        }
        
        catch(Exception e)
        {
                e.printStackTrace();
                System.out.print("Problems...");
        }
        
        
        if(numero == 3)
        {
            try
            {
                stm.executeUpdate("INSERT INTO Questionarios VALUES('" + id + "', '" + nome + "'," + numero + ")");
                stm.executeUpdate("INSERT into Questionario3 values('" + id + "', '" + perguntas[0] + "', '" + perguntas[1] + " ', '" + perguntas[2] + "')");
                stm.executeUpdate("CREATE TABLE "+id+"  " +
                        "(resposta1 INTEGER NOT NULL, " + 
                        "resposta2 INTEGER NOT NULL, " +
                        "resposta3 INTEGER NOT NULL)");
                criado = "Questionario criado com sucesso!";
      
                stm.close();
            }   
             
            catch(Exception e)
            {
                e.printStackTrace();
                System.out.print("Problems...");
            }      
        }
        
        else if(numero == 4)
        {
            try
            {
                stm.executeUpdate("INSERT INTO Questionarios VALUES('" + id + "', '" + nome + "'," + numero + ")");
                stm.executeUpdate("INSERT into Questionario4 values('" + id + "', '" + perguntas[0] + "', '" + perguntas[1] + " ', '" + perguntas[2] + "', '" + perguntas[3] + "')");
                stm.executeUpdate("CREATE TABLE "+ id +" " + 
                        "(resposta1 INTEGER NOT NULL, " + 
                        "resposta2 INTEGER NOT NULL, " +
                        "resposta3 INTEGER NOT NULL, " +
                        "resposta4 INTEGER NOT NULL)");
                criado = "Questionario criado com sucesso!";
                stm.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
                System.out.print("Problems...");
            }            
        }
        
        else if(numero == 5)
        {
            try
            {
                stm.executeUpdate("INSERT INTO Questionarios VALUES('" + id + "', '" + nome + "'," + numero + ")");
                stm.executeUpdate("INSERT into Questionario5 values('" + id + "', '" + perguntas[0] + "', '" + perguntas[1] + " ', '" + perguntas[2] + "', '" + perguntas[3] + "', '" + perguntas[4] + "')");
                stm.executeUpdate("CREATE TABLE "+ id +" " + 
                        "(resposta1 INTEGER NOT NULL, " + 
                        "resposta2 INTEGER NOT NULL, " +
                        "resposta3 INTEGER NOT NULL, " +
                        "resposta4 INTEGER NOT NULL, " +
                        "resposta5 INTEGER NOT NULL)");
                criado = "Questionario criado com sucesso!";
                stm.close();
            }           
            catch(Exception e){
                e.printStackTrace();
                System.out.print("Problems...");
            }       
        }
        
        conector.disconnect();
        return criado;
        
    }

    public ArrayList<String> ConsultQuest() throws java.rmi.RemoteException
    {
        ArrayList<String> arrayQuest = new ArrayList<>();
              
        try 
        {
            conector.connect();
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(Implementacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Statement stm = conector.getStatement();
       
        try
        {
            ResultSet keeper = stm.executeQuery("select * from questionarios");
                
            while(keeper.next())
            {
                String id = keeper.getString("id");
                String nome = keeper.getString("nome");
                
                int nperguntas = keeper.getInt("nperguntas"); 
                String num = Integer.toString(nperguntas);
                
                arrayQuest.add(id);
                arrayQuest.add(nome);
                arrayQuest.add(num);
            }
            keeper.close();
            stm.close();
        }
        
        catch(Exception e){
            e.printStackTrace();
            System.out.print("Problems...");
        }
        
        conector.disconnect();
        return arrayQuest;

    }
    
    public String ApagaQuest(String id, int numero) throws java.rmi.RemoteException
    { 
        String remocao = "Removido sem sucesso";
        
        try 
        {
            conector.connect();
        } 
        
        catch (Exception ex) 
        {
            Logger.getLogger(Implementacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Statement stm = conector.getStatement();
       
        try
        { 
            
                    
            if(numero == 3)
            {
                stm.executeUpdate("DELETE FROM respostas WHERE id = '" + id + "'");
                stm.executeUpdate("DELETE FROM Questionario3 WHERE id = '" + id + "'");
                stm.executeUpdate("DELETE FROM Questionarios WHERE id = '" + id + "'");
                
                stm.executeUpdate("DROP TABLE " + id + " CASCADE");

                remocao = "Removido com sucesso!";
                       
            }
                    
            else if(numero == 4)
            {
                stm.executeUpdate("DELETE FROM respostas WHERE id = '" + id + "'");
                stm.executeUpdate("DELETE FROM Questionario4 WHERE id = '" + id + "'");
                stm.executeUpdate("DELETE FROM Questionarios WHERE id = '" + id + "'");
                stm.executeUpdate("DROP TABLE " + id + " CASCADE");
                
                remocao = "Removido com sucesso!";         
            }
                    
            else if(numero == 5)
            {
                stm.executeUpdate("DELETE FROM respostas WHERE id = '" + id + "'");
                stm.executeUpdate("DELETE FROM Questionario5 WHERE id = '" + id + "'");
                stm.executeUpdate("DELETE FROM Questionarios WHERE id = '" + id + "'");
                stm.executeUpdate("DROP TABLE " + id + " CASCADE");
                
                remocao = "Removido com sucesso!";
            }
            
            stm.close();    
        }
      
        catch(Exception e){
            e.printStackTrace();
            System.out.print("Problems...");
        }
      
        conector.disconnect();
        return remocao;
   
    }
   
    public ArrayList<String> Questions(String id) throws java.rmi.RemoteException
    {
        ArrayList<String> arrayQuestions = new ArrayList<>();
        
        try 
        {
            conector.connect();
        } 
        
        catch (Exception ex) 
        {
            Logger.getLogger(Implementacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Statement stm = conector.getStatement();
        
        try
        {
           int num = SaberN(id);
           
           if(num == 3)
           {
               ResultSet keep = stm.executeQuery("select * from questionario3 where id = '" + id + "'");
               keep.next();
               
               String pergunta1 = keep.getString("pergunta1");
               String pergunta2 = keep.getString("pergunta2");
               String pergunta3 = keep.getString("pergunta3");
               
               arrayQuestions.add(pergunta1);
               arrayQuestions.add(pergunta2);
               arrayQuestions.add(pergunta3);
               
               keep.close();
           }
           
           else if(num == 4)
           {
               ResultSet keep = stm.executeQuery("select * from questionario4 where id = '" + id + "'");
               keep.next();
               
               String pergunta1 = keep.getString("pergunta1");
               String pergunta2 = keep.getString("pergunta2");
               String pergunta3 = keep.getString("pergunta3");
               String pergunta4 = keep.getString("pergunta4");
               
               arrayQuestions.add(pergunta1);
               arrayQuestions.add(pergunta2);
               arrayQuestions.add(pergunta3);
               arrayQuestions.add(pergunta4);
               
               keep.close();
           }
           
           else if(num == 5)
           {
               ResultSet keep = stm.executeQuery("select * from questionario5 where id = '" + id + "'");
               keep.next();
               
               String pergunta1 = keep.getString("pergunta1");
               String pergunta2 = keep.getString("pergunta2");
               String pergunta3 = keep.getString("pergunta3");
               String pergunta4 = keep.getString("pergunta4");
               String pergunta5 = keep.getString("pergunta5");
   
               arrayQuestions.add(pergunta1);
               arrayQuestions.add(pergunta2);
               arrayQuestions.add(pergunta3);
               arrayQuestions.add(pergunta4);
               arrayQuestions.add(pergunta5);
               
               keep.close();
           }
     
           stm.close();
        }
        
        catch(Exception e){
            e.printStackTrace();
            System.out.print("Problems on search...");
        }
        
        conector.disconnect();
        return arrayQuestions;
    }
 
    public String AnswerQuest(String id, int numero, int[] respostas) throws java.rmi.RemoteException
    {  
        String respondido = "Respondido sem sucesso!";
        
        try 
        {
            conector.connect();
        } 
        
        catch (Exception ex) 
        {
            Logger.getLogger(Implementacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Statement stm = conector.getStatement();
        
        try
        {
            if(numero == 3)
            {
                stm.executeUpdate("INSERT INTO " + id + " VALUES( " + respostas[0] + ", " + respostas[1] + "," + respostas[2] + ")");
                respondido = "Questionario respondido com sucesso!";
                
            }
            else if(numero == 4)
            {
                stm.executeUpdate("INSERT INTO " + id + " VALUES(" + respostas[0] + ", " + respostas[1] + "," + respostas[2] + ", " + respostas[3] + ")");
                respondido = "Questionario respondido com sucesso!";
            }
            else if(numero == 5)
            {
                stm.executeUpdate("INSERT INTO " + id + " VALUES(" + respostas[0] + ", " + respostas[1] + "," + respostas[2] + ", " + respostas[3] + ", " + respostas[4] + ")");
                respondido = "Questionario respondido com sucesso!";
            }
            
            stm.close();
        }
        
        catch(Exception e){
            e.printStackTrace();
            System.out.print("Problems...");
        }
        
        conector.disconnect();
        return respondido;
        
    }

    public int VezesQuest(String id) {
        try 
        {
            conector.connect();
        } 
        
        catch (Exception ex) 
        {
            Logger.getLogger(Implementacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Statement stm = conector.getStatement();
        int counter = 0;
       
        try
        {
            ResultSet keeper = stm.executeQuery("select * from " + id + "");
   
            while(keeper.next())
            {
                counter ++;
            }
            
            keeper.close();
            stm.close();
       
        }
        
        catch(Exception e){
            e.printStackTrace();
            System.out.print("Problems on search...");
        }
        
        conector.disconnect();
        return counter;
    }

    public int[] Media(String id) throws java.rmi.RemoteException{
        try 
        {
            conector.connect();
        } 
        
        catch (Exception ex) 
        {
            Logger.getLogger(Implementacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Statement stm = conector.getStatement();
        
        try
        {
            
            ResultSet rs = stm.executeQuery("select * from " + id + "");
         
            int nperguntas = SaberN(id);
                    
            if (nperguntas == 3)
            {
                int[] respostas = new int [3];
                
                int resposta1 = 0;
                int resposta2 = 0;
                int resposta3 = 0;
            
                int counter = VezesQuest(id);
                
                while(rs.next())
                {
                    resposta1 = resposta1 + rs.getInt("resposta1");
                    resposta2 = resposta2 + rs.getInt("resposta2");
                    resposta3 = resposta3 + rs.getInt("resposta3");
                
                }
                resposta1 = resposta1/counter;
                respostas[0] = resposta1;
                
                resposta2 = resposta2/counter;
                respostas[1] = resposta2;
                
                resposta3 = resposta3/counter;
                respostas[2] = resposta3;
                
                rs.close();
                stm.close();
                conector.disconnect();
                
                return respostas;
                
                
            }
            else if (nperguntas == 4)
            {
                int[] respostas = new int [4];
                
                int resposta1 = 0;
                int resposta2 = 0;
                int resposta3 = 0;
                int resposta4 = 0;
            
                int counter = VezesQuest(id);
                
                while(rs.next())
                {
                    resposta1 = resposta1 + rs.getInt("resposta1");
                    resposta2 = resposta2 + rs.getInt("resposta2");
                    resposta3 = resposta3 + rs.getInt("resposta3");
                    resposta4 = resposta4 + rs.getInt("resposta4");
                }
                
                resposta1 = resposta1/counter;
                respostas[0] = resposta1;
                
                resposta2 = resposta2/counter;
                respostas[1] = resposta2;
                
                resposta3 = resposta3/counter;
                respostas[2] = resposta3;
                
                resposta4 = resposta4/counter;
                respostas[3] = resposta4;
                
                rs.close();
                stm.close();
                conector.disconnect();
                
                return respostas;
           
            }  
            else if (nperguntas == 5)
            {
                int[] respostas = new int [5];
                
                int resposta1 = 0;
                int resposta2 = 0;
                int resposta3 = 0;
                int resposta4 = 0;
                int resposta5 = 0;
            
                int counter = VezesQuest(id);
                
                while(rs.next())
                {
                    resposta1 = resposta1 + rs.getInt("resposta1");
                    resposta2 = resposta2 + rs.getInt("resposta2");
                    resposta3 = resposta3 + rs.getInt("resposta3");
                    resposta4 = resposta4 + rs.getInt("resposta4");
                    resposta5 = resposta5 + rs.getInt("resposta5");
                }
                
                resposta1 = resposta1/counter;
                respostas[0] = resposta1;
                
                resposta2 = resposta2/counter;
                respostas[1] = resposta2;
                
                resposta3 = resposta3/counter;
                respostas[2] = resposta3;
                
                resposta4 = resposta4/counter;
                respostas[3] = resposta4;
                
                resposta5 = resposta5/counter;
                respostas[4] = resposta5;
                
                rs.close();
                stm.close();
                conector.disconnect();
                
                return respostas;
            } 
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.print("Problems...");
        }     
        return null;
    }
}
