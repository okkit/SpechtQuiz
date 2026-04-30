package sandbox.myPackage;

import java.awt.Font;

import javax.swing.JLabel;

public class MyLabel extends JLabel {

	public MyLabel(String text) {
		super(text);
		init();
	}

	private void init() {
		setOpaque(false);
		setFont(new Font("Trebushet", Font.PLAIN, 20));

	}
}
