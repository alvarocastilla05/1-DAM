package principal;

import crud.CrudProducto;
import gestion.GestionProductos;
import model.Producto;
import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre, codigo;
		double precioU, precioNuevo;
		int contadorP = 0;
		int opcion = 0;
		int tam, tope;
		int cantidad, op;
		double descuento;
		CrudProducto crud;
		Producto[] listaCrud;
		GestionProductos gp;

		System.out.println("Diga cuántos productos habrá");
		tam = Leer.datoInt();
		listaCrud = new Producto[tam];

		// En la clase CrudProducto debemos tener un constructor con este parámetro
		crud = new CrudProducto(listaCrud);

		do {
			imprimirMenu();
			opcion = Leer.datoInt();

			switch (opcion) {

			case 0:
				break;
			case 1:

				crud.imprimirTodosLosProductos();

				break;
			case 2:
				System.out.println("Diga código del producto");
				codigo = Leer.dato();
				System.out.println("Diga el nombre del producto");
				nombre = Leer.dato();
				System.out.println("Diga el precio de una unidad");
				precioU = Leer.datoDouble();
				crud.add(new Producto(codigo, nombre, precioU, true), contadorP);
				contadorP++;
				break;
			case 3:
				System.out.println("Indique el código del producto a modificar:");
				crud.imprimirSoloActivos();
				nombre = Leer.dato();
				System.out.println("Indique el nuevo precio");
				precioNuevo = Leer.datoDouble();
				crud.editPrecio(nombre, precioNuevo);

				break;
			case 4:
				System.out.println("Diga el código del producto que desea borrar");
				codigo = Leer.dato();
				crud.delete(crud.findById(codigo));

				break;

			case 5:

				crud.imprimirSoloActivos();
				break;
				
			case 6:
				System.out.println("Diga cuántos productos lleva");
				cantidad=Leer.datoInt();
				System.out.println("Diga descuento");
				descuento=Leer.datoDouble();
				System.out.println("Diga con cuántos productos se aplicará el descuento");
				tope=Leer.datoInt();
				System.out.println("De qué producto quiere saber el precio");
				crud.imprimirTodosLosProductos();
				op=Leer.datoInt()-1;
				gp=new GestionProductos(listaCrud[op]);
				System.out.printf("El precio es: %.2f euros",gp.calcularConDescuento(descuento, cantidad, tope));
				

			}

		} while (opcion != 0);

	}

	/*
	 * Método estático dentro la principal que nos ayuda a mostrar el menú sin tener
	 * que crear un objeto ni de importar una clase como en el ejemplo de Leer.
	 * Hablaremos de ellos más adelante
	 */

	private static void imprimirMenu() {
		System.out.println("\n\n");
		System.out.println("************************************");
		System.out.println("(1) Listar todos los productos");
		System.out.println("(2) Añadir un nuevo producto");
		System.out.println("(3) Modificar precio de un producto");
		System.out.println("(4) Eliminar un producto");
		System.out.println("(5) Lista solo productos activos");
		System.out.println("(6) Calcular precio");
		System.out.println("(0) Salir");
		System.out.println("************************************");

	}

}
