 package org.itstep.test.var;

 public class VarTester {

	 public static void main(String[] args) {
		byte m = -128; // -128 .. 127;
		
		
		int i = 33;
		double d = 3.3;
		char z = 'A';
		boolean bool = true; //can be true or false;
        bool = false;
        
        int m1 = 8;
        int m2 = 7;
        int m3 = 7;
        int m4 = 9;
        int m5 = 8;
        
        double avg = (m1 + m2 + m3 + m4 + m5) / 5.0;
        System.out.println("AVG = " + avg);
        
        double dollar = 2.46;
        double euro = 2.85;
        System.out.println("курс доллара:" + dollar);
        System.out.println("курc евро:" + euro);
        double cash = 50000; //BYN
        
        double usd = cash / dollar;
        double euroAmount = cash / euro;
        
        System.out.println("BYN:" + cash);
        System.out.println("USD:" + usd);
        System.out.println("EURO: " + euroAmount);
        
        double rus = 0.034;
        double rusAmount = cash / rus;
        System.out.println("RUS:" + rusAmount);
        
        double dolz = dollar / 0.492;
        double euroz = euro / 0.57;
        double rusz = rus / 0.0068;
        double bynz = cash / 10000;
        System.out.println("USD:" + dolz);
        System.out.println("BYN:" + bynz);
        System.out.println("RUS:" + rusz);
        System.out.println("EURO:" + euroz);
        
        int a = 6,  b = 8, c = 10;
        double p = a + b + c;
        double s = 0.5 * a * b;
        double pp = p / 2.0;
        double s2 = Math.sqrt(pp*(pp-a)*(pp-b)*(pp-c));
        System.out.println("S :" + s);
        System.out.println("S2 :" + s2);
        System.out.println("Периметр равен:" + p);
        System.out.println("Площадь равна:" + s);
        System.out.println("Полу-периметр равен:" + pp);
        
        double n = 3.14;
        int r = 4;
        double circle = 2 * n * r;
        System.out.println("Площадь круга равна:" + circle);
        
        
        
	}
	 
}
