package trabalh1;

import java.util.ArrayList;

public interface Inter extends java.rmi.Remote{
    
    public int SaberN(String id) throws java.rmi.RemoteException;
    
    public int addUnique(String id) throws java.rmi.RemoteException;
    
    public String CriarQuest(String id, String nome, int numero, String[] perguntas) throws java.rmi.RemoteException;
    
    public ArrayList<String> ConsultQuest() throws java.rmi.RemoteException;
    
    public String ApagaQuest(String id, int numero) throws java.rmi.RemoteException;
    
    public ArrayList<String> Questions(String id) throws java.rmi.RemoteException;
    
    public String AnswerQuest(String id, int numero, int[]respostas) throws java.rmi.RemoteException;
    
    public int VezesQuest(String nome) throws java.rmi.RemoteException;
    
    public int[] Media(String id) throws java.rmi.RemoteException;
    
}
