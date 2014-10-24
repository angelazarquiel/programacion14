package ejercicios;

public class E06Tabla {

	public static void main(String[] args) {
		// 3>5 	12!=8 	false 	true 	...
		boolean a,b;
		
		a= 3>5; //false
		b= 12!=8; //true
		
		System.out.println((a && b) + " "
				+ (a || b) + " "
				+ !a + " "
				+ !b );
		
		System.out.printf("%b %b %b %b\n",
				(a && b),(a || b),!a,!b );
	}

}
