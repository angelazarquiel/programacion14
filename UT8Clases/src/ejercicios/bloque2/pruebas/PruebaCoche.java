package ejercicios.bloque2.pruebas;

import ejercicios.bloque2.coches.Coche;

public class PruebaCoche {

	public static void main(String[] args) {
		Coche ibiza;
		
		ibiza=new Coche("Seat","Ibiza");

		System.out.println(ibiza.getMarca());
		System.out.println(ibiza.getModelo());
		
		Coche delorean;
		
		delorean=new Coche();
		
		System.out.println(delorean.getMarca());
		System.out.println(delorean.getModelo());
		
		System.out.println(ibiza.toString());
		
		
	}

}
