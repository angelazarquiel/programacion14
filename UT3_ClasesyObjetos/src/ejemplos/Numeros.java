package ejemplos;

import java.util.Scanner;


public class Numeros {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		int n;
		
		n=teclado.nextInt();
		
		if (n<0) {
			System.out.println("Número negativo");
		} else {
			System.out.println("Número positivo o 0");
		}
		
		System.out.println("Fin.");

	}

}
