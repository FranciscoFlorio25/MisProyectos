package p2;

import java.util.ArrayList;

public class Coordenadas<T1,T2> {
	private ArrayList <Tupla<Integer,Integer>> coordenadas;
	
	//constructor
	Coordenadas(){
		coordenadas = new ArrayList<Tupla <Integer, Integer>>();
	}
	public void agregar (Tupla <T1,T2> x) {
		coordenadas.add((Tupla<Integer, Integer>) x);
	}
	public boolean contiene (Coordenadas<T1,T2> c) {
		return coordenadas.contains(c);
	}
	public void quitar (Coordenadas<T1,T2> c) {
		coordenadas.remove(c);
	}
	public void mostrar () {
		coordenadas.toString();
	}
	public boolean SonIguales (Coordenadas<T1,T2> c1, Coordenadas<T1,T2> c2) {
		return c1.contiene(c2) && c2.contiene(c1);
	}
}
