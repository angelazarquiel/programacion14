package ejercicios.bloque2.pruebas;

import ejercicios.bloque2.conversores.Finanzas;


public class PruebaFinanzas {

	public static void main(String[] args) {
		Finanzas cambioHoy,cambioAñoPasado;

		cambioAñoPasado=new Finanzas();
		
		cambioHoy=new Finanzas(1.058);
		
		System.out.println("Un euro vale hoy: " +
				cambioHoy.eurosToDolares(1) +
				" $");
		System.out.println("Un euro valia hace un año: " +
				cambioAñoPasado.eurosToDolares(1) +
				" $");
		
	}

}
