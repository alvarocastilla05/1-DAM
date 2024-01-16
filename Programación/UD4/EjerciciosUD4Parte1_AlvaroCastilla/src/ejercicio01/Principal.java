package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		
		double ganancia=50;
		
		Ordenador o = new Ordenador(1000, 25.5, 900, "Lenovo");
		Portatil p = new Portatil (500, 30, 999.99, "HP", true, 3.5);
		Sobremesa s = new Sobremesa(2000, 40, 1300, "Caquita", 20);
		
		System.out.println(o);
		System.out.println(p);
		System.out.println(s);
		
		System.out.println("******************");
		
		System.out.println(o.calcularPrecioVenta(ganancia));
		System.out.println(p.calcularPrecioVenta(ganancia));
		System.out.println(s.calcularPrecioVenta(ganancia));
		
				

	}

}
