package ejemplos;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[] numeros;
		
		numeros=new int[5];
		
		/*for(int i=0;i<numeros.length;i++) {
			numeros[i]=scn.nextInt();
		}*/
		
		numeros[0]=4;
		numeros[1]=3;
		numeros[2]=4;
		numeros[3]=3;
		numeros[4]=7;
		
		int minimo;
		minimo=numeros[0];
		for(int i=1;i<5;i++) {
			if (numeros[i]<minimo) minimo=numeros[i];
		}
		
		System.out.println("El mínimo es: " + minimo);
		
		

	}

}
