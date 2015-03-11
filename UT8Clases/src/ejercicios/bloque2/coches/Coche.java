package ejercicios.bloque2.coches;

public class Coche {

	private String marca;
	private String modelo;

	public Coche() {
		marca = "NO MARCA";
		modelo = "NO MODELO";
	}

	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + "]";
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
}
