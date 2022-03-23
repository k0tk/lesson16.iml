package game;

import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {

		System.out.println("Game is started!");
        Scanner sc = new Scanner(System.in);
        
        int complexLxl = 0;
        System.out.println(" 1 - easy ");
        System.out.println(" 2 - middle ");
        System.out.println(" 3 - hard ");
        System.out.println("Input mode: ");
        complexLxl = sc.nextInt();
        
        
        int totalBotPoints;
        int totalUserPoints;
        int firstCardPoints, secondCardPoints, nextCardPoints;
        // User logic
        System.out.println("User:");
        firstCardPoints = (int) (Math.random() * 10) + 1;
        System.out.println("1st Card: " + firstCardPoints);
        
        secondCardPoints = (int) (Math.random() * 10) + 1;
        System.out.println("2nd Card: " + secondCardPoints);
        totalUserPoints = firstCardPoints + secondCardPoints;
        
        boolean stopFlag;
        System.out.println("Want next card?  Yes(1) / No(2)");
        stopFlag = sc.nextInt() != 1; // expected 1 or something else (not 1)
        
        while (!stopFlag) {
            // 1 . generate next card
            nextCardPoints = (int) (Math.random() * 10) + 1;
            System.out.println("Card: " + nextCardPoints);
            // 2. calculate total
            totalUserPoints = totalUserPoints + nextCardPoints;
            // 3. Ask user again
            System.out.println("Want next card?  Yes(1) / No(2)");
            stopFlag = sc.nextInt() != 1; // expected 1 or something else (not 1)
        }
        System.out.println("User points: " + totalUserPoints);
        // Bot logic starts here
        System.out.println("Bot is started");

        int fc, tc, nc;
        fc = (int) (Math.random() * 10) + 1;
        tc = (int) (Math.random() * 10) + 1;
        
        totalBotPoints = fc + tc;
       if (complexLxl == 1) {
        while (totalBotPoints < 14) {
            nc = (int) (Math.random() * 10) + 1;
            totalBotPoints = totalBotPoints + nc;
            System.out.println("Next card for bot");
          }
       } else if (complexLxl == 2) {
    	   while (totalBotPoints < 14 || totalBotPoints < totalUserPoints) {
               nc = (int) (Math.random() * 10) + 1;
               totalBotPoints = totalBotPoints + nc;
               System.out.println("Next card for bot");
             }
       }else if (complexLxl == 3) {
    	   while (totalBotPoints < 14 || (totalBotPoints < totalUserPoints && totalUserPoints <22)) {
               nc = (int) (Math.random() * 10) + 1;
               if ( totalBotPoints + nc <22) {
               totalBotPoints = totalBotPoints + nc;
             }
    	   }
       }
       
        System.out.println("Bot is done. Points: " + totalBotPoints);
        
        if (totalBotPoints > 21 && totalUserPoints > 21 ) {
        	System.out.println("No winers!");
        } else if (totalUserPoints > 21) {
        	System.out.println("Bot won! =[ ");
        } else if (totalBotPoints > 21) {
        	System.out.println("User won! =] ");
        } else {
        	if (totalBotPoints > totalUserPoints) {
            	System.out.println("Bot won! =[ ");
        	} else {
            	if (totalBotPoints < totalUserPoints) {
                	System.out.println("User won! =] ");
            	} else {
            		System.out.println("No winers!");
            	}
        }
        
        System.out.println("End.");
    }
  }
}

