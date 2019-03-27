import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class BoardGame {
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;
	
	public BoardGame() {
		playerPieces = new LinkedHashMap<String, GamePiece>();
		playerLocations = new LinkedHashMap<String, Location>();
	}
	
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation) {
		boolean answer = playerPieces.keySet().contains(playerName);
		if(!answer) {
			playerPieces.put(playerName, gamePiece);
			playerLocations.put(playerName, initialLocation);
		}
		return !answer;
	}
	
	public GamePiece getPlayerGamePiece(String playerName) {
		return playerPieces.get(playerName);
	}
	
	public String getPlayerWithGamePiece(GamePiece gamePiece) {
		String[] nam = playerPieces.entrySet().toString().split(" ");
		for(int i = 0; i < nam.length; i++) {
			String[] name = nam[i].split("=");
			for(int j = 0; j<name.length; j++) {
				if(name[j].substring(0,name[j].length()-1).equals(gamePiece.name())) {
					if("[".equals(name[0].substring(0,1))) {
						return name[0].substring(1);
					}
					return name[0];
					}			
				}
		}
		return "none";
	}
	
	public void movePlayer(String playerName, Location newLocation) {
		playerLocations.remove(playerName);
		playerLocations.put(playerName,  newLocation);
	}
	
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations) {
		String[] ans = new String[2];
		GamePiece first = getPlayerGamePiece(playerNames[0]);
		GamePiece second = getPlayerGamePiece(playerNames[1]);


		if(first.equals(first.movesFirst(first, second))) {
			ans[0] =(playerNames[0]);
			ans[1] =(playerNames[1]);
			movePlayer(playerNames[0], newLocations[0]);
			movePlayer(playerNames[1], newLocations[1]);
		}
		else{
			ans[0] =(playerNames[1]);
			ans[1] =(playerNames[0]);
			movePlayer(playerNames[1], newLocations[1]);
			movePlayer(playerNames[0], newLocations[0]);
		}
			
		for(String i: ans) {
			System.out.println(i);
		}
		return ans;
	}
	
	public Location getPlayersLocation(String player) {
		return playerLocations.get(player);
	}
	
	public ArrayList<String> getPlayersAtLocation(Location loc){
		ArrayList<String> ans = new ArrayList<String>();
		Set<Entry<String, Location>> locs = playerLocations.entrySet();
		for(Entry<String, Location> entry : locs) {
			if (entry.getValue().equals(loc)) {
				ans.add(entry.getKey());
			}
		}
		return ans;
	}
	
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc){
		ArrayList<GamePiece> ans = new ArrayList<GamePiece>();
		Set<Entry<String, Location>> locs = playerLocations.entrySet();
		for(Entry<String, Location> entry : locs) {
			if (entry.getValue().equals(loc)) {
				ans.add(getPlayerGamePiece(entry.getKey()));
			}
		}
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
