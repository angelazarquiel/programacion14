package ejercicios;

import java.util.Scanner;

public class E04ConversorKilos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double kilos;
        final double ONZAS_KILO=35.2739619;
       
        System.out.println("Herramienta de conversión de Kg a onzas (1Kg="+
        		ONZAS_KILO+"oz)");
        System.out.println("Ahora introduce el peso en Kg");
        kilos=teclado.nextDouble();
       
        System.out.println(kilos + " kg son " + (kilos*ONZAS_KILO) + " onzas");
    }

}
