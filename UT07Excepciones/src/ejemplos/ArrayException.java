package ejemplos;

import java.lang.ArrayIndexOutOfBoundsException;

public class ArrayException {

	public static void main(String[] args) {
		int[] a={1,2,3,4,5},
				b={1,2};
		int i=0;
		
		try {
			while (true){
				System.out.print(a[i++]+" ");
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			
		}
		b=null;
		b[0]=3;

	}

}
