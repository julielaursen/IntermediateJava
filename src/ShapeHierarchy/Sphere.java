package ShapeHierarchy;

public class Sphere extends ThreeDimensionalShape {
	
protected double radius;
	
	public Sphere(double radius){
		this.radius = radius;
	}

	public double area(){
		return 4 * Math.PI * radius * radius;
	}
	
	public double volume(){
		return (4.0 / 3) * Math.PI * radius * radius * radius;
	}
}



