package p2;

import java.util.ArrayList;

public class jugador {
	private ArrayList <casillero> obtenidos;
	private tablero tablero;
	private int dineroDisp;
	private String nombre;
	private boolean enJuego;
	
	public jugador(int dinero,String nombre, boolean enJuego) {
		this.dineroDisp=dinero;
		this.nombre=nombre;
		this.obtenidos=new ArrayList<casillero>();
		this.enJuego = true;
	}
	public String getNombre() {
		return nombre;
	}
	public void setDinero(int dineroDisp) {
		this.dineroDisp = dineroDisp;
	}
	public int getDinero() {
		return this.dineroDisp;
	}
	/*public boolean late() {
		for(int i=0; i<obtenidos.size(); i++) {
		}
	}*/
	public boolean compra(int dinero) {
		return false;
	}
	
	
}
