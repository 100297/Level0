
 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayRemider {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "November 24th";
		String dadsBirthday = "December 9th";
		String myBirthday = "July 11th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday = JOptionPane.showInputDialog(" Do you want my dads birthday, my mom's bithday, or my birthday.");
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, birthday);
		// 4. if user asked for "mom"
			if (birthday.equals("mom")) {
				JOptionPane.showMessageDialog(null, momsBirthday);
			}
		// 5. if user asked for "dad"
			if (birthday.equals("dad")) {
				JOptionPane.showMessageDialog(null, dadsBirthday);
			}
		// 6. if user asked for your name
			if (birthday.equals("you")) {
				JOptionPane.showMessageDialog(null, myBirthday);
			} else { JOptionPane.showMessageDialog(null, "Sorry I don't remember that birthday");
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
			}
	}
			
			 
}