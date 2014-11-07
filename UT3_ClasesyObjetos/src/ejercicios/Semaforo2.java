package ejercicios;

import graphics.*;

public class Semaforo2 {

	public static void main(String[] args) throws InterruptedException {
		
		while (true) {
			int ancho = 90;

			Rectangle rectangulo;
			rectangulo = new Rectangle(10, 10, ancho, ancho * 3);
			rectangulo.setColor(Color.GRAY);
			rectangulo.fill();
			Ellipse rojo, amarillo, verde;
			rojo = new Ellipse(15, 15, ancho - 10, ancho - 10);
			rojo.setColor(Color.RED);
			rojo.fill();
			amarillo = new Ellipse(15, 10 + ancho + 5, ancho - 10, ancho - 10);
			amarillo.setColor(Color.BLACK);
			amarillo.fill();
			verde = new Ellipse(15, 10 + ancho * 2 + 5, ancho - 10, ancho - 10);
			verde.setColor(Color.BLACK);
			verde.fill();
			Rectangle poste;
			poste = new Rectangle(10 + ancho / 5 * 2, 10 + ancho * 3,
					ancho / 5, ancho * 2);
			poste.setColor(Color.BLUE);
			poste.fill();

			Thread.sleep(2000);

			rojo.setColor(Color.BLACK);
			rojo.fill();
			amarillo.setColor(Color.YELLOW);
			amarillo.fill();
			verde.setColor(Color.BLACK);
			verde.fill();

			Thread.sleep(500);

			rojo.setColor(Color.BLACK);
			rojo.fill();
			amarillo.setColor(Color.BLACK);
			amarillo.fill();
			verde.setColor(Color.GREEN);
			verde.fill();

			/*
			Thread.sleep(500);
			
			rojo.setColor(Color.BLACK);
			rojo.fill();
			amarillo.setColor(Color.YELLOW);
			amarillo.fill();
			verde.setColor(Color.BLACK);
			verde.fill();
			*/
			
			Thread.sleep(2000);
		}

	}

}
