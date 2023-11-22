package principalv0;

import crud.CrudProducto;
import model.Producto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaro variables 
		Producto [] listado;
		Producto p1;
		Producto p2;
		int tam=10;
		CrudProducto cp;
		//Instancio dos objetos
		p1= new Producto ("1a", "Atún", 1.50,true);
		p2= new Producto ("2b", "Pan de molde", 4.50,true);
		
		//Instancio el array
		listado=new Producto  [tam];
		//Instancio objeto de la clase crud 
		//pasando un array de productos
		cp=new CrudProducto(listado);
		
		//Agrego unos cuantos productos
		cp.add(p1, 0);
		cp.add(p2, 1);
		
		System.out.println(cp);
		
	}

}
