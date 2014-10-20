package ejercicios;

import java.util.Scanner;

public class E03Circulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        double radio;
       
        System.out.println("Vamos a calcular el per�metro y el �rea de un c�rculo. \n\nIntroduce el valor de su radio (r): ");
        radio=teclado.nextDouble();
       
        double per�metro;
        double area;
        
        per�metro=2*Math.PI*radio;
        area=Math.PI * Math.pow(radio, 2);
        System.out.println("Vale, el valor (r) de su radio es "
          + radio 
          + ", por lo tanto el �rea (A) del c�rculo es "
          + area
          + " y su per�metro (P) es "
          + per�metro);
        
        //System.out.printf("El per�metro es %.3f",per�metro);
        //System.out.printf("El valor de %d es alto.",6);
        System.out.printf("El �rea es %.2f y su per�metro es %.2f",
        		area,per�metro);

	}
}
