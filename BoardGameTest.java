import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class BoardGameTest {
	BoardGame clue = new BoardGame();
	
	@Test
	public void addPlayerTest() {
		clue.addPlayer("Lance", GamePiece.BLUE_BOOT, Location.KITCHEN);
		
		Assert.assertEquals("Incorrectly said player already exists",  true, clue.addPlayer("Lady", GamePiece.BLUE_RACER, Location.BALLROOM));
		Assert.assertEquals("Didn't add player correctly", GamePiece.BLUE_BOOT, clue.playerPieces.get("Lance"));
		Assert.assertEquals("Didn't add to locations correctly",  Location.KITCHEN, clue.playerLocations.get("Lance"));
		Assert.assertEquals("Incorrectly said player doesn't exist already",  false, clue.addPlayer("Lance", GamePiece.BLUE_RACER, Location.HALL));
		}
	
	@Test
	public void getPlayerGamePieceTest(){
		clue.addPlayer("Lance", GamePiece.BLUE_BOOT, Location.KITCHEN);
		
		Assert.assertEquals("Incorrect piece for player",  GamePiece.BLUE_BOOT, clue.getPlayerGamePiece("Lance"));
	}
	
	@Test
	public void getPlayerWithGamePiece() {
		clue.addPlayer("Lance", GamePiece.BLUE_BOOT, Location.KITCHEN);
		
		Assert.assertEquals("Incorrect player for piece", "Lance", clue.getPlayerWithGamePiece(GamePiece.BLUE_BOOT));
	}
	
	@Test
	public void movePlayerTest() {
		clue.addPlayer("Lance", GamePiece.BLUE_BOOT, Location.KITCHEN);
		clue.movePlayer("Lance",  Location.LOUNGE);
		
		Assert.assertEquals("Didn't move player correctly", Location.LOUNGE, clue.getPlayersLocation("Lance"));
	}
	
	@Test
	public void moveTwoPlayersTest() {
		clue.addPlayer("Lance", GamePiece.BLUE_BOOT, Location.KITCHEN);
		clue.addPlayer("Andrew", GamePiece.RED_THIMBLE, Location.BILLIARD_ROOM);
		
		
		Assert.assertEquals("Incorrect player moves output first", new String[] {"Andrew", "Lance"}, clue.moveTwoPlayers(new String[] {"Lance",  "Andrew"}, new Location[] {Location.CONSERVATORY, Location.HALL}));
		Assert.assertEquals("Wrong final location of first",  Location.CONSERVATORY, clue.getPlayersLocation("Lance"));
		Assert.assertEquals("Wrong final location of second",  Location.HALL, clue.getPlayersLocation("Andrew"));
		
		Assert.assertEquals("Incorrect player moves output first", new String[] {"Andrew", "Lance"}, clue.moveTwoPlayers(new String[] {"Andrew", "Lance"}, new Location[] {Location.LOUNGE, Location.STUDY}));
	}
	
	@Test
	public void getPlayersAtLocationTest() {
		clue.addPlayer("Lance", GamePiece.BLUE_BOOT, Location.KITCHEN);
		clue.addPlayer("Andrew", GamePiece.RED_THIMBLE, Location.KITCHEN);
		clue.addPlayer("Ellie",  GamePiece.GREEN_BOOT,  Location.BALLROOM);
		
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("Lance");
		expected.add("Andrew");

		Assert.assertEquals("Incorrect players at a location", expected, clue.getPlayersAtLocation(Location.KITCHEN));
	}
	
	@Test
	public void getGamePiecesAtLocationTest() {
		clue.addPlayer("Lance", GamePiece.BLUE_BOOT, Location.KITCHEN);
		clue.addPlayer("Andrew", GamePiece.RED_THIMBLE, Location.KITCHEN);
		clue.addPlayer("Ellie",  GamePiece.GREEN_BOOT,  Location.BALLROOM);
		
		ArrayList<GamePiece> expected = new ArrayList<GamePiece>();
		expected.add(GamePiece.BLUE_BOOT);
		expected.add(GamePiece.RED_THIMBLE);
		
		Assert.assertEquals("Incorrect pieces at a location",expected, clue.getGamePiecesAtLocation(Location.KITCHEN));
	}
	
	@Test
	public void getPlayersTest() {
		clue.addPlayer("Lance", GamePiece.BLUE_BOOT, Location.KITCHEN);
		clue.addPlayer("Andrew", GamePiece.RED_THIMBLE, Location.HALL);
		clue.addPlayer("Ellie",  GamePiece.GREEN_BOOT,  Location.BALLROOM);
		
		Assert.assertTrue("Didn't get all players",clue.getPlayers().contains("Lance"));
		Assert.assertTrue("Didn't get all players",clue.getPlayers().contains("Andrew"));
		Assert.assertTrue("Didn't get all players",clue.getPlayers().contains("Ellie"));
	}
	
	@Test
	public void getPlayerLocationsTest() {
		clue.addPlayer("Lance", GamePiece.BLUE_BOOT, Location.KITCHEN);
		clue.addPlayer("Andrew", GamePiece.RED_THIMBLE, Location.HALL);
		clue.addPlayer("Ellie",  GamePiece.GREEN_BOOT,  Location.BALLROOM);
		
		Assert.assertTrue("Didn't get all player locations",clue.getPlayerLocations().contains(Location.KITCHEN));
		Assert.assertTrue("Didn't get all player locations",clue.getPlayerLocations().contains(Location.HALL));
		Assert.assertTrue("Didn't get all player locations",clue.getPlayerLocations().contains(Location.BALLROOM));
	}
	
	@Test
	public void getPlayerPiecesTest() {
		clue.addPlayer("Lance", GamePiece.BLUE_BOOT, Location.KITCHEN);
		clue.addPlayer("Andrew", GamePiece.RED_THIMBLE, Location.HALL);
		clue.addPlayer("Ellie",  GamePiece.GREEN_BOOT,  Location.BALLROOM);
		
		Assert.assertTrue("Didn't get all player pieces",clue.getPlayerPieces().contains(GamePiece.BLUE_BOOT));
		Assert.assertTrue("Didn't get all player pieces",clue.getPlayerPieces().contains(GamePiece.RED_THIMBLE));
		Assert.assertTrue("Didn't get all player pieces",clue.getPlayerPieces().contains(GamePiece.GREEN_BOOT));
	}

}
