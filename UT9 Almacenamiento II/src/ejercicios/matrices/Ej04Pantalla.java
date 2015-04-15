package ejercicios.matrices;

import static java.lang.System.out;

public class Ej04Pantalla {

	char pincel;
	char fondo;
	char[][] pantalla;

	public Ej04Pantalla() {
		pincel = '@';
		fondo = '-';

		pantalla = new char[10][10];
		for (int i = 0; i < pantalla.length; i++)
			for (int j = 0; j < pantalla[i].length; j++)
				pantalla[i][j] = fondo;
	}

	public void dibujar() {
		for (char[] fila : this.pantalla) {
			for (char c : fila)
				out.print(c + " ");
			out.println();
		}
	}

	public void linea(int x1, int y1, int x2, int y2) {
		int x, y, dx, dy, p, incE, incNE, stepx, stepy;

		dx = (x2 - x1);
		dy = (y2 - y1);

		/* determinar que punto usar para empezar, cual para terminar */
		if (dy < 0) {
			dy = -dy;
			stepy = -1;
		} else {
			stepy = 1;
		}

		if (dx < 0) {
			dx = -dx;
			stepx = -1;
		} else {
			stepx = 1;
		}

		x = x1;
		y = y1;
		this.pantalla[y1][x1] = pincel;

		/* se cicla hasta llegar al extremo de la línea */

		if (dx > dy) {
			p = 2 * dy - dx;
			incE = 2 * dy;
			incNE = 2 * (dy - dx);
			while (x != x2) {
				x = x + stepx;
				if (p < 0) {
					p = p + incE;
				} else {
					y = y + stepy;
					p = p + incNE;
				}
				this.pantalla[y][x] = pincel;
			}
		} else {
			p = 2 * dx - dy;
			incE = 2 * dx;
			incNE = 2 * (dx - dy);
			while (y != y2) {
				y = y + stepy;
				if (p < 0) {
					p = p + incE;
				} else {
					x = x + stepx;
					p = p + incNE;
				}
				this.pantalla[y][x] = pincel;
			}
		}
	}

	public static void main(String[] args) {
		Ej04Pantalla p;

		p = new Ej04Pantalla();

		p.linea(1, 1, 7, 2);

		p.pincel = '+';
		p.cuadrado(1, 5, 4);
		p.pincel = 'R';
		p.rectangulo(3, 2, 6, 4);

		p.dibujar();

	}

	private void rectangulo(int coor1, int coor2, int tamañox,int tamañoy) {
		linea(coor1,coor2 , coor1+tamañox-1, coor2);
		linea(coor1,coor2 , coor1, coor2+tamañoy-1);
		linea(coor1+tamañox-1,coor2 , coor1+tamañox-1, coor2+tamañoy-1);
		linea(coor1,coor2+tamañoy-1 , coor1+tamañox-1, coor2+tamañoy-1);
		
	}

	private void cuadrado(int coor1, int coor2, int tamaño) {
		/*for (int i = 0; i < tamaño; i++) {
			pantalla[coor2][coor1 + i] = pincel;
		}

		for (int i = 0; i < tamaño; i++) {
			pantalla[coor2 + tamaño - 1][coor1 + i] = pincel;
		}

		for (int i = 0; i < tamaño; i++) {
			pantalla[coor2 + i][coor1] = pincel;
		}

		for (int i = 0; i < tamaño; i++) {
			pantalla[coor2 + i][coor1 + tamaño - 1] = pincel;
		}*/

		/*
		for (int i = 0; i < tamaño; i++) {
			pantalla[coor2][coor1 + i] = pincel;
			pantalla[coor2 + tamaño - 1][coor1 + i] = pincel;
			pantalla[coor2 + i][coor1] = pincel;
			pantalla[coor2 + i][coor1 + tamaño - 1] = pincel;
		}*/
		
		linea(coor1,coor2 , coor1+tamaño-1, coor2);
		linea(coor1,coor2 , coor1, coor2+tamaño-1);
		linea(coor1+tamaño-1,coor2 , coor1+tamaño-1, coor2+tamaño-1);
		linea(coor1,coor2+tamaño-1 , coor1+tamaño-1, coor2+tamaño-1);

	}

}
