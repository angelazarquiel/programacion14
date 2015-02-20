package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E24NumerosDecimales {
	static Scanner teclado=new Scanner(System.in);
	/*
	 * Escribe un programa que pida diez números
	 *  con decimales. Si insertan letras, se pedirá
	 *  de nuevo dicho número. El programa debe
	 *  visualizar el número más alto de todos
	 *  los insertados. Si se produce alguna 
	 *  excepción se mostrará el mensaje
	 *  correspondiente.
	 *  Además, al final del programa se visualizará
	 *  un mensaje que indica cuántas veces se ha
	 *  producido dicho error.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nIntroducidos = 0;
		int nErrores=0;
		double nMásAlto=-Double.MAX_VALUE;
		
		System.out.println(nMásAlto);
		
		while (nIntroducidos<10) {
			try {
				double numero=numeroDouble();
				if (nMásAlto<numero)
					nMásAlto=numero;
				nIntroducidos++;
			} catch (InputMismatchException e){
				nErrores++;
			}
		}
		
		System.out.printf("Se han producido %d errores\nEl más alto fue el %f\n",
				nErrores, (float)nMásAlto);
	}
	
	public static double numeroDouble() {
		double numeroD = 0;
		try {
			System.out
					.println("Inserte un número real:");
			numeroD = teclado.nextDouble();
		} catch (InputMismatchException e) {
			teclado.nextLine();
			System.out.println("Se ha producido un Error");
			throw e;
		}
		return numeroD;
	}
}
