package ejercicios;

import java.util.Scanner;

public class E01MayorB {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int a�o,mes,dia;
		//d�a universidades de UCLA y Stanford se conectaron
		int internetA�o=1969,internetMes=11,internetDia=21;
		boolean mayor=false,menor=false,igual=false;
		
		System.out.print("�D�a de la efem�ride? ");
		System.out.print("Dame tres n�meros [a�o,mes,d�a]: ");
		a�o=teclado.nextInt();
		mes=teclado.nextInt();
		dia=teclado.nextInt();
		
		// soluci�n con condiciones l�gicas
		if (a�o>internetA�o || (a�o==internetA�o && mes>internetMes) || (a�o==internetA�o && mes==internetMes && dia>=internetDia))
			System.out.println("Es de la era post-Internet.");
		else if (a�o<internetA�o || (a�o==internetA�o && mes<internetMes) || (a�o==internetA�o && mes==internetMes && dia<internetDia))
			System.out.println("Es de la era pre-Internet.");
	
		
		// soluci�n con variables booleanas
		if (a�o>internetA�o)
			menor=true;
		else if (a�o<internetA�o)
			mayor=true;
		else igual=true;
		
		if (igual){
			igual=false;
			if (mes>internetMes)
				menor=true;
			else if (mes<internetMes)
				mayor=true;
			else igual=true;
		}
		
		if (igual){
			igual=false;
			if (dia>=internetDia)
				menor=true;
			else if (dia<internetDia)
				mayor=true;
			else igual=true;
		}
		
		if (menor)
			System.out.println("Es de la era post-Internet.");
		else if (mayor)
			System.out.println("Es de la era pre-Internet.");
	}


}
