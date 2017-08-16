package day3;

import javax.swing.JOptionPane;

public class AREYOUHAPPY {
	public static void main(String [] args) {
		String f = JOptionPane.showInputDialog("Are you happy?");
		f = f.toLowerCase();
		if (f.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}
		else {
			String s = JOptionPane.showInputDialog("Do you want to be happy?");
			s = s.toLowerCase();
			if (s.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}
			else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			}
		}
	}
}
