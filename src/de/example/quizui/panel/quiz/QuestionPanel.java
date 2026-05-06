package de.example.quizui.panel.quiz;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;

import de.example.quizui.UIConstants;
import de.example.quizui.element.AppLabel;
import de.example.quizui.element.AppPanel;

/**
 * Panel für die Anzeige der aktuellen Frage.
 */
public class QuestionPanel extends AppPanel {

	private AppLabel subjectLabel = new AppLabel("");
	private AppLabel questionLabel = new AppLabel("");

	/**
	 * Erstellt das Fragen-Panel.
	 * 
	 * @param subjecttitle
	 * @param questiontext
	 */
	public QuestionPanel(String subjecttitle, String questiontext) {
		initializePanel();
		buildLayout();
		subjectLabel.setText(subjecttitle);
		questionLabel.setText(questiontext);
	}

	/**
	 * Initialisiert Layout, Rahmen und Hintergrund des Panels.
	 */
	private void initializePanel() {
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createCompoundBorder(UIConstants.QP_MATTE_BORDER,
				UIConstants.QP_EMPTY_BORDER));
		setBackground(Color.WHITE);
	}

	/**
	 * Baut die enthaltenen Komponenten des Panels auf.
	 */
	private void buildLayout() {

		add(subjectLabel, BorderLayout.NORTH);
		add(questionLabel, BorderLayout.SOUTH);
	}

	public void showNextQuestion(String text) {
		questionLabel.setText(text);
		
	}
}
