package ejercicios.bloque2.pruebas;

import java.util.Scanner;

public class MiNumero {

	/*
	 * Ejercicio 4. Realiza una clase MiNumero que proporcione el doble, triple
	 * y cu�druple de un n�mero proporcionado en su constructor (realiza un
	 * m�todo para doble, otro para triple y otro para cu�druple). En este caso
	 * haz que la clase tenga un m�todo main y comprueba los distintos m�todos,
	 * sin necesidad de crear un m�todo de prueba.
	 */

	private int numero;

	public MiNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int doble() {
		return numero * 2;
	}

	public int triple() {
		return numero * 3;
	}

	public int cuadruple() {
		return numero * 4;
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		MiNumero num = new MiNumero(1);
		while (num.getNumero() != 0) {
			System.out
					.print("Introduce n�mero entero (para salir, escribe 0): ");
			int nuevoNum = teclado.nextInt();
			num.setNumero(nuevoNum);
			System.out
					.printf("El n�mero introducido es %d\nDoble: %d\nTriple: %d\nCu�druple: %d\n\n",
							num.getNumero(), num.doble(), num.triple(),
							num.cuadruple());

		}

	}

}