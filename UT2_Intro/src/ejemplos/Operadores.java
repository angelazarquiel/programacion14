package ejemplos;

public class Operadores {

	public static void main(String[] args) {
		int x,y;
		boolean resultado;
		
		x=10;
		y=5;
		resultado=x>y;
		
		System.out.println("x>y:" + (x>y));
		System.out.println("x>y:" + resultado);

		resultado= (x>y) && (x>0); //true
		resultado= (x>y) || (x>0); //true
		resultado= !(x>y); // false
		resultado= (x>y) || (x<0); //true
		
		resultado= ((x>y) || (x!=y)) && (y>10);
	}

}
