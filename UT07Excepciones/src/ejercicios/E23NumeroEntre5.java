package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E23NumeroEntre5 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nIntroducido = 0;
		int nResultado;
		int intentos = 0;
		boolean resetTeclado=true;
		
		nResultado = (int) (Math.random() * 5) + 1;
		
		do {
			try {
				System.out.print("\n\nDime un número entre 1 y 5: ");
				resetTeclado=true;
			
				nIntroducido = teclado.nextInt();
				if (nIntroducido<1 || nIntroducido>5) {
					resetTeclado=false;
					throw new InputMismatchException("Fuera de rango");
				}
				
				intentos++;
				if (nIntroducido != nResultado) {
					System.out.println("Número incorrecto.");
				}
			} catch (InputMismatchException ime) {
				System.out.println("\nError: " + ime.toString());
				System.out.println("Tipo de error: " + ime.getMessage()
						+ "\nDebes introducir un número entre 1 y 5");
				if (resetTeclado) teclado.nextLine();
			}
		} while (nIntroducido != nResultado);
		
		System.out.printf("NUMERO ENCONTADO! El número oculto era %d. (en %d intentos)",
				nResultado,intentos);
		teclado.close();
	}

}
