package ejercicio;

import java.util.function.Predicate;

public class Gestion {

	private CrudCliente listaClientes;

	public Gestion(CrudCliente listaClientes) {
		super();
		this.listaClientes = listaClientes;
	}

	public void sumarBotella(String dni) {
		Predicate<Cliente> menor = (Cliente c) -> c.getEdad() >= 18;
		if (menor.test(listaClientes.buscarPorDni(dni))) {
			listaClientes.buscarPorDni(dni)
					.setCantidadBotellas(listaClientes.buscarPorDni(dni).getCantidadBotellas() + 1);
		}
	}

	public double gastoscliente(Cliente c, int topeBotellas, double precioBotella, double descuento) {
		int cien = 100;
		double total = 0.0;
		if (c instanceof ClienteVip) {
			if (c.getCantidadBotellas() >= topeBotellas) {
				total += c.getCantidadBotellas() * precioBotella
						- (c.getCantidadBotellas() * precioBotella * descuento / cien);
			}
		} else {
			total += c.getCantidadBotellas() * precioBotella;
		}
		return total;
	}

	public double calcularGanancias(int topeBotellas, double precioBotella, double descuento) {
		double total = 0.0;
		for (Cliente c : listaClientes.getLista()) {
			total += gastoscliente(c, topeBotellas, precioBotella, descuento);
		}
		return total;
	}
}

