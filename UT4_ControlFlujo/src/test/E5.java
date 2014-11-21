package test;

public class E5 {

	public static void main(String[] args) {
		int i = 0, j = 5;
		boolean salir = false;
		for (; !salir;) {
			i++;
			for (; !salir;) {
				if (i > --j) {
					salir = true;
				}
			}
			System.out.println("i =" + i + ", j = " + j);
		}

	}

}
