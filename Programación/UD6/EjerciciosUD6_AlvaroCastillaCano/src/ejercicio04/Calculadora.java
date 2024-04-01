package ejercicio04;

public class Calculadora {

	public int sumar(int a, int b) throws Exception {
		
		if(a+b >10) {
			throw new ExcepcionMasDiez("La suma no puede ser mayor de 10");
		}else {
			return a+b;
		}
	}
}
