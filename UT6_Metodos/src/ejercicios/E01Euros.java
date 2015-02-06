package ejercicios;


import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class E01Euros {

	public static void main(String[] args) {
		
		String opcion;
		double moneda, cambio;
		boolean salir = false;

		do {
			opcion = JOptionPane.showInputDialog("Conversor Dolares -> Euros -> Dolares \n"
		
									+ "******************************************************\n"
									+ "- Introduzca [DE] si quiere convertir Dolares a Euros \n"
									+ "- Introduzca [ED] si quiere convertir Euros a Dolares \n\n");
			
			if (opcion.equalsIgnoreCase("de")){
				moneda = Double.parseDouble(JOptionPane.showInputDialog("Introduzca Dolares: "));
				cambio = dolarEuro(moneda);
				
				JOptionPane.showMessageDialog(null, moneda + " Dolares son " + cambio + " Euros.");
				salir = true;
			}
			else if (opcion.equalsIgnoreCase("ed")) {
				moneda = Double.parseDouble(JOptionPane.showInputDialog("Introduzca Euros: "));
				cambio = euroDolar(moneda);
				
				JOptionPane.showMessageDialog(null, moneda + " Euros son " + cambio + " Dolares.");
				salir = true;
			}
			else {
				JOptionPane.showMessageDialog(null, "Debe Introducir DE o ED.");
			}
			
		}while(!salir);
	}
	
	// Metodo para convertir dolares a euros.

	public static double dolarEuro(double dolares) {
		double euros;
		euros = Util.redondea(dolares * 0.889838049,4);
		return euros;
	}
	
	// Metodo para convertir euros a dolares.
	
	public static double euroDolar(double euros) {
		double dolares;
		dolares = Util.redondea(euros * 1.1238,4);
		return dolares;
	}
	

	
}
