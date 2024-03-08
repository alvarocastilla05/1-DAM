package ejercicio;

public class ClienteVip extends Cliente {

	private int numInvitaciones;

	public ClienteVip(String nombre, String dni, int edad, int cantidadBotellas, int numInvitaciones) {
		super(nombre, dni, edad, cantidadBotellas);
		this.numInvitaciones = numInvitaciones;
	}

	public int getNumInvitaciones() {
		return numInvitaciones;
	}

	public void setNumInvitaciones(int numInvitaciones) {
		this.numInvitaciones = numInvitaciones;
	}

	@Override
	public String toString() {
		return "ClienteVip [numInvitaciones=" + numInvitaciones + ", getNombre()=" + getNombre() + ", getDni()="
				+ getDni() + ", getEdad()=" + getEdad() + ", getCantidadBotellas()=" + getCantidadBotellas() + "]";
	}

}
