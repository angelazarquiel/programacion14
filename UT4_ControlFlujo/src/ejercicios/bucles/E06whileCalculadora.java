package ejercicios.bucles;

import javax.swing.JOptionPane;

public class E06whileCalculadora {

	public static void main(String[] args) {
		 String numcadena1,numcadena2,operacioncadena;
		 int numero1,numero2;
		 
		 numcadena1 = JOptionPane.showInputDialog("Haremos operaciones de suma, resta, multiplicaci�n y divisi�n con dos n�mero enteros.\n\nIntroduce el primer n�mero entero:");
         numero1 = Integer.parseInt(numcadena1);
         
         numcadena2 = JOptionPane.showInputDialog("Introduce el segundo n�mero entero:");
         numero2 = Integer.parseInt(numcadena2);
         
		 operacioncadena="*";
	        while ((operacioncadena.equals("*")) || (operacioncadena.equals("+")) || (operacioncadena.equals("-")) || (operacioncadena.equals("/"))) {
	           
	            operacioncadena = JOptionPane.showInputDialog("Introduce el s�mbolo de la operaci�n:");
	            
	        switch (operacioncadena) {
	        
	        case "*":
	            JOptionPane.showMessageDialog(null, "Has MULTIPLICADO y el resultado es "+(numero1*numero2));
	            break;
	            
	        case "+":
	            JOptionPane.showMessageDialog(null, "Has SUMADO y el resultado es "+(numero1+numero2));
	            break;
	        
	        case "-":
	            JOptionPane.showMessageDialog(null, "Has RESTADO y el resultado es "+(numero1-numero2));
	            break;
	            
	        case "/":
	            JOptionPane.showMessageDialog(null, "Has DIVIDIDO y el resultado es "+(numero1/numero2));
	            break;
	            
	        default:
	            JOptionPane.showMessageDialog(null, "FIN");
	            break;
	            
	        } }

	}

}
