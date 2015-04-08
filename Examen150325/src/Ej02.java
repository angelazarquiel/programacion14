import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej02 {

	/*
	 * Crea un m�todo que cree un array (cl�sico) de n�meros enteros introducidos por
	 * teclado. El m�todo gestionar� las excepciones de forma que se asegure que
	 * devuelve un array v�lido. El array terminar� cuando se introduzca la
	 * palabra "fin" (mayuscular/min�sculas no importan)
	 */

	public static int[] leeVectorEnteros() {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> enteros=new ArrayList<Integer>();
		int numero = 0;
		boolean fin=false;

		System.out.print("Indroduzca un n�meros enteros (escriba \"fin\" para terminar): ");
		do {
			try {
				numero = teclado.nextInt();
				enteros.add(numero);
			} catch (InputMismatchException entradaInvalida) {
				String linea = teclado.nextLine(); // si nextInt() fall� leemos
													// lo que queda
			if (linea.equalsIgnoreCase("fin"))
				fin=true; // si se introdujo marca de fin
			}
			
		} while (!fin);
		
		int[]vector=new int[enteros.size()];
		for(int i=0;i<vector.length;i++) vector[i]=enteros.get(i);
		//int[] vector = enteros.stream().mapToInt(i -> i).toArray();  // Java8
		
		return vector;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(leeVectorEnteros()));
		
	}
}
