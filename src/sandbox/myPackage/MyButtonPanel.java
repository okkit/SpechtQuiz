package sandbox.myPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class MyButtonPanel extends JPanel {

	MyButton button;

	public MyButtonPanel() {
		super();
		initLayout();
		initComponents();
	}

	private void initComponents() {
		button = new MyButton("Klick");
		add(button, BorderLayout.CENTER);

	}

	private void initLayout() {
		setBackground(Color.WHITE);
		setLayout(new FlowLayout());
		setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, false));
	}

}
