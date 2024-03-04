package ejercicio02;

import java.util.List;

public class Oficina {

	List<Trastero> lista;

	public Oficina(List<Trastero> lista) {
		this.lista = lista;
	}

	public List<Trastero> getLista() {
		return lista;
	}

	public void setLista(List<Trastero> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + lista + "]";
	}
	
	public void addTrastero(Trastero t) {
			lista.add(t);

	}
	
	
}
