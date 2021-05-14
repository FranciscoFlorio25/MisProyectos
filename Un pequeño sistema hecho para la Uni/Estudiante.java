package tp2;

import java.util.Map;
import java.util.HashMap;

public class Estudiante {
	
	private String nombre;
	private String apellido;
	private int libreta;
	
	private int sumaCalif;
	private int acumMateria;
	Map <String,Integer> aprobadas;
	
    Estudiante(int libreta, String nombre, String apellido){
    	this.apellido = apellido;
    	this.nombre = nombre;
    	this.libreta = libreta;
		this.aprobadas = new HashMap<String,Integer>();
	}
    
    public void estudiante(int libreta, String nombre,String apellido) {
    	this.apellido = apellido;
    	this.nombre = nombre;
    	this.libreta = libreta;
    }
    
    public void materia (String nombre, int nota) {
    	this.aprobadas.put(nombre,nota);
    	acumMateria+=1;
    	sumaCalif+=nota;
    	
    }
    public boolean contieneMateria(String nombre) {
		return aprobadas.containsKey(nombre);
	}
    public int getCantAprobadas() {
    	return acumMateria;
    }
    public int getsumaCalif() {
    	return sumaCalif;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + libreta;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		if (libreta != other.libreta)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return " [nombre=" + nombre + ", apellido=" + apellido + ", libreta=" + libreta + ", aprobadas=" + aprobadas.toString() + "]";
	}

	
	
}
