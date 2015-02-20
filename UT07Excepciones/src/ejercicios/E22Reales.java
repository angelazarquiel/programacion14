package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E22Reales {
	static Scanner teclado;

	public static double numeroDouble() {
		double numeroD = 0;
		try {
			System.out
					.println("Inserte un número real con un máximo de 8 bytes: (tipo double)");
			numeroD = teclado.nextDouble();
		} catch (InputMismatchException e) {
			teclado.nextLine();
			System.out.println("Se ha producido un Error");
			throw e;
		}
		return numeroD;
	}

	public static float numeroFloat() {
		float numeroF = 0;
		try {
			System.out
					.println("Inserte un número real con un máximo de 4 bytes: (tipo float)");
			numeroF = teclado.nextFloat();
		} catch (InputMismatchException e) {
			System.out.println("Se ha producido un Error");
			teclado.nextLine();
			throw e;
		}
		return numeroF;
	}

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		double nD;
		float nF;
		double numeroMayor;
		boolean leidos;
		do {
			try {
				leidos = true;
				nD = numeroDouble();
				nF = numeroFloat();
				numeroMayor = Math.max(nD, nF);
				System.out.println("El número mayor de los introducidos es: "
						+ numeroMayor);
			} catch (InputMismatchException e) {
				leidos = false;
			}
		} while (!leidos);
	}
}
