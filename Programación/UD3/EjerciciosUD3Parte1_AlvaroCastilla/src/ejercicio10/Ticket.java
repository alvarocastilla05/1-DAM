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
	
	
	
	public void imprimirTicket(double cambio, double precioTot, double precioTicket, int cantBilletes, String fecha) {
		
		System.out.println("\tEL METRO");
		System.out.println("\tCP 41001");
		System.out.printf(fecha);
		System.out.println();
		System.out.println("------------------------------");
		
		System.out.println("Nº Tickets\tP.U");
		System.out.println(cantBilletes+"\t\t"+precioTicket);
		
		System.out.println("------------------------------");
		System.out.println("TOTAL: €"+precioTot);
		System.out.println("Devolución: €"+cambio);
	}
	
	
	
}
