package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E03Repetir {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num1;
		int num2;
		boolean esNumero = false;

		while (!esNumero) {
			try {
				System.out.println("Introduce numero entero");
				num1 = teclado.nextInt();

				System.out.println("Introduce otro numero entero");
				num2 = teclado.nextInt();

				double division = num1 / num2;
				System.out.println("El resultado es: " + division);
				esNumero = true;
			} catch (InputMismatchException ime) {
				System.out.println("No has introducido un numero");
				teclado.next();

			} catch (ArithmeticException ae) {
				System.out.println("No se puede dividir entre cero");

			}

		}
	}
}