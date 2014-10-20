package ejemplos;

import java.util.Scanner;

public class PedirDatos {

	public static void main2(String[] args) {
		Scanner teclado = new Scanner(System.in);
		long numeroLeido;

		System.out.println("Dame un número: ");
		numeroLeido=teclado.nextLong();
		System.out.println("Has escrito: " + numeroLeido);
	}
	
	public static void main3(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numeroLeido;

		System.out.println("Dame un número: ");
		numeroLeido=teclado.nextDouble();
		System.out.println("Has escrito: " + numeroLeido);
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String línea;

		System.out.println("Escribe algo: ");
		línea=teclado.nextLine();
		System.out.println("Has escrito: " + línea);
	}
	
}
