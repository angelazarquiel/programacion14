package ejercicios;

import java.util.Scanner;

public class E07Operar {

	public static void main(String[] args) {
		int n1, n2;
		String respuesta;
		Scanner teclado = new Scanner(System.in);
		System.out
				.println("Dame una operación en la forma: [numero numero operador]");
		System.out
				.println("Operadores: \n+-Sumar \n--Restar \n*-Multiplicar \n/-Dividir\n");
		n1 = teclado.nextInt();
		n2 = teclado.nextInt();
		respuesta = teclado.next();
		
		switch (respuesta) {
		case "+":
			System.out.println("El resultado de la suma es: " + (n1 + n2));
			break;
		case "-":
			System.out.println("El resultado de la resta es: " + (n1 - n2));
			break;
		case "*":
			System.out.println("El resultado del producto es: " + (n1 * n2));
			break;
		case "/":
			System.out.println("El resultado de la división es: " + (n1 / n2));
			break;
		default:
			System.out.println("Error, operación no disponible.");
		}
	}

}
