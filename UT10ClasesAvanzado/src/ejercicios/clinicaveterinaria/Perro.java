package ejercicios.clinicaveterinaria;

public class Perro extends Mamifero {

	private int numID;
	private boolean peligroso;
	
	public Perro(Cliente due�o, String nombre,
			double peso, String fechaNac, String raza, int numID, boolean peligroso) {
		super(due�o, nombre, peso, fechaNac, raza);
		this.numID=numID;
		this.peligroso=peligroso;
	}

}
