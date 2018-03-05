package ShapeHierarchy;

public class Triangle extends TwoDimensionalShape {
	
	protected int a, b, c;
	
	public Triangle(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	public double area(){
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s-a) * (s-b) * (s-c));
	}
}
