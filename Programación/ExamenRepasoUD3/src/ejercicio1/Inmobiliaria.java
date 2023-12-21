package ejercicio1;

import java.util.Arrays;

import repaso.Producto;


public class Inmobiliaria {

	
	private Piso [] lista;
	private int numVendedores;
	private int numPiso;
	
	public Inmobiliaria(Piso[] lista, int numVendedores, int numPiso) {
		this.lista = lista;
		this.numVendedores = numVendedores;
		this.numPiso = numPiso;
	}

	
	public Piso[] getLista() {
		return lista;
	}

	public void setLista(Piso[] lista) {
		this.lista = lista;
	}

	public int getNumVendedores() {
		return numVendedores;
	}

	public void setNumVendedores(int numVendedores) {
		this.numVendedores = numVendedores;
	}
	
	public int getNumPiso() {
		return numPiso;
	}

	public void setNumPiso(int numPiso) {
		this.numPiso = numPiso;
	}


	
	@Override
	public String toString() {
		return "Inmobiliaria [lista=" + Arrays.toString(lista) + ", numVendedores=" + numVendedores + ", numPiso="
				+ numPiso + "]";
	}


	public void addPiso(Piso p) {
		lista[numPiso]=p;
		numPiso++;
	}
	
	public void mostrarLista (Piso [] lista){
		for (int i = 0; i < lista.length; i++) {
			if(lista[i]!=null) {
				System.out.println(lista[i]);
			}
			
		}
	}
	
	public int findById (int id) {
		int i=0;
		boolean encontrado = false;
		
		while(i<numPiso && !encontrado) {
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
	
	public double calcularPrecioVentaFinal (int id,  double porcentaje) {
				
		
		return lista[findById(id)].getPrecioVenta() + (lista[findById(id)].getPrecioVenta()*(porcentaje/100));
		
	}
	
	public Piso [] buscarByEstado (int estado) {
		int i=0;
		
		Piso [] listaEncontrados=new Piso[numPiso];
		
		while (i<numPiso) {
			if (lista[i].getEstado()==estado) {
				listaEncontrados[i]=lista[i];
			}
			i++;
		}
		return listaEncontrados;
		
	}
	
	
	
}
