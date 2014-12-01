package ejemplos;

import graphics.Color;
import graphics.Rectangle;

import java.util.Scanner;

public class ColoresAleatorios2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Rectangle rec;
		Color[] colorAleatorio;
		
		colorAleatorio=new Color[5];
		
		colorAleatorio[0]=new Color(0,0,0);
		colorAleatorio[1]=new Color(200,50,0);
		colorAleatorio[2]=new Color(100,255,100);
		colorAleatorio[3]=new Color(0,255,255);
		colorAleatorio[4]=new Color(255,255,255);
		
        
		//(int)(Math.random() * ((max - min) + 1)) + min;
		
        rec=new Rectangle(0,0,300,200);
        
        while(true) {
        	rec.setColor(colorAleatorio[(int)(Math.random() * 5)]);
        	rec.fill();
        	scn.nextLine();
        }
	}

}
