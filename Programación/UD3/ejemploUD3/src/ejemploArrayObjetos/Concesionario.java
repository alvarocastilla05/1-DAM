package ejemploArrayObjetos;

import java.util.Arrays;

public class Concesionario {

	private Vehiculo []lista;
	private int nVs;

		
	public Concesionario(Vehiculo[] lista, int nVs) {
		this.lista = lista;
		this.nVs = nVs;
	}
	
	

	public Vehiculo[] getLista() {
		return lista;
	}

	public void setLista(Vehiculo[] lista) {
		this.lista = lista;
	}
	
	public int getnVs() {
		return nVs;
	}

	public void setnVs(int nVs) {
		this.nVs = nVs;
	}

	

	@Override
	public String toString() {
		return "Concesionario [lista=" + Arrays.toString(lista) + ", nVs=" + nVs + "]";
	}



	public void add (Vehiculo v) {
		
		lista[nVs]=v;
		nVs++;
	}
	
	public void mostrarEmpepinados (int topePotencia){
		for (int i = 0; i < nVs; i++) {
			if(lista[i].getPotencia()>=topePotencia) {
				System.out.println(lista[i].getModelo());
			}
		}
	}
	
	
}
