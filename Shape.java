import java.io.Serializable;
import java.lang.Comparable;

public class Shape implements Serializable, Comparable{

	public enum Shape {
		BOOT, RACECAR, THIMBLE
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString() {
		return "lowercase string";
	}
	
	public static Shape[] valueOf(String name) {
		
	}
	
	public static Shape[] values() {
		
	}

	

}
