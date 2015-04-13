package ejercicios.matrices;

public class Ej02 {
	public static void imprimirCaracteres(char[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("[ ");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("]");
		}
	}

	public static void main(String[] args) {
		char[][] matriz = { { 'a', 'b', 'c', 'd' }, { 'e', 'f', 'g', 'h' },
				{ 'i', 'j', 'k', 'l' }, { 'o', 'p', 'q', 'r' } };

		imprimirCaracteres(matriz);

	}
}
