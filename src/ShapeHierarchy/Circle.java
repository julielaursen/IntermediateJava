package ShapeHierarchy;

public class Circle extends TwoDimensionalShape {
	
	protected int radius;
	
	public Circle(int radius){
		this.radius = radius;
	}

	public double area(){
		return Math.PI * radius * radius;
	}
}
