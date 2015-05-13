package ejercicios.clinicaveterinaria;

public class PruebaClinica {

	public static void main(String[] args) {

		Animal[] animales = new Animal[20];
		int numAnimales=0;
		
		String[] opcionesClinica = { "Añadir animal", "Borrar animal", "Listar", "Salir" };
		String[] opcionesAnimales = { "Añadir mamñfero", "Añadir reptil",
				"Añadir pez", "Salir" };
		String[] opcionesMamiferos = { "Añadir perro", "Añadir gato", "Salir" };

		Menu menuClinicaAnimales = new Menu(opcionesClinica, 4);
		Menu menuAnimales = new Menu(opcionesAnimales, 4);
		Menu menuMamiferos = new Menu(opcionesMamiferos, 3);

		int respuesta;
		System.out.println("\n*  CLINICA DE ANIMALES  *");
		do {
			System.out.println("==Menñ clñnica de animales:==");
			do {
				respuesta = menuClinicaAnimales.imprimirYPreguntar();
			} while (respuesta != 1 && respuesta != 2 && respuesta != 3);

			switch (respuesta) {
			case 1: // CREAR ANIMAL
				do {
					System.out.println("==Menñ clñnica de animales:==");
					do {
						respuesta = menuAnimales.imprimirYPreguntar();
					} while (respuesta != 1 && respuesta != 2 && respuesta != 3
							&& respuesta != 4);

					switch (respuesta) {
					case 1: //"Añadir mamñfero"
						do {
							System.out.println("==Menñ clñnica de animales:==");
							do {
								respuesta = menuMamiferos.imprimirYPreguntar();
							} while (respuesta != 1 && respuesta != 2
									&& respuesta != 3);

							switch (respuesta) {
							case 1: // Perro
								Perro perro=new Perro(new Cliente("Antonio C.","C/ Guadamur"),
										"Chinico",12.6,"20/2/2010","Chihuahua",23345,false);
								animales[numAnimales++]=perro;
								break;
							case 2: // Gato
								Gato gato=new Gato(new Cliente("Antonio C.","C/ Guadamur"),
										"Gatico", 4.5, "20/2/2010", "Angora");
								animales[numAnimales++]=gato;
								break;
							case 3: // Salir
	
							}
						} while (respuesta != 3);

						break;
					case 2: // "Añadir reptil",
					 

						break;
					case 3: // "Añadir pez"

						break;
					case 4:

					}
				} while (respuesta != 4);

				break;
			case 2: // Borrar animal
				// 3Âº
				animales[2]=animales[--numAnimales];
				animales[numAnimales]=null;
				break;
			case 3: // Listar
				for(int i=0;i<numAnimales;i++)
					System.out.println(animales[i]); 
				break;
			case 4:
				System.out.println("FIN DEL PROGRAMA");
			}

		} while (respuesta != 3);
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

