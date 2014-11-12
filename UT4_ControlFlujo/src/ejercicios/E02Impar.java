package ejercicios;

import javax.swing.JOptionPane;

public class E02Impar {

	public static void main(String[] args) {
		String numeroparimpar;

        numeroparimpar = JOptionPane.showInputDialog("Necesitamos averiguar si un número es par o impar.\nIntroduce el número:");

        int num = Integer.parseInt(numeroparimpar);
                
        if ( num%2 == 0 )
            JOptionPane.showMessageDialog(null, "Tu número es el "+num+ "\n¡Y ES PAR!");
        else
        	JOptionPane.showMessageDialog(null, "¡ES IMPAR!");

	}

}
