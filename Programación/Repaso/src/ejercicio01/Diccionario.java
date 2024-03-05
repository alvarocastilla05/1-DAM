package ejercicio01;

import java.util.Map;

public class Diccionario {

	Map<Palabra, Integer> lista;

	public Diccionario(Map<Palabra, Integer> lista) {
		this.lista = lista;
	}

	public Map<Palabra, Integer> getLista() {
		return lista;
	}

	public void setLista(Map<Palabra, Integer> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Diccionario [lista=" + lista + "]";
	}
	
	public void addPalabra(Palabra p, int id) {
		lista.put(p, id);
	}
	
	public Palabra findById(int id) {
		
		for (Palabra p : lista) {
			
		}
	}
}
