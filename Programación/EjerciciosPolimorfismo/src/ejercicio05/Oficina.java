package ejercicio05;

import java.util.Arrays;

public class Oficina {

	private Empleado [] lista;
	private int numEmpleados;
	
	public Oficina(Empleado[] lista, int numEmpleados) {
		this.lista = lista;
		this.numEmpleados = numEmpleados;
	}
	
	
	public Empleado[] getLista() {
		return lista;
	}

	public void setLista(Empleado[] lista) {
		this.lista = lista;
	}

	public int getNumEmpleados() {
		return numEmpleados;
	}

	public void setNumEmpleados(int numEmpleados) {
		this.numEmpleados = numEmpleados;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + ", numEmpleados=" + numEmpleados + "]";
	}

	
	
	public double calcularSueldoUnEmpleado (Empleado e ) {
		return e.calcularSueldo();
	}
	
	public double sumaSueldos (double porcentajeImpuestos) {
		double resultado = 0;
		
		for (int i = 0; i < lista.length; i++) {
			resultado = resultado+calcularSueldoUnEmpleado(lista[i]);
		}
		return resultado;
	}
	
	public void addEmpleado (Empleado e) {
		
		lista[numEmpleados++] = e;
		
		
	}
	
	public void mostrarEmpleados (double objetivo) {
		
		for (int i = 0; i < numEmpleados; i++) {
			System.out.println(lista[i] + "Sueldo" + calcularSueldoUnEmpleado(lista[i]));
			
			if(lista[i] instanceof Vendedor) {
				((Vendedor)lista[i]).avisoObjetivo(objetivo);
			}
		}
	}
}
