package ejercicios.bloque2.conversores;

public class Millas {
	
	private static final double METROSMILLA=1852;

	public static double millasAMetros(double millasMarinas) {
		return millasMarinas * METROSMILLA;
	}

	public static double millasAKilometros(double millasMarinas) {
		return millasAMetros(millasMarinas)/1000;
	}

	public static double metrosAMillas(double metros) {
		return metros / METROSMILLA;
	}
}