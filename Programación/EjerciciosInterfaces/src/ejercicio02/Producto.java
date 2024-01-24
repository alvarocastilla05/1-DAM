package ejercicio02;

public abstract class Producto implements IImpuesto{

	@Override
	public double calculoIva(double precio, int iva) {
		int cien = 100;
		return precio*(iva/cien);
	}

	@Override
	public abstract double calculoIrpf(double sueldo);

}
