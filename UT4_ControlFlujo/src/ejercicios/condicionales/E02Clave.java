package ejercicios.condicionales;

import javax.swing.JOptionPane;

public class E02Clave {

	public static void main(String[] args) {
        String palabra, respuesta;
        
        JOptionPane.showMessageDialog(null, "ADIVINA LA PALABRA QUE ESCONDE EL PROGRAMA");
        JOptionPane.showMessageDialog(null, "PISTA: Lo haces en este modulo...");
        respuesta = JOptionPane.showInputDialog("Diga, ¿Que palabra cree que es?");
        palabra = "programacion";
        
        if (palabra.equals(respuesta)){
            JOptionPane.showMessageDialog(null, "RESPUESTA CORRECTA: La palabra es Programacion");}
            else{
                JOptionPane.showMessageDialog(null, "ERROR: " + respuesta + " no es la palabra.");
            }

	}

}
