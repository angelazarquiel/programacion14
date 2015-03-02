package ejemplos;

public class Ejemplo1 {

	public static void main(String[] args) {
		DosNumeros miCuenta;
		DosNumeros otro;
		
		miCuenta=new DosNumeros();
		otro=new DosNumeros();
		
		miCuenta.setNumero1(20);
		
		System.out.println(miCuenta.suma());
		
		miCuenta.setNumero2(15);
		
		System.out.println(miCuenta.suma());
		System.out.println(otro.suma());
	}

}
