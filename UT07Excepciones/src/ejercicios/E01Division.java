package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E01Division {

	public static void main(String[] args) {
		
		int numero1, numero2, division;
		
		Scanner teclado = new Scanner(System.in);	

		try {
			
			System.out.println("Introduzca un numero: ");
			numero1 = teclado.nextInt();
			System.out.println("Entre que numero desea dividir " + numero1 + ": ");
			numero2 = teclado.nextInt();
			division = numero1/numero2;
			
		} catch (InputMismatchException ex) {
			
			System.out.println("Uno de los valores introducidos no es correcto: " + ex.getMessage());
			
		} catch (ArithmeticException aex) {
			
			System.out.println("Esta operacion no se puede realizar: " + aex.getMessage());
		}
	}
}
