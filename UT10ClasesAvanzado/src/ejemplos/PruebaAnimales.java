package ejemplos;

public class PruebaAnimales {

	public static void main(String[] args) {
		Mamifero mil�=new Mamifero("Canis lupus familiaris",true);

		mil�.comer();
		mil�.hablar();
		
		Animal pez=new Animal("Salmo trutta");
		
		pez.comer();
		
		
		Perro fofo=new Perro("Caniche");
		
		fofo.comer();
		fofo.hablar();
		
	}

}
