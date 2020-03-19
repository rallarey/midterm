package pkgShape;

public class Circle extends Shape implements Comparable<Object> {

	protected double Radius;
	
	public Circle(double Radius)
	{
		this.Radius = Radius;
	}
	
	public double area() throws Exception {
		if (Radius > 0) {
			return Math.PI * (Radius*Radius);
		} else {
			throw new IllegalArgumentException("radius must be positive");
		}
	}
		
	protected double getRadius() {
		return Radius;
	}
		
	protected void setRadius(double radius) {
		this.Radius = radius;
	}
		
	public int compareTo(Object o) {
		try {
			return (int) (this.area() - ((Circle) o).area());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
		
	}

}
