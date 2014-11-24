package ejercicios.bucles;

import java.util.Scanner;

public class E04Numeros {

	/*
	 * Escribir un programa que lea tantos números como
	 *  el usuario quiera (hasta que se inserte un número
	 *  negativo). El primer número hay que visualizarlo
	 *  en la pantalla.
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numeroLeido;
		int numerosLeidos = 0;
		int primerNumero = 0;

		System.out
				.println("Introduce numero, si introduces un número negativo, el programa parará:");
		numeroLeido = teclado.nextInt();
		numerosLeidos++;
		primerNumero=numeroLeido;
		
		while (numeroLeido >= 0) {
			
			numerosLeidos++;
			System.out
					.println("Introduce otro numero, si introduces un número negativo, el programa parará:");
			numeroLeido = teclado.nextInt();

			if (numeroLeido < 0) {
					System.out.println("\nEl número es negativo. Fin del programa.");
			}
		}
	
		System.out.println("El primer número fue el:" + primerNumero);
	}

}
