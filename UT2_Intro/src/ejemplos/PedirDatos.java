package ejemplos;

import java.util.Scanner;

public class PedirDatos {

	public static void main2(String[] args) {
		Scanner teclado = new Scanner(System.in);
		long numeroLeido;

		System.out.println("Dame un n�mero: ");
		numeroLeido=teclado.nextLong();
		System.out.println("Has escrito: " + numeroLeido);
	}
	
	public static void main3(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numeroLeido;

		System.out.println("Dame un n�mero: ");
		numeroLeido=teclado.nextDouble();
		System.out.println("Has escrito: " + numeroLeido);
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String l�nea;

		System.out.println("Escribe algo: ");
		l�nea=teclado.nextLine();
		System.out.println("Has escrito: " + l�nea);
	}
	
}
