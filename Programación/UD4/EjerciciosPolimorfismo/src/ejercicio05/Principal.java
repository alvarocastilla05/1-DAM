package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String aux;
		int tam = 10;
		double sueldoBase = 1000;
		double objetivo;
		int numEmpleados=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido, en el siguiente programa vamos a calcular el sueldo de los distintos tipos de empleado.");
		System.out.println("*******************************************************************************************************");
		
		
		
		System.out.println("Introduzca el objetivo de ventas del vendedor:");
		aux = sc.nextLine();
		objetivo = Double.parseDouble(aux);
		
		Empleado [] lista = new Empleado[tam];
		
		
		
		Empleado e = new Empleado("Alvaro", "Castilla Cano", sueldoBase, 1);
		Empleado v = new Vendedor("Paco", "García Rojas", sueldoBase, 2, 2000, 2.0);
		Empleado g = new Gerente("Jose Luis", "Ruíz Gómez", sueldoBase, 3, 10);
		
		
		Oficina o = new Oficina(lista, numEmpleados);
		o.addEmpleado(e);
		o.addEmpleado(g);
		o.addEmpleado(v);
		
		/*lista[0]=e;
		lista[1]=v;
		lista[2]=g;*/
		
		
		System.out.println(o.calcularSueldoUnEmpleado(e));
		System.out.println(o.calcularSueldoUnEmpleado(g));
		System.out.println(o.calcularSueldoUnEmpleado(v));
		
		
		o.mostrarEmpleados(objetivo);
		System.out.println(o.sumaSueldos());
		
	}

}
