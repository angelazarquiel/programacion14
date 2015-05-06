package ejemplos;

public class Animal extends Object {
	
	private String nombreCientifico;
	
	public void comer() {
		System.out.println("Ñam Ñam");
	}

	public Animal(String nombre) {
		this.nombreCientifico = nombre;
		
		System.out.println("Hola soy un " + nombre);
	}

	public String getNombre() {
		return nombreCientifico;
	}

	public void setNombre(String nombre) {
		this.nombreCientifico = nombre;
	}
	
}
