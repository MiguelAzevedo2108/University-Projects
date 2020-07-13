package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Project.Administrador;
import Project.Desportista;

class RegistoTest {

	
	@Test
	void testGetNif() {
		Desportista atleta = new Desportista("9760", "Verney", 91234, "Portuguesa", "Sporting",1234,"Artur");
		assertEquals(1234, atleta.getNif());
			
	}

	@Test
	void testGetNome() {
		
		Desportista atleta = new Desportista("9760", "Verney", 91234, "Portuguesa", "Sporting",1234,"Artur");
		assertEquals(1234, atleta.getNif());
	
	}	

	@Test
	void testGetNomeAdmin() {
		Administrador admin = new Administrador("admin");
		assertEquals("Artur", admin.getNome());
	}

}
