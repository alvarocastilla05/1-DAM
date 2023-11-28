package ejercicio01;

import java.util.Arrays;

public class Tienda {

	private Producto []lista;
	private double ganancias;
	private double gastosTot;
	
	public Tienda(Producto[] lista, double ganancias, double gastosTot) {
		this.lista = lista;
		this.ganancias = ganancias;
		this.gastosTot = gastosTot;
	}

	
	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	public double getGanancias() {
		return ganancias;
	}

	public void setGanancias(double ganancias) {
		this.ganancias = ganancias;
	}

	public double getGastosTot() {
		return gastosTot;
	}

	public void setGastosTot(double gastosTot) {
		this.gastosTot = gastosTot;
	}


	@Override
	public String toString() {
		return "Tienda [lista=" + Arrays.toString(lista) + ", ganancias=" + ganancias + ", gastosTot=" + gastosTot
				+ "]";
	}
	
	
	
	
	

}
