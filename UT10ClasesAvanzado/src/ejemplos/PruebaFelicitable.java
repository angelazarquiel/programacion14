package ejemplos;

import java.util.ArrayList;

public class PruebaFelicitable {

	public static void main(String[] args) {
		ArrayList<Felicitable> a=new ArrayList<Felicitable>(); 

		Empleado e=new Empleado("444444444","Pepito");
		e.setDirecci�n("Camino San Jer�nimo 4");
		a.add(e);
		Animal n=new Animal("Cannis");
		a.add(n);
		
		for(Felicitable f:a)
			f.enviarFelicitaci�n("Fel�z cumplea�os");
		
	}

}
