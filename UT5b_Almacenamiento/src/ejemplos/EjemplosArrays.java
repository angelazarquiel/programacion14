package ejemplos;

import java.util.ArrayList;

public class EjemplosArrays {

	public static void main(String[] args) {
		int []listaNumeros;
		
		listaNumeros=new int[80];
		listaNumeros[0]=10;
		
		int [][]tablaNumeros;
		
		tablaNumeros=new int[10][20];
		tablaNumeros[0][0]=20;
		tablaNumeros[0][1]=20;
		
		int suma=0;
		for(int i=0;i<tablaNumeros.length;i++)
			for(int j=0;j<tablaNumeros[i].length;j++)
				suma+=tablaNumeros[i][j];
		
		ArrayList<String> nombres;
		ArrayList<Integer> edad;
		
		nombres=new ArrayList<String>();
		edad=new ArrayList<Integer>();
		nombres.add("Pablo");
		nombres.add("Juan");
		edad.add(30);
		edad.add(34);
		System.out.println(nombres);
		System.out.println(edad);
		nombres.add(0,"Pepe");
		edad.add(0,30);
		System.out.println("Insertado Pepe");
		System.out.println(nombres);
		System.out.println(edad);
		
		edad.set(0, 31);
		System.out.println("Cambio de edad");
		System.out.println(nombres);
		System.out.println(edad);
		
		nombres.remove("Pablo");
		edad.remove(1);
		System.out.println("Borrando Pablo");
		System.out.println(nombres);
		System.out.println(edad);
		
		for(int i=0;i<nombres.size();i++) {
			System.out.println(nombres.get(i) + " tiene " +edad.get(i) + " años");
		}
		
		if (nombres.contains("Pablo"))
			System.out.println("Pablo está en el array");
		else
			System.out.println("Pablo NO está en el array");
		
		for(String nombre : nombres) {
			System.out.println(nombre);
		}
		
		for(int i=0;i<nombres.size();i++) {
			String nombre=nombres.get(i);
			System.out.println(nombre);
		}
		
		
	}

}




