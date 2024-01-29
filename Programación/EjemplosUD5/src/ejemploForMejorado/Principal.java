package ejemploForMejorado;

public class Principal {

	public static void main(String[] args) {

		int [] numeros = {1,3,5,7,9,11,13,15,17,19};
		int suma = 0;
		int num1 = 3;
		int num2 = 2;
		int mayor;
		
		//Antes de los 2 puntos debemos de definir una variable del tipo de lo que haya dentro, en este caso int
		//No se pone la variable de dentro del parentesis = 0.
		//Despues de los 2 puntos debemos de poner el nombre del array.
		for(int valor : numeros) {
			suma = suma+valor;
			
			System.out.println(valor); //Para ver el valor del elemento
		}
		System.out.println("La suma es: "+suma);
		
		System.out.println(mayor = num1 > num2 ? 4 : 0);

	}

}
