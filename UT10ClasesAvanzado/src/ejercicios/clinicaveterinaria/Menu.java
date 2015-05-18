package ejercicios.clinicaveterinaria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

	private ArrayList<String> opciones;
	private String titulo;

	public Menu() {
		opciones = new ArrayList<String>();
		titulo = "Menú";
	}

	public Menu(List<String> opciones) {
		this.opciones = new ArrayList<String>(opciones);
		titulo = "Menú";
	}

	public void añadirOpción(String nuevaOpción) {
		this.opciones.add(nuevaOpción);
	}

	public void imprimir() {
		System.out.println(titulo);
		for (int i = 0; i < titulo.length(); i++)
			System.out.print("-");
		System.out.println();
		for (int i = 0; i < opciones.size(); i++)
			System.out.println((i + 1) + ". " + opciones.get(i));
		System.out.println(opciones.size()+1 + ". Salir");
	}

	public int imprimirYPreguntar() {
		Scanner scn = new Scanner(System.in);
		int opción;

		imprimir();
		System.out.println(" Opción: ");
		opción = scn.nextInt();

		return opción;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public static void main(String[] args) {

		Menu menu1;

		String[] opciones = { "Uno", "Dos", "Tres" };

		menu1 = new Menu(Arrays.asList(opciones));

		System.out.println("Ha seleccionado " + menu1.imprimirYPreguntar());

	}

}