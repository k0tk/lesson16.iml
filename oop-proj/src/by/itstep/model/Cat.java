package by.itstep.model;

public class Cat {

	public String color; //цвет шерсти
	public String breed; //порода
	public String wool;
	public String name;
	public int age;
	
	/**
	 * metods. 
	 * Поведение каждого индивидуального обьекта(кота)
	 */
	public void sleep() {
		System.out.println(name + " is sleeping");
	}
	
	public void eat() {
		System.out.println(name + " is eating");
	}
	
	public void voice() {
		System.out.println(name + " :meow-meow");
	}
	
	public void play() {
		System.out.println(name + " is playing");
	}
	
	
	
	
}
