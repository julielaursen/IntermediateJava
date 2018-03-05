package ShapeHierarchy;

public class Tetrahedron extends ThreeDimensionalShape {
	
	protected int length;
	final double sqrt2 = Math.sqrt(2); 
	final double sqrt3 = Math.sqrt(3); 
	
	public Tetrahedron(int length){
		this.length = length;
	}
	
	public double area(){
		return sqrt3 * (length * length);
	}
	
	public double volume(){
		return (length * length * length ) / (6 * sqrt2); 
	}

}