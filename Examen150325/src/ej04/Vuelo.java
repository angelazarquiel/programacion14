package ej04;

import java.util.ArrayList;

public class Vuelo {

	private int numeroVuelo;
	private int capacidad;
	private ArrayList<Pasajero> pasajeros;

	public Vuelo(int numeroVuelo, int capacidad) {
		this.numeroVuelo = numeroVuelo;
		this.capacidad = capacidad;
		pasajeros = new ArrayList<Pasajero>();
	}

	public int numEmbarcados() {
		int embarcados = 0;
		for (Pasajero p : pasajeros)
			if (p.haEmbarcado())
				embarcados++;
		return embarcados;
	}

	public boolean addPasajero(Pasajero p) {
		if (pasajeros.contains(p)) {
			System.out.println("El pasajero ya está en el vuelo");
			return false;
		}
		if (p.haEmbarcado()) {
			if (numEmbarcados() >= capacidad) {
				System.out.println("El vuelo ya está lleno");
				return false;
			}
		}

		pasajeros.add(p);
		return true;
	}

	public boolean embarca(String nombre) {

		if (numEmbarcados() >= this.capacidad) {
			System.out.println("El vuelo ya está lleno");
			return false;
		}

		for (int i = 0; i < pasajeros.size(); i++)
			if (pasajeros.get(i).getNombre().equals(nombre)) {
				pasajeros.get(i).setEmbarcado(true);
				return true;
			}
		
		return false;
	}

	public static void main(String[] args) {
		Vuelo v;
		Pasajero p;

		v = new Vuelo(1234, 2);
		p = new Pasajero("Oliva, Juan", 1);
		v.addPasajero(p);
		p = new Pasajero("Aceituna, José", 2);
		p.setEmbarcado(true);
		v.addPasajero(p);
		v.embarca("Oliva, Juan");
		v.addPasajero(new Pasajero("Aceituna, Carmen"));
		v.embarca("Aceituna, Carmen");

		System.out.println(v);

	}

	@Override
	public String toString() {
		return "Vuelo [numeroVuelo=" + numeroVuelo + ", capacidad=" + capacidad
				+ ", pasajeros=\n" + pasajeros + "]";
	}

}
