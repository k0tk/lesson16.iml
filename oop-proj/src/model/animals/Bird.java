package model.animals;

public class Bird extends Animal {
	public void attack() {
		System.out.println("Bird " + this.getName() + " is attack");
	}
	private String fly;
	public void steelEat(){
		System.out.println("Now Dove steel your eat");
	}
	public String getFly() {
		return fly;
	}

	public void setFly(String fly) {
		this.fly = fly;
	}
	
	
	
	
	
	
	
	
	
	
}
