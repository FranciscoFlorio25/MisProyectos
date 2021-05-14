package p2;

import java.util.ArrayList;

public class DiccionarioConTupla<C,V> {
	
	ArrayList<TuplaDiccio<C, V>> diccio;

	public DiccionarioConTupla() {
		diccio = new ArrayList<TuplaDiccio<C, V>>();
	}

	public void definir(C clave, V valor) {
		if(!this.estaDefinido(clave)){
			diccio.add(new TuplaDiccio<C, V>(clave,valor));
		}
		else
		for (int i = 0; i < diccio.size(); i++) {
			if (diccio.get(i).getX().equals(clave)) 
				diccio.get(i).setY(valor);
		}
	}

	public boolean estaDefinido(C clave) {
		for (int i = 0; i < diccio.size(); i++) {
			if (diccio.get(i).getX().equals(clave)) {
				return true;
			}
		}
		return false;
	}

	public void eliminar(C clave) {
		for (int i = 0; i < diccio.size(); i++) {
			if (diccio.get(i).getX().equals(clave)) {
				diccio.remove(i);
			}
		}		
	}
	
	public V obtener(C clave) {
		//corresponde a la operacion DEFINICION de la interfaz
		// mostrada en la presentacion de TAD Diccionario
		
		for (int i = 0; i < diccio.size(); i++) {
			if (diccio.get(i).getX() == clave) {
				return diccio.get(i).getY();
			}
		}return null;
		
	}
	
	public Conjunto<C> claves(){
		Conjunto<C> keys = new Conjunto<C>();
		
		for (int i = 0; i < diccio.size(); i++) {
			keys.insertar(diccio.get(i).getX());			
		}
		return keys;
	}
	
	public int tamanio() {
		return diccio.size();
	}
	
	@Override
	public String toString() {
		return "Datos: " + diccio;
	}
	
	
}
