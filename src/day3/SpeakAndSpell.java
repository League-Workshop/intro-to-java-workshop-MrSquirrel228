package day3;

import javax.swing.JOptionPane;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("spell mandlebrot");
		// 2. Catch the user's answer in a String
		String word = JOptionPane.showInputDialog("spell the world");
		// 3. If the user spelled the word correctly, speak "correct"
		if (word.equals("mandlebrot"))

		{
			speak("Correct");
		}
		// 4. Otherwise say "wrong"
		else
			speak("Wrong");
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
