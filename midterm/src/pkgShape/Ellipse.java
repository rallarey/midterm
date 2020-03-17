package pkgShape;

public class Ellipse extends Circle implements Comparable<Object>{
	
	protected double MinorRadius;
	
	public Ellipse(double Radius, double MinorRadius) {
		super(Radius);
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
		if (Radius > 0 && MinorRadius > 0) {
			return Math.PI * (Radius*MinorRadius);
		} else {
			throw new IllegalArgumentException("both radii must be positive");
		}
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
