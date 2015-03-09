package ejercicios;

public class Oculto {
/* Crea la clase Oculto que contiene un número oculto. 
 * Cuando se crea un objeto de esta clase, se crea
 *  internamente un número aleatorio entre 1 y 100,
 *   o entre los números que se le pasan por parámetros
 *    (mínimo y máximo). Esta clase entrá el método:
 *     pruebaNumero(int n), que devolverá 0 si el número
 *      es el oculto, -1 si el número oculto es menor y
 *       +1 si el número oculto es mayor.
 *       Utiliza esta clase para crear la aplicación
 *       Adivina el número
 */
	private int oculto;

	public Oculto() {
		this.oculto=(int)(Math.random()*100+1);
	}
	
	public Oculto(int minimo, int maximo) {
		this.oculto=(int)(Math.random()*(maximo-minimo+1)+minimo);
	}
	
	public int pruebaNumero(int n) {
		if (n==oculto)
			return 0;
		else if (n<oculto)
			return 1;
		else 
			return -1;
	}
}
