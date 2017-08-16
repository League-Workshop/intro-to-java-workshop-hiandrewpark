package day3;

import java.util.Random;
import javax.swing.JOptionPane;

public class HIGH_LOW_GAME {
		public static void main(String[] args) {
			// 3. Change this line to give you a random number between 1 - 100. 
			int max = 100;
			int min = 1;
			int random = new Random().nextInt(100) + min;
			int i;
			// 2. Print out the random variable above
			// System.out.println(random);
			// 11. do the following 10 times
			for (i = 0;i<10;i++) {
				String ans = JOptionPane.showInputDialog("Guess a number between 1 and 100");
				int num = Integer.parseInt(ans);
				if (random == num) {
					System.out.println("WIN");
					break;
				}
				if (random < num) {
					System.out.println("Your guess is too high");
				}
				if (random > num) {
					System.out.println("Your guess is too low");
				}
				
			}
			if (i >= 10) {
				System.out.println("YOU LOSE");
			}
				// 1. ask the user for a guess using a pop-up window, and save their response 

				// 4. convert the users’ answer to an int (Integer.parseInt(string))
				
				// 5. if the guess is correct
					// 6. win
				// 7. if the guess is high
					// 8. tell them it's too high
				// 9. if the guess is low
					// 10. tell them it's too low

			// 12. tell them they lose
		}

}


