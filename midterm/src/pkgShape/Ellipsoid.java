package pkgShape;

public class Ellipsoid  extends Ellipse implements Comparable<Object>{
	
	private double HeightRadius;
	
	public Ellipsoid(double Radius, double MinorRadius, double HeightRadius) {
		super(Radius, MinorRadius);
		this.Radius = Radius;
		this.MinorRadius = MinorRadius;
		this.HeightRadius = HeightRadius;
	}
	
	public double volume() {
		if (Radius > 0 && MinorRadius > 0 && HeightRadius > 0) {
			return ((4.0/3.0) * Math.PI * (Radius*MinorRadius*HeightRadius));
		} else {
			throw new IllegalArgumentException("all radii must be positive");
		}
	}
	
	public int compareTo(Object o) {
		return (int) (this.volume() - ((Ellipsoid) o).volume());
	}
	
}
