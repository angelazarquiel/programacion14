package ejercicios.bloque3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menú {

	private String titulo;
	private ArrayList<String> opciones;
	
	
	
	public Menú(String titulo) {
		this.titulo = titulo;
		opciones = new ArrayList<String>();
	}

    public void añadirOpción(String opción) {
    	opciones.add(opción);
    }

    private void imprimirMenú() {
    	System.out.println(titulo);
    	for(int i=0;i<titulo.length();i++)
    		System.out.print("=");
    	System.out.println();
    	
    	for(int i=0;i<opciones.size();i++)
    		System.out.printf("%d. %s\n",i+1,opciones.get(i));
    }
    
    public int mostrarMenú() {
    	imprimirMenú();
    	
    	return pedirOpción();
    }
    
	private int pedirOpción() {
		Scanner teclado=new Scanner(System.in);
		
		boolean hayDatosErroneos;
		int numero = 0;
		
		hayDatosErroneos = true;
		
		do {
			try {
				System.out.print("Opción elegida: ");
				numero = teclado.nextInt();
				if (numero>0 && numero<=this.opciones.size()) {
				   hayDatosErroneos = false;
				} else {
					System.out.println("La opción no existe");
					imprimirMenú();
				}
			} catch (InputMismatchException entradaInvalida) {
				String linea = teclado.nextLine(); 
				System.out.println("No se ha podido leer el número, vuelva a intentarlo.");
				imprimirMenú();
			}
		} while (hayDatosErroneos);
	
		return numero;
	}

	public static void main(String[] args) {
		
		Menú miMenú;
		
		miMenú=new Menú("Menú de prueba");
		
		miMenú.añadirOpción("Insertar");
		miMenú.añadirOpción("Borrar");
		miMenú.añadirOpción("Salir");
		
		switch (miMenú.mostrarMenú()) {
			case 1:
				System.out.println("Insertando...");
				break;
			case 2:
				System.out.println("Borrando...");
				break;
			case 3:
				System.exit(0);
		}
		

	}

}
