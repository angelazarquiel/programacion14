package ejercicios.cadenas;

import java.util.Scanner;

public class Ej04 {
	public static Scanner teclado = new Scanner(System.in);

	public static String rotarCadena(String cadena, int posiciones) {
		StringBuilder frase = new StringBuilder(cadena);

		posiciones = posiciones % frase.length();

		/*
		for(int i=0;i<posiciones;i++) {
			frase.insert(0, frase.charAt(frase.length()-1));
			frase.deleteCharAt(frase.length()-1);
		}*/
		
		
		frase.insert(0,frase.substring(frase.length() - posiciones));
		frase.delete(frase.length()-posiciones,frase.length());
				

		return frase.toString();

	}

	public static void main(String[] args) {
		System.out.print("Introduce una frase a rotar: ");
		String cadena = teclado.nextLine();

		System.out.print("Introduce ahora las posiciones a rotar: ");
		int posiciones = teclado.nextInt();

		String resultado = rotarCadena(cadena, posiciones);

		System.out.println(resultado);

	}
}
