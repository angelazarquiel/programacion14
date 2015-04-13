package ejemplos;

public class MetodoArray {

	public static void main(String[] args) {

		int [][] matriz={{1,2},{3,4}};
		
		System.out.println(sumatorio(matriz));
		
		System.out.println(matriz[0][0]);

	}

	private static int sumatorio(int[][] matriz) {
		int suma=0;
		
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++) suma+=matriz[i][j];
		
		//for(int[] fila:matriz)
		//	for(int i:fila) suma+=i;
		
		return suma;
	}

}
