package ejercicios.turiBus;

public class ParadaGuiada extends Parada{
	private String nombreActividad;
	private double precio;
	ParadaGuiada(String nombreParada,String horaBajada,String horaSalida,String tipo,String nombreActividad,double precio){
		super(nombreParada,horaBajada,horaSalida, tipo);
		this.nombreActividad=nombreActividad;
		this.precio=precio;
	}
	public String getNombreActividad() {
		return nombreActividad;
	}
	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String toString(){
		return super.toString()+", Nombre de la Actividad: "+this.nombreActividad+" Precio: "+this.precio;
	}
	
	public double coste() {
		return super.coste()+this.precio;
	}
}
