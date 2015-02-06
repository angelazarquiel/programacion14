package ejercicios;

import java.util.*;

public class E05AdivinaNumero {

	// Escriba un programa que simule el juego de adivinar un número.
	// El ordenador debe generar un número entre 1 y 100 y el usuario tiene que
	// intentar adivinarlo.
	// Para ello, cada vez que el usuario introduce un valor
	// el ordenador debe decirle al usuario si el número a adivinar es mayor o
	// menor que el introducido.
	// Cuando consiga adivinarlo debe indicárselo
	// e imprimir en pantalla el número de veces que el usuario ha intentado
	// adivinar dicho número.
	// Estructura el programa con los métodos que estimes necesarios, teniendo
	// en cuenta que debe ser lo más legible posible.

	// crear método que genere número aleatorio
	public static int generarAleatorio1_100() {

		int aleatorio = (int) (Math.random() * 100 + 1);

		return aleatorio;
	}

	// crear método que compare el número introducido con el número aleatorio
	public static boolean comprobarNumeros(int numero, int aleatorio) {

		// si es igual, imprimir que acertado
		if (numero == aleatorio) {
			System.out.println("Has acertado!");
			return true;
		}

		// si es menor, decir que el número oculto es mayor
		if (numero < aleatorio) {
			System.out.println("El número oculto es mayor");
		}

		// si es mayor, decir que el número oculto es menor
		if (numero > aleatorio) {
			System.out.println("El número oculto es menor");
		}

		return false;
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// aleatorio, que guardará el valor generado por el método
		// generarAleatorio
		int aleatorio = generarAleatorio1_100();
		// n, que contendrá el valor que introduzcamos por teclado
		int n;
		// contador, que irá almacenando el número de intentos que realizamos
		int contador = 0;

		System.out.println("---Adivina un número entre 1 y 100---");

		// bucle que vaya pidiendo número (variable n), mientras no sea igual
		// que el número aleatorio
		// compruebe el número aleatorio con el número introducido
		// incremente en 1 el contador
		do {

			System.out.println("Introduce un número: ");
			n = teclado.nextInt();

			contador++;

		} while (!comprobarNumeros(n, aleatorio));

		// imprimir el número de intentos almacenado en la variable "contador"
		System.out.println("Número de intentos hasta acertar: " + contador);
	}

}