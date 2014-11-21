package test;

public class E1 {

	public static void main(String[] args) {
		boolean a=false;
		boolean b=true;
		
		if (a) {
			System.out.println("A");
		} else if (a && b) {
			System.out.println("A && B");
		} else {
			if (!b) {
				System.out.println("notB");
			} else {
				System.out.println("ELSE");
			}
		}
	}

}
