package ejercicios;

import java.util.Scanner;

public class E03Capicua {

	// Crea un m�todo que nos diga si un n�mero es capic�a (devuelve true en el
	// caso de que lo sea y false si no lo es).

	public static boolean esCapicua(int numero) {

		boolean resultado = false;
		int resto;
		int numInv = 0;
		int aux = numero;

		while (numero != 0) {
			resto = numero % 10;
			numInv = numInv * 10 + resto;
			numero = numero / 10;
		}

		//if (numInv == aux) {
		//	resultado = true;
		//} else {
		//	resultado = false;
		//}

		//return resultado;
		
		return numInv == aux;
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int n;
		boolean capicua;

		System.out.println("Introduce un n�mero: ");
		n = teclado.nextInt();

		capicua = esCapicua(n);

		if (capicua == true) {
			System.out.println("Capic�a = " + capicua);
		} else {
			System.out.println("Capic�a = " + capicua);
		}

	}
}
