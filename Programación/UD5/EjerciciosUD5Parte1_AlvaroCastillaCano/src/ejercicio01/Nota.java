package ejercicio01;

public class Nota {

	private int id;
	private String titulo;
	private String cuerpo;
	
	public Nota(int id, String titulo, String cuerpo) {
		this.id = id;
		this.titulo = titulo;
		this.cuerpo = cuerpo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	@Override
	public String toString() {
		return "Nota [id=" + id + ", titulo=" + titulo + ", cuerpo=" + cuerpo + "]";
	}
	
	
	

}
