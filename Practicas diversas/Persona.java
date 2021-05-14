package p2;

public class Persona {
	private String nombre;
	private String apellido;
	private int dni;
	private int calle;
	private String direccion;
	public Persona(int dni, String nombre, String apellido,String direccion,int calle){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.calle= calle;
		this.direccion=direccion;
	}
	public void persona(int dni,String nombre,String apellido,String direccion,int calle) {
		this.dni=dni;
		this.nombre =nombre;
		this.apellido= apellido;
		this.calle= calle;
		this.direccion=direccion;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", calle=" + calle
				+ ", direccion=" + direccion + "]";
	}
	public String getPersona() {
		return " Nombre =" + nombre + " Apellido= " + apellido;
	}

	
}
