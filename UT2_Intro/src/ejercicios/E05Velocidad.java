package ejercicios;

import java.util.Scanner;

public class E05Velocidad {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long tama�o;
        long velocidad;
        long transferencia;
        long tama�oBits;
       
        System.out.println("Introduzca el peso del archivo (MBytes): ");
        tama�o = teclado.nextInt();
       
        System.out.println("Introduzca la velocidad (Mbps): ");
        velocidad = teclado.nextInt();
       
        tama�oBits = ((tama�o * 1024)*1024)*8;
        transferencia =(int)( tama�oBits / (velocidad*1000000.0));
       
        System.out.println("El archivo se transmite en " + transferencia + " segundos.");
        
	}

}
