package ejercicios.clinicaveterinaria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PruebaClinica {

	public static void main(String[] args) {

		ArrayList<Animal> animales = new ArrayList<Animal>();
		
		String[] opcionesClinica = { "Añadir animal", "Borrar animal", "Listar"};
		String[] opcionesAnimales = { "Añadir mamífero", "Añadir reptil",
				"Añadir pez"};
		String[] opcionesMamiferos = { "Añadir perro", "Añadir gato"};

		Menu menuClinicaAnimales = new Menu(Arrays.asList(opcionesClinica));
		Menu menuAnimales = new Menu(Arrays.asList(opcionesAnimales));
		Menu menuMamiferos = new Menu(Arrays.asList(opcionesMamiferos));
		menuClinicaAnimales.setTitulo("Clínica");
		menuAnimales.setTitulo("Añadir un animal");
		menuMamiferos.setTitulo("Añadir un mamífero");
		
		int respuesta;
		System.out.println("\n*  CLINICA DE ANIMALES  *");
		do {
			
			respuesta = menuClinicaAnimales.imprimirYPreguntar();

			switch (respuesta) {
			case 1: // CREAR ANIMAL
				int respuesta2;
				do {
					
					respuesta2 = menuAnimales.imprimirYPreguntar();
					
					switch (respuesta2) {
					case 1: //"Añadir mamífero"
							int respuesta3;
							respuesta3 = menuMamiferos.imprimirYPreguntar();

							switch (respuesta3) {
							case 1: // Perro
								Perro perro=new Perro(new Cliente("Antonio C.","C/ Guadamur"),
										"Chinico",12.6,"20/2/2010","Chihuahua",23345,false);
								animales.add(perro);
								break;
							case 2: // Gato
								Gato gato=new Gato(new Cliente("Antonio C.","C/ Guadamur"),
										"Gatico", 4.5, "20/2/2010", "Angora");
								animales.add(gato);
								break;
							case 3: // Salir
								System.out.println("Cancelado");
							}

						break;
					case 2: // "Añadir reptil",
						Reptiles nuevoReptil=new Reptiles(new Cliente("Antonio C.","C/ Guadamur"),"Cameolin",0.200,"20/2/2010");
						animales.add(nuevoReptil);
						break;
					case 3: // "Añadir pez"
						Peces p=new Peces(new Cliente("Antonio C.","C/ Guadamur"),"Nemos",0.100,"20/2/2015",20,false);
						animales.add(p);
						break;
					case 4:

					}
				} while (respuesta2 != 4);

				break;
			case 2: // Borrar animal
				Scanner scn = new Scanner(System.in);
				
				System.out.println("Nombre del animal: ");
				String nombre=scn.next();
				int i=0;
				for(;i<animales.size();i++)
					if (animales.get(i).getNombre().equals(nombre))
						break;
				if (i<animales.size()) animales.remove(i);
				
				break;
			case 3: // Listar
				for(i=0;i<animales.size();i++)
					System.out.println(animales.get(i)); 
				break;
			case 4:
				System.out.println("FIN DEL PROGRAMA");
			}

		} while (respuesta < 4);
	}
}

/*
 * Gato gato1 = new Gato("Rodrigo", "Calle Azarquiel, nñ25", "Minino", 2,
 * "05/12/2011", "Raza Gato");
 * 
 * Reptiles reptil1 = new Reptiles("Antonio", "Calle San Pablo, nñ2", "culebra",
 * 0.200, "25/01/2014"); String[] alimentos = new String[] { "insectos",
 * "ratñn", "pequeños reptiles" }; reptil1.setAlimentos(alimentos);
 * 
 * System.out.println(gato1); System.out.println(reptil1);
 */

