package ejercicios;

import java.util.Scanner;

public class E01MayorB {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int año,mes,dia;
		//día universidades de UCLA y Stanford se conectaron
		int internetAño=1969,internetMes=11,internetDia=21;
		boolean mayor=false,menor=false,igual=false;
		
		System.out.print("¿Día de la efeméride? ");
		System.out.print("Dame tres números [año,mes,día]: ");
		año=teclado.nextInt();
		mes=teclado.nextInt();
		dia=teclado.nextInt();
		
		// solución con condiciones lógicas
		if (año>internetAño || (año==internetAño && mes>internetMes) || (año==internetAño && mes==internetMes && dia>=internetDia))
			System.out.println("Es de la era post-Internet.");
		else if (año<internetAño || (año==internetAño && mes<internetMes) || (año==internetAño && mes==internetMes && dia<internetDia))
			System.out.println("Es de la era pre-Internet.");
	
		
		// solución con variables booleanas
		if (año>internetAño)
			menor=true;
		else if (año<internetAño)
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
