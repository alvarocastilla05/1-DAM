package ejercicio03;

import java.util.Iterator;
import java.util.Set;

public class CrudAlumno {

	//Atributos	
	Set <Alumno> lista;

	//Getters and setters	
	public CrudAlumno(Set<Alumno> lista) {
		this.lista = lista;
	}

	public Set<Alumno> getLista() {
		return lista;
	}

	public void setLista(Set<Alumno> lista) {
		this.lista = lista;
	}

	//toString
	@Override
	public String toString() {
		return "CrudAlumno [lista=" + lista + "]";
	}
	
	//Metodos
	public void addAlumno(Alumno a) {
		lista.add(a);
	}
	
	public Alumno findById(int id) {
		Iterator<Alumno> it = lista.iterator();
		boolean encontrado = false;
		Alumno a = null;
		
		while(it.hasNext() && !encontrado) {
			a = it.next();
			if(a.getId()==id) {
				encontrado = true;
			}
		}
		if(encontrado) {
			return a;
		}else {
			return null;
		}
	}
	
	
	public void eliminarAlumno (int id) {
		if(findById(id) != null) {
			lista.remove(findById(id));
		}
	}
	
	public void modificarAlumno (int id, double nuevaNotaMedia) {
		findById(id).setNotaMedia(nuevaNotaMedia);
	}
	
	
}
