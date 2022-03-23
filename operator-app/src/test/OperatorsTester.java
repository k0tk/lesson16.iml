package test;

public class OperatorsTester {

	public static void main(String[] args) {

		boolean flag = true; // can be true or false;
		System.out.println("Flag now is " + flag);

		int iq = 120;
		boolean isSmart;
		// (<conditial>){<operator1>; <operator2>; ...}
		if (iq > 50) {
			isSmart = true;
		} else {
			isSmart = false; // if iq < 50 or iq == 50;

		}
		System.out.println("Person is smart? " + isSmart);
		int cashe = 10000;
		boolean mycash;
		if (cashe > 1000000) {
			mycash = true;
		} else {
			mycash = false;
		}
		System.out.println("You are rich? " + mycash);
		
		boolean isKind = true;
		
		if(( mycash && isSmart ) || isKind){
		System.out.println("Yes!");
		} else {
			System.out.println("No!");
		}
		
		int t = -65;
		if(t>20) {
			System.out.println("T-short");
		} else if (t >= 10){
			System.out.println("Jacket");
		} else if (t >= -30) {
			System.out.println("Coat");
		} else {
			System.out.println("Stay home!");
		}
		
		int age = 70;
		if (age < 6) {
			System.out.println("kindergarten");
		} else if (age < 17) {
			System.out.println("School");
		} else if (age < 18) {
			System.out.println("Army");
		} else if (age < 27) {
			System.out.println("Work");
		} else if (age < 65) {
			System.out.println("pension");
		}
		
		double avg = 5.5;
		if (avg >= 0 && avg <= 4) {
			System.out.println("Very bad, try best");
	    } else if (avg > 5 && avg <= 8) {
            System.out.println("good");
        } else if (avg >= 9 && avg <= 10) {
            System.out.println("Exelent");
        } else if (avg >= 11) {
            System.out.println("No valid");
        } else if (avg < 0) {
            System.out.println("No valid");
        } 
		
		if (iq>=100 || cashe>500 || t < 20 || age != 20 || avg < 5 || !isKind && flag == false) {
			System.out.println("!!!");
		}
		if (avg == 5.5)
			System.out.println("!!!");
		
	}
}
