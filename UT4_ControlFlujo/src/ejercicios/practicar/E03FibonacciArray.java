package ejercicios.practicar;

import java.util.Scanner;

public class E03FibonacciArray {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int[] serie;
		int tamaño;
		
		System.out.print("Tamaño de la sucesión de Fibonacci: ");
		tamaño=teclado.nextInt();
		
		serie=new int[tamaño];
		serie[0]=1;
		serie[1]=1;
		
		for(int i=2;i<tamaño;i++){
			
			serie[i]=serie[i-1]+serie[i-2];
		}
		
		for(int i=0;i<serie.length;i++)
			System.out.print(serie[i]+" ");
		
	}

	
}
