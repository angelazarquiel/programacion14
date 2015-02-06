package ejemplos;

import java.util.Arrays;

public class Aleatorio {

	public static int numero(int min,int max) {
		int aleatorio;
		
		aleatorio=(int)(Math.random()*(max-min+1)+min);
		
		return aleatorio;
	}
	
	public static void main(String[] args) {
		
		int[] vector=new int[numero(20,30)];
		
		for(int i=0;i<vector.length;i++)
			vector[i]=numero(1,100);
		
		System.out.println(Arrays.toString(vector));
	}

}
