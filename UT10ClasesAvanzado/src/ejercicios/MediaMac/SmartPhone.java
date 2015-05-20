package ejercicios.MediaMac;

import java.util.ArrayList;
import java.util.Arrays;


public class SmartPhone extends Aparato {

	// Debe tener adem�s como atributo la tecnolog�a de transmisi�n soportada,
	// que ser� una
	// lista de cadenas, como por ejemplo ["GPRS","EDGE","HSDPA"].

	private ArrayList<String> tecTransm;

	public SmartPhone(String numProducto, String numSerie, String nombre,
			String so, double precioBase, int numTecnologias) {
		super(numProducto, numSerie, nombre, so, precioBase);
		this.tecTransm = new ArrayList<String>();
	}
	public String[] getTecTransm() {
		return Arrays.copyOf((String[])tecTransm.toArray(), tecTransm.size());
	}
/*
	public void setTecTransm(String nueTec) {
		if (numTecnologias<10)
			tecTransm[numTecnologias++]=nueTec;
	}
*/	
	
	public void setTecTransm(String[] tecTransm) {
		this.tecTransm.addAll(Arrays.asList(tecTransm));
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<tecTransm.size();i++) {
			sb.append(this.tecTransm.get(i));
			if (i<tecTransm.size()-1) sb.append(", ");
		}
		
		return super.toString() + "\nSubClase: SmartPhone\n\tTecnolog�as-->"
				+ sb;
	}

	// A�adir el m�todo addTecnolog�a en la clase SmartPhone que tome como
	// par�metro una cadena
	// con el nombre de una tecnolog�a inal�mbrica y lo incluya en la lista de
	// tecnolog�as soportada.
	// Debe ser independiente de may�scular/min�sculas y controlar que la misma
	// tecnolog�a no se repita.
	private boolean repetida(String tecnologia) {
		boolean repetida = false;
		/*
		for(int i=0; i < this.tecTransm.size() && !repetida; ++i) {
			if(this.tecTransm.get(i).equalsIgnoreCase(tecnologia)) {
				repetida = true;
			}			
		}*/
		repetida=tecTransm.contains(tecnologia.toUpperCase());
		
		return repetida;		
	}
	public void addTecnologia(String tecnologia){
		
		if(!this.repetida(tecnologia)) {
			this.tecTransm.add(tecnologia.toUpperCase());
		} else 
			System.out.println("La tecnolog�a ya est� definida.");
	}

	
	
}
