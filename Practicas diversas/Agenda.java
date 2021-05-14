package p2;

public class Agenda {
	private conjunto_diccio<Integer,Persona> agenda;
	
	public Agenda(){
		agenda = new conjunto_diccio<Integer,Persona>();
	}
	public void agregarPersona(int dni, String nombre, String apellido,String calle,int numero) {
		Persona taux2= new Persona(dni,nombre,apellido,calle,numero);
		if(!agenda.estaDefinido(dni)) {
			agenda.definir(dni, taux2);
		}
	}
	public void modDireccion(int dni,int numero, String direccion) {
	}
	
	public void eliminar(int dni) {
		if(agenda.estaDefinido(dni)) {
			agenda.eliminar(dni);
		}
			
	}
	public String consultarPersona(int dni) {
		return agenda.obtener(dni).getPersona();
	}
	@Override
	public String toString() {
		return "[agenda=" + agenda + "]";
	}
	
}
