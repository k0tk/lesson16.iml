package task;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите два числа");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int r = a + b;
		int re = a - b;
		int res = a * b;
		if(b != 0) {
		int rd = a / b;
		System.out.println(+ a + "/" + b + "=" + rd);
	}else {
		System.out.println("Division by Zero invalid");
	}	
		System.out.println(+ a + "+" + b + "=" + r);
		System.out.println(+ a + "-" + b + "=" + re);
		System.out.println(+ a + "*" + b + "=" + res);		
	}

}
