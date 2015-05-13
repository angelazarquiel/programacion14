package ejercicios.clinicaveterinaria;

import java.util.Arrays;


public class Reptiles extends Animal {

	private String[] alimentos;
	
	public Reptiles(Cliente due�o, String nombre,
			double peso, String fechaNac) {
		super(due�o, nombre, peso, fechaNac);
		this.alimentos=alimentos;
	}

	public String[] getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(String[] alimentos) {
		this.alimentos = alimentos;
	}

	@Override
	public String toString() {
		return super.toString() + "Reptiles [alimentos=" + Arrays.toString(alimentos) + "]";
	}
	
	

}
