package ShapeHierarchy;

public class Cube extends ThreeDimensionalShape {
	
	protected int width;
	protected int height;
	protected int length;
	
	public Cube(int width, int height, int length){
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	public double area(){
		return 6 * (width * height);
	};

	public double volume(){
		return length * length * length;
	}

}
