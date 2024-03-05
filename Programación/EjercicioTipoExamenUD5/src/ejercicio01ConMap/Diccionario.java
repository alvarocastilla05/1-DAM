package ejercicio01ConMap;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Diccionario {

	//Atributos
	private Map<Integer,Palabra> lista;

	//Constructores
	
	public Diccionario(Map<Integer, Palabra> lista) {
		this.lista = lista;
	}
	
	//Getters and Setters
	
	public Map<Integer, Palabra> getLista() {
		return lista;
	}

	public void setLista(Map<Integer, Palabra> lista) {
		this.lista = lista;
	}

	//toString
	@Override
	public String toString() {
		return "Diccionario [lista=" + lista + "]";
	}
	
	

	//Métodos
	public void addPalabra(int id,Palabra p) {
			lista.put(id,p);
	}
	
	//Mostrar con iterator
	/*
	public void mostrarLista() {
		Iterator<Palabra> it = lista.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}*/
	
	/*
	public void mostrarLista() {
		for (Map.entry(Integer, Palabra) lista : diccionario) {
			
		}
	}*/
	
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
