import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class BoardGameTest {
	BoardGame clue = new BoardGame();
	
	@Test
	public void addPlayerTest() {
		clue.addPlayer("Lance", GamePiece.BLUE_RACER, Location.KITCHEN);
		
		Assert.assertEquals("Incorrectly said player already exists", true, clue.addPlayer("Lady", GamePiece.BLUE_RACER, Location.BALLROOM));
		
		Assert.assertEquals("Didn't add player correctly", GamePiece.BLUE_RACER, clue.playerPieces.get("Lance"));
		Assert.assertEquals("Didn't add to locations correctly",  Location.KITCHEN, clue.playerLocations.get("Lance"));
		Assert.assertEquals("Incorrectly said player doesn't exist already",  false, clue.addPlayer("Lance", GamePiece.BLUE_RACER, Location.HALL));
		
		clue.addPlayer("Jack", GamePiece.RED_RACER, Location.CONSERVATORY);
		
		Assert.assertEquals("Didn't add player correctly", GamePiece.RED_RACER, clue.playerPieces.get("Jack"));
		Assert.assertEquals("Didn't add to locations correctly",  Location.CONSERVATORY, clue.playerLocations.get("Jack"));
		Assert.assertEquals("Incorrectly said player doesn't exist already",  false, clue.addPlayer("Jack", GamePiece.RED_RACER, Location.CONSERVATORY));
		
		clue.addPlayer("Paul", GamePiece.MAGENTA_RACER, Location.DINING_ROOM);
		
		Assert.assertEquals("Didn't add player correctly", GamePiece.MAGENTA_RACER, clue.playerPieces.get("Paul"));
		Assert.assertEquals("Didn't add to locations correctly",  Location.DINING_ROOM, clue.playerLocations.get("Paul"));
		Assert.assertEquals("Incorrectly said player doesn't exist already",  false, clue.addPlayer("Paul", GamePiece.MAGENTA_RACER, Location.DINING_ROOM));
		
		clue.addPlayer("Kyle", GamePiece.RED_THIMBLE, Location.BALLROOM);
		
		Assert.assertEquals("Didn't add player correctly", GamePiece.RED_THIMBLE, clue.playerPieces.get("Kyle"));
		Assert.assertEquals("Didn't add to locations correctly",  Location.BALLROOM, clue.playerLocations.get("Kyle"));
		Assert.assertEquals("Incorrectly said player doesn't exist already",  false, clue.addPlayer("Kyle", GamePiece.RED_THIMBLE, Location.BALLROOM));
		
		clue.addPlayer("Olive", GamePiece.BLUE_BOOT, Location.STUDY);
		
		Assert.assertEquals("Didn't add player correctly", GamePiece.BLUE_BOOT, clue.playerPieces.get("Olive"));
		Assert.assertEquals("Didn't add to locations correctly",  Location.STUDY, clue.playerLocations.get("Olive"));
		Assert.assertEquals("Incorrectly said player doesn't exist already",  false, clue.addPlayer("Olive", GamePiece.BLUE_BOOT, Location.STUDY));
		
clue.addPlayer("Lily", GamePiece.GREEN_BOOT, Location.CONSERVATORY);
		
		Assert.assertEquals("Didn't add player correctly", GamePiece.GREEN_BOOT, clue.playerPieces.get("Lily"));
		Assert.assertEquals("Didn't add to locations correctly",  Location.CONSERVATORY, clue.playerLocations.get("Lily"));
		Assert.assertEquals("Incorrectly said player doesn't exist already",  false, clue.addPlayer("Lily", GamePiece.GREEN_BOOT, Location.CONSERVATORY));
		
clue.addPlayer("Grey", GamePiece.YELLOW_BOOT, Location.HALL);
		
		Assert.assertEquals("Didn't add player correctly", GamePiece.YELLOW_BOOT, clue.playerPieces.get("Grey"));
		Assert.assertEquals("Didn't add to locations correctly",  Location.HALL, clue.playerLocations.get("Grey"));
		Assert.assertEquals("Incorrectly said player doesn't exist already",  false, clue.addPlayer("Grey", GamePiece.YELLOW_BOOT, Location.HALL));
		
clue.addPlayer("Olive", GamePiece.BLUE_BOOT, Location.STUDY);
	}
	
	@Test
	public void getPlayerGamePieceTest(){
		clue.addPlayer("Lance", GamePiece.BLUE_BOOT, Location.KITCHEN);
		
		Assert.assertEquals("Incorrect piece for player",  GamePiece.BLUE_BOOT, clue.getPlayerGamePiece("Lance"));
	}
	
	@Test
	public void getPlayerWithGamePiece() {
		clue.addPlayer("Lance", GamePiece.BLUE_BOOT, Location.KITCHEN);
		clue.addPlayer("Lucy",  GamePiece.RED_RACER, Location.BILLIARD_ROOM);
		
		Assert.assertEquals("Incorrect player for piece", "Lance", clue.getPlayerWithGamePiece(GamePiece.BLUE_BOOT));
		Assert.assertEquals("Incorrect player for piece", "none", clue.getPlayerWithGamePiece(GamePiece.YELLOW_BOOT));
		Assert.assertEquals("Incorrect player for piece", "Lucy", clue.getPlayerWithGamePiece(GamePiece.RED_RACER));
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
		
		
		Assert.assertEquals("Incorrect player moves output first", new String[] {"Lance", "Andrew"}, clue.moveTwoPlayers(new String[] {"Lance",  "Andrew"}, new Location[] {Location.CONSERVATORY, Location.HALL}));
		Assert.assertEquals("Wrong final location of first",  Location.CONSERVATORY, clue.getPlayersLocation("Lance"));
		Assert.assertEquals("Wrong final location of second",  Location.HALL, clue.getPlayersLocation("Andrew"));
		
		Assert.assertEquals("Incorrect player moves output first", new String[] {"Lance", "Andrew"}, clue.moveTwoPlayers(new String[] {"Andrew", "Lance"}, new Location[] {Location.LOUNGE, Location.STUDY}));
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
