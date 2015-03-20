package ejercicios.bloque3;

public class Complejo {

	private double real;
	private double imaginaria;

	public Complejo() {
		this.real = 0;
		this.imaginaria = 0;
	}

	public Complejo(double real, double imaginaria) {
		this.real = real;
		this.imaginaria = imaginaria;
	}

	public void suma(Complejo b) {
		this.real = this.real + b.real;
		this.imaginaria = this.imaginaria + b.imaginaria;
	}

	@Override
	public String toString() {
		return String.format("(%.2f%+.2fi)", real, imaginaria);
	}

	public void resta(Complejo b) {
		this.real = this.real - b.real;
		this.imaginaria = this.imaginaria - b.imaginaria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(imaginaria);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(real);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (imaginaria != other.imaginaria)
			return false;
		if (real!= other.real)
			return false;
		return true;
	}

	public void multiplica(Complejo b) {
		double resReal= (this.real * b.real)-(this.imaginaria * b.imaginaria);
		double resImaginaria= (this.real * b.imaginaria) + (this.imaginaria * b.real);
		this.real = resReal;
		this.imaginaria = resImaginaria;
	}

	public void divide(Complejo b) {
		double resReal= ((this.real * b.real)+(this.imaginaria * b.imaginaria))/
					(b.real*b.real+b.imaginaria*b.imaginaria);
		double resImaginaria= ((this.imaginaria * b.real)-(this.real * b.imaginaria))/
					(b.real*b.real+b.imaginaria*b.imaginaria);;
		
		this.real = resReal;
		this.imaginaria = resImaginaria;
	}
	
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginaria() {
		return imaginaria;
	}

	public void setImaginaria(double imaginaria) {
		this.imaginaria = imaginaria;
	}
}
