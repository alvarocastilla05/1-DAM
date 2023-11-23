package ejercicio10;

public class Ticket {

	private double precioTicket;
	private String fecha;
	
	public Ticket(double precioTicket, String fecha) {
		this.precioTicket = precioTicket;
		this.fecha = fecha;
	}
	
	public double getPrecioTicket() {
		return precioTicket;
	}
	public void setPrecioTicket(double precioTicket) {
		this.precioTicket = precioTicket;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Ticket [precioTicket=" + precioTicket + ", fecha=" + fecha + "]";
	}
	
	
	
}
