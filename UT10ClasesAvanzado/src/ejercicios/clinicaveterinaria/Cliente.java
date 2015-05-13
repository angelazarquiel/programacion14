package ejercicios.clinicaveterinaria;

public class Cliente {
	private String Nombre;
	private String Dirección;
	
	public Cliente(String nombre, String dirección) {
		Nombre = nombre;
		Dirección = dirección;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDirección() {
		return Dirección;
	}
	public void setDirección(String dirección) {
		Dirección = dirección;
	}
	
	
}
