package ejercicios;

import java.util.Scanner;

public class E03Rectangulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		long base;
		long altura;

		System.out
				.println("Vamos a calcular el per�metro y el �rea de un rect�ngulo. \n\nAhora introduce el valor de su base (A): ");
		base = teclado.nextLong();

		System.out
				.println("Vale, el valor (A) de su base, que has introducido es "
						+ base
						+ " , ahora introduce el valor de su altura (B): ");

		altura = teclado.nextLong();

		System.out.println("Vale, el valor de su altura (B) es " + altura
				+ ", por lo tanto el per�metro de tu rect�ngulo es "
				+ ((2 * base) + (2 * altura)) + " y su �rea es "
				+ (base * altura));

	}

}
