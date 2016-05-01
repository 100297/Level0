import javax.swing.JOptionPane;

public class TheRiddler {
	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		String answer = JOptionPane.showInputDialog(null,
				"There are 2 people in a horserace.The catch is the that whichever horse finishes last wins. Then they go in a store. The store keeper says two words and then they get back on the horses and race to the finish line. What did he say.");

		if (answer.equalsIgnoreCase("switch horses")) {
			JOptionPane.showMessageDialog(null, "Yes, you are right!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. the answer is 'switch horses'");
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		String answer2 = JOptionPane.showInputDialog(null,
				"A man built 4 houses on a property, a second later, all the houses were gone and in it's place was a hotel. How is this possible.");

		if (answer2.equalsIgnoreCase("He was playing monopoly")) {
			JOptionPane.showMessageDialog(null, "Yes, you are right!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. the answer is 'He was playing monopoly'");
		}
		String answer3 = JOptionPane.showInputDialog(null, "Poor people have it. Rich people need it, it is more powerful than god and more evil than the devil. What is it?");

		if (answer3.equalsIgnoreCase("Nothing")) {
			JOptionPane.showMessageDialog(null, "Yes, you are right!");
			score += 2;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. the answer is 'switch horses'");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " + score);
		if (score >= 1) {
			JOptionPane.showMessageDialog(null, "You did a good job");
		} else {
			JOptionPane.showMessageDialog(null, "You did horrible");
		}
	}
}
