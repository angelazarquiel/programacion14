package ejercicios.graficos;

import graphics.*;

public class E01Semaforo {

	public static void main(String[] args) throws InterruptedException {

		Rectangle cuadrado;
		Ellipse circulo1;
		Ellipse circulo2;
		Ellipse circulo3;

		cuadrado = new Rectangle(0, 0, 100, 275);
		circulo1 = new Ellipse(25, 35, 50, 50);
		circulo2 = new Ellipse(25, 110, 50, 50);
		circulo3 = new Ellipse(25, 185, 50, 50);

		while (true) {
			cuadrado.draw();
			cuadrado.setColor(Color.GRAY);
			cuadrado.fill();

			circulo1.setColor(Color.BLACK);
			circulo1.fill();

			circulo2.setColor(Color.BLACK);
			circulo2.fill();

			circulo3.setColor(Color.BLACK);
			circulo3.fill();

			Thread.sleep(100);
			circulo3.setColor(Color.GREEN);
			circulo3.fill();

			Thread.sleep(5000);
			circulo3.setColor(Color.BLACK);
			circulo3.fill();

			Thread.sleep(100);
			circulo2.setColor(Color.ORANGE);
			circulo2.fill();

			Thread.sleep(5000);
			circulo2.setColor(Color.BLACK);
			circulo2.fill();

			Thread.sleep(100);
			circulo1.setColor(Color.RED);
			circulo1.fill();

			Thread.sleep(5000);
			circulo1.setColor(Color.BLACK);
			circulo1.fill();
			// circulo.draw();

		}

	}

}
