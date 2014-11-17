package ejercicios.condicionales;

import java.util.Scanner;

public class E07bPPT {

	public static void main(String[] args) {
		// jugada del ordenador
		int jugadaOrdenador = (int) (Math.random() * 3 + 1);

		Scanner teclado = new Scanner(System.in);

		// jugada del humano
		System.out.println("Elige tu jugada: 1.Piedra; 2.Papel; 3.Tijera");
		int jugadaHumano = teclado.nextInt();

		if (jugadaHumano != 1 && jugadaHumano != 2 && jugadaHumano != 3)
			System.out.println("Jugada no válida");
		else {
			if (jugadaHumano == 1)
				System.out.println("Tu jugada es PIEDRA");
			else if (jugadaHumano == 2)
				System.out.println("Tu jugada es PAPEL");
			else
				System.out.println("Tu jugada es TIJERA");

			if (jugadaOrdenador == 1)
				System.out.println("El ordenador ha jugado PIEDRA");
			else if (jugadaOrdenador == 2)
				System.out.println("El ordenador ha jugado PAPEL");
			else
				System.out.println("El ordenador ha jugado TIJERA");

			System.out.println("-------------------");

			/*
			 * Lógica del juego. Piedra (1) gana a Tijera(3). Papel (2) gana a
			 * piedra(1) Tijera (3) gana a papel(2)
			 */

			boolean ganaHumano = false;

			if (jugadaOrdenador == jugadaHumano)
				System.out.println("El juego acaba en TABLAS");
			else {
				if (jugadaOrdenador == 1 && jugadaHumano == 2) {
					System.out.println("El papel lija la piedra");
					ganaHumano = true;
				} else if (jugadaOrdenador == 1 && jugadaHumano == 3) {
					System.out.println("La piedra aplasta la tijera");
					ganaHumano = false;
				} else if (jugadaOrdenador == 2 && jugadaHumano == 1) {
					System.out.println("El papel lija la piedra");
					ganaHumano = false;
				} else if (jugadaOrdenador == 2 && jugadaHumano == 3) {
					System.out.println("La tijera corta el papel");
					ganaHumano = true;
				} else if (jugadaOrdenador == 3 && jugadaHumano == 1) {
					System.out.println("La piedra aplasta la tijera");
					ganaHumano = true;
				} else {
					System.out.println("La tijera corta el papel");
					ganaHumano = false;
				}

				if (ganaHumano)
					System.out.println("TÚ GANAS");
				else
					System.out.println("GANA EL ORDENADOR");
			}
		}
	}
}
