package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Project.Desportista;
 
	
class DesportistaTest {
	
	@Test
	void testCodPost() {
		
		Desportista atleta = new Desportista("9760", "Verney", 91234, "Portuguesa", "Sporting" ,1234,"Artur");
		assertEquals("9760", atleta.getCodigo_postal());
		
		atleta.setCodigo_postal("1234");
		assertEquals("1234",atleta.getCodigo_postal());
	}
	
	@Test
	void testMorada() {
		
		Desportista atleta = new Desportista("9760", "Verney", 91234, "Portuguesa", "Sporting" ,1234,"Artur");
		assertEquals("Verney", atleta.getMorada());
		
		atleta.setMorada("Ces");
		assertEquals("Ces", atleta.getMorada());
		
	}
	
	@Test
	void testTelefone() {
		Desportista atleta = new Desportista("9760", "Verney", 91234, "Portuguesa", "Sporting",1234,"Artur");
		assertEquals(91234, atleta.getTelefone());
		
		atleta.setTelefone(1234);
		assertEquals(1234, atleta.getTelefone());
	}
	
	@Test
	void testNac() {
		Desportista atleta = new Desportista("9760", "Verney", 91234, "Portuguesa", "Sporting",1234,"Artur");
		assertEquals("Portuguesa",atleta.getNacionalidade());
		
		atleta.setNacionalidade("Americana");
		assertEquals("Americana", atleta.getMorada());
	
	}
	
	@Test
	void testClube() {
		Desportista atleta = new Desportista("9760", "Verney", 91234, "Portuguesa", "Sporting",1234,"Artur");
		assertEquals("Sporting", atleta.getClube());
		
		atleta.setClube("benfica");
		assertEquals("benfica", atleta.getClube());
		
	}
	
	@Test
	void testNif() {
		Desportista atleta = new Desportista("9760", "Verney", 91234, "Portuguesa", "Sporting",1234,"Artur");
		assertEquals(1234, atleta.getNif());
		
		atleta.setNif(9090);
		assertEquals(9090, atleta.getNif());
	
	}
	
	@Test
	void testNome() {
		Desportista atleta = new Desportista("9760", "Verney", 91234, "Portuguesa", "Sporting" ,1234,"Artur");
		assertEquals("Artur", atleta.getNome());
		
		atleta.setNome("Joaquim");
		assertEquals("Joaquim", atleta.getNome());
		
	}
	void testExameFeito() {
		Desportista atleta = new Desportista("9760", "Verney", 91234, "Portuguesa", "Sporting" ,1234,"Artur");
		assertEquals(false, atleta.getExameFeito());
		
		atleta.setExameFeito(true);
		assertEquals(true, atleta.getExameFeito());
		
	}
}
