package ejercicio02;

public abstract class Trabajador implements IImpuesto{


	@Override
	public double calculoIrpf(double sueldo) {
		
		return sueldo;
	}

	@Override
	public abstract double calculoIva(double precio, int iva) ;

}
