package ejercicios.graficos;

import graphics.*;

public class E05Pelota {
	public static void main(String[] args) throws InterruptedException {

		Rectangle rectangulo = new Rectangle(10, 10, 400, 300);
		rectangulo.draw();

		Ellipse pelota = new Ellipse(200, 200, 60, 60);
		pelota.setColor(Color.RED);
		pelota.fill();

		// movimiento inicial de la pelota

		// en horizontal
		int velocidadHor = (int) (Math.random() * 5 + 1);
		int PosHNeg = (int) (Math.random() * 2 + 1);

		switch (PosHNeg) {
		case 1:
			velocidadHor = velocidadHor;
			break;
		case 2:
			velocidadHor = velocidadHor * -1;
		}

		// en vertical
		int velocidadVer = (int) (Math.random() * 5 + 1);
		int PosVNeg = (int) (Math.random() * 2 + 1);

		switch (PosVNeg) {
		case 1:
			velocidadVer = velocidadVer;
			break;
		case 2:
			velocidadVer = velocidadVer * -1;

		}

		double tiempoEspera = (int) (Math.random() * 100 + 20);
		
		pelota.fill();
		while (true) {
			// comprobar si rebota y aumentarle un poco la velocidad
			if (pelota.getX() < 10 || pelota.getX() > (400 - 60)) {
				velocidadHor = velocidadHor * -1;
				tiempoEspera = tiempoEspera * 0.5;
			}

			if (pelota.getY() < 10 || pelota.getY() > (300 - 60)) {
				velocidadVer = velocidadVer * -1;
				tiempoEspera = tiempoEspera * 0.5;
			}

			pelota.translate(velocidadHor, velocidadVer);
			//pelota.fill();
			Thread.sleep(Math.round(tiempoEspera));
		}

	}
}
