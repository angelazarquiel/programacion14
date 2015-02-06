package ejercicios;

import java.math.BigDecimal;

  public class Util {
	public static double redondea(double numero,int decimales) {
		//double multiplo;
		
		//multiplo=Math.pow(10, decimales);
		
		//return Math.rint(numero*multiplo)/multiplo;
		
		return (new BigDecimal(String.valueOf(numero)).setScale(decimales, BigDecimal.ROUND_HALF_UP)).doubleValue();
	}
}
