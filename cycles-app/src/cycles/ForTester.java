package cycles;

import java.util.Random;

public class ForTester {

	public static void main(String[] args) {
		// <initialization>- ������ ��� ���������� ����������, ������� ��������� ������� ��������������� �������� ����. ����������� ���� ��������!
		//<condition> - ������� ���������� ���� �����, ���� ������� - ���, �����������, else - ����; (������ boolean);
		//<operator> - ����� ��������������� �������� (������ ���������� ��� ���������� ���������, �������� �� ��������. ����� ����� ����������� ������� � ������ �������. � ������ ���������� ���������, ���������� ������ ��������; ���� ������� ���
		//<body> - ���� �����; ����� ��������� ����� ����, ��������� ��������� 4;
		//          1                 2          4          3
		// for (<initialization>;<condition>;<operator>){<body>}

		System.out.println(" \nTask #1");

		for(int i = 0, bound = 150; i <= bound; i++) { // i++ <=> i = i + 1
			if(i == bound) {
				System.out.print(i + ". ");
			}else {
			System.out.print(i + ", ");
		  }			
		}
		
		System.out.println(" \nTask #2");
		
		for(int i = 100, bound = 1; i >= bound; i--) { // i++ <=> i = i + 1
			if(i == bound) {
				System.out.print(i + ". ");
			}else {
			System.out.print(i + ", ");
		  }			
		}

		System.out.println(" \nTask #3");

		for(int i = 0, bound = -25; i >= bound; i--) { // i++ <=> i = i + 1
			if(i == bound) {
				System.out.print(i + ". ");
			}else {
			System.out.print(i + ", ");
		  }			
		}
		
		System.out.println(" \nTask #4");

		for(int i = 0, j = 0; i < 25; i++) { // i++ <=> i = i + 1
			j += 2;
			System.out.print(j + " ");
		  }			
		
		System.out.println(" \nTask #5");

		for(int i = 0, j = 0; i < 40; i++) { // i++ <=> i = i + 1
			j += 3;
			System.out.print(j + " ");
		  }			
		
		System.out.println(" \nTask #6");

		
		for(int i = 0, j = 0; i < 30; i++) { // i++ <=> i = i + 1
			j += 10;
			System.out.print(j + " ");
		  }			
		
		System.out.println(" \nTask #7");

//		for(int i = 1, j = 0, z = 1; i < 100; i++) { // i++ <=> i = i + 1
//			j += 2;
//			z -= 2;
//			System.out.print(z + " ");
//			System.out.print(j + " ");
        for (int i = 1; i <= 100; i++) {
        	
          if(i % 2 == 0) { //�������� �� �������� ( �� ���������� ���� "== 1")
        	  System.out.print( i + " ");
          }else {
		System.out.print(-1*i + " ");
        
		}		
	}
 
        System.out.println(" \nTask #7.1");
        
        for (int i = 0, x = 0; i < 50; i++) {
            if(i % 2 == 0) {
          	  System.out.print(x);
            }else {
  		System.out.print(-1*x);
        }		
            if(i == 49 ) {
            	System.out.print(".");
            }else {
            	System.out.print(", ");
                x += 5;
            }
        
  	}
        
         System.out.println(" \nTask #8");
        
        for (int i = 0; i < 15; i++) {
			System.out.print(i*i + " ");           
  	}
        
         System.out.println(" \nTask #9");
        
        for (int i = 0,f = 0,z = 0; i < 50; i++) {
			f = (int) (Math.random() * 100 + 1);
		boolean isP = (int) (Math.random() * 2) == 0;
		if(isP) {
			System.out.print(f + " ");
		}else {
			System.out.print(-1* f + " ");
		}
//			z = (int) (Math.random() * -100 - 1);
//			System.out.print(f + " ");
//			System.out.print(z + " ");
        } 
        
        
        
        
        
	}
}