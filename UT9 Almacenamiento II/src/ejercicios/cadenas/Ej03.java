package ejercicios.cadenas;

import java.util.Scanner;

public class Ej03 {
	public static void main(String[] args) {
		// Escribe un programa que codifique usando cifrado C�sar.
		// Haz una primera versi�n en que cada letra se sustituya por el
		// caracter siguiente.
		// Por ejemplo �Hola" pasa a ser "Ipmb".
		// Haz una segunda versi�n en que se pida un n�mero por teclado y
		// la codificaci�n se haga incrementando cada car�cter por esa cantidad,
		// por ejemplo si introducimos 3, "Hola" pasa a ser "Kr�d".

		// VERSION 1
		StringBuilder palabra = new StringBuilder("Hola");
		String abecedario = new String(
				"abcdefghijklmn�opqrstuvwxyzABCDEFGHIJKLMN�OPQRSTUVWXYZ");

		for (int i = 0; i < palabra.length(); i++) {
			
			palabra.setCharAt(i, 
					abecedario.charAt(
							(abecedario.indexOf(palabra.charAt(i))+1)
							%abecedario.length()));
			
		}

		System.out.println(palabra.toString());

		// VERSION 2

		Scanner teclado = new Scanner(System.in);

		StringBuilder palabra2 = new StringBuilder("Hola");
		StringBuilder abecedario2 = new StringBuilder(
				"abcdefghijklmn�opqrstuvwxyzABCDEFGHIJKLMN�OPQRSTUVWXYZ");

		System.out.println("Indica el n�mero de posiciones a cifrar: ");
		int posiciones = teclado.nextInt();

		for (int i = 0; i < palabra2.length(); i++) {
			for (int j = 0; j < abecedario2.length(); j++) {
				if (abecedario2.charAt(j) == palabra2.charAt(i)) {
					j += posiciones;
					palabra2.setCharAt(i, abecedario2.charAt(j));
				}
			}
		}

		System.out.println(palabra2.toString());
	}
}
