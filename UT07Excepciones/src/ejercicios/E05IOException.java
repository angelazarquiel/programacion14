package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class E05IOException {

public static String leerNombre(BufferedReader teclado) {
	String nombre1=null;
	try {
        System.out.print("Introduce el nombre: ");
        nombre1 = teclado.readLine();
    } catch (java.io.IOException io1) {
        System.out.println("No se puede leer de teclado");
        System.exit(-1);
    }
	
	return nombre1;
}

public static int leerEdad(BufferedReader teclado) {
	boolean bienLeido=false;
	int edad1=0;
	while(!bienLeido) {
	    try {
	        System.out.print("Introduce la edad: ");
	        edad1 = Integer.parseInt(teclado.readLine());
	        bienLeido = true;
	    } catch (NumberFormatException e2) {
	        System.out.println("Eso no era un número.");
	    } catch (IOException io2) {
	        System.out.println("No se puede leer de teclado");
	        System.exit(-1);
	    }
	}
	return edad1;
}

private static double leerAltura(BufferedReader teclado) {
	boolean bienLeido=false;
	double altura=0.0;
	 while (!bienLeido) {
         try {
             System.out.print("Introduce la altura: ");
             String altura1Str = teclado.readLine();
             altura = Double.parseDouble(altura1Str);
             bienLeido = true;
         } catch (NumberFormatException  e3) {
             System.out.println("Eso no era un número.");

         } catch (IOException io3) {
             System.out.println("No se pudo leer");
             System.exit(-1);
         }
     }
	return altura;
}

public static void main(String[] args) {
        // Scanner teclado = new Scanner(System.in);
        BufferedReader teclado;
        teclado = new BufferedReader(new InputStreamReader(System.in));

        String[] nombres=new String[2];
        int[] edades=new int[2];
        double[] alturas=new double[2];
        
        System.out.println("Alumno uno");
        nombres[0]=leerNombre(teclado);
        edades[0]=leerEdad(teclado);
        alturas[0]=leerAltura(teclado);
        System.out.println("Alumno dos");
        nombres[1]=leerNombre(teclado);
        edades[1]=leerEdad(teclado);
        alturas[1]=leerAltura(teclado);

        if (edades[0]>edades[1]){
        	System.out.println(nombres[0] + " es mayor que " + nombres[1]);
        } else
        	if (edades[1]>edades[0])
        		System.out.println(nombres[1] + " es mayor que " + nombres[0]);
        	else
        		System.out.println(nombres[0] + " y " + nombres[1] + " tienen la misma edad");

    }


}
