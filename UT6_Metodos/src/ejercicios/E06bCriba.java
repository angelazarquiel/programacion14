package ejercicios;

import java.util.ArrayList;
import java.util.Collections;

public class E06bCriba {

	public static void criba(int tope) {
		ArrayList<Integer> noprimos=new ArrayList<Integer>();
		for (int i = 2; i <= Math.sqrt(tope); i++) {
			if (!noprimos.contains(i)) {
				
				for (int j = i * i; j <= tope; j += i) {
					if (!noprimos.contains(j))
						noprimos.add(j);
				}
			}
		}
		
		Collections.sort(noprimos);
		System.out.println(noprimos);
	}
	
	public static void main(String[] args) {
		int n=100;
		
		criba(n);

	}

}
