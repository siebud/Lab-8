import org.junit.Test;

import junit.framework.Assert;

public class ShapeTest {
	@Test
	public void TestingShapes() {
		Assert.assertEquals("Shape enum values incorrect",  Shape.BOOT, Shape.valueOf("BOOT"));
		Assert.assertEquals("Shape enum values incorrect",  Shape.RACECAR, Shape.valueOf("RACECAR"));
		Assert.assertEquals("Shape enum values incorrect",  Shape.THIMBLE, Shape.valueOf("THIMBLE"));
		
	}
}
