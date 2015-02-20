package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E24NumerosDecimales {
	static Scanner teclado=new Scanner(System.in);
	/*
	 * Escribe un programa que pida diez n�meros
	 *  con decimales. Si insertan letras, se pedir�
	 *  de nuevo dicho n�mero. El programa debe
	 *  visualizar el n�mero m�s alto de todos
	 *  los insertados. Si se produce alguna 
	 *  excepci�n se mostrar� el mensaje
	 *  correspondiente.
	 *  Adem�s, al final del programa se visualizar�
	 *  un mensaje que indica cu�ntas veces se ha
	 *  producido dicho error.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nIntroducidos = 0;
		int nErrores=0;
		double nM�sAlto=-Double.MAX_VALUE;
		
		System.out.println(nM�sAlto);
		
		while (nIntroducidos<10) {
			try {
				double numero=numeroDouble();
				if (nM�sAlto<numero)
					nM�sAlto=numero;
				nIntroducidos++;
			} catch (InputMismatchException e){
				nErrores++;
			}
		}
		
		System.out.printf("Se han producido %d errores\nEl m�s alto fue el %f\n",
				nErrores, (float)nM�sAlto);
	}
	
	public static double numeroDouble() {
		double numeroD = 0;
		try {
			System.out
					.println("Inserte un n�mero real:");
			numeroD = teclado.nextDouble();
		} catch (InputMismatchException e) {
			teclado.nextLine();
			System.out.println("Se ha producido un Error");
			throw e;
		}
		return numeroD;
	}
}
