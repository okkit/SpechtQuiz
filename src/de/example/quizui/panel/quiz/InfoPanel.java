package de.example.quizui.panel.quiz;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;

import de.example.quizui.element.AppLabel;
import de.example.quizui.element.AppPanel;
import de.example.quizui.element.AppTextArea;

/**
 * Panel für zusätzliche Informationen zur aktuellen Frage oder Antwort.
 */
public class InfoPanel extends AppPanel {

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
		AppLabel infoLabel = new AppLabel("Info:");

		JScrollPane scrollPane = new JScrollPane(infoArea);

		add(infoLabel, BorderLayout.NORTH);
		add(scrollPane, BorderLayout.CENTER);
	}
}
