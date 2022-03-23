package model.animals;

public class AnimalsTester {

	public static void main(String[] args) {
		
		Bird bi = new Bird();
		Bird bi1 = new Bird();
		Cat pc = new Cat ();
		pc.setColor("Black");
		pc.setName("Tom");
		pc.setWeight(5);
		pc.setJump("Ну прыгает");
		pc.play();
		pc.sleep();
		
		bi.setName("Dove");
		bi.steelEat();
		
		bi1.setName("Eagle");
		
		// 
		
		
		
	}

}
