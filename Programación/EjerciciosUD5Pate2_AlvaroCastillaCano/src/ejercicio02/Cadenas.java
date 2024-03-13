package ejercicio02;

import java.util.List;

public class Cadenas {

	//Atributos
	private List<String> lista;

	//Constructores
	public Cadenas(List<String> lista) {
		this.lista = lista;
	}

	//Getters and Setters
	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}

	//toString
	@Override
	public String toString() {
		return "Cadenas [lista=" + lista + "]";
	}
	
	
	
	
	
}
