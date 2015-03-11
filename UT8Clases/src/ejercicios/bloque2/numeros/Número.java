package ejercicios.bloque2.numeros;

import java.util.Scanner;

public class N�mero {

	/*
	 * Ejercicio 4. Realiza una clase MiNumero que proporcione el doble, triple
	 * y cu�druple de un n�mero proporcionado en su constructor (realiza un
	 * m�todo para doble, otro para triple y otro para cu�druple). En este caso
	 * haz que la clase tenga un m�todo main y comprueba los distintos m�todos,
	 * sin necesidad de crear un m�todo de prueba.
	 */

	private int numero;

	public N�mero() {
		numero=0;
	}
	
	public N�mero(int numero) {
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
		N�mero num = new N�mero();
		
		num.suma(20);
		num.resta(5);
		num.suma(num.getDoble());
		System.out.println(num.getValor());
		

	}

}
