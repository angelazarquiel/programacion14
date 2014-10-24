package ejercicios.dia22;

public class E0210 {

	public static void main(String[] args) {
		/*
		Assuming that x = 2 and y = 3, what does each of the following statements display?
				a) System.out.printf( "x = %d\n", x );
				b) System.out.printf( "Value of %d + %d is %d\n", x, x, ( x + x ) );
				c) System.out.printf( "x =" );
				d) System.out.printf( "%d = %d\n", ( x + y ), ( y + x ) );
		 */
		int x=2,y=3;
		System.out.printf( "x = %d\n", x );
		System.out.printf( "Value of %d + %d is %d\n", x, x, ( x + x ) );
		System.out.printf( "x =" );
		System.out.printf( "%d = %d\n", ( x + y ), ( y + x ) );
	}

}
