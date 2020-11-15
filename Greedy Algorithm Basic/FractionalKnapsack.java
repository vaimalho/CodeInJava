package greedy;

public class FractionalKnapsack {

	private int weight;
	private int value;
	private double perUnitWeight;
	
	FractionalKnapsack(int weight,int value){
		this.weight=weight;
		this.value=value;
		this.perUnitWeight=(double)value/weight;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public double getPerUnitWeight() {
		return perUnitWeight;
	}
	public void setPerUnitWeight(int perUnitWeight) {
		this.perUnitWeight = perUnitWeight;
	}
	
}
