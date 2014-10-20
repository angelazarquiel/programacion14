package ejemplos;

import java.util.Scanner;

public class Mitad {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		long numero;
		double mitad;
		
		System.out.println("Dime el número: ");
		numero=teclado.nextLong();
		mitad = numero/2.0;
		
		System.out.println("La mitade de " + numero +
				" es " + mitad);
		
		//Math.sqrt(9.0);
		//Math.pow(2, 4);

	}

}
