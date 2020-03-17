package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Rectangle;

public class RectangleTest {

	@Test
	public void RectangleTest() {
		Rectangle rec = new Rectangle(10,20);
		
		assertEquals(200, rec.area(), 0.01);
	}

}
