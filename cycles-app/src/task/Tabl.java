package task;

import java.util.Scanner;

public class Tabl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Input number");
		int a = sc.nextInt();
       
		//		System.out.println( a + " * 1 = " + a);
//		System.out.println( a + " * 2 = " + (a*2));
//		System.out.println( a + " * 3 = " + (a*3));
//		System.out.println( a + " * 4 = " + (a*4));
//		System.out.println( a + " * 5 = " + (a*5));
//		System.out.println( a + " * 6 = " + (a*6));
//		System.out.println( a + " * 7 = " + (a*7));
//		System.out.println( a + " * 8 = " + (a*8));
//		System.out.println( a + " * 9 = " + (a*9));
//		System.out.println( a + " * 10 = " + (a*10));

		
		int i = 1;
		System.out.println("Imput bound");
		int bound = sc.nextInt();
		while (i <= bound) {
			System.out.println( a + " * " + i + " = " + (i*a));
            i = i + 1;
		}
            System.out.println("Reverse order");
            
            while (bound>0) {
    			System.out.println( bound + " * " + i + " = " + (a*bound));
    			bound = bound -1;
            }		
		}
		
		
	}

