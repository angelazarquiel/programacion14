package ejercicios.bucles;

import javax.swing.JOptionPane;

public class E03anidadosPiedraPapel {

	public static void main(String[] args) {
		String pordefecto="";
		String respuesta=null;

	do {
		switch ((int) (Math.random() * 3 + 1)) {
		case 1:
			pordefecto = "piedra";
			break;
		case 2:
			pordefecto = "papel";
			break;
		case 3:
			pordefecto = "tijera";
		}

		String piedrapapeltijera = JOptionPane
				.showInputDialog("Vamos a jugar a piedra papel o tijera\n¿Qué eliges? (escríbelo):");

		if (pordefecto.equals(piedrapapeltijera))
			JOptionPane.showMessageDialog(null, "Has EMPATADO, porque "
					+ pordefecto + " y " + piedrapapeltijera + " son iguales.");
		else {
			JOptionPane.showMessageDialog(null, "He sacado " + pordefecto);
			if (pordefecto.equals("piedra") && piedrapapeltijera.equals("tijeras") ||
				pordefecto.equals("papel") && piedrapapeltijera.equals("piedra") ||
				pordefecto.equals("tijera") && piedrapapeltijera.equals("papel"))
				JOptionPane.showMessageDialog(null, "He GANADO.");
			else
				JOptionPane.showMessageDialog(null, "He PERDIDO");
		}
		
		do {
			respuesta=JOptionPane
					.showInputDialog("¿Quieres continuar [s/n]?:");
		}while(!(respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n")));
		
	} while (respuesta.equalsIgnoreCase("s"));
	}

}
