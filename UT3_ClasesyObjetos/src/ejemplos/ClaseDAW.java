package ejemplos;

public class ClaseDAW {

	public static void main(String[] args) {
		Alumno juan,pepe;
		
		juan = new Alumno();
		pepe = new Alumno();
		
		juan.nombre="Juan Perez";
		juan.edad = 27;
		juan.aumentarEdad(1);
		
		pepe.setNombre("Pepe Perez");
		
		
		

	}

}
