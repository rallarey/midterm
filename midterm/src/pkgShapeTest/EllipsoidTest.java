package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Ellipse;
import pkgShape.Ellipsoid;

public class EllipsoidTest {

	@Test
	public void EllipsoidTest() {
		Ellipsoid ellipsoid1 = new Ellipsoid(10.0, 20.0, 25.0);
		
		assertEquals(20943.95, ellipsoid1.volume(), 0.01);
	}

}
