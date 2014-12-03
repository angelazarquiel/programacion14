package ejemplos;

import java.util.Arrays;

public class E01 {

	public static void main(String[] args) {
		int[] quiniela=new int[6];
		int cuantosTengo;
		
		//repetir hasta que tenga 6 número
		cuantosTengo=0;
		while(cuantosTengo<6) {
			//generar número [1-49]
			int aleatorio = (int) (Math.random() * 49 + 1);
			//mirar si está
			boolean está=false;
			for(int j=0;j<cuantosTengo;j++)
				if (aleatorio == quiniela[j]) está=true; 
			//si esta, lo descarto
			//si no, lo guarda, tengo uno más
			if (!está) {
				quiniela[cuantosTengo]=aleatorio;
				cuantosTengo++;
			}
		}
		System.out.println(Arrays.toString(quiniela));
		
		
		
		
		//sin variable boolean
		//repetir hasta que tenga 6 número
		cuantosTengo=0;
		while(cuantosTengo<6) {
			//generar número [1-49]
			int aleatorio = (int) (Math.random() * 49 + 1);
			//mirar si está
			int j;
			for(j=0;j<cuantosTengo;j++)
				if (aleatorio == quiniela[j]) break; 
			//si esta, lo descarto
			//si no, lo guarda, tengo uno más
			if (j==cuantosTengo) {
				quiniela[cuantosTengo]=aleatorio;
				cuantosTengo++;
			}
		}
		System.out.println(Arrays.toString(quiniela));
	}

}
