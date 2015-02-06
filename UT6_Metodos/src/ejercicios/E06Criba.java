package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class E06Criba {

	public static void main(String[] args) {

		// basado en:
		// http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes#Implementation

		// hasta qué numero
		int n = 100;
		System.out.println("Números primos hasta " + n);

		// array de valores booleanos de 2 a n inicializados a true
		boolean[] a = new boolean[n + 1];
		Arrays.fill(a, true);

		// método para hacer la criba, devuelve un nuevo array de índices
		criba(n, a);

		// imprimir los números primos
		for (int i = 2; i <= n; i++) {
			if (a[i])
				System.out.print(i + " ");
		}
	}

	// método para la criba
	public static void criba(int tope, boolean[] indices) {
		
		for (int i = 2; i <= Math.sqrt(tope); i++) {
			if (indices[i]) {
				
				for (int j = i * i; j <= tope; j += i) {
					indices[j] = false;
				}
			}
		}

	}

}