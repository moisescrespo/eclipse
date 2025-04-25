package caja_negra;

public class Empleado {

	// Atributos
	 
	private String nombre;
	private double salario;
	private int antiguedad;
	
	// Constructor
	public Empleado(String nombre, double salario, int antiguedad) {
		this.nombre = nombre;
		this.salario = salario;
		this.antiguedad = antiguedad;
	}
	 
	// Método para obtener el salario con bonificación
	
	public double calcularSalarioConBonificacion() {
	
		if (antiguedad < 1) {
			return salario; // Sin bonificación si tiene menos de 1 año
		} else if (antiguedad >= 1 && antiguedad <= 5) {
			return salario * 1.10; // Bonificación del 10% si tiene entre 1 y 5 años
		} else {
			return salario * 1.20; // Bonificación del 20% si tiene más de 5 años
		} 
	}
		
	// Método para obtener el nombre del empleado
		
	public String obtenerNombre() {
		return nombre;
	}
		
	// Método para obtener la antigüedad
		
	public int obtenerAntiguedad() { 
		return antiguedad;
	}
		 
	// Método para obtener el salario base
		
	public double obtenerSalario() {
		return salario;
	}
	 
	
}
