import java.util.HashMap;

public class Pack {
	private static int last_id=0; 
	private int id;
	private Type type;
	private String brand;
	//Depending on the type. Rolled = weight, Pack = nb_cigarette 
	private int weight;
	private int nb_cigarettes;
	private float price;
	private int tobacco_rate;
	private int paper_rate;
	private int agents_rate;
	private HashMap<String, Float> components;
	
	public Pack(Type type, String brand, float price, int tobacco_rate, int paper_rate, int agents_rate, HashMap<String, Float> components){
		id = last_id++;
		this.type = type;
		this.brand = brand;
//		this.weight = weight;
//		this.nb_cigarettes = nb_cigarettes;
		this.price = price;
		this.tobacco_rate = tobacco_rate;
		this.paper_rate = paper_rate;
		this.agents_rate = agents_rate;
		this.components = components;
	}
	
	public String toString(){
		return id + " " + type + " " + brand + " " + price + " " + tobacco_rate + " " + paper_rate + " " + agents_rate + " " + components;
	}
}
