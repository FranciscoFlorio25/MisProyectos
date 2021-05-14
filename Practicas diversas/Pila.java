package p2;

import java.util.ArrayList;

public class Pila<T extends Comparable<T>> {
	
	private ArrayList<T>  pila;
	
	Pila(){
		pila = new ArrayList<T>();
	}
	
	boolean estaVacia() {
		return pila.size()==0;
	}
	
	void apilar(T elem) {
		pila.add(elem);
	}
	
	T tope() {
		return pila.get(pila.size()-1);
	}
	
	T desapilar() {		
		//que pasa si la pila esta vacia?
		return pila.remove(pila.size()-1);
	}
	
	public String toString() {
		return pila.toString();
	}

	public T minimo() {
		if (this.estaVacia()) return null;

		Pila<T> aux = new Pila<T>();
		T act;
		T min = this.tope();
		
		// desapilo de this, comparo y apilo en la auxiliar
		while (!this.estaVacia()) {
			act = this.desapilar();
			if (act.compareTo(min)<0) min=act;
			aux.apilar(act);
		}
		
		// paso de la auxiliar a la pila this
		while (!aux.estaVacia()) {
			this.apilar(aux.desapilar());
		}

		return min;
	}

}
