package ejercicios;

import java.util.Scanner;

public class E04Codificai�nCesar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String palabra;
		int incrementar;

		System.out.println("Escribe una palabra: ");
		palabra = teclado.nextLine();
		System.out
				.println("Indique el n�mero de caracteres para la codificaci�n: ");
		incrementar = teclado.nextInt();
		

		for (int i = 0; i < palabra.length(); i++) {
			char a = palabra.charAt(i);
			//a = (char) (((int)('a') + (a-'a' + incrementar)%(26)));
			a = (char) (a + incrementar);
			if ( a > 'z' )
				a=(char)(a-26);
			System.out.print(a);

		}
	}

}
