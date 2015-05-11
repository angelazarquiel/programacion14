package ejercicios;

public class PruebaCuadrado {
	
	public static void main(String[] args) {
		Rectangulo rec = new Rectangulo(-9, 2);

		rec.dibujar();

		Cuadrado cua = new Cuadrado(-6);

		cua.dibujar();
		
		Cuadrado general;
		
		general=new Rectangulo(5,10);
		general.dibujar();
		
		System.out.println("Perímetro: "+ general.perimetro()); 
		
	}
}