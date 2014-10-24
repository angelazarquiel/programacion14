package ejercicios.dia22;

public class E0211 {

	public static void main(String[] args) {
		/* Which of the following Java statements contain variables whose values are modified?
			>>	a) p = i + j + k + 7;
				b) System.out.println( "variables whose values are modified" );
				c) System.out.println( "a = 5" );
			>>	d) value = input.nextInt();
		  2.12 Given that y = a*x^3 + 7, which of the following are correct Java statements for this equation?
			>>	a) y = a * x * x * x + 7;
				b) y = a * x * x * ( x + 7 );
				c) y = ( a * x ) * x * ( x + 7 );
			>>	d) y = ( a * x ) * x * x + 7;
			>>	e) y = a * ( x * x * x ) + 7;
				f) y = a * x * ( x * x + 7 );
		  2.13 State the order of evaluation of the operators in each of the following Java statements, and
				show the value of x after each statement is performed:
				a) x = 7 + 3 * 6 / 2 - 1;
				b) x = 2 % 2 + 2 * 2 - 2 / 2;
				c) x = ( 3 * 9 * ( 3 + ( 9 * 3 / ( 3 ) ) ) );
		 */
		System.out.println(7 + 3 * 6 / 2 - 1);
		System.out.println(2 % 2 + 2 * 2 - 2 / 2);
		System.out.println( 3 * 9 * ( 3 + ( 9 * 3 / ( 3 ) ) ) );
	}

}
