package ejercicios.clinicaveterinaria;

public class Peces extends Animal {

	private int numPeces;
	private boolean tropicales;//si es false (Agua Frï¿½a)
	
	public Peces(Cliente dueño, String nombre,
			double peso, String fechaNac,int numPeces, boolean tropicales) {
		super(dueño, nombre, peso, fechaNac);
		this.numPeces=numPeces;
		this.tropicales=tropicales;
	}

}
