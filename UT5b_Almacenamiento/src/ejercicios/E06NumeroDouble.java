package ejercicios;

import java.util.Scanner;

public class E06NumeroDouble {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numero;

		System.out.println("Introduce un número: ");
		numero=teclado.nextDouble();
		
		String numeroIntroducido = Double.toString(numero);
		byte contador = 0;

		numeroIntroducido=numeroIntroducido.replace('.', ',');
		/*
		for (byte i = 0; i < numeroIntroducido.length(); i++) {
			if ((numeroIntroducido.charAt(i) == ',')
					|| (numeroIntroducido.charAt(i) == '.')) {
				break;
			} else {
				contador++;
			}
		}*/
		contador=(byte)numeroIntroducido.indexOf(',');
		
		String numeroFormateado = "";
		for (int i = (numeroIntroducido.length() - contador); i > 0; i--) {
			numeroFormateado += numeroIntroducido.charAt(numeroIntroducido
					.length() - i);
		}
		for (byte i = 1; i < contador + 1; i++) {
			numeroFormateado = numeroIntroducido.charAt(contador - i)
					+ numeroFormateado;
			if ((i % 3) == 0 && i != contador) {
				numeroFormateado = "." + numeroFormateado;
			}
		}

		System.out.println(numeroFormateado);

	}

}
