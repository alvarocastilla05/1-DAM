package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int uno=1, dos=2, tres=3;
		int tam=10;
		String aux;
		int op;
		String nombre = null;
		String apellidos = null;
		int num = 0;
		int categoria = 0;
		double tiempo = 0;
		double km = 20;
		Corredor []lista = new Corredor [tam];
		int pos;
		
		lista[0]=new Corredor("Alvaro", "Castilla", 5, 2, 5.5);
		lista[1]=new Corredor("Eusebio", "Castilla", 8, 1, 7.5);
		lista[2]=new Corredor("Manolo", "Castilla", 10, 3, 10.5);
		
		Corredor c=new Corredor(nombre, apellidos, num, categoria, tiempo);
		
		Carrera ca=new Carrera(lista, km);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido al programa de gestión de carreras.");
		System.out.println(" ");
		
		do {
			System.out.println("-------------------------");
			System.out.println("0-Salir.");
			System.out.println("1-Agregar corredor.");
			System.out.println("2-Calcular tiempo en segundos.");
			System.out.println("3-Buscar corredores veteranos.");
			System.out.println("4-Modificar tiempo.");
			System.out.println("5-Calcular tiempo medio por km.");
			System.out.println("6-Tiempo total de corredores juveniles.");
			System.out.println("7-Busca el corredor que menos ha tardado de todos.");
			System.out.println("-------------------------");

			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			
			switch(op) {
			
				case 1:
					System.out.println("Indique en que posición desea añadir al nuevo corredor:");
					aux=sc.nextLine();
					pos=Integer.parseInt(aux);
					
					System.out.println("Nombre:");
					nombre=sc.nextLine();
					
					System.out.println("Apellidos");
					apellidos=sc.nextLine();
					
					System.out.println("Número del corredor:");
					aux=sc.nextLine();
					num=Integer.parseInt(aux);
					
					System.out.println("Introduzca 1(juvenil), 2(senior) o 3(veterano)");
					aux=sc.nextLine();
					categoria=Integer.parseInt(aux);
					
					System.out.println("Introduzca el tiempo tardado:");
					aux=sc.nextLine();
					tiempo=Double.parseDouble(aux);
					
					ca.add(new Corredor(nombre, apellidos, num, categoria, tiempo), pos);
					
					ca.mostrarLista();
					break;
				case 2:
					ca.calcularSeg(tiempo);
					
					break;
				case 3:
					System.out.println("Indique que categoría busca:");
					aux=sc.nextLine();
					categoria=Integer.parseInt(aux);
					
					ca.mostraFind(ca.findByCategoria(c, categoria));
					break;
					
				case 4:
					System.out.println("Indique el número del corredor: ");
					aux=sc.nextLine();
					num=Integer.parseInt(aux);
					
					ca.findByNum(c, num);
					
					break;
				
				case 5:
					System.out.println("Indique el número del corredor: ");
					aux=sc.nextLine();
					num=Integer.parseInt(aux);
					
					ca.findByNum(c, num);
					
					ca.mostrarMedia(ca.calcularMediaMinKm(c, km));
					
					break;
					
				case 6:
					ca.mostrarTiempo(ca.calcularTiJuv(lista, tiempo, categoria));
					break;
				
				case 0:
					System.out.println("Gracias por utilizar este programa.");
					break;
				default:
					System.out.println("Opción no válida");
					break;
					
			}
		}while(op!=0);
	}

}
