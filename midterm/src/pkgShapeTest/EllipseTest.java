package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Ellipse;

public class EllipseTest {

	@Test
	public void EllipseTest() {
		Ellipse e1 = new Ellipse(10.0, 20.0);
		
		assertEquals(628.32, e1.area(), 0.01);
	}

}
