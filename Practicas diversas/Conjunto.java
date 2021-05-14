package p2;

import java.util.ArrayList;
import java.util.Iterator;

public class Conjunto<T> {
	private ArrayList<T> conj;
	private int indice;

	// ¿¿ SETTERS Y GETTER ??

	Conjunto() { //CONSTRUCTOR
		this.conj = new ArrayList<T>();
		this.indice = 0; //var instancia auxiliar para dameUno
	}
	/**
	 * O(n) por el Orden del método pertenece.
	 * @param elem
	 */
	boolean insertar(T elem) {
		if (!this.pertenece(elem)) {
			this.conj.add(elem);
			return true;
		}
		return false;
	}

	/**
	 * O(n)
	 * @param elem
	 * @return
	 */
	boolean pertenece(T elem) {
		return this.conj.contains(elem);
	}

	/**
	 * O(n)
	 * @param elem
	 */
	 public T eliminar(T elem) {
		this.conj.remove(elem);
		return elem;
//		if(this.pertenece(elem)) {
//			this.conj.remove(elem);
//			return true;
//		}
//		return false;
	}

	/**
	 * O(1) porque es ArrayList.
	 * @return
	 */
	int tamanio() {
		return this.conj.size();
	}

	T dameUno() {
		if (indice >= this.tamanio()) {
			indice = 0;
		}
		return this.conj.get(indice++);
	}

	@Override
	public String toString() {
		return conj.toString();
	}

	// /////////// UNION & INTERSECCION �Destructivos!
	
	void union(Conjunto<T> otroConjunto) {
		for(int i = 0; i < otroConjunto.tamanio(); i++) {
			this.insertar(otroConjunto.dameUno());
		}	
	}

	void interseccion(Conjunto<T> otroConjunto) {
		Iterator<T> it = this.conj.iterator();
		while (it.hasNext()) {
			if ( ! otroConjunto.pertenece(it.next())) {
				it.remove();
			}
		}		
	}
	
	void interseccionConWhile(Conjunto<T> otroConjunto) {
		int pos=0;
		while( pos < this.tamanio() ) { // n
			T aux = this.conj.get(pos); // 1  -> ArrayList
			if ( ! otroConjunto.pertenece( aux )) { // m
				this.eliminar(aux); // n
			} else {
				pos++; // 1
			}
		}
	}
	public T get(int x) {
		return conj.get(x);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conj == null) ? 0 : conj.hashCode());
		result = prime * result + indice;
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
		Conjunto other = (Conjunto) obj;
		if (conj == null) {
			if (other.conj != null)
				return false;
		} else if (!conj.equals(other.conj))
			return false;
		if (indice != other.indice)
			return false;
		return true;
	}
	
}
