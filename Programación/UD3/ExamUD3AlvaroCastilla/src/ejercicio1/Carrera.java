package ejercicio1;

import java.util.Arrays;

public class Carrera {

	private Corredor lista[];
	private double km;
	
	
	public Carrera(Corredor[] lista, double km) {
		this.lista = lista;
		this.km = km;
	}


	public Corredor[] getLista() {
		return lista;
	}


	public void setLista(Corredor[] lista) {
		this.lista = lista;
	}


	public double getKm() {
		return km;
	}


	public void setKm(double km) {
		this.km = km;
	}


	@Override
	public String toString() {
		return "Carrera [lista=" + Arrays.toString(lista) + ", km=" + km + "]";
	}
	
	
	public void add(Corredor c, int pos) {
		lista[pos]=c;
	}
	
	public void mostrarLista() {
		for (int i = 0; i < lista.length ; i++) {
			System.out.println((i+1)+". "+lista[i]);
		}
	}
	
	public double calcularSeg(double tiempo) {
		int factor=60;
		double tiempoSeg;
		
		tiempoSeg=tiempo/factor;
		
		return tiempoSeg;
		
	}
	public int findByCategoria (Corredor c, int categoria){
		int i=0;
		boolean encontrado= true;
		
		while(i<lista.length && !encontrado) {
			Corredor deLista=lista[i];
			if(deLista.getCategoria() == categoria) {
				encontrado = true;
			}else {
				i++;
			}
		}
		
		if(encontrado) {
			return i;
		}
		return -1;
	}
	public void mostraFind(int findByCategoria) {
		
		System.out.println(lista[findByCategoria]);
		}
	
	public int findByNum (Corredor c, int num){
		int i=0;
		boolean encontrado= true;
		
		while(i<lista.length && !encontrado) {
			Corredor deLista=lista[i];
			if(deLista.getNum() == num) {
				encontrado = true;
			}else {
				i++;
			}
		}
		
		if(encontrado) {
			return i;
		}
		return -1;
		
	}
	
	public double calcularMediaMinKm( Corredor c, double km) {
		double media;
		
		media=km/c.getTiempo();
		
		return media;
	}
	public void mostrarMedia(double media) {
		System.out.println("La media de corredor escogido es "+media);
	}
	
	public double calcularTiJuv(Corredor []lista, double tiempo, int categoria) {
		if(categoria==1) {
			for (int i = 0; i < lista.length; i++) {
				tiempo++;
			}
			return tiempo;
		}else
			return -1;
	}
	public void mostrarTiempo(double tiempo) {
		System.out.println(tiempo);
	}
	
	
}
	
	
	
	
	
	

