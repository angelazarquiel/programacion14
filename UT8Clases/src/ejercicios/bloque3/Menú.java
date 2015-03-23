package ejercicios.bloque3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Men� {

	private String titulo;
	private ArrayList<String> opciones;
	
	
	
	public Men�(String titulo) {
		this.titulo = titulo;
		opciones = new ArrayList<String>();
	}

    public void a�adirOpci�n(String opci�n) {
    	opciones.add(opci�n);
    }

    private void imprimirMen�() {
    	System.out.println(titulo);
    	for(int i=0;i<titulo.length();i++)
    		System.out.print("=");
    	System.out.println();
    	
    	for(int i=0;i<opciones.size();i++)
    		System.out.printf("%d. %s\n",i+1,opciones.get(i));
    }
    
    public int mostrarMen�() {
    	imprimirMen�();
    	
    	return pedirOpci�n();
    }
    
	private int pedirOpci�n() {
		Scanner teclado=new Scanner(System.in);
		
		boolean hayDatosErroneos;
		int numero = 0;
		
		hayDatosErroneos = true;
		
		do {
			try {
				System.out.print("Opci�n elegida: ");
				numero = teclado.nextInt();
				if (numero>0 && numero<=this.opciones.size()) {
				   hayDatosErroneos = false;
				} else {
					System.out.println("La opci�n no existe");
					imprimirMen�();
				}
			} catch (InputMismatchException entradaInvalida) {
				String linea = teclado.nextLine(); 
				System.out.println("No se ha podido leer el n�mero, vuelva a intentarlo.");
				imprimirMen�();
			}
		} while (hayDatosErroneos);
	
		return numero;
	}

	public static void main(String[] args) {
		
		Men� miMen�;
		
		miMen�=new Men�("Men� de prueba");
		
		miMen�.a�adirOpci�n("Insertar");
		miMen�.a�adirOpci�n("Borrar");
		miMen�.a�adirOpci�n("Salir");
		
		switch (miMen�.mostrarMen�()) {
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
