package ejemploPasoParametro;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1;
		int y = 2;
		
		System.out.println("Valores de x e y antes de la modificación: ");
		System.out.println(" x ="+x+"; y ="+y);
		modifyPrimitiveTypes(x,y);
		System.out.println("Valores de x e y despues de la modificación: ");
		System.out.println(" x ="+x+"; y ="+y);
		
		//No muestra la modifición, porque se modifica dentro del método. A partir de la linea 14 se borra la copia. 

	}
	public static void modifyPrimitiveTypes(int x, int y) {
		x = 5;
		y = 10;
	}

}
