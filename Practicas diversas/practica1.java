package p2;

public class practica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int[][] mat ={{1,2,3},{4,5,8},{9,10,11},{12,13,14}};
		int[] arreglo = {21,8,6};
		imprimirPorFilas(mat);
		//System.out.println(arregloEnFilas(mat,arreglo));
		System.out.println(matrizAscendente(mat));
		//System.out.println(todascontieneCero(mat));
	}
	public static void imprimirPorFilas(int[][] m) {
		if(m.length==0) {
			System.out.println("Esta vacia");
		}
		else {
			System.out.println("por filas: ");
		   for(int i=0; i<m.length; i++) {
			   System.out.print("|");
			 for(int j=0; j<m[i].length; j++) {
				 System.out.print(" "+m[i][j]+",");
				 
			 }
			 System.out.println("|");
		   }
		}

	}
	public static void imprimirPorColumnas(int[][] m) {
		if(m.length==0) {
			System.out.println("Esta vacia");
		}
		else {
			System.out.println("por columnas: ");
		   for(int i=0; i<m.length; i++) {//Agregamos un +1 para que se incluyan todas las columnas
			   System.out.print(" |");
			 for(int j=0; j<m.length; j++) {
				 System.out.print(" "+ m[j][i]+",");
			 }
			 System.out.println(" | ");
		   }
		}

	}
	
	
	static boolean esPar(int[] lista) {
		boolean ret= true;
		for(int i=0; i<lista.length; i++)
			ret=ret && lista[i]%2==0;
		return ret;
	}
	static boolean esParX2SinAcum(int[] lista) {
		int[] copia = new int [lista.length];
		for (int i=0; i<lista.length;  i++) {
			copia[i] = lista[i];
			lista[i] = lista[i]*2;
		}
		for (int i=0; i<copia.length; i++) {
			if(!(copia[i]%2==0)) {
				return false;
			}
		}
		return true;
	}
	public static boolean algunParconAcum(int[] lista) {
		boolean ret = true;
		for(int i=0; i<lista.length; i++) {
			ret = ret || lista[i]%2==0;
			lista[i]=lista[i]*2;
		}
		return ret;
	}
	static boolean usoDeMayus(String s) {
		boolean ret = true;
		if(s.length()==0) {
			ret= ret && false;
			return ret;
		}
		else {
			for (int i = 0; i<s.length(); i++) {
			   char c=Character.toUpperCase(s.charAt(i));
			   if(s.charAt(1)==Character.toUpperCase(s.charAt(1))) {
				  ret= ret && (s.charAt(i)==c);
				}	
				if(s.charAt(1)!=Character.toUpperCase(s.charAt(1))) {
				   if(i>0) {
					 ret=ret && (s.charAt(i)!=c);
				   }
				}	
		    }
		}
		return ret;
	}
	static boolean mayoresADiez(int[] lista) {
		boolean ret = true;
		for (int i=0;i<lista.length;i++) {
			ret= ret && lista[i]>10;
		}
		return ret;
	}
	
	static boolean perteneceAlguno (int[] elem, int[] arreglo) {
		boolean ret = false, retEsta=false;
		for(int i=0; i<elem.length;i++) {
			retEsta = false;
			for(int j=0;j<arreglo.length;j++) {
				retEsta=retEsta || elem[i]==arreglo[j];
			}	
			ret = ret || retEsta;
		}
		return ret;
	}
	static boolean pertenecenTodos(int[] elemento, int[] arreglo) {
		boolean ret = true, retEsta=false;
		if(elemento.length==0) {
			return true;
		}
		else {
		   for(int i=0; i<elemento.length;i++) {
			  retEsta = false;
			  for(int j=0;j<arreglo.length;j++) {
				retEsta=retEsta || elemento[i]==arreglo[j];
			  }	
			  ret = ret && retEsta;
		   }
		}
		return ret;
	}
	static boolean todascontieneCero(int[][] mat) {
		boolean ret=true,tieneCero=false;
		if(mat.length ==0)
			return false;
		for(int i=0; i<mat.length; i++) {
			tieneCero=false;
			for(int j=0; j<mat[0].length; j++)
				tieneCero=tieneCero || mat[i][j]==0;
			ret= ret && tieneCero;
		}
		return mat.length>0 && ret;
	}
	static boolean algunaFilaSumaMasX(int[][] mat, int x) {
		int suma;
		boolean ret = false;
		for (int i=0; i<mat.length; i++) {
			suma=0;
			for(int j=0; j<mat[i].length; j++) {
				suma= suma + mat[i][j];
			}
			ret=ret || suma>x;
		}
		return ret;
	}
	
	public static boolean tieneNegativos(int[][] mat) {
		boolean ret=true, tieneNegativo= false;
		for (int i=0; i<mat.length;i++){
			tieneNegativo=false;
			for (int j=0; j<mat[i].length;j++) {
				tieneNegativo=tieneNegativo || 0>mat[i][j];
			}
			ret=ret && tieneNegativo;
		}
		return ret;
	}

	void ordenarPorBurbujeo(int a[]) {
		 for (int i = 1; i < a.length; i++) {  //1+4(n)
			 for (int j = 0; j < a.length-1; j++) { // 1 +4(n)
				 if (a[j] > a[j+1])  //3 (n-1)
					 swap(a[j], a[j+1]); //5(n-1)
				 
			 }
		 }
	}
	void swap( int n, int m){
		int aux = n; //2
		n = m; //2
		m = aux; //1 ---(5)
	}
	/* 1+4n+n(1+4n+3n-3+5n-5)
	 * 1+4n+n(-7+12n)
	 * 1+4n-7n+12n**2
	 * 1+11n+12n**2
	 * conjeturamos que g(n)=n**2 y c=13
	 * 12n**2+11n+1<13n**2
	 * 11n+1<13n**2-12n**2
	 * 11n+1<n**2
	 * n**2=n*n
	 * 11n+1<n*n
	 * buscamos un n0 que sea mayor a 11 el cual es n0=12
	 * 11*12+1<12*12
	 * 133<144
	 *entonces, por deficinicion, probamos que este algoritmo es O(n**2) ya que g(n) sera mayor a f(n) en n=>12
	 * 
	 * Por algebra de ordenes:
	 * O(12n**2+11n+1)
	 * O(12n**2)+O(11n)+O(1) regla 2
	 * O(2).O(n**2) +O(11).O(n)+O(1) regla 3.
	 * O(1).O(n**2) +O(1).O(n)+O(1) regla 4 todo O(k)=O(1)
	 * O(1.n**2) +O(1.n)+O(1) regla 3
	 * O(n**2) + O(n) + O(1) Acomodamos.
	 * O(n**2) + O(max{n,1}) regla 2
	 * O(n**2) + O(n) como O(1)<O(n) regla 1
	 * O(max{n**2,n}) regla 2
	 * O(n**2) como O(n) < O(n**2) entonces regla 1
	 * Por lo tanto queda demostrado que la complejidad es O(n**2)
	 */
	public static boolean esta(int[]mat , int x) {

		boolean ret=false;
		for(int i = 0; i<mat.length; i++) {
			ret = ret || mat[i]==x;
		}
		return ret;
	}
	
	public static boolean arregloEnFilas(int[][] mat, int[] arreglo) {
		boolean ret = true, retMedio =false;
		if(arreglo.length==0) {
			return true;
		}
		else if(mat.length==0) {
			return false;
		}
		else {
			//ignoramos las constantes de arriba
			for(int i = 0; i<mat.length; i++) { // 1 + 4n+4
				retMedio = false; // n;
				for(int j=0; j<mat[i].length; j++) { // 1 + 5n + 5
					retMedio=retMedio || mat[i][j]==arreglo[i]; //5n
					if(retMedio==true) { //n
						j=mat[i].length-1; //2n
					}
					//esto multiplicado por n, dado el for anidado
				}
				ret = ret && retMedio; // 3n
			}
			return ret; //1
		}
	}
	/*1+4n+4+n(1+5n+5+5n+n+2n)+3n+1
	 * 6+8n+n(12n+5)
	 * 6+8n+12n**2+5n
	 * 12n**2+13n+6
	 * dado que F(n) es 12n**2+13n+6 conjeturamos que G(n)==n**2 y c=13
	 * por lo tanto, queremos probar que G(n)>F(n) para todo n0<n
	 * 12n**2+13n+6<13n**2
	 * 13n+6<13n**2-12n**2
	 * 13n+6<n**2
	 * como n**2 equivale a = n*n
	 * 13n+6<n*n
	 * buscamos un n0 mayor a 13 por lo tanto n0= 14;
	 * 13*14+6<14*14
	 * 188<196
	 * F(n) siempre sera menor a G(n) en todo n>=14
	 * por lo tanto, por definicion probamos que el 
	 * algoritmo tiene complejidad O(n**2)
	 * 
	 * por algebra de ordenes.
	 * tenemos que probar que F(n) es complejidad O(n**2) por lo tanto.
	 * O(12n**2+13n+6).
	 * O(12n**2) + O(13n) + O(6) por regla 2
	 * O(12). O(n**2) + O(13). O(n) + O(6) por regla 3
	 * O(1) . O(n**2) + O(1) . O(n) + O(1) por regla 4
	 * O(1*n**2) + O(1*n) + O(1) por regla 3
	 * O(n**2) + O(n) + O(1) acomodamos.
	 * O(n**2) + O(max{1,n} por regla 2
	 * O(n**2) + O(n) como n>1 regla 1
	 * O(max{n**2,n}) por regla 2
	 * como n**2>n regla 1
	 * O(n**2) entonces queda demostrado que el algoritmo es O(n**2)
	 * 
	 */

	public static boolean columnasiguales(int[][] mat,int col) {
		boolean ret = false;
		boolean retmedio;
		for(int columnas=0; columnas<mat[0].length; columnas++) {
			retmedio= true;
			for(int filas = 0; filas<mat[0].length; filas++) {	
				retmedio = retmedio && mat[filas][col] ==mat[filas][columnas];
			}
			ret = ret || retmedio;
		}
		return ret;
		
	}
	static boolean parDeColumnasIguales(int[][] mat) {
		boolean ret=false;
		for (int i=0; i<mat.length; i++) {
			ret =ret || columnasiguales(mat,i);
		}
		return ret;
	}
	static boolean igualParDeColumnas(int[][] mat) {
		boolean colIguales=false;
		
		for(int col=0; col< mat[0].length-1; col++) {

			colIguales = colIguales || tieneColIgual(mat, col);

		}
		
		return colIguales;
	}
	
	
	public static boolean tieneColIgual(int[][] mat, int colActual) {
		//busca alguna columna igual en las columnas siguientes a colActual (no en todas)
		//se implementa asi por el modo en que esta programado el metodo principal
		
		boolean colIgual, algunCol=false;
		//System.out.println("estoy en columna: " + colActual);
		for(int c=colActual+1; c< mat[0].length; c++) {
			
			colIgual=true;
			
			for(int fil=0; fil<mat.length; fil++)		
				colIgual = colIgual && mat[fil][colActual] == mat[fil][c];
			
			algunCol = algunCol || colIgual;
			//System.out.println("con columna: " + c + " da " + colIgual);
		}
		return algunCol;
	}
	
	public static boolean matrizAscendente(int[][] mat) {
		boolean acumfinal = true, acumPar,acumImpar,acumSigMayor,acumSiguienteIndMax;
		int aux= 0;
		for(int i= 0; i<mat.length; i++ ) {
			acumPar= false;
			acumImpar=false;
			acumSigMayor= true;
			acumSiguienteIndMax=true;
			for(int j=0; j<mat[0].length-1;j++) {
				acumPar=acumPar || mat[i][j]%2==0;
				acumImpar=acumImpar || mat[i][j]%2!=0;
				acumSigMayor= acumSigMayor && mat[i][j]<mat[i][j+1];
			}
			acumfinal=acumfinal && acumPar && acumImpar && acumSigMayor;
		}
		return acumfinal;
	}

}
