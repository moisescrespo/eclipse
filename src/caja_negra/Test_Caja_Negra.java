package caja_negra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_Caja_Negra {

	@Test
	public void testSinBonificacion() {
	    Empleado e = new Empleado("Ana", 1000.0, 0);
	    assertEquals(1000.0, e.calcularSalarioConBonificacion());
	}

	@Test
	public void testBonificacion10PorCiento() {
	    Empleado e = new Empleado("Luis", 1000.0, 3);
	    assertEquals(1100.0, e.calcularSalarioConBonificacion());
	}

	@Test
	public void testBonificacion20PorCiento() {
	    Empleado e = new Empleado("Carla", 1000.0, 6);
	    assertEquals(1200.0, e.calcularSalarioConBonificacion());
	}

	@Test
	public void testAntiguedadNegativa() {
	    Empleado e = new Empleado("Pedro", 1000.0, -1);
	    assertEquals(1000.0, e.calcularSalarioConBonificacion());
	}

	@Test
	public void testSalarioNegativo() {
	    Empleado e = new Empleado("Sofia", -500.0, 2);
	    assertEquals(-550.0, e.calcularSalarioConBonificacion());
	}


}
