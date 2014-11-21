package ejercicios.bucles;

import java.util.Scanner;

public class E03whilePar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		boolean seguir=true;
		
		
		System.out.println("Inserta números");
		do {
			numero = teclado.nextInt();
			seguir = !(numero%2 == 0); 
			if (seguir)
				System.out.println("Has insertado un " + numero);
			else
				System.out.println("Has insertado un par");
		} while(seguir);
		
		System.out.println("Fin del programa.");
	}

}
