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
	
	public void mostrarActivos () {
		for (int i = 0; i < numProductos; i++) {
			if(lista[i].isEnVenta()) {
				System.out.println(lista[i]);
			}
		}
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
	
	public int findById(int id) {
		int i=0;
		boolean encontrado = false;
		
		while(i<numProductos && !encontrado) {
			if(lista[i].getId()==id) {
				encontrado=true;
			}else {
				i++;
			}
		}
		if(encontrado) {
			return i;
		}else {
			return -1;
		}
	}
	
	public Producto findById2(int id) {
		int i=0;
		boolean encontrado = false;
		
		while(i<numProductos && !encontrado) {
			if(lista[i].getId()==id) {
				encontrado=true;
			}else {
				i++;
			}
		}
		if(encontrado) {
			return lista[i];
		}else {
			return null;
		}
	}
	
	
	public double calcularPrecioVenta (double precio) {
		double precioVenta;
		double porcentaje = 0;
		int cien=100;
		
		precioVenta=precio*(porcentaje/cien);
		
		return precioVenta;
		
	}
	
	public double calcularPrecioFinal (double ganancia, int id) {
		double cien=100.0;
		Producto p;
		p=findById2 (id);
		
		return p.getPrecioFabrica()+p.getPrecioFabrica()*ganancia/cien;
	}
	
	public void modifyPrecio (double precioNuevo, int seccion) {
		for (int i = 0; i < numProductos; i++) {
			if(lista[i].getSeccion()==seccion) {
				lista[i].setPrecioFabrica(precioNuevo);
			}
		}
	}
	
	
	public double hacerDescuento (double descuento, double ganancia, int id) {
		double cien=100;
		double resul;
		resul=calcularPrecioFinal(ganancia, id)-calcularPrecioFinal(ganancia, id)*descuento/cien;
		return resul;
	}
	
	//Devuelve el numero de elementos "eliminados" de la lista (dejados de vender)
	
	public int eliminarSeccion (int seccion) {
		int contador = 0;
		for (int i = 0; i < numProductos; i++) {
			if (lista[i].getSeccion()==seccion) {
				lista[i].setEnVenta(false);
				contador++;
			}
		}
		return contador;
	}
	
	
	
}
