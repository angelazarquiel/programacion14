package ejemplos;

import graphics.*;

public class Semaforo {

	public static void main(String[] args) {
		int ancho,alto,anchoDisco;
		Rectangle caja;
		Ellipse rojo,ambar,verde;
		Rectangle poste;
		
		ancho =  60;
		alto = ancho * 3;
		anchoDisco = (int)(ancho*0.8);
		
		caja= new Rectangle(0,0,ancho,alto);
		
		caja.draw();

		rojo = new Ellipse( ancho/2 - anchoDisco/2,
				alto/6 - anchoDisco/2,
				anchoDisco,anchoDisco);
		rojo.setColor(Color.RED);
		rojo.fill();
		
		ambar = new Ellipse( ancho/2 - anchoDisco/2,
				alto/2 - anchoDisco/2,
				anchoDisco,anchoDisco);
		ambar.setColor(Color.ORANGE);
		ambar.fill();
		
		verde = new Ellipse( ancho/2 - anchoDisco/2,
				(alto/6)*5 - anchoDisco/2,
				anchoDisco,anchoDisco);
		verde.setColor(Color.GREEN);
		verde.fill();
		
		poste = new Rectangle(ancho/3,alto,ancho/3,alto*2);
		poste.setColor(Color.BLACK);
		poste.fill();
	}

}
