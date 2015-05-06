package ejemplos;

public class PruebaAnimales {

	public static void main(String[] args) {
		Mamifero milú=new Mamifero("Canis lupus familiaris",true);

		milú.comer();
		milú.hablar();
		
		Animal pez=new Animal("Salmo trutta");
		
		pez.comer();
		
		
		Perro fofo=new Perro("Caniche");
		
		fofo.comer();
		fofo.hablar();
		
	}

}
