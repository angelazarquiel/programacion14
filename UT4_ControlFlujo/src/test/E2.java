package test;

public class E2 {

	public static void main(String[] args) {
		boolean b1 = false, b2 = false;
		int x = 0;
		if (!b1) {
			if (!b2) {
				b1 = true;
				x++;
				if (5 > 6) {
					x++;
				}
				if (!b1)
					x = x + 10;
				else if (b2 = true)
					x = x + 100;
				else if (b1 || b2)
					x = x + 1000;
			}
		}
		System.out.println(x);

	}

}
