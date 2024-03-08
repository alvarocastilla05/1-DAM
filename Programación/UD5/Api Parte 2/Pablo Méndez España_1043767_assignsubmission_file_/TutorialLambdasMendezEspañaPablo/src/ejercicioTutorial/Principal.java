package ejercicioTutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import utilidades.Leer;

/*
 *  En este ejercicio nos encontramos haciendo un programa que realice ciertas operaciones respectivas a un parking.
	El parking albergará Coches y Motos, siendo estas clases POJO que herenda de la clase abstracta Vehiculo.
	La clase vehiculo estará caracterizada por la matricula y los kilometros recorridos(este atributo no estará en el
	 constructor).
	En cuanto a los coches tendrán de caracteristica individual un boleano que será true si el coche tiene antinieblas delanteras,
	 en el caso de las motos será la cilindrada
	Además necesitaremos la propia clase Parking donde estarán los métodos CRUD.
	Por supuesto necesitamos una clase Principal donde probar.
	Se pide:
	1) Crear una interfaz funcional llamada IBienvenida, que contendrá un método para mostrar un mensaje de bienvenida
	   que será leido por teclado y se mostrará al principio del menú siempre, 
	   todo esto aplicando la sintaxis de una función Lambda.
	2) Añadir vehiculos
	3) Haciendo uso de la sintaxis de Lambda y la interfaz Supplier queremos añadir a todos los vehiculos un numero de kilometros
	   recorridos a partir de un double random.
	4) Ahora queremos mostrar todas las matriculas de la lista usando Lambdas y la interfaz Consummer.
	5) Ahora vamos a pasar los kilometros recorridos de todos los coches a metros, multiplicando todos por 1000, haciendo uso
	   de lambdas y la interfaz Function. Usando el método andThen lo multiplicaremos por 100 para pasarlo a centimetros.
	6) Usa la interfaz BiFunction para multiplicar la cilindrada de las motos por el numero de kilimetros recorridos.
	
	Puedes añadir una opción al menú para mostrar la lista e ir comprobando lo que se va haciendo.
 */

public class Principal {

	public static void main(String[] args) {
		
		int opcion, opcion2, intAntiniebla, cilindrada;
		String mensaje, matricula;
		boolean antiniebla;
		double kmRecorridos;
		
		List <Vehiculo> lista = new ArrayList <Vehiculo>();
		
		Parking park = new Parking(lista);
		
		System.out.println("Indique un mensaje de bienvenida:");
		mensaje = Leer.dato();
		
		IBienvenida bienvenida = (x) -> System.out.println(x);
		
		do {
			bienvenida.mostrarBienvenida(mensaje);
			System.out.println("""
					1. Añadir vehiculo
					2. Poner kilometros recorridos
					3. Mostrar matriculas
					4. Pasar km a metros y a centimetros
					5. Multiplicar cilindrada por kilometros
					6. Mostrar lista
					0. Salir
					""");
			
			opcion = Leer.datoInt();
			
			switch(opcion) {
			
				case 1:
					System.out.println("""
							
							1. Añadir coche
							2. Añadir moto
							""");
					opcion2 = Leer.datoInt();
					
					switch(opcion2) {
					
						case 1:
							System.out.println("Introduzca matricula:");
							matricula = Leer.dato();
							System.out.println("Pulse 1 si tiene antiniebla delantero, pulse otro numero si no:");
							intAntiniebla = Leer.datoInt();
							if(intAntiniebla == 1) {
								antiniebla = true;
							} else {
								antiniebla = false;
							}
							park.addVehiculo(new Coche(matricula, antiniebla));
							break;
							
						case 2:
							System.out.println("Introduzca matricula:");
							matricula = Leer.dato();
							System.out.println("indique cilidranda:");
							cilindrada = Leer.datoInt();
							park.addVehiculo(new Moto(matricula, cilindrada));
							break;
							
						default:
							System.out.println("Opción no válida");
							break;
					}
					break;
					
				case 2:
					Supplier <Double> kmR = () -> Math.random();
					for(Vehiculo v : lista) {
						kmRecorridos = kmR.get();
						v.setKmRecorridos(kmRecorridos);
					}
					break;
					
				case 3:
					Consumer<String> mostrarMatricula = (m) -> System.out.println(m);
					for(Vehiculo v : lista) {
						mostrarMatricula.accept(v.getMatricula());
					}
					break;
					
				case 4:
					Function<Double, Double> aMetros = (km) -> km*1000;
					Function<Double, Double> aCm = (mt) -> mt*100;
					for(Vehiculo v : lista) {
						System.out.println(aMetros.apply(v.getKmRecorridos()));
					}
					for(Vehiculo v : lista) {
						System.out.println(aMetros.andThen(aCm).apply(v.getKmRecorridos()));
					}
					break;
					
				case 5:
					BiFunction<Integer, Double, Double> multiplicacion = (cl, kmr) -> cl*kmr;
					for(Vehiculo v : lista) {
						if(v instanceof Moto) {
							System.out.println(multiplicacion.apply(((Moto) v).getCilindrada(), v.getKmRecorridos()));
						}
					}
					break;
					
				case 6:
					park.mostrarLista();
					break;
				
				case 0:
					System.out.println("Saliendo...");
					break;
					
				default:
					System.out.println("Opción no válida, escoja de nuevo:");
					break;
			}
		} while(opcion != 0);
		System.out.println("Gracias por usar el programa.");
	}

}
