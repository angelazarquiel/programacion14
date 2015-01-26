package ejercicios.arraylist;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class E02 {

	public static void main(String[] args) {
		ArrayList<Character> caracter = new ArrayList<Character>();
		int contador = 0;
		int duplicado = 0;
		String mensaje;
		final Character fin='*';

		mensaje = "Los caracteres introducidos son: \n\n"; // Mensaje final, se
															// va actualizando a
															// medida que corre
															// el programa.

		// Introducimos los caracteres y los metemos dentro del ArrayList

		do {

			caracter.add(JOptionPane
					.showInputDialog("Introduzca un caracter: ").charAt(0));
			contador++;

		} while (!(caracter.get(contador - 1).equals(fin)));

		// Se actualiza el mensaje con los caracteres introducidos.

		//for (int i = 0; i < caracter.size(); i++) {
		//	mensaje = mensaje + caracter.get(i) + " ";
		//}
		for (Character c:caracter) 
			mensaje = mensaje + c + " ";

		// Comprobamos si existen duplicados y si es asi aumentamos el contador
		// de duplicados.

		for (int i = 0; i < caracter.size(); i++) {
			for (int j = i + 1; j < caracter.size(); j++) {
				if ((caracter.get(j)).equals(caracter.get(i))) {
					duplicado++;
				}
			}
		}

		JOptionPane.showMessageDialog(null, mensaje + "\n\n" + "Existen "
				+ duplicado + " caracteres duplicados.");
		
		boolean duplicado1=false;
		for (int i = 0; i < caracter.size(); i++) {
			if (caracter.subList(i+1,caracter.size()).contains(caracter.get(i))) {
				duplicado1=true;
				break;
			}
		}
		System.out.println(duplicado1);
		
		Collections.sort(caracter);
		for (int i =1; i < caracter.size(); i++)
			if (caracter.get(i-1)==caracter.get(i)) {
				duplicado1=true;
				break;
			}
		System.out.println(duplicado1);
	
			
		

	}

}
