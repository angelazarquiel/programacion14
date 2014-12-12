import java.util.Arrays;
import java.util.Scanner;


public class Ejercicio02 {

	public static void main(String[] args) {
		int[] numeros;
		int cant_numeros;
		boolean continuar = true;
		Scanner teclado = new Scanner(System.in);
		
		//leemos como m�ximo 40 n�meros (o hasta el cero)
		numeros = new int[40];
		cant_numeros = 0;
		System.out.println("N�meros a leer: ");
		while (cant_numeros<40) {
			int siguiente=teclado.nextInt();
			if (siguiente!=0)
				numeros[cant_numeros++] = siguiente;
			else
				break;
		}
	
		//ordenamos los n�meros
		Arrays.sort(numeros,0, cant_numeros);
		int i;
		//si encuentro dos n�meros iguales (est�ran juntos) hay repetidos
		for(i=1;i<cant_numeros;i++)
			if (numeros[i-1]==numeros[i]) {
				System.out.println("Hay n�meros repetidos");
				break;
			}
		
		if (i==cant_numeros) 
			System.out.println("No hay n�meros repetidos");
	
		
		//Soluci�n sin ordenar
		boolean repetido=false;
		for(i=0;i<cant_numeros-1 && !repetido;i++)
			for(int j=i+1;j<cant_numeros && !repetido;j++)
				if (numeros[i]==numeros[j]) {
					repetido=true;
				}
		
		if (repetido)
			System.out.println("Hay n�meros repetidos");
		else
			System.out.println("No hay n�meros repetidos");
	}

}
