package ejercicios;

import java.util.Scanner;

public class E01Mayor {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int año,mes,dia;
		int miAño=1994,miMes=4,miDia=15;
		boolean mayor=false,menor=false,igual=false;
		
		System.out.print("¿Qué día naciste? ");
		System.out.print("Dame tres números [año,mes,día]: ");
		año=teclado.nextInt();
		mes=teclado.nextInt();
		dia=teclado.nextInt();
		
		// solución con condiciones lógicas
		if (año>miAño || (año==miAño && mes>miMes) || (año==miAño && mes==miMes && dia>miDia))
			System.out.println("Eres más joven que yo (el programador).");
		else if (año<miAño || (año==miAño && mes<miMes) || (año==miAño && mes==miMes && dia<miDia))
			System.out.println("Eres mayor que yo (el programador).");
		else
			System.out.println("¡¡ Naciste el mismo día que yo  (el programador). !!");
		
		
		// solución con variables booleanas
		if (año>miAño)
			menor=true;
		else if (año<miAño)
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
			System.out.println("Eres más joven que yo (el programador).");
		else if (mayor)
			System.out.println("Eres mayor que yo (el programador).");
		else 
			System.out.println("¡¡ Naciste el mismo día que yo  (el programador). !!");
	}

}
