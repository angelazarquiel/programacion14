package ejercicios;

import java.util.Scanner;

public class E04A�os {

	
	public static int a�osEntre(int dia, int mes, int a�o, 
				int dia_final, int mes_final, int a�o_final) {
		int a�os;
		
		a�os=a�o_final-a�o;
		
		if (mes_final<mes) a�os--;
		else if (mes_final==mes) 
			if (dia_final<dia) a�os--;
		
		return a�os;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int dia1,dia2,mes1,mes2,a�o1,a�o2;
		
		System.out.println("Escribe los dias-mes-a�o de tu nacimiento y el de hoy: ");
		dia1=teclado.nextInt();
		mes1=teclado.nextInt();
		a�o1=teclado.nextInt();
		dia2=teclado.nextInt();
		mes2=teclado.nextInt();
		a�o2=teclado.nextInt();

		System.out.println("Tienes : " + 
				a�osEntre(dia1,mes1,a�o1,dia2,mes2,a�o2)+
				" a�os");
		
	}

}
