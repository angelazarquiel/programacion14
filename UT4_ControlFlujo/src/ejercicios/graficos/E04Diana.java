package ejercicios.graficos;

import graphics.Color;
import graphics.Ellipse;

public class E04Diana {

	public static void main(String[] args) throws InterruptedException {

		Ellipse disc[] = new Ellipse[10];
		int max, min, i;
		Color colorAleatorio;
		min = 0;
		max = 255;

		// (int)(Math.random() * (max - min)) + min;

		for(i=0;i<10;i++)
			disc[i]=new Ellipse(i*10,i*10,200-i*20,200-i*20);
		/*
		disc[0] = new Ellipse(0, 0, 200, 200);
		disc[1] = new Ellipse(10, 10, 180, 180);
		disc[2] = new Ellipse(20, 20, 160, 160);
		disc[3] = new Ellipse(30, 30, 140, 140);
		disc[4] = new Ellipse(40, 40, 120, 120);
		disc[5] = new Ellipse(50, 50, 100, 100);
		disc[6] = new Ellipse(60, 60, 80, 80);
		disc[7] = new Ellipse(70, 70, 60, 60);
		disc[8] = new Ellipse(80, 80, 40, 40);
		disc[9] = new Ellipse(90, 90, 20, 20);
		*/
			
		for (i = 0; i < 10; i++) {
			colorAleatorio = new Color((int) (Math.random() * (max - min))
					+ min, (int) (Math.random() * (max - min)) + min,
					(int) (Math.random() * (max - min)) + min);

			disc[i].setColor(colorAleatorio);
			disc[i].fill();
			Thread.sleep(500);
		}

	}

}
