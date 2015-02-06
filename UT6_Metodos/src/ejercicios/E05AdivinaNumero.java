package ejercicios;

import java.util.*;

public class E05AdivinaNumero {

	// Escriba un programa que simule el juego de adivinar un n�mero.
	// El ordenador debe generar un n�mero entre 1 y 100 y el usuario tiene que
	// intentar adivinarlo.
	// Para ello, cada vez que el usuario introduce un valor
	// el ordenador debe decirle al usuario si el n�mero a adivinar es mayor o
	// menor que el introducido.
	// Cuando consiga adivinarlo debe indic�rselo
	// e imprimir en pantalla el n�mero de veces que el usuario ha intentado
	// adivinar dicho n�mero.
	// Estructura el programa con los m�todos que estimes necesarios, teniendo
	// en cuenta que debe ser lo m�s legible posible.

	// crear m�todo que genere n�mero aleatorio
	public static int generarAleatorio1_100() {

		int aleatorio = (int) (Math.random() * 100 + 1);

		return aleatorio;
	}

	// crear m�todo que compare el n�mero introducido con el n�mero aleatorio
	public static boolean comprobarNumeros(int numero, int aleatorio) {

		// si es igual, imprimir que acertado
		if (numero == aleatorio) {
			System.out.println("Has acertado!");
			return true;
		}

		// si es menor, decir que el n�mero oculto es mayor
		if (numero < aleatorio) {
			System.out.println("El n�mero oculto es mayor");
		}

		// si es mayor, decir que el n�mero oculto es menor
		if (numero > aleatorio) {
			System.out.println("El n�mero oculto es menor");
		}

		return false;
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// aleatorio, que guardar� el valor generado por el m�todo
		// generarAleatorio
		int aleatorio = generarAleatorio1_100();
		// n, que contendr� el valor que introduzcamos por teclado
		int n;
		// contador, que ir� almacenando el n�mero de intentos que realizamos
		int contador = 0;

		System.out.println("---Adivina un n�mero entre 1 y 100---");

		// bucle que vaya pidiendo n�mero (variable n), mientras no sea igual
		// que el n�mero aleatorio
		// compruebe el n�mero aleatorio con el n�mero introducido
		// incremente en 1 el contador
		do {

			System.out.println("Introduce un n�mero: ");
			n = teclado.nextInt();

			contador++;

		} while (!comprobarNumeros(n, aleatorio));

		// imprimir el n�mero de intentos almacenado en la variable "contador"
		System.out.println("N�mero de intentos hasta acertar: " + contador);
	}

}