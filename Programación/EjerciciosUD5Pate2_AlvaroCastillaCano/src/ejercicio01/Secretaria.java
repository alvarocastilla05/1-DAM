package ejercicio01;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class Secretaria {

	//Atributos
	private List<Alumno> lista;

	//Constructores
	public Secretaria(List<Alumno> lista) {
		this.lista = lista;
	}

	//Getters and Setters
	public List<Alumno> getLista() {
		return lista;
	}

	public void setLista(List<Alumno> lista) {
		this.lista = lista;
	}

	//toString
	@Override
	public String toString() {
		return "Secretaria [lista=" + lista + "]";
	}
	
	//Metodos
	
	public List<Alumno> obtenerAlumnos(String curso) {
		
		return lista.stream().filter(a -> a.getNombre().equalsIgnoreCase(curso)).toList();
	}
	
	public void mostrarLista() {
		lista.stream().forEach((Consumer <? super Alumno>) new Consumer<Alumno>(){

			@Override
			public void accept(Alumno a) {
				System.out.println(a);
				
			}
			
		});
	}
	public List<Alumno> filtrarPorLetra(String letra){
		return lista.stream().filter(a -> a.getNombre().startsWith(letra)).toList();
	}
	
	public long darTamanio() {
		return lista.stream().count();
	}
	
	public List<Alumno> mostrarNotaMediaAlta(String nombreCurso){
		int nueve = 9;
		return lista.stream().filter(a -> a.getNotaMedia()>=nueve && a.getNombreCurso().equalsIgnoreCase(nombreCurso)).toList();
	}
	
	public void mostrarTresPrimeros() {
		lista.stream().limit(3).forEach((Consumer<? super Alumno>) new Consumer<Alumno>() {

			@Override
			public void accept(Alumno a) {
				System.out.println(a);
				
			}
			
		});
	}
	
	//Este metodo esta incompleto.
	public List<Alumno> buscarMenorEdad(){
		return lista.stream().filter(a -> a.getEdad()<a.getEdad()).toList();
	}
	
	public Alumno obtenerPrimerAlumno() {
		return lista.stream().findFirst().get();
	}
	
	public List<Alumno> obtenerNombre10(){
		return lista.stream().filter(a -> a.getNombre().length()>10).toList();
	}
	
	public List<Alumno> mostrarNombreConCondiciones(){
		return lista.stream().filter(a -> a.getNombre().startsWith("A") && a.getNombre().length()<=6).toList();
	}
	
	
	
	
}
