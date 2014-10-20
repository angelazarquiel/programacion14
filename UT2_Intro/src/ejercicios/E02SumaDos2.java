package ejercicios;

import java.util.Scanner;

public class E02SumaDos2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		long numero1;
		long numero2;

		System.out.println("Introduce el primer número: ");
		numero1 = teclado.nextLong();

		System.out.println("Vale, tu primer número es: " + numero1
				+ ". \n\nAhora introduce tu segundo número: ");

		numero2 = teclado.nextLong();

		System.out.println("Vale, tu segundo número ha sido " + numero2
				+ ", entonces:\nLa suma de los dos es " + (numero1 + numero2)
				+ " ,\nsu producto es " + numero1 * numero2 + "\ny su media es "
				+ (numero1 + numero2) / 2);
	}

}
