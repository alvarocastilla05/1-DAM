package ejercicio02;

import java.util.Arrays;

public class Hotel {

	private Habitacion [] lista;
	private String nombreHotel;
	
	
	public Hotel(Habitacion[] lista, String nombreHotel) {
		this.lista = lista;
		this.nombreHotel = nombreHotel;
	}


	public Habitacion[] getLista() {
		return lista;
	}


	public void setLista(Habitacion[] lista) {
		this.lista = lista;
	}


	public String getNombreHotel() {
		return nombreHotel;
	}


	public void setNombreHotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}


	@Override
	public String toString() {
		return "Hotel [lista=" + Arrays.toString(lista) + ", nombreHotel=" + nombreHotel + "]";
	}
	
	public void add(Habitacion h, int pos) {
		lista[pos]=h;
	}
	
}
