package tp2;

import java.util.HashMap;
import java.util.Map;

public class SistemaNotas {
	Map<Integer,Estudiante> alumno ;
	SistemaNotas(){
		this.alumno = new HashMap<Integer,Estudiante>();
	}
	
	public void NuevoAlumno(String nombre,String apellido,int libreta) {
		Estudiante taux = new Estudiante(libreta,nombre,apellido);	
		if(alumno.isEmpty()) {
			alumno.put(libreta, taux);
		}else {
			if(!alumno.containsKey(libreta)) {
				alumno.put(libreta,taux);
			}
			else {
				if(alumno.containsKey(libreta)) {
					throw new RuntimeException("El numero de libreta que esta queriendo agregar esta siendo usada");
				}
			}
		}
	}
	public void materiasAprobadas(int libreta,String materia, int nota) {
		if(!alumno.isEmpty()) {
			if(nota>3 && (alumno.containsKey(libreta)&& !alumno.get(libreta).contieneMateria(materia))) {
				alumno.get(libreta).materia(materia, nota);
			}else {
				if(nota<4) {
					throw new RuntimeException("Materia no aprobada");
				}
				if(!alumno.containsKey(libreta)) {
					throw new RuntimeException("No existe alumno con esa libreta");
				}
				if(alumno.get(libreta).contieneMateria(materia)) {
					throw new RuntimeException("Materia ya aprobada");
				}
			}
		}
	}
	public double promedio (int libreta) {
		int cont=0;
		float suma=0;
		if(alumno.containsKey(libreta)) {
			cont=alumno.get(libreta).getCantAprobadas();
			suma = alumno.get(libreta).getsumaCalif()/cont;
			return suma;
		}
		return suma;
	}
	@Override
	public String toString() {
		
		return "SistemaNotas [Numero Libreta: " + alumno + "]";
	}

}
