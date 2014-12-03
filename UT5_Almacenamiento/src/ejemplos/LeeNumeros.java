package ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class LeeNumeros {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[] numeros;
		
		numeros=new int[10];
		
		for(int i=0;i<10;i++) {
			numeros[i]=scn.nextInt();
		}
		
		System.out.println("Número leídos:");
		for(int i=0;i<10;i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println(Arrays.toString(numeros));
		
		System.out.println("último elemento: ");
		System.out.println(numeros[numeros.length-1]);
		
	}

}