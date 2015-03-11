package ejercicios.bloque2.pruebas;

import ejercicios.bloque2.conversores.Millas;

public class PruebaMillas {

	public static void main(String[] args) {
		double millas=1;

		System.out.println("Una milla son " +
				Millas.millasAMetros(millas) + " metros");
		
	}

}
