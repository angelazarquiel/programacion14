package ejercicios;

import javax.swing.JOptionPane;

public class E01Farenheit {

	public static void main(String[] args) {

		String gradosfa;

		gradosfa = JOptionPane
				.showInputDialog("Vamos a convertir grados Fahrenheit a grados cent�grados\nIntroduce la temperatura en �F:");

		int fa = Integer.parseInt(gradosfa);
		//Integer.toString(fa);

		int cent = (int) ((fa-32)/1.8);

		JOptionPane.showMessageDialog(null,
				"La temperatura que has introducido es de " + fa
						+ " �F. La temperatura en �C es de " + cent);
		if (cent <= 0) { 
			JOptionPane.showMessageDialog(null, "�Congelaci�n!");
		}

	}

}
