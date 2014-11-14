package ejercicios.condicionales;

import java.util.Scanner;

public class E03Descuentos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Dame el precio del articulo que has comprado");
        double precio=sc.nextDouble();
        double descuento1=precio*10/100;
        double descuento2=precio*20/100;
		double descuento3=precio*25/100;
        double pfinal1=precio-descuento1;
        double pfinal2=precio-descuento2;
        double pfinal3=precio-descuento3;
        
        if(precio<20){
            System.out.println("El descuento aplicado es del 10% " + pfinal1 );
        }else if(precio >=20 && precio <= 50){
            System.out.println("El descuento aplicado es del 20% "+pfinal2);
        }else{
            System.out.println("El descuento es del 25% "+pfinal3);
        }
        sc.close();
	}

}
