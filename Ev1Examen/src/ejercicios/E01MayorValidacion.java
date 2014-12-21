package ejercicios;

import java.util.Scanner;

public class E01MayorValidacion {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int a�o,mes,dia;
		int miA�o=1994,miMes=4,miDia=15;
		boolean mayor=false,menor=false,igual=false;
		boolean correcto;
		
		System.out.println("�Qu� d�a naciste? ");
		System.out.println("Dame tres n�meros [a�o,mes,d�a]: ");
		do {
			correcto=true;
			a�o=teclado.nextInt();
			mes=teclado.nextInt();
			dia=teclado.nextInt();
			
			if (a�o<1900 || a�o>2014) correcto=false;
			if (mes<1 || mes>12) correcto=false;
			if (dia<1) correcto=false;
			switch(mes) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (dia > 31) correcto=false;
					break;
				case 2:
					if (dia > 29) correcto=false;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (dia > 30) correcto=false;
					break;
			}
			if (!correcto)
				System.out.println("La fecha no es correcta, vuelva a intentarlo");
		} while(!correcto);
		
		// soluci�n con condiciones l�gicas
		if (a�o>miA�o || (a�o==miA�o && mes>miMes) || (a�o==miA�o && mes==miMes && dia>miDia))
			System.out.println("Eres m�s joven que yo (el programador).");
		else if (a�o<miA�o || (a�o==miA�o && mes<miMes) || (a�o==miA�o && mes==miMes && dia<miDia))
			System.out.println("Eres mayor que yo (el programador).");
		else
			System.out.println("�� Naciste el mismo d�a que yo  (el programador). !!");
		
		
		// soluci�n con variables booleanas
		if (a�o>miA�o)
			menor=true;
		else if (a�o<miA�o)
			mayor=true;
		else igual=true;
		
		if (igual){
			igual=false;
			if (mes>miMes)
				menor=true;
			else if (mes<miMes)
				mayor=true;
			else igual=true;
		}
		
		if (igual){
			igual=false;
			if (dia>miDia)
				menor=true;
			else if (dia<miDia)
				mayor=true;
			else igual=true;
		}
		
		if (menor)
			System.out.println("Eres m�s joven que yo (el programador).");
		else if (mayor)
			System.out.println("Eres mayor que yo (el programador).");
		else 
			System.out.println("�� Naciste el mismo d�a que yo  (el programador). !!");
	}

}
