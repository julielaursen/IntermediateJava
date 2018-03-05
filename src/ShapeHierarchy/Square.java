package ShapeHierarchy;

public class Square extends TwoDimensionalShape {
	
	protected int width;
	protected int height;
	
	public Square(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public double area(){
		return width * height;
	};

}
