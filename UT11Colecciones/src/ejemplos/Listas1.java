package ejemplos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Listas1 {

	private static void rellena(Collection<String> lista) {
		for(int i=0;i<10000;i++)
			lista.add(String.valueOf(Math.random()));
	}
	
	public static void main(String[] args) {
		List<String> numeros1= new LinkedList<String>();
		List<String> numeros2= new ArrayList<String>();
		
		rellena(numeros1);
		rellena(numeros2);
		
		//System.out.println(numeros1);
		
		for(int i=0;i<numeros1.size();i++)
			System.out.println(numeros1.get(i));
		
		for(String n:numeros1) {
			System.out.println(n);
		}
			
		Iterator<String> iterador;
		for(iterador=numeros1.iterator();iterador.hasNext();){
			System.out.println(iterador.next());
		}
		
		long start,end;
		//quitar menores de 0.5
		System.out.println(numeros1.size());
		start=System.nanoTime();
		
		quitarMenores(numeros2);
		
		end=System.nanoTime();
		System.out.println(numeros1.size());
		//for(String n:numeros1) System.out.println(n);
		System.out.println("Se tardó: " + (end-start)/1000000.0+" ms");
	}

	private static void quitarMenores(List<String> numeros) {
		
		/*
	    for(int i=0;i<numeros.size();i++) {
		 
			double num=Double.valueOf(numeros.get(i));
			
			if (num<0.5) {
				numeros.remove(i);
				i--;
			}
		}*/
		
		for(Iterator<String> i=numeros.iterator();i.hasNext();) {
			double num=Double.valueOf(i.next());
			
			if (num<0.5) {
				i.remove();
			}
		}
		
	}
}






