package ejercicio01;

public class Sobremesa extends Ordenador {
    
    private double precioMontaje;

    public Sobremesa(int capacidadDiscoDuro, int frecuenciaProcesador, double precioBase, String nombre, double precioMontaje) {
        super(capacidadDiscoDuro, frecuenciaProcesador, precioBase, nombre);
        this.precioMontaje = precioMontaje;
    }

    public double getPrecioMontaje() {
        return precioMontaje;
    }

    public void setPrecioMontaje(double precioMontaje) {
        this.precioMontaje = precioMontaje;
    }

    @Override
    public String toString() {
        return "Sobremesa [precioMontaje=" + precioMontaje + "]";
    }
    
    
    public double calcularPrecioVenta(double ganancia) {
    	double total;
    	total=super.calcularPrecioVenta(ganancia)+precioMontaje;
    	return total;
    }
}