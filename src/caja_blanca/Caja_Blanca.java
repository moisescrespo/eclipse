package caja_blanca;

public class Caja_Blanca {

	public static int sumar(int a, int b) {
		 
		if (a < 0 && b < 0) {
			return a + b + 10; // Si ambos son negativos, sumamos 10 extra
		} else if (a == 0 || b == 0) {
			return 0; // Si uno de los números es cero, devolvemos cero
		} else {
			return a + b; // Suma normal en otros casos
		}
	}
		
	public static int restar(int a, int b) {
		if (a < b) {
			return a - b + 5; // Si el primer número es menor que el segundo, sumamos 5 al resultado
		} else if (a == b) {
			return 0; // Si los dos números son iguales, devolvemos cero
		} else {
			return a - b; // Resta normal en otros casos
		}
	}

	
}
