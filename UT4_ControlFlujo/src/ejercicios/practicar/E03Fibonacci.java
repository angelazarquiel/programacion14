package ejercicios.practicar;

import java.util.Scanner;

public class E03Fibonacci {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int anterior,anteanterior;
		int tamaño;
		
		System.out.print("Tamaño de la sucesión de Fibonacci: ");
		tamaño=teclado.nextInt();
		anterior=1;
		anteanterior=1;
		System.out.print("1 ");
		System.out.print("1 ");
		
		for(int i=2;i<tamaño;i++){
			int siguiente;
			siguiente = anteanterior + anterior;
			System.out.print(siguiente + " ");
			anteanterior=anterior;
			anterior=siguiente;
		}
		
		System.out.println("\nNúmero a buscar en la serie: ");
		int buscar=teclado.nextInt();
		boolean encontrado=false;
		if (buscar==1) encontrado=true;
		anterior=1;
		anteanterior=1;
		for(int i=2;i<tamaño && !encontrado;i++){
			int siguiente;
			siguiente = anteanterior + anterior;
			if (buscar==siguiente) {
				encontrado=true;
			}
			anteanterior=anterior;
			anterior=siguiente;
		}
		if (encontrado)
			System.out.println("El número está en la serie");
		
	}

	
}
