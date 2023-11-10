package ejercicio03;

public class Operaciones {
	
	public void decirSigno (int num) {
		if (num>=0) {
			System.out.println("Positivo");
		}else {
			System.out.println("Negativo");
		}
	}
	
	public void decirParImpar (int num) {
		int dos=2;
		if (num% dos==0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
	}

}
