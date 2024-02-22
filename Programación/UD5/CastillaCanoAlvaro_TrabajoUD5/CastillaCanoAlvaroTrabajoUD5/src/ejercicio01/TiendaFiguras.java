package ejercicio01;

/*Aquí creamos un record y como vemos no es necesario crear los atributos, constructores... Ya que los autogenera solos*/
public record TiendaFiguras (Figura [] lista){

	
	public double calcularAreaUnaFigura(Figura f) {
		return f.calcularArea();
	}
	
	public double calcularPrecioFigura(double precioBase, Figura f){
		return precioBase * calcularAreaUnaFigura(f);
	}
	
	public void mostrarListaConAviso() {
		for (int i = 0; i < lista.length; i++) {
			if(lista[i]!=null) {
				System.out.println(lista[i]);
			}
			if(lista[i] instanceof Cuadrado c) {	/*Nueva manera de hacer el instanceof, sin necesidad de realizar un casteo.*/
				c.avisoCuadrado();
			}
		}
	}
}
