package sandbox.myPackage;

import java.awt.HeadlessException;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MyFrame extends JFrame {
	
	public static final Rectangle FRAME_BOUNDS = new Rectangle(600, 200, 300, 200);
	
	public MyFrame() throws HeadlessException {
		super();
		setBounds(FRAME_BOUNDS);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
		
		setVisible(true);
	}

	private void initComponents() {
		add(new MyRootPanel());		
	}

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> {
		    // läuft auf dem Event Dispatch Thread
			new MyFrame();
		});
	}

}
