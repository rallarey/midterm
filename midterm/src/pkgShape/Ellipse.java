package pkgShape;

public class Ellipse extends Circle implements Comparable<Object>{
	
	protected double MinorRadius;
	
	public Ellipse(double Radius, double MinorRadius) {
		super(Radius);
		
		if (Radius <= 0 && MinorRadius <= 0) {
			throw new IllegalArgumentException("both radii must be positive");
		}
		
		this.Radius = Radius;
		this.MinorRadius = MinorRadius;
	}
	
	public double getMinorRadius() {
		return MinorRadius;
	}
	
	public void setMinorRadius(double minorRadius) {
		MinorRadius = minorRadius;
	}
	
	public double area() {
		return Math.PI * (Radius*MinorRadius);
	}
	
	public boolean isCircle() {
		Boolean isCircle = false;
		if (Radius == MinorRadius) {
			isCircle = true;
		} else {
			isCircle = false;
		}
		return isCircle;
	}
	
	public int compareTo(Object o) {
		return (int) (this.area() - ((Ellipse) o).area());
	}
}
