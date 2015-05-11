package ejercicios;

public abstract class Empleado {
	
	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getOcupacion() {
		return ocupacion;
	}


	abstract public double calculaSalarioSemanal();

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}




	protected String nombre;
	protected String ocupacion;
	
	
	
	
	/*
	 * Dise�a una jerarquia de clases con la superclase Empleado, que incluye subclases para 
	 * EmpleadoPorHoras y EmpleadoAsalariado. Los atributos que comparten son el nombre y ocupaci�n 
	 * del empleado, m�s los get/set apropiados para estos atributos. Los empleados asalariados tienen 
	 * un salario semanal, y los m�todos correspondientes get/set. 
	 * El empleado por horas tiene un precio por hora y las horas trabajadas.
	 *  Debe haber un m�todo calculaSalarioSemanal que se puede aplicar a ambos.
	 */

	public Empleado(String nombre, String ocupacion) {
		this.nombre = nombre;
		this.ocupacion = ocupacion;
	}





	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", ocupacion=" + ocupacion + "]";
	}

	
	
}
