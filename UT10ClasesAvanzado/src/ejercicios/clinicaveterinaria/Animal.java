package ejercicios.clinicaveterinaria;

/*
 Realizar una jerarquï¿½a de clases necesaria para implementar la base de datos de una 
 clï¿½nica veterinaria (solo la parte de animales). Las clases de animales deben ser: Animal, 
 Mamï¿½fero, Perro, Gato, Reptil y Pez. De todas las mascotas se necesita saber su peso, nombre,
 fecha de nacimiento, asi como los datos del cliente (Nombre y Direcciï¿½n) Tanto perros como gatos 
 tienen un nombre de raza ('Persa','American Stanford', etc.). Los perros tienen ademï¿½s un nï¿½mero
 identificador, que va en el chip, ademï¿½s del atributo peligroso que almacenarï¿½ si el perro es 
 una raza catalogada como peligrosa o no. A los reptiles debemos ademï¿½s aï¿½adir como atributo 
 una lista (array) con los nombres de los animales que come, por ejemplo {'insectos','ratï¿½n'
 ,'pequeï¿½os reptiles'). Por su parte, los peces se guarda su nï¿½mero (en realidad la clase 
 guardarï¿½ los elementos) y si son tropicales o de agua frï¿½a.
 */
public class Animal {

	private double peso;
	private String nombre;
	private String fechaNac;
	private Cliente dueño;
	
	public Animal(Cliente dueño,String nombre,double peso,String fechaNac){
		this.dueño=dueño;
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
				+ fechaNac + ", clienteNomb=" + dueño.getNombre() + ", clienteDirec="
				+ dueño.getDirección() + "]";
	}
	
}
