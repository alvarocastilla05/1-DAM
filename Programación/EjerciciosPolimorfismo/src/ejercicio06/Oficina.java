package ejercicio06;

import java.util.Arrays;

public class Oficina {

	private Cuenta [] lista;

	public Oficina(Cuenta[] lista) {
		this.lista = lista;
	}

	public Cuenta[] getLista() {
		return lista;
	}

	public void setLista(Cuenta[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + "]";
	}
	
	public void addCuenta (Cuenta c) {
		lista[]
	}
}
