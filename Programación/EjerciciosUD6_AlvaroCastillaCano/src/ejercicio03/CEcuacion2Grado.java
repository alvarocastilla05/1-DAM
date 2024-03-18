package ejercicio03;

public class CEcuacion2Grado {

	public double calculoEcuacion(double a, double b, double c) throws ExcepcionDegenerada, ExcepcionCompleja{
		double discriminante = Math.pow(b, 2)-4*a*c;
		double x1, x2;
		
		if(a==b) {
			throw new ExcepcionDegenerada("La ecucion es degenerada");
		}
		
		if(discriminante < 0) {
			throw new ExcepcionCompleja("Es una ecuación compleja");
		}
		
		x1=(-b+Math.sqrt(discriminante))/(2*a);
		x2=(-b-Math.sqrt(discriminante))/(2*a);
		
		return x1, x2;
		
		
	}
}
