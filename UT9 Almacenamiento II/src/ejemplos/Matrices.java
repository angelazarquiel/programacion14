package ejemplos;

public class Matrices {

	public static void main(String[] args) {
		
		int [][] numeros;
		
		//int [][] numeros = {{0,1,2,3,4},{5,6,7,8,9}};
		
		//int [][]numeros;
		//numeros=new int[5][];
		//numeros[0]=new int[4];
		//numeros[1]=new int[5];
		//numeros[2]=new int[6];
		//numeros[3]=new int[7];
		//numeros[4]=new int[5];
		
		int contador=0;
		
		
		numeros=new int[5][5];
		
		for(int i=0;i<numeros.length;i++) {
			for(int j=0;j<numeros[i].length;j++)
				numeros[i][j]=contador++;
		}

		for(int i=0;i<numeros.length;i++) {
			System.out.print("[");
			for(int j=0;j<numeros[i].length;j++)
				System.out.printf("%2d ", numeros[i][j]);
			System.out.println("]");
		}
		
	}

}
