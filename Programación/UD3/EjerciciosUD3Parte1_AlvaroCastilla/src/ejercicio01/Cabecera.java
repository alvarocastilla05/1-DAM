package ejercicio01;

public class Cabecera {
	private String nombre;
	private String aula;
	private String fecha;
	
	public Cabecera(String nombre, String aula, String fecha) {
		
		this.nombre = nombre;
		this.aula = aula;
		this.fecha = fecha;
	}
	
	public void mostrarDatos () {
		//Cuerpo
		
		System.out.println("Nombre: "+ nombre);
		System.out.println("Clase: "+aula);
		System.out.println("Fecha: "+fecha);
		
	}
	
	

}
