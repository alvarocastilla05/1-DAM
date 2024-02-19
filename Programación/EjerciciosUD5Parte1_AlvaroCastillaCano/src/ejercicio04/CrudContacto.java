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
		boolean encontrado = false;
		for (Contacto c : agenda.values()) {
			if(c.getNombre().equalsIgnoreCase(nombre)) {
				encontrado = true;
			}
		}
		if(encontrado) {
			return c;
		}
	}
	
	public void modificarContacto(Contacto c, String nombreNuevo) {
		
	}
	
	public void borraContacto(Contacto c) {
		
	}
}
