import java.util.ArrayList;


public class Ej01b {


	/*
	 * Crear un método al que se le pasa un ArrayList de cadenas que contiene palabras y devuelve
	 * otro ArrayList de enteros con el número de caracteres no alfanuméricos que contiene.
	 * 
	 */
	
	public static ArrayList<Integer> cuentaRaros(ArrayList<String> palabras) {
		ArrayList<Integer> resultado=new ArrayList<Integer>();
		
		for(String clave:palabras){
			resultado.add(cuenta(clave));
		}
		
		return resultado;
	}
	
	private static int cuenta(String clave) {
		
		int letras=0;
		for(int i=0;i<clave.length();i++) {
			if (Character.isLetterOrDigit(clave.charAt(i)))
					letras++;
		}
		
		return clave.length()-letras;
	}

	public static void main(String[] args) {
		ArrayList<String> palabras=new ArrayList<String>();
		ArrayList<Integer> buenas;
		
		palabras.add("hola");
		palabras.add("HolaMundo");
		palabras.add("Hola.Mundo");
		palabras.add("Hola5Mundo");
		palabras.add("MundoCruel3-");
		palabras.add("3'CLAVE BUENA");
		
		
		buenas=cuentaRaros(palabras);
		System.out.println(buenas);
		
	}

}
