package ejercicio03;

public class Principal {

	public static void main(String[] args) {
		
		Vehiculo v = new Vehiculo(25,500,1);
		Motocicleta m = new Motocicleta(30,600,2, "Yamaha");
		Furgoneta f = new Furgoneta(20, 200, 3, "Mercedes");
		Coche c = new Coche(20, 700, 1, "Ferrari");
		
		double fijoMercancia=100;
		double porcentajeCilindrada = 60;
		double porcentajePotencia=25;
		double fijo =500;
		
		System.out.println(m.calcularPrecio(fijo, fijoMercancia, porcentajeCilindrada, porcentajePotencia));
		System.out.println(f.calcularPrecio(fijo, fijoMercancia, porcentajeCilindrada, porcentajePotencia));
		System.out.println(c.calcularPrecio(fijo, fijoMercancia, porcentajeCilindrada, porcentajePotencia));

	}

}
