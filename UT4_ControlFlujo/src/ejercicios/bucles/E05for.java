package ejercicios.bucles;

import java.util.Scanner;

public class E05for {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n1, n2, suma;
		suma = 0;
		
		//n1 = 1;
		//n2 = 0;
		for (n1=1,n2=0; n1 > n2;) {
			System.out.println("Inserte un numero");
			n1 = teclado.nextInt();
			System.out.println("Inserte otro numero");
			n2 = teclado.nextInt();

			if (n1 > n2) {
				System.out
						.println("El primer numero debe ser mayor que el primero, repita el proceso");
			}
		}

		for (;n1 <= n2;n1++) {
			suma += n1;

			if (n1 == n2) {
				System.out
						.println("La suma de todos los numeros que hay entre el primer y el segundo numero insertado es "
								+ (suma));
			}
		}
		
		//for(int i =n1;i<=n2;i++) suma+=i;
		
	}

}
