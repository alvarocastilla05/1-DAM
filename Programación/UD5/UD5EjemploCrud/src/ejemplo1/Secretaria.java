package ejemplo1;

import java.util.ArrayList;
import java.util.List;

public class Secretaria {

	private List<Alumno> listAlumnos;

	public Secretaria(List<Alumno> listAlumno) {
		super();
		this.listAlumnos = listAlumno;
	}
	//Otro posible constructor, pero ojo, solo se pone aquí por 
	//motivos académicos, para evitar algún nullPointer por si 
	//creamos una secretaría vacía e intentamos acceder al atributo
	
	public Secretaria () {
		
		listAlumnos=new ArrayList <Alumno>();
	}

	public List<Alumno> getListAlumnos() {
		return listAlumnos;
	}

	public void setListAlumnos(List<Alumno> listAlumno) {
		this.listAlumnos = listAlumno;
	}

	@Override
	public String toString() {
		return "Secretaría [listAlumno=" + listAlumnos + "]";
	}

	//Los métodos están hechos, por comodidad, 
	//sin comprobar si la lista está vacía, 
	//aspecto que deberíamos hacer como buena práctica
	
	public void agregarAlum(Alumno alum) {
		listAlumnos.add(alum);
	}

	//Otra versión de agregar devolviendo un boolean. 
	//Al final está el método mostrar error al agregar
	
	public boolean agregar2 (Alumno al) {
		
		return listAlumnos.add(al);
	}
	
	//Hecho con for por ver otra forma diferente al usando while
	public int buscarAlum(String dni) {
		int temp = -1;
		boolean salir = false;

		for (int i = 0; i < listAlumnos.size() && !salir; i++) {
			if (listAlumnos.get(i).getDni().equalsIgnoreCase(dni)) {
				temp = i;
				salir = true;
			}
		}
		return temp;
	}

	public void modificarAlumno(String dni, String nombreNuevo) {
		
		int index = buscarAlum(dni);

		if (index >= 0) {
					
			listAlumnos.get(index).setNombre(nombreNuevo);
		}
	}
	
	//Devuelve el alumno buscado si lo encuentra o null si no es así
	
	public Alumno buscarAlum2(String dni) {
		Alumno tem=null;
		boolean salir = false;

		for (int i = 0; i < listAlumnos.size() && !salir; i++) {
			if (listAlumnos.get(i).getDni().equalsIgnoreCase(dni)) {
				tem = listAlumnos.get(i);
				salir = true;
			}
		}
		return tem;
	}
	
	//Imprimir usando for each	
	public void imprimirLista() {
		for (Alumno alumno : listAlumnos) {
			System.out.println(alumno);
		}
	}
	
	public void borrarAlumno(String dni) {
		int index = buscarAlum(dni);
		if (index >= 0) {
			listAlumnos.remove(index);
		}
	}
	
	//Este método estaría en una clase vista
	public void mostrarErrorAgregar (boolean b) {
		if (b){
			System.out.println("Se ha agregado el alumno correctamente");
		}else {
			System.out.println("Error al insertar");
		}				
	}
	
}
