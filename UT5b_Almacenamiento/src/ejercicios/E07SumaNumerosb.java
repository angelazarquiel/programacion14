package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class E07SumaNumerosb {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out
				.println("Introduce una cadena y el programa sumará los números:");
		String cadena = teclado.nextLine();
		int suma=0;
		int numero=0;

		// analizar la cadena. Si encuentra una cifra, la va almacenando en el
		// valor n del array.
		// Si el carácter no es cifra, incrementar el índice para que el
		// siguiente número lo empiece a
		// guardar en el siguiente valor del array.

		for (int i = 0; i < cadena.length(); i++) {
			if (Character.isDigit(cadena.charAt(i))) {
				numero=numero*10+Integer.parseInt(String.valueOf(cadena.charAt(i)));													
			} else {
				suma=suma+numero;
				numero=0;
			}
		}

		System.out.println(suma);
	}

}
