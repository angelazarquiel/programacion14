package ejercicios.practicar;

import java.util.Scanner;

public class E03Fibonacci {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int anterior,anteanterior;
		int tama�o;
		
		System.out.print("Tama�o de la sucesi�n de Fibonacci: ");
		tama�o=teclado.nextInt();
		anterior=1;
		anteanterior=1;
		System.out.print("1 ");
		System.out.print("1 ");
		
		for(int i=2;i<tama�o;i++){
			int siguiente;
			siguiente = anteanterior + anterior;
			System.out.print(siguiente + " ");
			anteanterior=anterior;
			anterior=siguiente;
		}
		
		System.out.println("\nN�mero a buscar en la serie: ");
		int buscar=teclado.nextInt();
		boolean encontrado=false;
		if (buscar==1) encontrado=true;
		anterior=1;
		anteanterior=1;
		for(int i=2;i<tama�o && !encontrado;i++){
			int siguiente;
			siguiente = anteanterior + anterior;
			if (buscar==siguiente) {
				encontrado=true;
			}
			anteanterior=anterior;
			anterior=siguiente;
		}
		if (encontrado)
			System.out.println("El n�mero est� en la serie");
		
	}

	
}
