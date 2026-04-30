package de.example.quizui.panel.quiz;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.ButtonGroup;

import de.example.quizdata.objects.Answer;
import de.example.quizui.UIConstants;
import de.example.quizui.element.AppPanel;
import de.example.quizui.element.AppRadioButton;

/**
 * Panel für die Anzeige der auswählbaren Antwortoptionen.
 */
public class AnswerPanel extends AppPanel {

	/**
	 * Gruppiert die Radio-Buttons, damit nur eine Antwort auswählbar ist.
	 */
	private final ButtonGroup buttonGroup = new ButtonGroup();
	List<Answer> list;

	/**
	 * Erstellt das Antwort-Panel.
	 * 
	 * @param list
	 */
	public AnswerPanel(List<Answer> list) {

		this.list = list;
		initializePanel();
		buildLayout();
	}

	/**
	 * Initialisiert Layout, Rahmen und Hintergrund des Panels.
	 */
	private void initializePanel() {
		setLayout(new GridLayout(4, 1, 0, 18));
		setBorder(UIConstants.AP_EMPTY_BORDER);
		setBackground(Color.WHITE);
	}

	/**
	 * Baut die Antwortoptionen des Panels auf.
	 */
	private void buildLayout() {
		// für jedes anser aus list tu:
		for (Answer answer : list) {
			addAnswerOption(answer.getText());
		}

	}

	/**
	 * Fügt dem Panel eine einzelne Antwortoption hinzu.
	 *
	 * @param text Beschriftung der Antwortoption
	 */
	private void addAnswerOption(String text) {
		AppRadioButton radioButton = new AppRadioButton(text);
		buttonGroup.add(radioButton);
		add(radioButton);
	}
}
