import org.junit.Test;

import junit.framework.Assert;

public class LocationTest {
	
	@Test
	public void TestLocations() {
		Assert.assertEquals("Location enum values incorrect",  Location.BALLROOM, Location.valueOf("BALLROOM"));
		Assert.assertEquals("Location enum values incorrect",  Location.KITCHEN, Location.valueOf("KITCHEN"));
		Assert.assertEquals("Location enum values incorrect",  Location.CONSERVATORY, Location.valueOf("CONSERVATORY"));
		Assert.assertEquals("Location enum values incorrect",  Location.DINING_ROOM, Location.valueOf("DINING_ROOM"));
		Assert.assertEquals("Location enum values incorrect",  Location.STUDY, Location.valueOf("STUDY"));
		Assert.assertEquals("Location enum values incorrect",  Location.HALL, Location.valueOf("HALL"));
		Assert.assertEquals("Location enum values incorrect",  Location.LOUNGE, Location.valueOf("LOUNGE"));
		Assert.assertEquals("Location enum values incorrect",  Location.LIBRARY, Location.valueOf("LIBRARY"));
		Assert.assertEquals("Location enum values incorrect",  Location.BILLIARD_ROOM, Location.valueOf("BILLIARD_ROOM"));
		
	}

}
