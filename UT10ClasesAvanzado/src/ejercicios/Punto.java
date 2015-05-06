package ejercicios;

public class Punto extends Object{
	public int x,y;

	public Punto(int x, int y) {
		//super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString(){
		return String.format("%d,%d",x,y);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
