package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	/*
	 * Como ejemplo para utilizar las lambdas vamos a utilizar la gestion de una
	 * discoteca, donde hay una clase "Gestion" que tiene una lista de clientes a
	 * modo de "Registro de ventas".
	 * 
	 * Hay una clase "Cliente", que se caracteriza por su nombre, dni, edad y las
	 * botellas que ha pedido durante la noche. Esta tiene una clase hija
	 * "ClienteVip", que dispone de un cierto numero de invitaciones para
	 * acompañantes. Los cliente tienen un método para comprar botellas, las cuales
	 * tendrán un precio fijo y a los vips, a partir de la 4ta botella se le
	 * aplicará un descuento del 20% a toda la compra
	 * 
	 * Incluir métodos para poder agregar y eliminar clientes a la lista, poder ver
	 * uno o todos los clientes y clientes vips a eleccion y saber cuanto ha gastado
	 * cada cliente. Por último un método para poder saber las ganancias del dia,
	 * sumando todo lo gastado por los clientes
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux, nombre, dni;
		int opcion, opcion2, edad, cantBotellas, numInvitaciones, topeBotellas;
		double precioBotella, porcenDescuento;

		List<Cliente> lista = new ArrayList();
		CrudCliente cC;
		Gestion ges;

		Cliente c1, c2, c3, cAux;
		// 3 clientes a modo de prueba
		c1 = new ClienteVip("Pedro", "123e", 20, 3, 4);
		c2 = new Cliente("Antonio", "123d", 20, 3);
		c3 = new ClienteVip("Alejandro", "123f", 20, 3, 4);
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);

		cC = new CrudCliente(lista);
		ges = new Gestion(cC);

		System.out.println("Introduzca el precio de cada botella");
		aux = sc.nextLine();
		precioBotella = Double.parseDouble(aux);

		System.out.println("Introduzca las invitaciones de los clientes vips");
		aux = sc.nextLine();
		numInvitaciones = Integer.parseInt(aux);
		System.out.println("Introduzca el porcentaje de descuento a los vips");
		aux = sc.nextLine();
		porcenDescuento = Double.parseDouble(aux);
		System.out.println("Introduzca a partir de cuantas botellas se hace el descuento");
		aux = sc.nextLine();
		topeBotellas = Integer.parseInt(aux);
		do {
			System.out.println("""
					0. Salir
					1. Añadir un cliente.
					2. Borrar un contacto.
					3. Mostrar un cliente.
					4. Mostrar toda la lista de clientes.
					5. Mostrar lista de clientes vips.
					6. Sumar una botella comprada a un cliente.
					7. Calcular los gastos de un cliente.
					8. Calcular las ganancias totales.\n\n
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			switch (opcion) {
			case 0:
				System.out.println("Gracias por usar nuestro programa.");
				break;
			case 1:
				System.out.println("Introduzca el nombre del cliente:");
				nombre = sc.nextLine();
				System.out.println("Introduzca el dni del cliente:");
				dni = sc.nextLine();
				System.out.println("Introduzca la cantidad de botellas inicial:");
				aux = sc.nextLine();
				cantBotellas = Integer.parseInt(aux);
				System.out.println("Introduzca la edad:");
				aux = sc.nextLine();
				edad = Integer.parseInt(aux);
				System.out.println("""
						0. Salir
						1. Cliente normal.
						2. Cliente vip.
						""");
				aux = sc.nextLine();
				opcion2 = Integer.parseInt(aux);
				switch (opcion2) {
				case 0:
					System.out.println("Gracias por usar nuestro programa.");
					break;
				case 1:
					cAux = new Cliente(nombre, dni, edad, cantBotellas);
					cC.agregarCliente(cAux);
					break;
				case 2:
					cAux = new ClienteVip(nombre, dni, edad, cantBotellas, numInvitaciones);
					cC.agregarCliente(cAux);
					break;
				default:
					System.out.println("Opción no válida.");
					break;
				}
				break;
			case 2:
				System.out.println("Introduzca el dni del cliente: ");
				dni = sc.nextLine();
				cC.eliminarCliente(dni);
				break;
			case 3:
				System.out.println("Introduzca el dni del cliente: ");
				dni = sc.nextLine();
				cC.mostrarCliente(dni);
				break;
			case 4:
				cC.mostrarListaClientes();
				break;
			case 5:
				cC.mostrarListaVips();
				break;
			case 6:
				System.out.println("Introduzca el dni del cliente: ");
				dni = sc.nextLine();
				ges.sumarBotella(dni);
				break;
			case 7:
				System.out.println("Introduzca el dni del cliente: ");
				dni = sc.nextLine();
				System.out.printf("El cliente ha gastado %.2f€\n",
						ges.gastoscliente(cC.buscarPorDni(dni), topeBotellas, precioBotella, porcenDescuento));
				break;
			case 8:
				System.out.printf("El total recaudado es de %.2f€\n",
						ges.calcularGanancias(topeBotellas, precioBotella, porcenDescuento));
				break;
			default:
				System.out.println("Opción no válida.\n");
				break;
			}
		} while (opcion != 0);
	}

}