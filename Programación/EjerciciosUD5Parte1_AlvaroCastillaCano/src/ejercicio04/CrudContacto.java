package ejercicio04;

import java.util.Map;

public class CrudContacto {

	Map <Integer, Contacto> agenda;

	public CrudContacto(Map<Integer, Contacto> agenda) {
		this.agenda = agenda;
	}

	public Map<Integer, Contacto> getAgenda() {
		return agenda;
	}

	public void setAgenda(Map<Integer, Contacto> agenda) {
		this.agenda = agenda;
	}

	@Override
	public String toString() {
		return "CrudContacto [agenda=" + agenda + "]";
	}
	
	public void addContacto(int telefono, Contacto c) {
		agenda.put(telefono, c);
	}
	
	
	public Contacto findByNombre(String nombre) {
		
		for (Contacto c : agenda.values()) {
			if(c.getNombre().equalsIgnoreCase(nombre)) {
				return c;
			}
		}
		return null;
	}
	
	public void modificarContacto(Contacto c, String nombreNuevo) {
		
	}
	
	public void borrarContacto(String nombre) {
		if(findByNombre(nombre) != null) {
			agenda.remove(findByNombre(nombre));
		}
	}
}
