import java.util.ArrayList;
import java.util.HashMap;

public class User {
	private HashMap<Pack, ArrayList<Cigarette>> cigarettes_smoked;
	private Pack currentPack;
	
	public User() {
		cigarettes_smoked = new HashMap<Pack, ArrayList<Cigarette>>();
	}
}
