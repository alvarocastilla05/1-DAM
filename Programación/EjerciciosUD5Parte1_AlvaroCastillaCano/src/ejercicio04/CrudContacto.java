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
	
	/*
	public Contacto findByNombre (String nombre) {
		
        if (agenda.containsKey(nombre)) {
            Contacto numeroDeTelefono = agenda.get(nombre);
            System.out.println("El número de teléfono de " + nombre + " es: " + numeroDeTelefono);
        } else {
            System.out.println("No se encontró ningún contacto con el nombre: " + nombrezz);
        }
        */
	}
}
