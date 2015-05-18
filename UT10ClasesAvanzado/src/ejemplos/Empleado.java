package ejemplos;

public class Empleado implements Felicitable{
	private String nombre;
	private String dirección;
	private String DNI;
	private double sueldo;
	
	public Empleado(String DNI, String nombre) {
		this.DNI=DNI;
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirección() {
		return dirección;
	}
	public void setDirección(String dirección) {
		this.dirección = dirección;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getDNI() {
		return DNI;
	}

	@Override
	public void enviarFelicitación(String texto) {
		System.out.println("Felicitación");
		System.out.println(texto);
		System.out.println(this.dirección);
	}
	
	
}
