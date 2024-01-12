package ejemploabstracto;

public class Principal {

	public static void main(String[] args) {
		
		//Figura f = new Figura(1,2); DA ERROR PORQUE NO SE PUEDE INSTANCIAR LA CLASE ABSTRACTA
		Cuadrado c = new Cuadrado(2,3,2); //SE PUEDE INSTANCIAR PORQUE NO ES ABSTRACTA
		Rectangulo r = new Rectangulo(1, 2, 2, 3); //SE PUEDE INSTANCIAR PORQUE NO ES ABSTRACTA
		
		//ES DEL TIPO DE LO QUE PONE EN LA IZQUIERDA Y SE INSTANCIA EN LO DE LA DERECHA.
		Figura cuadrado = new Cuadrado(1,2,2); //NO DA ERROR
		Figura rectangulo = new Rectangulo(1, 2, 5, 10);
		
		System.out.println(cuadrado.calcularArea());
		System.out.println(rectangulo.calcularArea());

	}

}
