package ejemplos;

public class Alumno {
	public String nombre;
	public int edad;
	
	public void aumentarEdad(int años) {
		this.edad += años;
		//edad = edad + años;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
