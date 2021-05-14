package p2;

public class conjunto_diccio<C,V> {
	
	Conjunto<TuplaDiccio<C,V>> diccio;
	public conjunto_diccio() {
		diccio = new Conjunto <TuplaDiccio<C,V>>();
	}
	
	public void definir(C clave, V valor) {
		TuplaDiccio<C, V> taux = new TuplaDiccio<C, V>(clave,valor);
		
		if(!estaDefinido(clave)) {
			diccio.insertar(taux);
		}
		else {
			diccio.eliminar(taux);
			diccio.insertar(taux);
		}
	}
	public boolean estaDefinido(C clave) {
		TuplaDiccio<C,V> temp = new TuplaDiccio<>(clave,null);
		return diccio.pertenece(temp);
		
	}
	public void eliminar(C clave) {
		diccio.eliminar(new TuplaDiccio<>(clave,null));
	}
	public V obtener(C clave) {
		TuplaDiccio<C,V> taux;
		for (int i = 0; i<diccio.tamanio(); i++) {
			taux= diccio.dameUno();
			if(clave.equals(taux.getX())) {
				return diccio.get(i).getY();
			}
		}
		
		return null;
	}
	
	public C obtenerClave(int x) {
		int i=0;
		while(i<diccio.tamanio() || x!=i) {
			if(i==x) {
				return diccio.get(i).getX();
			}
			i++;
		}
		return null;
	}

	public Conjunto<C> claves(){
		Conjunto<C> nueva = new Conjunto<C>(); 
		if(tamanio()==0) {
			return null;
		}else {
			for(int i = 0; i<diccio.tamanio();i++) {
				if(estaDefinido(diccio.get(i).getX())) {
					nueva.insertar(diccio.get(i).getX());
				}
			}
		}
		return nueva;
	}
	
	public int tamanio() {
		
		return diccio.tamanio();
	}
	
	@Override
	public String toString() {
		return "conjunto_diccio [diccio=" + diccio + "]";
	}

}
