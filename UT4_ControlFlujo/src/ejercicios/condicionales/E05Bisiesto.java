package ejercicios.condicionales;

import java.util.Scanner;

public class E05Bisiesto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int año;
		boolean esBisiesto;

		System.out.println("Introduzca el año ");
		año = teclado.nextInt();
		/*
		if (!(año % 4 == 0)) {
			esBisiesto=false;
		} else {
			if (año % 100 == 0) {
				if (año % 400 ==0) {
					esBisiesto=true;
				} else 
					esBisiesto=false;
			} else {
				esBisiesto=true;
			}
		}*/
		
		/*
		if (!(año % 4 == 0)) {
			esBisiesto=false;
		} else {
			if ((año % 100 == 0  && año % 400 ==0) ||
					!(año % 100 == 0)) {
					esBisiesto=true;
				} else {
					esBisiesto=false;
				}
		}*/
		
		if ((año%4==0) &&   ((año % 100 != 0)||(año %400==0)) ) {
			esBisiesto=true;
		} else esBisiesto=false;
		
		
		if (esBisiesto)
			System.out.println("El año introducido es bisiesto");
		else
			System.out.println("El año introducido no es bisiesto");
	}

}


