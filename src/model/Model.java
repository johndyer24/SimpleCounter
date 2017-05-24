package model;

public class Model {
	
	int counterValue;
	
	public Model() {
		this.counterValue = 0;
	}
	
	public int getCounterValue() {
		return counterValue;
	}
	
	public void incrementCounter() {
		this.counterValue++;
	}
	
	public void decrementCounter() {
		this.counterValue--;
	}

}
