import org.junit.Test;

import junit.framework.Assert;

public class ColorTest {
	@Test
	public void TestingColors() {
		
		Assert.assertEquals("Shape enum values incorrect",  Color.RED, Color.valueOf("RED"));
		Assert.assertEquals("Shape enum values incorrect",  Color.GREEN, Color.valueOf("GREEN"));
		Assert.assertEquals("Shape enum values incorrect",  Color.BLUE, Color.valueOf("BLUE"));
		Assert.assertEquals("Shape enum values incorrect",  Color.YELLOW, Color.valueOf("YELLOW"));
		Assert.assertEquals("Shape enum values incorrect",  Color.CYAN, Color.valueOf("CYAN"));
		Assert.assertEquals("Shape enum values incorrect",  Color.MAGENTA, Color.valueOf("MAGENTA"));
		
		Color col = null;
		col = Color.RED;
		Assert.assertEquals("Wrong red value", 255, col.getR());
		Assert.assertEquals("Wrong green value", 0, col.getG());
		Assert.assertEquals("Wrong blue value", 0, col.getB());
		
		col = Color.GREEN;
		Assert.assertEquals("Wrong red value", 0, col.getR());
		Assert.assertEquals("Wrong green value", 255, col.getG());
		Assert.assertEquals("Wrong blue value", 0, col.getB());
		
		col = Color.BLUE;
		Assert.assertEquals("Wrong red value", 0, col.getR());
		Assert.assertEquals("Wrong green value", 0, col.getG());
		Assert.assertEquals("Wrong blue value", 255, col.getB());
		
		col = Color.YELLOW;
		Assert.assertEquals("Wrong red value", 255, col.getR());
		Assert.assertEquals("Wrong green value", 255, col.getG());
		Assert.assertEquals("Wrong blue value", 0, col.getB());
		
		col = Color.CYAN;
		Assert.assertEquals("Wrong red value", 0, col.getR());
		Assert.assertEquals("Wrong green value", 255, col.getG());
		Assert.assertEquals("Wrong blue value", 255, col.getB());
		
		col = Color.MAGENTA;
		Assert.assertEquals("Wrong red value", 255, col.getR());
		Assert.assertEquals("Wrong green value", 0, col.getG());
		Assert.assertEquals("Wrong blue value", 255, col.getB());
	}

}
