package p2;

import java.util.LinkedList;

public class PilaEnteros {
	private LinkedList<Integer> pila;

	public PilaEnteros() {
		this.pila = new LinkedList<Integer>();
	}
	
	public void apilar(Integer elem){
		pila.addLast(elem);
	}

	public Integer desapilar(){
		return pila.removeLast();
	}
	
	public Integer tope(){
		return pila.getLast();
	}

	public boolean esVacia(){
		return pila.isEmpty();
	}
	
	public Integer minimo() {
		if (this.esVacia()) return null;

		PilaEnteros aux = new PilaEnteros();
		Integer act;
		Integer min = this.tope();
		
		// desapilo de this, comparo y apilo en la auxiliar
		while (!this.esVacia()) {
			act = this.desapilar();
			if (act<min) min=act;
			aux.apilar(act);
		}
		
		// paso de la auxiliar a la pila this
		while (!aux.esVacia()) {
			this.apilar(aux.desapilar());
		}

		return min;
	}
	
}
