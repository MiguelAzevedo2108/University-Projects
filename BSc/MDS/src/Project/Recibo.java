package Project;

import java.util.ArrayList;

public class Recibo {
	
	ArrayList <Integer []> array;
	Registo registo;
	
    
	public Recibo (Registo registo) {
			this.registo = registo; 
	    }
	
	public void emiteRecibo (Registo registo) {
		
		array = registo.getArray();

		for (int i = 0; i<array.size();i++){
			System.out.println("Recibo do Jogador : ");
			System.out.println("Nif : " + array.get(i)[0]);
			System.out.println("Numero exame : " + array.get(i)[1]);
			System.out.println(" ");
		}
	}
}
