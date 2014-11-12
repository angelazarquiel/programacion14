package ejercicios;

import graphics.Color;
import graphics.Line;
import graphics.Rectangle;
import graphics.Text;

public class Euribor {
	public static void main(String[] args) {

		Rectangle a10, a11, a12, a13, a14, leyen;
		Line lineax, lineay;
		Text textox1,textox2;
		double euribor2014=0.337,euribor2013=0.543;

		lineax = new Line(20, 20, 20, 200);
		lineax.setColor(Color.BLACK);
		lineax.draw();
		textox1 = new Text(0,20,"1%");
		textox2 = new Text(0,180,"0%");
		textox1.draw();
		textox2.draw();

		lineay = new Line(20, 200, 200, 200);
		lineay.setColor(Color.BLACK);
		lineay.draw();

		int tamaño;
		tamaño = (int)((180/1) * euribor2013);
		a10 = new Rectangle(30, 200-tamaño, 20, tamaño);
		a10.draw();
		a10.setColor(Color.ORANGE);
		a10.fill();

		tamaño = (int)((180/1) * euribor2014);
		a11 = new Rectangle(60, 200-tamaño, 20, tamaño);
		a11.setColor(Color.YELLOW);
		a11.draw();
		a11.fill();

		a12 = new Rectangle(90, 100, 20, 100);
		a12.setColor(Color.BLUE);
		a12.draw();
		a12.fill();

		a13 = new Rectangle(120, 90, 20, 110);
		a13.setColor(Color.GRAY);
		a13.draw();
		a13.fill();

		a14 = new Rectangle(150, 110, 20, 90);
		a14.setColor(Color.RED);
		a14.draw();
		a14.fill();

		leyen = new Rectangle(20, 220, 180, 110);
		leyen.draw();
		leyen.setColor(Color.BLACK);

		a10 = new Rectangle(30, 230, 10, 10);
		a10.draw();
		a10.setColor(Color.ORANGE);
		a10.fill();

		a11 = new Rectangle(30, 250, 10, 10);
		a11.setColor(Color.YELLOW);
		a11.draw();
		a11.fill();

		a12 = new Rectangle(30, 270, 10, 10);
		a12.setColor(Color.BLUE);
		a12.draw();
		a12.fill();

		a13 = new Rectangle(30, 290, 10, 10);
		a13.setColor(Color.GRAY);
		a13.draw();
		a13.fill();

		a14 = new Rectangle(30, 310, 10, 10);
		a14.setColor(Color.RED);
		a14.draw();
		a14.fill();
	}
}
