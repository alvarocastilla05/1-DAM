package ejercicio02;

public class Club {
	
	//Aquí debemos de hacer los métodos que no sean CRUD.
	
	private String nombre;
	private CRUDSocio cr;
	
	public Club(String nombre, CRUDSocio cr) {
		this.nombre = nombre;
		this.cr = cr;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CRUDSocio getCr() {
		return cr;
	}

	public void setCr(CRUDSocio cr) {
		this.cr = cr;
	}

	@Override
	public String toString() {
		return "Club [nombre=" + nombre + ", cr=" + cr + "]";
	}
	
	public void mostrarLista() {
		for (Socio s : cr.getLista()) {
			System.out.println(s);
		}
	}
	

}
