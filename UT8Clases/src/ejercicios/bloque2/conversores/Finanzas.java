package ejercicios.bloque2.conversores;

public class Finanzas {
	private double dolaresPorEuro;

	public Finanzas() {
		this.dolaresPorEuro = 1.36;
	}

	public Finanzas(double dolares) {
		this.dolaresPorEuro = dolares;
	}

	public double dolaresToEuros(double dolares) {
		return dolares / this.dolaresPorEuro;

	}

	public double eurosToDolares(double euros) {
		return this.dolaresPorEuro * euros;
	}

}