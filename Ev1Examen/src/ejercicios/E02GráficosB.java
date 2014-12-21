package ejercicios;

import graphics.*;

public class E02GráficosB {

	public static void main(String[] args) throws InterruptedException {
		Ellipse disco1,disco2;
		Rectangle barra;
		
		disco1 = new Ellipse(100, 100, 200, 200);
		disco1.setColor(Color.BLACK);
		disco1.fill();
		disco2 = new Ellipse(120, 120, 160, 160);
		disco2.setColor(Color.RED);
		disco2.fill();
		barra = new Rectangle(140,180,120,40);
		barra.setColor(Color.WHITE);
		barra.fill();
		

		int mover;
		while (true) {
			mover=2;
			for (int i = 0; i < 50; i++) {
				Thread.sleep(20);
				disco1.translate(mover,-mover);
				disco2.translate(mover,-mover);
				barra.translate(mover,-mover);
				if (i==24) mover=-mover;
			}
		}

	}

}
