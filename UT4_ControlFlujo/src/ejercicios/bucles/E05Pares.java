package ejercicios.bucles;

import java.util.Scanner;

public class E05Pares {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int pedirnumero;
		boolean par = false;


		do {
			System.out
					.println("Introduce otro numero, si introduces un número negativo, el programa parará:");
			pedirnumero = teclado.nextInt();

			if (!par && pedirnumero >= 0) {
					System.out
							.println("\n----El número que has introducido es "
									+ pedirnumero + ".\n");
			}
			par=!par;
		} while (pedirnumero >= 0);
		
		System.out
		.println("\nEl número es negativo. Fin del programa.");
	}
	
}
