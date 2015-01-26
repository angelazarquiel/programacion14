package ejercicios.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class E03Fibonacci {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> fibo = new ArrayList<Integer>();

		System.out
				.print("Serie Fibonacci. \nIntroduce la cantidad de n�meros para tu serie: ");
		int cantidad = teclado.nextInt();
		int buscar;
		boolean esta = false;

		fibo.add(1);
		fibo.add(1);

		for (int i = 2; i < cantidad; i++) {
			fibo.add(fibo.get(i - 2) + fibo.get(i - 1));
		}

		System.out.println("\nTu serie tendr� " + cantidad
				+ " n�meros.\n\nLa serie resultante es:");
		System.out.println(fibo);

		do {
			System.out
					.print("\n�Quieres buscar alg�n n�mero? introduce 0 para parar: ");
			buscar = teclado.nextInt();

			esta=fibo.contains(buscar);
			//for (int i = 0; i < cantidad; i++) {
				if (esta){//(buscar == fibo.get(i))) {
					System.out.println("\nEl n�mero S� est� en la serie.");
				//	esta = true;
				}

			//}

			if (!esta) {
				System.out.println("\nEl n�mero NO est� en la serie.");
			}

			esta = false;

		} while (buscar != 0);

		System.out.println("\n**********************************");
		System.out.println("EL PROGRAMA HA TERMINADO. �Adi�s!");
		System.out.println("**********************************");

	}
}
