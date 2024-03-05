package ejercicio02;

import java.util.ArrayList;
import java.util.Iterator;
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
	
	public void mostrarLista() {
		for (Trastero t : lista) {
			System.out.println(t);
		}
	}
	
	/*Mostrar con Iterator*/
	public void mostraListaV2() {
		Iterator<Trastero> it = lista.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public List findByPrecio(double precio) {
		List<Trastero> lista = new ArrayList<Trastero>();
		boolean salir = false;
		
		for (Trastero t : lista) {
			if(t.getPrecio()==precio) {
				lista.add(t);
			}
				
		}
		return lista;
		
	}
	
	public Trastero findByNumero(int numTrastero) {
		Trastero t = null;
		boolean salir = false;
		
		for (int i = 0; i < lista.size() && !salir; i++) {
			if(lista.get(i).getNumTrastero()==numTrastero) {
				t = lista.get(i);
				salir = true;
			}
		}
		return t;
	}
	
	public Trastero buscarPrecioMayor() {
		Trastero trasteroMasCaro = lista.get(0);
        for (Trastero trastero : lista) {
            if (trastero.getPrecio() > trasteroMasCaro.getPrecio()) {
                trasteroMasCaro = trastero;
            }
        }
        return trasteroMasCaro;
	}
	
	public void deleteTrastero(Trastero t) {
		lista.remove(t);
	}
	
	public void modifyPrecio(Trastero t, double precioNuevo) {
		t.setPrecio(precioNuevo);
	}
	
	public void mostrarNoOcupados() {
		for (Trastero t : lista) {
			if(t.isOcupado()==false) {
				System.out.println(t);
			}
		}
	}
}
