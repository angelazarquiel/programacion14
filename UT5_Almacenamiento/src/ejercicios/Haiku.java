package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Haiku {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String []versos=new String[40];
		String respuesta;
		int numVersos=0;
		
		// saludo
		System.out.println("Generador Haiku");
		System.out.println("Escribe versos (*=fin):");
		// leer versos
		String verso="";
		while (!verso.equals("*")) {
			verso=teclado.nextLine();
			if (!verso.equals("*")) {
				versos[numVersos]=verso;
				numVersos++;
			}
		}
		
		System.out.println("Versos leidos:");
		//System.out.println(Arrays.toString(versos));
		for(int i=0;i<numVersos;i++)
			System.out.print(versos[i] + " - ");
		System.out.println(numVersos);
		
		
		// elegir tres aleatorios y mostrar
		
		do {
			boolean[] usado;
			usado=new boolean[numVersos];
			Arrays.fill(usado,false);
			for(int i=0;i<3;i++) {
				int aleatorio;
				
				do {
				  aleatorio=(int)(Math.random()*numVersos);
				}
				while (usado[aleatorio]==true);
				usado[aleatorio]=true;
				
				System.out.println(versos[aleatorio]);
			}
			
			System.out.print("Otro haiku? [s/n]: ");
			respuesta=teclado.nextLine();
		}
		while(respuesta.equalsIgnoreCase("s"));
		
		
	}

}
