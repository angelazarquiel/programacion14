package ejercicios.MediaMac;

import java.util.ArrayList;


public class PruebaAparato {

	/*
	 Aunque no esté incluido en los ejercicios, deberés crear el cédigo necesario para probar
	 el buen funcionamiento de tu jerarquéa de clases: crear un Array de aparatos, poblarlo 
	 con algunos ejemplos de SmartPhone y Tableta, vender y comprar (aéadir o quitar de la lista).
	 Esto se tendré en cuenta como un apartado e).
	 */
	public static void main(String[] args) {
	
		ArrayList<Aparato> aparatos;
		aparatos = new ArrayList<Aparato>();
		
		SmartPhone iphone4 = new SmartPhone("10","001","Iphone 4 negro","IOS",300,2);
		iphone4.setPrecioBase(450);
		iphone4.addTecnologia("GPRS");
		iphone4.addTecnologia("3G");
		iphone4.addTecnologia("5G");
		
		SmartPhone XperiaJ = new SmartPhone("5","002","Sony Xperia J St26i Blanco","Android",119.5,5);
		XperiaJ.preciopPVPRebajado(15);
		XperiaJ.addTecnologia("GPRS");
		XperiaJ.addTecnologia("3G");
		XperiaJ.addTecnologia("gprs");
		
		Tableta nexus= new Tableta("34","01111011","Nexus 7","Android 4.4",340,7.0,400);
		Tableta ipad= new Tableta("36","045666hhj","iPAD air","iOS 7.1",700,9.7,400);		

		aparatos.add(iphone4);
		aparatos.add(nexus);
		aparatos.add(XperiaJ);
		aparatos.add(ipad);
		
		
		for(int i=0;i<4;i++) {
			System.out.println();
			System.out.println(aparatos.get(i));
			System.out.println("Precio del artículo (15%-):"+ 
				aparatos.get(i).preciopPVPRebajado(15));
			}

		//SmartPhone XperiaJ= new SmartPhone("5","002","Sony Xperia J St26i Blanco","Android",119);
		//SmartPhone HiesenseHS = new SmartPhone("2","003","Hisense HS-U980 Blanco","Android",179);
		//SmartPhone SamsungGalaxy = new SmartPhone("2","004","Samsung Galaxy I9082 Blanco","Android",189.99);

	}

}
