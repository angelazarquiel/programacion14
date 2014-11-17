package ejercicios.condicionales;

import javax.swing.JOptionPane;

public class E07PPT {

	public static void main(String[] args) {
		String pordefecto="";

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
			/*
			switch (pordefecto)  {
				case "piedra":
					if (piedrapapeltijera.equals("tijeras"))
						JOptionPane.showMessageDialog(null, "He GANADO");
					else JOptionPane.showMessageDialog(null, "He PERDIDO");
					break;
				case "papel":
					if (piedrapapeltijera.equals("tijeras"))
						JOptionPane.showMessageDialog(null, "He PERDIDO");
					else JOptionPane.showMessageDialog(null, "He GANADO");
					break;
				case "tijera":
					if (piedrapapeltijera.equals("papel"))
						JOptionPane.showMessageDialog(null, "He GANADO");
					else JOptionPane.showMessageDialog(null, "He PERDIDO");
					break;
			}
			*/
			
			JOptionPane.showMessageDialog(null, "He sacado " + pordefecto);
			if (pordefecto.equals("piedra") && piedrapapeltijera.equals("tijeras") ||
				pordefecto.equals("papel") && piedrapapeltijera.equals("piedra") ||
				pordefecto.equals("tijera") && piedrapapeltijera.equals("papel"))
				JOptionPane.showMessageDialog(null, "He GANADO.");
			else
				JOptionPane.showMessageDialog(null, "He PERDIDO");
		}
			
	}

}
