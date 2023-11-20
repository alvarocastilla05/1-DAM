package crud;

import java.util.Arrays;

import model.Producto;

public class CrudProducto {

	private Producto [] lista;

	//Constructor para crear un objeto de esta clase pasando como parametro una lista que ya puede tener tamaño dado por el usuario en el main.
	
	public CrudProducto(Producto[] lista) {
		
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
		return "CrudProducto [lista=" + Arrays.toString(lista) + "]";
	}
	
	//Pasamos un producto y una posición y se añade dicho producto en dicha posición
	//OJO, porque no se comprueba nada, se pierde lo que había.
	//No es buena idea pedirle la posición al usuario, aunque de momento lo vamos a hacer. 
	
	public void add(Producto p, int posicion) {
		lista[posicion]=p;
	}
	
	//Método para Buscar producto.
	
	public Producto findById(String codigo) {
		int i = 0;
		boolean encontrado = false;
		
		//Mientras no hayamos llegado al final o encontrado lo que buscamos, se realizará el siguiente bucle hasta encontrarlo.
		//Al encotrarlo el bucle para.
		
		while (i<lista.length && !encontrado) {
			Producto delista = lista[i];
			if (delista.getCodigo().equalsIgnoreCase(codigo))  //equalsIgnoreCase sirve para comparar cadenas ignorando si los caracteres están en mayúscula o minúscula.
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return lista[i]; //Devolvamos el producto buscado.
		else
			return null;
	}
	
	//Otro método para buscar.
	
	public int findByIdV2(String codigo) {
		int i = 0;
		boolean encontrado = false;
		
		while (i<lista.length && !encontrado) {
			Producto deLista = lista[i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo))
				encontrado=true;
			else
				i++;
		}
		if (encontrado)
			return i;
		else 
			return -1;
	}
	
	//Método para editar.
	
	public void editPrecio(String codigo, double precioN) {
		int index = findByIdV2(codigo);
		if (index >= 0) {
			lista[index].setPrecioUnitario(precioN);
		}
	}
	
	//Método borrar
	/*
	public void delete(Producto p) {
		int index = findProduct(p); //Devuelve el indice del array
		if (index)
	}*/
	
	
	
	//Mostrar todos los productos de la lista
	
	public void imprimirTodosLosProductos () {
		for (int i = 0; i < lista.length; i++) {
			System.out.println((i+1)+"."+lista[i]);
		}
	}
	
	//Mostrar solo los productos cuyo atributos activo es true, es decir, están a la venta
	
	public void imprimirSoloActivos () {
		
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			if (lista[i].isActivo()) {
				System.out.println((i+1)+"."+lista[i]);
			}
		}
	}
	
	
}
