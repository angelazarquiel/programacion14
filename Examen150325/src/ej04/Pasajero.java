package ej04;

public class Pasajero {

    

	private String nombre;
	private int maletasFacturadas;
	private boolean embarcado;


	public Pasajero(String n){
        nombre = n;
        maletasFacturadas = 0;
        embarcado = false;
    }
	
	public Pasajero(String n,int maletasFacturadas){
        this.nombre = n;
        this.maletasFacturadas = maletasFacturadas;
        this.embarcado = false;
    }

	public boolean haFacturado() {
		if (maletasFacturadas>0)
			return true;
		else
			return false;
	}
	
	public boolean haEmbarcado(){
	       return this.embarcado;
	}

	@Override
	public String toString() {
		return String.format("Pasajero: %s\n\tBultos facturados: %d\n\tEmbarcado: %s\n",
				nombre,maletasFacturadas,embarcado?"Si":"No");
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getMaletasFacturadas() {
		return maletasFacturadas;
	}

	public void setMaletasFacturadas(int maletasFacturadas) {
		this.maletasFacturadas = maletasFacturadas;
	}

	public void setEmbarcado(boolean embarcado) {
		this.embarcado = embarcado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Pasajero other = (Pasajero) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equalsIgnoreCase(other.nombre))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		Pasajero p;
		p=new Pasajero("Martínez, Pepe");
		p.setMaletasFacturadas(2);
		
		System.out.println(p);
	}
	
}
