package ejercicios.practicar;

import java.util.Scanner;

public class E02Asteriscos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tama�o;
		
		System.out.print("Dame el tama�o de las figuras: ");
		tama�o = input.nextInt();
		
		for (int i = 0; i < tama�o; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 0; i < tama�o; i++) {
			for (int j = tama�o - i; j > 0; j--) {
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 0; i < tama�o; i++) {
			for (int j = 0; j < i; j++)
				System.out.print(" ");
			for (int j = 0; j < tama�o - i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 1; i <= tama�o; i++) {
			for (int j = 0; j < tama�o - i; j++)
				System.out.print(" ");
			for (int j = 0; j < i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
