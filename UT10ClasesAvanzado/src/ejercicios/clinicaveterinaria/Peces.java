package ejercicios.clinicaveterinaria;

public class Peces extends Animal {

	private int numPeces;
	private boolean tropicales;//si es false (Agua Fr�a)
	
	public Peces(Cliente due�o, String nombre,
			double peso, String fechaNac,int numPeces, boolean tropicales) {
		super(due�o, nombre, peso, fechaNac);
		this.numPeces=numPeces;
		this.tropicales=tropicales;
	}

}
