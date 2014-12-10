package ejercicios.practicar;

import java.util.Scanner;

public class E03FibonacciArray {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int[] serie;
		int tama�o;
		
		System.out.print("Tama�o de la sucesi�n de Fibonacci: ");
		tama�o=teclado.nextInt();
		
		serie=new int[tama�o];
		serie[0]=1;
		serie[1]=1;
		
		for(int i=2;i<tama�o;i++){
			
			serie[i]=serie[i-1]+serie[i-2];
		}
		
		for(int i=0;i<serie.length;i++)
			System.out.print(serie[i]+" ");
		
	}

	
}
