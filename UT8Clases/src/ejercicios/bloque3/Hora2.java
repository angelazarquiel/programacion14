package ejercicios.bloque3;

/*
 * A�ade los m�todos tick, incrementarMinuto e incrementarHora
 * que incrementan la hora en 1 segundo, 1 minuto y 1 hora respectivamente.
 * Crea un programa que prueba el funcionamiento de estos m�todos. Has de
 * asegurarte de que funcionan bien los siguientes casos:
 *   a. incremento al siguiente minuto,
 *   b. incremento a la siguiente hora,
 *   c. incremento al siguiente d�a.
 */
public class Hora2 {
	private int hora;
	private int minutos;
	private int segundos;

	public Hora2() {
		this.hora = 0;
		this.minutos = 0;
		this.segundos = 0;
	}

	public Hora2(int hora, int minutos, int segundos) {
		setHora(hora);
		setMinutos(minutos);
		setSegundos(segundos);
	}

	public Hora2(Hora2 hora) {
		this(hora.hora, hora.getMinutos(), hora.getSegundos());
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		if (minutos >= 0 && minutos <= 59)
			this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		if (segundos >= 0 && segundos <= 59)
			this.segundos = segundos;
	}

	public void setHora(int hora) {
		if (hora >= 0 && segundos <= 23)
			this.hora = hora;
	}

	public String getHora() {
		return String.format("%02d:%02d:%02d", this.hora, this.minutos,
				this.segundos);
	}

	@Override
	public String toString() {
		return "Hora: " + getHora();
	}

	private void acumular() {
		if (segundos >= 60) {
			minutos += segundos / 60;
			segundos = segundos % 60;
		}
		if (minutos >= 60) {
			hora += minutos / 60;
			minutos = minutos % 60;
		}
		if (hora >= 24) {
			hora = hora % 24;
		}
	}

	public Hora2 suma(Hora2 nuevaHora) {
		this.hora = nuevaHora.hora + this.hora;
		this.minutos = nuevaHora.minutos + this.minutos;
		this.segundos = nuevaHora.segundos + this.segundos;
		acumular();
		return this;
	}

	
	public Hora2 tick(int segundos) {
		this.segundos = this.segundos + segundos;
		acumular();
		return this;
	}
	
	/*
	public Hora2 tick(int segundos) {
		return suma(new Hora2(0,0,1));
	}*/

	public Hora2 incrementarMinuto(int minutos) {
		this.minutos = this.minutos + minutos;
		acumular();
		return this;
	}

	public Hora2 incrementarHora(int horas) {
		this.hora = this.hora + horas;
		acumular();
		return this;
	}

	public static void main(String[] args) {
		Hora comienzo = new Hora(16, 15, 0);
		Hora duraci�n = new Hora(6, 0, 0);
		Hora salida = new Hora();

		System.out.println(comienzo);
		Hora mihora, unahoraycuarto;
		mihora = new Hora(12, 45, 32);
		unahoraycuarto = new Hora(1, 15, 0);
		mihora.suma(unahoraycuarto);
		System.out.println(mihora);

		salida.suma(comienzo).suma(duraci�n);

		System.out.println(salida);

		for (int i = 0; i < 1200; i++)
			System.out.println(salida.suma(new Hora(0, 0, 3)));
	}
}
