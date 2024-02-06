package ejercicio01;

import java.util.List;

public class CrudNotas {

	private List<Nota> lista;

	public CrudNotas(List<Nota> lista) {
		this.lista = lista;
	}

	public List<Nota> getLista() {
		return lista;
	}

	public void setLista(List<Nota> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudNotas [lista=" + lista + "]";
	}
	
	public void addNota (Nota n) {
		lista.add(n);
	}
	
	public void imprimirLista () {
		for (Nota n : lista) {
			System.out.println(n);
		}
	}
	
	public Nota findById (int id) {
		Nota n = null;
		boolean salir = false;
		
		for (int i = 0; i < lista.size() && !salir; i++) {
			if(lista.get(i).getId()==id) {
				n = lista.get(i);
				salir = true;
			}
		}
		return n;
	}
	
	public void deleteNota(int id) {
		if(findById(id)!=null) {
			lista.remove(findById(id));
		}
	}
	public void modificarNota(int id, Nota n, String tituloNuevo) {
		if(findById(id)!=null) {
			n.setTitulo(tituloNuevo);
		}
	}

}
