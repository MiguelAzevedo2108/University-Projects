package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Project.Desportista;
import Project.Exame;

class ExameTest  {

	@Test
	void testExame() {
		Exame exame = new Exame (1,"Atleta","Doctor");
		assertEquals(1,exame.getNumeroExame());
		
		exame.setNumeroExame(2);
		assertEquals(2,exame.getNumeroExame());
		
	}
	
	  public void realizarExame(Desportista desportista) {
	        desportista.setExameFeito(true);
	 
	
	}
	  
	void realizaExame() {
		Desportista atleta = new Desportista("pois","terceira",92345678,"Portuguesa","Sporting",2321,"Miguel");
		assertEquals(true, atleta.getExameFeito());
	
	}
}
