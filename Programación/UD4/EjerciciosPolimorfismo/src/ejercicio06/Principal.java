package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String aux;
		Scanner sc = new Scanner(System.in);
		int tam = 10;
		int numeroCuenta = 0;
		int cantidadIngresada = 20;
		int cantidadRetirada = 10;
		
		Cuenta c = new Cuenta(1000, 1);
		Cuenta cc = new CuentaCorriente(1000, 2, 50,0);
		Cuenta ce = new CuentaEmpresa(1000, 3);
		Cuenta cj = new CuentaJoven(1000, 4);
		
		Cuenta [] lista = new Cuenta[tam];
		
		lista[0]=c;
		lista[1]=cc;
		lista[2]=ce;
		lista[3]=cj;
		
		Oficina o = new Oficina(lista);
		
		c.ingresarDinero(cantidadIngresada);
		cc.ingresarDinero(cantidadIngresada);
		ce.ingresarDinero(cantidadIngresada);
		cj.ingresarDinero(cantidadIngresada);
		
		c.retirarDinero(cantidadRetirada);
		cc.retirarDinero(cantidadRetirada);
		ce.retirarDinero(cantidadRetirada);
		cj.retirarDinero(cantidadRetirada);
		
		
	
		o.mostrarCuentas();
		
		System.out.println(o.sumaSaldos());
	}

}
