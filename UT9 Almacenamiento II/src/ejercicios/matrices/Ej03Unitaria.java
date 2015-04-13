package ejercicios.matrices;

import java.util.Arrays;

public class Ej03Unitaria {

	public static int[][] matrizUnitaria() {

		int[][] matriz = new int[8][8];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = 0;
				if (i == j) {
					matriz[i][j] = 1;
				}
			}
		}
		
		/*for (int i = 0; i < matriz.length; i++) {
			Arrays.fill(matriz[i], 0);
			matriz[i][i]=1;
		}*/

		return matriz;
	}

	public static void main(String[] args) {
		// Necesitamos crear una matriz unitaria de orden 8. Crea un método que
		// lo haga.
		// Una matriz unitaria es aquella que tiene todos sus componentes a 0,
		// excepto las de la diagonal principal, que están a 1.

		for (int i = 0; i < matrizUnitaria().length; i++) {
			System.out.println(Arrays.toString(matrizUnitaria()[i]));
		}

	}
}
