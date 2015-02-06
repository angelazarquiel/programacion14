package ejercicios;

import java.util.Scanner;

public class E04Años {

	
	public static int añosEntre(int dia, int mes, int año, 
				int dia_final, int mes_final, int año_final) {
		int años;
		
		años=año_final-año;
		
		if (mes_final<mes) años--;
		else if (mes_final==mes) 
			if (dia_final<dia) años--;
		
		return años;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int dia1,dia2,mes1,mes2,año1,año2;
		
		System.out.println("Escribe los dias-mes-año de tu nacimiento y el de hoy: ");
		dia1=teclado.nextInt();
		mes1=teclado.nextInt();
		año1=teclado.nextInt();
		dia2=teclado.nextInt();
		mes2=teclado.nextInt();
		año2=teclado.nextInt();

		System.out.println("Tienes : " + 
				añosEntre(dia1,mes1,año1,dia2,mes2,año2)+
				" años");
		
	}

}
