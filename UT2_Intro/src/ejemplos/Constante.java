package ejemplos;

public class Constante {

	public static void main(String[] args) {
		final float PI = 3.1416f;
		float radio, perimetro;
		
		radio=16;
		
		perimetro=radio*PI*2;
		
		System.out.println("El \"perímetro\" con un radio " 
				+ radio + "\n es " + perimetro);
		
	}

}
