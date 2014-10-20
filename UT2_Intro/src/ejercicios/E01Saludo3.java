package ejercicios;

import java.util.Scanner;

public class E01Saludo3 {

	/*
	 * 1. Escribir un programa que pregunte al usuario
	 * su nombre, y luego lo salude.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("¿Cómo te llamas?");
		
		System.out.println("¡Hola " +
				teclado.nextLine() + "!.");
		
		//teclado.close();
	}

}
