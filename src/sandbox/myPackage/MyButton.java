package sandbox.myPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.JButton;

public class MyButton extends JButton {

	public MyButton(String text) {
		super(text);
		init();
	}

	private void init() {
		setOpaque(true);
		setFocusable(false);
		setBackground(new Color(200, 200, 200));
		setFont(new Font("Trebushet", Font.PLAIN, 20));
		setPreferredSize(new Dimension(240, 30));
		setMnemonic(KeyEvent.VK_A);
	}
}
