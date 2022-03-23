package by.itstep.client;

import by.itstep.model.Cat;

public class Home {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
		cat.color = "White";
		cat.breed = "Snow shu";
		cat.wool = "Fluffy";
		cat.name = "Tom";
		cat.age = 4;
		
		
		Cat cat2 = new Cat();
		
		cat2.color = "Black";
		cat2.breed = "Briton";
		cat2.wool = "Fluffy";
		cat2.name = "Myrzik";
		cat2.age = 2;
		
		
		cat.play();
		cat.eat();
		cat.sleep();
		
		
		cat2.eat();
		cat2.play();
		cat2.sleep();
		
		
		//создать модель, характеристики, наличие кота и машины
		
	}

}
