package ejercicios.bucles;

import java.util.Scanner;

public class E02whileAcumulador {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = 1;
		int contador = 0;
		int acumulador = 1;

		/*
		while (numero != 0) {
			multiplicar = multiplicar * numero;
			System.out.println("Dame numeros: ");
			numero = input.nextInt();
			contador++;
		}*/
		/*
		do {
			numero = input.nextInt();
			if (numero!=0) {
				acumulador *= numero;
				//acumulador = acumulador * numero;
				contador++;
			}
		} while (numero!=0);
		*/
		
		do {
			numero = input.nextInt();
			if (numero==0)
				continue;
			acumulador *= numero;
			contador++;
		} while (numero!=0);

		do {
			numero = input.nextInt();
			if (numero==0)
				break;
			acumulador *= numero;
			contador++;
		} while (true);
		
		//contador--;
		System.out.println("Has insertado " + contador
				+ " numeros y el resultado de multiplicar todos ellos es: "
				+ acumulador);

	}

}
