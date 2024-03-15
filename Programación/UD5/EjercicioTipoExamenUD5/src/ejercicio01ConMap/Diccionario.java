package ejercicio01ConMap;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Diccionario {

	//Atributos
	private Map<Palabra,Integer> lista;

	//Constructores
	
	public Diccionario(Map<Palabra,Integer> lista) {
		this.lista = lista;
	}
	
	//Getters and Setters
	
	public Map<Palabra,Integer> getLista() {
		return lista;
	}

	public void setLista(Map<Palabra,Integer> lista) {
		this.lista = lista;
	}

	//toString
	@Override
	public String toString() {
		return "Diccionario [lista=" + lista + "]";
	}
	
	

	//Métodos
	public void addPalabra(int id,Palabra p) {
			lista.put(p,id);
	}
	
	//Mostrar con iterator
	/*
	public void mostrarLista() {
		Iterator<Palabra> it = lista.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}*/
	
	
	public void mostrarLista() {
		 for (Map.Entry<Palabra, Integer> entry : lista.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	}
	
	//Mostrar Map con set.
	public void mostrarListaV2() {
		Set <Entry<Palabra, Integer>> listaSet = lista.entrySet();
		
		for (Entry<Palabra, Integer> entry : listaSet) {
			System.out.println(entry);
		}
	}
	
	public Palabra findByNombre(String nombre) {
		
		for (Palabra p : lista.keySet()) {
			if(p.getNombre().equalsIgnoreCase(nombre)) {
				return p;
			}
		}
		return null;
	}
	
	public void modificarSignificado(Palabra p, String significadoNuevo) {
		p.setSignificado(significadoNuevo);
	}
	
	public void deletePalabra(Palabra p) {
		lista.remove(p);
	}
}
