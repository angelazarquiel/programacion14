package ejercicios;

import java.util.Scanner;

public class E03Coordenadas {

	/*
	Calculen el �rea de un rect�ngulo
	(alineado con los ejes x e y) dadas
	sus coordenadas x1,x2,y1,y2.
	*/
	public static void main(String[] args) {
		int x1,x2,y1,y2;
		int base,altura;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe x1,x2,y1,y2: ");
		x1=teclado.nextInt();
		x2=teclado.nextInt();
		y1=teclado.nextInt();
		y2=teclado.nextInt();
		
		base=Math.abs(x2-x1);
		altura=Math.abs(y2-y1);
		
		//System.out.println("Area = " + base*altura);
		
		// El rect�ngulo (2,6)(4,8) tiene una altura de 4
		// y una base de 4, y un �rea de 16.
		System.out.printf("El rect�ngulo (%d,%d)(%d,%d)\n\ttiene una"
		 + " altura de %d\n\ty una base de %d,\n\ty un �rea de %d.",
		 x1,x2,y1,y2,altura,base,base*altura);
	}
}