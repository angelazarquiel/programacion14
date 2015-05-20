package ejercicios.interfaces;

import java.util.Scanner;

public class Cliente implements Persona{
	private int numeroCliente;
	private String nombre;
	
	@Override
	public void pedirDatos() {
		Scanner teclado=new Scanner(System.in);
		System.out.print("N�mero de cliente: ");
		this.numeroCliente=teclado.nextInt();
		System.out.print("Nombre: ");
		this.nombre=teclado.next();
	}
	@Override
	public void visualizarDatos() {
		System.out.println(EMPRESA);
		System.out.println("Cliente: " + nombre);
		System.out.print("\tN�mero de socio: " + numeroCliente);
	}
}
