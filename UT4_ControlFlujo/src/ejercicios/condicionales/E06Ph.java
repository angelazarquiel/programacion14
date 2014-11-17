package ejercicios.condicionales;

import javax.swing.JOptionPane;

public class E06Ph {

	public static void main(String[] args) {

		String phcadena = JOptionPane.showInputDialog("Averiguando si un compuesto es ácido y muy ácido.\nIntroduce el valor del PH del compuesto:");
		double ph = Double.parseDouble(phcadena);

		if (ph > 3.0 && ph <= 7.0) {
			JOptionPane.showMessageDialog(null,
					"El compuesto es ácido (PH menor de 7.0)");
		}
		
		if (ph <= 3.0) {
			JOptionPane.showMessageDialog(null,
					"El compuesto es peligrosamente ácido (PH menor de 3.0)");
		}
	}

}
