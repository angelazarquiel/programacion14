package ejercicios.bloque3;

public class PruebaFechayHora {

	public static void main(String[] args) {

		FechayHora fecha;
		
		fecha=new FechayHora(0,15,16,23,3,2015);
		
		for(int i=0;i<100;i++) {
			fecha.siguienteHora();
			System.out.println(fecha);
		}
	}

}
