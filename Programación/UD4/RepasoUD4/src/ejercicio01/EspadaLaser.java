package ejercicio01;

public class EspadaLaser extends Producto{

	private String tipoEspada;

	public EspadaLaser(double precioBase, int cantidad, String nombre, boolean vendido, String tipoEspada) {
		super(precioBase, cantidad, nombre, vendido);
		this.tipoEspada = tipoEspada;
	}

	public String getTipoEspada() {
		return tipoEspada;
	}

	public void setTipoEspada(String tipoEspada) {
		this.tipoEspada = tipoEspada;
	}

	@Override
	public double calcularPVP(double porcentaje, double fijoEspadaDoble) {
		double cien = 100;
		return super.getPrecioBase()+(super.getPrecioBase()*(porcentaje/cien))+fijoEspadaDoble;
	}
	
	public void avisoEspadaDoble () {
		System.out.println("¡Cuidadín al sacarla de la bolsa, que hace pupa!");
	}
	
	
	
	
	
	
}
