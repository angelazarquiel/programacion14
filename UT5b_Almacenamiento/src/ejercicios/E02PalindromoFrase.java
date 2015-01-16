package ejercicios;

import java.util.Scanner;

public class E02PalindromoFrase {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean palindromo = true;
		String palabra;
		System.out.println("Introduce una palabra: ");
		palabra = teclado.nextLine();
		palabra = palabra.toLowerCase();

		String noespacios = palabra.replace(" ", "");
		noespacios = noespacios.replace(".", "");
		noespacios = noespacios.replace(",", "");
		
		//reemplazo con expresión regular
		//noespacios = palabra.replaceAll("[., ]","");
		//System.out.println(noespacios);

		for (int i = 0; i < noespacios.length() / 2; i++) {
			if (noespacios.charAt(i) != noespacios.charAt(noespacios.length() - i
					- 1)) {
				palindromo = false;
				break;
			}

		}
		if (palindromo)
			System.out.println(palabra + " es palindromo ");
		else
			System.out.println(palabra + " NO es palindromo");
	}

}
