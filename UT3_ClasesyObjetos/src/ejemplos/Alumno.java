package ejemplos;

public class Alumno {
	public String nombre;
	public int edad;
	
	public void aumentarEdad(int a�os) {
		this.edad += a�os;
		//edad = edad + a�os;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
