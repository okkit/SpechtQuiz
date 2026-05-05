/**
 * @author ValentinaTikko
 */
package sandbox.myPackage;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 * In dieser Klasse experementieren wir mit den Timern,<br>
 * Einmal mit der Klasse Timer aus java.util und einmal <br>
 * mit der Klasse Timer aus javax.swing.<br>
 * Alle 1000 ms = 1 sec wird der counter für die beiden Timer<br>
 * inkrementiert und in den Labels, entsprechend umgerechnet als<br>
 * h:m:s angezeigt.
 */
public class TimerPanel extends JPanel {

	MyLabel timerLabel1;
	MyLabel timerLabel2;
	int count1 = 0;
	int count2 = 0;

	/**
	 * Konstruiert eine Instanz der Klasse und initialisiert<br>
	 * das Layout des Panels, der zwei Labels für die Anzweige 
	 */
	public TimerPanel() {
		super();
		initLayout();
		initComponents();
		initTimer();
	}

	private void initTimer() {
		
		java.util.Timer utilTimer = new java.util.Timer();

		utilTimer.scheduleAtFixedRate(new java.util.TimerTask() {
			@Override
			public void run() {
				timerLabel1.setText(clockTime(count1++));
			}
		}, 1000, 1000);

		javax.swing.Timer timer = new javax.swing.Timer(1000, e->{timerLabel2.setText(clockTime(count2++));});
		timer.start();
		
	}
	
	String clockTime(int sec) {
		
		int h = sec/360;
		int m = (sec % 360) / 60;
		int s = (sec % 360) % 60;
		
		String time = h + ":" + m + ":" + s;
		
		return time;
	}

	private void initComponents() {
		timerLabel1 = new MyLabel("0:0:0");
		add(timerLabel1);

		add(Box.createHorizontalStrut(100));
		
		timerLabel2 = new MyLabel("0:0:0");
		add(timerLabel2);
	}

	private void initLayout() {

		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setOpaque(false);

	}

}
