package ejemplos;

public class Cadenas {

	public static void main(String[] args) {
		String cadena1="mi cadena";
		String cadena2;
		
		cadena2=new String("cadena 2");
		
		System.out.println(cadena1);
		System.out.println(cadena2);
		
		cadena1=cadena2;
		
		System.out.println(cadena1);
		System.out.println(cadena2);
		
		cadena1=cadena2+cadena2;
		
		cadena1=cadena1+".";
		cadena1+=".";
		
		System.out.println(cadena1);
		
		cadena1.length();
		cadena1.equals("comparando");
		
		String hola="Hola mundo\n";
		char a;
		
		System.out.println(hola.charAt(0));
		for(int i=0;i<hola.length();i++) {
			a=hola.charAt(i);
			System.out.print(hola.charAt(i)+"-");
		}
		
		int oes=0;
		for(int i=0;i<hola.length();i++) {
			a=hola.charAt(i);
			if (a=='o' || a=='O') oes++;
		}
		System.out.println("En " + hola + " hay " + oes + " o's");
		
		
		
		int especiales=0;
		for(int i=0;i<hola.length();i++) {
			a=hola.charAt(i);
			if (!Character.isLetterOrDigit(a)) especiales++;
		}
		System.out.println("En " + hola + " hay " + especiales + " no letras");
		
		char caracter1;
		caracter1='A';
		caracter1=(char) ((int)caracter1+1);
		System.out.println(caracter1);
		
		for(int i=0;i<255;i++)
			System.out.println(i + " - " + (char)i);
		
		
	}

}
