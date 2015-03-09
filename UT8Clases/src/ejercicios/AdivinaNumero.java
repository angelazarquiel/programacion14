package ejercicios;


import java.util.Scanner;


public class AdivinaNumero {

	public static void main(String[] args) {
		Oculto numero=new Oculto();
		Scanner teclado=new Scanner(System.in);

		
		do {
			System.out.println("Dime un número:");
			int leido=teclado.nextInt();
			if (numero.pruebaNumero(leido)==0) {
				System.out.println("Acertaste");
				break;
			} else if (numero.pruebaNumero(leido)<0)
				System.out.println("El número oculto es menor");
			else
				System.out.println("El número oculto es mayor");
		}while(true);
	}

}
