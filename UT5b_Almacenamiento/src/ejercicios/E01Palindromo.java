package ejercicios;

import java.util.Scanner;

public class E01Palindromo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean palindromo=true;
		String palabra;
		System.out.print("Introduce una palabra: ");
		palabra = teclado.nextLine();
		
		for(int i=0;i<palabra.length()/2;i++) {
			if (palabra.charAt(i)!=palabra.charAt(palabra.length()-1-i) ) {
				palindromo=false;
				break;
			}
		}
		
		if (palindromo) 
			System.out.println(palabra + " es palíndromo.");
		else
			System.out.println(palabra + " NO es palíndromo.");
		
		/** otra solución **/
		String reverso="";
		for(int i=0;i<palabra.length();i++) {
			reverso=palabra.charAt(i)+reverso;
		}
		
		palindromo=reverso.equals(palabra);
		
		if (palindromo) 
			System.out.println(palabra + " es palíndromo.");
		else
			System.out.println(palabra + " NO es palíndromo.");
	}

}





