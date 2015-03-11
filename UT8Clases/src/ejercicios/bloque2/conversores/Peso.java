package ejercicios.bloque2.conversores;

public class Peso {

	// peso en kilogramos
	private double pesokg;

	private double kilosPor(String unidad) {
		
		unidad=unidad.toLowerCase();
		
		switch (unidad) {
			case "lb": 
				return 0.45359237;
			case "li":
				return 14.59;
			case "oz":
				return 0.0283495231;
			case "p":
				return 0.00155;
			case "k":
				return 1.0;
			case "g":
				return 0.001;
			case "q":
				return 43.3;
		}
		return 1;
	}
	
	public Peso(double peso, String unidad) {
		this.pesokg = peso * this.kilosPor(unidad);
	}

	public double getLibras() {
		return this.pesokg / kilosPor("Lb");
	}

	public double getLingotes() {
		return this.pesokg / kilosPor("Li");
	}

	public double getPeso(String unidad) {
		return this.pesokg / kilosPor(unidad);
	}
	
	public static void main(String[] args) {
		Peso peso=new Peso(74,"K");
		
		System.out.println("Tu peso en Kilos es: " + peso.getPeso("K"));
		System.out.println("Tu peso en Libras es: " + Math.round(peso.getLibras()));
		System.out.println("Tu peso en Quintales es: " + Math.round(peso.getPeso("Q")));
	}
	

}


