package ejemplos;

import java.util.HashSet;
import java.util.Set;

public class Primitiva {

	public static void main(String[] args) {
		Set<Integer> quiniela=new HashSet<Integer>();	
		
		//repetir hasta que tenga 6 n�mero
		while(quiniela.size()<6) {
			//generar n�mero [1-49]
			int aleatorio = (int) (Math.random() * 49 + 1);
			quiniela.add(aleatorio);
		}
		System.out.println(quiniela);
		
	}

}
