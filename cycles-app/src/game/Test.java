package game;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("text");
        
//		int number = 6;
//		while (number != 0) {
//			System.out.println("body while");
//		    number = number -1;
//			
//			
//		}
//		System.out.println("End..");
//		
		
		// есть переменная т воды, присваиваем 30*, исп цикл вайл вскипятить воду. увел на 3*
		
//		int t = 32;
//		while (t <= 100) {
//			System.out.println(".");
//			t = t + 3;
//		}
//		
//		System.out.println("Вода закипела!");
//		
		Scanner sc = new Scanner(System.in);
		System.out.println("Imput number: ");
		int n = sc.nextInt();
		while (n != 0) {
			System.out.println("моем продукты...");
			System.out.println("режем...");
			System.out.println("порция готова!!");
			System.out.println(".......................");
			n = n - 1;
     		}
	System.out.println("Салаты готовы!!!");
		
	}

}
