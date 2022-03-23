package by.itstep.client;

import by.itstep.model.Car;

public class AutoHaus {

	public static void main(String[] args) {
		
		// creating object (instances of the class)
		// Object <=> Instance - Конкретный обьект созданный на основе класса
		
		Car car;// Object <=>
		car = new Car();// тоже самое что: give me new object "Car"
		
		car.color = "Black";
		car.model = "BMW 5";
		car.hp = 250;
		car.price = 75000;
		car.sizeOfWheel = 18;
		car.type = "S Class";
		
		
		Car car2 = new Car();
		
		car2.color = "White";
		car2.model = "Audi A3";
		car2.hp = 200;
		car2.price = 45000;
		car2.sizeOfWheel = 17;
		car2.type = "B Class";
		
		
		Car car3 = new Car();
		
		
		car3.color = "Red";
		car3.model = "Golf R";
		car3.hp = 300;
		car3.price = 120000;
		car3.sizeOfWheel = 18;
		car3.type = "A Class";

		
		
		
		
		
		
		
	}

}
