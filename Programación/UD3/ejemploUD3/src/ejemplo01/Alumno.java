package ejemplo01;

public class Alumno {
	
	//Atributos. Nunca se les pone valor inicial a las variables de los atributos.
	//Siemrpe poner la palabra PRIVATE en los atributos.
	
	private String nombre;
	 int edad;
	private double notaMedia;
	
	
	//Constructores.(Para crear un objeto con valores)
	//Lo que va dentro del parentesis se le llama parametro o argumento.
	
	
	public Alumno (String nombre, int edad, double notaMedia) {
		this.nombre=nombre;
		this.edad=edad;
		this.notaMedia=notaMedia;
		
	}
	
	public Alumno (String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public Alumno () {
		
	}
	
	
	//Métodos.
	
	//Primer método propio para imprimir en bonito.
	//Dentro del paréntesis van los parámetros que se necesitan. Dentro de las llaves va el cuerpo.
	//Los métodos de imprimir siempre son void.
	
	public void mostrarDatos (String calle) {
		//Cuerpo
		
		System.out.println("Los datos del alumno son: ");
		System.out.println("Nombre: "+ nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Nota media: "+notaMedia);
		System.out.println("Calle: "+calle);
	}
	
	
	
}
