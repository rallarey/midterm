package pkgShape;

public class Rectangle {

	private int Width;
	private int Length;
	public Rectangle(int width, int length) {
		super();
		Width = width;
		Length = length;
	}
	
	public int area()
	{
		return this.Width * this.Length;
	}
}
