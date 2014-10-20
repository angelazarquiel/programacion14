package ejercicios;

import java.util.Scanner;

public class E01Saludo2 {

	/*
	 * 1. Escribir un programa que pregunte al usuario
	 * su nombre, y luego lo salude.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre,saludo;
		
		System.out.println("¿Cómo te llamas?");
		
		nombre = teclado.nextLine();
		saludo = "¡Hola " + nombre + "!.";
		
		System.out.println(saludo);
	}

}
