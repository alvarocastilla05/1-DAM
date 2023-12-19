package ejercicio1;

import java.util.Arrays;


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
	
	
	
}
