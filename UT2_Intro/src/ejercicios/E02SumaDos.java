package ejercicios;

import java.util.Scanner;

public class E02SumaDos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1;
		int numero2;

		System.out.println("Introduce el primer número: ");
		numero1 = teclado.nextInt();

		System.out.println("Vale, tu primer número es: " + numero1
				+ ". \n\nAhora introduce tu segundo número: ");

		numero2 = (int) teclado.nextLong(); // cast a integer

		int suma=(numero1 + numero2);
		int multiplicacion=numero1 * numero2;
		float media=((float)numero1 + (float)numero2) / 2;
		System.out.println("Vale, tu segundo número ha sido " + numero2
				+ ", entonces:\nLa suma de los dos es " + suma 
				+ " ,\nsu producto es " + multiplicacion + "\ny su media es "
				+ media);
	}

}
