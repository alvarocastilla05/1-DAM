package ejercicio08;

public class CuentaCorriente {
	
	//Atributos.
	private double saldo;
	private String nombre;
	
	//Constructor.
	//Poner getter and setter aunque no lo utilicemos
	
	
	public CuentaCorriente(double saldo, String nombre) {
		
		this.saldo = saldo;
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Creacion de metodos
	//NUNCA PONEMOS ASIGNACIONES EN EL RETURN (=)
	//No es necesario poner return ni no tenemos que devolverlo.
	
	public void retirarCant (double retiro) {
		
		saldo=saldo-retiro;
		//return saldo;
		
	}
	public void mostrarRetiro(double saldo) {
		System.out.printf("Su saldo actual es %.2f €\n", saldo);
	}
	
	public void ingresarCant (double ingreso) {
		
		saldo=saldo+ingreso;
		//return saldo;
		
	}
	public void mostrarIngreso(double saldo) {
		System.out.printf("Su saldo actual es %.2f €\n", saldo);
	}
	
	public double calcularDolares (double tasaEurDol) {
		double dolares;
		dolares= tasaEurDol*saldo;
		
		return dolares;
	}
	public void mostrarDolares(double dolares) {
		System.out.printf("Tienes un total de %.2f $\n", dolares);
	}
	
	public void mostrarSaldo () {
		System.out.printf("[%s] Saldo disponble: %.2f €\n",nombre, saldo);
	}
		
	
}
