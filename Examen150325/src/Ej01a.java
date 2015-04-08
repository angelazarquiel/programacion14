import java.util.ArrayList;

public class Ej01a {


	/*
	 * Crear un m�todo al que se le pasa un ArrayList de cadenas que contiene palabras y devuelve
	 * otro ArrayList de booleanos diciendo si cada palabra ser� buena como clave.
	 * Una palabra es buena como clave si tiene al menos tama�o 8 caracteres, uno de ellos un
	 * n�mero y otro un car�cter especial (no letra)
	 */
	
	public static ArrayList<Boolean> revisaClaves(ArrayList<String> palabras) {
		ArrayList<Boolean> resultado=new ArrayList<Boolean>();
		
		for(String clave:palabras){
			resultado.add(esBuena(clave));
		}
		
		return resultado;
	}
	
	private static boolean esBuena(String clave) {
		
		if (clave.length()<8) return false;
		//if (!clave.matches(".*[0-9]+.*")) return false;
		//if (!clave.matches(".*\\W+.*")) return false;
		boolean encontradoDigito=false,encontradoEspecial=false;
		for(int i=0;i<clave.length();i++) {
			if (Character.isDigit(clave.charAt(i)))
					encontradoDigito=true;
			else if (!Character.isLetter(clave.charAt(i)))
				encontradoEspecial=true;
		}
		if (!encontradoDigito || !encontradoEspecial) return false;
		
		return true;
	}

	public static void main(String[] args) {
		ArrayList<String> palabras=new ArrayList<String>();
		ArrayList<Boolean> buenas;
		
		palabras.add("hola");
		palabras.add("HolaMundo");
		palabras.add("Hola.Mundo");
		palabras.add("Hola5Mundo");
		palabras.add("MundoCruel3-");
		palabras.add("3'CLAVE BUENA");
		
		
		buenas=revisaClaves(palabras);
		System.out.println(buenas);
		
	}

}
