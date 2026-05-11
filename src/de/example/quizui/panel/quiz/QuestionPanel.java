package de.example.quizui.panel.quiz;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;

import de.example.quizui.UIConstants;
import de.example.quizui.element.AppPanel;
import de.example.quizui.element.QuestionArea;

/**
 * Panel für die Anzeige der aktuellen Frage.
 */
public class QuestionPanel extends AppPanel {

	private QuestionArea questionArea = new QuestionArea();

	/**
	 * Erstellt das Fragen-Panel.
	 * 
	 * @param subjecttitle
	 * @param questiontext
	 */
	public QuestionPanel(String questiontext) {
		initializePanel();
		buildLayout();
		questionArea.setText(questiontext);
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

		add(questionArea);
	}

	public void showNextQuestion(String text) {
		questionArea.setText(text);
		
	}
}
