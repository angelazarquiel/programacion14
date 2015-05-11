package ejercicios;

public class Cuadrado {

	private int ancho;
	
	protected final int ANCHO_POR_DEFECTO=10;

	public Cuadrado() {
		this.ancho = ANCHO_POR_DEFECTO;
	}

	public Cuadrado(int ancho) {
		/*if (ancho <= 0) {
			this.ancho = ANCHO_POR_DEFECTO;
		} else {
			this.ancho = ancho;
		}*/
		this.ancho=(ancho <= 0)?ANCHO_POR_DEFECTO:ancho;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int area() {
		return this.ancho * this.ancho;
	}

	public int perimetro() {
		return this.ancho * 4;
	}

	public void dibujar() {

		System.out.println();

		for (int i = 0; i < this.ancho; i++) {
			System.out.println("");
			for (int j = 0; j < this.ancho; j++) {
				System.out.print("* ");
			}
			System.out.print("");
		}

	}

	public static void main(String[] args) {
          //Tests
			Cuadrado c1=new Cuadrado(),
					c2=new Cuadrado(-3),
					c3=new Cuadrado(5);
			
			c1.dibujar();
			c2.dibujar();
			c3.dibujar();
			
			assert c3.perimetro()==20;
			
	}

}