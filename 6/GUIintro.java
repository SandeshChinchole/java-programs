import javax.swing.JOptionPane;

public class GUIintro {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
		JOptionPane.showMessageDialog(null, "You are " + age + " old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("How tall are you?"));
		JOptionPane.showMessageDialog(null, "You are " + height + " tall");
	}

}
