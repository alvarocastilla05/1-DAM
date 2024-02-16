package ejercicio03;

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
		
	}
	
	
}
