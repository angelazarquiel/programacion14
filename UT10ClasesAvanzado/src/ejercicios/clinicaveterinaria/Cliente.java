package ejercicios.clinicaveterinaria;

public class Cliente {
	private String Nombre;
	private String Direcci�n;
	
	public Cliente(String nombre, String direcci�n) {
		Nombre = nombre;
		Direcci�n = direcci�n;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDirecci�n() {
		return Direcci�n;
	}
	public void setDirecci�n(String direcci�n) {
		Direcci�n = direcci�n;
	}
	
	
}
