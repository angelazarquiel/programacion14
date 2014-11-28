package ejercicios.bucles;

import java.util.Scanner;

public class E03for {
	public static void main(String[] args) {
		int num, i, acumulador;

		acumulador = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce 6 numeros: ");
		for (i = 0; i < 6; i++) {

			num = teclado.nextInt();
			acumulador += num;

		}
		System.out.println("La suma es " + acumulador);
	}
}
