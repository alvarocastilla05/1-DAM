package repaso;

import java.util.Arrays;

public class Carrera {

	private Corredor [] lista;
	private int km;
	private int numCorredor;
	
	public Carrera(Corredor[] lista, int km, int numCorredor) {
		this.lista = lista;
		this.km = km;
		this.numCorredor = numCorredor;
	}

	public Corredor[] getLista() {
		return lista;
	}

	public void setLista(Corredor[] lista) {
		this.lista = lista;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}
	
	public int getNumCorredor() {
		return numCorredor;
	}

	public void setNumCorredor(int numCorredor) {
		this.numCorredor = numCorredor;
	}

	@Override
	public String toString() {
		return "Carrera [lista=" + Arrays.toString(lista) + ", km=" + km + "]";
	}
	
	public void addCorredor (Corredor c) {
		lista[numCorredor]=c;
		numCorredor++;
	}
	
	public void mostrarLista (Corredor [] lista) {
		for (int i = 0; i < lista.length; i++) {
			if(lista[i]!=null) {
				System.out.println(lista[i]);
			}
		}
	}
	
	public Corredor [] findByDorsal(int dorsal) {
		int i=0;
		
		Corredor [] listaEncontrados = new Corredor[dorsal];
		
		while(i<dorsal) {
			if(lista[i].getDorsal()==dorsal) {
				listaEncontrados[i]=lista[i];
			}
			i++;
		}
		return listaEncontrados;
	}
	
	public double calcularSeg(int tiempo, int dorsal) {
		int factor=60;
		Corredor c;
		c= findByDorsal(dorsal);
		
		return tiempo/factor;
		
	}
	
	
	
}
