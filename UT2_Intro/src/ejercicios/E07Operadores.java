package ejercicios;

public class E07Operadores {

	public static void main(String[] args) {
		boolean a,b,c,d;
		
		a=(5>3);
		System.out.println(!a); 
		
		a=(5!=3);
		b=(4>3);
		System.out.println(a && b);
		
		a=(5!=3);
		b=(4>3);
		System.out.println(a || b);
		System.out.println((5!=3) || (4>3));
		
		a=(5<8);
		b=(3==3);
		System.out.println(a||b);
		
		a=(5!=3);
		b=(4>3);
		System.out.println( !a || b );
		
		a=(4!=3);
		b=(3>2);
		c=(4>8);
		System.out.println(a && (b||c));
		
		a=(3==5);
		b=(4!=2);
		System.out.println( (!a && b));
		
		a=(3==5);
		b=(4!=2);
		System.out.println( (!a || b));
		
		System.out.println((8>2) && (4<2) || (3!=4));
		System.out.println(((3>2) && (4<5) || (3!=2)) && !(2!=5));
	}

}
