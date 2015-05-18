package ejemplos;

public class Empleado implements Felicitable{
	private String nombre;
	private String direcci�n;
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
	public String getDirecci�n() {
		return direcci�n;
	}
	public void setDirecci�n(String direcci�n) {
		this.direcci�n = direcci�n;
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
	public void enviarFelicitaci�n(String texto) {
		System.out.println("Felicitaci�n");
		System.out.println(texto);
		System.out.println(this.direcci�n);
	}
	
	
}
