package ejercicios.bucles;

import java.util.Scanner;

public class E04bNumeros {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numeroLeido;
		int primerNumero = 0;
		boolean primero=true;

		System.out
				.println("Introduce numero, si introduces un n�mero negativo, el programa parar�:");
		
		do {
			System.out
					.println("Introduce otro numero, si introduces un n�mero negativo, el programa parar�:");
			numeroLeido = teclado.nextInt();
			if (primero)
			{
				primerNumero=numeroLeido;
				primero=false;
			}
			if (numeroLeido < 0) {
					System.out.println("\nEl n�mero es negativo. Fin del programa.");
			}
		} while (numeroLeido >= 0);
	
		System.out.println("El primer n�mero fue el:" + primerNumero);

	}

}
