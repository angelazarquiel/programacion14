package ejercicios;

import java.util.Scanner;

public class E04Menor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero1, numero2, numero3;

		System.out.println("Introduce el primer n�mero :");
		numero1 = teclado.nextInt();
		System.out.println("Introduce el segundo n�mero :");
		numero2 = teclado.nextInt();
		System.out.println("Introduce el tercer n�mero :");
		numero3 = teclado.nextInt();

		if (numero1 > numero2) {
			if (numero1 > numero3) {
				System.out.printf("El n�mero " + numero1 + " es el mayor");
			} else {
				System.out.printf("El n�mero " + numero3 + " es el mayor");
			}
		} else {
			if (numero2 > numero3) {
				System.out.printf("El n�mero " + numero2 + " es el mayor");
			} else {
				System.out.println("El n�mero " + numero3 + " es el mayor");
			}
		}
		
		int mayor;
		
		mayor=numero1;
		if (numero2>mayor)
			mayor=numero2;
		if (numero3>mayor)
			mayor=numero3;
		System.out.println("El n�mero " + mayor + " es el mayor");
		

	}

}
