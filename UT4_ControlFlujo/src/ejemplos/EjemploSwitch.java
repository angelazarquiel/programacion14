package ejemplos;

import java.util.Scanner;

public class EjemploSwitch {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);

		int numero=teclado.nextInt();
		
		if (numero==1) {
			System.out.println("El número es uno");
		} else if (numero==2)
			System.out.println("Has elegido 2");
		else if (numero==10)
			System.out.println("El número es 10");
		
		switch (numero) {
			case 1: 
				System.out.println("Has elegido 2");
				break;
			case 2:
				System.out.println("Has elegido 2");
				break;
			case 10:
				System.out.println("El número es 10");
				break;
		}
		
		String cadena="hola";
		switch (cadena) {
			case "hola":
					//saludo
					break;
			case "adios":
					//despedida
					break;
			default:
					//ni despedida ni saludo
		}
		
	}

}
