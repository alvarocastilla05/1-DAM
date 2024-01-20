package ejercicio05;

import java.util.Arrays;

public class Oficina {

	private Empleado [] lista;
	

	public Oficina(Empleado[] lista) {
		this.lista = lista;
		
	}
	
	public Empleado[] getLista() {
		return lista;
	}

	public void setLista(Empleado[] lista) {
		this.lista = lista;
	}


	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + "]";
	}

	public double calcularSueldoUnEmpleado (Empleado e, double porcentajeImpuestos, double incentivo) {
		return e.calcularSueldo(porcentajeImpuestos, incentivo);
	}
	
	public double sumaSueldos (double porcentajeImpuestos, double incentivo) {
		double resultado = 0;
		
		for (int i = 0; i < lista.length; i++) {
			resultado = resultado+calcularSueldoUnEmpleado(lista[i], porcentajeImpuestos, incentivo);
		}
		return resultado;
	}
	
	public void addEmpleado (Empleado e) {
		
		lista[] = e;
		
	}
}
