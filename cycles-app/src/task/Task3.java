package task;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Imput number:");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("�������������");
		} else {
			System.out.println("�������������");
		}
		
		if ((num / num) == 1 && (num/1) == num) {
			System.out.println("�����������");
		}else if (num % 2 == 1) {
			System.out.println("�� �����������");
		}
		
		if (num % 2 ==0) {
			System.out.println("׸����");
		}else {
			System.out.println("�� ������");
		}
		
		
		
		int i = 3;
		while (i <= 100) {
		if (num % i == 0) {
			System.out.println("������� " + i);
			
		   }
		 i = i + 1;
		}
		
		
		
	}
}
