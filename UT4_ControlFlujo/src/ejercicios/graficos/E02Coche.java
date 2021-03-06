package ejercicios.graficos;

import javax.swing.JOptionPane;

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;
import graphics.Text;

public class E02Coche {

	public static void main(String[] args) throws InterruptedException {
		Rectangle rectangulo1,rectangulo2;
		Text texto;
		
		texto= new Text(150,60,"Aviso");
		texto.setColor(Color.WHITE);
		texto.grow(100, 50);
		texto.translate(0,0);
		
		rectangulo1 = new Rectangle(10, 10, 330, 130);
		rectangulo1.setColor(Color.BLACK);
		rectangulo1.fill();
		rectangulo2 = new Rectangle(20, 20, 310, 110);
		rectangulo2.setColor(Color.RED);
		rectangulo2.fill();
		texto.draw();
		

		int mover;
		while (true) {
			mover=-1;
			for (int i = 0; i < 50; i++) {
				Thread.sleep(10);
				rectangulo1.grow(mover,mover);
				rectangulo2.grow(mover,mover);
				if (i==24) mover=-mover;
			}
		}

	}

}
