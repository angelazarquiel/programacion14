package test;

public class E11 {

	public static void main(String[] args) {
		final short x = 2;
		int y = 0;
		for (int z = 0; z < 4; z++) {
			switch (z) {
			case x:
				System.out.print("0 ");
			default:
				System.out.print("def ");
			case x - 1:
				System.out.print("1 ");
				break;
			case x - 2:
				System.out.print("2 ");
			}
		}

	}

}
