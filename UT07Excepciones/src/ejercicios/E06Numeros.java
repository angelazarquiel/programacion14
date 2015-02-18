package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E06Numeros {
	static Scanner teclado;

	public static int leeEntero() {
		boolean hayDatosErroneos;
		int numero = 0;
		
		hayDatosErroneos = true;
		
		do {
			try {
				System.out.print("Indroduzca un número entero: ");
				numero = teclado.nextInt();
				hayDatosErroneos = false;
			} catch (InputMismatchException entradaInvalida) {
				String linea = teclado.nextLine();  		// si nextInt() falló leemos lo que queda
				if (Character.isDigit(linea.charAt(0))) {	// si comenzaba con números, volvemos a intentarlo
					System.out
							.println("No se ha podido leer el número, vuelva a intentarlo.");
				} else {
					throw entradaInvalida;					// si se introdujo una letra relanzamos excepción
				}
			}
		} while (hayDatosErroneos);
		return numero;
	}

	public static void main(String[] args) {
		int suma, contador;
		teclado = new Scanner(System.in);
		
		System.out.print("Suma de números (máximo 6)\n==========================\n");
		
		for (contador = 0, suma = 0; contador < 6; contador++)
			try {
				suma += leeEntero();
			} catch (Exception e) { // si nos llega cualquier excepción se deja
									// de sumar
				break;
			}
		
		System.out.printf("\nSe han contado %d números, que suman %d\n",
				contador, suma);
	}
}
