package model.animals;

public class Cat extends Mammal{

	public void play() {
		System.out.println("Cat " + this.getName() + " is playing");
	}
	private String sleep;
	private String jump;
	public String getJump() {
		return jump;
	}

	public void setJump(String jump) {
		this.jump = jump;
	}

	public String getSleep() {
		return sleep;
	}

	public void setSleep(String sleep) {
		this.sleep = sleep;
	}
	
	
	
	
}
