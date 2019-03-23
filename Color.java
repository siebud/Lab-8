
public enum Color {
	RED (225,0,0), 
	GREEN (0,225,0), 
	BLUE (0,0,225), 
	YELLOW (225, 225, 0), 
	CYAN (0,225,225), 
	MAGENTA(225, 0, 225);
	
	Color(int r, int g,int b){
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	private int b;
	private int g;
	private int r;
	

	public int getR() {
		return r;
	}
	
	public int getG() {
		return g;
	}
	
	public int getB() {
		return b;
	}
}