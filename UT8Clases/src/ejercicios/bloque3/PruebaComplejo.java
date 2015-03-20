package ejercicios.bloque3;

import java.util.ArrayList;
import java.util.Arrays;

public class PruebaComplejo {

	public static void main(String[] args) {
		Complejo uno,dos,tres;
		
		uno=new Complejo();
		
		dos=new Complejo(2,2);
		
		uno.suma(dos);
		
		System.out.println(uno);

		//prueba multiplicar
		
		uno.setReal(2);
		uno.setImaginaria(-3);
		tres=new Complejo(1,1);
		
		uno.suma(dos);
		
		assert uno.equals(new Complejo(4,-1));
		System.out.println(uno);
		
		uno.multiplica(dos);
		assert uno.equals(new Complejo(10,6));
		
		uno.divide(dos);
		assert uno.equals(new Complejo(4,-1));
		
		pruebaGenerador();
		
		array();
		
	}
	
	private static void array() {
		ArrayList<Complejo> numeros;
		
		numeros=new ArrayList<Complejo>();
		
		for(int i=0;i<10;i++)
			numeros.add(new Complejo(numero(-10,10),numero(-10,10)));
		
		//System.out.println(numeros);
		for(Complejo c : numeros)
			System.out.println(c);
		
		Complejo dos=new Complejo(2,0);
		
		for(Complejo c : numeros)
			c.multiplica(dos);
		
		System.out.println("Multiplicado por 2");
		for(Complejo c : numeros)
			System.out.println(c);
	}

	public static int numero(int min,int max) {
		int aleatorio;
		
		aleatorio=(int)(Math.random()*(max-(min)+2)+min-1);
		
		return aleatorio;
	}
	
	static void pruebaGenerador() {
		int[] resultados=new int[21];
		
		for(int i=0;i<1000000;i++)
			resultados[numero(-10,10)+10]++;
		
		System.out.println(Arrays.toString(resultados));
		
	}

}
