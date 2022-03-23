package task;

import java.util.Scanner;

public class HomeTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number (2 digits) :");
		int x = sc.nextInt();
		int f = x / 10;
		int s = x - f * 10 ; // x % 10	
	}
}
