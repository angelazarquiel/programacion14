package test;

public class E8 {

	public static void main(String[] args) {
		boolean[] b = new boolean[3];
		int count = 0;
		b[0] = true;
		++count;
		b[2] = true;
		++count;
		if (b[0] && b[1] || b[2])
			count++;
		if (b[1] && b[(++count - 2)])
			count += 7;
		System.out.println("count = " + count);

	}

}
