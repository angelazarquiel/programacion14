package ejercicios.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class E01Numeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		int numero;
		int numeroPositivos = 0;
		int numeroNegativos = 0;
		int numeroCeros = 0;

		System.out.println("Introduce 10 numeros ");
		for (int i = 0; i < 10; i++) {
			numeros.add(teclado.nextInt());
		}

		//for (int i = 0; i < numeros.size(); i++)
		for (Integer num:numeros){
			//numero = numeros.get(i);
			System.out.println(num);
			if (num < 0) {
				numeroNegativos++;
			}
			if (num == 0) {
				numeroCeros++;
			}
			if (num > 0) {
				numeroPositivos++;
			}
		}

		System.out.println(" Hay " + numeroPositivos + " positivos, "
				+ numeroNegativos + " positivos y " + numeroCeros + " ceros");
	}

}
