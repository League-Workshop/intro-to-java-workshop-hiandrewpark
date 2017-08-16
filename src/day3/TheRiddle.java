package day3;

import javax.swing.JOptionPane;

/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Riddle Me This
Duration=.33
Platform=Eclipse
Type=Recipe
Objectives=if/else & score & JOptionPane
*/

public class TheRiddle {

    public static void main(String[] args) {

        // 1. Make a variable to hold the score
    		int score = 0;
        // 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
    		String riddle1 = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
    		String riddle2 = JOptionPane.showInputDialog("What has a head and a tail, but no body?");
    		String riddle3 = JOptionPane.showInputDialog("Paul's height is six feet, he's an assistant at a butcher's shop, and wears size 9 shoes. What does he weigh?");
        // 4. If they got the answer right, pop up "correct!" and increase the score by one
    		riddle1 = riddle1.toLowerCase();
    		if( riddle1.equals("stamp")) {
    				System.out.println("Correct!");
    				score = score + 1;
    				System.out.println(score);
    		} else {
    			System.out.println("Wrong, the answer is stamp");
    		}
    		riddle2 = riddle2.toLowerCase();
    		if( riddle2.equals("coin")) {
    				System.out.println("Correct!");
    				score = score + 1;
    				System.out.println(score);
    		} else {
    			System.out.println("Wrong, the answer is coin");
    		}
    		riddle3 = riddle3.toLowerCase();
    		if( riddle3.equals("meat")) {
    				System.out.println("Correct!");
    				score = score + 1;
    				System.out.println(score);
    		} else {
    			System.out.println("Wrong, the answer is meat");
    		}
    		
    		JOptionPane.showMessageDialog(null, score);
    		
        // 5. Otherwise, say "wrong" and tell them the answer

        // 6. Add some more riddles

        // 2. Make a pop up to show the score.
        
    }
}
