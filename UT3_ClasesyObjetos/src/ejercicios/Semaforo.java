package ejercicios;

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class Semaforo {

	public static void main(String[] args) throws InterruptedException {
		Rectangle cuadrado, poste; //nuevo objeto cuadrado de la clase Rectangle
		Ellipse circulo1, circulo2, circulo3;
		Ellipse circulo1b,circulo2b,circulo3b;
		
		cuadrado=new Rectangle(0,0,100,250);
		poste=new Rectangle(100/3,250,100/3,250);
		
		circulo1=new Ellipse(25,25,50,50);
		circulo1b=new Ellipse(25,25,50,50);
		
		circulo2=new Ellipse(25,100,50,50);
		circulo2b=new Ellipse(25,100,50,50);
		
		circulo3=new Ellipse(25,175,50,50);
		circulo3b=new Ellipse(25,175,50,50);
		
		cuadrado.draw();//draw no necesita paámetro
		poste.draw();
		circulo1.setColor(Color.RED);
		circulo1.fill();//dibuja con relleno
		Thread.sleep(2000);
		circulo1b.setColor(Color.WHITE);
		circulo1b.fill();
		circulo2.setColor(Color.ORANGE);
		circulo2.fill();
		Thread.sleep(2000);
		circulo2b.setColor(Color.WHITE);
		circulo2b.fill();
		circulo3.setColor(Color.GREEN);
		circulo3.fill();
		//circulo.draw();
		


	}

}
