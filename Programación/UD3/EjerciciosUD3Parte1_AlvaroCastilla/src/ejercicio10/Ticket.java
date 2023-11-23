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
	
	public double calcularPrecio (double precioTicket, int cantBilletes) {
		
		double precioTot;
		precioTot=precioTicket*cantBilletes;
		
		return precioTot;
		
	}
	public void mostrarPrecio (double precioTot) {
		System.out.println("Precio total: €"+precioTot);
	}
	
	public double calcularDev (double precioTot, double dinEntregado) {
		double cambio;
		
		cambio=dinEntregado-precioTot;
		
		return cambio;
		
	}
	
	public void mostrarDev (double cambio) {
		
		System.out.printf("La devolución es de %.2f € ", cambio);
	}
	
	public void imprimirTicket(double cambio, double precioTot, double precioTicket, int cantBilletes, String fecha) {
		
		System.out.println("\t\tEL METRO");
		System.out.println("\t\tCP 41001");
		System.out.printf(fecha+"\t");
		System.out.println("------------------------------");
		
		System.out.println("Nº Tickets\tP.U");
		System.out.println(cantBilletes+"\t\t"+precioTicket);
		
		System.out.println("------------------------------");
		System.out.println("TOTAL: €"+precioTot);
		System.out.println("Devolución: €"+cambio);
	}
	
	
	
}
