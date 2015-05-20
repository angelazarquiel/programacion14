package ejercicios.turiBus;

public class PruebaViaje {

	
	public static void main(String[] args) {
		Parada[]paradasRuta=new Parada[3];
		paradasRuta[0]=new ParadaLibre("Toledo","16:00","16:30","libre");
		paradasRuta[1]=new ParadaGuiada("Talavera","18:30","20:30","guiada","visTalavera",30);
		paradasRuta[2]=new ParadaGuiada("Oropesa","21:15","01:00","guiada","visOropesa",50);
		Viaje miViaje=new Viaje(1,"viaje por toledo", "15:15", "03:10", paradasRuta);
		Parada nuevaParada=new ParadaLibre("Torrijos","01:00","01:30","libre");
		miViaje.anadirParada(nuevaParada);
		miViaje.coste();
		System.out.println(miViaje.toString());
		System.out.println();
		System.out.println("*************************************************************************");
		System.out.println();
		miViaje.eliminarParada(miViaje.getParadas()[3]);//
		miViaje.coste();
		System.out.println(miViaje.toString());
		Viaje miViaje2=new Viaje(2,"viaje por toledo", "15:35", "03:30", paradasRuta);
		System.out.println(miViaje2.toString());
		System.out.println("Precio: " + miViaje2.coste());
		

	
	}

}
