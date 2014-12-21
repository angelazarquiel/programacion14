package ejemplos;

import java.util.Arrays;

public class EjemploArrays {

	public static void main(String[] args) {
		int []vector;
		
		vector=new int[10];
		
		for(int i=0;i<vector.length;i++)
			vector[i]=(int)(Math.random()*100+1);

		System.out.println(Arrays.toString(vector));
		
		for(int i=0;i<vector.length;i++)
			System.out.print(vector[i]+ " ");
		System.out.println();
		
		//buscar mayor
		int posicion;
		posicion=0;
		for(int i=1;i<vector.length;i++)
			if (vector[i]>vector[posicion]) {
				posicion=i;
			}
		
		System.out.println("El número mayor es el " + (posicion+1) + "º elemento.");
		
		//rotar a la izquierda
		System.out.println("Rotar a la izquierda");
		System.out.println(Arrays.toString(vector));
		int primero=vector[0];
		for(int i=0;i<vector.length-1;i++)
			vector[i]=vector[i+1];
		vector[vector.length-1]=primero;
		
		System.out.println(Arrays.toString(vector));
		
		//rotar a la derecha
		System.out.println("Rotar a la derecha");
		int ultimo=vector[9];
		for(int i=vector.length-1;i>0;i--)
			vector[i]=vector[i-1];
		vector[0]=ultimo;
		
		System.out.println(Arrays.toString(vector));
		
		//dar la vuelta
		System.out.println("Transponer");
		for(int i=0;i<vector.length/2;i++){
			int aux=vector[i];
			vector[i]=vector[vector.length-i-1];
			vector[vector.length-i-1]=aux;
		}
		System.out.println(Arrays.toString(vector));
		
	}

}







