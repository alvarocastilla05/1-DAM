package excepcionConFechas;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String aux, fecha;
		boolean salir = false;
		Scanner sc = new Scanner(System.in);
		
		LocalDate fechaReserva = LocalDate.now();
		GestionReservas g = new GestionReservas();
		
		do {
			try {
				System.out.println("Introduzca una fecha de reserva: ");
				fecha=sc.nextLine();
				
				fechaReserva = LocalDate.parse(fecha);
				
				g.hacerReserva(fechaReserva);
				salir = false;
			}catch(MiExcepcion e) {
				System.err.println(e.getMessage());
				salir = true;
			}catch(Exception e) {
				System.err.println("Error inesperado");
				salir = true;
			}
		}while(salir);
		
		sc.close();
		
		

	}

}
