package ejercicio02;

import java.util.List;

public class CRUDSocio {

	private List <Socio> lista;
	
	public CRUDSocio(List<Socio> lista) {
		this.lista = lista;
	}
	
	public List<Socio> getLista() {
		return lista;
	}

	public void setLista(List<Socio> lista) {
		this.lista = lista;
	}
	
	@Override
	public String toString() {
		return "CRUDSocio [lista=" + lista + "]";
	}

	public void addSocio (Socio s) {
		lista.add(s);
	}
	
	public Socio findById (int id) {
		Socio tem = null;
		boolean salir = false;
		
		for (int i = 0; i < lista.size() && !salir; i++) {
			if(lista.get(i).getId()==id) {
				tem = lista.get(i);
				salir = true;
			}
		}
		return tem;
	}
	public void mostrarLista() {
		for (Socio s : lista) {
			System.out.println(s);
		}
	}
	
	public void deleteSocio(int id) {
		if(findById(id)!=null) {
			lista.remove(findById(id));
		}
	}
	
	public void modificarSocio(int id, double cuotaNueva) {
		for (int i = 0; i < lista.size(); i++) {
			lista.get(i).setCuota(cuotaNueva);
		}
	}
	
	
}
