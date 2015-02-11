package ejemplos;



public class RaizCuadrada {

	public static double Raiz(double a) {
		
		if (a<0)
			throw new ArithmeticException("Raiz de negativo");
		
		return Math.sqrt(a);
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(Raiz(7));
		try {
			System.out.println(Raiz(-2));
		} catch (ArithmeticException ae) {
			System.out.println("No se puede hacer una raiz de negativo");
			throw ae;
		}

	}

}
