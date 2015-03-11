package ejercicios.bloque2.numeros;

import java.util.Scanner;

public class Número {

	/*
	 * Ejercicio 4. Realiza una clase MiNumero que proporcione el doble, triple
	 * y cuádruple de un número proporcionado en su constructor (realiza un
	 * método para doble, otro para triple y otro para cuádruple). En este caso
	 * haz que la clase tenga un método main y comprueba los distintos métodos,
	 * sin necesidad de crear un método de prueba.
	 */

	private int numero;

	public Número() {
		numero=0;
	}
	
	public Número(int numero) {
		this.numero = numero;
	}

	public void suma(int numero) {
		this.numero+=numero;
	}
	
	public void resta(int numero) {
		this.numero-=numero;
	}
	
	public int getValor() {
		return this.numero;
	}
	
	public int getDoble() {
		return numero * 2;
	}

	public int getTriple() {
		return numero * 3;
	}

	public void setNumero(int numero) {
		this.numero=numero;
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Número num = new Número();
		
		num.suma(20);
		num.resta(5);
		num.suma(num.getDoble());
		System.out.println(num.getValor());
		

	}

}
