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
		Socio s = null;
		boolean salir = false;
		
		for (int i = 0; i < lista.size() && !salir; i++) {
			if(lista.get(i).getId()==id) {
				s = lista.get(i);
				salir = true;
			}
		}
		return s;
	}

	
	public void deleteSocio(int id) {
		if(findById(id)!=null) {
			lista.remove(findById(id));
		}
	}
	
	//No se puede dar como parametro socio y el atributo con el que busqué, o uno u otro pero los dos juntos NO. 
	public void modificarSocio(Socio s, double cuotaNueva) {
		s.setCuota(cuotaNueva);
	}
	
	
}
