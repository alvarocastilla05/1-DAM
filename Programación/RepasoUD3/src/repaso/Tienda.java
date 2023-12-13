package repaso;

import java.util.Arrays;

public class Tienda {

	private Producto [] lista;
	private int numProductos;
	private int numTrabajadores;
	
	//Constructores.
	
	public Tienda(Producto[] lista, int numProductos, int numTrabajadores) {
		this.lista = lista;
		this.numProductos = numProductos;
		this.numTrabajadores = numTrabajadores;
	}

	
	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	public int getNumProductos() {
		return numProductos;
	}

	public void setNumProductos(int numProductos) {
		this.numProductos = numProductos;
	}

	public int getNumTrabajadores() {
		return numTrabajadores;
	}

	public void setNumTrabajadores(int numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}


	@Override
	public String toString() {
		return "Tienda [lista=" + Arrays.toString(lista) + ", numProductos=" + numProductos + ", numTrabajadores="
				+ numTrabajadores + "]";
	}
	
	
	//Metodo añadir
	
	public void addProduct(Producto p) {
		lista[numProductos]=p;
		numProductos++;
		
	}
	
	
	
}
