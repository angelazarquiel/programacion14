package ejercicios.turiBus;

public class Parada implements Valorable {
	
    private String nombreParada;
    private String horaBajada;
    private String horaSalida;
    private String tipo;
    Parada( String nombreParada,String horaBajada,String horaSalida,String tipo){
    	this.nombreParada=nombreParada;
    	this.horaBajada=horaBajada;
    	this.horaSalida=horaSalida;
    	this.tipo=tipo;
    }
	public String getNombreParada() {
		return nombreParada;
	}
	public void setNombreParada(String nombreParada) {
		this.nombreParada = nombreParada;
	}
	public String getHoraBajada() {
		return horaBajada;
	}
	public void setHoraBajada(String horaBajada) {
		this.horaBajada = horaBajada;
	}
	public String getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String toString(){
		return "\nLugar de Parada: "+this.nombreParada+", Hora de Bajada: "+this.horaBajada+", Hora de Regreso: "+this.horaSalida;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nombreParada == null) ? 0 : nombreParada.hashCode());
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
		Parada other = (Parada) obj;
		if (nombreParada == null) {
			if (other.nombreParada != null)
				return false;
		} else if (!nombreParada.equals(other.nombreParada))
			return false;
		return true;
	}
	
	@Override
	public double coste() {		
		return 10.0;
	}
	
	
}
