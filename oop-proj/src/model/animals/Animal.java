package model.animals;

public class Animal {

	private String name;
	private String color;
	private double weight;
	
	public void sleep() {
		System.out.println(name + " sleep");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
	
	
}
