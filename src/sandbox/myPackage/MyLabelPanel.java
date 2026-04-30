package sandbox.myPackage;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class MyLabelPanel extends JPanel {

	MyLabel label;

	public MyLabelPanel() {
		super();
		initLayout();
		initComponents();
	}
	
	/**
	 * Aktualisiert das Label
	 * @param count
	 */
	public void updateCounter(int count) {
		label.setText("Counter " + count);
	}

	private void initComponents() {
		label = new MyLabel("Label für den Counter");
		add(label);
	}

	private void initLayout() {
		setBackground(Color.WHITE);
		setLayout(new FlowLayout());
		setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, false));
	}

}
