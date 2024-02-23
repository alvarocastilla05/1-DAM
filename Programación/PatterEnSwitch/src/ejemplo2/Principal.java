package ejemplo2;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	interface Shape { }
	record Rectangle(double length, double width) implements Shape { }
	record Circle(double radius) implements Shape { }
	
	public static double getPerimeter(Shape shape) throws IllegalArgumentException {
        switch (shape) {
            case Rectangle r: return 2 * r.length() + 2 * r.width();
            case Circle c:    return 2 * c.radius() * Math.PI;
            default:          throw new IllegalArgumentException("Unrecognized shape");
        }
    }
}
