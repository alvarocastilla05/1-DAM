package ejemplo1;

public class Principal {

	public static void main(String[] args) {

		int num = 10;
		int den = 0;
		double res=0;
		
		//Justo debajo de un try siempre debe de ir un catch mínimo

		/*En el parentesis del catch debe de ir el fallo que queremos solventar, 
		sino sabemos exactamente cual es, ponemos exception que es el más general*/
		
		try {
			res = num/den;
			System.out.printf("La división es: %.2f", res);
			
		}catch (Exception e) { 
			System.err.println("Está usted dividiendo por cero");
		}
		
		
		
	}

}
