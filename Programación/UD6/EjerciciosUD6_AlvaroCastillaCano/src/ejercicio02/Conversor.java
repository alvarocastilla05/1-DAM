package ejercicio02;

public class Conversor {

	public double conversionGrados(double celsius) throws Exception {
		if(celsius < -273) {
			throw new MiExcepcion("No puede haber temperaturas menores a -273ºC");
		}
		return (celsius*9.0/5.0)+32;
	}
}
