package de.example.quizui.panel.quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

import de.example.quizui.UIConstants;
import de.example.quizui.element.AppButton;
import de.example.quizui.element.AppPanel;
import de.example.quizui.element.AppTextArea;

/**
 * Panel für zusätzliche Informationen zur aktuellen Frage oder Antwort.
 */
public class InfoPanel extends AppPanel implements ActionListener{

	AppTextArea infoArea = new AppTextArea();

	/**
	 * Erstellt das Info-Panel.
	 * 
	 * @param info
	 */
	public InfoPanel(String info) {
		initializePanel();
		buildLayout();
		infoArea.setText(info);
		infoArea.setVisible(false);
	}

	/**
	 * Initialisiert Layout, Rahmen und Hintergrund des Panels.
	 */
	private void initializePanel() {
		setLayout(new BorderLayout(0, 10));
		setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(new Color(180, 180, 180), 1),
				BorderFactory.createEmptyBorder(15, 15, 15, 15)));
		setBackground(Color.WHITE);
	}

	/**
	 * Baut die enthaltenen Komponenten des Panels auf.
	 */
	private void buildLayout() {
		
		AppButton buttonHint = new AppButton("Info anzeigen");
		buttonHint.addActionListener(this);
		buttonHint.setActionCommand("Info");
		
		AppButton buttonNext = new AppButton("Nächste Frage");
		buttonNext.addActionListener(this);
		buttonNext.addActionListener(_ -> nextQuestion());
		
		add(buttonHint, BorderLayout.WEST);
		add(buttonNext, BorderLayout.EAST);
	
		JScrollPane scrollPane = new JScrollPane(infoArea);
		add(scrollPane, BorderLayout.SOUTH);
	}
	
	private void nextQuestion() {
		
		// TODO heute: Nächste Frage Anzeigen
		UIManager.put("OptionPane.background", Color.DARK_GRAY);
		UIManager.put("Panel.background", Color.DARK_GRAY);
		UIManager.put("OptionPane.messageForeground", Color.WHITE);
		UIManager.put("OptionPane.messageFont", UIConstants.FONT_TEXT);
		UIManager.put("Button.background", Color.WHITE);
		UIManager.put("Button.foreground", Color.BLACK);
		UIManager.put("Button.focusable", false);
		JOptionPane.showMessageDialog(this, "Noch nicht implementiert!");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		
		if (command.equals("Info")) {
			infoArea.setVisible(true);
		}
	}
}








