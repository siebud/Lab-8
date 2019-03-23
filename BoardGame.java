import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame {
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;
	
	public BoardGame() {
		playerPieces = new LinkedHashMap<String, GamePiece>();
		playerLocations = new LinkedHashMap<String, Location>();
	}
	
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation) {
		String plname = playerName;
		playerPieces.put(plname, gamePiece);
		playerLocations.put(plname, initialLocation);
		return !playerPieces.containsValue(plname);
	}
	
	public GamePiece getPlayerGamePiece(String playerName) {
		return playerPieces.get(playerName);
	}
	
	public String getPlayerWithGamePiece(GamePiece gamePiece) {
		return gamePiece.name();
	}
	
	public void movePlayer(String playerName, Location newLocation) {
		playerLocations.remove(playerName);
		playerLocations.put(playerName,  newLocation);
	}
	
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations) {
		String[] ans = new String[2];
		
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
		
		return ans;
	}
	
	public Location getPlayersLocation(String player) {
		return playerLocations.get(player);
	}
	
	public ArrayList<String> getPlayersAtLocation(Location loc){
		ArrayList<String> ans = new ArrayList<String>();
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
		System.out.println(playerLocations.get(loc));
		return ans;
	}
	
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc){
		ArrayList<GamePiece> ans = new ArrayList<GamePiece>();
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA	
		return ans;
	}
	
	public Set<String> getPlayers(){
	return playerPieces.keySet();	
	}
	
	public Set<Location> getPlayerLocations() {
		Set<Location> ans = new HashSet<>();
		ans.addAll(playerLocations.values());
		return ans;
	}
	
	public Set<GamePiece> getPlayerPieces(){
		Set<GamePiece> ans = new HashSet<>();
		ans.addAll(playerPieces.values());
		return ans;
	}

}
