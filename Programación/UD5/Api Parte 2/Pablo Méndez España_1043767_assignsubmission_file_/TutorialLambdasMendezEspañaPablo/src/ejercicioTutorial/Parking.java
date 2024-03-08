package ejercicioTutorial;

import java.util.ArrayList;
import java.util.List;

public class Parking {

	//Atributos
	private List <Vehiculo> lista = new ArrayList <Vehiculo>();

	//Constructor
	public Parking(List<Vehiculo> lista) {
		super();
		this.lista = lista;
	}

	//Getters and Setters
	public List<Vehiculo> getLista() {
		return lista;
	}

	public void setLista(List<Vehiculo> lista) {
		this.lista = lista;
	}

	//To String
	@Override
	public String toString() {
		return "Parking [lista=" + lista + "]";
	}
	
	//Métodos CRUD(Solo he añadido los necesarios que se van a usar en este programa)
	public void addVehiculo(Vehiculo v) {
		lista.add(v);
	}
	
	public void mostrarLista() {
		for(Vehiculo v : lista) {
			System.out.println(v);
			System.out.println("Matricula: "+v.getMatricula());
			System.out.println("Km Recorridos: "+v.getKmRecorridos());
		}
	}
	
}
