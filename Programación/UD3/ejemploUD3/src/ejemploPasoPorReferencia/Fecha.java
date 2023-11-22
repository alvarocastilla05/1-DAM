package ejemploPasoPorReferencia;

public class Fecha {

	//LAS FECHAS NUNCA SE HACEN ASÍ, ESTO ES SOLO UN EJEMPLO
	
	private int dia; //1-31 con base en el mes
	private int mes; //1-12
	private int anio; //cualquier año
	public Fecha(int dia, int mes, int anio) {
		
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	public Fecha(int dia, int mes) {
		
		this.dia = dia;
		this.mes = mes;
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}
	
	
	
	
	
	
}
