package ejercicios.dia22;

import java.util.Scanner;

public class E0226 {

	public static void main(String[] args) {
		/*
		Write an application that reads two integers, determines whether the first is a
		multiple of the second and prints the result. [Hint: Use the remainder operator.]
		*/
		
		Scanner teclado = new Scanner(System.in);
		long numero1;
		long numero2;
		boolean resultado;
		
		numero1=teclado.nextLong();
		numero2=teclado.nextLong();
		resultado= (numero1%numero2)==0;
		
		System.out.printf("¿%d es múltimo de %d?: %b",numero1,numero2,resultado);

	}

}
