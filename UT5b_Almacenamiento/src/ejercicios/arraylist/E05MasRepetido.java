package ejercicios.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class E05MasRepetido {

	public static void main(String[] args) {
		/*
		 *  Excribe un programa que encuentre el n�mero m�s repetido en una array
		 *  de enteros. Usa un ArrayList para contar las ocurrencias de cada n�mero.
		 *  Al final imprime el n�mero y su n�mero de ocurrencias.
		 */
		
		int[] numeros={1,2,7,5,7,6,5,1,3,2,6,7,9,7,3,5,7,1,2,3,5,7};
		
		ArrayList<Integer> contador=new ArrayList<Integer>();
		ArrayList<Integer> encontrados=new ArrayList<Integer>();
		
		for(int c:numeros){
			int i=encontrados.indexOf(c);
			if (i<0) {
				contador.add(1);
				encontrados.add(c);
			} else
				contador.set(i, contador.get(i)+1);
		}
		
		int max=0;
		for(int i=1;i<encontrados.size();i++)
			if (contador.get(i)>contador.get(max))
				max=i;

		System.out.println("El n�mero m�s repetido es el " + encontrados.get(max) +
				" con un total de " + contador.get(max) + " repeticiones.");
	}

}
