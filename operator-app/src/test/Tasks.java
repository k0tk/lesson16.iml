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
//		// ���� ���������� (���� ��) ���� ����� (���� � �����(1.5 � �.�.) ����� ��������
//		
//		System.out.println("�������� ����������: ");
//		double s = sc.nextDouble();
//		System.out.println("�������� �����: ");
//		Double t = sc.nextDouble();
//		double v = s / t;
//		if (s > 0 && t > 0) {
//			System.out.println("����� ������� ��������: " + v);
//		} else {
//			System.out.println("Wrong input data.");
			
//			System.out.println("************Task #5***************");
//			// ������ ����������� ����, �� 1 ��� ������� ���� �� 5 ��������, �������� ����� �� ����� ���������;
//			double tw = sc.nextDouble();
//			double vk = (100.0 - tw) / 5.0;
//			System.out.println("����� � ��������: " + vk);
//			
			System.out.println("************Task #6***************");
			
			int num = 9;
			double result = Math.sqrt(num);
			System.out.println(result);
			
			System.out.println("������� �:");
			int a = sc.nextInt();
			System.out.println("������� �:");
			int b = sc.nextInt();
			System.out.println("������� �:");
			int c = sc.nextInt();
			
			int d = (b*b) - 4*a*c;
			double x1 = (-b + Math.sqrt(d)) / 2 * a;
			double x2 = (-b - Math.sqrt(d)) / 2 * a;
			double x3 = -b /( 2 * a);
			
			if (d < 0) {
				System.out.println("�� ����� ������");
			}else if (d == 0) {
				System.out.println(" ����� ���� ������ " + x3);
			}else if (d > 0) {
				System.out.println("����� ��� �����, x1 = " + x1 + " x2: " + x2);
			}
		}
	}
	

