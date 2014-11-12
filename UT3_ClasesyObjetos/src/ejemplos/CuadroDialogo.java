package ejemplos;

import javax.swing.JOptionPane;


public class CuadroDialogo {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Hola Mundo!");
		
		String nombre;
		
		nombre = JOptionPane.showInputDialog("Dime tu nombre:");

		JOptionPane.showMessageDialog(null, "Hola " + nombre);
		
		String numero;
		int n;
		numero = JOptionPane.showInputDialog("Dime un número: ");
		
		n=Integer.parseInt(numero);
		
		System.out.println(n);
		
	}

}
