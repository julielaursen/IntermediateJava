package ShapeHierarchy;

public class ShapeTest extends Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] a = {
				new Triangle(3, 4, 5),
				new Circle(5),
				new Square(1, 10),
				new Sphere(5),
				new Cube(3, 4, 5),
				new Tetrahedron(5)
		};
		for (Shape s : a)
			if (s instanceof TwoDimensionalShape)
				//"%.2f%n"
				System.out.printf("%s%.2f%n", "The area of " + s.getClass().getName() 
						+ " is ",  s.area());
			else if (s instanceof ThreeDimensionalShape)
				System.out.printf("%s%.2f%s%.2f%n", "The area of " + s.getClass().getName() 
						+ " is ", s.area(), ". The volume of " + s.getClass().getName() + " is ", s.volume());
	}
	

}
