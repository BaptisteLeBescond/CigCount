import java.util.ArrayList;
import java.util.HashMap;

public class User {
	private HashMap<Paquet, ArrayList<Cigarette>> cigarettes_smoked;
	
	public User() {
		cigarettes_smoked = new HashMap<Paquet, ArrayList<Cigarette>>();
	}
}
