import java.util.Date;
import java.util.HashMap;

public class CigaretteType {
	private final int WEIGHT = 1000;
	private int tobacco_rate;
	private int paper_rate;
	private int agents_rate;
	private HashMap<String, Float> components;
	private final Date DATE = new Date();
	
	public CigaretteType(int tobacco_rate, int paper_rate, int agents_rate, HashMap<String, Float> components){
		this.tobacco_rate= tobacco_rate;
		this.paper_rate= paper_rate;
		this.agents_rate= agents_rate;
	}
}
