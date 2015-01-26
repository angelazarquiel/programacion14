package ejercicios.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JOptionPane;

public class E04Escalar2 {

	public static void main(String[] args) {

		/*
		 * Se crea un array con varios numeros, en este caso meto los del
		 * ejercicio pero se podria crear uno para rellenarlo con X.add
		 */

		ArrayList<Integer> numeros = new ArrayList<Integer>(Arrays.asList(2, 4,
				-2, 5, 3, 0, 7));

		int aux, vueltas;
		String mensaje = "El Array queda: \n\n";

		// Ordenar el ArrayList

		//Collections.sort(numeros);

		// Eliminar 0 y los numeros por debajo

		//do {
			for (int i = 0; i < numeros.size(); i++) {
				if (numeros.get(i) <= 0) {
					numeros.remove(i);
					i--;
				}
			}
		//} while (numeros.get(0) <= 0);

		// Damos tantas vueltas como el numero que salga y lo añadimos ese
		// numero de veces al Array

		for (int i = 0; i < numeros.size(); i++) {
			for (int j = numeros.get(i); j > 1; j--) {
				numeros.add(i,numeros.get(i));
				i++;
			}
		}

		// Volvemos a ordenarlo

		//Collections.sort(numeros);

		// Lo añadimos al mensaje para mostrarlo

		for (int i = 0; i < numeros.size(); i++) {
			if (i == numeros.size() - 1) {
				mensaje = mensaje + numeros.get(i);
			} else {
				mensaje = mensaje + numeros.get(i) + " - ";
			}
		}

		JOptionPane.showMessageDialog(null, mensaje);

	}

}
