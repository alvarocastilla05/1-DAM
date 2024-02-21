package ejercicio04;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;


public class CrudContacto {

	Map <Contacto, String> agenda;

	public CrudContacto(Map<Contacto, String> agenda) {
		this.agenda = agenda;
	}
	
	
	public Map<Contacto, String> getAgenda() {
		return agenda;
	}

	public void setAgenda(Map<Contacto, String> agenda) {
		this.agenda = agenda;
	}
	
	@Override
	public String toString() {
		return "CrudContacto [agenda=" + agenda + "]";
	}


	//Metodos
	public void addContacto(String telefono, Contacto c) {
		agenda.put(c, telefono);
	}
	
	
	public Contacto findByNombre(String nombre) {
		
		for (Contacto c : agenda.keySet()) {
			if(c.getNombre().equalsIgnoreCase(nombre)) {
				return c;
			}
		}
		return null;
	}
	
	//Buscar que devuelve una lista.
	public List<Contacto> findByNombreV2(String nombre) {
			List<Contacto> aux = new ArrayList<Contacto>();
			for (Contacto c : agenda.keySet()) {
				if(c.getNombre().equalsIgnoreCase(nombre)) {
					aux.add(c);
				}
			}
			return aux;
		}
	
	public void modificarContacto(String nombre, String nombreNuevo) {
		Contacto c = findByNombre(nombre);
		if(c != null) {
			c.setNombre(nombreNuevo);
		}
	}
	
	public void borrarContacto(String nombre) {
		Contacto c = findByNombre(nombre);
		if(c != null) {
			agenda.remove(c);
		}
	}
	
	/*
	public void imprimirAgenda() {
		System.out.println("Agenda");
		System.out.println("-".repeat(40));
		for(Map.Entry<Contacto, String> entrada : agenda) {
			Contacto c = entrada.getKey()
		}
	}*/
}
