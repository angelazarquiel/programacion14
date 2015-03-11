package ejercicios.bloque2.pruebas;

import java.util.Scanner;

public class MiNumero {

	/*
	 * Ejercicio 4. Realiza una clase MiNumero que proporcione el doble, triple
	 * y cuádruple de un número proporcionado en su constructor (realiza un
	 * método para doble, otro para triple y otro para cuádruple). En este caso
	 * haz que la clase tenga un método main y comprueba los distintos métodos,
	 * sin necesidad de crear un método de prueba.
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
					.print("Introduce número entero (para salir, escribe 0): ");
			int nuevoNum = teclado.nextInt();
			num.setNumero(nuevoNum);
			System.out
					.printf("El número introducido es %d\nDoble: %d\nTriple: %d\nCuádruple: %d\n\n",
							num.getNumero(), num.doble(), num.triple(),
							num.cuadruple());

		}

	}

}