package ejercicios.clinicaveterinaria;

/*
 Realizar una jerarqu�a de clases necesaria para implementar la base de datos de una 
 cl�nica veterinaria (solo la parte de animales). Las clases de animales deben ser: Animal, 
 Mam�fero, Perro, Gato, Reptil y Pez. De todas las mascotas se necesita saber su peso, nombre,
 fecha de nacimiento, asi como los datos del cliente (Nombre y Direcci�n) Tanto perros como gatos 
 tienen un nombre de raza ('Persa','American Stanford', etc.). Los perros tienen adem�s un n�mero
 identificador, que va en el chip, adem�s del atributo peligroso que almacenar� si el perro es 
 una raza catalogada como peligrosa o no. A los reptiles debemos adem�s a�adir como atributo 
 una lista (array) con los nombres de los animales que come, por ejemplo {'insectos','rat�n'
 ,'peque�os reptiles'). Por su parte, los peces se guarda su n�mero (en realidad la clase 
 guardar� los elementos) y si son tropicales o de agua fr�a.
 */
public class Animal {

	private double peso;
	private String nombre;
	private String fechaNac;
	private Cliente due�o;
	
	public Animal(Cliente due�o,String nombre,double peso,String fechaNac){
		this.due�o=due�o;
		this.nombre=nombre;
		this.peso=peso;
		this.fechaNac=fechaNac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Animales [peso=" + peso + ", nombre=" + nombre + ", fechaNac="
				+ fechaNac + ", clienteNomb=" + due�o.getNombre() + ", clienteDirec="
				+ due�o.getDirecci�n() + "]";
	}
	
}
