package test;

public class E10 {

	public static void main(String[] args) {
		int i = 1, j = 10;
		boolean salir = false;
		do {
			if (i > j) {
				salir = true;
			}
			j--;
			++i;
		} while (i < 5 && !salir);
		System.out.println("i = " + i + " y j = " + j);
	}
}
