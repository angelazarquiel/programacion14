package ejercicios;

public class Empleado_Asalariado extends Empleado {
	
	protected double salarioSemanal;

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	public Empleado_Asalariado(String nombre, String ocupacion, double ss) {
		super(nombre, ocupacion);
		this.salarioSemanal = ss;
	}

	@Override
	public String toString() {
		return super.toString() + " --- Empleado_Asalariado [salarioSemanal=" + salarioSemanal + "]";
	}
	
	@Override
	public double calculaSalarioSemanal() {
		return this.salarioSemanal;
	}

}
