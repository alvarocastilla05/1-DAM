package ejercicio01;

import java.util.Arrays;

public class Ventas {

	Producto [] lista;

	public Ventas(Producto[] lista) {
		this.lista = lista;
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Ventas [lista=" + Arrays.toString(lista) + "]";
	}
	
	public int mostrarNumeroVendidos () {
		int contador = 0;
		for (int i = 0; i < lista.length; i++) {
			if(lista[i]!=null) {
				if (lista[i].isVendido()==true) {
					contador++;
				}	
			}
		}
		return contador;
		
	}
}
