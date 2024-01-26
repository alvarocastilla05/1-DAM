package ejercicio06;

import java.util.Arrays;

import ejercicio05.Empleado;

public class Oficina {

	private Cuenta [] lista;
	private int numeroCuenta;

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
	
	/*public double calcularSaldoUnaCuenta (Cuenta c ) {
		return c.saldo;
	}*/
	
	
	public double sumaSaldos () {
		double resultado = 0;
		
		for (int i = 0; i < numeroCuenta; i++) {
			resultado = resultado+lista[i].getSaldo();
		}
		return resultado;
	}
	
	public void mostrarCuentas () {
		
		for (int i = 0; i < lista.length; i++) {
			if (lista[i]!=null){
				System.out.println(lista[i]);
			}
			
	}
}
}
