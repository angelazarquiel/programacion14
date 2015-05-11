package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EmpleadoTest {

	public static void main(String[] args) {
		
		Empleado javier = new Empleado_Asalariado("Javier","jefe de estudios",300);
		System.out.println(javier);
		
		Empleado_Asalariado jorge = new Empleado_Asalariado("Jorge", "profesor", 300.00);
		System.out.println(jorge);
		System.out.println(jorge.getSalarioSemanal());
		
		Empleado_Por_Horas ricardo = new Empleado_Por_Horas("Ricardo", "mantenimiento", 25.00, 8);
		System.out.println(ricardo);
		System.out.println(ricardo.calculaSalarioSemanal());
		
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		
		empleados.addAll(Arrays.asList(javier,jorge,ricardo));
		assert empleados.size()==3;
		
		double costePersonal=0.0;
		
		for(Empleado e:empleados) {
			if (e instanceof Empleado_Asalariado) 
				System.out.println("Un Empleado Asalariado");
			System.out.println(e.getClass().getName()); 
			costePersonal+=e.calculaSalarioSemanal();
		}
		
		System.out.println("Coste total de empleados:" + costePersonal);
		
	}

}
