package ejemplos;


public class Mamifero extends Animal {

	private boolean tienePelo;
	
	//public Mamifero() {
	//	super("");
	//}
	public Mamifero(String nombre, boolean tienePelo) {
		super(nombre);
		
		this.tienePelo=tienePelo;
	
	}
	
	public void hablar() {
		System.out.println("?");
	}
	
	
}
