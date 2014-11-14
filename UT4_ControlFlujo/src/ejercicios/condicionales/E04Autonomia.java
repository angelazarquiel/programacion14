package ejercicios.condicionales;

import java.util.Scanner;

public class E04Autonomia {

	/*
	 * El ordenador de nuestro coche calcula los kilómetros
	 * que nos quedan antes de repostar. Crea un programa
	 *  que pida: tamaño del depósito (en litros),
	 *  porcentaje del depósito que está lleno y litros de
	 *  consumo por 100kms. El programa mostrará los
	 *  kilómetros que quedan de autonomía. Si quedan
	 *  menos de 30 kilómetros mostrará un aviso de que
	 *  hay que repostar porque estamos usando la reserva.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double tamaño,porcentaje,consumo,gasolina,kilometros;

		System.out.println("Introduzca el tamaño del depósito en litros :");
		tamaño = teclado.nextInt();
		System.out.println("Porcentaje del depósito que está lleno :");
		porcentaje = teclado.nextInt();
		System.out.println("Consumo cada 100 kilómetros :");
		consumo = teclado.nextInt();

		porcentaje = porcentaje/100;
		gasolina = tamaño*porcentaje;
		kilometros = (gasolina/(consumo/100));

		System.out.println("Quedan " + kilometros + " kilometros de autonomia");

		if(kilometros<30){
		System.out.println("CUIDADO esta usted en reserva");
		}

	}

}
