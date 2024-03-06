package ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Equipo {

	private String nombreEquipo;
	private List<Jugador> lista;
	
	
	public Equipo(String nombreEquipo, List<Jugador> lista) {
		this.nombreEquipo = nombreEquipo;
		this.lista = lista;
	}


	public String getNombreEquipo() {
		return nombreEquipo;
	}


	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}


	public List<Jugador> getLista() {
		return lista;
	}


	public void setLista(List<Jugador> lista) {
		this.lista = lista;
	}


	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", lista=" + lista + "]";
	}
	
	//Metodos
	
	public void mostrarJugadores() {
		Iterator<Jugador> it = lista.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public List<Jugador> findByGoles(){
		Iterator<Jugador> it = lista.iterator();
		List<Jugador> listaSinGoles = new ArrayList<Jugador>();
		
		while(it.hasNext()) {
			if(it.next().getGolesMarcados()==0) {
				listaSinGoles.add(it.next());
			}
		}
		return listaSinGoles;

	}
	
	public Jugador findByNumero(int dorsal) {
		boolean salir = false;
		Jugador j = null;
		
		for (int i = 0; i < lista.size() && !salir; i++) {
			if(lista.get(i).getNumJugador()==dorsal) {
				j=lista.get(i);
				salir = true;
			}
		}
		if(salir) {
			return j;
		}else {
			return null;
		}
	}
	
	public double calcularMediaGoles() {
		double total = 0;
		
		for (Jugador jugador : lista) {
			total+=jugador.getGolesMarcados();
		}
		return total/lista.size();
	}
	
	
	public void modifyPosicion(Jugador j, String nuevaPosicion) {
		j.setPosicion(nuevaPosicion);
	}
	
	
}
