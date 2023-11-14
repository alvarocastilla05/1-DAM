package ejemploSobrecarga;

public class Principal {

	public static void main(String[] args) {
		
		
		
		Operaciones o=new Operaciones();
		
		System.out.println(o.sumar(3.2, 3.2));
		
		System.out.println(o.sumar(1, 2));
	}

}
