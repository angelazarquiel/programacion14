package ejercicios;

import java.util.Scanner;

public class E03Circulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        double radio;
       
        System.out.println("Vamos a calcular el perímetro y el área de un círculo. \n\nIntroduce el valor de su radio (r): ");
        radio=teclado.nextDouble();
       
        double perímetro;
        double area;
        
        perímetro=2*Math.PI*radio;
        area=Math.PI * Math.pow(radio, 2);
        System.out.println("Vale, el valor (r) de su radio es "
          + radio 
          + ", por lo tanto el área (A) del círculo es "
          + area
          + " y su perímetro (P) es "
          + perímetro);
        
        //System.out.printf("El perímetro es %.3f",perímetro);
        //System.out.printf("El valor de %d es alto.",6);
        System.out.printf("El área es %.2f y su perímetro es %.2f",
        		area,perímetro);

	}
}
