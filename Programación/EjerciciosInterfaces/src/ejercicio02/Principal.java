package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sueldo = 1000;
		double precio = 100;
		int iva = 21;
		String aux;
		Scanner sc = new Scanner(System.in);
		
		Trabajador t = new Trabajador();
		Producto p = new Producto();
		Trabajador th = new TrabajadorPorHoras(10.0, 5);
		
		System.out.println(t.calculoIrpf(sueldo));
		System.out.println(p.calculoIva(precio, iva));
		System.out.println(th.calculoIrpf(sueldo));
	}

}
