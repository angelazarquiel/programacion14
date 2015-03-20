package ejercicios.bloque3;

import java.util.Calendar;

public class Fecha {
	private int mes; // 1-12
	private int dia; // 1-31 con base en el mes
	private int anio; // cualquier a�o

	private static final int[] diasPorMes = // d�as en cada mes
	{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// constructor: llama a comprobarMes para confirmar el valor apropiado para
	// el mes;
	// llama a comprobarDia para confirmar el valor apropiado para el d�a
	public Fecha(int elDia, int elMes, int elAnio) {
		mes = comprobarMes(elMes); // valida el mes
		anio = comprobarAnio(elAnio); // pudo validar el a�o
		dia = comprobarDia(elDia); // valida el d�a

		System.out.printf("Constructor de objeto Fecha para la fecha %s\n",
				this);
	} // fin del constructor de Fecha

	// m�todo utilitario para confirmar el valor a�o
		private int comprobarAnio(int anioPrueba) {
			Calendar calendar = Calendar.getInstance();
			if (anioPrueba <= calendar.get(Calendar.YEAR) )
				return anioPrueba;
			else
				// mes es inv�lido
				throw new IllegalArgumentException("el a�o debe ser pasado");
		} // fin del m�todo comprobarMes
	
	// m�todo utilitario para confirmar el valor apropiado del mes
	private int comprobarMes(int mesPrueba) {
		if (mesPrueba > 0 && mesPrueba <= 12) // valida el mes
			return mesPrueba;
		else
			// mes es inv�lido
			throw new IllegalArgumentException("el mes debe ser 1 a 12");
	} // fin del m�todo comprobarMes

	// m�todo utilitario para confirmar el valor apropiado del d�a, con base en
	// el mes y el a�o
	private int comprobarDia(int diaPrueba) {
		// comprueba si el d�a est� dentro del rango para el mes
		if (diaPrueba > 0 && diaPrueba <= diasPorMes[mes])
			return diaPrueba;

		// comprueba si es a�o bisiesto
		if (mes == 2 && diaPrueba == 29
				&& (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)))
			return diaPrueba;

		throw new IllegalArgumentException(
				"dia fuera de rango para el mes y anio especificados");
	} // fin del m�todo comprobarDia

	public void siguienteDia() {
		dia++;
		
		if ( dia > this.diasPorMes[this.mes] ) {
			dia=1;
			mes++;
		}
		
		if (mes>12) {
			mes=1;
			anio++;
		}
	}
	
	// devuelve un objeto String de la forma mes/dia/anio
	public String toString() {
		return String.format("%d/%d/%d", dia, mes, anio);
	} // fin del m�todo toString
	
	public static void main(String[] args) {
		Fecha f=new Fecha(10,12,2014);
		
		for(int i=0;i<60;i++) {
			f.siguienteDia();
			System.out.println(f);
		}
	}
	
} // fin de la clase Fecha
