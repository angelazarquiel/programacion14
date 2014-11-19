package ejercicios;

import java.util.Scanner;

public class E06Laborable {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String dia;
		System.out.print("Dame el día de la semana (en letra): ");
		dia = teclado.next();
		/*
		 * dia = dia.toLowerCase();
		 */
		switch (dia.toLowerCase()) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			System.out.println("Día laborable.");
			break;
		case "sabado":
		case "domingo":
			System.out.println("Día festivo");
			break;
		}
		
/*		Scanner teclado = new Scanner(System.in);
		int numero_dia;
		System.out.print("Dame el día de la semana (en número): ");
		numero_dia = teclado.nextInt();
		switch (numero_dia) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		System.out.println("Día laborable.");
		break;
		case 6:
		case 7:
		System.out.println("Día festivo");
		}*/
	}

}
