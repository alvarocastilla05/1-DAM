package ejemploCasting;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String aux;
		Scanner sc = new Scanner(System.in);
		
		OperacionFiguras op = new OperacionFiguras();
		Cuadrado c = new Cuadrado ("cuadrado2", "blanca",2 ); //Se puede hacer esto porque aunque sea tipo cuadrado, es una figura.
		Circulo ci = new Circulo("circulo2", "azul", 3);
		Figura f1 = new Cuadrado("cuadrado1", "Negro", 2);
		Figura f2 = new Circulo("circulo1", "Blanco", 5);
		
		
		//La ventaja de cuando la ponemos tipo figura llega cuando usemos los arrays, ya que en una lista todos los objetos deben de ser del mismo tipo.
		
		System.out.printf("El area es %.2f\n", op.calcularAreaUnaFigura(c));
		System.out.printf("El area es %.2f\n", op.calcularAreaUnaFigura(ci));
		System.out.printf("El area es %.2f\n", op.calcularAreaUnaFigura(f1));
		System.out.printf("El area es %.2f\n", op.calcularAreaUnaFigura(f2));
		
		//Métodos no reescritos.
		
		c.metodoSoloDeFigura(); //El cuadrado puede usar este metodo ya que los hijos pueden heredar todos los metodos de los padres.
		ci.metodoSoloDeFigura(); //Una hija puede llamar un metodo que solo esta en su madre porque es suyo también. 
		
		c.soyUnCuadrado();
		f1.calcularArea();
	}

}
