package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Project.Administrador;

class AdministradorTest {

	@Test
	void testNome() {
		Administrador admin = new Administrador("Artur");
		assertEquals("Artur", admin.getNome());
		
		admin.setNome("João");
		assertEquals("João", admin.getNome());
	}
	
	

}
