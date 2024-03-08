package ejercicio;

import java.util.List;

public class CrudCliente {

	private List<Cliente> lista;

	public CrudCliente(List<Cliente> lista) {
		super();
		this.lista = lista;
	}

	public List<Cliente> getLista() {
		return lista;
	}

	public void setListaVips(List<Cliente> lista) {
		this.lista = lista;
	}

	public void agregarCliente(Cliente c) {
		lista.add(c);
	}

	public Cliente buscarPorDni(String dni) {
		for (Cliente c : lista) {
			if (c.getDni().equalsIgnoreCase(dni)) {
				return c;
			}
		}
		return null;
	}

	public void eliminarCliente(String dni) {
		if (!lista.isEmpty()) {
			lista.remove(buscarPorDni(dni));
		}
	}

	public void mostrarCliente(String dni) {
		System.out.println(buscarPorDni(dni));
	}

	public void mostrarListaClientes() {
		lista.forEach(System.out::println);
		/* Recorre toda la lista imprimiendo cada cliente */
	}

	public void mostrarListaVips() {
		// Es un poco rollo pero para mostrar la lista con lambda
		lista.forEach( /* Es el atributo de Consumer */c -> {
			if (lista.get(lista.indexOf(c)) instanceof ClienteVip) {
				System.out.println(lista.get(lista.indexOf(c)));
			}
		});
	}
}
