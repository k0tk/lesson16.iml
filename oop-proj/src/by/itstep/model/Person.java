package by.itstep.model;

/**
 * Super class. Top lvl class. Parrant class. Super Type.
 * 
 * @author kot1k
 */
public class Person {

	private String name;
	private String color;
	private char gender;
	private double weight;
	private int age;
	private int growth; 
	private Car car;// has s relation ship to "Car" model
	private Cat cat;// has s relation ship to "Cat" model
	

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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrowth() {
		return growth;
	}

	public void setGrowth(int growth) {
		this.growth = growth;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
