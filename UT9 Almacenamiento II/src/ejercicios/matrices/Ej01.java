package ejercicios.matrices;

import java.util.Scanner;

public class Ej01 {
	
	void llenar(int cantidad[][]) {
		Scanner sc = new Scanner(System.in);
		 
		for (int i = 0; i < cantidad.length; i++) {
			for (int j = 0; j < cantidad[i].length; j++) {
				System.out.println("Introduce un numero");
				cantidad[i][j] = sc.nextInt();
			}
		}
	}

	public static void main(String[] args) {
		Ej01 e1 = new Ej01();
		int [][] prueba = new int[3][3];
		e1.llenar(prueba);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(prueba[i][j] + " ");
			}
			System.out.println();
		}
	}
}
