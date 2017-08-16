package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String world = JOptionPane.showInputDialog("Do you know how to code?");
		world.toLowerCase();
		// 2. If they say "yes", tell them they will rule the world.
		if (world.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Go rule the world!");
		}
		// 3. Otherwise, wish them good luck washing dishes.
		else {
			JOptionPane.showMessageDialog(null, "Good luck washing dishes");
		}
	}
}

