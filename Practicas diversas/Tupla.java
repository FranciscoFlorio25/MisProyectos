package p2;

public class Tupla<T1,T2> {
	//Siendo T1 y T2 los tipos de datos
	private T1 x;
	private T2 y;
	
	//Constructor
	Tupla(T1 x, T2 y){
		this.x=x;
		this.y=y;
	}
	
	public T1 getX() {
		return x;
	}
	
	public T2 getY() {
		return y;
	}
	
	public void setX(T1 x) {
		if(x!=null) {
			this.x = x;
		}else {
			throw  new RuntimeException ("Los datos de x no pueden ser nulos");
		}
	}
	
	public void setY(T2 y) {
		if(y!=null) {
			this.y = y;
		}else {
			throw  new RuntimeException ("Los datos de y no pueden ser nulos");
		}
	}
	
	public boolean sonIguales(Tupla<T1,T2> otraTupla) {
		return this.x.equals(otraTupla.x) && 
				this.y.equals(otraTupla.y);
	}
	
	@Override
	public String toString() {
		return "Tupla (X=" + x + ", Y=" + y+")";
	}
}
