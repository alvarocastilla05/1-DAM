package ejemploCasting;

public class OperacionFiguras {

	public double calcularAreaUnaFigura (Figura f) {
		return f.calcularArea();
	}
	
	public double sumarAreas (Figura [] lista) {
		double resultado = 0;
		
		for (int i = 0; i < lista.length; i++) {
			resultado = resultado+calcularAreaUnaFigura(lista[i]);
			
		}
		return resultado;
	}
	
	public double sumarAreasConAviso (Figura [] lista) {
		double resultado = 0;
		
		for (int i = 0; i < lista.length; i++) {
			resultado = resultado+calcularAreaUnaFigura(lista[i]);
			if(lista[i] instanceof Circulo) {
				((Circulo)lista[i]).mostrarRadianes();
			}
		}
	}
}
