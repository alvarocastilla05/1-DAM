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
	
	
	
}
