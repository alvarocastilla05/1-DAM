package ejercicio11;

import java.util.Arrays;

public class Alumno {

	private String nombre;
	private String curso;
	private int numSuspensos;
	private double media;
	private double [] notas;
	
	
	public Alumno(String nombre, String curso, int numSuspensos, double media, double[] notas) {
		this.nombre = nombre;
		this.curso = curso;
		this.numSuspensos = numSuspensos;
		this.media = media;
		this.notas = notas;
	}


	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public int getNumSuspensos() {
		return numSuspensos;
	}


	public void setNumSuspensos(int numSuspensos) {
		this.numSuspensos = numSuspensos;
	}


	public double getMedia() {
		return media;
	}


	public void setMedia(double media) {
		this.media = media;
	}


	public double[] getNotas() {
		return notas;
	}


	public void setNotas(double[] notas) {
		this.notas = notas;
	}



	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", curso=" + curso + ", numSuspensos=" + numSuspensos + ", media=" + media
				+ ", notas=" + Arrays.toString(notas) + "]";
	}
	
	
	
	
	
}
