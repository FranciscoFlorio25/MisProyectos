package p2;

public class practica2 {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Para Pila.
			System.out.println("|Pila|");
			Pila<Integer> pilaInt = new Pila <Integer>();
			Pila<String> pilaStr = new Pila <String>();
			System.out.println(pilaInt.estaVacia());
			
			pilaInt.apilar(5);
			pilaInt.apilar(10);
			pilaInt.apilar(7);
			pilaInt.apilar(21);
			
			pilaStr.apilar("Hola");
			pilaStr.apilar("Como");
			pilaStr.apilar("Estas?");
			
			System.out.println("Int" + pilaInt.toString());
			System.out.println("Str" + pilaStr.toString());
			
			System.out.println("Tope = " + pilaInt.tope());
			System.out.println("desapilando..." + pilaInt.desapilar());
			System.out.println("Int" + pilaInt.toString());
			System.out.println("|Fin pila|");
			System.out.println(" ");
			//Fin Pila
			//Tupla Inicio
			System.out.println("|Tuplas|");
			
			Tupla<Integer,Integer> tupla = new Tupla<Integer,Integer>(5,6);
			Tupla<Integer,Integer> tupla2 = new Tupla<Integer,Integer>(5,6);
			Tupla<Integer,Integer> tupla3 = new Tupla<Integer,Integer>(4,3);
			Tupla<Integer,Integer> tupla4 = new Tupla<Integer,Integer>(1,2);
			
			System.out.println(" 1- "+ tupla.toString());
			System.out.println(" 2- "+ tupla2.toString());
			System.out.println(" 3- "+ tupla3.toString());
			System.out.println(" 4- "+ tupla4.toString());
			
			System.out.println("Par tupla 1 y tupla 2 = " + tupla.sonIguales(tupla2));
			System.out.println("Par Tupla 3 y tupla 4 = " + tupla3.sonIguales(tupla4));
			
			
			System.out.println("|Fin tupla|");
			System.out.println(" ");
			//Fin Tupla
			//Conjunto inicio
			
			System.out.println("|Conjunto|");
			
			Conjunto<Integer> conjunto = new Conjunto<Integer>();
			Conjunto<Integer> conjunto2 = new Conjunto<Integer>();
			
			conjunto2.insertar(0);
			conjunto2.insertar(5);
			conjunto2.insertar(6);
			conjunto2.insertar(3);
			
			conjunto.insertar(4);
			conjunto.insertar(5);
			conjunto.insertar(6);
			conjunto.insertar(7);
			
			System.out.println("Conjunto 2= " + conjunto2.toString());
			System.out.println("Conjunto 1= " + conjunto.toString());
			//System.out.println("Union de conjunto 1 y 2: ");
			/*conjunto.union(conjunto2);
			System.out.println("Conjunto 1= " + conjunto.toString());
			System.out.println("interseccion de conjunto 1 y 2 mediante metodo 1: ");*/
			/*conjunto.interseccionConWhile(conjunto2);
			System.out.println("Conjunto = " + conjunto.toString());*/
			System.out.println("interseccion de conjunto 1 y 2 mediante metodo 2: ");
			conjunto.interseccion(conjunto2);
			System.out.println("Conjunto = " + conjunto.toString());
			//Fin conjunto
			
			System.out.println("|Fin conjunto");
			System.out.println(" ");
			//inicio tuplasDiccio.
			System.out.println("|inicio tupladiccio|");
			System.out.println(" ");
			
			DiccionarioConTupla<String, String> inscriptos =new DiccionarioConTupla<String, String>();
			inscriptos.definir("Juan alverto", "5 sept");
			inscriptos.definir("Inigo montoya", "21 abril");
			inscriptos.definir("Juancho", "10 marzo");
			inscriptos.definir("Gonsalo", "31 febrero");
			inscriptos.definir("flancho", "20 de sept");
			Conjunto<String> fechas = inscriptos.claves();
			System.out.println("fechas: " + fechas);
			
			inscriptos.definir("juancho", "21 abril");
			System.out.println();
			System.out.println("es inigo: " + inscriptos.obtener("Inigo montoya"));
			inscriptos.eliminar("flancho");
			System.out.println();
			System.out.println(inscriptos);
			
			//fin tuplas diccio;
			System.out.println("|Fin tupladiccio|");
			System.out.println(" ");
			
			System.out.println("|Inicio control string|");
			System.out.println(" ");
			String[] arreglo = {"HADDOKEN", "chinchiya", "perron","zemo","HADDOKEN"};
			ControlString control = new ControlString(arreglo);
			System.out.println(control.cuantasVecesAparece("HADDOKEN"));
			System.out.println(control.mostrarArreglo());
			//fin tuplas diccio;
			System.out.println("|Fin control String|");
			System.out.println(" ");
			
			//inicio agenda
			System.out.println("|Inicio agenda|");
			System.out.println(" ");
			
			Agenda agenda = new Agenda();
			agenda.agregarPersona(38867430, "Inigo", "Montoya","avenida siempre viva",123);
			//agenda.direccion(38867430,100, "avenida siempre viva");
			agenda.agregarPersona(55555, "juana", "De Arco","avenida francia y estaca", 33);
			//agenda.direccion(55555, 55,"avenida francia esquina estaca");
			System.out.println(".");
			System.out.println(agenda.consultarPersona(38867430));
			System.out.println(agenda.toString());
			/*agenda.modDireccion(38867430, 123, "calle falsa, springfild");
			agenda.modPersona(38867430, "Juancho", "Jasinto");*/
			agenda.eliminar(55555);
			System.out.println(agenda.toString());
			
	}

}


