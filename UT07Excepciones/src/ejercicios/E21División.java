package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E21División {
	public static void main(String[] args) {
		int dividendo = 0, divisor = 0;
		boolean leido;
		double resultado;
		Scanner teclado = new Scanner(System.in);
		
		leido = false;
		do {
			imprimeTitulo();
			try {
				System.out.print("Introduzca el DIVIDENDO: ");
				dividendo = teclado.nextInt();
				System.out.print("Introduzca el DIVISOR: ");
				divisor = teclado.nextInt();
				leido = true;
				resultado = dividendo / divisor;
				System.out.println("Resultado es: " + resultado);
			} catch (ArithmeticException ae) {
				System.out.println("Resultado es: infinito");
				imprimeExcepción(ae);
			} catch (InputMismatchException  ime) {
				leido = false;
				imprimeExcepción(ime);
				teclado.nextLine();
			} catch (Exception e) {
				leido = false;
				// Captura cualquier otra excepción
				imprimeExcepción(e);
				teclado.nextLine();
			}
		} while (!leido);
		teclado.close();
	}

	private static void imprimeExcepción(Exception e) {
		System.err.println(e.getMessage());
		System.err.println(e.toString());
		e.printStackTrace(System.err);
	}

	private static void imprimeTitulo() {
		for (int i = 0; i < 25; i++) {
			System.out.print(" *");
		}
		System.out.println("\nEscriba dos números para calcular su división:");
	}

}
