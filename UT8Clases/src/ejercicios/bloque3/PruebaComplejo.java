package ejercicios.bloque3;

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
		
	}

}
