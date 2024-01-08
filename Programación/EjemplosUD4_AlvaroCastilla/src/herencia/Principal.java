package herencia;

public class Principal {

	public static void main(String[] args) {
		
		Trabajador t = new Trabajador("Alvaro", "Programador Junior", "17477928K");
		Empleado e =new Empleado("Alberto", "Jefe", "295386256W", 2000, 15.0);
		Consultor c = new Consultor("Miguel", "Experto", "4D", 20, 18);

		
		Empleado e2 = new Empleado("3C", 1500.0, 12.5);
		
		System.out.println(t);
		System.out.println(e);
		System.out.println(e2);
		
		System.out.println(t.calcularPaga());
		System.out.println(e.calcularPaga());
		System.out.println(c.calcularPaga());
	}

}
