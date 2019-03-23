
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoardGame clue = new BoardGame();
		
		clue.addPlayer("Josh", GamePiece.BLUE_RACER, Location.BALLROOM);
		clue.addPlayer("Brian", GamePiece.RED_THIMBLE,  Location.HALL);
		clue.addPlayer("Ryan",  GamePiece.YELLLOW_BOOT, Location.CONSERVATORY);
		
		System.out.println(clue.getGamePiecesAtLocation(Location.HALL));
		clue.movePlayer("Ryan", Location.HALL);
		System.out.println(clue.getGamePiecesAtLocation(Location.HALL));
		
		System.out.println(clue.getPlayerWithGamePiece(GamePiece.BLUE_RACER));
		System.out.println(clue.getPlayerGamePiece("Josh"));
		clue.movePlayer("Brian",  Location.LIBRARY);
		System.out.println(clue.getPlayerLocations());
		

	}

}
