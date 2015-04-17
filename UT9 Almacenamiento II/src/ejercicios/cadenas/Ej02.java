package ejercicios.cadenas;

public class Ej02 {
	public static void main(String[] args) {
		// Mejorar el ejercicio 1, teniendo en cuenta que los espacios en blanco
		// no cuentan,
		// ni las mayúsculas o minúsculas.

		StringBuilder palabra = new StringBuilder("Dabalelabad");

		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) == ' ') {
				palabra.deleteCharAt(i);
			}
		}


		StringBuilder palabraAux = new StringBuilder(palabra.reverse());

		if (palabra.toString().equalsIgnoreCase(palabraAux.toString())) {
			System.out.println("La palabra " + palabra.toString()
					+ " es palindromo");
		} else {
			System.out.println("La palabra " + palabra.toString()
					+ " NO es palindromo");
		}
	}
}
