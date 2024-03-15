package ejercicio01;

import java.util.Iterator;
import java.util.List;

public class Diccionario {

	//Atributos
	private List<Palabra> lista;

	//Constructores
	public Diccionario(List<Palabra> lista) {
		this.lista = lista;
	}

	//Getters and Setters
	public List<Palabra> getLista() {
		return lista;
	}

	public void setLista(List<Palabra> lista) {
		this.lista = lista;
	}

	//toString
	@Override
	public String toString() {
		return "Diccionario [lista=" + lista + "]";
	}
	
	//Métodos
	public void addPalabra(Palabra p) {
			lista.add(p);
	}
	
	//Mostrar con iterator
	public void mostrarLista() {
		Iterator<Palabra> it = lista.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public Palabra findByNombre(String nombre) {
		Palabra p = null;
		boolean salir = false;
		
		for (int i = 0; i < lista.size() && !salir; i++) {
			if(lista.get(i).getNombre().equalsIgnoreCase(nombre)) {
				p = lista.get(i);
				salir = true;
			}
		}
		return p;
	}
	
	public void modificarSignificado(Palabra p, String significadoNuevo) {
		p.setSignificado(significadoNuevo);
	}
	
	public void deletePalabra(Palabra p) {
		lista.remove(p);
	}
}
