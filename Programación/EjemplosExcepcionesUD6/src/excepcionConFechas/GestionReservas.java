package excepcionConFechas;

import java.time.LocalDate;

public class GestionReservas {

	public void hacerReserva(LocalDate fecha) throws Exception{
		if(fecha.isAfter(LocalDate.now())) {
			throw new MiExcepcion("Fecha no disponible, pruebe otra fecha");
		}
		System.out.println("La reserva se realizó correctamente");
	}
}
