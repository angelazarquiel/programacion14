package ejercicios;

import java.util.ArrayList;



public class PruebaPunto {
	
	public static void main(String[] args) {
	
			Punto3D punto1= new Punto3D(3,4,5);
			Punto punto2=new Punto(4,5);
	
			System.out.println(punto1);
			
			ArrayList<Punto> puntos=new ArrayList<Punto>();
			
			puntos.add(punto1);
			puntos.add(new Punto3D(1,2,3));
			
			System.out.println(puntos);
			
			puntos.add(punto2);
			
			System.out.println(puntos);
			
	}
}





