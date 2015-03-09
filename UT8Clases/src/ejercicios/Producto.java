package ejercicios;


public class Producto {

	private long codigo;
	private double precio;
	private double descuento;
	
	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getPrecioTotal() {
		return this.precio*(1-this.descuento/100);
	}
	
	public void setPrecioTotal(double nuevoPrecio) {
		this.precio=nuevoPrecio/(1-descuento/100);
	}
	
	public static void main(String[] args) {
		Producto bicicleta=new Producto();

		bicicleta.setCodigo(2354);
		bicicleta.setPrecio(2000);
		bicicleta.setDescuento(20);
		
		System.out.println("Nueva bicicleta código: "+
					bicicleta.getCodigo() +
					" a " + bicicleta.getPrecioTotal() +
					" euros");
		
		bicicleta.setDescuento(25);
		bicicleta.setPrecioTotal(1600);
		System.out.println("Nueva bicicleta código: "+
				bicicleta.getCodigo() +
				" a " + bicicleta.getPrecioTotal() +
				" euros (valor original de " + 
				bicicleta.getPrecio() + ")");
	}
	
	

}




