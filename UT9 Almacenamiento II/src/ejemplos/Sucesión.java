package ejemplos;

public class Sucesión {

	public static void main(String[] args) throws InterruptedException {
		long start,end;
		
		start=System.nanoTime();
		Thread.sleep(100);
		end=System.nanoTime();
		System.out.println((end-start)/1000000.0+" ms");
		
		

	}

}
