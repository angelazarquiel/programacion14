package ejercicios;

public class Punto3D extends Punto {

	public int z;

	public Punto3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public String toString() {
		return String.format("%s,%d",super.toString(),z);
	}
	
	
}
