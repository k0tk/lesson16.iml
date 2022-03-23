package test;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("************Task #0***************");
//		
//		System.out.println("Enter integer: ");
//		int i = sc.nextInt();
//		
//		if (i >= 0) {
//			System.out.println("Your number is pozitiv");
//		} else {
//			System.out.println("Your number is negative");
//		}
	
//		System.out.println("************Task #1***************");
//		
//		System.out.println(" Enter A: ");
//		int a = sc.nextInt();
//		System.out.println(" Enter B: ");
//		int b = sc.nextInt();
//		
//		System.out.println("************Task #2***************");
//		
//		int a1 = sc.nextInt();
//		int b1 = sc.nextInt();
//		int c1 = sc.nextInt();
//		
//		if (a1<b1 && b1<c1) {//a1<b1<c1
//			System.out.println("The biggest number is: " + c1);
//		} else if (a1<b1 && b1>c1) {
//			System.out.println("The biggest number is: " + b1);
//		} else if (a1>b1 && b1>c1) {
//			System.out.println("The biggest number is: " + a1);
//		}
			
//		System.out.println("************Task #3***************");
//
//		int b = sc.nextInt();
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		if ((b + n) > m) {
//			System.out.println("It's right triangle!");
//		} else {
//			System.out.println("It's irregular triangle");
//		}
			
//		System.out.println("************Task #4***************");
//		
//		// есть расстояние (ввод км) есть время (ввод в часах(1.5 и т.д.) найти скорость
//		
//		System.out.println("Напишите расстояние: ");
//		double s = sc.nextDouble();
//		System.out.println("напишите время: ");
//		Double t = sc.nextDouble();
//		double v = s / t;
//		if (s > 0 && t > 0) {
//			System.out.println("Нужна средняя скорость: " + v);
//		} else {
//			System.out.println("Wrong input data.");
			
//			System.out.println("************Task #5***************");
//			// ввести температуру воды, за 1 сек нагреет воду на 5 градусов, написать время до конца кипячения;
//			double tw = sc.nextDouble();
//			double vk = (100.0 - tw) / 5.0;
//			System.out.println("Время в секундах: " + vk);
//			
			System.out.println("************Task #6***************");
			
			int num = 9;
			double result = Math.sqrt(num);
			System.out.println(result);
			
			System.out.println("Введите А:");
			int a = sc.nextInt();
			System.out.println("Введите В:");
			int b = sc.nextInt();
			System.out.println("Введите С:");
			int c = sc.nextInt();
			
			int d = (b*b) - 4*a*c;
			double x1 = (-b + Math.sqrt(d)) / 2 * a;
			double x2 = (-b - Math.sqrt(d)) / 2 * a;
			double x3 = -b /( 2 * a);
			
			if (d < 0) {
				System.out.println("Не имеет корней");
			}else if (d == 0) {
				System.out.println(" имеет один корень " + x3);
			}else if (d > 0) {
				System.out.println("имеет два корня, x1 = " + x1 + " x2: " + x2);
			}
		}
	}
	

