package ejemploMap;

public class Alumno {

	private String nombre;
	private int id;
	private double notaMedia;
	
	public Alumno( int id, String nombre, double notaMedia) {
		this.nombre = nombre;
		this.id = id;
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", id=" + id + ", notaMedia=" + notaMedia + "]";
	}
	
	
	
	
	
	
	
	
	
}
