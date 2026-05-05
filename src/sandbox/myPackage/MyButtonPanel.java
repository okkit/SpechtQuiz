package sandbox.myPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class MyButtonPanel extends JPanel {
	
	MyButtonPanelDelegate delegate;

	MyButton button;
	// AUFGABE:
//	MyTextField textField;
	// Nach dem Klicken von Button zeigt das Label auf dem LabelPanel den eingegebenen Text;
	int count = 0;

	public MyButtonPanel() {
		super();
		initLayout();
		initComponents();
	}

	private void initComponents() {
		button = new MyButton("Klick");
		add(button, BorderLayout.CENTER);
//		button.addActionListener(_ -> buttonWasClicked());
		button.addActionListener(_ -> delegate.updateAfterButtonPanelChanged(++count));
	}

	/**
	 * Reagiert auf den Button-Klick.
	 * Deligiert das weitere Prozedere an das RootPanel
	 */
	private void buttonWasClicked() {
//		System.out.println(getParent().getClass());
		Container parent = getParent();

		if (parent instanceof MyRootPanel) {
			MyRootPanel root = (MyRootPanel) getParent();
			root.updateCounter(++count);
		}
	}

	private void initLayout() {
		setBackground(Color.WHITE);
		setLayout(new FlowLayout());
		setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, false));
	}

}
