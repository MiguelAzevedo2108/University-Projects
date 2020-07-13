
package trabalh1;

public class Servidor {
    public static void main(String args[]) {

	int regPort=9000;
        
        if (args.length !=1) {
	    System.out.println("Usage: java so2.rmi.Servidor registryPort");
	    System.exit(1);
	}
	
	try {
	    
	    regPort=Integer.parseInt(args[0]);

	    Inter obj= new Implementacoes();

        java.rmi.registry.LocateRegistry.createRegistry(regPort);            
            	   
	    java.rmi.registry.Registry registry = java.rmi.registry.LocateRegistry.getRegistry(regPort);

	    registry.rebind("Inter", obj);  
  
	    System.out.println("Bound RMI object in registry");

        System.out.println("servidor pronto");
	} 

	catch (Exception ex) {
	    ex.printStackTrace();
	}
    }
    
    
}
