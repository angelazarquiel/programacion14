package ejercicios.dia27;

import java.util.Scanner;

public class E33 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double peso,altura,imc;
		
		System.out.println("Calculo del indice de masa corporal");
		
		
		System.out.print("Introduce el peso (en kg): ");
		peso = entrada.nextDouble();
		System.out.print("Introduce la altura (en centimetros): ");
		altura = entrada.nextDouble() / 100;
		imc = peso / (altura * altura);
		System.out.println("Para un peso de " + peso + " kilogramos y");
		System.out.println("una altura de " + altura + " metros");
		System.out.println("el indice de masa corporal es de " + (int) imc);
		if (imc < 18.5) {
			System.out.println("¡¡Peso insuficiente!!");
		} else if (imc == 18.5 || imc <= 24.9) {
			System.out.println("Peso normal");

		} else if (imc <= 25 || imc <= 29.9) {
			System.out.println("Tienes sobrepeso");
		} else if (imc > 30) {
			System.out.println("¡¡Tienes obesidad!!");
		}
		
		System.out.println(
		"BMI VALUES\n"+
		"Underweight: less than 18.5\n"+
		"Normal: between 18.5 and 24.9\n"+
		"Overweight: between 25 and 29.9\n"+
		"Obese: 30 or greater\n"
				);
		
		System.out.printf("Tu índice es %.1f " , imc);
		

	}

}
