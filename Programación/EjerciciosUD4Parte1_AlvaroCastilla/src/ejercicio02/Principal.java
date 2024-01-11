package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		
		Documento d = new Documento("Viewnext", 675314070, "view@gamil.com");
		TarjetaDeVisita t = new TarjetaDeVisita("Sony", 653399615, "sony@gmail.com", "Pepe");
		Carta c = new Carta("Lenovo", 659883212, "lenovo@gmail.com", "16/06/2024");
		
		d.mostrarCabecera();
		System.out.println("*****************");
		t.mostrarCabecera();
		System.out.println("******************");
		c.mostrarCabecera();

	}

}
