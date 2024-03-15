package ejercicio03;

public class CentroEducativo {

	private String nombre;
	private CrudAlumno cr;
	
	public CentroEducativo(String nombre, CrudAlumno cr) {
		this.nombre = nombre;
		this.cr = cr;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CrudAlumno getCr() {
		return cr;
	}

	public void setCr(CrudAlumno cr) {
		this.cr = cr;
	}

	@Override
	public String toString() {
		return "CentroEducativo [nombre=" + nombre + ", cr=" + cr + "]";
	}
	/*
	public void mostrarLista() {
		for (Alumno a : cr.getLista()) {
			System.out.println(a);
		}
		
	}*/
	
	
	
}
