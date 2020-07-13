package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Project.Exame;
import Project.Médico;

class MédicoTest {

	@Test
	void testNifMedico() {
		Médico doc = new Médico("doc",1234);
		assertEquals("1234",doc.getNif());
		
		doc.setNifMedico(1234567);
		assertEquals(1234567, doc.getNif());
	}

	@Test
	void testNomeMedico() {
		Médico doc = new Médico("doc",1234);
		assertEquals("doc", doc.getNome());
		
		doc.setNomeMedico("artur");
		assertEquals("artur", doc.getNome());
	}

	@Test
	void testFazExame() {
		Exame exame = new Exame(1,"artur","doc");
		Médico doc = new Médico("doc3",1234);
		
		
		assertEquals("doc",exame.getNomeMedico());
		
		doc.fazExame(exame);
		
		assertEquals("doc3",exame.getNomeMedico());
		
	}
}
