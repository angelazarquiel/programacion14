package ejercicios.interfaces;

import java.util.Scanner;

public class Empleado implements Persona{
	private int numeroEmpleado;
	private double sueldo;
	
	@Override
	public void pedirDatos() {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Número de empleado: ");
		this.numeroEmpleado=teclado.nextInt();
		System.out.print("Sueldo: ");
		this.sueldo=teclado.nextDouble();
	}
	@Override
	public void visualizarDatos() {
		System.out.println(EMPRESA);
		System.out.println("Empleado: " + numeroEmpleado);
		System.out.print("\tSueldo: " + sueldo);
	}
	
	
}
