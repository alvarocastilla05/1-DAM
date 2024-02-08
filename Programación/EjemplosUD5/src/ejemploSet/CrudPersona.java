package ejemploSet;

import java.util.Set;

import ejemploList3.Persona;

public class CrudPersona {

	Set <Persona> lista;

	public CrudPersona(Set<Persona> lista) {
		this.lista = lista;
	}

	public Set<Persona> getLista() {
		return lista;
	}

	public void setLista(Set<Persona> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudPersona [lista=" + lista + "]";
	}
	
	/*
	public Persona findByDni (String dni) {
		
	}*/
}
