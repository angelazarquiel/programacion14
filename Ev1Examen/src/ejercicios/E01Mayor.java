package ejercicios;

import java.util.Scanner;

public class E01Mayor {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int a�o,mes,dia;
		int miA�o=1994,miMes=4,miDia=15;
		boolean mayor=false,menor=false,igual=false;
		
		System.out.print("�Qu� d�a naciste? ");
		System.out.print("Dame tres n�meros [a�o,mes,d�a]: ");
		a�o=teclado.nextInt();
		mes=teclado.nextInt();
		dia=teclado.nextInt();
		
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
