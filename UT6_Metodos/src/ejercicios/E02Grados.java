package ejercicios;

import javax.swing.JOptionPane;

public class E02Grados {

   public static void main(String[] args) {
		
		String opcion;
		double tInicial, tFinal;
		boolean salir = false;

		// Menu con un selector para elegir la unidad a convertir.
		
		do {
			opcion = JOptionPane.showInputDialog("CONVERSOR DE TEMPERATURAS \n\n"
									+ "- Introduzca a que unidad  desea convertir [Farenheit o Celsius]:  \n");
			
			if (opcion.equalsIgnoreCase("farenheit")){
				tInicial = Double.parseDouble(JOptionPane.showInputDialog("Introduzca grados Centigrados: "));
				tFinal = celsiusFarenheit(tInicial);
				
				JOptionPane.showMessageDialog(null, tInicial + "°C son " + tFinal + "°F");
				salir = true;
			}
			else if (opcion.equalsIgnoreCase("celsius")) {
				tInicial = Double.parseDouble(JOptionPane.showInputDialog("Introduzca grados Farenheit: "));
				tFinal = farenheitCelsius(tInicial);
				
				JOptionPane.showMessageDialog(null, tInicial + "°F son " + tFinal + "°C");
				salir = true;
			}
			else {
				JOptionPane.showMessageDialog(null, "Debe Introducir Celsius o Farenheit.");
			}
			
		}while(!salir);

	}
	
	// Metodo para convertir Grados Centigrados a Farenheit
	
	public static double celsiusFarenheit(double celsius) {
		double farenheit;
		farenheit = celsius * 1.8 + 32;
		return farenheit;
	}
	
	// Metodo para convertir Grados Farenheit a Centigrados
	
	public static double farenheitCelsius(double farenheit) {
		double celsius;
		celsius = (farenheit - 32) / 1.8;
		return celsius;
	}

}
