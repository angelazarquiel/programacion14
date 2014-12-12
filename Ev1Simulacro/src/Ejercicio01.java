import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int positivos = 0;
		int negativos = 0;
		int total = 0;
		int numeros;
		
		//leemos n�meros a leer
		System.out.print("N�meros a leer: ");
		numeros = input.nextInt();
		
		// vamos leyendo y contando
		System.out.println("Escribe " + numeros + " n�meros:");
		for (int i = 0; i < numeros; i++) {
			num = input.nextInt();
			if (num > 0)
				positivos++;
			else if (num < 0)
				negativos++;
			total += num;
		}
		input.close();
		
		//mostramos resultados
		System.out.println("Positivos: " + positivos);
		System.out.println("Negativos: " + negativos);
		System.out.printf("Media: %.2f", (float) total / numeros);

	}

}
