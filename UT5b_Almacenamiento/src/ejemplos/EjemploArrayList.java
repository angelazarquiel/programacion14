package ejemplos;

import java.util.ArrayList;

public class EjemploArrayList {

	public static void main(String[] args) {
		
		ArrayList numeros;
		
		numeros= new ArrayList();
		
		numeros.add(20);
		numeros.add(30);
		numeros.add(45);
		
		System.out.println(numeros);
		
		if (numeros.contains(20)) {
			System.out.println("Ya contiene el 20");
		}
		
		for(int i=0;i<numeros.size();i++) {
			System.out.println(numeros.get(i));
		}
		
		numeros.set(2, 30);
		//numeros.remove(new Integer(30));
		numeros.remove(2);
		System.out.println(numeros);
		
		ArrayList quiniela=new ArrayList();
		
		for(int i=0;i<6;i++) {
			int numero=(int)(Math.random()*49+1);
			if (quiniela.contains(numero))
			   i--;
			else
				quiniela.add(numero);
		}
		
		System.out.println(quiniela);
	}

}
