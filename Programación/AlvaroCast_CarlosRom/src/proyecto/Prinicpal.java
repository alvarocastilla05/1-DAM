package proyecto;

import java.util.Random;

import utilidades.Leer;

public class Prinicpal {

	public static void main(String[] args) {

		int desde = 0, hasta = 10;
		int fil = 3;
		int col = 4;
		int tres=3;
		int[][] golesEq;
		golesEq = new int[fil][col];
		int tam = 4;
		int tam2=3;
		int op, op2;
		int maxGol = 0, minGol = 0;
		int golesTot = 0;
		double mediaGol = 0;
		int[] golTotJ = new int[tam2];
		double mediaGolJ=0.0;
		String[] equipos = new String[tam];
		Random rdm = new Random(System.nanoTime());

		// Dia 1 -->Planteamiento de proyecto.
		//Dia 2 --> Reparto de tareas y asignación nombre de variables.
		//Dia 3 --> Álvaro: creación de menú y menú anidado, y asignación num equip y nomEq. Carlos: creación de variables y creación de caso 1 e intento de caso 2. Entre los dos, planteamos como realizar los demas casos.
		//Dia 4 --> Álvaro: case 2 y 3 y case 0 y default. Entre los dos case 6.Carlos: case 4 y 5  
		
		System.out.println("Bienvenido, en el siguiente programa podemos generar de forma aleatoria los goles marcados por cada equipo en cada jornada. ");
		System.out.println("Además podremos ver cuándo se marcó más goles y cuándo menos, y la media de goles del tornea y el total de goles por jornada.");
		do {
			System.out.println("----------------------------------");
			System.out.println("0-Salir.");
			System.out.println("1-Inicializar Simulador");
			System.out.println("-----------------------------------");

			op = Leer.datoInt();

			switch (op) {
			case 1:
				for (int i = 0; i < equipos.length; i++) {
					System.out.println("Introduzca nombre del equipo " + (i + 1));
					equipos[i] = Leer.dato();
				}

				for (int i = 0; i < equipos.length; i++) {
					System.out.print(equipos[i] + "\t\t");
				}
				System.out.println();
				System.out.println("--------------------------------------------------------------------");

				for (int i = 0; i < equipos.length; i++) {
					System.out.print((i + 1) + "\t\t");
				}
				System.out.println();

				do {
					System.out.println("*************************************");
					System.out.println("0-Salir");
					System.out.println("1-Ver Goles por Jornada");
					System.out.println("2-Mayor cifra de goles marcadas por un equipo.");
					System.out.println("3-Menor cifra de goles marcadas por un equipo.");
					System.out.println("4-Suma de todos los goles del torneo");
					System.out.println("5-Media goles en el torneo.");
					System.out.println("6-Goles totales por jornada.");
					System.out.println("7-Media de goles por jornada.");

					System.out.println("*************************************");

					op2 = Leer.datoInt();

					switch (op2) {
					case 1:
						for (int i = 0; i < golesEq.length; i++) {
							for (int j = 0; j < golesEq[i].length; j++) {
								golesEq[i][j] = rdm.nextInt(hasta - desde + 1) + desde;

							}
						}

						for (int i = 0; i < equipos.length; i++) {
							System.out.print(equipos[i] + "\t\t");
						}
						System.out.println();
						System.out.println("-----------------------------------------------------------");

						for (int i = 0; i < golesEq.length; i++) {
							for (int j = 0; j < golesEq[i].length; j++) {
								System.out.print(golesEq[i][j] + "\t\t");

							}
							System.out.println();
						}
						break;
					case 2:
						for (int i = 0; i < golesEq.length; i++) {
							for (int j = 0; j < golesEq[i].length; j++) {
								if (i == 0) {
									maxGol = golesEq[i][j];

								}
								if (maxGol < golesEq[i][j]) {
									maxGol = golesEq[i][j];
								}
							}
						}
						System.out.printf("La mayor cifra de goles marcadas por un único equipo es de %d\n", maxGol);
						break;

					case 3:
						for (int i = 0; i < golesEq.length; i++) {
							for (int j = 0; j < golesEq[i].length; j++) {
								if (i == 0) {
									minGol = golesEq[i][j];

								}
								if (minGol > golesEq[i][j]) {
									minGol = golesEq[i][j];
								}
							}
						}
						System.out.printf("La menor cifra de goles marcadas por un único equipo es de %d\n", minGol);
						break;

					case 4:
						for (int i = 0; i < golesEq.length; i++) {
							for (int j = 0; j < golesEq[i].length; j++) {
								golesTot += golesEq[i][j];
							}
						}

						System.out.println("La cantidad de goles marcados en el torneo fue de: " + golesTot);
						break;

					case 5:
						for (int i = 0; i < golesEq.length; i++) {
							for (int j = 0; j < golesEq[i].length; j++) {
								mediaGol = golesTot / 12;
							}

						}
						System.out.printf("La media de goles por partido fue de: %.2f\n", mediaGol);
						break;
					case 6:
						for (int i = 0; i < golesEq.length; i++) {

							golTotJ[i] += golesEq[i][0];
						}

						for (int i = 0; i < golesEq.length; i++) {

							golTotJ[i] += golesEq[i][1];
						}

						for (int i = 0; i < golesEq.length; i++) {

							golTotJ[i] += golesEq[i][2];
						}

						
						for (int i = 0; i < golTotJ.length; i++) {
							System.out.println("Goles jornada" +(i+1)+" "+golTotJ[i] + "\t");
						}
						break;
						
					case 7:
						for (int i = 0; i < golTotJ.length; i++) {
							mediaGolJ=golTotJ[i]/golTotJ.length;
						}
						for (int i = 0; i < golTotJ.length; i++) {
							System.out.println(mediaGolJ);
						}
						break;
						
					case 0:
						System.out.println("Gracias por utilizar este programa :)");
						break;
					default:
						System.out.println("Opción no válida.");
						break;

					}

				} while (op2 != 0);

			case 0:
				System.out.println("Gracias por utilizar este programa :)");
				break;

			default:
				System.out.println("Opción no válida.");
				break;

			}

		} while (op != 0);

	}

}
