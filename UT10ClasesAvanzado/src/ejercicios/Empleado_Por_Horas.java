package ejercicios;

public class Empleado_Por_Horas extends Empleado {
	
	protected double precioPorHora;
	protected int horasTrabajadas;

	public double getPrecioPorHora() {
		return precioPorHora;
	}

	@Override
	public String toString() {
		return super.toString() + " --- Empleado_Por_Horas [precioPorHora=" + precioPorHora
				+ ", horasTrabajadas=" + horasTrabajadas + "]";
	}

	public void setPrecioPorHora(double precioPorHora) {
		this.precioPorHora = precioPorHora;
	}

	public Empleado_Por_Horas(String nombre, String ocupacion, double precioPorHora, int horasTrabajadas) {
		
		super(nombre, ocupacion);
		this.precioPorHora = precioPorHora;
		this.horasTrabajadas = horasTrabajadas;
		
	}
	
	@Override
	public double calculaSalarioSemanal() {
		return precioPorHora * horasTrabajadas;
	}

}
