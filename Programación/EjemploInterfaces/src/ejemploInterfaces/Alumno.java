package ejemploInterfaces;

public class Alumno extends Persona implements IPresa {

	private double notaMedia;
	
	public Alumno(String nombre, int edad, double notaMedia) {
		super(nombre, edad);
		this.notaMedia = notaMedia;
	}
	
	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno [notaMedia=" + notaMedia + "]";
	}

	@Override
	public void huir() {
		// TODO Auto-generated method stub
		System.out.println("COSORROOOOO QUE VIENE LUISMIIII");
		
	}

}
