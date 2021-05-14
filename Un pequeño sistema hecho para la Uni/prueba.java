package tp2;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaNotas alumno0= new SistemaNotas();
		
		alumno0.NuevoAlumno("Juancho", "terracota", 2020);
		alumno0.NuevoAlumno("Jaimito", "valdomero", 2021);
		alumno0.materiasAprobadas(2020,"proga1", 5);
		alumno0.materiasAprobadas(2020,"proga2", 7);
		alumno0.materiasAprobadas(2020,"proga3", 7);
		alumno0.materiasAprobadas(2021,"proga1", 6);
		alumno0.materiasAprobadas(2021,"proga2", 6);
		alumno0.materiasAprobadas(2021,"proga3", 10);
		System.out.println("Alumno 0 "+ alumno0.toString());
		System.out.println("el promedio es: " + alumno0.promedio(2020));
		
	}

}
