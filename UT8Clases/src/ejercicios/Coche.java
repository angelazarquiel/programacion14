package ejercicios;

class Coche {
  private int velocidad;
  Coche() {velocidad=0;}
  
  public int getVelocidad() {
	  return this.velocidad;
  }
  
  public void acelera(int mas) {
	  this.velocidad+=mas;
  }
  
  public static void main(String[] args) {
	Coche a3,golf;
	
	a3=new Coche();
	golf=new Coche();
	
	a3.acelera(100);
	golf.acelera(120);
	a3.acelera(40);
	
	if (a3.getVelocidad()>golf.getVelocidad())
		System.out.println("El a3 corre más");
  }
}

