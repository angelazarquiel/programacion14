package ejercicios;

import java.util.Scanner;

public class E05Rotar {

	public static void main3(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char a;
        
        System.out.print("Vamos a rotar los caracteres de una palabra o frase X posiciones como indiques.\nIntroduce palabra o frase: ");
        String palabra = teclado.nextLine();
        System.out.print("¿Qué cantidad de posiciones quieres rotar? ");
        int posiciones = teclado.nextInt();
        
        posiciones=posiciones%palabra.length();
        System.out.print("\nLa palabra resultante es: ");
        for (int i=(palabra.length())-posiciones;i<palabra.length();i++) {
            a = palabra.charAt(i);
            System.out.print(a);
        }
        
        for (int i=0;i<palabra.length()-posiciones;i++) {
            a = palabra.charAt(i);
            System.out.print(a);
        }
	}

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Vamos a rotar los caracteres de una palabra o frase X posiciones como indiques.\nIntroduce palabra o frase: ");
        String palabra = teclado.nextLine();
        System.out.print("¿Qué cantidad de posiciones quieres rotar? ");
        int posiciones = teclado.nextInt();
        
        posiciones=posiciones%palabra.length();
        System.out.print("\nLa palabra resultante es: ");
        System.out.print(
        	palabra.substring((palabra.length())-posiciones, palabra.length()));
        System.out.println(
        	palabra.substring(0, (palabra.length())-posiciones));
	}
	
	public static void main2(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String frase;
		int rotar;

		int contador2 =0;

		System.out.println("Escribe una frase");
		frase = teclado.nextLine();
		System.out.println("Indica el numero de rotaciones");
		rotar = teclado.nextInt();

		contador2 = rotar;

		while(rotar>0){
		System.out.print(frase.charAt(frase.length()-rotar));
		rotar--;
		}
		for(int i=0;i<frase.length()-contador2;i++){
		System.out.print(frase.charAt(i));
		}

	}
	
}
