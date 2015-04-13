package ejercicios.matrices;

import static java.lang.System.out;

public class Ej04Pantalla {

	char pincel;
	char fondo;
	char [][]pantalla;
	
	public Ej04Pantalla() {
		pincel='@';
		fondo='-';
		
		pantalla=new char[10][10];
		for(int i=0;i<pantalla.length;i++)
			for(int j=0;j<pantalla[i].length;j++)
				pantalla[i][j]=fondo;
	}
	
	public void dibujar() {
		for(char[] fila:this.pantalla) {
			for(char c:fila)
				out.print(c+" ");
			out.println();
		}
	}
	
	public void linea(int x1,int y1,int x2, int y2) {
		
	}
	
	public static void main(String[] args) {
		Ej04Pantalla p;
		
		p=new Ej04Pantalla();

		p.linea(1, 1, 7, 2);
		
		p.dibujar();
		
		
		
	}

}
