package ejercicios.bucles;

import java.util.Scanner;

public class E01whileTablas {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int numero;
		int contador=1;
		
		System.out.println("Elige que tabla de multiplicar quieres hacer: ");
		numero=input.nextInt();
		
		while(contador<=10){

			System.out.println(numero+" * "+contador+" = "+(numero*contador));
			contador++;
		}


	}

}
