package ejemploList3;

import java.util.List;

public class CrudPersona {

	private List <Persona> lista;

	public CrudPersona(List<Persona> lista) {
		this.lista = lista;
	}

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudPersona [lista=" + lista + "]";
	}
	
	
	public void aniadirPersona (Persona p) {
		lista.add(p);
	}
	
	public boolean aniadirPersonaV2 (Persona p) { //Nunca creamos un agregar pasandole los parametros sueltos de un objeto.Y no se guarda y se imprime a la vez.
		return lista.add(p);
	}
	
	public Persona findByDni (String dni) {
		boolean encontrado = false;
		int i = 0;
		
		while(i<lista.size() &&! encontrado) {
			Persona deLista = lista.get(i);
			if(deLista.getDni().equalsIgnoreCase(dni)) {
				encontrado = true;
			}else {
				i++;
			}
		}
		if(encontrado) {
			return lista.get(i); //Devolvemos el producto buscado
		}else {
			return null;
		}
	}
	
	public Persona findByDniV2 (String dni) {
		Persona tem = null;
		boolean salir = false;
		
		for (int i = 0; i < lista.size() && !salir; i++) {
			if(lista.get(i).getDni().equalsIgnoreCase(dni)) {
				tem = lista.get(i);
				salir = true;
			}
		}
		return tem;
	}
	
	public void imprimirLista() {
		for (Persona p : lista) {
			System.out.println(p);
		}
	}
	
	public void deletePersona(String dni) {
		if(findByDniV2(dni)!=null) {
			lista.remove(findByDniV2(dni));
		}
	}
}
