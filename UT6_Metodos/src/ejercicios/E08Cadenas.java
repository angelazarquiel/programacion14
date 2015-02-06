package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class E08Cadenas {

public static String[] meterPalabras(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Qué tamaño tendrá el vector? ");
        int tamaño = teclado.nextInt();
        String[] cadenas = new String[tamaño];

        System.out.print("Introduce " + cadenas.length + " palabras: ");
        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = teclado.next();
        }
        
        return cadenas;
    }

    public static boolean duplicados(String[] cadena) {
        String[] ordenado;
        
        ordenado=Arrays.copyOf(cadena, cadena.length);
        Arrays.sort(ordenado);
        
        for (int i = 1; i < ordenado.length; i++) 
        	if (ordenado[i].equalsIgnoreCase(ordenado[i-1]))
        		return true;
        

        return false;

    }

    public static void main(String[] args) {
        
        String[] cadenas=meterPalabras();

        boolean resultado = duplicados(cadenas);

        if (resultado) {
            System.out.println("\nLa serie tiene elementos repetidos.");
        } else {
            System.out.println("\nLa serie NO tiene elementos repetidos.");
        }

    }
}
