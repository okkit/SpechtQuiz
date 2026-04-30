package sandbox.myPackage;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class MyRootPanel extends JPanel {
	
	MyLabelPanel labelPanel;
	MyButtonPanel buttonPanel;

	public MyRootPanel() {
		super();
		initLayout();
		initComponents();
	}

	private void initComponents() {
	
		labelPanel = new MyLabelPanel();
		add(labelPanel);
		
		add(Box.createVerticalStrut(10));
		buttonPanel = new MyButtonPanel();
		add(buttonPanel);
		
		add(Box.createVerticalStrut(10));
		add(new TimerPanel());
		
	}

	private void initLayout() {
		BoxLayout box = new BoxLayout(this, BoxLayout.Y_AXIS);
		setLayout(box);
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		setBackground(new Color(217, 242, 208));
	}
}
