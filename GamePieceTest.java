import org.junit.Test;
import junit.framework.Assert;

public class GamePieceTest {
		@Test
		public void TestingShapes() {
			Assert.assertEquals("Shape enum values incorrect",  GamePiece.RED_RACER, GamePiece.valueOf("RED_RACER"));
			Assert.assertEquals("Shape enum values incorrect",  GamePiece.BLUE_RACER, GamePiece.valueOf("BLUE_RACER"));
			Assert.assertEquals("Shape enum values incorrect",  GamePiece.MAGENTA_RACER, GamePiece.valueOf("MAGENTA_RACER"));
			Assert.assertEquals("Shape enum values incorrect",  GamePiece.RED_THIMBLE, GamePiece.valueOf("RED_THIMBLE"));
			Assert.assertEquals("Shape enum values incorrect",  GamePiece.BLUE_BOOT, GamePiece.valueOf("BLUE_BOOT"));
			Assert.assertEquals("Shape enum values incorrect",  GamePiece.RED_RACER, GamePiece.valueOf("RED_RACER"));
			Assert.assertEquals("Shape enum values incorrect",  GamePiece.YELLOW_BOOT, GamePiece.valueOf("YELLOW_BOOT"));
			
			GamePiece gp;
			gp = GamePiece.RED_RACER;
			Assert.assertEquals("Wrong color",  Color.RED, gp.getColor());
			Assert.assertEquals("Wrong shape",  Shape.RACECAR, gp.getShape());
			
			gp = GamePiece.BLUE_RACER;
			Assert.assertEquals("Wrong color",  Color.BLUE, gp.getColor());
			Assert.assertEquals("Wrong shape",  Shape.RACECAR, gp.getShape());
			
			gp = GamePiece.MAGENTA_RACER;
			Assert.assertEquals("Wrong color",  Color.MAGENTA, gp.getColor());
			Assert.assertEquals("Wrong shape",  Shape.RACECAR, gp.getShape());
			
			gp = GamePiece.RED_THIMBLE;
			Assert.assertEquals("Wrong color",  Color.RED, gp.getColor());
			Assert.assertEquals("Wrong shape",  Shape.THIMBLE, gp.getShape());
			
			gp = GamePiece.BLUE_BOOT;
			Assert.assertEquals("Wrong color",  Color.BLUE, gp.getColor());
			Assert.assertEquals("Wrong shape",  Shape.BOOT, gp.getShape());
			
			gp = GamePiece.GREEN_BOOT;
			Assert.assertEquals("Wrong color",  Color.GREEN, gp.getColor());
			Assert.assertEquals("Wrong shape",  Shape.BOOT, gp.getShape());
			
			gp = GamePiece.YELLOW_BOOT;
			Assert.assertEquals("Wrong color",  Color.YELLOW, gp.getColor());
			Assert.assertEquals("Wrong shape",  Shape.BOOT, gp.getShape());
			
			Assert.assertEquals("Wrong first piece",  GamePiece.BLUE_RACER, GamePiece.movesFirst(GamePiece.RED_THIMBLE, GamePiece.BLUE_RACER));
			Assert.assertEquals("Wrong first piece",  GamePiece.BLUE_RACER, GamePiece.movesFirst( GamePiece.BLUE_RACER, GamePiece.RED_THIMBLE));
		}
		
		@Test
		public void toStringTest() {
			Assert.assertEquals("Wrong toString()","YELLOW_BOOT: a YELLOW boot with priority 7", GamePiece.YELLOW_BOOT.toString());

			Assert.assertEquals("Wrong toString()","RED_RACER: a RED racecar with priority 0", GamePiece.RED_RACER.toString());
		}
}
