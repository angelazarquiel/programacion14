package ejercicios;

import java.util.Scanner;

public class E04Array2 {

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
			if (test[0] == 2)
				solo = true;
			else
				solo = false;
		else {
			for (int i = 1; i < test.length - 1; i++) {
				if (test[i - 1] != 2 && test[i] == 2 && test[i + 1] != 2)
					solo = true;
			}
	
			if (test[0] == 2 && test[1] != 2)
				solo = true;
			if (test[test.length - 1] == 2 && test[test.length - 2] != 2)
				solo = true;
		}
		
		if (solo)
			System.out.println("El array contiene 2's solicos");
		else
			System.out.println("El array no contiene ningún 2 solico");
			

		// twoTwo({4, 2, 2, 3}) -> truetrueOK twoTwo({2, 2, 4}) -> truetrueOK
		// twoTwo({2, 2, 4, 2}) -> falsefalseOK twoTwo({1, 3, 4}) -> truetrueOK
		// twoTwo({1, 2, 2, 3, 4}) -> truetrueOK twoTwo({1, 2, 3, 4}) ->
		// falsefalseOK twoTwo({2, 2}) -> truetrueOK twoTwo({2, 2, 7}) ->
		// truetrueOK twoTwo({2, 2, 7, 2, 1}) -> falsefalseOK twoTwo({4, 2, 2,
		// 2}) -> truetrueOK twoTwo({2, 2, 2}) -> truetrueOK twoTwo({1, 2}) ->
		// falsefalseOK twoTwo({2}) -> falsefalseOK twoTwo({1}) -> truetrueOK
		// twoTwo({}) -> truetrueOK twoTwo({5, 2, 2, 3}) -> truetrueOK twoTwo({2,
		// 2, 5, 2}) -> falsefalseOK other testsOK

	}

}
