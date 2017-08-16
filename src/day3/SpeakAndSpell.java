package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		String fword = "tomato";
		speak(fword);
		// 2. Catch the user's answer in a String
		String a = JOptionPane.showInputDialog("Spell the word");
		// 3. If the user spelled the word correctly, speak "correct"
		a = a.toLowerCase();
		if (a.equals("tomato")) {
			String word1 = "correct";
			speak(word1);
		}else {
			String word2 = "wrong";
			speak(word2);
		}
		String sword = "indict";
		speak(sword);
		String b = JOptionPane.showInputDialog("Spell the word");
		// 3. If the user spelled the word correctly, speak "correct"
		b = b.toLowerCase();
		if (b.equals("indict")) {
			String word1 = "correct";
			speak(word1);
		}else {
			String word2 = "wrong";
			speak(word2);
		}
		String tword = "cemetery";
		speak(tword);
		String c = JOptionPane.showInputDialog("Spell the word");
		// 3. If the user spelled the word correctly, speak "correct"
		c = c.toLowerCase();
		if (c.equals("cemetery")) {
			String word1 = "correct";
			speak(word1);
		}else {
			String word2 = "wrong";
			speak(word2);
		}
		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


