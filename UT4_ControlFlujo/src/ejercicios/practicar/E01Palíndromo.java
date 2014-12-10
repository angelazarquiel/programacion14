package ejercicios.practicar;

import java.util.Scanner;

public class E01Palíndromo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		long numero = teclado.nextInt();
		long numeroRestante, numeroInvertido, resto;

		numeroRestante = numero;
		numeroInvertido = 0;
		resto = 0;
		while (numeroRestante != 0) {
			resto = numeroRestante % 10;
			numeroInvertido = numeroInvertido * 10 + resto;
			numeroRestante = numeroRestante / 10;
		}

		// Si el número origen y el destino son el mismo, es que es capicua
		if (numeroInvertido == numero)
			System.out.println("El numero es capicua\n");
		else
			System.out.println("El numero no es capicua\n");

	}

}
