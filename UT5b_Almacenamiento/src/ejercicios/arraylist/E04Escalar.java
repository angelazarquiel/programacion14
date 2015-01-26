package ejercicios.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E04Escalar {

	public static void main(String[] args) {
		int[] prueba={2, 4, -2, 5, 3, 0, 7};
		ArrayList<Integer> original=new ArrayList(Arrays.asList(2, 4, -2, 5, 3, 0, 7));
		
		ArrayList<Integer> escalado=new ArrayList<Integer>();
		
		for(int i=0;i<original.size();i++)
			if (original.get(i)>0) {
				for(int j=0;j<original.get(i);j++)
					escalado.add(original.get(i));
			}

		System.out.println(escalado);
	}

}
