package ejercicio03;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String aux;
		double a, b, c;
		
		CEcuacion2Grado ce = new CEcuacion2Grado(); 
		
		Scanner sc = new Scanner(System.in);

		try {
            System.out.println("Introduce los coeficientes a, b y c de la ecuación ax^2 + bx + c:");
            System.out.print("a = ");
            aux=sc.nextLine();
            a = Double.parseDouble(aux);
           
            System.out.print("b = ");
            aux=sc.nextLine();
            b = Double.parseDouble(aux);
            
            System.out.print("c = ");
            aux=sc.nextLine();
            c = Double.parseDouble(aux);
            
            System.out.println(ce.calculoEcuacion(a, b, c));
        } catch (ExcepcionDegenerada e) {
            System.err.println(e.getMessage());
        } catch (ExcepcionCompleja e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error inesperado.");
	}

}
}
