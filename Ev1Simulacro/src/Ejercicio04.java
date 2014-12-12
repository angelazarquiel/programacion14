import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		String[] versos;
		boolean continuar = true;
		int num_versos;
		Scanner teclado = new Scanner(System.in);
		
		//leemos como máximo 40 versos
		versos = new String[40];
		num_versos = 0;
		System.out.println("\nBienbenido a Haiku Generator.\n");
		System.out.println("Comenzaremos recopilando versos (escribe * para terminar)");
		while (continuar && num_versos < 40) {
			System.out.print("\nDame un verso: ");
			versos[num_versos] = teclado.nextLine();
			if (versos[num_versos].equals("*")) {
				continuar = false;
			} else {
				num_versos++;
			}
		}
		
		//mostramos versos leidos
		System.out.printf("Versos leidos (%d):\n", num_versos);
		for (int i = 0; i < num_versos; i++)
			System.out.println(versos[i]);
		
		//hasta que conteste que no, mostrar tres versos
		boolean otro = false;
		do {
			System.out.println("\nHaiku");
			for (int k = 0; k < 10; k++)
				System.out.print("*");
			System.out.println();
			
			//imprimimos tres
			for (int i = 0; i < 3; i++)
				System.out.println(versos[(int) (Math.random() * num_versos)]);
			
			System.out.print("¿Otro Haiku? [S/n] ");
			String resp;
			do {
				resp = teclado.next().toLowerCase();
			} while (!resp.equals("s") && !resp.equals("n"));
			if (resp.equals("s"))
				otro = true;
			else
				otro = false;
		} while (otro);
		System.out.println("Adios, gracias por utilizar Haiku Generator.");

	}

}
