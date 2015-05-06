package ejemplos;

public class Perro extends Mamifero{

	private String raza;
	
	public Perro(String raza) {
		super("Canis lupus familiaris",true);
		
		this.raza=raza;
		
		System.out.println("  Mi raza es:" + raza);
	}

	@Override
	public void comer() {
		System.out.println("Ñam Grrrrraa");
	}
	
	/*
	public void hablar() {
		System.out.println("Guau!!");
	}
	*/
}
