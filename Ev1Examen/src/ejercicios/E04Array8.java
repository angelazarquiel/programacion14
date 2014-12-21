package ejercicios;

import java.util.Scanner;

public class E04Array8 {

	public static void main(String[] args) {
		int[] test;
		boolean solo = false;
		Scanner input = new Scanner(System.in);
		int numeros;
		
		//leemos números a leer
		System.out.print("Números a leer: ");
		numeros = input.nextInt();
		
		// vamos leyendo
		test = new int[numeros];
		System.out.println("Escribe " + numeros + " números:");
		for (int i = 0; i < numeros; i++) {
			test[i] = input.nextInt();
		}

		if (test.length == 0)
			solo = false;
		else if (test.length == 1)
			if (test[0] == 8)
				solo = true;
			else
				solo = false;
		else {
			for (int i = 1; i < test.length - 1; i++) {
				if (test[i - 1] != 8 && test[i] == 8 && test[i + 1] != 8)
					solo = true;
			}
	
			if (test[0] == 8 && test[1] != 8)
				solo = true;
			if (test[test.length - 1] == 8 && test[test.length - 2] != 8)
				solo = true;
		}
		
		if (solo)
			System.out.println("El array contiene 8's NO chulos");
		else
			System.out.println("El array solo contiene 8's chulos");

	}

}
