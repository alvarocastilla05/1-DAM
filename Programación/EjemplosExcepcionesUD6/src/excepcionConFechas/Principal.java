package excepcionConFechas;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String aux, fecha;
		Scanner sc = new Scanner(System.in);
		
		
		LocalDate hoy = LocalDate.now();
		
		
		try {
			System.out.println("Introduzca una fecha de reserva: ");
			fecha=sc.nextLine();
			
			LocalDate fechaReserva = LocalDate.parse(fecha);
			
		}catch(MiExcepcion e) {
			System.err.println(e.getMessage());
		}catch(Exception e) {
			System.err.println("Error inesperado");
		}
		
		

	}

}
