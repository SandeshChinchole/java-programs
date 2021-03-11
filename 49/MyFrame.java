import java.awt.Color;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	MyFrame() {
		this.setVisible(true);
		this.setTitle("Book");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setResizable(false);
		this.getContentPane().setBackground(new Color(123,50,250));
	}
}
