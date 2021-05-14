package p2;

import java.util.HashMap;
import java.util.Map;

public class ControlString {
	private String[] arrayString;
	public ControlString(String[] arreglo) {
		this.arrayString=arreglo;
	}
	public int cuantasVecesAparece( String c) {
		int cont=0;
		String[] arreglo = this.arrayString; 
		if(arreglo.length==0) {
			throw new RuntimeException("Ingresar arreglo con al menos un elemento");
		}
		else if(c.length()==0) {
			throw new RuntimeException("Ingrese una cadena no nula");
		}else {
			for(int i=0; i<arreglo.length; i++) {
				if(arreglo[i].contentEquals(c)) {
					cont++;
				}
			}
		}
		return cont;
	}
	
	public String mostrarArreglo () {
		Map<Integer,String> conjunto = new HashMap<Integer,String>();
		String[] arreglo = this.arrayString;
		if(arreglo.length==0) {
			throw new RuntimeException ("ingrese un arreglo no vacio");
		}else {
			for (int i = 0; i<arreglo.length; i++) {
				conjunto.put(i, arreglo[i]);
			}
		}
		return conjunto.toString();
		
	}
}
