package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String adj = JOptionPane.showInputDialog("Enter an adjective");
		// Get the user to enter a type of liquid
		String liq = JOptionPane.showInputDialog("Enter a type of liquid");
		// Get the user to enter a body part
		String body = JOptionPane.showInputDialog("Enter a body part");
		// Get the user to enter a verb
		String verb = JOptionPane.showInputDialog("Enter a verb");
		// Get the user to enter a place
		String place = JOptionPane.showInputDialog("Enter a place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		System.out.println("Piranhas are more " + adj + " during the day, so cross the river at");
		System.out.println("night. Piranhas are attracted to fresh " + liq + " and will most");
		System.out.println("likely take a bite out of your " + body + " if you " + verb + ". Whatever");
		System.out.println("you do, if you have an open wound, try to find another way to get");
		System.out.println("back to the " + place + ". Good luck!");
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		

	}
}

