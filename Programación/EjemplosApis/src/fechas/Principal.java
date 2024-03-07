package fechas;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate hoy = LocalDate.now();
		LocalDate f1 = LocalDate.of(2005, 11, 06); //Pone la fecha que indiquemos
		LocalDate f2 = LocalDate.parse("2024-11-20"); //Pasa un String a fecha(Año, mes, dia)
		
		System.out.println(hoy);
		System.out.println(f1);
		System.out.println(f2);
		
		System.out.println(f2.plusDays(2)); //Como sumar dias, si queremos sumar otra cosa,debemos de poner 
											//lo que queremos sumar.
	}

}
