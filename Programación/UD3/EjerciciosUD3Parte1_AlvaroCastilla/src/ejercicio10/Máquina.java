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
	
	
	
	
	
}
