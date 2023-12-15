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
	
	public void mostrarProductos (){
		for (int i = 0; i < numProductos; i++) {
			System.out.println((i+1)+ ". "+lista[i]);
		}
	}
	
	public void mostrarLista (Producto [] lista){
		for (int i = 0; i < lista.length; i++) {
			if(lista[i]!=null) {
				System.out.println(lista[i]);
			}
			
		}
	}
	
	public Producto [] buscarBySeccion (int seccion) {
		int i=0;
		
		Producto [] listaEncontrados=new Producto[numProductos];
		
		while (i<numProductos) {
			if (lista[i].getSeccion()==seccion) {
				listaEncontrados[i]=lista[i];
			}
			i++;
		}
		return listaEncontrados;
		
	}
	
	public Producto [] findById
	
	
	public double calcularPrecioVenta (double precio) {
		double precioVenta;
		double porcentaje = 0;
		int cien=100;
		
		precioVenta=precio*(porcentaje/cien);
		
		return precioVenta;
		
	}
	
	
}
