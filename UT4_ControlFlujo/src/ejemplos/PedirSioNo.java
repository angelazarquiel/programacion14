package ejemplos;

import java.util.Scanner;

public class PedirSioNo {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String respuesta;

		//Tengo que pedir [s/n]
		do {
			System.out.print("¿Quieres continuar [s/n]?: ");
			respuesta=scn.nextLine();
			respuesta=respuesta.toLowerCase();
			if (!(respuesta.equals("n") || respuesta.equals("s")))
				System.out.println("Debes introducir 's' o 'n'");
		} while (!(respuesta.equals("n") || respuesta.equals("s")));
		
		// respuesta contiene 's' o 'n'
		
		while (true){
			System.out.print("¿Quieres continuar [s/n]?: ");
			respuesta=scn.nextLine();
			respuesta=respuesta.toLowerCase();
			if (!(respuesta.equals("n") || respuesta.equals("s")))
				System.out.println("Debes introducir 's' o 'n'");
			else
				break;
		} 
		
		boolean esCorrecta;
		
		esCorrecta=false;
		while (!esCorrecta){
			System.out.print("¿Quieres continuar [s/n]?: ");
			respuesta=scn.nextLine();
			respuesta=respuesta.toLowerCase();
			if (respuesta.equals("n") || respuesta.equals("s"))
				esCorrecta=true;
			else
				System.out.println("Debes introducir 's' o 'n'");
		} 
		
	}

}
