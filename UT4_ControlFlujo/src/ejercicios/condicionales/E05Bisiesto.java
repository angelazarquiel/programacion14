package ejercicios.condicionales;

import java.util.Scanner;

public class E05Bisiesto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a�o;
		boolean esBisiesto;

		System.out.println("Introduzca el a�o ");
		a�o = teclado.nextInt();
		/*
		if (!(a�o % 4 == 0)) {
			esBisiesto=false;
		} else {
			if (a�o % 100 == 0) {
				if (a�o % 400 ==0) {
					esBisiesto=true;
				} else 
					esBisiesto=false;
			} else {
				esBisiesto=true;
			}
		}*/
		
		/*
		if (!(a�o % 4 == 0)) {
			esBisiesto=false;
		} else {
			if ((a�o % 100 == 0  && a�o % 400 ==0) ||
					!(a�o % 100 == 0)) {
					esBisiesto=true;
				} else {
					esBisiesto=false;
				}
		}*/
		
		if ((a�o%4==0) &&   ((a�o % 100 != 0)||(a�o %400==0)) ) {
			esBisiesto=true;
		} else esBisiesto=false;
		
		
		if (esBisiesto)
			System.out.println("El a�o introducido es bisiesto");
		else
			System.out.println("El a�o introducido no es bisiesto");
	}

}


