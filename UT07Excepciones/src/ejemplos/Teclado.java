package ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);

		
		int i=2;
		boolean esNumero=false;
		while(!esNumero) {
			try	{
				System.out.print("Dame un número: ");
				i=teclado.nextInt();
				esNumero=true;
			}catch (InputMismatchException imex) {
				System.out.println("Eso no era un número.");
				teclado.next();
			}catch (IllegalStateException e) {
				System.out.println("No se puede leer del teclado.");
				System.exit(-1);
			}finally {
				System.out.println("Finalizada la lectura de número");
			}
		}
		
		
		System.out.println(i);
		
		
	}

}
