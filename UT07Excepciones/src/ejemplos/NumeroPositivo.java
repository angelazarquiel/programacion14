package ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroPositivo {

	public static int leerPositivo() throws NumeroPositivoException {
		Scanner scn=new Scanner(System.in);
		
		int numero;
		numero=scn.nextInt();
		
		if (numero<0)
			throw new NumeroPositivoException();
		
		return numero;
	}
	
	public static void main(String[] args) {
		
		int numero=0;
		
		try {
			numero=leerPositivo();
		} catch (NumeroPositivoException e) {
			System.out.println("Número negativo, vuelve a intentarlo");
		} catch (InputMismatchException ime) {
			System.out.println("No es un número, vuelve a intentarlo");
		}
		
		System.out.println(numero);

	}

}
