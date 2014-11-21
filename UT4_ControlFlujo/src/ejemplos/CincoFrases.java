package ejemplos;

import java.util.Scanner;

public class CincoFrases {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		String leido;
		
		for(int i=1;i<=5;i++) {
			leido=teclado.nextLine();
			System.out.println(leido);
		}
		
		/*for(int i=5;i>0;i--) {
			leido=teclado.nextLine();
			System.out.println(leido);
		}
		*/
		
	}

}
