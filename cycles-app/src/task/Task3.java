package task;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Imput number:");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("Положительное");
		} else {
			System.out.println("Отрицательное");
		}
		
		if ((num / num) == 1 && (num/1) == num) {
			System.out.println("Натуральное");
		}else if (num % 2 == 1) {
			System.out.println("Не натуральное");
		}
		
		if (num % 2 ==0) {
			System.out.println("Чётное");
		}else {
			System.out.println("Не чётное");
		}
		
		
		
		int i = 3;
		while (i <= 100) {
		if (num % i == 0) {
			System.out.println("Кратное " + i);
			
		   }
		 i = i + 1;
		}
		
		
		
	}
}
