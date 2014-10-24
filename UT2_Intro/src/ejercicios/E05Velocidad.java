package ejercicios;

import java.util.Scanner;

public class E05Velocidad {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long tamaño;
        long velocidad;
        long transferencia;
        long tamañoBits;
       
        System.out.println("Introduzca el peso del archivo (MBytes): ");
        tamaño = teclado.nextInt();
       
        System.out.println("Introduzca la velocidad (Mbps): ");
        velocidad = teclado.nextInt();
       
        tamañoBits = ((tamaño * 1024)*1024)*8;
        transferencia =(int)( tamañoBits / (velocidad*1000000.0));
       
        System.out.println("El archivo se transmite en " + transferencia + " segundos.");
        
	}

}
