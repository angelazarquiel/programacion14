package ejercicios;

public class E03Padovan {

	public static void main(String[] args) {

		int[] aux={1,1,1};
		
		System.out.print("1, 1, 1, ");
		
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
