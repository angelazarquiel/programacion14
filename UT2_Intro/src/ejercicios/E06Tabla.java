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
		
		a=(5>=6);
		b=(3!=3);
		System.out.println((a && b) + " " + (a || b )+ " " + !a + " " + !b);
		
		
		a= -7==8;
		/*
		b=22; 
		System.out.println((a && b) + " " + (a || b )+ " " + !a + " " + !b);
		 -No se puede hacer 
		*/
		
		a=(21!=12);
		b=true;
		System.out.println((a && b) + " " + (a || b )+ " " + !a + " " + !b);
		
		a= 4==2;
		b= 7<=-9;
		System.out.println((a && b) + " " + (a || b )+ " " + !a + " " + !b);
		
	}

}
