package ejercicios;

public class Rectangulo extends Cuadrado {

	private int largo;

	public Rectangulo(int ancho, int largo) {
		super(ancho);
		if (largo <= 0) {
			this.largo = ANCHO_POR_DEFECTO;

		} else {
			this.largo = largo;
		}
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	@Override
	public int area() {
		return this.largo * getAncho();
	}

	public int perimetro() {
		return (2 * this.largo) + (2 * getAncho());
	}

	public void dibujar() {

		System.out.println();

		for (int i = 0; i < this.largo; i++) {
			System.out.println("");
			for (int j = 0; j < getAncho(); j++) {
				System.out.print("* ");
			}
			System.out.print("");
		}

	}

}
