package ejercicios;


import java.util.Scanner;


public class AdivinaNumero {

	public static void main(String[] args) {
		Oculto numero=new Oculto();
		Scanner teclado=new Scanner(System.in);

		
		do {
			System.out.println("Dime un n�mero:");
			int leido=teclado.nextInt();
			if (numero.pruebaNumero(leido)==0) {
				System.out.println("Acertaste");
				break;
			} else if (numero.pruebaNumero(leido)<0)
				System.out.println("El n�mero oculto es menor");
			else
				System.out.println("El n�mero oculto es mayor");
		}while(true);
	}

}
