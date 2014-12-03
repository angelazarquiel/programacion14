package ejercicios.graficos;

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class E02Coche {

	public static void main(String[] args) throws InterruptedException {
		Rectangle rectangulo, rectangulo2, rectangulo3, rectangulo4;
		Ellipse rueda, rueda2;
		int ancho = 90;

		rectangulo = new Rectangle(30, 20, ancho, 35);
		rectangulo.setColor(Color.RED);
		rectangulo.fill();

		rectangulo2 = new Rectangle(107, 37, 30, 18);
		rectangulo2.setColor(Color.RED);
		rectangulo2.fill();

		rectangulo3 = new Rectangle(50, 25, 18, 15);
		rectangulo3.setColor(Color.BLACK);
		rectangulo3.fill();

		rectangulo4 = new Rectangle(80, 25, 18, 15);
		rectangulo4.setColor(Color.BLACK);
		rectangulo4.fill();

		rueda = new Ellipse(35, 45, 20, 20);
		rueda.setColor(Color.BLACK);
		rueda.fill();

		rueda2 = new Ellipse(95, 45, 20, 20);
		rueda2.setColor(Color.BLACK);
		rueda2.fill();
		int mover = 5;
		while (true) {
			mover=5;
			for (int i = 0; i < 200; i++) {
				Thread.sleep(20);
				rectangulo.translate(mover, 0);
				rectangulo2.translate(mover, 0);
				rectangulo3.translate(mover, 0);
				rectangulo4.translate(mover, 0);
				rueda.translate(mover, 0);
				rueda2.translate(mover, 0);
				if (i==99) mover=-mover;
			}

		}

	}

}
