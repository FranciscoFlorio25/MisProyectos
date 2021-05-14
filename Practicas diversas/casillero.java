package p2;

public class casillero {
	private boolean ocupado;
	private String jugadorCompro;
	private int precioCasilla;
	private tablero tablero;
	private jugador jugador;
	public casillero() {
		this.ocupado= false;
		this.jugadorCompro ="";
	}

	public int getPrecioCasilla() {
		return precioCasilla;
	}

	public void setPrecioCasilla(int precioCasilla) {
		this.precioCasilla = precioCasilla;
	}
	
	public boolean estaocupado(boolean casilla) {
		this.ocupado= casilla;
		if (casilla==true) {
			return true;
		}else {
			return false;
		}
	}
	public boolean meCompra(int precio, boolean casilla) {
		ocupado = casilla;
		precioCasilla=precio;
		if(!estaocupado(casilla)) {
			if(jugador.getDinero()>=precio) {
				jugador.setDinero(jugador.getDinero()-precio);
				jugadorCompro=jugador.getNombre();
				casilla= true;
				return true;
			}
		}
		return false;	
	}

	
		
}
	

