import javax.swing.JOptionPane;
public class rollercoaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String answer =  JOptionPane.showInputDialog("How tall are you?");
int a = Integer.parseInt(answer);
int b = a*12;	
	if (b >= 48) {
	 speak("Pass");}
	} else {
	speak("Dont Pass");	
	}
	
	
	
	
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	}
}