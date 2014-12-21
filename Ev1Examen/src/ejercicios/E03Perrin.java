package ejercicios;

public class E03Perrin {

	public static void main(String[] args) {
		// En matem�ticas, los n�meros de Perrin est�n definidos por la relaci�n de recurrencia
		//    P(0) = 3, P(1) = 0, P(2) = 2,
		//      y
		//    P(n) = P(n - 2) + P(n - 3) si n > 2.
		//	  La serie comienza
		//      3, 0, 2, 3, 2, 5, 5, 7, 10, 12, 17, 22, 29, 39

		int[] aux={3,0,2};
		
		System.out.print("3, 0, 2, ");
		
		for(int i=3;i<39;i++) {
			int siguiente;
			
			siguiente=aux[1] + aux[0];
			System.out.print(siguiente + ", ");
			aux[0]=aux[1];
			aux[1]=aux[2];
			aux[2]=siguiente;
		}	
	}
}
