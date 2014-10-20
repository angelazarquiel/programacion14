package ejemplos;

import java.util.Scanner;

public class LeerNext {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Escribe: ");
		String cadena = teclado.next();
		
		System.out.println("Leido: " + cadena);
		
		cadena = teclado.next();
		
		System.out.println("Leido: " + cadena);
		
	}

}
