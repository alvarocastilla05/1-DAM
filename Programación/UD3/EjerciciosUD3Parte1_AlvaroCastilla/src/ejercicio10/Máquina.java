package ejercicio10;

public class Máquina {
	
	private Ticket ticket;
	
	private String contrasenia;

	public Máquina(Ticket ticket, String contrasenia) {
		this.ticket = ticket;
		this.contrasenia = contrasenia;
	}

	
	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}


	@Override
	public String toString() {
		return "Máquina [ticket=" + ticket + ", contrasenia=" + contrasenia + "]";
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
	
	public double calcularSaldoTotal (int cantBilletes, int precioTicket) {
		double saldoTotal;
		saldoTotal = calcularPrecio(precioTicket, cantBilletes);
		return saldoTotal;
	}
	
	public void cambiarPrecio(double precioN) {
		ticket.setPrecioTicket(precioN);
	}
	
	
	
	
}
