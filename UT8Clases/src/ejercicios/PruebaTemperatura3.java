package ejercicios;

import java.util.Scanner;

public class PruebaTemperatura3 {

	public static void main(String[] args) {
		// Con m�todos Static
		Scanner scn=new Scanner(System.in);
		System.out.println("Dame la temperatura de hoy (Celsius):");
		float temp = scn.nextFloat();
		System.out.println("Hacen " + Temperatura3.celsiusToFarenheit(temp) + " �F");
		
		// Con objeto
		Temperatura3 temp3=new Temperatura3();
		System.out.println("Dame la temperatura de hoy (Celsius):");
		temp3.setCelsius(scn.nextFloat());
		System.out.println("Hacen " + temp3.getFahrenheit() + " �F");

	}

}
