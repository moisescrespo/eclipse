package caja_blanca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_Caja_Blanca {

	@Test
	public void testSumarAmbosNegativos() {
		assertEquals (2, Caja_Blanca.sumar(-5, -3));
	}

	@Test
	public void testSumarUnoNegativos() {
		assertEquals (0, Caja_Blanca.sumar(0, 5));
	}
	
	@Test
	public void testSumarCero() {
		assertEquals (10, Caja_Blanca.sumar(4, 6));
	}
	
	
	@Test
	public void testRestarMenor() {
		assertEquals (1, Caja_Blanca.restar(3, 7));
	}
	
	@Test
	public void testRestarIguales() {
		assertEquals (0, Caja_Blanca.restar(5, 5));
	}
	
	@Test
	public void testRestarMayor() {
		assertEquals (4, Caja_Blanca.restar(10, 6));
	}
	
}
