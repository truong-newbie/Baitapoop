package hinhtron;

public class Circle implements GeometricObject {
	protected double radius= 1.0;
	protected final double PI = 3.14;
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	@Override
	public double getPerimeter() {
		return this.radius * 2 * PI;
		}

	@Override
	public double getArea() {
		return this.radius * this.radius * PI;
	}
}
