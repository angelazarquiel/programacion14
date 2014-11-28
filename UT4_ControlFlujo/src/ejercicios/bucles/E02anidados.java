package ejercicios.bucles;

import java.util.Scanner;

public class E02anidados {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numerotabla = 0;
		do {
			// leer numero
			System.out.println("Introduce el número de la tabla:");
			numerotabla = teclado.nextInt();

			// imprimir la tabla de ese numero si esta entre 1 y 10
			if (numerotabla >= 1 && numerotabla <= 10) {
				// imprimir la tabla
				for (int i = 1; i <= 10; i++) {
					System.out.println(numerotabla + " X " + i + " = "
							+ numerotabla * i);
				}
			} else {
				System.out.println("El numero no esta entre 1 y 10");
			}

			// seguir si el numero fue entre 1 y 10
		} while (numerotabla >= 1 && numerotabla <= 10);
		
		/*
		do {
			// leer numero
			System.out.println("Introduce el número de la tabla:");
			numerotabla = teclado.nextInt();

			// imprimir la tabla de ese numero si esta entre 1 y 10
			
			if (!(numerotabla >= 1 && numerotabla <= 10)) {
				System.out.println("El numero no esta entre 1 y 10");
				break;
			}
			
			for (int i = 1; i <= 10; i++) {
					System.out.println(numerotabla + " X " + i + " = "
							+ numerotabla * i);
				}

			// seguir si el numero fue entre 1 y 10
		} while (true);
		*/
	}

}
