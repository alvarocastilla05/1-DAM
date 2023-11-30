package ejercicio02;

import java.util.Arrays;

public class Hotel {

	private Habitacion [] lista;
	private String nombreHotel;
	
	
	public Hotel(Habitacion[] lista, String nombreHotel) {
		this.lista = lista;
		this.nombreHotel = nombreHotel;
	}


	public Habitacion[] getLista() {
		return lista;
	}


	public void setLista(Habitacion[] lista) {
		this.lista = lista;
	}


	public String getNombreHotel() {
		return nombreHotel;
	}


	public void setNombreHotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}


	@Override
	public String toString() {
		return "Hotel [lista=" + Arrays.toString(lista) + ", nombreHotel=" + nombreHotel + "]";
	}
	
	/*public void add(Habitacion h, int pos) {
		lista[pos]=h;
	}*/
	
	
	public void mostrarHab(Habitacion [] lista, int contH, int pos) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println((i+1)+". "+lista[i]);
		}
		
	}
	
	public void comprobarOcupacion(boolean ocupado, Habitacion [] lista) {
		for (int i = 0; i < lista.length; i++) {
			if(ocupado==true) {
				System.out.println(lista[i]);
			}
		}
	}
		
		 public double calcularPrecioFinal(int dias, double precio) {
		        
		        return dias* precio;
		    }
		public void listarHabitaciones() {
			for (int i = 0; i < lista.length; i++) {
				System.out.println(lista[i]);
			}
			System.out.println("");
		}
		
		public void mostrarMenuServicios() {
			System.out.println("----------");
		}
		
		public void add(Habitacion h, int pos) {
			lista[pos]=h;
			pos++;
		}
		
		public void findById(int id) {
			boolean encontrado = false;
			int i = 0;
			
			while(i < lista.length && !encontrado) {
				Habitacion deLista = lista[i];
				
				if(deLista.getId()==id) {
					encontrado = true;
				}else {
					i++;
				}
			}
		}
		
		public boolean comprobarOcupado(Habitacion h) {
			boolean result;
			
			if(h.isOcupada()) {
				
				result = true;
			}else {
				result = false;
			}
			return result;
		}
		
		public void imprimirOcupado(Habitacion h) {
			if(h.isOcupada()) {
				System.out.println("La habitación está ocupada.");
			}else {
				System.out.println("La habitación está libre.");
			}
		}
		
		public double calcularPrecioHab(Habitacion h, double precioTotal, double precioExtras) {
			double total=0;
			
			total = (h.getPrecio() + precioExtras) * h.getDias();
			
			return total;
		}
	
}
