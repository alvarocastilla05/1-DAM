package ejercicio02;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

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
	
	//Métodos
	
	public List<String> ordenarOrdenAlfabetico(){
		return lista.stream().sorted().toList();
	}
	
	public void mostrarLista() {
		lista.stream().forEach((Consumer<? super String>) new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
			
		});
	}
	
	public String findByNombre(String buscado) {
		return lista.stream().filter(s -> s.equalsIgnoreCase(buscado)).toString();
	}
	
	
	
	
	
}
