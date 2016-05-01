import javax.swing.JOptionPane;

public class knock_knock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = JOptionPane.showInputDialog("What do you call a turtle with out a shell, warning: do not say 'a' ");
		if (answer.equalsIgnoreCase("slurtle")) {
			JOptionPane.showMessageDialog(null, "You were right, the answer is a slurtle");
		} else {
			JOptionPane.showMessageDialog(null, "You were wrong, the answer is slurtle");
		}
	}

}
