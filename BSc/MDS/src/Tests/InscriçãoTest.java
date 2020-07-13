package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Project.Desportista;
import Project.Exame;
import Project.Inscrição;

class InscriçãoTest {
	

	@Test
	void testGetInscrito() {
		Inscrição inscrito = new Inscrição(1, "sporting", 1234);
		assertEquals(false, inscrito.getInscrito());
		
	}
	
	@Test
	void testFezInscricao() {
		Desportista atleta = new Desportista("pois","terceira",92345678,"Portuguesa","Sporting",2321,"Miguel");
		Exame exame = new Exame (1,"Atleta","Doctor");
		Inscrição inscrito = new Inscrição(1, "sporting", 1234);
		
		assertEquals(false, inscrito.fezInscricao(atleta, exame));
		
		exame.realizarExame(atleta);
		assertEquals(true, inscrito.fezInscricao(atleta, exame));
		
		
	}
}
