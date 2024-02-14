package jdk13;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double factura  = 30;
		int envio = 5;
		int descuento = 0;
		int op1 = 1;
		
		descuento=switch(op1) {
			case 1,2,3->{
				int op = envio*2;
				yield op;
			}
			case 4,5 ->{
				int op=envio*+1;
				yield op;
			}
			default -> 5;
		};
		System.out.println(factura*100/(100+descuento));
		
		System.out.println("""
				Hola me llamo Álvaro y estoy realizando
				un proyecto de programación
				""");
		
		System.out.println("Hola me llamo Álvaro \n"
				+ "y estoy realizando un proyecto de programación");
		
		
		
		
			
		
	}
}
