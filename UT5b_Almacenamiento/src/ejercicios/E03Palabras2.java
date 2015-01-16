package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class E03Palabras2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
        int numPalabras=1;
        boolean anteriorNoLetra=true;
        System.out.println("introduce una frase: ");
        String frase=teclado.nextLine();
        
        System.out.println(Arrays.toString(frase.split(" ")));
        System.out.println(frase.split(" ").length);

	}

}
