package by.itstep.model.inheritance.empls;

public class Person {

	private String name;
	private String lastName;
	private int age;
	private char gender;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}	
	
	@Override
	public String toString() {
		String str = "Name: " + name + ", Last name: " + lastName + ", Age: " + age + ", Gender: " + gender;
		return str;
	}
	
	public void dance() {
		System.out.println(name + " dance");
	}
	
	public void dontDance() {
		System.out.println(name + " won't dance");
	}
	
	public void drink() {
		System.out.println(name + " drinking something");
	}
	
	public void drink(int num) {
		for (int i = 0; i < num; i++) {
			drink();
		}
	}
	
}