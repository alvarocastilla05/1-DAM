package ejercicio03;

import java.util.List;

public class Playlist {

	//Atributos.
	List<Cancion> lista;

	//Constructores.
	public Playlist(List<Cancion> lista) {
		this.lista = lista;
	}

	//Getters and Setters.
	public List<Cancion> getLista() {
		return lista;
	}

	public void setLista(List<Cancion> lista) {
		this.lista = lista;
	}

	//toString.
	@Override
	public String toString() {
		return "Playlist [lista=" + lista + "]";
	}
	
	public List<Cancion> findByNombre(String nombre){
		return lista.stream().filter(c -> c.getNombre().equalsIgnoreCase(nombre)).toList();
	}
	
	public List<Cancion> findByAutor(String autor){
		return lista.stream().filter(c -> c.getAutor().equalsIgnoreCase(autor)).toList();
	}
	
	public List<Cancion> findByDuracion(double duracion){
		return lista.stream().filter(c -> c.getDuracion()==duracion).toList();
	}
	
	
}
