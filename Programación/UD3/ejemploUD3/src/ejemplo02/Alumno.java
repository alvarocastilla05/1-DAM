package ejemplo02;

public class Alumno {
	
	//Atributos.
	
	private String nombre;
	private double notaPro;
	private double notaBD;
	
	//Constructores.
	
	public Alumno (String nombre, double notaPro, double notaBD) {
		this.nombre=nombre;
		this.notaPro=notaPro;
		this.notaBD=notaBD;
	}
	
	//Metodos
	//Solo se pone return cuando el public no es void.
	
	//Se puede crear variables dentro del metodos sin¡ son para calculos pequeños.
	
	public double calcularMedia () {
		double suma, media;
		double dos=2;
		suma=notaPro+notaBD;
		media=suma/dos;
	
		return media;
	}
	
	public void mostrarMedia (double media) {
		System.out.printf("La nota media de %s es: %.2f", nombre, media);
	}

}
