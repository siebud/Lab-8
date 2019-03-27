
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoardGame clue = new BoardGame();
		
		clue.addPlayer("Josh", GamePiece.BLUE_RACER, Location.BALLROOM); //2
		clue.addPlayer("Brian", GamePiece.RED_THIMBLE,  Location.HALL); //10
		clue.addPlayer("Ryan",  GamePiece.YELLOW_BOOT, Location.CONSERVATORY); //7
		
		clue.addPlayer("Josh", GamePiece.BLUE_RACER, Location.BALLROOM);
		
		System.out.println(clue.getGamePiecesAtLocation(Location.HALL));
		clue.movePlayer("Ryan", Location.HALL);
		System.out.println(clue.getGamePiecesAtLocation(Location.HALL));
		
		System.out.println(clue.getPlayerWithGamePiece(GamePiece.BLUE_RACER));
		System.out.println(clue.getPlayerWithGamePiece(GamePiece.YELLOW_BOOT));
		System.out.println(clue.getPlayerGamePiece("Josh"));
		clue.movePlayer("Brian",  Location.LIBRARY);
		System.out.println(clue.getPlayerLocations());
		
		clue.moveTwoPlayers(new String[] {"Josh",  "Ryan"}, new Location[] {Location.BILLIARD_ROOM, Location.LOUNGE});
		clue.moveTwoPlayers(new String[] {"Brian",  "Josh"}, new Location[] {Location.STUDY, Location.HALL});
		System.out.println(clue.getPlayerLocations());
		
		System.out.println(clue.getPlayers());

	}

}
