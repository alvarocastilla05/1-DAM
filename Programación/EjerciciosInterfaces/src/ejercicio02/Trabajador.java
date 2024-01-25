package ejercicio02;

public  class Trabajador implements IImpuesto{


	@Override
	public double calculoIrpf(double sueldo) {
		double irpf = 85, cien = 100;
		return sueldo*(irpf/cien);
	}

	@Override
	public double calculoIva(double precio, int iva) {
		return 0;
	}

}
