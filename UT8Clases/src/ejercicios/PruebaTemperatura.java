package ejercicios;

public class PruebaTemperatura {

	public static void main(String[] args) {
		Temperatura temp=new Temperatura();

		
		temp.setCelsius(20.5f);
		
		System.out.println("Hoy hace " + temp.getCelsius() + " ºC");
		System.out.println("Hoy hace " + temp.getFahrenheit() + " ºF");
	}

}
