package ejercicios.bucles;

import java.util.Scanner;

public class E04forMedia {

	public static void main(String[] args) {
		int contador, par = 0;
		//boolean par=false;
		double numero, suma = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Este programa permite introducir cuantos n�meros "
				+ "quiera el usuario para realizar la media."
				+ "\n Introduzca la cantidad de n�meros a introducir: ");
		
		contador = teclado.nextInt();
		System.out.print("\n");

		for (int i = 1; i <= contador; i++) {
			System.out.println("N� de valores a introducir restantes: "
					+ ((contador + 1) - i));
			System.out.print(" Introduzca un n�mero: ");
			numero = teclado.nextInt();
			if (numero % 2 == 0) {
				par++;
			}
			// if (numero%2==0) par=true;
			suma = numero + suma;
			System.out.print("\n");
		}
		System.out.print("\n La suma total da " + suma + ".");
		System.out.print("\n La media de todos los n�meros es " + (suma / contador)
				+ ".");
		//if (par) System.out.print("\n Se han introducido n�meros pares");
		
		if (par != 0) {
			if (par == 1) {
				System.out
						.print("\n Se ha introducido " + par + " n�mero par.");
			} else
				System.out.print("\n Se han introducido " + par
						+ " n�meros pares.");
		}

	}

}
