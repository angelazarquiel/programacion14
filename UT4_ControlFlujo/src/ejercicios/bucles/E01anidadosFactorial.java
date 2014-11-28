package ejercicios.bucles;

import java.util.Scanner;

public class E01anidadosFactorial {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String respuesta;
		boolean entra = true;

		// Tengo que pedir [s/n]

		while (entra) {

			System.out.println("¿Quieres continuar? [s/n]");
			respuesta = teclado.next();
			if (!(respuesta.equalsIgnoreCase("n") || respuesta
					.equalsIgnoreCase("s"))) {
				System.out.println("No has introducido una opción");
				continue;
			}

			if (respuesta.equalsIgnoreCase("s")) {
				System.out.println("Escribe un número a factorizar");
				int num = teclado.nextInt();
				if (!(num >= 0)) {
					System.out.println("El numero debe ser positivo");
					continue;
				}
				int i = num;

				while (i != 1) {
					num = num * --i;
				}
				/*
				for(int i=num-1;i!=1;i--)
					num=num*i;
				*/
				System.out.println("El resultado es: " + num);
			} else {
				entra = false;
			}

		}

	}

}
