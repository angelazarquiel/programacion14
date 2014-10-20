package ejercicios;

import java.util.Scanner;

public class E01Saludo {

	/*
	 * 1. Escribir un programa que pregunte al usuario
	 * su nombre, y luego lo salude.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre;
		
		System.out.println("¿Cómo te llamas?");
		
		nombre = teclado.nextLine();
		
		System.out.println("¡Hola " + nombre + "!.");
	}

}
