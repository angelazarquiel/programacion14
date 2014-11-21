package test;

public class E3 {

	public static void main(String[] args) {
		boolean b = false;
		int mano = 42;
		if (mano < 50 && !b)
			mano++;
		if (mano > 50)
			;
		else if (mano > 40) {
			mano += 7;
			mano++;
		} else
			--mano;
		System.out.println(mano);

	}

}
