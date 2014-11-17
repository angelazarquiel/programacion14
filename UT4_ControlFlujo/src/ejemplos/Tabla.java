package ejemplos;

public class Tabla {

	public static void main(String[] args) {
		int numero;
		
		numero=0;
		while (numero<10) {
			//numero=numero+1;
			//numero+=1;			
			numero++;
			System.out.println(numero);
		}
		
		numero=0;
		do {
			numero++;
			System.out.println(numero);
		} while (numero<=10);
	}

}
