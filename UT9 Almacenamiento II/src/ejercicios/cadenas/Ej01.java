package ejercicios.cadenas;

public class Ej01 {
	public static void main(String[] args) {
		// Calcular si una frase es un pal�ndromo, comprobando si la cadena es
		// sim�trica.
		String palabra="dabalelabad";
		
		StringBuilder palabraAux = new StringBuilder(palabra).reverse();
		
		/*
		StringBuilder inversa=new StringBuilder();
		for(int i=0;i<palabra.length();i++)
			inversa.insert(0, palabra.charAt(i)); */
		
		if (palabra.equals(palabraAux.toString())) {
			System.out.println("La palabra " + palabra
					+ " es palindromo");
		} else {
			System.out.println("La palabra " + palabra
					+ " NO es palindromo");
		}
	}
}
