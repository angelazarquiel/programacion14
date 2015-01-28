package ejercicios.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class E06QuitaPlurales {

	public static void main(String[] args) {
		/*
		 * Escribe un programa QuitarPlurales que dado un ArrayList de palabras,
		 * quite cada palabra que termine con una 's', independiente de
		 * mayúscular/minúsculas.
		 */
		
		ArrayList<String> palabras=
				new ArrayList<String>(Arrays.asList("Hola","programas",
						"Java","PAQUETES",
						"Clase","Getters"));

		for(int i=0;i<palabras.size();i++)
			if (palabras.get(i).toLowerCase().endsWith("s")) {
				palabras.remove(i--);
			}
		
		System.out.println(palabras);
	}

}
