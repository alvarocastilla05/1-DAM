package ejercicio01;

import java.util.Arrays;
import java.util.Iterator;

public class TiendaAlquileres {

	private Vehiculos [] lista;
	
	
	public TiendaAlquileres(Vehiculos[] lista) {
		this.lista = lista;
	}

	public Vehiculos[] getLista() {
		return lista;
	}

	public void setLista(Vehiculos[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "TiendaAlquileres [lista=" + Arrays.toString(lista) + "]";
	}

	public double calcularPrecioUnVehiculo (Vehiculos v, double fijoBatmovil) {
		return v.calcularPrecio(fijoBatmovil);
	}
	
	public Vehiculos findById (int id) {
		boolean encontrado = false;
		int i = 0;
		
		while(i<id && !encontrado) {
			if(lista[i].getId()==id) {
				encontrado = true;
			}else {
				i++;
			}
		}
		if(encontrado) {
			return lista[i];
		}
		else {
			return null;
		}
	}
	//Repasar luego, esta mal
	public double calcularPrecioBuscado (int id, double fijoBatmovil, Vehiculos v) {
				return calcularPrecioUnVehiculo(v, fijoBatmovil);
			
		}
		
	
	
	public void mostrarListaConAviso() {
		for (int i = 0; i < lista.length; i++) {
			if(lista[i]!=null) {
				System.out.println(lista[i]);
			}
			if(lista[i] instanceof Batmoviles) {
				((Batmoviles)lista[i]).avisarMaximo();
			}
		}
	}
	
	public double calcularTotalRecaudado( double fijoBatmovil) {
		double suma = 0;
		for (int i = 0; i < lista.length; i++) {
			if(lista[i]!=null) {
				if(lista[i] instanceof Batmoviles) {
					suma = suma+((Batmoviles)lista[i]).calcularPrecio(fijoBatmovil);
				}
			}
			
		}
		return suma;
	}
	
	public double calcularPrecioVariosDias (Vehiculos v, double fijoBatmovil, int numeroDias) {
		return calcularPrecioUnVehiculo(v, fijoBatmovil)*numeroDias;
	}
	
	
	
	
}
