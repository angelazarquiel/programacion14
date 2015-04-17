package ejercicios.cadenas;

import java.util.Scanner;

public class Ej03 {
	public static void main(String[] args) {
		// Escribe un programa que codifique usando cifrado César.
		// Haz una primera versión en que cada letra se sustituya por el
		// caracter siguiente.
		// Por ejemplo “Hola" pasa a ser "Ipmb".
		// Haz una segunda versión en que se pida un número por teclado y
		// la codificación se haga incrementando cada carácter por esa cantidad,
		// por ejemplo si introducimos 3, "Hola" pasa a ser "Krñd".

		// VERSION 1
		StringBuilder palabra = new StringBuilder("Hola");
		String abecedario = new String(
				"abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ");

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
				"abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ");

		System.out.println("Indica el número de posiciones a cifrar: ");
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
