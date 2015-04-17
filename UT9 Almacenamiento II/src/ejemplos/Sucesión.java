package ejemplos;

public class Sucesión {

	public static void main(String[] args) throws InterruptedException {
		long start,end;
		String cadena="";
		StringBuffer cadena2;
		StringBuilder cadena3;
		
		cadena3=new StringBuilder("");
		
		start=System.nanoTime();
		 // código a medir
		for(int i=0;i<10000;i++)
			//cadena=cadena+" " + i;
			//cadena=String.format("%s %d", cadena,i);
		{
			cadena3.append(" ");
			cadena3.append(i);
		}		

		end=System.nanoTime();
		System.out.println(cadena3.length());
		System.out.println((end-start)/1000000.0+" ms");
		
		
		

	}

}
