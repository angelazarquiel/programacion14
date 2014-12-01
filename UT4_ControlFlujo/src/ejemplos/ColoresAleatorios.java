package ejemplos;

import java.util.Scanner;

import graphics.Color;
import graphics.Rectangle;

public class ColoresAleatorios {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Rectangle rec;
		int max,min;
		min=0;
		max=255;

        //(int)(Math.random() * ((max - min) + 1)) + min;
		
        rec=new Rectangle(0,0,300,200);
        
        while(true) {
        	Color colorAleatorio=new Color((int)(Math.random() * ((max - min) + 1)) + min,
            		(int)(Math.random() * ((max - min) + 1)) + min,
            		(int)(Math.random() * ((max - min) + 1)) + min);
        	/*Color colorAleatorio=new Color((int)(Math.random() * 256),
            		(int)(Math.random() * 256),
            		(int)(Math.random() * 256));*/
        	rec.setColor(colorAleatorio);
        	rec.fill();
        	scn.nextLine();
        }
        
	}

}
