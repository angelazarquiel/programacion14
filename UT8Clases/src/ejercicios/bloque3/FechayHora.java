package ejercicios.bloque3;

public class FechayHora {
	private Hora hora;
	private Fecha fecha;
	
	public FechayHora() {
		hora=new Hora();
		fecha=new Fecha(20,3,2015);
	}
	
	public FechayHora(int segundos,int minutos,int horas,int dia,int mes,int año) {
		hora=new Hora(horas,minutos,segundos);
		fecha=new Fecha(dia,mes,año);
	}
	
	public void siguienteHora() {
		hora.suma(new Hora(1,0,0));
		//hora.setHora(hora.getHora()+1);
		if (hora.getHora()==0) {
			fecha.siguienteDia();
		}
	}

	@Override
	public String toString() {
		return  fecha + " " +hora ;
	}
	
	
	
}
