package ejercicios.dia27;

public class E34 {

	public static void main(String[] args) {
		//double poblacion_actual = 6.916E+9;
		long poblacion_actual = 6916000000L;
		double poblacion_siguiente;
		double ratio_aumento = 1.1;

		System.out.println("Población actual: " + poblacion_actual);
		poblacion_siguiente = (poblacion_actual+poblacion_actual*ratio_aumento/100);
		System.out.println("Población 2015: " + poblacion_siguiente);
		poblacion_siguiente = poblacion_siguiente*(1+ratio_aumento/100);  //hemos sacado factor común
		//poblacion_siguiente *= (1+ratio_aumento/100); 
		System.out.println("Población 2016: " + poblacion_siguiente);
		poblacion_siguiente = poblacion_siguiente*(1+ratio_aumento/100);
		System.out.println("Población 2017: " + poblacion_siguiente);
		poblacion_siguiente = poblacion_siguiente*(1+ratio_aumento/100);
		System.out.println("Población 2018: " + poblacion_siguiente);
		poblacion_siguiente = poblacion_siguiente*(1+ratio_aumento/100);
		System.out.println("Población 2019: " + poblacion_siguiente);
	}

}
