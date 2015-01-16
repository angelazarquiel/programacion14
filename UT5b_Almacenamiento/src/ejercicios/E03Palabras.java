package ejercicios;

import java.util.Scanner;

public class E03Palabras {

	public static void main(String[] args) {
	        Scanner teclado=new Scanner(System.in);
	        int numPalabras=1;
	        boolean anteriorNoLetra=true;
	        System.out.println("introduce una frase: ");
	        String frase=teclado.nextLine();
	        for(int i=0;i<frase.length();i++){

	            if(frase.charAt(i)==' ' || frase.charAt(i)==',' || frase.charAt(i)=='.' || frase.charAt(i)==';')
	                
	            {
	                if(anteriorNoLetra==true)
	                    continue;
	                else
	                {
	                numPalabras++;
	                anteriorNoLetra=true;
	                }
	            }
	            else
	                anteriorNoLetra=false;
	        }
	        if(frase.equals("") || frase.equals(" ") || frase.equals(",") || frase.equals(".") || frase.equals(";"))
	            numPalabras=0;
	        System.out.println("la frase tiene "+numPalabras+" palabras");
	}

}
