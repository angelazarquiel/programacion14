package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class E07SumaNumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out
				.println("Introduce una cadena y el programa sumar� los n�meros:");
		String cadena = teclado.nextLine();
		
		String[] numeros = new String[100]; // array de 100 cadenas por defecto
		Arrays.fill(numeros, "0");
		int indiceNumero = 0;

		// analizar la cadena. Si encuentra una cifra, la va almacenando en el
		// valor n del array.
		// Si el car�cter no es cifra, incrementar el �ndice para que el
		// siguiente n�mero lo empiece a
		// guardar en el siguiente valor del array.

		for (int i = 0; i < cadena.length(); i++) {
			if (Character.isDigit(cadena.charAt(i))) {
				numeros[indiceNumero] = numeros[indiceNumero].concat(String
						.valueOf(cadena.charAt(i))); // concatena un string y un
														// char pasado a string
			} else {
				indiceNumero++;
			}
		}

		// sumar los n�meros del array, convirtiendo las cadenas en n�meros
		int suma = 0;
		for (int i = 0; i < 100; i++) {
			suma += Integer.parseInt(numeros[i]);
		}
		System.out.println(suma);
	}

}
